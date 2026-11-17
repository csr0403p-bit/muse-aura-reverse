package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.settings.HatchAiTrainingApi", f = "HatchAiTrainingApi.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "refresh-IoAF18A", v = 2)
/* loaded from: classes.dex */
public final class HatchAiTrainingApi$refresh$1 extends HzP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchAiTrainingApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAiTrainingApi$refresh$1(HatchAiTrainingApi hatchAiTrainingApi, HtJ<? super HatchAiTrainingApi$refresh$1> htJ) {
        super(htJ);
        this.this$0 = hatchAiTrainingApi;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1934refreshIoAF18A(this));
    }
}
