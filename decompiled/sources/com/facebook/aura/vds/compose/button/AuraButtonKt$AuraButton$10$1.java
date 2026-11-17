package com.facebook.aura.vds.compose.button;

import X.AbstractC7559F3s;
import X.B6A;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraButtonKt$AuraButton$10$1 extends AbstractC7559F3s implements Function0<B6A> {
    public final /* synthetic */ long $defaultBackgroundColor;
    public final /* synthetic */ Function0<B6A> $overrideBackgroundColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraButtonKt$AuraButton$10$1(Function0<B6A> function0, long j) {
        super(0);
        this.$overrideBackgroundColor = function0;
        this.$defaultBackgroundColor = j;
    }

    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
    public final long m2411invoke0d7_KjU() {
        B6A b6aInvoke = this.$overrideBackgroundColor.invoke();
        return b6aInvoke != null ? b6aInvoke.A00 : this.$defaultBackgroundColor;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ B6A invoke() {
        return new B6A(m2411invoke0d7_KjU());
    }
}
