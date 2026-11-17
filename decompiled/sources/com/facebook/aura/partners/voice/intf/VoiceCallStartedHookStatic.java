package com.facebook.aura.partners.voice.intf;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import android.content.Context;
import com.facebook.aura.partners.voice.shortcut.VoiceCallShortcutHook;

/* loaded from: classes2.dex */
public class VoiceCallStartedHookStatic {
    public static void onCallStarted(int i, Context context, AbstractC3358CGz abstractC3358CGz, BackgroundVoiceCall backgroundVoiceCall) {
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        VoiceCallShortcutHook.INSTANCE.onCallStarted(context, abstractC3358CGz, backgroundVoiceCall);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
