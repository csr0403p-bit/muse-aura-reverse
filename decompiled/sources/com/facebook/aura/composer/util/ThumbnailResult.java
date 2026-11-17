package com.facebook.aura.composer.util;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class ThumbnailResult extends C06G {
    public final Bitmap bitmap;
    public final boolean isLight;

    public ThumbnailResult(Bitmap bitmap, boolean z) {
        C7384Etj.A0Y(bitmap, 0);
        this.bitmap = bitmap;
        this.isLight = z;
    }

    public final ThumbnailResult copy(Bitmap bitmap, boolean z) {
        C7384Etj.A0Y(bitmap, 0);
        return new ThumbnailResult(bitmap, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ThumbnailResult) {
                ThumbnailResult thumbnailResult = (ThumbnailResult) obj;
                if (!C7384Etj.areEqual(this.bitmap, thumbnailResult.bitmap) || this.isLight != thumbnailResult.isLight) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ThumbnailResult copy$default(ThumbnailResult thumbnailResult, Bitmap bitmap, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = thumbnailResult.bitmap;
        }
        if ((i & 2) != 0) {
            z = thumbnailResult.isLight;
        }
        C7384Etj.A0Y(bitmap, 0);
        return new ThumbnailResult(bitmap, z);
    }

    public final Bitmap component1() {
        return this.bitmap;
    }

    public final boolean component2() {
        return this.isLight;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.bitmap), this.isLight);
    }

    public final boolean isLight() {
        return this.isLight;
    }

    public String toString() {
        return super.toString();
    }
}
