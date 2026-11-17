package X;

/* renamed from: X.BCb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2231BCb implements InterfaceC1559AlZ {
    public final BBM A00;

    @Override // X.InterfaceC1559AlZ
    public final void onAbandoned() {
        this.A00.A0a();
    }

    @Override // X.InterfaceC1559AlZ
    public final void onForgotten() {
        this.A00.A0a();
    }

    @Override // X.InterfaceC1559AlZ
    public final void onRemembered() {
    }

    public C2231BCb(BBM bbm) {
        this.A00 = bbm;
    }
}
