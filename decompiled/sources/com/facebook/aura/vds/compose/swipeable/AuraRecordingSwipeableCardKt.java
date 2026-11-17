package com.facebook.aura.vds.compose.swipeable;

import X.AEk;
import X.AKO;
import X.AKQ;
import X.ASQ;
import X.AbstractC1798ArH;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0er;
import X.C1089AXz;
import X.C1515AkP;
import X.C3UX;
import X.C3cG;
import X.C60Q;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraRecordingSwipeableCardKt {

    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraRecordingSwipeableCardKt$AuraRecordingSwipeableCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $enableRecording;
        public final /* synthetic */ GraphicsLayer $graphicsLayer;
        public final /* synthetic */ MutableState<Boolean> $isSwipeActive$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, GraphicsLayer graphicsLayer, G0V<? super BFM, ? super Integer, Unit> g0v, MutableState<Boolean> mutableState) {
            super(2);
            this.$enableRecording = z;
            this.$graphicsLayer = graphicsLayer;
            this.$content = g0v;
            this.$isSwipeActive$delegate = mutableState;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (!this.$enableRecording || this.$graphicsLayer == null) {
                bfm.AgE(-865982857);
                AnonymousClass001.A1H(bfm, this.$content, 0);
            } else {
                bfm.AgE(-866141360);
                AuraRecordingSwipeableCardKt.OnDemandRecordingContent(this.$graphicsLayer, MutableState.A0A((MutableState) this.$isSwipeActive$delegate), this.$content, bfm, 8);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraRecordingSwipeableCardKt$AuraRecordingSwipeableCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $applyRoundedCorners;
        public final /* synthetic */ AuraSwipeableCardBackgroundProvider $backgroundProvider;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $enableRecording;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0U<Bitmap, Unit> $endToStartSwipeAction;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraSwipeablePeek $peek;
        public final /* synthetic */ G0U<Bitmap, Unit> $startToEndSwipeAction;
        public final /* synthetic */ boolean $supportSingleOrientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G0U<? super Bitmap, Unit> g0u, G0U<? super Bitmap, Unit> g0u2, BRg bRg, boolean z, boolean z2, boolean z3, AuraSwipeableCardBackgroundProvider auraSwipeableCardBackgroundProvider, AuraSwipeablePeek auraSwipeablePeek, boolean z4, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$endToStartSwipeAction = g0u;
            this.$startToEndSwipeAction = g0u2;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$enableRecording = z2;
            this.$applyRoundedCorners = z3;
            this.$backgroundProvider = auraSwipeableCardBackgroundProvider;
            this.$peek = auraSwipeablePeek;
            this.$supportSingleOrientation = z4;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraRecordingSwipeableCardKt.AuraRecordingSwipeableCard(this.$endToStartSwipeAction, this.$startToEndSwipeAction, this.$modifier, this.$enabled, this.$enableRecording, this.$applyRoundedCorners, this.$backgroundProvider, this.$peek, this.$supportSingleOrientation, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraRecordingSwipeableCardKt$OnDemandRecordingContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C143053 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ GraphicsLayer $graphicsLayer;
        public final /* synthetic */ boolean $isSwipeActive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C143053(GraphicsLayer graphicsLayer, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$graphicsLayer = graphicsLayer;
            this.$isSwipeActive = z;
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraRecordingSwipeableCardKt.OnDemandRecordingContent(this.$graphicsLayer, this.$isSwipeActive, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void AuraRecordingSwipeableCard(G0U<? super Bitmap, Unit> g0u, G0U<? super Bitmap, Unit> g0u2, BRg bRg, boolean z, boolean z2, boolean z3, AuraSwipeableCardBackgroundProvider auraSwipeableCardBackgroundProvider, AuraSwipeablePeek auraSwipeablePeek, boolean z4, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        GraphicsLayer graphicsLayer;
        Function0 function0;
        Function0 function02;
        G0U g0u3;
        BRg bRg2 = bRg;
        boolean zA1K = z3;
        AuraSwipeablePeek auraSwipeablePeek2 = auraSwipeablePeek;
        boolean zA1Q = z;
        boolean zA1Q2 = z2;
        boolean zA1K2 = z4;
        AnonymousClass002.A1F(auraSwipeableCardBackgroundProvider, 6, g0v);
        bfm.AgG(1740854599);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0u) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, zA1Q);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, zA1Q2);
        }
        int i6 = i2 & 32;
        int iA0s = 196608;
        if (i6 != 0) {
            iA0T |= iA0s;
        } else if ((i & 196608) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, zA1K);
            iA0T |= iA0s;
        }
        if ((i & 1572864) == 0) {
            iA0T |= AnonymousClass004.A0j(bfm, auraSwipeableCardBackgroundProvider);
        }
        int i7 = i2 & 128;
        int i8 = 12582912;
        if (i7 != 0) {
            iA0T |= i8;
        } else if ((i & 12582912) == 0) {
            i8 = 4194304;
            if (AnonymousClass004.A1R(bfm, auraSwipeablePeek2, i, HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES)) {
                i8 = 8388608;
            }
            iA0T |= i8;
        }
        int i9 = i2 & 256;
        int iA0v = 100663296;
        if (i9 != 0) {
            iA0T |= iA0v;
        } else if ((i & 100663296) == 0) {
            i9 = 0;
            iA0v = AnonymousClass004.A0v(bfm, zA1K2);
            iA0T |= iA0v;
        }
        if ((i & 805306368) == 0) {
            iA0T |= AnonymousClass004.A0c(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 306783379, 306783378), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1Q = C60Q.A1Q(i4, zA1Q);
            zA1Q2 = C60Q.A1Q(i5, zA1Q2);
            zA1K = C3cG.A1K(i6, zA1K);
            if (i7 != 0) {
                auraSwipeablePeek2 = null;
            }
            zA1K2 = C3cG.A1K(i9, zA1K2);
            if (zA1Q2) {
                bfm.AgE(-2075959202);
                long j = C0er.A00;
                bbiA0M = (BBI) bfm;
                ASQ asq = (ASQ) AKO.A07(Am0.A07, bbiA0M);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new C1089AXz(asq);
                    bfm.Ai0(objAaT);
                }
                graphicsLayer = ((C1089AXz) objAaT).A00;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 69802358);
                graphicsLayer = null;
            }
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT2, obj);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                function0 = null;
                objAaT3 = AbstractC1798ArH.A04(bbiA0M, false);
            } else {
                function0 = null;
            }
            MutableState mutableState = (MutableState) objAaT3;
            if (g0u == null) {
                bfm.AgE(69994775);
            } else {
                boolean zA1O = AnonymousClass003.A1O(bfm, graphicsLayer, g0u, AnonymousClass001.A1Z(c3ux, bfm, 69994776) | AnonymousClass002.A1Q(iA0T & 57344, 16384));
                Object objAaT4 = bfm.AaT();
                if (zA1O || objAaT4 == obj) {
                    objAaT4 = new AuraRecordingSwipeableCardKt$AuraRecordingSwipeableCard$wrappedEndToStartAction$1$1$1(c3ux, zA1Q2, graphicsLayer, g0u);
                    BBI.A0O(bbiA0M, objAaT4);
                }
                function0 = (Function0) objAaT4;
            }
            BBI.A0R(bbiA0M, false);
            if (g0u2 == null) {
                bfm.AgE(70450103);
                BBI.A0R(bbiA0M, false);
                function02 = null;
            } else {
                boolean zA1O2 = AnonymousClass003.A1O(bfm, graphicsLayer, g0u2, AnonymousClass001.A1Z(c3ux, bfm, 70450104) | ((iA0T & 57344) == 16384));
                Object objAaT5 = bfm.AaT();
                if (zA1O2 || objAaT5 == obj) {
                    objAaT5 = new AuraRecordingSwipeableCardKt$AuraRecordingSwipeableCard$wrappedStartToEndAction$1$1$1(c3ux, zA1Q2, graphicsLayer, g0u2);
                    BBI.A0O(bbiA0M, objAaT5);
                }
                function02 = (Function0) objAaT5;
                BBI.A0R(bbiA0M, false);
            }
            if (zA1Q2) {
                Object objA0p = AnonymousClass001.A0p(bfm, 71227863);
                if (objA0p == obj) {
                    objA0p = new AuraRecordingSwipeableCardKt$AuraRecordingSwipeableCard$1$1(mutableState);
                    BBI.A0O(bbiA0M, objA0p);
                }
                g0u3 = (G0U) objA0p;
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(71268534);
                BBI.A0R(bbiA0M, false);
                g0u3 = null;
            }
            int i10 = (iA0T & 896) | 805306368 | (iA0T & 7168);
            int i11 = iA0T >> 3;
            Function0 function03 = function0;
            Function0 function04 = function02;
            BRg bRg3 = bRg2;
            AuraSwipeableCardKt.AuraSwipeableCard(function03, function04, bRg3, zA1Q, zA1K, auraSwipeableCardBackgroundProvider, auraSwipeablePeek2, zA1K2, g0u3, B1V.A00(bfm, new AnonymousClass2(zA1Q2, graphicsLayer, g0v, mutableState), 1485930708), bfm, AnonymousClass005.A05(i11, i10 | (i11 & 57344) | (458752 & i11) | (AuraSwipeablePeek.$stable << 18)), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(g0u, g0u2, bRg2, zA1Q, zA1Q2, zA1K, auraSwipeableCardBackgroundProvider, auraSwipeablePeek2, zA1K2, g0v, i, i2);
        }
    }

    public static final void OnDemandRecordingContent(GraphicsLayer graphicsLayer, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(1751473404);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(graphicsLayer, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0v);
        }
        boolean z2 = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            BS0 bs0 = BRg.A00;
            boolean zA1C = AnonymousClass003.A1C(iA05);
            if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(graphicsLayer))) {
                z2 = false;
            }
            boolean z3 = zA1C | z2;
            Object objAaT = bfm.AaT();
            if (z3 || objAaT == C78N.A00) {
                objAaT = new AuraRecordingSwipeableCardKt$OnDemandRecordingContent$1$1(z, graphicsLayer);
                BBI.A0T(bfm, objAaT);
            }
            BRg bRgA00 = AEk.A00(bs0, objAaT);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0D);
            AnonymousClass003.A13(bfm, g0v, iA05 >> 6);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143053(graphicsLayer, z, g0v, i);
        }
    }
}
