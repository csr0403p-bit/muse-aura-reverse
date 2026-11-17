package X;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import java.util.List;

/* loaded from: classes5.dex */
public final class EBY extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ EBX A00;

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
        C7384Etj.A0Y(list, 0);
        super.onRecordingConfigChanged(list);
        EBX.A02(this.A00, list);
    }

    public EBY(EBX ebx) {
        this.A00 = ebx;
    }
}
