package com.facebook.aura.library.view;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C1V6;
import X.C1VW;
import X.G0V;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1$invoke$$inlined$items$default$3 implements G0V<C1V6, Integer, C1VW> {
    public final /* synthetic */ List $items;
    public final /* synthetic */ G0V $span;

    public HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1$invoke$$inlined$items$default$3(G0V g0v, List list) {
        this.$span = g0v;
        this.$items = list;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ C1VW invoke(C1V6 c1v6, Integer num) {
        return new C1VW(m1169invoke_orMbw(c1v6, AnonymousClass001.A0F(num)));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m1169invoke_orMbw(C1V6 c1v6, int i) {
        return ((C1VW) AnonymousClass006.A0n(c1v6, this.$items, this.$span, i)).A00;
    }
}
