package com.facebook.aura.ui.adaptive;

import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ContentFrameMeasurePolicy$measure$1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
    public final /* synthetic */ Integer $areaWidthPx;
    public final /* synthetic */ List<AZE> $placeables;
    public final /* synthetic */ int $width;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AYU ayu) {
        C7384Etj.A0Y(ayu, 0);
        List<AZE> list = this.$placeables;
        int i = this.$width;
        Integer num = this.$areaWidthPx;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AZE aze = list.get(i2);
            int iIntValue = num.intValue();
            AYU.A04(ayu, aze, (i - iIntValue) + ((iIntValue - aze.A01) / 2), 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContentFrameMeasurePolicy$measure$1(List<? extends AZE> list, int i, Integer num) {
        super(1);
        this.$placeables = list;
        this.$width = i;
        this.$areaWidthPx = num;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
        invoke2(ayu);
        return Unit.INSTANCE;
    }
}
