package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AG9 implements BN2 {
    public static final AFs<AG9, ?> A04 = C0872AFu.A01(C2282BSi.A00(11), 34);
    public AFx A00;
    public final C0918AHu<Object, AFx> A01;
    public final Map<Object, Map<String, List<Object>>> A02;
    public final G0U<Object, Boolean> A03;

    @Override // X.BN2
    public final void Aay(Object obj) {
        if (this.A01.A0B(obj) == null) {
            this.A02.remove(obj);
        }
    }

    public AG9(Map<Object, Map<String, List<Object>>> map) {
        this.A02 = map;
        this.A01 = C0918AHu.A02();
        this.A03 = C2297BSx.A00(this, 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BN2
    public final void A2e(Object obj, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(533563200);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, obj) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            bfm.AgH(207, obj);
            Object objAaT = bfm.AaT();
            Object obj2 = C78N.A00;
            if (objAaT == obj2) {
                G0U<Object, Boolean> g0u = this.A03;
                if (!AnonymousClass003.A1X(obj, g0u)) {
                    throw C8j3.A0w(" is not supported. On Android you can only use types which can be stored inside the Bundle.", C3cG.A0f(obj, "Type of the key "));
                }
                objAaT = new AFw(new AGA(this.A02.get(obj), g0u));
                BBI.A0T(bfm, objAaT);
            }
            AKT.A02(bfm, g0v, new AKJ[]{AG8.A00.A04(objAaT), AIB.A00.A04(objAaT)}, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8);
            Unit unit = Unit.INSTANCE;
            boolean zA1S = AnonymousClass005.A1S(bfm, this, obj, objAaT);
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == obj2) {
                objAaT2 = new BTL(objAaT, this, obj, 11);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, unit);
            BBI bbi = (BBI) bfm;
            if (bbi.A0Q && bbi.A0F.A05 == bbi.A05) {
                bbi.A05 = -1;
                bbi.A0Q = false;
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTR(this, obj, g0v, i, 6);
        }
    }

    public AG9() {
        this(C3cG.A0j());
    }
}
