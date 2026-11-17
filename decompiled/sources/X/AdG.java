package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;

/* loaded from: classes4.dex */
public final class AdG implements InterfaceC1256Afs, C3Q0 {
    public final /* synthetic */ LazyListState A00;
    public final /* synthetic */ C3Q0 A01;

    public AdG(C3Q0 c3q0, LazyListState lazyListState) {
        this.A00 = lazyListState;
        this.A01 = c3q0;
    }

    @Override // X.InterfaceC1256Afs
    public final int A5i(int i, int i2) {
        C1160Acs c1160Acs;
        LazyListState lazyListState = this.A00;
        C2A9 c2a9A04 = lazyListState.A04();
        List<C1160Acs> list = ((C1161Act) c2a9A04).A0D;
        int iA00 = 0;
        if (list.isEmpty()) {
            return 0;
        }
        int iA02 = lazyListState.A02();
        if (i > AGw() || iA02 > i) {
            iA00 = (AbstractC1175Ade.A00(c2a9A04) * (i - lazyListState.A02())) - lazyListState.A03();
        } else {
            int size = list.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    c1160Acs = null;
                    break;
                }
                c1160Acs = list.get(i3);
                if (c1160Acs.A07 == i) {
                    break;
                }
                i3++;
            }
            C1160Acs c1160Acs2 = c1160Acs;
            if (c1160Acs2 != null) {
                iA00 = c1160Acs2.A02;
            }
        }
        return iA00 + i2;
    }

    @Override // X.InterfaceC1256Afs
    public final int AFi() {
        return this.A00.A02();
    }

    @Override // X.InterfaceC1256Afs
    public final int AFj() {
        return this.A00.A03();
    }

    @Override // X.InterfaceC1256Afs
    public final int AGw() {
        C16C c16c = (C16C) AbstractC0878AGe.A0I(AnonymousClass003.A0j(this.A00));
        if (c16c != null) {
            return ((C1160Acs) c16c).A07;
        }
        return 0;
    }

    @Override // X.C3Q0
    public final float AcG(float f) {
        return this.A01.AcG(f);
    }

    @Override // X.InterfaceC1256Afs
    public final void Afq(int i, int i2) {
        this.A00.A08(i, i2, true);
    }

    @Override // X.InterfaceC1256Afs
    public final int getItemCount() {
        return ((C1161Act) this.A00.A04()).A05;
    }
}
