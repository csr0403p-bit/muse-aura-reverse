package com.facebook.aura.ui.pulltorefresh;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0U;

/* loaded from: classes.dex */
public final /* synthetic */ class PullRefreshKt$pullRefresh$2$1$1 extends C7438Evz implements G0U<Float, Float> {
    public PullRefreshKt$pullRefresh$2$1$1(Object obj) {
        super(1, obj, PullRefreshState.class, "onPull", "onPull$fbandroid_express_aura_java_com_facebook_aura_ui_pulltorefresh_pulltorefresh(F)F", 0);
    }

    public final Float invoke(float f) {
        return Float.valueOf(((PullRefreshState) this.receiver).onPull$fbandroid_express_aura_java_com_facebook_aura_ui_pulltorefresh_pulltorefresh(f));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(AnonymousClass001.A02(f));
    }
}
