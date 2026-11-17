package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.LruCache;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.video.heroplayer.ipc.SubtitleConfiguration;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener;
import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import meta.androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;

/* renamed from: X.Dlu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5615Dlu {
    public static final DpX[] A15 = {DpX.A02, DpX.A05, DpX.A06};
    public static final InterfaceC5923DsA A16;
    public static volatile boolean A17;
    public HandlerThread A01;
    public C6154Dwx A02;
    public InterfaceC5661Dmq A04;
    public C6198Dxi A05;
    public InterfaceC6009Dts A06;
    public InterfaceC6009Dts A07;
    public DoW A08;
    public C3066Bwo A09;
    public InterfaceC5369DhL A0A;
    public C5437DiY A0B;
    public DmR A0C;
    public ServiceEventCallbackImpl A0D;
    public DF6 A0E;
    public C5879DrF A0F;
    public DlZ A0G;
    public InterfaceC5665Dmu A0H;
    public HeroExoPlayer2InitHelper A0I;
    public C5672DnA A0J;
    public C5610Dlp A0K;
    public C5357Dh2 A0L;
    public C5750Dol A0M;
    public C5850Dqk A0N;
    public C5666Dmv A0O;
    public C5580Dky A0P;
    public AtomicReference<DE4> A0R;
    public AtomicReference<DE4> A0S;
    public DDR A0U;
    public DEY A0V;
    public C5619Dm2 A0W;
    public boolean A0X;
    public final Context A0Z;
    public final Handler A0a;
    public final C5605Dlk A0c;
    public final C5895Drc A0d;
    public final Dlw A0e;
    public final C5604Dlj A0f;
    public final C5614Dlt A0g;
    public final HeroExoPlayer2EventListener A0h;
    public final C5741Doc A0i;
    public final DEM A0j;
    public final HeroPlayerSetting A0k;
    public final AtomicBoolean A0m;
    public final AtomicBoolean A0n;
    public final AtomicReference A0o;
    public final boolean A0p;
    public final DpX A0q;
    public final InterfaceC2361BVo A0r;
    public final C6134Dwc A0s;
    public final C5668Dmx A0t;
    public final C5917Ds1 A0u;
    public final Map<String, String> A0v;
    public final AtomicBoolean A0w;
    public final AtomicBoolean A0x;
    public volatile long A10;
    public volatile C6158Dx1 A11;
    public volatile Function0<Boolean> A12;
    public final List A0l = new CopyOnWriteArrayList();
    public boolean A0Y = false;
    public volatile float A0y = 1.0f;
    public C6233Dyb A03 = C6233Dyb.A03;
    public String A0Q = "";
    public volatile boolean A13 = false;
    public boolean A0T = false;
    public final E6B A0b = new E6B();
    public volatile int A0z = -1;
    public int A00 = -1;
    public volatile boolean A14 = false;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0175 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015e  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0C(X.DmR r14, X.C5615Dlu r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5615Dlu.A0C(X.DmR, X.Dlu, boolean):void");
    }

    public static void A0L(C5580Dky c5580Dky) {
        List<C5585DlC> list = c5580Dky.A0R;
        if (list.get(0) == null || list.get(0).A03 == null) {
            return;
        }
        Iterator itA05 = C5580Dky.A05(c5580Dky, 0);
        while (itA05.hasNext()) {
            Dl9 dl9A0b = BV6.A0b(itA05);
            if (dl9A0b.A06 == 1) {
                Iterator itA02 = Dl9.A02(dl9A0b);
                if (itA02.hasNext()) {
                    itA02.next();
                    throw BV4.A0a("mAudioRoleFlags");
                }
            }
        }
    }

    public static void A0M(String str) {
        try {
            try {
                C6155Dwy.A04(str, false, false);
            } catch (MediaCodecUtil$DecoderQueryException e) {
                CNC.A05("MediaCodecUtil", "Codec warming failed", e);
            }
        } catch (UnsatisfiedLinkError unused) {
            AbstractC5718DoA.A02("Codec warming failed with UnsatisfiedLinkError", new Object[0]);
        }
    }

    public final void A0V(float f) {
        C6322E0x c6322E0xA00 = C5741Doc.A00(this, 1);
        c6322E0xA00.A02(2);
        Float fValueOf = Float.valueOf(f);
        C1G.A08(!c6322E0xA00.A07);
        c6322E0xA00.A04 = fValueOf;
        c6322E0xA00.A01();
    }

    public final void A0X(int i, int i2) {
        boolean zA1Q = AnonymousClass002.A1Q(i2, -1);
        boolean z = (this.A0g == null || this.A08.A0E().A01.get(i) == zA1Q) ? false : true;
        C6137Dwf c6137DwfA01 = AbstractC5736DoV.A01(this);
        c6137DwfA01.A07(i, zA1Q);
        DoW.A06(new C6136Dwe(c6137DwfA01), this.A08);
        if (z) {
            C4908DEb c4908DEbAC8 = this.A0H.AC8();
            Integer num = i == 0 ? C79.A00 : i == 1 ? C79.A01 : null;
            if (c4908DEbAC8 == null || num == null) {
                return;
            }
            synchronized (c4908DEbAC8) {
                if (zA1Q) {
                    if (c4908DEbAC8.A03) {
                        C4907DEa.A00(C4908DEb.A00(c4908DEbAC8, num));
                    }
                } else if (c4908DEbAC8.A03) {
                    C4907DEa.A00(C4908DEb.A00(c4908DEbAC8, num));
                }
            }
        }
    }

    static {
        new DpX(2000000L, 2000000L);
        A16 = new C5964Dt5();
    }

    public static long A00(long j, long j2, long j3, long j4) {
        if (j < 0) {
            return -1L;
        }
        if (j3 != -9223372036854775807L && j == j4) {
            j = j3;
        }
        return Util.A0A(Math.max(0L, j - j2));
    }

    public static long A02(C5615Dlu c5615Dlu) {
        int iAEV;
        long currentPosition = c5615Dlu.A04.getCurrentPosition();
        Timeline timeline = AbstractC5797Dph.A04(c5615Dlu).A06;
        return (AnonymousClass002.A1M(timeline.A02()) || (iAEV = c5615Dlu.A04.AEV()) == -1 || iAEV >= timeline.A01()) ? currentPosition : BV5.A07(currentPosition - Util.A0B(timeline.A0D(c5615Dlu.A0b, iAEV, false).A02));
    }

    public static long A03(C5615Dlu c5615Dlu, int i) {
        InterfaceC6022DuF interfaceC6022DuFAL9 = c5615Dlu.A0i.A00[i].AL9();
        if (!(interfaceC6022DuFAL9 instanceof C5422DiI)) {
            return -1L;
        }
        C5422DiI c5422DiI = (C5422DiI) interfaceC6022DuFAL9;
        if (c5422DiI.AD8() == Long.MIN_VALUE) {
            return c5615Dlu.A04.getDuration();
        }
        long jAD8 = c5422DiI.AD8();
        UUID uuid = AbstractC5400Dhr.A04;
        return Util.A0B(jAD8);
    }

    public static long A04(C5615Dlu c5615Dlu, int i) {
        InterfaceC6022DuF interfaceC6022DuFAL9 = c5615Dlu.A0i.A00[i].AL9();
        if (!(interfaceC6022DuFAL9 instanceof C5422DiI)) {
            return -9223372036854775807L;
        }
        long jA06 = ((C5422DiI) interfaceC6022DuFAL9).A0K.A06();
        if (jA06 == Long.MIN_VALUE) {
            return 0L;
        }
        return Util.A0B(jA06);
    }

    public static long A05(C5615Dlu c5615Dlu, long j) {
        DlZ dlZ = c5615Dlu.A0G;
        DmR dmR = c5615Dlu.A0C;
        if (dmR == null || !dmR.A02() || dlZ == null) {
            return j;
        }
        Timeline timeline = AbstractC5797Dph.A04(c5615Dlu).A06;
        int iAEV = c5615Dlu.A04.AEV();
        if (dlZ.A07 == -9223372036854775807L || AnonymousClass002.A1M(timeline.A02()) || iAEV == -1 || iAEV >= timeline.A01()) {
            return -9223372036854775807L;
        }
        return dlZ.A07 + Util.A0B(timeline.A0D(c5615Dlu.A0b, iAEV, false).A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0131 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C6154Dwx A06(android.content.Context r27, X.C5580Dky r28) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5615Dlu.A06(android.content.Context, X.Dky):X.Dwx");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.InterfaceC5858Dqs A07(X.DmR r18) {
        /*
            r17 = this;
            r3 = r17
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r3.A0k
            boolean r0 = r2.enableExoDefaultLiveSpeedControl
            if (r0 == 0) goto L90
            float r8 = r2.exoLiveSpeedFallbackMinSpeed
            r0 = 0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L16
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L17
        L16:
            r0 = 0
        L17:
            X.C1G.A07(r0)
            float r9 = r2.exoLiveSpeedFallbackMaxSpeed
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            boolean r0 = X.C8j3.A1Q(r0)
            X.C1G.A07(r0)
            long r12 = r2.exoLiveSpeedMinUpdateIntervalMs
            r6 = 0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1N(r0)
            X.C1G.A07(r0)
            float r10 = r2.exoLiveSpeedProportionalControlFactor
            r5 = 0
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1N(r0)
            X.C1G.A07(r0)
            r0 = 1232348160(0x49742400, float:1000000.0)
            float r10 = r10 / r0
            long r0 = r2.exoLiveSpeedMaxOffsetErrorMsForUnitSpeed
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            boolean r4 = X.AnonymousClass002.A1N(r4)
            X.C1G.A07(r4)
            long r14 = androidx.media3.common.util.Util.A0A(r0)
            long r0 = r2.exoLiveSpeedTargetOffsetIncrementOnRebufferMs
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            boolean r4 = X.C8j3.A1Q(r4)
            X.C1G.A07(r4)
            long r16 = androidx.media3.common.util.Util.A0A(r0)
            float r11 = r2.exoLiveSpeedMinPossibleOffsetSmoothingFactor
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 < 0) goto L6f
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L70
        L6f:
            r0 = 0
        L70:
            X.C1G.A07(r0)
        L73:
            X.Dny r7 = new X.Dny
            r7.<init>(r8, r9, r10, r11, r12, r14, r16)
            X.Dol r5 = r3.A0M
            boolean r0 = X.C4904DDx.A00(r18)
            if (r0 == 0) goto La4
            long r3 = r2.exoLiveSpeedControlStartDelayMs
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto La4
            if (r5 == 0) goto La4
            X.Dqj r0 = new X.Dqj
            r0.<init>(r7, r5, r3)
            return r0
        L90:
            r8 = 1064849900(0x3f7851ec, float:0.97)
            r9 = 1065604874(0x3f83d70a, float:1.03)
            r12 = 1000(0x3e8, double:4.94E-321)
            r10 = 869711765(0x33d6bf95, float:1.0E-7)
            r14 = 20000(0x4e20, double:9.8813E-320)
            r16 = 500000(0x7a120, double:2.47033E-318)
            r11 = 1065336439(0x3f7fbe77, float:0.999)
            goto L73
        La4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5615Dlu.A07(X.DmR):X.Dqs");
    }

    public static void A09(EnumC5624Dm7 enumC5624Dm7, C5615Dlu c5615Dlu, String str) {
        DmR dmR = c5615Dlu.A0C;
        dmR.getClass();
        c5615Dlu.A0Y = true;
        A17 = true;
        BYP.A00(c5615Dlu.A0D, dmR.A03.A0Q, "PLAYER_WARNING", enumC5624Dm7.name(), str);
        c5615Dlu.A0A(dmR);
        c5615Dlu.A04.prepare();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012b  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0A(X.DmR r18) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5615Dlu.A0A(X.DmR):void");
    }

    public static void A0B(DmR dmR, C5615Dlu c5615Dlu, boolean z) {
        C5666Dmv c5666Dmv;
        InterfaceC5745Dog interfaceC5745DogAHA = c5615Dlu.A0H.AHA(dmR, c5615Dlu.A0u, c5615Dlu.A0n, c5615Dlu.A0m, false);
        if (C4904DDx.A00(dmR)) {
            HeroPlayerSetting heroPlayerSetting = c5615Dlu.A0k;
            if ((heroPlayerSetting.livePrePlaySegmentCount > 0 || heroPlayerSetting.livePrePlayDurationMs > 0) && (interfaceC5745DogAHA instanceof C5633DmH)) {
                ((C5633DmH) interfaceC5745DogAHA).A0b = c5615Dlu.A0B;
            }
        }
        if (z || (c5666Dmv = c5615Dlu.A0O) == null) {
            c5615Dlu.A0O = new C5666Dmv(interfaceC5745DogAHA, c5615Dlu.A0e, c5615Dlu.A0k);
        } else {
            c5666Dmv.A01 = C79.A00;
            c5666Dmv.A00 = interfaceC5745DogAHA;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.DuQ] */
    public static final void A0D(DmR dmR, final C5615Dlu c5615Dlu, boolean z) {
        Context context;
        ServiceEventCallbackImpl serviceEventCallbackImpl;
        C5605Dlk c5605Dlk;
        InterfaceC5665Dmu dlU;
        C5668Dmx c5668Dmx;
        if (z && c5615Dlu.A0k.gen.enable_preload_in_hero_manager && (c5668Dmx = c5615Dlu.A0t) != null && !C4904DDx.A00(dmR)) {
            String strA00 = DmR.A00(dmR, c5668Dmx.A05);
            synchronized (c5668Dmx.A06) {
                c5668Dmx.A03.get(strA00);
                LruCache<String, String> lruCache = c5668Dmx.A04;
                if (lruCache != null) {
                    lruCache.put(strA00, "");
                }
            }
        }
        C4904DDx c4904DDx = dmR.A03;
        if (c4904DDx.A0A == BXX.HLS) {
            context = c5615Dlu.A0Z;
            HeroPlayerSetting heroPlayerSetting = c5615Dlu.A0k;
            serviceEventCallbackImpl = c5615Dlu.A0D;
            c5605Dlk = c5615Dlu.A0c;
            dlU = new C5603Dli(context, c5615Dlu.A0U, c5605Dlk.A06, (C5596Dlb) c5605Dlk.A0D.get(), serviceEventCallbackImpl, heroPlayerSetting, c5605Dlk.A0A);
        } else {
            boolean zA04 = c4904DDx.A04();
            context = c5615Dlu.A0Z;
            if (zA04) {
                Map<String, String> map = c5615Dlu.A0v;
                serviceEventCallbackImpl = c5615Dlu.A0D;
                DDR ddr = c5615Dlu.A0U;
                Handler handler = c5615Dlu.A0a;
                C5644DmY c5644DmY = new C5644DmY(c5615Dlu);
                AtomicBoolean atomicBoolean = c5615Dlu.A0n;
                AtomicBoolean atomicBoolean2 = c5615Dlu.A0w;
                DEM dem = c5615Dlu.A0j;
                c5605Dlk = c5615Dlu.A0c;
                dlU = new C5593DlT(context, handler, ddr, c5615Dlu.A0V, c5615Dlu.A0s, c5605Dlk, serviceEventCallbackImpl, dem, c5644DmY, map, atomicBoolean, atomicBoolean2, c5615Dlu.A0m);
            } else {
                Map<String, String> map2 = c5615Dlu.A0v;
                serviceEventCallbackImpl = c5615Dlu.A0D;
                DDR ddr2 = c5615Dlu.A0U;
                AtomicBoolean atomicBoolean3 = c5615Dlu.A0n;
                AtomicBoolean atomicBoolean4 = c5615Dlu.A0x;
                AtomicBoolean atomicBoolean5 = c5615Dlu.A0w;
                c5605Dlk = c5615Dlu.A0c;
                dlU = new DlU(context, ddr2, c5615Dlu.A0V, c5605Dlk, serviceEventCallbackImpl, map2, atomicBoolean3, atomicBoolean4, atomicBoolean5);
            }
        }
        c5615Dlu.A0H = dlU;
        if (c5615Dlu.A0k.enableStallTrackingPerChunk) {
            dlU.Aee(c5615Dlu.A0e.A22);
        }
        dlU.Ae3(new Object() { // from class: X.DuQ
        });
        Map<String, String> map3 = c5615Dlu.A0v;
        Handler handler2 = c5615Dlu.A0a;
        Dlw dlw = c5615Dlu.A0e;
        InterfaceC5665Dmu interfaceC5665Dmu = c5615Dlu.A0H;
        c5615Dlu.A0I = new HeroExoPlayer2InitHelper(context, handler2, c5615Dlu.A0r, dmR, c5605Dlk, dlw, c5615Dlu.A0W, serviceEventCallbackImpl, interfaceC5665Dmu, c5615Dlu.A0j, map3);
        c5615Dlu.A0M = interfaceC5665Dmu.AJU();
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r62v0 X.Dlu) */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0102 A[EDGE_INSN: B:181:0x0102->B:44:0x0102 BREAK  A[LOOP:0: B:39:0x00eb->B:183:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[Catch: all -> 0x03c9, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x0018, B:8:0x001c, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:15:0x0030, B:17:0x0036, B:24:0x0046, B:26:0x006c, B:28:0x0070, B:30:0x0074, B:31:0x0079, B:33:0x00b6, B:34:0x00ba, B:36:0x00db, B:38:0x00e3, B:39:0x00eb, B:41:0x00f1, B:43:0x00fd, B:44:0x0102, B:46:0x010d, B:47:0x011b, B:53:0x0132, B:55:0x013c, B:57:0x0144, B:59:0x014a, B:61:0x0156, B:62:0x015d, B:64:0x016b, B:66:0x016f, B:67:0x0175, B:98:0x0206, B:101:0x0210, B:103:0x0214, B:105:0x021a, B:108:0x0221, B:109:0x0224, B:111:0x022c, B:114:0x0233, B:115:0x0236, B:117:0x023e, B:120:0x0245, B:121:0x0248, B:123:0x0250, B:126:0x0257, B:127:0x025a, B:129:0x028e, B:130:0x029c, B:132:0x02a2, B:134:0x02a6, B:136:0x02ac, B:137:0x02b8, B:139:0x02be, B:141:0x02ce, B:142:0x02d4, B:144:0x02d8, B:146:0x02dc, B:148:0x02f5, B:150:0x030c, B:152:0x0325, B:153:0x0329, B:155:0x0332, B:156:0x0340, B:158:0x0344, B:159:0x034d, B:161:0x0351, B:162:0x035a, B:164:0x0360, B:167:0x037b, B:171:0x038b, B:173:0x03b8, B:172:0x03a3, B:166:0x0364, B:86:0x01d6, B:91:0x01ed, B:97:0x01fe, B:70:0x0186, B:72:0x018c, B:73:0x018e, B:78:0x019d, B:79:0x01aa, B:81:0x01b2, B:83:0x01ca, B:50:0x0122, B:51:0x0127, B:20:0x003c), top: B:179:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1 A[Catch: all -> 0x03c9, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x0018, B:8:0x001c, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:15:0x0030, B:17:0x0036, B:24:0x0046, B:26:0x006c, B:28:0x0070, B:30:0x0074, B:31:0x0079, B:33:0x00b6, B:34:0x00ba, B:36:0x00db, B:38:0x00e3, B:39:0x00eb, B:41:0x00f1, B:43:0x00fd, B:44:0x0102, B:46:0x010d, B:47:0x011b, B:53:0x0132, B:55:0x013c, B:57:0x0144, B:59:0x014a, B:61:0x0156, B:62:0x015d, B:64:0x016b, B:66:0x016f, B:67:0x0175, B:98:0x0206, B:101:0x0210, B:103:0x0214, B:105:0x021a, B:108:0x0221, B:109:0x0224, B:111:0x022c, B:114:0x0233, B:115:0x0236, B:117:0x023e, B:120:0x0245, B:121:0x0248, B:123:0x0250, B:126:0x0257, B:127:0x025a, B:129:0x028e, B:130:0x029c, B:132:0x02a2, B:134:0x02a6, B:136:0x02ac, B:137:0x02b8, B:139:0x02be, B:141:0x02ce, B:142:0x02d4, B:144:0x02d8, B:146:0x02dc, B:148:0x02f5, B:150:0x030c, B:152:0x0325, B:153:0x0329, B:155:0x0332, B:156:0x0340, B:158:0x0344, B:159:0x034d, B:161:0x0351, B:162:0x035a, B:164:0x0360, B:167:0x037b, B:171:0x038b, B:173:0x03b8, B:172:0x03a3, B:166:0x0364, B:86:0x01d6, B:91:0x01ed, B:97:0x01fe, B:70:0x0186, B:72:0x018c, B:73:0x018e, B:78:0x019d, B:79:0x01aa, B:81:0x01b2, B:83:0x01ca, B:50:0x0122, B:51:0x0127, B:20:0x003c), top: B:179:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d A[Catch: all -> 0x03c9, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x0018, B:8:0x001c, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:15:0x0030, B:17:0x0036, B:24:0x0046, B:26:0x006c, B:28:0x0070, B:30:0x0074, B:31:0x0079, B:33:0x00b6, B:34:0x00ba, B:36:0x00db, B:38:0x00e3, B:39:0x00eb, B:41:0x00f1, B:43:0x00fd, B:44:0x0102, B:46:0x010d, B:47:0x011b, B:53:0x0132, B:55:0x013c, B:57:0x0144, B:59:0x014a, B:61:0x0156, B:62:0x015d, B:64:0x016b, B:66:0x016f, B:67:0x0175, B:98:0x0206, B:101:0x0210, B:103:0x0214, B:105:0x021a, B:108:0x0221, B:109:0x0224, B:111:0x022c, B:114:0x0233, B:115:0x0236, B:117:0x023e, B:120:0x0245, B:121:0x0248, B:123:0x0250, B:126:0x0257, B:127:0x025a, B:129:0x028e, B:130:0x029c, B:132:0x02a2, B:134:0x02a6, B:136:0x02ac, B:137:0x02b8, B:139:0x02be, B:141:0x02ce, B:142:0x02d4, B:144:0x02d8, B:146:0x02dc, B:148:0x02f5, B:150:0x030c, B:152:0x0325, B:153:0x0329, B:155:0x0332, B:156:0x0340, B:158:0x0344, B:159:0x034d, B:161:0x0351, B:162:0x035a, B:164:0x0360, B:167:0x037b, B:171:0x038b, B:173:0x03b8, B:172:0x03a3, B:166:0x0364, B:86:0x01d6, B:91:0x01ed, B:97:0x01fe, B:70:0x0186, B:72:0x018c, B:73:0x018e, B:78:0x019d, B:79:0x01aa, B:81:0x01b2, B:83:0x01ca, B:50:0x0122, B:51:0x0127, B:20:0x003c), top: B:179:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0122 A[Catch: all -> 0x03c9, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x0018, B:8:0x001c, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:15:0x0030, B:17:0x0036, B:24:0x0046, B:26:0x006c, B:28:0x0070, B:30:0x0074, B:31:0x0079, B:33:0x00b6, B:34:0x00ba, B:36:0x00db, B:38:0x00e3, B:39:0x00eb, B:41:0x00f1, B:43:0x00fd, B:44:0x0102, B:46:0x010d, B:47:0x011b, B:53:0x0132, B:55:0x013c, B:57:0x0144, B:59:0x014a, B:61:0x0156, B:62:0x015d, B:64:0x016b, B:66:0x016f, B:67:0x0175, B:98:0x0206, B:101:0x0210, B:103:0x0214, B:105:0x021a, B:108:0x0221, B:109:0x0224, B:111:0x022c, B:114:0x0233, B:115:0x0236, B:117:0x023e, B:120:0x0245, B:121:0x0248, B:123:0x0250, B:126:0x0257, B:127:0x025a, B:129:0x028e, B:130:0x029c, B:132:0x02a2, B:134:0x02a6, B:136:0x02ac, B:137:0x02b8, B:139:0x02be, B:141:0x02ce, B:142:0x02d4, B:144:0x02d8, B:146:0x02dc, B:148:0x02f5, B:150:0x030c, B:152:0x0325, B:153:0x0329, B:155:0x0332, B:156:0x0340, B:158:0x0344, B:159:0x034d, B:161:0x0351, B:162:0x035a, B:164:0x0360, B:167:0x037b, B:171:0x038b, B:173:0x03b8, B:172:0x03a3, B:166:0x0364, B:86:0x01d6, B:91:0x01ed, B:97:0x01fe, B:70:0x0186, B:72:0x018c, B:73:0x018e, B:78:0x019d, B:79:0x01aa, B:81:0x01b2, B:83:0x01ca, B:50:0x0122, B:51:0x0127, B:20:0x003c), top: B:179:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127 A[Catch: all -> 0x03c9, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x0018, B:8:0x001c, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:15:0x0030, B:17:0x0036, B:24:0x0046, B:26:0x006c, B:28:0x0070, B:30:0x0074, B:31:0x0079, B:33:0x00b6, B:34:0x00ba, B:36:0x00db, B:38:0x00e3, B:39:0x00eb, B:41:0x00f1, B:43:0x00fd, B:44:0x0102, B:46:0x010d, B:47:0x011b, B:53:0x0132, B:55:0x013c, B:57:0x0144, B:59:0x014a, B:61:0x0156, B:62:0x015d, B:64:0x016b, B:66:0x016f, B:67:0x0175, B:98:0x0206, B:101:0x0210, B:103:0x0214, B:105:0x021a, B:108:0x0221, B:109:0x0224, B:111:0x022c, B:114:0x0233, B:115:0x0236, B:117:0x023e, B:120:0x0245, B:121:0x0248, B:123:0x0250, B:126:0x0257, B:127:0x025a, B:129:0x028e, B:130:0x029c, B:132:0x02a2, B:134:0x02a6, B:136:0x02ac, B:137:0x02b8, B:139:0x02be, B:141:0x02ce, B:142:0x02d4, B:144:0x02d8, B:146:0x02dc, B:148:0x02f5, B:150:0x030c, B:152:0x0325, B:153:0x0329, B:155:0x0332, B:156:0x0340, B:158:0x0344, B:159:0x034d, B:161:0x0351, B:162:0x035a, B:164:0x0360, B:167:0x037b, B:171:0x038b, B:173:0x03b8, B:172:0x03a3, B:166:0x0364, B:86:0x01d6, B:91:0x01ed, B:97:0x01fe, B:70:0x0186, B:72:0x018c, B:73:0x018e, B:78:0x019d, B:79:0x01aa, B:81:0x01b2, B:83:0x01ca, B:50:0x0122, B:51:0x0127, B:20:0x003c), top: B:179:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c A[Catch: all -> 0x03c9, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x0018, B:8:0x001c, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:15:0x0030, B:17:0x0036, B:24:0x0046, B:26:0x006c, B:28:0x0070, B:30:0x0074, B:31:0x0079, B:33:0x00b6, B:34:0x00ba, B:36:0x00db, B:38:0x00e3, B:39:0x00eb, B:41:0x00f1, B:43:0x00fd, B:44:0x0102, B:46:0x010d, B:47:0x011b, B:53:0x0132, B:55:0x013c, B:57:0x0144, B:59:0x014a, B:61:0x0156, B:62:0x015d, B:64:0x016b, B:66:0x016f, B:67:0x0175, B:98:0x0206, B:101:0x0210, B:103:0x0214, B:105:0x021a, B:108:0x0221, B:109:0x0224, B:111:0x022c, B:114:0x0233, B:115:0x0236, B:117:0x023e, B:120:0x0245, B:121:0x0248, B:123:0x0250, B:126:0x0257, B:127:0x025a, B:129:0x028e, B:130:0x029c, B:132:0x02a2, B:134:0x02a6, B:136:0x02ac, B:137:0x02b8, B:139:0x02be, B:141:0x02ce, B:142:0x02d4, B:144:0x02d8, B:146:0x02dc, B:148:0x02f5, B:150:0x030c, B:152:0x0325, B:153:0x0329, B:155:0x0332, B:156:0x0340, B:158:0x0344, B:159:0x034d, B:161:0x0351, B:162:0x035a, B:164:0x0360, B:167:0x037b, B:171:0x038b, B:173:0x03b8, B:172:0x03a3, B:166:0x0364, B:86:0x01d6, B:91:0x01ed, B:97:0x01fe, B:70:0x0186, B:72:0x018c, B:73:0x018e, B:78:0x019d, B:79:0x01aa, B:81:0x01b2, B:83:0x01ca, B:50:0x0122, B:51:0x0127, B:20:0x003c), top: B:179:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01aa A[Catch: all -> 0x03c9, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x0018, B:8:0x001c, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:15:0x0030, B:17:0x0036, B:24:0x0046, B:26:0x006c, B:28:0x0070, B:30:0x0074, B:31:0x0079, B:33:0x00b6, B:34:0x00ba, B:36:0x00db, B:38:0x00e3, B:39:0x00eb, B:41:0x00f1, B:43:0x00fd, B:44:0x0102, B:46:0x010d, B:47:0x011b, B:53:0x0132, B:55:0x013c, B:57:0x0144, B:59:0x014a, B:61:0x0156, B:62:0x015d, B:64:0x016b, B:66:0x016f, B:67:0x0175, B:98:0x0206, B:101:0x0210, B:103:0x0214, B:105:0x021a, B:108:0x0221, B:109:0x0224, B:111:0x022c, B:114:0x0233, B:115:0x0236, B:117:0x023e, B:120:0x0245, B:121:0x0248, B:123:0x0250, B:126:0x0257, B:127:0x025a, B:129:0x028e, B:130:0x029c, B:132:0x02a2, B:134:0x02a6, B:136:0x02ac, B:137:0x02b8, B:139:0x02be, B:141:0x02ce, B:142:0x02d4, B:144:0x02d8, B:146:0x02dc, B:148:0x02f5, B:150:0x030c, B:152:0x0325, B:153:0x0329, B:155:0x0332, B:156:0x0340, B:158:0x0344, B:159:0x034d, B:161:0x0351, B:162:0x035a, B:164:0x0360, B:167:0x037b, B:171:0x038b, B:173:0x03b8, B:172:0x03a3, B:166:0x0364, B:86:0x01d6, B:91:0x01ed, B:97:0x01fe, B:70:0x0186, B:72:0x018c, B:73:0x018e, B:78:0x019d, B:79:0x01aa, B:81:0x01b2, B:83:0x01ca, B:50:0x0122, B:51:0x0127, B:20:0x003c), top: B:179:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d6 A[Catch: all -> 0x03c9, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x0018, B:8:0x001c, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:15:0x0030, B:17:0x0036, B:24:0x0046, B:26:0x006c, B:28:0x0070, B:30:0x0074, B:31:0x0079, B:33:0x00b6, B:34:0x00ba, B:36:0x00db, B:38:0x00e3, B:39:0x00eb, B:41:0x00f1, B:43:0x00fd, B:44:0x0102, B:46:0x010d, B:47:0x011b, B:53:0x0132, B:55:0x013c, B:57:0x0144, B:59:0x014a, B:61:0x0156, B:62:0x015d, B:64:0x016b, B:66:0x016f, B:67:0x0175, B:98:0x0206, B:101:0x0210, B:103:0x0214, B:105:0x021a, B:108:0x0221, B:109:0x0224, B:111:0x022c, B:114:0x0233, B:115:0x0236, B:117:0x023e, B:120:0x0245, B:121:0x0248, B:123:0x0250, B:126:0x0257, B:127:0x025a, B:129:0x028e, B:130:0x029c, B:132:0x02a2, B:134:0x02a6, B:136:0x02ac, B:137:0x02b8, B:139:0x02be, B:141:0x02ce, B:142:0x02d4, B:144:0x02d8, B:146:0x02dc, B:148:0x02f5, B:150:0x030c, B:152:0x0325, B:153:0x0329, B:155:0x0332, B:156:0x0340, B:158:0x0344, B:159:0x034d, B:161:0x0351, B:162:0x035a, B:164:0x0360, B:167:0x037b, B:171:0x038b, B:173:0x03b8, B:172:0x03a3, B:166:0x0364, B:86:0x01d6, B:91:0x01ed, B:97:0x01fe, B:70:0x0186, B:72:0x018c, B:73:0x018e, B:78:0x019d, B:79:0x01aa, B:81:0x01b2, B:83:0x01ca, B:50:0x0122, B:51:0x0127, B:20:0x003c), top: B:179:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A0E(X.DmR r61, final X.C5615Dlu r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5615Dlu.A0E(X.DmR, X.Dlu, boolean):void");
    }

    public static void A0F(C5615Dlu c5615Dlu) {
        c5615Dlu.A10++;
        InterfaceC6009Dts interfaceC6009Dts = c5615Dlu.A07;
        InterfaceC5369DhL interfaceC5369DhL = c5615Dlu.A0A;
        c5615Dlu.A07 = null;
        c5615Dlu.A0A = null;
        if (interfaceC6009Dts != null && interfaceC5369DhL != null) {
            interfaceC6009Dts.Aap(interfaceC5369DhL);
        }
        DlZ dlZ = c5615Dlu.A0G;
        if (dlZ != null) {
            dlZ.A07 = -9223372036854775807L;
        }
    }

    public static void A0G(C5615Dlu c5615Dlu) {
        C5672DnA c5672DnA = c5615Dlu.A0J;
        if (c5672DnA != null) {
            InterfaceC5661Dmq interfaceC5661Dmq = c5615Dlu.A04;
            DmR dmR = c5615Dlu.A0C;
            InterfaceC6009Dts interfaceC6009Dts = c5615Dlu.A06;
            c5672DnA.A09 = interfaceC5661Dmq;
            c5672DnA.A0B = dmR;
            c5672DnA.A0A = interfaceC6009Dts;
        }
    }

    public static void A0H(C5615Dlu c5615Dlu) {
        C5610Dlp c5610Dlp = c5615Dlu.A0K;
        if (c5610Dlp != null) {
            c5610Dlp.A06.A06();
        }
        c5615Dlu.A0K = null;
        C5437DiY c5437DiY = c5615Dlu.A0B;
        c5437DiY.A0J.set(null);
        c5437DiY.A0F.set(-9223372036854775807L);
    }

    public static void A0I(C5615Dlu c5615Dlu) {
        int i = c5615Dlu.A0k.playbackAboutToFinishCallbackTriggeringRemainingDuration;
        if (i <= 0) {
            i = 2000;
        }
        long duration = c5615Dlu.A04.getDuration() - i;
        if (duration > c5615Dlu.A04.getDuration()) {
            duration = BV6.A0I(c5615Dlu.A04.getDuration());
        }
        InterfaceC5661Dmq interfaceC5661Dmq = c5615Dlu.A04;
        C5727DoM c5727DoM = new C5727DoM(c5615Dlu);
        C6438E5q c6438E5q = (C6438E5q) interfaceC5661Dmq;
        C6438E5q.A0J(c6438E5q);
        C6322E0x c6322E0xA0D = C6438E5q.A0D(c6438E5q, c5727DoM);
        C1G.A08(!c6322E0xA0D.A07);
        c6322E0xA0D.A02 = duration;
        c6322E0xA0D.A01();
    }

    public static void A0J(C5615Dlu c5615Dlu) {
        if (c5615Dlu.A0k.gen.enable_moq_media_source) {
            C5850Dqk c5850Dqk = c5615Dlu.A0N;
            if (c5850Dqk != null) {
                c5850Dqk.A01 = new C5987DtU(c5850Dqk.A00);
            }
            Log.i("MoqRate", FGI.A0U("rate control for this stream: ", "default", c5850Dqk != null ? " (v2)" : " (v1)"));
        }
    }

    public static void A0K(C5615Dlu c5615Dlu, long j) {
        DmR dmR;
        HeroPlayerSetting heroPlayerSetting = c5615Dlu.A0k;
        if ((!heroPlayerSetting.isExo2UseAbsolutePosition || (heroPlayerSetting.shouldExcludeAbsolutePositionForClippingMediaSource && (dmR = c5615Dlu.A0C) != null && (dmR.A0F != -1 || dmR.A0E != -1))) && heroPlayerSetting.enableBackwardJumpSeekKeyframeSync) {
            boolean zA1N = AnonymousClass002.A1N((c5615Dlu.A04.getCurrentPosition() > j ? 1 : (c5615Dlu.A04.getCurrentPosition() == j ? 0 : -1)));
            long jA0J = BV6.A0J(c5615Dlu.A04.getCurrentPosition(), j);
            boolean z = jA0J > 8000 && jA0J < 12000;
            int i = heroPlayerSetting.seekParameterOptionIndex;
            if (i >= 0) {
                DpX[] dpXArr = A15;
                if (i < 3 && zA1N && z) {
                    c5615Dlu.A04.Aec(dpXArr[i]);
                }
            }
        }
        AbstractC5797Dph abstractC5797Dph = (AbstractC5797Dph) c5615Dlu.A04;
        abstractC5797Dph.A0Q(j, abstractC5797Dph.AEU());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Class<meta.androidx.media3.exoplayer.mediacodec.MediaCodecRenderer2$DecoderInitializationException>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.media3.common.PlaybackException] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0N(androidx.media3.common.PlaybackException r4) {
        /*
            int r1 = r4.errorCode
            r0 = 4001(0xfa1, float:5.607E-42)
            r3 = 1
            r2 = 0
            if (r1 != r0) goto L22
            r1 = r4
        L9:
            boolean r0 = r1 instanceof meta.androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException
            if (r0 != 0) goto L49
            java.lang.Throwable r1 = r1.getCause()
            if (r1 != 0) goto L9
            java.lang.Class<meta.androidx.media3.exoplayer.mediacodec.MediaCodecRenderer2$DecoderInitializationException> r1 = meta.androidx.media3.exoplayer.mediacodec.MediaCodecRenderer2$DecoderInitializationException.class
        L15:
            boolean r0 = r1.isInstance(r4)
            if (r0 != 0) goto L49
            java.lang.Throwable r4 = r4.getCause()
            if (r4 == 0) goto L34
            goto L15
        L22:
            r0 = 4003(0xfa3, float:5.61E-42)
            if (r1 != r0) goto L34
            r1 = r4
        L27:
            boolean r0 = r1 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L35
            r0 = r1
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            boolean r0 = r0.isRecoverable()
            if (r0 == 0) goto L35
        L34:
            return r2
        L35:
            java.lang.Throwable r1 = r1.getCause()
            if (r1 != 0) goto L27
            r1 = r4
        L3c:
            boolean r0 = r1 instanceof meta.androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException
            if (r0 != 0) goto L49
            java.lang.Throwable r1 = r1.getCause()
            if (r1 != 0) goto L3c
            java.lang.Class<android.media.MediaCodec$CodecException> r1 = android.media.MediaCodec.CodecException.class
            goto L15
        L49:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5615Dlu.A0N(androidx.media3.common.PlaybackException):boolean");
    }

    public static boolean A0O(C6322E0x c6322E0x, long j) {
        String str;
        boolean z;
        try {
            if (j > 0) {
                synchronized (c6322E0x) {
                    try {
                        C1G.A08(c6322E0x.A07);
                        C1G.A08(AnonymousClass006.A1Z(c6322E0x.A03.getThread(), Thread.currentThread()));
                        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
                        while (!c6322E0x.A06) {
                            if (j <= 0) {
                                throw new TimeoutException("Message delivery timed out.");
                            }
                            c6322E0x.wait(j);
                            j = C3cH.A04(jElapsedRealtime);
                        }
                        z = c6322E0x.A05;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return z;
            }
            synchronized (c6322E0x) {
                try {
                    C1G.A08(c6322E0x.A07);
                    C1G.A08(AnonymousClass006.A1Z(c6322E0x.A03.getThread(), Thread.currentThread()));
                    while (!c6322E0x.A06) {
                        c6322E0x.wait();
                    }
                    z = c6322E0x.A05;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z;
        } catch (IllegalStateException e) {
            e = e;
            str = "Surface push cannot block on the playback thread";
            BV6.A1J(str, "HeroService", e, new Object[0]);
            return false;
        } catch (InterruptedException unused) {
            BV4.A1A();
            return false;
        } catch (TimeoutException e2) {
            e = e2;
            str = "Surface push timed out";
            BV6.A1J(str, "HeroService", e, new Object[0]);
            return false;
        }
    }

    public static boolean A0P(C6137Dwf c6137Dwf, C4904DDx c4904DDx) {
        List<SubtitleConfiguration> list = c4904DDx.A0R;
        if (list == null) {
            return false;
        }
        for (SubtitleConfiguration subtitleConfiguration : list) {
            if (subtitleConfiguration.A03) {
                String str = subtitleConfiguration.A01;
                c6137Dwf.A0S = str == null;
                c6137Dwf.A06(str == null ? new String[0] : new String[]{str});
                return true;
            }
        }
        return BV6.A1b(list);
    }

    public static boolean A0Q(DmR dmR, C5615Dlu c5615Dlu) {
        HeroPlayerSetting heroPlayerSetting = c5615Dlu.A0k;
        return heroPlayerSetting.gen.enable_scrubbing_mode && !(dmR != null && dmR.A03.A05() && heroPlayerSetting.gen.disable_smooth_scrubber_for_vp9);
    }

    public final int A0R(int i) {
        return this.A08.A0E().A01.get(i) ? -1 : 0;
    }

    public final long A0S() {
        DlZ dlZ = this.A0G;
        C5580Dky c5580Dky = dlZ != null ? dlZ.A03 : null;
        long jMax = 0;
        if (c5580Dky != null) {
            List<C5585DlC> list = c5580Dky.A0R;
            if (list.size() != 0) {
                Iterator itA05 = C5580Dky.A05(c5580Dky, list.size() - 1);
                while (itA05.hasNext()) {
                    Dl9 dl9A0b = BV6.A0b(itA05);
                    int i = dl9A0b.A06;
                    if (i == 2 || i == 1) {
                        Iterator itA02 = Dl9.A02(dl9A0b);
                        while (itA02.hasNext()) {
                            AbstractC5553DkW abstractC5553DkWA0d = BV6.A0d(itA02);
                            jMax = Math.max(jMax, abstractC5553DkWA0d instanceof C5555DkY ? 0L : ((C5582Dl1) abstractC5553DkWA0d).A00.A03);
                        }
                    }
                }
            }
        }
        return jMax;
    }

    public final void A0T() {
        InterfaceC5661Dmq interfaceC5661Dmq;
        Object c6000Dtj;
        if (this.A06 != null) {
            this.A0C.A0K.isEmpty();
            DmR dmR = this.A0C;
            int i = dmR.A0F;
            if (i == -1 && dmR.A0E == -1) {
                interfaceC5661Dmq = this.A04;
                c6000Dtj = this.A06;
            } else {
                long j = i != -1 ? i * 1000 : 0L;
                int i2 = dmR.A0E;
                long j2 = i2 != -1 ? i2 * 1000 : -9223372036854775807L;
                interfaceC5661Dmq = this.A04;
                InterfaceC6009Dts interfaceC6009Dts = this.A06;
                interfaceC6009Dts.getClass();
                C1G.A07(C8j3.A1Q((j > 0L ? 1 : (j == 0L ? 0 : -1))));
                c6000Dtj = new C6000Dtj(interfaceC6009Dts, j2, j, false, false, true, false);
            }
            C6438E5q c6438E5q = (C6438E5q) interfaceC5661Dmq;
            C6438E5q.A0J(c6438E5q);
            C6438E5q.A0J(c6438E5q);
            C6438E5q.A0P(c6438E5q, Collections.singletonList(c6000Dtj), false);
            c6438E5q.prepare();
        }
    }

    public final void A0U(final float f) {
        C5639DmO c5639DmO = this.A0k.exoPlayerUpgradeSetting;
        if (c5639DmO != null) {
            if (c5639DmO.media3FrameRateStrategyOnSpeedChange || c5639DmO.media3FrameRateVoteAlwaysOn) {
                final boolean z = c5639DmO.media3FrameRateVoteAlwaysOn;
                Looper looperA01 = AbstractC5797Dph.A01(this);
                if (looperA01 != null) {
                    BV4.A09(looperA01).post(new Runnable() { // from class: X.Do3
                        public static final String __redex_internal_original_name = "HeroExoPlayer2$$ExternalSyntheticLambda24";

                        /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                r4 = this;
                                X.Dlu r0 = r4.A01
                                boolean r3 = r3
                                float r4 = r2
                                X.Doc r0 = r0.A0i
                                X.Dv6[] r1 = r0.A00
                                int r0 = r1.length
                                if (r0 <= 0) goto L48
                                r0 = 0
                                r2 = r1[r0]
                                if (r2 == 0) goto L48
                                if (r3 != 0) goto L1c
                                r0 = 1065353216(0x3f800000, float:1.0)
                                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                if (r0 == 0) goto L1d
                            L1c:
                                r3 = 0
                            L1d:
                                r2.Ae2(r4, r4)     // Catch: java.lang.Exception -> L3a
                                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L3a
                                r0 = 5
                                r2.AN4(r0, r1)     // Catch: java.lang.Exception -> L3a
                                java.lang.String r2 = "SpeedPropagation: media3 frame-rate strategy=%s at speed=%s"
                                java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L3a
                                java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L3a
                                java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch: java.lang.Exception -> L3a
                                X.AbstractC5718DoA.A02(r2, r0)     // Catch: java.lang.Exception -> L3a
                                return
                            L3a:
                                r0 = move-exception
                                java.lang.String r0 = r0.toString()
                                java.lang.Object[] r1 = new java.lang.Object[]{r0}
                                java.lang.String r0 = "SpeedPropagation: media3 frame-rate handoff failed: %s"
                                X.AbstractC5718DoA.A02(r0, r1)
                            L48:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC5717Do3.run():void");
                        }
                    });
                }
            }
        }
    }

    public final void A0W(float f, float f2) {
        C6233Dyb c6233Dyb = new C6233Dyb(f, f2);
        this.A04.Ae1(c6233Dyb);
        C5750Dol c5750Dol = this.A0M;
        if (c5750Dol != null) {
            c5750Dol.A04(c6233Dyb);
        }
        this.A03 = c6233Dyb;
    }

    public final void A0Y(long j, boolean z) {
        InterfaceC5661Dmq interfaceC5661Dmq;
        DpX dpX;
        if (!z) {
            DmR dmR = this.A0C;
            if (dmR != null && dmR.A03.A03() && !this.A0k.skipAV1PreviousKeyFrameSeek) {
                interfaceC5661Dmq = this.A04;
                dpX = DpX.A06;
            }
            AbstractC5797Dph abstractC5797Dph = (AbstractC5797Dph) this.A04;
            abstractC5797Dph.A0Q(j, abstractC5797Dph.AEU());
        }
        interfaceC5661Dmq = this.A04;
        dpX = DpX.A04;
        interfaceC5661Dmq.Aec(dpX);
        AbstractC5797Dph abstractC5797Dph2 = (AbstractC5797Dph) this.A04;
        abstractC5797Dph2.A0Q(j, abstractC5797Dph2.AEU());
    }

    public final void A0Z(long j, boolean z) {
        InterfaceC5661Dmq interfaceC5661Dmq;
        DpX dpX;
        DmR dmR = this.A0C;
        if (dmR == null || ((!dmR.A03.A03() || this.A0k.skipAV1PreviousKeyFrameSeek) && !(this.A0k.isFeedVideoScrubberEnabled && (C6xC.A00(this.A0C.A03.A0F, "feed_timeline") || C6xC.A00(this.A0C.A03.A0F, "feed_contextual_chain") || C6xC.A00(this.A0C.A03.A0F, "feed_contextual_self_profile"))))) {
            interfaceC5661Dmq = this.A04;
            dpX = z ? this.A0q : DpX.A03;
        } else {
            interfaceC5661Dmq = this.A04;
            dpX = DpX.A06;
        }
        interfaceC5661Dmq.Aec(dpX);
        A0K(this, j);
    }

    public final void A0a(C5621Dm4 c5621Dm4) {
        List list = this.A0l;
        if (list.isEmpty()) {
            DlZ dlZ = new DlZ(this);
            this.A0G = dlZ;
            ((C6438E5q) this.A04).A0j.A04(dlZ);
        }
        list.add(c5621Dm4);
    }

    public final void A0b(boolean z) {
        Handler handler;
        boolean z2;
        if (z && this.A0k.gen.reset_stream_error_on_unpause) {
            for (InterfaceC6068Dv6 interfaceC6068Dv6 : this.A0i.A00) {
                if (interfaceC6068Dv6 instanceof C5620Dm3) {
                    ((C5620Dm3) interfaceC6068Dv6).A0L.A00 = -9223372036854775807L;
                }
            }
            this.A0H.AbR();
        }
        DEM dem = this.A0j;
        if (dem != null && this.A0k.gen.mark_stale_live_trace_frames_cached) {
            if (z) {
                if (this.A0X) {
                    dem.A08.incrementAndGet();
                    z2 = false;
                    this.A0X = z2;
                }
            } else if (AbstractC5797Dph.A04(this).A0E) {
                z2 = true;
                this.A0X = z2;
            }
        }
        C6438E5q c6438E5q = (C6438E5q) this.A04;
        C6438E5q.A0J(c6438E5q);
        C6438E5q.A0L(c6438E5q, 1, z);
        if (z) {
            C5437DiY c5437DiY = this.A0B;
            if (c5437DiY.A0Q) {
                synchronized (c5437DiY) {
                    c5437DiY.A0Q = false;
                    c5437DiY.A01 = -1L;
                    c5437DiY.A04 = -1L;
                    c5437DiY.A02 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                    c5437DiY.A05 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                }
            }
        }
        InterfaceC6009Dts interfaceC6009Dts = this.A06;
        if (interfaceC6009Dts instanceof C5358Dh3) {
            C5358Dh3 c5358Dh3 = (C5358Dh3) interfaceC6009Dts;
            c5358Dh3.A0J = z;
            C5423DiJ c5423DiJ = c5358Dh3.A0S;
            long j = c5423DiJ.A0J;
            if (j <= 0 || (handler = c5358Dh3.A08) == null) {
                return;
            }
            Runnable runnable = c5358Dh3.A0V;
            if (!z) {
                handler.postDelayed(runnable, j);
                return;
            }
            handler.removeCallbacks(runnable);
            if (!c5423DiJ.A18 || c5358Dh3.A0G) {
                RunnableC5360Dh5 runnableC5360Dh5 = c5358Dh3.A0T;
                runnableC5360Dh5.A00 = "on_play_when_ready_changed";
                c5358Dh3.A08.post(runnableC5360Dh5);
            }
        }
    }

    public final boolean A0c() {
        InterfaceC5661Dmq interfaceC5661Dmq;
        if (this.A0Y || this.A0C == null || this.A08 == null || (interfaceC5661Dmq = this.A04) == null) {
            return false;
        }
        for (C5951Dsl c5951Dsl : AbstractC5797Dph.A03((C6438E5q) interfaceC5661Dmq).A0B.A03) {
            if (c5951Dsl != null && c5951Dsl.A00) {
                return true;
            }
        }
        return false;
    }

    public static long A01(C5615Dlu c5615Dlu) {
        int iAEV;
        Timeline timeline = AbstractC5797Dph.A04(c5615Dlu).A06;
        if (AnonymousClass002.A1M(timeline.A02()) || (iAEV = c5615Dlu.A04.AEV()) == -1 || iAEV >= timeline.A01()) {
            return -9223372036854775807L;
        }
        return Util.A0B(timeline.A0D(c5615Dlu.A0b, iAEV, false).A01);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    public static String A08(C5580Dky c5580Dky) {
        String str;
        ?? A01 = Dl2.A01(c5580Dky);
        if (A01 == 0 || A01.size() != 1 || (str = ((AbstractC5553DkW) BV6.A0m(A01)).A03.A0a) == null) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5615Dlu(android.content.Context r16, android.os.Handler r17, X.DDR r18, X.DEY r19, X.C6134Dwc r20, X.C5437DiY r21, X.DmR r22, X.C5605Dlk r23, X.C5895Drc r24, X.Dlw r25, X.C5619Dm2 r26, com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r27, X.C5668Dmx r28, X.C5917Ds1 r29, java.util.Map r30, java.util.concurrent.atomic.AtomicBoolean r31, java.util.concurrent.atomic.AtomicBoolean r32, java.util.concurrent.atomic.AtomicBoolean r33, java.util.concurrent.atomic.AtomicReference r34) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5615Dlu.<init>(android.content.Context, android.os.Handler, X.DDR, X.DEY, X.Dwc, X.DiY, X.DmR, X.Dlk, X.Drc, X.Dlw, X.Dm2, com.facebook.video.heroplayer.service.ServiceEventCallbackImpl, X.Dmx, X.Ds1, java.util.Map, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicReference):void");
    }
}
