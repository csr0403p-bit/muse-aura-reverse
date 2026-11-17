package com.facebook.aura.webview;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C1BO;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class WebViewTopColorKt$ObserveWebViewTopColor$1$1$sampler$1$2 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ C1BO<G0U<Integer, Unit>> $currentOnColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WebViewTopColorKt$ObserveWebViewTopColor$1$1$sampler$1$2(C1BO<? extends G0U<? super Integer, Unit>> c1bo) {
        super(1);
        this.$currentOnColor = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        AnonymousClass005.A0l(i, C1BO.A0B(this.$currentOnColor));
    }
}
