package com.facebook.aura.conversation.view;

import X.C2Uh;
import com.facebook.aura.ui.gestures.ChildPressTracker;

/* loaded from: classes.dex */
public final class BubbleChildTapTracker {
    public static final int $stable = 8;
    public final ChildPressTracker childPressTracker = new ChildPressTracker();
    public C2Uh claimedPointer;

    public final ChildPressTracker getChildPressTracker() {
        return this.childPressTracker;
    }

    /* renamed from: getClaimedPointer-PO0ARDM, reason: not valid java name */
    public final C2Uh m510getClaimedPointerPO0ARDM() {
        return this.claimedPointer;
    }

    /* renamed from: setClaimedPointer-UIDIruk, reason: not valid java name */
    public final void m511setClaimedPointerUIDIruk(C2Uh c2Uh) {
        this.claimedPointer = c2Uh;
    }
}
