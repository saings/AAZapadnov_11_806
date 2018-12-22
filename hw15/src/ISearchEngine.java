import java.util.List;
//
//
//
//
//
//
//
public interface ISearchEngine {
    List<ITextProvider> getSortedByRelevanceList(ITextAnalyze textAnalyze, ITextProvider query, List<ITextProvider> sources);
}
