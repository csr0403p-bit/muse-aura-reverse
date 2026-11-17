package com.facebook.aura.sharesheet;

import X.AnonymousClass003;
import android.net.Uri;

/* loaded from: classes.dex */
public final class HatchPreparedShareMedia {
    public static final int $stable = 8;
    public final String mimeType;
    public final Uri uri;

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public HatchPreparedShareMedia(Uri uri, String str) {
        AnonymousClass003.A0u(uri, str);
        this.uri = uri;
        this.mimeType = str;
    }
}
