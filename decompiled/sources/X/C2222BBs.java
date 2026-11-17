package X;

/* renamed from: X.BBs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2222BBs extends AbstractC2227BBx {
    public static final C2222BBs A00 = new C2222BBs(0, 0);

    public C2222BBs() {
        super(0, 0);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BCx;LX/Ahw<*>;LX/BBJ;LX/BCj;LX/BCT;)V */
    @Override // X.AbstractC2227BBx
    public final void A01(InterfaceC1370Ahw interfaceC1370Ahw, InterfaceC2238BCj interfaceC2238BCj, BBJ bbj, InterfaceC2252BCx interfaceC2252BCx, BCT bct) {
        if (bbj.A06 != 0) {
            BBL.A01("Cannot reset when inserting");
            throw F60.createAndThrow();
        }
        BBJ.A08(bbj);
        bbj.A00 = 0;
        bbj.A01 = (bbj.A0G.length / 5) - bbj.A04;
        bbj.A02 = 0;
        bbj.A03 = 0;
        bbj.A07 = 0;
    }
}
