package X;

/* renamed from: X.7lA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7lA extends AbstractC7559F3s implements G0U<C1Lu, CharSequence> {
    public final /* synthetic */ boolean $processEntities;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7lA(boolean z) {
        super(1);
        this.$processEntities = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r0 != null) goto L22;
     */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.CharSequence invoke(X.C1Lu r6) throws java.lang.NumberFormatException {
        /*
            r5 = this;
            X.1Lu r6 = (X.C1Lu) r6
            r4 = 0
            X.C7384Etj.A0Y(r6, r4)
            X.7l8 r6 = (X.C06847l8) r6
            X.7lE r3 = r6.A02
            int r0 = r3.size()
            r1 = 5
            if (r0 <= r1) goto L35
            X.1YK r0 = r3.A0E(r1)
            if (r0 == 0) goto L35
            X.1YK r0 = r3.A0E(r1)
            X.C7384Etj.A0X(r0)
            java.lang.String r0 = r0.A00
            char r2 = r0.charAt(r4)
            java.util.Map<java.lang.Character, java.lang.String> r1 = X.C7l2.A00
            java.lang.Character r0 = java.lang.Character.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = java.lang.String.valueOf(r2)
        L34:
            return r0
        L35:
            r2 = 4
            X.1YK r0 = r3.A0E(r2)
            if (r0 == 0) goto L5a
            java.util.Map<java.lang.Character, java.lang.String> r1 = X.C7l2.A00
            X.1YK r0 = r3.A0E(r2)
            X.C7384Etj.A0X(r0)
            java.lang.String r0 = r0.A00
            char r0 = r0.charAt(r4)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = X.C06847l8.A00(r6)
            return r0
        L5a:
            boolean r0 = r5.$processEntities
            r2 = 1
            if (r0 == 0) goto Lb9
            X.1YK r0 = r3.A0E(r2)
            if (r0 == 0) goto L89
            java.util.Map<java.lang.String, java.lang.Integer> r1 = X.FY2.A00
            java.lang.String r0 = X.C06847l8.A00(r6)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto Lb9
        L73:
            int r0 = r0.intValue()
            char r0 = (char) r0
            java.lang.Character r1 = java.lang.Character.valueOf(r0)
            java.util.Map<java.lang.Character, java.lang.String> r0 = X.C7l2.A00
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L34
            java.lang.String r0 = r1.toString()
            return r0
        L89:
            r1 = 2
            X.1YK r0 = r3.A0E(r1)
            if (r0 == 0) goto La2
            X.1YK r0 = r3.A0E(r1)
            X.C7384Etj.A0X(r0)
            java.lang.String r0 = r0.A00
            int r0 = java.lang.Integer.parseInt(r0)
        L9d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L73
        La2:
            r1 = 3
            X.1YK r0 = r3.A0E(r1)
            if (r0 == 0) goto Lb9
            X.1YK r0 = r3.A0E(r1)
            X.C7384Etj.A0X(r0)
            java.lang.String r1 = r0.A00
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r1, r0)
            goto L9d
        Lb9:
            java.lang.String r1 = "&amp;"
            java.lang.String r0 = X.C06847l8.A00(r6)
            java.lang.String r0 = r0.substring(r2)
            java.lang.String r0 = X.FGI.A0M(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7lA.invoke(java.lang.Object):java.lang.Object");
    }
}
