package com.facebook.aura.skills.view;

import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06H;
import X.C06I;
import X.C07C;
import X.C0881AGi;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1731ApS;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1BO;
import X.C1DG;
import X.C1OR;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60P;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.accountcenter.AuraAccountsCenterActivity;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.agentpermission.ConnectorPermission;
import com.facebook.aura.agentpermission.ConnectorPermissionGroup;
import com.facebook.aura.agentpermission.ConnectorPermissionMethod;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.agentpermission.LocalDeviceConnectorKt;
import com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.ccv.CcvBloksHelperKt;
import com.facebook.aura.ccv.HatchAccountLinkingTarget;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.common.ui.settings.HatchSettingsDescriptionKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.FirstPartyManageAccountsSheetKey;
import com.facebook.aura.navigation.key.HatchSkillDetailScreenKey;
import com.facebook.aura.navigation.key.SkillConnectDisconnectRouterScreenKey;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig;
import com.facebook.aura.skills.connect.config.SkillConnectConfigKt;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel;
import com.facebook.aura.skills.viewmodel.SkillAccountsAction;
import com.facebook.aura.skills.viewmodel.SkillAccountsUiState;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.utils.MetaAccountEntrypoint;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchSkillDetailScreenKt {
    public static final String ACCOUNTS_CENTER_LINK_URL = "aura://accounts-center";
    public static final float SkillDetailIconCornerRadius = 14.0f;
    public static final float SkillDetailIconSize = 48.0f;

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$AccountActionCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, int i) {
            super(2);
            this.$title = str;
            this.$onClick = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSkillDetailScreenKt.AccountActionCard(this.$title, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$DisconnectSkillRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isOptimizedSite;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ C07C $this_DisconnectSkillRow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C07C c07c, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.$this_DisconnectSkillRow = c07c;
            this.$isOptimizedSite = z;
            this.$onClick = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSkillDetailScreenKt.DisconnectSkillRow(this.$this_DisconnectSkillRow, this.$isOptimizedSite, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$HatchSkillDetailScreen$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Skill $connectedSkill;
        public final /* synthetic */ HatchConnectorLookupViewModel $connectorLookup;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ boolean $isSkillLoading;
        public final /* synthetic */ C1BO<SkillAccountsUiState> $linkedAccountsUiState$delegate;
        public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;
        public final /* synthetic */ LocalDeviceConnector $localConnector;
        public final /* synthetic */ MutableState<Integer> $localConnectorRefreshNonce$delegate;
        public final /* synthetic */ G0U<LocalDeviceConnector, Unit> $manageLocalConnector;
        public final /* synthetic */ HatchSkillDetailScreenKey $sourceSkillKey;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(LocalDeviceConnector localDeviceConnector, G0U<? super LocalDeviceConnector, Unit> g0u, AbstractC3358CGz abstractC3358CGz, Skill skill, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, boolean z, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, Context context, MutableState<Integer> mutableState, C1BO<SkillAccountsUiState> c1bo) {
            super(4);
            this.$localConnector = localDeviceConnector;
            this.$manageLocalConnector = g0u;
            this.$userSession = abstractC3358CGz;
            this.$connectedSkill = skill;
            this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
            this.$isSkillLoading = z;
            this.$connectorLookup = hatchConnectorLookupViewModel;
            this.$sourceSkillKey = hatchSkillDetailScreenKey;
            this.$context = context;
            this.$localConnectorRefreshNonce$delegate = mutableState;
            this.$linkedAccountsUiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2165invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2165invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            InterfaceC7353EnQ interfaceC7353EnQ;
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (this.$localConnector != null) {
                bfm.AgE(1936764180);
                LocalDeviceConnector localDeviceConnector = this.$localConnector;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$manageLocalConnector, bfm.A65(localDeviceConnector));
                LocalDeviceConnector localDeviceConnector2 = this.$localConnector;
                G0U<LocalDeviceConnector, Unit> g0u = this.$manageLocalConnector;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchSkillDetailScreenKt$HatchSkillDetailScreen$5$1$1(localDeviceConnector2, g0u);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$userSession, bfm.A65(this.$localConnector));
                LocalDeviceConnector localDeviceConnector3 = this.$localConnector;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                MutableState<Integer> mutableState = this.$localConnectorRefreshNonce$delegate;
                Object objAaT2 = bfm.AaT();
                if (zA1T || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchSkillDetailScreenKt$HatchSkillDetailScreen$5$2$1(localDeviceConnector3, abstractC3358CGz, mutableState);
                    bfm.Ai0(objAaT2);
                }
                HatchSkillDetailScreenKt.m2162LocalDeviceConnectorDetailContentdjqsMU(localDeviceConnector, f, f2, function0, (G2j) objAaT2, bfm, (iA04 << 3) & 1008);
            } else {
                bfm.AgE(1937542001);
                Skill skill = this.$connectedSkill;
                SkillAccountsUiState value = this.$linkedAccountsUiState$delegate.getValue();
                SkillLinkedAccountsViewModel skillLinkedAccountsViewModel = this.$linkedAccountsViewModel;
                boolean z = this.$isSkillLoading;
                HatchConnectorLookupViewModel hatchConnectorLookupViewModel = this.$connectorLookup;
                if (hatchConnectorLookupViewModel == null) {
                    AnonymousClass004.A1A(bfm, 1937789225);
                    interfaceC7353EnQ = null;
                } else {
                    boolean zA1Z = AnonymousClass001.A1Z(hatchConnectorLookupViewModel, bfm, 1937789226);
                    Object objAaT3 = bfm.AaT();
                    if (zA1Z || objAaT3 == C78N.A00) {
                        objAaT3 = new HatchSkillDetailScreenKt$HatchSkillDetailScreen$5$3$1$1(hatchConnectorLookupViewModel);
                        bfm.Ai0(objAaT3);
                    }
                    interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT3;
                    AnonymousClass002.A19(bfm);
                }
                Function0 function02 = (Function0) interfaceC7353EnQ;
                HatchSkillDetailScreenKey hatchSkillDetailScreenKey = this.$sourceSkillKey;
                boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$context, bfm.A67(this.$linkedAccountsViewModel));
                SkillLinkedAccountsViewModel skillLinkedAccountsViewModel2 = this.$linkedAccountsViewModel;
                Context context = this.$context;
                Object objAaT4 = bfm.AaT();
                if (zA1T2 || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchSkillDetailScreenKt$HatchSkillDetailScreen$5$4$1(skillLinkedAccountsViewModel2, context);
                    bfm.Ai0(objAaT4);
                }
                HatchSkillDetailScreenKt.m2161HatchSkillDetailContent_UtchM0(skill, value, skillLinkedAccountsViewModel, z, function02, f, f2, hatchSkillDetailScreenKey, (G0V) objAaT4, null, bfm, (iA04 << 15) & 4128768, 512);
            }
            AnonymousClass002.A19(bfm);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$HatchSkillDetailScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchSkillDetailScreenKey $sourceSkillKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(String str, Function0<Unit> function0, BRg bRg, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, int i, int i2) {
            super(2);
            this.$connectorId = str;
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$sourceSkillKey = hatchSkillDetailScreenKey;
            this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSkillDetailScreenKt.HatchSkillDetailScreen(this.$connectorId, this.$onBack, this.$modifier, this.$sourceSkillKey, this.$linkedAccountsViewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsAccountsCenterFootnote$2, reason: invalid class name and case insensitive filesystem */
    public final class C138572 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $firstPartyDisplayName;
        public final /* synthetic */ Function0<Unit> $onAccountsCenterClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138572(String str, Function0<Unit> function0, int i) {
            super(2);
            this.$firstPartyDisplayName = str;
            this.$onAccountsCenterClick = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSkillDetailScreenKt.LinkedAccountsAccountsCenterFootnote(this.$firstPartyDisplayName, this.$onAccountsCenterClick, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsActionCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C138582 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ FirstPartyConnectorConfig $firstPartyConnectorConfig;
        public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ SkillAccountsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138582(SkillAccountsUiState skillAccountsUiState, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, FirstPartyConnectorConfig firstPartyConnectorConfig, AuraNavigator auraNavigator, int i) {
            super(2);
            this.$uiState = skillAccountsUiState;
            this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
            this.$firstPartyConnectorConfig = firstPartyConnectorConfig;
            this.$navigator = auraNavigator;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSkillDetailScreenKt.LinkedAccountsActionCard(this.$uiState, this.$linkedAccountsViewModel, this.$firstPartyConnectorConfig, this.$navigator, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsEmptyRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C138591 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138591(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSkillDetailScreenKt.LinkedAccountsEmptyRow(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsLoadingRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C138602 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138602(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSkillDetailScreenKt.LinkedAccountsLoadingRow(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ FirstPartyConnectorConfig $firstPartyConnectorConfig;
        public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;
        public final /* synthetic */ G0U<Boolean, Unit> $onAccountsCenterClick;
        public final /* synthetic */ C07C $this_LinkedAccountsSection;
        public final /* synthetic */ SkillAccountsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(C07C c07c, SkillAccountsUiState skillAccountsUiState, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, FirstPartyConnectorConfig firstPartyConnectorConfig, G0U<? super Boolean, Unit> g0u, int i) {
            super(2);
            this.$this_LinkedAccountsSection = c07c;
            this.$uiState = skillAccountsUiState;
            this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
            this.$firstPartyConnectorConfig = firstPartyConnectorConfig;
            this.$onAccountsCenterClick = g0u;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSkillDetailScreenKt.LinkedAccountsSection(this.$this_LinkedAccountsSection, this.$uiState, this.$linkedAccountsViewModel, this.$firstPartyConnectorConfig, this.$onAccountsCenterClick, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LocalConnectorDetailHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C138612 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ LocalDeviceConnector $localConnector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138612(LocalDeviceConnector localDeviceConnector, int i) {
            super(2);
            this.$localConnector = localDeviceConnector;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSkillDetailScreenKt.LocalConnectorDetailHeader(this.$localConnector, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LocalConnectorManageRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C138622 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ C07C $this_LocalConnectorManageRow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138622(C07C c07c, Function0<Unit> function0, int i) {
            super(2);
            this.$this_LocalConnectorManageRow = c07c;
            this.$onClick = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSkillDetailScreenKt.LocalConnectorManageRow(this.$this_LocalConnectorManageRow, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$RemoveLinkedAccountDialog$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C138631 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ boolean $isRemoving;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ String $removeText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138631(boolean z, String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$isRemoving = z;
            this.$removeText = str;
            this.$onConfirm = function0;
            this.$cancelText = str2;
            this.$onCancel = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onCancel, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirm, AnonymousClass001.A1R(bfm, this.$removeText, bfm.A66(this.$isRemoving)))));
                boolean z = this.$isRemoving;
                String str = this.$removeText;
                Function0<Unit> function0 = this.$onConfirm;
                String str2 = this.$cancelText;
                Function0<Unit> function02 = this.$onCancel;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchSkillDetailScreenKt$RemoveLinkedAccountDialog$1$1$1(z, str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$RemoveLinkedAccountDialog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SkillLinkedAccountUiModel $account;
        public final /* synthetic */ boolean $isRemoving;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SkillLinkedAccountUiModel skillLinkedAccountUiModel, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$account = skillLinkedAccountUiModel;
            this.$isRemoving = z;
            this.$onConfirm = function0;
            this.$onCancel = function02;
            this.$onDismiss = function03;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSkillDetailScreenKt.RemoveLinkedAccountDialog(this.$account, this.$isRemoving, this.$onConfirm, this.$onCancel, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$SkillDetailHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C138642 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Skill $skill;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138642(Skill skill, int i) {
            super(2);
            this.$skill = skill;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSkillDetailScreenKt.SkillDetailHeader(this.$skill, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0012 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean canDisconnect(com.facebook.aura.skills.model.Skill r3, com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig r4) {
        /*
            r2 = 0
            r1 = 1
            if (r4 == 0) goto L9
            boolean r0 = r4.isAccountsCenterManaged
            if (r0 != 0) goto L12
        L8:
            return r1
        L9:
            com.facebook.aura.skills.model.Consent r0 = r3.consent
            if (r0 != 0) goto L8
            boolean r0 = r3.isCustom
            if (r0 == 0) goto L12
            return r1
        L12:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.view.HatchSkillDetailScreenKt.canDisconnect(com.facebook.aura.skills.model.Skill, com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig):boolean");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkillAccountsAction.values().length];
            try {
                AnonymousClass002.A13(SkillAccountsAction.MANAGE_ACCOUNTS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SkillAccountsAction.ADD_ACCOUNT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SkillAccountsAction.NONE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023c A[PHI: r30
  0x023c: PHI (r30v5 boolean) = (r30v1 boolean), (r30v6 boolean) binds: [B:67:0x017a, B:65:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSkillDetailScreen(java.lang.String r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, X.BRg r59, com.facebook.aura.navigation.key.HatchSkillDetailScreenKey r60, com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel r61, X.BFM r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.view.HatchSkillDetailScreenKt.HatchSkillDetailScreen(java.lang.String, kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.navigation.key.HatchSkillDetailScreenKey, com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel, X.BFM, int, int):void");
    }

    public static final String currentAndroidDeviceName(Context context) {
        String str = Build.MANUFACTURER;
        if (str == null) {
            str = "";
        }
        String strA0l = AnonymousClass002.A0l(str);
        String str2 = Build.MODEL;
        String strA0l2 = AnonymousClass002.A0l(str2 != null ? str2 : "");
        if (C7BY.A0j(strA0l2)) {
            return context.getString(R.string._name_removed__res_0x7f120b68);
        }
        if (!C7BY.A0j(strA0l)) {
            C7384Etj.A0Y(strA0l2, 0);
            C7384Etj.A0Y(strA0l, 1);
            if (!AnonymousClass006.A1b(strA0l, strA0l2)) {
                return FGI.A0U(strA0l, InviteCodeScratcherKt.CODE_SEPARATOR, strA0l2);
            }
        }
        return strA0l2;
    }

    public static final void handleDisconnectSkill(Skill skill, AuraNavigator auraNavigator, HatchSkillDetailScreenKey hatchSkillDetailScreenKey) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CONNECTORS, HatchScreen.CONNECTORS, HatchComponent.DISCONNECT_SKILL_BUTTON, null, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), skill.id), null);
        HatchConnectorQplLogger hatchConnectorQplLogger = HatchConnectorQplLogger.INSTANCE;
        String str = skill.id;
        hatchConnectorQplLogger.startDisconnect(str, str, HatchConnectorQplLogger.DisconnectEntryPoint.SETTINGS_SKILL_DETAIL, skill.isCustom);
        auraNavigator.navigate((AuraNavKey) new SkillConnectDisconnectRouterScreenKey(skill.id, false, hatchSkillDetailScreenKey, HatchSkillOAuthOrigin.SETTINGS, null, false), false);
    }

    public static final void openFirstPartyAccountsCenter(Context context, String str, boolean z, Function0<Unit> function0) {
        HatchAccountLinkingTarget hatchAccountLinkingTargetAccountLinkingTarget;
        if (z) {
            context.startActivity(new Intent(context, (Class<?>) AuraAccountsCenterActivity.class));
            return;
        }
        FirstPartyConnectorConfig firstPartyConnectorConfigFirstPartyConnectorConfigForSkill = SkillConnectConfigKt.firstPartyConnectorConfigForSkill(str);
        if (firstPartyConnectorConfigFirstPartyConnectorConfigForSkill == null || (hatchAccountLinkingTargetAccountLinkingTarget = SkillConnectConfigKt.accountLinkingTarget(firstPartyConnectorConfigFirstPartyConnectorConfigForSkill)) == null) {
            return;
        }
        CcvBloksHelperKt.openAccountLinkingUpsellBloksScreen(context, hatchAccountLinkingTargetAccountLinkingTarget, false, function0, CcvBloksHelperKt.AnonymousClass2.INSTANCE);
    }

    public static final void openFirstPartyManageAccounts(AuraNavigator auraNavigator, FirstPartyConnectorConfig firstPartyConnectorConfig) {
        HatchConnectorQplLogger.INSTANCE.startAuth(HatchConnectorQplLogger.AuthType.FIRST_PARTY_AUTH, "settings", firstPartyConnectorConfig.id, false);
        auraNavigator.navigate((AuraNavKey) new FirstPartyManageAccountsSheetKey(firstPartyConnectorConfig.id), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void AccountActionCard(String str, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-547013591);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            AuraCardType.Clickable clickable = AuraCardType.Clickable.INSTANCE;
            C1062ATq c1062ATq = C10G.A02;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            long j = 0;
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, new AuraCardContent(new ApQ(str, C0881AGi.A00), auraIconAndHeadlineStyle, (BO6) null, C60P.A04(C3cH.A0W(bfm).link), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i2, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097140, (C06H) (0 == true ? 1 : 0)), clickable, null, null, function0, null, null, null, false, false, null, null, 0L, false, null, null, bfm, ((iA0d << 15) & 3670016) | 3078, 0, 262064);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, function0, i);
        }
    }

    public static final void DisconnectSkillRow(C07C c07c, boolean z, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1190961912);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            boolean zA1C = AnonymousClass003.A1C(iA0d) | ((iA0d & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchSkillDetailScreenKt$DisconnectSkillRow$1$1(z, function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0p(c07c, bfm, objAaT, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(c07c, z, function0, i);
        }
    }

    public static final void LinkedAccountsAccountsCenterFootnote(String str, Function0<Unit> function0, BFM bfm, int i) {
        int i2;
        bfm.AgG(-1419275706);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (MetaAccountEntrypoint.INSTANCE.getCanSeeNewEntrypoint()) {
                bfm.AgE(-1984304567);
                i2 = R.string._name_removed__res_0x7f120f36;
            } else {
                bfm.AgE(-1984216465);
                i2 = R.string._name_removed__res_0x7f120ec6;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i2);
            BBI bbiA07 = C3cG.A07(bfm);
            String strA02 = AbstractC2271BQs.A02(bfm, new Object[]{HatchAppName.value, str, strA01}, R.string._name_removed__res_0x7f120ad0);
            int iA0B = C7BY.A0B(strA02, strA01, 0, false);
            bfm.AgE(1875666704);
            C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
            c1731ApSA0W.A0E(strA02);
            if (iA0B >= 0) {
                bfm.AgE(-691492965);
                int length = strA01.length() + iA0B;
                long j = AuraTheme.INSTANCE.getColors(bfm, 6).link;
                long j2 = C1809ArT.A01;
                c1731ApSA0W.A0A(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j2, j2, B6A.A07), iA0B, length);
                c1731ApSA0W.A0B(new C1OR(ACCOUNTS_CENTER_LINK_URL), iA0B, length);
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(-691183523);
                BBI.A0R(bbiA07, false);
            }
            ApQ apQA04 = c1731ApSA0W.A04();
            BBI.A0R(bbiA07, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA0B = C3U4.A0B(C10G.A02, AuraDimensKt.SpacingMedium, 8.0f);
            boolean zA65 = bfm.A65(apQA04) | AnonymousClass001.A1N(iA0d);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchSkillDetailScreenKt$LinkedAccountsAccountsCenterFootnote$1$1(apQA04, function0);
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2638AuraClickableTextZsD2BWI(apQA04, bRgA0B, (G0U) objAaT, null, null, null, false, jA07, c1822ArmA0E, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 1048184);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138572(str, function0, i);
        }
    }

    public static final void LinkedAccountsActionCard(SkillAccountsUiState skillAccountsUiState, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, FirstPartyConnectorConfig firstPartyConnectorConfig, AuraNavigator auraNavigator, BFM bfm, int i) {
        bfm.AgG(-259016221);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, skillAccountsUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, skillLinkedAccountsViewModel);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, firstPartyConnectorConfig);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass002.A00(AnonymousClass004.A1a(auraNavigator, bfm, i) ? 1 : 0);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            String strAccountActionTitle = accountActionTitle(skillAccountsUiState.accountAction, bfm, 0);
            boolean zA1S = AnonymousClass005.A1S(bfm, skillAccountsUiState, skillLinkedAccountsViewModel, firstPartyConnectorConfig);
            if ((iA0T & 7168) != 2048 && ((iA0T & 4096) == 0 || !bfm.A67(auraNavigator))) {
                z = false;
            }
            boolean z2 = zA1S | z;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new HatchSkillDetailScreenKt$LinkedAccountsActionCard$1$1(skillAccountsUiState, skillLinkedAccountsViewModel, firstPartyConnectorConfig, auraNavigator);
                bfm.Ai0(objAaT);
            }
            AccountActionCard(strAccountActionTitle, (Function0) objAaT, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138582(skillAccountsUiState, skillLinkedAccountsViewModel, firstPartyConnectorConfig, auraNavigator, i);
        }
    }

    public static final void LinkedAccountsEmptyRow(BFM bfm, int i) {
        bfm.AgG(-1044262249);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ad1);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(AnonymousClass001.A0V(C10G.A02, 61.0f), 20.0f, 20.0f), C3cH.A06(bfm, auraTheme), c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138591(i);
        }
    }

    public static final void LinkedAccountsLoadingRow(BFM bfm, int i) {
        bfm.AgG(-1805654266);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0V(C10G.A02, 61.0f), 20.0f, 14.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bs0, 18.0f), null, 0L, bfm, 6, 6);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d3b);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(bs0, 12.0f, 0.0f, 0.0f, 0.0f), C3cH.A06(bfm, auraTheme), c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138602(i);
        }
    }

    public static final void LinkedAccountsSection(C07C c07c, SkillAccountsUiState skillAccountsUiState, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, FirstPartyConnectorConfig firstPartyConnectorConfig, G0U<? super Boolean, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(-354680931);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, skillAccountsUiState);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, skillLinkedAccountsViewModel);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, firstPartyConnectorConfig);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            boolean zA1Z = AnonymousClass002.A1Z(skillAccountsUiState.accountAction, SkillAccountsAction.ADD_ACCOUNT);
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSkillDetailScreenKt.f293lambda$520738640;
            boolean zA1V = AnonymousClass005.A1V(bfm, skillLinkedAccountsViewModel, firstPartyConnectorConfig, auraNavigatorA0b, AnonymousClass001.A1U(bfm, zA1Z, bfm.A67(skillAccountsUiState)));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchSkillDetailScreenKt$LinkedAccountsSection$1$1(skillAccountsUiState, zA1Z, skillLinkedAccountsViewModel, firstPartyConnectorConfig, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, g0v, 0L, (G0U) objAaT, bfm, (iA0d & 14) | 384, 5);
            String str = skillAccountsUiState.accountsCenterFootnoteDisplayName;
            if (str != null) {
                bfm.AgE(-678299081);
                boolean zA1T = AnonymousClass001.A1T(bfm, skillAccountsUiState, (iA0d & 57344) == 16384);
                Object objAaT2 = bfm.AaT();
                if (zA1T || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchSkillDetailScreenKt$LinkedAccountsSection$2$1(g0u, skillAccountsUiState);
                    bfm.Ai0(objAaT2);
                }
                LinkedAccountsAccountsCenterFootnote(str, (Function0) objAaT2, bfm, 0);
            } else {
                bfm.AgE(-678101115);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            SkillLinkedAccountUiModel skillLinkedAccountUiModel = skillAccountsUiState.accountPendingRemoval;
            if (skillLinkedAccountUiModel == null) {
                bfm.AgE(-678056569);
            } else {
                bfm.AgE(-678056568);
                boolean z = skillAccountsUiState.isRemovingAccount;
                boolean zA67 = bfm.A67(skillLinkedAccountsViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA67 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchSkillDetailScreenKt$LinkedAccountsSection$3$1$1(skillLinkedAccountsViewModel);
                    bfm.Ai0(objAaT3);
                }
                Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT3);
                boolean zA672 = bfm.A67(skillLinkedAccountsViewModel);
                Object objAaT4 = bfm.AaT();
                if (zA672 || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchSkillDetailScreenKt$LinkedAccountsSection$3$2$1(skillLinkedAccountsViewModel);
                    bfm.Ai0(objAaT4);
                }
                Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT4);
                boolean zA673 = bfm.A67(skillLinkedAccountsViewModel);
                Object objAaT5 = bfm.AaT();
                if (zA673 || objAaT5 == C78N.A00) {
                    objAaT5 = new HatchSkillDetailScreenKt$LinkedAccountsSection$3$3$1(skillLinkedAccountsViewModel);
                    bfm.Ai0(objAaT5);
                }
                RemoveLinkedAccountDialog(skillLinkedAccountUiModel, z, function0, function02, (Function0) ((InterfaceC7353EnQ) objAaT5), bfm, 0);
            }
            BBI.A0R(bbiA07, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(c07c, skillAccountsUiState, skillLinkedAccountsViewModel, firstPartyConnectorConfig, g0u, i);
        }
    }

    public static final void LocalConnectorDetailHeader(LocalDeviceConnector localDeviceConnector, BFM bfm, int i) {
        bfm.AgG(-1171566609);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, localDeviceConnector) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(null, Integer.valueOf(localDeviceConnector.iconRes), null, SkillDetailIconSize, SkillDetailIconCornerRadius, 0, 0.0f, null, null, bfm, 27654, 484);
            int iA00 = C01N.A00(bfm, bs0, 12.0f);
            String str = localDeviceConnector.displayTitle;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, iA00).title3Emphasized;
            long jA06 = C3cH.A06(bfm, auraTheme);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchSkillDetailScreenKt$LocalConnectorDetailHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT, false), jA06, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A08(bfm, bs0, 12.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A02(bfm, new Object[]{HatchAppName.value, AnonymousClass001.A0u(localDeviceConnector.displayTitle), currentAndroidDeviceName(contextA0H)}, R.string._name_removed__res_0x7f120b69), c1062ATq, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138612(localDeviceConnector, i);
        }
    }

    public static final void LocalConnectorManageRow(C07C c07c, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1669322802);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            boolean z = (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32;
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new HatchSkillDetailScreenKt$LocalConnectorManageRow$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0p(c07c, bfm, objAaT, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138622(c07c, function0, i);
        }
    }

    /* renamed from: LocalDeviceConnectorDetailContent-djqs-MU, reason: not valid java name */
    public static final void m2162LocalDeviceConnectorDetailContentdjqsMU(LocalDeviceConnector localDeviceConnector, float f, float f2, Function0<Unit> function0, G2j<? super ConnectorPermission, ? super ConnectorPermissionGroup, ? super ConnectorPermissionMethod, ? super ConnectorPermissionMode, Unit> g2j, BFM bfm, int i) {
        bfm.AgG(-1429289333);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, localDeviceConnector) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g2j);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            float fA00 = C3cG.A00(bfm, AuraTheme.INSTANCE);
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(AnonymousClass005.A0T(bfm, C10G.A01), fA00, 0.0f, fA00, f2 + fA00);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C90l c90l = C90l.A00;
                C01N.A08(bfm, bs0, 24.0f + f);
                int i2 = iA0d & 14;
                LocalConnectorDetailHeader(localDeviceConnector, bfm, i2);
                C01N.A08(bfm, bs0, 24.0f);
                if (localDeviceConnector.isManageable) {
                    bfm.AgE(377923603);
                    LocalConnectorManageRow(c90l, function0, bfm, ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
                    C01N.A05(bfm, bs0);
                    HatchSettingsDescriptionKt.HatchSettingsDescription(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120b6b), null, bfm, 0, 2);
                    C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingMedium, false);
                } else {
                    bfm.AgE(378440621);
                    BBI.A0R(bbi, false);
                }
                if (LocalDeviceConnectorKt.shouldShowNotificationAccessControls(localDeviceConnector)) {
                    bfm.AgE(378505597);
                    PhoneNotificationsAccessControlsKt.PhoneNotificationsAccessControls(c90l, bfm, 6);
                } else if (LocalDeviceConnectorKt.shouldShowHitlControls(localDeviceConnector)) {
                    bfm.AgE(378639021);
                    boolean zA65 = bfm.A65(localDeviceConnector.connectorId);
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = AnonymousClass004.A12(bfm, null);
                    }
                    MutableState mutableState = (MutableState) objAaT;
                    boolean zA652 = bfm.A65(localDeviceConnector.connectorId);
                    Object objAaT2 = bfm.AaT();
                    if (zA652 || objAaT2 == C78N.A00) {
                        objAaT2 = AnonymousClass004.A11(bfm, null);
                    }
                    MutableState mutableState2 = (MutableState) objAaT2;
                    boolean zA1K = AnonymousClass003.A1K(bfm, mutableState, mutableState2);
                    Object objAaT3 = bfm.AaT();
                    if (zA1K || objAaT3 == C78N.A00) {
                        objAaT3 = new HatchSkillDetailScreenKt$LocalDeviceConnectorDetailContent$1$dismissMenu$1$1(mutableState, mutableState2);
                        bfm.Ai0(objAaT3);
                    }
                    Function0 function03 = (Function0) objAaT3;
                    int i3 = 0;
                    for (ConnectorPermissionGroup connectorPermissionGroup : localDeviceConnector.connectorPermission.groups) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0885AGm.A14();
                        } else {
                            ConnectorPermissionGroup connectorPermissionGroup2 = connectorPermissionGroup;
                            if (i3 > 0) {
                                bfm.AgE(-902019264);
                                C01N.A06(bfm, bs0);
                            } else {
                                bfm.AgE(-901961604);
                            }
                            BBI.A0R(bbi, false);
                            ConnectorPermission connectorPermission = localDeviceConnector.connectorPermission;
                            String strA05 = MutableState.A05(mutableState);
                            String strA052 = MutableState.A05(mutableState2);
                            boolean zA1R = AnonymousClass005.A1R(bfm, mutableState, mutableState2, function03) | AnonymousClass003.A17(i2);
                            Object objAaT4 = bfm.AaT();
                            if (zA1R || objAaT4 == C78N.A00) {
                                objAaT4 = new HatchSkillDetailScreenKt$LocalDeviceConnectorDetailContent$1$1$1$1(function03, localDeviceConnector, mutableState, mutableState2);
                                bfm.Ai0(objAaT4);
                            }
                            ConnectorPermissionSectionsKt.ConnectorPermissionGroupSection(c90l, connectorPermission, connectorPermissionGroup2, strA05, strA052, (G0V) objAaT4, function03, g2j, bfm, AnonymousClass001.A0C(iA0d << 9, (ConnectorPermission.$stable << 3) | 6 | (ConnectorPermissionGroup.$stable << 6)));
                            i3 = i4;
                        }
                    }
                } else {
                    bfm.AgE(379776845);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchSkillDetailScreenKt$LocalDeviceConnectorDetailContent$2(localDeviceConnector, f, f2, function0, g2j, i);
        }
    }

    public static final void RemoveLinkedAccountDialog(SkillLinkedAccountUiModel skillLinkedAccountUiModel, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        bfm.AgG(318252093);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, skillLinkedAccountUiModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ad4);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206f0);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ad6);
            String strA0w = AnonymousClass006.A0w(bfm, HatchAppName.value, skillLinkedAccountUiModel.displayName, R.string._name_removed__res_0x7f120ad5);
            B1U b1uA00 = B1V.A00(bfm, new C138631(z, strA01, function0, strA012, function02), 1596946958);
            boolean zA1C = AnonymousClass003.A1C(iA0T) | ((57344 & iA0T) == 16384);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchSkillDetailScreenKt$RemoveLinkedAccountDialog$2$1(z, function03);
                bfm.Ai0(objAaT);
            }
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, strA013, strA0w, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (Function0<Unit>) objAaT, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, 196608, 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(skillLinkedAccountUiModel, z, function0, function02, function03, i);
        }
    }

    public static final void SkillDetailHeader(Skill skill, BFM bfm, int i) {
        String strA0s;
        bfm.AgG(1637098099);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, skill) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(skill.iconUrl, null, null, SkillDetailIconSize, SkillDetailIconCornerRadius, 0, 0.0f, null, null, bfm, 27696, 484);
            int iA00 = C01N.A00(bfm, bs0, 12.0f);
            String str = skill.displayName;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, iA00).title3Emphasized, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            if (skill.isCustom) {
                bfm.AgE(-1797898990);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120bb4);
            } else if (skill.description.length() > 0) {
                bfm.AgE(-1797895084);
                BBI.A0R(bbi, false);
                strA0s = skill.description;
            } else {
                bfm.AgE(99856788);
                BBI.A0R(bbi, false);
                bfm.AgE(100192953);
                AnonymousClass003.A0q(bbi);
            }
            if (strA0s != null) {
                bfm.AgE(99906575);
                C01N.A08(bfm, bs0, 12.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(strA0s, c1062ATq, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            } else {
                bfm.AgE(100192953);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138642(skill, i);
        }
    }

    public static final /* synthetic */ SkillAccountsUiState access$HatchSkillDetailScreen$lambda$0(C1BO c1bo) {
        return (SkillAccountsUiState) c1bo.getValue();
    }

    public static final String accountActionTitle(SkillAccountsAction skillAccountsAction, BFM bfm, int i) {
        int i2;
        int iOrdinal = skillAccountsAction.ordinal();
        if (iOrdinal == 1) {
            bfm.AgE(1841301228);
            i2 = R.string._name_removed__res_0x7f120ad2;
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal != 0) {
                    throw AnonymousClass005.A0k(bfm, 1841298973);
                }
                AnonymousClass003.A0l(bfm, 1245986234);
                return "";
            }
            bfm.AgE(1841305192);
            i2 = R.string._name_removed__res_0x7f120ac6;
        }
        return AnonymousClass003.A0e(bfm, i2);
    }

    public static final void handleLinkedAccountsActionClick(SkillAccountsAction skillAccountsAction, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, FirstPartyConnectorConfig firstPartyConnectorConfig, AuraNavigator auraNavigator) {
        int iOrdinal = skillAccountsAction.ordinal();
        if (iOrdinal == 1) {
            skillLinkedAccountsViewModel.onManageAccountsTapped();
            if (firstPartyConnectorConfig != null) {
                openFirstPartyManageAccounts(auraNavigator, firstPartyConnectorConfig);
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            skillLinkedAccountsViewModel.addConnectorAccount();
        } else if (iOrdinal != 0) {
            throw C3cG.A0q();
        }
    }

    /* renamed from: HatchSkillDetailContent-_UtchM0, reason: not valid java name */
    public static final void m2161HatchSkillDetailContent_UtchM0(Skill skill, SkillAccountsUiState skillAccountsUiState, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, boolean z, Function0<Unit> function0, float f, float f2, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, G0V<? super Skill, ? super Boolean, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        int iA0b;
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> hatchSkillDetailScreenKt$HatchSkillDetailContent$3;
        BRg bRg2 = bRg;
        bfm.AgG(621542929);
        if ((i & 6) == 0) {
            iA0b = AnonymousClass004.A0T(bfm, skill) | i;
        } else {
            iA0b = i;
        }
        if ((i & 48) == 0) {
            iA0b |= AnonymousClass004.A0U(bfm, skillAccountsUiState);
        }
        if ((i & 384) == 0) {
            iA0b |= AnonymousClass004.A0V(bfm, skillLinkedAccountsViewModel);
        }
        if ((i & 3072) == 0) {
            iA0b |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0b |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA0b |= AnonymousClass004.A09(bfm, f);
        }
        if ((1572864 & i) == 0) {
            iA0b |= AnonymousClass004.A0A(bfm, f2);
        }
        if ((12582912 & i) == 0) {
            iA0b |= AnonymousClass004.A0a(bfm, hatchSkillDetailScreenKey);
        }
        if ((100663296 & i) == 0) {
            iA0b |= AnonymousClass004.A0b(bfm, g0v);
        }
        int i3 = i2 & 512;
        int iA0m = 805306368;
        if (i3 != 0) {
            iA0b |= iA0m;
        } else if ((i & 805306368) == 0) {
            iA0m = AnonymousClass004.A0m(bfm, bRg2);
            iA0b |= iA0m;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0b & 306783379, 306783378), bfm, iA0b)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (skill == null) {
                bfm.AgE(781830224);
                if (z) {
                    bfm.AgE(781844143);
                    HatchScreenLoadingStateKt.HatchScreenLoadingState(C3U4.A04(AnonymousClass001.A0T(bRg2), f), bfm, 0, 0);
                } else {
                    bfm.AgE(781954689);
                    HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12012a), function0, C3U4.A04(AnonymousClass001.A0T(bRg2), f), HatchSurface.SETTINGS, HatchSubsurface.CONNECTORS, HatchScreen.CONNECTORS, null, bfm, ((iA0b >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 224256, 64);
                }
                bBbAAc = AnonymousClass001.A0L(bfm, C3cG.A07(bfm));
                if (bBbAAc != null) {
                    hatchSkillDetailScreenKt$HatchSkillDetailContent$3 = new HatchSkillDetailScreenKt$HatchSkillDetailContent$1(skill, skillAccountsUiState, skillLinkedAccountsViewModel, z, function0, f, f2, hatchSkillDetailScreenKey, g0v, bRg2, i, i2);
                    bBbAAc.A06 = hatchSkillDetailScreenKt$HatchSkillDetailContent$3;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 782292465);
            float fA00 = C3cG.A00(bfm, AuraTheme.INSTANCE);
            BRg bRgA0C = C3U4.A0C(AnonymousClass007.A0H(bfm, bRg2, C10G.A01), fA00, 0.0f, fA00, f2 + fA00);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, f + 24.0f);
            SkillDetailHeader(skill, bfm, iA0b & 14);
            C01N.A08(bfm, bs0, 24.0f);
            boolean zA65 = bfm.A65(skill.id);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = SkillConnectConfigKt.firstPartyConnectorConfigForSkill(skill.id);
                bfm.Ai0(objAaT);
            }
            FirstPartyConnectorConfig firstPartyConnectorConfig = (FirstPartyConnectorConfig) objAaT;
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            if (skillAccountsUiState.shouldShowAccountsSection) {
                bfm.AgE(-1152716070);
                boolean zA1T = AnonymousClass001.A1T(bfm, skill, (234881024 & iA0b) == 67108864);
                Object objAaT2 = bfm.AaT();
                if (zA1T || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchSkillDetailScreenKt$HatchSkillDetailContent$2$1$1(g0v, skill);
                    bfm.Ai0(objAaT2);
                }
                LinkedAccountsSection(c90l, skillAccountsUiState, skillLinkedAccountsViewModel, firstPartyConnectorConfig, (G0U) objAaT2, bfm, (iA0b & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6 | (iA0b & 896));
                C01N.A06(bfm, bs0);
            } else {
                bfm.AgE(-1152334553);
            }
            BBI.A0R(bbiA0M, false);
            if (skill.needsReauth && !skill.supportsMultipleAccounts) {
                bfm.AgE(-1152247660);
                boolean z2 = skillAccountsUiState.isUpdating;
                boolean zA67 = bfm.A67(skillLinkedAccountsViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA67 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchSkillDetailScreenKt$HatchSkillDetailContent$2$2$1(skillLinkedAccountsViewModel);
                    bfm.Ai0(objAaT3);
                }
                SkillReconnectRowKt.SkillReconnectRow(c90l, z2, (Function0) objAaT3, null, bfm, 6, 4);
                C01N.A04(bfm, bbiA0M, bs0, AuraDimensKt.SpacingMedium, false);
            } else {
                bfm.AgE(-1152044889);
                BBI.A0R(bbiA0M, false);
            }
            RecipientPermissionsEntryKt.RecipientPermissionsEntry(skill.id, skill.displayName, null, bfm, 0, 4);
            if (!skill.isCustom) {
                bfm.AgE(-1151877613);
                ConnectorPermissionSectionsKt.SkillPermissionsSections(c90l, skill.id, bfm, 6);
                C01N.A06(bfm, bs0);
            } else {
                bfm.AgE(-1151766137);
            }
            BBI.A0R(bbiA0M, false);
            if (canDisconnect(skill, firstPartyConnectorConfig)) {
                bfm.AgE(-1151690962);
                boolean zIsOptimizedSite = skill.isOptimizedSite();
                boolean zA1S = AnonymousClass005.A1S(bfm, skill, auraNavigatorA0b, hatchSkillDetailScreenKey);
                Object objAaT4 = bfm.AaT();
                if (zA1S || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchSkillDetailScreenKt$HatchSkillDetailContent$2$3$1(skill, auraNavigatorA0b, hatchSkillDetailScreenKey);
                    bfm.Ai0(objAaT4);
                }
                DisconnectSkillRow(c90l, zIsOptimizedSite, (Function0) objAaT4, bfm, 6);
            } else {
                bfm.AgE(-1151390169);
            }
            AnonymousClass003.A0q(bbiA0M);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchSkillDetailScreenKt$HatchSkillDetailContent$3 = new HatchSkillDetailScreenKt$HatchSkillDetailContent$3(skill, skillAccountsUiState, skillLinkedAccountsViewModel, z, function0, f, f2, hatchSkillDetailScreenKey, g0v, bRg2, i, i2);
            bBbAAc.A06 = hatchSkillDetailScreenKt$HatchSkillDetailContent$3;
        }
    }
}
