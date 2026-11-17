package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C07C;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSectionKt$HatchSection$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ G0U<HatchSectionScope, Unit> $content;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $header;
    public final /* synthetic */ boolean $showVerticalSpacer;
    public final /* synthetic */ C07C $this_HatchSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSectionKt$HatchSection$2(C07C c07c, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, long j, G0U<? super HatchSectionScope, Unit> g0u, int i, int i2) {
        super(2);
        this.$this_HatchSection = c07c;
        this.$showVerticalSpacer = z;
        this.$header = g0v;
        this.$backgroundColor = j;
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
        HatchSectionKt.m2326HatchSectionuDo3WH8(this.$this_HatchSection, this.$showVerticalSpacer, this.$header, this.$backgroundColor, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
