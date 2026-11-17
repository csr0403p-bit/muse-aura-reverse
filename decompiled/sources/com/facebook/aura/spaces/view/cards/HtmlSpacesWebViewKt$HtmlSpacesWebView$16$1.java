package com.facebook.aura.spaces.view.cards;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C6t6;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$16$1", f = "HtmlSpacesWebView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$16$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Boolean> $canGoBack$delegate;
    public final /* synthetic */ G0V<Boolean, Function0<Unit>, Unit> $onWebViewBackStateChanged;
    public final /* synthetic */ C6t6 $webView;
    public int label;

    /* renamed from: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$16$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ C6t6 $webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6t6 c6t6) {
            super(0);
            this.$webView = c6t6;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$webView.goBack();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$16$1(G0V<? super Boolean, ? super Function0<Unit>, Unit> g0v, C1BO<Boolean> c1bo, C6t6 c6t6, HtJ<? super HtmlSpacesWebViewKt$HtmlSpacesWebView$16$1> htJ) {
        super(2, htJ);
        this.$onWebViewBackStateChanged = g0v;
        this.$canGoBack$delegate = c1bo;
        this.$webView = c6t6;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HtmlSpacesWebViewKt$HtmlSpacesWebView$16$1(this.$onWebViewBackStateChanged, this.$canGoBack$delegate, this.$webView, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        G0V<Boolean, Function0<Unit>, Unit> g0v = this.$onWebViewBackStateChanged;
        if (g0v != null) {
            g0v.invoke(Boolean.valueOf(C1BO.A0F(this.$canGoBack$delegate)), new AnonymousClass1(this.$webView));
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HtmlSpacesWebViewKt$HtmlSpacesWebView$16$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
