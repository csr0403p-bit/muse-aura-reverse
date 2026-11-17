package com.facebook.aura.gateway.service;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BQG;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C77S;
import X.C77j;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.gateway.HatchNodeClientAttachment;
import com.facebook.aura.nodes.HeldInvokeParams;
import com.facebook.aura.nodes.transport.HatchNodeOperationLease;
import com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NodeCommandFallbackWorker extends AuraBackgroundCoroutineWorker {
    public static final Companion Companion = new Companion();
    public static final String KEY_COMMAND = "command";
    public static final String KEY_REQUEST_ID = "request_id";
    public static final String KEY_TIMEOUT_MS = "timeout_ms";
    public static final String KEY_USER_ID = "user_id";

    @DebugMetadata(c = "com.facebook.aura.gateway.service.NodeCommandFallbackWorker$doBackgroundWork$2", f = "NodeCommandFallbackWorker.kt", l = {56, 57}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.NodeCommandFallbackWorker$doBackgroundWork$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super C77S>, Object> {
        public final /* synthetic */ String $command;
        public final /* synthetic */ String $requestId;
        public final /* synthetic */ Long $timeoutMs;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;
        public final /* synthetic */ NodeCommandFallbackWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, NodeCommandFallbackWorker nodeCommandFallbackWorker, String str, String str2, Long l, HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
            this.$userSession = abstractC3358CGz;
            this.this$0 = nodeCommandFallbackWorker;
            this.$command = str;
            this.$requestId = str2;
            this.$timeoutMs = l;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass2(this.$userSession, this.this$0, this.$command, this.$requestId, this.$timeoutMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchNodeClientAttachment hatchNodeClientAttachment = HatchNodeClientAttachment.INSTANCE;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                Context context = this.this$0.mAppContext;
                C7384Etj.A0U(context);
                this.label = 1;
                if (hatchNodeClientAttachment.connectForBackgroundWork(abstractC3358CGz, context, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        Hwg.A00(obj);
                    }
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            NodeCommandFallbackWorker nodeCommandFallbackWorker = this.this$0;
            AbstractC3358CGz abstractC3358CGz2 = this.$userSession;
            String str = this.$command;
            String str2 = this.$requestId;
            Long l = this.$timeoutMs;
            this.label = 2;
            obj = nodeCommandFallbackWorker.run(abstractC3358CGz2, str, str2, l, this);
            return obj == enumC10460Hji ? enumC10460Hji : obj;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super C77S> htJ) {
            return ((AnonymousClass2) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.service.NodeCommandFallbackWorker", f = "NodeCommandFallbackWorker.kt", l = {72, 84, 94}, m = "run", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.NodeCommandFallbackWorker$run$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NodeCommandFallbackWorker.this.run(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.service.NodeCommandFallbackWorker$run$2", f = "NodeCommandFallbackWorker.kt", l = {96}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.NodeCommandFallbackWorker$run$2, reason: invalid class name and case insensitive filesystem */
    public final class C121672 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<Boolean> $cancelledByApp;
        public final /* synthetic */ String $command;
        public final /* synthetic */ HeldInvokeParams $heldParams;
        public final /* synthetic */ String $requestId;
        public final /* synthetic */ Long $timeoutMs;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* renamed from: com.facebook.aura.gateway.service.NodeCommandFallbackWorker$run$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ HeldInvokeParams $heldParams;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HeldInvokeParams heldInvokeParams) {
                super(0);
                this.$heldParams = heldInvokeParams;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$heldParams.handlerStarted = true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121672(String str, String str2, AbstractC3358CGz abstractC3358CGz, HeldInvokeParams heldInvokeParams, Long l, Function0<Boolean> function0, HtJ<? super C121672> htJ) {
            super(2, htJ);
            this.$requestId = str;
            this.$command = str2;
            this.$userSession = abstractC3358CGz;
            this.$heldParams = heldInvokeParams;
            this.$timeoutMs = l;
            this.$cancelledByApp = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NodeCommandFallbackWorker.this.new C121672(this.$requestId, this.$command, this.$userSession, this.$heldParams, this.$timeoutMs, this.$cancelledByApp, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PendingCommandStore pendingCommandStore = PendingCommandStore.INSTANCE;
                Context context = NodeCommandFallbackWorker.this.mAppContext;
                C7384Etj.A0U(context);
                pendingCommandStore.save(context, this.$requestId, this.$command);
                NodeCommandDispatcher nodeCommandDispatcher = NodeCommandDispatcher.INSTANCE;
                Context context2 = NodeCommandFallbackWorker.this.mAppContext;
                C7384Etj.A0U(context2);
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                String str = this.$command;
                String str2 = this.$requestId;
                HeldInvokeParams heldInvokeParams = this.$heldParams;
                String str3 = heldInvokeParams.paramsJson;
                Long l = this.$timeoutMs;
                Long lA0S = C3cG.A0S(heldInvokeParams.receivedAtElapsedMs);
                Function0<Boolean> function0 = this.$cancelledByApp;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(heldInvokeParams);
                this.label = 1;
                if (nodeCommandDispatcher.execute(context2, abstractC3358CGz, str, str2, str3, l, lA0S, function0, anonymousClass1, this) == enumC10460Hji) {
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
            return ((C121672) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker
    public Object doBackgroundWork(HtJ<? super C77S> htJ) {
        String strA01 = this.mWorkerParams.A01.A01(KEY_COMMAND);
        String strA012 = this.mWorkerParams.A01.A01("request_id");
        String strA013 = this.mWorkerParams.A01.A01(KEY_USER_ID);
        Object obj = this.mWorkerParams.A01.A00.get("timeout_ms");
        Long lA0S = C3cG.A0S(C3cG.A05(obj instanceof Long ? obj : 0L));
        Long l = null;
        if (lA0S.longValue() > 0) {
            l = lA0S;
        }
        if (strA01 == null || strA01.length() == 0 || strA012 == null || strA012.length() == 0 || strA013 == null || strA013.length() == 0) {
            CFK.A06(NodeCommandFallbackWorkerKt.TAG, "Missing command or requestId or userId in inputData");
        } else {
            CFK.A05(NodeCommandFallbackWorkerKt.TAG, FGI.A0d("doWork: command=", strA01, ", requestId=", BQG.A17(strA012, 8)));
            AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
            if (strA013.equals(currentSession != null ? ((CH0) currentSession).A01 : null)) {
                return HatchNodeOperationLease.INSTANCE.withLease(FGI.A0M("command_worker:", strA01), new AnonymousClass2(currentSession, this, strA01, strA012, l, null), htJ);
            }
            C3cG.A1G("Dropping command queued for another or signed-out user: ", BQG.A17(strA012, 8), NodeCommandFallbackWorkerKt.TAG);
            PendingCommandStore pendingCommandStore = PendingCommandStore.INSTANCE;
            Context context = this.mAppContext;
            C7384Etj.A0U(context);
            pendingCommandStore.remove(context, strA012);
        }
        return new C77j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object run(X.AbstractC3358CGz r15, java.lang.String r16, java.lang.String r17, java.lang.Long r18, X.HtJ<? super X.C77S> r19) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.NodeCommandFallbackWorker.run(X.CGz, java.lang.String, java.lang.String, java.lang.Long, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCommandFallbackWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }
}
