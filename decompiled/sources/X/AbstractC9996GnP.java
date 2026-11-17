package X;

/* renamed from: X.GnP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9996GnP {
    public final C10091GpF A04(EnumC9834GiY enumC9834GiY, Object obj) {
        Integer num;
        Integer num2;
        C10091GpF c10091GpF = new C10091GpF();
        c10091GpF.A03 = obj;
        c10091GpF.A04 = null;
        c10091GpF.A00 = enumC9834GiY;
        int iOrdinal = A01().ordinal();
        if (iOrdinal == 4) {
            num = C79.A0K;
        } else if (iOrdinal == 3) {
            num = C79.A0P;
        } else {
            if (iOrdinal != 0) {
                if (iOrdinal == 2) {
                    num2 = C79.A00;
                } else {
                    if (iOrdinal != 1) {
                        throw BV4.A0c("Internal error: this code path should never get executed");
                    }
                    num2 = C79.A01;
                }
                c10091GpF.A02 = num2;
                return c10091GpF;
            }
            num = C79.A0C;
        }
        c10091GpF.A02 = num;
        c10091GpF.A05 = A06();
        return c10091GpF;
    }

    public final EnumC10075Gow A01() {
        if (this instanceof C10078Goz) {
            return ((C10078Goz) this).A00.A01();
        }
        if (this instanceof C10117Gpi) {
            return EnumC10075Gow.WRAPPER_OBJECT;
        }
        if (this instanceof C10108GpZ) {
            return EnumC10075Gow.EXTERNAL_PROPERTY;
        }
        if (!(this instanceof C10036GoF)) {
            C10118Gpj c10118Gpj = (C10118Gpj) this;
            if (!(c10118Gpj instanceof C10098GpM)) {
                return EnumC10075Gow.WRAPPER_ARRAY;
            }
            if (!(((C10098GpM) c10118Gpj) instanceof C10097GpL)) {
                return EnumC10075Gow.PROPERTY;
            }
        }
        return EnumC10075Gow.EXISTING_PROPERTY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (((X.C9913Gl1) r4).A0A != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C10091GpF A02(X.AbstractC9919GlE r4, X.C10091GpF r5) throws com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C10078Goz
            if (r0 == 0) goto L11
            X.Goz r3 = (X.C10078Goz) r3
            java.lang.Object r0 = r3.A01
            r5.A03 = r0
            X.GnP r0 = r3.A00
            X.GpF r5 = r0.A02(r4, r5)
        L10:
            return r5
        L11:
            X.Go2 r3 = (X.AbstractC10028Go2) r3
            boolean r0 = r3 instanceof X.C10036GoF
            if (r0 == 0) goto L35
            X.GiY r1 = r5.A00
            boolean r0 = r1._isStructStart
            if (r0 == 0) goto L5b
            boolean r0 = r4 instanceof X.C9913Gl1
            if (r0 == 0) goto L5d
            r0 = r4
            X.Gl1 r0 = (X.C9913Gl1) r0
            boolean r0 = r0.A0A
            if (r0 == 0) goto L5d
        L28:
            r0 = 0
            r5.A06 = r0
            X.GiY r0 = X.EnumC9834GiY.START_OBJECT
            if (r1 != r0) goto L51
            java.lang.Object r0 = r5.A03
            r4.A0m(r0)
            return r5
        L35:
            java.lang.Object r0 = r5.A04
            if (r0 != 0) goto L47
            java.lang.Object r2 = r5.A03
            java.lang.Class<?> r1 = r5.A01
            X.Gix r0 = r3.A01
            if (r1 != 0) goto L4c
            java.lang.String r0 = r0.ANQ(r2)
        L45:
            r5.A04 = r0
        L47:
            if (r0 != 0) goto L5d
            X.GiY r1 = r5.A00
            goto L28
        L4c:
            java.lang.String r0 = r0.ANR(r1, r2)
            goto L45
        L51:
            X.GiY r0 = X.EnumC9834GiY.START_ARRAY
            if (r1 != r0) goto L10
            java.lang.Object r0 = r5.A03
            r4.A0k(r0)
            return r5
        L5b:
            r5 = 0
            return r5
        L5d:
            r4.A0g(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9996GnP.A02(X.GlE, X.GpF):X.GpF");
    }

    public final C10091GpF A03(AbstractC9919GlE abstractC9919GlE, C10091GpF c10091GpF) {
        if (this instanceof C10078Goz) {
            return ((C10078Goz) this).A00.A03(abstractC9919GlE, c10091GpF);
        }
        if (((AbstractC10028Go2) this) instanceof C10036GoF) {
            if (c10091GpF == null) {
                return null;
            }
        } else if (c10091GpF == null) {
            throw BV4.A0a("valueShape");
        }
        abstractC9919GlE.A0h(c10091GpF);
        return c10091GpF;
    }

    public final AbstractC9996GnP A05(InterfaceC10017Gnp interfaceC10017Gnp) {
        if (this instanceof C10078Goz) {
            throw C8j3.A17();
        }
        if (this instanceof C10117Gpi) {
            AbstractC10028Go2 abstractC10028Go2 = (AbstractC10028Go2) this;
            return abstractC10028Go2.A00 != interfaceC10017Gnp ? new C10117Gpi(interfaceC10017Gnp, abstractC10028Go2.A01) : abstractC10028Go2;
        }
        if (this instanceof C10108GpZ) {
            C10108GpZ c10108GpZ = (C10108GpZ) this;
            return ((AbstractC10028Go2) c10108GpZ).A00 != interfaceC10017Gnp ? new C10108GpZ(interfaceC10017Gnp, c10108GpZ.A01, c10108GpZ.A00) : c10108GpZ;
        }
        if (this instanceof C10036GoF) {
            return this;
        }
        C10118Gpj c10118Gpj = (C10118Gpj) this;
        if (!(c10118Gpj instanceof C10098GpM)) {
            return c10118Gpj.A00 != interfaceC10017Gnp ? new C10118Gpj(interfaceC10017Gnp, c10118Gpj.A01) : c10118Gpj;
        }
        C10098GpM c10098GpM = (C10098GpM) c10118Gpj;
        boolean z = c10098GpM instanceof C10097GpL;
        InterfaceC10017Gnp interfaceC10017Gnp2 = ((AbstractC10028Go2) c10098GpM).A00;
        return z ? interfaceC10017Gnp2 != interfaceC10017Gnp ? new C10097GpL(interfaceC10017Gnp, c10098GpM.A01, c10098GpM.A00) : c10098GpM : interfaceC10017Gnp2 != interfaceC10017Gnp ? new C10098GpM(interfaceC10017Gnp, c10098GpM.A01, c10098GpM.A00) : c10098GpM;
    }

    public final String A06() {
        if (this instanceof C10078Goz) {
            return ((C10078Goz) this).A00.A06();
        }
        AbstractC10028Go2 abstractC10028Go2 = (AbstractC10028Go2) this;
        if (abstractC10028Go2 instanceof C10098GpM) {
            return ((C10098GpM) abstractC10028Go2).A00;
        }
        if (abstractC10028Go2 instanceof C10108GpZ) {
            return ((C10108GpZ) abstractC10028Go2).A00;
        }
        return null;
    }

    public static C10091GpF A00(AbstractC9919GlE abstractC9919GlE, EnumC9834GiY enumC9834GiY, AbstractC9996GnP abstractC9996GnP, Object obj) {
        return abstractC9996GnP.A02(abstractC9919GlE, abstractC9996GnP.A04(enumC9834GiY, obj));
    }
}
