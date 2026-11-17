package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C10G;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerInputDecoration$1$1 extends AbstractC7559F3s implements G0W<String, BFM, Integer, Unit> {
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ AuraTypography $typography;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerInputDecoration$1$1(AuraColors auraColors, AuraTypography auraTypography) {
        super(3);
        this.$colors = auraColors;
        this.$typography = auraTypography;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, BFM bfm, Integer num) {
        invoke(str, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(String str, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(str, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, str);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AuraTextKt.m2639AuraTextUY9GdpU(str, C10G.A02, this.$colors.tertiaryText, this.$typography.bodyRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306416, 6, 14832);
            return;
        }
        bfm.Afo();
    }
}
