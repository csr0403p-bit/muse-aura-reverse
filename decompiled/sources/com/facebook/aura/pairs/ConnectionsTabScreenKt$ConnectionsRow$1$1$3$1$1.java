package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsTabScreenKt$ConnectionsRow$1$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConnectionsPerson $person;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsTabScreenKt$ConnectionsRow$1$1$3$1$1(ConnectionsLogContext connectionsLogContext, int i, AuraNavigator auraNavigator, ConnectionsPerson connectionsPerson) {
        super(0);
        this.$log = connectionsLogContext;
        this.$index = i;
        this.$navigator = auraNavigator;
        this.$person = connectionsPerson;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
        pairsAnalytics.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.CONNECTION_AVATAR, HatchSubsurface.CONNECTIONS_ROW, pairsAnalytics.person$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$index));
        this.$navigator.navigate(this.$person.target, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
