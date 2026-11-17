package X;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes5.dex */
public final class EAY {
    public final /* synthetic */ EA2 A02;
    public final Handler A01 = BV4.A09(Looper.myLooper());
    public final AudioTrack.StreamEventCallback A00 = new EAZ(this);

    public EAY(EA2 ea2) {
        this.A02 = ea2;
    }
}
