package Course;

/**
 * Created by pc on 05.11.2015.
 */
public class FoodStuff extends Product {
    /** ����� �������� �������**/
   public Integer experationDate;
    FoodStuff(){
        super.productType="FoodStuff";
    }

    public Integer getExperationDate() {
        return experationDate;
    }

    public void setExperationDate(Integer experationDate) {
        this.experationDate = experationDate;
    }
}