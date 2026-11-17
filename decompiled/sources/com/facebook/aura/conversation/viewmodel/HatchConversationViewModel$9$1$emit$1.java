package com.facebook.aura.conversation.viewmodel;

import X.HtJ;
import X.HzP;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.maps.MC;
import com.facebook.aura.uicontrol.PendingWidgetMessage;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$9$1", f = "HatchConversationViewModel.kt", l = {MC.hatch_android_maps.__CONFIG__}, m = "emit", v = 2)
/* loaded from: classes3.dex */
public final class HatchConversationViewModel$9$1$emit$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchConversationViewModel.AnonymousClass9.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationViewModel$9$1$emit$1(HatchConversationViewModel.AnonymousClass9.AnonymousClass1<? super T> anonymousClass1, HtJ<? super HatchConversationViewModel$9$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((PendingWidgetMessage) null, (HtJ<? super Unit>) this);
    }
}
