package com.facebook.aura.conversation.view;

import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import X.FGI;
import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchCustomReaction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCustomReaction[] $VALUES;
    public static final Map<String, HatchCustomReaction> ByWireValue;
    public static final Companion Companion;
    public static final HatchCustomReaction FACEBOOK_LIKE;
    public static final HatchCustomReaction HEART;
    public static final List<HatchCustomReaction> userOffered;
    public final int iconRes;
    public final String id;
    public final boolean isOfferedToUser;
    public final int labelRes;

    public final class Companion {
        public final HatchCustomReaction fromWireValue(String str) {
            C7384Etj.A0Y(str, 0);
            return (HatchCustomReaction) HatchCustomReaction.ByWireValue.get(str);
        }

        public final List<HatchCustomReaction> getUserOffered() {
            return HatchCustomReaction.userOffered;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<HatchCustomReaction> getEntries() {
        return $ENTRIES;
    }

    public static HatchCustomReaction valueOf(String str) {
        return (HatchCustomReaction) Enum.valueOf(HatchCustomReaction.class, str);
    }

    public static HatchCustomReaction[] values() {
        return (HatchCustomReaction[]) $VALUES.clone();
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getId() {
        return this.id;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }

    public final String getWireValue() {
        return FGI.A0M(HatchCustomReactionKt.HATCH_CUSTOM_REACTION_PREFIX, this.id);
    }

    public final boolean isOfferedToUser() {
        return this.isOfferedToUser;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        HatchCustomReaction hatchCustomReaction = new HatchCustomReaction("HEART", 0, "heart_v1", R.drawable.hatch_heart_v1, R.string._name_removed__res_0x7f120873, 0 == true ? 1 : 0, 8, null);
        HEART = hatchCustomReaction;
        HatchCustomReaction hatchCustomReaction2 = new HatchCustomReaction("FACEBOOK_LIKE", 1, "facebook_thumbs_up_v1", R.drawable.facebook_thumbs_up_v1, R.string._name_removed__res_0x7f120874, false);
        FACEBOOK_LIKE = hatchCustomReaction2;
        HatchCustomReaction[] hatchCustomReactionArr = {hatchCustomReaction, hatchCustomReaction2};
        $VALUES = hatchCustomReactionArr;
        $ENTRIES = new F3w(hatchCustomReactionArr);
        Companion = new Companion();
        Ey9<HatchCustomReaction> entries = getEntries();
        ArrayList arrayList = new ArrayList();
        for (HatchCustomReaction hatchCustomReaction3 : entries) {
            if (hatchCustomReaction3.isOfferedToUser) {
                arrayList.add(hatchCustomReaction3);
            }
        }
        userOffered = arrayList;
        Ey9<HatchCustomReaction> entries2 = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(entries2));
        for (HatchCustomReaction hatchCustomReaction4 : entries2) {
            linkedHashMap.put(hatchCustomReaction4.getWireValue(), hatchCustomReaction4);
        }
        ByWireValue = linkedHashMap;
    }

    public HatchCustomReaction(String str, int i, String str2, int i2, int i3, boolean z) {
        this.id = str2;
        this.iconRes = i2;
        this.labelRes = i3;
        this.isOfferedToUser = z;
    }

    public /* synthetic */ HatchCustomReaction(String str, int i, String str2, int i2, int i3, boolean z, int i4, C06H c06h) {
        this(str, i, str2, i2, i3, (i4 & 8) != 0 ? true : z);
    }
}
