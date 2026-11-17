package com.facebook.aura.pairs;

import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import java.util.List;

/* loaded from: classes3.dex */
public final class PairsAccess {
    public static final int $stable = 0;
    public final boolean canAcceptInvites;
    public final boolean canChangeLevel;
    public final boolean canConfirmSafetyCode;
    public final boolean canCreateInvites;
    public final boolean hasInviteInbox;
    public final boolean isAvailable;
    public final boolean isManagementOnly;
    public final List<PairsLevel> offeredLevels;
    public final List<PairsLevel> trustPresets;

    public final boolean getCanAcceptInvites() {
        return this.canAcceptInvites;
    }

    public final boolean getCanChangeConnections() {
        return this.isAvailable && !this.isManagementOnly;
    }

    public final boolean getCanChangeLevel() {
        return this.canChangeLevel;
    }

    public final boolean getCanConfirmSafetyCode() {
        return this.canConfirmSafetyCode;
    }

    public final boolean getCanCreateInvites() {
        return this.canCreateInvites;
    }

    public final boolean getHasInviteInbox() {
        return this.hasInviteInbox;
    }

    public final List<PairsLevel> getOfferedLevels() {
        return this.offeredLevels;
    }

    public final List<PairsLevel> getTrustPresets() {
        return this.trustPresets;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean isManagementOnly() {
        return this.isManagementOnly;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PairsAccess(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List<? extends PairsLevel> list, List<? extends PairsLevel> list2, boolean z7) {
        AnonymousClass003.A10(list, list2);
        this.isAvailable = z;
        this.isManagementOnly = z2;
        this.canCreateInvites = z3;
        this.canAcceptInvites = z4;
        this.canConfirmSafetyCode = z5;
        this.canChangeLevel = z6;
        this.offeredLevels = list;
        this.trustPresets = list2;
        this.hasInviteInbox = z7;
    }

    public /* synthetic */ PairsAccess(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list, List list2, boolean z7, int i, C06H c06h) {
        this(z, z2, z3, z4, z5, z6, list, list2, C3cG.A1K(i & 256, z7));
    }
}
