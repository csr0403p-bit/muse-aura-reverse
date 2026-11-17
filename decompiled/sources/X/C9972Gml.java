package X;

/* renamed from: X.Gml, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9972Gml<T> {
    public final C10009Gnh A00;
    public final C9972Gml<T> A01;
    public final T A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C9972Gml<T> A00() {
        /*
            r4 = this;
            X.Gml<T> r0 = r4.A01
            if (r0 != 0) goto L5
            return r4
        L5:
            X.Gml r3 = r0.A00()
            X.Gnh r1 = r4.A00
            r2 = 0
            X.Gnh r0 = r3.A00
            if (r1 == 0) goto L17
            if (r0 != 0) goto L22
        L12:
            X.Gml r3 = r4.A05(r2)
        L16:
            return r3
        L17:
            if (r0 != 0) goto L16
            boolean r1 = r4.A05
            boolean r0 = r3.A05
            if (r1 == r0) goto L22
            if (r1 == 0) goto L16
            goto L12
        L22:
            X.Gml r3 = r4.A05(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9972Gml.A00():X.Gml");
    }

    public final C9972Gml<T> A01() {
        C9972Gml<T> c9972GmlA01;
        boolean z = this.A03;
        C9972Gml<T> c9972Gml = this.A01;
        if (!z) {
            return (c9972Gml == null || (c9972GmlA01 = c9972Gml.A01()) == c9972Gml) ? this : A05(c9972GmlA01);
        }
        if (c9972Gml == null) {
            return null;
        }
        return c9972Gml.A01();
    }

    public final C9972Gml<T> A02() {
        if (this.A01 == null) {
            return this;
        }
        return new C9972Gml<>(this.A00, null, this.A02, this.A04, this.A05, this.A03);
    }

    public final C9972Gml<T> A03() {
        C9972Gml<T> c9972Gml = this.A01;
        C9972Gml<T> c9972GmlA03 = c9972Gml == null ? null : c9972Gml.A03();
        return this.A05 ? A05(c9972GmlA03) : c9972GmlA03;
    }

    public final C9972Gml<T> A04(C9972Gml<T> c9972Gml) {
        C9972Gml<T> c9972Gml2 = this.A01;
        if (c9972Gml2 != null) {
            c9972Gml = c9972Gml2.A04(c9972Gml);
        }
        return A05(c9972Gml);
    }

    public final C9972Gml<T> A05(C9972Gml<T> c9972Gml) {
        if (c9972Gml == this.A01) {
            return this;
        }
        return new C9972Gml<>(this.A00, c9972Gml, this.A02, this.A04, this.A05, this.A03);
    }

    public final String toString() {
        String str = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.A02.toString(), Boolean.valueOf(this.A05), Boolean.valueOf(this.A03), Boolean.valueOf(this.A04));
        C9972Gml<T> c9972Gml = this.A01;
        return c9972Gml != null ? FGI.A0U(str, ", ", c9972Gml.toString()) : str;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/Gml<TT;>;LX/Gnh;ZZZ)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9972Gml(X.C10009Gnh r3, X.C9972Gml r4, java.lang.Object r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.A02 = r5
            r2.A01 = r4
            if (r3 == 0) goto L10
            boolean r1 = r3.A02()
            r0 = r3
            if (r1 == 0) goto L11
        L10:
            r0 = 0
        L11:
            r2.A00 = r0
            if (r6 == 0) goto L22
            if (r0 == 0) goto L29
            java.lang.String r0 = r3._simpleName
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L22
            r6 = 0
        L22:
            r2.A04 = r6
            r2.A05 = r7
            r2.A03 = r8
            return
        L29:
            java.lang.String r0 = "Cannot pass true for 'explName' if name is null/empty"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9972Gml.<init>(X.Gnh, X.Gml, java.lang.Object, boolean, boolean, boolean):void");
    }
}
