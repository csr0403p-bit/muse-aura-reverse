package X;

/* renamed from: X.AmF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1588AmF implements InterfaceC1601AmT {
    public final String A04;
    public C1589AmG A02 = new C1589AmG(null);
    public AmE A01 = new AmE(null);
    public C1589AmG A03 = new C1589AmG(null);
    public AmE A00 = new AmE(null);

    @Override // X.InterfaceC1601AmT
    public final AmE ACz() {
        return this.A00;
    }

    @Override // X.InterfaceC1601AmT
    public final C1589AmG AH2() {
        return this.A02;
    }

    @Override // X.InterfaceC1601AmT
    public final C1589AmG AJp() {
        return this.A03;
    }

    @Override // X.InterfaceC1601AmT
    public final AmE ALo() {
        return this.A01;
    }

    public final String toString() {
        String str = this.A04;
        return str != null ? C8j4.A0x("RectRulers(", str) : super.toString();
    }

    public C1588AmF(String str) {
        this.A04 = str;
    }
}
