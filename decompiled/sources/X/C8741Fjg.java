package X;

/* renamed from: X.Fjg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8741Fjg implements InterfaceC8696Fiw {
    public final C8688Fio A00;
    public final String A01;
    public final boolean A02;
    public final int A03;

    @Override // X.InterfaceC8696Fiw
    public final InterfaceC8698Fiy Agv(C6837Eap c6837Eap, C8659FiK c8659FiK, AbstractC8671FiX abstractC8671FiX) {
        return new C8708Fj9(c8659FiK, this, abstractC8671FiX);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ShapePath{name=");
        sbA0x.append(this.A01);
        sbA0x.append(", index=");
        sbA0x.append(this.A03);
        return C8j3.A15(sbA0x);
    }

    public C8741Fjg(C8688Fio c8688Fio, String str, int i, boolean z) {
        this.A01 = str;
        this.A03 = i;
        this.A00 = c8688Fio;
        this.A02 = z;
    }
}
