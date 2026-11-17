package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerPrimaryActionSlot$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ Function0<Unit> $onStopClick;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerPrimaryActionSlot$1$2$1$1(boolean z, String str, Function0<Unit> function0) {
        super(0);
        this.$isPrimaryThread = z;
        this.$threadId = str;
        this.$onStopClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.COMPOSER;
        boolean z = this.$isPrimaryThread;
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.STOP_BUTTON, null, AnonymousClass002.A0o(null, this.$threadId, z), null);
        this.$onStopClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
