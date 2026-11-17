package com.facebook.aura.partners.voice.chrome;

import X.AKQ;
import X.APu;
import X.ASj;
import X.ATD;
import X.AWx;
import X.AXY;
import X.AYU;
import X.AZE;
import X.AaC;
import X.AaM;
import X.Ab3;
import X.AbstractC04661Bq;
import X.AbstractC1011APs;
import X.AbstractC1396AiR;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHP;
import X.BPg;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C05433bp;
import X.C07C;
import X.C0z7;
import X.C11U;
import X.C1515AkP;
import X.C1BO;
import X.C1Cd;
import X.C2CK;
import X.C2HU;
import X.C2VU;
import X.C2av;
import X.C3TG;
import X.C3UC;
import X.C3WD;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.EnumC04711Bv;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.HxE;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.header.api.HeaderActionIcon;
import com.facebook.aura.header.api.HeaderActionPill;
import com.facebook.aura.header.view.HatchForegroundHeaderKt;
import com.facebook.aura.header.view.HatchForegroundHeaderState;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.header.view.HeaderButtonKt;
import com.facebook.aura.partners.voice.intf.VoiceCallControlsAction;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.prefs.VoiceAvatarExpandedView;
import com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState;
import com.facebook.aura.partners.voice.screen.VoiceCallCompactControlsKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceFloatingCallControlsKt {
    public static final int CallControlsTransitionDurationMillis = 350;
    public static final float TurnAlignmentTolerancePx = 2.0f;

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$AnimatedCallControlsButton$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ T $button;
        public final /* synthetic */ G0W<T, BFM, Integer, Unit> $content;
        public final /* synthetic */ MutableState<T> $previousButton$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(T t, MutableState<T> mutableState, G0W<? super T, ? super BFM, ? super Integer, Unit> g0w) {
            super(3);
            this.$button = t;
            this.$previousButton$delegate = mutableState;
            this.$content = g0w;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
            int iA05 = i;
            C7384Etj.A0Y(c1Cd, 0);
            if ((i & 6) == 0) {
                iA05 = i | AnonymousClass002.A05(AnonymousClass004.A1X(c1Cd, bfm, iA05) ? 1 : 0);
            }
            boolean z = true;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
                if (c1Cd.AM0().A07.getValue() == EnumC04711Bv.A04) {
                    z = false;
                }
                bfm.AgE(-867664576);
                BRg bRgA0X = BRg.A00;
                if (z) {
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = VoiceFloatingCallControlsKt$AnimatedCallControlsButton$2$1$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    bRgA0X = AnonymousClass001.A0X(bRgA0X, objAaT);
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                Object value = this.$button;
                MutableState<T> mutableState = this.$previousButton$delegate;
                G0W<T, BFM, Integer, Unit> g0w = this.$content;
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0X);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                C0z7 c0z7 = C0z7.A00;
                if (value == null && (value = mutableState.getValue()) == null) {
                    bfm.AgE(899388904);
                } else {
                    bfm.AgE(899388905);
                    AnonymousClass001.A1G(value, bfm, g0w, 0);
                }
                BBI.A0R(bbi, false);
                if (z) {
                    bfm.AgE(899430321);
                    BRg bRgAQJ = c0z7.AQJ(bRgA0X);
                    Unit unit = Unit.INSTANCE;
                    Object objAaT2 = bfm.AaT();
                    if (objAaT2 == C78N.A00) {
                        objAaT2 = new PointerInputEventHandler() { // from class: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$AnimatedCallControlsButton$2$2$2$1
                            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                                return AnonymousClass007.A0W(bRr, htJ, AnonymousClass1.INSTANCE);
                            }

                            /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$AnimatedCallControlsButton$2$2$2$1$1, reason: invalid class name */
                            public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                                public AnonymousClass1() {
                                    super(1);
                                }

                                @Override // X.G0U
                                public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                public final void m1705invokek4lQ0M(long j) {
                                }
                            }
                        };
                        bfm.Ai0(objAaT2);
                    }
                    C01N.A07(bfm, AaM.A00(bRgAQJ, (PointerInputEventHandler) objAaT2, unit));
                } else {
                    bfm.AgE(899533148);
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$AnimatedCallControlsButton$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ T $button;
        public final /* synthetic */ G0W<T, BFM, Integer, Unit> $content;
        public final /* synthetic */ APu $enter;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C07C $this_AnimatedCallControlsButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(C07C c07c, T t, APu aPu, BRg bRg, G0W<? super T, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$this_AnimatedCallControlsButton = c07c;
            this.$button = t;
            this.$enter = aPu;
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceFloatingCallControlsKt.AnimatedCallControlsButton(this.$this_AnimatedCallControlsButton, this.$button, this.$enter, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$ExtraCallControls$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<HxE<? extends VoiceCallControl, ? extends G0V<? super BFM, ? super Integer, ? extends Unit>>, BFM, Integer, Unit> {
        public final /* synthetic */ APu $buttonEnter;
        public final /* synthetic */ Function0<Float> $controlReveal;
        public final /* synthetic */ List<BHP> $moveActions;
        public final /* synthetic */ G0U<VoiceCallControl, Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(APu aPu, Function0<Float> function0, G0U<? super VoiceCallControl, Unit> g0u, List<BHP> list) {
            super(3);
            this.$buttonEnter = aPu;
            this.$controlReveal = function0;
            this.$onClick = g0u;
            this.$moveActions = list;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(HxE<? extends VoiceCallControl, ? extends G0V<? super BFM, ? super Integer, ? extends Unit>> hxE, BFM bfm, Integer num) {
            invoke((HxE<? extends VoiceCallControl, ? extends G0V<? super BFM, ? super Integer, Unit>>) hxE, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(HxE<? extends VoiceCallControl, ? extends G0V<? super BFM, ? super Integer, Unit>> hxE, BFM bfm, int i) {
            int iA0d = i;
            C7384Etj.A0Y(hxE, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, hxE);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                A a = hxE.first;
                G0V g0v = (G0V) hxE.second;
                APu aPu = this.$buttonEnter;
                Function0<Float> function0 = this.$controlReveal;
                G0U<VoiceCallControl, Unit> g0u = this.$onClick;
                List<BHP> list = this.$moveActions;
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bs0);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA0U, g0v2);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
                C90l c90l = C90l.A00;
                VoiceFloatingCallControlsKt.AnimatedCallControlsButton(c90l, a, aPu, null, B1V.A00(bfm, new VoiceFloatingCallControlsKt$ExtraCallControls$1$1$1(g0u, list), -1458280424), bfm, 24582, 4);
                if (g0v != null && function0 != null) {
                    bfm.AgE(-1476368802);
                    BRg bRgRevealFromBottom = VoiceFloatingCallControlsKt.revealFromBottom(bs0, function0);
                    InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA012 = AxM.A01(bfm, bRgRevealFromBottom);
                    AnonymousClass005.A0n(bfm, bbi, function02);
                    BPg.A02(bfm, interfaceC1380AiAA0c, g0v2);
                    BPg.A02(bfm, akqA042, g0v3);
                    AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA012, g0vA0u);
                    AnonymousClass001.A1H(bfm, g0v, 0);
                    BBI.A0R(bbi, true);
                } else {
                    bfm.AgE(-1476275709);
                    VoiceFloatingCallControlsKt.AnimatedCallControlsButton(c90l, g0v, aPu, null, ComposableSingletons$VoiceFloatingCallControlsKt.f212lambda$1119193644, bfm, 24582, 4);
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$ExtraCallControls$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C130802 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $additionalControl;
        public final /* synthetic */ Function0<Float> $controlReveal;
        public final /* synthetic */ VoiceCallControl $displayButton;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<BHP> $moveActions;
        public final /* synthetic */ G0U<VoiceCallControl, Unit> $onClick;
        public final /* synthetic */ C07C $this_ExtraCallControls;
        public final /* synthetic */ boolean $turning;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130802(C07C c07c, VoiceCallControl voiceCallControl, G0V<? super BFM, ? super Integer, Unit> g0v, Function0<Float> function0, boolean z, G0U<? super VoiceCallControl, Unit> g0u, List<BHP> list, BRg bRg, int i, int i2) {
            super(2);
            this.$this_ExtraCallControls = c07c;
            this.$displayButton = voiceCallControl;
            this.$additionalControl = g0v;
            this.$controlReveal = function0;
            this.$turning = z;
            this.$onClick = g0u;
            this.$moveActions = list;
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
            VoiceFloatingCallControlsKt.ExtraCallControls(this.$this_ExtraCallControls, this.$displayButton, this.$additionalControl, this.$controlReveal, this.$turning, this.$onClick, this.$moveActions, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$FloatingCallControlsPill$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<VoiceCallControlsAction> $actions;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $additionalControl;
        public final /* synthetic */ Function0<Float> $controlReveal;
        public final /* synthetic */ VoiceCallControl $displayButton;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ VoiceCallControl $micControl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchCallControlsMotion $motion;
        public final /* synthetic */ boolean $muteAvailable;
        public final /* synthetic */ G0U<VoiceCallControl, Unit> $onClick;
        public final /* synthetic */ Function0<Float> $surfaceLeft;
        public final /* synthetic */ PillTurn $turn;
        public final /* synthetic */ VoiceCallSlotAnimation $turnAnimation;
        public final /* synthetic */ Function0<Float> $turnInset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(VoiceCallControl voiceCallControl, boolean z, HatchCallControlsMotion hatchCallControlsMotion, PillTurn pillTurn, VoiceCallSlotAnimation voiceCallSlotAnimation, Function0<Float> function0, Function0<Float> function02, VoiceCallControl voiceCallControl2, G0V<? super BFM, ? super Integer, Unit> g0v, Function0<Float> function03, List<? extends VoiceCallControlsAction> list, boolean z2, G0U<? super VoiceCallControl, Unit> g0u, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$micControl = voiceCallControl;
            this.$muteAvailable = z;
            this.$motion = hatchCallControlsMotion;
            this.$turn = pillTurn;
            this.$turnAnimation = voiceCallSlotAnimation;
            this.$turnInset = function0;
            this.$surfaceLeft = function02;
            this.$displayButton = voiceCallControl2;
            this.$additionalControl = g0v;
            this.$controlReveal = function03;
            this.$actions = list;
            this.$enabled = z2;
            this.$onClick = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceFloatingCallControlsKt.FloatingCallControlsPill(this.$micControl, this.$muteAvailable, this.$motion, this.$turn, this.$turnAnimation, this.$turnInset, this.$surfaceLeft, this.$displayButton, this.$additionalControl, this.$controlReveal, this.$actions, this.$enabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$PillTurnIconImage$3, reason: invalid class name and case insensitive filesystem */
    public final class C130813 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VoiceCallSlotAnimation $animation;
        public final /* synthetic */ PillTurnIcon $icon;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Float> $surfaceLeft;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130813(PillTurnIcon pillTurnIcon, VoiceCallSlotAnimation voiceCallSlotAnimation, Function0<Float> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$icon = pillTurnIcon;
            this.$animation = voiceCallSlotAnimation;
            this.$surfaceLeft = function0;
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
            VoiceFloatingCallControlsKt.PillTurnIconImage(this.$icon, this.$animation, this.$surfaceLeft, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$PublishVoiceCallSlotAnimation$2, reason: invalid class name and case insensitive filesystem */
    public final class C130822 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ VoiceCallSlotAnimation $animation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130822(VoiceCallSlotAnimation voiceCallSlotAnimation, int i) {
            super(2);
            this.$animation = voiceCallSlotAnimation;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceFloatingCallControlsKt.PublishVoiceCallSlotAnimation(this.$animation, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$VoiceCallControlButton$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VoiceCallSlotAnimation $animation;
        public final /* synthetic */ VoiceCallControl $control;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<VoiceCallControl, Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(VoiceCallControl voiceCallControl, G0U<? super VoiceCallControl, Unit> g0u, BRg bRg, VoiceCallSlotAnimation voiceCallSlotAnimation, int i, int i2) {
            super(2);
            this.$control = voiceCallControl;
            this.$onClick = g0u;
            this.$modifier = bRg;
            this.$animation = voiceCallSlotAnimation;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceFloatingCallControlsKt.VoiceCallControlButton(this.$control, this.$onClick, this.$modifier, this.$animation, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$VoiceFloatingCallControls$1, reason: invalid class name and case insensitive filesystem */
    public final class C130831 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $additionalControl;
        public final /* synthetic */ Function0<Boolean> $isCaptionSurface;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130831(Function0<Boolean> function0, BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$isCaptionSurface = function0;
            this.$modifier = bRg;
            this.$visible = z;
            this.$additionalControl = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceFloatingCallControlsKt.VoiceFloatingCallControls(this.$isCaptionSurface, this.$modifier, this.$visible, this.$additionalControl, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$VoiceFloatingCallControls$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
        public final /* synthetic */ boolean $hiddenForPip;
        public final /* synthetic */ HatchStatusPillMetrics $metrics;
        public final /* synthetic */ HatchCallControlsMotion $motion;
        public final /* synthetic */ CallControlsPresentation $presentation;
        public final /* synthetic */ CallControlsPresentationState $presentationState;
        public final /* synthetic */ C1BO<VoiceAvatarExpandedView> $rememberedSize;
        public final /* synthetic */ VoiceCallStateHolder $stateHolder;
        public final /* synthetic */ Function0<Float> $surfaceLeft;
        public final /* synthetic */ PillTurn $turn;
        public final /* synthetic */ VoiceCallSlotAnimation $turnAnimation;
        public final /* synthetic */ Function0<Float> $turnInset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(CallControlsPresentation callControlsPresentation, HatchCallControlsMotion hatchCallControlsMotion, PillTurn pillTurn, VoiceCallSlotAnimation voiceCallSlotAnimation, Function0<Float> function0, Function0<Float> function02, CallControlsPresentationState callControlsPresentationState, boolean z, VoiceCallStateHolder voiceCallStateHolder, VoiceAvatarFullScreenState voiceAvatarFullScreenState, HatchStatusPillMetrics hatchStatusPillMetrics, C1BO<? extends VoiceAvatarExpandedView> c1bo) {
            super(3);
            this.$presentation = callControlsPresentation;
            this.$motion = hatchCallControlsMotion;
            this.$turn = pillTurn;
            this.$turnAnimation = voiceCallSlotAnimation;
            this.$turnInset = function0;
            this.$surfaceLeft = function02;
            this.$presentationState = callControlsPresentationState;
            this.$hiddenForPip = z;
            this.$stateHolder = voiceCallStateHolder;
            this.$fullScreen = voiceAvatarFullScreenState;
            this.$metrics = hatchStatusPillMetrics;
            this.$rememberedSize = c1bo;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C1Cd r37, X.BFM r38, int r39) {
            /*
                r36 = this;
                r26 = 0
                r0 = r37
                r1 = r39
                boolean r0 = X.AnonymousClass005.A1N(r1, r0)
                r10 = r38
                boolean r0 = X.AnonymousClass001.A1b(r0, r10, r1)
                if (r0 == 0) goto Lc8
                X.AKH<X.0Hi> r0 = X.Am0.A05
                java.lang.Object r13 = r10.A6v(r0)
                X.0Hi r13 = (X.C0Hi) r13
                r0 = r36
                com.facebook.aura.partners.voice.chrome.CallControlsPresentation r2 = r0.$presentation
                com.facebook.aura.partners.voice.chrome.VoiceCallControl r1 = r2.micControl
                r39 = r1
                boolean r1 = r2.muteAvailable
                r38 = r1
                com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion r1 = r0.$motion
                r37 = r1
                com.facebook.aura.partners.voice.chrome.PillTurn r1 = r0.$turn
                r36 = r1
                com.facebook.aura.partners.voice.chrome.VoiceCallSlotAnimation r1 = r0.$turnAnimation
                r35 = r1
                kotlin.jvm.functions.Function0<java.lang.Float> r15 = r0.$turnInset
                kotlin.jvm.functions.Function0<java.lang.Float> r14 = r0.$surfaceLeft
                com.facebook.aura.partners.voice.chrome.VoiceCallControl r9 = r2.displayButton
                X.G0V<X.BFM, java.lang.Integer, kotlin.Unit> r8 = r2.additionalControl
                kotlin.jvm.functions.Function0<java.lang.Float> r7 = r2.controlReveal
                java.util.List<com.facebook.aura.partners.voice.intf.VoiceCallControlsAction> r6 = r2.actions
                com.facebook.aura.partners.voice.chrome.CallControlsPresentationState r2 = r0.$presentationState
                boolean r1 = r2.visible
                if (r1 == 0) goto L4a
                boolean r1 = r0.$hiddenForPip
                r21 = 1
                if (r1 == 0) goto L4c
            L4a:
                r21 = 0
            L4c:
                boolean r2 = r10.A67(r2)
                boolean r1 = r0.$hiddenForPip
                boolean r2 = X.AnonymousClass001.A1U(r10, r1, r2)
                com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r1 = r0.$stateHolder
                boolean r2 = X.AnonymousClass001.A1T(r10, r1, r2)
                com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r1 = r0.$fullScreen
                boolean r2 = X.AnonymousClass001.A1R(r10, r1, r2)
                com.facebook.aura.header.view.HatchStatusPillMetrics r1 = r0.$metrics
                boolean r2 = X.AnonymousClass004.A1S(r10, r1, r13, r2)
                X.1BO<com.facebook.aura.partners.voice.prefs.VoiceAvatarExpandedView> r1 = r0.$rememberedSize
                boolean r1 = X.AnonymousClass001.A1R(r10, r1, r2)
                com.facebook.aura.partners.voice.chrome.CallControlsPresentationState r12 = r0.$presentationState
                boolean r11 = r0.$hiddenForPip
                com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r5 = r0.$stateHolder
                com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r4 = r0.$fullScreen
                com.facebook.aura.header.view.HatchStatusPillMetrics r3 = r0.$metrics
                X.1BO<com.facebook.aura.partners.voice.prefs.VoiceAvatarExpandedView> r2 = r0.$rememberedSize
                java.lang.Object r0 = r10.AaT()
                if (r1 != 0) goto L84
                java.lang.Object r1 = X.C78N.A00
                if (r0 != r1) goto L9c
            L84:
                com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$VoiceFloatingCallControls$7$1$1 r0 = new com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$VoiceFloatingCallControls$7$1$1
                r27 = r0
                r28 = r12
                r29 = r11
                r30 = r5
                r31 = r4
                r32 = r3
                r33 = r13
                r34 = r2
                r27.<init>(r28, r29, r30, r31, r32, r33, r34)
                r10.Ai0(r0)
            L9c:
                X.G0U r0 = (X.G0U) r0
                int r1 = com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion.$stable
                int r25 = r1 << 6
                int r1 = com.facebook.aura.partners.voice.chrome.VoiceCallSlotAnimation.$stable
                int r1 = r1 << 12
                r25 = r25 | r1
                r23 = 0
                r27 = 8192(0x2000, float:1.14794E-41)
                r24 = r10
                r16 = r14
                r17 = r9
                r18 = r8
                r19 = r7
                r20 = r6
                r22 = r0
                r11 = r38
                r12 = r37
                r13 = r36
                r14 = r35
                r10 = r39
                com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt.FloatingCallControlsPill(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                return
            Lc8:
                r10.Afo()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt.AnonymousClass7.invoke(X.1Cd, X.BFM, int):void");
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$VoiceFloatingCallControls$8, reason: invalid class name and case insensitive filesystem */
    public final class C130848 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $additionalControl;
        public final /* synthetic */ Function0<Boolean> $isCaptionSurface;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130848(Function0<Boolean> function0, BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$isCaptionSurface = function0;
            this.$modifier = bRg;
            this.$visible = z;
            this.$additionalControl = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceFloatingCallControlsKt.VoiceFloatingCallControls(this.$isCaptionSurface, this.$modifier, this.$visible, this.$additionalControl, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$morphCallControlsSize$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class C130851 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ VoiceCallSlotAnimation $animation;

        /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$morphCallControlsSize$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02871 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ AZE $placeable;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                AYU.A04(ayu, this.$placeable, 0, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02871(AZE aze) {
                super(1);
                this.$placeable = aze;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130851(VoiceCallSlotAnimation voiceCallSlotAnimation) {
            super(3);
            this.$animation = voiceCallSlotAnimation;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m1713invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m1713invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            AnonymousClass003.A0u(axy, c3tg);
            AZE azeAQW = c3tg.AQW(j);
            int iAbr = axy.Abr(HeaderButtonKt.PillIconTouchTarget);
            int i = azeAQW.A00;
            int iA04 = ATD.A04(C3WD.A01(this.$animation.getHeightProgress(), Math.min(iAbr, i), i), Constraints.A02(j), Constraints.A00(j));
            return AXY.A01(axy, new C02871(azeAQW), azeAQW.A01, iA04);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$revealFromBottom$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class C130861 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ Function0<Float> $fraction;

        /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$revealFromBottom$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02881 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ int $height;
            public final /* synthetic */ AZE $placeable;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                AZE aze = this.$placeable;
                ayu.A0A(aze, 0.0f, 0, this.$height - aze.A00);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02881(AZE aze, int i) {
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
        public C130861(Function0<Float> function0) {
            super(3);
            this.$fraction = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m1714invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m1714invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            AnonymousClass003.A0u(axy, c3tg);
            AZE azeAQW = c3tg.AQW(j);
            int iA02 = Ab3.A02(azeAQW.A00, AnonymousClass003.A00(AnonymousClass003.A04(this.$fraction)));
            return AXY.A01(axy, new C02881(azeAQW, iA02), azeAQW.A01, iA02);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$turnCallShift$1, reason: invalid class name and case insensitive filesystem */
    public final class C130871 extends AbstractC7559F3s implements G0U<C2av, Unit> {
        public final /* synthetic */ VoiceCallSlotAnimation $animation;
        public final /* synthetic */ PillTurn $turn;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2av c2av) {
            C7384Etj.A0Y(c2av, 0);
            c2av.Af5(this.$turn.callShift * (1.0f - this.$animation.getWidthProgress()));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130871(PillTurn pillTurn, VoiceCallSlotAnimation voiceCallSlotAnimation) {
            super(1);
            this.$turn = pillTurn;
            this.$animation = voiceCallSlotAnimation;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
            invoke2(c2av);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$turnReveal$1, reason: invalid class name and case insensitive filesystem */
    public final class C130881 extends AbstractC7559F3s implements G0U<C2av, Unit> {
        public final /* synthetic */ VoiceCallSlotAnimation $animation;
        public final /* synthetic */ Function0<Float> $inset;
        public final /* synthetic */ PillTurn $turn;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2av c2av) {
            C7384Etj.A0Y(c2av, 0);
            c2av.Af5(this.$turn.towardsEnd * AnonymousClass003.A04(this.$inset));
            c2av.Acj(this.$animation.getRevealAlpha());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130881(PillTurn pillTurn, Function0<Float> function0, VoiceCallSlotAnimation voiceCallSlotAnimation) {
            super(1);
            this.$turn = pillTurn;
            this.$inset = function0;
            this.$animation = voiceCallSlotAnimation;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
            invoke2(c2av);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$turnWidth$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C130891 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ Function0<Float> $inset;

        /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$turnWidth$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02891 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ AZE $placeable;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                ayu.A0A(this.$placeable, 0.0f, 0, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02891(AZE aze) {
                super(1);
                this.$placeable = aze;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130891(Function0<Float> function0) {
            super(3);
            this.$inset = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m1715invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m1715invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            ?? A1b = AnonymousClass004.A1b(axy, c3tg);
            int iAbr = axy.Abr(HeaderButtonKt.PillIconTouchTarget) + Ab3.A01(AnonymousClass003.A04(this.$inset));
            if (iAbr < A1b) {
                iAbr = 0;
            }
            AZE azeAQW = c3tg.AQW(Constraints.A05(iAbr, iAbr, Constraints.A02(j), Constraints.A00(j)));
            return AnonymousClass002.A0X(axy, new C02891(azeAQW), azeAQW.A01, azeAQW.A00);
        }
    }

    public static final void PillTurnIconImage(PillTurnIcon pillTurnIcon, VoiceCallSlotAnimation voiceCallSlotAnimation, Function0<Float> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1510051515);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, pillTurnIcon) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(voiceCallSlotAnimation, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HeaderActionIcon headerActionIcon = pillTurnIcon.icon;
            long j = headerActionIcon.enabled ? C3cI.A0K(bfm, 539449068).primaryIcon.enabled : C3cI.A0K(bfm, 539450733).primaryIcon.disabled;
            BBI.A0R((BBI) bfm, false);
            boolean zA1B = AnonymousClass003.A1B(iA0d) | AnonymousClass003.A1D(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new VoiceFloatingCallControlsKt$PillTurnIconImage$1$1(pillTurnIcon, function0);
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = C3UC.A00(bRg2, (G0W) objAaT);
            boolean z = (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(voiceCallSlotAnimation));
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceFloatingCallControlsKt$PillTurnIconImage$2$1(voiceCallSlotAnimation);
                bfm.Ai0(objAaT2);
            }
            HeaderButtonKt.m1026HeaderActionIconImage3IgeMak(headerActionIcon, j, AnonymousClass001.A0W(bRgA00, objAaT2), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130813(pillTurnIcon, voiceCallSlotAnimation, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.partners.voice.chrome.CallControlsPresentationState rememberCallControlsPresentation(com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r3, boolean r4, long r5, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r7, kotlin.jvm.functions.Function0<java.lang.Boolean> r8, X.BFM r9, int r10) {
        /*
            r1 = 0
            if (r4 == 0) goto L68
            r0 = 1810608964(0x6bebb344, float:5.6988825E26)
            r9.AgE(r0)
            int r1 = com.facebook.aura.partners.voice.intf.VoiceCallStateHolder.$stable
            r0 = r10 & 14
            r1 = r1 | r0
            int r0 = r10 >> 6
            int r0 = X.AnonymousClass002.A07(r0, r1)
            com.facebook.aura.partners.voice.chrome.CallControlsPresentation r1 = rememberCurrentCallControlsPresentation(r3, r7, r8, r9, r0)
            X.AnonymousClass002.A19(r9)
        L1b:
            r0 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r4 = 1
            r3 = 256(0x100, float:3.59E-43)
            if (r0 <= r3) goto L2a
            boolean r0 = r9.A64(r5)
            if (r0 != 0) goto L2f
        L2a:
            r2 = r10 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r2 != r3) goto L30
        L2f:
            r0 = 1
        L30:
            java.lang.Object r3 = r9.AaT()
            if (r0 != 0) goto L3a
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L3e
        L3a:
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = X.AnonymousClass004.A11(r9, r1)
        L3e:
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            boolean r2 = X.AnonymousClass003.A1N(r9, r1, r3)
            java.lang.Object r0 = r9.AaT()
            if (r2 != 0) goto L4e
            java.lang.Object r2 = X.C78N.A00
            if (r0 != r2) goto L56
        L4e:
            com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$rememberCallControlsPresentation$1$1 r0 = new com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$rememberCallControlsPresentation$1$1
            r0.<init>(r1, r3)
            r9.Ai0(r0)
        L56:
            X.AnonymousClass001.A15(r9, r0)
            if (r1 != 0) goto L62
            java.lang.Object r1 = r3.getValue()
            com.facebook.aura.partners.voice.chrome.CallControlsPresentation r1 = (com.facebook.aura.partners.voice.chrome.CallControlsPresentation) r1
            r4 = 0
        L62:
            com.facebook.aura.partners.voice.chrome.CallControlsPresentationState r0 = new com.facebook.aura.partners.voice.chrome.CallControlsPresentationState
            r0.<init>(r1, r4)
            return r0
        L68:
            r0 = 294400594(0x118c3252, float:2.2119118E-28)
            X.AnonymousClass004.A1A(r9, r0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt.rememberCallControlsPresentation(com.facebook.aura.partners.voice.intf.VoiceCallStateHolder, boolean, long, X.G0V, kotlin.jvm.functions.Function0, X.BFM, int):com.facebook.aura.partners.voice.chrome.CallControlsPresentationState");
    }

    public static final <T> void AnimatedCallControlsButton(C07C c07c, T t, APu aPu, BRg bRg, G0W<? super T, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1583712316);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(t, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, aPu);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, t);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean z = (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(t));
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == obj) {
                objAaT2 = new VoiceFloatingCallControlsKt$AnimatedCallControlsButton$1$1(t, mutableState);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A15(bfm, objAaT2);
            AbstractC04661Bq.A06(aPu, AbstractC1011APs.A0G(new ASj(C2HU.A01, 350, 0), C2VU.A03, new C05433bp(11)), c07c, bfm, bRg2, "callControlsButton", B1V.A00(bfm, new AnonymousClass2(t, mutableState, g0w), 2135407596), (iA0d & 14) | 1769472 | ((iA0d >> 3) & 896) | ((iA0d << 3) & 7168), 0, AnonymousClass002.A1X(t));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(c07c, t, aPu, bRg2, g0w, i, i2);
        }
    }

    public static final void ExtraCallControls(C07C c07c, VoiceCallControl voiceCallControl, G0V<? super BFM, ? super Integer, Unit> g0v, Function0<Float> function0, boolean z, G0U<? super VoiceCallControl, Unit> g0u, List<BHP> list, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1084683785);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, AnonymousClass003.A0K(voiceCallControl));
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass002.A01(AnonymousClass004.A1R(bfm, list, 2097152, i) ? 1 : 0);
        }
        int i3 = i2 & 64;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA0d, 4793490), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0d >> 12;
            APu aPuRememberCallControlsButtonEnter = rememberCallControlsButtonEnter(z, bfm, i4 & 14);
            boolean zA1I = AnonymousClass004.A1I(iA0d) | ((iA0d & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1I || objAaT == C78N.A00) {
                objAaT = (voiceCallControl == null && g0v == null) ? null : C3cG.A0r(voiceCallControl, g0v);
                bfm.Ai0(objAaT);
            }
            AnimatedCallControlsButton(c07c, objAaT, aPuRememberCallControlsButtonEnter, bRg2, B1V.A00(bfm, new AnonymousClass1(aPuRememberCallControlsButtonEnter, function0, g0u, list), 1041074134), bfm, (iA0d & 14) | RuntimeInternals.IOPRIO_BACKGROUND | (i4 & 7168), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130802(c07c, voiceCallControl, g0v, function0, z, g0u, list, bRg2, i, i2);
        }
    }

    public static final void VoiceCallControlButton(VoiceCallControl voiceCallControl, G0U<? super VoiceCallControl, Unit> g0u, BRg bRg, VoiceCallSlotAnimation voiceCallSlotAnimation, BFM bfm, int i, int i2) {
        BRg bRgThen;
        VoiceCallSlotAnimation voiceCallSlotAnimation2 = voiceCallSlotAnimation;
        BRg bRg2 = bRg;
        bfm.AgG(-1432364833);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, voiceCallControl) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass002.A00(AnonymousClass004.A1a(voiceCallSlotAnimation2, bfm, i) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 1171, 1170), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            B1U b1uA00 = null;
            if (i4 != 0) {
                voiceCallSlotAnimation2 = null;
            }
            HeaderActionIcon icon = voiceCallControl.getIcon();
            boolean zA1B = AnonymousClass003.A1B(iA08) | AnonymousClass003.A1C(iA08);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new VoiceFloatingCallControlsKt$VoiceCallControlButton$1$1(g0u, voiceCallControl);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            String testTag = voiceCallControl.getTestTag();
            bfm.AgE(-2113058744);
            if (voiceCallControl == VoiceCallControl.MUTE || voiceCallControl == VoiceCallControl.UNMUTE) {
                bRgThen = bRg2.then(VoiceCallCompactControlsKt.muteSwitchSemantics(BRg.A00, voiceCallControl == VoiceCallControl.UNMUTE, bfm, 6));
            } else {
                bRgThen = bRg2;
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (voiceCallSlotAnimation2 == null) {
                bfm.AgE(-1080103179);
            } else {
                bfm.AgE(-1080103178);
                b1uA00 = B1V.A00(bfm, new VoiceFloatingCallControlsKt$VoiceCallControlButton$3$1(voiceCallSlotAnimation2), -1637574971);
            }
            BBI.A0R(bbi, false);
            HeaderButtonKt.m1027HeaderIconButtonrglY58k(icon, function0, testTag, bRgThen, null, false, false, b1uA00, bfm, 0, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(voiceCallControl, g0u, bRg2, voiceCallSlotAnimation2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0385 A[PHI: r36
  0x0385: PHI (r36v1 X.APu) = (r36v0 X.APu), (r36v3 X.APu) binds: [B:124:0x0382, B:117:0x0327] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceFloatingCallControls(kotlin.jvm.functions.Function0<java.lang.Boolean> r44, X.BRg r45, boolean r46, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r47, X.BFM r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt.VoiceFloatingCallControls(kotlin.jvm.functions.Function0, X.BRg, boolean, X.G0V, X.BFM, int, int):void");
    }

    public static final BRg morphCallControlsSize(BRg bRg, VoiceCallSlotAnimation voiceCallSlotAnimation) {
        return voiceCallSlotAnimation != null ? C3UC.A00(bRg, new C130851(voiceCallSlotAnimation)) : bRg;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.partners.voice.chrome.VoiceCallSlotAnimation rememberCallButtonAnimation(boolean r8, long r9, X.BFM r11, int r12) {
        /*
            X.AKH<com.facebook.aura.header.view.HatchStatusPillMetrics> r0 = com.facebook.aura.header.view.HatchStatusPillMetricsKt.LocalHatchStatusPillMetrics
            r11.A6v(r0)
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r6 = X.C3cH.A0V(r11)
            r5 = r12 & 14
            r0 = r5 ^ 6
            r1 = 4
            r7 = 0
            if (r0 <= r1) goto L17
            boolean r0 = r11.A66(r8)
            if (r0 != 0) goto L1c
        L17:
            r0 = r12 & 6
            r3 = 0
            if (r0 != r1) goto L1d
        L1c:
            r3 = 1
        L1d:
            r0 = r12 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L2b
            boolean r0 = r11.A64(r9)
            if (r0 != 0) goto L30
        L2b:
            r1 = r12 & 48
            r0 = 0
            if (r1 != r2) goto L31
        L30:
            r0 = 1
        L31:
            boolean r1 = X.AnonymousClass002.A1W(r11, r6, r0, r3)
            java.lang.Object r2 = r11.AaT()
            r0 = 0
            if (r1 != 0) goto L40
            java.lang.Object r1 = X.C78N.A00
            if (r2 != r1) goto L67
        L40:
            androidx.compose.runtime.snapshots.Snapshot r4 = androidx.compose.runtime.snapshots.Snapshot.A03()
            if (r4 == 0) goto L51
            X.G0U r3 = r4.A0D()
        L4a:
            androidx.compose.runtime.snapshots.Snapshot r2 = androidx.compose.runtime.snapshots.Snapshot.A04(r4)
            if (r8 != 0) goto L60
            goto L53
        L51:
            r3 = r0
            goto L4a
        L53:
            boolean r1 = r6.getActive()     // Catch: java.lang.Throwable -> L58
            goto L5d
        L58:
            r0 = move-exception
            androidx.compose.runtime.snapshots.Snapshot.A07(r4, r2, r3)
            throw r0
        L5d:
            if (r1 == 0) goto L60
            r7 = 1
        L60:
            androidx.compose.runtime.snapshots.Snapshot.A07(r4, r2, r3)
            java.lang.Boolean r2 = X.AnonymousClass001.A0j(r11, r7)
        L67:
            boolean r1 = X.AnonymousClass001.A1X(r2)
            if (r1 == 0) goto L71
            X.AT5<java.lang.Float, X.AOW> r0 = r6.progressAnimatable
            X.AT7<T, V extends X.AOd> r0 = r0.A04
        L71:
            com.facebook.aura.partners.voice.chrome.VoiceCallSlotAnimation r0 = com.facebook.aura.partners.voice.chrome.VoiceCallChromeKt.rememberVoiceCallSlotAnimation(r8, r0, r11, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt.rememberCallButtonAnimation(boolean, long, X.BFM, int):com.facebook.aura.partners.voice.chrome.VoiceCallSlotAnimation");
    }

    public static final String rememberConnectionTestTag(BFM bfm, int i) {
        return C1BO.A0F(C2CK.A02(bfm, VoiceCallStateHolder.Companion.getInstance(AnonymousClass002.A0h(bfm)).isInputReady)) ? "hatch-voice-call-connected" : "hatch-voice-call-connecting";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.partners.voice.chrome.CallControlsPresentation rememberCurrentCallControlsPresentation(com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r19, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r20, kotlin.jvm.functions.Function0<java.lang.Boolean> r21, X.BFM r22, int r23) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt.rememberCurrentCallControlsPresentation(com.facebook.aura.partners.voice.intf.VoiceCallStateHolder, X.G0V, kotlin.jvm.functions.Function0, X.BFM, int):com.facebook.aura.partners.voice.chrome.CallControlsPresentation");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.partners.voice.chrome.PillTurn rememberPillTurn(boolean r15, com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion r16, boolean r17, X.BFM r18, int r19) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt.rememberPillTurn(boolean, com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion, boolean, X.BFM, int):com.facebook.aura.partners.voice.chrome.PillTurn");
    }

    public static final BRg turnCallShift(BRg bRg, PillTurn pillTurn, VoiceCallSlotAnimation voiceCallSlotAnimation) {
        return (pillTurn == null || voiceCallSlotAnimation == null) ? bRg : AbstractC1396AiR.A00(bRg, new C130871(pillTurn, voiceCallSlotAnimation));
    }

    public static final BRg turnReveal(BRg bRg, PillTurn pillTurn, VoiceCallSlotAnimation voiceCallSlotAnimation, Function0<Float> function0) {
        return (pillTurn == null || voiceCallSlotAnimation == null) ? bRg : AbstractC1396AiR.A00(bRg, new C130881(pillTurn, function0, voiceCallSlotAnimation));
    }

    public static final BRg turnWidth(BRg bRg, Function0<Float> function0) {
        return C3UC.A00(bRg, new C130891(function0));
    }

    public static final void PublishVoiceCallSlotAnimation(VoiceCallSlotAnimation voiceCallSlotAnimation, BFM bfm, int i) {
        BBb bBbAAc;
        Object c130822;
        bfm.AgG(82349420);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceCallSlotAnimation, bfm, i) ? 1 : 0) | i : i;
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            VoiceCallChromeState voiceCallChromeState = (VoiceCallChromeState) bfm.A6v(VoiceCallChromeKt.LocalVoiceCallChrome);
            if (voiceCallChromeState == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c130822 = new VoiceFloatingCallControlsKt$PublishVoiceCallSlotAnimation$chrome$1(voiceCallSlotAnimation, i);
                    C3cG.A1D(bBbAAc, c130822);
                }
                return;
            }
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A65(voiceCallSlotAnimation))) {
                z = true;
            }
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0R(bfm, new VoiceFloatingCallControlsKt$PublishVoiceCallSlotAnimation$onScreen$2$1(voiceCallSlotAnimation));
            }
            VoiceCallSlotAnimation voiceCallSlotAnimation2 = C1BO.A0F((C1BO) objAaT) ? voiceCallSlotAnimation : null;
            boolean zA1J = AnonymousClass003.A1J(bfm, voiceCallChromeState, voiceCallSlotAnimation2);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceFloatingCallControlsKt$PublishVoiceCallSlotAnimation$1$1(voiceCallChromeState, voiceCallSlotAnimation2);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A19(bfm, objAaT2, voiceCallChromeState, voiceCallSlotAnimation2);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c130822 = new C130822(voiceCallSlotAnimation, i);
            C3cG.A1D(bBbAAc, c130822);
        }
    }

    public static final List<VoiceCallControlsAction> rememberAvailableCallControlsActions(BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new ArrayList(0);
            bfm.Ai0(objAaT);
        }
        bfm.AgE(-1639888965);
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : (List) objAaT) {
            if (((VoiceCallControlsAction) obj).isAvailable(bfm, 0)) {
                arrayListA0h.add(obj);
            }
        }
        AnonymousClass001.A1D(bfm);
        return arrayListA0h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013b  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.partners.voice.chrome.CallControlsBounds rememberCallControlsBounds(int r26, X.BFM r27, int r28) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt.rememberCallControlsBounds(int, X.BFM, int):com.facebook.aura.partners.voice.chrome.CallControlsBounds");
    }

    public static final APu rememberCallControlsButtonEnter(boolean z, BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = AbstractC1011APs.A06(AnonymousClass002.A0J(C2HU.A01, 350), C2VU.A03, new C05433bp(8));
            bfm.Ai0(objAaT);
        }
        return z ? APu.A00 : (APu) objAaT;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<X.BHP> rememberCallControlsMoveActions(com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion r8, X.BFM r9, int r10) {
        /*
            r0 = 2131887744(0x7f120680, float:1.9410104E38)
            java.lang.String r7 = X.AbstractC2271BQs.A01(r9, r0)
            r0 = 2131887745(0x7f120681, float:1.9410106E38)
            java.lang.String r6 = X.AbstractC2271BQs.A01(r9, r0)
            r0 = 2131887742(0x7f12067e, float:1.94101E38)
            java.lang.String r4 = X.AbstractC2271BQs.A01(r9, r0)
            r0 = 2131887743(0x7f12067f, float:1.9410102E38)
            java.lang.String r3 = X.AbstractC2271BQs.A01(r9, r0)
            r0 = r10 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L29
            boolean r0 = r9.A65(r8)
            if (r0 != 0) goto L2e
        L29:
            r1 = r10 & 6
            r0 = 0
            if (r1 != r2) goto L2f
        L2e:
            r0 = 1
        L2f:
            boolean r0 = X.AnonymousClass005.A1T(r9, r7, r6, r4, r0)
            boolean r0 = X.AnonymousClass001.A1R(r9, r3, r0)
            java.lang.Object r5 = r9.AaT()
            if (r0 != 0) goto L41
            java.lang.Object r0 = X.C78N.A00
            if (r5 != r0) goto L7c
        L41:
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r4, r3}
            java.util.List r6 = java.util.Arrays.asList(r0)
            X.Ey9 r0 = com.facebook.aura.partners.voice.chrome.CallControlsCorner.getEntries()
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r4 = r0.iterator()
        L55:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r3 = r4.next()
            com.facebook.aura.partners.voice.chrome.CallControlsCorner r3 = (com.facebook.aura.partners.voice.chrome.CallControlsCorner) r3
            int r0 = r3.ordinal()
            java.lang.Object r2 = r6.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$rememberCallControlsMoveActions$1$1$1 r1 = new com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$rememberCallControlsMoveActions$1$1$1
            r1.<init>(r8, r3)
            X.BHP r0 = new X.BHP
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L55
        L79:
            r9.Ai0(r5)
        L7c:
            java.util.List r5 = (java.util.List) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt.rememberCallControlsMoveActions(com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion, X.BFM, int):java.util.List");
    }

    public static final BRg revealFromBottom(BRg bRg, Function0<Float> function0) {
        return C3UC.A00(C11U.A00(bRg), new C130861(function0));
    }

    public static final AaC sideChatPillBounds(BFM bfm, int i) {
        CallButtonSource callButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome;
        HatchForegroundHeaderState hatchForegroundHeaderState;
        bfm.AgE(988307446);
        VoiceCallChromeState voiceCallChromeState = (VoiceCallChromeState) bfm.A6v(VoiceCallChromeKt.LocalVoiceCallChrome);
        AaC aaC = null;
        if (voiceCallChromeState != null && (callButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome = voiceCallChromeState.getCallButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome()) != null && (hatchForegroundHeaderState = (HatchForegroundHeaderState) bfm.A6v(HatchForegroundHeaderKt.LocalHatchForegroundHeaderState)) != null) {
            HeaderActionPill headerActionPill = callButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome.pill;
            AaC aaC2 = headerActionPill.boundsInWindow;
            if (!callButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome.inMainChat && headerActionPill.icons.size() > 1 && hatchForegroundHeaderState.isAvailableFor(callButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome.owner)) {
                aaC = aaC2;
            }
        }
        AnonymousClass002.A19(bfm);
        return aaC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FloatingCallControlsPill(com.facebook.aura.partners.voice.chrome.VoiceCallControl r53, boolean r54, final com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion r55, com.facebook.aura.partners.voice.chrome.PillTurn r56, com.facebook.aura.partners.voice.chrome.VoiceCallSlotAnimation r57, kotlin.jvm.functions.Function0<java.lang.Float> r58, kotlin.jvm.functions.Function0<java.lang.Float> r59, com.facebook.aura.partners.voice.chrome.VoiceCallControl r60, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r61, kotlin.jvm.functions.Function0<java.lang.Float> r62, java.util.List<? extends com.facebook.aura.partners.voice.intf.VoiceCallControlsAction> r63, final boolean r64, X.G0U<? super com.facebook.aura.partners.voice.chrome.VoiceCallControl, kotlin.Unit> r65, X.BRg r66, X.BFM r67, int r68, int r69, int r70) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt.FloatingCallControlsPill(com.facebook.aura.partners.voice.chrome.VoiceCallControl, boolean, com.facebook.aura.partners.voice.chrome.HatchCallControlsMotion, com.facebook.aura.partners.voice.chrome.PillTurn, com.facebook.aura.partners.voice.chrome.VoiceCallSlotAnimation, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.facebook.aura.partners.voice.chrome.VoiceCallControl, X.G0V, kotlin.jvm.functions.Function0, java.util.List, boolean, X.G0U, X.BRg, X.BFM, int, int, int):void");
    }
}
