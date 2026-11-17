package X;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.DlS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5592DlS {
    public final Map<Long, C5591DlR> A00 = C3cG.A0j();

    public static long[] A00(long[]... arrays) {
        long length = 0;
        for (long[] jArr : arrays) {
            length += jArr.length;
        }
        int i = (int) length;
        Preconditions.checkArgument(AnonymousClass002.A1M((length > i ? 1 : (length == i ? 0 : -1))), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr2 = new long[i];
        int length2 = 0;
        for (long[] jArr3 : arrays) {
            System.arraycopy(jArr3, 0, jArr2, length2, jArr3.length);
            length2 += jArr3.length;
        }
        return jArr2;
    }

    public final void A02(C5591DlR c5591DlR) {
        long[] jArr = c5591DlR.A04;
        if (jArr.length > 0) {
            Map<Long, C5591DlR> map = this.A00;
            if (map.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            map.put(Long.valueOf(jArr[0]), c5591DlR);
        }
    }

    public final C5591DlR A01() {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        ArrayList arrayListA0h3 = C3cG.A0h();
        ArrayList arrayListA0h4 = C3cG.A0h();
        Iterator itA10 = BV5.A10(this.A00);
        while (itA10.hasNext()) {
            C5591DlR c5591DlR = (C5591DlR) itA10.next();
            arrayListA0h.add(c5591DlR.A01);
            arrayListA0h2.add(c5591DlR.A03);
            arrayListA0h3.add(c5591DlR.A02);
            arrayListA0h4.add(c5591DlR.A04);
        }
        int[][] iArr = (int[][]) arrayListA0h.toArray(new int[arrayListA0h.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int i = (int) length;
        Preconditions.checkArgument(AnonymousClass002.A1M((length > i ? 1 : (length == i ? 0 : -1))), "the total number of elements (%s) in the arrays must fit in an int", length);
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new C5591DlR(iArr3, A00((long[][]) arrayListA0h2.toArray(new long[arrayListA0h2.size()][])), A00((long[][]) arrayListA0h3.toArray(new long[arrayListA0h3.size()][])), A00((long[][]) arrayListA0h4.toArray(new long[arrayListA0h4.size()][])));
    }
}
