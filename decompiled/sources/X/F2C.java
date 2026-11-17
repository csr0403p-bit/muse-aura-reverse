package X;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class F2C {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        try {
            AnonymousClass002.A13(Bitmap.Config.ARGB_8888, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            AnonymousClass002.A14(Bitmap.Config.ALPHA_8, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            AnonymousClass002.A15(Bitmap.Config.ARGB_4444, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        try {
            AnonymousClass002.A16(Bitmap.Config.RGB_565, iArr);
        } catch (NoSuchFieldError unused4) {
        }
        try {
            AnonymousClass002.A17(Bitmap.Config.RGBA_F16, iArr);
        } catch (NoSuchFieldError unused5) {
        }
        try {
            AnonymousClass002.A18(Bitmap.Config.RGBA_1010102, iArr);
        } catch (NoSuchFieldError unused6) {
        }
        try {
            AnonymousClass006.A1G(Bitmap.Config.HARDWARE, iArr);
        } catch (NoSuchFieldError unused7) {
        }
        A00 = iArr;
    }
}
