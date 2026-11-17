package X;

/* renamed from: X.Guc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10322Guc implements Cloneable {
    public int A00 = 0;
    public int A01 = 0;
    public String A02;
    public String A03;
    public String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10322Guc) {
                C10322Guc c10322Guc = (C10322Guc) obj;
                if (!C6xC.A00(this.A04, c10322Guc.A04) || !C6xC.A00(this.A02, c10322Guc.A02) || !C6xC.A00(this.A03, c10322Guc.A03) || this.A00 != c10322Guc.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final EnumC10327Guh A01() {
        int i = this.A00;
        if ((128 & i) != 0) {
            return EnumC10327Guh.A0m;
        }
        if ((256 & i) != 0) {
            return EnumC10327Guh.A0i;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000c A[PHI: r2
  0x000c: PHI (r2v15 int) = (r2v0 int), (r2v0 int), (r2v7 int), (r2v0 int), (r2v0 int), (r2v0 int) binds: [B:3:0x0009, B:17:0x0034, B:40:0x0082, B:11:0x0021, B:14:0x002b, B:8:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r4 = this;
            java.lang.String r1 = r4.A03
            java.lang.String r3 = r4.A02
            int r0 = r3.hashCode()
            r2 = 0
            switch(r0) {
                case -2078206768: goto L2e;
                case -296110905: goto L1b;
                case 1725132794: goto L10;
                default: goto Lc;
            }
        Lc:
            r1 = r2
        Ld:
            r4.A01 = r1
            return
        L10:
            java.lang.String r0 = "http://www.w3.org/1998/Math/MathML"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            java.lang.String[] r0 = X.AbstractC10320Gua.A03
            goto L25
        L1b:
            java.lang.String r0 = "http://www.w3.org/2000/svg"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            java.lang.String[] r0 = X.AbstractC10320Gua.A07
        L25:
            boolean r0 = X.Gt5.A09(r1, r0)
            r1 = 129(0x81, float:1.81E-43)
            if (r0 != 0) goto Ld
            goto Lc
        L2e:
            java.lang.String r0 = "http://www.w3.org/1999/xhtml"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            java.lang.String[] r0 = X.AbstractC10320Gua.A01
            boolean r0 = X.Gt5.A09(r1, r0)
            if (r0 == 0) goto L40
            r2 = 32
        L40:
            java.lang.String[] r0 = X.AbstractC10320Gua.A09
            boolean r0 = X.Gt5.A09(r1, r0)
            if (r0 == 0) goto L4a
            r2 = r2 | 64
        L4a:
            java.lang.String[] r0 = X.AbstractC10320Gua.A05
            boolean r0 = X.Gt5.A09(r1, r0)
            if (r0 == 0) goto L54
            r2 = r2 | 16
        L54:
            java.lang.String[] r0 = X.AbstractC10320Gua.A04
            boolean r0 = X.Gt5.A09(r1, r0)
            if (r0 == 0) goto L5e
            r2 = r2 | 1
        L5e:
            java.lang.String[] r0 = X.AbstractC10320Gua.A02
            boolean r0 = X.Gt5.A09(r1, r0)
            if (r0 == 0) goto L68
            r2 = r2 | 2
        L68:
            java.lang.String[] r0 = X.AbstractC10320Gua.A00
            boolean r0 = X.Gt5.A09(r1, r0)
            if (r0 == 0) goto L72
            r2 = r2 | 4
        L72:
            java.lang.String[] r0 = X.AbstractC10320Gua.A08
            boolean r0 = X.Gt5.A09(r1, r0)
            if (r0 == 0) goto L7c
            r2 = r2 | 8
        L7c:
            java.lang.String[] r0 = X.AbstractC10320Gua.A06
            boolean r0 = X.Gt5.A09(r1, r0)
            if (r0 == 0) goto Lc
            r1 = r2 | 128(0x80, float:1.794E-43)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10322Guc.A02():void");
    }

    public final int hashCode() {
        return BV7.A0D(this.A04, this.A02);
    }

    public final String toString() {
        return this.A04;
    }

    public C10322Guc(String str, String str2, String str3) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        A02();
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C10322Guc clone() {
        try {
            return (C10322Guc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw BV4.A0e(e);
        }
    }
}
