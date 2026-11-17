package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation;
import com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.HaS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10387HaS implements CXB, InterfaceC5047DQt {
    public static C10387HaS A0E;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public String A07;
    public long A08;
    public final Context A09;
    public final C5339Dga A0A;
    public final E7C A0B;
    public final GYY A0C;
    public final ImmutableMap<Integer, Long> A0D;
    public static final ImmutableList<Long> A0K = ImmutableList.of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ImmutableList<Long> A0F = ImmutableList.of((long) Long.valueOf(HatchKatexRenderer.MAX_BITMAP_PIXELS), 980000L, 750000L, 520000L, 290000L);
    public static final ImmutableList<Long> A0G = ImmutableList.of(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final ImmutableList<Long> A0H = ImmutableList.of(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final ImmutableList<Long> A0I = ImmutableList.of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final ImmutableList<Long> A0J = ImmutableList.of((long) Long.valueOf(ConfidentialVmDowngradeOperation.EXPORT_REFRESH_INTERVAL_MS), 2000000L, 1600000L, 1300000L, 1000000L);

    @Override // X.InterfaceC5047DQt
    public final synchronized long ACr() {
        return this.A02;
    }

    @Override // X.CXB
    public final synchronized void AS2(C1J c1j, C1O c1o, int i, boolean z) {
        if (z) {
            if ((c1o.A00 & 8) != 8) {
                this.A03 += i;
            }
        }
    }

    @Override // X.CXB
    public final synchronized void AWh(C1J c1j, C1O c1o, boolean z) {
        if (z) {
            if ((c1o.A00 & 8) != 8) {
                C1G.A08(AnonymousClass002.A1N(this.A01));
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int i = (int) (jElapsedRealtime - this.A04);
                this.A06 += i;
                long j = this.A05;
                long j2 = this.A03;
                this.A05 = j + j2;
                if (i > 0) {
                    C5339Dga c5339Dga = this.A0A;
                    c5339Dga.A01((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                    if (this.A06 >= 2000 || this.A05 >= 524288) {
                        this.A02 = (long) c5339Dga.A00();
                    }
                    A01(this, i, this.A03, this.A02);
                    this.A04 = jElapsedRealtime;
                    this.A03 = 0L;
                }
                this.A01--;
            }
        }
    }

    @Override // X.CXB
    public final synchronized void AWm(C1J c1j, C1O c1o, boolean z) {
        if (z) {
            if ((c1o.A00 & 8) != 8) {
                int i = this.A01;
                if (i == 0) {
                    this.A04 = SystemClock.elapsedRealtime();
                }
                this.A01 = i + 1;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r5 == null) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0aec  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0b58  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A00(X.C10387HaS r6, int r7) {
        /*
            Method dump skipped, instructions count: 6530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10387HaS.A00(X.HaS, int):long");
    }

    public static void A01(C10387HaS c10387HaS, final int i, final long j, final long j2) {
        if (i == 0 && j == 0 && j2 == c10387HaS.A08) {
            return;
        }
        c10387HaS.A08 = j2;
        Iterator<GYZ> it = c10387HaS.A0C.A00.iterator();
        while (it.hasNext()) {
            final GYZ next = it.next();
            if (!next.A00) {
                next.A01.post(new Runnable() { // from class: X.GYa
                    public static final String __redex_internal_original_name = "BandwidthMeter$EventListener$EventDispatcher$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        GYZ gyz = next;
                        gyz.A02.ARx(i, j);
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC5047DQt
    public final CXB ALw() {
        return this;
    }

    @Override // X.InterfaceC5047DQt
    public final void Aaq(GYb gYb) {
        this.A0C.A00(gYb);
    }

    public C10387HaS(Context context, E7C e7c, Map map) {
        boolean z;
        this.A09 = context == null ? null : context.getApplicationContext();
        this.A0D = ImmutableMap.copyOf(map);
        this.A0C = new GYY();
        this.A0A = new C5339Dga();
        this.A0B = e7c;
        if (context == null) {
            this.A00 = 0;
            this.A02 = 1000000L;
            return;
        }
        C5103DXu c5103DXuA00 = C5103DXu.A00(context);
        int iA04 = c5103DXuA00.A04();
        this.A00 = iA04;
        this.A02 = A00(this, iA04);
        C10567Htx c10567Htx = new C10567Htx(this);
        Executor executorA00 = C5341Dgk.A00();
        C5103DXu.A02(c5103DXuA00);
        HuD huD = new HuD(c10567Htx, c5103DXuA00, executorA00);
        synchronized (c5103DXuA00.A02) {
            c5103DXuA00.A03.add(huD);
            z = c5103DXuA00.A00;
        }
        if (z) {
            huD.A01.execute(new RunnableC10473Hkk(huD));
        }
    }

    @Override // X.InterfaceC5047DQt
    public final void A3X(Handler handler, GYb gYb) {
        gYb.getClass();
        GYY gyy = this.A0C;
        gyy.A00(gYb);
        gyy.A00.add(new GYZ(handler, gYb));
    }

    @Override // X.CXB
    public final void AWk(C1J c1j, C1O c1o, boolean z) {
    }
}
