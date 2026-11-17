package com.facebook.aura.bugreport;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.G0U;
import X.G0V;
import java.util.List;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$invoke$$inlined$itemsIndexed$default$1 implements G0U<Integer, Object> {
    public final /* synthetic */ List $items;
    public final /* synthetic */ G0V $key;

    public AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$invoke$$inlined$itemsIndexed$default$1(G0V g0v, List list) {
        this.$key = g0v;
        this.$items = list;
    }

    public final Object invoke(int i) {
        return AnonymousClass006.A0n(Integer.valueOf(i), this.$items, this.$key, i);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(AnonymousClass001.A0F(num));
    }
}
