package com.facebook.aura.conversation.view;

import X.AFz;
import X.AKQ;
import X.AbstractC1103AYp;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOD;
import X.BPg;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06H;
import X.C06I;
import X.C07C;
import X.C0861A6i;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1YL;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3UX;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchModelLockSupportSheetKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchModelLockSupportSheetKt$HatchModelLockSupportSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<String> $additionalInfo$delegate;
        public final /* synthetic */ C1BO<HatchModelLockSupportViewModel.Phase> $phase$delegate;
        public final /* synthetic */ HatchModelLockSupportViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchModelLockSupportViewModel hatchModelLockSupportViewModel, MutableState<String> mutableState, C1BO<? extends HatchModelLockSupportViewModel.Phase> c1bo) {
            super(2);
            this.$viewModel = hatchModelLockSupportViewModel;
            this.$additionalInfo$delegate = mutableState;
            this.$phase$delegate = c1bo;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchModelLockSupportViewModel.Phase value = this.$phase$delegate.getValue();
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$additionalInfo$delegate, bfm.A67(this.$viewModel));
                HatchModelLockSupportViewModel hatchModelLockSupportViewModel = this.$viewModel;
                MutableState<String> mutableState = this.$additionalInfo$delegate;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchModelLockSupportSheetKt$HatchModelLockSupportSheet$3$1$1(hatchModelLockSupportViewModel, mutableState);
                    bfm.Ai0(objAaT);
                }
                HatchModelLockSupportSheetKt.ModelLockSupportFooter(value, (Function0) objAaT, null, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchModelLockSupportSheetKt$HatchModelLockSupportSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<String> $additionalInfo$delegate;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ boolean $isSubmitted;
        public final /* synthetic */ C1BO<HatchModelLockSupportViewModel.Phase> $phase$delegate;
        public final /* synthetic */ C3UX $scope;
        public final /* synthetic */ HatchModelLockSupportViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(boolean z, MutableState<String> mutableState, HatchModelLockSupportViewModel hatchModelLockSupportViewModel, C3UX c3ux, Context context, C1BO<? extends HatchModelLockSupportViewModel.Phase> c1bo) {
            super(3);
            this.$isSubmitted = z;
            this.$additionalInfo$delegate = mutableState;
            this.$viewModel = hatchModelLockSupportViewModel;
            this.$scope = c3ux;
            this.$context = context;
            this.$phase$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, c07c);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                if (this.$isSubmitted) {
                    bfm.AgE(1242637693);
                    HatchModelLockSupportSheetKt.ModelLockSupportSubmitted(c07c.AiP(BRg.A00, 1.0f, true), bfm, 0, 0);
                } else {
                    bfm.AgE(1242733359);
                    boolean z = this.$phase$delegate.getValue() instanceof HatchModelLockSupportViewModel.Phase.Ready;
                    String strA05 = MutableState.A05(this.$additionalInfo$delegate);
                    boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A65(this.$additionalInfo$delegate));
                    HatchModelLockSupportViewModel hatchModelLockSupportViewModel = this.$viewModel;
                    MutableState<String> mutableState = this.$additionalInfo$delegate;
                    Object objAaT = bfm.AaT();
                    if (zA1T || objAaT == C78N.A00) {
                        objAaT = new HatchModelLockSupportSheetKt$HatchModelLockSupportSheet$4$1$1(hatchModelLockSupportViewModel, mutableState);
                        bfm.Ai0(objAaT);
                    }
                    G0U g0u = (G0U) objAaT;
                    boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$context, AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$scope)));
                    C3UX c3ux = this.$scope;
                    HatchModelLockSupportViewModel hatchModelLockSupportViewModel2 = this.$viewModel;
                    Context context = this.$context;
                    Object objAaT2 = bfm.AaT();
                    if (zA1T2 || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchModelLockSupportSheetKt$HatchModelLockSupportSheet$4$2$1(c3ux, hatchModelLockSupportViewModel2, context);
                        bfm.Ai0(objAaT2);
                    }
                    HatchModelLockSupportSheetKt.ModelLockSupportForm(z, strA05, g0u, (Function0) objAaT2, null, bfm, 0, 16);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchModelLockSupportSheetKt$HatchModelLockSupportSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(BRg bRg, int i, int i2) {
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
            HatchModelLockSupportSheetKt.HatchModelLockSupportSheet(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchModelLockSupportSheetKt$ModelLockSupportFooter$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onPrimaryAction;
        public final /* synthetic */ HatchModelLockSupportViewModel.Phase $phase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchModelLockSupportViewModel.Phase phase, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$phase = phase;
            this.$onPrimaryAction = function0;
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
            HatchModelLockSupportSheetKt.ModelLockSupportFooter(this.$phase, this.$onPrimaryAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchModelLockSupportSheetKt$ModelLockSupportForm$2, reason: invalid class name and case insensitive filesystem */
    public final class C114992 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $additionalInfo;
        public final /* synthetic */ boolean $isReady;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onAdditionalInfoChange;
        public final /* synthetic */ Function0<Unit> $onViewSharedData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114992(boolean z, String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isReady = z;
            this.$additionalInfo = str;
            this.$onAdditionalInfoChange = g0u;
            this.$onViewSharedData = function0;
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
            HatchModelLockSupportSheetKt.ModelLockSupportForm(this.$isReady, this.$additionalInfo, this.$onAdditionalInfoChange, this.$onViewSharedData, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchModelLockSupportSheetKt$ModelLockSupportSubmitted$3, reason: invalid class name and case insensitive filesystem */
    public final class C115003 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115003(BRg bRg, int i, int i2) {
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
            HatchModelLockSupportSheetKt.ModelLockSupportSubmitted(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchModelLockSupportSheet(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(735605377);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchModelLockSupportViewModel.Factory factory = new HatchModelLockSupportViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchModelLockSupportViewModel hatchModelLockSupportViewModel = (HatchModelLockSupportViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(HatchModelLockSupportViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, hatchModelLockSupportViewModel.phase);
            if (C7384Etj.areEqual(c1boA02.getValue(), HatchModelLockSupportViewModel.Phase.Unavailable.INSTANCE)) {
                bfm.AgE(1497006980);
                AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
                Unit unit = Unit.INSTANCE;
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchModelLockSupportSheetKt$HatchModelLockSupportSheet$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A17(bfm, objAaT, unit);
            } else {
                bfm.AgE(1497127105);
            }
            AnonymousClass001.A1D(bfm);
            boolean zAreEqual = C7384Etj.areEqual(c1boA02.getValue(), HatchModelLockSupportViewModel.Phase.Submitted.INSTANCE);
            Object[] objArr = new Object[0];
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = HatchModelLockSupportSheetKt$HatchModelLockSupportSheet$additionalInfo$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            MutableState mutableState = (MutableState) AFz.A03(bfm, (Function0) objAaT2, objArr);
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, 1);
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            Context contextA0O = AnonymousClass003.A0O(bfm);
            Object[] objArr2 = new Object[0];
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = HatchModelLockSupportSheetKt$HatchModelLockSupportSheet$impressionKey$1$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            String str = (String) AFz.A03(bfm, (Function0) objAaT3, objArr2);
            boolean zA65 = bfm.A65(str);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == obj) {
                objAaT4 = HatchModelLockAnalytics.INSTANCE.supportSheetImpression(str);
                bfm.Ai0(objAaT4);
            }
            BRg bRgThen = bRg2.then((BRg) objAaT4);
            if (zAreEqual) {
                c1110AYwA00 = null;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRgThen, c1110AYwA00, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206c2), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), B1V.A00(bfm, new AnonymousClass3(hatchModelLockSupportViewModel, mutableState, c1boA02), -570271046), null, null, false, false, true, null, B1V.A00(bfm, new AnonymousClass4(zAreEqual, mutableState, hatchModelLockSupportViewModel, c3ux, contextA0O, c1boA02), 815899518), bfm, 805330944, 48, 1505);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(bRg2, i, i2);
        }
    }

    public static final void ModelLockSupportFooter(HatchModelLockSupportViewModel.Phase phase, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BS0 bs0;
        BRg bRg2 = bRg;
        bfm.AgG(-318387340);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(phase, bfm, i) ? 1 : 0) | i : i;
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(bRg2.then(c1062ATq), AuraDimensKt.SpacingLarge);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, i4);
            if (C7384Etj.areEqual(phase, HatchModelLockSupportViewModel.Phase.Submitted.INSTANCE)) {
                bfm.AgE(-1552880384);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12083c);
                bs0 = BRg.A00;
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchModelLockSupportSheetKt$ModelLockSupportFooter$1$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            } else if (C7384Etj.areEqual(phase, HatchModelLockSupportViewModel.Phase.LoadFailed.INSTANCE)) {
                bfm.AgE(-1552440060);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120234);
                bs0 = BRg.A00;
                AuraButtonSize auraButtonSize2 = AuraButtonSize.LARGE;
                AuraLabelButtonStyle auraLabelButtonStylePrimary2 = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                boolean zA1C = AnonymousClass003.A1C(iA05);
                Object objAaT2 = bfm.AaT();
                if (zA1C || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchModelLockSupportSheetKt$ModelLockSupportFooter$1$2$1(function0);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, c1062ATq, auraLabelButtonStylePrimary2, auraButtonSize2, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            } else {
                if (!C7384Etj.areEqual(phase, HatchModelLockSupportViewModel.Phase.Loading.INSTANCE) && !C7384Etj.areEqual(phase, HatchModelLockSupportViewModel.Phase.Submitting.INSTANCE) && !C7384Etj.areEqual(phase, HatchModelLockSupportViewModel.Phase.Unavailable.INSTANCE) && !(phase instanceof HatchModelLockSupportViewModel.Phase.Ready)) {
                    throw AnonymousClass003.A0k(bfm, bbi, 1751021011);
                }
                bfm.AgE(-1551841605);
                String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209db);
                bs0 = BRg.A00;
                AuraButtonSize auraButtonSize3 = AuraButtonSize.LARGE;
                AuraLabelButtonStyle auraLabelButtonStylePrimary3 = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                boolean z = !(phase instanceof HatchModelLockSupportViewModel.Phase.Ready);
                boolean zA1C2 = AnonymousClass003.A1C(iA05);
                Object objAaT3 = bfm.AaT();
                if (zA1C2 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchModelLockSupportSheetKt$ModelLockSupportFooter$1$3$1(function0);
                    bfm.Ai0(objAaT3);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA013, null, c1062ATq, auraLabelButtonStylePrimary3, auraButtonSize3, null, false, false, false, z, false, null, null, (Function0) objAaT3, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134200261);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingMedium, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(phase, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ModelLockSupportForm(boolean z, String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-364929362);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 9363, 9362), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0B = C3U4.A0B(bRgThen, f, 0.0f);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingLarge);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            BS0 bs0 = BRg.A00;
            BRg bRgA0B2 = C3U4.A0B(bs0, f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, AuraDimensKt.SpacingXsmall, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B2);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12047b), null, C06G.A0C(bfm), C06G.A0W(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12047a), null, C06G.A0C(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            float f2 = AuraDimensKt.SpacingSmall;
            InterfaceC1380AiA interfaceC1380AiAA0U2 = AnonymousClass006.A0U(bfm, c3th, f2, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U2, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12047e), C3U4.A0B(bs0, f, 0.0f), C06G.A0C(bfm), C06G.A0W(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraCardType.Clickable clickable = AuraCardType.Clickable.INSTANCE;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            ApQ apQA0Y = AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120482);
            long j2 = 0;
            Object[] objArr5 = objArr4 == true ? 1 : 0;
            Object[] objArr6 = objArr3 == true ? 1 : 0;
            Object[] objArr7 = objArr2 == true ? 1 : 0;
            Object[] objArr8 = objArr == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            Object[] objArr10 = 0 == true ? 1 : 0;
            Object[] objArr11 = 0 == true ? 1 : 0;
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, new AuraCardContent(apQA0Y, auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) null, (G0U) objArr9, (AuraIconAndBodyStyle) objArr10, (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i4, (int) objArr5, (int) objArr6, (String) objArr11, (boolean) objArr7, (boolean) objArr8, (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j2, j2, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) null), clickable, null, ComposableSingletons$HatchModelLockSupportSheetKt.f31lambda$126468610, function0, null, null, null, z, false, null, null, 0L, false, null, null, bfm, ((iA0n << 9) & 3670016) | 199686, iA0n & 14, 261008);
            BBI.A0R(bbi, true);
            InterfaceC1380AiA interfaceC1380AiAA0U3 = AnonymousClass006.A0U(bfm, c3th, f2, 0);
            int iA0D3 = AnonymousClass001.A0D(bbi);
            AKQ akqA044 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U3, g0v);
            BPg.A02(bfm, akqA044, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA014, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120477), C3U4.A0B(bs0, f, 0.0f), C06G.A0C(bfm), C06G.A0W(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraTextInputKt.AuraTextInput(str, null, c1062ATq, ComposableSingletons$HatchModelLockSupportSheetKt.f32lambda$1533118114, null, null, null, C06G.A0T(bfm), false, 0, 3, null, null, null, null, z, false, false, false, null, g0u, bfm, ((iA0n >> 3) & 14) | 3456, ((iA0n << 15) & 458752) | 6, (iA0n >> 6) & 14, 1014642);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114992(z, str, g0u, function0, bRg2, i, i2);
        }
    }

    public static final void ModelLockSupportSubmitted(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1576500959);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingLarge);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchModelLockSupportSheetKt$ModelLockSupportSubmitted$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA07, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02(C2VU.A04, AuraDimensKt.SpacingXsmall), bfm, C2VU.A00, 48);
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
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120480), null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).title3Medium, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12047f), null, C06G.A0C(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115003(bRg2, i, i2);
        }
    }

    public static final /* synthetic */ HatchModelLockSupportViewModel.Phase access$HatchModelLockSupportSheet$lambda$0(C1BO c1bo) {
        return (HatchModelLockSupportViewModel.Phase) c1bo.getValue();
    }
}
