package com.facebook.aura.lifecycle;

import X.AnonymousClass005;
import com.facebook.aura.partners.voice.impl.HatchVoicePipUiStateListener;

/* loaded from: classes3.dex */
public class PictureInPictureUiStateListenerStatic {
    public static void onPictureInPictureUiStateChanged(int i, boolean z, boolean z2) {
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        HatchVoicePipUiStateListener.INSTANCE.onPictureInPictureUiStateChanged(z, z2);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
