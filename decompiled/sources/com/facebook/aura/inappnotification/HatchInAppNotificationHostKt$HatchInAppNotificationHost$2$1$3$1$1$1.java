package com.facebook.aura.inappnotification;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInAppNotificationHostKt$HatchInAppNotificationHost$2$1$3$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<AuraNavigator, Unit> $onClick;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public final /* synthetic */ MutableState<Boolean> $visible$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInAppNotificationHostKt$HatchInAppNotificationHost$2$1$3$1$1$1(HatchSidePanelController hatchSidePanelController, G0U<? super AuraNavigator, Unit> g0u, AuraNavigator auraNavigator, MutableState<Boolean> mutableState) {
        super(0);
        this.$sidePanelController = hatchSidePanelController;
        this.$onClick = g0u;
        this.$navigator = auraNavigator;
        this.$visible$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$sidePanelController.close();
        this.$onClick.invoke(this.$navigator);
        MutableState.A09(false, this.$visible$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
