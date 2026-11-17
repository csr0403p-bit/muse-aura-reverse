package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$14$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $animatedDismiss;
    public final /* synthetic */ Function0<Unit> $onCollapseVoice;
    public final /* synthetic */ AssistVoicePresentation $presentation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$14$1(AssistVoicePresentation assistVoicePresentation, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$presentation = assistVoicePresentation;
        this.$onCollapseVoice = function0;
        this.$animatedDismiss = function02;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        (this.$presentation.getShowingVoice() ? this.$onCollapseVoice : this.$animatedDismiss).invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
