package com.facebook.aura.assist;

import X.AKH;
import X.AKQ;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AXQ;
import X.AXY;
import X.AYL;
import X.AYU;
import X.AZE;
import X.AaC;
import X.Ab3;
import X.AbstractC0878AGe;
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
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BIj;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1515AkP;
import X.C1743Apg;
import X.C1BO;
import X.C1Ny;
import X.C3TF;
import X.C3TG;
import X.C3Tr;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.EnumC1820Arj;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC05151eP;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.view.View;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.R;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.api.AvatarTakeoverKt;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.header.view.HatchStatusPillMetricsKt;
import com.facebook.aura.partners.voice.intf.VoiceIntegrationKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.view.HatchStatusPillKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AssistSessionIdentityKt {

    /* renamed from: com.facebook.aura.assist.AssistSessionIdentityKt$AssistSessionIdentity$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $bottomInset;
        public final /* synthetic */ AssistIdentityPresentation $identity;
        public final /* synthetic */ int $leftInset;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<AaC, Unit> $onBoundsChanged;
        public final /* synthetic */ Function0<Unit> $onRestore;
        public final /* synthetic */ int $rightInset;
        public final /* synthetic */ AssistIdentityState $state;
        public final /* synthetic */ int $topInset;
        public final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BRg bRg, AssistIdentityState assistIdentityState, AssistIdentityPresentation assistIdentityPresentation, View view, int i, int i2, int i3, int i4, G0U<? super AaC, Unit> g0u, Function0<Unit> function0) {
            super(2);
            this.$modifier = bRg;
            this.$state = assistIdentityState;
            this.$identity = assistIdentityPresentation;
            this.$view = view;
            this.$leftInset = i;
            this.$topInset = i2;
            this.$rightInset = i3;
            this.$bottomInset = i4;
            this.$onBoundsChanged = g0u;
            this.$onRestore = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                BRg bRgA0T = AnonymousClass001.A0T(this.$modifier);
                AssistIdentityState assistIdentityState = this.$state;
                int i2 = AssistIdentityState.$stable;
                BRg bRgAssistIdentityDrag = AssistIdentityDragKt.assistIdentityDrag(bRgA0T, assistIdentityState, bfm, i2 << 3);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onBoundsChanged, AnonymousClass001.A1a(AnonymousClass001.A1a(AnonymousClass001.A1a(AnonymousClass001.A1a(AnonymousClass001.A1T(bfm, this.$state, AnonymousClass001.A1T(bfm, this.$view, bfm.A67(this.$identity))), bfm, this.$leftInset), bfm, this.$topInset), bfm, this.$rightInset), bfm, this.$bottomInset));
                final AssistIdentityPresentation assistIdentityPresentation = this.$identity;
                final View view = this.$view;
                final AssistIdentityState assistIdentityState2 = this.$state;
                final int i3 = this.$leftInset;
                final int i4 = this.$topInset;
                final int i5 = this.$rightInset;
                final int i6 = this.$bottomInset;
                final G0U<AaC, Unit> g0u = this.$onBoundsChanged;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new InterfaceC1380AiA() { // from class: com.facebook.aura.assist.AssistSessionIdentityKt$AssistSessionIdentity$2$1$1

                        /* renamed from: com.facebook.aura.assist.AssistSessionIdentityKt$AssistSessionIdentity$2$1$1$1, reason: invalid class name */
                        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
                            public final /* synthetic */ int $bottomInset;
                            public final /* synthetic */ AZE $child;
                            public final /* synthetic */ long $constraints;
                            public final /* synthetic */ AssistIdentityPresentation $identity;
                            public final /* synthetic */ int $leftInset;
                            public final /* synthetic */ G0U<AaC, Unit> $onBoundsChanged;
                            public final /* synthetic */ int $rightInset;
                            public final /* synthetic */ AaC $source;
                            public final /* synthetic */ AssistIdentityState $state;
                            public final /* synthetic */ int $topInset;
                            public final /* synthetic */ View $view;

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(AYU ayu) {
                                C7384Etj.A0Y(ayu, 0);
                                long jA04 = AWx.A04(this.$identity.windowOrigin, AssistIdentityStateKt.originOnScreen(this.$view));
                                AaC aaC = this.$source;
                                float f = aaC.A01;
                                float fA00 = f + AnonymousClass001.A00(jA04);
                                float f2 = aaC.A02 - f;
                                AZE aze = this.$child;
                                int i = aze.A01;
                                float fA002 = fA00 + C8j3.A00(f2, i);
                                float fA01 = aaC.A03 + AnonymousClass001.A01(jA04, 4294967295L);
                                AssistIdentityDockPosition assistIdentityDockPosition = this.$state.dockPosition;
                                int i2 = this.$leftInset;
                                float f3 = i2;
                                int i3 = this.$topInset;
                                float f4 = i3;
                                long j = this.$constraints;
                                int iA01 = (Constraints.A01(j) - this.$rightInset) - i;
                                if (iA01 < i2) {
                                    iA01 = i2;
                                }
                                float f5 = iA01;
                                int iA00 = (Constraints.A00(j) - this.$bottomInset) - aze.A00;
                                if (iA00 < i3) {
                                    iA00 = i3;
                                }
                                long jM256offsettuRUvjQ = assistIdentityDockPosition.m256offsettuRUvjQ(C8j3.A0f(f3, f4, f5, iA00));
                                float fA012 = C1BO.A01(this.$state.progress);
                                float f6 = 1.0f - fA012;
                                int iA012 = Ab3.A01(C8j3.A03(f6, fA002, fA012, AnonymousClass001.A00(jM256offsettuRUvjQ)));
                                int iA013 = Ab3.A01(C8j3.A03(f6, fA01, fA012, AnonymousClass001.A01(jM256offsettuRUvjQ, 4294967295L)));
                                ayu.A0A(this.$child, 0.0f, iA012, iA013);
                                G0U<AaC, Unit> g0u = this.$onBoundsChanged;
                                AZE aze2 = this.$child;
                                g0u.invoke(C8j3.A0f(iA012, iA013, iA012 + aze2.A01, iA013 + aze2.A00));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass1(AssistIdentityPresentation assistIdentityPresentation, View view, AaC aaC, AZE aze, AssistIdentityState assistIdentityState, int i, int i2, long j, int i3, int i4, G0U<? super AaC, Unit> g0u) {
                                super(1);
                                this.$identity = assistIdentityPresentation;
                                this.$view = view;
                                this.$source = aaC;
                                this.$child = aze;
                                this.$state = assistIdentityState;
                                this.$leftInset = i;
                                this.$topInset = i2;
                                this.$constraints = j;
                                this.$rightInset = i3;
                                this.$bottomInset = i4;
                                this.$onBoundsChanged = g0u;
                            }

                            @Override // X.G0U
                            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                                invoke2(ayu);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // X.InterfaceC1380AiA
                        /* renamed from: measure-3p2s80s */
                        public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
                            boolean zA1b = AnonymousClass004.A1b(axy, list);
                            AaC value = assistIdentityPresentation.bounds.getValue();
                            int iA01 = Ab3.A01(value.A02 - value.A01);
                            int iA012 = Constraints.A01(j);
                            int iA04 = ATD.A04(iA01, zA1b ? 1 : 0, iA012);
                            C3TG c3tg = (C3TG) AbstractC0878AGe.A0J(list);
                            int iA00 = Constraints.A00(j);
                            return AXY.A01(axy, new AnonymousClass1(assistIdentityPresentation, view, value, c3tg.AQW(AYL.A05(zA1b ? 1 : 0, iA04, zA1b ? 1 : 0, iA00)), assistIdentityState2, i3, i4, j, i5, i6, g0u), iA012, iA00);
                        }

                        @Override // X.InterfaceC1380AiA
                        public /* bridge */ int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i7) {
                            return AXQ.A00(c3tf, this, list, i7);
                        }

                        @Override // X.InterfaceC1380AiA
                        public /* bridge */ int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i7) {
                            return AXQ.A01(c3tf, this, list, i7);
                        }

                        @Override // X.InterfaceC1380AiA
                        public /* bridge */ int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i7) {
                            return AXQ.A02(c3tf, this, list, i7);
                        }

                        @Override // X.InterfaceC1380AiA
                        public /* bridge */ int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i7) {
                            return AXQ.A03(c3tf, this, list, i7);
                        }
                    };
                    bfm.Ai0(objAaT);
                }
                AssistIdentityState assistIdentityState3 = this.$state;
                Function0<Unit> function0 = this.$onRestore;
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgAssistIdentityDrag);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, objAaT, akqA04, bRgA01, iA0J);
                BS0 bs0 = BRg.A00;
                boolean zA67 = bfm.A67(assistIdentityState3);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new AssistSessionIdentityKt$AssistSessionIdentity$2$2$1$1(assistIdentityState3);
                    bfm.Ai0(objAaT2);
                }
                BRg bRgA00 = BIj.A00(bs0, (G0U) objAaT2);
                boolean zA672 = bfm.A67(assistIdentityState3);
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new AssistSessionIdentityKt$AssistSessionIdentity$2$2$2$1(assistIdentityState3);
                    bfm.Ai0(objAaT3);
                }
                VoiceIntegrationKt.VoiceEmbodimentHost(AssistVoicePresentationKt.assistComposerInteraction(AssistIdentityDragKt.assistIdentityMoveActions(AnonymousClass001.A0W(bRgA00, objAaT3), assistIdentityState3, bfm, i2 << 3), assistIdentityState3.isInteractive()), true, B1V.A00(bfm, new AssistSessionIdentityKt$AssistSessionIdentity$2$2$3(assistIdentityState3, function0), 1560582544), bfm, 432, 0);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.assist.AssistSessionIdentityKt$AssistSessionIdentity$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<AaC, Unit> $onBoundsChanged;
        public final /* synthetic */ Function0<Unit> $onRestore;
        public final /* synthetic */ AssistIdentityState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AssistIdentityState assistIdentityState, Function0<Unit> function0, G0U<? super AaC, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$state = assistIdentityState;
            this.$onRestore = function0;
            this.$onBoundsChanged = g0u;
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
            AssistSessionIdentityKt.AssistSessionIdentity(this.$state, this.$onRestore, this.$onBoundsChanged, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.assist.AssistSessionIdentityKt$AssistSessionIdentityPill$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRestore;
        public final /* synthetic */ AssistIdentityState $state;
        public final /* synthetic */ InterfaceC05151eP $this_AssistSessionIdentityPill;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(InterfaceC05151eP interfaceC05151eP, AssistIdentityState assistIdentityState, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$this_AssistSessionIdentityPill = interfaceC05151eP;
            this.$state = assistIdentityState;
            this.$onRestore = function0;
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
            AssistSessionIdentityKt.AssistSessionIdentityPill(this.$this_AssistSessionIdentityPill, this.$state, this.$onRestore, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void AssistSessionIdentity(AssistIdentityState assistIdentityState, Function0<Unit> function0, G0U<? super AaC, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        BRg bRg2 = bRg;
        AnonymousClass005.A0x(assistIdentityState, function0, g0u);
        bfm.AgG(94831797);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(assistIdentityState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
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
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AssistIdentityPresentation identity = assistIdentityState.getIdentity();
            if (identity == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AssistSessionIdentityKt$AssistSessionIdentity$identity$1(assistIdentityState, function0, g0u, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            View viewA0J = AnonymousClass001.A0J(bfm);
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            EnumC1820Arj enumC1820Arj = (EnumC1820Arj) bfm.A6v(Am0.A0A);
            C1Ny c1Ny = C1743Apg.A01(bfm).A0E;
            int iAH1 = c1Ny.AH1(axnA0Y, enumC1820Arj);
            int iALn = c1Ny.ALn(axnA0Y);
            int iAJo = c1Ny.AJo(axnA0Y, enumC1820Arj);
            int iACy = c1Ny.ACy(axnA0Y);
            AKH<HatchStatusPillMetrics> akh = HatchStatusPillMetricsKt.LocalHatchStatusPillMetrics;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new HatchStatusPillMetrics();
                bfm.Ai0(objAaT);
            }
            AnonymousClass003.A0m(bfm, akh.A04(objAaT), new AnonymousClass2(bRg2, assistIdentityState, identity, viewA0J, iAH1, iALn, iAJo, iACy, g0u, function0), 1734748149);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(assistIdentityState, function0, g0u, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final void AssistSessionIdentityPill(InterfaceC05151eP interfaceC05151eP, AssistIdentityState assistIdentityState, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass4;
        String strA0v;
        BRg bRg2 = bRg;
        bfm.AgG(-1274902414);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, interfaceC05151eP) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(assistIdentityState, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AssistIdentityPresentation identity = assistIdentityState.getIdentity();
            if (identity == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new AssistSessionIdentityKt$AssistSessionIdentityPill$identity$1(interfaceC05151eP, assistIdentityState, function0, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass4);
                }
                return;
            }
            AvatarTakeover avatarTakeover = (AvatarTakeover) bfm.A6v(AvatarTakeoverKt.LocalAvatarTakeover);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = C3cG.A0T();
                bfm.Ai0(objAaT);
            }
            boolean zA1J = AnonymousClass003.A1J(bfm, avatarTakeover, objAaT);
            int i4 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z = zA1J | (i4 == 32 || ((iA0d & 64) != 0 && bfm.A67(assistIdentityState)));
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == obj) {
                objAaT2 = new AssistSessionIdentityKt$AssistSessionIdentityPill$1$1(avatarTakeover, objAaT, assistIdentityState);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A15(bfm, objAaT2);
            boolean zA1J2 = AnonymousClass003.A1J(bfm, avatarTakeover, objAaT);
            Object objAaT3 = bfm.AaT();
            if (zA1J2 || objAaT3 == obj) {
                objAaT3 = new AssistSessionIdentityKt$AssistSessionIdentityPill$2$1(avatarTakeover, objAaT);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, avatarTakeover);
            String str = identity.threadId;
            boolean z2 = !assistIdentityState.isParked();
            boolean zIsVisible = assistIdentityState.isVisible();
            if (assistIdentityState.isParked()) {
                bfm.AgE(-221143426);
                strA0v = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120179);
            } else {
                bfm.AgE(-221055386);
                strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12067b);
            }
            AnonymousClass001.A1D(bfm);
            boolean zA1V = AnonymousClass002.A1V(bfm, identity, i4 == 32 || ((iA0d & 64) != 0 && bfm.A67(assistIdentityState)), (iA0d & 896) == 256);
            Object objAaT4 = bfm.AaT();
            if (zA1V || objAaT4 == obj) {
                objAaT4 = new AssistSessionIdentityKt$AssistSessionIdentityPill$3$1(assistIdentityState, function0, identity);
                bfm.Ai0(objAaT4);
            }
            HatchStatusPillKt.m2233HatchStatusPillrBjAxNU(interfaceC05151eP, bRg2, (Function0) objAaT4, false, null, false, false, str, zIsVisible, strA0v, z2, false, true, null, true, null, bfm, (iA0d & 14) | 3072 | ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 24960, 21560);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(interfaceC05151eP, assistIdentityState, function0, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }
}
