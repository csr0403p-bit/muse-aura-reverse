package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.spaces.share.HatchPublishSpaceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchPublishSpaceState $publishState;
    public final /* synthetic */ G0U<String, Unit> $shareSpace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$6$1(G0U<? super String, Unit> g0u, HatchPublishSpaceState hatchPublishSpaceState) {
        super(0);
        this.$shareSpace = g0u;
        this.$publishState = hatchPublishSpaceState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$shareSpace.invoke(((HatchPublishSpaceState.Published) this.$publishState).url);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
