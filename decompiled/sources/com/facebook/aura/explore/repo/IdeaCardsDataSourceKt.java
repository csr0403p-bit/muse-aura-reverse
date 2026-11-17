package com.facebook.aura.explore.repo;

import X.AII;
import X.AIM;
import X.AnonymousClass002;
import X.C06827l3;
import X.HxE;
import com.facebook.aura.utils.HatchUtils;

/* loaded from: classes.dex */
public abstract class IdeaCardsDataSourceKt {
    public static final int HTTP_NOT_FOUND = 404;
    public static final String ICON_PALETTE_COLOR = "color";
    public static final String ICON_PALETTE_LEGACY = "legacy";
    public static final String ICON_PALETTE_PARAM = "iconPalette";
    public static final long IDEA_CARDS_TIMEOUT_SECONDS = 60;
    public static final int IDEA_FEEDBACK_REASON_MAX_CHARS = 600;
    public static final C06827l3 REASON_WHITESPACE = new C06827l3("[\\p{Cntrl}\\s]+");
    public static final String TAG = "IdeaCardsDataSource";

    public static final HxE<String, Object>[] ideaCardsQueryParams(String str) {
        AII aiiA17 = AIM.A17();
        AnonymousClass002.A1J("iconPalette", HatchUtils.INSTANCE.isIdeaColorIconEnabled() ? "color" : "legacy", aiiA17);
        if (str != null && str.length() > 0) {
            AnonymousClass002.A1J("pageCursor", str, aiiA17);
        }
        return (HxE[]) AIM.A18(aiiA17).toArray(new HxE[0]);
    }
}
