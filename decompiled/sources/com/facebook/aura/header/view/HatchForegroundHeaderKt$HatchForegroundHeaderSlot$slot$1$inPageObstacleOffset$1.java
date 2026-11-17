package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C2ae;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchForegroundHeaderKt$HatchForegroundHeaderSlot$slot$1$inPageObstacleOffset$1 extends AbstractC7559F3s implements Function0<C2ae> {
    public final /* synthetic */ HatchForegroundHeaderState $host;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchForegroundHeaderKt$HatchForegroundHeaderSlot$slot$1$inPageObstacleOffset$1(HatchForegroundHeaderState hatchForegroundHeaderState) {
        super(0);
        this.$host = hatchForegroundHeaderState;
    }

    /* renamed from: invoke-nOcc-ac, reason: not valid java name */
    public final long m991invokenOccac() {
        return AnonymousClass005.A0N(-this.$host.contentInsetPx$delegate.AGd());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C2ae invoke() {
        return new C2ae(m991invokenOccac());
    }
}
