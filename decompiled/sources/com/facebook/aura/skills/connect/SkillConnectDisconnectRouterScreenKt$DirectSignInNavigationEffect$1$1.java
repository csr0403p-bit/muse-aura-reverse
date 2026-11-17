package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C3cG;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.SkillConnectDisconnectRouterScreenKey;
import com.facebook.aura.navigation.key.SkillConnectSheetKey;
import com.facebook.aura.skills.viewmodel.DirectSignInOutcome;
import com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel;

/* loaded from: classes3.dex */
public final class SkillConnectDisconnectRouterScreenKt$DirectSignInNavigationEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ DirectSignInOutcome $directSignInOutcome;
    public final /* synthetic */ SkillConnectDisconnectRouterScreenKey $navKey;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $skillId;
    public final /* synthetic */ HatchConnectorLookupViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectDisconnectRouterScreenKt$DirectSignInNavigationEffect$1$1(DirectSignInOutcome directSignInOutcome, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, Context context, String str, SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey, AuraNavigator auraNavigator) {
        super(1);
        this.$directSignInOutcome = directSignInOutcome;
        this.$viewModel = hatchConnectorLookupViewModel;
        this.$context = context;
        this.$skillId = str;
        this.$navKey = skillConnectDisconnectRouterScreenKey;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        DirectSignInOutcome directSignInOutcome = this.$directSignInOutcome;
        if (directSignInOutcome instanceof DirectSignInOutcome.OpenSignInPage) {
            this.$viewModel.onDirectSignInHandled();
            SkillOAuthLinkHandlerKt.openSkillOAuthLink(this.$context, ((DirectSignInOutcome.OpenSignInPage) this.$directSignInOutcome).url, this.$skillId, this.$navKey.origin);
            this.$navigator.dismissBottomSheetStack(Integer.MAX_VALUE);
        } else if (C7384Etj.areEqual(directSignInOutcome, DirectSignInOutcome.ShowConnectSheet.INSTANCE)) {
            this.$viewModel.onDirectSignInHandled();
            AuraNavigator auraNavigator = this.$navigator;
            String str = this.$skillId;
            SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey = this.$navKey;
            auraNavigator.navigate(new SkillConnectSheetKey(str, skillConnectDisconnectRouterScreenKey.origin, skillConnectDisconnectRouterScreenKey.sourceSessionId), LaunchFlag.REPLACE);
        } else if (directSignInOutcome != null) {
            throw C3cG.A0q();
        }
        return new C78g() { // from class: com.facebook.aura.skills.connect.SkillConnectDisconnectRouterScreenKt$DirectSignInNavigationEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
