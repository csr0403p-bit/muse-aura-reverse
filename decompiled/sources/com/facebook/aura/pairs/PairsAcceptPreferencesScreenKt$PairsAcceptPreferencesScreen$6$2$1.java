package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$6$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ MutableState<PairsContact> $removal$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$6$2$1(ConnectionsLogContext connectionsLogContext, MutableState<PairsContact> mutableState) {
        super(0);
        this.$log = connectionsLogContext;
        this.$removal$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.DELETE_CANCEL_BUTTON, HatchSubsurface.CONNECTIONS_DIALOG, null);
        this.$removal$delegate.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
