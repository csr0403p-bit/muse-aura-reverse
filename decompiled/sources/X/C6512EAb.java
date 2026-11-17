package X;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.EAb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6512EAb {
    public final /* synthetic */ EA1 A02;
    public final Handler A01 = BV4.A09(Looper.myLooper());
    public final AudioTrack.StreamEventCallback A00 = new C6511EAa(this);

    public C6512EAb(EA1 ea1) {
        this.A02 = ea1;
    }
}
