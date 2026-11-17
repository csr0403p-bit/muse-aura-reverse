package com.facebook.aura.vds.compose.card;

import X.AbstractC7559F3s;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraRadioGroupKt$AuraRadioGroup$1$1$3$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ AuraRadioTapOption $option;
    public final /* synthetic */ SnapshotStateList<AuraRadioTapOption> $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraRadioGroupKt$AuraRadioGroup$1$1$3$2$1(AuraRadioTapOption auraRadioTapOption, SnapshotStateList<AuraRadioTapOption> snapshotStateList, int i) {
        super(0);
        this.$option = auraRadioTapOption;
        this.$options = snapshotStateList;
        this.$index = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraRadioTapOption auraRadioTapOption = this.$option;
        if (auraRadioTapOption.delegateStateChange && !auraRadioTapOption.checked) {
            AuraRadioGroupKt.flipChecks(this.$options, this.$index);
        }
        Function0<Unit> function0 = this.$option.onClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
