package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$7$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $ideaCardId;
    public final /* synthetic */ MutableState<String> $reasonPromptCardId$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$7$4$1(String str, MutableState<String> mutableState) {
        super(0);
        this.$ideaCardId = str;
        this.$reasonPromptCardId$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchIdeasTabScreenKt.logIdeaFeedbackReasonMenuDismiss(this.$ideaCardId);
        this.$reasonPromptCardId$delegate.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
