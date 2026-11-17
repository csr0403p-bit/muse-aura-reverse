package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C0Yr;
import X.C3cG;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import android.content.Context;
import com.facebook.aura.ccv.CcvBloksHelperKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.DisconnectConfirmationSheetKey;
import com.facebook.aura.navigation.key.SkillAlreadyConnectedOrDisconnectedSheetKey;
import com.facebook.aura.navigation.key.SkillConnectDisconnectRouterScreenKey;
import com.facebook.aura.navigation.key.SkillConnectSheetKey;
import com.facebook.aura.skills.connect.config.ConnectorConnectionRoute;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SkillConnectDisconnectRouterScreenKt$SkillConnectDisconnectRouterScreen$1$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ SkillConnectDisconnectRouterScreenKey $navKey;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConnectorConnectionRoute $route;
    public final /* synthetic */ Skill $skill;
    public final /* synthetic */ HatchConnectorLookupViewModel $viewModel;

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectDisconnectRouterScreenKt$SkillConnectDisconnectRouterScreen$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
        public final /* synthetic */ HatchConnectorLookupViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchConnectorLookupViewModel hatchConnectorLookupViewModel) {
            super(1);
            this.$viewModel = hatchConnectorLookupViewModel;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            AnonymousClass005.A0w(num);
            this.$viewModel.onAccountLinkDismissed();
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            this.$viewModel.onAccountLinkDismissed();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectDisconnectRouterScreenKt$SkillConnectDisconnectRouterScreen$1$1$1(ConnectorConnectionRoute connectorConnectionRoute, SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey, AuraNavigator auraNavigator, Skill skill, Context context, HatchConnectorLookupViewModel hatchConnectorLookupViewModel) {
        super(1);
        this.$route = connectorConnectionRoute;
        this.$navKey = skillConnectDisconnectRouterScreenKey;
        this.$navigator = auraNavigator;
        this.$skill = skill;
        this.$context = context;
        this.$viewModel = hatchConnectorLookupViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AuraNavigator auraNavigator;
        AuraNavKey disconnectConfirmationSheetKey;
        ConnectorConnectionRoute connectorConnectionRoute = this.$route;
        if (C7384Etj.areEqual(connectorConnectionRoute, ConnectorConnectionRoute.AlreadyInRequestedState.INSTANCE)) {
            SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey = this.$navKey;
            boolean z = skillConnectDisconnectRouterScreenKey.dismissIfAlreadyInRequestedState;
            AuraNavigator auraNavigator2 = this.$navigator;
            if (z) {
                auraNavigator2.dismissBottomSheetStack(Integer.MAX_VALUE);
            } else {
                auraNavigator2.navigate(new SkillAlreadyConnectedOrDisconnectedSheetKey(this.$skill.id, skillConnectDisconnectRouterScreenKey.isConnectFlow, skillConnectDisconnectRouterScreenKey.sourceSkillKey, skillConnectDisconnectRouterScreenKey.origin, skillConnectDisconnectRouterScreenKey.sourceSessionId), LaunchFlag.REPLACE);
            }
        } else {
            if (C7384Etj.areEqual(connectorConnectionRoute, ConnectorConnectionRoute.Connect.INSTANCE)) {
                auraNavigator = this.$navigator;
                String str = this.$skill.id;
                SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey2 = this.$navKey;
                disconnectConfirmationSheetKey = new SkillConnectSheetKey(str, skillConnectDisconnectRouterScreenKey2.origin, skillConnectDisconnectRouterScreenKey2.sourceSessionId);
            } else if (C7384Etj.areEqual(connectorConnectionRoute, ConnectorConnectionRoute.Disconnect.INSTANCE)) {
                auraNavigator = this.$navigator;
                String str2 = this.$skill.id;
                SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey3 = this.$navKey;
                disconnectConfirmationSheetKey = new DisconnectConfirmationSheetKey(str2, skillConnectDisconnectRouterScreenKey3.sourceSkillKey, skillConnectDisconnectRouterScreenKey3.origin, skillConnectDisconnectRouterScreenKey3.sourceSessionId);
            } else if (connectorConnectionRoute instanceof ConnectorConnectionRoute.AccountLinking) {
                this.$navigator.dismissBottomSheetStack(Integer.MAX_VALUE);
                CcvBloksHelperKt.openAccountLinkingUpsellBloksScreen(this.$context, ((ConnectorConnectionRoute.AccountLinking) this.$route).target, false, CcvBloksHelperKt.AnonymousClass1.INSTANCE, new AnonymousClass1(this.$viewModel));
            } else if (C7384Etj.areEqual(connectorConnectionRoute, ConnectorConnectionRoute.DirectSignIn.INSTANCE)) {
                this.$viewModel.startDirectSignIn(this.$navKey.sourceSessionId);
            } else if (connectorConnectionRoute != null) {
                throw C3cG.A0q();
            }
            auraNavigator.navigate(disconnectConfirmationSheetKey, LaunchFlag.REPLACE);
        }
        return new C78g() { // from class: com.facebook.aura.skills.connect.SkillConnectDisconnectRouterScreenKt$SkillConnectDisconnectRouterScreen$1$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
