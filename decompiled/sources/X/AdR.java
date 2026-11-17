package X;

import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* loaded from: classes4.dex */
public final class AdR implements Ae2 {
    public final C0AU A00;
    public final AdS A01;
    public final Ae1 A02;
    public final LazyListState A03;

    @Override // X.InterfaceC1129Abd
    public final Object AE6(int i) {
        C1181Adk<C1178Adh> c1181AdkABv = this.A01.A00().ABv(i);
        return C8j4.A0r(c1181AdkABv.A02.AMA(), i - c1181AdkABv.A01);
    }

    @Override // X.InterfaceC1129Abd
    public final int AGP(Object obj) {
        return this.A02.AGP(obj);
    }

    @Override // X.InterfaceC1129Abd
    public final Object AGm(int i) {
        Object obj;
        C1171Ada c1171Ada = (C1171Ada) this.A02;
        Object[] objArr = c1171Ada.A01;
        int i2 = i - c1171Ada.A00;
        return (i2 < 0 || i2 >= objArr.length || (obj = objArr[i2]) == null) ? this.A01.A01(i) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdR) {
            return C7384Etj.areEqual(this.A01, ((AdR) obj).A01);
        }
        return false;
    }

    @Override // X.InterfaceC1129Abd
    public final int getItemCount() {
        return ((C1170AdV) this.A01.A00()).A00;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public AdR(C0AU c0au, AdS adS, LazyListState lazyListState, Ae1 ae1) {
        this.A03 = lazyListState;
        this.A01 = adS;
        this.A00 = c0au;
        this.A02 = ae1;
    }

    @Override // X.InterfaceC1129Abd
    public final void A2d(BFM bfm, Object obj, int i, int i2) {
        bfm.AgG(-462424778);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, obj);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0D), bfm, iA0D)) {
            Aej.A00(this.A03.A0F, bfm, obj, B1V.A00(bfm, new BT2(this, i, 1), -824725566), i, ((iA0D >> 3) & 14) | 3072 | ((iA0D << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTI(this, i, obj, i2, 0);
        }
    }
}
