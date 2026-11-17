package X;

import android.view.View;

/* renamed from: X.FGi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7827FGi {
    public final long A00;

    static {
        C7828FGj.A00.A00(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7827FGi) && this.A00 == ((C7827FGi) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        AbstractC7829FGk abstractC7829FGkA01 = AbstractC7829FGk.A01(BV6.A03(j));
        int iA03 = abstractC7829FGkA01.A03(j);
        Object objValueOf = iA03 == Integer.MAX_VALUE ? "Infinity" : Integer.valueOf(iA03);
        AbstractC7829FGk abstractC7829FGkA012 = AbstractC7829FGk.A01((int) j);
        int iA02 = abstractC7829FGkA012.A02(j);
        Object objValueOf2 = iA02 != Integer.MAX_VALUE ? Integer.valueOf(iA02) : "Infinity";
        int iA05 = abstractC7829FGkA01.A05(j);
        int iA04 = abstractC7829FGkA012.A04(j);
        StringBuilder sbA0y = C60O.A0y("SizeConstraints[minWidth = ", iA05);
        sbA0y.append(C8j2.A00(35));
        sbA0y.append(objValueOf);
        sbA0y.append(C8j2.A00(36));
        sbA0y.append(iA04);
        sbA0y.append(C8j2.A00(34));
        return BV8.A0u(objValueOf2, sbA0y);
    }

    public static final long A00(int i, int i2) {
        AbstractC7829FGk abstractC7829FGk;
        int i3;
        AbstractC7829FGk abstractC7829FGk2;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            abstractC7829FGk = C7838FGu.A00;
        } else {
            if (mode != 1073741824) {
                throw C3cG.A0Q("Unknown width spec mode.");
            }
            abstractC7829FGk = C7840FGw.A00;
        }
        int i4 = abstractC7829FGk.A01.A01;
        int mode2 = View.MeasureSpec.getMode(i);
        int i5 = 0;
        int iA04 = ATD.A04(View.MeasureSpec.getSize(i), 0, i4);
        int i6 = Integer.MAX_VALUE;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = iA04;
            iA04 = 0;
        } else if (mode2 == 0) {
            iA04 = 0;
            i3 = Integer.MAX_VALUE;
        } else {
            if (mode2 != 1073741824) {
                throw C3cG.A0Q("Unknown width spec mode.");
            }
            i3 = iA04;
        }
        int mode3 = View.MeasureSpec.getMode(i2);
        if (mode3 == Integer.MIN_VALUE || mode3 == 0) {
            abstractC7829FGk2 = C7838FGu.A00;
        } else {
            if (mode3 != 1073741824) {
                throw C3cG.A0Q("Unknown width spec mode.");
            }
            abstractC7829FGk2 = C7840FGw.A00;
        }
        int i7 = abstractC7829FGk2.A01.A01;
        int mode4 = View.MeasureSpec.getMode(i2);
        int iA042 = ATD.A04(View.MeasureSpec.getSize(i2), 0, i7);
        if (mode4 == Integer.MIN_VALUE) {
            i6 = iA042;
        } else if (mode4 != 0) {
            if (mode4 != 1073741824) {
                throw C3cG.A0Q("Unknown height spec mode.");
            }
            i6 = iA042;
            i5 = iA042;
        }
        return C7828FGj.A00.A00(iA04, i3, i5, i6);
    }
}
