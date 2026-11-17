package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$logClick$1$1 extends AbstractC7559F3s implements G0V<HatchComponent, HatchSubsurface, Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ ConnectionsLogContext $log;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$logClick$1$1(ConnectionsLogContext connectionsLogContext, int i) {
        super(2);
        this.$log = connectionsLogContext;
        this.$index = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchComponent hatchComponent, HatchSubsurface hatchSubsurface) {
        AnonymousClass003.A0u(hatchComponent, hatchSubsurface);
        PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
        pairsAnalytics.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, hatchComponent, hatchSubsurface, pairsAnalytics.position$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$index));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(HatchComponent hatchComponent, HatchSubsurface hatchSubsurface) {
        invoke2(hatchComponent, hatchSubsurface);
        return Unit.INSTANCE;
    }
}
