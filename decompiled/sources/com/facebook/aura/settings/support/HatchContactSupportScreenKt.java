package com.facebook.aura.settings.support;

import X.AHD;
import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AuJ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C0ob;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1DM;
import X.C1YD;
import X.C1YL;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.settings.support.HatchContactSupportViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchContactSupportScreenKt {
    public static final int CONTACT_INFO_ROW_COUNT = 2;
    public static final int DESCRIPTION_MIN_LINES = 5;
    public static final float TopicRowMinHeight = 56.0f;

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$CardTextField$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $placeholder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(2);
            this.$placeholder = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AnonymousClass007.A10(bfm, C06G.A0T(bfm), this.$placeholder, C06G.A08(bfm));
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$CardTextField$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ AuJ $keyboardOptions;
        public final /* synthetic */ int $minLines;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onChange;
        public final /* synthetic */ String $placeholder;
        public final /* synthetic */ C1DM $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, String str2, boolean z, boolean z2, C1DM c1dm, G0U<? super String, Unit> g0u, BRg bRg, boolean z3, int i, AuJ auJ, int i2, int i3) {
            super(2);
            this.$value = str;
            this.$placeholder = str2;
            this.$enabled = z;
            this.$singleLine = z2;
            this.$shape = c1dm;
            this.$onChange = g0u;
            this.$modifier = bRg;
            this.$isError = z3;
            this.$minLines = i;
            this.$keyboardOptions = auJ;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchContactSupportScreenKt.CardTextField(this.$value, this.$placeholder, this.$enabled, this.$singleLine, this.$shape, this.$onChange, this.$modifier, this.$isError, this.$minLines, this.$keyboardOptions, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$ContactInfoCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $email;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $name;
        public final /* synthetic */ G0U<String, Unit> $onEmailChange;
        public final /* synthetic */ G0U<String, Unit> $onNameChange;
        public final /* synthetic */ boolean $showEmailError;
        public final /* synthetic */ C07C $this_ContactInfoCard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(C07C c07c, String str, String str2, boolean z, boolean z2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, int i) {
            super(2);
            this.$this_ContactInfoCard = c07c;
            this.$name = str;
            this.$email = str2;
            this.$showEmailError = z;
            this.$enabled = z2;
            this.$onNameChange = g0u;
            this.$onEmailChange = g0u2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchContactSupportScreenKt.ContactInfoCard(this.$this_ContactInfoCard, this.$name, this.$email, this.$showEmailError, this.$enabled, this.$onNameChange, this.$onEmailChange, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$DescribeIssueCard$3, reason: invalid class name and case insensitive filesystem */
    public final class C136383 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $description;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isAtLimit;
        public final /* synthetic */ G0U<String, Unit> $onDescriptionChange;
        public final /* synthetic */ C07C $this_DescribeIssueCard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136383(C07C c07c, String str, boolean z, boolean z2, G0U<? super String, Unit> g0u, int i) {
            super(2);
            this.$this_DescribeIssueCard = c07c;
            this.$description = str;
            this.$enabled = z;
            this.$isAtLimit = z2;
            this.$onDescriptionChange = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchContactSupportScreenKt.DescribeIssueCard(this.$this_DescribeIssueCard, this.$description, this.$enabled, this.$isAtLimit, this.$onDescriptionChange, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$HatchContactSupportScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $diagnosticsSubmitBlocked;
        public final /* synthetic */ MutableState<Boolean> $includeLogs$delegate;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onViewLogs;
        public final /* synthetic */ Function0<Unit> $submit;
        public final /* synthetic */ C1BO<HatchContactSupportViewModel.UiState> $uiState$delegate;
        public final /* synthetic */ HatchContactSupportViewModel $viewModel;

        /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$HatchContactSupportScreen$4$6, reason: invalid class name */
        public final class AnonymousClass6 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
            public final /* synthetic */ C1BO<HatchContactSupportViewModel.UiState> $uiState$delegate;
            public final /* synthetic */ HatchContactSupportViewModel $viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(HatchContactSupportViewModel hatchContactSupportViewModel, C1BO<HatchContactSupportViewModel.UiState> c1bo) {
                super(3);
                this.$viewModel = hatchContactSupportViewModel;
                this.$uiState$delegate = c1bo;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
                invoke(c07c, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(C07C c07c, BFM bfm, int i) {
                if (AnonymousClass002.A0B(c07c, i) == 0) {
                    i |= AnonymousClass004.A0d(bfm, c07c);
                }
                if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                    AHD<Uri> ahd = this.$uiState$delegate.getValue().attachments;
                    boolean canAddAttachment = this.$uiState$delegate.getValue().getCanAddAttachment();
                    boolean z = !this.$uiState$delegate.getValue().isSubmitting;
                    HatchContactSupportViewModel hatchContactSupportViewModel = this.$viewModel;
                    boolean zA67 = bfm.A67(hatchContactSupportViewModel);
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new HatchContactSupportScreenKt$HatchContactSupportScreen$4$6$1$1(hatchContactSupportViewModel);
                        bfm.Ai0(objAaT);
                    }
                    G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
                    HatchContactSupportViewModel hatchContactSupportViewModel2 = this.$viewModel;
                    boolean zA672 = bfm.A67(hatchContactSupportViewModel2);
                    Object objAaT2 = bfm.AaT();
                    if (zA672 || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchContactSupportScreenKt$HatchContactSupportScreen$4$6$2$1(hatchContactSupportViewModel2);
                        bfm.Ai0(objAaT2);
                    }
                    ContactSupportAttachmentsKt.AttachmentsCard(c07c, ahd, canAddAttachment, z, g0u, (G0U) ((InterfaceC7353EnQ) objAaT2), bfm, i & 14);
                    C01N.A06(bfm, BRg.A00);
                    return;
                }
                bfm.Afo();
            }
        }

        /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$HatchContactSupportScreen$4$8, reason: invalid class name */
        public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ MutableState<Boolean> $includeLogs$delegate;
            public final /* synthetic */ Function0<Unit> $onViewLogs;
            public final /* synthetic */ C1BO<HatchContactSupportViewModel.UiState> $uiState$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(MutableState<Boolean> mutableState, Function0<Unit> function0, C1BO<HatchContactSupportViewModel.UiState> c1bo) {
                super(2);
                this.$includeLogs$delegate = mutableState;
                this.$onViewLogs = function0;
                this.$uiState$delegate = c1bo;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    if (this.$uiState$delegate.getValue().showConfidentialDisclosure) {
                        bfm.AgE(47762905);
                        boolean zA0A = MutableState.A0A((MutableState) this.$includeLogs$delegate);
                        boolean zA65 = bfm.A65(this.$includeLogs$delegate);
                        MutableState<Boolean> mutableState = this.$includeLogs$delegate;
                        Object objAaT = bfm.AaT();
                        if (zA65 || objAaT == C78N.A00) {
                            objAaT = new HatchContactSupportScreenKt$HatchContactSupportScreen$4$8$1$1(mutableState);
                            bfm.Ai0(objAaT);
                        }
                        Function0<Unit> function0 = this.$onViewLogs;
                        BS0 bs0 = BRg.A00;
                        AuraBugReportDiagnosticLogsKt.AuraBugReportDiagnosticLogsSection(zA0A, (G0U) objAaT, function0, C10G.A02, bfm, 3072, 0);
                        C01N.A06(bfm, bs0);
                    } else {
                        bfm.AgE(48087723);
                    }
                    AnonymousClass001.A1D(bfm);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0, boolean z, HatchContactSupportViewModel hatchContactSupportViewModel, Function0<Unit> function02, C1BO<HatchContactSupportViewModel.UiState> c1bo, MutableState<Boolean> mutableState, Function0<Unit> function03) {
            super(4);
            this.$onBack = function0;
            this.$diagnosticsSubmitBlocked = z;
            this.$viewModel = hatchContactSupportViewModel;
            this.$submit = function02;
            this.$uiState$delegate = c1bo;
            this.$includeLogs$delegate = mutableState;
            this.$onViewLogs = function03;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1990invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1990invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            boolean z = false;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (this.$uiState$delegate.getValue().isSubmitted) {
                bfm.AgE(1753371837);
                boolean zA65 = bfm.A65(this.$onBack);
                Function0<Unit> function0 = this.$onBack;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchContactSupportScreenKt$HatchContactSupportScreen$4$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                HatchContactSupportScreenKt.m1987ContactSupportSubmitteddjqsMU((Function0) objAaT, f, f2, null, bfm, (iA04 << 3) & 1008, 8);
            } else {
                bfm.AgE(1753765289);
                HatchContactSupportViewModel.UiState value = this.$uiState$delegate.getValue();
                if (this.$uiState$delegate.getValue().getCanSubmit() && !this.$diagnosticsSubmitBlocked) {
                    z = true;
                }
                HatchContactSupportViewModel hatchContactSupportViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(hatchContactSupportViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchContactSupportScreenKt$HatchContactSupportScreen$4$2$1(hatchContactSupportViewModel);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT2);
                HatchContactSupportViewModel hatchContactSupportViewModel2 = this.$viewModel;
                boolean zA672 = bfm.A67(hatchContactSupportViewModel2);
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchContactSupportScreenKt$HatchContactSupportScreen$4$3$1(hatchContactSupportViewModel2);
                    bfm.Ai0(objAaT3);
                }
                G0U g0u2 = (G0U) ((InterfaceC7353EnQ) objAaT3);
                boolean zA673 = bfm.A67(this.$viewModel);
                HatchContactSupportViewModel hatchContactSupportViewModel3 = this.$viewModel;
                Object objAaT4 = bfm.AaT();
                if (zA673 || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchContactSupportScreenKt$HatchContactSupportScreen$4$4$1(hatchContactSupportViewModel3);
                    bfm.Ai0(objAaT4);
                }
                G0U g0u3 = (G0U) objAaT4;
                HatchContactSupportViewModel hatchContactSupportViewModel4 = this.$viewModel;
                boolean zA674 = bfm.A67(hatchContactSupportViewModel4);
                Object objAaT5 = bfm.AaT();
                if (zA674 || objAaT5 == C78N.A00) {
                    objAaT5 = new HatchContactSupportScreenKt$HatchContactSupportScreen$4$5$1(hatchContactSupportViewModel4);
                    bfm.Ai0(objAaT5);
                }
                G0U g0u4 = (G0U) ((InterfaceC7353EnQ) objAaT5);
                B1U b1uA00 = B1V.A00(bfm, new AnonymousClass6(this.$viewModel, this.$uiState$delegate), 24377221);
                boolean zA652 = bfm.A65(this.$submit);
                Function0<Unit> function02 = this.$submit;
                Object objAaT6 = bfm.AaT();
                if (zA652 || objAaT6 == C78N.A00) {
                    objAaT6 = new HatchContactSupportScreenKt$HatchContactSupportScreen$4$7$1(function02);
                    bfm.Ai0(objAaT6);
                }
                HatchContactSupportScreenKt.m1986ContactSupportFormw41Enmo(value, z, g0u, g0u2, g0u3, g0u4, b1uA00, (Function0) objAaT6, B1V.A00(bfm, new AnonymousClass8(this.$includeLogs$delegate, this.$onViewLogs, this.$uiState$delegate), 1705243895), f, f2, null, bfm, AnonymousClass001.A06(iA04 << 27, 102236160 | HatchContactSupportViewModel.UiState.$stable), (iA04 >> 3) & 14, 2048);
            }
            AnonymousClass002.A19(bfm);
        }
    }

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$HatchContactSupportScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HeaderButton> $headerButtons;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $navigationContentDescription;
        public final /* synthetic */ int $navigationIcon;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
        public final /* synthetic */ Function0<Unit> $onViewLogs;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ HatchContactSupportViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function0<Unit> function0, HatchContactSupportViewModel hatchContactSupportViewModel, BRg bRg, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function02, int i, String str, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, int i2, int i3) {
            super(2);
            this.$onBack = function0;
            this.$viewModel = hatchContactSupportViewModel;
            this.$modifier = bRg;
            this.$userSession = abstractC3358CGz;
            this.$onViewLogs = function02;
            this.$navigationIcon = i;
            this.$navigationContentDescription = str;
            this.$headerButtons = ahd;
            this.$onHeaderButtonClick = g0u;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchContactSupportScreenKt.HatchContactSupportScreen(this.$onBack, this.$viewModel, this.$modifier, this.$userSession, this.$onViewLogs, this.$navigationIcon, this.$navigationContentDescription, this.$headerButtons, this.$onHeaderButtonClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$TopicCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C136392 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0U<String, Unit> $onTopicSelected;
        public final /* synthetic */ String $selectedTopic;
        public final /* synthetic */ C07C $this_TopicCard;
        public final /* synthetic */ AHD<HatchSupportTopicOption> $topics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136392(C07C c07c, AHD<HatchSupportTopicOption> ahd, String str, boolean z, G0U<? super String, Unit> g0u, int i) {
            super(2);
            this.$this_TopicCard = c07c;
            this.$topics = ahd;
            this.$selectedTopic = str;
            this.$enabled = z;
            this.$onTopicSelected = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchContactSupportScreenKt.TopicCard(this.$this_TopicCard, this.$topics, this.$selectedTopic, this.$enabled, this.$onTopicSelected, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$TopicRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C136402 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $selected;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136402(String str, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$selected = z;
            this.$enabled = z2;
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
            HatchContactSupportScreenKt.TopicRow(this.$title, this.$selected, this.$enabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void logContactSupportClick(HatchScreen hatchScreen, HatchComponent hatchComponent, String str) {
        AnonymousClass003.A0u(hatchScreen, hatchComponent);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.HELP_SUPPORT, hatchScreen, hatchComponent, str, null, null);
    }

    public static final void CardTextField(String str, String str2, boolean z, boolean z2, C1DM c1dm, G0U<? super String, Unit> g0u, BRg bRg, boolean z3, int i, AuJ auJ, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        boolean z4 = z3;
        int i4 = i;
        AuJ auJ2 = auJ;
        bfm.AgG(-621698955);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, c1dm);
        }
        if ((196608 & i2) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u);
        }
        int i5 = i3 & 64;
        int iA0j = 1572864;
        if (i5 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i2) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        int i6 = i3 & 128;
        int iA0u = 12582912;
        if (i6 != 0) {
            iA0d |= iA0u;
        } else if ((12582912 & i2) == 0) {
            iA0u = AnonymousClass004.A0u(bfm, z4);
            iA0d |= iA0u;
        }
        int i7 = i3 & 256;
        int iA0K = 100663296;
        if (i7 != 0) {
            iA0d |= iA0K;
        } else if ((100663296 & i2) == 0) {
            iA0K = AnonymousClass004.A0K(bfm, i4);
            iA0d |= iA0K;
        }
        int i8 = i3 & 512;
        int iA0m = 805306368;
        if (i8 != 0) {
            iA0d |= iA0m;
        } else if ((805306368 & i2) == 0) {
            i8 = 0;
            iA0m = AnonymousClass004.A0m(bfm, auJ2);
            iA0d |= iA0m;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1I(iA0d), bfm, iA0d)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            if (i6 != 0) {
                z4 = false;
            }
            if (i7 != 0) {
                i4 = 1;
            }
            if (i8 != 0) {
                auJ2 = AuJ.A04;
            }
            int i9 = iA0d >> 15;
            int i10 = iA0d << 15;
            int i11 = i4;
            AuJ auJ3 = auJ2;
            AuraTextInputKt.AuraTextInput(str, null, AnonymousClass001.A0R(bRg2), B1V.A00(bfm, new AnonymousClass1(str2), -670940279), auJ3, null, null, C06G.A0T(bfm), z2, 0, i11, null, null, C06G.A0b(bfm), null, z, false, z4, false, c1dm, g0u, bfm, AnonymousClass001.A0A(i9, (iA0d & 14) | 3072) | (234881024 & i10), AnonymousClass001.A0C(iA0d, AnonymousClass001.A08(iA0d << 9, (iA0d >> 24) & 14)) | (1879048192 & i10), i9 & 14, 350818);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, z, z2, c1dm, g0u, bRg2, z4, i4, auJ2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* renamed from: ContactSupportForm-w41Enmo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1986ContactSupportFormw41Enmo(com.facebook.aura.settings.support.HatchContactSupportViewModel.UiState r62, boolean r63, X.G0U<? super java.lang.String, kotlin.Unit> r64, X.G0U<? super java.lang.String, kotlin.Unit> r65, X.G0U<? super java.lang.String, kotlin.Unit> r66, X.G0U<? super java.lang.String, kotlin.Unit> r67, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r68, kotlin.jvm.functions.Function0<kotlin.Unit> r69, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r70, float r71, float r72, X.BRg r73, X.BFM r74, int r75, int r76, int r77) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.support.HatchContactSupportScreenKt.m1986ContactSupportFormw41Enmo(com.facebook.aura.settings.support.HatchContactSupportViewModel$UiState, boolean, X.G0U, X.G0U, X.G0U, X.G0U, X.G0W, kotlin.jvm.functions.Function0, X.G0V, float, float, X.BRg, X.BFM, int, int, int):void");
    }

    /* renamed from: ContactSupportSubmitted-djqs-MU, reason: not valid java name */
    public static final void m1987ContactSupportSubmitteddjqsMU(Function0<Unit> function0, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-85856054);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A06(bfm, f2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0M = C06G.A0M(bfm, AnonymousClass001.A0T(bRg2));
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchContactSupportScreenKt$ContactSupportSubmitted$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0M, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, f);
            C01N.A07(bfm, c90l.AiP(bs0, 1.0f, true));
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.circle_check_wght400_filled_24, 0), AuraIconSize.LARGE, null, AnonymousClass002.A0c(bfm).success, null, bfm, AnonymousClass001.A04(), 33);
            C01N.A06(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120843), null, 0L, AnonymousClass002.A0f(bfm).title3Medium, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16310);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXsmall);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120842), null, C06G.A08(bfm), C06G.A0T(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            C01N.A07(bfm, c90l.AiP(bs0, 1.0f, true));
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12083c), null, C10G.A02, null, null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, (iA0T << 12) & 57344, 0, 134201333);
            C01N.A04(bfm, bbi, bs0, f2, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchContactSupportScreenKt$ContactSupportSubmitted$3(function0, f, f2, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchContactSupportScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r50, com.facebook.aura.settings.support.HatchContactSupportViewModel r51, X.BRg r52, X.AbstractC3358CGz r53, kotlin.jvm.functions.Function0<kotlin.Unit> r54, int r55, java.lang.String r56, X.AHD<? extends com.facebook.aura.header.view.HeaderButton> r57, X.G0U<? super com.facebook.aura.header.view.HeaderButton, kotlin.Unit> r58, X.BFM r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.support.HatchContactSupportScreenKt.HatchContactSupportScreen(kotlin.jvm.functions.Function0, com.facebook.aura.settings.support.HatchContactSupportViewModel, X.BRg, X.CGz, kotlin.jvm.functions.Function0, int, java.lang.String, X.AHD, X.G0U, X.BFM, int, int):void");
    }

    public static final void TopicRow(String str, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(900353076);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0V(C0ob.A00(AnonymousClass001.A0R(bRg2), new C1YD(3), function0, z, z2), TopicRowMinHeight), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(str, C90m.A00.AiP(BRg.A00, 1.0f, true), 0L, C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16372);
            if (z) {
                bfm.AgE(2071942440);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.aura_check, 0), AuraIconSize.SMALL, null, C06G.A0C(bfm), null, bfm, AnonymousClass001.A04(), 33);
            } else {
                bfm.AgE(2072142514);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136402(str, z, z2, function0, bRg2, i, i2);
        }
    }

    public static final void ContactInfoCard(C07C c07c, String str, String str2, boolean z, boolean z2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, BFM bfm, int i) {
        bfm.AgG(-687937621);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g0u2);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0d), bfm, iA0d)) {
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchContactSupportScreenKt.f265lambda$1383447170;
            boolean zA1C = AnonymousClass003.A1C(iA0d) | AnonymousClass003.A1F(57344, iA0d, 16384) | AnonymousClass003.A1F(458752, iA0d, 131072) | AnonymousClass004.A1K(iA0d) | AnonymousClass005.A1B(iA0d) | AnonymousClass004.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchContactSupportScreenKt$ContactInfoCard$1$1(str, z2, g0u, str2, g0u2, z);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, g0v, 0L, (G0U) objAaT, bfm, (iA0d & 14) | 384, 5);
            if (z) {
                bfm.AgE(1235625987);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12083d);
                BRg bRgA0B = C3U4.A0B(BRg.A00, AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmall);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = HatchContactSupportScreenKt$ContactInfoCard$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, ARD.A01(bRgA0B, (G0U) objAaT2, false), AnonymousClass002.A0c(bfm).error, C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else {
                bfm.AgE(1235983479);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(c07c, str, str2, z, z2, g0u, g0u2, i);
        }
    }

    public static final void DescribeIssueCard(C07C c07c, String str, boolean z, boolean z2, G0U<? super String, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(-1311068237);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchContactSupportScreenKt.f264lambda$1072183744;
            boolean zA1C = AnonymousClass003.A1C(iA0d) | AnonymousClass003.A1D(iA0d) | AnonymousClass003.A1F(57344, iA0d, 16384);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchContactSupportScreenKt$DescribeIssueCard$1$1(str, z, g0u);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, g0v, 0L, (G0U) objAaT, bfm, (iA0d & 14) | 384, 5);
            if (z2) {
                bfm.AgE(399504610);
                String strA0t = AnonymousClass001.A0t(bfm, Integer.valueOf(HatchContactSupportViewModelKt.MAX_DESCRIPTION_LENGTH), R.string._name_removed__res_0x7f12083b);
                BRg bRgA0B = C3U4.A0B(C10G.A02, AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmall);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = HatchContactSupportScreenKt$DescribeIssueCard$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA0t, AnonymousClass001.A0Y(bRgA0B, objAaT2, false), AnonymousClass002.A0c(bfm).error, C06G.A0Y(bfm), null, null, new C1YL(6), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            } else {
                bfm.AgE(400009135);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136383(c07c, str, z, z2, g0u, i);
        }
    }

    public static final void TopicCard(C07C c07c, AHD<HatchSupportTopicOption> ahd, String str, boolean z, G0U<? super String, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(650232610);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(ahd, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchContactSupportScreenKt.lambda$914168047;
            boolean zA1D = ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(ahd))) | AnonymousClass003.A1D(iA0d) | AnonymousClass003.A1E(iA0d) | ((57344 & iA0d) == 16384);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new HatchContactSupportScreenKt$TopicCard$1$1(ahd, str, z, g0u);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, g0v, 0L, (G0U) objAaT, bfm, (iA0d & 14) | 384, 5);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136392(c07c, ahd, str, z, g0u, i);
        }
    }

    public static final /* synthetic */ HatchContactSupportViewModel.UiState access$HatchContactSupportScreen$lambda$1(C1BO c1bo) {
        return (HatchContactSupportViewModel.UiState) c1bo.getValue();
    }
}
