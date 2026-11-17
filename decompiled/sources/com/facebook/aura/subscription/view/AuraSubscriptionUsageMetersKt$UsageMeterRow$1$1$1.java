package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C06G;
import X.G0V;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageMetersKt$UsageMeterRow$1$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Integer $clampedPercent;
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageMetersKt$UsageMeterRow$1$1$1(String str, AuraColors auraColors, Integer num) {
        super(2);
        this.$title = str;
        this.$colors = auraColors;
        this.$clampedPercent = num;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            if (this.$title != null) {
                bfm.AgE(422302825);
                AuraTextKt.m2639AuraTextUY9GdpU(this.$title, null, this.$colors.primaryText, C06G.A0T(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            } else if (this.$clampedPercent == null) {
                bfm.AgE(422589730);
                AuraSubscriptionUsageMetersKt.m2273MeterSkeletonBarorJrPs(120.0f, null, bfm, 6, 2);
            } else {
                bfm.AgE(422649312);
            }
            AnonymousClass002.A19(bfm);
            return;
        }
        bfm.Afo();
    }
}
