package com.facebook.aura.agentpermission;

import X.AKQ;
import X.ARV;
import X.AVy;
import X.AYD;
import X.AbstractC0878AGe;
import X.AbstractC1103AYp;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AuJ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHJ;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0Hi;
import X.C0z7;
import X.C10G;
import X.C1515AkP;
import X.C1518AkS;
import X.C1822Arm;
import X.C1BO;
import X.C1C3;
import X.C1DG;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.C78e;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.gateway.EditableMessage;
import com.facebook.aura.gateway.EditableMessageAttachment;
import com.facebook.aura.gateway.EditableMessageEditor;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyleConfig;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyles;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AgentPermissionMessageEditorScreenKt {

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorScreenKt$AgentPermissionMessageEditorScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<AgentPermissionMessageEditorUiState> $state$delegate;
        public final /* synthetic */ AgentPermissionMessageEditorViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, C1BO<AgentPermissionMessageEditorUiState> c1bo) {
            super(2);
            this.$viewModel = agentPermissionMessageEditorViewModel;
            this.$state$delegate = c1bo;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                if (this.$state$delegate.getValue().saving) {
                    bfm.AgE(1675311044);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200cc);
                    BRg bRgA02 = C10G.A02(C2VU.A09, C10G.A07(BRg.A00, 48.0f), false);
                    boolean zA65 = bfm.A65(strA01);
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = new AgentPermissionMessageEditorScreenKt$AgentPermissionMessageEditorScreen$3$1$1(strA01);
                        bfm.Ai0(objAaT);
                    }
                    AnonymousClass007.A0v(bfm, bRgA02, (G0U) objAaT);
                } else {
                    bfm.AgE(1675669807);
                    AVy aVyA00 = BOf.A00(bfm, R.drawable.checkmark_outline_24, 0);
                    String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120122);
                    Object obj = this.$viewModel;
                    boolean zA67 = bfm.A67(obj);
                    Object objAaT2 = bfm.AaT();
                    if (zA67 || objAaT2 == C78N.A00) {
                        objAaT2 = new AgentPermissionMessageEditorScreenKt$AgentPermissionMessageEditorScreen$3$2$1(obj);
                        bfm.Ai0(objAaT2);
                    }
                    AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA00, strA012, (Function0) ((InterfaceC7353EnQ) objAaT2), null, this.$state$delegate.getValue().getCanSave(), 0.0f, null, null, null, false, false, bfm, AVy.$stable, 0, 2024);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorScreenKt$AgentPermissionMessageEditorScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ C1BO<AgentPermissionMessageEditorUiState> $state$delegate;
        public final /* synthetic */ AgentPermissionMessageEditorViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, String str, C1BO<AgentPermissionMessageEditorUiState> c1bo) {
            super(4);
            this.$viewModel = agentPermissionMessageEditorViewModel;
            this.$approvalId = str;
            this.$state$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m164invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m164invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (this.$state$delegate.getValue().loading || this.$state$delegate.getValue().unavailable || this.$state$delegate.getValue().editor == null) {
                bfm.AgE(-521202071);
                AgentPermissionMessageEditorScreenKt.MessageEditorPageState(this.$state$delegate.getValue(), this.$viewModel, this.$approvalId, C3U4.A0C(C10G.A01, 0.0f, f, 0.0f, f2), bfm, AgentPermissionMessageEditorUiState.$stable | (AgentPermissionMessageEditorViewModel.$stable << 3), 0);
            } else {
                BS0 bs0A09 = C3cG.A09(bfm, -520983583);
                BRg bRgA0T = AnonymousClass005.A0T(bfm, C10G.A01);
                C1BO<AgentPermissionMessageEditorUiState> c1bo = this.$state$delegate;
                AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel = this.$viewModel;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0T);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C01N.A08(bfm, bs0A09, f);
                EditableMessageEditor editableMessageEditor = c1bo.getValue().editor;
                if (editableMessageEditor == null) {
                    bfm.AgE(-769890589);
                } else {
                    bfm.AgE(-769890588);
                    EditableMessage editableMessage = editableMessageEditor.message;
                    float f3 = AuraDimensKt.SpacingLarge;
                    AgentPermissionMessageEditorScreenKt.MessageEditorRecipients(editableMessage, C3U4.A0B(bs0A09, f3, 0.0f), bfm, EditableMessage.$stable, 0);
                    AgentPermissionMessageEditorUiState value = c1bo.getValue();
                    int i2 = AgentPermissionMessageEditorUiState.$stable;
                    int i3 = AgentPermissionMessageEditorViewModel.$stable;
                    AgentPermissionMessageEditorScreenKt.MessageEditorFields(value, agentPermissionMessageEditorViewModel, null, bfm, i2 | (i3 << 3), 4);
                    AgentPermissionMessageEditorScreenKt.MessageEditorAttachments(c1bo.getValue().attachments, agentPermissionMessageEditorViewModel, !c1bo.getValue().saving, C3U4.A0B(bs0A09, f3, 0.0f), bfm, i3 << 3, 0);
                }
                BBI.A0R(bbi, false);
                C01N.A04(bfm, bbi, bs0A09, AuraDimensKt.SpacingLarge + f2, true);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorScreenKt$AgentPermissionMessageEditorScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$approvalId = str;
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
            AgentPermissionMessageEditorScreenKt.AgentPermissionMessageEditorScreen(this.$approvalId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorScreenKt$MessageEditorAttachments$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<EditableMessageAttachment> $attachments;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AgentPermissionMessageEditorViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<EditableMessageAttachment> list, AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$attachments = list;
            this.$viewModel = agentPermissionMessageEditorViewModel;
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
            AgentPermissionMessageEditorScreenKt.MessageEditorAttachments(this.$attachments, this.$viewModel, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorScreenKt$MessageEditorAttachments$3, reason: invalid class name and case insensitive filesystem */
    public final class C107453 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<EditableMessageAttachment> $attachments;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AgentPermissionMessageEditorViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107453(List<EditableMessageAttachment> list, AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$attachments = list;
            this.$viewModel = agentPermissionMessageEditorViewModel;
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
            AgentPermissionMessageEditorScreenKt.MessageEditorAttachments(this.$attachments, this.$viewModel, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorScreenKt$MessageEditorFields$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AgentPermissionMessageEditorUiState $state;
        public final /* synthetic */ AgentPermissionMessageEditorViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AgentPermissionMessageEditorUiState agentPermissionMessageEditorUiState, AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$state = agentPermissionMessageEditorUiState;
            this.$viewModel = agentPermissionMessageEditorViewModel;
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
            AgentPermissionMessageEditorScreenKt.MessageEditorFields(this.$state, this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorScreenKt$MessageEditorPageState$5, reason: invalid class name and case insensitive filesystem */
    public final class C107465 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AgentPermissionMessageEditorUiState $state;
        public final /* synthetic */ AgentPermissionMessageEditorViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107465(AgentPermissionMessageEditorUiState agentPermissionMessageEditorUiState, AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$state = agentPermissionMessageEditorUiState;
            this.$viewModel = agentPermissionMessageEditorViewModel;
            this.$approvalId = str;
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
            AgentPermissionMessageEditorScreenKt.MessageEditorPageState(this.$state, this.$viewModel, this.$approvalId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorScreenKt$MessageEditorRecipientRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C107471 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107471(int i, String str, BRg bRg, int i2, int i3) {
            super(2);
            this.$label = i;
            this.$value = str;
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
            AgentPermissionMessageEditorScreenKt.MessageEditorRecipientRow(this.$label, this.$value, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionMessageEditorScreenKt$MessageEditorRecipients$2, reason: invalid class name and case insensitive filesystem */
    public final class C107482 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EditableMessage $message;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107482(EditableMessage editableMessage, BRg bRg, int i, int i2) {
            super(2);
            this.$message = editableMessage;
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
            AgentPermissionMessageEditorScreenKt.MessageEditorRecipients(this.$message, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AgentPermissionMessageEditorScreen(java.lang.String r45, X.BRg r46, X.BFM r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionMessageEditorScreenKt.AgentPermissionMessageEditorScreen(java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    public static final void MessageEditorAttachments(List<EditableMessageAttachment> list, AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c107453;
        BRg bRgA0Q = bRg;
        bfm.AgG(640873179);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(agentPermissionMessageEditorViewModel, bfm, i) ? 1 : 0);
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
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c107453 = new AnonymousClass1(list, agentPermissionMessageEditorViewModel, z, bRgA0Q, i, i2);
                    C3cG.A1D(bBbAAc, c107453);
                }
                return;
            }
            BRg bRgA01 = AbstractC1103AYp.A01(AbstractC1103AYp.A00(0, bfm, 0, 1), AnonymousClass001.A0R(bRgA0Q), true);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingMedium, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0S);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1425249970);
            while (itA0w.hasNext()) {
                EditableMessageAttachment editableMessageAttachment = (EditableMessageAttachment) itA0w.next();
                bfm.Ag8(2070914111, editableMessageAttachment.id);
                C3TH c3th = C2VU.A00;
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA014 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
                BPg.A02(bfm, akqA043, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA014, g0vA0u);
                C0z7 c0z7 = C0z7.A00;
                AgentPermissionRequestPreviewAttachmentsKt.PreviewAttachmentMedia(editableMessageAttachment.preview, null, null, bfm, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment.$stable, 6);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.x_wght400_outline_24, 0);
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.SMALL;
                AuraIconButtonStyleConfig auraIconButtonStyleConfigFlat = AuraIconButtonStyles.INSTANCE.flat(bfm, 6);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraIconButtonStyleConfig auraIconButtonStyleConfigM2562copyGCAZt4c = auraIconButtonStyleConfigFlat.m2562copyGCAZt4c(auraIconButtonStyleConfigFlat.iconColor, auraTheme.getColors(bfm, 6).background, auraIconButtonStyleConfigFlat.gradientBrush, auraIconButtonStyleConfigFlat.requiresBackground, auraIconButtonStyleConfigFlat.elevation);
                String strA0t = AnonymousClass001.A0t(bfm, editableMessageAttachment.name, R.string._name_removed__res_0x7f12011d);
                BRg bRgThen = AYD.A01(c0z7.A4C(C2VU.A0D, bs0), 8.0f, -8.0f).then(ARV.A00);
                boolean zA1T = AnonymousClass001.A1T(bfm, editableMessageAttachment, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(agentPermissionMessageEditorViewModel)));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new AgentPermissionMessageEditorScreenKt$MessageEditorAttachments$2$1$1$1$1$1(agentPermissionMessageEditorViewModel, editableMessageAttachment);
                    bfm.Ai0(objAaT);
                }
                AuraIconButtonKt.m2551AuraIconButtonV2X32rcYo(bRgThen, aVyA00, auraIconButtonSizeV2, auraIconButtonStyleConfigM2562copyGCAZt4c, strA0t, (Function0) objAaT, null, z, null, new C1DG(12.0f), null, null, null, bfm, AnonymousClass001.A0C(iA05 << 15, (AVy.$stable << 3) | 805306752), 0, 7488);
                BBI.A0R(bbi, true);
                String str = editableMessageAttachment.altText;
                if (str == null) {
                    bfm.AgE(-1247704995);
                    BBI.A0R(bbi, false);
                } else {
                    AuraTextKt.m2639AuraTextUY9GdpU(str, C10G.A0D(bs0, Float.NaN, 160.0f), 0L, C3cH.A0X(bfm, auraTheme, -1247704994).footnoteRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16372);
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, false);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c107453 = new C107453(list, agentPermissionMessageEditorViewModel, z, bRgA0Q, i, i2);
            C3cG.A1D(bBbAAc, c107453);
        }
    }

    public static final void MessageEditorFields(AgentPermissionMessageEditorUiState agentPermissionMessageEditorUiState, AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BS0 bs0A09;
        BRg bRg2 = bRg;
        bfm.AgG(812569919);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionMessageEditorUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(agentPermissionMessageEditorViewModel, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long jA06 = C3cH.A06(bfm, auraTheme);
            long j = auraTheme.getColors(bfm, 6).textInput.cursorColor;
            long jA07 = C3cH.A07(bfm, auraTheme);
            long j2 = B6A.A06;
            AuraColorsTextInput auraColorsTextInput = new AuraColorsTextInput(jA06, j, jA07, j2, j2, j2, new B6A(j2));
            boolean z2 = agentPermissionMessageEditorUiState.saving;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0D);
            EditableMessageEditor editableMessageEditor = agentPermissionMessageEditorUiState.editor;
            if (editableMessageEditor == null || !editableMessageEditor.isEmail()) {
                bs0A09 = C3cG.A09(bfm, 566086662);
                C01N.A04(bfm, bbi, bs0A09, AuraDimensKt.SpacingSmall, false);
            } else {
                bfm.AgE(565397780);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200cd);
                String str = agentPermissionMessageEditorUiState.subject;
                boolean z3 = (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(agentPermissionMessageEditorViewModel));
                Object objAaT = bfm.AaT();
                if (z3 || objAaT == C78N.A00) {
                    objAaT = new AgentPermissionMessageEditorScreenKt$MessageEditorFields$1$1$1(agentPermissionMessageEditorViewModel);
                    bfm.Ai0(objAaT);
                }
                InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT;
                C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
                bs0A09 = BRg.A00;
                boolean zA65 = bfm.A65(strA01);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new AgentPermissionMessageEditorScreenKt$MessageEditorFields$1$2$1(strA01);
                    bfm.Ai0(objAaT2);
                }
                AuraTextInputKt.AuraTextInput(str, null, AnonymousClass001.A0Y(bs0A09, objAaT2, false), null, null, null, null, c1822ArmA0C, true, 0, 0, B1V.A00(bfm, new AgentPermissionMessageEditorScreenKt$MessageEditorFields$1$3(strA01), -701049481), null, auraColorsTextInput, null, false, z2, false, true, null, (G0U) interfaceC7353EnQ, bfm, 100663296, 100663344, 0, 710266);
                BBI.A0R(bbi, false);
            }
            AuraDividerKt.AuraDivider(C3U4.A07(bs0A09, AuraDimensKt.SpacingLarge), null, false, bfm, 0, 6);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200c4);
            Object objAaT3 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT3 == obj) {
                objAaT3 = new C1518AkS();
                bfm.Ai0(objAaT3);
            }
            C1518AkS c1518AkS = (C1518AkS) objAaT3;
            C1C3 c1c3 = (C1C3) bfm.A6v(Am0.A0E);
            EditableMessageEditor editableMessageEditor2 = agentPermissionMessageEditorUiState.editor;
            Long lValueOf = editableMessageEditor2 != null ? Long.valueOf(editableMessageEditor2.messageRevision) : null;
            boolean zA652 = bfm.A65(c1c3);
            Object objAaT4 = bfm.AaT();
            if (zA652 || objAaT4 == obj) {
                objAaT4 = new AgentPermissionMessageEditorScreenKt$MessageEditorFields$1$4$1(c1518AkS, c1c3, null);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A18(bfm, objAaT4, lValueOf);
            String str2 = agentPermissionMessageEditorUiState.body;
            if ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) != 32 && ((iA05 & 64) == 0 || !bfm.A67(agentPermissionMessageEditorViewModel))) {
                z = false;
            }
            Object objAaT5 = bfm.AaT();
            if (z || objAaT5 == obj) {
                objAaT5 = new AgentPermissionMessageEditorScreenKt$MessageEditorFields$1$5$1(agentPermissionMessageEditorViewModel);
                bfm.Ai0(objAaT5);
            }
            InterfaceC7353EnQ interfaceC7353EnQ2 = (InterfaceC7353EnQ) objAaT5;
            C1822Arm c1822ArmA0C2 = C3cH.A0C(bfm, auraTheme);
            AuJ auJ = new AuJ(null, 3, 0, -1);
            BRg bRgA00 = BHJ.A00(bs0A09, c1518AkS);
            boolean zA653 = bfm.A65(strA012);
            Object objAaT6 = bfm.AaT();
            if (zA653 || objAaT6 == obj) {
                objAaT6 = new AgentPermissionMessageEditorScreenKt$MessageEditorFields$1$6$1(strA012);
                bfm.Ai0(objAaT6);
            }
            AuraTextInputKt.AuraTextInput(str2, null, AnonymousClass001.A0Y(bRgA00, objAaT6, false), null, auJ, null, null, c1822ArmA0C2, false, 0, 8, null, null, auraColorsTextInput, null, false, z2, false, false, null, (G0U) interfaceC7353EnQ2, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 6, 0, 973674);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(agentPermissionMessageEditorUiState, agentPermissionMessageEditorViewModel, bRg2, i, i2);
        }
    }

    public static final void MessageEditorPageState(AgentPermissionMessageEditorUiState agentPermissionMessageEditorUiState, AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, String str, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA07;
        BRg bRg2 = bRg;
        bfm.AgG(1915416343);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionMessageEditorUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(agentPermissionMessageEditorViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C0Hi c0Hi = (C0Hi) bfm.A6v(Am0.A05);
            C1C3 c1c3 = (C1C3) bfm.A6v(Am0.A0E);
            Unit unit = Unit.INSTANCE;
            boolean zA1N = AnonymousClass003.A1N(bfm, c0Hi, c1c3);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new AgentPermissionMessageEditorScreenKt$MessageEditorPageState$1$1(c0Hi, c1c3);
                bfm.Ai0(objAaT);
            }
            C78e.A05(bfm, unit, (G0U) objAaT);
            InterfaceC7353EnQ interfaceC7353EnQ = null;
            if (agentPermissionMessageEditorUiState.loading) {
                Object objA0p = AnonymousClass001.A0p(bfm, -766766439);
                if (objA0p == C78N.A00) {
                    objA0p = AgentPermissionMessageEditorScreenKt$MessageEditorPageState$2$1.INSTANCE;
                    bfm.Ai0(objA0p);
                }
                BRg bRgA0Y = AnonymousClass001.A0Y(bRg2, objA0p, false);
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02(C2VU.A04, AuraDimensKt.SpacingSmall), bfm, C2VU.A00, 48);
                bbiA07 = (BBI) bfm;
                int iA0D = AnonymousClass001.A0D(bbiA07);
                AKQ akqA04 = BBI.A04(bbiA07);
                BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbiA07.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbiA07, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0D);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbiA07, true);
            } else {
                bfm.AgE(-766292976);
                boolean z2 = agentPermissionMessageEditorUiState.unavailable;
                int i4 = R.string._name_removed__res_0x7f1200ca;
                if (z2) {
                    i4 = R.string._name_removed__res_0x7f1200d0;
                }
                String strA012 = AbstractC2271BQs.A01(bfm, i4);
                if (agentPermissionMessageEditorUiState.unavailable) {
                    bfm.AgE(-766024858);
                } else {
                    bfm.AgE(-766014534);
                    if ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) != 32 && ((iA05 & 64) == 0 || !bfm.A67(agentPermissionMessageEditorViewModel))) {
                        z = false;
                    }
                    Object objAaT2 = bfm.AaT();
                    if (z || objAaT2 == C78N.A00) {
                        objAaT2 = new AgentPermissionMessageEditorScreenKt$MessageEditorPageState$4$1(agentPermissionMessageEditorViewModel);
                        bfm.Ai0(objAaT2);
                    }
                    interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT2;
                }
                bbiA07 = C3cG.A07(bfm);
                HatchScreenErrorStateKt.HatchScreenErrorState(strA012, (Function0) interfaceC7353EnQ, bRg2, HatchSurface.CHAT, HatchSubsurface.AGENT_PERMISSION, HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET, str, bfm, AnonymousClass001.A05(iA05 << 12, ((iA05 >> 3) & 896) | 224256), 0);
            }
            BBI.A0R(bbiA07, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107465(agentPermissionMessageEditorUiState, agentPermissionMessageEditorViewModel, str, bRg2, i, i2);
        }
    }

    public static final void MessageEditorRecipientRow(int i, String str, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(881312956);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            String strA0t = AnonymousClass001.A0t(bfm, str, i);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, AnonymousClass001.A0R(bRg2), C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107471(i, str, bRg2, i2, i3);
        }
    }

    public static final void MessageEditorRecipients(EditableMessage editableMessage, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1260294384);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(editableMessage, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String str = editableMessage.from;
            if (str == null) {
                bfm.AgE(-696403397);
            } else {
                bfm.AgE(-696403396);
                MessageEditorRecipientRow(R.string._name_removed__res_0x7f1200c8, str, null, bfm, 0, 4);
            }
            BBI.A0R(bbi, false);
            MessageEditorRecipientRow(R.string._name_removed__res_0x7f1200cf, AbstractC0878AGe.A0L(", ", "", "", editableMessage.to, null), null, bfm, 0, 4);
            if (editableMessage.cc.isEmpty()) {
                bfm.AgE(-696093272);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-696196099);
                MessageEditorRecipientRow(R.string._name_removed__res_0x7f1200c6, AbstractC0878AGe.A0L(", ", "", "", editableMessage.cc, null), null, bfm, 0, 4);
                BBI.A0R(bbi, false);
            }
            if (editableMessage.bcc.isEmpty()) {
                bfm.AgE(-695921656);
            } else {
                bfm.AgE(-696054274);
                MessageEditorRecipientRow(R.string._name_removed__res_0x7f1200c3, AbstractC0878AGe.A0L(", ", "", "", editableMessage.bcc, null), null, bfm, 0, 4);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107482(editableMessage, bRg, i, i2);
        }
    }

    public static final /* synthetic */ AgentPermissionMessageEditorUiState access$AgentPermissionMessageEditorScreen$lambda$0(C1BO c1bo) {
        return (AgentPermissionMessageEditorUiState) c1bo.getValue();
    }
}
