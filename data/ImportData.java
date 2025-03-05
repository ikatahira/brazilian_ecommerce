import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ImportData {

    private static final String GITHUB_RAW_URL = "https://raw.githubusercontent.com/ikatahira/brazilian_ecommerce/tree/main/data/"; // Substitua com a URL correta
    private static final String DB_URL = "jdbc:mysql://localhost:3306/brazilian_ecommerce"; // Ajuste se necessário
    private static final String DB_USER = "root"; // Ajuste se necessário
    private static final String DB_PASSWORD = "rootpass"; // Ajuste se necessário

    public static void main(String[] args) {
        criarTabelas();
        importCustomers();
        importProducts();
        // Adicione os métodos para as demais tabelas
    }

    private static void criarTabelas() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement()) {

            // Comando SQL para criar a tabela customers
            String createCustomersTable = "CREATE TABLE IF NOT EXISTS customers (" +
                    "customer_id VARCHAR(32) PRIMARY KEY," +
                    "customer_unique_id VARCHAR(36)," +
                    "customer_zip_code_prefix INT," +
                    "customer_city VARCHAR(100)," +
                    "customer_state CHAR(2)" +
                    ")";

            // Comando SQL para criar a tabela products
            String createProductsTable = "CREATE TABLE IF NOT EXISTS products (" +
                    "product_id VARCHAR(32) PRIMARY KEY," +
                    "product_category_name VARCHAR(100)," +
                    "product_name_length INT," +
                    "product_description_length INT," +
                    "product_photos_qty INT," +
                    "product_weight_g DECIMAL(10,2)," +
                    "product_length_cm DECIMAL(10,2)," +
                    "product_height_cm DECIMAL(10,2)," +
                    "product_width_cm DECIMAL(10,2)" +
                    ")";

            // Execute os comandos SQL
            statement.executeUpdate(createCustomersTable);
            statement.executeUpdate(createProductsTable);
            // Adicione os comandos para criar as demais tabelas

            System.out.println("Tabelas criadas com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao criar as tabelas: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void importCustomers() {
        String csvFile = "olist_customers_dataset.csv";
        String tableName = "customers";
        String sql = "INSERT INTO " + tableName + " (customer_id, customer_unique_id, customer_zip_code_prefix, customer_city, customer_state) VALUES (?, ?, ?, ?, ?)";

        try {
            importData(csvFile, tableName, sql);
            System.out.println("Importação da tabela " + tableName + " concluída!");
        } catch (Exception e) {
            System.err.println("Erro ao importar a tabela " + tableName + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void importProducts() {
        String csvFile = "olist_products_dataset.csv";
        String tableName = "products";
        String sql = "INSERT INTO " + tableName + " (product_id, product_category_name, product_name_length, product_description_length, product_photos_qty, product_weight_g, product_length_cm, product_height_cm, product_width_cm) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            importData(csvFile, tableName, sql);
            System.out.println("Importação da tabela " + tableName + " concluída!");
        } catch (Exception e) {
            System.err.println("Erro ao importar a tabela " + tableName + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Adicione os métodos import para as demais tabelas

    private static void importData(String csvFile, String tableName, String sql) throws IOException, SQLException {
        String csvUrl = GITHUB_RAW_URL + csvFile;
        Connection connection = null;
        BufferedReader br = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            URL url = new URL(csvUrl);
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            preparedStatement = connection.prepareStatement(sql);

            String line;
            br.readLine(); // Ignorar o cabeçalho

            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); // Adapte o delimitador se necessário

                // Adapte os tipos de dados e a ordem das colunas
                for (int i = 0; i < values.length; i++) {
                    preparedStatement.setString(i + 1, values[i]);
                }

                preparedStatement.executeUpdate();
            }
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}