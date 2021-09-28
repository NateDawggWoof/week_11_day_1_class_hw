public class Printer {
    private int paperCapacity;
    private  int inkCapacity;
    private int sheets;
    private int ink;

    public Printer(){
        this.paperCapacity = 100;
        this.inkCapacity = 100;
        this.sheets = paperCapacity;
        this.ink = inkCapacity;
    }

    public int getSheets(){
        return this.sheets;
    }


    public int print(int num1, int num2) {
        return this.sheets = this.sheets-(num1*num2);
    }

    public boolean printCheck(int num1, int num2) {
        return this.sheets >= (num1*num2);
    }

    public int fullPrint(int num1, int num2) {
        if (this.printCheck(num1, num2) == true) {
            print(num1, num2);
            return this.ink = this.ink - (num1*num2);

        } else {
            return this.ink;
        }

    }

    public int getInk() {
        return this.ink;
    }
}
