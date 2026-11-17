package X;

/* renamed from: X.BBp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2219BBp extends AbstractC2227BBx {
    public static final C2219BBp A00 = new C2219BBp(1, 1);

    public C2219BBp() {
        super(1, 1);
    }

    @Override // X.AbstractC2227BBx
    public final BCR A00(InterfaceC2252BCx interfaceC2252BCx) {
        BCQ bcq = (BCQ) interfaceC2252BCx;
        return (BCR) bcq.A03.A05[bcq.A01];
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BCx;LX/Ahw<*>;LX/BBJ;LX/BCj;LX/BCT;)V */
    @Override // X.AbstractC2227BBx
    public final void A01(InterfaceC1370Ahw interfaceC1370Ahw, InterfaceC2238BCj interfaceC2238BCj, BBJ bbj, InterfaceC2252BCx interfaceC2252BCx, BCT bct) {
        BCQ bcq = (BCQ) interfaceC2252BCx;
        BBe bBe = bcq.A03;
        BCR bcr = (BCR) bBe.A05[bcq.A01];
        int i = bBe.A03[bcq.A00];
        interfaceC1370Ahw.Ahp();
        interfaceC1370Ahw.ANj(i, bbj.A0O(bbj.A0L(bcr)));
    }
}
