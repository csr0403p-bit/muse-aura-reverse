package com.meta.maps.fancypins;

import X.C3cG;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes6.dex */
public final class FancyPinOverlayEngineController<Engine> {
    public boolean attached;
    public final FancyPinOverlayEngineBinding binding;
    public boolean connectionActive;
    public final G0U<Engine, FancyPinFrameConnection> connectionFactory;
    public Engine engine;

    /* JADX WARN: Multi-variable type inference failed */
    public FancyPinOverlayEngineController(G0U<? super Engine, ? extends FancyPinFrameConnection> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.connectionFactory = g0u;
        this.binding = new FancyPinOverlayEngineBinding();
    }

    public final synchronized void bind(Engine engine) {
        C7384Etj.A0Y(engine, 0);
        if (this.engine != null) {
            throw C3cG.A0Q("FancyPin overlay is already bound to an engine");
        }
        this.engine = engine;
        if (this.attached) {
            try {
                connectIfNeeded();
            } catch (Throwable th) {
                if (this.binding.isBound()) {
                    throw th;
                }
                this.engine = null;
                throw th;
            }
        }
    }

    public final synchronized void onAttached() {
        this.attached = true;
        connectIfNeeded();
    }

    public final synchronized void onDetached() {
        this.attached = false;
        this.connectionActive = false;
        this.binding.unbind();
    }

    public final synchronized void unbind() {
        this.connectionActive = false;
        this.engine = null;
        this.binding.unbind();
    }

    private final void connectIfNeeded() {
        Engine engine = this.engine;
        if (engine == null || this.connectionActive) {
            return;
        }
        this.binding.unbind();
        this.binding.bind(this.connectionFactory.invoke(engine));
        this.connectionActive = true;
    }
}
