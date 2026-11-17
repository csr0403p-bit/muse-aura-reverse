package com.facebook.aura.pairs;

import X.ATD;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06827l3;
import X.C3cG;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.F60;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public abstract class SharedGoalKt {
    public static final C06827l3 SHARED_GOAL_REVISION = C06827l3.A02("^[0-9a-f]{64}$");

    public static final SharedGoal toSharedGoal(SharedGoalJson sharedGoalJson) {
        int iIntValue;
        Object objA0s;
        C7384Etj.A0Y(sharedGoalJson, 0);
        if (sharedGoalJson.goal_id.length() == 0 || !SHARED_GOAL_REVISION.A08(sharedGoalJson.revision)) {
            return null;
        }
        List<JsonElement> list = sharedGoalJson.tasks;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = list.iterator();
        while (it.hasNext()) {
            try {
                objA0s = (SharedGoalTaskJson) HatchJsonKt.HatchJson.A01(SharedGoalTaskJson$$serializer.INSTANCE, C60Q.A11(it));
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            C60R.A1J(objA0s, arrayListA0h);
        }
        ArrayList<SharedGoalTaskJson> arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            if (((SharedGoalTaskJson) obj).task_id.length() > 0) {
                arrayListA0h2.add(obj);
            }
        }
        Integer num = sharedGoalJson.total_tasks;
        int iMax = Math.max(num != null ? num.intValue() : 0, arrayListA0h2.size());
        String str = sharedGoalJson.goal_id;
        String str2 = sharedGoalJson.title;
        String str3 = sharedGoalJson.summary;
        SharedGoalStatus sharedGoalStatusFromWire = SharedGoalStatus.Companion.fromWire(sharedGoalJson.status);
        String str4 = sharedGoalJson.revision;
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h2);
        for (SharedGoalTaskJson sharedGoalTaskJson : arrayListA0h2) {
            arrayListA0i.add(new SharedGoalTask(sharedGoalTaskJson.task_id, sharedGoalTaskJson.title, AnonymousClass002.A1b(sharedGoalTaskJson.completed, true)));
        }
        Integer num2 = sharedGoalJson.completed_tasks;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else if ((arrayListA0h2 instanceof Collection) && arrayListA0h2.isEmpty()) {
            iIntValue = 0;
        } else {
            Iterator it2 = arrayListA0h2.iterator();
            iIntValue = 0;
            while (it2.hasNext()) {
                if (AnonymousClass002.A1b(((SharedGoalTaskJson) it2.next()).completed, true) && (iIntValue = iIntValue + 1) < 0) {
                    AbstractC0885AGm.A13();
                    throw F60.createAndThrow();
                }
            }
        }
        return new SharedGoal(str, str2, str3, sharedGoalStatusFromWire, str4, arrayListA0i, iMax, ATD.A04(iIntValue, 0, iMax));
    }
}
