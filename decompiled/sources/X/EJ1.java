package X;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class EJ1 {
    public static final int A00(EIK eik, String str) {
        C7384Etj.A0Y(eik, 0);
        int iA00 = EJ0.A00(eik, str);
        if (iA00 >= 0) {
            return iA00;
        }
        int columnCount = eik.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(eik.getColumnName(i));
        }
        throw new IllegalArgumentException(FGI.A0e("Column '", str, "' does not exist. Available columns: [", AbstractC0878AGe.A0L(", ", "", "", arrayList, null), ']'));
    }
}
