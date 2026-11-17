package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.util.Util;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.traffic.constants.BweAnnotationRequestType;
import com.facebook.video.heroplayer.ipc.SubtitleConfiguration;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.common.base.Supplier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class DlU implements InterfaceC5665Dmu {
    public C5462Dix A00;
    public InterfaceC4913DEg A01;
    public InterfaceC5683DnM A02;
    public DEY A03;
    public C5515Djr A04;
    public InterfaceC5637DmL A05;
    public ServiceEventCallbackImpl A06;
    public C5594DlX A07;
    public C5506Dji A08;
    public final Context A09;
    public final DwB A0A;
    public final InterfaceC6083DvN A0B;
    public final InterfaceC4887DDb A0C;
    public final DDR A0D;
    public final DVC A0E;
    public final C5449Dik A0F;
    public final C5431DiS A0G;
    public final C5092DXa A0H;
    public final Dn5 A0I;
    public final C5596Dlb A0J;
    public final C4908DEb A0K;
    public final C4900DDt A0L;
    public final HeroPlayerSetting A0M;
    public final InterfaceC6113Dvs A0N;
    public final Map<String, String> A0O;
    public final AtomicBoolean A0P;
    public final AtomicBoolean A0Q;
    public final AtomicBoolean A0R;
    public volatile C6031DuQ A0S;

    /* JADX WARN: Incorrect types in method signature: (LX/Dts;Lcom/google/common/base/Supplier<Ljava/lang/Long;>;LX/DmR;)LX/Dts; */
    private InterfaceC6009Dts A00(InterfaceC6009Dts interfaceC6009Dts, DmR dmR, Supplier supplier) {
        List<SubtitleConfiguration> list = dmR.A03.A0R;
        if (!this.A0M.enableVodTextTrackSwitching || list == null || list.isEmpty()) {
            Uri uri = dmR.A03.A07;
            if (uri == null) {
                return interfaceC6009Dts;
            }
            C5566Dkk c5566DkkA01 = A01(uri, dmR, supplier, null, null);
            C5704Dnm c5704Dnm = C5598Dld.A09;
            return new C5598Dld(new C5502Dje(), interfaceC6009Dts, c5566DkkA01);
        }
        InterfaceC6009Dts[] interfaceC6009DtsArr = new InterfaceC6009Dts[list.size() + 1];
        interfaceC6009DtsArr[0] = interfaceC6009Dts;
        int i = 0;
        while (i < list.size()) {
            SubtitleConfiguration subtitleConfiguration = list.get(i);
            i++;
            interfaceC6009DtsArr[i] = A01(subtitleConfiguration.A00, dmR, supplier, subtitleConfiguration.A01 != null ? Util.A0I(subtitleConfiguration.A01) : null, subtitleConfiguration.A02);
        }
        C5704Dnm c5704Dnm2 = C5598Dld.A09;
        return new C5598Dld(new C5502Dje(), interfaceC6009DtsArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DlU(android.content.Context r16, X.DDR r17, X.DEY r18, X.C5605Dlk r19, com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r20, java.util.Map r21, java.util.concurrent.atomic.AtomicBoolean r22, java.util.concurrent.atomic.AtomicBoolean r23, java.util.concurrent.atomic.AtomicBoolean r24) {
        /*
            r15 = this;
            r1 = r19
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r13 = r1.A09
            java.util.concurrent.atomic.AtomicReference r4 = r1.A0D
            java.lang.Object r11 = r4.get()
            X.Dlb r11 = (X.C5596Dlb) r11
            X.Dvs r14 = r1.A0A
            X.Dlv r0 = r13.gen
            boolean r0 = r0.evaluate_debug_event_extras
            X.DEY r10 = new X.DEY
            r10.<init>(r0)
            X.DDt r7 = new X.DDt
            r8 = r16
            r9 = r17
            r12 = r20
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r15.<init>()
            r3 = 0
            r15.A00 = r3
            r15.A09 = r8
            r0 = r21
            r15.A0O = r0
            r15.A0M = r13
            X.DnS r0 = r13.abrSetting
            boolean r0 = r0.enableBufferDetailsTracking
            X.DiS r6 = new X.DiS
            r6.<init>(r0)
            r15.A0G = r6
            X.DnS r0 = r13.abrSetting
            boolean r0 = r0.enableTransferTimeTracking
            X.DEb r5 = new X.DEb
            r5.<init>(r0)
            r15.A0K = r5
            boolean r0 = r13.enableCDNDebugHeaders
            if (r0 == 0) goto L4f
            boolean r0 = r13.enableCDNDebugHeadersExtended
            r2 = 1
            if (r0 != 0) goto L50
        L4f:
            r2 = 0
        L50:
            X.Dik r0 = new X.Dik
            r0.<init>(r6, r5, r2)
            r15.A0F = r0
            java.lang.Object r0 = r4.get()
            X.Dlb r0 = (X.C5596Dlb) r0
            r15.A0J = r0
            r15.A06 = r12
            r15.A0N = r14
            r15.A0L = r7
            boolean r0 = r5.A03
            if (r0 == 0) goto L6a
            r3 = r5
        L6a:
            r7.A07 = r3
            X.DXa r0 = r1.A04
            r15.A0H = r0
            X.DwB r0 = r1.A01
            r15.A0A = r0
            r15.A0D = r9
            r0 = r22
            r15.A0R = r0
            r0 = r23
            r15.A0Q = r0
            r0 = r24
            r15.A0P = r0
            java.util.concurrent.atomic.AtomicReference<X.DVC> r0 = r1.A0C
            java.lang.Object r0 = r0.get()
            X.DVC r0 = (X.DVC) r0
            r15.A0E = r0
            X.Dn5 r0 = r1.A07
            r15.A0I = r0
            r0 = r18
            r15.A03 = r0
            X.DmL r0 = r1.A05
            r15.A05 = r0
            X.DvN r0 = r1.A03
            r15.A0B = r0
            X.DF0 r0 = new X.DF0
            r0.<init>()
            r15.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DlU.<init>(android.content.Context, X.DDR, X.DEY, X.Dlk, com.facebook.video.heroplayer.service.ServiceEventCallbackImpl, java.util.Map, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean):void");
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/google/common/base/Supplier<Ljava/lang/Long;>;LX/DmR;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)LX/Dts; */
    private C5566Dkk A01(Uri uri, DmR dmR, Supplier supplier, String str, String str2) {
        if (str2 == null) {
            str2 = "application/x-subrip";
        }
        C5567Dkl c5567Dkl = new C5567Dkl(uri, HatchPriceImpressionEventDataKt.NO_DISCOUNT, null, str, AbstractC6161Dx4.A06(str2), 0, 2);
        return new C5566Dkk(c5567Dkl, new C4898DDr(c5567Dkl, null, DEF.DASH_TEXT, dmR, this.A0L, null, supplier, C79.A01, this.A0R, this.A0Q, this.A0P), new C5330DgR(-1), new C2615Bfg(4, new C7575F4o(2), new C4456CwY(4)), this.A0M.subtitleDurationToMaxValue ? LinkEncryptedPairingKt.LINK_COUNTER_MAX : -2L);
    }

    public static final C5815Dpz A02(DmR dmR) {
        C5815Dpz c5815Dpz = new C5815Dpz();
        C4904DDx c4904DDx = dmR.A03;
        c5815Dpz.A06 = C8j3.A1S(c4904DDx.A0a ? 1 : 0);
        c5815Dpz.A05 = dmR.A08;
        c5815Dpz.A01 = c4904DDx.A0Q;
        c5815Dpz.A07 = c4904DDx.A0b;
        c5815Dpz.A03 = c4904DDx.A0F;
        c5815Dpz.A04 = c4904DDx.A0G;
        synchronized (c5815Dpz) {
            c5815Dpz.A08 = false;
        }
        synchronized (c5815Dpz) {
        }
        Uri uri = dmR.A03.A08;
        if (uri != null) {
            c5815Dpz.A02 = uri.getHost();
        }
        c5815Dpz.A00 = C1U.PREFETCH == dmR.A02 ? BweAnnotationRequestType.ANDROID_PREFETCH_VIDEO : BweAnnotationRequestType.ANDROID_PLAYING_VIDEO;
        return c5815Dpz;
    }

    @Override // X.InterfaceC5665Dmu
    public final C5431DiS AC6() {
        return this.A0G;
    }

    @Override // X.InterfaceC5665Dmu
    public final C4908DEb AC8() {
        return this.A0K;
    }

    @Override // X.InterfaceC5665Dmu
    public final InterfaceC5478DjF ACX(InterfaceC5683DnM interfaceC5683DnM, DmR dmR) {
        C5611Dlq c5611Dlq;
        InterfaceC4913DEg dxi;
        HeroPlayerSetting heroPlayerSetting = this.A0M;
        C5686DnS c5686DnS = heroPlayerSetting.abrSetting;
        if (!c5686DnS.enableAudioIbrEvaluator && !c5686DnS.enableMultiAudioSupport) {
            return null;
        }
        C5815Dpz c5815Dpz = dmR == null ? new C5815Dpz() : A02(dmR);
        if (heroPlayerSetting.gen.select_lowest_audio_quality_when_device_muted) {
            Boolean bool = Boolean.TRUE;
            synchronized (C5896Drd.A01) {
            }
            if (bool.equals(null)) {
                synchronized (c5815Dpz) {
                    c5815Dpz.A08 = true;
                }
            }
        }
        InterfaceC5637DmL interfaceC5637DmL = this.A05;
        DF1 df1AudioRoutingInterface = interfaceC5637DmL.audioRoutingInterface();
        C5686DnS c5686DnS2 = heroPlayerSetting.abrSetting;
        C5092DXa c5092DXa = this.A0H;
        DF0 df0 = new DF0();
        Context context = this.A09;
        AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(c5686DnS2, c5092DXa, df0, df1AudioRoutingInterface, c5815Dpz, false, false, C5099DXq.A00(context));
        if (abrContextAwareConfiguration.getShouldEnableAudioIbrCache()) {
            DDR ddr = this.A0D;
            c5611Dlq = new C5611Dlq(new CCh(ddr), ddr, dmR != null ? dmR.A02 : C1U.UNKNOWN, dmR != null ? dmR.A03.A09 : BY2.GENERAL, heroPlayerSetting);
        } else {
            c5611Dlq = null;
        }
        C5451Dim c5451Dim = heroPlayerSetting.bandwidthEstimationSetting;
        if (!c5451Dim.enableTasosBweForAudio || !c5451Dim.enableBandwidthMeterDynamicInjection || (dxi = this.A01) == null) {
            dxi = new DXI(abrContextAwareConfiguration, this.A0N);
        }
        String str = c5815Dpz.A01;
        if (!TextUtils.isEmpty(str) && interfaceC5637DmL.riskEvaluatorFactories() != null) {
            C7384Etj.A0Y(str, 0);
            throw BV4.A0a("createForPlayback");
        }
        InterfaceC5683DnM interfaceC5683DnMA00 = C5682DnL.A00(interfaceC5683DnM, C0881AGi.A00);
        C5686DnS c5686DnS3 = heroPlayerSetting.abrSetting;
        if (c5686DnS3.enableMultiAudioSupport || c5686DnS3.enableAudioIbrEvaluator) {
            return new C5594DlX(context, dxi, null, c5815Dpz, c5611Dlq, this.A07, abrContextAwareConfiguration, interfaceC5683DnMA00, c5092DXa);
        }
        return null;
    }

    @Override // X.InterfaceC5665Dmu
    public final InterfaceC4913DEg ACm() {
        return this.A01;
    }

    @Override // X.InterfaceC5665Dmu
    public final C5594DlX AEZ() {
        return this.A07;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0250  */
    @Override // X.InterfaceC5665Dmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC5745Dog AHA(X.DmR r57, X.C5917Ds1 r58, java.util.concurrent.atomic.AtomicBoolean r59, java.util.concurrent.atomic.AtomicBoolean r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DlU.AHA(X.DmR, X.Ds1, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, boolean):X.Dog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021d A[PHI: r15
  0x021d: PHI (r15v21 boolean) = (r15v19 boolean), (r15v23 boolean) binds: [B:111:0x021b, B:109:0x0218] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0313 A[EDGE_INSN: B:535:0x0313->B:162:0x0313 BREAK  A[LOOP:0: B:66:0x0141->B:71:0x015f], PHI: r7
  0x0313: PHI (r7v21 X.Dx1) = (r7v20 X.Dx1), (r7v20 X.Dx1), (r7v23 X.Dx1), (r7v23 X.Dx1), (r7v23 X.Dx1), (r7v23 X.Dx1), (r7v20 X.Dx1), (r7v20 X.Dx1) binds: [B:58:0x0113, B:64:0x0134, B:212:0x03e0, B:213:0x03e2, B:169:0x032c, B:170:0x032e, B:535:0x0313, B:62:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0332 A[PHI: r5 r7
  0x0332: PHI (r5v92 java.lang.Integer) = (r5v89 java.lang.Integer), (r5v105 java.lang.Integer) binds: [B:163:0x0316, B:171:0x0330] A[DONT_GENERATE, DONT_INLINE]
  0x0332: PHI (r7v22 X.Dx1) = (r7v21 X.Dx1), (r7v23 X.Dx1) binds: [B:163:0x0316, B:171:0x0330] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0887 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0307 A[EDGE_INSN: B:539:0x0307->B:161:0x0307 BREAK  A[LOOP:2: B:85:0x01b4->B:540:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:540:? A[LOOP:2: B:85:0x01b4->B:540:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0493 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a3  */
    /* JADX WARN: Type inference failed for: r100v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r101v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r103v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r104v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r106v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r107v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r127v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r3v177, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r42v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r42v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r43v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r44v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r44v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r45v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r45v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r55v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r56v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r57v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r58v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r59v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r60v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r66v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r68v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r69v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r70v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r71v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r72v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r75v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r76v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r77v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r78v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r79v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r80v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r81v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r82v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r84v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r85v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r88v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r89v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r90v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r94v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r98v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r99v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC5665Dmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.Dn1 AHc(X.C5678DnH r133) {
        /*
            Method dump skipped, instructions count: 3266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DlU.AHc(X.DnH):X.Dn1");
    }

    @Override // X.InterfaceC5665Dmu
    public final /* synthetic */ C5750Dol AJU() {
        return null;
    }

    @Override // X.InterfaceC5665Dmu
    public final C5506Dji AJv(DmR dmR) {
        C5506Dji c5506Dji = this.A08;
        if (c5506Dji != null) {
            return c5506Dji;
        }
        HeroPlayerSetting heroPlayerSetting = this.A0M;
        Dlv dlv = heroPlayerSetting.gen;
        boolean z = dlv.enable_media_period_error_suppression;
        boolean z2 = dlv.retry_on_network_restore_after_error;
        if (!z && !z2) {
            return null;
        }
        C5506Dji c5506Dji2 = new C5506Dji((dmR == null || !C4904DDx.A00(dmR)) ? heroPlayerSetting.ignoreStreamErrorsTimeoutMs : heroPlayerSetting.ignoreLiveStreamErrorsTimeoutMs, z, dlv.enable_stream_error_reset_on_healthy_cycle, z2);
        this.A08 = c5506Dji2;
        return c5506Dji2;
    }

    @Override // X.InterfaceC5665Dmu
    public final /* synthetic */ InterfaceC4913DEg AKV() {
        return null;
    }

    @Override // X.InterfaceC5665Dmu
    public final InterfaceC5478DjF AMd(InterfaceC5683DnM interfaceC5683DnM, DmR dmR) {
        C5611Dlq c5611Dlq;
        C5815Dpz c5815Dpz = dmR == null ? new C5815Dpz() : A02(dmR);
        HeroPlayerSetting heroPlayerSetting = this.A0M;
        C5686DnS c5686DnS = heroPlayerSetting.abrSetting;
        if (dmR == null) {
            c5611Dlq = null;
        } else {
            DDR ddr = this.A0D;
            c5611Dlq = new C5611Dlq(new CCh(ddr), ddr, dmR.A02, dmR.A03.A09, heroPlayerSetting);
        }
        this.A02 = C5682DnL.A00(interfaceC5683DnM, C0881AGi.A00);
        InterfaceC5637DmL interfaceC5637DmL = this.A05;
        DF1 df1AudioRoutingInterface = interfaceC5637DmL.audioRoutingInterface();
        C5092DXa c5092DXa = this.A0H;
        InterfaceC4887DDb interfaceC4887DDb = this.A0C;
        Context context = this.A09;
        AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(c5686DnS, c5092DXa, interfaceC4887DDb, df1AudioRoutingInterface, c5815Dpz, false, false, C5099DXq.A00(context));
        boolean z = heroPlayerSetting.bandwidthEstimationSetting.enableBandwidthMeterDynamicInjection;
        InterfaceC6113Dvs interfaceC6113Dvs = this.A0N;
        if (z) {
            C7384Etj.A0Y(interfaceC6113Dvs, 0);
            this.A01 = new DXI(abrContextAwareConfiguration, interfaceC6113Dvs);
        } else {
            this.A01 = new DXI(abrContextAwareConfiguration, interfaceC6113Dvs);
        }
        String str = c5815Dpz.A01;
        if (!TextUtils.isEmpty(str) && interfaceC5637DmL.riskEvaluatorFactories() != null) {
            C7384Etj.A0Y(str, 0);
            throw BV4.A0a("createForPlayback");
        }
        C5594DlX c5594DlX = new C5594DlX(context, this.A01, null, c5815Dpz, c5611Dlq, null, abrContextAwareConfiguration, this.A02, c5092DXa);
        this.A07 = c5594DlX;
        return c5594DlX;
    }

    @Override // X.InterfaceC5665Dmu
    public final void AbR() {
        C5506Dji c5506Dji = this.A08;
        if (c5506Dji != null) {
            c5506Dji.A00 = -9223372036854775807L;
        }
    }

    @Override // X.InterfaceC5665Dmu
    public final void AdY(boolean z) {
        this.A0R.set(z);
    }

    public static List<AbstractC5553DkW> A03(C5585DlC c5585DlC) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Dl9> it = c5585DlC.A03.iterator();
        while (it.hasNext()) {
            Dl9 dl9A0b = BV6.A0b(it);
            if (dl9A0b.A06 == 2) {
                arrayListA0h.addAll(dl9A0b.A0E);
            }
        }
        return arrayListA0h;
    }

    @Override // X.InterfaceC5665Dmu
    public final void Ae3(C6031DuQ c6031DuQ) {
        this.A0S = c6031DuQ;
    }

    @Override // X.InterfaceC5665Dmu
    public final void Aee(C5515Djr c5515Djr) {
        this.A04 = c5515Djr;
    }
}
