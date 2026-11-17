package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig;
import com.facebook.aura.skills.viewmodel.SkillAccountsUiState;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$LinkedAccountsSection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ FirstPartyConnectorConfig $firstPartyConnectorConfig;
    public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ boolean $showOptionsMenu;
    public final /* synthetic */ SkillAccountsUiState $uiState;

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ FirstPartyConnectorConfig $firstPartyConnectorConfig;
        public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ SkillAccountsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SkillAccountsUiState skillAccountsUiState, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, FirstPartyConnectorConfig firstPartyConnectorConfig, AuraNavigator auraNavigator) {
            super(3);
            this.$uiState = skillAccountsUiState;
            this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
            this.$firstPartyConnectorConfig = firstPartyConnectorConfig;
            this.$navigator = auraNavigator;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                HatchSkillDetailScreenKt.LinkedAccountsActionCard(this.$uiState, this.$linkedAccountsViewModel, this.$firstPartyConnectorConfig, this.$navigator, bfm, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(com.facebook.aura.ui.HatchSectionScope r8) {
        /*
            r7 = this;
            r0 = 0
            X.C7384Etj.A0Y(r8, r0)
            com.facebook.aura.skills.viewmodel.SkillAccountsUiState r1 = r7.$uiState
            boolean r0 = r1.isLoading
            r6 = 1
            if (r0 == 0) goto L2e
            X.G0W<X.07C, X.BFM, java.lang.Integer, kotlin.Unit> r0 = com.facebook.aura.skills.view.ComposableSingletons$HatchSkillDetailScreenKt.f294lambda$971087365
        Ld:
            r8.item(r0)
        L10:
            com.facebook.aura.skills.viewmodel.SkillAccountsUiState r4 = r7.$uiState
            com.facebook.aura.skills.viewmodel.SkillAccountsAction r1 = r4.accountAction
            com.facebook.aura.skills.viewmodel.SkillAccountsAction r0 = com.facebook.aura.skills.viewmodel.SkillAccountsAction.NONE
            if (r1 == r0) goto L2d
            com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel r3 = r7.$linkedAccountsViewModel
            com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig r2 = r7.$firstPartyConnectorConfig
            com.facebook.aura.navigation.AuraNavigator r0 = r7.$navigator
            com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$2 r1 = new com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$2
            r1.<init>(r4, r3, r2, r0)
            r0 = 398137950(0x17bb1a5e, float:1.2091248E-24)
            X.B1U r0 = X.B1V.A01(r1, r0, r6)
            r8.item(r0)
        L2d:
            return
        L2e:
            java.util.List<com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel> r0 = r1.linkedAccounts
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L39
            X.G0W<X.07C, X.BFM, java.lang.Integer, kotlin.Unit> r0 = com.facebook.aura.skills.view.ComposableSingletons$HatchSkillDetailScreenKt.lambda$1553116004
            goto Ld
        L39:
            com.facebook.aura.skills.viewmodel.SkillAccountsUiState r5 = r7.$uiState
            java.util.List<com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel> r0 = r5.linkedAccounts
            boolean r4 = r7.$showOptionsMenu
            com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel r3 = r7.$linkedAccountsViewModel
            java.util.Iterator r2 = r0.iterator()
        L45:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L10
            java.lang.Object r0 = r2.next()
            com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel r0 = (com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel) r0
            com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1 r1 = new com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1
            r1.<init>(r0, r4, r5, r3)
            r0 = 1705526495(0x65a844df, float:9.93285E22)
            X.B1U r0 = X.B1V.A01(r1, r0, r6)
            r8.item(r0)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1.invoke2(com.facebook.aura.ui.HatchSectionScope):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$LinkedAccountsSection$1$1(SkillAccountsUiState skillAccountsUiState, boolean z, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, FirstPartyConnectorConfig firstPartyConnectorConfig, AuraNavigator auraNavigator) {
        super(1);
        this.$uiState = skillAccountsUiState;
        this.$showOptionsMenu = z;
        this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
        this.$firstPartyConnectorConfig = firstPartyConnectorConfig;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
