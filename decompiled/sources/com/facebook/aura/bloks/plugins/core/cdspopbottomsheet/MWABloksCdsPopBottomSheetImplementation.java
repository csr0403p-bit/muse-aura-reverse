package com.facebook.aura.bloks.plugins.core.cdspopbottomsheet;

import X.AbstractC7608F5v;
import X.AnonymousClass002;
import X.BV4;
import X.C7658F9a;
import X.F6D;
import X.F8Z;
import X.FBB;
import X.FBD;
import X.FDW;
import X.Hj6;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.bloks.host.AuraBloksHost;

/* loaded from: classes6.dex */
public final class MWABloksCdsPopBottomSheetImplementation {
    public static final MWABloksCdsPopBottomSheetImplementation INSTANCE = new MWABloksCdsPopBottomSheetImplementation();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        AuraBloksHost auraBloksHost;
        FragmentActivity fragmentActivity;
        boolean zA1a = AnonymousClass002.A1a(hj6, f6d);
        FBB fbb = f6d.A02;
        if (fbb == null) {
            throw BV4.A0U();
        }
        FBD fbd = fbb.A02;
        if ((fbd instanceof AuraBloksHost) && (auraBloksHost = (AuraBloksHost) fbd) != null && (fragmentActivity = auraBloksHost.mFragmentActivity) != null) {
            FDW fdw = (FDW) hj6.A01[0];
            C7658F9a.A00(fragmentActivity, new F8Z(false, fdw != null ? AbstractC7608F5v.A0o(fdw) : null, new MWABloksCdsPopBottomSheetImplementation$evaluate$operation$1(hj6), zA1a), fbb);
        }
        return null;
    }
}
