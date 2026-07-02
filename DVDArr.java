package Arrays;

public class DVDArr {
    
    public String name;
    public int releaseYear;
    public String director;

    public DVDArr (String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }

    public static void main(String[] args) {
        DVDArr[] dvdCollection = new DVDArr[15];

        dvdCollection[0] = new DVDArr("Inception", 2010, "Christopher Nolan");
        System.out.println(dvdCollection[0]);

        DVDArr avengersDVD = new DVDArr("The Avengers", 2012, "Joss Whedon");

        dvdCollection[4] = avengersDVD;

        DVDArr incrediblesDVD = new DVDArr("The Incredibles", 2004, "Brad Bird");
        DVDArr findingDoryDVD = new DVDArr("Finding Dory", 2016, "Andrew Stanton");
        DVDArr lionKingDVD = new DVDArr("The Lion King", 2019, "Jon Favreau");

        dvdCollection[3] = incrediblesDVD;
        dvdCollection[9] = findingDoryDVD;
        dvdCollection[2] = lionKingDVD;

        DVDArr starWarsDVD = new DVDArr("Star Wars", 1977, "George Lucas");
        dvdCollection[3] = starWarsDVD; 

        System.out.println(dvdCollection[9]);
        System.out.println(dvdCollection[2]);
        System.out.println(dvdCollection[3]);
    }
}
