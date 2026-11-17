package com.facebook.rsys.audiodevicestate;

import X.AbstractC7609F5w;
import X.BV4;
import X.C7384Etj;
import X.GWs;
import X.GXB;
import X.GXC;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import com.facebook.rsys.audiodevicestate.gen.AudioDeviceContext;

/* loaded from: classes6.dex */
public final class AudioDeviceManager {
    public final AudioManager audioManager;
    public final AudioManager.OnCommunicationDeviceChangedListener deviceChangedListener;
    public AudioOutputRoute fallbackOutputRoute = AudioOutputRoute.EARPIECE;
    public final long nativePtr;

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnOutputRouteChanged(long j, AudioOutputRoute audioOutputRoute);

    public final void configureAudioDeviceForSessionStart(AudioDeviceContext audioDeviceContext) {
        C7384Etj.A0Y(audioDeviceContext, 0);
        AudioOutputRoute audioOutputRoute = audioDeviceContext.currentOutputRoute;
        C7384Etj.A0T(audioOutputRoute);
        this.fallbackOutputRoute = audioOutputRoute;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AudioOutputRoute toAudioOutput(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo != null) {
            int type = audioDeviceInfo.getType();
            if (type == 1) {
                return AudioOutputRoute.EARPIECE;
            }
            if (type == 2 || type == 27) {
                return AudioOutputRoute.SPEAKER;
            }
            if (type == 3 || type == 22 || type == 4) {
                return AudioOutputRoute.HEADSET;
            }
            if (type == 7 || type == 26 || type == 23) {
                return AudioOutputRoute.BLUETOOTH;
            }
        }
        return this.fallbackOutputRoute;
    }

    public final AudioOutputRoute getCurrentAudioOutputRoute() {
        return toAudioOutput(this.audioManager.getCommunicationDevice());
    }

    public final void teardown() {
        this.audioManager.removeOnCommunicationDeviceChangedListener(this.deviceChangedListener);
    }

    public final void trySetCurrentAudioOutputRoute(AudioOutputRoute audioOutputRoute) {
    }

    public AudioDeviceManager(long j) {
        this.nativePtr = j;
        GXB gxb = new GXB(this);
        this.deviceChangedListener = gxb;
        Context context = GWs.A00;
        if (context == null) {
            throw BV4.A0U();
        }
        AudioManager audioManager = (AudioManager) AbstractC7609F5w.A0o(context);
        this.audioManager = audioManager;
        audioManager.addOnCommunicationDeviceChangedListener(GXC.A00, gxb);
    }
}
