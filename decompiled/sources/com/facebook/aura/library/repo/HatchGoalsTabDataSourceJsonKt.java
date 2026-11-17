package com.facebook.aura.library.repo;

import X.C10571Hud;
import X.C3cG;
import X.C7BY;
import X.C9oY;
import X.CFK;
import X.FGI;
import java.util.Iterator;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public abstract class HatchGoalsTabDataSourceJsonKt {
    public static final String TAG = "HatchGoalsTabDataSourceJson";

    public static final String optString(JsonObject jsonObject, String... strArr) {
        Object objA0s;
        if (jsonObject == null) {
            return null;
        }
        for (String str : strArr) {
            JsonElement jsonElement = (JsonElement) jsonObject.get(str);
            if (jsonElement != null) {
                try {
                    objA0s = C9oY.A04(C9oY.A08(jsonElement));
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                if (objA0s instanceof C10571Hud) {
                    objA0s = null;
                }
                String str2 = (String) objA0s;
                if (str2 != null && !C7BY.A0j(str2)) {
                    return str2;
                }
            }
        }
        return null;
    }

    public static final GoalStatus parseGoalStatus(String str) {
        GoalStatus next;
        if (str == null) {
            return null;
        }
        Iterator<GoalStatus> it = GoalStatus.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(next.getWireValue())) {
                break;
            }
        }
        GoalStatus goalStatus = next;
        if (goalStatus != null) {
            return goalStatus;
        }
        CFK.A06(TAG, FGI.A0M("Unknown goal status from server: ", str));
        return null;
    }

    public static final JsonElement goalFixedPosition(Long l) {
        return l == null ? JsonNull.A00 : C9oY.A06(l);
    }

    public static final JsonElement goalParent(String str) {
        return str == null ? JsonNull.A00 : C9oY.A07(str);
    }

    public static final GoalMomentumStatus parseMomentumStatus(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -1392832198) {
            if (str.equals("behind")) {
                return GoalMomentumStatus.BEHIND;
            }
            return null;
        }
        if (iHashCode == -694239397) {
            if (str.equals("at_risk")) {
                return GoalMomentumStatus.AT_RISK;
            }
            return null;
        }
        if (iHashCode == 1849966315 && str.equals("on_track")) {
            return GoalMomentumStatus.ON_TRACK;
        }
        return null;
    }
}
