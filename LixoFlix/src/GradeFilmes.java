public class GradeFilmes implements IGradeFilmes{

    @Override
    public Filme getFilme(String nomeFilme) throws BlacklistedContent {
        Filme filme = null;
        switch (nomeFilme) {
            case "The Shawshank Redemption":
                filme = new Filme("The Shawshank Redemption", "Brasil", "www.shawshankredemption.com.br");
                break;
            case "The Insider":
                filme = new Filme("The Insider", "Colombia", "www.theinsider.com.co");
                break;
            case "The Devil's Advocate":
                filme = new Filme("The Devil's Advocate", "Argentina", "www.devilsadvocate.com.ar");
                break;
            case "The Matrix":
                filme = new Filme("The Matrix", "Brasil", "www.thematrix.com.br");
                break;
            case "The Green Mile":
                filme = new Filme("The Green Mile", "Colombia", "www.greenmile.com.co");
                break;
        }
        return filme;
    }
}
