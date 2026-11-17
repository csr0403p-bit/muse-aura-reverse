package com.facebook.aura.partners.voice.impl;

import X.C20Q;
import X.GDB;
import com.facebook.aura.nodes.api.HatchClientVisibilityContributor;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;

/* loaded from: classes.dex */
public final class VoiceClientVisibilityContributor implements HatchClientVisibilityContributor {
    public static final int $stable = 0;
    public static final VoiceClientVisibilityContributor INSTANCE = new VoiceClientVisibilityContributor();

    @Override // com.facebook.aura.nodes.api.HatchClientVisibilityContributor
    public C20Q<Boolean> foregroundAllowed() {
        return GDB.A01(new VoiceClientVisibilityContributor$foregroundAllowed$$inlined$map$1(HatchSystemPipRuntime.presentationState));
    }
}
