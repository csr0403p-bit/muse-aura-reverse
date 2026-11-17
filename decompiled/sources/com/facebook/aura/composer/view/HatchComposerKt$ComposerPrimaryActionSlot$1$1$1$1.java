package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.C0dx;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerPrimaryActionSlot$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchComposerEntryPoint $entryPoint;
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ boolean $isSendBlocked;
    public final /* synthetic */ Function0<Unit> $onBlockedSendClick;
    public final /* synthetic */ Function0<Unit> $onSendClick;
    public final /* synthetic */ String $sendBlockedMessage;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerPrimaryActionSlot$1$1$1$1(boolean z, boolean z2, String str, HatchComposerEntryPoint hatchComposerEntryPoint, Function0<Unit> function0, String str2, C0dx c0dx, Function0<Unit> function02) {
        super(0);
        this.$isSendBlocked = z;
        this.$isPrimaryThread = z2;
        this.$threadId = str;
        this.$entryPoint = hatchComposerEntryPoint;
        this.$onBlockedSendClick = function0;
        this.$sendBlockedMessage = str2;
        this.$haptic = c0dx;
        this.$onSendClick = function02;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0;
        if (this.$isSendBlocked) {
            HatchComposerKt.logComposerClick(HatchComponent.SEND_BLOCKED_BUTTON, this.$isPrimaryThread, this.$threadId, this.$entryPoint);
            function0 = this.$onBlockedSendClick;
            if (function0 == null) {
                ToastApi.INSTANCE.showToast(this.$sendBlockedMessage);
                return;
            }
        } else {
            this.$haptic.AXr(AuraHaptics.SUCCESS);
            function0 = this.$onSendClick;
        }
        function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
