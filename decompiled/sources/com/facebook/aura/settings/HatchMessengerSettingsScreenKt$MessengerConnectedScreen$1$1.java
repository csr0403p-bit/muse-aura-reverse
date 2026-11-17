package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessengerSettingsScreenKt$MessengerConnectedScreen$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchMessengerUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessengerSettingsScreenKt$MessengerConnectedScreen$1$1(Context context, HatchMessengerUiState hatchMessengerUiState) {
        super(0);
        this.$context = context;
        this.$uiState = hatchMessengerUiState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws NumberFormatException {
        HatchMessengerSettingsScreenKt.launchMessengerOrPlayStore(this.$context, this.$uiState.agentId);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws NumberFormatException {
        invoke2();
        return Unit.INSTANCE;
    }
}
