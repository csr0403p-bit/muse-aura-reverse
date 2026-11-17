package com.facebook.aura.partners.voice.screen;

import X.HtJ;
import X.HzP;
import com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$resizeGestures$3", f = "VoiceEmbodimentDragHandle.kt", l = {288}, m = "invoke", v = 2)
/* loaded from: classes2.dex */
public final class VoiceEmbodimentDragHandleKt$resizeGestures$3$invoke$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VoiceEmbodimentDragHandleKt.AnonymousClass3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentDragHandleKt$resizeGestures$3$invoke$1(VoiceEmbodimentDragHandleKt.AnonymousClass3 anonymousClass3, HtJ<? super VoiceEmbodimentDragHandleKt$resizeGestures$3$invoke$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass3;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
