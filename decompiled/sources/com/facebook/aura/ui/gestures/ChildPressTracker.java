package com.facebook.aura.ui.gestures;

import X.C2Uh;

/* loaded from: classes.dex */
public final class ChildPressTracker {
    public static final int $stable = 8;
    public C2Uh claimedPointer;
    public String pressedMediaKey;

    /* renamed from: getClaimedPointer-PO0ARDM, reason: not valid java name */
    public final C2Uh m2367getClaimedPointerPO0ARDM() {
        return this.claimedPointer;
    }

    public final String getPressedMediaKey() {
        return this.pressedMediaKey;
    }

    /* renamed from: setClaimedPointer-UIDIruk, reason: not valid java name */
    public final void m2368setClaimedPointerUIDIruk(C2Uh c2Uh) {
        this.claimedPointer = c2Uh;
    }

    public final void setPressedMediaKey(String str) {
        this.pressedMediaKey = str;
    }
}
