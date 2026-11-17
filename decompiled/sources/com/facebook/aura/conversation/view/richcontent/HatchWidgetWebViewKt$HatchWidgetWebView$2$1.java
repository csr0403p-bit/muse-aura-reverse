package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.C00r;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchWidgetWebViewKt$HatchWidgetWebView$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C00r $recoveryAttempts$delegate;
    public final /* synthetic */ C00r $recoveryNonce$delegate;
    public final /* synthetic */ MutableState<Boolean> $rendererUnrecoverable$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWidgetWebViewKt$HatchWidgetWebView$2$1(C00r c00r, MutableState<Boolean> mutableState, C00r c00r2) {
        super(0);
        this.$recoveryAttempts$delegate = c00r;
        this.$rendererUnrecoverable$delegate = mutableState;
        this.$recoveryNonce$delegate = c00r2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$recoveryAttempts$delegate.AdX(0);
        MutableState.A09(false, this.$rendererUnrecoverable$delegate);
        this.$recoveryNonce$delegate.AdX(this.$recoveryNonce$delegate.AGd() + 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
