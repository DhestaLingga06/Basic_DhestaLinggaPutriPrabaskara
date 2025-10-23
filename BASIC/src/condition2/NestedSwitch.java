package condition2;

public class NestedSwitch {

    public String getSelection(int category, int choice) {
        String result;

        switch (category) {
            case 1:
                switch (choice) {
                    case 1:
                        result = "1, You selected: Tea";
                        break;
                    case 2:
                        result = "1, You selected: Coffe";
                        break;
                    case 3:
                        result = "1, You selected: Juice";
                        break;
                    default:
                        result = "1, Invalid drink choice";
                        break;
                }
                break;

            case 2:
                switch (choice) {
                    case 1:
                        result = "2, You selected: Pizza";
                        break;
                    case 2:
                        result = "2, You selected: Burger";
                        break;
                    case 3:
                        result = "2, You selected: Sandwich";
                        break;
                    default: 
                        result = "2, Invalid food choice";
                        break;
                }
                break;
            
            default:
                result = category + ", Invalid category";
                break;
        }
        return result;
    }
}