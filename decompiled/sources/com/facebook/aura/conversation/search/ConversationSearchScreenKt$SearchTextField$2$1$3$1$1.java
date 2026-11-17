package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$SearchTextField$2$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onClear;
    public final /* synthetic */ G0U<String, Unit> $onQueryChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationSearchScreenKt$SearchTextField$2$1$3$1$1(Function0<Unit> function0, G0U<? super String, Unit> g0u) {
        super(0);
        this.$onClear = function0;
        this.$onQueryChange = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0 = this.$onClear;
        if (function0 != null) {
            function0.invoke();
        } else {
            this.$onQueryChange.invoke("");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
