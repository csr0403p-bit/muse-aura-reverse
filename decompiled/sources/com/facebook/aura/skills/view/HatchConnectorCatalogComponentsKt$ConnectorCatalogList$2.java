package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C0CD;
import X.G0U;
import X.G0V;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogComponentsKt$ConnectorCatalogList$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ G0U<C0CD, Unit> $content;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $header;
    public final /* synthetic */ boolean $isRefreshing;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onRefresh;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorCatalogComponentsKt$ConnectorCatalogList$2(LazyListState lazyListState, float f, float f2, boolean z, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, G0U<? super C0CD, Unit> g0u, int i, int i2) {
        super(2);
        this.$listState = lazyListState;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$isRefreshing = z;
        this.$onRefresh = function0;
        this.$modifier = bRg;
        this.$header = g0v;
        this.$content = g0u;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchConnectorCatalogComponentsKt.m2144ConnectorCatalogListeWuZFaY(this.$listState, this.$topPadding, this.$bottomPadding, this.$isRefreshing, this.$onRefresh, this.$modifier, this.$header, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
