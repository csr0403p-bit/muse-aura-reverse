package com.facebook.aura.globaleffects;

import X.HtJ;
import X.HzP;
import com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1;
import com.facebook.aura.navigation.effect.api.NavigationEffectApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1", f = "NavigationEffect.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "emit", v = 2)
/* loaded from: classes2.dex */
public final class NavigationEffectKt$NavigationEffect$1$1$1$emit$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NavigationEffectKt$NavigationEffect$1$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationEffectKt$NavigationEffect$1$1$1$emit$1(NavigationEffectKt$NavigationEffect$1$1.AnonymousClass1<? super T> anonymousClass1, HtJ<? super NavigationEffectKt$NavigationEffect$1$1$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((NavigationEffectApi.NavigationRequest) null, (HtJ<? super Unit>) this);
    }
}
