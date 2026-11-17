package com.facebook.aura.messenger.skills.read.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.messenger.skills.read.viewmodel.MessengerConnectorViewModel;
import com.facebook.aura.messenger.skills.read.viewmodel.MessengerPinState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.MessengerResetPinSheetKey;

/* loaded from: classes3.dex */
public final class MessengerPinScreenKt$MessengerPinScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ C1BO<MessengerPinState> $pinState$delegate;
    public final /* synthetic */ MessengerConnectorViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessengerPinScreenKt$MessengerPinScreen$1$1(MessengerConnectorViewModel messengerConnectorViewModel, AuraNavigator auraNavigator, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, C1BO<? extends MessengerPinState> c1bo) {
        super(1);
        this.$viewModel = messengerConnectorViewModel;
        this.$navigator = auraNavigator;
        this.$iconUrl = str;
        this.$origin = hatchSkillOAuthOrigin;
        this.$pinState$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        MessengerPinState value = this.$pinState$delegate.getValue();
        if (value instanceof MessengerPinState.Success) {
            this.$viewModel.resetPinState();
            this.$navigator.dismissBottomSheetStack(Integer.MAX_VALUE);
        } else if (value instanceof MessengerPinState.LockedOut) {
            this.$viewModel.resetPinState();
            this.$navigator.navigate(new MessengerResetPinSheetKey(this.$iconUrl, ((MessengerPinState.LockedOut) value).reason, this.$origin), LaunchFlag.REPLACE);
        }
        return new C78g() { // from class: com.facebook.aura.messenger.skills.read.view.MessengerPinScreenKt$MessengerPinScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
