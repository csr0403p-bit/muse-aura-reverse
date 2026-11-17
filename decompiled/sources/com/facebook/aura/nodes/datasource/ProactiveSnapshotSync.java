package com.facebook.aura.nodes.datasource;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ProactiveSnapshotSync {
    public static final String FINGERPRINT = "snapshot";
    public static final String HASH_KEY = "snapshot";
    public static final ProactiveSnapshotSync INSTANCE = new ProactiveSnapshotSync();

    @DebugMetadata(c = "com.facebook.aura.nodes.datasource.ProactiveSnapshotSync", f = "ProactiveSnapshotSync.kt", l = {48}, m = "publishIfChanged", v = 2)
    /* renamed from: com.facebook.aura.nodes.datasource.ProactiveSnapshotSync$publishIfChanged$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProactiveSnapshotSync.this.publishIfChanged(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publishIfChanged(com.facebook.aura.nodes.datasource.DataSourceContext r12, java.lang.String r13, kotlinx.serialization.json.JsonArray r14, kotlinx.serialization.json.JsonObject r15, X.HtJ<? super com.facebook.aura.nodes.datasource.DataSourceResult> r16) {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.nodes.datasource.ProactiveSnapshotSync.AnonymousClass1
            if (r0 == 0) goto L9a
            r4 = r3
            com.facebook.aura.nodes.datasource.ProactiveSnapshotSync$publishIfChanged$1 r4 = (com.facebook.aura.nodes.datasource.ProactiveSnapshotSync.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r7 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            java.lang.String r8 = "snapshot"
            r3 = 1
            java.lang.String r2 = "ProactiveSnapshotSync"
            if (r0 == 0) goto L58
            if (r0 != r3) goto Lb1
            java.lang.Object r6 = r4.L$5
            java.lang.Object r1 = r4.L$4
            com.facebook.aura.nodes.datasource.NodeSyncBaselineStore r1 = (com.facebook.aura.nodes.datasource.NodeSyncBaselineStore) r1
            java.lang.Object r14 = r4.L$2
            kotlinx.serialization.json.JsonArray r14 = (kotlinx.serialization.json.JsonArray) r14
            java.lang.Object r0 = r4.L$1
            java.lang.String r13 = X.C3cG.A0d(r0, r7)
        L33:
            boolean r0 = X.AnonymousClass001.A1X(r7)
            if (r0 == 0) goto La1
            java.util.Map r9 = X.AnonymousClass006.A10(r8, r6)
            r11 = 4
            r10 = 0
            com.facebook.aura.nodes.datasource.NodeSyncBaselineStore$Baseline r7 = new com.facebook.aura.nodes.datasource.NodeSyncBaselineStore$Baseline
            r12 = r10
            r7.<init>(r8, r9, r10, r11, r12)
            r1.commit(r13, r7)
            int r1 = r14.size()
            java.lang.String r0 = " snapshot published itemCount="
            java.lang.String r0 = X.FGI.A0S(r13, r0, r1)
            X.CFK.A05(r2, r0)
        L55:
            com.facebook.aura.nodes.datasource.DataSourceResult$Ok r5 = com.facebook.aura.nodes.datasource.DataSourceResult.Ok.INSTANCE
            return r5
        L58:
            X.Hwg.A00(r7)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L55
            X.CGz r0 = r12.userSession
            com.facebook.aura.nodes.datasource.NodeSyncBaselineStore r1 = new com.facebook.aura.nodes.datasource.NodeSyncBaselineStore
            r1.<init>(r0)
            com.facebook.aura.nodes.datasource.NodeSyncDiff r0 = com.facebook.aura.nodes.datasource.NodeSyncDiff.INSTANCE
            java.lang.String r6 = r0.canonicalHash(r14)
            com.facebook.aura.nodes.datasource.NodeSyncBaselineStore$Baseline r0 = r1.read(r13)
            if (r0 == 0) goto L98
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.hashes
            if (r0 == 0) goto L98
            java.lang.Object r0 = r0.get(r8)
        L7c:
            boolean r0 = X.C7384Etj.areEqual(r0, r6)
            if (r0 != 0) goto L55
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r13
            r4.L$2 = r14
            r4.L$3 = r0
            r4.L$4 = r1
            r4.L$5 = r6
            r4.label = r3
            java.lang.Object r7 = r12.publish(r13, r15, r4)
            if (r7 != r5) goto L33
            return r5
        L98:
            r0 = 0
            goto L7c
        L9a:
            com.facebook.aura.nodes.datasource.ProactiveSnapshotSync$publishIfChanged$1 r4 = new com.facebook.aura.nodes.datasource.ProactiveSnapshotSync$publishIfChanged$1
            r4.<init>(r3)
            goto L14
        La1:
            java.lang.String r1 = "Failed to publish "
            java.lang.String r0 = " snapshot"
            java.lang.String r2 = X.FGI.A0U(r1, r13, r0)
            java.lang.String r1 = "publish_failed"
            com.facebook.aura.nodes.datasource.DataSourceResult$Error r0 = new com.facebook.aura.nodes.datasource.DataSourceResult$Error
            r0.<init>(r1, r2)
            return r0
        Lb1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.ProactiveSnapshotSync.publishIfChanged(com.facebook.aura.nodes.datasource.DataSourceContext, java.lang.String, kotlinx.serialization.json.JsonArray, kotlinx.serialization.json.JsonObject, X.HtJ):java.lang.Object");
    }
}
