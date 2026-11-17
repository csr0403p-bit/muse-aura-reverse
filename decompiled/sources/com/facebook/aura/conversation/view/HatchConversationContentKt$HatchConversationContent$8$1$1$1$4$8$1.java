package com.facebook.aura.conversation.view;

import X.C7438Evz;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$8$1 extends C7438Evz implements Function0<Unit> {
    public HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$8$1(Object obj) {
        super(0, obj, HatchConversationViewModel.class, "stopDictation", "stopDictation()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchConversationViewModel) this.receiver).stopDictation();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
