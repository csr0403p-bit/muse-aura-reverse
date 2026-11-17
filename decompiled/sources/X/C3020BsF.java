package X;

import java.util.Map;

/* renamed from: X.BsF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3020BsF extends C3021BsG {
    public int A00 = -1;
    public int A01 = -1;
    public final C2693Bht A02;
    public final C2693Bht A03;

    public C3020BsF(C2693Bht c2693Bht, C2693Bht c2693Bht2) {
        this.A02 = c2693Bht;
        this.A03 = c2693Bht2;
    }

    @Override // X.C3021BsG
    public final AbstractC3049Bsu A03(C2507Bcd c2507Bcd, Map<EnumC2460Bbn, InterfaceC3048Bss> map) {
        AbstractC3049Bsu abstractC3049BsuA03 = super.A03(c2507Bcd, map);
        this.A00 = AbstractC3025BsK.A00();
        this.A01 = AbstractC3025BsK.A00();
        return abstractC3049BsuA03;
    }

    @Override // X.C3021BsG
    public final void A04() {
        super.A04();
        this.A00 = -1;
        this.A01 = -1;
    }
}
