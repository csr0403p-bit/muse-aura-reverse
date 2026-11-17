package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1BO;
import X.G2k;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onNewThreadClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismissRequest;
    public final /* synthetic */ C1BO<G2k<String, String, Boolean, String, Long, Unit>> $currentOnThreadSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$onNewThreadClick$1$1(C1BO<? extends Function0<Unit>> c1bo, C1BO<? extends G2k<? super String, ? super String, ? super Boolean, ? super String, ? super Long, Unit>> c1bo2) {
        super(0);
        this.$currentOnDismissRequest = c1bo;
        this.$currentOnThreadSelected = c1bo2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, HatchScreen.CONVERSATION_HISTORY, HatchComponent.NEW_THREAD_BUTTON, null, null, null);
        C1BO.A0D(this.$currentOnDismissRequest);
        this.$currentOnThreadSelected.getValue().invoke(AnonymousClass002.A0k(), null, AnonymousClass001.A0i(), null, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
