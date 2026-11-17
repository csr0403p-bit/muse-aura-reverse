package com.facebook.aura.ui.pulltorefresh;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ui.pulltorefresh.PullRefreshKt$pullRefresh$2$2$1", f = "PullRefresh.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class PullRefreshKt$pullRefresh$2$2$1 extends AbstractC07127nr implements G0V<Float, HtJ<? super Unit>, Object> {
    public final /* synthetic */ PullRefreshState $state;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshKt$pullRefresh$2$2$1(PullRefreshState pullRefreshState, HtJ<? super PullRefreshKt$pullRefresh$2$2$1> htJ) {
        super(2, htJ);
        this.$state = pullRefreshState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PullRefreshKt$pullRefresh$2$2$1(this.$state, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$state.onRelease$fbandroid_express_aura_java_com_facebook_aura_ui_pulltorefresh_pulltorefresh();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(Float f, HtJ<? super Unit> htJ) {
        return invoke(AnonymousClass001.A02(f), htJ);
    }

    public final Object invoke(float f, HtJ<? super Unit> htJ) {
        return new PullRefreshKt$pullRefresh$2$2$1(this.$state, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
