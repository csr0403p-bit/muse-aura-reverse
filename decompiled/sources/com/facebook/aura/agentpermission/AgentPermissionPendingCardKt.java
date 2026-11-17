package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AVy;
import X.AbstractC04540eo;
import X.AbstractC0878AGe;
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
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BQG;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0A8;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DP;
import X.C1OR;
import X.C1YL;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3TQ;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.agentpermission.AgentPermissionDecisionConfirmationViewModel;
import com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.AgentPermissionDecision;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.AgentPermissionHeadlineKt;
import com.facebook.aura.gateway.ApprovalCardOnlyKt;
import com.facebook.aura.gateway.ApprovalConversationIdentity;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.CheckoutPayWithLinkSheetKey;
import com.facebook.aura.navigation.key.CheckoutWalletSheetKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.divider.AuraDividerStyle;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyleConfig;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyles;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes2.dex */
public abstract class AgentPermissionPendingCardKt {
    public static final C1D3 AgentPermissionCardShape = C1D8.A00(28.0f);
    public static final float CardHorizontalPadding = 18.0f;
    public static final String SEE_DETAILS_URL_ANNOTATION = "aura://agent-permission/see-details";
    public static final float SingleApprovalContentSpacing = 16.0f;

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$AgentPermissionApprovalHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$screen = hatchScreen;
            this.$enabled = z;
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
            AgentPermissionPendingCardKt.AgentPermissionApprovalHeader(this.$approval, this.$screen, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$AgentPermissionAttentionBanner$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $attentionLabel;
        public final /* synthetic */ String $explanation;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$attentionLabel = str;
            this.$explanation = str2;
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
            AgentPermissionPendingCardKt.AgentPermissionAttentionBanner(this.$attentionLabel, this.$explanation, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$AgentPermissionDecisionConfirmingStatus$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C107592 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107592(BRg bRg, int i, int i2) {
            super(2);
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
            AgentPermissionPendingCardKt.AgentPermissionDecisionConfirmingStatus(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$AgentPermissionPurposeCard$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C107602 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107602(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$screen = hatchScreen;
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
            AgentPermissionPendingCardKt.AgentPermissionPurposeCard(this.$approval, this.$screen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$AgentPermissionReviewText$1, reason: invalid class name and case insensitive filesystem */
    public final class C107611 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $reviewText;
        public final /* synthetic */ boolean $showBackground;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107611(String str, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$reviewText = str;
            this.$modifier = bRg;
            this.$showBackground = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionPendingCardKt.AgentPermissionReviewText(this.$reviewText, this.$modifier, this.$showBackground, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$AgentPermissionSubtitle$1, reason: invalid class name and case insensitive filesystem */
    public final class C107621 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107621(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, int i) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$screen = hatchScreen;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionPendingCardKt.AgentPermissionSubtitle(this.$approval, this.$screen, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$AgentPermissionSubtitle$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, int i) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$screen = hatchScreen;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionPendingCardKt.AgentPermissionSubtitle(this.$approval, this.$screen, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$ApprovalListRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C107632 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107632(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$onClick = function0;
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
            AgentPermissionPendingCardKt.ApprovalListRow(this.$approval, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$ApprovalListSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C107642 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<HatchAgentPermissionsRepository.AgentPermissionApproval> $approvals;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchAgentPermissionsRepository.AgentPermissionApproval, Unit> $onApprovalClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107642(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, G0U<? super HatchAgentPermissionsRepository.AgentPermissionApproval, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$approvals = list;
            this.$onApprovalClick = g0u;
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
            AgentPermissionPendingCardKt.ApprovalListSection(this.$approvals, this.$onApprovalClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$DecisionConfirmingProgress$3, reason: invalid class name and case insensitive filesystem */
    public final class C107653 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107653(BRg bRg, int i, int i2) {
            super(2);
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
            AgentPermissionPendingCardKt.DecisionConfirmingProgress(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$DecisionUnconfirmedStatus$2, reason: invalid class name and case insensitive filesystem */
    public final class C107662 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCheckAgain;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107662(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onCheckAgain = function0;
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
            AgentPermissionPendingCardKt.DecisionUnconfirmedStatus(this.$onCheckAgain, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$MultiApprovalContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C107672 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $actionsEnabled;
        public final /* synthetic */ List<HatchAgentPermissionsRepository.AgentPermissionApproval> $approvals;
        public final /* synthetic */ AgentPermissionPendingCardViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107672(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, AgentPermissionPendingCardViewModel agentPermissionPendingCardViewModel, boolean z, int i) {
            super(2);
            this.$approvals = list;
            this.$viewModel = agentPermissionPendingCardViewModel;
            this.$actionsEnabled = z;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionPendingCardKt.MultiApprovalContent(this.$approvals, this.$viewModel, this.$actionsEnabled, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$PendingActionRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C107682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<AgentPermissionDecisionOption, Unit> $onDecisionClick;
        public final /* synthetic */ List<AgentPermissionDecisionOption> $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107682(List<AgentPermissionDecisionOption> list, boolean z, G0U<? super AgentPermissionDecisionOption, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$options = list;
            this.$enabled = z;
            this.$onDecisionClick = g0u;
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
            AgentPermissionPendingCardKt.PendingActionRow(this.$options, this.$enabled, this.$onDecisionClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$PendingHeader$1, reason: invalid class name and case insensitive filesystem */
    public final class C107691 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $count;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107691(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$count = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionPendingCardKt.PendingHeader(this.$count, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$PermissionCaption$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C107702 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ C1822Arm $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107702(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, C1822Arm c1822Arm, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$textStyle = c1822Arm;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionPendingCardKt.PermissionCaption(this.$approval, this.$textStyle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$PermissionCardDivider$1, reason: invalid class name and case insensitive filesystem */
    public final class C107711 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107711(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionPendingCardKt.PermissionCardDivider(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$SingleApprovalContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C107721 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $actionsEnabled;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ AgentPermissionPendingCardViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107721(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, AgentPermissionPendingCardViewModel agentPermissionPendingCardViewModel, boolean z, int i) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$viewModel = agentPermissionPendingCardViewModel;
            this.$actionsEnabled = z;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionPendingCardKt.SingleApprovalContent(this.$approval, this.$viewModel, this.$actionsEnabled, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$SingleApprovalTitleRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C107732 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107732(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$screen = hatchScreen;
            this.$enabled = z;
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
            AgentPermissionPendingCardKt.SingleApprovalTitleRow(this.$approval, this.$screen, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* renamed from: AgentPermissionPendingCard-hGBTI10, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m170AgentPermissionPendingCardhGBTI10(X.BRg r12, java.lang.String r13, boolean r14, float r15, boolean r16, X.BFM r17, int r18, int r19) {
        /*
            r10 = r14
            r11 = r15
            r8 = r12
            r9 = r13
            r0 = 1836832154(0x6d7bd59a, float:4.8711854E27)
            r1 = r17
            r1.AgG(r0)
            r14 = r19
            r7 = r19 & 1
            r13 = r18
            if (r7 == 0) goto Lb6
            r4 = r18 | 6
        L16:
            r2 = r19 & 2
            if (r2 == 0) goto Lab
            r4 = r4 | 48
        L1c:
            r6 = r19 & 4
            if (r6 == 0) goto La0
            r4 = r4 | 384(0x180, float:5.38E-43)
        L22:
            r0 = r13 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L35
            r0 = r19 & 8
            if (r0 != 0) goto L32
            boolean r3 = r1.A62(r15)
            r0 = 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L34
        L32:
            r0 = 1024(0x400, float:1.435E-42)
        L34:
            r4 = r4 | r0
        L35:
            r5 = r19 & 16
            r3 = r16
            if (r5 == 0) goto L96
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L3d:
            boolean r0 = X.AnonymousClass004.A1N(r4)
            boolean r0 = X.AnonymousClass001.A1b(r0, r1, r4)
            if (r0 == 0) goto L91
            r1.Afy()
            r0 = r18 & 1
            if (r0 == 0) goto L7c
            boolean r0 = r1.AEk()
            if (r0 != 0) goto L7c
            r1.Afo()
        L57:
            r12 = r3
        L58:
            r1.AAb()
            com.facebook.aura.vds.compose.theme.AuraContainer$Card r3 = com.facebook.aura.vds.compose.theme.AuraContainer.Card.INSTANCE
            com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$AgentPermissionPendingCard$1 r7 = new com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$AgentPermissionPendingCard$1
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = -1366946011(0xffffffffae860f25, float:-6.096305E-11)
            r2 = 54
            X.B1U r0 = X.B1V.A00(r1, r7, r0)
            com.facebook.aura.vds.compose.theme.AuraContainerKt.ProvideAuraContainer(r3, r0, r1, r2)
        L6e:
            X.BBb r0 = r1.AAc()
            if (r0 == 0) goto L7b
            com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$AgentPermissionPendingCard$2 r7 = new com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$AgentPermissionPendingCard$2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0.A06 = r7
        L7b:
            return
        L7c:
            if (r7 == 0) goto L80
            X.BS0 r8 = X.BRg.A00
        L80:
            java.lang.String r9 = X.C3cG.A0e(r9, r2)
            if (r6 == 0) goto L87
            r10 = 1
        L87:
            r0 = r19 & 8
            if (r0 == 0) goto L8d
            float r11 = com.facebook.aura.vds.compose.base.AuraDimensKt.SpacingMedium
        L8d:
            r12 = 0
            if (r5 != 0) goto L58
            goto L57
        L91:
            r1.Afo()
            r12 = r3
            goto L6e
        L96:
            r0 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L3d
            int r0 = X.AnonymousClass004.A0r(r1, r3)
            r4 = r4 | r0
            goto L3d
        La0:
            r0 = r13 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L22
            int r0 = X.AnonymousClass004.A0p(r1, r10)
            r4 = r4 | r0
            goto L22
        Lab:
            r0 = r18 & 48
            if (r0 != 0) goto L1c
            int r0 = X.AnonymousClass004.A0e(r1, r9)
            r4 = r4 | r0
            goto L1c
        Lb6:
            r0 = r18 & 6
            if (r0 != 0) goto Lc2
            int r4 = X.AnonymousClass004.A0d(r1, r12)
            r4 = r4 | r18
            goto L16
        Lc2:
            r4 = r13
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt.m170AgentPermissionPendingCardhGBTI10(X.BRg, java.lang.String, boolean, float, boolean, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg agentPermissionApprovalImpressions(X.BRg r15, java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval> r16, com.facebook.aura.analytics.hatch.HatchScreen r17, X.BFM r18, int r19) {
        /*
            r1 = 0
            r14 = r15
            r9 = r16
            r12 = r17
            X.AnonymousClass005.A10(r15, r9, r12)
            r4 = r18
            java.lang.Object r0 = r4.AaT()
            java.lang.Object r3 = X.C78N.A00
            java.lang.Object r10 = X.AnonymousClass005.A0g(r4, r0, r3, r1)
            androidx.compose.runtime.MutableState r10 = (androidx.compose.runtime.MutableState) r10
            java.lang.Object r11 = r4.AaT()
            if (r11 != r3) goto L24
            java.util.LinkedHashSet r11 = X.C3cG.A0k()
            r4.Ai0(r11)
        L24:
            java.util.Set r11 = (java.util.Set) r11
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r9)
            java.util.Iterator r1 = r9.iterator()
        L2e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r1.next()
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r0 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r0
            java.lang.String r0 = r0.approvalId
            r5.add(r0)
            goto L2e
        L40:
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r10)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r7 = r19
            r0 = r19 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r8 = 1
            r6 = 32
            if (r0 <= r6) goto L59
            boolean r0 = r4.A67(r9)
            if (r0 != 0) goto L5e
        L59:
            r1 = r19 & 48
            r0 = 0
            if (r1 != r6) goto L5f
        L5e:
            r0 = 1
        L5f:
            boolean r6 = X.AnonymousClass001.A1T(r4, r11, r0)
            r0 = r7 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto L71
            boolean r0 = X.AnonymousClass002.A1U(r4, r12)
            if (r0 != 0) goto L76
        L71:
            r0 = r7 & 384(0x180, float:5.38E-43)
            if (r0 == r1) goto L76
            r8 = 0
        L76:
            r6 = r6 | r8
            java.lang.Object r8 = r4.AaT()
            if (r6 != 0) goto L7f
            if (r8 != r3) goto L88
        L7f:
            r13 = 0
            com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$1$1 r8 = new com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$1$1
            r8.<init>(r9, r10, r11, r12, r13)
            r4.Ai0(r8)
        L88:
            X.AnonymousClass001.A1A(r4, r8, r5, r2)
            java.lang.Object r0 = r4.AaT()
            if (r0 != r3) goto L99
            com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$2$1 r0 = new com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$2$1
            r0.<init>(r10)
            r4.Ai0(r0)
        L99:
            X.G0U r0 = (X.G0U) r0
            r18 = 0
            r17 = 0
            X.Huf r15 = X.EnumC10573Huf.A06
            r16 = r0
            X.BRg r0 = X.BPc.A00(r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt.agentPermissionApprovalImpressions(X.BRg, java.util.List, com.facebook.aura.analytics.hatch.HatchScreen, X.BFM, int):X.BRg");
    }

    public static final List<List<HatchAgentPermissionsRepository.AgentPermissionApproval>> partitionExclusiveApprovals(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list) {
        C7384Etj.A0Y(list, 0);
        List<HatchAgentPermissionsRepository.AgentPermissionApproval> listA0c = AbstractC0878AGe.A0c(list, new Comparator() { // from class: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$partitionExclusiveApprovals$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((HatchAgentPermissionsRepository.AgentPermissionApproval) t).requestedAtMs).compareTo(Long.valueOf(((HatchAgentPermissionsRepository.AgentPermissionApproval) t2).requestedAtMs));
            }
        });
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval : listA0c) {
            if (agentPermissionApproval.isExclusive || ApprovalCardOnlyKt.decidesOnlyOnCard(agentPermissionApproval)) {
                arrayListA0h.add(Collections.singletonList(agentPermissionApproval));
            } else {
                arrayListA0h2.add(agentPermissionApproval);
            }
        }
        if (!arrayListA0h2.isEmpty()) {
            arrayListA0h = AbstractC0878AGe.A0P(Collections.singletonList(arrayListA0h2), arrayListA0h);
        }
        return AbstractC0878AGe.A0c(arrayListA0h, new Comparator() { // from class: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$partitionExclusiveApprovals$$inlined$sortedBy$2
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Long l;
                Iterator it = ((List) t).iterator();
                Long lValueOf = null;
                if (it.hasNext()) {
                    lValueOf = Long.valueOf(((HatchAgentPermissionsRepository.AgentPermissionApproval) it.next()).requestedAtMs);
                    while (it.hasNext()) {
                        Long lValueOf2 = Long.valueOf(((HatchAgentPermissionsRepository.AgentPermissionApproval) it.next()).requestedAtMs);
                        if (lValueOf.compareTo(lValueOf2) > 0) {
                            lValueOf = lValueOf2;
                        }
                    }
                }
                long jLongValue = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                Long lValueOf3 = Long.valueOf(lValueOf != null ? lValueOf.longValue() : LinkEncryptedPairingKt.LINK_COUNTER_MAX);
                Iterator it2 = ((List) t2).iterator();
                if (it2.hasNext()) {
                    Long lValueOf4 = Long.valueOf(((HatchAgentPermissionsRepository.AgentPermissionApproval) it2.next()).requestedAtMs);
                    loop1: while (true) {
                        l = lValueOf4;
                        while (it2.hasNext()) {
                            lValueOf4 = Long.valueOf(((HatchAgentPermissionsRepository.AgentPermissionApproval) it2.next()).requestedAtMs);
                            if (l.compareTo(lValueOf4) > 0) {
                                break;
                            }
                        }
                    }
                    jLongValue = l.longValue();
                }
                return lValueOf3.compareTo(Long.valueOf(jLongValue));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* renamed from: AgentPermissionApprovalCard-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m167AgentPermissionApprovalCardFJfuzF0(java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval> r17, com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel r18, boolean r19, X.BRg r20, float r21, X.BFM r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt.m167AgentPermissionApprovalCardFJfuzF0(java.util.List, com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel, boolean, X.BRg, float, X.BFM, int, int):void");
    }

    public static final void AgentPermissionApprovalHeader(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1866936989);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA13 = AnonymousClass004.A13(bfm, SingleApprovalContentSpacing);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA13, akqA04, bRgA01, iA0J);
            int i4 = iA05 & 14;
            int i5 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | i4;
            int i6 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            SingleApprovalTitleRow(agentPermissionApproval, hatchScreen, z, null, bfm, i5 | i6 | (iA05 & 896), 8);
            AgentPermissionPurposeCard(agentPermissionApproval, hatchScreen, null, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | i4 | i6, 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(agentPermissionApproval, hatchScreen, z, bRg2, i, i2);
        }
    }

    public static final void AgentPermissionAttentionBanner(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass1;
        String strA0l;
        ApQ apQRememberPermissionCaptionText;
        String strA0l2;
        BRg bRg2 = bRg;
        bfm.AgG(-339701220);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass1 = new AgentPermissionPendingCardKt$AgentPermissionAttentionBanner$label$2(str, str2, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass1);
                }
                return;
            }
            if (str2 == null || (strA0l2 = AnonymousClass002.A0l(str2)) == null || strA0l2.length() <= 0) {
                AnonymousClass003.A0l(bfm, -1095812644);
                apQRememberPermissionCaptionText = null;
            } else {
                bfm.AgE(-1095812643);
                apQRememberPermissionCaptionText = AgentPermissionCaptionKt.rememberPermissionCaptionText(strA0l2, bfm, 0);
                AnonymousClass001.A1D(bfm);
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).destructiveText;
            boolean zA1K = AnonymousClass003.A1K(bfm, strA0l, apQRememberPermissionCaptionText) | bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                C1731ApS c1731ApS = new C1731ApS(16);
                StringBuilder sb = c1731ApS.A00;
                int length = sb.length();
                c1731ApS.A0E(strA0l);
                C1736ApY c1736ApY = C1736ApY.A01;
                long j2 = C1809ArT.A01;
                c1731ApS.A0A(new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j, j2, j2, B6A.A07), length, sb.length());
                if (apQRememberPermissionCaptionText != null) {
                    c1731ApS.A0E(InviteCodeScratcherKt.CODE_SEPARATOR);
                    c1731ApS.A07(apQRememberPermissionCaptionText);
                }
                objAaT = c1731ApS.A04();
                bfm.Ai0(objAaT);
            }
            C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            long j3 = auraTheme.getColors(bfm, 6).error;
            AuraTextKt.m2640AuraTextVmYn7U0((ApQ) objAaT, C3U4.A0B(C1b8.A03(bRgA0R, C1D8.A00(12.0f), HxS.A04(HDi.A0O[(int) (j3 & 63)], B6A.A03(j3), B6A.A02(j3), B6A.A01(j3), 0.1f)), AuraDimensKt.SpacingMedium, 12.0f), jA06, c1822ArmA0E, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32752);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass1 = new AnonymousClass1(str, str2, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.G0W] */
    /* JADX WARN: Type inference failed for: r31v0, types: [X.AWd] */
    /* JADX WARN: Type inference failed for: r32v0, types: [X.1Yg] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r36v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r37v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r38v0, types: [X.G0V] */
    /* JADX WARN: Type inference failed for: r39v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r41v0, types: [com.facebook.aura.vds.compose.button.AuraButtonAccessibility] */
    /* renamed from: AgentPermissionDecisionButtons-WH-ejsw, reason: not valid java name */
    public static final void m169AgentPermissionDecisionButtonsWHejsw(List<AgentPermissionDecisionOption> list, boolean z, G0U<? super AgentPermissionDecisionOption, Unit> g0u, BRg bRg, float f, C3TQ c3tq, BFM bfm, int i, int i2) {
        C1YL c1yl;
        AuraLabelButtonStyle auraLabelButtonStyleSecondary;
        BRg bRg2 = bRg;
        float f2 = f;
        C3TQ c1dp = c3tq;
        int iA0C = AnonymousClass002.A0C(list, g0u, 0);
        bfm.AgG(1934451021);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A08(bfm, f2);
        }
        int i5 = i2 & 32;
        int iA0i = 196608;
        if (i5 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, c1dp);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 8.0f;
            }
            if (i5 != 0) {
                c1dp = new C1DP(8.0f, 10.0f, 8.0f, 10.0f);
            }
            Object objA0G = AbstractC0878AGe.A0G(list);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f2, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 928007059);
            while (itA0w.hasNext()) {
                AgentPermissionDecisionOption agentPermissionDecisionOption = (AgentPermissionDecisionOption) itA0w.next();
                String str = agentPermissionDecisionOption.labelText;
                if (agentPermissionDecisionOption.equals(objA0G)) {
                    bfm.AgE(528540186);
                    c1yl = null;
                    auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                    BBI.A0R(bbi, false);
                } else {
                    c1yl = null;
                    bfm.AgE(528541660);
                    auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
                    BBI.A0R(bbi, false);
                }
                AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
                boolean zA1T = AnonymousClass001.A1T(bfm, agentPermissionDecisionOption, AnonymousClass004.A1K(iA05));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new AgentPermissionPendingCardKt$AgentPermissionDecisionButtons$1$1$1$1(g0u, agentPermissionDecisionOption);
                    bfm.Ai0(objAaT);
                }
                Function0 function02 = (Function0) objAaT;
                boolean zA1H = AnonymousClass007.A1H(iA05);
                Object objAaT2 = bfm.AaT();
                if (zA1H || objAaT2 == C78N.A00) {
                    objAaT2 = new AgentPermissionPendingCardKt$AgentPermissionDecisionButtons$1$1$2$1(c1dp);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(c1yl, str, c1yl, c1062ATq, auraLabelButtonStyleSecondary, auraButtonSize, c1yl, false, false, z, false, false, c1yl, c1yl, function02, c1yl, c1yl, c1yl, c1yl, c1yl, c1yl, (Function0) objAaT2, c1yl, false, iA0C, false, 0, bfm, ((iA05 << 24) & 1879048192) | 199680, 0, RuntimeInternals.IOPRIO_BACKGROUND, 115326405);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AgentPermissionPendingCardKt$AgentPermissionDecisionButtons$2(list, z, g0u, bRg2, f2, c1dp, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* renamed from: AgentPermissionPendingCardContainer-hGBTI10, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m171AgentPermissionPendingCardContainerhGBTI10(X.BRg r17, java.lang.String r18, boolean r19, float r20, boolean r21, X.BFM r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt.m171AgentPermissionPendingCardContainerhGBTI10(X.BRg, java.lang.String, boolean, float, boolean, X.BFM, int, int):void");
    }

    public static final void AgentPermissionPurposeCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        boolean zA1a = AnonymousClass002.A1a(agentPermissionApproval, hatchScreen);
        bfm.AgG(-1819369875);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA02);
            AgentPermissionSubtitle(agentPermissionApproval, hatchScreen, bfm, C3cH.A01(iA05) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            AgentPermissionAttentionBanner(agentPermissionApproval.attentionLabel, AgentPermissionHeadlineKt.attentionExplanation(agentPermissionApproval), null, bfm, 0, 4);
            AgentPermissionReviewText(agentPermissionApproval.reviewText, null, false, bfm, 0, 6);
            if (AgentPermissionHeadlineKt.hasInlineRequestPreview(agentPermissionApproval)) {
                bfm.AgE(-160503843);
                AgentPermissionInlineRequestPreviewKt.AgentPermissionInlineRequestPreview(agentPermissionApproval.requestPreviewDocument, agentPermissionApproval.requestPreview, AgentPermissionRequestPreviewKt.hasRequestPreviewAttachments(agentPermissionApproval), agentPermissionApproval, hatchScreen, null, ApprovalCardOnlyKt.isConnectorOrderApproval(agentPermissionApproval), bfm, AnonymousClass003.A07(iA05 << 9, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument.$stable | (HatchAgentPermissionsRepository.AgentPermissionApproval.$stable << 9)), 32);
            } else {
                bfm.AgE(-160163649);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107602(agentPermissionApproval, hatchScreen, bRgA0Q, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void AgentPermissionReviewText(String str, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c107611;
        String strA0l;
        int i3;
        BRg bRgA0B;
        boolean z2 = z;
        BRg bRg2 = bRg;
        bfm.AgG(-427516430);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                z2 = true;
            }
            if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c107611 = new AgentPermissionPendingCardKt$AgentPermissionReviewText$text$2(str, bRg2, z2, i, i2);
                    C3cG.A1D(bBbAAc, c107611);
                }
                return;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            if (z2) {
                bRgA0B = C3U4.A0B(C1b8.A03(C3cG.A09(bfm, 1473594695), C1D8.A00(12.0f), auraTheme.getColors(bfm, 6).secondaryButtonBackground), AuraDimensKt.SpacingMedium, 12.0f);
                i3 = 0;
                BBI.A0R((BBI) bfm, false);
            } else {
                bfm.AgE(1473597114);
                i3 = 0;
                BBI.A0R((BBI) bfm, false);
                bRgA0B = BRg.A00;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0l, bRgA0R.then(bRgA0B), jA06, c1822ArmA0E, null, null, C3cH.A0F(5), i3, i3, i3, i3, null, null, null, bfm, i3, i3, 16304);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c107611 = new C107611(str, bRg2, z2, i, i2);
            C3cG.A1D(bBbAAc, c107611);
        }
    }

    public static final void ApprovalListRow(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(agentPermissionApproval, function0);
        bfm.AgG(1396848638);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strAgentPermissionQuestion = AgentPermissionTitleKt.agentPermissionQuestion(agentPermissionApproval, bfm, C3cH.A01(iA05));
            String strPurposeSummaryText = AgentPermissionHeadlineKt.purposeSummaryText(agentPermissionApproval);
            BRg bRgA05 = C0v5.A05(AnonymousClass001.A0R(bRg2), null, function0, zA1a);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA05, f, f2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(agentPermissionApproval.iconUrl, agentPermissionApproval.iconRes, null, AgentPermissionIconsKt.ApprovalIconSize, AgentPermissionIconsKt.ApprovalIconCornerRadius, AgentPermissionIconsKt.approvalGlyphRes(agentPermissionApproval), AgentPermissionIconsKt.ApprovalIconGlyphSize, null, null, bfm, 0, 388);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, f2);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, zA1a);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(2.0f), bfm, C2VU.A02, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strAgentPermissionQuestion, null, C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            if (strPurposeSummaryText == null || strPurposeSummaryText.equals(strAgentPermissionQuestion)) {
                bfm.AgE(695792094);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(strPurposeSummaryText, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 695563128).footnoteRegular, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1a);
            C01N.A09(bfm, bs0, f2);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), AuraIconSize.X_SMALL, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107632(agentPermissionApproval, function0, bRg2, i, i2);
        }
    }

    public static final void ApprovalListSection(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, G0U<? super HatchAgentPermissionsRepository.AgentPermissionApproval, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(2053218983);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1D3 c1d3A00 = C1D8.A00(auraTheme.getDimensions(bfm, 6).sectionCornerRadius);
            BRg bRgA0T = AnonymousClass005.A0T(bfm, C11U.A03(C1b8.A03(C10G.A0A(AnonymousClass001.A0R(bRgA0Q), Float.NaN, 155.0f), c1d3A00, AuraAdaptiveColorsKt.adaptiveFill(auraTheme.getColors(bfm, 6), bfm, AuraColors.$stable)), c1d3A00));
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0D);
                Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1081366775);
                int i4 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = (HatchAgentPermissionsRepository.AgentPermissionApproval) next;
                        boolean zA1T = AnonymousClass001.A1T(bfm, agentPermissionApproval, AnonymousClass003.A1C(iA05));
                        Object objAaT = bfm.AaT();
                        if (zA1T || objAaT == C78N.A00) {
                            objAaT = new AgentPermissionPendingCardKt$ApprovalListSection$1$1$1$1(g0u, agentPermissionApproval);
                            bfm.Ai0(objAaT);
                        }
                        ApprovalListRow(agentPermissionApproval, (Function0) objAaT, null, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable, 4);
                        if (i4 < list.size() - 1) {
                            C3cJ.A0Z(bfm, 1930740732);
                            BBI.A0R(bbi, false);
                        } else {
                            bfm.AgE(1930826261);
                            BBI.A0R(bbi, false);
                        }
                        i4 = i5;
                    }
                }
                bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107642(list, g0u, bRgA0Q, i, i2);
        }
    }

    public static final void DecisionConfirmingProgress(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1463548167);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AgentPermissionPendingCardKt$DecisionConfirmingProgress$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0R, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01(C2VU.A00, AuraDimensKt.SpacingSmall), bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200a2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0O(c90m, BRg.A00, false), C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, C3cH.A0F(5), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107653(bRg2, i, i2);
        }
    }

    public static final void DecisionUnconfirmedStatus(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-671726490);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200a6);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AgentPermissionPendingCardKt$DecisionUnconfirmedStatus$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT, false), jA07, c1822ArmA0E, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200a1), null, null, AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1), AuraButtonSize.SMALL, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0T << 12) & 57344, 0, 134201293);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107662(function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.G0W] */
    /* JADX WARN: Type inference failed for: r29v0, types: [X.AWd] */
    /* JADX WARN: Type inference failed for: r30v0, types: [X.1Yg] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r34v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r35v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r36v0, types: [X.G0V] */
    /* JADX WARN: Type inference failed for: r37v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r39v0, types: [com.facebook.aura.vds.compose.button.AuraButtonAccessibility] */
    public static final void PendingActionRow(List<AgentPermissionDecisionOption> list, boolean z, G0U<? super AgentPermissionDecisionOption, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        C1YL c1yl;
        AuraLabelButtonStyle auraLabelButtonStyleSecondary;
        boolean z2;
        BRg bRgA0Q = bRg;
        bfm.AgG(185572592);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            Object objA0G = AbstractC0878AGe.A0G(list);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0Q.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA13 = AnonymousClass004.A13(bfm, 8.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA13, akqA04, bRgA01, iA0J);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1777044847);
            while (itA0w.hasNext()) {
                AgentPermissionDecisionOption agentPermissionDecisionOption = (AgentPermissionDecisionOption) itA0w.next();
                String str = agentPermissionDecisionOption.labelText;
                if (agentPermissionDecisionOption.equals(objA0G)) {
                    bfm.AgE(-1963468491);
                    c1yl = null;
                    auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                    z2 = false;
                    BBI.A0R(bbi, false);
                } else {
                    c1yl = null;
                    bfm.AgE(-1963467017);
                    auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
                    z2 = false;
                    BBI.A0R(bbi, false);
                }
                AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
                boolean zA1T = AnonymousClass001.A1T(bfm, agentPermissionDecisionOption, AnonymousClass004.A1K(iA05));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new AgentPermissionPendingCardKt$PendingActionRow$1$1$1$1(g0u, agentPermissionDecisionOption);
                    bfm.Ai0(objAaT);
                }
                Function0 function02 = (Function0) objAaT;
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = AgentPermissionPendingCardKt$PendingActionRow$1$1$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(c1yl, str, c1yl, c1062ATq, auraLabelButtonStyleSecondary, auraButtonSize, c1yl, z2, z2, z, z2, z2, c1yl, c1yl, function02, c1yl, c1yl, c1yl, c1yl, c1yl, c1yl, (Function0) objAaT2, c1yl, z2, 1, z2, z2 ? 1 : 0, bfm, ((iA05 << 24) & 1879048192) | 199680, z2 ? 1 : 0, 24624, 115326405);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107682(list, z, g0u, bRgA0Q, i, i2);
        }
    }

    public static final void PendingHeader(int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(390850151);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            String strA0Y = AnonymousClass007.A0Y(i, bfm, R.plurals._name_removed__res_0x7f100006);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0Y, AnonymousClass001.A0R(bRg2), C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107691(i, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PermissionCaption(com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r24, X.C1822Arm r25, X.BFM r26, int r27, int r28) {
        /*
            r12 = r25
            r0 = 0
            r4 = r24
            X.C7384Etj.A0Y(r4, r0)
            r1 = 1146542225(0x4456d891, float:859.38385)
            r3 = r26
            r3.AgG(r1)
            r2 = r27
            r1 = r27 & 6
            if (r1 != 0) goto Lbf
            boolean r1 = X.AnonymousClass004.A1X(r4, r3, r2)
            int r7 = X.AnonymousClass002.A05(r1)
            r7 = r7 | r27
        L20:
            r5 = r27 & 48
            r1 = r28
            if (r5 != 0) goto L35
            r5 = r28 & 2
            if (r5 != 0) goto L32
            boolean r6 = r3.A65(r12)
            r5 = 32
            if (r6 != 0) goto L34
        L32:
            r5 = 16
        L34:
            r7 = r7 | r5
        L35:
            boolean r5 = X.AnonymousClass004.A1H(r7)
            boolean r5 = X.AnonymousClass001.A1b(r5, r3, r7)
            if (r5 == 0) goto Lbb
            r3.Afy()
            r5 = r27 & 1
            r6 = 6
            if (r5 == 0) goto Lae
            boolean r5 = r3.AEk()
            if (r5 != 0) goto Lae
            r3.Afo()
            r5 = r28 & 2
            if (r5 == 0) goto L56
        L54:
            r7 = r7 & (-113(0xffffffffffffff8f, float:NaN))
        L56:
            r3.AAb()
            java.lang.String r8 = com.facebook.aura.gateway.AgentPermissionHeadlineKt.permissionCaptionText(r4)
            if (r8 != 0) goto L76
            r0 = -1235307659(0xffffffffb65eb375, float:-3.3185036E-6)
            r3.AgE(r0)
        L65:
            X.AnonymousClass001.A1D(r3)
        L68:
            X.BBb r3 = r3.AAc()
            if (r3 == 0) goto L75
            com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$PermissionCaption$2 r0 = new com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$PermissionCaption$2
            r0.<init>(r4, r12, r2, r1)
            r3.A06 = r0
        L75:
            return
        L76:
            r5 = -1235307658(0xffffffffb65eb376, float:-3.3185038E-6)
            r3.AgE(r5)
            X.ApQ r8 = com.facebook.aura.agentpermission.AgentPermissionCaptionKt.rememberPermissionCaptionText(r8, r3, r0)
            com.facebook.aura.vds.compose.theme.AuraTheme r5 = com.facebook.aura.vds.compose.theme.AuraTheme.INSTANCE
            long r10 = X.C3cH.A07(r3, r5)
            r5 = 5
            r13 = 0
            X.ATq r9 = X.C10G.A02
            X.1YL r15 = X.C3cH.A0F(r5)
            int r7 = r7 << r6
            r5 = r7 & 7168(0x1c00, float:1.0045E-41)
            r26 = r5 | 48
            r28 = 32688(0x7fb0, float:4.5806E-41)
            r16 = 0
            r14 = r13
            r19 = r0
            r20 = r0
            r21 = r0
            r22 = r13
            r23 = r13
            r24 = r13
            r25 = r3
            r27 = r0
            r18 = r0
            com.facebook.aura.vds.compose.text.AuraTextKt.m2640AuraTextVmYn7U0(r8, r9, r10, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L65
        Lae:
            r5 = r28 & 2
            if (r5 == 0) goto L56
            com.facebook.aura.vds.compose.theme.AuraTheme r5 = com.facebook.aura.vds.compose.theme.AuraTheme.INSTANCE
            com.facebook.aura.vds.compose.theme.AuraTypography r5 = r5.getTypography(r3, r6)
            X.Arm r12 = r5.footnoteMedium
            goto L54
        Lbb:
            r3.Afo()
            goto L68
        Lbf:
            r7 = r2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt.PermissionCaption(com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, X.Arm, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* renamed from: RichApprovalPendingCard-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m172RichApprovalPendingCardFJfuzF0(com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r13, com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel r14, boolean r15, X.BRg r16, float r17, X.BFM r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt.m172RichApprovalPendingCardFJfuzF0(com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel, boolean, X.BRg, float, X.BFM, int, int):void");
    }

    public static final void SingleApprovalTitleRow(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(623109502);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA02);
            C90m c90m = C90m.A00;
            HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(agentPermissionApproval.payloadType.getRendersAsConnectorCard() ? agentPermissionApproval.iconUrl : null, agentPermissionApproval.iconRes, null, AgentPermissionIconsKt.ApprovalIconSize, AgentPermissionIconsKt.ApprovalIconCornerRadius, AgentPermissionIconsKt.approvalGlyphRes(agentPermissionApproval), AgentPermissionIconsKt.ApprovalIconGlyphSize, null, null, bfm, 0, 388);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingMedium);
            int i4 = iA05 & 14;
            String strAgentPermissionQuestion = AgentPermissionTitleKt.agentPermissionQuestion(agentPermissionApproval, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | i4);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).bodyMedium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AgentPermissionPendingCardKt$SingleApprovalTitleRow$1$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            boolean z2 = true;
            AuraTextKt.m2639AuraTextUY9GdpU(strAgentPermissionQuestion, AnonymousClass001.A0Y(bRgAiP, objAaT, false), jA06, c1822Arm, null, null, C3cH.A0F(5), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            if (agentPermissionApproval.editableMessageAvailable) {
                bfm.AgE(2123755098);
                AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.pencil_wght400_outline_24, 0);
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
                AuraIconButtonStyleConfig auraIconButtonStyleConfigFlat = AuraIconButtonStyles.INSTANCE.flat(bfm, 6);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200c0);
                BRg bRgA0C = C3U4.A0C(bs0, AuraDimensKt.SpacingSmall, 0.0f, 0.0f, 0.0f);
                boolean zA1C = AnonymousClass003.A1C(iA05);
                if (i4 != 4 && ((iA05 & 8) == 0 || !bfm.A67(agentPermissionApproval))) {
                    z2 = false;
                }
                boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, zA1C, z2);
                Object objAaT2 = bfm.AaT();
                if (zA1V || objAaT2 == obj) {
                    objAaT2 = new AgentPermissionPendingCardKt$SingleApprovalTitleRow$1$3$1(hatchScreen, agentPermissionApproval, auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                AuraIconButtonKt.m2551AuraIconButtonV2X32rcYo(bRgA0C, aVyA00, auraIconButtonSizeV2, auraIconButtonStyleConfigFlat, strA01, (Function0) objAaT2, null, z, null, null, null, null, null, bfm, AnonymousClass001.A0C(iA05 << 15, AnonymousClass001.A03()), 0, 8000);
            } else {
                bfm.AgE(2124375904);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107732(agentPermissionApproval, hatchScreen, z, bRgA0Q, i, i2);
        }
    }

    public static final HatchComponent bulkActionComponent(AgentPermissionDecisionOption agentPermissionDecisionOption) {
        String str = agentPermissionDecisionOption.kind;
        return C7384Etj.areEqual(str, AgentPermissionDecision.DENY.getWireValue()) ? HatchComponent.AGENT_PERMISSION_DENY_ALL_BUTTON : C7384Etj.areEqual(str, AgentPermissionDecision.ALLOW_ALWAYS.getWireValue()) ? HatchComponent.AGENT_PERMISSION_ALLOW_ALWAYS_ALL_BUTTON : HatchComponent.AGENT_PERMISSION_CONFIRM_BUTTON;
    }

    public static final boolean endsWithSentencePunctuation(String str) {
        return AbstractC0878AGe.A0k(BFI.A0H(new Character[]{'.', Character.valueOf(PublicSuffixDatabase.EXCEPTION_MARKER), '?'}), BQG.A14(str));
    }

    public static final String pendingApprovalsViewModelKey(String str, boolean z) {
        return FGI.A0o("agent_permission_pending_", ApprovalConversationIdentity.INSTANCE.normalize(str), "_", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean rememberApprovalActionsEnabled(java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval> r7, java.lang.String r8, X.BFM r9, int r10) {
        /*
            r0 = r10 & 14
            r0 = r0 ^ 6
            r3 = 1
            r2 = 4
            r6 = 0
            if (r0 <= r2) goto Lf
            boolean r0 = r9.A65(r7)
            if (r0 != 0) goto L14
        Lf:
            r1 = r10 & 6
            r0 = 0
            if (r1 != r2) goto L15
        L14:
            r0 = 1
        L15:
            java.lang.Object r4 = r9.AaT()
            if (r0 != 0) goto L1f
            java.lang.Object r0 = X.C78N.A00
            if (r4 != r0) goto L3c
        L1f:
            java.util.ArrayList r4 = X.AnonymousClass003.A0i(r7)
            java.util.Iterator r1 = r7.iterator()
        L27:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r1.next()
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r0 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r0
            java.lang.String r0 = r0.approvalId
            r4.add(r0)
            goto L27
        L39:
            r9.Ai0(r4)
        L3c:
            java.util.List r4 = (java.util.List) r4
            boolean r5 = r9.A65(r4)
            r0 = r10 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L50
            boolean r0 = r9.A65(r8)
            if (r0 != 0) goto L55
        L50:
            r0 = r10 & 48
            if (r0 == r1) goto L55
            r3 = 0
        L55:
            r5 = r5 | r3
            java.lang.Object r3 = r9.AaT()
            r2 = 0
            if (r5 != 0) goto L61
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L65
        L61:
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = X.AnonymousClass005.A0S(r9, r6)
        L65:
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            boolean r1 = X.AnonymousClass003.A1N(r9, r4, r3)
            java.lang.Object r0 = r9.AaT()
            if (r1 != 0) goto L75
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L7d
        L75:
            com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$rememberApprovalActionsEnabled$1$1 r0 = new com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$rememberApprovalActionsEnabled$1$1
            r0.<init>(r4, r3, r2)
            r9.Ai0(r0)
        L7d:
            X.AnonymousClass001.A1A(r9, r0, r4, r8)
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt.rememberApprovalActionsEnabled(java.util.List, java.lang.String, X.BFM, int):boolean");
    }

    public static final String rememberPendingApprovalBatchKey(String str, boolean z, BFM bfm, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = (HatchAgentPermissionsRepository.AgentPermissionApproval) AbstractC0878AGe.A0G(rememberPendingApprovals(str, C3cG.A1J(i2, z), bfm, i & 126));
        if (agentPermissionApproval != null) {
            return agentPermissionApproval.approvalId;
        }
        return null;
    }

    public static final List<HatchAgentPermissionsRepository.AgentPermissionApproval> rememberPendingApprovals(String str, boolean z, BFM bfm, int i) {
        return (List) C1BO.A07(bfm, pendingApprovalsViewModel(str, z, bfm, i & 126).approvals);
    }

    public static final void AgentPermissionDecisionConfirmingStatus(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1652790294);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AgentPermissionDecisionConfirmationViewModel.Factory factory = new AgentPermissionDecisionConfirmationViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            AgentPermissionDecisionConfirmationViewModel agentPermissionDecisionConfirmationViewModel = (AgentPermissionDecisionConfirmationViewModel) C3cH.A0G(factory, bodA00, AnonymousClass005.A0Y(bodA00), AgentPermissionDecisionConfirmationViewModel.class);
            if (C1BO.A0F(C2CK.A02(bfm, agentPermissionDecisionConfirmationViewModel.stalled))) {
                boolean zA1Z = AnonymousClass001.A1Z(agentPermissionDecisionConfirmationViewModel, bfm, -770234950);
                Object objAaT = bfm.AaT();
                if (zA1Z || objAaT == C78N.A00) {
                    objAaT = new AgentPermissionPendingCardKt$AgentPermissionDecisionConfirmingStatus$1$1(agentPermissionDecisionConfirmationViewModel);
                    bfm.Ai0(objAaT);
                }
                DecisionUnconfirmedStatus((Function0) ((InterfaceC7353EnQ) objAaT), bRg, bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            } else {
                bfm.AgE(-770137238);
                DecisionConfirmingProgress(bRg, bfm, iA0d & 14, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107592(bRg, i, i2);
        }
    }

    public static final void AgentPermissionSubtitle(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass3;
        String string;
        bfm.AgG(-871362322);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120127);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).link;
            String strPurposeSummaryText = AgentPermissionHeadlineKt.purposeSummaryText(agentPermissionApproval);
            if (AgentPermissionHeadlineKt.hasInlineRequestPreview(agentPermissionApproval) || !AgentPermissionTaskDetailsSheetKt.hasTaskDetailsBeyondSummary(agentPermissionApproval)) {
                bfm.AgE(27806223);
                if (strPurposeSummaryText != null) {
                    AuraTextKt.m2639AuraTextUY9GdpU(strPurposeSummaryText, C10G.A02, C3cH.A06(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 27840168).subheadlineRegular, null, null, C3cH.A0F(5), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
                } else {
                    bfm.AgE(28072916);
                }
                AnonymousClass006.A1N(bfm);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new C107621(agentPermissionApproval, hatchScreen, i);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 28087796);
            if (strPurposeSummaryText == null || (string = C7BY.A0G(strPurposeSummaryText).toString()) == null || C7BY.A0j(string)) {
                string = null;
            }
            boolean zA1K = AnonymousClass003.A1K(bfm, string, strA01) | bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                C1731ApS c1731ApS = new C1731ApS(16);
                if (string != null) {
                    c1731ApS.A0E(string);
                    c1731ApS.A0E(endsWithSentencePunctuation(string) ? InviteCodeScratcherKt.CODE_SEPARATOR : ". ");
                }
                StringBuilder sb = c1731ApS.A00;
                int length = sb.length();
                c1731ApS.A0E(strA01);
                C1736ApY c1736ApY = C1736ApY.A03;
                long j2 = C1809ArT.A01;
                c1731ApS.A0A(new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j, j2, j2, B6A.A07), length, sb.length());
                c1731ApS.A0B(new C1OR(SEE_DETAILS_URL_ANNOTATION), length, sb.length());
                objAaT = c1731ApS.A04();
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            boolean zA1I = AnonymousClass004.A1I(iA05);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval))) {
                z = true;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, zA1I, z);
            Object objAaT2 = bfm.AaT();
            if (zA1V || objAaT2 == C78N.A00) {
                objAaT2 = new AgentPermissionPendingCardKt$AgentPermissionSubtitle$onSeeDetailsClick$1$1(hatchScreen, agentPermissionApproval, auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            C1062ATq c1062ATq = C10G.A02;
            boolean zA1K2 = AnonymousClass003.A1K(bfm, apQ, function0);
            Object objAaT3 = bfm.AaT();
            if (zA1K2 || objAaT3 == C78N.A00) {
                objAaT3 = new AgentPermissionPendingCardKt$AgentPermissionSubtitle$2$1(apQ, function0);
                bfm.Ai0(objAaT3);
            }
            AuraTextKt.m2638AuraClickableTextZsD2BWI(apQ, c1062ATq, (G0U) objAaT3, null, null, null, false, jA06, c1822ArmA0B, null, null, C3cH.A0F(5), 0L, false, 0, 0, 0, null, null, null, bfm, 48, 0, 1046136);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(agentPermissionApproval, hatchScreen, i);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final void MultiApprovalContent(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, AgentPermissionPendingCardViewModel agentPermissionPendingCardViewModel, boolean z, BFM bfm, int i) {
        bfm.AgG(1830399133);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(agentPermissionPendingCardViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            List<AgentPermissionDecisionOption> listCommonPermissionDecisionOptions = AgentPermissionDecisionViewModelKt.commonPermissionDecisionOptions(list);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            float f = CardHorizontalPadding;
            float f2 = AuraDimensKt.SpacingMedium;
            float f3 = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(c1062ATq, f, f2, f, f3);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA02);
            PendingHeader(list.size(), C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, f3), bfm, 0, 0);
            int i2 = iA05 & 14;
            boolean zA1T = AnonymousClass001.A1T(bfm, auraNavigatorA0b, i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(list)));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new AgentPermissionPendingCardKt$MultiApprovalContent$1$1$1(list, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            ApprovalListSection(list, (G0U) objAaT, null, bfm, i2, 4);
            BRg bRgA0C2 = C3U4.A0C(bs0, 0.0f, AuraDimensKt.SpacingLargePlusMicro, 0.0f, 0.0f);
            boolean z2 = (i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(list))) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(agentPermissionPendingCardViewModel)));
            Object objAaT2 = bfm.AaT();
            if (z2 || objAaT2 == C78N.A00) {
                objAaT2 = new AgentPermissionPendingCardKt$MultiApprovalContent$1$2$1(list, agentPermissionPendingCardViewModel);
                bfm.Ai0(objAaT2);
            }
            PendingActionRow(listCommonPermissionDecisionOptions, z, (G0U) objAaT2, bRgA0C2, bfm, (iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107672(list, agentPermissionPendingCardViewModel, z, i);
        }
    }

    public static final void PermissionCardDivider(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, -1104011811, i), bfm, i)) {
            AuraDividerKt.AuraDivider(null, AuraDividerStyle.Elevated.INSTANCE, false, bfm, 48, 5);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107711(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SingleApprovalContent(com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r19, com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel r20, boolean r21, X.BFM r22, int r23) {
        /*
            r0 = 640005873(0x2625b6f1, float:5.7493807E-16)
            r6 = r22
            r6.AgG(r0)
            r2 = r23
            r0 = r23 & 6
            r11 = 4
            r12 = r19
            if (r0 != 0) goto Ld7
            boolean r0 = X.AnonymousClass004.A1X(r12, r6, r2)
            int r9 = X.AnonymousClass002.A05(r0)
            r9 = r9 | r23
        L1b:
            r0 = r23 & 48
            r5 = 32
            r4 = r20
            if (r0 != 0) goto L2c
            boolean r0 = X.AnonymousClass004.A1Y(r4, r6, r2)
            int r0 = X.AnonymousClass002.A06(r0)
            r9 = r9 | r0
        L2c:
            r0 = r2 & 384(0x180, float:5.38E-43)
            r3 = r21
            if (r0 != 0) goto L37
            int r0 = X.AnonymousClass004.A0p(r6, r3)
            r9 = r9 | r0
        L37:
            boolean r0 = X.AnonymousClass004.A1J(r9)
            boolean r0 = X.AnonymousClass001.A1b(r0, r6, r9)
            if (r0 == 0) goto Ld3
            X.1BN<java.util.Set<java.lang.String>> r0 = r4.submittingApprovalIds
            r19 = 0
            X.1BO r1 = X.C2CK.A02(r6, r0)
            X.1BN<java.util.Set<java.lang.String>> r0 = r4.confirmingApprovalIds
            X.1BO r10 = X.C2CK.A02(r6, r0)
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r0 = r12.approvalId
            boolean r8 = r1.contains(r0)
            r7 = r9 & 14
            if (r7 == r11) goto L69
            r0 = r9 & 8
            if (r0 == 0) goto Ld1
            boolean r0 = r6.A67(r12)
            if (r0 == 0) goto Ld1
        L69:
            r1 = 1
        L6a:
            r0 = r9 & 112(0x70, float:1.57E-43)
            if (r0 == r5) goto L78
            r0 = r9 & 64
            if (r0 == 0) goto Lcf
            boolean r0 = r6.A67(r4)
            if (r0 == 0) goto Lcf
        L78:
            r0 = 1
        L79:
            r1 = r1 | r0
            java.lang.Object r5 = r6.AaT()
            if (r1 != 0) goto L84
            java.lang.Object r0 = X.C78N.A00
            if (r5 != r0) goto L8c
        L84:
            com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$SingleApprovalContent$onDecision$1$1 r5 = new com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$SingleApprovalContent$onDecision$1$1
            r5.<init>(r12, r4)
            r6.Ai0(r5)
        L8c:
            X.G0U r5 = (X.G0U) r5
            com.facebook.aura.analytics.hatch.HatchScreen r13 = com.facebook.aura.analytics.hatch.HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_PILL
            float r14 = com.facebook.aura.agentpermission.AgentPermissionPendingCardKt.CardHorizontalPadding
            if (r21 == 0) goto L97
            r15 = 1
            if (r8 == 0) goto L98
        L97:
            r15 = 0
        L98:
            X.ATq r9 = X.C10G.A02
            float r8 = com.facebook.aura.vds.compose.base.AuraDimensKt.SpacingSmall
            r1 = 0
            r0 = 1103101952(0x41c00000, float:24.0)
            X.BRg r17 = X.C3U4.A0C(r9, r1, r0, r1, r8)
            java.lang.Object r8 = r10.getValue()
            java.util.Set r8 = (java.util.Set) r8
            java.lang.String r0 = r12.approvalId
            boolean r20 = r8.contains(r0)
            int r0 = com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval.$stable
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            r0 = r0 | r7
            r23 = 192(0xc0, float:2.69E-43)
            r21 = r6
            r22 = r0
            r18 = r1
            r16 = r5
            m168AgentPermissionApprovalContent7UH0Qls(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        Lc1:
            X.BBb r1 = r6.AAc()
            if (r1 == 0) goto Lce
            com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$SingleApprovalContent$1 r0 = new com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$SingleApprovalContent$1
            r0.<init>(r12, r4, r3, r2)
            r1.A06 = r0
        Lce:
            return
        Lcf:
            r0 = 0
            goto L79
        Ld1:
            r1 = 0
            goto L6a
        Ld3:
            r6.Afo()
            goto Lc1
        Ld7:
            r9 = r2
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt.SingleApprovalContent(com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel, boolean, X.BFM, int):void");
    }

    public static final AuraBottomSheetNavKey checkoutPaymentRowKey(String str, HatchAgentPermissionsRepository.CheckoutApprovalPayload checkoutApprovalPayload) {
        AnonymousClass003.A0u(str, checkoutApprovalPayload);
        return (checkoutApprovalPayload.getPaymentSelection() == null && checkoutApprovalPayload.getPaymentOptions().isEmpty()) ? new CheckoutPayWithLinkSheetKey(str) : new CheckoutWalletSheetKey(str);
    }

    public static final AgentPermissionPendingCardViewModel pendingApprovalsViewModel(String str, boolean z, BFM bfm, int i) {
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        String strPendingApprovalsViewModelKey = pendingApprovalsViewModelKey(str, z);
        AgentPermissionPendingCardViewModel.Factory factory = new AgentPermissionPendingCardViewModel.Factory(abstractC3358CGzA0h, str, z);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            return (AgentPermissionPendingCardViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), AgentPermissionPendingCardViewModel.class, strPendingApprovalsViewModelKey);
        }
        throw AnonymousClass001.A0o();
    }

    /* renamed from: pendingRichApprovalCard-TDGSqEk, reason: not valid java name */
    public static final BRg m176pendingRichApprovalCardTDGSqEk(BRg bRg, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, float f, BFM bfm, int i) {
        BRg bRgAgentPermissionApprovalImpressions = agentPermissionApprovalImpressions(AnonymousClass001.A0R(bRg), Collections.singletonList(agentPermissionApproval), HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_PILL, bfm, (HatchAgentPermissionsRepository.AgentPermissionApproval.$stable << 3) | 384);
        float f2 = AuraDimensKt.SpacingMedium;
        return AbstractC04540eo.A00(C3U4.A0C(bRgAgentPermissionApprovalImpressions, f2, 0.0f, f2, f), AgentPermissionCardShape, 8.0f, 12, 0L, C3cH.A0W(bfm).shadow);
    }

    public static final int rememberPendingAgentPermissionCount(String str, boolean z, BFM bfm, int i, int i2) {
        return rememberPendingApprovals(AnonymousClass006.A0r(i2, str), C3cG.A1J(i2, z), bfm, i & 126).size();
    }

    public static final Function0<String> rememberPendingApprovalBatchKeySnapshot(String str, boolean z, BFM bfm, int i, int i2) {
        AgentPermissionPendingCardViewModel agentPermissionPendingCardViewModelPendingApprovalsViewModel = pendingApprovalsViewModel(AnonymousClass006.A0r(i2, str), C3cG.A1J(i2, z), bfm, i & 126);
        boolean zA65 = bfm.A65(agentPermissionPendingCardViewModelPendingApprovalsViewModel);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new AgentPermissionPendingCardKt$rememberPendingApprovalBatchKeySnapshot$1$1(agentPermissionPendingCardViewModelPendingApprovalsViewModel);
            bfm.Ai0(objAaT);
        }
        return (Function0) ((InterfaceC7353EnQ) objAaT);
    }

    /* renamed from: AgentPermissionApprovalContent-7UH0Qls, reason: not valid java name */
    public static final void m168AgentPermissionApprovalContent7UH0Qls(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, float f, boolean z, G0U<? super AgentPermissionDecisionOption, Unit> g0u, BRg bRg, float f2, C3TQ c3tq, boolean z2, BFM bfm, int i, int i2) {
        int iA0X;
        BRg bRg2 = bRg;
        float f3 = f2;
        C3TQ c1dp = c3tq;
        boolean zA1K = z2;
        C7384Etj.A0Y(agentPermissionApproval, 0);
        AnonymousClass002.A1C(hatchScreen, 1, g0u);
        bfm.AgG(-887249829);
        if ((i & 6) == 0) {
            iA0X = AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i;
        } else {
            iA0X = i;
        }
        if ((i & 48) == 0) {
            iA0X |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        if ((i & 384) == 0) {
            iA0X |= AnonymousClass004.A06(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA0X |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0X |= AnonymousClass004.A0X(bfm, g0u);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0X |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0X |= iA0i;
        }
        int i4 = i2 & 64;
        int iA01 = 1572864;
        if (i4 != 0) {
            iA0X |= iA01;
        } else if ((1572864 & i) == 0) {
            iA01 = AnonymousClass002.A01(bfm.A62(f3) ? 1 : 0);
            iA0X |= iA01;
        }
        int i5 = i2 & 128;
        int iA0k = 12582912;
        if (i5 != 0) {
            iA0X |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, c1dp);
            iA0X |= iA0k;
        }
        int i6 = i2 & 256;
        int i7 = 100663296;
        if (i6 != 0) {
            iA0X |= i7;
        } else if ((i & 100663296) == 0) {
            i7 = 33554432;
            if (bfm.A66(zA1K)) {
                i7 = 67108864;
            }
            iA0X |= i7;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0X), bfm, iA0X)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f3 = 8.0f;
            }
            if (i5 != 0) {
                c1dp = new C1DP(8.0f, 10.0f, 8.0f, 10.0f);
            }
            zA1K = C3cG.A1K(i6, zA1K);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f4 = SingleApprovalContentSpacing;
            C9m9 c9m9A00 = AcQ.A00(f4);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            BS0 bs0 = BRg.A00;
            int i8 = iA0X & 14;
            AgentPermissionApprovalHeader(agentPermissionApproval, hatchScreen, z, C3U4.A0B(bs0, f, 0.0f), bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | i8 | (iA0X & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0X >> 3) & 896), 0);
            PermissionCardDivider(bfm, 0);
            BRg bRgA0B = C3U4.A0B(bs0, f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, f4, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            PermissionCaption(agentPermissionApproval, AuraTheme.INSTANCE.getTypography(bfm, 6).caption1Regular, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | i8, 0);
            m169AgentPermissionDecisionButtonsWHejsw(agentPermissionApproval.decisionOptions, z, g0u, null, f3, c1dp, bfm, (iA0X >> 6) & 517104, 8);
            if (!zA1K) {
                bfm.AgE(933417915);
            } else {
                bfm.AgE(-246985680);
                AgentPermissionDecisionConfirmingStatus(null, bfm, 0, 1);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AgentPermissionPendingCardKt$AgentPermissionApprovalContent$2(agentPermissionApproval, hatchScreen, f, z, g0u, bRg2, f3, c1dp, zA1K, i, i2);
        }
    }
}
