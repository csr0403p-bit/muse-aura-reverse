package X;

import java.util.List;

/* renamed from: X.Fjf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8740Fjf implements InterfaceC8698Fiy, InterfaceC8793FkY {
    public C10447Hid A00;
    public final AbstractC8724FjP<Float, Float> A01;
    public final C8659FiK A02;

    @Override // X.InterfaceC8793FkY
    public final void AX2() {
        this.A02.invalidateSelf();
    }

    public C8740Fjf(C8659FiK c8659FiK, C8763Fk2 c8763Fk2, AbstractC8671FiX abstractC8671FiX) {
        this.A02 = c8659FiK;
        AbstractC8724FjP<Float, Float> abstractC8724FjPA7a = c8763Fk2.A00.A7a();
        this.A01 = abstractC8724FjPA7a;
        abstractC8671FiX.A07(abstractC8724FjPA7a);
        abstractC8724FjPA7a.A09(this);
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC8698Fiy
    public final void AdB(List<InterfaceC8698Fiy> list, List<InterfaceC8698Fiy> list2) {
    }
}
