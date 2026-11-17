package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import android.view.Surface;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class EmbodimentSurfaceBinding {
    public static final int $stable = 0;
    public final boolean displayEnabled;
    public final boolean liveRtcReady;
    public final G0W<Surface, Integer, Integer, Unit> onSurfaceAvailable;
    public final G0U<Surface, Unit> onSurfaceDestroyed;
    public final G0W<Surface, Integer, Integer, Unit> onSurfaceResized;
    public final boolean playbackEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public EmbodimentSurfaceBinding(boolean z, boolean z2, boolean z3, G0W<? super Surface, ? super Integer, ? super Integer, Unit> g0w, G0W<? super Surface, ? super Integer, ? super Integer, Unit> g0w2, G0U<? super Surface, Unit> g0u) {
        C7384Etj.A0Y(g0w, 3);
        AnonymousClass003.A0y(g0w2, g0u);
        this.liveRtcReady = z;
        this.displayEnabled = z2;
        this.playbackEnabled = z3;
        this.onSurfaceAvailable = g0w;
        this.onSurfaceResized = g0w2;
        this.onSurfaceDestroyed = g0u;
    }

    public final boolean getDisplayEnabled() {
        return this.displayEnabled;
    }

    public final boolean getLiveRtcReady() {
        return this.liveRtcReady;
    }

    public final G0W<Surface, Integer, Integer, Unit> getOnSurfaceAvailable() {
        return this.onSurfaceAvailable;
    }

    public final G0U<Surface, Unit> getOnSurfaceDestroyed() {
        return this.onSurfaceDestroyed;
    }

    public final G0W<Surface, Integer, Integer, Unit> getOnSurfaceResized() {
        return this.onSurfaceResized;
    }

    public final boolean getPlaybackEnabled() {
        return this.playbackEnabled;
    }
}
