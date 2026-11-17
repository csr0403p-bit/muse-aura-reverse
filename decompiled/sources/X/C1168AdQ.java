package X;

import androidx.compose.foundation.pager.PagerState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* renamed from: X.AdQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1168AdQ implements InterfaceC1129Abd {
    public final AdZ<C1179Adi> A00;
    public final C8s0 A01 = C8s0.A00;
    public final Ae1 A02;
    public final PagerState A03;

    @Override // X.InterfaceC1129Abd
    public final /* synthetic */ Object AE6(int i) {
        return null;
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
        return (i2 < 0 || i2 >= objArr.length || (obj = objArr[i2]) == null) ? this.A00.A01(i) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1168AdQ) {
            return C7384Etj.areEqual(this.A00, ((C1168AdQ) obj).A00);
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

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/pager/PagerState;LX/AdZ<LX/Adi;>;LX/Ae1;)V */
    public C1168AdQ(AdZ adZ, Ae1 ae1, PagerState pagerState) {
        this.A03 = pagerState;
        this.A00 = adZ;
        this.A02 = ae1;
    }

    @Override // X.InterfaceC1129Abd
    public final void A2d(BFM bfm, Object obj, int i, int i2) {
        bfm.AgG(-1201380429);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, obj);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0D), bfm, iA0D)) {
            Aej.A00(this.A03.A0I, bfm, obj, B1V.A00(bfm, new BT2(this, i, 4), 1142237095), i, ((iA0D >> 3) & 14) | 3072 | ((iA0D << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTI(this, i, obj, i2, 2);
        }
    }
}
