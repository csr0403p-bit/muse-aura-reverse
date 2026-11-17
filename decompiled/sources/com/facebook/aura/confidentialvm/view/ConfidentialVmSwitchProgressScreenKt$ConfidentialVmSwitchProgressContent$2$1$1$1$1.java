package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressContent$2$1$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ boolean $isLeaving;
    public final /* synthetic */ Function0<Unit> $it;
    public final /* synthetic */ Function0<Unit> $onTryAgain;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        Function0<Unit> function0 = this.$onTryAgain;
        int i = R.string._name_removed__res_0x7f120233;
        if (function0 != null) {
            i = R.string._name_removed__res_0x7f1206f0;
        }
        auraButtonGroupScope.secondaryButton(i, null, null, true, this.$isLeaving, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, this.$it, null, BRg.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressContent$2$1$1$1$1(Function0<Unit> function0, boolean z, Function0<Unit> function02) {
        super(1);
        this.$onTryAgain = function0;
        this.$isLeaving = z;
        this.$it = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
