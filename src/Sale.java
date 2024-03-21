public class Sale {

   private Integer id;
   private String description;
   private Integer cant;
   private Integer unitaryPrice;
   private Integer  total;

    public Sale(Integer id, String description, Integer cant, Integer unitaryPrice, Integer total) {
        this.id = id;
        this.description = description;
        this.cant = cant;
        this.unitaryPrice = unitaryPrice;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCant() {
        return cant;
    }

    public void setCant(Integer cant) {
        this.cant = cant;
    }

    public Integer getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(Integer unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }




}
