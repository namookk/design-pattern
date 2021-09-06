package adapter;

import strategy.SearchStrategy;

public class SearchFindAdapter implements SearchStrategy {
    private FindAlgorithm findAlgorithm;

    public SearchFindAdapter (FindAlgorithm _findAlgorithm) {
        findAlgorithm = _findAlgorithm;
    }
    public void search () {
        findAlgorithm.find(true);
    }
}
