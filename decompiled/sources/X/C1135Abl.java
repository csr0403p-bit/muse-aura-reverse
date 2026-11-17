package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.Abl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1135Abl implements InterfaceC1144Abx {
    public C1229Af7 A00;
    public C1133Abh A01;
    public final Function0<Integer> A02;

    public static final C1133Abh A00(C1135Abl c1135Abl) {
        C1133Abh c1133Abh = c1135Abl.A01;
        if (c1133Abh != null) {
            return c1133Abh;
        }
        C7384Etj.A0b("layoutInfo");
        throw F60.createAndThrow();
    }

    public C1135Abl(Function0<Integer> function0) {
        this.A02 = function0;
    }

    public final int A01() {
        if (C1133Abh.A00(this)) {
            return -1;
        }
        long j = ((AbZ) AbstractC0878AGe.A0F(A00(this).A0H)).A03 - A00(this).A02;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public final int A02() {
        if (C1133Abh.A00(this)) {
            return -1;
        }
        long j = ((AbZ) AbstractC0878AGe.A0H(A00(this).A0H)).A03 + A00(this).A02;
        long jA0I = C8j4.A0I(this.A02) - 1;
        if (j > jA0I) {
            j = jA0I;
        }
        return (int) j;
    }

    public final int A03() {
        if (C1133Abh.A00(this)) {
            return 0;
        }
        return Math.abs(((((AbZ) AbstractC0878AGe.A0H(A00(this).A0H)).A01 + A00(this).A04) + A00(this).A05) - A00(this).A06);
    }

    public final int A04() {
        if (C1133Abh.A00(this)) {
            return 0;
        }
        int i = ((AbZ) AbstractC0878AGe.A0F(A00(this).A0H)).A01 + (-A00(this).A07);
        if (i > 0) {
            i = 0;
        }
        return Math.abs(i);
    }
}
