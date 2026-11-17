package com.facebook.aura.confidentialvm.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ConfidentialVmDisconnectedItem extends C06G {
    public static final int $stable = 0;
    public final String iconUrl;
    public final boolean isChannel;
    public final String name;

    public ConfidentialVmDisconnectedItem(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
        this.iconUrl = str2;
        this.isChannel = z;
    }

    public final ConfidentialVmDisconnectedItem copy(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new ConfidentialVmDisconnectedItem(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmDisconnectedItem) {
                ConfidentialVmDisconnectedItem confidentialVmDisconnectedItem = (ConfidentialVmDisconnectedItem) obj;
                if (!C7384Etj.areEqual(this.name, confidentialVmDisconnectedItem.name) || !C7384Etj.areEqual(this.iconUrl, confidentialVmDisconnectedItem.iconUrl) || this.isChannel != confidentialVmDisconnectedItem.isChannel) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmDisconnectedItem copy$default(ConfidentialVmDisconnectedItem confidentialVmDisconnectedItem, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmDisconnectedItem.name;
        }
        if ((i & 2) != 0) {
            str2 = confidentialVmDisconnectedItem.iconUrl;
        }
        if ((i & 4) != 0) {
            z = confidentialVmDisconnectedItem.isChannel;
        }
        return confidentialVmDisconnectedItem.copy(str, str2, z);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final boolean component3() {
        return this.isChannel;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass001.A0G(this.name) + AnonymousClass006.A0G(this.iconUrl)) * 31, this.isChannel);
    }

    public final boolean isChannel() {
        return this.isChannel;
    }

    public String toString() {
        return super.toString();
    }
}
