package com.facebook.aura.conversation.search;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SearchResultStatePlacement {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SearchResultStatePlacement[] $VALUES;
    public static final SearchResultStatePlacement CENTERED;
    public static final SearchResultStatePlacement FULL_SCREEN;

    static {
        SearchResultStatePlacement searchResultStatePlacement = new SearchResultStatePlacement("FULL_SCREEN", 0);
        FULL_SCREEN = searchResultStatePlacement;
        SearchResultStatePlacement searchResultStatePlacement2 = new SearchResultStatePlacement("CENTERED", 1);
        CENTERED = searchResultStatePlacement2;
        SearchResultStatePlacement[] searchResultStatePlacementArr = {searchResultStatePlacement, searchResultStatePlacement2};
        $VALUES = searchResultStatePlacementArr;
        $ENTRIES = new F3w(searchResultStatePlacementArr);
    }

    public static Ey9<SearchResultStatePlacement> getEntries() {
        return $ENTRIES;
    }

    public static SearchResultStatePlacement valueOf(String str) {
        return (SearchResultStatePlacement) Enum.valueOf(SearchResultStatePlacement.class, str);
    }

    public static SearchResultStatePlacement[] values() {
        return (SearchResultStatePlacement[]) $VALUES.clone();
    }

    public SearchResultStatePlacement(String str, int i) {
    }
}
