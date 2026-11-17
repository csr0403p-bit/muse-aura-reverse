package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.utils.HatchDefaultAssistantUtils;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDefaultAssistantSettingsScreenKt$DefaultAssistantSideChatToggle$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isSideChatEnabled$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDefaultAssistantSettingsScreenKt$DefaultAssistantSideChatToggle$1$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$isSideChatEnabled$delegate = mutableState;
    }

    public final void invoke(boolean z) {
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.SETTINGS, HatchSubsurface.DEFAULT_ASSISTANT, HatchScreen.DEFAULT_ASSISTANT, HatchComponent.DEFAULT_ASSISTANT_BUTTON, null, null);
        MutableState.A09(z, this.$isSideChatEnabled$delegate);
        HatchDefaultAssistantUtils.INSTANCE.setSideChatForDefaultAssistantEnabled(z);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
