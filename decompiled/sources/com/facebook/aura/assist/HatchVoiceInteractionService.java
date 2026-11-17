package com.facebook.aura.assist;

import X.C06H;
import X.CFK;
import android.service.voice.VoiceInteractionService;

/* loaded from: classes5.dex */
public final class HatchVoiceInteractionService extends VoiceInteractionService {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchVoiceInteractionSvc";

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // android.service.voice.VoiceInteractionService
    public void onReady() {
        super.onReady();
        CFK.A05(TAG, "onReady");
    }
}
