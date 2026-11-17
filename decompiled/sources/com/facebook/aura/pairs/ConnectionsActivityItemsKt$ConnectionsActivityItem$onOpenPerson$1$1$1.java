package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConnectionsActivityItemsKt$ConnectionsActivityItem$onOpenPerson$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavKey $it;
    public final /* synthetic */ G0V<HatchComponent, HatchSubsurface, Unit> $logClick;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsActivityItemsKt$ConnectionsActivityItem$onOpenPerson$1$1$1(G0V<? super HatchComponent, ? super HatchSubsurface, Unit> g0v, AuraNavigator auraNavigator, AuraNavKey auraNavKey) {
        super(0);
        this.$logClick = g0v;
        this.$navigator = auraNavigator;
        this.$it = auraNavKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$logClick.invoke(HatchComponent.CONNECTION_AVATAR, HatchSubsurface.CONNECTIONS_ACTIVITY);
        this.$navigator.navigate(this.$it, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
