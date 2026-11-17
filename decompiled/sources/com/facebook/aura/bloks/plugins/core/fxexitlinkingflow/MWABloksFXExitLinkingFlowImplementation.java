package com.facebook.aura.bloks.plugins.core.fxexitlinkingflow;

import X.AnonymousClass003;
import X.CFK;
import X.F6D;
import X.FBB;
import X.Hj6;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.bloks.extensions.cds.AuraCDSExtensions;
import com.facebook.aura.bloks.host.AuraBloksHost;

/* loaded from: classes6.dex */
public final class MWABloksFXExitLinkingFlowImplementation {
    public static final MWABloksFXExitLinkingFlowImplementation INSTANCE = new MWABloksFXExitLinkingFlowImplementation();
    public static final String TAG = "AuraBloks";

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        AuraBloksHost auraBloksHost;
        FragmentActivity fragmentActivity;
        AnonymousClass003.A0u(hj6, f6d);
        FBB fbb = f6d.A02;
        if (fbb == null || (auraBloksHost = (AuraBloksHost) fbb.A02) == null || (fragmentActivity = auraBloksHost.mFragmentActivity) == null) {
            CFK.A06(TAG, "exitLinkingFlow: could not get activity to dismiss linking UI");
            return null;
        }
        AuraCDSExtensions.INSTANCE.dismissBottomSheet(fragmentActivity, f6d, hj6);
        return null;
    }
}
