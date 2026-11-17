package X;

import java.util.Map;

/* renamed from: X.Gse, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10243Gse extends AbstractC10245Gsg {
    public boolean A00;
    public final ThreadLocal<Map<Gt4, Map<Gt4, Boolean>>> A01 = ThreadLocal.withInitial(new C8927Ftj(5));
    public final AbstractC10245Gsg A02;

    private final boolean A07(Gt3 gt3, Gt4 gt4) {
        return AnonymousClass001.A1X(this.A01.get().computeIfAbsent(gt3, new C10651I0v(10)).computeIfAbsent(gt4, new C10653I0x(1, this, gt3)));
    }

    @Override // X.AbstractC10245Gsg
    public void A01() {
        this.A01.remove();
        this.A02.A01();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0019 -> B:9:0x000f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A06(X.Gt3 r4, X.Gt4 r5) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C10258Gsx
            if (r0 == 0) goto L20
            r2 = 0
            if (r4 == r5) goto L95
            X.Gt3 r0 = r5.A01
            if (r0 == 0) goto L1e
            X.Gt4 r0 = r0.A0G()
        Lf:
            if (r0 == 0) goto L95
        L11:
            if (r0 == r5) goto L95
            boolean r1 = r3.A07(r4, r0)
            if (r1 != 0) goto L4d
            X.Gt4 r0 = r0.A0H()
            goto Lf
        L1e:
            r0 = r5
            goto L11
        L20:
            boolean r0 = r3 instanceof X.C10247Gsi
            if (r0 == 0) goto L2b
            boolean r0 = r3.A07(r4, r5)
            r2 = r0 ^ 1
            return r2
        L2b:
            boolean r0 = r3 instanceof X.C10246Gsh
            if (r0 == 0) goto L36
            X.Gsg r0 = r3.A02
            boolean r2 = r0.A05(r4, r5)
            return r2
        L36:
            boolean r0 = r3 instanceof X.C10248Gsj
            if (r0 == 0) goto L5a
            r2 = 0
            if (r4 == r5) goto L95
            boolean r0 = r3.A00
            if (r0 == 0) goto L4f
            X.Gt4 r5 = r5.A0I()
            if (r5 == 0) goto L95
        L47:
            boolean r0 = r3.A07(r4, r5)
            if (r0 == 0) goto L95
        L4d:
            r2 = 1
            return r2
        L4f:
            X.Gt4 r5 = r5.A0I()
            if (r5 == 0) goto L95
            boolean r0 = r5 instanceof X.Gt3
            if (r0 == 0) goto L4f
            goto L47
        L5a:
            boolean r0 = r3 instanceof X.Gsl
            if (r0 == 0) goto L7f
            X.Gsl r3 = (X.Gsl) r3
            if (r5 == r4) goto L94
            java.util.ArrayList<X.Gsg> r2 = r3.A01
            int r1 = r2.size()
            r0 = 1
            int r1 = r1 - r0
        L6a:
            if (r1 < 0) goto L4d
            if (r5 == 0) goto L94
            java.lang.Object r0 = r2.get(r1)
            X.Gsg r0 = (X.AbstractC10245Gsg) r0
            boolean r0 = r0.A05(r4, r5)
            if (r0 == 0) goto L94
            X.Gt3 r5 = r5.A01
            int r1 = r1 + (-1)
            goto L6a
        L7f:
            boolean r0 = r3 instanceof X.C10260Gsz
            if (r0 != 0) goto L94
            r2 = 0
            if (r4 != r5) goto L87
            return r2
        L87:
            X.Gt3 r5 = r5.A01
            if (r5 == 0) goto L95
            boolean r0 = r3.A07(r4, r5)
            if (r0 != 0) goto L4d
            if (r5 != r4) goto L87
            return r2
        L94:
            r2 = 0
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC10243Gse.A06(X.Gt3, X.Gt4):boolean");
    }

    public AbstractC10243Gse(AbstractC10245Gsg abstractC10245Gsg) {
        this.A02 = abstractC10245Gsg;
        this.A00 = abstractC10245Gsg.A02();
    }
}
