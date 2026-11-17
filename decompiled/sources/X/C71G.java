package X;

import android.graphics.Bitmap;

/* renamed from: X.71G, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C71G implements C71K {
    public final Bitmap A00;

    public final String toString() {
        Bitmap bitmap = this.A00;
        return FGI.A0Y("BitmapImageProvider(bitmap=Bitmap(", "px x ", "px))", bitmap.getWidth(), bitmap.getHeight());
    }

    public C71G(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
