package X;

/* renamed from: X.DgJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5325DgJ {
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C5325DgJ c5325DgJ = (C5325DgJ) obj;
                if (this.A02 != c5325DgJ.A02 || this.A01 != c5325DgJ.A01 || !this.A03.equals(c5325DgJ.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5325DgJ A00(X.C5325DgJ r16, java.lang.String r17) {
        /*
            r15 = this;
            java.lang.String r0 = r15.A03
            r1 = r17
            java.lang.String r10 = X.C0F.A01(r1, r0)
            r9 = 0
            r5 = r16
            if (r16 == 0) goto L38
            java.lang.String r0 = r5.A03
            java.lang.String r0 = X.C0F.A01(r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L38
            long r2 = r15.A01
            r13 = -1
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 == 0) goto L39
            long r11 = r15.A02
            long r6 = r11 + r2
            long r0 = r5.A02
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L39
            long r0 = r5.A01
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
        L2f:
            if (r4 == 0) goto L33
            long r13 = r2 + r0
        L33:
            X.DgJ r9 = new X.DgJ
            r9.<init>(r10, r11, r13)
        L38:
            return r9
        L39:
            long r0 = r5.A01
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 == 0) goto L38
            long r11 = r5.A02
            long r7 = r11 + r0
            long r4 = r15.A02
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L38
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5325DgJ.A00(X.DgJ, java.lang.String):X.DgJ");
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int iA0H = AnonymousClass001.A0H(this.A03, (((527 + ((int) this.A02)) * 31) + ((int) this.A01)) * 31);
        this.A00 = iA0H;
        return iA0H;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RangedUri(referenceUri=");
        sbA0x.append(this.A03);
        sbA0x.append(C8j2.A00(14));
        sbA0x.append(this.A02);
        sbA0x.append(", length=");
        sbA0x.append(this.A01);
        return BV7.A10(sbA0x);
    }

    public C5325DgJ(String str, long j, long j2) {
        this.A03 = str == null ? "" : str;
        this.A02 = j;
        this.A01 = j2;
    }
}
