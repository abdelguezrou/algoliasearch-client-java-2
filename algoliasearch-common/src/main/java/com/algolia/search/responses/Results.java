package com.algolia.search.responses;

import java.util.ArrayList;
import java.util.List;

public class Results<T> {

  private List<T> results;

  public List<T> getResults() {
    return results == null ? new ArrayList<>() : results;
  }

  @SuppressWarnings("unused")
  public Results setResults(List<T> results) {
    this.results = results;
    return this;
  }
}
