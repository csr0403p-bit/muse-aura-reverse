package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class PptxViewerKt$PptxPresentation$2$3$1 extends AbstractC7559F3s implements G0U<WebView, Unit> {
    public final /* synthetic */ float $contentBottomPadding;
    public final /* synthetic */ MutableState<Boolean> $isPageLoaded$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        if (MutableState.A0A((MutableState) this.$isPageLoaded$delegate)) {
            webView.evaluateJavascript(FGI.A0I("setBottomPaddingDp(", (int) this.$contentBottomPadding, ");"), null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PptxViewerKt$PptxPresentation$2$3$1(float f, MutableState<Boolean> mutableState) {
        super(1);
        this.$contentBottomPadding = f;
        this.$isPageLoaded$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
        invoke2(webView);
        return Unit.INSTANCE;
    }
}
