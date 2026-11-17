package X;

/* loaded from: classes6.dex */
public abstract class FK2 {
    public static final int[] A00 = {67, 71, 70, 78, 68, 72, 76, 81, 87, 88, 89, 90, 91, 93, 77};

    public static int A00(FDW fdw) {
        String strA0t = AbstractC7608F5v.A0t(fdw);
        if (strA0t == null || strA0t.equals("column")) {
            return 1;
        }
        if (strA0t.equals("row")) {
            return 0;
        }
        throw C60Q.A0U("Unknown direction: ", strA0t);
    }
}
