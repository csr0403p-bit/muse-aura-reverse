package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* loaded from: classes4.dex */
public final class AdP implements Ae3 {
    public final C1167AdO A00;
    public final Ae1 A01;
    public final LazyGridState A02;

    @Override // X.InterfaceC1129Abd
    public final Object AE6(int i) {
        C1181Adk<C1173Adc> c1181AdkABv = this.A00.A00().ABv(i);
        return C8j4.A0r(c1181AdkABv.A02.AMA(), i - c1181AdkABv.A01);
    }

    @Override // X.InterfaceC1129Abd
    public final int AGP(Object obj) {
        return this.A01.AGP(obj);
    }

    @Override // X.InterfaceC1129Abd
    public final Object AGm(int i) {
        Object obj;
        C1171Ada c1171Ada = (C1171Ada) this.A01;
        Object[] objArr = c1171Ada.A01;
        int i2 = i - c1171Ada.A00;
        return (i2 < 0 || i2 >= objArr.length || (obj = objArr[i2]) == null) ? this.A00.A01(i) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdP) {
            return C7384Etj.areEqual(this.A00, ((AdP) obj).A00);
        }
        return false;
    }

    @Override // X.InterfaceC1129Abd
    public final int getItemCount() {
        return ((C1170AdV) this.A00.A00()).A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public AdP(C1167AdO c1167AdO, LazyGridState lazyGridState, Ae1 ae1) {
        this.A02 = lazyGridState;
        this.A00 = c1167AdO;
        this.A01 = ae1;
    }

    @Override // X.InterfaceC1129Abd
    public final void A2d(BFM bfm, Object obj, int i, int i2) {
        bfm.AgG(1493551140);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, obj);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0D), bfm, iA0D)) {
            Aej.A00(this.A02.A0D, bfm, obj, B1V.A00(bfm, new BT2(this, i, 2), 726189336), i, ((iA0D >> 3) & 14) | 3072 | ((iA0D << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTI(this, i, obj, i2, 1);
        }
    }
}
