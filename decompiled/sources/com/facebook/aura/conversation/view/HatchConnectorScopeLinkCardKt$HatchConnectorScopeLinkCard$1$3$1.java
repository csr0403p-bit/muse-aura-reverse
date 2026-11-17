package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorScopeLinkCardKt$HatchConnectorScopeLinkCard$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $requestAdditionalAccess;
    public final /* synthetic */ String $scopeKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorScopeLinkCardKt$HatchConnectorScopeLinkCard$1$3$1(G0U<? super String, Unit> g0u, String str) {
        super(0);
        this.$requestAdditionalAccess = g0u;
        this.$scopeKey = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$requestAdditionalAccess.invoke(this.$scopeKey);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
