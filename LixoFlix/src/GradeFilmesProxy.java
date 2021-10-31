public class GradeFilmesProxy implements IGradeFilmes {


    private GradeFilmes grade;
    private IP ip;

    public GradeFilmesProxy(GradeFilmes grade, IP ip) {
        this.grade = grade;
        this.ip = ip;
    }

    public GradeFilmesProxy(GradeFilmes grade) {
        this.setGrade(grade);
    }

    public GradeFilmes getGrade() {
        return grade;
    }

    public void setGrade(GradeFilmes grade) {
        this.grade = grade;
    }

    public IP getIp() {
        return ip;
    }

    public void setIp(IP ip) {
        this.ip = ip;
    }

    @Override
    public Filme getFilme(String nomeFilme) throws BlacklistedContent {
        Filme filme = grade.getFilme(nomeFilme);
        if (! (getIp().getPais()).equalsIgnoreCase(filme.getPais())) {
            throw new BlacklistedContent(nomeFilme + "não disponível em " + getIp().getPais());
        }
        return filme;
    }
}

