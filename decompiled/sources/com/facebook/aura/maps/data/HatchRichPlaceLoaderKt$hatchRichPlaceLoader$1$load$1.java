package com.facebook.aura.maps.data;

import X.HtJ;
import X.HzP;
import com.facebook.aura.maps.data.HatchRichPlaceLoaderKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.maps.data.HatchRichPlaceLoaderKt$hatchRichPlaceLoader$1", f = "HatchRichPlaceLoader.kt", l = {27}, m = "load", v = 2)
/* loaded from: classes4.dex */
public final class HatchRichPlaceLoaderKt$hatchRichPlaceLoader$1$load$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchRichPlaceLoaderKt.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRichPlaceLoaderKt$hatchRichPlaceLoader$1$load$1(HatchRichPlaceLoaderKt.AnonymousClass1 anonymousClass1, HtJ<? super HatchRichPlaceLoaderKt$hatchRichPlaceLoader$1$load$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(null, null, this);
    }
}
