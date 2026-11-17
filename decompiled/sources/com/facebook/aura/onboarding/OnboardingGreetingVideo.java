package com.facebook.aura.onboarding;

import X.AnonymousClass001;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C9286GCn;

/* loaded from: classes3.dex */
public final class OnboardingGreetingVideo {
    public final BLG<GreetingVideoState> _state;
    public final C1BN<GreetingVideoState> state;
    public final String url;

    public final C1BN<GreetingVideoState> getState() {
        return this.state;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void onFailed() {
        GreetingVideoState value;
        GreetingVideoState greetingVideoState;
        BLG<GreetingVideoState> blg = this._state;
        do {
            value = blg.getValue();
            greetingVideoState = value;
            if (value == GreetingVideoState.LOADING || value == GreetingVideoState.PLAYING) {
                greetingVideoState = GreetingVideoState.FAILED;
            }
        } while (!blg.A6e(value, greetingVideoState));
    }

    public final void onRendered() {
        AnonymousClass001.A1E(this._state, GreetingVideoState.LOADING, GreetingVideoState.PLAYING);
    }

    public OnboardingGreetingVideo(String str) {
        this.url = str;
        C9286GCn c9286GCnA14 = C3cG.A14(str == null ? GreetingVideoState.FAILED : GreetingVideoState.LOADING);
        this._state = c9286GCnA14;
        this.state = C3Pi.A00(c9286GCnA14);
    }
}
