package com.facebook.aura.vds.compose.card;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C3U4;
import X.G0V;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraCardDefaults$LeadingIcon$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ AVy $painter;
    public final /* synthetic */ B6A $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraCardDefaults$LeadingIcon$1(AVy aVy, B6A b6a) {
        super(2);
        this.$painter = aVy;
        this.$tint = b6a;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        long jM2544applyContentAlphaek8zF_U;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            BRg bRgA09 = C3U4.A09(BRg.A00, AuraDimensKt.SpacingMicro);
            AVy aVy = this.$painter;
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            B6A b6a = this.$tint;
            if (b6a == null) {
                BBI bbiA0M = AnonymousClass002.A0M(bfm, -22433027);
                bfm.AgE(-2078932905);
                jM2544applyContentAlphaek8zF_U = AuraCardDefaults.INSTANCE.m2481tintWaAFU9c(bfm, 6);
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(-2078933628);
                jM2544applyContentAlphaek8zF_U = ColorExtKt.m2544applyContentAlphaek8zF_U(b6a.A00, bfm, 0);
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                bfm.AgE(-2078933804);
                BBI.A0R(bbi, false);
            }
            AuraIconKt.m2567AuraIconFHprtrg(bRgA09, aVy, auraIconSize, null, jM2544applyContentAlphaek8zF_U, null, bfm, AnonymousClass001.A03(), 40);
            return;
        }
        bfm.Afo();
    }
}
