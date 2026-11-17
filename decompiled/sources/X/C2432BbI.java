package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.BbI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2432BbI extends AbstractC2433BbJ {
    public final Handler A00;
    public final Executor A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2433BbJ) {
                C2432BbI c2432BbI = (C2432BbI) ((AbstractC2433BbJ) obj);
                if (!this.A01.equals(c2432BbI.A01) || !this.A00.equals(c2432BbI.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A09(this.A00, BV8.A0A(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CameraThreadConfig{cameraExecutor=");
        sbA0x.append(this.A01);
        sbA0x.append(", schedulerHandler=");
        return BV8.A0v(this.A00, sbA0x);
    }

    public C2432BbI(Handler handler, Executor executor) {
        if (executor == null) {
            throw BV4.A0a("Null cameraExecutor");
        }
        this.A01 = executor;
        if (handler == null) {
            throw BV4.A0a("Null schedulerHandler");
        }
        this.A00 = handler;
    }
}
