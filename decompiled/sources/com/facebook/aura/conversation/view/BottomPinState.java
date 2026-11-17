package com.facebook.aura.conversation.view;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class BottomPinState extends C06G {
    public static final int $stable = 0;
    public final BottomPinAction action;
    public final int overflow;

    public BottomPinState(BottomPinAction bottomPinAction, int i) {
        C7384Etj.A0Y(bottomPinAction, 0);
        this.action = bottomPinAction;
        this.overflow = i;
    }

    public final BottomPinState copy(BottomPinAction bottomPinAction, int i) {
        C7384Etj.A0Y(bottomPinAction, 0);
        return new BottomPinState(bottomPinAction, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BottomPinState) {
                BottomPinState bottomPinState = (BottomPinState) obj;
                if (this.action != bottomPinState.action || this.overflow != bottomPinState.overflow) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BottomPinState copy$default(BottomPinState bottomPinState, BottomPinAction bottomPinAction, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bottomPinAction = bottomPinState.action;
        }
        if ((i2 & 2) != 0) {
            i = bottomPinState.overflow;
        }
        C7384Etj.A0Y(bottomPinAction, 0);
        return new BottomPinState(bottomPinAction, i);
    }

    public final BottomPinAction component1() {
        return this.action;
    }

    public final int component2() {
        return this.overflow;
    }

    public final BottomPinAction getAction() {
        return this.action;
    }

    public final int getOverflow() {
        return this.overflow;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.action) + this.overflow;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BottomPinState(BottomPinAction bottomPinAction, int i, int i2, C06H c06h) {
        this(bottomPinAction, (i2 & 2) != 0 ? 0 : i);
    }
}
