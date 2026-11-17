package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.gateway.service.HatchForegroundService;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRunInBackgroundCardKt$HatchRunInBackgroundCard$2$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Boolean> $enabled$delegate;
    public final /* synthetic */ HatchGatewayPrefsStore $prefs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRunInBackgroundCardKt$HatchRunInBackgroundCard$2$1$2$1(HatchGatewayPrefsStore hatchGatewayPrefsStore, Context context, MutableState<Boolean> mutableState) {
        super(0);
        this.$prefs = hatchGatewayPrefsStore;
        this.$context = context;
        this.$enabled$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$prefs.setRunInBackgroundEnabled(true);
        HatchForegroundService.Companion.startPersistent(this.$context);
        MutableState.A09(true, this.$enabled$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
