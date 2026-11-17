package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectionsSheetKey;
import com.facebook.aura.navigation.key.ConnectionsSheetSubject;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsTabScreenKt$ConnectionsRow$1$1$5$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ List<ConnectionsPerson> $connections;
    public final /* synthetic */ ConnectionsGroup $group;
    public final /* synthetic */ int $index;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsTabScreenKt$ConnectionsRow$1$1$5$1$1(ConnectionsLogContext connectionsLogContext, ConnectionsGroup connectionsGroup, List<ConnectionsPerson> list, int i, AuraNavigator auraNavigator) {
        super(0);
        this.$log = connectionsLogContext;
        this.$group = connectionsGroup;
        this.$connections = list;
        this.$index = i;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
        pairsAnalytics.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.CONNECTION_AVATAR, HatchSubsurface.CONNECTIONS_ROW, pairsAnalytics.group$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$group.provider, this.$connections.size() + this.$index));
        AuraNavigator auraNavigator = this.$navigator;
        F0C<C9hr<Object>>[] f0cArr = ConnectionsSheetKey.$childSerializers;
        auraNavigator.navigate((AuraNavKey) new ConnectionsSheetKey(new ConnectionsSheetSubject.Group(this.$group.connectionId)), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
