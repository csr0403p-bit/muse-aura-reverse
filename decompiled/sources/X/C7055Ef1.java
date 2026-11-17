package X;

/* renamed from: X.Ef1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7055Ef1 implements InterfaceC7015EeM<C6988Edo> {
    public final InterfaceC7005EeA A00;
    public final DV5 A01;
    public final InterfaceC7015EeM<C6988Edo> A02;

    public C7055Ef1(InterfaceC7005EeA interfaceC7005EeA, DV5 dv5, InterfaceC7015EeM interfaceC7015EeM) {
        this.A00 = interfaceC7005EeA;
        this.A01 = dv5;
        this.A02 = interfaceC7015EeM;
    }

    @Override // X.InterfaceC7015EeM
    public final void AYc(InterfaceC7028EeZ<C6988Edo> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        boolean zA1Y = C60P.A1Y(interfaceC7028EeZ, interfaceC7029Eea);
        C7185Ehv c7185Ehv = (C7185Ehv) interfaceC7029Eea;
        if (c7185Ehv.A06.mValue >= EnumC7058Ef5.DISK_CACHE.mValue) {
            interfaceC7029Eea.AYq("disk", "nil-result_write");
            interfaceC7028EeZ.AUL(null, zA1Y ? 1 : 0);
        } else {
            if ((c7185Ehv.A07.A00 & 32) == 0) {
                interfaceC7028EeZ = new C7050Eew(this.A00, this.A01, interfaceC7028EeZ, interfaceC7029Eea);
            }
            this.A02.AYc(interfaceC7028EeZ, interfaceC7029Eea);
        }
    }
}
