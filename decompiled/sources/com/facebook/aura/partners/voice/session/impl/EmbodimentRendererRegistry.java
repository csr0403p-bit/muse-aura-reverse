package com.facebook.aura.partners.voice.session.impl;

import X.C7384Etj;
import android.view.Surface;
import java.util.IdentityHashMap;

/* loaded from: classes2.dex */
public final class EmbodimentRendererRegistry {
    public EmbodimentVideoRenderer active;
    public final IdentityHashMap<Surface, EmbodimentVideoRenderer> retiring = new IdentityHashMap<>();

    public final EmbodimentVideoRenderer activeFor(Surface surface) {
        C7384Etj.A0Y(surface, 0);
        EmbodimentVideoRenderer embodimentVideoRenderer = this.active;
        if (embodimentVideoRenderer == null || embodimentVideoRenderer.boundSurface != surface) {
            return null;
        }
        return embodimentVideoRenderer;
    }

    public final void completeRetirement(EmbodimentVideoRenderer embodimentVideoRenderer) {
        C7384Etj.A0Y(embodimentVideoRenderer, 0);
        if (this.retiring.get(embodimentVideoRenderer.boundSurface) == embodimentVideoRenderer) {
            this.retiring.remove(embodimentVideoRenderer.boundSurface);
        }
    }

    public final void retire(EmbodimentVideoRenderer embodimentVideoRenderer) {
        C7384Etj.A0Y(embodimentVideoRenderer, 0);
        if (this.active == embodimentVideoRenderer) {
            this.active = null;
        }
        this.retiring.put(embodimentVideoRenderer.boundSurface, embodimentVideoRenderer);
    }

    public final EmbodimentVideoRenderer retiringFor(Surface surface) {
        C7384Etj.A0Y(surface, 0);
        return this.retiring.get(surface);
    }

    public final EmbodimentVideoRenderer getActive() {
        return this.active;
    }

    public final EmbodimentVideoRenderer retireActive() {
        EmbodimentVideoRenderer embodimentVideoRenderer = this.active;
        if (embodimentVideoRenderer == null) {
            return null;
        }
        retire(embodimentVideoRenderer);
        return embodimentVideoRenderer;
    }

    public final void setActive(EmbodimentVideoRenderer embodimentVideoRenderer) {
        this.active = embodimentVideoRenderer;
    }
}
