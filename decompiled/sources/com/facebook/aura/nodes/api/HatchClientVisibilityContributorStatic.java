package com.facebook.aura.nodes.api;

import X.AnonymousClass005;
import X.C20Q;
import com.facebook.aura.partners.voice.impl.VoiceClientVisibilityContributor;

/* loaded from: classes.dex */
public class HatchClientVisibilityContributorStatic {
    public static C20Q<Boolean> foregroundAllowed(int i) {
        if (i == 0) {
            return VoiceClientVisibilityContributor.INSTANCE.foregroundAllowed();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
