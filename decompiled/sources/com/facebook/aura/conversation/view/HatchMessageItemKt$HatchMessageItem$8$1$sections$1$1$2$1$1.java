package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $id;
    public final /* synthetic */ G0U<String, Unit> $onScrollToMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$2$1$1(G0U<? super String, Unit> g0u, String str) {
        super(0);
        this.$onScrollToMessage = g0u;
        this.$id = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0U<String, Unit> g0u = this.$onScrollToMessage;
        if (g0u != null) {
            g0u.invoke(this.$id);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
