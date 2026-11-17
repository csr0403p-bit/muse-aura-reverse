package X;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class DKr {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public DKr(Set set, Set set2, int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
        this.A05 = z2;
        StringBuilder sbA0w = C60O.A0w();
        Iterator it = set.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            sbA0w.append(String.valueOf(C60Q.A03(it)));
            if (i4 < set.size() - 1) {
                sbA0w.append(",");
            }
            i4++;
        }
        this.A02 = sbA0w.toString();
        StringBuilder sbA0w2 = C60O.A0w();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            sbA0w2.append(String.valueOf(C60Q.A03(it2)));
            if (i3 < set2.size() - 1) {
                sbA0w2.append(",");
            }
            i3++;
        }
        this.A03 = sbA0w2.toString();
    }
}
