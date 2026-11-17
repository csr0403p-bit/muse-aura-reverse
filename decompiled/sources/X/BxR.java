package X;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BxR {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        try {
            AnonymousClass002.A13(Bitmap.CompressFormat.JPEG, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            AnonymousClass002.A14(Bitmap.CompressFormat.PNG, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            AnonymousClass002.A15(Bitmap.CompressFormat.WEBP, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        A00 = iArr;
    }
}
