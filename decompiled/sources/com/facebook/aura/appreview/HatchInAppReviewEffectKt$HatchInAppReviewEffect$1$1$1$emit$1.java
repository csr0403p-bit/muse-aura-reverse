package com.facebook.aura.appreview;

import X.HtJ;
import X.HzP;
import com.facebook.aura.appreview.HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1;
import com.facebook.aura.appreview.HatchInAppReviewTrigger;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.appreview.HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1$1", f = "HatchInAppReviewEffect.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop, 50}, m = "emit", v = 2)
/* loaded from: classes5.dex */
public final class HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1$1$emit$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1$1$emit$1(HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1.AnonymousClass1<? super T> anonymousClass1, HtJ<? super HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((HatchInAppReviewTrigger.TriggerSource) null, (HtJ<? super Unit>) this);
    }
}
