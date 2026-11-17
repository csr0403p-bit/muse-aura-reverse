package X;

import android.os.SystemClock;
import com.facebook.aura.common.video.HatchVideoPlayerBackgroundEventProcessor;
import com.facebook.aura.common.video.HatchVideoPlayerMetadataProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.DmE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5630DmE implements InterfaceC5756Dor {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public InterfaceC6058Dut A04;
    public C5723DoI A05;
    public C5723DoI A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final HatchVideoPlayerBackgroundEventProcessor A0A;
    public final InterfaceC5724DoJ A0B;
    public final Dn4 A0C;
    public final C5646Dma A0D;
    public final C5654Dmi A0E;
    public final C5699Dng A0F;
    public final ConcurrentLinkedQueue<C5841DqX> A0G;
    public final AtomicBoolean A0H;
    public final AtomicBoolean A0I;
    public final AtomicBoolean A0J;
    public final AtomicReference<Runnable> A0K;
    public final F0C A0L;
    public final C8ee<?> A0M;
    public final C5674DnC A0N;
    public final AtomicBoolean A0O;
    public final AtomicLong A0P;
    public final AtomicReference<String> A0Q;
    public volatile HatchVideoPlayerMetadataProvider A0R;
    public volatile C5700Dnh A0S;
    public volatile Boolean A0T;
    public volatile Boolean A0U;

    public C5630DmE(C8ee c8ee, HatchVideoPlayerBackgroundEventProcessor hatchVideoPlayerBackgroundEventProcessor, InterfaceC5724DoJ interfaceC5724DoJ, C5646Dma c5646Dma, C5699Dng c5699Dng) {
        C7384Etj.A0Y(c8ee, 0);
        this.A0M = c8ee;
        this.A0F = c5699Dng;
        this.A0A = hatchVideoPlayerBackgroundEventProcessor;
        this.A0B = interfaceC5724DoJ;
        this.A0D = c5646Dma;
        this.A0L = AbstractC5321DgF.A01(C79.A0C, this, 15);
        this.A0N = new C5674DnC();
        this.A0I = BV4.A12(false);
        this.A0P = BV5.A19();
        this.A0O = BV4.A12(false);
        this.A0E = new C5654Dmi(c5699Dng);
        this.A0C = new Dn4(new EZ7(this, 4));
        this.A0G = new ConcurrentLinkedQueue<>();
        this.A0J = BV4.A12(false);
        this.A0K = BV5.A1A();
        this.A0H = BV4.A12(false);
        this.A01 = -1L;
        this.A0Q = BV4.A15();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C5962Dsy r14, X.C5630DmE r15, java.lang.String r16, boolean r17) {
        /*
            r9 = r14
            if (r14 == 0) goto L11
            java.lang.String r11 = A01(r15)
            r0 = r16
            if (r16 == 0) goto L12
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L12
        L11:
            return
        L12:
            X.Dma r1 = r15.A0D
            X.Dnh r0 = r15.A0S
            X.Dnh r8 = r1.A00(r0, r11)
            X.DoJ r0 = r15.A0B
            X.DmA r0 = (X.C5627DmA) r0
            long r12 = X.BV7.A0U(r0)
            X.Dmi r6 = r15.A0E
            X.AIa r7 = new X.AIa
            r7.<init>()
            java.lang.String[] r5 = X.AbstractC5651Dmf.A00
            r4 = 15
            r3 = 0
        L2e:
            r1 = r5[r3]
            java.util.Map<java.lang.String, java.lang.Object> r0 = r14.A00
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L3f
            java.lang.String r0 = r0.toString()
            r7.put(r1, r0)
        L3f:
            int r3 = r3 + 1
            if (r3 < r4) goto L2e
            X.AIa r1 = X.AIW.A0K(r7)
            X.Dng r0 = r6.A00
            boolean r0 = r0.mEnablePlaybackStateQplLogger
            if (r0 == 0) goto L62
            java.util.Iterator r1 = X.AnonymousClass002.A0n(r1)
        L51:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L62
            java.util.Map$Entry r0 = X.C3cH.A0l(r1)
            r0.getKey()
            r0.getValue()
            goto L51
        L62:
            if (r8 != 0) goto L86
            if (r17 == 0) goto L11
            X.Dng r1 = r15.A0F
            boolean r0 = r1.mEnableMoveOffListenerDispatcher
            if (r0 == 0) goto L75
            X.DpT r0 = r1.gen
            if (r0 == 0) goto L75
            boolean r0 = r0.snapl_merge_initial_tag_metadata
            r1 = 1
            if (r0 != 0) goto L76
        L75:
            r1 = 0
        L76:
            com.facebook.aura.common.video.HatchVideoPlayerMetadataProvider r0 = r15.A0R
            if (r1 == 0) goto L80
            if (r0 == 0) goto L11
            r0.mergeInitialTagMetadata(r11, r14)
            return
        L80:
            if (r0 == 0) goto L11
            r0.m371setInitialTagMetadata(r11, r14)
            return
        L86:
            long r14 = r15.A03
            long r16 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r10 = "tags_changed"
            r8.A04(r9, r10, r11, r12, r14, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5630DmE.A03(X.Dsy, X.DmE, java.lang.String, boolean):void");
    }

    public static final void A04(HatchVideoPlayerMetadataProvider hatchVideoPlayerMetadataProvider, InterfaceC6058Dut interfaceC6058Dut, C5630DmE c5630DmE, String str, long j) {
        Boolean boolValueOf;
        Object obj;
        C5963Dsz requiredMetadata = hatchVideoPlayerMetadataProvider.getRequiredMetadata();
        String strA01 = c5630DmE.A0N.A01(requiredMetadata, j);
        C8ee<?> c8ee = c5630DmE.A0M;
        C5699Dng c5699Dng = c5630DmE.A0F;
        C5674DnC.A00(c8ee, requiredMetadata, c5699Dng, "client_metadata_provider_setup", strA01);
        HatchVideoPlayerBackgroundEventProcessor hatchVideoPlayerBackgroundEventProcessor = c5630DmE.A0A;
        C5943Dsd c5943Dsd = new C5943Dsd();
        c5943Dsd.A00 = requiredMetadata;
        c5943Dsd.A01 = new C5674DnC();
        c5943Dsd.A02 = c5699Dng;
        C5700Dnh c5700Dnh = new C5700Dnh(requiredMetadata, hatchVideoPlayerBackgroundEventProcessor, interfaceC6058Dut, new E1C(c8ee, c5943Dsd), c5699Dng, j);
        boolean z = c5699Dng.gen.enable_reuse_session_logger_instance;
        C5646Dma c5646Dma = c5630DmE.A0D;
        AtomicReference<String> atomicReference = c5646Dma.A03;
        if (z) {
            atomicReference.set(str);
            c5646Dma.A01.put(str, c5700Dnh);
        } else {
            atomicReference.set(str);
            HatchVideoPlayerBackgroundEventProcessor hatchVideoPlayerBackgroundEventProcessor2 = c5646Dma.A00;
            C5943Dsd c5943Dsd2 = new C5943Dsd();
            c5943Dsd2.A00 = requiredMetadata;
            c5943Dsd2.A01 = new C5674DnC();
            c5943Dsd2.A02 = c5699Dng;
            c5646Dma.A01.put(str, new C5700Dnh(requiredMetadata, hatchVideoPlayerBackgroundEventProcessor2, interfaceC6058Dut, new E1C(c8ee, c5943Dsd2), c5699Dng, j));
        }
        C5700Dnh c5700Dnh2 = c5630DmE.A0S;
        C5673DnB c5673DnB = c5700Dnh2 instanceof C5673DnB ? (C5673DnB) c5700Dnh2 : null;
        c5630DmE.A0S = c5700Dnh;
        long j2 = c5699Dng.mHeartbeatDelayMsForOrganic;
        if (!c5699Dng.mEnableHeartbeat || j2 == -1) {
            c5646Dma.A01();
        } else {
            Runnable runnableC5944Dse = (c5699Dng.mEnableWeakReferenceInHeartbeatRunnable || c5699Dng.mFixLeakInPlayerListener) ? (Runnable) c5630DmE.A0L.getValue() : new RunnableC5944Dse(c5630DmE);
            C7384Etj.A0Y(runnableC5944Dse, 2);
            hatchVideoPlayerBackgroundEventProcessor.executeWithDelay(j2, runnableC5944Dse);
        }
        c5630DmE.A03 = 0L;
        c5630DmE.A06 = null;
        c5630DmE.A05 = null;
        C5962Dsy initialTagMetadata = hatchVideoPlayerMetadataProvider.getInitialTagMetadata(str);
        if (initialTagMetadata != null) {
            AbstractC8150FWo.A02(initialTagMetadata, "playback_is_first_video", Boolean.valueOf(C3cI.A1W(c5646Dma.A02)));
        }
        if (initialTagMetadata != null) {
            AbstractC8150FWo.A02(initialTagMetadata, "is_initial_tag_metadata", true);
        }
        Dn4 dn4 = c5630DmE.A0C;
        synchronized (dn4) {
            boolValueOf = str.equals(dn4.A03) ? Boolean.valueOf(dn4.A04) : null;
        }
        Boolean bool = true;
        if (bool.equals(boolValueOf) && initialTagMetadata != null) {
            initialTagMetadata.A00.put("moq_to_pdash_fallback", bool);
        }
        c5630DmE.A0K(initialTagMetadata);
        String strA012 = A01(c5630DmE);
        C5700Dnh c5700DnhA00 = c5646Dma.A00(c5630DmE.A0S, strA012);
        if (c5700DnhA00 != null) {
            String str2 = c5699Dng.mEnableStartState ? c5646Dma.A02(c5630DmE.A02, false) ? "started" : "unpaused" : null;
            long j3 = c5630DmE.A03;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C5627DmA c5627DmA = (C5627DmA) c5630DmE.A0B;
            c5700DnhA00.A02(null, null, null, null, null, null, null, null, null, null, Long.valueOf(c5627DmA.A07.A0a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "prepare_started", strA012, str2, null, null, String.valueOf(c5627DmA.A07.A0a), null, null, null, 0L, j3, jElapsedRealtime, false);
            C5654Dmi.A00(EnumC5667Dmw.A0A, c5630DmE.A0E, strA012);
        }
        if (c5673DnB != null) {
            synchronized (c5673DnB) {
                List<G0U<C5700Dnh, Unit>> list = c5673DnB.A01;
                Iterator<G0U<C5700Dnh, Unit>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().invoke(c5700Dnh);
                }
                list.clear();
                c5673DnB.A00 = c5700Dnh;
            }
        }
        C5654Dmi c5654Dmi = c5630DmE.A0E;
        C5963Dsz requiredMetadata2 = hatchVideoPlayerMetadataProvider.getRequiredMetadata();
        if (requiredMetadata2 != null && (obj = requiredMetadata2.A00.get("pre_processing_media_id")) != null) {
            obj.toString();
        }
        if (initialTagMetadata != null) {
            C0924AIa c0924AIa = new C0924AIa();
            String[] strArr = AbstractC5651Dmf.A00;
            int i = 0;
            do {
                String str3 = strArr[i];
                Object obj2 = initialTagMetadata.A00.get(str3);
                if (obj2 != null) {
                    c0924AIa.put(str3, obj2.toString());
                }
                i++;
            } while (i < 15);
            C0924AIa c0924AIaA0K = AIW.A0K(c0924AIa);
            if (c5654Dmi.A00.mEnablePlaybackStateQplLogger) {
                Iterator itA0n = AnonymousClass002.A0n(c0924AIaA0K);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    entryA0l.getKey();
                    entryA0l.getValue();
                }
            }
        }
    }

    public final void A0K(C5962Dsy c5962Dsy) {
        A03(c5962Dsy, this, null, true);
    }

    @Override // X.InterfaceC5756Dor
    public final void ASV(String str, boolean z, long j) {
        C7384Etj.A0Y(str, 0);
        if (z) {
            C5654Dmi c5654Dmi = this.A0E;
            String strA01 = A01(this);
            if (c5654Dmi.A00.mEnablePlaybackStateQplLogger) {
                C5654Dmi.A00(EnumC5667Dmw.A04, c5654Dmi, strA01);
            }
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AT7(C5790DpZ c5790DpZ, String str, String str2, String str3, long j) {
        AnonymousClass002.A1C(str2, 3, str3);
        if (this.A0F.mEnableMoveOffListenerDispatcher) {
            return;
        }
        A02(EnumC7422Eva.UNKNOWN, EnumC7497EyC.UNKNOWN, this, c5790DpZ, str3, str2);
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ATQ() {
    }

    @Override // X.InterfaceC5756Dor
    public final void ATq(byte[] bArr, String str, long j, long j2) {
    }

    @Override // X.InterfaceC5756Dor
    public final void ATs(C5841DqX c5841DqX) {
        if (A0J(this, c5841DqX, 0)) {
            return;
        }
        this.A0G.offer(c5841DqX);
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AUb() {
    }

    @Override // X.InterfaceC5756Dor
    public final void AUc(C5623Dm6 c5623Dm6, Dq8 dq8, C6060Duv c6060Duv, C5790DpZ c5790DpZ, String str) {
        AnonymousClass005.A0y(c5623Dm6, dq8, c5790DpZ);
        C7384Etj.A0Y(str, 4);
        C5699Dng c5699Dng = this.A0F;
        if (c5699Dng.mEnableMoveOffListenerDispatcher) {
            return;
        }
        if (!c5699Dng.mEnableErrorLoggingSuppression) {
            A08(this, c5790DpZ, dq8, c5623Dm6, str);
        } else {
            this.A0K.set(new RunnableC5863Dqx(this, c5790DpZ, dq8, c5623Dm6, str));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AUx() {
    }

    @Override // X.InterfaceC5756Dor
    public final void AVh(long j, String str) {
        if (A0J(this, str, 1)) {
            return;
        }
        A0I(this, str);
    }

    @Override // X.InterfaceC5756Dor
    public final void AWG(C5623Dm6 c5623Dm6, long j, long j2, boolean z, boolean z2, boolean z3) {
        if (A0J(this, c5623Dm6, 0)) {
            return;
        }
        A0G(this, c5623Dm6, j, z3);
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AXD(C6060Duv c6060Duv, Dq8 dq8, C5623Dm6 c5623Dm6, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, boolean z2) {
        AnonymousClass003.A0w(c5623Dm6, dq8);
        if (A0J(this, str5, 11)) {
            return;
        }
        A0C(this, dq8, c5623Dm6, str5, j);
    }

    @Override // X.InterfaceC5756Dor
    public final void AXF() {
    }

    @Override // X.InterfaceC5756Dor
    public final void AXP(C5790DpZ c5790DpZ) {
        EnumC5642DmW enumC5642DmW;
        C7384Etj.A0Y(c5790DpZ, 0);
        C5699Dng c5699Dng = this.A0F;
        if ((c5699Dng.mEnableWarningLogging || c5699Dng.gen.enable_player_on_warn_events) && ((enumC5642DmW = c5790DpZ.A03) == null || enumC5642DmW != EnumC5642DmW.A04)) {
            String strA01 = A01(this);
            C5627DmA c5627DmA = (C5627DmA) this.A0B;
            long jA0U = BV7.A0U(c5627DmA);
            Dt0 dt0 = new Dt0();
            AbstractC8150FWo.A02(dt0, "name", "player_warning");
            AbstractC8150FWo.A02(dt0, "type", "player_warning");
            EnumC5624Dm7 enumC5624Dm7 = c5790DpZ.A02;
            AbstractC8150FWo.A02(dt0, AuraDeeplinkRouteMapper.CODE_PARAM, enumC5624Dm7.toString());
            AbstractC8150FWo.A02(dt0, "error", enumC5624Dm7.name());
            AbstractC8150FWo.A02(dt0, HatchWebPageParserKt.DESCRIPTION, c5790DpZ.A04);
            AbstractC8150FWo.A02(dt0, "domain", enumC5642DmW.toString());
            String str = c5699Dng.gen.log_warning_as_warning ? "warning" : "error";
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = c5627DmA.A07.A0a;
            C5700Dnh c5700DnhA00 = this.A0D.A00(this.A0S, strA01);
            if (c5700DnhA00 != null) {
                c5700DnhA00.A02(dt0, null, null, null, null, null, null, null, null, null, Long.valueOf(j), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, strA01, null, null, null, null, null, null, null, jA0U, this.A03, jElapsedRealtime, false);
            }
        }
        EnumC5642DmW enumC5642DmW2 = c5790DpZ.A03;
        if (enumC5642DmW2 == null || !C7BY.A0q(enumC5642DmW2.toString(), "AV1", false)) {
            C5654Dmi c5654Dmi = this.A0E;
            String strA012 = A01(this);
            C7384Etj.A0T(c5790DpZ.A04);
            C5654Dmi.A00(EnumC5667Dmw.A08, c5654Dmi, strA012);
        }
    }

    private final C5963Dsz A00() {
        C5963Dsz requiredMetadata;
        HatchVideoPlayerMetadataProvider hatchVideoPlayerMetadataProvider = this.A0R;
        if (hatchVideoPlayerMetadataProvider != null && (requiredMetadata = hatchVideoPlayerMetadataProvider.getRequiredMetadata()) != null) {
            return requiredMetadata;
        }
        long j = this.A02;
        C5963Dsz c5963Dsz = new C5963Dsz();
        AbstractC8150FWo.A02(c5963Dsz, "current_watching_module", "video");
        AbstractC8150FWo.A02(c5963Dsz, "media_id", Long.valueOf(j));
        c5963Dsz.A03(EnumC7533Ezy.ORGANIC, "tracking_type");
        return c5963Dsz;
    }

    public static final String A01(C5630DmE c5630DmE) {
        Dw4 dw4;
        String str;
        HatchVideoPlayerMetadataProvider hatchVideoPlayerMetadataProvider = c5630DmE.A0R;
        if (hatchVideoPlayerMetadataProvider == null || (dw4 = hatchVideoPlayerMetadataProvider.loggerTokenProvider) == null) {
            return "DEFAULT_TOKEN";
        }
        synchronized (dw4) {
            str = dw4.A00;
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.EnumC7422Eva r52, X.EnumC7497EyC r53, X.C5630DmE r54, X.C5790DpZ r55, java.lang.String r56, java.lang.String r57) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5630DmE.A02(X.Eva, X.EyC, X.DmE, X.DpZ, java.lang.String, java.lang.String):void");
    }

    public static void A05(C5630DmE c5630DmE) {
        WeakReference weakReference;
        HatchVideoPlayerMetadataProvider hatchVideoPlayerMetadataProvider = c5630DmE.A0R;
        if (hatchVideoPlayerMetadataProvider == null || (weakReference = hatchVideoPlayerMetadataProvider.metadataProviderPlayer) == null) {
            return;
        }
        weakReference.get();
    }

    public static final void A06(C5630DmE c5630DmE) {
        ConcurrentLinkedQueue<C5841DqX> concurrentLinkedQueue = c5630DmE.A0G;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        ArrayList arrayListA0t = BV4.A0t(concurrentLinkedQueue);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = null;
        if (!arrayListA0t.isEmpty()) {
            try {
                JSONObject jSONObjectA18 = BV4.A18();
                jSONObjectA18.put("currentTimeMs", jCurrentTimeMillis);
                jSONObjectA18.put("streamId", ((C5841DqX) BV6.A0m(arrayListA0t)).A06);
                HashMap mapA0u = BV4.A0u();
                HashMap mapA0u2 = BV4.A0u();
                HashSet hashSetA13 = C60O.A13();
                Iterator it = arrayListA0t.iterator();
                while (it.hasNext()) {
                    C5841DqX c5841DqX = (C5841DqX) it.next();
                    for (long j : c5841DqX.A07) {
                        JSONObject jSONObjectA182 = BV4.A18();
                        jSONObjectA182.put("id", j);
                        jSONObjectA182.put("timeMs", c5841DqX.A04);
                        int i = c5841DqX.A01;
                        if (i != Integer.MIN_VALUE) {
                            jSONObjectA182.put("latency_level", i);
                        }
                        int i2 = c5841DqX.A02;
                        if (i2 != -1) {
                            jSONObjectA182.put("flc", i2);
                        }
                        String str = c5841DqX.A05;
                        if (str != null) {
                            jSONObjectA182.put("protocol", str);
                        }
                        Integer numValueOf = Integer.valueOf(c5841DqX.A03);
                        BV7.A1D(numValueOf, hashSetA13);
                        if (c5841DqX.A00 == 0) {
                            Object jSONArray = mapA0u.get(numValueOf);
                            if (jSONArray == null) {
                                jSONArray = new JSONArray();
                                mapA0u.put(numValueOf, jSONArray);
                            }
                            ((JSONArray) jSONArray).put(jSONObjectA182);
                        } else {
                            Object jSONArray2 = mapA0u2.get(numValueOf);
                            if (jSONArray2 == null) {
                                jSONArray2 = new JSONArray();
                                mapA0u2.put(numValueOf, jSONArray2);
                            }
                            ((JSONArray) jSONArray2).put(jSONObjectA182);
                        }
                    }
                }
                Iterator it2 = hashSetA13.iterator();
                while (it2.hasNext()) {
                    int iA03 = C60Q.A03(it2);
                    JSONObject jSONObjectA183 = BV4.A18();
                    Integer numValueOf2 = Integer.valueOf(iA03);
                    if (mapA0u.containsKey(numValueOf2)) {
                        jSONObjectA183.put("dl", mapA0u.get(numValueOf2));
                    }
                    if (mapA0u2.containsKey(numValueOf2)) {
                        jSONObjectA183.put("dis", mapA0u2.get(numValueOf2));
                    }
                    jSONObjectA18.put(String.valueOf(iA03), jSONObjectA183);
                }
                string = jSONObjectA18.toString();
            } catch (JSONException e) {
                CFK.A0A("LatencyMeasureFrameLog", "Unable to build latency measure frame JSON", e);
            }
        }
        concurrentLinkedQueue.clear();
        if (string == null || string.length() == 0) {
            return;
        }
        C5962Dsy c5962Dsy = new C5962Dsy();
        AbstractC8150FWo.A02(c5962Dsy, "live_latency_frames", string);
        c5630DmE.A0K(c5962Dsy);
    }

    public static final void A07(C5630DmE c5630DmE) {
        C5699Dng c5699Dng = c5630DmE.A0F;
        if (!(c5699Dng.mFixLeakInPlayerListener && c5630DmE.A0H.get()) && c5699Dng.mEnableHeartbeat) {
            long j = c5630DmE.A0I.get() ? c5699Dng.mHeartbeatDelayMsForAds : c5699Dng.mHeartbeatDelayMsForOrganic;
            if (j != -1) {
                C5646Dma c5646Dma = c5630DmE.A0D;
                c5646Dma.A01();
                InterfaceC5724DoJ interfaceC5724DoJ = c5630DmE.A0B;
                if (interfaceC5724DoJ.isPlaying()) {
                    C5627DmA c5627DmA = (C5627DmA) interfaceC5724DoJ;
                    if (c5627DmA.A0Y.get()) {
                        String strA01 = A01(c5630DmE);
                        C5700Dnh c5700DnhA00 = c5646Dma.A00(c5630DmE.A0S, strA01);
                        long jA0U = BV7.A0U(c5627DmA);
                        if (c5700DnhA00 != null) {
                            c5700DnhA00.A02(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "heartbeat", strA01, null, null, null, null, null, null, null, jA0U, c5630DmE.A03, SystemClock.elapsedRealtime(), false);
                            c5700DnhA00.A01(1L);
                        }
                        Runnable runnableC5944Dse = (c5699Dng.mEnableWeakReferenceInHeartbeatRunnable || c5699Dng.mFixLeakInPlayerListener) ? (Runnable) c5630DmE.A0L.getValue() : new RunnableC5944Dse(c5630DmE);
                        HatchVideoPlayerBackgroundEventProcessor hatchVideoPlayerBackgroundEventProcessor = c5630DmE.A0A;
                        C7384Etj.A0Y(runnableC5944Dse, 2);
                        hatchVideoPlayerBackgroundEventProcessor.executeWithDelay(j, runnableC5944Dse);
                    }
                }
            }
        }
    }

    public static final void A08(C5630DmE c5630DmE, C5790DpZ c5790DpZ, Dq8 dq8, C5623Dm6 c5623Dm6, String str) {
        if (c5630DmE.A0F.mEnableSuppressingError && c5630DmE.A0O.getAndSet(false)) {
            return;
        }
        long jA0U = BV7.A0U((C5627DmA) c5630DmE.A0B);
        Dt0 dt0 = new Dt0();
        AbstractC8150FWo.A02(dt0, "name", "failed_playing");
        AbstractC8150FWo.A02(dt0, "type", "failed_playing");
        EnumC5624Dm7 enumC5624Dm7 = c5790DpZ.A02;
        AbstractC8150FWo.A02(dt0, AuraDeeplinkRouteMapper.CODE_PARAM, enumC5624Dm7.toString());
        AbstractC8150FWo.A02(dt0, "error", enumC5624Dm7.name());
        String str2 = c5790DpZ.A04;
        AbstractC8150FWo.A02(dt0, HatchWebPageParserKt.DESCRIPTION, str2);
        AbstractC8150FWo.A02(dt0, "domain", c5790DpZ.A03.toString());
        AbstractC8150FWo.A02(dt0, "last_encoding_tag", c5630DmE.A07);
        long j = dq8.A02;
        if (j > 0) {
            c5630DmE.A03 = j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = c5630DmE.A03;
        Long lA01 = AbstractC5651Dmf.A01(dq8, c5623Dm6);
        C5700Dnh c5700DnhA00 = c5630DmE.A0D.A00(c5630DmE.A0S, str);
        if (c5700DnhA00 != null) {
            c5700DnhA00.A02(dt0, null, null, null, null, null, null, null, null, null, null, lA01, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "error", str, null, null, null, null, null, null, null, jA0U, j2, jElapsedRealtime, false);
            c5700DnhA00.A01(1L);
            C5654Dmi c5654Dmi = c5630DmE.A0E;
            String strA01 = A01(c5630DmE);
            C7384Etj.A0T(str2);
            C5654Dmi.A00(EnumC5667Dmw.A07, c5654Dmi, strA01);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089 A[PHI: r45 r47
  0x0089: PHI (r45v1 java.lang.Long) = (r45v4 java.lang.Long), (r45v6 java.lang.Long) binds: [B:36:0x0087, B:34:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x0089: PHI (r47v0 java.lang.Long) = (r47v3 java.lang.Long), (r47v4 java.lang.Long) binds: [B:36:0x0087, B:34:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[PHI: r45 r47
  0x0093: PHI (r45v3 java.lang.Long) = (r45v1 java.lang.Long), (r45v4 java.lang.Long) binds: [B:38:0x0091, B:36:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x0093: PHI (r47v2 java.lang.Long) = (r47v0 java.lang.Long), (r47v3 java.lang.Long) binds: [B:38:0x0091, B:36:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A09(X.C5630DmE r64, X.Dq8 r65, X.C5623Dm6 r66) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5630DmE.A09(X.DmE, X.Dq8, X.Dm6):void");
    }

    public static final void A0A(C5630DmE c5630DmE, Dq8 dq8, C5623Dm6 c5623Dm6, String str) {
        long j = dq8.A02;
        if (j > 0) {
            c5630DmE.A03 = j;
        }
        long jA00 = c5623Dm6.A00();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = c5630DmE.A03;
        String strA01 = A01(c5630DmE);
        Long lA01 = AbstractC5651Dmf.A01(dq8, c5623Dm6);
        Boolean bool = c5623Dm6.A0a;
        C5700Dnh c5700DnhA00 = c5630DmE.A0D.A00(c5630DmE.A0S, str);
        if (c5700DnhA00 != null) {
            c5700DnhA00.A02(null, null, null, null, bool, null, null, null, null, null, null, lA01, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "cancelled", strA01, null, null, null, null, null, null, null, jA00, j2, jElapsedRealtime, false);
            c5700DnhA00.A01(1L);
            C5654Dmi.A00(EnumC5667Dmw.A02, c5630DmE.A0E, A01(c5630DmE));
        }
    }

    public static final void A0B(C5630DmE c5630DmE, Dq8 dq8, C5623Dm6 c5623Dm6, String str) {
        Runnable runnableC5844Dqa;
        String str2;
        String str3 = str;
        String strA01 = A01(c5630DmE);
        C8ee<?> c8ee = c5630DmE.A0M;
        C5699Dng c5699Dng = c5630DmE.A0F;
        C5674DnC.A00(c8ee, c5630DmE.A00(), c5699Dng, "client_video_started_playing", null);
        C5963Dsz c5963DszA00 = c5630DmE.A00();
        String str4 = c5699Dng.mEnableStartState ? c5630DmE.A0D.A02(c5630DmE.A02, true) ? "started" : "unpaused" : null;
        SystemClock.elapsedRealtime();
        long j = dq8.A02;
        if (j <= 0) {
            j = c5623Dm6.A0t;
        }
        c5630DmE.A03 = j;
        long jA00 = c5623Dm6.A00();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C5627DmA c5627DmA = (C5627DmA) c5630DmE.A0B;
        long j2 = c5627DmA.A07.A0a;
        long j3 = c5630DmE.A03;
        C5700Dnh c5700DnhA00 = c5630DmE.A0D.A00(c5630DmE.A0S, strA01);
        if (c5700DnhA00 != null) {
            c5700DnhA00.A03(c5963DszA00);
            c5700DnhA00.A02(null, null, null, null, null, null, null, null, null, null, Long.valueOf(j2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "started_playing", strA01, str4, null, null, String.valueOf(j2), null, null, null, jA00, j3, jElapsedRealtime, false);
            boolean zAreEqual = C7384Etj.areEqual(c5630DmE.A0Q.getAndSet(strA01), strA01);
            if (c5630DmE.A0P.getAndSet(c5627DmA.A07.A0a) != c5627DmA.A07.A0a) {
                HatchVideoPlayerMetadataProvider hatchVideoPlayerMetadataProvider = c5630DmE.A0R;
                if ((hatchVideoPlayerMetadataProvider != null ? hatchVideoPlayerMetadataProvider.metadataProviderType : null) == BWC.A03) {
                    str3 = null;
                }
                C5962Dsy c5962DsyA01 = AbstractC5640DmU.A01(c5623Dm6.A0e);
                if (str3 != null) {
                    AbstractC8150FWo.A02(c5962DsyA01, "fb_manifest_identifier", str3);
                    AbstractC8150FWo.A02(c5962DsyA01, "dash_manifest_identifier", str3);
                }
                Boolean boolValueOf = Boolean.valueOf(dq8.A0B);
                Map<String, Object> map = c5962DsyA01.A00;
                map.put("is_predictive_playback", boolValueOf);
                String str5 = c5623Dm6.A0u;
                if (str5 != null) {
                    AbstractC8150FWo.A02(c5962DsyA01, "client_latency_setting", str5);
                }
                String str6 = c5623Dm6.A0i;
                if ("DASH_LIVE".equals(str6) || "MOQ_LIVE".equals(str6)) {
                    String str7 = c5623Dm6.A0g;
                    if (str7 != null) {
                        map.put("initial_manifest_source", str7);
                    }
                    Boolean bool = c5623Dm6.A0X;
                    if (bool != null) {
                        map.put("inline_manifest_provided", bool);
                    }
                }
                map.put("is_mixed_codec_manifest", Boolean.valueOf(c5623Dm6.A0n));
                int i = c5623Dm6.A07;
                AbstractC8150FWo.A02(c5962DsyA01, "available_qualities_count", Long.valueOf(i));
                map.put("is_abr_enabled", Boolean.valueOf(i > 1));
                map.put("warmed", false);
                String str8 = c5623Dm6.A0j;
                if (str8.length() != 0) {
                    AbstractC8150FWo.A02(c5962DsyA01, "video_decoder_name", AnonymousClass001.A0u(str8));
                }
                C5723DoI c5723DoI = c5627DmA.A0m.get();
                if (c5723DoI != null && (((str2 = c5723DoI.codecs) != null || (str2 = c5723DoI.mimeType) != null) && str2.length() != 0)) {
                    AbstractC8150FWo.A02(c5962DsyA01, "audio_codec", str2);
                }
                A03(c5962DsyA01, c5630DmE, strA01, false);
                HatchVideoPlayerMetadataProvider hatchVideoPlayerMetadataProvider2 = c5630DmE.A0R;
                if (hatchVideoPlayerMetadataProvider2 != null) {
                    runnableC5844Dqa = new RunnableC5705Dnn(hatchVideoPlayerMetadataProvider2, c5630DmE, A01(c5630DmE));
                    c5630DmE.A0A.executeWithDelay(0L, runnableC5844Dqa);
                }
            } else if (!zAreEqual) {
                runnableC5844Dqa = new RunnableC5844Dqa(c5630DmE, strA01, c5623Dm6.A0e);
                c5630DmE.A0A.executeWithDelay(0L, runnableC5844Dqa);
            }
            c5630DmE.A08 = strA01;
            C5654Dmi.A00(EnumC5667Dmw.A0H, c5630DmE.A0E, strA01);
            c5630DmE.A0J.set(false);
            c5630DmE.A09 = true;
            c5630DmE.A01 = c5623Dm6.A08;
            c5630DmE.A00 = SystemClock.elapsedRealtime();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0C(X.C5630DmE r57, X.Dq8 r58, X.C5623Dm6 r59, java.lang.String r60, long r61) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5630DmE.A0C(X.DmE, X.Dq8, X.Dm6, java.lang.String, long):void");
    }

    public static final void A0D(C5630DmE c5630DmE, Dq8 dq8, C5623Dm6 c5623Dm6, String str, boolean z) {
        long j = dq8.A02;
        if (j > 0) {
            c5630DmE.A03 = j;
        }
        A06(c5630DmE);
        C5699Dng c5699Dng = c5630DmE.A0F;
        if (c5699Dng.gen.enable_dropped_frames_metadata) {
            InterfaceC5724DoJ interfaceC5724DoJ = c5630DmE.A0B;
            A05(c5630DmE);
            C5785DpT c5785DpT = c5699Dng.gen;
            c5630DmE.A0K(AbstractC5640DmU.A00(interfaceC5724DoJ, c5623Dm6, interfaceC5724DoJ.ALH(str, false), c5785DpT.enable_hdr_frame_count_metadata, c5785DpT.enable_inference_frame_count_metadata));
        }
        long jA00 = c5623Dm6.A00();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = c5630DmE.A03;
        long j3 = ((C5627DmA) c5630DmE.A0B).A07.A0a;
        C5700Dnh c5700DnhA00 = c5630DmE.A0D.A00(c5630DmE.A0S, str);
        if (c5700DnhA00 != null) {
            c5700DnhA00.A02(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "completed", str, null, null, null, null, null, null, null, jA00, j2, jElapsedRealtime, z);
            c5700DnhA00.A01(1L);
            if (z) {
                c5700DnhA00.A02(null, null, null, null, null, null, null, null, null, null, Long.valueOf(j3), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "started_playing", str, null, null, null, String.valueOf(j3), null, null, null, 0L, j2, jElapsedRealtime, true);
                SystemClock.elapsedRealtime();
            }
            A0H(c5630DmE, c5623Dm6, A01(c5630DmE));
            C5654Dmi.A00(EnumC5667Dmw.A03, c5630DmE.A0E, A01(c5630DmE));
            c5630DmE.A0J.set(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115 A[PHI: r2
  0x0115: PHI (r2v1 boolean) = (r2v0 boolean), (r2v5 boolean) binds: [B:7:0x0011, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013 A[PHI: r2
  0x0013: PHI (r2v5 boolean) = (r2v0 boolean), (r2v6 boolean) binds: [B:7:0x0011, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0E(X.C5630DmE r6, X.C5723DoI r7) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5630DmE.A0E(X.DmE, X.DoI):void");
    }

    public static final void A0F(C5630DmE c5630DmE, C5623Dm6 c5623Dm6) {
        Object objA0s;
        Integer num;
        Long l;
        C8ee<?> c8ee = c5630DmE.A0M;
        C5699Dng c5699Dng = c5630DmE.A0F;
        C5674DnC.A00(c8ee, c5630DmE.A00(), c5699Dng, "client_video_requested_playing", null);
        String strA01 = A01(c5630DmE);
        Dn4 dn4 = c5630DmE.A0C;
        long j = c5630DmE.A02;
        try {
            DmR dmR = ((C5627DmA) c5630DmE.A0B).A08;
            objA0s = dmR != null ? dmR.A09 : null;
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Long lA0p = null;
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        String str = (String) objA0s;
        synchronized (dn4) {
            String str2 = dn4.A03;
            if (str2 != null && str != null && str.length() != 0) {
                if (!strA01.equals(str2) || (l = dn4.A00) == null || l.longValue() != j) {
                    dn4.A02(strA01, j);
                }
                dn4.A02 = str;
                if (str.equals(dn4.A01)) {
                    Dn4.A00(dn4);
                }
                dn4.A01 = null;
            }
        }
        String str3 = c5699Dng.mEnableStartState ? c5630DmE.A0D.A02(c5630DmE.A02, false) ? "started" : "unpaused" : null;
        Boolean bool = c5623Dm6 != null ? c5623Dm6.A0Z : null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = ((C5627DmA) c5630DmE.A0B).A07.A0a;
        if (c5623Dm6 != null && (num = c5623Dm6.A0d) != null) {
            lA0p = BV7.A0p(num);
        }
        C5700Dnh c5700DnhA00 = c5630DmE.A0D.A00(c5630DmE.A0S, strA01);
        if (c5700DnhA00 != null) {
            c5700DnhA00.A02(null, null, null, bool, null, null, null, null, null, null, Long.valueOf(j2), null, lA0p, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "requested_playing", strA01, str3, null, null, String.valueOf(j2), null, null, null, 0L, c5630DmE.A03, jElapsedRealtime, false);
            C5654Dmi.A00(EnumC5667Dmw.A0D, c5630DmE.A0E, strA01);
            c5630DmE.A0J.set(false);
        }
    }

    public static final void A0G(C5630DmE c5630DmE, C5623Dm6 c5623Dm6, long j, boolean z) {
        Long lA0p;
        Long lA0p2;
        String strA01 = A01(c5630DmE);
        if (c5630DmE.A0F.gen.enable_induced_in_play_stall_config_logging) {
            Integer num = c5623Dm6.A0b;
            lA0p = num != null ? BV7.A0p(num) : null;
            Integer num2 = c5623Dm6.A0c;
            lA0p2 = num2 != null ? BV7.A0p(num2) : null;
        } else {
            lA0p = null;
            lA0p2 = null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Boolean bool = c5630DmE.A0U;
        c5630DmE.A0U = null;
        Boolean bool2 = c5630DmE.A0T;
        c5630DmE.A0T = null;
        C5700Dnh c5700DnhA00 = c5630DmE.A0D.A00(c5630DmE.A0S, strA01);
        if (c5700DnhA00 != null) {
            c5700DnhA00.A02(null, Boolean.valueOf(z), null, null, null, bool, bool2, null, null, null, null, null, null, lA0p, lA0p2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "stopped_buffering", strA01, null, null, null, null, null, null, null, j, c5630DmE.A03, jElapsedRealtime, false);
            C5654Dmi c5654Dmi = c5630DmE.A0E;
            boolean zIsPlaying = c5630DmE.A0B.isPlaying();
            Map<String, C5719DoD> map = c5654Dmi.A01;
            C5719DoD c5719DoD = map.get(strA01);
            if (c5719DoD == null) {
                c5719DoD = new C5719DoD();
                map.put(strA01, c5719DoD);
            }
            if (c5719DoD.A06.A00 == C79.A01 || !zIsPlaying) {
                return;
            }
            C5654Dmi.A00(EnumC5667Dmw.A0F, c5654Dmi, strA01);
        }
    }

    public static final void A0H(C5630DmE c5630DmE, C5623Dm6 c5623Dm6, String str) {
        if (c5630DmE.A09) {
            long j = c5630DmE.A01;
            if (j < 0 || c5623Dm6 == null || c5623Dm6.A08 != j) {
                return;
            }
            long j2 = c5630DmE.A00;
            if (j2 <= 0 || C3cG.A04(j2) <= 5000) {
                return;
            }
            C5654Dmi c5654Dmi = c5630DmE.A0E;
            if (c5654Dmi.A00.mEnablePlaybackStateQplLogger) {
                C5654Dmi.A00(EnumC5667Dmw.A05, c5654Dmi, str);
            }
        }
    }

    public static final void A0I(C5630DmE c5630DmE, String str) {
        String strA01 = A01(c5630DmE);
        C5627DmA c5627DmA = (C5627DmA) c5630DmE.A0B;
        long jA0U = BV7.A0U(c5627DmA);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = c5627DmA.A07.A0a;
        C5700Dnh c5700DnhA00 = c5630DmE.A0D.A00(c5630DmE.A0S, strA01);
        if (c5700DnhA00 != null) {
            c5700DnhA00.A02(null, null, null, null, null, null, null, null, null, null, Long.valueOf(j), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "requested_seek", strA01, null, str, null, String.valueOf(j), null, null, null, jA0U, c5630DmE.A03, jElapsedRealtime, false);
        }
    }

    public final void A0M(String str, String str2, long j) {
        C5699Dng c5699Dng = this.A0F;
        if (c5699Dng.mEnableMoveOffListenerDispatcher) {
            return;
        }
        InterfaceC5724DoJ interfaceC5724DoJ = this.A0B;
        C5627DmA c5627DmA = (C5627DmA) interfaceC5724DoJ;
        C5623Dm6 c5623Dm6A0i = BV7.A0i(c5627DmA.A07);
        String strA01 = this.A08;
        if (strA01 == null) {
            strA01 = A01(this);
        }
        if (c5699Dng.gen.enable_dropped_frames_metadata && c5623Dm6A0i != null) {
            A06(this);
            A05(this);
            C5785DpT c5785DpT = c5699Dng.gen;
            A0K(AbstractC5640DmU.A00(interfaceC5724DoJ, c5623Dm6A0i, interfaceC5724DoJ.ALH(str2, false), c5785DpT.enable_hdr_frame_count_metadata, c5785DpT.enable_inference_frame_count_metadata));
        }
        C5654Dmi.A00(EnumC5667Dmw.A0C, this.A0E, strA01);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = c5627DmA.A07.A0a;
        boolean z = c5699Dng.mEnableReportEventsOnRequestedPause;
        C5700Dnh c5700DnhA00 = this.A0D.A00(this.A0S, strA01);
        if (c5700DnhA00 != null) {
            c5700DnhA00.A02(null, null, null, null, null, null, null, null, null, null, Long.valueOf(j2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "requested_pause", strA01, null, str, str, null, null, null, null, j, this.A03, jElapsedRealtime, false);
            if (z) {
                c5700DnhA00.A01(1L);
            }
            if (!c5699Dng.gen.enable_early_pause_event_to_close_session || c5623Dm6A0i == null || str2 == null) {
                return;
            }
            A0C(this, Dq8.A0D, c5623Dm6A0i, str2, j);
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void ASi(C5919Ds4 c5919Ds4) {
        if (c5919Ds4 != null) {
            C5962Dsy c5962Dsy = new C5962Dsy();
            C5991DtY c5991DtY = c5919Ds4.A02;
            int i = c5919Ds4.A00;
            int i2 = c5919Ds4.A01;
            C5627DmA c5627DmA = (C5627DmA) this.A0B;
            Integer num = c5627DmA.A0A;
            Integer num2 = c5627DmA.A09;
            HatchVideoPlayerMetadataProvider hatchVideoPlayerMetadataProvider = this.A0R;
            if ((hatchVideoPlayerMetadataProvider != null ? hatchVideoPlayerMetadataProvider.metadataProviderType : null) == BWC.A02) {
                DEK dek = c5991DtY.A00;
                AbstractC8150FWo.A02(c5962Dsy, "video_cached", Boolean.valueOf(dek != null && (dek == DEK.CACHED || dek == DEK.SEMI_CACHED)));
            }
            AbstractC8150FWo.A02(c5962Dsy, "first_frame_avg_decode_time", Long.valueOf(i));
            AbstractC8150FWo.A02(c5962Dsy, "first_frame_avg_render_time", Long.valueOf(i2));
            if (num != null) {
                AbstractC8150FWo.A02(c5962Dsy, "video_codec_init_time", BV7.A0p(num));
            }
            if (num2 != null) {
                AbstractC8150FWo.A02(c5962Dsy, "audio_codec_init_time", BV7.A0p(num2));
            }
            A0K(c5962Dsy);
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void ATp(boolean z) {
        if (this.A0F.mEnableMoveOffListenerDispatcher) {
            return;
        }
        C5962Dsy c5962Dsy = new C5962Dsy();
        AbstractC8150FWo.A02(c5962Dsy, "is_broadcast_interrupted", Boolean.valueOf(z));
        A0K(c5962Dsy);
    }

    @Override // X.InterfaceC5756Dor
    public final void AUg(C5623Dm6 c5623Dm6, float f, long j) {
        if (this.A0F.mEnableMoveOffListenerDispatcher) {
            return;
        }
        C5962Dsy c5962Dsy = new C5962Dsy();
        AbstractC8150FWo.A02(c5962Dsy, "playback_speed", Double.valueOf(f));
        A0K(c5962Dsy);
    }

    @Override // X.InterfaceC5756Dor
    public final void AUw(C5623Dm6 c5623Dm6, String str) {
        C5654Dmi.A00(EnumC5667Dmw.A09, this.A0E, A01(this));
    }

    @Override // X.InterfaceC5756Dor
    public final void AXE(C5623Dm6 c5623Dm6) {
        C5699Dng c5699Dng = this.A0F;
        if (!c5699Dng.mEnableMoveRequestedPlayingCallback || c5699Dng.mEnableMoveRequestCloseToFbLegacy) {
            return;
        }
        A0F(this, c5623Dm6);
    }

    @Override // X.InterfaceC5756Dor
    public final void AXG(int i, int i2, float f) {
        if (this.A0F.mEnableMoveOffListenerDispatcher) {
            return;
        }
        C5962Dsy c5962Dsy = new C5962Dsy();
        AbstractC8150FWo.A02(c5962Dsy, "video_width", Long.valueOf(i));
        AbstractC8150FWo.A02(c5962Dsy, "video_height", Long.valueOf(i2));
        A0K(c5962Dsy);
    }

    public static boolean A0J(C5630DmE c5630DmE, Object obj, int i) {
        C7384Etj.A0Y(obj, i);
        return c5630DmE.A0F.mEnableMoveOffListenerDispatcher;
    }

    public final void A0L(C5790DpZ c5790DpZ, Dq8 dq8, C5623Dm6 c5623Dm6, String str) {
        AnonymousClass005.A0y(c5623Dm6, dq8, str);
        C5699Dng c5699Dng = this.A0F;
        if (c5699Dng.mEnableMoveOffListenerDispatcher) {
            if (!c5699Dng.mEnableErrorLoggingSuppression) {
                A08(this, c5790DpZ, dq8, c5623Dm6, str);
            } else {
                this.A0K.set(new RunnableC5863Dqx(this, c5790DpZ, dq8, c5623Dm6, str));
            }
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void ARl(int i) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ARq(C5723DoI c5723DoI) {
    }

    @Override // X.InterfaceC5756Dor
    public final void ASc(C5723DoI c5723DoI, long j, String str, List<String> list, boolean z) {
        AnonymousClass003.A0v(c5723DoI, str);
        if (this.A0F.mEnableMoveOffListenerDispatcher) {
            return;
        }
        A0E(this, c5723DoI);
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ATa(C5892DrZ c5892DrZ) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AUB(Object obj) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AUK(byte[] bArr) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AUd(EnumC2375BWj enumC2375BWj) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AW9(Dq8 dq8, C5623Dm6 c5623Dm6, String str, long j, boolean z, boolean z2) {
        AnonymousClass003.A0u(c5623Dm6, dq8);
        this.A0T = Boolean.valueOf(z2);
        if (this.A0F.mEnableMoveOffListenerDispatcher) {
            return;
        }
        A09(this, dq8, c5623Dm6);
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AWK(C6060Duv c6060Duv) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AWL(boolean z) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AWZ(List<? extends DwN> list) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AX3(Dq8 dq8, C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, long j, boolean z) {
        AnonymousClass003.A0u(c5623Dm6, dq8);
        if (A0J(this, str4, 7)) {
            return;
        }
        A0A(this, dq8, c5623Dm6, str4);
    }

    @Override // X.InterfaceC5756Dor
    public final void AX4(C6060Duv c6060Duv, Dq8 dq8, C5623Dm6 c5623Dm6, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        AnonymousClass003.A0w(c5623Dm6, dq8);
        if (A0J(this, str3, 8)) {
            return;
        }
        A0D(this, dq8, c5623Dm6, str3, z2);
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AXB(C5790DpZ c5790DpZ) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AXI(Dq8 dq8, C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        AnonymousClass003.A0w(c5623Dm6, dq8);
        if (this.A0F.mEnableMoveOffListenerDispatcher) {
            return;
        }
        A0B(this, dq8, c5623Dm6, str4);
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AXJ(C5623Dm6 c5623Dm6) {
    }

    @Override // X.InterfaceC5756Dor
    public final void onCues(List<DXC> list) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // X.InterfaceC5756Dor
    public final void onVolumeChanged(float f) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ARz(String str, long j) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ASF(String str, boolean z) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ASG(String str, boolean z) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ATS(String str, long j) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AUI(byte[] bArr, long j) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AUU(String str, String str2) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AVg(long j, long j2) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AX8(String str, String str2) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AXL(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC5756Dor
    public final void onImfEventEmsgReceived(byte[] bArr, String str, long j) {
    }

    @Override // X.InterfaceC5756Dor
    public final void ATm(String str, long j, long j2, long j3, long j4) {
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DoI;LX/DoI;JLjava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;LX/DpZ;)V */
    @Override // X.InterfaceC5756Dor
    public final void AWc(C5790DpZ c5790DpZ, C5723DoI c5723DoI, C5723DoI c5723DoI2, String str, String str2, List list, long j) {
    }
}
