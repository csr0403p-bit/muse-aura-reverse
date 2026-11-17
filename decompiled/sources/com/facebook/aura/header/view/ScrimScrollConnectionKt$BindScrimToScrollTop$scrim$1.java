package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ScrimScrollConnectionKt$BindScrimToScrollTop$scrim$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ LazyListState $listState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrimScrollConnectionKt$BindScrimToScrollTop$scrim$1(LazyListState lazyListState, int i) {
        super(2);
        this.$listState = lazyListState;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        ScrimScrollConnectionKt.BindScrimToScrollTop(this.$listState, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
