package X;

/* renamed from: X.BBg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2211BBg extends AbstractC2227BBx {
    public static final C2211BBg A00 = new C2211BBg();

    public C2211BBg() {
        super(0, 3);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BCx;LX/Ahw<*>;LX/BBJ;LX/BCj;LX/BCT;)V */
    @Override // X.AbstractC2227BBx
    public final void A01(InterfaceC1370Ahw interfaceC1370Ahw, InterfaceC2238BCj interfaceC2238BCj, BBJ bbj, InterfaceC2252BCx interfaceC2252BCx, BCT bct) {
        C2226BBw c2226BBw;
        BCQ bcq = (BCQ) interfaceC2252BCx;
        Object[] objArr = bcq.A03.A05;
        int i = bcq.A01;
        BBW bbw = (BBW) objArr[i + 1];
        BCR bcr = (BCR) objArr[i];
        BCW bcw = (BCW) objArr[i + 2];
        BBJ bbjA02 = bbw.A02();
        if (bct != null) {
            try {
                c2226BBw = new C2226BBw(bbj, bct);
            } catch (Throwable th) {
                bbjA02.A0c(false);
                throw th;
            }
        } else {
            c2226BBw = null;
        }
        if (bcw.A01.A02 != 0) {
            BBL.A01("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            throw F60.createAndThrow();
        }
        bcw.A00.A01(interfaceC1370Ahw, interfaceC2238BCj, bbjA02, c2226BBw);
        bbjA02.A0c(true);
        bbj.A0Q();
        bbj.A0Z(bbw, bbw.A00(bcr));
        bbj.A0S();
    }
}
