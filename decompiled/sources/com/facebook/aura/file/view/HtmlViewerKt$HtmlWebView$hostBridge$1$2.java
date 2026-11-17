package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C1BO;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionType;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlRoute;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.HtmlViewerKt$HtmlWebView$hostBridge$1$2", f = "HtmlViewer.kt", l = {227}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HtmlViewerKt$HtmlWebView$hostBridge$1$2 extends AbstractC07127nr implements G0V<AuraHtmlHostCallRequest, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<AbstractC3358CGz> $currentUserSession;
    public final /* synthetic */ HatchHtmlSurface $surface;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlViewerKt$HtmlWebView$hostBridge$1$2(HatchHtmlSurface hatchHtmlSurface, C1BO<? extends AbstractC3358CGz> c1bo, HtJ<? super HtmlViewerKt$HtmlWebView$hostBridge$1$2> htJ) {
        super(2, htJ);
        this.$surface = hatchHtmlSurface;
        this.$currentUserSession = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HtmlViewerKt$HtmlWebView$hostBridge$1$2 htmlViewerKt$HtmlWebView$hostBridge$1$2 = new HtmlViewerKt$HtmlWebView$hostBridge$1$2(this.$surface, this.$currentUserSession, htJ);
        htmlViewerKt$HtmlWebView$hostBridge$1$2.L$0 = obj;
        return htmlViewerKt$HtmlWebView$hostBridge$1$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchHtmlActionTrace hatchHtmlActionTraceStartAction;
        AuraHtmlHostCallRequest auraHtmlHostCallRequest = (AuraHtmlHostCallRequest) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                hatchHtmlActionTraceStartAction = HatchHtmlDiagnostics.INSTANCE.startAction(this.$surface, HatchHtmlActionType.BRIDGE_CALL, null);
                AuraHtmlHostCallClient auraHtmlHostCallClient = AuraHtmlHostCallClient.INSTANCE;
                AbstractC3358CGz value = this.$currentUserSession.getValue();
                this.L$0 = auraHtmlHostCallRequest;
                this.L$1 = hatchHtmlActionTraceStartAction;
                this.label = 1;
                if (auraHtmlHostCallClient.call(value, auraHtmlHostCallRequest, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                hatchHtmlActionTraceStartAction = (HatchHtmlActionTrace) this.L$1;
                Hwg.A00(obj);
            }
            hatchHtmlActionTraceStartAction.routed(HatchHtmlRoute.HANDLED);
        } catch (CancellationException e) {
            hatchHtmlActionTraceStartAction.failed(HatchHtmlErrorCode.INTERNAL_ERROR, "cancelled", null);
            throw e;
        } catch (Exception e2) {
            CFK.A0A(HtmlViewerKt.TAG, FGI.A0U("hatch:call ", auraHtmlHostCallRequest.action, ": failed"), e2);
            hatchHtmlActionTraceStartAction.failed(HatchHtmlErrorCode.INTERNAL_ERROR, FGI.A0M("hatch:call ", auraHtmlHostCallRequest.action), e2);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(AuraHtmlHostCallRequest auraHtmlHostCallRequest, HtJ<? super Unit> htJ) {
        return ((HtmlViewerKt$HtmlWebView$hostBridge$1$2) create(auraHtmlHostCallRequest, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
