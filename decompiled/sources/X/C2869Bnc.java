package X;

/* renamed from: X.Bnc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2869Bnc implements BpR<AbstractC2866BnZ<InterfaceC2873Bng>, InterfaceC2873Bng> {
    @Override // X.BpR
    public final /* bridge */ /* synthetic */ InterfaceC2873Bng apply(AbstractC2866BnZ<InterfaceC2873Bng> abstractC2866BnZ) {
        BnX bnX = (BnX) abstractC2866BnZ;
        InterfaceC2873Bng interfaceC2873Bng = (InterfaceC2873Bng) bnX.A07;
        InterfaceC2886Bnt interfaceC2886BntAGK = interfaceC2873Bng.AGK();
        BhZ bhZALU = interfaceC2886BntAGK.ALU();
        long timestamp = interfaceC2886BntAGK.getTimestamp();
        C2872Bnf c2872Bnf = new C2872Bnf(bnX.A04, new C2871Bne(bnX.A02, bhZALU, bnX.A01, timestamp), interfaceC2873Bng);
        c2872Bnf.A01(bnX.A03);
        return c2872Bnf;
    }
}
