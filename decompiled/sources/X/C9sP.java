package X;

import java.util.Arrays;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.9sP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9sP extends C9jF implements BNA {
    public int A00;
    public C9tH A01;
    public final C9sU A02;
    public final C9sa A03;
    public final C9sS A04;
    public final C9jI A05;
    public final C9sh A06;
    public final C07959pz A07;

    public C9sP(C9iZ c9iZ, C9sU c9sU, C9sS c9sS, C9tH c9tH, C9sh c9sh) {
        C7384Etj.A0Y(c9sU, 0);
        C7384Etj.A0Y(c9iZ, 3);
        this.A02 = c9sU;
        this.A06 = c9sh;
        this.A04 = c9sS;
        this.A07 = c9sU.A02;
        this.A00 = -1;
        this.A01 = c9tH;
        C9sa c9sa = c9sU.A00;
        this.A03 = c9sa;
        this.A05 = c9sa.A0A ? null : new C9jI(c9iZ);
    }

    @Override // X.C9jF, X.InterfaceC07829iw
    public final C9j4 A55(C9iZ c9iZ) {
        C7384Etj.A0Y(c9iZ, 0);
        C9sU c9sU = this.A02;
        C9sh c9shA01 = C9sV.A01(c9iZ, c9sU);
        C9sS c9sS = this.A04;
        C9sb c9sb = c9sS.A03;
        int i = c9sb.A00 + 1;
        c9sb.A00 = i;
        Object[] objArr = c9sb.A02;
        if (i == objArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
            C7384Etj.A0U(objArrCopyOf);
            c9sb.A02 = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(c9sb.A01, i2);
            C7384Etj.A0U(iArrCopyOf);
            c9sb.A01 = iArrCopyOf;
        }
        c9sb.A02[i] = c9iZ;
        c9sS.A0L(c9shA01.begin);
        if (c9sS.A04() != 4) {
            int iOrdinal = c9shA01.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || this.A06 != c9shA01 || !c9sU.A00.A0A) ? new C9sP(c9iZ, c9sU, c9sS, this.A01, c9shA01) : this;
        }
        c9sS.A0N("Unexpected leading comma", "", c9sS.A00);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0212, code lost:
    
        if (r14.A02.A00.A06 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0217, code lost:
    
        r0 = "object";
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x022b, code lost:
    
        r4 = r3.A03;
        r8 = r4.A00;
        r5 = r4.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0235, code lost:
    
        if (r5[r8] != (-2)) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0237, code lost:
    
        r5[r8] = -1;
        r8 = r8 - 1;
        r4.A00 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x023d, code lost:
    
        if (r8 == (-1)) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x023f, code lost:
    
        r4.A00 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0243, code lost:
    
        X.C7384Etj.A0Y(r7, 0);
        r1 = r3.A0F(0, r3.A00);
        X.C7384Etj.A0Y(r1, 0);
        r2 = X.C7BY.A0C(r1, r7, r1.length() - 1, false);
        r1 = new java.lang.StringBuilder("Encountered an unknown key '");
        r1.append(r7);
        r1.append("' at offset ");
        r1.append(r2);
        r1.append(" at path: ");
        r1.append(r4.A00());
        r1.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
        r1.append((java.lang.Object) X.C9rA.A00(r3.A0A(), r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0290, code lost:
    
        throw new kotlinx.serialization.json.internal.JsonDecodingException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dd, code lost:
    
        r1 = new java.lang.StringBuilder(r0);
        r1.append(r3.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f3, code lost:
    
        throw X.C9rA.A02(r3.A0A(), r1.toString(), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    @Override // X.C9j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A8N(X.C9iZ r15) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sP.A8N(X.9iZ):int");
    }

    @Override // X.C9jF, X.InterfaceC07829iw
    public final int A8O(C9iZ c9iZ) {
        C7384Etj.A0Y(c9iZ, 0);
        return C9sC.A00(A8e(), FGI.A0M(" at path ", this.A04.A03.A00()), c9iZ, this.A02);
    }

    @Override // X.C9jF, X.C9j4
    public final Object A8a(C9jG c9jG, C9iZ c9iZ, int i) {
        boolean z;
        C7384Etj.A0Y(c9iZ, 0);
        C7384Etj.A0Y(c9jG, 2);
        if (this.A06 == C9sh.A03 && (i & 1) == 0) {
            z = true;
            C9sb c9sb = this.A04.A03;
            int[] iArr = c9sb.A01;
            int i2 = c9sb.A00;
            if (iArr[i2] == -2) {
                c9sb.A02[i2] = C9tG.A00;
            }
        } else {
            z = false;
        }
        Object objA8b = A8b(c9jG);
        if (z) {
            C9sb c9sb2 = this.A04.A03;
            int[] iArrCopyOf = c9sb2.A01;
            int i3 = c9sb2.A00;
            if (iArrCopyOf[i3] != -2) {
                int i4 = i3 + 1;
                c9sb2.A00 = i4;
                Object[] objArr = c9sb2.A02;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i5);
                    C7384Etj.A0U(objArrCopyOf);
                    c9sb2.A02 = objArrCopyOf;
                    iArrCopyOf = Arrays.copyOf(c9sb2.A01, i5);
                    C7384Etj.A0U(iArrCopyOf);
                    c9sb2.A01 = iArrCopyOf;
                }
            }
            Object[] objArr2 = c9sb2.A02;
            int i6 = c9sb2.A00;
            objArr2[i6] = objA8b;
            iArrCopyOf[i6] = -2;
        }
        return objA8b;
    }

    @Override // X.C9jF, X.C9j4
    public final void AAd(C9iZ c9iZ) {
        C7384Etj.A0Y(c9iZ, 0);
        if (c9iZ.AF6() == 0 && C9sC.A03(c9iZ, this.A02)) {
            while (A8N(c9iZ) != -1) {
            }
        }
        C9sS c9sS = this.A04;
        if (c9sS.A0O() && !this.A02.A00.A06) {
            C9rA.A05("", c9sS);
            throw F60.createAndThrow();
        }
        c9sS.A0L(this.A06.end);
        C9sb c9sb = c9sS.A03;
        int i = c9sb.A00;
        int[] iArr = c9sb.A01;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            c9sb.A00 = i;
        }
        if (i != -1) {
            c9sb.A00 = i - 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    @Override // X.C9jF, X.InterfaceC07829iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A8F() {
        /*
            r6 = this;
            X.9sS r3 = r6.A04
            int r1 = r3.A07()
            java.lang.CharSequence r5 = r3.A0A()
            int r0 = r5.length()
            if (r1 == r0) goto L62
            char r0 = r5.charAt(r1)
            r4 = 34
            r6 = 0
            if (r0 != r4) goto L1c
            int r1 = r1 + 1
            r6 = 1
        L1c:
            int r1 = r3.A08(r1)
            int r0 = r5.length()
            if (r1 >= r0) goto L62
            r0 = -1
            if (r1 == r0) goto L62
            int r2 = r1 + 1
            char r0 = r5.charAt(r1)
            r1 = r0 | 32
            r0 = 102(0x66, float:1.43E-43)
            if (r1 == r0) goto L58
            r0 = 116(0x74, float:1.63E-43)
            if (r1 != r0) goto L65
            java.lang.String r0 = "rue"
            X.C9sS.A02(r0, r3, r2)
            r2 = 1
        L3f:
            if (r6 == 0) goto L57
            int r1 = r3.A00
            int r0 = r5.length()
            if (r1 == r0) goto L62
            int r0 = r3.A00
            char r0 = r5.charAt(r0)
            if (r0 != r4) goto L5f
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
        L57:
            return r2
        L58:
            java.lang.String r0 = "alse"
            X.C9sS.A02(r0, r3, r2)
            r2 = 0
            goto L3f
        L5f:
            java.lang.String r2 = "Expected closing quotation mark"
            goto L71
        L62:
            java.lang.String r2 = "EOF"
            goto L71
        L65:
            java.lang.String r2 = "Expected valid boolean literal prefix, but had '"
            java.lang.String r1 = r3.A0C()
            r0 = 39
            java.lang.String r2 = X.FGI.A0N(r2, r1, r0)
        L71:
            int r1 = r3.A00
            java.lang.String r0 = ""
            r3.A0N(r2, r0, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sP.A8F():boolean");
    }

    @Override // X.C9jF, X.InterfaceC07829iw
    public final float A8P() throws NumberFormatException {
        C9sS c9sS = this.A04;
        String strA0C = c9sS.A0C();
        try {
            float f = Float.parseFloat(strA0C);
            if (this.A02.A00.A04 || Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            c9sS.A0N(AnonymousClass001.A0v(". By default, non-finite floating point values are prohibited because they do not conform JSON specification", C3cG.A0f(Float.valueOf(f), "Unexpected special floating-point value ")), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", c9sS.A00);
            throw F60.createAndThrow();
        } catch (IllegalArgumentException unused) {
            C9jF.A03("Failed to parse type 'float' for input '", strA0C, c9sS);
            throw F60.createAndThrow();
        }
    }

    @Override // X.C9jF, X.InterfaceC07829iw
    public final int A8T() {
        C9sS c9sS = this.A04;
        long jA09 = c9sS.A09();
        int i = (int) jA09;
        if (jA09 == i) {
            return i;
        }
        StringBuilder sb = new StringBuilder("Failed to parse int for input '");
        sb.append(jA09);
        sb.append('\'');
        c9sS.A0N(sb.toString(), "", c9sS.A00);
        throw F60.createAndThrow();
    }

    @Override // X.BNA
    public final JsonElement A8V() {
        return new C9sT(this.A02.A00, this.A04).A03();
    }

    @Override // X.C9jF, X.InterfaceC07829iw
    public final long A8W() {
        return this.A04.A09();
    }

    @Override // X.C9jF, X.InterfaceC07829iw
    public final boolean A8Y() {
        C9jI c9jI = this.A05;
        return (c9jI == null || !c9jI.A00) && !this.A04.A0Q(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    @Override // X.C9jF, X.InterfaceC07829iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T A8b(X.C9jG<? extends T> r19) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sP.A8b(X.9jG):java.lang.Object");
    }

    @Override // X.C9jF, X.InterfaceC07829iw
    public final String A8e() {
        boolean z = this.A03.A0C;
        C9sS c9sS = this.A04;
        return z ? c9sS.A0D() : c9sS.A0B();
    }

    @Override // X.BNA
    public final C9sU AGk() {
        return this.A02;
    }

    @Override // X.C9j4
    public final C07959pz AKT() {
        return this.A07;
    }
}
