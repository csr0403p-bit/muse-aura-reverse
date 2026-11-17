package X;

/* renamed from: X.9sg, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9sg extends C9sW {
    @Override // X.C9sS
    public final byte A04() {
        String str = ((C9sW) this).A00;
        int iA07 = A07();
        if (iA07 >= str.length() || iA07 == -1) {
            return (byte) 10;
        }
        ((C9sS) this).A00 = iA07;
        return C9t0.A00(str.charAt(iA07));
    }

    @Override // X.C9sW, X.C9sS
    public final byte A05() {
        String str = ((C9sW) this).A00;
        int iA07 = A07();
        if (iA07 >= str.length() || iA07 == -1) {
            return (byte) 10;
        }
        ((C9sS) this).A00 = iA07 + 1;
        return C9t0.A00(str.charAt(iA07));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        ((X.C9sS) r7).A00 = r0;
     */
    @Override // X.C9sW, X.C9sS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A07() {
        /*
            r7 = this;
            int r0 = r7.A00
            r6 = -1
            if (r0 == r6) goto L60
            java.lang.String r5 = r7.A00
        L7:
            int r4 = r5.length()
            if (r0 >= r4) goto L5e
            char r2 = r5.charAt(r0)
            r1 = 32
            if (r2 == r1) goto L4d
            r1 = 10
            if (r2 == r1) goto L4d
            r1 = 13
            if (r2 == r1) goto L4d
            r1 = 9
            if (r2 == r1) goto L4d
            r3 = 47
            if (r2 != r3) goto L5e
            int r1 = r0 + 1
            if (r1 >= r4) goto L5e
            char r2 = r5.charAt(r1)
            r1 = 42
            if (r2 == r1) goto L3f
            if (r2 != r3) goto L5e
            int r1 = r0 + 2
            r0 = 10
            int r0 = X.C7BY.A08(r5, r0, r1)
            if (r0 != r6) goto L4d
            r0 = r4
            goto L7
        L3f:
            int r2 = r0 + 2
        */
        //  java.lang.String r1 = "*/"
        /*
            r0 = 0
            int r0 = X.C7BY.A0B(r5, r1, r2, r0)
            if (r0 == r6) goto L50
            int r0 = r0 + 2
            goto L7
        L4d:
            int r0 = r0 + 1
            goto L7
        L50:
            r7.A00 = r4
        */
        //  java.lang.String r1 = "Expected end of the block comment: \"*/\", but had EOF instead"
        /*
            java.lang.String r0 = ""
            r7.A0N(r1, r0, r4)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L5e:
            r7.A00 = r0
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sg.A07():int");
    }

    @Override // X.C9sW, X.C9sS
    public final void A0L(char c) {
        String str = ((C9sW) this).A00;
        int iA07 = A07();
        if (iA07 >= str.length() || iA07 == -1) {
            ((C9sS) this).A00 = -1;
        } else {
            char cCharAt = str.charAt(iA07);
            ((C9sS) this).A00 = iA07 + 1;
            if (cCharAt == c) {
                return;
            }
        }
        A0K(c);
        throw F60.createAndThrow();
    }

    @Override // X.C9sW, X.C9sS
    public final boolean A0P() {
        int iA07 = A07();
        String str = ((C9sW) this).A00;
        if (iA07 >= str.length() || iA07 == -1) {
            return false;
        }
        return C9sS.A03(str.charAt(iA07));
    }
}
