package com.facebook.rsys.audiodevicestate;

import X.C7384Etj;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import com.facebook.rsys.audiodevicestate.gen.AudioDeviceContext;

/* loaded from: classes6.dex */
public final class LegacyAudioDeviceManager {
    public final long nativePtr;

    private final native void nativeOnOutputRouteChanged(long j, AudioOutputRoute audioOutputRoute);

    public final void trySetCurrentAudioOutputRoute(AudioOutputRoute audioOutputRoute) {
        C7384Etj.A0Y(audioOutputRoute, 0);
        nativeOnOutputRouteChanged(this.nativePtr, audioOutputRoute);
    }

    public final void configureAudioDeviceForSessionStart(AudioDeviceContext audioDeviceContext) {
    }

    public final AudioOutputRoute getCurrentAudioOutputRoute() {
        return AudioOutputRoute.UNKNOWN;
    }

    public final void teardown() {
    }

    public LegacyAudioDeviceManager(long j) {
        this.nativePtr = j;
    }
}
