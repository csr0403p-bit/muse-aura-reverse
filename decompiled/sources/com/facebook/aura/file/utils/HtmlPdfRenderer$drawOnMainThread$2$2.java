package com.facebook.aura.file.utils;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HtmlPdfRenderer$drawOnMainThread$2$2 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ PagedWebView $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlPdfRenderer$drawOnMainThread$2$2(PagedWebView pagedWebView) {
        super(1);
        this.$webView = pagedWebView;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        this.$webView.stopLoading();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$webView.stopLoading();
    }
}
