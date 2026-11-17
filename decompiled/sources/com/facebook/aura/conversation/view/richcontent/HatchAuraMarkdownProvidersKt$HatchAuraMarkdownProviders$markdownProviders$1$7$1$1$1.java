package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$7$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $displayName;
    public final /* synthetic */ G0V<String, String, Unit> $it;
    public final /* synthetic */ String $resolvedUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$7$1$1$1(G0V<? super String, ? super String, Unit> g0v, String str, String str2) {
        super(0);
        this.$it = g0v;
        this.$resolvedUrl = str;
        this.$displayName = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$it.invoke(this.$resolvedUrl, this.$displayName);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
