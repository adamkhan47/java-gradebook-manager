public class Helperstuff {

    public Helperstuff() {

    }

    public int getInstancesOfLetter(String stringtocombthrough, char woah) {
        int count = 0;
        for (int i = 0; i<stringtocombthrough.length(); i++) {
            if (stringtocombthrough.charAt(i) == (woah)) {
                count++;
            }
        }
        return count;
    }
}
