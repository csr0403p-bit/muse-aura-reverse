package com.facebook.aura.nudge;

import X.AKQ;
import X.AOW;
import X.AT5;
import X.AVy;
import X.AXY;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC1396AiR;
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
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BGR;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0lh;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C1YL;
import X.C1b8;
import X.C2VU;
import X.C2av;
import X.C3TG;
import X.C3TH;
import X.C3U4;
import X.C3UC;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.R;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import com.facebook.aura.microphone.view.SilencedByMicrophoneKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.ShadowModifiersKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConversationCardKt {
    public static final int NUDGE_ROW_TRANSITION_DURATION_MS = 280;

    /* renamed from: com.facebook.aura.nudge.ConversationCardKt$ConversationCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NudgeContent $content;
        public final /* synthetic */ ConversationCardControls $controls;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NudgeContent nudgeContent, ConversationCardControls conversationCardControls, BRg bRg, int i, int i2) {
            super(2);
            this.$content = nudgeContent;
            this.$controls = conversationCardControls;
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
            ConversationCardKt.ConversationCard(this.$content, this.$controls, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nudge.ConversationCardKt$ConversationCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NudgeContent $content;
        public final /* synthetic */ ConversationCardControls $controls;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(NudgeContent nudgeContent, ConversationCardControls conversationCardControls, BRg bRg, int i, int i2) {
            super(2);
            this.$content = nudgeContent;
            this.$controls = conversationCardControls;
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
            ConversationCardKt.ConversationCard(this.$content, this.$controls, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nudge.ConversationCardKt$ConversationNudgeCardButtons$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $actionLabel;
        public final /* synthetic */ String $dismissLabel;
        public final /* synthetic */ boolean $isEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAction;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$actionLabel = str;
            this.$dismissLabel = str2;
            this.$isEnabled = z;
            this.$onAction = function0;
            this.$onDismiss = function02;
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
            ConversationCardKt.ConversationNudgeCardButtons(this.$actionLabel, this.$dismissLabel, this.$isEnabled, this.$onAction, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nudge.ConversationCardKt$ConversationNudgeCardHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C127822 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NudgeContent $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127822(NudgeContent nudgeContent, BRg bRg, int i, int i2) {
            super(2);
            this.$content = nudgeContent;
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
            ConversationCardKt.ConversationNudgeCardHeader(this.$content, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nudge.ConversationCardKt$ConversationNudgeCardIcon$1, reason: invalid class name and case insensitive filesystem */
    public final class C127831 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ boolean $isTinted;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127831(int i, boolean z, BRg bRg, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$isTinted = z;
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
            ConversationCardKt.ConversationNudgeCardIcon(this.$iconRes, this.$isTinted, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nudge.ConversationCardKt$ConversationNudgeSheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C127841 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NudgeContent $content;
        public final /* synthetic */ ConversationCardControls $controls;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127841(NudgeContent nudgeContent, ConversationCardControls conversationCardControls, BRg bRg, int i, int i2) {
            super(2);
            this.$content = nudgeContent;
            this.$controls = conversationCardControls;
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
            ConversationCardKt.ConversationNudgeSheet(this.$content, this.$controls, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nudge.ConversationCardKt$ConversationNudgeSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C127852 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ NudgeContent $content;
        public final /* synthetic */ ConversationCardControls $controls;
        public final /* synthetic */ BRg $modifier;

        /* renamed from: com.facebook.aura.nudge.ConversationCardKt$ConversationNudgeSheet$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ NudgeContent $content;
            public final /* synthetic */ ConversationCardControls $controls;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NudgeContent nudgeContent, ConversationCardControls conversationCardControls) {
                super(2);
                this.$content = nudgeContent;
                this.$controls = conversationCardControls;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    NudgeContent nudgeContent = this.$content;
                    String str = nudgeContent.actionLabel;
                    String str2 = nudgeContent.dismissLabel;
                    ConversationCardControls conversationCardControls = this.$controls;
                    ConversationCardKt.ConversationNudgeCardButtons(str, str2, conversationCardControls.isEnabled, conversationCardControls.onAccept, conversationCardControls.onDecline, C3U4.A0C(BRg.A00, 24.0f, 0.0f, 24.0f, 16.0f), bfm, 196608, 0);
                    return;
                }
                bfm.Afo();
            }
        }

        /* renamed from: com.facebook.aura.nudge.ConversationCardKt$ConversationNudgeSheet$2$2, reason: invalid class name and collision with other inner class name */
        public final class C02562 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
            public final /* synthetic */ NudgeContent $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02562(NudgeContent nudgeContent) {
                super(3);
                this.$content = nudgeContent;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
                invoke(c07c, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(C07C c07c, BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                    BS0 bs0 = BRg.A00;
                    BRg bRgA0C = C3U4.A0C(C10G.A02, 24.0f, 16.0f, 24.0f, 12.0f);
                    C3TH c3th = C2VU.A00;
                    C9m9 c9m9A00 = AcQ.A00(12.0f);
                    NudgeContent nudgeContent = this.$content;
                    InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 54);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                    G0V<BFM, Integer, Unit> g0v = nudgeContent.leading;
                    if (g0v != null) {
                        bfm.AgE(-550514206);
                        AnonymousClass001.A1H(bfm, g0v, 0);
                        BBI.A0R(bbi, false);
                    } else {
                        bfm.AgE(-550513394);
                        ConversationCardKt.ConversationNudgeCardIcon(nudgeContent.iconRes, nudgeContent.isIconTinted, null, bfm, 0, 4);
                        BBI.A0R(bbi, false);
                    }
                    String str = nudgeContent.title;
                    C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Emphasized;
                    long jA0C = C06G.A0C(bfm);
                    BRg bRgA04 = C3U4.A04(bs0, 8.0f);
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = ConversationCardKt$ConversationNudgeSheet$2$2$1$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA04, objAaT, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                    String str2 = nudgeContent.subtitle;
                    if (str2 == null) {
                        bfm.AgE(114357684);
                    } else {
                        AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), AnonymousClass006.A0k(bfm, 114357685).bodyRegular, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
                    }
                    AnonymousClass003.A0q(bbi);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127852(ConversationCardControls conversationCardControls, BRg bRg, NudgeContent nudgeContent) {
            super(3);
            this.$controls = conversationCardControls;
            this.$modifier = bRg;
            this.$content = nudgeContent;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
                ConversationCardControls conversationCardControls = this.$controls;
                AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, this.$modifier, null, null, B1V.A00(bfm, new AnonymousClass1(this.$content, conversationCardControls), -925844921), null, conversationCardControls.onDecline, false, false, false, null, B1V.A00(bfm, new C02562(this.$content), -1044024317), bfm, 24582, 48, 1964);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.nudge.ConversationCardKt$ConversationNudgeSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NudgeContent $content;
        public final /* synthetic */ ConversationCardControls $controls;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(NudgeContent nudgeContent, ConversationCardControls conversationCardControls, BRg bRg, int i, int i2) {
            super(2);
            this.$content = nudgeContent;
            this.$controls = conversationCardControls;
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
            ConversationCardKt.ConversationNudgeSheet(this.$content, this.$controls, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nudge.ConversationCardKt$nudgeRowTransition$1, reason: invalid class name and case insensitive filesystem */
    public final class C127861 extends AbstractC7559F3s implements G0U<C2av, Unit> {
        public final /* synthetic */ AT5<Float, AOW> $progress;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2av c2av) {
            C7384Etj.A0Y(c2av, 0);
            c2av.Acj(MutableState.A00(this.$progress));
            c2av.Ad2(MutableState.A00(this.$progress) < 1.0f);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127861(AT5<Float, AOW> at5) {
            super(1);
            this.$progress = at5;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
            invoke2(c2av);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.nudge.ConversationCardKt$nudgeRowTransition$2, reason: invalid class name and case insensitive filesystem */
    public final class C127872 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ AT5<Float, AOW> $progress;

        /* renamed from: com.facebook.aura.nudge.ConversationCardKt$nudgeRowTransition$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ int $height;
            public final /* synthetic */ AZE $placeable;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                AnonymousClass006.A18(ayu, this.$placeable, this.$height);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AZE aze, int i) {
                super(1);
                this.$placeable = aze;
                this.$height = i;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127872(AT5<Float, AOW> at5) {
            super(3);
            this.$progress = at5;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m1609invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m1609invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            ?? A1b = AnonymousClass004.A1b(axy, c3tg);
            AZE azeAQW = c3tg.AQW(j);
            int iA01 = Ab3.A01(azeAQW.A00 * MutableState.A00(this.$progress));
            if (iA01 < A1b) {
                iA01 = 0;
            }
            return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW, iA01), azeAQW.A01, iA01);
        }
    }

    public static final void ConversationNudgeSheet(NudgeContent nudgeContent, ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        BRg bRg2 = bRg;
        bfm.AgG(-1373169255);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nudgeContent, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationCardControls, bfm, i) ? 1 : 0);
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
            if (!conversationCardControls.isEnabled) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new C127841(nudgeContent, conversationCardControls, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            AuraModalBottomSheetWrapperKt.m2406AuraModalBottomSheetWrapperNpZTi58(null, conversationCardControls.onDecline, null, null, 0L, false, false, B1V.A00(bfm, new C127852(conversationCardControls, bRg2, nudgeContent), -367932192), bfm, 12582912, 125);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(nudgeContent, conversationCardControls, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AT5<java.lang.Float, X.AOW> rememberNudgeRowProgress(java.lang.String r8, boolean r9, X.BFM r10, int r11) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r8, r0)
            r7 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.Object r0 = r10.AaT()
            java.lang.Object r5 = X.C78N.A00
            if (r0 != r5) goto L16
            com.facebook.aura.nudge.ConversationCardKt$rememberNudgeRowProgress$hasEntered$2$1 r0 = com.facebook.aura.nudge.ConversationCardKt$rememberNudgeRowProgress$hasEntered$2$1.INSTANCE
            r10.Ai0(r0)
        L16:
            androidx.compose.runtime.MutableState r4 = X.AnonymousClass002.A0N(r10, r0, r1)
            r0 = r11 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L27
            boolean r0 = r10.A65(r8)
            if (r0 != 0) goto L2c
        L27:
            r1 = r11 & 6
            r0 = 0
            if (r1 != r2) goto L2d
        L2c:
            r0 = 1
        L2d:
            java.lang.Object r6 = r10.AaT()
            r3 = 0
            if (r0 != 0) goto L36
            if (r6 != r5) goto L42
        L36:
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r4)
            float r0 = X.AnonymousClass006.A00(r0)
            X.AT5 r6 = X.AnonymousClass002.A0I(r10, r0)
        L42:
            X.AT5 r6 = (X.AT5) r6
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            r0 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L56
            boolean r0 = r10.A66(r9)
            if (r0 != 0) goto L5b
        L56:
            r0 = r11 & 48
            if (r0 == r1) goto L5b
            r7 = 0
        L5b:
            boolean r1 = X.AnonymousClass003.A1O(r10, r6, r4, r7)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L67
            if (r0 != r5) goto L6f
        L67:
            com.facebook.aura.nudge.ConversationCardKt$rememberNudgeRowProgress$1$1 r0 = new com.facebook.aura.nudge.ConversationCardKt$rememberNudgeRowProgress$1$1
            r0.<init>(r9, r6, r4, r3)
            r10.Ai0(r0)
        L6f:
            X.AnonymousClass001.A1A(r10, r0, r8, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nudge.ConversationCardKt.rememberNudgeRowProgress(java.lang.String, boolean, X.BFM, int):X.AT5");
    }

    public static final void ConversationCard(NudgeContent nudgeContent, ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass4;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(nudgeContent, conversationCardControls);
        bfm.AgG(-1552692147);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nudgeContent, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationCardControls, bfm, i) ? 1 : 0);
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
            if (nudgeContent.presentation == NudgePresentation.SHEET) {
                bfm.AgE(546210754);
                ConversationNudgeSheet(nudgeContent, conversationCardControls, null, bfm, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | NudgeContent.$stable | (iA05 & 14) | (ConversationCardControls.$stable << 3), 4);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass4 = new AnonymousClass1(nudgeContent, conversationCardControls, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass4;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 546290517);
            int i4 = NudgeContent.$stable;
            int i5 = iA05 & 14;
            boolean zRememberSilencedByMicrophone = SilencedByMicrophoneKt.rememberSilencedByMicrophone(nudgeContent, bfm, i4 | i5);
            bfm.AgE(-1783482626);
            BRg bRgA09 = C3U4.A09(C1b8.A01(C11U.A03(BGR.A01(C0lh.A02, C10G.A0D(bRg2, 240.0f, Float.NaN)), conversationCardControls.containerShape), conversationCardControls.backgroundColor), 16.0f);
            if (!zRememberSilencedByMicrophone) {
                BS0 bs0 = BRg.A00;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = ConversationCardKt$ConversationCard$2$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                bRgA09 = bRgA09.then(AnonymousClass001.A0Y(bs0, objAaT, false));
            }
            BBI.A0R(bbiA0M, false);
            InterfaceC1380AiA interfaceC1380AiAA13 = AnonymousClass004.A13(bfm, 12.0f);
            long j = bbiA0M.A06;
            int i6 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA13, akqA04, bRgA01, i6);
            ConversationNudgeCardHeader(nudgeContent, null, bfm, i4 | i5, 2);
            ConversationNudgeCardButtons(nudgeContent.actionLabel, nudgeContent.dismissLabel, conversationCardControls.isEnabled, conversationCardControls.onAccept, conversationCardControls.onDecline, null, bfm, 0, 32);
            BBI.A0R(bbiA0M, zA1a);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(nudgeContent, conversationCardControls, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass4;
        }
    }

    public static final void ConversationNudgeCardButtons(String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        String strA0s;
        BRg bRg2 = bRg;
        bfm.AgG(165438174);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA13 = AnonymousClass004.A13(bfm, 8.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA13, akqA04, bRgA01, iA0J);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            int i4 = iA0d << 3;
            int i5 = (iA0d << 21) & 1879048192;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 199680 | i5, i4 & 57344, 0, 134200773);
            if (str2 == null) {
                bfm.AgE(-436511841);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120705);
            } else {
                bfm.AgE(-436512337);
                BBI.A0R(bbi, false);
                strA0s = str2;
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0s, null, c1062ATq, auraButtonStyles.secondary(null, bfm, 48, 1), auraButtonSize, null, false, false, z, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, i5 | 199680, iA0d & 57344, 0, 134200773);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, z, function0, function02, bRg2, i, i2);
        }
    }

    public static final void ConversationNudgeCardHeader(NudgeContent nudgeContent, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1949061058);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nudgeContent, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, 12.0f);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0L, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            G0V<BFM, Integer, Unit> g0v3 = nudgeContent.leading;
            if (g0v3 != null) {
                bfm.AgE(-1672954677);
                AnonymousClass001.A1H(bfm, g0v3, 0);
            } else {
                bfm.AgE(-1672953993);
                ConversationNudgeCardIcon(nudgeContent.iconRes, nudgeContent.isIconTinted, null, bfm, 0, 4);
            }
            BBI.A0R(bbi, false);
            BRg bRgAiP = c90m.AiP(BRg.A00, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(4.0f), bfm, C2VU.A02, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(nudgeContent.title, null, C06G.A0C(bfm), C06G.A0V(bfm), null, null, null, false, 0, nudgeContent.titleMaxLines, 2, null, null, null, bfm, 0, 6, 14834);
            String str = nudgeContent.subtitle;
            if (str == null) {
                bfm.AgE(1652553002);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), AnonymousClass006.A0k(bfm, 1652553003).footnoteRegular, null, null, null, false, 0, nudgeContent.subtitleMaxLines, 2, null, null, null, bfm, 0, 6, 14834);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C127822(nudgeContent, bRg2, i, i2);
        }
    }

    public static final void ConversationNudgeCardIcon(int i, boolean z, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1738425369);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0o(bfm, z);
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
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            C1D3 c1d3A00 = C1D8.A00(10.0f);
            AVy aVyA00 = BOf.A00(bfm, i, iA0D & 14);
            AuraIconKt.m2568AuraIconFyETyZw(C10G.A02(C2VU.A09, C11U.A03(C1b8.A03(ShadowModifiersKt.m2345elevationShadow6ILLrsY(C10G.A07(bRg2, 44.0f), 3.0f, c1d3A00, auraColorsA0c.shadow, 0.08f), c1d3A00, auraColorsA0c.elevated), c1d3A00), false), aVyA00, 28.0f, null, z ? auraColorsA0c.secondaryIcon.enabled : B6A.A07, null, bfm, (AVy.$stable << 3) | 3456, 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C127831(i, z, bRg2, i2, i3);
        }
    }

    public static final BRg nudgeRowTransition(BRg bRg, AT5<Float, AOW> at5) {
        AnonymousClass003.A0u(bRg, at5);
        return C3UC.A00(AbstractC1396AiR.A00(bRg, new C127861(at5)), new C127872(at5));
    }
}
