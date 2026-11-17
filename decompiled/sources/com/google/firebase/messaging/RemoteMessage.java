package com.google.firebase.messaging;

import X.AbstractC4100CmU;
import X.AnonymousClass005;
import X.BV5;
import X.C4157CoC;
import X.C60N;
import X.DQd;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = C4157CoC.A00(64);
    public Bundle A00;
    public Map<String, String> A01;

    public final int A00() {
        Bundle bundle = this.A00;
        String string = bundle.getString("google.original_priority");
        if (string == null) {
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        return "normal".equals(string) ? 2 : 0;
    }

    public final int A01() {
        Bundle bundle = this.A00;
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        return "normal".equals(string) ? 2 : 0;
    }

    public final Map<String, String> A02() {
        Map<String, String> map = this.A01;
        Map<String, String> map2 = map;
        if (map == null) {
            Bundle bundle = this.A00;
            DQd dQd = new DQd(0);
            Iterator itA0w = BV5.A0w(bundle);
            while (itA0w.hasNext()) {
                String strA0j = AnonymousClass005.A0j(itA0w);
                Object obj = bundle.get(strA0j);
                if ((obj instanceof String) && !strA0j.startsWith("google.") && !strA0j.startsWith("gcm.") && !strA0j.equals("from") && !strA0j.equals("message_type") && !strA0j.equals(C60N.A00(72))) {
                    dQd.put(strA0j, obj);
                }
            }
            this.A01 = dQd;
            map2 = dQd;
        }
        return map2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A02(this.A00, parcel, 2);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
