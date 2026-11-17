package com.facebook.aura.ui;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1U;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonCorner;
import com.facebook.aura.vds.compose.button.AuraButtonDefaults;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.button.IconContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchEditFileButtonKt {

    /* renamed from: com.facebook.aura.ui.HatchEditFileButtonKt$HatchEditFileButton$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<IconContext, BFM, Integer, Unit> {
        public final /* synthetic */ AVy $icon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AVy aVy) {
            super(3);
            this.$icon = aVy;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(IconContext iconContext, BFM bfm, Integer num) {
            invoke(iconContext, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(IconContext iconContext, BFM bfm, int i) {
            if (AnonymousClass002.A0B(iconContext, i) == 0) {
                i |= AnonymousClass004.A0d(bfm, iconContext);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                AnonymousClass007.A0w(bfm, this.$icon, AuraButtonDefaults.INSTANCE, iconContext, i);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.ui.HatchEditFileButtonKt$HatchEditFileButton$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AVy $icon;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, AVy aVy, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$icon = aVy;
            this.$onClick = function0;
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
            HatchEditFileButtonKt.HatchEditFileButton(this.$text, this.$icon, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchEditFileButton(String str, AVy aVy, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(str, aVy, function0);
        bfm.AgG(-1053931535);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(aVy, bfm, i) ? 1 : 0);
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
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(AuraButtonCorner.ROUNDED, bfm, 54, 0);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            B1U b1uA00 = B1V.A00(bfm, new AnonymousClass1(aVy), 1523785785);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchEditFileButtonKt$HatchEditFileButton$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, bRgA0R, auraLabelButtonStyleSecondary, auraButtonSize, b1uA00, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, (Function0) objAaT, null, false, 0, false, 0, bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 1769472, (iA0d << 6) & 57344, 48, 132104069);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, aVy, function0, bRg2, i, i2);
        }
    }
}
