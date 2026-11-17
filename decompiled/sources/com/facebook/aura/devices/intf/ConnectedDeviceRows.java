package com.facebook.aura.devices.intf;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass004;
import X.C0881AGi;
import X.C20Q;
import X.C20Y;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ConnectedDeviceRows {
    public static final int $stable = 0;
    public static final ConnectedDeviceRows INSTANCE = new ConnectedDeviceRows();
    public static final String TAG = "ConnectedDeviceRows";

    public final C20Q<List<ConnectedDeviceRow>> rows(Context context, AbstractC3358CGz abstractC3358CGz) {
        int iA1b = AnonymousClass004.A1b(context, abstractC3358CGz);
        ArrayList arrayList = new ArrayList(iA1b);
        return arrayList.isEmpty() ? new C20Y(C0881AGi.A00) : new ConnectedDeviceRows$rows$$inlined$combine$1((C20Q[]) AbstractC0878AGe.A0X(arrayList).toArray(new C20Q[iA1b]));
    }
}
