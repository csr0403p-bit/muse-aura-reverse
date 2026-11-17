package com.facebook.aura.sharesheet;

/* loaded from: classes.dex */
public final class HatchShareDismissLogging {
    public static final int $stable = 8;
    public boolean isSuppressed;

    public final void suppressForwardNavigation() {
        this.isSuppressed = true;
    }

    public final boolean isSuppressed$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet() {
        return this.isSuppressed;
    }
}
