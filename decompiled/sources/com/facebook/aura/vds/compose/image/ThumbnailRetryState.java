package com.facebook.aura.vds.compose.image;

/* loaded from: classes4.dex */
public final class ThumbnailRetryState {
    public int attempt;
    public boolean fellBack;

    public final int getAttempt() {
        return this.attempt;
    }

    public final boolean getFellBack() {
        return this.fellBack;
    }

    public final void setAttempt(int i) {
        this.attempt = i;
    }

    public final void setFellBack(boolean z) {
        this.fellBack = z;
    }
}
