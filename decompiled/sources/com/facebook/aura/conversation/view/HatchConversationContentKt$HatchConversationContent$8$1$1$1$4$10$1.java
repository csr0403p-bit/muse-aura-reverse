package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$10$1 extends AbstractC7559F3s implements Function0<Unit> {
    public static final HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$10$1 INSTANCE = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$10$1();

    public HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$10$1() {
        super(0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logSwipe(HatchSurface.CHAT, HatchSubsurface.COMPOSER, HatchScreen.MAIN_CHAT, HatchComponent.THREAD_SIDEBAR, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
