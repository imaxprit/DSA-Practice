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
    }
}
