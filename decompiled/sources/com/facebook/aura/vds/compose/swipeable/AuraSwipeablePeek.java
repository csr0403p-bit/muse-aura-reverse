package com.facebook.aura.vds.compose.swipeable;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSwipeablePeek extends C06G {
    public static final int $stable = 0;
    public final long delayStartTime;
    public final Function0<Unit> onPeekHintShown;
    public final Function0<Boolean> peekEnabled;
    public final AuraSwipeableMenuStateDragAnchors peekEndDestination;
    public final long peekPauseTime;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraSwipeablePeek) {
                AuraSwipeablePeek auraSwipeablePeek = (AuraSwipeablePeek) obj;
                if (!C7384Etj.areEqual(this.peekEnabled, auraSwipeablePeek.peekEnabled) || this.delayStartTime != auraSwipeablePeek.delayStartTime || this.peekEndDestination != auraSwipeablePeek.peekEndDestination || this.peekPauseTime != auraSwipeablePeek.peekPauseTime || !C7384Etj.areEqual(this.onPeekHintShown, auraSwipeablePeek.onPeekHintShown)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuraSwipeablePeek copy$default(AuraSwipeablePeek auraSwipeablePeek, Function0 function0, long j, AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors, long j2, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = auraSwipeablePeek.peekEnabled;
        }
        if ((i & 2) != 0) {
            j = auraSwipeablePeek.delayStartTime;
        }
        if ((i & 4) != 0) {
            auraSwipeableMenuStateDragAnchors = auraSwipeablePeek.peekEndDestination;
        }
        if ((i & 8) != 0) {
            j2 = auraSwipeablePeek.peekPauseTime;
        }
        if ((i & 16) != 0) {
            function02 = auraSwipeablePeek.onPeekHintShown;
        }
        return auraSwipeablePeek.copy(function0, j, auraSwipeableMenuStateDragAnchors, j2, function02);
    }

    public final Function0<Boolean> component1() {
        return this.peekEnabled;
    }

    public final long component2() {
        return this.delayStartTime;
    }

    public final AuraSwipeableMenuStateDragAnchors component3() {
        return this.peekEndDestination;
    }

    public final long component4() {
        return this.peekPauseTime;
    }

    public final Function0<Unit> component5() {
        return this.onPeekHintShown;
    }

    public final long getDelayStartTime() {
        return this.delayStartTime;
    }

    public final Function0<Unit> getOnPeekHintShown() {
        return this.onPeekHintShown;
    }

    public final Function0<Boolean> getPeekEnabled() {
        return this.peekEnabled;
    }

    public final AuraSwipeableMenuStateDragAnchors getPeekEndDestination() {
        return this.peekEndDestination;
    }

    public final long getPeekPauseTime() {
        return this.peekPauseTime;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.onPeekHintShown, AnonymousClass006.A06(this.peekPauseTime, AnonymousClass005.A0F(this.peekEndDestination, AnonymousClass006.A06(this.delayStartTime, AnonymousClass005.A0E(this.peekEnabled)))));
    }

    public AuraSwipeablePeek(Function0<Boolean> function0, long j, AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors, long j2, Function0<Unit> function02) {
        AnonymousClass003.A0v(function0, auraSwipeableMenuStateDragAnchors);
        C7384Etj.A0Y(function02, 4);
        this.peekEnabled = function0;
        this.delayStartTime = j;
        this.peekEndDestination = auraSwipeableMenuStateDragAnchors;
        this.peekPauseTime = j2;
        this.onPeekHintShown = function02;
    }

    public final AuraSwipeablePeek copy(Function0<Boolean> function0, long j, AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors, long j2, Function0<Unit> function02) {
        AnonymousClass003.A0v(function0, auraSwipeableMenuStateDragAnchors);
        C7384Etj.A0Y(function02, 4);
        return new AuraSwipeablePeek(function0, j, auraSwipeableMenuStateDragAnchors, j2, function02);
    }

    public String toString() {
        return super.toString();
    }
}
