package com.facebook.aura.partners.voice.impl;

import com.facebook.aura.lifecycle.PictureInPictureUiStateListener;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;

/* loaded from: classes2.dex */
public final class HatchVoicePipUiStateListener implements PictureInPictureUiStateListener {
    public static final int $stable = 0;
    public static final HatchVoicePipUiStateListener INSTANCE = new HatchVoicePipUiStateListener();

    @Override // com.facebook.aura.lifecycle.PictureInPictureUiStateListener
    public void onPictureInPictureUiStateChanged(boolean z, boolean z2) {
        HatchSystemPipRuntime.INSTANCE.setPipUiState(z, z2);
    }
}
