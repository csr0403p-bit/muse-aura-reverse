package com.facebook.aura.bugreport;

import X.AnonymousClass001;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class BusyItem extends C06G {
    public static final int $stable = 0;
    public final boolean blocksSubmit;
    public final String name;

    public BusyItem(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
        this.blocksSubmit = z;
    }

    public final BusyItem copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new BusyItem(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BusyItem) {
                BusyItem busyItem = (BusyItem) obj;
                if (!C7384Etj.areEqual(this.name, busyItem.name) || this.blocksSubmit != busyItem.blocksSubmit) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BusyItem copy$default(BusyItem busyItem, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = busyItem.name;
        }
        if ((i & 2) != 0) {
            z = busyItem.blocksSubmit;
        }
        C7384Etj.A0Y(str, 0);
        return new BusyItem(str, z);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.blocksSubmit;
    }

    public final boolean getBlocksSubmit() {
        return this.blocksSubmit;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.name), this.blocksSubmit);
    }

    public String toString() {
        return super.toString();
    }
}
