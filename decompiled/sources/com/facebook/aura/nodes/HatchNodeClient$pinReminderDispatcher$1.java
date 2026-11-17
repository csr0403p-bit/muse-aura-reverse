package com.facebook.aura.nodes;

/* loaded from: classes3.dex */
public final class HatchNodeClient$pinReminderDispatcher$1 implements NodeInvokeReplier {
    public final /* synthetic */ HatchNodeClient this$0;

    public HatchNodeClient$pinReminderDispatcher$1(HatchNodeClient hatchNodeClient) {
        this.this$0 = hatchNodeClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // com.facebook.aura.nodes.NodeInvokeReplier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reply(java.lang.String r11, boolean r12, kotlinx.serialization.json.JsonObject r13, java.lang.String r14, java.lang.String r15, X.HtJ<? super kotlin.Unit> r16) {
        /*
            r10 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.nodes.HatchNodeClient$pinReminderDispatcher$1$reply$1
            if (r0 == 0) goto L43
            r9 = r3
            com.facebook.aura.nodes.HatchNodeClient$pinReminderDispatcher$1$reply$1 r9 = (com.facebook.aura.nodes.HatchNodeClient$pinReminderDispatcher$1$reply$1) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r9.label = r2
        L14:
            java.lang.Object r3 = r9.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L49
            X.Hwg.A00(r3)
        L22:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L25:
            X.Hwg.A00(r3)
            com.facebook.aura.nodes.HatchNodeClient r3 = r10.this$0
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.L$2 = r0
            r9.L$3 = r0
            r5 = r12
            r9.Z$0 = r12
            r9.label = r1
            r4 = r11
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.Object r0 = com.facebook.aura.nodes.HatchNodeClient.access$sendInvokeResultEnvelope(r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r2) goto L22
            return r2
        L43:
            com.facebook.aura.nodes.HatchNodeClient$pinReminderDispatcher$1$reply$1 r9 = new com.facebook.aura.nodes.HatchNodeClient$pinReminderDispatcher$1$reply$1
            r9.<init>(r10, r3)
            goto L14
        L49:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient$pinReminderDispatcher$1.reply(java.lang.String, boolean, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
