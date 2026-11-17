package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C06G;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageMetersKt$UsageMeterRow$1$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Integer $clampedPercent;
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ String $valueLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageMetersKt$UsageMeterRow$1$1$2(Integer num, String str, AuraColors auraColors) {
        super(2);
        this.$clampedPercent = num;
        this.$valueLabel = str;
        this.$colors = auraColors;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            if (this.$clampedPercent == null) {
                bfm.AgE(-809002428);
                AuraSubscriptionUsageMetersKt.m2273MeterSkeletonBarorJrPs(96.0f, null, bfm, 6, 2);
            } else {
                bfm.AgE(-808910203);
                String strA0t = this.$valueLabel;
                if (strA0t == null) {
                    bfm.AgE(-1550111737);
                    strA0t = AnonymousClass001.A0t(bfm, this.$clampedPercent, R.string._name_removed__res_0x7f1210b3);
                } else {
                    bfm.AgE(-1550112977);
                }
                AnonymousClass001.A1D(bfm);
                AuraTextKt.m2639AuraTextUY9GdpU(strA0t, null, this.$colors.secondaryText, C06G.A0Y(bfm), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
