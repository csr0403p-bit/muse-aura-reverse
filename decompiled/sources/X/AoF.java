package X;

/* loaded from: classes4.dex */
public abstract class AoF implements InterfaceC1686AoP {
    public String A00;
    public final int[] A01 = new int[2];

    public final String A02() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        C7384Etj.A0b("text");
        throw F60.createAndThrow();
    }

    public final int[] A03(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.A01;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public static int A01(AoF aoF) {
        return aoF.A02().length();
    }
}
