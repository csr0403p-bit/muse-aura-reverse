package com.facebook.aura.conversation.viewmodel;

import X.HtJ;
import X.HzP;
import com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$finishedReplies$1$1", f = "HatchFinishedReplies.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT, HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX}, m = "emit", v = 2)
/* loaded from: classes.dex */
public final class HatchFinishedRepliesKt$finishedReplies$1$1$emit$1 extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchFinishedRepliesKt.C115661.C01311<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchFinishedRepliesKt$finishedReplies$1$1$emit$1(HatchFinishedRepliesKt.C115661.C01311<? super T> c01311, HtJ<? super HatchFinishedRepliesKt$finishedReplies$1$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = c01311;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ConversationTurn) null, (HtJ<? super Unit>) this);
    }
}
