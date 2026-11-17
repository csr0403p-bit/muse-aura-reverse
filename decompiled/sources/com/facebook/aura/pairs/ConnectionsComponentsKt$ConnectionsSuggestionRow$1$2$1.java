package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsComponentsKt$ConnectionsSuggestionRow$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ int $position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsComponentsKt$ConnectionsSuggestionRow$1$2$1(ConnectionsLogContext connectionsLogContext, int i) {
        super(0);
        this.$log = connectionsLogContext;
        this.$position = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
        pairsAnalytics.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.THREE_DOTS_MENU, HatchSubsurface.CONNECTIONS_SUGGESTIONS, pairsAnalytics.position$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$position));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
