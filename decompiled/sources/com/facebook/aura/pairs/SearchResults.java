package com.facebook.aura.pairs;

import X.AnonymousClass003;
import java.util.List;

/* loaded from: classes3.dex */
public final class SearchResults {
    public final List<PairsSuggestion> people;
    public final String query;

    public final List<PairsSuggestion> getPeople() {
        return this.people;
    }

    public final String getQuery() {
        return this.query;
    }

    public SearchResults(String str, List<PairsSuggestion> list) {
        AnonymousClass003.A0u(str, list);
        this.query = str;
        this.people = list;
    }
}
