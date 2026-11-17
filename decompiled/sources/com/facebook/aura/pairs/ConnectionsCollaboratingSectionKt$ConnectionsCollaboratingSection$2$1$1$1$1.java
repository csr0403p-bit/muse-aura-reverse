package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsCollaboratingSectionKt$ConnectionsCollaboratingSection$2$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ ConnectionsResource $item;
    public final /* synthetic */ ConnectionsLogContext $log;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsCollaboratingSectionKt$ConnectionsCollaboratingSection$2$1$1$1$1(ConnectionsLogContext connectionsLogContext, ConnectionsResource connectionsResource, int i) {
        super(0);
        this.$log = connectionsLogContext;
        this.$item = connectionsResource;
        this.$index = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
        pairsAnalytics.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.COLLABORATING_ITEM_ROW, HatchSubsurface.CONNECTION_COLLABORATING, pairsAnalytics.collaboratingItem$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$item.kind, this.$index));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
