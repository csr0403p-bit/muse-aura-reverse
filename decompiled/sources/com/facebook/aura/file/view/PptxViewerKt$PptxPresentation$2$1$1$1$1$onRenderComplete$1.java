package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.view.PptxRenderState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.file.view.PptxViewerKt$PptxPresentation$2$1$1$1$1$onRenderComplete$1", f = "PptxViewer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PptxViewerKt$PptxPresentation$2$1$1$1$1$onRenderComplete$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ WebView $pptxWebView;
    public final /* synthetic */ MutableState<PptxRenderState> $renderState$delegate;
    public int label;

    /* renamed from: com.facebook.aura.file.view.PptxViewerKt$PptxPresentation$2$1$1$1$1$onRenderComplete$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ WebView $pptxWebView;
        public final /* synthetic */ MutableState<PptxRenderState> $renderState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebView webView, MutableState<PptxRenderState> mutableState) {
            super(0);
            this.$pptxWebView = webView;
            this.$renderState$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PptxViewerKt.logPptxLayout(this.$pptxWebView, "after_native_fit");
            this.$renderState$delegate.Af8(PptxRenderState.Success.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PptxViewerKt$PptxPresentation$2$1$1$1$1$onRenderComplete$1(WebView webView, MutableState<PptxRenderState> mutableState, HtJ<? super PptxViewerKt$PptxPresentation$2$1$1$1$1$onRenderComplete$1> htJ) {
        super(2, htJ);
        this.$pptxWebView = webView;
        this.$renderState$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PptxViewerKt$PptxPresentation$2$1$1$1$1$onRenderComplete$1(this.$pptxWebView, this.$renderState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        PptxViewerKt.logPptxLayout(this.$pptxWebView, "before_native_fit");
        WebView webView = this.$pptxWebView;
        PptxViewerKt.fitPptxToViewport(webView, new AnonymousClass1(webView, this.$renderState$delegate));
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((PptxViewerKt$PptxPresentation$2$1$1$1$1$onRenderComplete$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
