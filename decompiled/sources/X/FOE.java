package X;

import android.os.Bundle;
import com.facebook.aura.conversation.search.SearchResultsListStateKt;

/* loaded from: classes6.dex */
public final class FOE implements FPN {
    public static final FOE A00 = new FOE();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FOE);
    }

    @Override // X.FPN
    public final boolean ADP() {
        return true;
    }

    @Override // X.FPN
    public final boolean AFw() {
        return true;
    }

    @Override // X.FPN
    public final boolean AMr() {
        return false;
    }

    @Override // X.FPN
    public final /* bridge */ Bundle Agu() {
        return null;
    }

    @Override // X.FPN
    public final String getName() {
        return SearchResultsListStateKt.SEARCH_SURFACE_FULL_SCREEN;
    }

    public final String toString() {
        return "FullScreenLayoutConfig";
    }

    public final int hashCode() {
        return -385439243;
    }
}
