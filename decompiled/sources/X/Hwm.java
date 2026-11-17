package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class Hwm implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC10554Hsh.A00(getKey(), entry.getKey()) && AbstractC10554Hsh.A00(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return ((HCK) this).A01;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        HCK hck = (HCK) this;
        HCE hce = hck.A02;
        Map mapA03 = hce.A03();
        if (mapA03 != null) {
            return mapA03.get(hck.A01);
        }
        HCK.A00(hck);
        int i = hck.A00;
        if (i == -1) {
            return null;
        }
        Object[] objArr = hce.A05;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        HCK hck = (HCK) this;
        HCE hce = hck.A02;
        Map mapA03 = hce.A03();
        if (mapA03 != null) {
            return mapA03.put(hck.A01, obj);
        }
        HCK.A00(hck);
        int i = hck.A00;
        if (i == -1) {
            hce.put(hck.A01, obj);
            return null;
        }
        Object[] objArr = hce.A05;
        objArr.getClass();
        Object obj2 = objArr[i];
        int i2 = hck.A00;
        Object[] objArr2 = hce.A05;
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
