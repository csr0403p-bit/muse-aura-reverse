package com.facebook.aura.localbrowser;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LocalBrowserPopupAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalBrowserPopupAction[] $VALUES;
    public static final LocalBrowserPopupAction CLOSED_BY_PAGE;
    public static final LocalBrowserPopupAction CLOSED_BY_USER;
    public static final LocalBrowserPopupAction CLOSED_TASK_END;
    public static final LocalBrowserPopupAction HELD;
    public static final LocalBrowserPopupAction REDIRECTED_SAME_TAB;
    public static final LocalBrowserPopupAction REFUSED_LIMIT;
    public static final LocalBrowserPopupAction REFUSED_OTHER;
    public static final LocalBrowserPopupAction RENDERER_GONE;
    public static final LocalBrowserPopupAction SHOWN;
    public final String value;

    static {
        LocalBrowserPopupAction localBrowserPopupAction = new LocalBrowserPopupAction("HELD", 0, "held");
        HELD = localBrowserPopupAction;
        LocalBrowserPopupAction localBrowserPopupAction2 = new LocalBrowserPopupAction("REDIRECTED_SAME_TAB", 1, "redirected_same_tab");
        REDIRECTED_SAME_TAB = localBrowserPopupAction2;
        LocalBrowserPopupAction localBrowserPopupAction3 = new LocalBrowserPopupAction("REFUSED_LIMIT", 2, "refused_limit");
        REFUSED_LIMIT = localBrowserPopupAction3;
        LocalBrowserPopupAction localBrowserPopupAction4 = new LocalBrowserPopupAction("REFUSED_OTHER", 3, "refused_other");
        REFUSED_OTHER = localBrowserPopupAction4;
        LocalBrowserPopupAction localBrowserPopupAction5 = new LocalBrowserPopupAction("SHOWN", 4, "shown");
        SHOWN = localBrowserPopupAction5;
        LocalBrowserPopupAction localBrowserPopupAction6 = new LocalBrowserPopupAction("CLOSED_BY_PAGE", 5, "closed_by_page");
        CLOSED_BY_PAGE = localBrowserPopupAction6;
        LocalBrowserPopupAction localBrowserPopupAction7 = new LocalBrowserPopupAction("CLOSED_BY_USER", 6, "closed_by_user");
        CLOSED_BY_USER = localBrowserPopupAction7;
        LocalBrowserPopupAction localBrowserPopupAction8 = new LocalBrowserPopupAction("CLOSED_TASK_END", 7, "closed_task_end");
        CLOSED_TASK_END = localBrowserPopupAction8;
        LocalBrowserPopupAction localBrowserPopupAction9 = new LocalBrowserPopupAction("RENDERER_GONE", 8, "renderer_gone");
        RENDERER_GONE = localBrowserPopupAction9;
        LocalBrowserPopupAction[] localBrowserPopupActionArr = {localBrowserPopupAction, localBrowserPopupAction2, localBrowserPopupAction3, localBrowserPopupAction4, localBrowserPopupAction5, localBrowserPopupAction6, localBrowserPopupAction7, localBrowserPopupAction8, localBrowserPopupAction9};
        $VALUES = localBrowserPopupActionArr;
        $ENTRIES = C3cG.A0w(localBrowserPopupActionArr);
    }

    public static Ey9<LocalBrowserPopupAction> getEntries() {
        return $ENTRIES;
    }

    public static LocalBrowserPopupAction valueOf(String str) {
        return (LocalBrowserPopupAction) Enum.valueOf(LocalBrowserPopupAction.class, str);
    }

    public static LocalBrowserPopupAction[] values() {
        return (LocalBrowserPopupAction[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public LocalBrowserPopupAction(String str, int i, String str2) {
        this.value = str2;
    }
}
