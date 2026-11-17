package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.FiV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8669FiV {
    public static final C8669FiV A02 = new C8669FiV("COMPOSITION");
    public InterfaceC8663FiO A00;
    public final List<String> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C8669FiV c8669FiV = (C8669FiV) obj;
            if (!this.A01.equals(c8669FiV.A01)) {
                return false;
            }
            InterfaceC8663FiO interfaceC8663FiO = this.A00;
            InterfaceC8663FiO interfaceC8663FiO2 = c8669FiV.A00;
            if (interfaceC8663FiO != null) {
                return interfaceC8663FiO.equals(interfaceC8663FiO2);
            }
            if (interfaceC8663FiO2 != null) {
                return false;
            }
        }
        return true;
    }

    public final int A00(String str, int i) {
        if (!"__container".equals(str)) {
            List<String> list = this.A01;
            if (!C60Q.A0n(list, i).equals("**")) {
                return 1;
            }
            if (i != AbstractC7607F5u.A0J(list, 1) && C60Q.A0n(list, i + 1).equals(str)) {
                return 2;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(java.lang.String r7, int r8) {
        /*
            r6 = this;
            java.util.List<java.lang.String> r4 = r6.A01
            int r0 = r4.size()
            r6 = 0
            if (r8 >= r0) goto L80
            int r0 = r4.size()
            r2 = 1
            int r0 = r0 - r2
            boolean r5 = X.AnonymousClass002.A1Q(r8, r0)
            java.lang.String r1 = X.C60Q.A0n(r4, r8)
            java.lang.String r3 = "**"
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L48
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "*"
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L2f
        L2e:
            r0 = 1
        L2f:
            if (r5 != 0) goto L45
            int r1 = r4.size()
            int r1 = r1 + (-2)
            if (r8 != r1) goto L80
            java.lang.Object r1 = X.BV5.A0e(r4)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L80
        L45:
            if (r0 == 0) goto L80
        L47:
            return r2
        L48:
            if (r5 != 0) goto L47
            int r1 = r8 + 1
            java.lang.String r0 = X.C60Q.A0n(r4, r1)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L71
            int r0 = r4.size()
            int r0 = r0 + (-2)
            if (r8 == r0) goto L47
            int r0 = r4.size()
            int r0 = r0 + (-3)
            if (r8 != r0) goto L80
            java.lang.Object r0 = X.BV5.A0e(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r3)
            goto L45
        L71:
            int r0 = X.AbstractC7607F5u.A0J(r4, r2)
            if (r1 < r0) goto L80
            java.lang.String r0 = X.C60Q.A0n(r4, r1)
            boolean r0 = r0.equals(r7)
            return r0
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8669FiV.A01(java.lang.String, int):boolean");
    }

    public final boolean A02(String str, int i) {
        if (!"__container".equals(str)) {
            List<String> list = this.A01;
            if (i >= list.size() || (!C60Q.A0n(list, i).equals(str) && !C60Q.A0n(list, i).equals("**") && !C60Q.A0n(list, i).equals("*"))) {
                return false;
            }
        }
        return true;
    }

    public final boolean A03(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.A01;
        return i < AbstractC7607F5u.A0J(list, 1) || C60Q.A0n(list, i).equals("**");
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + C60R.A01(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("KeyPath{keys=");
        sbA0x.append(this.A01);
        sbA0x.append(",resolved=");
        sbA0x.append(AnonymousClass002.A1X(this.A00));
        return C8j3.A15(sbA0x);
    }

    public C8669FiV(C8669FiV c8669FiV) {
        this.A01 = BV4.A0t(c8669FiV.A01);
        this.A00 = c8669FiV.A00;
    }

    public C8669FiV(String... strArr) {
        this.A01 = Arrays.asList(strArr);
    }
}
