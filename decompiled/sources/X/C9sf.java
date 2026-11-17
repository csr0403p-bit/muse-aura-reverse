package X;

/* renamed from: X.9sf, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9sf extends C07989se {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        ((X.C9sS) r10).A00 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056 A[EDGE_INSN: B:57:0x0056->B:23:0x0056 BREAK  A[LOOP:0: B:3:0x0002->B:61:0x0002], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0002 A[SYNTHETIC] */
    @Override // X.C07989se, X.C9sS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A07() {
        /*
            r10 = this;
            int r2 = r10.A00
        L2:
            int r2 = r10.A08(r2)
            r0 = -1
            if (r2 == r0) goto L56
            X.9st r5 = r10.A01
            char r1 = r5.charAt(r2)
            r0 = 32
            if (r1 == r0) goto Lb3
            r0 = 10
            if (r1 == r0) goto Lb3
            r0 = 13
            if (r1 == r0) goto Lb3
            r0 = 9
            if (r1 == r0) goto Lb3
            r9 = 47
            if (r1 != r9) goto L56
            int r1 = r2 + 1
            int r0 = r5.length()
            if (r1 >= r0) goto L56
            int r1 = r2 + 2
            int r0 = r2 + 1
            char r0 = r5.charAt(r0)
            r7 = 0
            r4 = -1
            r8 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            r6 = 42
            if (r0 == r6) goto L6d
            if (r0 == r9) goto L59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            X.HxE r1 = X.AnonymousClass002.A0q(r0, r7)
        L48:
            A r0 = r1.first
            int r2 = X.AnonymousClass001.A0F(r0)
            B r0 = r1.second
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 != 0) goto L2
        L56:
            r10.A00 = r2
            return r2
        L59:
            if (r2 == r4) goto Laa
            r0 = 10
            int r0 = X.C7BY.A08(r5, r0, r1)
            if (r0 != r4) goto La8
            int r0 = r5.length()
            int r1 = r10.A08(r0)
            r2 = r1
            goto L59
        L6d:
            if (r2 == r4) goto Lb7
        */
        //  java.lang.String r2 = "*/"
        /*
            r0 = 0
            int r0 = X.C7BY.A0B(r5, r2, r1, r0)
            if (r0 == r4) goto L7b
            int r4 = r0 + 2
            goto Laa
        L7b:
            int r2 = r5.length()
            int r1 = r2 - r8
            char r0 = r5.charAt(r1)
            if (r0 == r6) goto L8d
            int r1 = r10.A08(r2)
            r2 = r1
            goto L6d
        L8d:
            int r2 = r2 - r1
            int r0 = r10.A00
            if (r2 > r0) goto La3
            r10.A00 = r1
            r10.A0I()
            int r0 = r10.A00
            if (r0 != 0) goto La2
            int r0 = r5.length()
            r1 = 0
            if (r0 != 0) goto La3
        La2:
            r1 = -1
        La3:
            if (r7 != 0) goto Lb7
            r2 = r1
            r7 = 1
            goto L6d
        La8:
            int r4 = r0 + 1
        Laa:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            X.HxE r1 = X.C3cG.A0r(r0, r3)
            goto L48
        Lb3:
            int r2 = r2 + 1
            goto L2
        Lb7:
            int r2 = r5.length()
            r10.A00 = r2
        */
        //  java.lang.String r1 = "Expected end of the block comment: \"*/\", but had EOF instead"
        /*
            java.lang.String r0 = ""
            r10.A0N(r1, r0, r2)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sf.A07():int");
    }

    @Override // X.C9sS
    public final byte A04() {
        A0I();
        C08109st c08109st = ((C07989se) this).A01;
        int iA07 = A07();
        if (iA07 >= c08109st.length() || iA07 == -1) {
            return (byte) 10;
        }
        ((C9sS) this).A00 = iA07;
        return C9t0.A00(c08109st.charAt(iA07));
    }

    @Override // X.C07989se, X.C9sS
    public final byte A05() {
        A0I();
        C08109st c08109st = ((C07989se) this).A01;
        int iA07 = A07();
        if (iA07 >= c08109st.length() || iA07 == -1) {
            return (byte) 10;
        }
        ((C9sS) this).A00 = iA07 + 1;
        return C9t0.A00(c08109st.charAt(iA07));
    }

    @Override // X.C07989se, X.C9sS
    public final void A0L(char c) {
        A0I();
        C08109st c08109st = ((C07989se) this).A01;
        int iA07 = A07();
        if (iA07 >= c08109st.length() || iA07 == -1) {
            ((C9sS) this).A00 = -1;
        } else {
            char cCharAt = c08109st.charAt(iA07);
            ((C9sS) this).A00 = iA07 + 1;
            if (cCharAt == c) {
                return;
            }
        }
        A0K(c);
        throw F60.createAndThrow();
    }

    @Override // X.C07989se, X.C9sS
    public final boolean A0P() {
        A0I();
        int iA07 = A07();
        C08109st c08109st = ((C07989se) this).A01;
        if (iA07 >= c08109st.length() || iA07 == -1) {
            return false;
        }
        return C9sS.A03(c08109st.charAt(iA07));
    }
}
