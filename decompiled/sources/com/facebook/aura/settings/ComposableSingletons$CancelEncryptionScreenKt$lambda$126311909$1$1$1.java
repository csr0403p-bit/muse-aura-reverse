package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$CancelEncryptionScreenKt$lambda$126311909$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public static final ComposableSingletons$CancelEncryptionScreenKt$lambda$126311909$1$1$1 INSTANCE = new ComposableSingletons$CancelEncryptionScreenKt$lambda$126311909$1$1$1();

    public ComposableSingletons$CancelEncryptionScreenKt$lambda$126311909$1$1$1() {
        super(0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.ENCRYPTION, HatchScreen.ENCRYPTION, HatchComponent.EXPORT_DATA_BUTTON, null, null, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
