package com.facebook.aura.gateway.service;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C60Q;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.nodes.transport.HatchNodeOperationLease;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.gateway.service.NodeCommandService$onStartCommand$job$1", f = "NodeCommandService.kt", l = {130, 136, 136}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class NodeCommandService$onStartCommand$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $command;
    public final /* synthetic */ String $paramsJson;
    public final /* synthetic */ String $requestId;
    public final /* synthetic */ int $startId;
    public final /* synthetic */ Long $timeoutMs;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public Object L$0;
    public int label;
    public final /* synthetic */ NodeCommandService this$0;

    @DebugMetadata(c = "com.facebook.aura.gateway.service.NodeCommandService$onStartCommand$job$1$1", f = "NodeCommandService.kt", l = {131}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.NodeCommandService$onStartCommand$job$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $command;
        public final /* synthetic */ String $paramsJson;
        public final /* synthetic */ String $requestId;
        public final /* synthetic */ int $startId;
        public final /* synthetic */ Long $timeoutMs;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;
        public final /* synthetic */ NodeCommandService this$0;

        /* renamed from: com.facebook.aura.gateway.service.NodeCommandService$onStartCommand$job$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01761 extends AbstractC7559F3s implements Function0<Boolean> {
            public final /* synthetic */ int $startId;
            public final /* synthetic */ NodeCommandService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01761(NodeCommandService nodeCommandService, int i) {
                super(0);
                this.this$0 = nodeCommandService;
                this.$startId = i;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return C3cG.A0P(C60Q.A1W(this.this$0.silentlyCancelled, this.$startId));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NodeCommandService nodeCommandService, String str, String str2, String str3, AbstractC3358CGz abstractC3358CGz, Long l, int i, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.this$0 = nodeCommandService;
            this.$requestId = str;
            this.$command = str2;
            this.$paramsJson = str3;
            this.$userSession = abstractC3358CGz;
            this.$timeoutMs = l;
            this.$startId = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$requestId, this.$command, this.$paramsJson, this.$userSession, this.$timeoutMs, this.$startId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NodeCommandService nodeCommandService = this.this$0;
                String str = this.$requestId;
                String str2 = this.$command;
                String str3 = this.$paramsJson;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                Long l = this.$timeoutMs;
                C01761 c01761 = new C01761(nodeCommandService, this.$startId);
                this.label = 1;
                if (nodeCommandService.executeAndReport(str, str2, str3, abstractC3358CGz, l, c01761, this) == enumC10460Hji) {
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCommandService$onStartCommand$job$1(String str, NodeCommandService nodeCommandService, int i, String str2, String str3, AbstractC3358CGz abstractC3358CGz, Long l, HtJ<? super NodeCommandService$onStartCommand$job$1> htJ) {
        super(2, htJ);
        this.$command = str;
        this.this$0 = nodeCommandService;
        this.$startId = i;
        this.$requestId = str2;
        this.$paramsJson = str3;
        this.$userSession = abstractC3358CGz;
        this.$timeoutMs = l;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NodeCommandService$onStartCommand$job$1(this.$command, this.this$0, this.$startId, this.$requestId, this.$paramsJson, this.$userSession, this.$timeoutMs, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                HatchNodeOperationLease hatchNodeOperationLease = HatchNodeOperationLease.INSTANCE;
                String str = this.$command;
                String strA0M = FGI.A0M("command:", str);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$requestId, str, this.$paramsJson, this.$userSession, this.$timeoutMs, this.$startId, null);
                this.label = 1;
                if (hatchNodeOperationLease.withLease(strA0M, anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        Hwg.A00(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw AnonymousClass001.A0n();
                    }
                    Throwable th = (Throwable) this.L$0;
                    Hwg.A00(obj);
                    throw th;
                }
                Hwg.A00(obj);
            }
            NodeCommandService nodeCommandService = this.this$0;
            int i2 = this.$startId;
            this.label = 2;
            if (nodeCommandService.finishJob(i2, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            NodeCommandService nodeCommandService2 = this.this$0;
            int i3 = this.$startId;
            this.L$0 = th2;
            this.label = 3;
            if (nodeCommandService2.finishJob(i3, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            throw th2;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((NodeCommandService$onStartCommand$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
