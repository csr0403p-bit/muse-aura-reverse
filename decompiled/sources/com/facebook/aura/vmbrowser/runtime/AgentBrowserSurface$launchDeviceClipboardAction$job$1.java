package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.R;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vmbrowser.runtime.BrowserClipboardTelemetry;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface$launchDeviceClipboardAction$job$1", f = "AgentBrowserSurface.kt", l = {407}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AgentBrowserSurface$launchDeviceClipboardAction$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ BrowserDeviceClipboardAction $action;
    public final /* synthetic */ BrowserClipboardTelemetry.Attempt $attempt;
    public final /* synthetic */ G0V<Function0<Boolean>, HtJ<? super Unit>, Object> $block;
    public final /* synthetic */ int $unexpectedFailureMessage;
    public Object L$0;
    public int label;
    public final /* synthetic */ AgentBrowserSurface this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgentBrowserSurface$launchDeviceClipboardAction$job$1(AgentBrowserSurface agentBrowserSurface, BrowserClipboardTelemetry.Attempt attempt, BrowserDeviceClipboardAction browserDeviceClipboardAction, G0V<? super Function0<Boolean>, ? super HtJ<? super Unit>, ? extends Object> g0v, int i, HtJ<? super AgentBrowserSurface$launchDeviceClipboardAction$job$1> htJ) {
        super(2, htJ);
        this.this$0 = agentBrowserSurface;
        this.$attempt = attempt;
        this.$action = browserDeviceClipboardAction;
        this.$block = g0v;
        this.$unexpectedFailureMessage = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AgentBrowserSurface$launchDeviceClipboardAction$job$1(this.this$0, this.$attempt, this.$action, this.$block, this.$unexpectedFailureMessage, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Function0<Boolean> function0CaptureClipboardActionContext;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                boolean zA1Y = AnonymousClass003.A1Y(function0CaptureClipboardActionContext);
                AgentBrowserSurface agentBrowserSurface = this.this$0;
                if (zA1Y) {
                    agentBrowserSurface.clipboardTelemetry.finishUnexpectedFailure(this.$attempt);
                    if (this.$action == BrowserDeviceClipboardAction.PASTE) {
                        ToastApi.INSTANCE.showLongToast(this.$unexpectedFailureMessage);
                    } else {
                        ToastApi.INSTANCE.showToast(this.$unexpectedFailureMessage);
                    }
                } else {
                    agentBrowserSurface.clipboardTelemetry.finishCancellation(this.$attempt);
                }
            }
            if (i == 0) {
                Hwg.A00(obj);
                BrowserDeviceClipboardAction value = this.this$0.mutablePendingDeviceClipboardAction.getValue();
                AgentBrowserSurface agentBrowserSurface2 = this.this$0;
                if (value != null) {
                    agentBrowserSurface2.clipboardTelemetry.finishAttempt(this.$attempt, BrowserClipboardTelemetry.Outcome.BLOCKED, BrowserClipboardTelemetry.Stage.ACCEPTED, BrowserClipboardTelemetry.ClosedReason.ACTION_IN_PROGRESS, null);
                } else {
                    function0CaptureClipboardActionContext = agentBrowserSurface2.viewerSession.captureClipboardActionContext();
                    AgentBrowserSurface agentBrowserSurface3 = this.this$0;
                    if (function0CaptureClipboardActionContext == null) {
                        agentBrowserSurface3.clipboardTelemetry.finishAttempt(this.$attempt, BrowserClipboardTelemetry.Outcome.BLOCKED, BrowserClipboardTelemetry.Stage.ACCEPTED, BrowserClipboardTelemetry.ClosedReason.CONTROLS_UNAVAILABLE, null);
                        ToastApi toastApi = ToastApi.INSTANCE;
                        BrowserDeviceClipboardAction browserDeviceClipboardAction = this.$action;
                        BrowserDeviceClipboardAction browserDeviceClipboardAction2 = BrowserDeviceClipboardAction.COPY;
                        int i2 = R.string._name_removed__res_0x7f1201d2;
                        if (browserDeviceClipboardAction == browserDeviceClipboardAction2) {
                            i2 = R.string._name_removed__res_0x7f1201cb;
                        }
                        toastApi.showToast(i2);
                    } else {
                        agentBrowserSurface3.mutablePendingDeviceClipboardAction.Af8(this.$action);
                        this.this$0.controller.refreshClipboardMenu$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime();
                        G0V<Function0<Boolean>, HtJ<? super Unit>, Object> g0v = this.$block;
                        this.L$0 = function0CaptureClipboardActionContext;
                        this.label = 1;
                        if (g0v.invoke(function0CaptureClipboardActionContext, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            function0CaptureClipboardActionContext = (Function0) this.L$0;
            Hwg.A00(obj);
            return Unit.INSTANCE;
        } finally {
            this.this$0.mutablePendingDeviceClipboardAction.Af8(null);
            this.this$0.controller.refreshClipboardMenu$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime();
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AgentBrowserSurface$launchDeviceClipboardAction$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
