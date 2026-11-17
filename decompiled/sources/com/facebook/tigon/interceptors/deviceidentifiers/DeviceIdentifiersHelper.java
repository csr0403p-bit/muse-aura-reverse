package com.facebook.tigon.interceptors.deviceidentifiers;

import X.AbstractC0878AGe;
import X.AbstractC5245DeA;
import X.C7384Etj;
import X.C8j3;
import X.InterfaceC6685EQd;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class DeviceIdentifiersHelper {
    public final String[] headerNames;
    public final List<InterfaceC6685EQd> providers;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceIdentifiersHelper(List<? extends InterfaceC6685EQd> list) {
        C7384Etj.A0Y(list, 0);
        this.providers = list;
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((InterfaceC6685EQd) list.get(i)).getHeaderName();
        }
        this.headerNames = strArr;
    }

    public final String[] getHeaderNames() {
        String[] strArr = this.headerNames;
        return (String[]) C8j3.A1a(strArr, strArr.length);
    }

    public final String[] getHeaderValues() {
        String headerValue;
        List<InterfaceC6685EQd> list = this.providers;
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            InterfaceC6685EQd interfaceC6685EQd = list.get(i);
            String str = "";
            if (interfaceC6685EQd.isEnabled() && (headerValue = interfaceC6685EQd.getHeaderValue()) != null) {
                str = headerValue;
            }
            strArr[i] = str;
        }
        return strArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceIdentifiersHelper() {
        Set setA03 = AbstractC5245DeA.A03(1);
        C7384Etj.A0U(setA03);
        this(AbstractC0878AGe.A0X(setA03));
    }
}
