package com.facebook.aura.partners.voice.shortcut;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import android.content.Context;
import com.facebook.aura.partners.voice.intf.BackgroundVoiceCall;
import com.facebook.aura.partners.voice.intf.VoiceCallStartedHook;

/* loaded from: classes2.dex */
public final class VoiceCallShortcutHook implements VoiceCallStartedHook {
    public static final VoiceCallShortcutHook INSTANCE = new VoiceCallShortcutHook();

    @Override // com.facebook.aura.partners.voice.intf.VoiceCallStartedHook
    public void onCallStarted(Context context, AbstractC3358CGz abstractC3358CGz, BackgroundVoiceCall backgroundVoiceCall) {
        AnonymousClass003.A0u(context, abstractC3358CGz);
        VoiceCallShortcutUpdater.Companion.getInstance(abstractC3358CGz).update(AnonymousClass001.A0I(context));
    }
}
