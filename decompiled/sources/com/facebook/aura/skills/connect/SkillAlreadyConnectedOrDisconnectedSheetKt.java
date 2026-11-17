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
import X.BOD;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0V;
import X.G2j;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchConnectorCatalogScreenKey;
import com.facebook.aura.navigation.key.SkillAlreadyConnectedOrDisconnectedSheetKey;
import com.facebook.aura.navigation.key.WalletSettingsScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.connect.ConnectorSettingsDestinationViewModel;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SkillAlreadyConnectedOrDisconnectedSheetKt {

    /* renamed from: com.facebook.aura.skills.connect.SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<Skill, HatchConnectorLookupViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ SkillAlreadyConnectedOrDisconnectedSheetKey $navKey;

        public final void invoke(Skill skill, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, BFM bfm, int i) {
            C7384Etj.A0Y(skill, 0);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            String strA0M = FGI.A0M("connectorSettingsDestination:", skill.id);
            ConnectorSettingsDestinationViewModel.Factory factory = new ConnectorSettingsDestinationViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            ConnectorSettingsDestinationViewModel connectorSettingsDestinationViewModel = (ConnectorSettingsDestinationViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), ConnectorSettingsDestinationViewModel.class, strA0M);
            C1BO c1boA02 = C2CK.A02(bfm, connectorSettingsDestinationViewModel.isResolving);
            boolean zA1M = AnonymousClass003.A1M(bfm, connectorSettingsDestinationViewModel, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$1$1$1(connectorSettingsDestinationViewModel, auraNavigatorA0b, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, connectorSettingsDestinationViewModel, auraNavigatorA0b);
            boolean zA0F = C1BO.A0F(c1boA02);
            SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey = this.$navKey;
            boolean z = skillAlreadyConnectedOrDisconnectedSheetKey.isConnectFlow;
            int i2 = R.string._name_removed__res_0x7f120ac7;
            if (z) {
                i2 = R.string._name_removed__res_0x7f120d36;
            }
            boolean zA1S = AnonymousClass005.A1S(bfm, skillAlreadyConnectedOrDisconnectedSheetKey, skill, connectorSettingsDestinationViewModel);
            SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey2 = this.$navKey;
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$1$2$1(skillAlreadyConnectedOrDisconnectedSheetKey2, skill, connectorSettingsDestinationViewModel);
                bfm.Ai0(objAaT2);
            }
            SkillConnectBottomSheetKt.SkillAlreadyConnectedOrDisconnectedSheetContent(skill, (Function0) objAaT2, i2, zA0F, bfm, i & 14, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey) {
            super(4);
            this.$navKey = skillAlreadyConnectedOrDisconnectedSheetKey;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(Skill skill, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, BFM bfm, Integer num) {
            invoke(skill, hatchConnectorLookupViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ SkillAlreadyConnectedOrDisconnectedSheetKey $navKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$navKey = skillAlreadyConnectedOrDisconnectedSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SkillAlreadyConnectedOrDisconnectedSheetKt.SkillAlreadyConnectedOrDisconnectedSheet(this.$navKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SkillAlreadyConnectedOrDisconnectedSheet(SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(skillAlreadyConnectedOrDisconnectedSheetKey, 0);
        bfm.AgG(148026311);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, skillAlreadyConnectedOrDisconnectedSheetKey) | i : i;
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
            SkillLookupSheetContentKt.SkillLookupSheetContent(skillAlreadyConnectedOrDisconnectedSheetKey.identifier, bRg2, false, null, B1V.A00(bfm, new AnonymousClass1(skillAlreadyConnectedOrDisconnectedSheetKey), 920386757), bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | RuntimeInternals.IOPRIO_BACKGROUND, 12);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(skillAlreadyConnectedOrDisconnectedSheetKey, bRg2, i, i2);
        }
    }

    public static final void navigateToSettings(AuraNavigator auraNavigator, ConnectorSettingsDestination connectorSettingsDestination) {
        AuraNavKey auraNavKey;
        auraNavigator.dismissBottomSheetStack(Integer.MAX_VALUE);
        int iOrdinal = connectorSettingsDestination.ordinal();
        if (iOrdinal == 0) {
            auraNavKey = WalletSettingsScreenKey.INSTANCE;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            auraNavKey = HatchConnectorCatalogScreenKey.INSTANCE;
        }
        auraNavigator.navigate(auraNavKey, false);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectorSettingsDestination.values().length];
            try {
                AnonymousClass002.A13(ConnectorSettingsDestination.WALLET, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectorSettingsDestination.CONNECTORS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
