package com.facebook.aura.conversation.viewmodel;

import X.HtJ;
import X.HwV;
import X.HzP;
import com.facebook.aura.conversation.repo.HatchConversationState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.status.repo.AgentActivityInfo;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$10$2", f = "HatchConversationViewModel.kt", l = {611}, m = "emit", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationViewModel$10$2$emit$1 extends HzP {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchConversationViewModel.AnonymousClass10.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationViewModel$10$2$emit$1(HatchConversationViewModel.AnonymousClass10.AnonymousClass2<? super T> anonymousClass2, HtJ<? super HatchConversationViewModel$10$2$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((HwV<HatchConversationState, AgentActivityInfo, Boolean>) null, (HtJ<? super Unit>) this);
    }
}
