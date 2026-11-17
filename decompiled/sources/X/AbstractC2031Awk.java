package X;

import android.text.Layout;

/* renamed from: X.Awk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC2031Awk {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        try {
            AnonymousClass002.A13(Layout.Alignment.ALIGN_NORMAL, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            AnonymousClass002.A14(Layout.Alignment.ALIGN_CENTER, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            AnonymousClass002.A15(Layout.Alignment.ALIGN_OPPOSITE, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        A00 = iArr;
    }
}
