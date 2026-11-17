package X;

import java.util.List;

/* renamed from: X.AnB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1636AnB extends AbstractC8493Ff0 {
    public final /* synthetic */ C1634An9 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1636AnB(C1634An9 c1634An9) {
        super(1);
        this.A00 = c1634An9;
    }

    @Override // X.AbstractC8493Ff0
    public final C8492Fez A03(C8492Fez c8492Fez, C8490Fex c8490Fex) {
        Ai8 ai8 = this.A00.A0J.A0f.A07;
        if (AZE.A03(ai8)) {
            long jA00 = AbstractC1017AQa.A00(ai8.APo(0L));
            int i = (int) (jA00 >> 32);
            if (i < 0) {
                i = 0;
            }
            int iA09 = AnonymousClass002.A09(jA00);
            if (iA09 < 0) {
                iA09 = 0;
            }
            long jAKd = AbstractC1496Ak3.A01(ai8).AKd();
            int i2 = (int) (jAKd & 4294967295L);
            long j = ((AZE) ai8).A03;
            long jA002 = AbstractC1017AQa.A00(ai8.APo(C8j5.A09((int) (j >> 32), (int) (j & 4294967295L))));
            int i3 = ((int) (jAKd >> 32)) - ((int) (jA002 >> 32));
            if (i3 < 0) {
                i3 = 0;
            }
            int iA092 = i2 - AnonymousClass002.A09(jA002);
            int i4 = iA092 >= 0 ? iA092 : 0;
            if (i != 0 || iA09 != 0 || i3 != 0 || i4 != 0) {
                C8345FcJ c8345FcJ = c8492Fez.A00;
                int i5 = c8345FcJ.A01 - i;
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = c8345FcJ.A03 - iA09;
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = c8345FcJ.A02 - i3;
                if (i7 < 0) {
                    i7 = 0;
                }
                int i8 = c8345FcJ.A00 - i4;
                C8345FcJ c8345FcJA00 = C8345FcJ.A00(i5, i6, i7, i8 >= 0 ? i8 : 0);
                C8345FcJ c8345FcJ2 = c8492Fez.A01;
                int i9 = c8345FcJ2.A01 - i;
                if (i9 < 0) {
                    i9 = 0;
                }
                int i10 = c8345FcJ2.A03 - iA09;
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = c8345FcJ2.A02 - i3;
                if (i11 < 0) {
                    i11 = 0;
                }
                int i12 = c8345FcJ2.A00 - i4;
                return new C8492Fez(c8345FcJA00, C8345FcJ.A00(i9, i10, i11, i12 >= 0 ? i12 : 0));
            }
        }
        return c8492Fez;
    }

    @Override // X.AbstractC8493Ff0
    public final C8497Ff4 A04(C8497Ff4 c8497Ff4, List<C8490Fex> list) {
        return C1634An9.A03(this.A00, c8497Ff4);
    }
}
