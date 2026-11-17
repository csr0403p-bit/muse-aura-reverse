package X;

import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.Bjx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2756Bjx {
    public final void A03(Surface surface, BlJ blJ) {
        if (this instanceof C2725Biv) {
            Iterator<AbstractC2756Bjx> it = ((C2725Biv) this).A00.iterator();
            while (it.hasNext()) {
                it.next().A03(surface, blJ);
            }
        } else if (this instanceof C2726Biw) {
            ((C2726Biw) this).A00.onSurfacePrepared(C2715Bil.A00(blJ), surface);
        } else if (this instanceof C2715Bil) {
            C2715Bil c2715Bil = (C2715Bil) this;
            c2715Bil.A00.getClass();
            c2715Bil.A00.A03(surface, blJ);
        }
    }

    public final void A04(BlJ blJ) {
        if (this instanceof C2725Biv) {
            Iterator<AbstractC2756Bjx> it = ((C2725Biv) this).A00.iterator();
            while (it.hasNext()) {
                it.next().A04(blJ);
            }
        } else if (this instanceof C2726Biw) {
            ((C2726Biw) this).A00.onActive(C2715Bil.A00(blJ));
        } else if (this instanceof C2715Bil) {
            C2715Bil c2715Bil = (C2715Bil) this;
            c2715Bil.A00.getClass();
            c2715Bil.A00.A04(blJ);
        }
    }

    public final void A05(BlJ blJ) {
        if (this instanceof C2725Biv) {
            Iterator<AbstractC2756Bjx> it = ((C2725Biv) this).A00.iterator();
            while (it.hasNext()) {
                it.next().A05(blJ);
            }
        } else if (this instanceof C2726Biw) {
            ((C2726Biw) this).A00.onCaptureQueueEmpty(C2715Bil.A00(blJ));
        } else if (this instanceof C2715Bil) {
            C2715Bil c2715Bil = (C2715Bil) this;
            c2715Bil.A00.getClass();
            c2715Bil.A00.A05(blJ);
        }
    }

    public final void A06(final BlJ blJ) {
        ListenableFuture<Void> listenableFuture;
        if (this instanceof C2725Biv) {
            Iterator<AbstractC2756Bjx> it = ((C2725Biv) this).A00.iterator();
            while (it.hasNext()) {
                it.next().A06(blJ);
            }
            return;
        }
        if (this instanceof C2726Biw) {
            ((C2726Biw) this).A00.onClosed(C2715Bil.A00(blJ));
            return;
        }
        if (this instanceof C2715Bil) {
            final C2715Bil c2715Bil = (C2715Bil) this;
            synchronized (c2715Bil.A0I) {
                c2715Bil.A0E.A00(c2715Bil.A06);
            }
            C2715Bil.A02(c2715Bil, "onClosed()");
            synchronized (c2715Bil.A0H) {
                if (c2715Bil.A08) {
                    listenableFuture = null;
                } else {
                    c2715Bil.A08 = true;
                    BeS.A03(c2715Bil.A03, "Need to call openCaptureSession before using this API.");
                    listenableFuture = c2715Bil.A03;
                }
            }
            C2715Bil.A01(c2715Bil);
            c2715Bil.A0F.A02();
            if (listenableFuture != null) {
                ExecutorC2446BbZ.A03(listenableFuture, new Runnable() { // from class: X.Biu
                    public static final String __redex_internal_original_name = "SynchronizedCaptureSessionBaseImpl$$ExternalSyntheticLambda2";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C2715Bil c2715Bil2 = c2715Bil;
                        BlJ blJ2 = blJ;
                        C2722Bis c2722Bis = c2715Bil2.A0C;
                        synchronized (c2722Bis.A01) {
                            c2722Bis.A02.remove(c2715Bil2);
                            c2722Bis.A03.remove(c2715Bil2);
                        }
                        c2715Bil2.A0A(blJ2);
                        if (c2715Bil2.A01 == null) {
                            AbstractC2875Bni.A03("SyncCaptureSessionBase", AnonymousClass001.A0v("] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.", C3cG.A0f(c2715Bil2, "[")));
                        } else {
                            c2715Bil2.A00.getClass();
                            c2715Bil2.A00.A06(blJ2);
                        }
                    }
                });
            }
        }
    }

    public final void A07(BlJ blJ) {
        if (this instanceof C2725Biv) {
            Iterator<AbstractC2756Bjx> it = ((C2725Biv) this).A00.iterator();
            while (it.hasNext()) {
                it.next().A07(blJ);
            }
            return;
        }
        if (this instanceof C2726Biw) {
            ((C2726Biw) this).A00.onConfigureFailed(C2715Bil.A00(blJ));
            return;
        }
        if (this instanceof C2715Bil) {
            C2715Bil c2715Bil = (C2715Bil) this;
            c2715Bil.A00.getClass();
            C2715Bil.A01(c2715Bil);
            c2715Bil.A0F.A02();
            c2715Bil.A0C.A02(c2715Bil);
            c2715Bil.A00.A07(blJ);
            return;
        }
        C2714Bik c2714Bik = ((C2719Bip) this).A00;
        synchronized (c2714Bik.A0E) {
            Integer num = c2714Bik.A05;
            switch (num.intValue()) {
                case 3:
                case 5:
                case 6:
                    c2714Bik.A02();
                    break;
                case 4:
                default:
                    throw BV5.A0U("onConfigureFailed() should not be possible in state: ", AbstractC2818Blv.A00(num));
                case 7:
                    AbstractC2875Bni.A01("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                    break;
            }
            AbstractC2875Bni.A02("CaptureSession", FGI.A0M("CameraCaptureSession.onConfigureFailed() ", AbstractC2818Blv.A00(c2714Bik.A05)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final void A08(BlJ blJ) {
        Set<BlJ> set;
        ArrayList arrayListA0t;
        Object next;
        BlJ blJ2;
        Object next2;
        if (this instanceof C2725Biv) {
            Iterator<AbstractC2756Bjx> it = ((C2725Biv) this).A00.iterator();
            while (it.hasNext()) {
                it.next().A08(blJ);
            }
            return;
        }
        if (this instanceof C2726Biw) {
            ((C2726Biw) this).A00.onConfigured(C2715Bil.A00(blJ));
            return;
        }
        if (!(this instanceof C2715Bil)) {
            C2714Bik c2714Bik = ((C2719Bip) this).A00;
            synchronized (c2714Bik.A0E) {
                Integer num = c2714Bik.A05;
                switch (num.intValue()) {
                    case 3:
                        c2714Bik.A05 = C79.A0P;
                        c2714Bik.A01 = blJ;
                        AbstractC2875Bni.A01("CaptureSession", "Attempting to send capture request onConfigured");
                        c2714Bik.A03(c2714Bik.A02);
                        ExecutorC2446BbZ.A03(c2714Bik.A0A.A01(), new RunnableC2713Bij(c2714Bik));
                        break;
                    case 4:
                    default:
                        throw BV5.A0U("onConfigured() should not be possible in state: ", AbstractC2818Blv.A00(num));
                    case 5:
                        c2714Bik.A01 = blJ;
                        break;
                    case 6:
                        blJ.close();
                        break;
                }
                AbstractC2875Bni.A04("CameraCaptureSession.onConfigured() mState=", AbstractC2818Blv.A00(c2714Bik.A05), "CaptureSession");
            }
            return;
        }
        C2715Bil c2715Bil = (C2715Bil) this;
        C2715Bil.A02(c2715Bil, "Session onConfigured()");
        Bb7 bb7 = c2715Bil.A0D;
        C2722Bis c2722Bis = c2715Bil.A0C;
        Object obj = c2722Bis.A01;
        synchronized (obj) {
            set = c2722Bis.A04;
            arrayListA0t = BV4.A0t(set);
        }
        ?? A00 = c2722Bis.A00();
        boolean zA1X = AnonymousClass002.A1X(bb7.A00);
        if (zA1X) {
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            Iterator it2 = arrayListA0t.iterator();
            while (it2.hasNext() && (next2 = it2.next()) != blJ) {
                linkedHashSetA0k.add(next2);
            }
            Iterator it3 = linkedHashSetA0k.iterator();
            while (it3.hasNext()) {
                BlJ blJ3 = (BlJ) it3.next();
                ((AbstractC2756Bjx) blJ3).A07(blJ3);
            }
        }
        c2715Bil.A00.getClass();
        synchronized (obj) {
            c2722Bis.A02.add(c2715Bil);
            set.remove(c2715Bil);
        }
        Iterator it4 = c2722Bis.A01().iterator();
        while (it4.hasNext() && (blJ2 = (BlJ) it4.next()) != c2715Bil) {
            C2715Bil c2715Bil2 = (C2715Bil) blJ2;
            C2715Bil.A01(c2715Bil2);
            c2715Bil2.A0F.A02();
        }
        c2715Bil.A00.A08(blJ);
        if (zA1X) {
            LinkedHashSet linkedHashSetA0k2 = C3cG.A0k();
            Iterator it5 = A00.iterator();
            while (it5.hasNext() && (next = it5.next()) != blJ) {
                linkedHashSetA0k2.add(next);
            }
            Iterator it6 = linkedHashSetA0k2.iterator();
            while (it6.hasNext()) {
                BlJ blJ4 = (BlJ) it6.next();
                ((AbstractC2756Bjx) blJ4).A06(blJ4);
            }
        }
    }

    public final void A09(BlJ blJ) {
        if (this instanceof C2725Biv) {
            Iterator<AbstractC2756Bjx> it = ((C2725Biv) this).A00.iterator();
            while (it.hasNext()) {
                it.next().A09(blJ);
            }
            return;
        }
        if (this instanceof C2726Biw) {
            ((C2726Biw) this).A00.onReady(C2715Bil.A00(blJ));
            return;
        }
        if (this instanceof C2715Bil) {
            C2715Bil c2715Bil = (C2715Bil) this;
            c2715Bil.A00.getClass();
            c2715Bil.A00.A09(blJ);
            return;
        }
        C2714Bik c2714Bik = ((C2719Bip) this).A00;
        synchronized (c2714Bik.A0E) {
            Integer num = c2714Bik.A05;
            if (num.intValue() == 0) {
                throw BV5.A0U("onReady() should not be possible in state: ", AbstractC2818Blv.A00(num));
            }
            AbstractC2875Bni.A04("CameraCaptureSession.onReady() ", AbstractC2818Blv.A00(num), "CaptureSession");
        }
    }

    public final void A0A(final BlJ blJ) {
        ListenableFuture<Void> listenableFuture;
        if (this instanceof C2725Biv) {
            Iterator<AbstractC2756Bjx> it = ((C2725Biv) this).A00.iterator();
            while (it.hasNext()) {
                it.next().A0A(blJ);
            }
            return;
        }
        if (this instanceof C2726Biw) {
            return;
        }
        if (!(this instanceof C2715Bil)) {
            C2714Bik c2714Bik = ((C2719Bip) this).A00;
            synchronized (c2714Bik.A0E) {
                if (c2714Bik.A05 == C79.A00) {
                    throw BV5.A0U("onSessionFinished() should not be possible in state: ", "UNINITIALIZED");
                }
                AbstractC2875Bni.A01("CaptureSession", "onSessionFinished()");
                c2714Bik.A02();
            }
            return;
        }
        final C2715Bil c2715Bil = (C2715Bil) this;
        synchronized (c2715Bil.A0H) {
            if (c2715Bil.A0A) {
                listenableFuture = null;
            } else {
                c2715Bil.A0A = true;
                BeS.A03(c2715Bil.A03, "Need to call openCaptureSession before using this API.");
                listenableFuture = c2715Bil.A03;
            }
        }
        if (listenableFuture != null) {
            ExecutorC2446BbZ.A03(listenableFuture, new Runnable() { // from class: X.Bk1
                public static final String __redex_internal_original_name = "SynchronizedCaptureSessionBaseImpl$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    C2715Bil c2715Bil2 = c2715Bil;
                    BlJ blJ2 = blJ;
                    c2715Bil2.A00.getClass();
                    c2715Bil2.A00.A0A(blJ2);
                }
            });
        }
    }
}
