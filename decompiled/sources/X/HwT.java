package X;

import android.widget.ImageView;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class HwT {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        try {
            AnonymousClass005.A0v(ImageView.ScaleType.CENTER_CROP, iArr, 1);
        } catch (NoSuchFieldError unused) {
        }
        try {
            AnonymousClass005.A0v(ImageView.ScaleType.FIT_CENTER, iArr, 2);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            AnonymousClass005.A0v(ImageView.ScaleType.FIT_XY, iArr, 3);
        } catch (NoSuchFieldError unused3) {
        }
        A00 = iArr;
        C79.A00(8);
        C79.A00(3);
    }
}
