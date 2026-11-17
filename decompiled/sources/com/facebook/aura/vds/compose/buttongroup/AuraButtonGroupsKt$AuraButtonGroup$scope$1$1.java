package com.facebook.aura.vds.compose.buttongroup;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraButtonGroupsKt$AuraButtonGroup$scope$1$1 extends AbstractC7559F3s implements Function0<AuraButtonGroupStyleByScopeImpl> {
    public final /* synthetic */ MutableState<G0U<AuraButtonGroupStyleByScope, Unit>> $latestContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraButtonGroupsKt$AuraButtonGroup$scope$1$1(MutableState<G0U<AuraButtonGroupStyleByScope, Unit>> mutableState) {
        super(0);
        this.$latestContent = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraButtonGroupStyleByScopeImpl invoke() {
        AuraButtonGroupStyleByScopeImpl auraButtonGroupStyleByScopeImpl = new AuraButtonGroupStyleByScopeImpl();
        this.$latestContent.getValue().invoke(auraButtonGroupStyleByScopeImpl);
        return auraButtonGroupStyleByScopeImpl;
    }
}
