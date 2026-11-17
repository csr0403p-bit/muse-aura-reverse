package com.facebook.aura.nodes;

import com.facebook.aura.nodes.datasource.DataSourcePublishSink;
import com.facebook.aura.nodes.datasource.InvokeResultAck;

/* loaded from: classes3.dex */
public final class HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1 implements DataSourcePublishSink, InvokeResultAck {
    public final /* synthetic */ String $requestId;
    public boolean acked;
    public int chunksAttempted;
    public int chunksRejected;
    public final /* synthetic */ HatchNodeClient this$0;
    public int totalBytes;

    public HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1(HatchNodeClient hatchNodeClient, String str) {
        this.this$0 = hatchNodeClient;
        this.$requestId = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // com.facebook.aura.nodes.datasource.InvokeResultAck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object ack(kotlinx.serialization.json.JsonObject r13, X.HtJ<? super java.lang.Boolean> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$ack$1
            if (r0 == 0) goto L4b
            r9 = r14
            com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$ack$1 r9 = (com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$ack$1) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r9.label = r2
        L12:
            java.lang.Object r1 = r9.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r5 = 1
            if (r0 == 0) goto L33
            if (r0 != r5) goto L51
            X.Hwg.A00(r1)
        L20:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r2 = r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L32
            r12.acked = r5
            com.facebook.aura.perf.HatchNodeQplLogger r1 = com.facebook.aura.perf.HatchNodeQplLogger.INSTANCE
            java.lang.String r0 = r12.$requestId
            r1.backfillAckSent(r0)
        L32:
            return r2
        L33:
            X.Hwg.A00(r1)
            com.facebook.aura.nodes.HatchNodeClient r3 = r12.this$0
            java.lang.String r4 = r12.$requestId
            r7 = 0
            r9.L$0 = r7
            r9.label = r5
            r10 = 24
            r6 = r13
            r8 = r7
            r11 = r7
            java.lang.Object r1 = com.facebook.aura.nodes.HatchNodeClient.sendInvokeResultEnvelope$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r2) goto L20
            return r2
        L4b:
            com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$ack$1 r9 = new com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$ack$1
            r9.<init>(r12, r14)
            goto L12
        L51:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1.ack(kotlinx.serialization.json.JsonObject, X.HtJ):java.lang.Object");
    }

    public final boolean getAcked() {
        return this.acked;
    }

    public final int getChunksAttempted() {
        return this.chunksAttempted;
    }

    public final int getChunksRejected() {
        return this.chunksRejected;
    }

    public final int getTotalBytes() {
        return this.totalBytes;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    @Override // com.facebook.aura.nodes.datasource.DataSourcePublishSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object publish(com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson r7, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$publish$1
            if (r0 == 0) goto L72
            r4 = r8
            com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$publish$1 r4 = (com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$publish$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r5 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L46
            if (r0 != r2) goto L78
            java.lang.Object r7 = r4.L$0
            com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson r7 = (com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson) r7
            X.Hwg.A00(r5)
        L24:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r1 = r5.booleanValue()
            if (r1 != 0) goto L32
            int r0 = r6.chunksRejected
            int r0 = r0 + 1
            r6.chunksRejected = r0
        L32:
            java.lang.Boolean r0 = r7.is_final
            boolean r0 = X.AnonymousClass002.A1b(r0, r2)
            if (r0 == 0) goto L45
            if (r1 == 0) goto L45
            com.facebook.aura.perf.HatchNodeQplLogger r2 = com.facebook.aura.perf.HatchNodeQplLogger.INSTANCE
            java.lang.String r1 = r6.$requestId
            java.lang.Integer r0 = r7.chunk_count
            r2.backfillFinalChunkSent(r1, r0)
        L45:
            return r5
        L46:
            X.Hwg.A00(r5)
            int r0 = r6.chunksAttempted
            if (r0 != 0) goto L54
            com.facebook.aura.perf.HatchNodeQplLogger r1 = com.facebook.aura.perf.HatchNodeQplLogger.INSTANCE
            java.lang.String r0 = r6.$requestId
            r1.backfillFirstChunkSent(r0)
        L54:
            int r0 = r6.chunksAttempted
            int r0 = r0 + 1
            r6.chunksAttempted = r0
            int r1 = r6.totalBytes
            java.lang.String r0 = r7.payload_json
            int r0 = r0.length()
            int r1 = r1 + r0
            r6.totalBytes = r1
            com.facebook.aura.nodes.HatchNodeClient r0 = r6.this$0
            r4.L$0 = r7
            r4.label = r2
            java.lang.Object r5 = r0.sendDataSourcePublish(r7, r4)
            if (r5 != r3) goto L24
            return r3
        L72:
            com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$publish$1 r4 = new com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$publish$1
            r4.<init>(r6, r8)
            goto L12
        L78:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1.publish(com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson, X.HtJ):java.lang.Object");
    }
}
