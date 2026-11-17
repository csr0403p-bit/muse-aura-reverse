package X;

import android.graphics.Bitmap;

/* renamed from: X.9Ux, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Ux implements Ejq {
    public final Bitmap A00;

    public C9Ux(Bitmap bitmap) {
        C7384Etj.A0Y(bitmap, 0);
        this.A00 = bitmap;
    }

    @Override // X.Ejq
    public final String ADg() {
        return "BitmapImageSource";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Bitmap bitmap = this.A00;
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.source.BitmapImageSource");
        return bitmap.equals(((C9Ux) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("BitmapImageSource(bitmap=", this.A00);
    }
}
