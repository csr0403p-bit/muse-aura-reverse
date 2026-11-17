package com.facebook.aura.sharesheet;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository", f = "HatchShareSheetRepository.kt", l = {649}, m = "uploadMedia-0E7RQCE", v = 2)
/* loaded from: classes4.dex */
public final class HatchShareSheetRepository$uploadMedia$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchShareSheetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetRepository$uploadMedia$1(HatchShareSheetRepository hatchShareSheetRepository, HtJ<? super HatchShareSheetRepository$uploadMedia$1> htJ) {
        super(htJ);
        this.this$0 = hatchShareSheetRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2004uploadMedia0E7RQCE(null, null, this));
    }
}
