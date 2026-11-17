package com.meta.maps.fancypins;

import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.CU7;

/* loaded from: classes6.dex */
public final class FancyPinOverlayEngineBinding {
    public FancyPinFrameConnection connection;

    public final synchronized void bind(FancyPinFrameConnection fancyPinFrameConnection) {
        C7384Etj.A0Y(fancyPinFrameConnection, 0);
        if (this.connection != null) {
            throw C3cG.A0Q("FancyPin overlay is already bound to an engine");
        }
        try {
            fancyPinFrameConnection.attach();
            this.connection = fancyPinFrameConnection;
        } catch (Throwable th) {
            try {
                fancyPinFrameConnection.close();
            } catch (Throwable th2) {
                this.connection = fancyPinFrameConnection;
                CU7.A01(th, th2);
            }
        }
    }

    public final synchronized boolean isBound() {
        return AnonymousClass002.A1X(this.connection);
    }

    public final synchronized void unbind() {
        FancyPinFrameConnection fancyPinFrameConnection = this.connection;
        if (fancyPinFrameConnection != null) {
            fancyPinFrameConnection.close();
            this.connection = null;
        }
    }
}
