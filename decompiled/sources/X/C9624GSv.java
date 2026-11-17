package X;

import android.media.AudioManager;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.GSv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9624GSv implements AudioManager.OnModeChangedListener {
    public final /* synthetic */ AudioManager.AudioRecordingCallback A00;
    public final /* synthetic */ C9621GSq A01;

    public C9624GSv(AudioManager.AudioRecordingCallback audioRecordingCallback, C9621GSq c9621GSq) {
        this.A01 = c9621GSq;
        this.A00 = audioRecordingCallback;
    }

    @Override // android.media.AudioManager.OnModeChangedListener
    public final void onModeChanged(int i) {
        C9621GSq c9621GSq = this.A01;
        ReentrantLock reentrantLock = c9621GSq.A0D;
        AudioManager.AudioRecordingCallback audioRecordingCallback = this.A00;
        reentrantLock.lock();
        try {
            if (c9621GSq.A03 == audioRecordingCallback) {
                c9621GSq.A00 = i;
                audioRecordingCallback.onRecordingConfigChanged(c9621GSq.A07.getActiveRecordingConfigurations());
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
