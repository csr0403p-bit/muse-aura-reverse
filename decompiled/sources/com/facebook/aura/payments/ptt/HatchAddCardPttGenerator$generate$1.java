package com.facebook.aura.payments.ptt;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.payments.ptt.HatchAddCardPttGenerator", f = "HatchAddCardPttGenerator.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "generate-5p_uFSQ", v = 2)
/* loaded from: classes4.dex */
public final class HatchAddCardPttGenerator$generate$1 extends HzP {
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
    public final /* synthetic */ HatchAddCardPttGenerator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAddCardPttGenerator$generate$1(HatchAddCardPttGenerator hatchAddCardPttGenerator, HtJ<? super HatchAddCardPttGenerator$generate$1> htJ) {
        super(htJ);
        this.this$0 = hatchAddCardPttGenerator;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1846generate5p_uFSQ(null, null, null, null, null, null, null, null, null, null, this));
    }
}
