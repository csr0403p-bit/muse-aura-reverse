package X;

/* renamed from: X.EeP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7018EeP implements InterfaceC7015EeM<C6988Edo> {
    public final C6524EBy A00;
    public final C7011EeI A01;
    public final AbstractC6692EUz A02;

    @Override // X.InterfaceC7015EeM
    public final void AYc(InterfaceC7028EeZ<C6988Edo> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        ((C7185Ehv) interfaceC7029Eea).A05.AV6(interfaceC7029Eea, "NetworkFetchProducer");
        AbstractC6692EUz abstractC6692EUz = this.A02;
        EUt eUtCreateFetchState = abstractC6692EUz.createFetchState(interfaceC7028EeZ, interfaceC7029Eea);
        abstractC6692EUz.fetch(eUtCreateFetchState, new C7019EeQ(eUtCreateFetchState, this));
    }

    public C7018EeP(C6524EBy c6524EBy, C7011EeI c7011EeI, AbstractC6692EUz abstractC6692EUz) {
        this.A01 = c7011EeI;
        this.A00 = c6524EBy;
        this.A02 = abstractC6692EUz;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Edk;ILX/EUs;LX/EeZ<LX/Edo;>;LX/Eea;Ljava/lang/String;)V */
    public static void A00(EUs eUs, C6984Edk c6984Edk, InterfaceC7028EeZ interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea, String str, int i) throws Throwable {
        C6988Edo c6988Edo;
        EfF efFA00 = EfF.A00(c6984Edk.A00());
        try {
            c6988Edo = new C6988Edo(efFA00);
        } catch (Throwable th) {
            th = th;
        }
        try {
            c6988Edo.A08 = eUs;
            c6988Edo.putExtra("smart_query", str);
            C6988Edo.A02(c6988Edo);
            InterfaceC7060Ef7.A00(interfaceC7029Eea, "encoded_size", c6988Edo.A06());
            C6988Edo.A03(c6988Edo);
            InterfaceC7060Ef7.A00(interfaceC7029Eea, "encoded_width", c6988Edo.A05);
            C6988Edo.A03(c6988Edo);
            InterfaceC7060Ef7.A00(interfaceC7029Eea, "encoded_height", c6988Edo.A01);
            interfaceC7029Eea.putExtra("smart_query", str);
            interfaceC7028EeZ.AUL(c6988Edo, i);
            c6988Edo.close();
            efFA00.close();
        } catch (Throwable th2) {
            th = th2;
            c6988Edo.close();
            efFA00.close();
            throw th;
        }
    }
}
