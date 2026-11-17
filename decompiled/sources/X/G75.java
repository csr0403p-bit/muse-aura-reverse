package X;

import java.util.List;

/* loaded from: classes6.dex */
public class G75 {
    public final int A00;
    public final /* synthetic */ G7B A01;

    public static int A00(G75 g75) {
        return A03(g75, 0).A02 - A03(g75, 0).A03;
    }

    public static boolean A04(Object obj, G75 g75) {
        return C7384Etj.areEqual(A03(g75, 0).A04, obj);
    }

    public G75(G7B g7b, int i) {
        this.A01 = g7b;
        this.A00 = i;
    }

    public static ADq A01(G75 g75, int i) {
        return new ADq(i, g75.A00 + 1);
    }

    public static final G79 A03(G75 g75, int i) {
        int i2;
        int i3 = g75.A00;
        G74 g74 = (G74) g75.A01;
        if (i3 >= 0) {
            List<G79> list = g74.A02;
            if (i3 <= list.size()) {
                int size = (i3 < list.size() ? list.get(i3).A01 : g74.A01.size()) + i;
                if (size >= 0) {
                    List<G79> list2 = g74.A01;
                    if (size < list2.size()) {
                        return list2.get(size);
                    }
                }
                i2 = g74.A03.A00;
            }
            i2 = g74.A03.A01 + 1;
        } else {
            i2 = g74.A03.A00;
        }
        return new G79(null, i2, i2, 0, 0);
    }

    public final char A05(int i) {
        G7B g7b;
        int i2;
        if (i == 0) {
            g7b = this.A01;
            i2 = A03(this, 0).A03;
        } else if (i == -1) {
            g7b = this.A01;
            i2 = A03(this, 0).A03 - 1;
        } else {
            if (i != 1) {
                return this.A01.A00(i > 0 ? A03(this, i).A03 : A03(this, i + 1).A03 - 1);
            }
            g7b = this.A01;
            i2 = A03(this, 0).A02;
        }
        return g7b.A00(i2);
    }

    public final G72 A06(int i) {
        if (!(this instanceof G78)) {
            return A02(this, i);
        }
        G78 g78 = (G78) this;
        C0968AJv c0968AJv = (C0968AJv) AbstractC0878AGe.A0A(g78.A00, g78.A01);
        if (c0968AJv == null) {
            return null;
        }
        int i2 = c0968AJv.A00;
        int i3 = c0968AJv.A01;
        int i4 = ((G75) g78).A00 + i;
        if (i2 > i4 || i4 > i3) {
            return null;
        }
        return A02(g78, i);
    }

    public final G75 A07() {
        return this instanceof G78 ? ((G78) this).A08() : new G75(this.A01, this.A00 + 1);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Iterator: ");
        sbA0x.append(this.A00);
        sbA0x.append(": ");
        return C8j3.A14(A02(this, 0), sbA0x);
    }

    public static G72 A02(G75 g75, int i) {
        return A03(g75, i).A04;
    }
}
