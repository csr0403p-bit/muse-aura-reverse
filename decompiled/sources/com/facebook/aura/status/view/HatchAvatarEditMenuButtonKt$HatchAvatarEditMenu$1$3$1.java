package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$1$3$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$expanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$expanded$delegate)) {
            HatchAvatarEditMenuButtonKt.logAvatarEditMenuDismiss();
        }
        MutableState.A09(false, this.$expanded$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
