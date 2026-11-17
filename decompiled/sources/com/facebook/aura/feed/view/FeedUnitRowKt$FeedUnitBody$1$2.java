package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C10G;
import X.C1Cd;
import X.G0U;
import X.G0W;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitBody$1$2 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ boolean $endsInMedia;
    public final /* synthetic */ G0U<FeedUnit, Unit> $onDelete;
    public final /* synthetic */ FeedUnit $unit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedUnitBody$1$2(FeedUnit feedUnit, int i, G0U<? super FeedUnit, Unit> g0u, boolean z) {
        super(3);
        this.$unit = feedUnit;
        this.$absolutePosition = i;
        this.$onDelete = g0u;
        this.$endsInMedia = z;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        float f;
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            FeedUnit feedUnit = this.$unit;
            int i2 = this.$absolutePosition;
            G0U<FeedUnit, Unit> g0u = this.$onDelete;
            if (this.$endsInMedia) {
                f = FeedUnitRowKt.WhyReasonDividerTopPaddingUnderMedia;
            } else {
                f = FeedUnitRowKt.WhyReasonDividerTopPadding;
            }
            FeedUnitRowKt.m838FeedUnitWhyReasonhGBTI10(feedUnit, i2, g0u, f, FeedUnitRowKt.unitInsets(C10G.A02), bfm, 0, 0);
            return;
        }
        bfm.Afo();
    }
}
