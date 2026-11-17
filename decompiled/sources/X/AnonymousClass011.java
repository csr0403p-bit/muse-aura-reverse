package X;

/* renamed from: X.011, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass011 {
    public static int A00(int i) {
        return A01(i | 1);
    }

    public static int A02(Object obj, int i) {
        ((Number) obj).intValue();
        return A01(i | 1);
    }

    public static final int A01(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }
}
