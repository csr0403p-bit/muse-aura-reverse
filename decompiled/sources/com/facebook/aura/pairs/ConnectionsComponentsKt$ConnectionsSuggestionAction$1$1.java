package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsComponentsKt$ConnectionsSuggestionAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ G0U<PairsSuggestion, Unit> $onConnect;
    public final /* synthetic */ PairsSuggestion $person;
    public final /* synthetic */ int $position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsComponentsKt$ConnectionsSuggestionAction$1$1(ConnectionsLogContext connectionsLogContext, int i, G0U<? super PairsSuggestion, Unit> g0u, PairsSuggestion pairsSuggestion) {
        super(0);
        this.$log = connectionsLogContext;
        this.$position = i;
        this.$onConnect = g0u;
        this.$person = pairsSuggestion;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
        pairsAnalytics.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.CONNECTION_ADD_BUTTON, HatchSubsurface.CONNECTIONS_SUGGESTIONS, pairsAnalytics.position$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$position));
        this.$onConnect.invoke(this.$person);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
