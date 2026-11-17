package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public class TimeZoneSerializer extends StdScalarSerializer<TimeZone> {
    public TimeZoneSerializer() {
        super(TimeZone.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) {
        TimeZone timeZone = (TimeZone) obj;
        C10091GpF c10091GpFA06 = JsonSerializer.A06(abstractC9919GlE, abstractC9996GnP, TimeZone.class, timeZone);
        abstractC9919GlE.A0s(timeZone.getID());
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA06);
    }
}
