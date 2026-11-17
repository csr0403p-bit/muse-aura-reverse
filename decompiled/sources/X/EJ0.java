package X;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class EJ0 {
    public static final int A00(EIK eik, String str) {
        C7384Etj.A0Y(eik, 0);
        int columnCount = eik.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                break;
            }
            if (!str.equals(eik.getColumnName(i))) {
                i++;
            } else if (i >= 0) {
                return i;
            }
        }
        String strA0N = FGI.A0N("`", str, '`');
        int columnCount2 = eik.getColumnCount();
        for (int i2 = 0; i2 < columnCount2; i2++) {
            if (strA0N.equals(eik.getColumnName(i2))) {
                if (i2 >= 0) {
                    return i2;
                }
                return -1;
            }
        }
        return -1;
    }
}
