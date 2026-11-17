package com.facebook.aura.vds.compose.input;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraTextInputKt$AuraTextInput$2$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ G0U<String, Unit> $onChange;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$onChange.invoke(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraTextInputKt$AuraTextInput$2$1$1(G0U<? super String, Unit> g0u) {
        super(1);
        this.$onChange = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
