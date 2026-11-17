package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Bil, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2715Bil extends AbstractC2756Bjx implements BlJ, BlQ {
    public AbstractC2756Bjx A00;
    public Bl0 A01;
    public C3010Brs<Void> A02;
    public ListenableFuture<Void> A03;
    public ListenableFuture<List<Void>> A04;
    public ListenableFuture<List<Surface>> A05;
    public List<BjC> A06;
    public final Handler A0B;
    public final C2722Bis A0C;
    public final Bb7 A0D;
    public final C2406BaL A0E;
    public final C2716Bim A0F;
    public final Bb8 A0G;
    public final Executor A0J;
    public final ScheduledExecutorService A0K;
    public final ScheduledExecutorService A0L;
    public final Object A0H = C3cG.A0T();
    public List<BjC> A07 = null;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public final Object A0I = C3cG.A0T();
    public final AtomicBoolean A0M = BV4.A12(false);

    public static CameraCaptureSession A00(Object obj) {
        C2715Bil c2715Bil = (C2715Bil) obj;
        c2715Bil.A01.getClass();
        return ((Bl1) c2715Bil.A01.A00).A00;
    }

    public static final void A01(C2715Bil c2715Bil) {
        synchronized (c2715Bil.A0H) {
            List<BjC> list = c2715Bil.A07;
            if (list != null) {
                Iterator<BjC> it = list.iterator();
                while (it.hasNext()) {
                    it.next().A03();
                }
                c2715Bil.A07 = null;
            }
        }
    }

    public static final void A02(C2715Bil c2715Bil, String str) {
        AbstractC2875Bni.A01("SyncCaptureSessionImpl", C60P.A1M("] ", str, C3cG.A0f(c2715Bil, "[")));
    }

    public final void A0B(CameraCaptureSession cameraCaptureSession) {
        if (this.A01 == null) {
            this.A01 = new Bl0(cameraCaptureSession);
        }
    }

    public final boolean A0C() {
        boolean zA1X;
        synchronized (this.A0H) {
            zA1X = AnonymousClass002.A1X(this.A03);
        }
        return zA1X;
    }

    @Override // X.BlQ
    public final boolean AgR() {
        boolean z;
        synchronized (this.A0I) {
            if (A0C()) {
                this.A0E.A00(this.A06);
            } else {
                ListenableFuture<List<Void>> listenableFuture = this.A04;
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                }
            }
            try {
                synchronized (this.A0H) {
                    if (!this.A09) {
                        ListenableFuture<List<Surface>> listenableFuture2 = this.A05;
                        listenableFuture = listenableFuture2 != null ? listenableFuture2 : null;
                        this.A09 = true;
                    }
                    z = !A0C();
                }
            } finally {
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                }
            }
        }
        return z;
    }

    @Override // X.BlJ
    public final void close() throws CameraAccessException {
        if (!C3cI.A1W(this.A0M)) {
            A02(this, "close() has been called. Skip this invocation.");
            return;
        }
        if (this.A0G.A00) {
            try {
                A02(this, "Call abortCaptures() before closing session.");
                BeS.A00(this).abortCaptures();
            } catch (Exception e) {
                A02(this, AnonymousClass007.A0a("Exception when calling abortCaptures()", e));
            }
        }
        A02(this, "Session call close()");
        this.A0F.A01().addListener(new Runnable() { // from class: X.Biy
            public static final String __redex_internal_original_name = "SynchronizedCaptureSessionImpl$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                final C2715Bil c2715Bil = this.A00;
                C2715Bil.A02(c2715Bil, "Session call super.close()");
                BeS.A03(c2715Bil.A01, "Need to call openCaptureSession before using this API.");
                C2722Bis c2722Bis = c2715Bil.A0C;
                synchronized (c2722Bis.A01) {
                    c2722Bis.A03.add(c2715Bil);
                }
                ((Bl1) c2715Bil.A01.A00).A00.close();
                c2715Bil.A0J.execute(new Runnable() { // from class: X.BkJ
                    public static final String __redex_internal_original_name = "SynchronizedCaptureSessionBaseImpl$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C2715Bil c2715Bil2 = c2715Bil;
                        c2715Bil2.A0A(c2715Bil2);
                    }
                });
            }
        }, this.A0J);
    }

    public C2715Bil(Handler handler, C2722Bis c2722Bis, C2511Bch c2511Bch, C2511Bch c2511Bch2, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.A0C = c2722Bis;
        this.A0B = handler;
        this.A0J = executor;
        this.A0K = scheduledExecutorService;
        this.A0E = new C2406BaL(c2511Bch, c2511Bch2);
        this.A0F = new C2716Bim(c2511Bch.A03(CaptureSessionStuckQuirk.class) || c2511Bch.A03(IncorrectCaptureStateQuirk.class));
        this.A0D = new Bb7(c2511Bch2);
        this.A0G = new Bb8(c2511Bch2);
        this.A0L = scheduledExecutorService;
    }
}
