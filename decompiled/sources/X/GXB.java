package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.facebook.rsys.audiodevicestate.AudioDeviceManager;

/* loaded from: classes6.dex */
public final class GXB implements AudioManager.OnCommunicationDeviceChangedListener {
    public final /* synthetic */ AudioDeviceManager A00;

    public GXB(AudioDeviceManager audioDeviceManager) {
        this.A00 = audioDeviceManager;
    }

    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
    public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceManager audioDeviceManager = this.A00;
        audioDeviceManager.toAudioOutput(audioDeviceInfo);
        if (audioDeviceInfo != null) {
            audioDeviceInfo.getType();
        }
        audioDeviceManager.nativeOnOutputRouteChanged(audioDeviceManager.nativePtr, audioDeviceManager.toAudioOutput(audioDeviceInfo));
    }
}
