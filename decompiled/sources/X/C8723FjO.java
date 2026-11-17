package X;

import java.util.List;

/* renamed from: X.FjO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8723FjO implements InterfaceC8698Fiy, InterfaceC8793FkY {
    public final AbstractC8724FjP<?, Float> A00;
    public final AbstractC8724FjP<?, Float> A01;
    public final AbstractC8724FjP<?, Float> A02;
    public final Integer A03;
    public final List<InterfaceC8793FkY> A04 = C3cG.A0h();
    public final boolean A05;

    @Override // X.InterfaceC8793FkY
    public final void AX2() {
        int i = 0;
        while (true) {
            List<InterfaceC8793FkY> list = this.A04;
            if (i >= list.size()) {
                return;
            }
            list.get(i).AX2();
            i++;
        }
    }

    public C8723FjO(C8736Fjb c8736Fjb, AbstractC8671FiX abstractC8671FiX) {
        this.A05 = c8736Fjb.A04;
        this.A03 = c8736Fjb.A03;
        C8720FjL c8720FjLA01 = C8720FjL.A01(c8736Fjb.A02);
        this.A02 = c8720FjLA01;
        C8720FjL c8720FjLA012 = C8720FjL.A01(c8736Fjb.A00);
        this.A00 = c8720FjLA012;
        C8720FjL c8720FjLA013 = C8720FjL.A01(c8736Fjb.A01);
        this.A01 = c8720FjLA013;
        abstractC8671FiX.A07(c8720FjLA01);
        abstractC8671FiX.A07(c8720FjLA012);
        abstractC8671FiX.A07(c8720FjLA013);
        c8720FjLA01.A09(this);
        c8720FjLA012.A09(this);
        c8720FjLA013.A09(this);
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC8698Fiy
    public final void AdB(List<InterfaceC8698Fiy> list, List<InterfaceC8698Fiy> list2) {
    }
}
