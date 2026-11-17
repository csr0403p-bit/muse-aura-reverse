package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C10543Hqv;
import X.C3cI;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.localbrowser.core.BrowserEngine;
import com.facebook.aura.nodes.api.HatchNodeInvocation;
import com.hatch.browser.core.CommandReport;
import com.hatch.browser.protocol.CommandRequest;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$dispatch$execute$1", f = "LocalBrowserEndpointNodeHandler.kt", l = {361}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserEndpointNodeHandler$dispatch$execute$1 extends AbstractC07127nr implements G0U<HtJ<? super CommandReport>, Object> {
    public final /* synthetic */ CommandRequest $decoded;
    public final /* synthetic */ LocalBrowserEndpoint $endpoint;
    public final /* synthetic */ HatchNodeInvocation $invocation;
    public final /* synthetic */ long $requestDeadline;
    public final /* synthetic */ C10543Hqv<CommandReport> $retained;
    public final /* synthetic */ LocalBrowserSession $session;
    public final /* synthetic */ LocalBrowserTask $task;
    public int label;
    public final /* synthetic */ LocalBrowserEndpointNodeHandler this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$dispatch$execute$1$1", f = "LocalBrowserEndpointNodeHandler.kt", l = {363}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$dispatch$execute$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super CommandReport>, Object> {
        public final /* synthetic */ CommandRequest $decoded;
        public final /* synthetic */ long $requestDeadline;
        public final /* synthetic */ C10543Hqv<CommandReport> $retained;
        public final /* synthetic */ LocalBrowserTask $task;
        public int label;
        public final /* synthetic */ LocalBrowserEndpointNodeHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LocalBrowserTask localBrowserTask, CommandRequest commandRequest, LocalBrowserEndpointNodeHandler localBrowserEndpointNodeHandler, long j, C10543Hqv<CommandReport> c10543Hqv, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.$task = localBrowserTask;
            this.$decoded = commandRequest;
            this.this$0 = localBrowserEndpointNodeHandler;
            this.$requestDeadline = j;
            this.$retained = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.$task, this.$decoded, this.this$0, this.$requestDeadline, this.$retained, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            T t;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserEngine browserEngine = this.$task.engine;
                CommandRequest commandRequest = this.$decoded;
                CommandRequest commandRequestCopy = commandRequest.copy(commandRequest.operationId, commandRequest.page, commandRequest.task, this.this$0.budget(this.$requestDeadline, commandRequest.budget), commandRequest.command, commandRequest.observeAfter);
                this.label = 1;
                Object objExecute = browserEngine.execute(commandRequestCopy, this);
                t = objExecute;
                if (objExecute == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                t = obj;
            }
            this.$retained.element = t;
            return t;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super CommandReport> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserEndpointNodeHandler$dispatch$execute$1(HatchNodeInvocation hatchNodeInvocation, LocalBrowserEndpoint localBrowserEndpoint, LocalBrowserSession localBrowserSession, LocalBrowserTask localBrowserTask, CommandRequest commandRequest, LocalBrowserEndpointNodeHandler localBrowserEndpointNodeHandler, long j, C10543Hqv<CommandReport> c10543Hqv, HtJ<? super LocalBrowserEndpointNodeHandler$dispatch$execute$1> htJ) {
        super(1, htJ);
        this.$invocation = hatchNodeInvocation;
        this.$endpoint = localBrowserEndpoint;
        this.$session = localBrowserSession;
        this.$task = localBrowserTask;
        this.$decoded = commandRequest;
        this.this$0 = localBrowserEndpointNodeHandler;
        this.$requestDeadline = j;
        this.$retained = c10543Hqv;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LocalBrowserEndpointNodeHandler$dispatch$execute$1(this.$invocation, this.$endpoint, this.$session, this.$task, this.$decoded, this.this$0, this.$requestDeadline, this.$retained, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws LocalBrowserEndpointFailure {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!AnonymousClass003.A1Y(this.$invocation.isConnectionCurrent) || !this.$endpoint.isCurrent(this.$invocation.connectionGeneration)) {
                throw C3cI.A0E("stale_connection");
            }
            LocalBrowserNativeUi localBrowserNativeUi = this.$session.target.nativeUi;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$task, this.$decoded, this.this$0, this.$requestDeadline, this.$retained, null);
            this.label = 1;
            obj = localBrowserNativeUi.duringCommand(anonymousClass1, this);
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
    public final Object invoke(HtJ<? super CommandReport> htJ) {
        return ((LocalBrowserEndpointNodeHandler$dispatch$execute$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
