package X;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import android.os.Handler;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.GSq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9621GSq {
    public static C9621GSq A0F;
    public int A00;
    public long A01;
    public long A02;
    public AudioManager.AudioRecordingCallback A03;
    public Function0<Unit> A05;
    public boolean A06;
    public final AudioManager A07;
    public final InterfaceC9648GXn A09;
    public final Handler A08 = C60O.A02();
    public final Set<G0U<Boolean, Unit>> A0C = new CopyOnWriteArraySet();
    public final ReentrantLock A0D = new ReentrantLock();
    public final Map<G0U<Boolean, Unit>, GSw> A0B = C3cG.A0j();
    public List<AudioRecordingConfiguration> A04 = C0881AGi.A00;
    public final Runnable A0A = new GSt(this);
    public final F0C A0E = FZP.A00(C79.A0C, this, 19);

    public final void A02(G0U<? super Boolean, Unit> g0u, G0U<? super G0U<? super Integer, Unit>, Unit> g0u2) {
        C7384Etj.A0Y(g0u, 0);
        ReentrantLock reentrantLock = this.A0D;
        reentrantLock.lock();
        try {
            Map<G0U<Boolean, Unit>, GSw> map = this.A0B;
            if (!map.containsKey(g0u)) {
                map.put(g0u, new GSw(g0u2));
                if (map.size() == 1) {
                    long j = this.A02 + 1;
                    this.A02 = j;
                    GRF grf = new GRF(this, j);
                    this.A03 = grf;
                    this.A09.A8D("addExactMicAccessLostListener: %s", g0u.toString());
                    AudioManager audioManager = this.A07;
                    audioManager.registerAudioRecordingCallback(grf, this.A08);
                    if (Build.VERSION.SDK_INT >= 31) {
                        this.A05 = A00(grf);
                        this.A00 = audioManager.getMode();
                    }
                    grf.onRecordingConfigChanged(audioManager.getActiveRecordingConfigurations());
                } else {
                    this.A01++;
                    List<AudioRecordingConfiguration> activeRecordingConfigurations = this.A07.getActiveRecordingConfigurations();
                    C7384Etj.A0U(activeRecordingConfigurations);
                    this.A04 = AbstractC0878AGe.A0X(activeRecordingConfigurations);
                    if (!map.isEmpty()) {
                        Handler handler = this.A08;
                        Runnable runnable = this.A0A;
                        handler.removeCallbacks(runnable);
                        handler.postDelayed(runnable, 500L);
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private final Function0<Unit> A00(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        C9624GSv c9624GSv = new C9624GSv(audioRecordingCallback, this);
        this.A07.addOnModeChangedListener(new ExecutorC10644I0o(this, 1), c9624GSv);
        return new C9625GSx(c9624GSv, this);
    }

    public static final boolean A01(AudioRecordingConfiguration audioRecordingConfiguration, C9621GSq c9621GSq) {
        int i;
        int clientAudioSource;
        if (Build.VERSION.SDK_INT >= 31 && ((i = c9621GSq.A00) == 0 || i == 1)) {
            List<AudioRecordingConfiguration> list = c9621GSq.A04;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (AudioRecordingConfiguration audioRecordingConfiguration2 : list) {
                    if (audioRecordingConfiguration2.getClientAudioSessionId() != audioRecordingConfiguration.getClientAudioSessionId() && !audioRecordingConfiguration2.isClientSilenced() && ((clientAudioSource = audioRecordingConfiguration2.getClientAudioSource()) == 0 || clientAudioSource == 1 || clientAudioSource == 5 || clientAudioSource == 6 || clientAudioSource == 7 || clientAudioSource == 9 || clientAudioSource == 10)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public C9621GSq(AudioManager audioManager, InterfaceC9648GXn interfaceC9648GXn) {
        this.A07 = audioManager;
        this.A09 = interfaceC9648GXn;
    }
}
