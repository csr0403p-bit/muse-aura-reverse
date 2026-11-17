package X;

/* renamed from: X.AmA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1585AmA implements InterfaceC1657Ang {
    public final Am2 A00;

    public C1585AmA(Am2 am2) {
        this.A00 = am2;
        if (am2.A01) {
            return;
        }
        if (am2.A00) {
            throw C3cG.A0Q("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        Am2.A00(am2);
        am2.A00 = true;
    }

    public C1585AmA() {
        this(new Am2());
    }
}
