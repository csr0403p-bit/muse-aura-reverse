package com.facebook.aura.bloks.signatures.bkactioncaafetchmachineid;

import X.BV5;
import X.CFK;
import X.F6D;
import X.Hj6;

/* loaded from: classes6.dex */
public final class BKBloksActionCaaFetchMachineIDImpl {
    public static final String TAG = "BKBloksActionCaaFetchMachineIDImpl";
    public static final BKBloksActionCaaFetchMachineIDImpl INSTANCE = new BKBloksActionCaaFetchMachineIDImpl();
    public static final String machineId = BV5.A0j();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        CFK.A06(TAG, "FetchMachineID: Returning random UUID");
        return machineId;
    }
}
