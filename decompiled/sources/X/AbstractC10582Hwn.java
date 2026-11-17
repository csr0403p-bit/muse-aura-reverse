package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* renamed from: X.Hwn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10582Hwn implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC10555Hsi.A00(getKey(), entry.getKey()) && AbstractC10555Hsi.A00(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return ((HCJ) this).A01;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        HCJ hcj = (HCJ) this;
        HCD hcd = hcj.A02;
        Map mapA03 = hcd.A03();
        if (mapA03 != null) {
            return mapA03.get(hcj.A01);
        }
        HCJ.A00(hcj);
        int i = hcj.A00;
        if (i == -1) {
            return null;
        }
        Object[] objArr = hcd.A05;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        HCJ hcj = (HCJ) this;
        HCD hcd = hcj.A02;
        Map mapA03 = hcd.A03();
        if (mapA03 != null) {
            return mapA03.put(hcj.A01, obj);
        }
        HCJ.A00(hcj);
        int i = hcj.A00;
        if (i == -1) {
            hcd.put(hcj.A01, obj);
            return null;
        }
        Object[] objArr = hcd.A05;
        objArr.getClass();
        Object obj2 = objArr[i];
        int i2 = hcj.A00;
        Object[] objArr2 = hcd.A05;
        objArr2.getClass();
        objArr2[i2] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return AnonymousClass006.A0D(getKey()) ^ C3cH.A02(getValue());
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(getKey());
        sbA0w.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return C8j3.A14(getValue(), sbA0w);
    }
}
