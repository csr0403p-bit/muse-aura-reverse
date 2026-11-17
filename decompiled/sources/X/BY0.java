package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import com.facebook.aura.conversation.search.SearchResultsListStateKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BY0 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BY0[] A01;
    public static final BY0 A02;
    public final String value;

    static {
        BY0 by0 = new BY0(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0, "none");
        A02 = by0;
        BY0[] by0Arr = {by0, new BY0("FULL_SCREEN_PLAYER", 1, SearchResultsListStateKt.SEARCH_SURFACE_FULL_SCREEN), new BY0("INLINE_PLAYER", 2, "inline")};
        A01 = by0Arr;
        A00 = C3cG.A0w(by0Arr);
    }

    public static BY0 valueOf(String str) {
        return (BY0) Enum.valueOf(BY0.class, str);
    }

    public static BY0[] values() {
        return (BY0[]) A01.clone();
    }

    public BY0(String str, int i, String str2) {
        this.value = str2;
    }
}
