package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.accountcenter.AuraAccountsCenterActivity;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$AccountsCenterSection$3$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $acWasOpened$delegate;
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$AccountsCenterSection$3$1$1$2$1(Context context, MutableState<Boolean> mutableState) {
        super(0);
        this.$context = context;
        this.$acWasOpened$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.TAB_SETTINGS, HatchScreen.SETTINGS_MAIN, HatchComponent.ACCOUNTS_CENTER_BUTTON, null, null, null);
        MutableState.A09(true, this.$acWasOpened$delegate);
        AuraAccountsCenterActivity.Companion.launchFromSettings(this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
