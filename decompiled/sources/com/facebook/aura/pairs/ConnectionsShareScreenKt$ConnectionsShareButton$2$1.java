package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConnectionsShareScreenKt$ConnectionsShareButton$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<HatchComponent, Unit> $onShare;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsShareScreenKt$ConnectionsShareButton$2$1(G0U<? super HatchComponent, Unit> g0u) {
        super(0);
        this.$onShare = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onShare.invoke(HatchComponent.CONNECTIONS_SHARE_RETRY_BUTTON);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
