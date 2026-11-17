package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class F9F implements F9H {
    public final F9H A00;
    public final List<Integer> A01;
    public final int[] A02;

    @Override // X.F9H
    public final F9G ACu() {
        F9G f9gACu;
        F9H f9h = this.A00;
        if (f9h == null || (f9gACu = f9h.ACu()) == null) {
            return null;
        }
        String strAM3 = AM3();
        return new F9G(f9gACu.A00, (strAM3 == null || strAM3.length() == 0) ? f9gACu.A01 : FGI.A0U(f9gACu.A01, ":", strAM3));
    }

    @Override // X.F9H
    public final F9H AIT() {
        return this.A00;
    }

    @Override // X.F9H
    public final String AM3() {
        int[] iArr = this.A02;
        if (iArr == null) {
            List<Integer> list = this.A01;
            if (list != null) {
                return C3cH.A0e(":", list);
            }
            return null;
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((CharSequence) "");
        int i = 0;
        for (int i2 : iArr) {
            i++;
            if (i > 1) {
                sbA0w.append((CharSequence) ":");
            }
            sbA0w.append((CharSequence) String.valueOf(i2));
        }
        sbA0w.append((CharSequence) "");
        return sbA0w.toString();
    }

    @Override // X.F9H
    public final F9H AQ2(F9H f9h) {
        int[] iArr = this.A02;
        return iArr != null ? new F9F(f9h, iArr) : new F9F(f9h, this.A01);
    }

    @Override // X.F9H
    public final String getLoggingId() {
        F9H f9h = this.A00;
        if (f9h != null) {
            return f9h.getLoggingId();
        }
        return null;
    }

    public F9F(F9H f9h, List<Integer> list) {
        this.A00 = f9h;
        this.A02 = null;
        this.A01 = list;
    }

    public F9F(F9H f9h, int[] iArr) {
        this.A00 = f9h;
        this.A02 = iArr;
        this.A01 = null;
    }
}
