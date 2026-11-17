package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsSheetScreenKt$ConnectionsSheetContent$onRemoveClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> $connectionType;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ Function0<Unit> $onRemove;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsSheetScreenKt$ConnectionsSheetContent$onRemoveClick$1$1(ConnectionsLogContext connectionsLogContext, Map<String, String> map, Function0<Unit> function0) {
        super(0);
        this.$log = connectionsLogContext;
        this.$connectionType = map;
        this.$onRemove = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.CONNECTION_REMOVE_BUTTON, HatchSubsurface.DOT_MENU, this.$connectionType);
        this.$onRemove.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
