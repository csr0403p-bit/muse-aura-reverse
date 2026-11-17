package com.facebook.aura.onboarding.view;

import X.AKQ;
import X.AOW;
import X.ASj;
import X.AT5;
import X.AVy;
import X.AXQ;
import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC0878AGe;
import X.AbstractC1396AiR;
import X.AbstractC1874Aso;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AuJ;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00q;
import X.C00x;
import X.C0Hi;
import X.C0dx;
import X.C0v5;
import X.C11U;
import X.C1326AhD;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C2257BGr;
import X.C2HU;
import X.C2av;
import X.C31t;
import X.C3TF;
import X.C3TG;
import X.C3Tr;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class OnboardingUiFlowNameKt {
    public static final float EntranceDurationMs = 350.0f;
    public static final long FirstNameTimeoutMs = 1000;
    public static final float GreetingToQuestionPauseMs = 200.0f;
    public static final int MaxNameChips = 4;
    public static final float NameAvatarMinTop = 56.0f;
    public static final int NameChipsEntranceDelayMs = 450;
    public static final int NameContinueEntranceDelayMs = 600;
    public static final int NameFieldEntranceDelayMs = 300;
    public static final TextRevealTiming GreetingTitleTiming = new TextRevealTiming(0.0f, 260.0f, 170.0f);
    public static final TextRevealTiming QuestionTiming = new TextRevealTiming(0.0f, 400.0f, 280.0f);
    public static final TextRevealTiming HeaderTitleTiming = new TextRevealTiming(70.0f, 260.0f, 170.0f);
    public static final TextRevealTiming HeaderSubtitleTiming = new TextRevealTiming(200.0f, 400.0f, 280.0f);

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowHeader$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AT5<Float, AOW> $clock;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $revealDelayMs;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, String str2, BRg bRg, int i, AT5<Float, AOW> at5, int i2, int i3) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$revealDelayMs = i;
            this.$clock = at5;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingUiFlowNameKt.OnboardingUiFlowHeader(this.$title, this.$subtitle, this.$modifier, this.$revealDelayMs, this.$clock, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowNameChips$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<String> $names;
        public final /* synthetic */ G0U<String, Unit> $onSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<String> list, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$names = list;
            this.$onSelected = g0u;
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
            OnboardingUiFlowNameKt.OnboardingUiFlowNameChips(this.$names, this.$onSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowNameField$2, reason: invalid class name and case insensitive filesystem */
    public final class C128012 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $agentName;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onAgentNameChange;
        public final /* synthetic */ Function0<Unit> $onRegenerateName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C128012(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$agentName = str;
            this.$onAgentNameChange = g0u;
            this.$onRegenerateName = function0;
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
            OnboardingUiFlowNameKt.OnboardingUiFlowNameField(this.$agentName, this.$onAgentNameChange, this.$onRegenerateName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowRegenerateNameButton$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRegenerateName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onRegenerateName = function0;
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
            OnboardingUiFlowNameKt.OnboardingUiFlowRegenerateNameButton(this.$onRegenerateName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$onboardingNameEntrance$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
        public final /* synthetic */ int $delayMs;
        public final /* synthetic */ OnboardingNameReveal $reveal;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2av c2av) {
            C7384Etj.A0Y(c2av, 0);
            float fEntranceProgress = this.$reveal.entranceProgress(this.$delayMs);
            c2av.Acj(fEntranceProgress);
            c2av.Af6(c2av.Ah4(24.0f) * (1.0f - fEntranceProgress));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OnboardingNameReveal onboardingNameReveal, int i) {
            super(1);
            this.$reveal = onboardingNameReveal;
            this.$delayMs = i;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
            invoke2(c2av);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OnboardingUiFlowHeader(java.lang.String r34, java.lang.String r35, X.BRg r36, int r37, X.AT5<java.lang.Float, X.AOW> r38, X.BFM r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt.OnboardingUiFlowHeader(java.lang.String, java.lang.String, X.BRg, int, X.AT5, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* renamed from: OnboardingUiFlowName-ioSWKzA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1618OnboardingUiFlowNameioSWKzA(java.lang.String r44, boolean r45, com.facebook.aura.onboarding.view.OnboardingNameReveal r46, float r47, boolean r48, float r49, X.G0U<? super X.InterfaceC1497Ak4, kotlin.Unit> r50, java.lang.String r51, java.util.List<java.lang.String> r52, X.G0U<? super java.lang.String, kotlin.Unit> r53, X.G0U<? super java.lang.String, kotlin.Unit> r54, kotlin.jvm.functions.Function0<kotlin.Unit> r55, X.BRg r56, X.BFM r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt.m1618OnboardingUiFlowNameioSWKzA(java.lang.String, boolean, com.facebook.aura.onboarding.view.OnboardingNameReveal, float, boolean, float, X.G0U, java.lang.String, java.util.List, X.G0U, X.G0U, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }

    public static final void OnboardingUiFlowNameChips(List<String> list, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-1833812983);
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
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingXsmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0D);
            C90m c90m = C90m.A00;
            long j = C3cH.A0W(bfm).card;
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1728578691);
            while (itA0w.hasNext()) {
                String strA0j = AnonymousClass005.A0j(itA0w);
                AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                int i4 = AuraHaptics.SEGMENT_SWITCH;
                BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, true);
                boolean zA1R = AnonymousClass001.A1R(bfm, strA0j, AnonymousClass003.A1C(iA05));
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new OnboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$1$1(g0u, strA0j);
                    bfm.Ai0(objAaT);
                }
                Function0 function02 = (Function0) objAaT;
                boolean zA64 = bfm.A64(j);
                Object objAaT2 = bfm.AaT();
                if (zA64 || objAaT2 == C78N.A00) {
                    objAaT2 = new OnboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$2$1(j);
                    bfm.Ai0(objAaT2);
                }
                Function0 function03 = (Function0) objAaT2;
                OnboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$3 onboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$3 = OnboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$3.INSTANCE;
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == C78N.A00) {
                    objAaT3 = OnboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$4$1.INSTANCE;
                    bfm.Ai0(objAaT3);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0j, null, bRgA0O, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, function03, onboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$3, null, (Function0) objAaT3, null, false, 1, true, i4, bfm, 196608, 0, 221232, 13877189);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(list, g0u, bRgA0Q, i, i2);
        }
    }

    public static final void OnboardingUiFlowNameField(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2104856451);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
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
            C0Hi c0Hi = (C0Hi) bfm.A6v(Am0.A05);
            BRg bRgA0U = AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 54.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0C = C3U4.A0C(C1b8.A03(bRgA0U, C1D8.A00(16.0f), auraTheme.getColors(bfm, 6).card), AuraDimensKt.SpacingMedium, 0.0f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, OnboardingUiFlowTypography.INSTANCE.getField(bfm, 6), null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, C3cH.A06(bfm, auraTheme), 0L, 0L, 0L);
            C1326AhD c1326AhD = new C1326AhD(C3cH.A06(bfm, auraTheme));
            AuJ auJ = new AuJ(null, -1, 0, 7);
            boolean zA67 = bfm.A67(c0Hi);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new OnboardingUiFlowNameKt$OnboardingUiFlowNameField$1$1$1(c0Hi);
                bfm.Ai0(objAaT);
            }
            AbstractC1874Aso.A03(null, new C2257BGr((G0U) objAaT, null, null, null), auJ, bfm, c90m.AiP(BRg.A00, 1.0f, true), c1326AhD, c1822ArmA00, null, str, g0u, null, null, 0, 0, (iA0d & 14) | 102236160 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0, 48664, false, false, true);
            OnboardingUiFlowRegenerateNameButton(function0, null, bfm, (iA0d >> 6) & 14, 2);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128012(str, g0u, function0, bRg2, i, i2);
        }
    }

    public static final void OnboardingUiFlowRegenerateNameButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(378283627);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
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
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new ParcelableSnapshotMutableFloatState(0.0f);
                bfm.Ai0(objAaT);
            }
            C00q c00q = (C00q) objAaT;
            C1BO c1boA01 = C31t.A01(new ASj(C2HU.A01, 300, 0), bfm, c00q.AFn(), 3072, 20);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.onboarding_identity_regenerate, 0);
            AuraIconSize auraIconSize = AuraIconSize.TINY;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d48);
            long j = auraTheme.getColors(bfm, 6).secondaryIcon.enabled;
            BRg bRgA02 = C11U.A02(bRg2, 48.0f);
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA67 = bfm.A67(c0dxA0T) | ((iA0T & 14) == 4);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new OnboardingUiFlowNameKt$OnboardingUiFlowRegenerateNameButton$1$1(c0dxA0T, function0, c00q);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA09 = C3U4.A09(C0v5.A04(bRgA02, c1ydA0A, null, (Function0) objAaT2, true), 15.0f);
            boolean zA65 = bfm.A65(c1boA01);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = new OnboardingUiFlowNameKt$OnboardingUiFlowRegenerateNameButton$2$1(c1boA01);
                bfm.Ai0(objAaT3);
            }
            AuraIconKt.m2567AuraIconFHprtrg(AnonymousClass001.A0W(bRgA09, objAaT3), aVyA00, auraIconSize, strA01, j, null, bfm, AnonymousClass001.A03(), 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, bRg2, i, i2);
        }
    }

    public static final void logAgentNameEditClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_IDENTITY, HatchScreen.ONBOARDING_IDENTITY, HatchComponent.ONBOARDING_AGENT_NAME_EDIT, null, null, null);
    }

    /* renamed from: OnboardingUiFlowNameLayout-Kz89ssw, reason: not valid java name */
    public static final void m1619OnboardingUiFlowNameLayoutKz89ssw(final float f, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        bfm.AgG(-1066989386);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            boolean z = (iA04 & 14) == 4;
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new InterfaceC1380AiA() { // from class: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowNameLayout$1$1

                    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowNameKt$OnboardingUiFlowNameLayout$1$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
                        public final /* synthetic */ AZE $placeable;
                        public final /* synthetic */ int $top;

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AYU ayu) {
                            C7384Etj.A0Y(ayu, 0);
                            ayu.A0A(this.$placeable, 0.0f, 0, this.$top);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(AZE aze, int i) {
                            super(1);
                            this.$placeable = aze;
                            this.$top = i;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                            invoke2(ayu);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A00(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A01(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    /* renamed from: measure-3p2s80s */
                    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
                        boolean zA1b = AnonymousClass004.A1b(axy, list);
                        C3TG c3tg = (C3TG) AbstractC0878AGe.A0J(list);
                        int iA03 = Constraints.A03(j);
                        int iA01 = Constraints.A01(j);
                        int iA00 = Constraints.A00(j);
                        AZE azeAQW = c3tg.AQW(Constraints.A05(iA03, iA01, zA1b ? 1 : 0, iA00));
                        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW, Math.max(axy.Abr(f), (iA00 - azeAQW.A00) / 2)), iA01, iA00);
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A02(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A03(c3tf, this, list, i4);
                    }
                };
                bfm.Ai0(objAaT);
            }
            int i4 = (iA04 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA04 >> 6) & 14);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            int i5 = ((i4 << 6) & 896) | 6;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, objAaT, akqA04, bRgA01, iA0J);
            AnonymousClass005.A0q(bbi, bfm, g0v, i5 >> 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new OnboardingUiFlowNameKt$OnboardingUiFlowNameLayout$2(f, bRg, g0v, i, i2);
        }
    }

    public static final BRg onboardingNameEntrance(BRg bRg, OnboardingNameReveal onboardingNameReveal, int i) {
        AnonymousClass003.A0u(bRg, onboardingNameReveal);
        return AbstractC1396AiR.A00(bRg, new AnonymousClass1(onboardingNameReveal, i));
    }
}
