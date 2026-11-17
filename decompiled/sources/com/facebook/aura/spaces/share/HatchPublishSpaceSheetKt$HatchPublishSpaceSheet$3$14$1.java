package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$14$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<HatchScreen, Unit> $closeWithButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$14$1(G0U<? super HatchScreen, Unit> g0u) {
        super(0);
        this.$closeWithButton = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$closeWithButton.invoke(HatchScreen.PUBLISH_FAILED);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
