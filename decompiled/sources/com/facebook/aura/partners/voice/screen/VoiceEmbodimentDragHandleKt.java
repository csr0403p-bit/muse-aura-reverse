package com.facebook.aura.partners.voice.screen;

import X.AEk;
import X.ATD;
import X.AWA;
import X.AWx;
import X.AXN;
import X.AYD;
import X.AaM;
import X.AbstractC07117nq;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C0dx;
import X.C0v5;
import X.C10G;
import X.C1299Agk;
import X.C1544Al7;
import X.C1743Apg;
import X.C1BO;
import X.C1DG;
import X.C1DM;
import X.C2CK;
import X.C2VG;
import X.C2VU;
import X.C3UQ;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HtJ;
import X.HxS;
import X.InterfaceC1072AWd;
import X.InterfaceC1074AXb;
import X.InterfaceC1497Ak4;
import X.InterfaceC7353EnQ;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.header.view.HatchStatusPillMetricsKt;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceEmbodimentDragHandleKt {
    public static final float CommitFraction = 0.5f;
    public static final float CommitHysteresis = 0.1f;
    public static final long FlickMaxMillis = 250;
    public static final float HandleBottomInset = 8.0f;
    public static final int HandleToneFadeMillis = 180;
    public static final float HandleTouchHeight = 48.0f;
    public static final float HandleTouchWidth = 96.0f;
    public static final long HoldGapMillis = 120;
    public static final float HoldVelocity = 150.0f;
    public static final float MaxRelativeVelocity = 12.0f;
    public static final float RubberBandFactor = 0.3f;
    public static final float ScrollDecelerationRate = 0.998f;
    public static final float SkipToAvatarVelocity = 2500.0f;
    public static final String TAG = "VoiceEmbodimentDragHandle";

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$visible = z;
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
            VoiceEmbodimentDragHandleKt.VoiceEmbodimentDragHandle(this.$visible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$visible = z;
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
            VoiceEmbodimentDragHandleKt.VoiceEmbodimentDragHandle(this.$visible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$1, reason: invalid class name and case insensitive filesystem */
    public final class C131901 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
        public final /* synthetic */ VoiceEmbodimentResize $resize;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
            C7384Etj.A0Y(interfaceC1497Ak4, 0);
            this.$resize.coordinates = interfaceC1497Ak4;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131901(VoiceEmbodimentResize voiceEmbodimentResize) {
            super(1);
            this.$resize = voiceEmbodimentResize;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
            invoke2(interfaceC1497Ak4);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3, reason: invalid class name */
    public final class AnonymousClass3 implements PointerInputEventHandler {
        public final /* synthetic */ VoiceEmbodimentResize $resize;

        /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
            public final /* synthetic */ VoiceEmbodimentResize $resize;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VoiceEmbodimentResize voiceEmbodimentResize) {
                super(1);
                this.$resize = voiceEmbodimentResize;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                this.$resize.start();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m1774invokek4lQ0M(long j) {
                this.$resize.start();
            }
        }

        /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ VoiceEmbodimentResize $resize;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(VoiceEmbodimentResize voiceEmbodimentResize) {
                super(0);
                this.$resize = voiceEmbodimentResize;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$resize.end(false);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$3, reason: invalid class name and collision with other inner class name */
        public final class C03043 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ VoiceEmbodimentResize $resize;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03043(VoiceEmbodimentResize voiceEmbodimentResize) {
                super(0);
                this.$resize = voiceEmbodimentResize;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$resize.end(true);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<C1299Agk, Float, Unit> {
            public final /* synthetic */ VoiceEmbodimentResize $resize;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(VoiceEmbodimentResize voiceEmbodimentResize) {
                super(2);
                this.$resize = voiceEmbodimentResize;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(C1299Agk c1299Agk, Float f) {
                invoke(c1299Agk, AnonymousClass001.A02(f));
                return Unit.INSTANCE;
            }

            public final void invoke(C1299Agk c1299Agk, float f) {
                C7384Etj.A0Y(c1299Agk, 0);
                Float fM1777rootYk4lQ0M = this.$resize.m1777rootYk4lQ0M(c1299Agk.A0A);
                if (fM1777rootYk4lQ0M != null && this.$resize.drag(fM1777rootYk4lQ0M.floatValue(), c1299Agk.A0E)) {
                    c1299Agk.A02();
                }
            }
        }

        public AnonymousClass3(VoiceEmbodimentResize voiceEmbodimentResize) {
            this.$resize = voiceEmbodimentResize;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(X.BRr r12, X.HtJ<? super kotlin.Unit> r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$invoke$1
                if (r0 == 0) goto L1e
                r3 = r13
                com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$invoke$1 r3 = (com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$invoke$1) r3
                int r2 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L1e
                int r2 = r2 - r1
                r3.label = r2
            L12:
                java.lang.Object r2 = r3.result
                X.Hji r1 = X.EnumC10460Hji.A02
                int r0 = r3.label
                r10 = 1
                if (r0 == 0) goto L2d
                if (r0 != r10) goto L28
                goto L24
            L1e:
                com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$invoke$1 r3 = new com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$invoke$1
                r3.<init>(r11, r13)
                goto L12
            L24:
                X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L5f
                goto L57
            L28:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L2d:
                X.Hwg.A00(r2)
                com.facebook.aura.partners.voice.screen.VoiceEmbodimentResize r0 = r11.$resize     // Catch: java.lang.Throwable -> L5f
                com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$1 r8 = new com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$1     // Catch: java.lang.Throwable -> L5f
                r8.<init>(r0)     // Catch: java.lang.Throwable -> L5f
                com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$2 r6 = new com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$2     // Catch: java.lang.Throwable -> L5f
                r6.<init>(r0)     // Catch: java.lang.Throwable -> L5f
                com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$3 r7 = new com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$3     // Catch: java.lang.Throwable -> L5f
                r7.<init>(r0)     // Catch: java.lang.Throwable -> L5f
                com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$4 r9 = new com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3$4     // Catch: java.lang.Throwable -> L5f
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L5f
                r5 = 0
                r3.L$0 = r5     // Catch: java.lang.Throwable -> L5f
                r3.label = r10     // Catch: java.lang.Throwable -> L5f
                X.3bf r4 = new X.3bf     // Catch: java.lang.Throwable -> L5f
                r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A01(r12, r3, r4)     // Catch: java.lang.Throwable -> L5f
                if (r0 != r1) goto L57
                return r1
            L57:
                com.facebook.aura.partners.voice.screen.VoiceEmbodimentResize r0 = r11.$resize
                r0.abandon()
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L5f:
                r1 = move-exception
                com.facebook.aura.partners.voice.screen.VoiceEmbodimentResize r0 = r11.$resize
                r0.abandon()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt.AnonymousClass3.invoke(X.BRr, X.HtJ):java.lang.Object");
        }
    }

    public static final BRg voiceEmbodimentResizeGestures(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(1837240181);
        VoiceEmbodimentResize voiceEmbodimentResizeRememberVoiceEmbodimentResize = rememberVoiceEmbodimentResize(bfm, 0);
        if (voiceEmbodimentResizeRememberVoiceEmbodimentResize != null) {
            bRg = bRg.then(rememberResizeGestures(voiceEmbodimentResizeRememberVoiceEmbodimentResize, bfm, 0));
        }
        AnonymousClass001.A1D(bfm);
        return bRg;
    }

    public static final void VoiceEmbodimentDragHandle(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass10;
        G0V<? super BFM, ? super Integer, Unit> voiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$resize$1;
        BRg bRg2 = bRg;
        bfm.AgG(806972160);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            VoiceEmbodimentResize voiceEmbodimentResizeRememberVoiceEmbodimentResize = rememberVoiceEmbodimentResize(bfm, 0);
            if (voiceEmbodimentResizeRememberVoiceEmbodimentResize == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    voiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$resize$1 = new VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$resize$1(z, bRg2, i, i2);
                    bBbAAc.A06 = voiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$resize$1;
                }
                return;
            }
            HatchStatusPillMetrics hatchStatusPillMetricsA0a = AnonymousClass002.A0a(bfm);
            VoiceAvatarFullScreenState voiceAvatarFullScreenStateA0V = C3cH.A0V(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, hatchStatusPillMetricsA0a, voiceAvatarFullScreenStateA0V);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0R(bfm, new VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$shown$2$1(hatchStatusPillMetricsA0a, voiceAvatarFullScreenStateA0V));
            }
            C1BO c1bo = (C1BO) objAaT;
            if (z) {
                bfm.AgE(-1888819257);
                boolean zA1G = AnonymousClass003.A1G(bfm, HatchVoiceEmbodimentHostKt.LocalCallControlsHidden);
                BBI bbiA07 = C3cG.A07(bfm);
                if (!zA1G && C1BO.A0F(c1bo)) {
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12064e);
                    boolean expanded = voiceAvatarFullScreenStateA0V.getExpanded();
                    int i4 = R.string._name_removed__res_0x7f120650;
                    if (expanded) {
                        i4 = R.string._name_removed__res_0x7f12064f;
                    }
                    String strA012 = AbstractC2271BQs.A01(bfm, i4);
                    String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120663);
                    String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12066e);
                    boolean zA65 = bfm.A65(voiceEmbodimentResizeRememberVoiceEmbodimentResize);
                    Object objAaT2 = bfm.AaT();
                    if (zA65 || objAaT2 == C78N.A00) {
                        objAaT2 = AnonymousClass003.A0R(bfm, new VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$handleShown$2$1(voiceEmbodimentResizeRememberVoiceEmbodimentResize));
                    }
                    C1BO c1bo2 = (C1BO) objAaT2;
                    DragHandleLook dragHandleLookRememberDragHandleLook = rememberDragHandleLook(voiceEmbodimentResizeRememberVoiceEmbodimentResize, bfm, 0);
                    bfm.AgE(-1888787367);
                    BRg bRgA02 = C10G.A02(C2VG.A04, AnonymousClass001.A0T(bRg2), false);
                    boolean zA652 = bfm.A65(voiceEmbodimentResizeRememberVoiceEmbodimentResize);
                    Object objAaT3 = bfm.AaT();
                    if (zA652 || objAaT3 == C78N.A00) {
                        objAaT3 = new VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$2$1(voiceEmbodimentResizeRememberVoiceEmbodimentResize);
                        bfm.Ai0(objAaT3);
                    }
                    BRg bRgA0C = C10G.A0C(AYD.A02(bRgA02, (G0U) objAaT3), HandleTouchWidth, HandleTouchHeight);
                    boolean zA653 = bfm.A65(voiceEmbodimentResizeRememberVoiceEmbodimentResize);
                    Object objAaT4 = bfm.AaT();
                    if (zA653 || objAaT4 == C78N.A00) {
                        objAaT4 = new VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$3$1(voiceEmbodimentResizeRememberVoiceEmbodimentResize);
                        bfm.Ai0(objAaT4);
                    }
                    BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0W(bRgA0C, objAaT4).then(rememberResizeGestures(voiceEmbodimentResizeRememberVoiceEmbodimentResize, bfm, 0)), "hatch-voice-drag-handle");
                    if (!C1BO.A0F(c1bo2)) {
                        BS0 bs0 = BRg.A00;
                        Object objAaT5 = bfm.AaT();
                        if (objAaT5 == C78N.A00) {
                            objAaT5 = VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$4$1$1.INSTANCE;
                            bfm.Ai0(objAaT5);
                        }
                        bRgA00 = bRgA00.then(AnonymousClass001.A0X(bs0, objAaT5));
                    }
                    BBI.A0R(bbiA07, false);
                    boolean zA1R = AnonymousClass001.A1R(bfm, strA013, AnonymousClass001.A1R(bfm, voiceEmbodimentResizeRememberVoiceEmbodimentResize, AnonymousClass005.A1T(bfm, strA012, voiceAvatarFullScreenStateA0V, strA014, bfm.A65(strA01))));
                    Object objAaT6 = bfm.AaT();
                    if (zA1R || objAaT6 == C78N.A00) {
                        objAaT6 = new VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$5$1(strA01, strA012, voiceAvatarFullScreenStateA0V, strA014, strA013, voiceEmbodimentResizeRememberVoiceEmbodimentResize);
                        bfm.Ai0(objAaT6);
                    }
                    BRg bRgA0Y = AnonymousClass001.A0Y(bRgA00, objAaT6, false);
                    boolean zA0F = C1BO.A0F(c1bo2);
                    Object objAaT7 = bfm.AaT();
                    Object obj = C78N.A00;
                    InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT7, obj);
                    boolean zA654 = bfm.A65(voiceEmbodimentResizeRememberVoiceEmbodimentResize);
                    Object objAaT8 = bfm.AaT();
                    if (zA654 || objAaT8 == obj) {
                        objAaT8 = new VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$7$1(voiceEmbodimentResizeRememberVoiceEmbodimentResize);
                        bfm.Ai0(objAaT8);
                    }
                    BRg bRgA0C2 = C10G.A0C(C10G.A02(C2VU.A09, C0v5.A01(null, interfaceC1072AWd, bRgA0Y, C3cG.A0A(0), null, (Function0) ((InterfaceC7353EnQ) objAaT8), zA0F), false), 36.0f, 5.0f);
                    C1DM c1dm = AuraTheme.INSTANCE.getShapes(bfm, 6).pill;
                    boolean zA655 = bfm.A65(dragHandleLookRememberDragHandleLook);
                    Object objAaT9 = bfm.AaT();
                    if (zA655 || objAaT9 == obj) {
                        objAaT9 = new VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$8$1(dragHandleLookRememberDragHandleLook);
                        bfm.Ai0(objAaT9);
                    }
                    BRg bRgThen = bRgA0C2.then(new C1544Al7(c1dm, (G0U) objAaT9));
                    boolean zA656 = bfm.A65(dragHandleLookRememberDragHandleLook);
                    Object objAaT10 = bfm.AaT();
                    if (zA656 || objAaT10 == obj) {
                        objAaT10 = new VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$9$1(dragHandleLookRememberDragHandleLook);
                        bfm.Ai0(objAaT10);
                    }
                    C3Ue.A04(AEk.A01(bRgThen, (G0U) objAaT10), bfm, 0);
                }
            } else {
                AnonymousClass003.A0l(bfm, 1576110727);
            }
            bBbAAc = bfm.AAc();
            if (bBbAAc != null) {
                anonymousClass10 = new AnonymousClass1(z, bRg2, i, i2);
                voiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$resize$1 = anonymousClass10;
                bBbAAc.A06 = voiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$resize$1;
            }
            return;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass10 = new AnonymousClass10(z, bRg2, i, i2);
            voiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$resize$1 = anonymousClass10;
            bBbAAc.A06 = voiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$resize$1;
        }
    }

    public static final float projectedDistance(float f) {
        return ((f / 1000.0f) * 0.998f) / 0.0019999743f;
    }

    public static final float relativeVelocity(float f) {
        return ATD.A03(f, -12.0f, 12.0f);
    }

    public static final DragHandleLook rememberDragHandleLook(VoiceEmbodimentResize voiceEmbodimentResize, BFM bfm, int i) {
        VoiceAvatarTakeoverState voiceAvatarTakeoverState = (VoiceAvatarTakeoverState) bfm.A6v(VoiceAvatarTakeoverKt.LocalVoiceAvatarTakeoverState);
        AuraColors auraColorsA0W = C3cH.A0W(bfm);
        boolean zA1K = AnonymousClass003.A1K(bfm, voiceAvatarTakeoverState, auraColorsA0W);
        Object objAaT = bfm.AaT();
        if (zA1K || objAaT == C78N.A00) {
            long j = auraColorsA0W.secondaryIcon.disabled;
            long j2 = auraColorsA0W.shadow;
            long j3 = auraColorsA0W.onLight;
            objAaT = new DragHandleLook(voiceAvatarTakeoverState, j, j2, HxS.A04(HDi.A0O[(int) (j3 & 63)], B6A.A03(j3), B6A.A02(j3), B6A.A01(j3), 0.6f), auraColorsA0W.onMedia);
            bfm.Ai0(objAaT);
        }
        DragHandleLook dragHandleLook = (DragHandleLook) objAaT;
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        long jA0A = AnonymousClass007.A0A(axnA0Y.Ah4(36.0f + 12.0f), axnA0Y.Ah4(5.0f + 12.0f));
        C1BO c1boA02 = C2CK.A02(bfm, VoiceCallSurfacesKt.rememberVoiceCallViewModel(bfm, 0).isCallEmbodimentDark);
        AWA awa = new AWA(jA0A);
        boolean zA1P = AnonymousClass003.A1P(bfm, c1boA02, dragHandleLook, bfm.A65(voiceAvatarTakeoverState) | ((((i & 14) ^ 6) > 4 && bfm.A65(voiceEmbodimentResize)) || (i & 6) == 4) | bfm.A64(jA0A));
        Object objAaT2 = bfm.AaT();
        if (zA1P || objAaT2 == C78N.A00) {
            objAaT2 = new VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1(voiceAvatarTakeoverState, voiceEmbodimentResize, jA0A, c1boA02, dragHandleLook, null);
            bfm.Ai0(objAaT2);
        }
        C78e.A02(bfm, dragHandleLook, voiceEmbodimentResize, awa, (G0V) objAaT2);
        return dragHandleLook;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg rememberResizeGestures(com.facebook.aura.partners.voice.screen.VoiceEmbodimentResize r3, X.BFM r4, int r5) {
        /*
            r0 = r5 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Ld
            boolean r0 = r4.A65(r3)
            if (r0 != 0) goto L12
        Ld:
            r1 = r5 & 6
            r0 = 0
            if (r1 != r2) goto L13
        L12:
            r0 = 1
        L13:
            java.lang.Object r1 = r4.AaT()
            if (r0 != 0) goto L1d
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L24
        L1d:
            X.BRg r1 = resizeGestures(r3)
            r4.Ai0(r1)
        L24:
            X.BRg r1 = (X.BRg) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt.rememberResizeGestures(com.facebook.aura.partners.voice.screen.VoiceEmbodimentResize, X.BFM, int):X.BRg");
    }

    public static final VoiceEmbodimentResize rememberVoiceEmbodimentResize(BFM bfm, int i) {
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = C3cG.A0K(abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        VoiceCallStateHolder voiceCallStateHolder = (VoiceCallStateHolder) objAaT;
        C1BO c1boA02 = C2CK.A02(bfm, voiceCallStateHolder.isCallActive);
        HatchStatusPillMetrics hatchStatusPillMetrics = (HatchStatusPillMetrics) bfm.A6v(HatchStatusPillMetricsKt.LocalHatchStatusPillMetrics);
        VoiceAvatarTakeoverState voiceAvatarTakeoverStateA0M = C3cG.A0M(bfm);
        VoiceAvatarFullScreenState voiceAvatarFullScreenState = voiceAvatarTakeoverStateA0M.fullScreen;
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        long jAuraWindowContainerSize = AuraLayoutSizeKt.auraWindowContainerSize(bfm, 0);
        int iACy = C1743Apg.A01(bfm).A0B.ACy(axnA0Y);
        int iACy2 = C1743Apg.A01(bfm).A03.ACy(axnA0Y);
        C0dx c0dx = (C0dx) bfm.A6v(Am0.A08);
        VoiceCallViewModel voiceCallViewModelRememberVoiceCallViewModel = VoiceCallSurfacesKt.rememberVoiceCallViewModel(bfm, 0);
        boolean zA1a = AnonymousClass001.A1a(AnonymousClass002.A1S(bfm, iACy, AnonymousClass001.A1R(bfm, axnA0Y, AnonymousClass001.A1R(bfm, c0dx, AnonymousClass005.A1T(bfm, voiceAvatarFullScreenState, voiceCallStateHolder, voiceCallViewModelRememberVoiceCallViewModel, bfm.A65(hatchStatusPillMetrics)))), bfm.A64(jAuraWindowContainerSize)), bfm, iACy2);
        Object objAaT2 = bfm.AaT();
        if (zA1a || objAaT2 == C78N.A00) {
            objAaT2 = new VoiceEmbodimentResize(hatchStatusPillMetrics, voiceAvatarFullScreenState, voiceCallStateHolder, new VoiceEmbodimentDragHandleKt$rememberVoiceEmbodimentResize$resize$1$1(voiceCallViewModelRememberVoiceCallViewModel), c0dx, axnA0Y, (int) (jAuraWindowContainerSize >> 32), AnonymousClass002.A09(jAuraWindowContainerSize), iACy, iACy2);
            bfm.Ai0(objAaT2);
        }
        VoiceEmbodimentResize voiceEmbodimentResize = (VoiceEmbodimentResize) objAaT2;
        if (C1BO.A0F(c1boA02) && MutableState.A0A(voiceAvatarTakeoverStateA0M.isVisible$delegate) && (!VoiceGating.INSTANCE.isFullScreenExpandedViewDisabled())) {
            return voiceEmbodimentResize;
        }
        return null;
    }

    public static final BRg resizeGestures(final VoiceEmbodimentResize voiceEmbodimentResize) {
        return AaM.A00(AaM.A00(new C3UQ(new C131901(voiceEmbodimentResize)), new PointerInputEventHandler() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt.resizeGestures.2

            @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$2$1", f = "VoiceEmbodimentDragHandle.kt", l = {274, 276, 278}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$2$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                public final /* synthetic */ VoiceEmbodimentResize $resize;
                public /* synthetic */ Object L$0;
                public Object L$1;
                public Object L$2;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(VoiceEmbodimentResize voiceEmbodimentResize, HtJ<? super AnonymousClass1> htJ) {
                    super(2, htJ);
                    this.$resize = voiceEmbodimentResize;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resize, htJ);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0048 -> B:18:0x0052). Please report as a decompilation issue!!! */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r5 = r9.L$0
                        X.AXb r5 = (X.InterfaceC1074AXb) r5
                        X.Hji r4 = X.EnumC10460Hji.A02
                        int r1 = r9.label
                        r3 = 3
                        r8 = 2
                        r0 = 1
                        if (r1 == 0) goto L18
                        if (r1 == r0) goto L29
                        if (r1 == r8) goto L4b
                        if (r1 == r3) goto L4b
                        java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                        throw r0
                    L18:
                        X.Hwg.A00(r10)
                        X.AXj r1 = X.EnumC1080AXj.A03
                        r9.L$0 = r5
                        r9.label = r0
                        r0 = 0
                        java.lang.Object r10 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r5, r1, r9, r0)
                        if (r10 != r4) goto L2c
                        return r4
                    L29:
                        X.Hwg.A00(r10)
                    L2c:
                        r2 = r10
                        X.Agk r2 = (X.C1299Agk) r2
                        com.facebook.aura.partners.voice.screen.VoiceEmbodimentResize r7 = r9.$resize
                        long r0 = r2.A0A
                        java.lang.Float r6 = r7.m1777rootYk4lQ0M(r0)
                        long r0 = r2.A0E
                        r7.press(r6, r0)
                        X.AXj r1 = X.EnumC1080AXj.A03
                        r9.L$0 = r5
                        r9.L$1 = r2
                        r9.label = r8
                    L44:
                        java.lang.Object r10 = r5.A4z(r1, r9)
                        if (r10 != r4) goto L52
                        return r4
                    L4b:
                        java.lang.Object r2 = r9.L$1
                        X.Agk r2 = (X.C1299Agk) r2
                        X.Hwg.A00(r10)
                    L52:
                        X.Afe r10 = (X.C1247Afe) r10
                        java.util.List<X.Agk> r6 = r10.A05
                        boolean r0 = r6 instanceof java.util.Collection
                        if (r0 == 0) goto L7c
                        boolean r0 = r6.isEmpty()
                        if (r0 == 0) goto L7c
                    L60:
                        java.lang.Object r5 = X.AbstractC0878AGe.A0G(r6)
                        X.Agk r5 = (X.C1299Agk) r5
                        com.facebook.aura.partners.voice.screen.VoiceEmbodimentResize r4 = r9.$resize
                        if (r5 == 0) goto L78
                        long r0 = r5.A0A
                        java.lang.Float r3 = r4.m1777rootYk4lQ0M(r0)
                        long r0 = r5.A0E
                    L72:
                        r4.release(r3, r0)
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L78:
                        r3 = 0
                        long r0 = r2.A0E
                        goto L72
                    L7c:
                        java.util.Iterator r1 = r6.iterator()
                    L80:
                        boolean r0 = r1.hasNext()
                        if (r0 == 0) goto L60
                        java.lang.Object r0 = r1.next()
                        X.Agk r0 = (X.C1299Agk) r0
                        boolean r0 = r0.A0F
                        if (r0 == 0) goto L80
                        X.AXj r1 = X.EnumC1080AXj.A03
                        r9.L$0 = r5
                        r9.L$1 = r2
                        r0 = 0
                        r9.L$2 = r0
                        r9.label = r3
                        goto L44
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                    return ((AnonymousClass1) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                return C3cG.A0U(ForEachGestureKt.A01(bRr, htJ, new AnonymousClass1(voiceEmbodimentResize, null)));
            }
        }, voiceEmbodimentResize), new AnonymousClass3(voiceEmbodimentResize), voiceEmbodimentResize);
    }

    public static final float fullScreenHandleClearance(BFM bfm, int i) {
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        int iACy = C1743Apg.A01(bfm).A0B.ACy(axnA0Y);
        int iACy2 = C1743Apg.A01(bfm).A03.ACy(axnA0Y);
        C1DG c1dg = new C1DG(axnA0Y.Agy(iACy) + HandleBottomInset + 2.5f);
        C1DG c1dg2 = new C1DG(axnA0Y.Agy(iACy2) + (HandleTouchHeight / 2.0f));
        if (c1dg.compareTo(c1dg2) >= 0) {
            c1dg2 = c1dg;
        }
        return c1dg2.A00 + 2.5f;
    }

    public static final float rubberBanded(float f) {
        return f > 1.0f ? ((f - 1.0f) * 0.3f) + 1.0f : f < 0.0f ? f * 0.3f : f;
    }

    public static final float unbanded(float f) {
        return f > 1.0f ? ((f - 1.0f) / 0.3f) + 1.0f : f < 0.0f ? f / 0.3f : f;
    }
}
