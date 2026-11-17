package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.BV4;
import X.C10091GpF;
import X.FGI;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* loaded from: classes6.dex */
public class InetSocketAddressSerializer extends StdScalarSerializer<InetSocketAddress> {
    public InetSocketAddressSerializer() {
        super(InetSocketAddress.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
        C10091GpF c10091GpFA06 = JsonSerializer.A06(abstractC9919GlE, abstractC9996GnP, InetSocketAddress.class, inetSocketAddress);
        A00(abstractC9919GlE, inetSocketAddress);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA06);
    }

    public static final void A00(AbstractC9919GlE abstractC9919GlE, InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int iIndexOf = hostName.indexOf(47);
        if (iIndexOf >= 0) {
            hostName = iIndexOf == 0 ? address instanceof Inet6Address ? FGI.A0U("[", hostName.substring(1), "]") : hostName.substring(1) : BV4.A0j(hostName, iIndexOf);
        }
        abstractC9919GlE.A0s(FGI.A0S(hostName, ":", inetSocketAddress.getPort()));
    }
}
