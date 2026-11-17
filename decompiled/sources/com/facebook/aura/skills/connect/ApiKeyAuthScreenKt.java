package com.facebook.aura.skills.connect;

import X.AbstractC3358CGz;
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
import X.BOD;
import X.C07C;
import X.C1BO;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0V;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ApiKeyAuthSheetKey;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.ConnectorLookupUiState;
import com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ApiKeyAuthScreenKt {

    /* renamed from: com.facebook.aura.skills.connect.ApiKeyAuthScreenKt$ApiKeyAuthScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ApiKeyAuthSheetKey $navKey;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Skill $skill;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ApiKeyAuthSheetKey apiKeyAuthSheetKey, Skill skill, AuraNavigator auraNavigator) {
            super(3);
            this.$navKey = apiKeyAuthSheetKey;
            this.$skill = skill;
            this.$navigator = auraNavigator;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                ApiKeyAuthSheetKey apiKeyAuthSheetKey = this.$navKey;
                String str = apiKeyAuthSheetKey.identifier;
                Skill skill = this.$skill;
                HatchSkillOAuthOrigin hatchSkillOAuthOrigin = apiKeyAuthSheetKey.origin;
                boolean zA67 = bfm.A67(this.$navigator);
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ApiKeyAuthScreenKt$ApiKeyAuthScreen$2$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                ApiAuthBottomSheetKt.ApiAuthSheetContent(str, skill, null, hatchSkillOAuthOrigin, (Function0) objAaT, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.ApiKeyAuthScreenKt$ApiKeyAuthScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ApiKeyAuthSheetKey $navKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ApiKeyAuthSheetKey apiKeyAuthSheetKey, int i) {
            super(2);
            this.$navKey = apiKeyAuthSheetKey;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ApiKeyAuthScreenKt.ApiKeyAuthScreen(this.$navKey, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ApiKeyAuthScreen(ApiKeyAuthSheetKey apiKeyAuthSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(apiKeyAuthSheetKey, 0);
        bfm.AgG(2049100125);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, apiKeyAuthSheetKey) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String str = apiKeyAuthSheetKey.identifier;
            String strA0M = FGI.A0M("connector-auth-", str);
            HatchConnectorLookupViewModel.Factory factory = new HatchConnectorLookupViewModel.Factory(abstractC3358CGzA0h, str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            Skill skill = ((ConnectorLookupUiState) C1BO.A07(bfm, ((HatchConnectorLookupViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), HatchConnectorLookupViewModel.class, strA0M)).uiState)).skill;
            boolean zA1M = AnonymousClass003.A1M(bfm, apiKeyAuthSheetKey, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new ApiKeyAuthScreenKt$ApiKeyAuthScreen$1$1(apiKeyAuthSheetKey, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, null, null, null, null, null, (Function0) objAaT, false, false, false, null, B1V.A00(bfm, new AnonymousClass2(apiKeyAuthSheetKey, skill, auraNavigatorA0b), 825016640), bfm, 0, 48, 1983);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(apiKeyAuthSheetKey, i);
        }
    }
}
