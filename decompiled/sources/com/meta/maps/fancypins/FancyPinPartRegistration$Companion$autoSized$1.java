package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0U;
import X.G0V;
import android.util.SizeF;

/* loaded from: classes6.dex */
public final class FancyPinPartRegistration$Companion$autoSized$1 extends AbstractC7559F3s implements G0V<FancyPinPartResolveContext, SizeF, SizeF> {
    public final /* synthetic */ G0V<Configuration, SizeF, SizeF> $measure;
    public final /* synthetic */ G0U<FancyPinPartResolveContext, Configuration> $resolve;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FancyPinPartRegistration$Companion$autoSized$1(G0V<? super Configuration, ? super SizeF, SizeF> g0v, G0U<? super FancyPinPartResolveContext, ? extends Configuration> g0u) {
        super(2);
        this.$measure = g0v;
        this.$resolve = g0u;
    }

    @Override // X.G0V
    public final SizeF invoke(FancyPinPartResolveContext fancyPinPartResolveContext, SizeF sizeF) {
        AnonymousClass003.A0u(fancyPinPartResolveContext, sizeF);
        return this.$measure.invoke(this.$resolve.invoke(fancyPinPartResolveContext), sizeF);
    }
}
