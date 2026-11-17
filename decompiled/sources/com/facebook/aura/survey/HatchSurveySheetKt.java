package com.facebook.aura.survey;

import X.AKQ;
import X.ARK;
import X.AbstractC1874Aso;
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
import X.AuJ;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C07C;
import X.C0981AMm;
import X.C0A8;
import X.C0ob;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1326AhD;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3UX;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchSurveySheetKt {

    /* renamed from: com.facebook.aura.survey.HatchSurveySheetKt$HatchSurveySheet$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $canAdvance;
        public final /* synthetic */ MutableState<Boolean> $completed$delegate;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<HatchSurveyPage> $currentPage$delegate;
        public final /* synthetic */ C0981AMm<String, String> $freeTextByQuestion;
        public final /* synthetic */ boolean $isSubmitLabel;
        public final /* synthetic */ MutableState<Boolean> $isSubmitting$delegate;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ C0981AMm<String, String> $numericByQuestion;
        public final /* synthetic */ HatchSurveyPage $page;
        public final /* synthetic */ C3UX $scope;
        public final /* synthetic */ C0981AMm<String, Integer> $selectedByQuestion;
        public final /* synthetic */ View $toastParentView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(boolean z, boolean z2, HatchSurveyPage hatchSurveyPage, C3UX c3ux, View view, Context context, AuraNavigator auraNavigator, MutableState<Boolean> mutableState, C0981AMm<String, Integer> c0981AMm, C0981AMm<String, String> c0981AMm2, C0981AMm<String, String> c0981AMm3, MutableState<Boolean> mutableState2, MutableState<HatchSurveyPage> mutableState3) {
            super(2);
            this.$isSubmitLabel = z;
            this.$canAdvance = z2;
            this.$page = hatchSurveyPage;
            this.$scope = c3ux;
            this.$toastParentView = view;
            this.$context = context;
            this.$navigator = auraNavigator;
            this.$isSubmitting$delegate = mutableState;
            this.$selectedByQuestion = c0981AMm;
            this.$numericByQuestion = c0981AMm2;
            this.$freeTextByQuestion = c0981AMm3;
            this.$completed$delegate = mutableState2;
            this.$currentPage$delegate = mutableState3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            int i2;
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA07 = C3U4.A07(c1062ATq, AuraDimensKt.SpacingLarge);
                boolean z = this.$isSubmitLabel;
                boolean z2 = this.$canAdvance;
                HatchSurveyPage hatchSurveyPage = this.$page;
                C3UX c3ux = this.$scope;
                View view = this.$toastParentView;
                Context context = this.$context;
                AuraNavigator auraNavigator = this.$navigator;
                MutableState<Boolean> mutableState = this.$isSubmitting$delegate;
                C0981AMm<String, Integer> c0981AMm = this.$selectedByQuestion;
                C0981AMm<String, String> c0981AMm2 = this.$numericByQuestion;
                C0981AMm<String, String> c0981AMm3 = this.$freeTextByQuestion;
                MutableState<Boolean> mutableState2 = this.$completed$delegate;
                MutableState<HatchSurveyPage> mutableState3 = this.$currentPage$delegate;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A02, 0);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                if (z) {
                    bfm.AgE(802146770);
                    i2 = R.string._name_removed__res_0x7f1210d3;
                } else {
                    bfm.AgE(802148880);
                    i2 = R.string._name_removed__res_0x7f1210d1;
                }
                String strA0s = AnonymousClass001.A0s(bfm, bbi, i2);
                boolean zA0A = MutableState.A0A((MutableState) mutableState);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                boolean zA1T = AnonymousClass001.A1T(bfm, auraNavigator, AnonymousClass005.A1V(bfm, c3ux, view, context, AnonymousClass001.A1U(bfm, z, AnonymousClass003.A1Q(bfm, hatchSurveyPage, z2))));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchSurveySheetKt$HatchSurveySheet$4$1$1$1(z2, hatchSurveyPage, c0981AMm, c0981AMm2, c0981AMm3, z, c3ux, mutableState, view, context, auraNavigator, mutableState2, mutableState3);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0s, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z2, zA0A, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134199749);
                C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingMedium, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.survey.HatchSurveySheetKt$HatchSurveySheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C0981AMm<String, String> $freeTextByQuestion;
        public final /* synthetic */ C0981AMm<String, String> $numericByQuestion;
        public final /* synthetic */ HatchSurveyPage $page;
        public final /* synthetic */ C0981AMm<String, Integer> $selectedByQuestion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchSurveyPage hatchSurveyPage, C0981AMm<String, Integer> c0981AMm, C0981AMm<String, String> c0981AMm2, C0981AMm<String, String> c0981AMm3) {
            super(3);
            this.$page = hatchSurveyPage;
            this.$selectedByQuestion = c0981AMm;
            this.$numericByQuestion = c0981AMm2;
            this.$freeTextByQuestion = c0981AMm3;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            for (HatchSurveyQuestion hatchSurveyQuestion : this.$page.questions) {
                Integer num = this.$selectedByQuestion.get(hatchSurveyQuestion.questionId);
                String str = this.$numericByQuestion.get(hatchSurveyQuestion.questionId);
                if (str == null) {
                    str = "";
                }
                String str2 = this.$freeTextByQuestion.get(hatchSurveyQuestion.questionId);
                if (str2 == null) {
                    str2 = "";
                }
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$page, bfm.A67(hatchSurveyQuestion));
                C0981AMm<String, Integer> c0981AMm = this.$selectedByQuestion;
                HatchSurveyPage hatchSurveyPage = this.$page;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchSurveySheetKt$HatchSurveySheet$5$1$1(c0981AMm, hatchSurveyQuestion, hatchSurveyPage);
                    BBI.A0T(bfm, objAaT);
                }
                G0U g0u = (G0U) objAaT;
                boolean zA67 = bfm.A67(hatchSurveyQuestion);
                C0981AMm<String, String> c0981AMm2 = this.$numericByQuestion;
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchSurveySheetKt$HatchSurveySheet$5$2$1(c0981AMm2, hatchSurveyQuestion);
                    BBI.A0T(bfm, objAaT2);
                }
                G0U g0u2 = (G0U) objAaT2;
                boolean zA672 = bfm.A67(hatchSurveyQuestion);
                C0981AMm<String, String> c0981AMm3 = this.$freeTextByQuestion;
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchSurveySheetKt$HatchSurveySheet$5$3$1(c0981AMm3, hatchSurveyQuestion);
                    BBI.A0T(bfm, objAaT3);
                }
                HatchSurveySheetKt.SurveyQuestion(hatchSurveyQuestion, num, str, str2, g0u, g0u2, (G0U) objAaT3, null, bfm, HatchSurveyQuestion.$stable, 128);
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.survey.HatchSurveySheetKt$HatchSurveySheet$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSurveySheetKt.HatchSurveySheet(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.survey.HatchSurveySheetKt$SurveyFreeTextField$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<G0V<? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ AuraTypography $typography;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraColors auraColors, String str, AuraTypography auraTypography) {
            super(3);
            this.$colors = auraColors;
            this.$value = str;
            this.$typography = auraTypography;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(G0V<? super BFM, ? super Integer, ? extends Unit> g0v, BFM bfm, Integer num) {
            invoke((G0V<? super BFM, ? super Integer, Unit>) g0v, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
            int iA0T = i;
            C7384Etj.A0Y(g0v, 0);
            if ((i & 6) == 0) {
                iA0T = i | AnonymousClass004.A0T(bfm, g0v);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
                BRg bRgA01 = C11U.A01(AnonymousClass001.A0U(C10G.A02, 120.0f), 16.0f);
                AuraColors auraColors = this.$colors;
                BRg bRgA09 = C3U4.A09(C1b8.A01(bRgA01, auraColors.background), AuraDimensKt.SpacingMedium);
                Alignment alignment = C2VU.A0E;
                String str = this.$value;
                AuraTypography auraTypography = this.$typography;
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA09);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA012, iA0J);
                if (str.length() == 0) {
                    bfm.AgE(-1812686824);
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210d0), null, auraColors.secondaryText, auraTypography.bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                } else {
                    bfm.AgE(-1812490408);
                }
                BBI.A0R(bbi, false);
                AnonymousClass005.A0q(bbi, bfm, g0v, iA0T);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.survey.HatchSurveySheetKt$SurveyFreeTextField$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onValueChange;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$value = str;
            this.$onValueChange = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSurveySheetKt.SurveyFreeTextField(this.$value, this.$onValueChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.survey.HatchSurveySheetKt$SurveyNumericField$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C142261 extends AbstractC7559F3s implements G0W<G0V<? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ AuraTypography $typography;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142261(AuraColors auraColors, AuraTypography auraTypography, String str) {
            super(3);
            this.$colors = auraColors;
            this.$typography = auraTypography;
            this.$value = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(G0V<? super BFM, ? super Integer, ? extends Unit> g0v, BFM bfm, Integer num) {
            invoke((G0V<? super BFM, ? super Integer, Unit>) g0v, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
            int iA0T = i;
            C7384Etj.A0Y(g0v, 0);
            if ((i & 6) == 0) {
                iA0T = i | AnonymousClass004.A0T(bfm, g0v);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
                BS0 bs0 = BRg.A00;
                BRg bRgA01 = C11U.A01(C10G.A02, 24.0f);
                AuraColors auraColors = this.$colors;
                BRg bRgA09 = C3U4.A09(C1b8.A01(bRgA01, auraColors.background), AuraDimensKt.SpacingMedium);
                C1AC c1ac = C2VU.A04;
                AuraTypography auraTypography = this.$typography;
                String str = this.$value;
                InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA09);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA0W, g0v2);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
                C90m c90m = C90m.A00;
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210cd), null, auraColors.secondaryText, auraTypography.bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A0A(bfm, bs0, AuraDimensKt.SpacingSmall);
                BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgAiP);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0c, g0v2);
                BPg.A02(bfm, akqA042, g0v3);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                if (str.length() == 0) {
                    bfm.AgE(-428416667);
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210cc), null, auraColors.secondaryText, auraTypography.bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                } else {
                    bfm.AgE(-428213462);
                }
                BBI.A0R(bbi, false);
                AnonymousClass004.A1C(bbi, bfm, g0v, iA0T, true);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.survey.HatchSurveySheetKt$SurveyNumericField$2, reason: invalid class name and case insensitive filesystem */
    public final class C142272 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onValueChange;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142272(String str, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$value = str;
            this.$onValueChange = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSurveySheetKt.SurveyNumericField(this.$value, this.$onValueChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.survey.HatchSurveySheetKt$SurveyOptionRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C142282 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142282(String str, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$selected = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSurveySheetKt.SurveyOptionRow(this.$label, this.$selected, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.survey.HatchSurveySheetKt$SurveyQuestion$2, reason: invalid class name and case insensitive filesystem */
    public final class C142292 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $freeText;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $numericText;
        public final /* synthetic */ G0U<String, Unit> $onFreeTextChange;
        public final /* synthetic */ G0U<String, Unit> $onNumericChange;
        public final /* synthetic */ G0U<Integer, Unit> $onSelectOption;
        public final /* synthetic */ HatchSurveyQuestion $question;
        public final /* synthetic */ Integer $selectedValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142292(HatchSurveyQuestion hatchSurveyQuestion, Integer num, String str, String str2, G0U<? super Integer, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, BRg bRg, int i, int i2) {
            super(2);
            this.$question = hatchSurveyQuestion;
            this.$selectedValue = num;
            this.$numericText = str;
            this.$freeText = str2;
            this.$onSelectOption = g0u;
            this.$onNumericChange = g0u2;
            this.$onFreeTextChange = g0u3;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSurveySheetKt.SurveyQuestion(this.$question, this.$selectedValue, this.$numericText, this.$freeText, this.$onSelectOption, this.$onNumericChange, this.$onFreeTextChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchSurveyPresentation.values().length];
            try {
                AnonymousClass002.A13(HatchSurveyPresentation.SINGLE_SELECT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchSurveyPresentation.NUMERIC, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchSurveyPresentation.FREE_TEXT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchSurveyPresentation.DISPLAY_ONLY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchSurveyPresentation.UNSUPPORTED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSurveySheet(X.BRg r39, X.BFM r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.survey.HatchSurveySheetKt.HatchSurveySheet(X.BRg, X.BFM, int, int):void");
    }

    public static final void SurveyFreeTextField(String str, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-792782483);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            AbstractC1874Aso.A03(null, null, null, bfm, C3U4.A07(bRg2, AuraDimensKt.SpacingLarge), new C1326AhD(colors.link), C1822Arm.A00(null, typography.bodyRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, colors.primaryText, 0L, 0L, 0L), null, str, g0u, null, B1V.A00(bfm, new AnonymousClass1(colors, str, typography), 490845392), 0, 0, iA0d & 126, 196608, 16344, false, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, g0u, bRg2, i, i2);
        }
    }

    public static final void SurveyNumericField(String str, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1294276239);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
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
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            AbstractC1874Aso.A03(null, null, new AuJ(null, -1, 9, -1), bfm, C3U4.A07(bRg2, AuraDimensKt.SpacingLarge), new C1326AhD(colors.link), C1822Arm.A00(null, typography.bodyRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, colors.primaryText, 0L, 0L, 0L), null, str, g0u, null, B1V.A00(bfm, new C142261(colors, typography, str), 1102435758), 0, 0, (iA0d & 14) | 102236160 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 196608, 16024, false, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142272(str, g0u, bRg2, i, i2);
        }
    }

    public static final void SurveyOptionRow(String str, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-389272732);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            BRg bRgA0B = C3U4.A0B(AnonymousClass006.A0O(C0ob.A00(AnonymousClass001.A0R(bRg2), C3cG.A0A(3), function0, z, true)), AuraDimensKt.SpacingLarge, AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
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
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            long j = colors.primaryText;
            BS0 bs0 = BRg.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARK.A00(bs0), j, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            BRg bRgA07 = C10G.A07(bs0, 22.0f);
            long j2 = z ? colors.link : colors.tertiaryText;
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA02 = C1DI.A02(bRgA07, c1d3, 1.5f, j2);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA02);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (z) {
                bfm.AgE(-1796652013);
                C1b8.A04(bfm, C11U.A03(C10G.A07(bs0, 12.0f), c1d3), colors.link);
            } else {
                bfm.AgE(-1796570328);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142282(str, z, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SurveyQuestion(com.facebook.aura.survey.HatchSurveyQuestion r39, java.lang.Integer r40, java.lang.String r41, java.lang.String r42, X.G0U<? super java.lang.Integer, kotlin.Unit> r43, X.G0U<? super java.lang.String, kotlin.Unit> r44, X.G0U<? super java.lang.String, kotlin.Unit> r45, X.BRg r46, X.BFM r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.survey.HatchSurveySheetKt.SurveyQuestion(com.facebook.aura.survey.HatchSurveyQuestion, java.lang.Integer, java.lang.String, java.lang.String, X.G0U, X.G0U, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void showToast(View view, String str) {
        AuraToast auraToastM3114makeKDArT4I = AuraToast.Companion.m3114makeKDArT4I(view, str, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
        if (auraToastM3114makeKDArT4I != null) {
            auraToastM3114makeKDArT4I.show();
        }
    }

    public static final /* synthetic */ HatchSurveyPage access$HatchSurveySheet$lambda$3(MutableState mutableState) {
        return (HatchSurveyPage) mutableState.getValue();
    }

    public static final List<HatchSurveyAnswer> collectAnswers(List<HatchSurveyQuestion> list, Map<String, Integer> map, Map<String, String> map2, Map<String, String> map3) {
        String strA0p;
        String str;
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchSurveyQuestion hatchSurveyQuestion : list) {
            int iOrdinal = hatchSurveyQuestion.getPresentation().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    strA0p = C60O.A0p(hatchSurveyQuestion.questionId, map2);
                } else if (iOrdinal == 2) {
                    String strA0p2 = C60O.A0p(hatchSurveyQuestion.questionId, map3);
                    if (strA0p2 != null) {
                        strA0p = AnonymousClass002.A0l(strA0p2);
                    }
                } else if (iOrdinal != 3 && iOrdinal != 4) {
                    throw C3cG.A0q();
                }
                if (strA0p != null && strA0p.length() > 0) {
                    str = hatchSurveyQuestion.questionId;
                    arrayListA0h.add(new HatchSurveyAnswer(str, strA0p));
                }
            } else {
                Integer num = map.get(hatchSurveyQuestion.questionId);
                if (num != null) {
                    int iIntValue = num.intValue();
                    str = hatchSurveyQuestion.questionId;
                    strA0p = String.valueOf(iIntValue);
                    arrayListA0h.add(new HatchSurveyAnswer(str, strA0p));
                }
            }
        }
        return arrayListA0h;
    }

    public static final String sanitizeDecimal(String str) {
        StringBuilder sbA0w = C60O.A0w();
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sbA0w.append(cCharAt);
            } else if (cCharAt == '.' && !z) {
                sbA0w.append(cCharAt);
                z = true;
            }
        }
        return sbA0w.toString();
    }
}
