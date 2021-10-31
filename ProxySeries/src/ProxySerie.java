public class ProxySerie implements ISelectSerie{

    private Grade grade;
    private int amtViews = 0;

    public ProxySerie(Grade grade) {
        this.setGrade(grade);
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String getSeries(String name) throws NotAvailable {
        String link = grade.getSeries(name);
        if(amtViews < 5) {
            amtViews++;
            System.out.println(amtViews);
            return link;

        } else {
            throw new NotAvailable("Excedido limite de: "+ amtViews + ", acesso a " + name + " não permitido.");
        }
    }
}
