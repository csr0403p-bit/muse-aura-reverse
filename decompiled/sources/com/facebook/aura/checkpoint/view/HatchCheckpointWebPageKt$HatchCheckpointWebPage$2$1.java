package com.facebook.aura.checkpoint.view;

import X.AbstractC7559F3s;
import X.C6t6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCheckpointWebPageKt$HatchCheckpointWebPage$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onBack;
    public final /* synthetic */ C6t6 $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCheckpointWebPageKt$HatchCheckpointWebPage$2$1(C6t6 c6t6, Function0<Unit> function0) {
        super(0);
        this.$webView = c6t6;
        this.$onBack = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$webView.canGoBack()) {
            this.$webView.goBack();
        } else {
            this.$onBack.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
