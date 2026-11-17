package com.facebook.aura.localbrowser;

import X.AnonymousClass005;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class LocalBrowserUserDialog {
    public static final int $stable = 0;
    public final String defaultValue;
    public final String id;
    public final LocalBrowserDialogKind kind;
    public final String message;
    public final String origin;

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final String getId() {
        return this.id;
    }

    public final LocalBrowserDialogKind getKind() {
        return this.kind;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public LocalBrowserUserDialog(String str, LocalBrowserDialogKind localBrowserDialogKind, String str2, String str3, String str4) {
        AnonymousClass005.A0y(str, localBrowserDialogKind, str3);
        C7384Etj.A0Y(str4, 4);
        this.id = str;
        this.kind = localBrowserDialogKind;
        this.origin = str2;
        this.message = str3;
        this.defaultValue = str4;
    }
}
