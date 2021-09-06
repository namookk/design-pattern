package adapter;

public class FindMovieAltorithm implements FindAlgorithm {
    public void find(boolean global) {
        System.out.println("find movie" + (global ? " globally" : ""));
    }
}
