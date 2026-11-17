package com.facebook.aura.ui.pulltorefresh;

import X.ASF;
import X.AbstractC7559F3s;
import X.BHD;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1 extends AbstractC7559F3s implements G0U<ASF, Unit> {
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ PullRefreshState $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1(PullRefreshState pullRefreshState, boolean z) {
        super(1);
        this.$state$inlined = pullRefreshState;
        this.$enabled$inlined = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ASF asf) {
        asf.A01 = "pullRefresh";
        BHD bhd = asf.A02;
        bhd.A01("state", this.$state$inlined);
        bhd.A01("enabled", Boolean.valueOf(this.$enabled$inlined));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ASF asf) {
        invoke2(asf);
        return Unit.INSTANCE;
    }
}
