package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.C06H;

/* loaded from: classes.dex */
public final class AutoFocusRequest {
    public boolean isDone;
    public boolean isPlaced;

    public final boolean isDone() {
        return this.isDone;
    }

    public final boolean isPlaced() {
        return this.isPlaced;
    }

    public AutoFocusRequest(boolean z, boolean z2) {
        this.isPlaced = z;
        this.isDone = z2;
    }

    public final void setDone(boolean z) {
        this.isDone = z;
    }

    public final void setPlaced(boolean z) {
        this.isPlaced = z;
    }

    public /* synthetic */ AutoFocusRequest(boolean z, boolean z2, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2));
    }

    public AutoFocusRequest() {
        this(false, false);
    }
}
