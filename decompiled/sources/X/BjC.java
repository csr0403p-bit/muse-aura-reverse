package X;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public abstract class BjC {
    public int A00;
    public C3010Brs<Void> A01;
    public C3010Brs<Void> A02;
    public Class<?> A03;
    public boolean A04;
    public final int A05;
    public final Size A06;
    public final ListenableFuture<Void> A07;
    public final ListenableFuture<Void> A08;
    public final Object A09;
    public static final Size A0A = new Size(0, 0);
    public static final boolean A0D = AbstractC2875Bni.A08("DeferrableSurface", 3);
    public static final AtomicInteger A0C = BV4.A13(0);
    public static final AtomicInteger A0B = BV4.A13(0);

    public BjC() {
        this(A0A, 0);
    }

    public static void A00(BjC bjC, String str, int i, int i2) {
        if (!A0D && AbstractC2875Bni.A08("DeferrableSurface", 3)) {
            AbstractC2875Bni.A01("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append("[total_surfaces=");
        sbA0g.append(i);
        sbA0g.append(", used_surfaces=");
        sbA0g.append(i2);
        sbA0g.append("](");
        AbstractC2875Bni.A01("DeferrableSurface", BV8.A0v(bjC, sbA0g));
    }

    public final ListenableFuture<Surface> A01() {
        ListenableFuture<Surface> bpQ;
        synchronized (this.A09) {
            if (this.A04) {
                DeferrableSurface$SurfaceClosedException deferrableSurface$SurfaceClosedException = new DeferrableSurface$SurfaceClosedException("DeferrableSurface already closed.");
                deferrableSurface$SurfaceClosedException.mDeferrableSurface = this;
                bpQ = new C2938BpP<>(deferrableSurface$SurfaceClosedException);
            } else if (this instanceof C2696Bhx) {
                bpQ = ((C2696Bhx) this).A03;
            } else if (this instanceof BhY) {
                Surface surface = ((BhY) this).A00;
                bpQ = surface == null ? BpQ.A01 : new BpQ<>(surface);
            } else {
                bpQ = ((BmL) this).A00.A0A;
            }
        }
        return bpQ;
    }

    public void A02() {
        C3010Brs<Void> c3010Brs;
        synchronized (this.A09) {
            if (this.A04) {
                c3010Brs = null;
            } else {
                this.A04 = true;
                this.A01.A03(null);
                if (this.A00 == 0) {
                    c3010Brs = this.A02;
                    this.A02 = null;
                } else {
                    c3010Brs = null;
                }
                if (AbstractC2875Bni.A08("DeferrableSurface", 3)) {
                    StringBuilder sbA0x = C60O.A0x("surface closed,  useCount=");
                    sbA0x.append(this.A00);
                    AbstractC2875Bni.A01("DeferrableSurface", AnonymousClass006.A0y(this, " closed=true ", sbA0x));
                }
            }
        }
        if (c3010Brs != null) {
            c3010Brs.A03(null);
        }
    }

    public final void A03() {
        C3010Brs<Void> c3010Brs;
        synchronized (this.A09) {
            int i = this.A00;
            if (i == 0) {
                throw C3cG.A0Q("Decrementing use count occurs more times than incrementing");
            }
            int i2 = i - 1;
            this.A00 = i2;
            if (i2 == 0 && this.A04) {
                c3010Brs = this.A02;
                this.A02 = null;
            } else {
                c3010Brs = null;
            }
            if (AbstractC2875Bni.A08("DeferrableSurface", 3)) {
                StringBuilder sbA0x = C60O.A0x("use count-1,  useCount=");
                sbA0x.append(this.A00);
                sbA0x.append(" closed=");
                sbA0x.append(this.A04);
                AbstractC2875Bni.A01("DeferrableSurface", AnonymousClass006.A0y(this, InviteCodeScratcherKt.CODE_SEPARATOR, sbA0x));
                if (this.A00 == 0) {
                    A00(this, "Surface no longer in use", A0B.get(), A0C.decrementAndGet());
                }
            }
        }
        if (c3010Brs != null) {
            c3010Brs.A03(null);
        }
    }

    public final void A04() {
        synchronized (this.A09) {
            int i = this.A00;
            if (i == 0 && this.A04) {
                DeferrableSurface$SurfaceClosedException deferrableSurface$SurfaceClosedException = new DeferrableSurface$SurfaceClosedException("Cannot begin use on a closed surface.");
                deferrableSurface$SurfaceClosedException.mDeferrableSurface = this;
                throw deferrableSurface$SurfaceClosedException;
            }
            this.A00 = i + 1;
            if (AbstractC2875Bni.A08("DeferrableSurface", 3)) {
                if (this.A00 == 1) {
                    A00(this, "New surface in use", A0B.get(), A0C.incrementAndGet());
                }
                StringBuilder sbA0x = C60O.A0x("use count+1, useCount=");
                sbA0x.append(this.A00);
                AbstractC2875Bni.A01("DeferrableSurface", AnonymousClass006.A0y(this, InviteCodeScratcherKt.CODE_SEPARATOR, sbA0x));
            }
        }
    }

    public BjC(Size size, int i) {
        this.A09 = C3cG.A0T();
        this.A00 = 0;
        this.A04 = false;
        this.A06 = size;
        this.A05 = i;
        C3009Brr c3009BrrA01 = AbstractC2947Bpi.A01(this, 16);
        this.A08 = c3009BrrA01;
        this.A07 = AbstractC2947Bpi.A01(this, 17);
        if (AbstractC2875Bni.A08("DeferrableSurface", 3)) {
            A00(this, "Surface created", A0B.incrementAndGet(), A0C.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            c3009BrrA01.addListener(new Runnable() { // from class: X.BjJ
                public static final String __redex_internal_original_name = "DeferrableSurface$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() throws ExecutionException, InterruptedException {
                    BjC bjC = this.A00;
                    String str = stackTraceString;
                    try {
                        bjC.A08.get();
                        BjC.A00(bjC, "Surface terminated", BjC.A0B.decrementAndGet(), BjC.A0C.get());
                    } catch (Exception e) {
                        AbstractC2875Bni.A02("DeferrableSurface", C60P.A1M("\nStack Trace:\n", str, C3cG.A0f(bjC, "Unexpected surface termination for ")));
                        synchronized (bjC.A09) {
                            throw BV4.A0Q(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", bjC, Boolean.valueOf(bjC.A04), Integer.valueOf(bjC.A00)), e);
                        }
                    }
                }
            }, ExecutorC2446BbZ.A00());
        }
    }
}
