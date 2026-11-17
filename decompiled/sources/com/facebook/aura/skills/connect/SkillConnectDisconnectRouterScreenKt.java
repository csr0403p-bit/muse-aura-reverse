package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.G0U;
import X.G0V;
import X.G2j;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SkillConnectDisconnectRouterScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.connect.config.ConnectorConnectionRoute;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.ConnectorLookupUiState;
import com.facebook.aura.skills.viewmodel.DirectSignInOutcome;
import com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class SkillConnectDisconnectRouterScreenKt {

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectDisconnectRouterScreenKt$DirectSignInNavigationEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SkillConnectDisconnectRouterScreenKey $navKey;
        public final /* synthetic */ String $skillId;
        public final /* synthetic */ HatchConnectorLookupViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, int i) {
            super(2);
            this.$skillId = str;
            this.$navKey = skillConnectDisconnectRouterScreenKey;
            this.$viewModel = hatchConnectorLookupViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectDisconnectRouterScreenKt.DirectSignInNavigationEffect(this.$skillId, this.$navKey, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectDisconnectRouterScreenKt$SkillConnectDisconnectRouterScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<Skill, HatchConnectorLookupViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ SkillConnectDisconnectRouterScreenKey $navKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey) {
            super(4);
            this.$navKey = skillConnectDisconnectRouterScreenKey;
        }

        public final void invoke(Skill skill, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, BFM bfm, int i) {
            AnonymousClass003.A0u(skill, hatchConnectorLookupViewModel);
            ConnectorConnectionRoute connectorConnectionRouteConnectionRoute = hatchConnectorLookupViewModel.connectionRoute(this.$navKey.isConnectFlow);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            Context contextA0O = AnonymousClass003.A0O(bfm);
            Object[] objArr = {connectorConnectionRouteConnectionRoute, skill.id, this.$navKey, auraNavigatorA0b, contextA0O, hatchConnectorLookupViewModel};
            boolean zA1T = AnonymousClass001.A1T(bfm, hatchConnectorLookupViewModel, AnonymousClass001.A1T(bfm, contextA0O, AnonymousClass005.A1V(bfm, this.$navKey, auraNavigatorA0b, skill, bfm.A67(connectorConnectionRouteConnectionRoute))));
            SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey = this.$navKey;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new SkillConnectDisconnectRouterScreenKt$SkillConnectDisconnectRouterScreen$1$1$1(connectorConnectionRouteConnectionRoute, skillConnectDisconnectRouterScreenKey, auraNavigatorA0b, skill, contextA0O, hatchConnectorLookupViewModel);
                bfm.Ai0(objAaT);
            }
            C78e.A07(bfm, (G0U) objAaT, objArr);
            SkillConnectDisconnectRouterScreenKt.DirectSignInNavigationEffect(skill.id, this.$navKey, hatchConnectorLookupViewModel, bfm, (i << 3) & 896);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(Skill skill, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, BFM bfm, Integer num) {
            invoke(skill, hatchConnectorLookupViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectDisconnectRouterScreenKt$SkillConnectDisconnectRouterScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C137982 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ SkillConnectDisconnectRouterScreenKey $navKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137982(SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey, BRg bRg, int i, int i2) {
            super(2);
            this.$navKey = skillConnectDisconnectRouterScreenKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectDisconnectRouterScreenKt.SkillConnectDisconnectRouterScreen(this.$navKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SkillConnectDisconnectRouterScreen(SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(skillConnectDisconnectRouterScreenKey, 0);
        bfm.AgG(-302000228);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, skillConnectDisconnectRouterScreenKey) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            SkillLookupSheetContentKt.SkillLookupSheetContent(skillConnectDisconnectRouterScreenKey.identifier, bRg2, skillConnectDisconnectRouterScreenKey.isConnectFlow, null, B1V.A00(bfm, new AnonymousClass1(skillConnectDisconnectRouterScreenKey), -1319107558), bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | RuntimeInternals.IOPRIO_BACKGROUND, 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137982(skillConnectDisconnectRouterScreenKey, bRg2, i, i2);
        }
    }

    public static final void DirectSignInNavigationEffect(String str, SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, BFM bfm, int i) {
        bfm.AgG(-2098070075);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, skillConnectDisconnectRouterScreenKey);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, hatchConnectorLookupViewModel);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            C1BO c1boA02 = C2CK.A02(bfm, hatchConnectorLookupViewModel.uiState);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            DirectSignInOutcome directSignInOutcome = ((ConnectorLookupUiState) c1boA02.getValue()).directSignInOutcome;
            boolean zA1Y = AnonymousClass005.A1Y(bfm, skillConnectDisconnectRouterScreenKey, auraNavigatorA0b, AnonymousClass005.A1S(bfm, directSignInOutcome, hatchConnectorLookupViewModel, contextA0H), (iA0d & 14) == 4);
            Object objAaT = bfm.AaT();
            if (zA1Y || objAaT == C78N.A00) {
                objAaT = new SkillConnectDisconnectRouterScreenKt$DirectSignInNavigationEffect$1$1(directSignInOutcome, hatchConnectorLookupViewModel, contextA0H, str, skillConnectDisconnectRouterScreenKey, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, directSignInOutcome);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, skillConnectDisconnectRouterScreenKey, hatchConnectorLookupViewModel, i);
        }
    }
}
