package com.facebook.aura.checkpoint.probe;

import X.HtJ;
import X.HzP;
import com.facebook.aura.markdown.render.AuraExpandableMarkdownTextKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchCheckpointProbe {
    public static final HatchCheckpointProbe INSTANCE = new HatchCheckpointProbe();

    @DebugMetadata(c = "com.facebook.aura.checkpoint.probe.HatchCheckpointProbe", f = "HatchCheckpointProbe.kt", l = {57}, m = AuraExpandableMarkdownTextKt.SLOT_PROBE, v = 2)
    /* renamed from: com.facebook.aura.checkpoint.probe.HatchCheckpointProbe$probe$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCheckpointProbe.this.probe(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object probe(X.HtJ<? super com.facebook.aura.checkpoint.probe.HatchCheckpointProbeResult> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.facebook.aura.checkpoint.probe.HatchCheckpointProbe.AnonymousClass1
            if (r0 == 0) goto L7c
            r12 = r14
            com.facebook.aura.checkpoint.probe.HatchCheckpointProbe$probe$1 r12 = (com.facebook.aura.checkpoint.probe.HatchCheckpointProbe.AnonymousClass1) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r12.label
            r0 = 1
            if (r1 == 0) goto L56
            if (r1 != r0) goto L8b
            java.lang.Object r5 = X.AnonymousClass001.A0q(r3)
        L21:
            java.lang.Throwable r0 = X.HsJ.A00(r5)
            if (r0 != 0) goto L82
            com.facebook.aura.checkpoint.probe.CheckpointStatusResponseJson r5 = (com.facebook.aura.checkpoint.probe.CheckpointStatusResponseJson) r5
            boolean r0 = r5.checkpoint_required
            if (r0 == 0) goto L53
            com.facebook.aura.checkpoint.probe.HatchCheckpointProbeStatus r4 = com.facebook.aura.checkpoint.probe.HatchCheckpointProbeStatus.REQUIRED
        L2f:
            java.lang.String r3 = r5.checkpoint_url
            r2 = 0
            if (r3 == 0) goto L51
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 != 0) goto L51
        L3a:
            java.lang.String r1 = r5.checkpoint_id
            if (r1 == 0) goto L45
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L45
            r2 = r1
        L45:
            int r0 = r5.next_check_after_s
            java.lang.Integer r1 = X.C3cG.A0R(r0)
            com.facebook.aura.checkpoint.probe.HatchCheckpointProbeResult r0 = new com.facebook.aura.checkpoint.probe.HatchCheckpointProbeResult
            r0.<init>(r4, r3, r2, r1)
            return r0
        L51:
            r3 = r2
            goto L3a
        L53:
            com.facebook.aura.checkpoint.probe.HatchCheckpointProbeStatus r4 = com.facebook.aura.checkpoint.probe.HatchCheckpointProbeStatus.CLEAR
            goto L2f
        L56:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.checkpoint.probe.CheckpointStefiPath$CheckpointStatus r6 = com.facebook.aura.checkpoint.probe.CheckpointStefiPath.CheckpointStatus.INSTANCE
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r10 = X.AGH.A0E()
            com.facebook.aura.checkpoint.probe.HatchCheckpointProbe$probe$$inlined$executeStefiRequest-bMdYcbs$default$1 r4 = com.facebook.aura.checkpoint.probe.HatchCheckpointProbe$probe$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r5 = 0
            r8 = 0
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.label = r0
            r9 = r8
            r11 = r10
            java.lang.Object r5 = r3.m1596executeBodylessStefiRequestWithtZkwj4A(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r5 != r2) goto L21
            return r2
        L7c:
            com.facebook.aura.checkpoint.probe.HatchCheckpointProbe$probe$1 r12 = new com.facebook.aura.checkpoint.probe.HatchCheckpointProbe$probe$1
            r12.<init>(r14)
            goto L12
        L82:
            com.facebook.aura.checkpoint.probe.HatchCheckpointProbeStatus r1 = com.facebook.aura.checkpoint.probe.HatchCheckpointProbeStatus.UNAVAILABLE
            r0 = 0
            com.facebook.aura.checkpoint.probe.HatchCheckpointProbeResult r2 = new com.facebook.aura.checkpoint.probe.HatchCheckpointProbeResult
            r2.<init>(r1, r0, r0, r0)
            return r2
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.checkpoint.probe.HatchCheckpointProbe.probe(X.HtJ):java.lang.Object");
    }
}
