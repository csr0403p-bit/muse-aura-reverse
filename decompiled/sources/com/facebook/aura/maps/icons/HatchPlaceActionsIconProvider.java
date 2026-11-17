package com.facebook.aura.maps.icons;

import X.AVy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C06G;
import X.C1SA;
import X.C7384Etj;
import com.facebook.aura.R;

/* loaded from: classes.dex */
public final class HatchPlaceActionsIconProvider {
    public static final int $stable = 0;
    public static final HatchPlaceActionsIconProvider INSTANCE = new HatchPlaceActionsIconProvider();

    public boolean CallIcon(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(-40078264);
        C1SA.A00(bfm, null, bRg, AnonymousClass002.A0S(C06G.A0A(bfm)), BOf.A00(bfm, R.drawable.phone_handset_wght400_outline_24, 0), null, null, 0.0f, AVy.$stable | 48 | ((i << 6) & 896), 56);
        AnonymousClass001.A1D(bfm);
        return true;
    }

    public /* bridge */ boolean WhatsAppIcon(BRg bRg, BFM bfm, int i) {
        return AnonymousClass004.A1P(bfm, -1005578903);
    }
}
