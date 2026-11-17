package X;

import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Dn7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5671Dn7 extends AudioManager.AudioPlaybackCallback {
    public final /* synthetic */ DnE A00;

    @Override // android.media.AudioManager.AudioPlaybackCallback
    public final void onPlaybackConfigChanged(List<AudioPlaybackConfiguration> list) {
        C7384Etj.A0Y(list, 0);
        DnE dnE = this.A00;
        if (dnE.A04.get()) {
            AtomicBoolean atomicBoolean = dnE.A03;
            if (atomicBoolean.get()) {
                return;
            }
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<AudioPlaybackConfiguration> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().getAudioAttributes().getUsage() == 1) {
                        return;
                    }
                }
            }
            if (atomicBoolean.compareAndSet(false, true)) {
                try {
                    dnE.A05.invoke();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    public C5671Dn7(DnE dnE) {
        this.A00 = dnE;
    }
}
