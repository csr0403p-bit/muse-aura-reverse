package X;

/* renamed from: X.Atz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1936Atz implements AzK {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1936Atz) {
                C1936Atz c1936Atz = (C1936Atz) obj;
                if (this.A01 != c1936Atz.A01 || this.A00 != c1936Atz.A00) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    @Override // X.AzK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A4d(X.C1917Ate r9) {
        /*
            r8 = this;
            int r5 = r8.A01
            r6 = 0
            r4 = 0
            r7 = 0
        L5:
            if (r4 >= r5) goto L2e
            int r3 = r7 + 1
            int r0 = r9.A03
            if (r0 <= r3) goto L2d
            int r0 = r0 - r3
            int r0 = r0 + (-1)
            char r2 = r9.A01(r0)
            int r0 = r9.A03
            int r0 = r0 - r3
            char r1 = r9.A01(r0)
            boolean r0 = java.lang.Character.isHighSurrogate(r2)
            if (r0 == 0) goto L29
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            int r7 = r7 + 2
            if (r0 != 0) goto L2a
        L29:
            r7 = r3
        L2a:
            int r4 = r4 + 1
            goto L5
        L2d:
            r7 = r0
        L2e:
            int r5 = r8.A00
            r4 = 0
        L31:
            if (r6 >= r5) goto L63
            int r3 = r4 + 1
            int r2 = r9.A02
            int r1 = r2 + r3
            X.Atf r0 = r9.A04
            int r0 = r0.A00()
            if (r1 >= r0) goto L61
            int r2 = r2 + r3
            int r0 = r2 + (-1)
            char r2 = r9.A01(r0)
            int r0 = r9.A02
            int r0 = r0 + r3
            char r1 = r9.A01(r0)
            boolean r0 = java.lang.Character.isHighSurrogate(r2)
            if (r0 == 0) goto L5d
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            int r4 = r4 + 2
            if (r0 != 0) goto L5e
        L5d:
            r4 = r3
        L5e:
            int r6 = r6 + 1
            goto L31
        L61:
            int r4 = r0 - r2
        L63:
            int r1 = r9.A02
            int r0 = r1 + r4
            r9.A02(r1, r0)
            int r1 = r9.A03
            int r0 = r1 - r7
            r9.A02(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1936Atz.A4d(X.Ate):void");
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return C8j4.A0y("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", ", lengthAfterCursor=", this.A01, this.A00);
    }

    public C1936Atz(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0 || i2 < 0) {
            throw C60O.A0i(FGI.A0Y("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.", i, i2));
        }
    }
}
