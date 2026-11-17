package com.facebook.aura.spacesharing.impl;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class SharedSpaceSaveState extends C06G {
    public static final int $stable = 0;
    public final int actionLabel;
    public final boolean enabled;
    public final Integer error;
    public final boolean loading;
    public final String placement;
    public final SharedSpaceSaveStatus status;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SharedSpaceSaveState(com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus r4, java.lang.Integer r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            X.C7384Etj.A0Y(r4, r0)
            r3.<init>()
            r3.status = r4
            r3.error = r5
            r3.placement = r6
            com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus r0 = com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus.LOADING
            r2 = 0
            if (r4 == r0) goto L17
            com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus r1 = com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus.SAVING
            r0 = 0
            if (r4 != r1) goto L18
        L17:
            r0 = 1
        L18:
            r3.loading = r0
            com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus r0 = com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus.READY
            if (r4 == r0) goto L22
            com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus r0 = com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus.ERROR
            if (r4 != r0) goto L23
        L22:
            r2 = 1
        L23:
            r3.enabled = r2
            com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus r1 = com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus.ERROR
            r0 = 2131890168(0x7f120ff8, float:1.941502E38)
            if (r4 != r1) goto L2f
            r0 = 2131890166(0x7f120ff6, float:1.9415016E38)
        L2f:
            r3.actionLabel = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spacesharing.impl.SharedSpaceSaveState.<init>(com.facebook.aura.spacesharing.impl.SharedSpaceSaveStatus, java.lang.Integer, java.lang.String):void");
    }

    public final SharedSpaceSaveState copy(SharedSpaceSaveStatus sharedSpaceSaveStatus, Integer num, String str) {
        C7384Etj.A0Y(sharedSpaceSaveStatus, 0);
        return new SharedSpaceSaveState(sharedSpaceSaveStatus, num, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SharedSpaceSaveState) {
                SharedSpaceSaveState sharedSpaceSaveState = (SharedSpaceSaveState) obj;
                if (this.status != sharedSpaceSaveState.status || !C7384Etj.areEqual(this.error, sharedSpaceSaveState.error) || !C7384Etj.areEqual(this.placement, sharedSpaceSaveState.placement)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SharedSpaceSaveState copy$default(SharedSpaceSaveState sharedSpaceSaveState, SharedSpaceSaveStatus sharedSpaceSaveStatus, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            sharedSpaceSaveStatus = sharedSpaceSaveState.status;
        }
        if ((i & 2) != 0) {
            num = sharedSpaceSaveState.error;
        }
        if ((i & 4) != 0) {
            str = sharedSpaceSaveState.placement;
        }
        return sharedSpaceSaveState.copy(sharedSpaceSaveStatus, num, str);
    }

    public final SharedSpaceSaveStatus component1() {
        return this.status;
    }

    public final Integer component2() {
        return this.error;
    }

    public final String component3() {
        return this.placement;
    }

    public final int getActionLabel() {
        return this.actionLabel;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Integer getError() {
        return this.error;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final SharedSpaceSaveStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0E(this.status) + AnonymousClass006.A0D(this.error)) * 31) + AnonymousClass005.A0H(this.placement);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SharedSpaceSaveState(SharedSpaceSaveStatus sharedSpaceSaveStatus, Integer num, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? SharedSpaceSaveStatus.LOADING : sharedSpaceSaveStatus, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }

    public SharedSpaceSaveState() {
        this(SharedSpaceSaveStatus.LOADING, null, null);
    }
}
