package com.facebook.aura.vds.compose.common;

import X.C06G;
import X.C7384Etj;
import android.net.Uri;

/* loaded from: classes.dex */
public final class AuraDrawableSourceUri extends C06G implements AuraDrawableSource {
    public static final int $stable = 0;
    public final Uri uri;

    public AuraDrawableSourceUri(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        this.uri = uri;
    }

    public final AuraDrawableSourceUri copy(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        return new AuraDrawableSourceUri(uri);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuraDrawableSourceUri) && C7384Etj.areEqual(this.uri, ((AuraDrawableSourceUri) obj).uri));
    }

    public static /* synthetic */ AuraDrawableSourceUri copy$default(AuraDrawableSourceUri auraDrawableSourceUri, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = auraDrawableSourceUri.uri;
        }
        C7384Etj.A0Y(uri, 0);
        return new AuraDrawableSourceUri(uri);
    }

    public final Uri component1() {
        return this.uri;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
