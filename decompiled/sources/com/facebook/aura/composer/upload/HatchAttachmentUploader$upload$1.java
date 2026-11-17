package com.facebook.aura.composer.upload;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.upload.HatchAttachmentUploader", f = "HatchAttachmentUploader.kt", l = {58}, m = "upload-yxL6bBk", v = 2)
/* loaded from: classes3.dex */
public final class HatchAttachmentUploader$upload$1 extends HzP {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchAttachmentUploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAttachmentUploader$upload$1(HatchAttachmentUploader hatchAttachmentUploader, HtJ<? super HatchAttachmentUploader$upload$1> htJ) {
        super(htJ);
        this.this$0 = hatchAttachmentUploader;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m427uploadyxL6bBk(null, null, null, null, this));
    }
}
