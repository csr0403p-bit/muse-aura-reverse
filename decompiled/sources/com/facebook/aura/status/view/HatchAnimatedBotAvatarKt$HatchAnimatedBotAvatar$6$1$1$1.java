package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$HatchAnimatedBotAvatar$6$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $baseImageLoaded$delegate;
    public final /* synthetic */ boolean $hasIdlePoster;
    public final /* synthetic */ Function0<Unit> $onIdlePreparationFinished;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAnimatedBotAvatarKt$HatchAnimatedBotAvatar$6$1$1$1(boolean z, Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$hasIdlePoster = z;
        this.$onIdlePreparationFinished = function0;
        this.$baseImageLoaded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (!this.$hasIdlePoster || this.$baseImageLoaded$delegate.getValue() == null) {
            return;
        }
        this.$onIdlePreparationFinished.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
