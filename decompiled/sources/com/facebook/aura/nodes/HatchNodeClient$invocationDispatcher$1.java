package com.facebook.aura.nodes;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C78T;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G2j;
import X.GAo;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.nodes.api.HatchNodeInvocationHandler;
import com.facebook.aura.nodes.api.HatchNodeInvocationResult;
import com.facebook.aura.nodes.json.ClientInvokeResultParamsJson;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$invocationDispatcher$1", f = "HatchNodeClient.kt", l = {181}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchNodeClient$invocationDispatcher$1 extends AbstractC07127nr implements G2j<String, HatchNodeInvocationResult, HatchNodeInvocationHandler, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ HatchNodeClient this$0;

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$invocationDispatcher$1$1", f = "HatchNodeClient.kt", l = {182}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$invocationDispatcher$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super ClientInvokeResultParamsJson>, Object> {
        public final /* synthetic */ HatchNodeInvocationHandler $handler;
        public final /* synthetic */ String $id;
        public final /* synthetic */ HatchNodeInvocationResult $result;
        public int label;
        public final /* synthetic */ HatchNodeClient this$0;

        @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$invocationDispatcher$1$1$1", f = "HatchNodeClient.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.nodes.HatchNodeClient$invocationDispatcher$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02491 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ClientInvokeResultParamsJson>, Object> {
            public final /* synthetic */ HatchNodeInvocationHandler $handler;
            public final /* synthetic */ String $id;
            public final /* synthetic */ HatchNodeInvocationResult $result;
            public int I$0;
            public Object L$0;
            public int label;
            public final /* synthetic */ HatchNodeClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02491(HatchNodeInvocationHandler hatchNodeInvocationHandler, HatchNodeInvocationResult hatchNodeInvocationResult, HatchNodeClient hatchNodeClient, String str, HtJ<? super C02491> htJ) {
                super(2, htJ);
                this.$handler = hatchNodeInvocationHandler;
                this.$result = hatchNodeInvocationResult;
                this.this$0 = hatchNodeClient;
                this.$id = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02491(this.$handler, this.$result, this.this$0, this.$id, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x0077 A[PHI: r2
  0x0077: PHI (r2v8 com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure) = 
  (r2v5 com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure)
  (r2v10 com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure)
  (r2v10 com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure)
  (r2v10 com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure)
  (r2v10 com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure)
 binds: [B:38:0x0070, B:30:0x005a, B:32:0x0060, B:34:0x0066, B:36:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    X.Hji r6 = X.EnumC10460Hji.A02
                    int r0 = r9.label
                    r3 = 1
                    r8 = 0
                    if (r0 == 0) goto L16
                    if (r0 != r3) goto L11
                    int r5 = r9.I$0
                    java.lang.Object r2 = r9.L$0
                    com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure r2 = (com.facebook.aura.nodes.api.HatchNodeInvocationResult.Failure) r2
                    goto L55
                L11:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L16:
                    X.Hwg.A00(r10)
                    com.facebook.aura.nodes.api.HatchNodeInvocationHandler r0 = r9.$handler
                    if (r0 == 0) goto L35
                    int r5 = r0.getMaxResultBytes()
                    r0 = 8388608(0x800000, float:1.17549435E-38)
                    if (r5 >= r3) goto L30
                    r5 = 1
                L26:
                    com.facebook.aura.nodes.api.HatchNodeInvocationResult r4 = r9.$result
                    boolean r1 = r4 instanceof com.facebook.aura.nodes.api.HatchNodeInvocationResult.Failure
                    if (r1 == 0) goto L38
                    r2 = r4
                    com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure r2 = (com.facebook.aura.nodes.api.HatchNodeInvocationResult.Failure) r2
                    goto L39
                L30:
                    if (r5 <= r0) goto L26
                    r5 = 8388608(0x800000, float:1.17549435E-38)
                    goto L26
                L35:
                    r5 = 1048576(0x100000, float:1.469368E-39)
                    goto L26
                L38:
                    r2 = r8
                L39:
                    boolean r0 = r4 instanceof com.facebook.aura.nodes.api.HatchNodeInvocationResult.Success     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    if (r0 == 0) goto L42
                    com.facebook.aura.nodes.api.HatchNodeInvocationResult$Success r4 = (com.facebook.aura.nodes.api.HatchNodeInvocationResult.Success) r4     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    kotlinx.serialization.json.JsonObject r10 = r4.payload     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    goto L5a
                L42:
                    boolean r0 = r4 instanceof com.facebook.aura.nodes.api.HatchNodeInvocationResult.Deferred     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    if (r0 == 0) goto L70
                    com.facebook.aura.nodes.api.HatchNodeInvocationResult$Deferred r4 = (com.facebook.aura.nodes.api.HatchNodeInvocationResult.Deferred) r4     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    r9.L$0 = r2     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    r9.I$0 = r5     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    r9.label = r3     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    java.lang.Object r10 = r4.encode(r9)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    if (r10 != r6) goto L58
                    return r6
                L55:
                    X.Hwg.A00(r10)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                L58:
                    kotlinx.serialization.json.JsonObject r10 = (kotlinx.serialization.json.JsonObject) r10     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                L5a:
                    if (r10 == 0) goto L77
                    java.lang.String r6 = r10.toString()     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    if (r6 == 0) goto L77
                    int r0 = r6.length()     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    if (r0 > r5) goto L77
                    byte[] r0 = X.C3cG.A1S(r6)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    int r0 = r0.length     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    if (r0 > r5) goto L77
                    goto L78
                L70:
                    if (r1 != 0) goto L77
                    kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                    throw r0     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> Lbc
                L77:
                    r6 = r8
                L78:
                    if (r6 != 0) goto L90
                    goto L7c
                L7b:
                    r6 = r8
                L7c:
                    if (r2 != 0) goto L90
                    com.facebook.aura.nodes.HatchNodeClient r0 = r9.this$0
                    android.content.Context r1 = r0.context
                    r0 = 2131889410(0x7f120d02, float:1.9413483E38)
                    java.lang.String r1 = r1.getString(r0)
                    java.lang.String r0 = "result_unavailable"
                    com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure r2 = new com.facebook.aura.nodes.api.HatchNodeInvocationResult$Failure
                    r2.<init>(r0, r1)
                L90:
                    com.facebook.aura.nodes.api.HatchNodeInvocationHandler r0 = r9.$handler
                    if (r0 == 0) goto Lb5
                    boolean r0 = r0.getRequiresAuthenticatedReply()
                    if (r0 != r3) goto Lb5
                    r3 = r8
                L9b:
                    java.lang.String r4 = r9.$id
                    boolean r5 = X.AnonymousClass002.A1X(r6)
                    if (r2 == 0) goto Lac
                    java.lang.String r1 = r2.code
                    java.lang.String r0 = r2.message
                    com.facebook.aura.nodes.json.ClientInvokeErrorJson r8 = new com.facebook.aura.nodes.json.ClientInvokeErrorJson
                    r8.<init>(r1, r0)
                Lac:
                    r7 = 0
                    com.facebook.aura.nodes.json.ClientInvokeResultParamsJson r2 = new com.facebook.aura.nodes.json.ClientInvokeResultParamsJson
                    r9 = r7
                    r10 = r7
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                    return r2
                Lb5:
                    com.facebook.aura.common.identifiers.AuraDeviceId r0 = com.facebook.aura.common.identifiers.AuraDeviceId.INSTANCE
                    java.lang.String r3 = r0.getNodeId()
                    goto L9b
                Lbc:
                    r0 = move-exception
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient$invocationDispatcher$1.AnonymousClass1.C02491.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super ClientInvokeResultParamsJson> htJ) {
                return ((C02491) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchNodeInvocationHandler hatchNodeInvocationHandler, HatchNodeInvocationResult hatchNodeInvocationResult, HatchNodeClient hatchNodeClient, String str, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.$handler = hatchNodeInvocationHandler;
            this.$result = hatchNodeInvocationResult;
            this.this$0 = hatchNodeClient;
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.$handler, this.$result, this.this$0, this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C78T c78tA0v = C3cG.A0v();
                C02491 c02491 = new C02491(this.$handler, this.$result, this.this$0, this.$id, null);
                this.label = 1;
                obj = GAo.A00(this, c78tA0v, c02491);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super ClientInvokeResultParamsJson> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$invocationDispatcher$1(HatchNodeClient hatchNodeClient, HtJ<? super HatchNodeClient$invocationDispatcher$1> htJ) {
        super(4, htJ);
        this.this$0 = hatchNodeClient;
    }

    @Override // X.G2j
    public final Object invoke(String str, HatchNodeInvocationResult hatchNodeInvocationResult, HatchNodeInvocationHandler hatchNodeInvocationHandler, HtJ<? super Unit> htJ) {
        HatchNodeClient$invocationDispatcher$1 hatchNodeClient$invocationDispatcher$1 = new HatchNodeClient$invocationDispatcher$1(this.this$0, htJ);
        hatchNodeClient$invocationDispatcher$1.L$0 = str;
        hatchNodeClient$invocationDispatcher$1.L$1 = hatchNodeInvocationResult;
        hatchNodeClient$invocationDispatcher$1.L$2 = hatchNodeInvocationHandler;
        return hatchNodeClient$invocationDispatcher$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r9 = r11.L$0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r11.L$1
            com.facebook.aura.nodes.api.HatchNodeInvocationResult r7 = (com.facebook.aura.nodes.api.HatchNodeInvocationResult) r7
            java.lang.Object r6 = r11.L$2
            com.facebook.aura.nodes.api.HatchNodeInvocationHandler r6 = (com.facebook.aura.nodes.api.HatchNodeInvocationHandler) r6
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 != r3) goto L47
            X.Hwg.A00(r12)
        L18:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L1b:
            X.Hwg.A00(r12)
            com.facebook.aura.nodes.HatchNodeClient r0 = r11.this$0
            com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol r2 = r0.protocol
            if (r2 == 0) goto L18
            if (r6 == 0) goto L2d
            boolean r1 = r6.getRequiresAuthenticatedReply()
            r0 = 1
            if (r1 == r3) goto L2e
        L2d:
            r0 = 0
        L2e:
            com.facebook.aura.nodes.HatchNodeClient r8 = r11.this$0
            r10 = 0
            com.facebook.aura.nodes.HatchNodeClient$invocationDispatcher$1$1 r5 = new com.facebook.aura.nodes.HatchNodeClient$invocationDispatcher$1$1
            r5.<init>(r6, r7, r8, r9, r10)
            r11.L$0 = r10
            r11.L$1 = r10
            r11.L$2 = r10
            r11.L$3 = r10
            r11.label = r3
            java.lang.Object r0 = r2.sendInvokeResult(r0, r5, r11)
            if (r0 != r4) goto L18
            return r4
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient$invocationDispatcher$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
