package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.C3cG;
import androidx.activity.ComponentActivity;
import com.facebook.aura.partners.voice.screen.VoiceAnnouncementViewModel;
import com.facebook.aura.session.LocalUserSessionKt;

/* loaded from: classes2.dex */
public abstract class VoiceAnnouncementViewModelKt {
    public static final long SHOW_DELAY_MS = 1000;

    public static final VoiceAnnouncementViewModel voiceAnnouncementViewModel(BFM bfm, int i) {
        VoiceAnnouncementViewModel.Factory factory = new VoiceAnnouncementViewModel.Factory(AnonymousClass002.A0h(bfm));
        String strActivityViewModelKey = LocalUserSessionKt.activityViewModelKey(VoiceAnnouncementViewModel.class, C3cG.A05(bfm.A6v(LocalUserSessionKt.LocalUserSessionGeneration)));
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        return (VoiceAnnouncementViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), VoiceAnnouncementViewModel.class, strActivityViewModelKey);
    }
}
