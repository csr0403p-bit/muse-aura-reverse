package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsShareScreenKt$ConnectionsShareScreen$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> $contentType;
    public final /* synthetic */ ConnectionsLogContext $log;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsShareScreenKt$ConnectionsShareScreen$1$2$1(ConnectionsLogContext connectionsLogContext, Map<String, String> map) {
        super(0);
        this.$log = connectionsLogContext;
        this.$contentType = map;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.CLOSE_BUTTON, HatchSubsurface.HEADER, this.$contentType);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
