package com.facebook.aura.bloks.plugins.core.cdspushbottomsheet;

import X.BV4;
import X.C60P;
import X.C7384Etj;
import X.C7658F9a;
import X.F6D;
import X.FBB;
import X.Hj6;
import X.InterfaceC7646F8n;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.bloks.extensions.cds.AuraCDSExtensions;
import com.facebook.aura.bloks.host.AuraBloksHost;

/* loaded from: classes6.dex */
public final class MWABloksCdsPushBottomSheetImplementation {
    public static final MWABloksCdsPushBottomSheetImplementation INSTANCE = new MWABloksCdsPushBottomSheetImplementation();

    public final Object evaluate(final Hj6 hj6, final F6D f6d) {
        C60P.A1Y(hj6, f6d);
        FBB fbb = f6d.A02;
        if (fbb == null) {
            throw BV4.A0U();
        }
        FragmentActivity fragmentActivity = ((AuraBloksHost) fbb.A02).mFragmentActivity;
        if (fragmentActivity != null) {
            C7658F9a.A00(fragmentActivity, new InterfaceC7646F8n() { // from class: com.facebook.aura.bloks.plugins.core.cdspushbottomsheet.MWABloksCdsPushBottomSheetImplementation$evaluate$operation$1
                @Override // X.InterfaceC7646F8n
                public final void execute(Context context, FBB fbb2, Integer num) {
                    FragmentActivity fragmentActivityFindActivityFromContext;
                    AuraBloksHost auraBloksHost;
                    C7384Etj.A0Y(context, 0);
                    if ((fbb2 == null || (auraBloksHost = (AuraBloksHost) fbb2.A02) == null || (fragmentActivityFindActivityFromContext = auraBloksHost.mFragmentActivity) == null) && (fragmentActivityFindActivityFromContext = AuraCDSExtensions.INSTANCE.findActivityFromContext(context)) == null) {
                        return;
                    }
                    AuraCDSExtensions.INSTANCE.pushBottomSheet(fragmentActivityFindActivityFromContext, f6d, hj6);
                }
            }, fbb);
        }
        return null;
    }
}
