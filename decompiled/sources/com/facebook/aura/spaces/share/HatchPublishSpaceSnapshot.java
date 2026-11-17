package com.facebook.aura.spaces.share;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.spaces.share.HatchPublishSpaceState;

/* loaded from: classes4.dex */
public final class HatchPublishSpaceSnapshot extends C06G {
    public static final int $stable = 8;
    public final boolean publicationConfirmed;
    public final HatchPublishSpaceState sheet;

    public HatchPublishSpaceSnapshot(HatchPublishSpaceState hatchPublishSpaceState, boolean z) {
        C7384Etj.A0Y(hatchPublishSpaceState, 0);
        this.sheet = hatchPublishSpaceState;
        this.publicationConfirmed = z;
    }

    public final HatchPublishSpaceSnapshot copy(HatchPublishSpaceState hatchPublishSpaceState, boolean z) {
        C7384Etj.A0Y(hatchPublishSpaceState, 0);
        return new HatchPublishSpaceSnapshot(hatchPublishSpaceState, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPublishSpaceSnapshot) {
                HatchPublishSpaceSnapshot hatchPublishSpaceSnapshot = (HatchPublishSpaceSnapshot) obj;
                if (!C7384Etj.areEqual(this.sheet, hatchPublishSpaceSnapshot.sheet) || this.publicationConfirmed != hatchPublishSpaceSnapshot.publicationConfirmed) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchPublishSpaceSnapshot copy$default(HatchPublishSpaceSnapshot hatchPublishSpaceSnapshot, HatchPublishSpaceState hatchPublishSpaceState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchPublishSpaceState = hatchPublishSpaceSnapshot.sheet;
        }
        if ((i & 2) != 0) {
            z = hatchPublishSpaceSnapshot.publicationConfirmed;
        }
        C7384Etj.A0Y(hatchPublishSpaceState, 0);
        return new HatchPublishSpaceSnapshot(hatchPublishSpaceState, z);
    }

    public final HatchPublishSpaceState component1() {
        return this.sheet;
    }

    public final boolean component2() {
        return this.publicationConfirmed;
    }

    public final boolean getPublicationConfirmed() {
        return this.publicationConfirmed;
    }

    public final HatchPublishSpaceState getSheet() {
        return this.sheet;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.sheet), this.publicationConfirmed);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchPublishSpaceSnapshot(HatchPublishSpaceState hatchPublishSpaceState, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? HatchPublishSpaceState.Loading.INSTANCE : hatchPublishSpaceState, AnonymousClass001.A1Q(i, z));
    }

    public HatchPublishSpaceSnapshot() {
        this(HatchPublishSpaceState.Loading.INSTANCE, false);
    }
}
