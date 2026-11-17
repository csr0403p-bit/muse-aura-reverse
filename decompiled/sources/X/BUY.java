package X;

import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.R;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUY extends AbstractC7559F3s implements G0W {
    public final int $t;
    public final Object A00;

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        BFM bfm;
        int i;
        String strA01;
        C07509Wi c07509Wi;
        long j;
        switch (this.$t) {
            case 0:
                AZE azeAQW = ((C3TG) obj2).AQW(((Constraints) obj3).A00);
                return AXY.A01((AXY) obj, new C2334BUi(0, azeAQW, this.A00), azeAQW.A01, azeAQW.A00);
            case 1:
                InterfaceC1009APa interfaceC1009APa = (InterfaceC1009APa) obj;
                BFM bfmA0P = AnonymousClass005.A0P(obj2, obj3);
                Object objAaT = bfmA0P.AaT();
                Object obj4 = C78N.A00;
                C3UX c3ux = (C3UX) AnonymousClass004.A15(bfmA0P, objAaT, obj4);
                Object objAaT2 = bfmA0P.AaT();
                if (objAaT2 == obj4) {
                    objAaT2 = new APZ(interfaceC1009APa, c3ux);
                    BBI.A0T(bfmA0P, objAaT2);
                }
                APZ apz = (APZ) objAaT2;
                AnonymousClass001.A1F(apz, new AQR(apz), bfmA0P, (G2j) this.A00, 6);
                return Unit.INSTANCE;
            case 2:
                AXY axy = (AXY) obj;
                C3TG c3tg = (C3TG) obj2;
                long j2 = ((Constraints) obj3).A00;
                AnonymousClass003.A0u(axy, c3tg);
                int iAGd = ((C00r) this.A00).AGd();
                int iA02 = Constraints.A02(j2);
                int iA00 = Constraints.A00(j2);
                AZE azeAQW2 = c3tg.AQW(Constraints.A05(Constraints.A03(j2), Constraints.A01(j2), ATD.A04(iAGd, iA02, iA00), iA00));
                return AXY.A01(axy, new C2326BUa(azeAQW2, 19), azeAQW2.A01, azeAQW2.A00);
            case 3:
                bfm = (BFM) obj2;
                int iA0F = AnonymousClass001.A0F(obj3);
                if (AnonymousClass001.A1b(AnonymousClass004.A1G(iA0F), bfm, iA0F)) {
                    AbstractC07499Wh.A03(bfm, (C07509Wi) this.A00, 0);
                } else {
                    bfm.Afo();
                }
                return Unit.INSTANCE;
            case 4:
                bfm = (BFM) obj2;
                int iA0F2 = AnonymousClass001.A0F(obj3);
                i = 0;
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F2 & 17, 16), bfm, iA0F2)) {
                    strA01 = AbstractC2271BQs.A01(bfm, R.string.place_actions_website);
                    c07509Wi = (C07509Wi) this.A00;
                    j = c07509Wi.A05;
                    AbstractC07499Wh.A02(bfm, null, c07509Wi, strA01, i, 8, j);
                    return Unit.INSTANCE;
                }
                bfm.Afo();
                return Unit.INSTANCE;
            default:
                bfm = (BFM) obj2;
                int iA0F3 = AnonymousClass001.A0F(obj3);
                i = 0;
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F3 & 17, 16), bfm, iA0F3)) {
                    strA01 = AbstractC2271BQs.A01(bfm, R.string.place_actions_directions);
                    c07509Wi = (C07509Wi) this.A00;
                    j = c07509Wi.A07;
                    AbstractC07499Wh.A02(bfm, null, c07509Wi, strA01, i, 8, j);
                    return Unit.INSTANCE;
                }
                bfm.Afo();
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BUY(Object obj, int i) {
        super(3);
        this.$t = i;
        this.A00 = obj;
    }
}
