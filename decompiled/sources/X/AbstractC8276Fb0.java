package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.facebook.aura.R;
import java.util.ArrayList;

/* renamed from: X.Fb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8276Fb0 {
    public final Context A02() {
        if (!(this instanceof C8251FaW)) {
            return ((C8254Faa) ((C8256Fac) this).A06).A09.getContext();
        }
        C8251FaW c8251FaW = (C8251FaW) this;
        Context contextThemeWrapper = c8251FaW.A02;
        if (contextThemeWrapper == null) {
            TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
            c8251FaW.A01.getTheme().resolveAttribute(R.attr._name_removed__res_0x7f04000c, typedValueA0Z, true);
            int i = typedValueA0Z.resourceId;
            contextThemeWrapper = i != 0 ? new ContextThemeWrapper(c8251FaW.A01, i) : c8251FaW.A01;
            c8251FaW.A02 = contextThemeWrapper;
        }
        return contextThemeWrapper;
    }

    public final void A03() {
        if (!(this instanceof C8251FaW)) {
            ((C8254Faa) ((C8256Fac) this).A06).A09.setVisibility(8);
            return;
        }
        C8251FaW c8251FaW = (C8251FaW) this;
        if (c8251FaW.A0F) {
            return;
        }
        c8251FaW.A0F = true;
        C8251FaW.A01(c8251FaW, false);
    }

    public final void A04() {
        InterfaceC8333Fc0 interfaceC8333Fc0 = this instanceof C8251FaW ? ((C8251FaW) this).A0B : ((C8256Fac) this).A06;
        interfaceC8333Fc0.AdJ(((C8254Faa) interfaceC8333Fc0).A01 & (-9));
    }

    public final void A05(boolean z) {
        if (this instanceof C8251FaW) {
            C8251FaW c8251FaW = (C8251FaW) this;
            if (z != c8251FaW.A0I) {
                c8251FaW.A0I = z;
                ArrayList arrayList = c8251FaW.A0C;
                if (0 < arrayList.size()) {
                    arrayList.get(0);
                    throw BV4.A0a("onMenuVisibilityChanged");
                }
                return;
            }
            return;
        }
        C8256Fac c8256Fac = (C8256Fac) this;
        if (z != c8256Fac.A01) {
            c8256Fac.A01 = z;
            ArrayList arrayList2 = c8256Fac.A00;
            if (0 < arrayList2.size()) {
                arrayList2.get(0);
                throw BV4.A0a("onMenuVisibilityChanged");
            }
        }
    }

    public final void A06(boolean z) {
        int i;
        InterfaceC8333Fc0 interfaceC8333Fc0;
        int i2;
        if (this instanceof C8251FaW) {
            C8251FaW c8251FaW = (C8251FaW) this;
            i = z ? 4 : 0;
            interfaceC8333Fc0 = c8251FaW.A0B;
            i2 = ((C8254Faa) interfaceC8333Fc0).A01;
            c8251FaW.A0E = true;
        } else {
            C8256Fac c8256Fac = (C8256Fac) this;
            i = z ? 4 : 0;
            interfaceC8333Fc0 = c8256Fac.A06;
            i2 = ((C8254Faa) interfaceC8333Fc0).A01;
        }
        interfaceC8333Fc0.AdJ((i & 4) | (i2 & (-5)));
    }
}
