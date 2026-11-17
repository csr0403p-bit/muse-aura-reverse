package com.facebook.aura.vds.compose.common;

import X.C06G;
import X.C7384Etj;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class AuraDrawableSourceBitmap extends C06G implements AuraDrawableSource {
    public static final int $stable = 0;
    public final Bitmap bitmap;

    public AuraDrawableSourceBitmap(Bitmap bitmap) {
        C7384Etj.A0Y(bitmap, 0);
        this.bitmap = bitmap;
    }

    public final AuraDrawableSourceBitmap copy(Bitmap bitmap) {
        C7384Etj.A0Y(bitmap, 0);
        return new AuraDrawableSourceBitmap(bitmap);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuraDrawableSourceBitmap) && C7384Etj.areEqual(this.bitmap, ((AuraDrawableSourceBitmap) obj).bitmap));
    }

    public static /* synthetic */ AuraDrawableSourceBitmap copy$default(AuraDrawableSourceBitmap auraDrawableSourceBitmap, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = auraDrawableSourceBitmap.bitmap;
        }
        C7384Etj.A0Y(bitmap, 0);
        return new AuraDrawableSourceBitmap(bitmap);
    }

    public final Bitmap component1() {
        return this.bitmap;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public int hashCode() {
        return this.bitmap.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
