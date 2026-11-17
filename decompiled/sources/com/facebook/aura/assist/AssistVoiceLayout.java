package com.facebook.aura.assist;

import X.AaC;
import X.AnonymousClass005;

/* loaded from: classes.dex */
public final class AssistVoiceLayout {
    public static final int $stable = 0;
    public final float controlsTop;
    public final AaC identity;
    public final AaC leading;
    public final boolean stacked;
    public final AaC trailing;

    public final float getControlsTop() {
        return this.controlsTop;
    }

    public final AaC getIdentity() {
        return this.identity;
    }

    public final AaC getLeading() {
        return this.leading;
    }

    public final boolean getStacked() {
        return this.stacked;
    }

    public final AaC getTrailing() {
        return this.trailing;
    }

    public AssistVoiceLayout(AaC aaC, AaC aaC2, AaC aaC3, boolean z, float f) {
        AnonymousClass005.A0x(aaC, aaC2, aaC3);
        this.identity = aaC;
        this.leading = aaC2;
        this.trailing = aaC3;
        this.stacked = z;
        this.controlsTop = f;
    }
}
