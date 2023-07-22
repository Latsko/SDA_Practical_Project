package org.store.services.fileHandling;

import org.store.entities.Category;
import org.store.entities.Order;
import org.store.entities.Product;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreateData {
    private static final Path productsPath = Paths.get("data", "products.json");
    private static final Path categoriesPath = Paths.get("data", "categories.json");
    private static final Path ordersPath = Paths.get("data", "orders.json");

    public static Path getProductsPath() {
        return productsPath;
    }

    public static Path getCategoriesPath() {
        return categoriesPath;
    }
    public static Path getOrdersPath() {
        return ordersPath;
    }

    public Category[] getCategories() {
        return new Category[]{
                new Category("TV"),
                new Category("AGD"),
                new Category("Komputery"),
                new Category("Smartfony"),
                new Category("Sport"),
                new Category("Gaming"),
                new Category("Kamery"),
                new Category("Zabawki")};
    }

    public void createProducts() throws FileNotFoundException {
        List<JSONObject> jsonObjects = new ArrayList<>();
        final Category[] categories = getCategories();
        final Product[] tv = {
                new Product(2000, "LG 32A5KQ", categories[0], 10),
                new Product(3500, "LIN 32D1700", categories[0], 15),
                new Product(600, "BLAUPUNKT", categories[0], 18),
                new Product(490, "JVC LT-32VH2105", categories[0], 5),
                new Product(900, "HISENSE 32A4BG", categories[0], 20),
                new Product(1300, "PHILIPS 32PFS5905", categories[0], 10),
                new Product(2300, "LG 32H57705", categories[0], 14)
        };

        final Product[] agd = {
                new Product(3399, "Lodówka SAMSUNG RB38T774DB1", categories[1], 19),
                new Product(2199, "Lodówka BEKO B5RCNA365HXB", categories[1], 8),
                new Product(4000, "Lodówka HAIER A3FE737CMJ", categories[1], 14),
                new Product(3200, "Pralka ELECTROLUX MEW7F349PXP", categories[1], 12),
                new Product(3900, "Pralka SAMSUNG BESPOKE WW11BB744DGB", categories[1], 7),
                new Product(1500, "Kuchnia GORENJE MEKS5121S ExtraSteam", categories[1], 15),
                new Product(1850, "Kuchnia AMICA 6117GET3", categories[1], 17)
        };

        final Product[] computers = {
                new Product(3670, "Komputer APPLE Mac Mini 2023", categories[2], 16),
                new Product(4199, "Komputer MAD DOG MD5600X-A03V2", categories[2], 18),
                new Product(3700, "Komputer ACER Nitro N50-640", categories[2], 10),
                new Product(5500, "Laptop DELL G15 5525-8403", categories[2], 2),
                new Product(2900, "Laptop LENOVO IdeaPad", categories[2], 9),
                new Product(3500, "Laptop HP Victus", categories[2], 5),
                new Product(1850, "Laptop HP 15-dw3123nw", categories[2], 17)
        };

        final Product[] smartphones = {
                new Product(3670, "Smartfon SAMSUNG Galaxy S23", categories[3], 16),
                new Product(4199, "Smartfon APPLE iPhone 14 128GB", categories[3], 28),
                new Product(400, "Smartfon XIAOMI Redmi 12C", categories[3], 17),
                new Product(5500, "Smartfon APPLE iPhone 13 256GB", categories[3], 21),
                new Product(2900, "Smartfon XIAOMI Redmi Note 12", categories[3], 19),
                new Product(3500, "Smartfon SAMSUNG Galaxy S20", categories[3], 15),
                new Product(1850, "Smartfon SAMSUNG Galaxy A34", categories[3], 8)
        };

        final Product[] sports = {
                new Product(6140, "Atlas EB FIT 9500", categories[4], 15),
                new Product(120, "Sztanga HMS SGP15", categories[4], 18),
                new Product(400, "Sztanga PURE 2 IMPROVE", categories[4], 17),
                new Product(89, "Obciążniki na ręce i kostki EB FIT", categories[4], 21),
                new Product(800, "Worek treningowy TIGUAR TI-FWB060", categories[4], 13),
                new Product(350, "Ławka do ćwiczeń EB FIT", categories[4], 25),
                new Product(850, "Ławka do ćwiczeń MARBO SPORT", categories[4], 4)
        };

        final Product[] gaming = {
                new Product(2300, "Konsola SONY PlayStation 5 Digital", categories[5], 15),
                new Product(2700, "Konsola SONY PlayStation 5", categories[5], 18),
                new Product(2600, "Konsola MICROSOFT XBOX Series X", categories[5], 17),
                new Product(1700, "Konsola MICROSOFT XBOX Series S", categories[5], 25),
                new Product(1200, "Kierownica LOGITECH G920", categories[5], 3),
                new Product(1550, "Konsola NINTENDO Switch Oled", categories[5], 27),
                new Product(1850, "Gogle VR OCULUS Quest 2", categories[5], 4)
        };

        final Product[] cameras = {
                new Product(1900, "Aparat CANON EOS 2000D", categories[6], 5),
                new Product(8700, "Aparat NIKON D780 Body", categories[6], 15),
                new Product(3600, "Aparat CANON EOS 250D", categories[6], 17),
                new Product(3100, "Aparat SONY ZV-1 Czarny", categories[6], 8),
                new Product(4200, "Aparat NIKON Coolpix P1000", categories[6], 13),
                new Product(3300, "Aparat CANON EOS R50", categories[6], 7),
                new Product(8450, "Aparat SONY Alpha A7 III", categories[6], 14)
        };

        final Product[] toys = {
                new Product(300, "LEGO City Łódź podwodna badacza dna morskiego", categories[7], 25),
                new Product(3700, "LEGO Star Wars AT-AT 75313", categories[7], 18),
                new Product(2600, "LEGO Marvel Hulkbuster 76210", categories[7], 16),
                new Product(310, "Zabawka drewniana UGEARS", categories[7], 4),
                new Product(400, "Zabawka drewniana modele 3D Sejf", categories[7], 23),
                new Product(100, "Wyrzutnia Nerf Elite 2.0", categories[7], 17),
                new Product(85, "Wyrzutnia HASBRO", categories[7], 16)
        };

        Product[][] allProducts = {tv, agd, computers, smartphones, sports, gaming, cameras, toys};
        for (Product[] category : allProducts) {
            for (int j = 0; j < allProducts[j].length; j++) {
                jsonObjects.add(new JSONObject()
                        .put("id", category[j].getID())
                        .put("price", category[j].getPrice())
                        .put("name", category[j].getName())
                        .put("category", category[j].getCategory().getName())
                        .put("quantity", category[j].getQuantity())
                );
                JSONArray jsonArray = new JSONArray(jsonObjects);

                try (PrintWriter printer = new PrintWriter(productsPath.toFile())) {
                    printer.print(jsonArray.toString(4));
                }
            }
        }
    }

    public void writeProducts(List<Product> products) throws FileNotFoundException {
        List<JSONObject> jsonObjects = new ArrayList<>();
        if (products != null) {
            for (Product product : products) {
                jsonObjects.add(new JSONObject()
                        .put("id", product.getID())
                        .put("price", product.getPrice())
                        .put("name", product.getName())
                        .put("category", product.getCategory().getName())
                        .put("quantity", product.getQuantity()));
            }
        }

        JSONArray jsonArray = new JSONArray(jsonObjects);

        try (PrintWriter printer = new PrintWriter(productsPath.toFile())) {
            printer.print(jsonArray.toString(4));
        }
    }

    public void createCategories() throws FileNotFoundException {
        List<JSONObject> jsonObjects = new ArrayList<>();
        final Category[] categories = getCategories();
        for (Category category : categories) {
            jsonObjects.add(new JSONObject()
                    .put("id", category.getID())
                    .put("name", category.getName()));
        }

        JSONArray jsonArray = new JSONArray(jsonObjects);
        try (PrintWriter printer = new PrintWriter(categoriesPath.toFile())) {
            printer.print(jsonArray.toString(4));
        }
    }

    public void writeCategories(final List<Category> updatedCategories) throws FileNotFoundException {
        List<JSONObject> jsonObjects = new ArrayList<>();

        if (updatedCategories != null) {
            for (Category category : updatedCategories) {
                jsonObjects.add(new JSONObject()
                        .put("id", category.getID())
                        .put("name", category.getName()));
            }
        } else {
            throw new IllegalArgumentException("List given as parameter is null!");
        }
        JSONArray jsonArray = new JSONArray(jsonObjects);
        try (PrintWriter printer = new PrintWriter(categoriesPath.toFile())) {
            printer.print(jsonArray.toString(4));
        }
    }

    public void writeOrders(List<Order> newOrders) throws FileNotFoundException {
        List<JSONObject> jsonObjects = new ArrayList<>();
        if (newOrders != null) {
            for (Order order : newOrders) {
                jsonObjects.add(new JSONObject()
                        //.put("id", order.getID())
                        .put("orderNumber", order.getOrderNumber())
                        .put("basket", order.getBasket())
                        .put("clientName", order.getClientName())
                        .put("clientSurname",order.getClientSurName())
                        .put("address", order.getClientAddress())
                        .put("orderSum", order.getNumberSum())
                        .put("status", order.getStatus()));
            }
        }

        JSONArray jsonArray = new JSONArray(jsonObjects);

        try (PrintWriter printer = new PrintWriter(ordersPath.toFile())) {
            printer.print(jsonArray.toString(4));
        }
    }
}