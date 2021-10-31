public class Grade implements ISelectSerie {

    @Override
    public String getSeries(String name) throws NotAvailable {
        String link = null;
        switch (name) {
        case "The Wire":
        link = "www.thewire.com";
        break;
        case "Twin Peaks":
        link = "www.twinpeaks.com";
        break;
        case "Breaking Bad":
        link = "www.breakingbad.com";
        break;
        case "The Night Of":
        link = "www.thenightof.com";
        break;
        case "Millennium":
        link = "www.millennium.com";
        break;
        case "Show Me a Hero":
        link = "www.showmeahero.com";
        break;
        }
        return link;
        }
}
