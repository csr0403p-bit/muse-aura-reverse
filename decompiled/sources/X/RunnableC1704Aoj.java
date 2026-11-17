package X;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Aoj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC1704Aoj implements Runnable, Choreographer.FrameCallback, AfG, View.OnAttachStateChangeListener, InterfaceC1234AfO {
    public static long A07 = 0;
    public static final String __redex_internal_original_name = "AndroidPrefetchScheduler";
    public boolean A00;
    public long A01;
    public boolean A02;
    public final View A03;
    public final PriorityQueue<AfM> A04 = new PriorityQueue<>(11, new BSF(1));
    public final Choreographer A05 = Choreographer.getInstance();
    public final C1705Aok A06 = new C1705Aok();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A02 = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A02 = false;
        this.A03.removeCallbacks(this);
        this.A05.removeFrameCallback(this);
    }

    private final boolean A00() {
        C1705Aok c1705Aok = this.A06;
        long jA4x = c1705Aok.A4x();
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jA4x);
        boolean z = true;
        if (jA4x > 0) {
            PriorityQueue<AfM> priorityQueue = this.A04;
            AfM afMPeek = priorityQueue.peek();
            C7384Etj.A0X(afMPeek);
            if (!afMPeek.A01.AAz(c1705Aok)) {
                priorityQueue.poll();
                z = false;
            }
            c1705Aok.A01 = false;
        }
        return z;
    }

    @Override // X.AfG
    public final /* synthetic */ void AcB(AfH afH) {
        this.A04.add(new AfM(afH, 1));
        if (this.A00) {
            return;
        }
        this.A00 = true;
        this.A03.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.A02) {
            this.A01 = j;
            this.A03.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue<AfM> priorityQueue = this.A04;
        if (!priorityQueue.isEmpty() && this.A00 && this.A02) {
            View view = this.A03;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                C1705Aok c1705Aok = this.A06;
                long jNanoTime = System.nanoTime();
                long j = A07;
                c1705Aok.A01 = AnonymousClass002.A1N((jNanoTime > ((2 * j) + nanos) ? 1 : (jNanoTime == ((2 * j) + nanos) ? 0 : -1)));
                c1705Aok.A00 = Math.max(this.A01, nanos) + j;
                boolean zA00 = false;
                while (true) {
                    if (!priorityQueue.isEmpty()) {
                        if (zA00) {
                            break;
                        }
                        if (c1705Aok.A01) {
                            Trace.beginSection("compose:lazy:prefetch:idle_frame");
                            try {
                                zA00 = A00();
                            } finally {
                                Trace.endSection();
                            }
                        } else {
                            zA00 = A00();
                        }
                    } else if (!zA00) {
                        this.A00 = false;
                    }
                }
                this.A05.postFrameCallback(this);
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.A00 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RunnableC1704Aoj(android.view.View r6) {
        /*
            r5 = this;
            r5.<init>()
            r5.A03 = r6
            r0 = 1
            X.BSF r2 = new X.BSF
            r2.<init>(r0)
            r1 = 11
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            r0.<init>(r1, r2)
            r5.A04 = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r5.A05 = r0
            X.Aok r0 = new X.Aok
            r0.<init>()
            r5.A06 = r0
            long r3 = X.RunnableC1704Aoj.A07
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L46
            android.view.Display r1 = r6.getDisplay()
            boolean r0 = r6.isInEditMode()
            if (r0 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L53
        L3f:
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0 / r1
            long r0 = (long) r0
            X.RunnableC1704Aoj.A07 = r0
        L46:
            r6.addOnAttachStateChangeListener(r5)
            boolean r0 = r6.isAttachedToWindow()
            if (r0 == 0) goto L52
            r5.onViewAttachedToWindow(r6)
        L52:
            return
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1704Aoj.<init>(android.view.View):void");
    }
}
