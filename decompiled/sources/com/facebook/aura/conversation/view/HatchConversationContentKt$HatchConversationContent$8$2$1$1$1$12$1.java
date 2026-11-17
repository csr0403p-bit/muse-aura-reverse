package com.facebook.aura.conversation.view;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$12$1 extends C7438Evz implements G0V<String, Integer, Unit> {
    public HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$12$1(Object obj) {
        super(2, obj, HatchConversationViewModel.class, "setWidgetHeight", "setWidgetHeight(Ljava/lang/String;I)V", 0);
    }

    public final void invoke(String str, int i) {
        ((HatchConversationViewModel) AnonymousClass006.A0o(str, this)).setWidgetHeight(str, i);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
        invoke(str, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
