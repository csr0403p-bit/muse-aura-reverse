package com.facebook.rp.platform.metaai.rsys;

import X.AIG;
import X.AbstractC0885AGm;
import X.AbstractC7608F5v;
import X.AnonymousClass001;
import X.BLG;
import X.C1BN;
import X.C27k;
import X.C3UX;
import X.C3cI;
import X.C57m;
import X.C7384Etj;
import X.C78T;
import X.C8197FYo;
import X.C8631Fhi;
import X.C8900FtH;
import X.C8902FtJ;
import X.C8946FuJ;
import X.C9286GCn;
import X.C9590GQp;
import X.C9591GQq;
import X.C9607GRo;
import X.C9621GSq;
import X.C9659Gcj;
import X.EnumC10460Hji;
import X.F0C;
import X.FGI;
import X.FY9;
import X.FZS;
import X.G0U;
import X.GBK;
import X.GQF;
import X.GQK;
import X.GQN;
import X.GQQ;
import X.GQW;
import X.GQX;
import X.GQY;
import X.GQc;
import X.GR9;
import X.GRK;
import X.GRZ;
import X.GSV;
import X.GSw;
import X.GX5;
import X.GX9;
import X.GXO;
import X.GXX;
import X.HoC;
import X.HtJ;
import X.HxE;
import X.Hxb;
import X.InterfaceC05673vm;
import X.InterfaceC10526Hou;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.rp.platform.metaai.rsys.voicestate.MetaAiVoiceStateProxyImpl;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.EnableAudioParameters;
import com.facebook.rsys.audio.gen.PlaybackVolumeParameters;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.state.gen.State;
import com.facebook.rsys.videorender.gen.VideoRenderSurface;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class MetaAiRsysSdkRealTimeSession implements C57m {
    public AudioManager A00;
    public GQN A01;
    public C9621GSq A02;
    public Function0<Unit> A03;
    public boolean A04;
    public C27k<Unit> A05;
    public final int A06;
    public final AudioManager A07;
    public final GSV A08;
    public final GQX A09;
    public final GQW A0A;
    public final C9607GRo A0B;
    public final C9591GQq A0C;
    public final MetaAiVoiceStateProxyImpl A0D;
    public final GXO A0E;
    public final C9590GQp A0F;
    public final String A0G;
    public final AtomicBoolean A0H;
    public final AtomicBoolean A0I;
    public final AtomicBoolean A0J;
    public final AtomicBoolean A0K;
    public final AtomicBoolean A0L;
    public final AtomicBoolean A0M;
    public final AtomicInteger A0N;
    public final F0C A0O;
    public final F0C A0P;
    public final F0C A0Q;
    public final F0C A0R;
    public final F0C A0S;
    public final F0C A0T;
    public final F0C A0U;
    public final C78T A0V;
    public final GBK A0W;
    public final C3UX A0X;
    public final BLG<Boolean> A0Y;
    public final BLG<Boolean> A0Z;
    public final BLG<String> A0a;
    public final C1BN<Boolean> A0b;
    public final C1BN<Boolean> A0c;
    public final C1BN<String> A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final GX5 A0j;
    public final Object A0k;
    public final AtomicBoolean A0l;
    public final AtomicBoolean A0m;
    public final AtomicBoolean A0n;
    public final AtomicInteger A0o;
    public final F0C A0p;
    public final F0C A0q;
    public final F0C A0r;
    public final F0C A0s;
    public final F0C A0t;
    public final F0C A0u;
    public final F0C A0v;
    public final F0C A0w;
    public final F0C A0x;
    public final F0C A0y;
    public final AIG<HxE<String, Integer>> A0z;
    public volatile boolean A10;

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(2:6|(1:8)(1:13))(0))(0)|9|42|(1:(2:12|14)(2:15|16))(4:17|(5:19|20|(1:22)|23|(1:25))|40|41)|43|26|37|(1:39)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        r0 = X.C3cG.A0s(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.media.AudioManager$OnCommunicationDeviceChangedListener] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.media.AudioManager r8, com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r9, X.GXX r10, X.HtJ r11) {
        /*
            r3 = 2
            boolean r0 = r11 instanceof X.C8908FtQ
            if (r0 == 0) goto L2d
            r6 = r11
            X.FtQ r6 = (X.C8908FtQ) r6
            int r0 = r6.$t
            if (r0 != r3) goto L2d
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r1 = r6.A05
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            java.lang.String r7 = "Failed to remove output-route listener"
            r4 = 1
            if (r0 == 0) goto L3c
            if (r0 != r4) goto L37
            java.lang.Object r3 = r6.A04
            android.media.AudioManager$OnCommunicationDeviceChangedListener r3 = (android.media.AudioManager.OnCommunicationDeviceChangedListener) r3
            java.lang.Object r8 = r6.A01
            android.media.AudioManager r8 = (android.media.AudioManager) r8
            goto L33
        L2d:
            X.FtQ r6 = new X.FtQ
            r6.<init>(r9, r11, r3)
            goto L17
        L33:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L81
            goto L7b
        L37:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L3c:
            X.Hwg.A00(r1)
            android.media.AudioDeviceInfo r0 = r8.getCommunicationDevice()
            boolean r0 = A0A(r0, r10)
            if (r0 != 0) goto La5
            r2 = 0
            X.GAt r1 = new X.GAt
            r1.<init>(r2)
            X.GQO r3 = new X.GQO
            r3.<init>(r9, r10, r1)
            android.media.AudioManager$OnCommunicationDeviceChangedListener r3 = (android.media.AudioManager.OnCommunicationDeviceChangedListener) r3
            X.GQl r0 = X.ExecutorC9588GQl.A00     // Catch: java.lang.Throwable -> L81
            r8.addOnCommunicationDeviceChangedListener(r0, r3)     // Catch: java.lang.Throwable -> L81
            android.media.AudioDeviceInfo r0 = r8.getCommunicationDevice()     // Catch: java.lang.Throwable -> L81
            boolean r0 = A0A(r0, r10)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L6a
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L81
            r1.A0R(r0)     // Catch: java.lang.Throwable -> L81
        L6a:
            r6.A01 = r8     // Catch: java.lang.Throwable -> L81
            r6.A02 = r2     // Catch: java.lang.Throwable -> L81
            r6.A03 = r2     // Catch: java.lang.Throwable -> L81
            r6.A04 = r3     // Catch: java.lang.Throwable -> L81
            r6.A00 = r4     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r1.A0E(r6)     // Catch: java.lang.Throwable -> L81
            if (r0 != r5) goto L7b
            return r5
        L7b:
            r8.removeOnCommunicationDeviceChangedListener(r3)     // Catch: java.lang.Throwable -> L97
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L97
            goto L9c
        L81:
            r1 = move-exception
            r8.removeOnCommunicationDeviceChangedListener(r3)     // Catch: java.lang.Throwable -> L88
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L88
            goto L8d
        L88:
            r0 = move-exception
            X.Hud r0 = X.C3cG.A0s(r0)
        L8d:
            java.lang.Throwable r0 = X.HsJ.A00(r0)
            if (r0 == 0) goto L96
            X.AbstractC7608F5v.A1L(r7)
        L96:
            throw r1
        L97:
            r0 = move-exception
            X.Hud r0 = X.C3cG.A0s(r0)
        L9c:
            java.lang.Throwable r0 = X.HsJ.A00(r0)
            if (r0 == 0) goto La5
            X.AbstractC7608F5v.A1L(r7)
        La5:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.A00(android.media.AudioManager, com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession, X.GXX, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r12, java.lang.String r13, X.HtJ r14, int r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.A01(com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession, java.lang.String, X.HtJ, int, boolean):java.lang.Object");
    }

    public static final C27k A04(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, String str, int i, boolean z) {
        C27k c27kA10;
        synchronized (metaAiRsysSdkRealTimeSession.A0k) {
            c27kA10 = metaAiRsysSdkRealTimeSession.A05;
            if (c27kA10 == null || c27kA10.isCancelled()) {
                c27kA10 = AnonymousClass001.A10(new MetaAiRsysSdkRealTimeSession$startOptInTermination$1$2(metaAiRsysSdkRealTimeSession, str, null, i, z), (C3UX) metaAiRsysSdkRealTimeSession.A0R.getValue());
                metaAiRsysSdkRealTimeSession.A05 = c27kA10;
                c27kA10.AO5(C8631Fhi.A00(26));
            }
        }
        return c27kA10;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Hou;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    @Override // X.C57m
    public final void A3l(InterfaceC10526Hou interfaceC10526Hou, Integer num, Integer num2, String str, Function0 function0) {
        C7384Etj.A0Y(interfaceC10526Hou, 0);
        C9591GQq c9591GQq = this.A0C;
        C8197FYo c8197FYo = new C8197FYo(28, this, function0);
        GQY gqy = new GQY(interfaceC10526Hou, str);
        FY9 fy9 = new FY9(gqy, c9591GQq, interfaceC10526Hou, num, num2, str, c8197FYo);
        GR9 gr9 = c9591GQq.A0C;
        if (gr9 != null) {
            fy9.invoke(gr9);
            return;
        }
        AbstractC7608F5v.A1L("addPeerRenderTarget called before call object is available. Caching the action to execute later");
        Map<GQY, G0U<GR9, Unit>> map = c9591GQq.A06;
        C7384Etj.A0T(map);
        synchronized (map) {
            G0U<GR9, Unit> g0uPut = map.put(gqy, fy9);
            if (g0uPut != null) {
                c9591GQq.A01.A01.remove(g0uPut);
            }
            c9591GQq.A01.A01.add(fy9);
        }
    }

    @Override // X.C57m
    public final void Aav(InterfaceC10526Hou interfaceC10526Hou, String str) {
        G0U<GR9, Unit> g0uRemove;
        Function0<Unit> function0Remove;
        C7384Etj.A0Y(interfaceC10526Hou, 0);
        C9591GQq c9591GQq = this.A0C;
        Map<GQY, G0U<GR9, Unit>> map = c9591GQq.A06;
        C7384Etj.A0T(map);
        synchronized (map) {
            g0uRemove = map.remove(new GQY(interfaceC10526Hou, str));
        }
        if (g0uRemove != null) {
            c9591GQq.A01.A01.remove(g0uRemove);
        }
        GQY gqy = new GQY(interfaceC10526Hou, str);
        synchronized (c9591GQq.A03) {
            c9591GQq.A08.remove(gqy);
            function0Remove = c9591GQq.A07.remove(gqy);
        }
        if (function0Remove != null) {
            function0Remove.invoke();
        }
        VideoRenderSurface videoRenderSurface = c9591GQq.A00;
        if (videoRenderSurface != null) {
            videoRenderSurface.removeRenderItem(str, new StreamInfo(1, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r8, java.lang.String r9, X.HtJ r10, int r11, boolean r12) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof X.GQJ
            if (r0 == 0) goto L91
            r7 = r10
            X.GQJ r7 = (X.GQJ) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r6 = r7.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L63
            if (r0 == r2) goto L5d
            if (r0 != r3) goto L98
            X.Hwg.A00(r6)
        L24:
            r8.A04 = r4
            X.3UX r0 = r8.A0X
            r1 = 0
            X.Hxb.A03(r1, r0)
            X.GQN r0 = r8.A01
            if (r0 == 0) goto L3b
            X.F0C r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.3UX r0 = (X.C3UX) r0
            X.Hxb.A03(r1, r0)
        L3b:
            A06(r8)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r8.A03
            if (r0 == 0) goto L45
            r0.invoke()
        L45:
            r8.A03 = r1
            X.GQq r0 = r8.A0C
            r0.A01()
            java.lang.String r1 = r8.A0G
            java.lang.String r0 = "end: cleanup complete, localCallId="
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            X.C7384Etj.A0Y(r0, r2)
            X.AbstractC7608F5v.A1L(r0)
        L5a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L5d:
            int r1 = r7.I$1
            X.Hwg.A00(r6)     // Catch: java.lang.Throwable -> La0
            goto L7e
        L63:
            X.Hwg.A00(r6)
            X.GQX r0 = r8.A09
            boolean r1 = r0.A01
            r0 = 0
            if (r1 == 0) goto L82
            r7.L$0 = r0     // Catch: java.lang.Throwable -> L9e
            r7.Z$0 = r12     // Catch: java.lang.Throwable -> L9e
            r7.I$0 = r11     // Catch: java.lang.Throwable -> L9e
            r7.I$1 = r4     // Catch: java.lang.Throwable -> L9e
            r7.label = r2     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = A01(r8, r9, r7, r11, r12)     // Catch: java.lang.Throwable -> L9e
            if (r0 != r5) goto L7e
            goto L9d
        L7e:
            r8.A09(r2)
            goto L5a
        L82:
            r7.L$0 = r0
            r7.Z$0 = r12
            r7.I$0 = r11
            r7.label = r3
            java.lang.Object r0 = A01(r8, r9, r7, r11, r12)
            if (r0 != r5) goto L24
            return r5
        L91:
            X.GQJ r7 = new X.GQJ
            r7.<init>(r8, r10)
            goto L12
        L98:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L9d:
            return r5
        L9e:
            r0 = move-exception
            goto La4
        La0:
            r0 = move-exception
            if (r1 == 0) goto La4
            r4 = 1
        La4:
            r8.A09(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.A02(com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession, java.lang.String, X.HtJ, int, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r7, X.HtJ r8) {
        /*
            r3 = 10
            boolean r0 = r8 instanceof X.C8914FtW
            if (r0 == 0) goto L47
            r4 = r8
            X.FtW r4 = (X.C8914FtW) r4
            int r0 = r4.$t
            if (r0 != r3) goto L47
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r3 = r4.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L4d
            X.Hwg.A00(r3)
        L26:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L29:
            X.Hwg.A00(r3)
            X.GQq r0 = r7.A0C
            java.lang.String r3 = r0.A04
            r0 = 29
            X.Fhi r5 = X.C8631Fhi.A00(r0)
            r0 = 30
            X.Fhi r6 = X.C8631Fhi.A00(r0)
            r4.A00 = r1
            r7 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = X.AbstractC9603GRj.A00(r3, r4, r5, r6, r7)
            if (r0 != r2) goto L26
            return r2
        L47:
            X.FtW r4 = new X.FtW
            r4.<init>(r7, r8, r3)
            goto L18
        L4d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.A03(com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession, X.HtJ):java.lang.Object");
    }

    public static final void A05(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession) {
        if (C3cI.A1W(metaAiRsysSdkRealTimeSession.A0l)) {
            try {
                metaAiRsysSdkRealTimeSession.A0C.A01();
            } catch (Exception unused) {
                AbstractC7608F5v.A1L("Failed to release call resources");
            }
            String strA0M = FGI.A0M("end: cleanup complete, localCallId=", metaAiRsysSdkRealTimeSession.A0G);
            C7384Etj.A0Y(strA0M, 1);
            AbstractC7608F5v.A1L(strA0M);
        }
    }

    public static final void A06(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession) {
        C9621GSq c9621GSq = metaAiRsysSdkRealTimeSession.A02;
        metaAiRsysSdkRealTimeSession.A02 = null;
        if (c9621GSq != null) {
            Object value = metaAiRsysSdkRealTimeSession.A0O.getValue();
            C7384Etj.A0Y(value, 0);
            ReentrantLock reentrantLock = c9621GSq.A0D;
            reentrantLock.lock();
            try {
                Map<G0U<Boolean, Unit>, GSw> map = c9621GSq.A0B;
                if (map.remove(value) != null && map.isEmpty()) {
                    c9621GSq.A08.removeCallbacks(c9621GSq.A0A);
                    c9621GSq.A02++;
                    c9621GSq.A01++;
                    AudioManager.AudioRecordingCallback audioRecordingCallback = c9621GSq.A03;
                    if (audioRecordingCallback != null) {
                        c9621GSq.A07.unregisterAudioRecordingCallback(audioRecordingCallback);
                    }
                    c9621GSq.A03 = null;
                    Function0<Unit> function0 = c9621GSq.A05;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    c9621GSq.A05 = null;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final void A07(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, String str) {
        if (metaAiRsysSdkRealTimeSession.A0M.get() && metaAiRsysSdkRealTimeSession.A0N.get() == 0 && C3cI.A1W(metaAiRsysSdkRealTimeSession.A0n)) {
            AbstractC7608F5v.A1L(str);
            GSV gsv = metaAiRsysSdkRealTimeSession.A08;
            if (gsv != null) {
                gsv.A04.execute(new GQF(gsv, metaAiRsysSdkRealTimeSession.A0G));
            }
        }
    }

    public static final void A08(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, String str) {
        AtomicInteger atomicInteger;
        int i;
        if (metaAiRsysSdkRealTimeSession.A0e && metaAiRsysSdkRealTimeSession.A0m.compareAndSet(false, true)) {
            do {
                atomicInteger = metaAiRsysSdkRealTimeSession.A0N;
                i = atomicInteger.get();
                if (i == 0) {
                    return;
                }
            } while (!atomicInteger.compareAndSet(i, i - 1));
            if (i == 1) {
                A07(metaAiRsysSdkRealTimeSession, str);
            }
        }
    }

    private final void A09(boolean z) {
        if (this.A0I.compareAndSet(false, true)) {
            this.A04 = false;
            Hxb.A03(null, this.A0X);
            try {
                GQN gqn = this.A01;
                if (gqn != null) {
                    Hxb.A03(null, (C3UX) gqn.A03.getValue());
                }
            } catch (Exception unused) {
                AbstractC7608F5v.A1L("Failed to release volume observer");
            }
            try {
                A06(this);
            } catch (Exception unused2) {
                AbstractC7608F5v.A1L("Failed to release audio recording listener");
            }
            Function0<Unit> function0 = this.A03;
            this.A03 = null;
            if (function0 != null) {
                try {
                    function0.invoke();
                } catch (Exception unused3) {
                    AbstractC7608F5v.A1L("Failed to release shared call subscription");
                }
            }
        }
        if (z || A0B(this)) {
            A05(this);
        }
    }

    public static final boolean A0A(AudioDeviceInfo audioDeviceInfo, GXX gxx) {
        return Build.VERSION.SDK_INT >= 31 && audioDeviceInfo != null && GX9.A00(audioDeviceInfo) == gxx;
    }

    public static final boolean A0B(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession) {
        State state;
        int i;
        GRZ grzA00 = GRK.A00(metaAiRsysSdkRealTimeSession.A0C.A04);
        return grzA00 == GRK.A01 || ((state = (State) C9659Gcj.A00(grzA00).A00(State.class)) != null && ((i = state.callState) == 4 || i == 0));
    }

    public static final boolean A0C(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, String str) {
        if (!metaAiRsysSdkRealTimeSession.A0f || !metaAiRsysSdkRealTimeSession.A0L.compareAndSet(false, true)) {
            return false;
        }
        while (true) {
            AtomicInteger atomicInteger = metaAiRsysSdkRealTimeSession.A0N;
            int i = atomicInteger.get();
            if (i == 0) {
                break;
            }
            if (atomicInteger.compareAndSet(i, i - 1)) {
                if (i == 1) {
                    A07(metaAiRsysSdkRealTimeSession, str);
                }
            }
        }
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;ZILX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    @Override // X.C57m
    public final Object AAY(String str, HtJ htJ, int i, boolean z) {
        Object objA02 = !this.A09.A01 ? A02(this, str, htJ, i, z) : A04(this, str, i, z).APQ(htJ);
        return objA02 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA02;
    }

    @Override // X.C57m
    public final C1BN<InterfaceC05673vm> ADx() {
        return (C1BN) this.A0p.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    @Override // X.C57m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AXy(boolean r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.GQH
            if (r0 == 0) goto L1e
            r5 = r9
            X.GQH r5 = (X.GQH) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto Lb8
            goto L24
        L1e:
            X.GQH r5 = new X.GQH
            r5.<init>(r7, r9)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L81 java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> La1
            goto L8c
        L28:
            X.Hwg.A00(r1)
            java.lang.String r6 = r7.A0G
            java.lang.String r0 = "playEndEarconAndReleaseAudio: localCallId="
            java.lang.String r1 = " playEndEarcon="
            java.lang.StringBuilder r0 = X.C3cG.A0g(r0)
            r0.append(r6)
            java.lang.String r0 = X.C60P.A1P(r1, r0, r8)
            r1 = 0
            X.C7384Etj.A0Y(r0, r2)
            X.AbstractC7608F5v.A1L(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0K
            boolean r0 = r0.get()
            if (r0 == 0) goto L56
            X.F0C r0 = r7.A0U
            java.lang.Object r0 = r0.getValue()
            X.HoC r0 = (X.HoC) r0
            r0.A5w(r1)
        L56:
            X.GQX r0 = r7.A09
            boolean r0 = r0.A01
            X.GSV r3 = r7.A08
            if (r0 != 0) goto L6d
            if (r3 == 0) goto L6a
            java.util.concurrent.ExecutorService r1 = r3.A04
            X.GQm r0 = new X.GQm
            r0.<init>(r3, r6, r8)
            r1.execute(r0)
        L6a:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L6d:
            if (r3 == 0) goto L8c
            r5.Z$0 = r8     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L81 java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> La1
            r5.label = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L81 java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> La1
            com.facebook.rp.platform.appdrivenaudio.AndroidAudioStateManager$teardownAudioStateForRtcAndWait$2 r2 = new com.facebook.rp.platform.appdrivenaudio.AndroidAudioStateManager$teardownAudioStateForRtcAndWait$2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L81 java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> La1
            r2.<init>(r3, r6, r1, r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L81 java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> La1
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = X.GAX.A00(r5, r2, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L81 java.lang.Throwable -> L87 java.util.concurrent.CancellationException -> La1
            if (r0 != r4) goto L8c
            goto La0
        L81:
            X.C3cG.A1H(r5)     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = "Audio teardown timed out after remote call end"
            goto L89
        L87:
            java.lang.String r0 = "Audio teardown failed after remote call end"
        L89:
            X.AbstractC7608F5v.A1L(r0)     // Catch: java.lang.Throwable -> La3
        L8c:
            X.1BN r0 = r7.ADx()
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C57l
            if (r0 == 0) goto L6a
            boolean r0 = A0B(r7)
            r7.A09(r0)
            goto L6a
        La0:
            return r4
        La1:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> La3
        La3:
            r1 = move-exception
            X.1BN r0 = r7.ADx()
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C57l
            if (r0 == 0) goto Lbc
            boolean r0 = A0B(r7)
            r7.A09(r0)
            throw r1
        Lb8:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        Lbc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.AXy(boolean, X.HtJ):java.lang.Object");
    }

    @Override // X.C57m
    public final void Acv(boolean z) {
        AudioManager audioManager;
        if (z && this.A0i && (audioManager = this.A00) != null) {
            int i = this.A06;
            if (audioManager.getStreamVolume(i) <= audioManager.getStreamMinVolume(i)) {
                return;
            }
        }
        GQK gqk = (GQK) this.A0S.getValue();
        Boolean boolValueOf = Boolean.valueOf(z);
        gqk.A01 = boolValueOf;
        C9286GCn.A00(null, boolValueOf, (C9286GCn) gqk.A05);
        String strA0r = FGI.A0r("Optimistic update for bot audio state: ", z);
        C7384Etj.A0Y(strA0r, 1);
        AbstractC7608F5v.A1L(strA0r);
        if (!gqk.A03) {
            HoC hoC = gqk.A02;
            if (hoC != null) {
                hoC.A5w(null);
            }
            gqk.A02 = AnonymousClass001.A11(new C8902FtJ(gqk, null, 8), gqk.A04);
        }
        AnonymousClass001.A1J(new C8900FtH(this, null, 1, z), this.A0X);
    }

    @Override // X.C57m
    public final void Acw(float f) {
        GXO gxo = this.A0E;
        ArrayList<PlaybackVolumeParameters> arrayListA0x = AbstractC0885AGm.A0x(new PlaybackVolumeParameters(HatchPriceImpressionEventDataKt.NO_DISCOUNT, 9, f));
        AudioApi audioApi = gxo.A00;
        if (audioApi != null) {
            audioApi.setPlaybackVolume(arrayListA0x);
        }
    }

    @Override // X.C57m
    public final void Adk(boolean z) {
        if (z && !this.A10 && (this.A09 instanceof C8946FuJ) && !this.A10) {
            GSV gsv = this.A08;
            if (gsv != null) {
                gsv.A04.execute(new GQc(gsv));
            }
            this.A10 = true;
        }
        C9591GQq c9591GQq = this.A0C;
        GQQ gqq = new GQQ(z);
        GR9 gr9 = c9591GQq.A0C;
        if (gr9 != null) {
            gqq.invoke(gr9);
        } else {
            AbstractC7608F5v.A1L("ToggleMicEnabled called before call object is available. Caching the action to execute later");
            c9591GQq.A01.A01.add(gqq);
        }
        FZS fzsA02 = FZS.A02(new EnableAudioParameters(null, 1, z), 39);
        GR9 gr92 = c9591GQq.A0C;
        if (gr92 != null) {
            fzsA02.invoke(gr92);
        } else {
            AbstractC7608F5v.A1L("EnableAudioParameters called before call object is available. Caching the action to execute later");
            c9591GQq.A01.A01.add(fzsA02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MetaAiRsysSdkRealTimeSession(android.media.AudioManager r25, X.GSV r26, X.GQX r27, X.GQW r28, X.C9591GQq r29, com.facebook.rp.platform.metaai.rsys.voicestate.MetaAiVoiceStateProxyImpl r30, X.GXO r31, X.GX5 r32, X.C9590GQp r33, java.lang.Boolean r34, java.lang.Boolean r35, java.lang.Boolean r36, java.lang.Integer r37, java.lang.Integer r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, X.C78T r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.<init>(android.media.AudioManager, X.GSV, X.GQX, X.GQW, X.GQq, com.facebook.rp.platform.metaai.rsys.voicestate.MetaAiVoiceStateProxyImpl, X.GXO, X.GX5, X.GQp, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.78T, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
