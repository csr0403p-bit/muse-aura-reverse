package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDeviceDetailsScreenKt$ManageDeviceSection$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $nodeId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceDetailsScreenKt$ManageDeviceSection$1$1$1$1$1(String str, Context context) {
        super(0);
        this.$nodeId = str;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.DEVICE_DETAILS, HatchComponent.MANAGE_DEVICE_BUTTON, this.$nodeId, null, null);
        MetaAiLauncherKt.launchMetaAiGlassesTab(this.$context, this.$nodeId);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
