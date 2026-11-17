package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.BBl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2215BBl extends AbstractC2227BBx {
    public static final C2215BBl A00 = new C2215BBl();

    public C2215BBl() {
        super(1, 2);
    }

    @Override // X.AbstractC2227BBx
    public final BCR A00(InterfaceC2252BCx interfaceC2252BCx) {
        BCQ bcq = (BCQ) interfaceC2252BCx;
        return (BCR) bcq.A03.A05[bcq.A01 + 1];
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BCx;LX/Ahw<*>;LX/BBJ;LX/BCj;LX/BCT;)V */
    @Override // X.AbstractC2227BBx
    public final void A01(InterfaceC1370Ahw interfaceC1370Ahw, InterfaceC2238BCj interfaceC2238BCj, BBJ bbj, InterfaceC2252BCx interfaceC2252BCx, BCT bct) {
        BCQ bcq = (BCQ) interfaceC2252BCx;
        BBe bBe = bcq.A03;
        Object objInvoke = ((Function0) bBe.A05[bcq.A01]).invoke();
        BCR bcr = (BCR) bBe.A05[bcq.A01 + 1];
        int i = bBe.A03[bcq.A00];
        C7384Etj.A0Z(interfaceC1370Ahw, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        BBJ.A0H(bbj, objInvoke, bbj.A0L(bcr));
        interfaceC1370Ahw.ANm(i, objInvoke);
        interfaceC1370Ahw.A9B(objInvoke);
    }
}
