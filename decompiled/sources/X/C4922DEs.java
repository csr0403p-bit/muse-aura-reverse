package X;

import android.content.Context;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DEs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4922DEs {
    public int A00;
    public int A01;
    public C5611Dlq A02;
    public C5594DlX A03;
    public AbrContextAwareConfiguration A04;
    public C5092DXa A05;
    public C5686DnS A06;
    public InterfaceC6113Dvs A07;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public ExecutorService A0J;
    public final int A0K;
    public final Context A0L;
    public final DE9 A0M;
    public final InterfaceC4887DDb A0N;
    public final boolean A0P;
    public final BZQ A0Q;
    public final BlockingQueue<C4923DEt> A0O = new LinkedBlockingDeque();
    public final AtomicBoolean A0R = C60O.A1E();
    public String A08 = "ExoService";

    public C4922DEs(Context context, DE9 de9, C5092DXa c5092DXa, BZQ bzq, C5686DnS c5686DnS, HeroPlayerSetting heroPlayerSetting, InterfaceC6113Dvs interfaceC6113Dvs) {
        this.A0L = context;
        this.A0M = de9;
        this.A06 = c5686DnS;
        this.A05 = c5092DXa;
        DF0 df0 = new DF0();
        this.A0N = df0;
        this.A02 = new C5611Dlq(new DEA(de9), null, C1U.PREFETCH, BY2.GENERAL, heroPlayerSetting);
        if (!c5686DnS.shouldUseFreshAbrEvaluatorPerLivePrefetch) {
            AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(c5686DnS, c5092DXa, df0, new C4928DEy(), new C5815Dpz(), true, true, C5099DXq.A00(context));
            this.A04 = abrContextAwareConfiguration;
            this.A03 = new C5594DlX(context, new DXI(abrContextAwareConfiguration, interfaceC6113Dvs), null, new C5815Dpz(), this.A02, null, this.A04, null, c5092DXa);
        }
        this.A05 = c5092DXa;
        this.A07 = interfaceC6113Dvs;
        this.A0F = c5686DnS.liveShouldFilterHardwareCapabilities;
        this.A0Q = bzq;
        this.A0G = heroPlayerSetting.shouldLogInbandTelemetryBweDebugString;
        this.A0D = heroPlayerSetting.enableVrlQplLoggingEvents;
        this.A0B = heroPlayerSetting.enableNetworkRequestIdentityTags;
        this.A0C = heroPlayerSetting.enableNetworkRequestIdentityTagsPrefetch;
        Dlv dlv = heroPlayerSetting.gen;
        this.A0P = dlv.evaluate_debug_event_extras;
        this.A0I = heroPlayerSetting.liveInitSegmentUrgentMedia;
        this.A09 = heroPlayerSetting.enableCDNDebugHeaders;
        this.A01 = heroPlayerSetting.predictiveDashReadTimeoutMs;
        this.A0H = dlv.skip_transfer_end_for_unopened_memory_source;
        this.A0E = heroPlayerSetting.regularFetchForAdvertisedLiveSegments;
        this.A0K = heroPlayerSetting.liveDashChunkMaxBufferSizeBytes;
        this.A00 = heroPlayerSetting.forceOneSemanticsWaveHandling;
        this.A0A = heroPlayerSetting.enableTransferListenerCallbackPerfFix;
    }

    public static void A01(C4922DEs c4922DEs) {
        int i = 0;
        if (c4922DEs.A0R.compareAndSet(false, true)) {
            c4922DEs.A0J = Executors.newFixedThreadPool(2);
            do {
                c4922DEs.A0J.execute(new RunnableC4921DEr(c4922DEs, i));
                i++;
            } while (i < 2);
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/DF7;LX/C0h;Ljava/util/List<LX/DEv;>;Lcom/facebook/exoplayer/monitor/VpsEventCallback;Ljava/lang/String;LX/DEw;)Ljava/util/Collection<LX/DEt;>; */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C4926DEw r11, com.facebook.exoplayer.monitor.VpsEventCallback r12, X.C3159C0h r13, X.DF7 r14, X.C4922DEs r15, java.lang.String r16, java.util.List r17) {
        /*
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r17.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r7 = r2.next()
            X.DEv r7 = (X.C4925DEv) r7
            X.DEF r1 = r7.A05
            X.DEF r0 = X.DEF.LIVE_VIDEO
            if (r1 != r0) goto L1f
            boolean r0 = r7.A08
            r5 = r11
            if (r0 == 0) goto L20
        L1f:
            r5 = 0
        L20:
            X.DEt r4 = new X.DEt
            r6 = r12
            r8 = r13
            r9 = r14
            r10 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.BV7.A1D(r4, r3)
            goto L8
        L2e:
            java.util.concurrent.BlockingQueue<X.DEt> r0 = r15.A0O
            r0.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4922DEs.A00(X.DEw, com.facebook.exoplayer.monitor.VpsEventCallback, X.C0h, X.DF7, X.DEs, java.lang.String, java.util.List):void");
    }
}
