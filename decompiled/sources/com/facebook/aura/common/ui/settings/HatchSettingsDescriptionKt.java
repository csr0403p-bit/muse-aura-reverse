package com.facebook.aura.common.ui.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.ApQ;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C1822Arm;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSettingsDescriptionKt {

    /* renamed from: com.facebook.aura.common.ui.settings.HatchSettingsDescriptionKt$HatchSettingsDescription$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ ApQ $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ApQ apQ, BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$text = apQ;
            this.$modifier = bRg;
            this.$onClick = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSettingsDescriptionKt.HatchSettingsDescription(this.$text, this.$modifier, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.common.ui.settings.HatchSettingsDescriptionKt$HatchSettingsDescription$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            HatchSettingsDescriptionKt.HatchSettingsDescription(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchSettingsDescription(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1822458622);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchSettingsDescription(AnonymousClass005.A0X(str), bRg2, null, bfm, iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, bRg2, i, i2);
        }
    }

    public static final void HatchSettingsDescription(ApQ apQ, BRg bRg, Function0<Unit> function0, BFM bfm, int i, int i2) {
        Function0<Unit> function02 = function0;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(apQ, 0);
        bfm.AgG(505163784);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, apQ) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function02 = null;
            }
            BRg bRgA07 = C3U4.A07(bRg2, AuraDimensKt.SpacingMedium);
            if (function02 != null) {
                long j = AnonymousClass003.A0c(bfm, -230894450).secondaryText;
                C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
                boolean z = (iA0d & 896) == 256;
                Object objAaT = bfm.AaT();
                if (z || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsDescriptionKt$HatchSettingsDescription$1$1(function02);
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2638AuraClickableTextZsD2BWI(apQ, bRgA07, (G0U) objAaT, null, null, null, false, j, c1822ArmA0Y, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 1048184);
            } else {
                AuraTextKt.m2640AuraTextVmYn7U0(apQ, bRgA07, AnonymousClass003.A0c(bfm, -230677512).secondaryText, C06G.A0Y(bfm), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 32752);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(apQ, bRg2, function02, i, i2);
        }
    }
}
