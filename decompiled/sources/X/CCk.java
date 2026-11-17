package X;

import com.facebook.aura.ageverification.FaceDetectionModelAssetsKt;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* loaded from: classes5.dex */
public final class CCk {
    public Map<Object, CCl> A00 = BV4.A0u();

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r4v0 X.CCk) */
    public static synchronized void A00(CCk cCk) {
        synchronized (cCk) {
            Map<Object, CCl> map = cCk.A00;
            CCl cCl = map.get(FaceDetectionModelAssetsKt.UNPACKER_NAME);
            C1H.A00(cCl);
            int i = cCl.A00 - 1;
            cCl.A00 = i;
            if (i == 0) {
                map.remove(FaceDetectionModelAssetsKt.UNPACKER_NAME);
            }
        }
    }

    public final synchronized void A01() {
        CCl cCl = this.A00.get(FaceDetectionModelAssetsKt.UNPACKER_NAME);
        C1H.A00(cCl);
        Semaphore semaphore = cCl.A01;
        if (semaphore.availablePermits() != 0) {
            throw BV6.A0f();
        }
        semaphore.release();
        A00(this);
    }
}
