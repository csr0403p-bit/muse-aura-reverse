package X;

import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;

/* renamed from: X.AqQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1772AqQ {
    public static final AKH<InterfaceC2262BMi> A00 = AGN.A00(1);

    public static final InterfaceC2262BMi A00(BFM bfm) {
        boolean z;
        BBI bbi = (BBI) bfm;
        InterfaceC2262BMi interfaceC2262BMi = (InterfaceC2262BMi) AKO.A07(A00, bbi);
        if (interfaceC2262BMi == null) {
            bfm.AgE(1208426157);
            View view = (View) AKO.A07(AndroidCompositionLocals_androidKt.A05, bbi);
            C7384Etj.A0Y(view, 0);
            while (true) {
                if (view == null) {
                    interfaceC2262BMi = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if ((tag instanceof InterfaceC2262BMi) && (interfaceC2262BMi = (InterfaceC2262BMi) tag) != null) {
                    break;
                }
                Object objA00 = AbstractC1722ApB.A00(view);
                view = objA00 instanceof View ? (View) objA00 : null;
            }
            z = false;
            BBI.A0R(bbi, false);
            if (interfaceC2262BMi == null) {
                bfm.AgE(1208428160);
                Object objA01 = AKO.A01(bbi);
                while (true) {
                    if (!(objA01 instanceof ContextWrapper)) {
                        objA01 = null;
                        break;
                    }
                    if (objA01 instanceof InterfaceC2262BMi) {
                        break;
                    }
                    objA01 = ((ContextWrapper) objA01).getBaseContext();
                }
                interfaceC2262BMi = (InterfaceC2262BMi) objA01;
            }
            BBI.A0R(bbi, z);
            return interfaceC2262BMi;
        }
        bfm.AgE(1208423708);
        z = false;
        BBI.A0R(bbi, false);
        bfm.AgE(1208423789);
        BBI.A0R(bbi, z);
        return interfaceC2262BMi;
    }
}
