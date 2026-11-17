package com.facebook.aura.sharesheet;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository", f = "HatchShareSheetRepository.kt", l = {246}, m = "prepareStoryAudio$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet", v = 2)
/* loaded from: classes4.dex */
public final class HatchShareSheetRepository$prepareStoryAudio$1 extends HzP {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchShareSheetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetRepository$prepareStoryAudio$1(HatchShareSheetRepository hatchShareSheetRepository, HtJ<? super HatchShareSheetRepository$prepareStoryAudio$1> htJ) {
        super(htJ);
        this.this$0 = hatchShareSheetRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.prepareStoryAudio$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(null, null, null, this);
    }
}
