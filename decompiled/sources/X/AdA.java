package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* loaded from: classes4.dex */
public final class AdA extends AbstractC1164Acx<Ad0> {
    public final int A00;
    public final Ae3 A01;
    public final InterfaceC1126Aba A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ LazyGridState A06;
    public final /* synthetic */ InterfaceC1126Aba A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public AdA(Ae3 ae3, LazyGridState lazyGridState, InterfaceC1126Aba interfaceC1126Aba, int i, int i2, int i3, long j, boolean z, boolean z2) {
        this.A07 = interfaceC1126Aba;
        this.A06 = lazyGridState;
        this.A08 = z;
        this.A09 = z2;
        this.A04 = i2;
        this.A03 = i3;
        this.A05 = j;
        this.A01 = ae3;
        this.A02 = interfaceC1126Aba;
        this.A00 = i;
    }

    public final Ad0 A02(int i, int i2, int i3, int i4, long j) {
        int iA02;
        Ae3 ae3 = this.A01;
        Object objAGm = ae3.AGm(i);
        Object objAE6 = ae3.AE6(i);
        List<AZE> listA01 = A01(this.A02, i, j);
        if (Constraints.A0C(j)) {
            iA02 = Constraints.A03(j);
        } else {
            if (!Constraints.A0B(j)) {
                AbstractC1061ATk.A00("does not have fixed height");
                throw F60.createAndThrow();
            }
            iA02 = Constraints.A02(j);
        }
        EnumC1820Arj layoutDirection = this.A07.getLayoutDirection();
        return new Ad0(this.A06.A0C, layoutDirection, objAGm, objAE6, listA01, i, iA02, i4, this.A04, this.A03, i2, i3, this.A05, j, this.A08, this.A09);
    }
}
