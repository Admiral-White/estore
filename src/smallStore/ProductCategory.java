package smallStore;

public enum ProductCategory {
    ELECTRONIC, GROCERIES, UTENSIL, CLOTHING;


    @Override
    public String toString() {
        String productCategoryInString = " ";

        switch (this) {
            case UTENSIL: productCategoryInString = "Utensil";
            break;
            case CLOTHING: productCategoryInString = "Clothing";
            break;
            case GROCERIES: productCategoryInString = "Groceries";
            break;
            case ELECTRONIC: productCategoryInString = "Electronic";
            break;


        }
        return productCategoryInString;

    }
}
