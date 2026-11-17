package com.facebook.aura.conversation.viewmodel;

import X.HtJ;
import X.HzP;
import com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$4", f = "HatchFinishedReplies.kt", l = {133, 135, 137}, m = "emit", v = 2)
/* loaded from: classes.dex */
public final class HatchFinishedRepliesKt$shownOneAtATime$1$4$emit$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchFinishedRepliesKt.C115671.AnonymousClass4<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchFinishedRepliesKt$shownOneAtATime$1$4$emit$1(HatchFinishedRepliesKt.C115671.AnonymousClass4<? super T> anonymousClass4, HtJ<? super HatchFinishedRepliesKt$shownOneAtATime$1$4$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass4;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((HatchConversationAnnouncement) null, (HtJ<? super Unit>) this);
    }
}
