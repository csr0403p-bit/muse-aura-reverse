package X;

/* loaded from: classes6.dex */
public final class GNM {
    public int A00;
    public int A01;
    public String A02;

    public static GNM A00(String str, int i, int i2) {
        GNM gnm = new GNM();
        gnm.A00 = i;
        gnm.A01 = i2;
        gnm.A02 = str;
        return gnm;
    }

    public final String toString() {
        String strA00 = BV3.A00(43);
        int i = this.A00;
        GN6 gn6 = GNL.A00;
        return FGI.A0d(strA00, (!gn6.containsKey(Integer.valueOf(i)) ? GNL.A02 : gn6.get(Integer.valueOf(i))).toString(), ", Debug Message: ", this.A02);
    }
}
