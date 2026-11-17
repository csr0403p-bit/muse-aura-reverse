package X;

/* renamed from: X.GkS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9891GkS extends C9892GkT {
    public static final long serialVersionUID = 1;
    public final EnumC10075Gow _inclusion;
    public final String _msgForMissingId;
    public final boolean _strictTypeIdHandling;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0A(X.AbstractC9916Gl7 r4, X.AbstractC9904Gkk r5, X.C9913Gl1 r6, java.lang.String r7) throws com.fasterxml.jackson.core.JsonGenerationException, com.fasterxml.jackson.databind.exc.InvalidTypeIdException {
        /*
            r3 = this;
            X.GjI r0 = r3._defaultImpl
            boolean r0 = X.AnonymousClass002.A1X(r0)
            r2 = 0
            if (r0 != 0) goto L1c
            X.GjI r0 = r3._baseType
            java.lang.Object r0 = X.AbstractC9986Gn8.A02(r4, r0)
            if (r0 != 0) goto L1b
            boolean r0 = r4.A1x()
            if (r0 == 0) goto L50
            java.lang.Object r0 = X.C9892GkT.A01(r4, r5, r3)
        L1b:
            return r0
        L1c:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A07(r5)
            if (r0 != 0) goto L3f
            boolean r0 = r3._strictTypeIdHandling
            if (r0 == 0) goto L35
            X.GjI r4 = r3._baseType
            X.Gke r0 = r5._config
            X.GiP r0 = r0._problemHandlers
            if (r0 == 0) goto L73
            java.lang.String r0 = "handleMissingTypeId"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)
            throw r0
        L35:
            X.GjI r1 = r3._baseType
            if (r1 == 0) goto L72
            X.Gnp r0 = r3._property
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r5.A0G(r0, r1)
        L3f:
            if (r6 == 0) goto L4b
            r6.A0Q()
            X.GlN r4 = r6.A10(r4)
            r4.A1P()
        L4b:
            java.lang.Object r0 = r0.A0i(r4, r5)
            return r0
        L50:
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            boolean r0 = r4.A22(r0)
            if (r0 == 0) goto L1c
            X.Gmd r0 = X.EnumC9965Gmd.A02
            int r1 = r5._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L1c
            java.lang.String r0 = r4.A1c()
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1c
        L72:
            return r2
        L73:
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "Could not resolve subtype of %s"
            java.lang.String r3 = java.lang.String.format(r0, r1)
            X.Gl7 r1 = r5.A00
            if (r7 == 0) goto L87
            java.lang.String r0 = ": "
            java.lang.String r3 = X.FGI.A0U(r3, r0, r7)
        L87:
            com.fasterxml.jackson.databind.exc.InvalidTypeIdException r0 = new com.fasterxml.jackson.databind.exc.InvalidTypeIdException
            r0.<init>(r1, r4, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9891GkS.A0A(X.Gl7, X.Gkk, X.Gl1, java.lang.String):java.lang.Object");
    }

    public C9891GkS(InterfaceC10017Gnp interfaceC10017Gnp, C9891GkS c9891GkS) {
        Object[] objArr;
        String str;
        super(interfaceC10017Gnp, c9891GkS);
        InterfaceC10017Gnp interfaceC10017Gnp2 = this._property;
        String str2 = this._typePropertyName;
        if (interfaceC10017Gnp2 == null) {
            objArr = new Object[]{str2};
            str = "missing type id property '%s'";
        } else {
            objArr = new Object[]{str2, interfaceC10017Gnp2.getName()};
            str = "missing type id property '%s' (for POJO property '%s')";
        }
        this._msgForMissingId = String.format(str, objArr);
        this._inclusion = c9891GkS._inclusion;
        this._strictTypeIdHandling = c9891GkS._strictTypeIdHandling;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(X.AbstractC9916Gl7 r4, X.AbstractC9904Gkk r5, X.C9913Gl1 r6, java.lang.String r7) throws com.fasterxml.jackson.core.JsonGenerationException, com.fasterxml.jackson.databind.exc.InvalidTypeIdException {
        /*
            r3 = this;
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r3.A08(r5, r7)
            boolean r0 = r3._typeIdVisible
            if (r0 == 0) goto L34
            if (r6 != 0) goto Lf
            X.Gl1 r6 = new X.Gl1
            r6.<init>(r4)
        Lf:
            java.lang.String r0 = r4.A1a()
            r6.A0o(r0)
            r6.A0s(r7)
        L19:
            r4.A1i()
            X.GlN r0 = r6.A10(r4)
            X.Gnm r4 = X.C10014Gnm.A0A(r0, r4)
        L24:
            X.GiY r1 = r4.A1N()
            X.GiY r0 = X.EnumC9834GiY.END_OBJECT
            if (r1 == r0) goto L2f
            r4.A1P()
        L2f:
            java.lang.Object r0 = r2.A0i(r4, r5)
            return r0
        L34:
            if (r6 == 0) goto L24
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9891GkS.A09(X.Gl7, X.Gkk, X.Gl1, java.lang.String):java.lang.Object");
    }

    public C9891GkS(EnumC10075Gow enumC10075Gow, AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, InterfaceC9853Gix interfaceC9853Gix, String str, boolean z, boolean z2) {
        Object[] objArr;
        String str2;
        super(abstractC9870GjI, abstractC9870GjI2, interfaceC9853Gix, str, z);
        InterfaceC10017Gnp interfaceC10017Gnp = this._property;
        String str3 = this._typePropertyName;
        if (interfaceC10017Gnp == null) {
            objArr = new Object[]{str3};
            str2 = "missing type id property '%s'";
        } else {
            objArr = new Object[]{str3, interfaceC10017Gnp.getName()};
            str2 = "missing type id property '%s' (for POJO property '%s')";
        }
        this._msgForMissingId = String.format(str2, objArr);
        this._inclusion = enumC10075Gow;
        this._strictTypeIdHandling = z2;
    }
}
