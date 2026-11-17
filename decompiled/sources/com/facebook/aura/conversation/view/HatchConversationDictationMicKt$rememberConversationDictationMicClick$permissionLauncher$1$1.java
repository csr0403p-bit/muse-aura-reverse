package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationDictationMicKt$rememberConversationDictationMicClick$permissionLauncher$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ C1BO<Boolean> $currentCanStartDictation$delegate;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ Function0<Unit> $onMicPermissionDenied;
    public final /* synthetic */ Function0<Unit> $startTapDictation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationDictationMicKt$rememberConversationDictationMicClick$permissionLauncher$1$1(boolean z, Function0<Unit> function0, Function0<Unit> function02, C1BO<Boolean> c1bo) {
        super(1);
        this.$isPrimaryThread = z;
        this.$startTapDictation = function0;
        this.$onMicPermissionDenied = function02;
        this.$currentCanStartDictation$delegate = c1bo;
    }

    public final void invoke(boolean z) {
        Function0<Unit> function0;
        HatchInteractionLogger.INSTANCE.logPermission(z ? HatchEventType.PERMISSION_ACCEPTED : HatchEventType.PERMISSION_DENIED, HatchSurface.CHAT, null, HatchInteractionEnumsKt.chatScreen(this.$isPrimaryThread), HatchComponent.MIC_PERMISSION, null);
        if (C1BO.A0F(this.$currentCanStartDictation$delegate)) {
            if (z) {
                function0 = this.$startTapDictation;
            } else {
                function0 = this.$onMicPermissionDenied;
                if (function0 == null) {
                    return;
                }
            }
            function0.invoke();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
