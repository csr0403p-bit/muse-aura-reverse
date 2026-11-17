package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes6.dex */
public final class FancyPinOverlayView$engineController$1 extends AbstractC7559F3s implements G0U<FancyPinFrameConnectionFactory, FancyPinFrameConnection> {
    public static final FancyPinOverlayView$engineController$1 INSTANCE = new FancyPinOverlayView$engineController$1();

    public FancyPinOverlayView$engineController$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ FancyPinFrameConnection invoke(FancyPinFrameConnectionFactory fancyPinFrameConnectionFactory) {
        FancyPinFrameConnectionFactory fancyPinFrameConnectionFactory2 = fancyPinFrameConnectionFactory;
        C7384Etj.A0Y(fancyPinFrameConnectionFactory2, 0);
        return fancyPinFrameConnectionFactory2.create();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final FancyPinFrameConnection invoke2(FancyPinFrameConnectionFactory fancyPinFrameConnectionFactory) {
        C7384Etj.A0Y(fancyPinFrameConnectionFactory, 0);
        return fancyPinFrameConnectionFactory.create();
    }
}
