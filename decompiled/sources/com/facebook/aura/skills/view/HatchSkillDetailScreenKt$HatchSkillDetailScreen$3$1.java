package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$HatchSkillDetailScreen$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Integer> $localConnectorRefreshNonce$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$HatchSkillDetailScreen$3$1(MutableState<Integer> mutableState) {
        super(0);
        this.$localConnectorRefreshNonce$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A07(MutableState.A02((MutableState) this.$localConnectorRefreshNonce$delegate) + 1, this.$localConnectorRefreshNonce$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
