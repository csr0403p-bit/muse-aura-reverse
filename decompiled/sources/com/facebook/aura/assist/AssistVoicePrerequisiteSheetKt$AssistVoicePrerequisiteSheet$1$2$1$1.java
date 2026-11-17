package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistVoicePrerequisiteSheetKt$AssistVoicePrerequisiteSheet$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AssistVoiceNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onContinue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistVoicePrerequisiteSheetKt$AssistVoicePrerequisiteSheet$1$2$1$1(AssistVoiceNavigator assistVoiceNavigator, Function0<Unit> function0) {
        super(0);
        this.$navigator = assistVoiceNavigator;
        this.$onContinue = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.back();
        this.$onContinue.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
