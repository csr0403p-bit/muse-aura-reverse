package X;

/* loaded from: classes6.dex */
public final class GGR<T> implements InterfaceC9366GGc<T> {
    public final GHF<?> A00;
    public final GH2 A01;
    public final GGX<?, ?> A02;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC9366GGc
    public final boolean AAo(T t, T t2) {
        return C8j3.A1S(((AbstractC9339GEw) t).unknownFields.equals(((AbstractC9339GEw) t2).unknownFields) ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC9366GGc
    public final int AKR(T t) {
        GGN ggn = ((AbstractC9339GEw) t).unknownFields;
        int iA03 = ggn.A01;
        if (iA03 == -1) {
            iA03 = 0;
            for (int i = 0; i < ggn.A00; i++) {
                int i2 = ggn.A03[i] >>> 3;
                AbstractC9309GDl abstractC9309GDl = (AbstractC9309GDl) ggn.A04[i];
                int iA032 = 2 + GGI.A03(i2) + 1;
                int iA06 = GHG.A06(3);
                int iA01 = abstractC9309GDl.A01();
                iA03 += iA032 + iA06 + GGI.A03(iA01) + iA01;
            }
            ggn.A01 = iA03;
        }
        return iA03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC9366GGc
    public final int ANL(T t) {
        return ((AbstractC9339GEw) t).unknownFields.hashCode();
    }

    @Override // X.InterfaceC9366GGc
    public final boolean AOY(T t) {
        throw BV4.A0a("extensions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC9366GGc
    public final void AQ3(T t) {
        ((AbstractC9339GEw) t).unknownFields.A02 = false;
        throw BV4.A0a("extensions");
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GGf;LX/HyE;)V */
    @Override // X.InterfaceC9366GGc
    public final void AQc(HyE hyE, InterfaceC9369GGf interfaceC9369GGf, Object obj) {
        AbstractC9339GEw abstractC9339GEw = (AbstractC9339GEw) obj;
        if (abstractC9339GEw.unknownFields == GGN.A05) {
            abstractC9339GEw.unknownFields = new GGN();
        }
        throw BV4.A0a("ensureExtensionsAreMutable");
    }

    @Override // X.InterfaceC9366GGc
    public final T ARC() {
        return (T) GGW.A00((GGW) ((AbstractC9339GEw) this.A01).A04(C79.A0P));
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GGq;)V */
    @Override // X.InterfaceC9366GGc
    public final void Aj3(InterfaceC9378GGq interfaceC9378GGq, Object obj) {
        throw BV4.A0a("extensions");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GGX<**>;LX/GHF<*>;LX/GH2;)V */
    public GGR(GHF ghf, GH2 gh2, GGX ggx) {
        this.A02 = ggx;
        this.A00 = ghf;
        this.A01 = gh2;
    }

    @Override // X.InterfaceC9366GGc
    public final void AQb(T t, T t2) {
        GGM.A0P(t, t2);
    }
}
