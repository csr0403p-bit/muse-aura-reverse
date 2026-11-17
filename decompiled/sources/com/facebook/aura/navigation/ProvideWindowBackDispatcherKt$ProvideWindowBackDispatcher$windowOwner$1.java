package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ProvideWindowBackDispatcherKt$ProvideWindowBackDispatcher$windowOwner$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProvideWindowBackDispatcherKt$ProvideWindowBackDispatcher$windowOwner$1(G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
        super(2);
        this.$content = g0v;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        ProvideWindowBackDispatcherKt.ProvideWindowBackDispatcher(this.$content, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
