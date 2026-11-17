package com.facebook.aura.partners.voice.intf;

import X.C06H;
import X.C3cG;

/* loaded from: classes2.dex */
public final class EmbodimentHideRestoreState {
    public long callGeneration;
    public final boolean displayEnabled;
    public final long generation;
    public boolean requestingHide;

    public final long getCallGeneration() {
        return this.callGeneration;
    }

    public final boolean getDisplayEnabled() {
        return this.displayEnabled;
    }

    public final long getGeneration() {
        return this.generation;
    }

    public final boolean getRequestingHide() {
        return this.requestingHide;
    }

    public final void setCallGeneration(long j) {
        this.callGeneration = j;
    }

    public final void setRequestingHide(boolean z) {
        this.requestingHide = z;
    }

    public EmbodimentHideRestoreState(long j, long j2, boolean z, boolean z2) {
        this.generation = j;
        this.callGeneration = j2;
        this.displayEnabled = z;
        this.requestingHide = z2;
    }

    public /* synthetic */ EmbodimentHideRestoreState(long j, long j2, boolean z, boolean z2, int i, C06H c06h) {
        this(j, j2, z, C3cG.A1K(i & 8, z2));
    }
}
