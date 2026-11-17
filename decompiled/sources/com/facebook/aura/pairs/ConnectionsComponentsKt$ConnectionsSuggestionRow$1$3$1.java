package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsComponentsKt$ConnectionsSuggestionRow$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ G0U<PairsSuggestion, Unit> $onShareLink;
    public final /* synthetic */ PairsSuggestion $person;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsComponentsKt$ConnectionsSuggestionRow$1$3$1(ConnectionsLogContext connectionsLogContext, G0U<? super PairsSuggestion, Unit> g0u, PairsSuggestion pairsSuggestion) {
        super(0);
        this.$log = connectionsLogContext;
        this.$onShareLink = g0u;
        this.$person = pairsSuggestion;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.SHARE_INVITE_LINK_BUTTON, HatchSubsurface.DOT_MENU, null);
        this.$onShareLink.invoke(this.$person);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
