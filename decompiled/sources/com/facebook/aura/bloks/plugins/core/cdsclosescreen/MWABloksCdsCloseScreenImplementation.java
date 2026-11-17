package com.facebook.aura.bloks.plugins.core.cdsclosescreen;

import X.BV4;
import X.C60P;
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
public final class MWABloksCdsCloseScreenImplementation {
    public static final MWABloksCdsCloseScreenImplementation INSTANCE = new MWABloksCdsCloseScreenImplementation();

    public static final Object evaluate(final Hj6 hj6, final F6D f6d) {
        FragmentActivity fragmentActivity;
        C60P.A1Y(hj6, f6d);
        FBB fbb = f6d.A02;
        if (fbb == null) {
            throw BV4.A0U();
        }
        AuraBloksHost auraBloksHost = (AuraBloksHost) fbb.A02;
        if (auraBloksHost != null && (fragmentActivity = auraBloksHost.mFragmentActivity) != null) {
            C7658F9a.A00(fragmentActivity, new InterfaceC7646F8n() { // from class: com.facebook.aura.bloks.plugins.core.cdsclosescreen.MWABloksCdsCloseScreenImplementation$evaluate$operation$1
                @Override // X.InterfaceC7646F8n
                public final void execute(Context context, FBB fbb2, Integer num) {
                    AuraBloksHost auraBloksHost2;
                    FragmentActivity fragmentActivity2;
                    if (fbb2 == null || (auraBloksHost2 = (AuraBloksHost) fbb2.A02) == null || (fragmentActivity2 = auraBloksHost2.mFragmentActivity) == null) {
                        return;
                    }
                    AuraCDSExtensions.INSTANCE.closeScreen(fragmentActivity2, f6d, hj6);
                }
            }, fbb);
        }
        return null;
    }
}
