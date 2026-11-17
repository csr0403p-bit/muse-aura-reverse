package com.facebook.aura.partners.voice.session.intf;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.C3UX;
import android.content.Context;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.session.impl.HatchVoiceSessionControllerProvider;

/* loaded from: classes2.dex */
public class VoiceSessionControllerProviderStatic {
    public static VoiceCallManager create(int i, Context context, C3UX c3ux, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            return HatchVoiceSessionControllerProvider.INSTANCE.create(context, c3ux, abstractC3358CGz);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
