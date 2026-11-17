package X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.traffic.constants.BweAnnotationRequestType;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DlT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5593DlT implements InterfaceC5665Dmu {
    public Handler A00;
    public InterfaceC4913DEg A01;
    public InterfaceC4913DEg A02;
    public DEY A03;
    public C5515Djr A04;
    public C5601Dlg A05;
    public InterfaceC5637DmL A06;
    public C5672DnA A07;
    public C5750Dol A08;
    public DEM A09;
    public Integer A0A;
    public String A0B;
    public InterfaceC4913DEg A0C;
    public C5594DlX A0D;
    public InterfaceC5683DnM A0E;
    public DmR A0F;
    public C5506Dji A0G;
    public String A0H;
    public boolean A0I;
    public final Context A0J;
    public final DwB A0K;
    public final DFE A0L;
    public final InterfaceC6083DvN A0M;
    public final DF8 A0N;
    public final InterfaceC4887DDb A0O;
    public final C5092DXa A0P;
    public final C6134Dwc A0Q;
    public final C5596Dlb A0R;
    public final ServiceEventCallbackImpl A0S;
    public final C4900DDt A0T;
    public final DFB<C5580Dky> A0U;
    public final HeroPlayerSetting A0V;
    public final InterfaceC6113Dvs A0W;
    public final List<C5956Dsr> A0X;
    public final Map<String, String> A0Y;
    public final AtomicBoolean A0Z;
    public final AtomicBoolean A0a;
    public final AtomicBoolean A0b;
    public volatile C6031DuQ A0c;

    public static boolean A03(InterfaceC4913DEg interfaceC4913DEg, int i, long j) {
        if ((j > 0 || i > 0) && interfaceC4913DEg != null && interfaceC4913DEg.ACd() > 0) {
            InterfaceC5903Drm interfaceC5903DrmACl = interfaceC4913DEg.ACl();
            long jAFM = interfaceC5903DrmACl.AFM(null, -1);
            long jAFL = interfaceC5903DrmACl.AFL(-1);
            if (j > 0 && (jAFM == -1 || jAFM < j)) {
                return false;
            }
            if (i > 0) {
                return jAFL != -1 && jAFL <= ((long) i);
            }
            return true;
        }
        return false;
    }

    public static long A00(DmR dmR, C5507Djj c5507Djj, C5593DlT c5593DlT) {
        InterfaceC4913DEg interfaceC4913DEg = c5593DlT.A01;
        boolean z = false;
        if (c5507Djj != null && interfaceC4913DEg != null) {
            InterfaceC5903Drm interfaceC5903DrmACl = interfaceC4913DEg.ACl();
            HeroPlayerSetting heroPlayerSetting = c5593DlT.A0V;
            int i = heroPlayerSetting.aggressiveEdgeLatencyForLsbConfPercentile;
            float fAFM = interfaceC5903DrmACl.AFM(dmR.A03.A08 != null ? r0.getHost() : null, i) * heroPlayerSetting.bandwidthMultiplierForAggressiveEdgeLatency;
            List<AbstractC5553DkW> list = c5507Djj.A01;
            long jMax = -1;
            if (list != null) {
                Iterator<AbstractC5553DkW> it = list.iterator();
                while (it.hasNext()) {
                    jMax = Math.max(jMax, BV6.A0d(it).A03.A05);
                }
            }
            if (fAFM >= jMax) {
                z = true;
            }
        }
        C4904DDx c4904DDx = dmR.A03;
        if (c4904DDx.A0Y && z) {
            return c5593DlT.A0V.aggressiveEdgeLatencyOverrideForLSB;
        }
        long jMax2 = c5593DlT.A0V.liveDashEdgeLatencyMs;
        long j = c4904DDx.A04;
        if (j > 0) {
            jMax2 = Math.max(j, jMax2);
        }
        return (int) jMax2;
    }

    private final C5815Dpz A01(DmR dmR) {
        C5815Dpz c5815Dpz = new C5815Dpz();
        C4904DDx c4904DDx = dmR.A03;
        c5815Dpz.A06 = c4904DDx.A0a;
        c5815Dpz.A05 = dmR.A08;
        c5815Dpz.A01 = c4904DDx.A0Q;
        c5815Dpz.A07 = c4904DDx.A0b;
        c5815Dpz.A03 = c4904DDx.A0F;
        c5815Dpz.A04 = c4904DDx.A0G;
        Uri uri = c4904DDx.A08;
        if (uri != null) {
            c5815Dpz.A02 = uri.getHost();
        }
        c5815Dpz.A00 = C1U.PREFETCH == dmR.A02 ? BweAnnotationRequestType.ANDROID_PREFETCH_VIDEO : BweAnnotationRequestType.ANDROID_PLAYING_VIDEO;
        return c5815Dpz;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(X.DmR r18) {
        /*
            r17 = this;
            r5 = r17
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r5.A0V
            long r2 = r1.liveLowLatencyOptimizationMinBandwidthBps
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1N(r0)
            r6 = 0
            if (r0 != 0) goto L1d
            java.lang.Integer r0 = X.C79.A00
            r5.A0A = r0
            r0 = 0
            r5.A0I = r0
            r5.A0H = r6
            r5.A0F = r6
            return
        L1d:
            r4 = r18
            X.DDx r0 = r4.A03
            java.lang.String r3 = r0.A0Q
            boolean r0 = r5.A0I
            if (r0 == 0) goto L37
            if (r3 == 0) goto L32
            java.lang.String r0 = r5.A0H
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L37
            return
        L32:
            X.DmR r0 = r5.A0F
            if (r4 != r0) goto L37
            return
        L37:
            X.DEg r7 = r5.A02
            if (r7 == 0) goto L45
            if (r3 == 0) goto L45
            java.lang.String r0 = r5.A0B
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6e
        L45:
            X.Dpz r15 = r5.A01(r4)
            X.DnS r11 = r1.abrSetting
            X.DXa r12 = r5.A0P
            X.DDb r13 = r5.A0O
            X.DEy r14 = new X.DEy
            r14.<init>()
            android.content.Context r0 = r5.A0J
            X.DXq r18 = X.C5099DXq.A00(r0)
            r16 = 1
            r17 = 0
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r10 = new com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            X.Dvs r0 = r5.A0W
            X.DXI r7 = new X.DXI
            r7.<init>(r10, r0)
            r5.A02 = r7
            r5.A0B = r3
        L6e:
            long r1 = r1.liveLowLatencyOptimizationMinBandwidthBps
            X.DDx r0 = r4.A03
            android.net.Uri r0 = r0.A08
            if (r0 == 0) goto L7a
            java.lang.String r6 = r0.getHost()
        L7a:
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lae
            if (r7 == 0) goto Lae
            int r0 = r7.ACd()
            if (r0 <= 0) goto Lae
            X.Drm r7 = r7.ACl()
            r0 = -1
            long r8 = r7.AFM(r6, r0)
            r6 = -1
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto Lae
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto Lab
            java.lang.Integer r1 = X.C79.A01
        L9b:
            java.lang.Integer r0 = X.C79.A00
            if (r1 != r0) goto La1
            java.lang.Integer r1 = X.C79.A0C
        La1:
            r5.A0A = r1
            r0 = 1
            r5.A0I = r0
            r5.A0H = r3
            r5.A0F = r4
            return
        Lab:
            java.lang.Integer r1 = X.C79.A0C
            goto L9b
        Lae:
            java.lang.Integer r1 = X.C79.A00
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5593DlT.A02(X.DmR):void");
    }

    @Override // X.InterfaceC5665Dmu
    public final /* synthetic */ C5431DiS AC6() {
        return null;
    }

    @Override // X.InterfaceC5665Dmu
    public final /* synthetic */ C4908DEb AC8() {
        return null;
    }

    @Override // X.InterfaceC5665Dmu
    public final InterfaceC5478DjF ACX(InterfaceC5683DnM interfaceC5683DnM, DmR dmR) {
        C5611Dlq c5611Dlq;
        HeroPlayerSetting heroPlayerSetting = this.A0V;
        C5686DnS c5686DnS = heroPlayerSetting.abrSetting;
        if (!c5686DnS.enableMultiAudioSupport && !c5686DnS.liveEnableAudioIbrEvaluator) {
            return null;
        }
        C5815Dpz c5815Dpz = dmR == null ? new C5815Dpz() : A01(dmR);
        C5686DnS c5686DnS2 = heroPlayerSetting.abrSetting;
        C5092DXa c5092DXa = this.A0P;
        InterfaceC4887DDb interfaceC4887DDb = this.A0O;
        C4928DEy c4928DEy = new C4928DEy();
        Context context = this.A0J;
        AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(c5686DnS2, c5092DXa, interfaceC4887DDb, c4928DEy, c5815Dpz, true, false, C5099DXq.A00(context));
        DXI dxi = new DXI(abrContextAwareConfiguration, this.A0W);
        String str = c5815Dpz.A01;
        if (!TextUtils.isEmpty(str) && this.A06.riskEvaluatorFactories() != null) {
            C7384Etj.A0Y(str, 0);
            throw BV4.A0a("createForPlayback");
        }
        if (abrContextAwareConfiguration.getShouldEnableAudioIbrCache()) {
            c5611Dlq = new C5611Dlq(new DEA(this.A0N.A00), null, dmR != null ? dmR.A02 : C1U.UNKNOWN, dmR != null ? dmR.A03.A09 : BY2.GENERAL, heroPlayerSetting);
        } else {
            c5611Dlq = null;
        }
        return new C5594DlX(context, dxi, null, c5815Dpz, c5611Dlq, this.A0D, abrContextAwareConfiguration, C5682DnL.A00(interfaceC5683DnM, C0881AGi.A00), c5092DXa);
    }

    @Override // X.InterfaceC5665Dmu
    public final InterfaceC4913DEg ACm() {
        return this.A01;
    }

    @Override // X.InterfaceC5665Dmu
    public final C5594DlX AEZ() {
        return this.A0D;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[PHI: r9
  0x0033: PHI (r9v2 int) = (r9v1 int), (r9v5 int) binds: [B:5:0x0027, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    @Override // X.InterfaceC5665Dmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC5745Dog AHA(X.DmR r58, X.C5917Ds1 r59, java.util.concurrent.atomic.AtomicBoolean r60, java.util.concurrent.atomic.AtomicBoolean r61, boolean r62) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5593DlT.AHA(X.DmR, X.Ds1, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, boolean):X.Dog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0936 A[PHI: r57
  0x0936: PHI (r57v11 boolean) = (r57v2 boolean), (r57v12 boolean) binds: [B:416:0x0934, B:414:0x0930] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x093c A[PHI: r57
  0x093c: PHI (r57v10 boolean) = (r57v2 boolean), (r57v11 boolean) binds: [B:416:0x0934, B:418:0x093a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0940 A[PHI: r57 r58
  0x0940: PHI (r57v3 boolean) = (r57v10 boolean), (r57v11 boolean) binds: [B:420:0x093e, B:418:0x093a] A[DONT_GENERATE, DONT_INLINE]
  0x0940: PHI (r58v1 boolean) = (r58v7 boolean), (r58v8 boolean) binds: [B:420:0x093e, B:418:0x093a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0946 A[PHI: r57 r58
  0x0946: PHI (r57v9 boolean) = (r57v3 boolean), (r57v10 boolean) binds: [B:422:0x0944, B:420:0x093e] A[DONT_GENERATE, DONT_INLINE]
  0x0946: PHI (r58v6 boolean) = (r58v1 boolean), (r58v7 boolean) binds: [B:422:0x0944, B:420:0x093e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x094a A[PHI: r57 r58 r59
  0x094a: PHI (r57v8 boolean) = (r57v3 boolean), (r57v9 boolean) binds: [B:422:0x0944, B:424:0x0948] A[DONT_GENERATE, DONT_INLINE]
  0x094a: PHI (r58v5 boolean) = (r58v1 boolean), (r58v6 boolean) binds: [B:422:0x0944, B:424:0x0948] A[DONT_GENERATE, DONT_INLINE]
  0x094a: PHI (r59v4 boolean) = (r59v0 boolean), (r59v5 boolean) binds: [B:422:0x0944, B:424:0x0948] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0950 A[PHI: r57 r58 r59
  0x0950: PHI (r57v4 boolean) = (r57v8 boolean), (r57v9 boolean) binds: [B:426:0x094e, B:424:0x0948] A[DONT_GENERATE, DONT_INLINE]
  0x0950: PHI (r58v2 boolean) = (r58v5 boolean), (r58v6 boolean) binds: [B:426:0x094e, B:424:0x0948] A[DONT_GENERATE, DONT_INLINE]
  0x0950: PHI (r59v1 boolean) = (r59v4 boolean), (r59v5 boolean) binds: [B:426:0x094e, B:424:0x0948] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0a8f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0ce1  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0cec  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0d0e  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0d3c  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0d9d A[PHI: r13
  0x0d9d: PHI (r13v5 java.lang.String) = (r13v3 java.lang.String), (r13v6 java.lang.String) binds: [B:568:0x0d6f, B:566:0x0d6b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC5665Dmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.Dn1 AHc(X.C5678DnH r143) {
        /*
            Method dump skipped, instructions count: 3540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5593DlT.AHc(X.DnH):X.Dn1");
    }

    @Override // X.InterfaceC5665Dmu
    public final C5750Dol AJU() {
        return this.A08;
    }

    @Override // X.InterfaceC5665Dmu
    public final C5506Dji AJv(DmR dmR) {
        C5506Dji c5506Dji = this.A0G;
        if (c5506Dji != null) {
            return c5506Dji;
        }
        HeroPlayerSetting heroPlayerSetting = this.A0V;
        Dlv dlv = heroPlayerSetting.gen;
        boolean z = dlv.enable_media_period_error_suppression;
        boolean z2 = dlv.retry_on_network_restore_after_error;
        if (!z && !z2) {
            return null;
        }
        C5506Dji c5506Dji2 = new C5506Dji(heroPlayerSetting.ignoreLiveStreamErrorsTimeoutMs, z, dlv.enable_stream_error_reset_on_healthy_cycle, z2);
        this.A0G = c5506Dji2;
        return c5506Dji2;
    }

    @Override // X.InterfaceC5665Dmu
    public final InterfaceC4913DEg AKV() {
        return this.A0C;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    @Override // X.InterfaceC5665Dmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC5478DjF AMd(X.InterfaceC5683DnM r30, X.DmR r31) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5593DlT.AMd(X.DnM, X.DmR):X.DjF");
    }

    @Override // X.InterfaceC5665Dmu
    public final void AbR() {
        C5506Dji c5506Dji = this.A0G;
        if (c5506Dji != null) {
            c5506Dji.A00 = -9223372036854775807L;
        }
    }

    @Override // X.InterfaceC5665Dmu
    public final void AdY(boolean z) {
    }

    @Override // X.InterfaceC5665Dmu
    public final void Ae3(C6031DuQ c6031DuQ) {
        this.A0c = c6031DuQ;
    }

    @Override // X.InterfaceC5665Dmu
    public final void Aee(C5515Djr c5515Djr) {
        this.A04 = c5515Djr;
    }

    public C5593DlT(Context context, Handler handler, DDR ddr, DEY dey, C6134Dwc c6134Dwc, C5605Dlk c5605Dlk, ServiceEventCallbackImpl serviceEventCallbackImpl, DEM dem, DFB dfb, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3) throws NumberFormatException {
        HeroPlayerSetting heroPlayerSetting = c5605Dlk.A09;
        AtomicReference atomicReference = c5605Dlk.A0D;
        C5596Dlb c5596Dlb = (C5596Dlb) atomicReference.get();
        InterfaceC6113Dvs interfaceC6113Dvs = c5605Dlk.A0A;
        C4900DDt c4900DDt = new C4900DDt(context, ddr, dey, c5596Dlb, serviceEventCallbackImpl, heroPlayerSetting, interfaceC6113Dvs);
        this.A0A = C79.A00;
        this.A0J = context;
        this.A0Y = map;
        this.A0V = heroPlayerSetting;
        String str = heroPlayerSetting.liveLatencyTargetTiers;
        ArrayList arrayList = null;
        if (str != null && !C60Q.A1V(str)) {
            ArrayList arrayListA0h = C3cG.A0h();
            try {
                String[] strArrSplit = str.split(",");
                int length = strArrSplit.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        String[] strArrSplit2 = strArrSplit[i].split(":");
                        if (strArrSplit2.length != 3) {
                            break;
                        }
                        long j = Long.parseLong(BV6.A0r(strArrSplit2, 0));
                        int i2 = Integer.parseInt(BV6.A0r(strArrSplit2, 1));
                        int i3 = Integer.parseInt(BV6.A0r(strArrSplit2, 2));
                        if (j <= 0 || i2 <= 0 || i3 <= 0) {
                            break;
                        }
                        arrayListA0h.add(new C5956Dsr(i2, i3, j));
                        i++;
                    } else {
                        C7572F4l.A00(30, arrayListA0h);
                        arrayList = arrayListA0h;
                        break;
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        this.A0X = arrayList;
        this.A0R = (C5596Dlb) atomicReference.get();
        this.A0W = interfaceC6113Dvs;
        this.A0P = c5605Dlk.A04;
        this.A0K = c5605Dlk.A01;
        this.A0N = c5605Dlk.A00;
        this.A0L = c5605Dlk.A02;
        this.A0S = serviceEventCallbackImpl;
        this.A03 = dey;
        this.A0T = c4900DDt;
        this.A00 = handler;
        this.A0U = dfb;
        this.A0b = atomicBoolean;
        this.A0Z = atomicBoolean3;
        this.A0a = atomicBoolean2;
        this.A09 = dem;
        this.A0Q = c6134Dwc;
        this.A08 = new C5842DqY();
        this.A06 = c5605Dlk.A05;
        C5601Dlg c5601Dlg = c5605Dlk.A0F;
        if (c5601Dlg != null) {
            this.A05 = c5601Dlg;
        }
        this.A0M = c5605Dlk.A03;
        this.A0O = new DF0();
    }
}
