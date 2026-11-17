package com.facebook.aura.composer.view;

import X.HtJ;
import X.HzP;
import com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$1$1$2", f = "HatchComposer.kt", l = {1509}, m = "emit", v = 2)
/* loaded from: classes4.dex */
public final class HatchComposerKt$ComposerMicButton$1$1$2$emit$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchComposerKt$ComposerMicButton$1$1.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchComposerKt$ComposerMicButton$1$1$2$emit$1(HatchComposerKt$ComposerMicButton$1$1.AnonymousClass2<? super T> anonymousClass2, HtJ<? super HatchComposerKt$ComposerMicButton$1$1$2$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Unit) null, (HtJ<? super Unit>) this);
    }
}
