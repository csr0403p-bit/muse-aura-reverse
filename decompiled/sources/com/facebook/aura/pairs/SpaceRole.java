package com.facebook.aura.pairs;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.R;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SpaceRole {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SpaceRole[] $VALUES;
    public static final Companion Companion;
    public static final SpaceRole EDIT;
    public static final SpaceRole USE;
    public static final SpaceRole VIEW;
    public final int icon;
    public final int label;
    public final String wire;

    public final class Companion {
        public final SpaceRole fromWire(String str) {
            SpaceRole next;
            Iterator<SpaceRole> it = SpaceRole.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWire(), str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<SpaceRole> getEntries() {
        return $ENTRIES;
    }

    public static SpaceRole valueOf(String str) {
        return (SpaceRole) Enum.valueOf(SpaceRole.class, str);
    }

    public static SpaceRole[] values() {
        return (SpaceRole[]) $VALUES.clone();
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getLabel() {
        return this.label;
    }

    public final String getWire() {
        return this.wire;
    }

    static {
        SpaceRole spaceRole = new SpaceRole("VIEW", 0, "view", R.string._name_removed__res_0x7f120fb1, R.drawable.eye_wght400_outline_24);
        VIEW = spaceRole;
        SpaceRole spaceRole2 = new SpaceRole("USE", 1, "use", R.string._name_removed__res_0x7f120fb0, R.drawable.hand_index_point_wght400_outline_24);
        USE = spaceRole2;
        SpaceRole spaceRole3 = new SpaceRole("EDIT", 2, "edit", R.string._name_removed__res_0x7f120faf, R.drawable.wrench_wght400_outline_24);
        EDIT = spaceRole3;
        SpaceRole[] spaceRoleArr = {spaceRole, spaceRole2, spaceRole3};
        $VALUES = spaceRoleArr;
        $ENTRIES = C3cG.A0w(spaceRoleArr);
        Companion = new Companion();
    }

    public SpaceRole(String str, int i, String str2, int i2, int i3) {
        this.wire = str2;
        this.label = i2;
        this.icon = i3;
    }
}
