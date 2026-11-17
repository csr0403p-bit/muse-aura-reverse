package com.facebook.aura.settings.support;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.support.HatchContactSupportApi", f = "HatchContactSupportApi.kt", l = {87, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "submitWithAttachments-BWLJW6A", v = 2)
/* loaded from: classes4.dex */
public final class HatchContactSupportApi$submitWithAttachments$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchContactSupportApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchContactSupportApi$submitWithAttachments$1(HatchContactSupportApi hatchContactSupportApi, HtJ<? super HatchContactSupportApi$submitWithAttachments$1> htJ) {
        super(htJ);
        this.this$0 = hatchContactSupportApi;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1985submitWithAttachmentsBWLJW6A(null, null, null, this));
    }
}
