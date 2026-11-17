package X;

import android.os.Handler;
import androidx.media3.exoplayer.NotImplementedException;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;

/* loaded from: classes5.dex */
public final class DQo implements InterfaceC4913DEg {
    public static final C4912DEf A0A = C4912DEf.A00();
    public static final C1YJ A0B = C1YJ.A02;
    public int A00;
    public int A01;
    public C5044DQq A02;
    public String A03;
    public final double A04;
    public final InterfaceC4913DEg A05;
    public final C5044DQq A06;
    public final C5043DQp A07;
    public final AbrContextAwareConfiguration A08;
    public final InterfaceC6113Dvs A09;

    public DQo(InterfaceC4913DEg interfaceC4913DEg, AbrContextAwareConfiguration abrContextAwareConfiguration, InterfaceC6113Dvs interfaceC6113Dvs, String str, String str2, String str3, String str4, double d, int i, int i2, boolean z) {
        C5044DQq c5044DQq;
        AnonymousClass003.A10(str2, str3);
        AnonymousClass002.A1F(str4, 8, interfaceC4913DEg);
        E7C e7c = E7C.A00;
        this.A01 = 50;
        this.A00 = 50;
        this.A09 = interfaceC6113Dvs;
        this.A07 = new C5043DQp(e7c, this, this, str, str2, str3, str4);
        this.A08 = abrContextAwareConfiguration;
        this.A06 = new C5044DQq(10000);
        if (z) {
            synchronized (C5044DQq.A03) {
                c5044DQq = C5044DQq.A02;
                if (c5044DQq == null) {
                    c5044DQq = new C5044DQq(30000);
                    C5044DQq.A02 = c5044DQq;
                }
            }
        } else {
            c5044DQq = null;
        }
        this.A02 = c5044DQq;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = interfaceC4913DEg;
        this.A04 = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC4913DEg
    public final synchronized int ACd() {
        int iContainsKey;
        C5044DQq c5044DQq = this.A02;
        if (c5044DQq != null) {
            C1YJ c1yj = A0B;
            synchronized (c5044DQq) {
                try {
                    iContainsKey = c5044DQq.A01.containsKey(c1yj);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            c5044DQq = this.A06;
            C1YJ c1yj2 = A0B;
            synchronized (c5044DQq) {
                try {
                    iContainsKey = c5044DQq.A01.containsKey(c1yj2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return iContainsKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0047 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0007, B:11:0x0016, B:26:0x0035, B:28:0x003b, B:30:0x0041, B:33:0x0047, B:38:0x0051, B:17:0x001d, B:18:0x0021, B:23:0x0030), top: B:42:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC5047DQt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized long ACr() {
        /*
            r6 = this;
            monitor-enter(r6)
            X.DQq r2 = r6.A02     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L1d
            X.1YJ r1 = X.DQo.A0B     // Catch: java.lang.Throwable -> L52
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L52
            java.util.Map<X.1YJ, X.DQr> r0 = r2.A01     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1a
            X.DQr r0 = (X.C5045DQr) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L15
            X.DXN r5 = r0.A01     // Catch: java.lang.Throwable -> L1a
            goto L16
        L15:
            r5 = 0
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            if (r5 != 0) goto L31
            goto L1d
        L1a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            goto L51
        L1d:
            X.DQq r2 = r6.A06     // Catch: java.lang.Throwable -> L52
            X.1YJ r1 = X.DQo.A0B     // Catch: java.lang.Throwable -> L52
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L52
            java.util.Map<X.1YJ, X.DQr> r0 = r2.A01     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L4f
            X.DQr r0 = (X.C5045DQr) r0     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L2f
            X.DXN r5 = r0.A01     // Catch: java.lang.Throwable -> L4f
            goto L30
        L2f:
            r5 = 0
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
        L31:
            r3 = 0
            if (r5 == 0) goto L47
            long r1 = r5.A08     // Catch: java.lang.Throwable -> L52
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L43
            long r1 = r5.A06     // Catch: java.lang.Throwable -> L52
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L43
            long r1 = r5.A07     // Catch: java.lang.Throwable -> L52
        L43:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L4d
        L47:
            X.DEg r0 = r6.A05     // Catch: java.lang.Throwable -> L52
            long r1 = r0.ACr()     // Catch: java.lang.Throwable -> L52
        L4d:
            monitor-exit(r6)
            return r1
        L4f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
        L51:
            throw r0     // Catch: java.lang.Throwable -> L52
        L52:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L52
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DQo.ACr():long");
    }

    @Override // X.InterfaceC4913DEg
    public final /* bridge */ /* synthetic */ C4912DEf AGO(String str) {
        C7384Etj.A0Y(str, 1);
        return this.A09 == null ? A0A : C4912DEf.A00();
    }

    @Override // X.InterfaceC5047DQt
    public final void A3X(Handler handler, GYb gYb) {
        throw new NotImplementedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r3 >= (java.lang.System.currentTimeMillis() + r5)) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    @Override // X.InterfaceC4913DEg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC5903Drm ACl() {
        /*
            r12 = this;
            X.DQq r1 = r12.A06
            X.1YJ r8 = X.DQo.A0B
            java.util.Map<X.1YJ, X.DQr> r0 = r1.A01
            java.lang.Object r7 = r0.get(r8)
            X.DQr r7 = (X.C5045DQr) r7
            if (r7 == 0) goto L36
            long r3 = r7.A00
            int r0 = r1.A00
            long r5 = (long) r0
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L22
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 + r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L36
        L22:
            X.DXN r0 = r7.A01
            long r6 = r0.A06
            long r8 = r0.A08
            long r10 = r0.A07
            int r4 = r12.A01
            int r5 = r12.A00
            double r2 = r12.A04
            X.DEd r1 = new X.DEd
            r1.<init>(r2, r4, r5, r6, r8, r10)
            return r1
        L36:
            X.DQq r1 = r12.A02
            if (r1 == 0) goto L59
            java.util.Map<X.1YJ, X.DQr> r0 = r1.A01
            java.lang.Object r7 = r0.get(r8)
            X.DQr r7 = (X.C5045DQr) r7
            if (r7 == 0) goto L59
            long r3 = r7.A00
            int r0 = r1.A00
            long r5 = (long) r0
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L22
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 + r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L59
            goto L22
        L59:
            X.DEg r0 = r12.A05
            X.Drm r1 = r0.ACl()
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate"
            X.C7384Etj.A0Z(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DQo.ACl():X.Drm");
    }

    @Override // X.InterfaceC5047DQt
    public final /* bridge */ /* synthetic */ CXB ALw() {
        return this.A07;
    }

    @Override // X.InterfaceC5047DQt
    public final void Aaq(GYb gYb) {
        throw new NotImplementedException();
    }
}
