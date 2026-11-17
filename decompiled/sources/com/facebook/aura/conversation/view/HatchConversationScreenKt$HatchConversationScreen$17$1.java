package com.facebook.aura.conversation.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConversationScreenKt$HatchConversationScreen$17$1 extends C7438Evz implements G0U<String, Unit> {
    public HatchConversationScreenKt$HatchConversationScreen$17$1(Object obj) {
        super(1, obj, HatchConversationViewModel.class, "markProposalBuilding", "markProposalBuilding(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((HatchConversationViewModel) AnonymousClass006.A0o(str, this)).markProposalBuilding(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
