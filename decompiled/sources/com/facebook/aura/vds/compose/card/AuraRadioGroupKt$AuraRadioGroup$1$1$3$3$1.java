package com.facebook.aura.vds.compose.card;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraRadioGroupKt$AuraRadioGroup$1$1$3$3$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ AuraRadioTapOption $option;
    public final /* synthetic */ SnapshotStateList<AuraRadioTapOption> $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraRadioGroupKt$AuraRadioGroup$1$1$3$3$1(AuraRadioTapOption auraRadioTapOption, SnapshotStateList<AuraRadioTapOption> snapshotStateList, int i) {
        super(1);
        this.$option = auraRadioTapOption;
        this.$options = snapshotStateList;
        this.$index = i;
    }

    public final void invoke(boolean z) {
        AuraRadioTapOption auraRadioTapOption = this.$option;
        if (auraRadioTapOption.delegateStateChange && !auraRadioTapOption.checked) {
            AuraRadioGroupKt.flipChecks(this.$options, this.$index);
        }
        Function0<Unit> function0 = this.$option.onClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
