package com.facebook.aura.conversation.viewmodel;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.model.HatchSendMessage;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationViewModel$composerRegistration$3 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ HatchConversationViewModel this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.this$0.onWidgetSendMessage(new HatchSendMessage(str, null, null, null, null, null, null, null, null, false, null, null, null, 8190, null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationViewModel$composerRegistration$3(HatchConversationViewModel hatchConversationViewModel) {
        super(1);
        this.this$0 = hatchConversationViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
