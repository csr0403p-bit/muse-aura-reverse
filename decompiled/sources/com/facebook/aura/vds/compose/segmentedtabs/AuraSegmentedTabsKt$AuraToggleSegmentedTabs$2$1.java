package com.facebook.aura.vds.compose.segmentedtabs;

import X.AHD;
import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C16a;
import X.C1BO;
import X.C7384Etj;
import X.EnumC1820Arj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSegmentedTabsKt$AuraToggleSegmentedTabs$2$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ C1BO<Float> $animatedFraction$delegate;
    public final /* synthetic */ float $pillCornerRadiusPx;
    public final /* synthetic */ long $selectedBackground;
    public final /* synthetic */ AHD<AuraTab> $tabs;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        if (this.$tabs.isEmpty()) {
            return;
        }
        float fA00 = AnonymousClass001.A00(at3.AKb()) / this.$tabs.size();
        float fA01 = C1BO.A01(this.$animatedFraction$delegate);
        long jAKb = at3.AKb();
        float fA002 = AnonymousClass001.A00(jAKb);
        float f = fA01 * fA002;
        if (at3.getLayoutDirection() == EnumC1820Arj.A03) {
            f = (fA002 - f) - fA00;
        }
        long j = this.$selectedBackground;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (AnonymousClass002.A0F() & 4294967295L);
        long jA0M = AnonymousClass005.A0M(fA00, AnonymousClass001.A01(jAKb, 4294967295L));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(this.$pillCornerRadiusPx);
        at3.A9j(null, C16a.A00, 1.0f, 3, j, jFloatToRawIntBits, jA0M, (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits2 << 32));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSegmentedTabsKt$AuraToggleSegmentedTabs$2$1(AHD<? extends AuraTab> ahd, long j, float f, C1BO<Float> c1bo) {
        super(1);
        this.$tabs = ahd;
        this.$selectedBackground = j;
        this.$pillCornerRadiusPx = f;
        this.$animatedFraction$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
