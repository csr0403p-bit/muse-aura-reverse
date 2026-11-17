package com.facebook.aura.composer.camera;

import X.AKQ;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0v5;
import X.C0z7;
import X.C0zJ;
import X.C11U;
import X.C1515AkP;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60P;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchCameraScreenKt {

    /* renamed from: com.facebook.aura.composer.camera.HatchCameraScreenKt$HatchCameraConfirmation$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onRetake;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$onRetake = function0;
            this.$onConfirm = function02;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCameraScreenKt.HatchCameraConfirmation(this.$onRetake, this.$onConfirm, this.$modifier, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.camera.HatchCameraScreenKt$HatchCameraControls$2, reason: invalid class name and case insensitive filesystem */
    public final class C111462 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchCameraSession $camera;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCapture;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111462(HatchCameraSession hatchCameraSession, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$camera = hatchCameraSession;
            this.$enabled = z;
            this.$onCapture = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCameraScreenKt.HatchCameraControls(this.$camera, this.$enabled, this.$onCapture, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.camera.HatchCameraScreenKt$HatchCameraScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C111472 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchCameraSession $camera;
        public final /* synthetic */ boolean $closing;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;
        public final /* synthetic */ Function0<Unit> $onConfirm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111472(HatchCameraSession hatchCameraSession, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$camera = hatchCameraSession;
            this.$closing = z;
            this.$onClose = function0;
            this.$onConfirm = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCameraScreenKt.HatchCameraScreen(this.$camera, this.$closing, this.$onClose, this.$onConfirm, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.camera.HatchCameraScreenKt$HatchCameraShutter$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCameraScreenKt.HatchCameraShutter(this.$enabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchCameraConfirmation(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        bfm.AgG(1163874993);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
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
            iA0T |= AnonymousClass004.A0q(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            AuraColors auraColorsA0W = C3cH.A0W(bfm);
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 128.0f), 24.0f);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, 16.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0L, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120711);
            BS0 bs0 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            boolean zA67 = bfm.A67(auraColorsA0W);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchCameraScreenKt$HatchCameraConfirmation$1$1$1(auraColorsA0W);
                bfm.Ai0(objAaT);
            }
            Function0 function04 = (Function0) objAaT;
            boolean zA672 = bfm.A67(auraColorsA0W);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchCameraScreenKt$HatchCameraConfirmation$1$2$1(auraColorsA0W);
                bfm.Ai0(objAaT2);
            }
            int i5 = ((iA0T << 18) & 1879048192) | 6;
            boolean z3 = z2;
            AuraButtonKt.m2408AuraButtonnL3aKkM("hatch-camera-retake", strA01, null, bRgAiP, null, null, null, false, false, z3, false, false, null, null, function0, null, null, function04, (Function0) objAaT2, null, null, null, null, false, 0, false, 0, bfm, i5, (iA0T << 12) & 57344, 0, 133807604);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12070f);
            BRg bRgAiP2 = c90m.AiP(bs0, 1.0f, true);
            boolean zA673 = bfm.A67(auraColorsA0W);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchCameraScreenKt$HatchCameraConfirmation$1$3$1(auraColorsA0W);
                bfm.Ai0(objAaT3);
            }
            Function0 function05 = (Function0) objAaT3;
            boolean zA674 = bfm.A67(auraColorsA0W);
            Object objAaT4 = bfm.AaT();
            if (zA674 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchCameraScreenKt$HatchCameraConfirmation$1$4$1(auraColorsA0W);
                bfm.Ai0(objAaT4);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM("hatch-camera-confirm", strA012, null, bRgAiP2, null, null, null, false, false, z3, false, false, null, null, function02, null, null, function05, (Function0) objAaT4, null, null, null, null, false, 0, false, 0, bfm, i5, (iA0T << 9) & 57344, 0, 133807604);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, function02, bRg2, z2, i, i2);
        }
    }

    public static final void HatchCameraControls(HatchCameraSession hatchCameraSession, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-250465159);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchCameraSession, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
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
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 128.0f), 24.0f, 24.0f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            HatchCameraShutter(z, function0, c0z7.A4C(C2VU.A09, bs0), bfm, (iA05 >> 3) & 126, 0);
            if (hatchCameraSession.getCanSwitch()) {
                bfm.AgE(-1393266778);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.arrowsrefresh_outline_24_wght400, 0);
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
                AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
                AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
                long j = C3cH.A0W(bfm).onMedia;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120712);
                boolean z2 = (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchCameraSession));
                Object objAaT = bfm.AaT();
                if (z2 || objAaT == C78N.A00) {
                    objAaT = new HatchCameraScreenKt$HatchCameraControls$1$1$1(hatchCameraSession);
                    bfm.Ai0(objAaT);
                }
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(c0z7.A4C(C2VU.A0A, bs0), aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, (Function0) ((InterfaceC7353EnQ) objAaT), null, z, C60P.A04(j), null, null, "hatch-camera-switch", bfm, (AVy.$stable << 3) | 28032 | ((iA05 << 24) & 1879048192), 3072, 6432);
            } else {
                bfm.AgE(-1392698641);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C111462(hatchCameraSession, z, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchCameraScreen(com.facebook.aura.composer.camera.HatchCameraSession r55, boolean r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, X.BRg r59, X.BFM r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.camera.HatchCameraScreenKt.HatchCameraScreen(com.facebook.aura.composer.camera.HatchCameraSession, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void HatchCameraShutter(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1544255559);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120728);
            long j = C3cH.A0W(bfm).onMedia;
            BRg bRgA04 = C0v5.A04(C11U.A02(bRg, 80.0f), C3cG.A0A(0), null, function0, z);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchCameraScreenKt$HatchCameraShutter$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0Y(bRgA04, objAaT, false), "hatch-camera-shutter");
            boolean zA64 = bfm.A64(j) | ((iA0n & 14) == 4);
            Object objAaT2 = bfm.AaT();
            if (zA64 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchCameraScreenKt$HatchCameraShutter$2$1(j, z);
                bfm.Ai0(objAaT2);
            }
            C0zJ.A00(bRgA00, (G0U) objAaT2, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(z, function0, bRg, i, i2);
        }
    }

    public static final /* synthetic */ Function0 access$HatchCameraScreen$lambda$4(MutableState mutableState) {
        return (Function0) mutableState.getValue();
    }
}
