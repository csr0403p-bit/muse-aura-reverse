package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPullToRefreshKt$HatchPTRLoadingIndicator$showPTR$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ boolean $isRefreshing;
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ Function0<Float> $pullOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPullToRefreshKt$HatchPTRLoadingIndicator$showPTR$2$1(boolean z, Function0<Float> function0, Function0<Float> function02) {
        super(0);
        this.$isRefreshing = z;
        this.$progress = function0;
        this.$pullOffset = function02;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r2 = this;
            boolean r0 = r2.$isRefreshing
            if (r0 != 0) goto L1a
            kotlin.jvm.functions.Function0<java.lang.Float> r0 = r2.$progress
            float r0 = X.AnonymousClass003.A04(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L1a
            kotlin.jvm.functions.Function0<java.lang.Float> r0 = r2.$pullOffset
            float r0 = X.AnonymousClass003.A04(r0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L1b
        L1a:
            r0 = 1
        L1b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchPullToRefreshKt$HatchPTRLoadingIndicator$showPTR$2$1.invoke():java.lang.Boolean");
    }
}
