package com.facebook.aura.sharesheet;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository", f = "HatchShareSheetRepository.kt", l = {118}, m = "checkShareEligibility-0E7RQCE$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet", v = 2)
/* loaded from: classes4.dex */
public final class HatchShareSheetRepository$checkShareEligibility$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchShareSheetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetRepository$checkShareEligibility$1(HatchShareSheetRepository hatchShareSheetRepository, HtJ<? super HatchShareSheetRepository$checkShareEligibility$1> htJ) {
        super(htJ);
        this.this$0 = hatchShareSheetRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2005x85088dca(null, null, this));
    }
}
