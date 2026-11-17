package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes6.dex */
public final class FancyPinRenderFrameRouter implements FancyPinRenderFrameConsumer {
    public final G0U<FancyPinRenderFrame, Boolean> preparePresentation;
    public final FancyPinRenderFrameConsumer render;

    @Override // com.meta.maps.fancypins.FancyPinRenderFrameConsumer
    public void apply(FancyPinRenderFrame fancyPinRenderFrame) {
        C7384Etj.A0Y(fancyPinRenderFrame, 0);
        if (AnonymousClass003.A1X(fancyPinRenderFrame, this.preparePresentation)) {
            this.render.apply(fancyPinRenderFrame);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FancyPinRenderFrameRouter(G0U<? super FancyPinRenderFrame, Boolean> g0u, FancyPinRenderFrameConsumer fancyPinRenderFrameConsumer) {
        AnonymousClass003.A0u(g0u, fancyPinRenderFrameConsumer);
        this.preparePresentation = g0u;
        this.render = fancyPinRenderFrameConsumer;
    }
}
