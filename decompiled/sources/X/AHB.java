package X;

/* loaded from: classes4.dex */
public abstract class AHB {
    public static final void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw C8j3.A0y("index: ", ", size: ", i, i2);
        }
    }

    public static final void A01(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(FGI.A0T("index: ", ", size: ", i, i2));
        }
    }
}
