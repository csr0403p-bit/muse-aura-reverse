package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0dx;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$leadingButtons$1$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $captureActionsInPlusMenu;
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ MutableState<Boolean> $showAttachmentMenu$delegate;
    public final /* synthetic */ MutableState<Boolean> $showCaptureMenu$delegate;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$leadingButtons$1$1$1$2$1(C0dx c0dx, boolean z, String str, boolean z2, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$haptic = c0dx;
        this.$isPrimaryThread = z;
        this.$threadId = str;
        this.$captureActionsInPlusMenu = z2;
        this.$showCaptureMenu$delegate = mutableState;
        this.$showAttachmentMenu$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$haptic.AXr(AuraHaptics.BUTTON_TAP);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.COMPOSER;
        boolean z = this.$isPrimaryThread;
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.PLUS_BUTTON, null, AnonymousClass002.A0o(null, this.$threadId, z), null);
        if (this.$captureActionsInPlusMenu) {
            MutableState.A09(true, this.$showCaptureMenu$delegate);
        } else {
            MutableState.A09(true, this.$showAttachmentMenu$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
