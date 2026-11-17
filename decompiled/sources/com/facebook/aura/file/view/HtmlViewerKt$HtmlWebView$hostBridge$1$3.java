package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.CFK;
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
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.file.view.HtmlViewerKt$HtmlWebView$hostBridge$1$3", f = "HtmlViewer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HtmlViewerKt$HtmlWebView$hostBridge$1$3 extends AbstractC07127nr implements G0V<AuraHtmlHostNavigateRequest, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnNavigateToMainChat;
    public final /* synthetic */ HatchHtmlSurface $surface;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlViewerKt$HtmlWebView$hostBridge$1$3(HatchHtmlSurface hatchHtmlSurface, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super HtmlViewerKt$HtmlWebView$hostBridge$1$3> htJ) {
        super(2, htJ);
        this.$surface = hatchHtmlSurface;
        this.$currentOnNavigateToMainChat = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HtmlViewerKt$HtmlWebView$hostBridge$1$3 htmlViewerKt$HtmlWebView$hostBridge$1$3 = new HtmlViewerKt$HtmlWebView$hostBridge$1$3(this.$surface, this.$currentOnNavigateToMainChat, htJ);
        htmlViewerKt$HtmlWebView$hostBridge$1$3.L$0 = obj;
        return htmlViewerKt$HtmlWebView$hostBridge$1$3;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        AuraHtmlHostNavigateRequest auraHtmlHostNavigateRequest = (AuraHtmlHostNavigateRequest) this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchHtmlActionTrace hatchHtmlActionTraceStartAction = HatchHtmlDiagnostics.INSTANCE.startAction(this.$surface, HatchHtmlActionType.BRIDGE_NAVIGATE, null);
        String str = auraHtmlHostNavigateRequest.target;
        if ("chat.main".equals(str)) {
            Function0 function0A0A = C1BO.A0A(this.$currentOnNavigateToMainChat);
            if (function0A0A != null) {
                function0A0A.invoke();
            }
            hatchHtmlActionTraceStartAction.routed(HatchHtmlRoute.CHAT);
        } else {
            CFK.A06(HtmlViewerKt.TAG, FGI.A0M("Ignoring unsupported hatch:navigate target=", str));
            hatchHtmlActionTraceStartAction.failed(HatchHtmlErrorCode.BRIDGE_ACTION_NOT_ALLOWED, FGI.A0M("target=", auraHtmlHostNavigateRequest.target), null);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(AuraHtmlHostNavigateRequest auraHtmlHostNavigateRequest, HtJ<? super Unit> htJ) {
        return ((HtmlViewerKt$HtmlWebView$hostBridge$1$3) create(auraHtmlHostNavigateRequest, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
