package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationAttachments", f = "HatchConversationAttachments.kt", l = {528}, m = "loggedUpload-hUnOzRk", v = 2)
/* loaded from: classes5.dex */
public final class HatchConversationAttachments$loggedUpload$1 extends HzP {
    public int I$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchConversationAttachments this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationAttachments$loggedUpload$1(HatchConversationAttachments hatchConversationAttachments, HtJ<? super HatchConversationAttachments$loggedUpload$1> htJ) {
        super(htJ);
        this.this$0 = hatchConversationAttachments;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m710loggedUploadhUnOzRk(null, null, null, null, 0, this));
    }
}
