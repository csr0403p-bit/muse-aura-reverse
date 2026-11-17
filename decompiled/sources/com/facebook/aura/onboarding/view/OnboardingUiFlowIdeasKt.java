package com.facebook.aura.onboarding.view;

import X.AKH;
import X.AKQ;
import X.AT5;
import X.AT8;
import X.AbstractC2271BQs;
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
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0dx;
import X.C0ob;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1DP;
import X.C1EQ;
import X.C1OM;
import X.C1YD;
import X.C1YY;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C78e;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.onboarding.OnboardingTask;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class OnboardingUiFlowIdeasKt {
    public static final C1D3 IdeaCardShape = C1D8.A00(20.0f);

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowIdeasKt$OnboardingIdeaSourcePill$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ OnboardingTask.CardSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OnboardingTask.CardSource cardSource, BRg bRg, int i, int i2) {
            super(2);
            this.$source = cardSource;
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
            OnboardingUiFlowIdeasKt.OnboardingIdeaSourcePill(this.$source, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeaCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ OnboardingTask $idea;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSelect;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OnboardingTask onboardingTask, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$idea = onboardingTask;
            this.$selected = z;
            this.$onSelect = function0;
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
            OnboardingUiFlowIdeasKt.OnboardingUiFlowIdeaCard(this.$idea, this.$selected, this.$onSelect, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeas$3, reason: invalid class name and case insensitive filesystem */
    public final class C127993 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Float> $exitProgress;
        public final /* synthetic */ List<OnboardingTask> $ideas;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onIdeaSelected;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ String $selectedIdeaId;
        public final /* synthetic */ String $sentMessageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C127993(List<OnboardingTask> list, String str, boolean z, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, String str2, Function0<Float> function02, int i, int i2) {
            super(2);
            this.$ideas = list;
            this.$selectedIdeaId = str;
            this.$isLoading = z;
            this.$onIdeaSelected = g0u;
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$sentMessageId = str2;
            this.$exitProgress = function02;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingUiFlowIdeasKt.OnboardingUiFlowIdeas(this.$ideas, this.$selectedIdeaId, this.$isLoading, this.$onIdeaSelected, this.$onRetry, this.$modifier, this.$sentMessageId, this.$exitProgress, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Float> $exitProgress;
        public final /* synthetic */ List<OnboardingTask> $ideas;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onIdeaSelected;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ String $selectedIdeaId;
        public final /* synthetic */ String $sentMessageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(List<OnboardingTask> list, String str, boolean z, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, String str2, Function0<Float> function02, int i, int i2) {
            super(2);
            this.$ideas = list;
            this.$selectedIdeaId = str;
            this.$isLoading = z;
            this.$onIdeaSelected = g0u;
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$sentMessageId = str2;
            this.$exitProgress = function02;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingUiFlowIdeasKt.OnboardingUiFlowIdeasList(this.$ideas, this.$selectedIdeaId, this.$isLoading, this.$onIdeaSelected, this.$onRetry, this.$modifier, this.$sentMessageId, this.$exitProgress, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowIdeasKt$OnboardingUiFlowTopFade$1, reason: invalid class name and case insensitive filesystem */
    public final class C128001 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128001(BRg bRg, int i, int i2) {
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
            OnboardingUiFlowIdeasKt.OnboardingUiFlowTopFade(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnboardingTask.CardSource.values().length];
            try {
                AnonymousClass002.A13(OnboardingTask.CardSource.FACEBOOK, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(OnboardingTask.CardSource.INSTAGRAM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void OnboardingIdeaSourcePill(OnboardingTask.CardSource cardSource, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(-1869039845);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, cardSource) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 19, 18), bfm, iA08)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            int iOrdinal = cardSource.ordinal();
            if (iOrdinal == 0) {
                i3 = R.string._name_removed__res_0x7f120d3c;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.string._name_removed__res_0x7f120d3d;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).footnoteMedium;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(C1b8.A03(C3U4.A0C(bRg2, 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingNano), AnonymousClass002.A0e(bfm).pill, AnonymousClass001.A0f(bfm, akh).m2741getPinkTagFill0d7_KjU()), AuraDimensKt.SpacingXsmall, 0.0f), AnonymousClass001.A0f(bfm, akh).m2742getPinkTagText0d7_KjU(), c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(cardSource, bRg2, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void OnboardingUiFlowIdeaCard(OnboardingTask onboardingTask, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbi;
        int i3;
        long j;
        int i4;
        BRg bRg2 = bRg;
        bfm.AgG(1291084954);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, onboardingTask) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1D3 c1d3 = IdeaCardShape;
            BRg bRgA03 = C11U.A03(bRgA0R, c1d3);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA01 = C1b8.A01(bRgA03, AnonymousClass001.A0f(bfm, akh).card);
            if (z) {
                j = AnonymousClass006.A0i(bfm, akh, -512893440).accent;
                bbi = (BBI) bfm;
                i3 = 0;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-512892859);
                bbi = (BBI) bfm;
                i3 = 0;
                BBI.A0R(bbi, false);
                j = B6A.A06;
            }
            BRg bRgA02 = C1DI.A02(bRgA01, c1d3, 2.0f, j);
            C1YD c1yd = new C1YD(3);
            boolean zA1T = AnonymousClass001.A1T(bfm, c0dxA0T, AnonymousClass003.A1C(iA0T)) | ((iA0T & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeaCard$1$1(z, c0dxA0T, function0);
                bfm.Ai0(objAaT);
            }
            BRg bRgA09 = C3U4.A09(C0ob.A00(bRgA02, c1yd, (Function0) objAaT, z, true), AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingXsmallPlusNano);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0K, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, iA0D);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            C90m c90m = C90m.A00;
            String str = onboardingTask.iconUri;
            if (str == null) {
                bfm.AgE(1132689460);
                BBI.A0R(bbi, i3);
                i4 = 2;
            } else {
                bfm.AgE(1132689461);
                i4 = 2;
                AuraImageKt.m2573AuraImageXRP3Ue8(str, C10G.A07(BRg.A00, 40.0f), B18.A02, null, null, i3, null, 0L, i3, i3, i3, null, null, null, null, bfm, 432, i3, 32760);
                BBI.A0R(bbi, i3);
            }
            BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingNano, i3);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            OnboardingTask.CardSource cardSource = onboardingTask.fromCard;
            if (cardSource == null) {
                bfm.AgE(-1722315516);
            } else {
                bfm.AgE(-1722315515);
                OnboardingIdeaSourcePill(cardSource, null, bfm, i3, i4);
            }
            BBI.A0R(bbi, i3);
            String str2 = onboardingTask.title;
            OnboardingUiFlowTypography onboardingUiFlowTypography = OnboardingUiFlowTypography.INSTANCE;
            boolean z2 = i3;
            int i6 = i3;
            int i7 = i3;
            int i8 = i3;
            int i9 = i3;
            int i10 = i3;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A0L(bfm, akh), onboardingUiFlowTypography.getAction(bfm, 6), null, null, null, z2, i6, i7, i8, null, null, null, bfm, i9, i10, 16370);
            if (onboardingTask.description.length() > 0) {
                bfm.AgE(-1722035895);
                AuraTextKt.m2639AuraTextUY9GdpU(onboardingTask.description, null, C06G.A0I(bfm, akh), onboardingUiFlowTypography.getFootnote(bfm, 6), null, null, null, z2, i6, i7, i8, null, null, null, bfm, i9, i10, 16370);
            } else {
                bfm.AgE(-1721869394);
            }
            AnonymousClass002.A10(bbi, i3, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(onboardingTask, z, function0, bRg2, i, i2);
        }
    }

    public static final void OnboardingUiFlowIdeas(List<OnboardingTask> list, String str, boolean z, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, String str2, Function0<Float> function02, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String str3 = str2;
        Function0<Float> function03 = function02;
        AnonymousClass005.A12(list, g0u, function0, 0);
        bfm.AgG(-1024351172);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0j = 1572864;
        if (i4 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str3);
            iA05 |= iA0j;
        }
        int i5 = i2 & 128;
        int iA0a = 12582912;
        if (i5 != 0) {
            iA05 |= iA0a;
        } else if ((12582912 & i) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, function03);
            iA05 |= iA0a;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str3 = null;
            }
            if (i5 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeas$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function03 = (Function0) objAaT;
            }
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(AnonymousClass001.A0T(bRg2), HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_TASKS, HatchScreen.ONBOARDING_TASKS, HatchComponent.ONBOARDING_TASKS_SCREEN, null, null, null, 500L, 0.0f, null, null, null);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i6 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgHatchImpression);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, i6);
            C0z7 c0z7 = C0z7.A00;
            OnboardingUiFlowIdeasList(list, str, z, g0u, function0, null, str3, function03, bfm, iA05 & 33095678, 32);
            OnboardingUiFlowTopFade(C10G.A04(c0z7.A4C(C2VU.A0C, BRg.A00), 82.0f), bfm, 0, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C127993(list, str, z, g0u, function0, bRg2, str3, function03, i, i2);
        }
    }

    public static final void OnboardingUiFlowIdeasList(List<OnboardingTask> list, String str, boolean z, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, String str2, Function0<Float> function02, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String str3 = str2;
        Function0<Float> function03 = function02;
        bfm.AgG(1482267966);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((i & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0j = 1572864;
        if (i4 != 0) {
            iA05 |= iA0j;
        } else if ((i & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str3);
            iA05 |= iA0j;
        }
        int i5 = i2 & 128;
        int iA0a = 12582912;
        if (i5 != 0) {
            iA05 |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, function03);
            iA05 |= iA0a;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str3 = null;
            }
            if (i5 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function03 = (Function0) objAaT;
            }
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = AT8.A00(0.0f);
                bfm.Ai0(objAaT2);
            }
            AT5 at5 = (AT5) objAaT2;
            boolean z2 = !list.isEmpty();
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i6 = iA05 & 14;
            boolean zA1R = (i6 == 4 || ((iA05 & 8) != 0 && bfm.A67(list))) | AnonymousClass003.A1R(bfm, at5, z2);
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == obj) {
                objAaT3 = new OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$2$1(at5, z2, list, null);
                bfm.Ai0(objAaT3);
            }
            C78e.A06(bfm, boolValueOf, (G0V) objAaT3);
            AT5 at52 = (AT5) AnonymousClass005.A0e(bfm, bfm.AaT(), obj);
            float fRememberIdeasContentTop = OnboardingUiFlowScreenKt.rememberIdeasContentTop(bfm, 0);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            float f = AuraDimensKt.SpacingMedium;
            C1DP c1dp = new C1DP(f, fRememberIdeasContentTop, f, 144.0f);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
            boolean zA1V = AnonymousClass002.A1V(bfm, at5, AnonymousClass001.A1T(bfm, at52, AnonymousClass005.A1J(iA05)) | (i6 == 4 || ((iA05 & 8) != 0 && bfm.A67(list))) | AnonymousClass004.A1I(iA05), AnonymousClass005.A1B(iA05)) | AnonymousClass004.A1M(iA05) | AnonymousClass004.A1K(iA05) | AnonymousClass005.A1M(iA05);
            Object objAaT4 = bfm.AaT();
            if (zA1V || objAaT4 == obj) {
                objAaT4 = new OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1(list, z, function03, at52, str, str3, at5, g0u, function0);
                bfm.Ai0(objAaT4);
            }
            C1YY.A01(null, null, c9m9A00, c1dp, null, bfm, null, bRgA0T, (G0U) objAaT4, 0, 490, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(list, str, z, g0u, function0, bRg2, str3, function03, i, i2);
        }
    }

    public static final void logOnboardingTasksRetryClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_TASKS, HatchScreen.ONBOARDING_TASKS, HatchComponent.RETRY_BUTTON, null, null, null);
    }

    public static final void OnboardingUiFlowTopFade(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1592964058);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            long j = AnonymousClass002.A0c(bfm).highlight;
            C01N.A07(bfm, C1b8.A02(AnonymousClass001.A0R(bRg), C1EQ.A02(new HxE[]{AnonymousClass007.A0g(0.0f, j), AnonymousClass007.A0g(0.75f, j), AnonymousClass007.A0h(Float.valueOf(1.0f), 0.0f, j)}, Float.POSITIVE_INFINITY), C1OM.A00));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128001(bRg, i, i2);
        }
    }
}
