package com.facebook.aura.vmdisabled.content;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.VmLearnMoreSheetKey;
import com.facebook.aura.vmdisabled.VmRecoveryFlowType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VmRecoveryFlowBodyKt$VmRecoveryBodyText$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VmRecoveryFlowType $flowType;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ boolean $preview;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmRecoveryFlowBodyKt$VmRecoveryBodyText$1$1(AuraNavigator auraNavigator, VmRecoveryFlowType vmRecoveryFlowType, boolean z) {
        super(0);
        this.$navigator = auraNavigator;
        this.$flowType = vmRecoveryFlowType;
        this.$preview = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) new VmLearnMoreSheetKey(this.$flowType.getWireValue(), this.$preview), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
