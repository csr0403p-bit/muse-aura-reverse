package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class FBS implements FC2 {
    public Map<String, ? extends FBm> A00;
    public final Handler A01;
    public final FCQ<String, FBm> A02;
    public final C7709FBh<C7704FBc> A03;
    public final Object A04;

    public final void A00(C7631F7o c7631F7o, C7403Euh c7403Euh, HlX hlX, C7711FBj c7711FBj, BloksComponentQueryResources bloksComponentQueryResources, Integer num, long j, long j2) throws NoSuchAlgorithmException {
        FCQ<String, FBm> fcq;
        RunnableC7720FBw runnableC7720FBw;
        Runnable runnable;
        AnonymousClass003.A0v(c7403Euh, hlX);
        String strA01 = c7403Euh.A01();
        Object obj = this.A04;
        synchronized (obj) {
            try {
                fcq = this.A02;
                FBm fBmA00 = fcq.A00(strA01);
                if (fBmA00 != null && (runnable = fBmA00.A04) != null) {
                    this.A01.removeCallbacks(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        HlX hlX2 = HlX.A03;
        if (hlX != hlX2 && c7711FBj.A00 == 0) {
            A01(c7403Euh);
            return;
        }
        long jMax = c7711FBj.A00;
        if (jMax == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            runnableC7720FBw = null;
        } else {
            runnableC7720FBw = new RunnableC7720FBw(this, c7403Euh);
            Handler handler = this.A01;
            if (hlX == hlX2) {
                jMax = Math.max(jMax, 5L);
            }
            handler.postDelayed(runnableC7720FBw, TimeUnit.SECONDS.toMillis(jMax));
        }
        synchronized (obj) {
            try {
                fcq.A02(strA01, new FBV(c7631F7o, hlX, bloksComponentQueryResources, num, runnableC7720FBw, null, j, j2));
                Map<String, FBm> mapA01 = fcq.A01();
                this.A00 = mapA01;
                this.A03.A01(new C7704FBc(mapA01));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public FBS() {
        HandlerThread handlerThread = new HandlerThread("Bloks_ACQ_CleanupThread", 19);
        handlerThread.start();
        Object objA0T = C3cG.A0T();
        this.A04 = objA0T;
        this.A03 = new C7709FBh<>();
        synchronized (objA0T) {
            FCQ<String, FBm> fcq = new FCQ<>(50);
            this.A02 = fcq;
            this.A00 = fcq.A01();
        }
        this.A01 = new Handler(handlerThread.getLooper());
    }

    public final void A01(C7403Euh c7403Euh) {
        String strA01 = c7403Euh.A01();
        synchronized (this.A04) {
            FCQ<String, FBm> fcq = this.A02;
            synchronized (fcq) {
                if (fcq.A07.remove(strA01) != null) {
                    fcq.A02--;
                }
            }
            Map<String, FBm> mapA01 = fcq.A01();
            this.A00 = mapA01;
            this.A03.A01(new C7704FBc(mapA01));
        }
    }

    @Override // X.FC2
    public final FBm Agj(C7403Euh c7403Euh) throws NoSuchAlgorithmException {
        FBm fBmA00;
        String strA01 = c7403Euh.A01();
        synchronized (this.A04) {
            fBmA00 = this.A02.A00(strA01);
        }
        return fBmA00;
    }
}
