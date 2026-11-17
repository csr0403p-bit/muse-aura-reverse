package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation", f = "NativeLoginCheckpointContinuation.kt", l = {28, R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft}, m = "decryptAccessToken-0E7RQCE", v = 2)
/* loaded from: classes3.dex */
public final class NativeLoginCheckpointContinuation$decryptAccessToken$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NativeLoginCheckpointContinuation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCheckpointContinuation$decryptAccessToken$1(NativeLoginCheckpointContinuation nativeLoginCheckpointContinuation, HtJ<? super NativeLoginCheckpointContinuation$decryptAccessToken$1> htJ) {
        super(htJ);
        this.this$0 = nativeLoginCheckpointContinuation;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1276decryptAccessToken0E7RQCE(null, null, this));
    }
}
