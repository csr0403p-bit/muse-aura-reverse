package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3bV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bV implements Ht9, G0W {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C3bV(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // X.G0W
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                InterfaceC05011Yg interfaceC05011Yg = (InterfaceC05011Yg) this.A00;
                C0dy c0dy = (C0dy) this.A01;
                BFM bfm = (BFM) obj2;
                bfm.AgE(-353972293);
                InterfaceC05111Yt interfaceC05111YtRememberUpdatedInstance = interfaceC05011Yg.rememberUpdatedInstance(c0dy, bfm, 0);
                boolean zA65 = bfm.A65(interfaceC05111YtRememberUpdatedInstance);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new C1239AfV(interfaceC05111YtRememberUpdatedInstance);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A1D(bfm);
                return objAaT;
            case 1:
                Object obj4 = this.A00;
                InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) this.A01;
                BFM bfm2 = (BFM) obj2;
                Object objA0p = AnonymousClass001.A0p(bfm2, -102778667);
                Object obj5 = C78N.A00;
                C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm2, objA0p, obj5);
                Object objAaT2 = bfm2.AaT();
                if (objAaT2 == obj5) {
                    objAaT2 = AnonymousClass004.A11(bfm2, null);
                }
                MutableState mutableState = (MutableState) objAaT2;
                MutableState mutableStateA00 = C1er.A00(bfm2, obj4);
                boolean zA652 = bfm2.A65(interfaceC1072AWd);
                Object objAaT3 = bfm2.AaT();
                if (zA652 || objAaT3 == obj5) {
                    objAaT3 = new C3bW(2, mutableState, interfaceC1072AWd);
                    bfm2.Ai0(objAaT3);
                }
                AnonymousClass001.A17(bfm2, objAaT3, interfaceC1072AWd);
                BS0 bs0 = BRg.A00;
                boolean zA1P = AnonymousClass003.A1P(bfm2, interfaceC1072AWd, mutableStateA00, bfm2.A67(c3ux));
                Object objAaT4 = bfm2.AaT();
                if (zA1P || objAaT4 == obj5) {
                    objAaT4 = new AWy(interfaceC1072AWd, mutableState, mutableStateA00, c3ux);
                    bfm2.Ai0(objAaT4);
                }
                BRg bRgA00 = AaM.A00(bs0, (PointerInputEventHandler) objAaT4, interfaceC1072AWd);
                AnonymousClass001.A1D(bfm2);
                return bRgA00;
            default:
                Function0 function0 = (Function0) this.A00;
                G0U g0u = (G0U) this.A01;
                BFM bfm3 = (BFM) obj2;
                C1003AOr<AWx> c1003AOr = AVf.A02;
                Object objA0p2 = AnonymousClass001.A0p(bfm3, 759876635);
                Object obj6 = C78N.A00;
                if (objA0p2 == obj6) {
                    objA0p2 = AnonymousClass003.A0R(bfm3, function0);
                }
                C1BO c1bo = (C1BO) objA0p2;
                Object objAaT5 = bfm3.AaT();
                if (objAaT5 == obj6) {
                    objAaT5 = new AT5(AVf.A03, new AWx(((AWx) c1bo.getValue()).A00), new AWx(AVf.A00));
                    bfm3.Ai0(objAaT5);
                }
                AT5 at5 = (AT5) objAaT5;
                Unit unit = Unit.INSTANCE;
                boolean zA67 = bfm3.A67(at5);
                Object objAaT6 = bfm3.AaT();
                if (zA67 || objAaT6 == obj6) {
                    objAaT6 = new C05393bl(at5, (C1BO<AWx>) c1bo, (AT5<AWx, ARY>) null, (HtJ<? super C05393bl>) 5);
                    bfm3.Ai0(objAaT6);
                }
                AnonymousClass001.A18(bfm3, objAaT6, unit);
                Object obj7 = at5.A04;
                boolean zA653 = bfm3.A65(obj7);
                Object objAaT7 = bfm3.AaT();
                if (zA653 || objAaT7 == obj6) {
                    objAaT7 = new C3bR(obj7, 4);
                    bfm3.Ai0(objAaT7);
                }
                Object objInvoke = g0u.invoke(objAaT7);
                AnonymousClass002.A19(bfm3);
                return objInvoke;
        }
    }
}
