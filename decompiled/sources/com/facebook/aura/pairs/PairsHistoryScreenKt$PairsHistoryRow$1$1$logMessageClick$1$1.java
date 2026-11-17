package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class PairsHistoryScreenKt$PairsHistoryRow$1$1$logMessageClick$1$1 extends AbstractC7559F3s implements G0V<HatchComponent, Map<String, ? extends String>, Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchComponent hatchComponent, Map<String, String> map) {
        C7384Etj.A0Y(hatchComponent, 0);
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, hatchComponent, HatchSubsurface.MESSAGE_LIST, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsHistoryScreenKt$PairsHistoryRow$1$1$logMessageClick$1$1(ConnectionsLogContext connectionsLogContext) {
        super(2);
        this.$log = connectionsLogContext;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(HatchComponent hatchComponent, Map<String, ? extends String> map) {
        invoke2(hatchComponent, (Map<String, String>) map);
        return Unit.INSTANCE;
    }
}
