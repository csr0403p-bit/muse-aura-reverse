package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsSheetScreenKt$ConnectionsSheetScreen$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $confirmRemove$delegate;
    public final /* synthetic */ Map<String, String> $connectionType;
    public final /* synthetic */ ConnectionsLogContext $log;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsSheetScreenKt$ConnectionsSheetScreen$5$1(ConnectionsLogContext connectionsLogContext, Map<String, String> map, MutableState<Boolean> mutableState) {
        super(0);
        this.$log = connectionsLogContext;
        this.$connectionType = map;
        this.$confirmRemove$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.DELETE_CANCEL_BUTTON, HatchSubsurface.CONNECTIONS_DIALOG, this.$connectionType);
        MutableState.A09(false, this.$confirmRemove$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
