package com.facebook.aura.markdown.render;

import X.HtJ;
import X.HzP;
import com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.markdown.render.AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3", f = "AuraMarkdownText.kt", l = {123}, m = "emit", v = 2)
/* loaded from: classes4.dex */
public final class AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3$emit$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1.AnonymousClass3<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3$emit$1(AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1.AnonymousClass3<? super T> anonymousClass3, HtJ<? super AuraMarkdownTextKt$rememberBackgroundParsedDocument$1$1$3$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass3;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((String) null, (HtJ<? super Unit>) this);
    }
}
