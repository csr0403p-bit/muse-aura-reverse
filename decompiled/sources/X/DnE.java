package X;

import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DnE {
    public final AudioManager A00;
    public final Handler A01;
    public final Function0<Unit> A05;
    public final AtomicBoolean A04 = BV4.A12(false);
    public final AtomicBoolean A03 = BV4.A12(false);
    public final C5671Dn7 A02 = new C5671Dn7(this);

    public DnE(AudioManager audioManager, Handler handler, Function0<Unit> function0) {
        this.A00 = audioManager;
        this.A01 = handler;
        this.A05 = function0;
    }

    public final void A00() {
        if (this.A04.compareAndSet(true, false)) {
            try {
                this.A00.unregisterAudioPlaybackCallback(this.A02);
            } catch (Throwable th) {
                AbstractC3426CMt.A03("AudioPlaybackMonitor", AnonymousClass007.A0a("unregisterAudioPlaybackCallback failed: ", th), new Object[0]);
            }
        }
    }
}
