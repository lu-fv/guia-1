public class Sale {

    private Integer id ;
    private String description;
    private Integer cant;
    private Integer unitaryPrice;


    public Sale(Integer id, String description, Integer cant, Integer unitaryPrice, Integer total) {
        this.id = id;
        this.description = description;
        this.cant = cant;
        this.unitaryPrice = unitaryPrice;

    }

    public Integer precioTotal() {

        return cant * unitaryPrice;

    }

   public void product() {
        double total = precioTotal();

        System.out.println(" ID: " + id + ", description: " + description + ", cant: " + cant + ", pUnitario= $ " + unitaryPrice + ", Total: $ " + precioTotal());
    }

}
