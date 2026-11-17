package com.facebook.aura.pairs;

import X.AnonymousClass005;

/* loaded from: classes3.dex */
public final class PairsConfirmation {
    public static final int $stable = 0;
    public final String confirmLabel;
    public final String dismissLabel;
    public final boolean isDestructive;
    public final String message;
    public final String title;

    public final String getConfirmLabel() {
        return this.confirmLabel;
    }

    public final String getDismissLabel() {
        return this.dismissLabel;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isDestructive() {
        return this.isDestructive;
    }

    public PairsConfirmation(String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.title = str;
        this.message = str2;
        this.confirmLabel = str3;
        this.dismissLabel = str4;
        this.isDestructive = z;
    }
}
