package com.facebook.aura.assist;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class AssistOverlayState extends C06G {
    public static final int $stable = 0;
    public final String errorMessage;
    public final AssistOverlayMode mode;
    public final AssistOverlayPhase phase;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AssistOverlayState) {
                AssistOverlayState assistOverlayState = (AssistOverlayState) obj;
                if (this.mode != assistOverlayState.mode || this.phase != assistOverlayState.phase || !C7384Etj.areEqual(this.errorMessage, assistOverlayState.errorMessage)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AssistOverlayState copy$default(AssistOverlayState assistOverlayState, AssistOverlayMode assistOverlayMode, AssistOverlayPhase assistOverlayPhase, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            assistOverlayMode = assistOverlayState.mode;
        }
        if ((i & 2) != 0) {
            assistOverlayPhase = assistOverlayState.phase;
        }
        if ((i & 4) != 0) {
            str = assistOverlayState.errorMessage;
        }
        return assistOverlayState.copy(assistOverlayMode, assistOverlayPhase, str);
    }

    public final AssistOverlayMode component1() {
        return this.mode;
    }

    public final AssistOverlayPhase component2() {
        return this.phase;
    }

    public final String component3() {
        return this.errorMessage;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final AssistOverlayMode getMode() {
        return this.mode;
    }

    public final AssistOverlayPhase getPhase() {
        return this.phase;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.phase, AnonymousClass005.A0E(this.mode)) + AnonymousClass006.A0G(this.errorMessage);
    }

    public AssistOverlayState(AssistOverlayMode assistOverlayMode, AssistOverlayPhase assistOverlayPhase, String str) {
        AnonymousClass003.A0u(assistOverlayMode, assistOverlayPhase);
        this.mode = assistOverlayMode;
        this.phase = assistOverlayPhase;
        this.errorMessage = str;
    }

    public final AssistOverlayState copy(AssistOverlayMode assistOverlayMode, AssistOverlayPhase assistOverlayPhase, String str) {
        AnonymousClass003.A0u(assistOverlayMode, assistOverlayPhase);
        return new AssistOverlayState(assistOverlayMode, assistOverlayPhase, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AssistOverlayState(AssistOverlayMode assistOverlayMode, AssistOverlayPhase assistOverlayPhase, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? AssistOverlayMode.VOICE : assistOverlayMode, (i & 2) != 0 ? AssistOverlayPhase.IDLE : assistOverlayPhase, AnonymousClass006.A0t(i, str));
    }

    public AssistOverlayState() {
        this(AssistOverlayMode.VOICE, AssistOverlayPhase.IDLE, null);
    }
}
