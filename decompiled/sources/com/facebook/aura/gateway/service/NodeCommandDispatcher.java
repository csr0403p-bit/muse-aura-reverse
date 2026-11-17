package com.facebook.aura.gateway.service;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import com.facebook.aura.nodes.HatchNodeClient;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NodeCommandDispatcher {
    public static final NodeCommandDispatcher INSTANCE = new NodeCommandDispatcher();
    public static final String TAG = "NodeCommandDispatcher";

    @DebugMetadata(c = "com.facebook.aura.gateway.service.NodeCommandDispatcher", f = "NodeCommandDispatcher.kt", l = {60, 71}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.NodeCommandDispatcher$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NodeCommandDispatcher.this.execute(null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.gateway.service.NodeCommandDispatcher$execute$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.service.NodeCommandDispatcher$execute$4", f = "NodeCommandDispatcher.kt", l = {72}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.NodeCommandDispatcher$execute$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchNodeClient $nodeClient;
        public final /* synthetic */ String $requestId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchNodeClient hatchNodeClient, String str, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$nodeClient = hatchNodeClient;
            this.$requestId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass4(this.$nodeClient, this.$requestId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NodeCommandDispatcher nodeCommandDispatcher = NodeCommandDispatcher.INSTANCE;
                HatchNodeClient hatchNodeClient = this.$nodeClient;
                String str = this.$requestId;
                this.label = 1;
                if (nodeCommandDispatcher.sendErrorResult$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service(hatchNodeClient, str, "cancelled", "Command was cancelled", this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.gateway.service.NodeCommandDispatcher$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object execute$default(NodeCommandDispatcher nodeCommandDispatcher, Context context, AbstractC3358CGz abstractC3358CGz, String str, String str2, String str3, Long l, Long l2, Function0 function0, Function0 function02, HtJ htJ, int i, Object obj) {
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            l2 = null;
        }
        if ((i & 128) != 0) {
            function0 = AnonymousClass2.INSTANCE;
        }
        if ((i & 256) != 0) {
            function02 = AnonymousClass3.INSTANCE;
        }
        return nodeCommandDispatcher.execute(context, abstractC3358CGz, str, str2, str3, l, l2, function0, function02, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(android.content.Context r16, X.AbstractC3358CGz r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Long r21, java.lang.Long r22, kotlin.jvm.functions.Function0<java.lang.Boolean> r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, X.HtJ<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.NodeCommandDispatcher.execute(android.content.Context, X.CGz, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendErrorResult$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service(com.facebook.aura.nodes.HatchNodeClient r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r8 = this;
            java.lang.String r6 = "Sending fallback error result to backend: requestId="
            boolean r0 = r13 instanceof com.facebook.aura.gateway.service.NodeCommandDispatcher$sendErrorResult$1
            if (r0 == 0) goto L28
            r5 = r13
            com.facebook.aura.gateway.service.NodeCommandDispatcher$sendErrorResult$1 r5 = (com.facebook.aura.gateway.service.NodeCommandDispatcher$sendErrorResult$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r5.label = r2
        L14:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r7 = 8
            java.lang.String r3 = "NodeCommandDispatcher"
            r2 = 1
            if (r0 == 0) goto L37
            if (r0 != r2) goto L32
            java.lang.Object r10 = r5.L$1
            java.lang.String r10 = (java.lang.String) r10
            goto L2e
        L28:
            com.facebook.aura.gateway.service.NodeCommandDispatcher$sendErrorResult$1 r5 = new com.facebook.aura.gateway.service.NodeCommandDispatcher$sendErrorResult$1
            r5.<init>(r8, r13)
            goto L14
        L2e:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L77
            goto L80
        L32:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L37:
            X.Hwg.A00(r1)
            X.2nw r8 = X.C60O.A1K()
            java.lang.Boolean r1 = X.AnonymousClass001.A0h()
            java.lang.String r0 = "ok"
            X.C7qW.A04(r1, r0, r8)
            X.2nw r1 = X.C60O.A1K()
            java.lang.String r0 = "code"
            X.C7qW.A06(r0, r11, r1)
            java.lang.String r0 = "message"
            kotlinx.serialization.json.JsonObject r1 = X.C7qW.A01(r0, r12, r1)
            java.lang.String r0 = "error"
            kotlinx.serialization.json.JsonObject r1 = X.C60O.A1I(r0, r1, r8)
            java.lang.String r0 = X.BQG.A17(r10, r7)     // Catch: java.lang.Exception -> L77
            X.C60Q.A1I(r6, r0, r3)     // Catch: java.lang.Exception -> L77
            r0 = 0
            r5.L$0 = r0     // Catch: java.lang.Exception -> L77
            r5.L$1 = r10     // Catch: java.lang.Exception -> L77
            r5.L$2 = r0     // Catch: java.lang.Exception -> L77
            r5.L$3 = r0     // Catch: java.lang.Exception -> L77
            r5.L$4 = r0     // Catch: java.lang.Exception -> L77
            r5.label = r2     // Catch: java.lang.Exception -> L77
            java.lang.Object r0 = r9.sendInvokeResult(r10, r1, r5)     // Catch: java.lang.Exception -> L77
            if (r0 != r4) goto L80
            return r4
        L77:
            java.lang.String r1 = X.BQG.A17(r10, r7)
            java.lang.String r0 = "Failed to send error result: requestId="
            X.C60O.A1P(r0, r1, r3)
        L80:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.NodeCommandDispatcher.sendErrorResult$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service(com.facebook.aura.nodes.HatchNodeClient, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
