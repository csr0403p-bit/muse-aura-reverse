package com.facebook.aura.partners.voice.api;

import X.AbstractC07127nr;
import X.C3UX;
import X.F2X;
import X.G0V;
import X.HtJ;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.partners.voice.api.VoicePreviewCache;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoicePreviewCache$1$1", f = "VoicePreviewCache.kt", l = {72, 75, 84}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class VoicePreviewCache$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ VoicePreviewCache this$0;

    /* renamed from: com.facebook.aura.partners.voice.api.VoicePreviewCache$1$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends F2X implements G0V {
        public AnonymousClass1(Object obj) {
            super(2, obj, VoicePreviewCache.Companion.class, "isUnmeteredWifi", "isUnmeteredWifi(Lcom/facebook/aura/network/state/AuraNetworkState;)Z", 4);
        }

        @Override // X.G0V
        public final Object invoke(AuraNetworkState auraNetworkState, HtJ<? super Boolean> htJ) {
            return Boolean.valueOf(((VoicePreviewCache.Companion) this.receiver).isUnmeteredWifi(auraNetworkState));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePreviewCache$1$1(VoicePreviewCache voicePreviewCache, HtJ<? super VoicePreviewCache$1$1> htJ) {
        super(2, htJ);
        this.this$0 = voicePreviewCache;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoicePreviewCache$1$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new VoicePreviewCache$1$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:40:0x00b0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0044 -> B:21:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ab -> B:21:0x0050). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r7 = 3
            r6 = 2
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L1d
            if (r0 == r5) goto L37
            if (r0 == r6) goto L70
            if (r0 != r7) goto L18
            java.lang.Object r3 = r10.L$0
            X.GCW r3 = (X.GCW) r3
            X.Hwg.A00(r11)     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> Lb0
            goto L50
        L18:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L1d:
            X.Hwg.A00(r11)
            com.facebook.aura.partners.voice.api.VoicePreviewCache r0 = r10.this$0
            X.HzR<kotlin.Unit> r0 = r0.wakeups
            X.GCW r3 = r0.APO()
        L28:
            r10.L$0 = r3
            r10.L$1 = r4
            r10.L$2 = r4
            r10.label = r5
            java.lang.Object r11 = r3.A01(r10)
            if (r11 != r8) goto L3e
            return r8
        L37:
            java.lang.Object r3 = r10.L$0
            X.GCW r3 = (X.GCW) r3
            X.Hwg.A00(r11)
        L3e:
            boolean r0 = X.AnonymousClass001.A1X(r11)
            if (r0 == 0) goto Lb8
            r3.A00()
            goto L50
        L48:
            r2 = move-exception
        L49:
            java.lang.String r1 = "VoicePreviewCache"
            java.lang.String r0 = "Widget preview prefetch failed"
            X.CFK.A0A(r1, r0, r2)
        L50:
            com.facebook.aura.partners.voice.gating.VoiceGating r0 = com.facebook.aura.partners.voice.gating.VoiceGating.INSTANCE
            boolean r0 = r0.isWidgetPreviewPrefetchEnabled()
            if (r0 == 0) goto L28
            X.1BN<com.facebook.aura.network.state.AuraNetworkState> r2 = com.facebook.aura.network.state.AuraNetworkMonitor.state
            com.facebook.aura.partners.voice.api.VoicePreviewCache$Companion r1 = com.facebook.aura.partners.voice.api.VoicePreviewCache.Companion
            com.facebook.aura.partners.voice.api.VoicePreviewCache$1$1$1 r0 = new com.facebook.aura.partners.voice.api.VoicePreviewCache$1$1$1
            r0.<init>(r1)
            r10.L$0 = r3
            r10.L$1 = r4
            r10.L$2 = r4
            r10.label = r6
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r10, r0, r2)
            if (r0 != r8) goto L77
            return r8
        L70:
            java.lang.Object r3 = r10.L$0
            X.GCW r3 = (X.GCW) r3
            X.Hwg.A00(r11)
        L77:
            com.facebook.aura.partners.voice.api.VoicePreviewCache r2 = r10.this$0
            java.lang.Object r1 = r2.lock
            monitor-enter(r1)
            java.util.LinkedHashSet<X.HxE<java.lang.String, java.lang.String>> r0 = r2.pendingKeys     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r9 = X.AbstractC0878AGe.A0C(r0)     // Catch: java.lang.Throwable -> Lb5
            X.HxE r9 = (X.HxE) r9     // Catch: java.lang.Throwable -> Lb5
            if (r9 == 0) goto L91
            java.util.LinkedHashSet<X.HxE<java.lang.String, java.lang.String>> r0 = r2.pendingKeys     // Catch: java.lang.Throwable -> Lb5
            r0.remove(r9)     // Catch: java.lang.Throwable -> Lb5
            java.util.Set<X.HxE<java.lang.String, java.lang.String>> r0 = r2.attemptedKeys     // Catch: java.lang.Throwable -> Lb5
            r0.add(r9)     // Catch: java.lang.Throwable -> Lb5
            goto L92
        L91:
            r9 = r4
        L92:
            monitor-exit(r1)
            if (r9 == 0) goto L28
            com.facebook.aura.partners.voice.api.VoicePreviewCache r2 = r10.this$0     // Catch: java.lang.Exception -> Lae java.util.concurrent.CancellationException -> Lb0
            A r1 = r9.first     // Catch: java.lang.Exception -> Lae java.util.concurrent.CancellationException -> Lb0
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lae java.util.concurrent.CancellationException -> Lb0
            B r0 = r9.second     // Catch: java.lang.Exception -> Lae java.util.concurrent.CancellationException -> Lb0
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lae java.util.concurrent.CancellationException -> Lb0
            r10.L$0 = r3     // Catch: java.lang.Exception -> Lae java.util.concurrent.CancellationException -> Lb0
            r10.L$1 = r4     // Catch: java.lang.Exception -> Lae java.util.concurrent.CancellationException -> Lb0
            r10.L$2 = r4     // Catch: java.lang.Exception -> Lae java.util.concurrent.CancellationException -> Lb0
            r10.label = r7     // Catch: java.lang.Exception -> Lae java.util.concurrent.CancellationException -> Lb0
            java.lang.Object r0 = r2.fetch(r1, r0, r5, r10)     // Catch: java.lang.Exception -> Lae java.util.concurrent.CancellationException -> Lb0
            if (r0 != r8) goto L50
            goto Lb4
        Lae:
            r2 = move-exception
            goto L49
        Lb0:
            X.C3cG.A1H(r10)
            goto L50
        Lb4:
            return r8
        Lb5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        Lb8:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoicePreviewCache$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
