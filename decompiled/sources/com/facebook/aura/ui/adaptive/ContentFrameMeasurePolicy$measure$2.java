package com.facebook.aura.ui.adaptive;

import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ContentFrameMeasurePolicy$measure$2 extends AbstractC7559F3s implements G0U<AYU, Unit> {
    public final /* synthetic */ List<AZE> $placeables;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AYU ayu) {
        C7384Etj.A0Y(ayu, 0);
        List<AZE> list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AYU.A04(ayu, list.get(i), 0, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContentFrameMeasurePolicy$measure$2(List<? extends AZE> list) {
        super(1);
        this.$placeables = list;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
        invoke2(ayu);
        return Unit.INSTANCE;
    }
}
