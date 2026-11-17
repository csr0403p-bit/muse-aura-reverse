package com.facebook.aura.partners.voice.chrome;

/* loaded from: classes2.dex */
public final class CallControlsPresentationState {
    public final CallControlsPresentation presentation;
    public final boolean visible;

    public final CallControlsPresentation getPresentation() {
        return this.presentation;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public CallControlsPresentationState(CallControlsPresentation callControlsPresentation, boolean z) {
        this.presentation = callControlsPresentation;
        this.visible = z;
    }
}
