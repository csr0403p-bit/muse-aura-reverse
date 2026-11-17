package X;

/* renamed from: X.Fjb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8736Fjb implements InterfaceC8696Fiw {
    public final C8689Fip A00;
    public final C8689Fip A01;
    public final C8689Fip A02;
    public final Integer A03;
    public final boolean A04;

    @Override // X.InterfaceC8696Fiw
    public final InterfaceC8698Fiy Agv(C6837Eap c6837Eap, C8659FiK c8659FiK, AbstractC8671FiX abstractC8671FiX) {
        return new C8723FjO(this, abstractC8671FiX);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Trim Path: {start: ");
        sbA0x.append(this.A02);
        sbA0x.append(", end: ");
        sbA0x.append(this.A00);
        sbA0x.append(", offset: ");
        return BV8.A0v(this.A01, sbA0x);
    }

    public C8736Fjb(C8689Fip c8689Fip, C8689Fip c8689Fip2, C8689Fip c8689Fip3, Integer num, boolean z) {
        this.A03 = num;
        this.A02 = c8689Fip;
        this.A00 = c8689Fip2;
        this.A01 = c8689Fip3;
        this.A04 = z;
    }
}
