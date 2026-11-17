package com.facebook.aura.sharesheet;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository", f = "HatchShareSheetRepository.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS}, m = "fetchRecipients-gIAlu-s", v = 2)
/* loaded from: classes4.dex */
public final class HatchShareSheetRepository$fetchRecipients$1 extends HzP {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchShareSheetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetRepository$fetchRecipients$1(HatchShareSheetRepository hatchShareSheetRepository, HtJ<? super HatchShareSheetRepository$fetchRecipients$1> htJ) {
        super(htJ);
        this.this$0 = hatchShareSheetRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2006fetchRecipientsgIAlus(false, this));
    }
}
