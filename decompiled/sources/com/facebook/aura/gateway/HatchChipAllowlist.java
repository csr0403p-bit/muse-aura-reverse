package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.common.HatchChipSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class HatchChipAllowlist extends C06G {
    public static final int $stable = 8;
    public final List<String> chipIds;
    public final String version;

    public final List<String> draw(int i, Set<String> set) {
        C7384Etj.A0Y(set, 1);
        HatchChipSelection hatchChipSelection = HatchChipSelection.INSTANCE;
        List<String> list = this.chipIds;
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : list) {
            if (!set.contains(str)) {
                arrayListA0h.add(str);
            }
        }
        return hatchChipSelection.draw(arrayListA0h, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchChipAllowlist) {
                HatchChipAllowlist hatchChipAllowlist = (HatchChipAllowlist) obj;
                if (!C7384Etj.areEqual(this.chipIds, hatchChipAllowlist.chipIds) || !C7384Etj.areEqual(this.version, hatchChipAllowlist.version)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchChipAllowlist copy$default(HatchChipAllowlist hatchChipAllowlist, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchChipAllowlist.chipIds;
        }
        if ((i & 2) != 0) {
            str = hatchChipAllowlist.version;
        }
        AnonymousClass003.A0u(list, str);
        return new HatchChipAllowlist(list, str);
    }

    public final List<String> component1() {
        return this.chipIds;
    }

    public final String component2() {
        return this.version;
    }

    public final List<String> getChipIds() {
        return this.chipIds;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.version, AnonymousClass005.A0E(this.chipIds));
    }

    public HatchChipAllowlist(List<String> list, String str) {
        AnonymousClass003.A0u(list, str);
        this.chipIds = list;
        this.version = str;
    }

    public final HatchChipAllowlist copy(List<String> list, String str) {
        AnonymousClass003.A0u(list, str);
        return new HatchChipAllowlist(list, str);
    }

    public String toString() {
        return super.toString();
    }
}
