package X;

/* renamed from: X.BBn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2217BBn extends AbstractC2227BBx {
    public static final C2217BBn A00 = new C2217BBn();

    public C2217BBn() {
        super(0, 2);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BCx;LX/Ahw<*>;LX/BBJ;LX/BCj;LX/BCT;)V */
    @Override // X.AbstractC2227BBx
    public final void A01(InterfaceC1370Ahw interfaceC1370Ahw, InterfaceC2238BCj interfaceC2238BCj, BBJ bbj, InterfaceC2252BCx interfaceC2252BCx, BCT bct) {
        BCQ bcq = (BCQ) interfaceC2252BCx;
        Object[] objArr = bcq.A03.A05;
        int i = bcq.A01;
        B8p b8p = (B8p) objArr[i + 1];
        int i2 = b8p != null ? b8p.A00 : 0;
        C2232BCc c2232BCc = (C2232BCc) objArr[i];
        if (i2 > 0) {
            interfaceC1370Ahw = new C1372Ahy(interfaceC1370Ahw, i2);
        }
        c2232BCc.A00.A01(interfaceC1370Ahw, interfaceC2238BCj, bbj, bct != null ? new C2226BBw(bbj, bct) : null);
    }
}
