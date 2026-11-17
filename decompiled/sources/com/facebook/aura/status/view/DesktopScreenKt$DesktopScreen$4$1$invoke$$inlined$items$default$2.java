package com.facebook.aura.status.view;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.G0U;
import java.util.List;

/* loaded from: classes.dex */
public final class DesktopScreenKt$DesktopScreen$4$1$invoke$$inlined$items$default$2 implements G0U<Integer, Object> {
    public final /* synthetic */ List $items;
    public final /* synthetic */ G0U $key;

    public DesktopScreenKt$DesktopScreen$4$1$invoke$$inlined$items$default$2(G0U g0u, List list) {
        this.$key = g0u;
        this.$items = list;
    }

    public final Object invoke(int i) {
        return AnonymousClass006.A0p(this.$items, this.$key, i);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(AnonymousClass001.A0F(num));
    }
}
