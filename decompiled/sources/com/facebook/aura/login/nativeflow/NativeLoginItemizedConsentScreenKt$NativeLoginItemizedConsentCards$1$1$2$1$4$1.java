package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1$2$1$4$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ G0V<Integer, Boolean, Unit> $onItemToggled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1$2$1$4$1(G0V<? super Integer, ? super Boolean, Unit> g0v, int i) {
        super(1);
        this.$onItemToggled = g0v;
        this.$index = i;
    }

    public final void invoke(boolean z) {
        this.$onItemToggled.invoke(Integer.valueOf(this.$index), Boolean.valueOf(z));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
