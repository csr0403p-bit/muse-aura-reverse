package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C07C;
import X.G0V;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailComponentsKt$EmailSettingsScroll$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
    public final /* synthetic */ float $indicatorTopPadding;
    public final /* synthetic */ boolean $isRefreshing;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onRefresh;
    public final /* synthetic */ boolean $scrollable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailComponentsKt$EmailSettingsScroll$2(BRg bRg, Function0<Unit> function0, boolean z, float f, boolean z2, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$onRefresh = function0;
        this.$isRefreshing = z;
        this.$indicatorTopPadding = f;
        this.$scrollable = z2;
        this.$content = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        EmailComponentsKt.m746EmailSettingsScrolljIwJxvA(this.$modifier, this.$onRefresh, this.$isRefreshing, this.$indicatorTopPadding, this.$scrollable, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
