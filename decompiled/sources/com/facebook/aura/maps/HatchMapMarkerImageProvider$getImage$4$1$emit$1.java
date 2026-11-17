package com.facebook.aura.maps;

import X.HtJ;
import X.HzP;
import com.facebook.aura.maps.HatchMapMarkerImageProvider;
import com.facebook.aura.maps.cache.HatchPlaceImageState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.maps.HatchMapMarkerImageProvider$getImage$4$1", f = "HatchMapMarkerImageProvider.kt", l = {69}, m = "emit", v = 2)
/* loaded from: classes4.dex */
public final class HatchMapMarkerImageProvider$getImage$4$1$emit$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchMapMarkerImageProvider.AnonymousClass4.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMapMarkerImageProvider$getImage$4$1$emit$1(HatchMapMarkerImageProvider.AnonymousClass4.AnonymousClass1<? super T> anonymousClass1, HtJ<? super HatchMapMarkerImageProvider$getImage$4$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((HatchPlaceImageState) null, (HtJ<? super Unit>) this);
    }
}
