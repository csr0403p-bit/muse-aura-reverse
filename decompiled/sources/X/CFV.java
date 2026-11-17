package X;

/* loaded from: classes5.dex */
public abstract class CFV {
    public static void A01(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new ArrayIndexOutOfBoundsException(FGI.A0Z("length=", "; regionStart=", "; regionLength=", i, i2, i3));
        }
    }

    public static StringIndexOutOfBoundsException A00(String str, int i, int i2) {
        return new StringIndexOutOfBoundsException(FGI.A0Z("length=", "; regionStart=", "; regionLength=", str.length(), i, i2));
    }
}
