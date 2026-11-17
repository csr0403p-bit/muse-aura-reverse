package X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.7VU, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7VU {
    public static final AKH<InterfaceC10559Hsu> A00 = AnonymousClass002.A0L(new C8i2(1));

    public static final InterfaceC10559Hsu A00(BFM bfm) {
        InterfaceC10559Hsu interfaceC10559Hsu = (InterfaceC10559Hsu) bfm.A6v(A00);
        if (interfaceC10559Hsu == null) {
            bfm.AgE(1213380307);
            Object baseContext = (Context) bfm.A6v(AndroidCompositionLocals_androidKt.A01);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof InterfaceC10559Hsu) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            interfaceC10559Hsu = (InterfaceC10559Hsu) baseContext;
        } else {
            bfm.AgE(1213379439);
        }
        BBI.A0R((BBI) bfm, false);
        return interfaceC10559Hsu;
    }
}
