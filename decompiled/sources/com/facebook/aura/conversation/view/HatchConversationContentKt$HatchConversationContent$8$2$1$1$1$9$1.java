package com.facebook.aura.conversation.view;

import X.AnonymousClass005;
import X.C7438Evz;
import X.G0W;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$9$1 extends C7438Evz implements G0W<String, String, String, Unit> {
    public HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$9$1(Object obj) {
        super(3, obj, HatchConversationViewModel.class, "onWidgetSetState", "onWidgetSetState(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        ((HatchConversationViewModel) this.receiver).onWidgetSetState(str, str2, str3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.INSTANCE;
    }
}
