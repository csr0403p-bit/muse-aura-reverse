package com.facebook.aura.vds.compose.accessibility;

import X.Ab8;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchHapticElement extends Ab8<HatchHapticNode> {
    public final boolean enabled;
    public final int type;

    @Override // X.Ab8
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchHapticElement) {
                HatchHapticElement hatchHapticElement = (HatchHapticElement) obj;
                if (this.type != hatchHapticElement.type || this.enabled != hatchHapticElement.enabled) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public void update(HatchHapticNode hatchHapticNode) {
        C7384Etj.A0Y(hatchHapticNode, 0);
        hatchHapticNode.m2401updateTypeCdsT49E(this.type);
        hatchHapticNode.enabled = this.enabled;
    }

    /* renamed from: copy-kJP1w3c$default, reason: not valid java name */
    public static /* synthetic */ HatchHapticElement m2395copykJP1w3c$default(HatchHapticElement hatchHapticElement, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hatchHapticElement.type;
        }
        if ((i2 & 2) != 0) {
            z = hatchHapticElement.enabled;
        }
        return new HatchHapticElement(i, z);
    }

    /* renamed from: component1-5zf0vsI, reason: not valid java name */
    public final int m2396component15zf0vsI() {
        return this.type;
    }

    public final boolean component2() {
        return this.enabled;
    }

    /* renamed from: copy-kJP1w3c, reason: not valid java name */
    public final HatchHapticElement m2397copykJP1w3c(int i, boolean z) {
        return new HatchHapticElement(i, z);
    }

    @Override // X.Ab8
    public HatchHapticNode create() {
        return new HatchHapticNode(this.type, this.enabled);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: getType-5zf0vsI, reason: not valid java name */
    public final int m2398getType5zf0vsI() {
        return this.type;
    }

    @Override // X.Ab8
    public int hashCode() {
        return C0KA.A00(this.type * 31, this.enabled);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchHapticElement(int i, boolean z, C06H c06h) {
        this(i, z);
    }

    public HatchHapticElement(int i, boolean z) {
        this.type = i;
        this.enabled = z;
    }
}
