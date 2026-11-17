package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableState;
import java.util.List;

/* loaded from: classes4.dex */
public final class Ad6 implements InterfaceC1256Afs, C3Q0 {
    public final /* synthetic */ LazyGridState A00;
    public final /* synthetic */ C3Q0 A01;

    public Ad6(C3Q0 c3q0, LazyGridState lazyGridState) {
        this.A00 = lazyGridState;
        this.A01 = c3q0;
    }

    @Override // X.InterfaceC1256Afs
    public final int A5i(int i, int i2) {
        Ad0 ad0;
        int iA0G;
        MutableState<Ad2> mutableState = this.A00.A0I;
        Ad2 value = mutableState.getValue();
        Ad2 ad2 = value;
        List<Ad0> list = ad2.A0D;
        if (list.isEmpty()) {
            return 0;
        }
        int iAFi = AFi();
        if (i > AGw() || iAFi > i) {
            int i3 = mutableState.getValue().A05;
            iA00 = (AdK.A00(value) * (((i - AFi()) + ((i3 - 1) * ((i < AFi() ? 1 : 0) != 0 ? -1 : 1))) / i3)) - AFj();
        } else {
            int size = list.size();
            int i4 = 0;
            while (true) {
                ad0 = null;
                if (i4 >= size) {
                    break;
                }
                ad0 = list.get(i4);
                if (ad0.A08 == i) {
                    break;
                }
                i4++;
            }
            Ad0 ad02 = ad0;
            if (ad2.A09 == EnumC1108AYu.A03) {
                if (ad02 != null) {
                    iA0G = AnonymousClass002.A09(ad02.A04);
                    iA00 = Integer.valueOf(iA0G).intValue();
                }
            } else if (ad02 != null) {
                iA0G = C8j3.A0G(ad02.A04);
                iA00 = Integer.valueOf(iA0G).intValue();
            }
        }
        return iA00 + i2;
    }

    @Override // X.InterfaceC1256Afs
    public final int AFi() {
        return this.A00.A09.A03.AGd();
    }

    @Override // X.InterfaceC1256Afs
    public final int AFj() {
        return this.A00.A09.A04.AGd();
    }

    @Override // X.InterfaceC1256Afs
    public final int AGw() {
        Ae6 ae6 = (Ae6) AbstractC0878AGe.A0I(C8j4.A0U(this.A00.A0I).A0D);
        if (ae6 != null) {
            return ((Ad0) ae6).A08;
        }
        return 0;
    }

    @Override // X.C3Q0
    public final float AcG(float f) {
        return this.A01.AcG(f);
    }

    @Override // X.InterfaceC1256Afs
    public final void Afq(int i, int i2) {
        this.A00.A03(i, i2, true);
    }

    @Override // X.InterfaceC1256Afs
    public final int getItemCount() {
        return C8j4.A0U(this.A00.A0I).A06;
    }
}
