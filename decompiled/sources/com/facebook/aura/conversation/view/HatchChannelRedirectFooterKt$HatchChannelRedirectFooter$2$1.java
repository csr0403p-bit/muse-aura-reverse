package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.model.HatchMessageChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchChannelRedirectFooterKt$HatchChannelRedirectFooter$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchMessageChannel $channel;
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchChannelRedirectFooterKt$HatchChannelRedirectFooter$2$1(HatchMessageChannel hatchMessageChannel, Context context) {
        super(0);
        this.$channel = hatchMessageChannel;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.COMPOSER, HatchScreen.SUBTHREAD, HatchComponent.CHANNELS_BUTTON, null, null, null);
        HatchChannelRedirectFooterKt.openChannelConversation(this.$channel, this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
