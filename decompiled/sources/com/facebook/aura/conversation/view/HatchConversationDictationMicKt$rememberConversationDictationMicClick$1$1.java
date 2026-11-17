package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1BO;
import X.C7OU;
import X.G0U;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.composer.dictation.ComposerDictationController;
import com.facebook.aura.composer.dictation.DictationStartTrigger;
import com.facebook.aura.composer.dictation.engine.DictationMode;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationDictationMicKt$rememberConversationDictationMicClick$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<Boolean> $currentCanStartDictation$delegate;
    public final /* synthetic */ ComposerDictationController $dictation;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ C7OU<String, Boolean> $permissionLauncher;
    public final /* synthetic */ Function0<Unit> $startTapDictation;
    public final /* synthetic */ String $threadId;

    public final void invoke(boolean z) {
        if (C1BO.A0F(this.$currentCanStartDictation$delegate)) {
            boolean zHasPermission = HatchPermissionUtils.INSTANCE.hasPermission(this.$context, "android.permission.RECORD_AUDIO");
            HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
            if (!zHasPermission) {
                HatchEventType hatchEventType = HatchEventType.PERMISSION_PROMPTED;
                HatchSurface hatchSurface = HatchSurface.CHAT;
                hatchInteractionLogger.logPermission(hatchEventType, hatchSurface, null, HatchInteractionEnumsKt.chatScreen(this.$isPrimaryThread), HatchComponent.MIC_PERMISSION, null);
                HatchSubsurface hatchSubsurface = HatchSubsurface.COMPOSER;
                boolean z2 = this.$isPrimaryThread;
                hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, HatchInteractionEnumsKt.chatScreen(z2), HatchComponent.VOICE_DICTATION_BUTTON, null, AnonymousClass002.A0o(null, this.$threadId, z2), null);
                A02("android.permission.RECORD_AUDIO");
                return;
            }
            HatchSurface hatchSurface2 = HatchSurface.CHAT;
            HatchSubsurface hatchSubsurface2 = HatchSubsurface.COMPOSER;
            boolean z3 = this.$isPrimaryThread;
            hatchInteractionLogger.logClick(hatchSurface2, hatchSubsurface2, HatchInteractionEnumsKt.chatScreen(z3), HatchComponent.VOICE_DICTATION_BUTTON, null, AnonymousClass002.A0o(null, this.$threadId, z3), null);
            if (z) {
                this.$dictation.start(this.$context, DictationStartTrigger.MIC_HOLD, DictationMode.MANUAL, null, null);
            } else {
                this.$startTapDictation.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationDictationMicKt$rememberConversationDictationMicClick$1$1(Context context, boolean z, String str, ComposerDictationController composerDictationController, Function0<Unit> function0, C7OU<String, Boolean> c7ou, C1BO<Boolean> c1bo) {
        super(1);
        this.$context = context;
        this.$isPrimaryThread = z;
        this.$threadId = str;
        this.$dictation = composerDictationController;
        this.$startTapDictation = function0;
        this.$permissionLauncher = c7ou;
        this.$currentCanStartDictation$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
