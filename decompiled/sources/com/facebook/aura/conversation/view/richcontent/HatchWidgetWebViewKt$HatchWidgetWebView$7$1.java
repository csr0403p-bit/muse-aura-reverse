package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import android.widget.FrameLayout;
import com.facebook.aura.json.HatchInlineScriptKt;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlEntrySource;
import com.facebook.aura.webview.diagnostics.HatchHtmlRenderTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchWidgetWebViewKt$HatchWidgetWebView$7$1 extends AbstractC7559F3s implements G0U<FrameLayout, Unit> {
    public final /* synthetic */ String $assetAuthToken;
    public final /* synthetic */ String $assetBaseUrl;
    public final /* synthetic */ String $contentKey;
    public final /* synthetic */ String $documentUrl;
    public final /* synthetic */ WidgetHostTheme $hostTheme;
    public final /* synthetic */ String $hostThemeKey;
    public final /* synthetic */ Function0<Unit> $onRendererGone;
    public final /* synthetic */ G0U<String, Unit> $onWidgetSetState;
    public final /* synthetic */ String $shellHtml;
    public final /* synthetic */ String $shellPrefix;
    public final /* synthetic */ String $shellSuffix;
    public final /* synthetic */ String $sourcePath;
    public final /* synthetic */ String $stateJson;
    public final /* synthetic */ String $stateSyncKey;
    public final /* synthetic */ int $stateVersion;
    public final /* synthetic */ String $theme;
    public final /* synthetic */ G0U<Integer, Unit> $updateContentHeight;

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt$HatchWidgetWebView$7$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Unit> {
        public final /* synthetic */ G0U<String, Unit> $onWidgetSetState;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            this.$onWidgetSetState.invoke(str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super String, Unit> g0u) {
            super(1);
            this.$onWidgetSetState = g0u;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FrameLayout frameLayout) {
        WidgetWebViewState widgetWebViewState;
        C7384Etj.A0Y(frameLayout, 0);
        WidgetWebView widgetWebViewWidgetWebViewOrNull = HatchWidgetWebViewKt.widgetWebViewOrNull(frameLayout);
        if (widgetWebViewWidgetWebViewOrNull != null) {
            Object tag = frameLayout.getTag();
            if (!(tag instanceof WidgetWebViewState) || (widgetWebViewState = (WidgetWebViewState) tag) == null) {
                return;
            }
            widgetWebViewState.update(this.$assetBaseUrl, this.$assetAuthToken, new AnonymousClass1(this.$onWidgetSetState), this.$updateContentHeight, this.$onRendererGone);
            widgetWebViewState.updateDocumentSource(this.$sourcePath, this.$shellPrefix, this.$shellSuffix);
            if (!widgetWebViewState.shouldLoadContent(this.$contentKey, this.$hostThemeKey)) {
                if (widgetWebViewState.shouldApplyTheme(this.$hostThemeKey)) {
                    widgetWebViewWidgetWebViewOrNull.evaluateJavascript(FGI.A0h("if(typeof updateTheme==='function')updateTheme('", this.$theme, "',", HatchInlineScriptKt.toInlineScriptStringLiteral(this.$hostTheme.cssVariables), ")"), null);
                }
                if (widgetWebViewState.shouldApplyState(this.$stateSyncKey)) {
                    widgetWebViewWidgetWebViewOrNull.evaluateJavascript(FGI.A0A(this.$stateVersion, "if(typeof updateWidgetState==='function')updateWidgetState(", HatchInlineScriptKt.toInlineScriptStringLiteral(this.$stateJson), ",", ")"), null);
                    return;
                }
                return;
            }
            HatchHtmlRenderTrace hatchHtmlRenderTrace = widgetWebViewState.renderTrace;
            if (hatchHtmlRenderTrace != null) {
                hatchHtmlRenderTrace.cancelled();
            }
            HatchHtmlDiagnostics hatchHtmlDiagnostics = HatchHtmlDiagnostics.INSTANCE;
            HatchHtmlSurface hatchHtmlSurface = HatchHtmlSurface.CHAT_WIDGET;
            HatchHtmlEntrySource hatchHtmlEntrySource = HatchHtmlEntrySource.CHAT_INLINE;
            String str = this.$documentUrl;
            if (str == null) {
                str = HatchWidgetWebViewKt.WIDGET_BASE_URL;
            }
            widgetWebViewState.renderTrace = hatchHtmlDiagnostics.startRender(hatchHtmlSurface, hatchHtmlEntrySource, str);
            String str2 = this.$documentUrl;
            if (str2 != null) {
                widgetWebViewWidgetWebViewOrNull.loadUrl(str2);
            } else {
                widgetWebViewWidgetWebViewOrNull.loadDataWithBaseURL(HatchWidgetWebViewKt.WIDGET_BASE_URL, this.$shellHtml, "text/html", "utf-8", null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchWidgetWebViewKt$HatchWidgetWebView$7$1(String str, String str2, G0U<? super Integer, Unit> g0u, Function0<Unit> function0, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, WidgetHostTheme widgetHostTheme, String str11, String str12, int i, G0U<? super String, Unit> g0u2) {
        super(1);
        this.$assetBaseUrl = str;
        this.$assetAuthToken = str2;
        this.$updateContentHeight = g0u;
        this.$onRendererGone = function0;
        this.$sourcePath = str3;
        this.$shellPrefix = str4;
        this.$shellSuffix = str5;
        this.$contentKey = str6;
        this.$hostThemeKey = str7;
        this.$documentUrl = str8;
        this.$shellHtml = str9;
        this.$theme = str10;
        this.$hostTheme = widgetHostTheme;
        this.$stateSyncKey = str11;
        this.$stateJson = str12;
        this.$stateVersion = i;
        this.$onWidgetSetState = g0u2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(FrameLayout frameLayout) {
        invoke2(frameLayout);
        return Unit.INSTANCE;
    }
}
