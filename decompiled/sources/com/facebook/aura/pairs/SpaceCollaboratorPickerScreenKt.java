package com.facebook.aura.pairs;

import X.AKQ;
import X.ARD;
import X.AVy;
import X.AYD;
import X.AbstractC04540eo;
import X.AbstractC07539Wl;
import X.AbstractC1754Apr;
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
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C07C;
import X.C0v5;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DP;
import X.C1SA;
import X.C1YY;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C90m;
import X.C9m9;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SpaceCollaboratorPickerScreenKt {

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpaceCollaboratorPickerScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<SpacePickerUiState> $state$delegate;
        public final /* synthetic */ SpaceCollaboratorPickerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel, C1BO<SpacePickerUiState> c1bo) {
            super(2);
            this.$viewModel = spaceCollaboratorPickerViewModel;
            this.$state$delegate = c1bo;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fc3);
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            boolean z = !this.$state$delegate.getValue().selected.isEmpty();
            boolean z2 = this.$state$delegate.getValue().inviting;
            SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(spaceCollaboratorPickerViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SpaceCollaboratorPickerScreenKt$SpaceCollaboratorPickerScreen$1$1$1(spaceCollaboratorPickerViewModel);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, AbstractC07539Wl.A00(BRg.A00, "hatch-space-collaborator-picker-invite"), auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z, z2, false, null, null, (Function0) ((InterfaceC7353EnQ) objAaT), null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134199749);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpaceCollaboratorPickerScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<SpacePickerUiState> $state$delegate;
        public final /* synthetic */ SpaceCollaboratorPickerViewModel $viewModel;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            BRg bRgAiP = c07c.AiP(BRg.A00, 1.0f, true);
            int iOrdinal = this.$state$delegate.getValue().phase.ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(-39305975);
                PairsComponentsKt.PairsLoading(bRgAiP, bfm, 0, 0);
            } else if (iOrdinal == 1) {
                bfm.AgE(-39303493);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fc0);
                SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(spaceCollaboratorPickerViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new SpaceCollaboratorPickerScreenKt$SpaceCollaboratorPickerScreen$2$1$1(spaceCollaboratorPickerViewModel);
                    bfm.Ai0(objAaT);
                }
                PairsComponentsKt.PairsMessage(strA01, bRgAiP, (Function0) ((InterfaceC7353EnQ) objAaT), bfm, 0, 0);
            } else {
                if (iOrdinal != 2) {
                    throw AnonymousClass005.A0k(bfm, -39307372);
                }
                bfm.AgE(-39296962);
                SpaceCollaboratorPickerScreenKt.SpacePickerList(this.$state$delegate.getValue(), this.$viewModel, bRgAiP, bfm, SpacePickerUiState.$stable | (SpaceCollaboratorPickerViewModel.$stable << 3), 0);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpaceCollaboratorPickerScreen$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SpacePickerPhase.values().length];
                try {
                    AnonymousClass002.A13(SpacePickerPhase.LOADING, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(SpacePickerPhase.FAILED, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(SpacePickerPhase.READY, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel, C1BO<SpacePickerUiState> c1bo) {
            super(3);
            this.$viewModel = spaceCollaboratorPickerViewModel;
            this.$state$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpaceCollaboratorPickerScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$slug = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorPickerScreenKt.SpaceCollaboratorPickerScreen(this.$slug, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerChip$2, reason: invalid class name and case insensitive filesystem */
    public final class C130092 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ SpacePickerPerson $person;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130092(SpacePickerPerson spacePickerPerson, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$person = spacePickerPerson;
            this.$onRemove = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorPickerScreenKt.SpacePickerChip(this.$person, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerChips$2, reason: invalid class name and case insensitive filesystem */
    public final class C130102 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<SpacePickerPerson, Unit> $onRemove;
        public final /* synthetic */ SpacePickerUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130102(SpacePickerUiState spacePickerUiState, G0U<? super SpacePickerPerson, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$state = spacePickerUiState;
            this.$onRemove = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorPickerScreenKt.SpacePickerChips(this.$state, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerEffects$2, reason: invalid class name and case insensitive filesystem */
    public final class C130112 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SpaceCollaboratorPickerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130112(SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel, int i) {
            super(2);
            this.$viewModel = spaceCollaboratorPickerViewModel;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorPickerScreenKt.SpacePickerEffects(this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerLinkRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C130122 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $minting;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130122(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$minting = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorPickerScreenKt.SpacePickerLinkRow(this.$minting, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$2, reason: invalid class name and case insensitive filesystem */
    public final class C130132 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ SpacePickerUiState $state;
        public final /* synthetic */ SpaceCollaboratorPickerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130132(SpacePickerUiState spacePickerUiState, SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$state = spacePickerUiState;
            this.$viewModel = spaceCollaboratorPickerViewModel;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorPickerScreenKt.SpacePickerList(this.$state, this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerNote$2, reason: invalid class name and case insensitive filesystem */
    public final class C130142 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130142(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorPickerScreenKt.SpacePickerNote(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C130152 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<SpacePickerPerson, Unit> $onToggle;
        public final /* synthetic */ SpacePickerPerson $person;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130152(SpacePickerPerson spacePickerPerson, boolean z, G0U<? super SpacePickerPerson, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$person = spacePickerPerson;
            this.$selected = z;
            this.$onToggle = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorPickerScreenKt.SpacePickerRow(this.$person, this.$selected, this.$onToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerSuggestionsFailed$2, reason: invalid class name and case insensitive filesystem */
    public final class C130162 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130162(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorPickerScreenKt.SpacePickerSuggestionsFailed(this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SpaceCollaboratorPickerScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(115028055);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String strA0d = FGI.A0d("space-collaborator-picker:", ((CH0) abstractC3358CGzA0h).A01, ":", str);
            SpaceCollaboratorPickerViewModel.Factory factory = new SpaceCollaboratorPickerViewModel.Factory(abstractC3358CGzA0h, str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel = (SpaceCollaboratorPickerViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), SpaceCollaboratorPickerViewModel.class, strA0d);
            C1BO c1boA02 = C2CK.A02(bfm, spaceCollaboratorPickerViewModel.state);
            SpacePickerEffects(spaceCollaboratorPickerViewModel, bfm, SpaceCollaboratorPickerViewModel.$stable);
            PairsComponentsKt.PairsSheet(AbstractC07539Wl.A00(bRg2, "hatch-space-collaborator-picker"), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fcb), false, null, null, false, B1V.A00(bfm, new AnonymousClass1(spaceCollaboratorPickerViewModel, c1boA02), -2067366434), null, B1V.A00(bfm, new AnonymousClass2(spaceCollaboratorPickerViewModel, c1boA02), 348562060), bfm, 102236160, 188);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, bRg2, i, i2);
        }
    }

    public static final void SpacePickerChip(SpacePickerPerson spacePickerPerson, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2085437397);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(spacePickerPerson, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA08 = C10G.A08(bRg2, 80.0f);
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, C2VU.A00, 6.0f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA08);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0T);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C0z7 c0z7 = C0z7.A00;
            m1681SpacePickerPhotoDzVHIIc(spacePickerPerson, 56.0f, false, null, bfm, (iA05 & 14) | SpacePickerPerson.$stable | 432, 8);
            BRg bRgA02 = C11U.A02(AYD.A01(c0z7.A4C(C2VU.A0D, bs0), 4.0f, -2.0f), 22.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA04 = C0v5.A04(C1b8.A01(bRgA02, C3cH.A06(bfm, auraTheme)), C3cG.A0A(0), null, function0, true);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA04);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.x_wght400_outline_24, 0), 14.0f, AnonymousClass001.A0t(bfm, spacePickerPerson.name, R.string._name_removed__res_0x7f120fc8), auraTheme.getColors(bfm, 6).card, null, bfm, AnonymousClass001.A03(), 33);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
            AuraTextKt.m2639AuraTextUY9GdpU(spacePickerPerson.name, null, C3cH.A06(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14770);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130092(spacePickerPerson, function0, bRg2, i, i2);
        }
    }

    public static final void SpacePickerChips(SpacePickerUiState spacePickerUiState, G0U<? super SpacePickerPerson, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2064006707);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(spacePickerUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA01 = C1b8.A01(C11U.A01(C3U4.A0C(C3U4.A0B(AnonymousClass001.A0R(bRg2), 20.0f, 0.0f), 0.0f, 0.0f, 0.0f, 12.0f), 20.0f), C3cH.A0W(bfm).card);
            C1DP c1dp = new C1DP(12.0f, 12.0f, 12.0f, 12.0f);
            C9m9 c9m9A00 = AcQ.A00(12.0f);
            boolean z = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(spacePickerUiState))) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new SpaceCollaboratorPickerScreenKt$SpacePickerChips$1$1(spacePickerUiState, g0u);
                bfm.Ai0(objAaT);
            }
            C1YY.A00(null, null, c9m9A00, c1dp, null, bfm, null, bRgA01, (G0U) objAaT, 24960, 490, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130102(spacePickerUiState, g0u, bRg2, i, i2);
        }
    }

    public static final void SpacePickerLinkRow(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1530755004);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA00 = AbstractC07539Wl.A00(C3U4.A0B(C0v5.A05(AnonymousClass001.A0R(bRg2), null, function0, !z), 16.0f, 12.0f), "hatch-space-collaborator-picker-link");
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0V);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, 44.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA03 = C1b8.A03(bRgA07, C1D8.A00, auraTheme.getColors(bfm, 6).card);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA03);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (z) {
                bfm.AgE(-1178041953);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
                BRg bRgA072 = C10G.A07(bs0, 16.0f);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new SpaceCollaboratorPickerScreenKt$SpacePickerLinkRow$1$1$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(AnonymousClass001.A0Y(bRgA072, objAaT, false), null, 0L, bfm, 0, 6);
            } else {
                bfm.AgE(-1177767727);
                AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.link_outline_24_wght400, 0), 20.0f, null, C3cH.A06(bfm, auraTheme), null, bfm, AnonymousClass001.A03(), 41);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fc6), null, C3cH.A06(bfm, auraTheme), C60Q.A0D(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fc5), null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130122(z, function0, bRg2, i, i2);
        }
    }

    public static final void SpacePickerList(SpacePickerUiState spacePickerUiState, SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1655603679);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(spacePickerUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(spaceCollaboratorPickerViewModel, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA00 = AbstractC1754Apr.A00(AnonymousClass001.A0T(bRg2));
            C1DP c1dp = new C1DP(0.0f, 0.0f, 0.0f, 16.0f);
            boolean z2 = (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(spacePickerUiState));
            if ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(spaceCollaboratorPickerViewModel))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objAaT = bfm.AaT();
            if (z3 || objAaT == C78N.A00) {
                objAaT = new SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1(spacePickerUiState, spaceCollaboratorPickerViewModel);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, null, c1dp, null, bfm, null, bRgA00, (G0U) objAaT, 384, 506, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130132(spacePickerUiState, spaceCollaboratorPickerViewModel, bRg2, i, i2);
        }
    }

    public static final void SpacePickerNote(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1101505929);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRg2), 20.0f, 8.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SpaceCollaboratorPickerScreenKt$SpacePickerNote$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRgA0B, (G0U) objAaT, false), jA06, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130142(str, bRg2, i, i2);
        }
    }

    /* renamed from: SpacePickerPhoto-DzVHIIc, reason: not valid java name */
    public static final void m1681SpacePickerPhotoDzVHIIc(SpacePickerPerson spacePickerPerson, float f, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(728265885);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(spacePickerPerson, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A05(bfm, f);
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
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            PairsSuggestion pairsSuggestion = spacePickerPerson.suggestion;
            if (pairsSuggestion == null) {
                bfm.AgE(-216140828);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA02 = C3cG.A02(bbi.A06);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRg2);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0c);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                C0z7 c0z7 = C0z7.A00;
                PairsContact pairsContact = spacePickerPerson.contact;
                PairsComponentsKt.m1664PairsPersonPhotovlEVYhg(pairsContact != null ? pairsContact.photo : null, f, null, 0L, bfm, PairsImageRef.$stable | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 12);
                if (z) {
                    BS0 bs0A09 = C3cG.A09(bfm, -1618523983);
                    BRg bRgA07 = C10G.A07(c0z7.A4C(C2VU.A07, bs0A09), 20.0f);
                    C1D3 c1d3 = C1D8.A00;
                    BRg bRgA03 = C1b8.A03(AbstractC04540eo.A00(bRgA07, c1d3, 1.0f, 28, 0L, 0L), c1d3, C3cH.A0W(bfm).background);
                    InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA012 = AxM.A01(bfm, bRgA03);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
                    BPg.A02(bfm, akqA042, g0v);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA012, g0vA0u);
                    C1SA.A00(bfm, null, C10G.A07(bs0A09, 12.0f), null, BOf.A00(bfm, R.drawable.hatch_logo, 0), null, null, 0.0f, AVy.$stable | 432, 120);
                    BBI.A0R(bbi, true);
                } else {
                    bfm.AgE(-1618019458);
                }
                AnonymousClass003.A0q(bbi);
            } else if (z) {
                bfm.AgE(-216146834);
                ConnectionsComponentsKt.m1652PairsSuggestionAvatar6a0pyJM(pairsSuggestion, bRg2, f, bfm, PairsSuggestion.$stable | ((iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 << 3) & 896), 0);
            } else {
                bfm.AgE(-216144379);
                PairsComponentsKt.m1661PairsAvataruFdPcIQ(pairsSuggestion.photoUrl, f, bRg2, bfm, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 >> 3) & 896), 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SpaceCollaboratorPickerScreenKt$SpacePickerPhoto$2(spacePickerPerson, f, z, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SpacePickerRow(com.facebook.aura.pairs.SpacePickerPerson r37, boolean r38, X.G0U<? super com.facebook.aura.pairs.SpacePickerPerson, kotlin.Unit> r39, X.BRg r40, X.BFM r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt.SpacePickerRow(com.facebook.aura.pairs.SpacePickerPerson, boolean, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void SpacePickerSuggestionsFailed(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(147408748);
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
            BRg bRgA0C = C3U4.A0C(AnonymousClass007.A0I(bRg2), 16.0f, 0.0f, 8.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fd1);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0O(c90m, BRg.A00, true), C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d9d), null, null, AnonymousClass006.A0g(bfm), AuraButtonSize.SMALL, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0T << 12) & 57344, 0, 134201293);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130162(function0, bRg2, i, i2);
        }
    }

    public static final void SpacePickerEffects(SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel, BFM bfm, int i) {
        bfm.AgG(1924281219);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(spaceCollaboratorPickerViewModel, bfm, i) ? 1 : 0) | i : i;
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(spaceCollaboratorPickerViewModel))) {
                z = true;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, bfm.A67(contextA0H), z);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new SpaceCollaboratorPickerScreenKt$SpacePickerEffects$1$1(spaceCollaboratorPickerViewModel, contextA0H, auraNavigatorA0b, null);
                bfm.Ai0(objAaT);
            }
            C78e.A02(bfm, spaceCollaboratorPickerViewModel, contextA0H, auraNavigatorA0b, (G0V) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130112(spaceCollaboratorPickerViewModel, i);
        }
    }

    public static final /* synthetic */ SpacePickerUiState access$SpaceCollaboratorPickerScreen$lambda$0(C1BO c1bo) {
        return (SpacePickerUiState) c1bo.getValue();
    }
}
