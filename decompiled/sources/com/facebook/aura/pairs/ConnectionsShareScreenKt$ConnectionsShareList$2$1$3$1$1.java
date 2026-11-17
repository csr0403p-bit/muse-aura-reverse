package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C3cG;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsShareScreenKt$ConnectionsShareList$2$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ G0W<String, Integer, Boolean, Unit> $onToggle;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ ConnectionsShareTarget $target;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsShareScreenKt$ConnectionsShareList$2$1$3$1$1(G0W<? super String, ? super Integer, ? super Boolean, Unit> g0w, ConnectionsShareTarget connectionsShareTarget, int i, boolean z) {
        super(0);
        this.$onToggle = g0w;
        this.$target = connectionsShareTarget;
        this.$index = i;
        this.$selected = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onToggle.invoke(this.$target.connectionId, Integer.valueOf(this.$index), C3cG.A0P(this.$selected));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
