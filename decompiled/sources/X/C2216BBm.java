package X;

/* renamed from: X.BBm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2216BBm extends AbstractC2227BBx {
    public static final C2216BBm A00 = new C2216BBm(1, 1);

    public C2216BBm() {
        super(1, 1);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BCx;LX/Ahw<*>;LX/BBJ;LX/BCj;LX/BCT;)V */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2227BBx
    public final void A01(InterfaceC1370Ahw interfaceC1370Ahw, InterfaceC2238BCj interfaceC2238BCj, BBJ bbj, InterfaceC2252BCx interfaceC2252BCx, BCT bct) {
        BCQ bcq = (BCQ) interfaceC2252BCx;
        BBe bBe = bcq.A03;
        Object obj = bBe.A05[bcq.A01];
        int i = bBe.A03[bcq.A00];
        if (obj instanceof InterfaceC1560Ala) {
            AlX alX = (AlX) interfaceC2238BCj;
            alX.A04.A0G(obj);
            alX.A02.A0B(obj);
        }
        Object objA0P = bbj.A0P(obj, bbj.A00, i);
        if (objA0P instanceof InterfaceC1560Ala) {
            interfaceC2238BCj.ABp((InterfaceC1560Ala) objA0P);
        } else if (objA0P instanceof BBb) {
            ((BBb) objA0P).A02();
        }
    }
}
