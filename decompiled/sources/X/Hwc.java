package X;

import android.widget.ImageView;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class Hwc {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        try {
            AnonymousClass002.A13(ImageView.ScaleType.CENTER_CROP, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            AnonymousClass002.A14(ImageView.ScaleType.FIT_CENTER, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        A00 = iArr;
    }
}
