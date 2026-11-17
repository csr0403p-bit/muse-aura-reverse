package com.fasterxml.jackson.databind.ext;

import X.AbstractC7609F5w;
import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import X.C9879Gjn;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import javax.xml.datatype.XMLGregorianCalendar;

/* loaded from: classes6.dex */
public final class CoreXMLSerializers extends C9879Gjn {

    public class XMLGregorianCalendarSerializer extends StdSerializer<XMLGregorianCalendar> implements InterfaceC9833GiW {
        public static final XMLGregorianCalendarSerializer A00 = new XMLGregorianCalendarSerializer();
        public final JsonSerializer<Object> _delegate;

        public XMLGregorianCalendarSerializer() {
            this(CalendarSerializer.A00);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) {
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            C10091GpF c10091GpFA06 = JsonSerializer.A06(abstractC9919GlE, abstractC9996GnP, XMLGregorianCalendar.class, xMLGregorianCalendar);
            this._delegate.A0C(abstractC9919GlE, abstractC9842Gii, xMLGregorianCalendar == null ? null : xMLGregorianCalendar.toGregorianCalendar());
            abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA06);
        }

        /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
        @Override // X.InterfaceC9833GiW
        public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) {
            JsonSerializer<Object> jsonSerializerA0b = this._delegate;
            if (jsonSerializerA0b != null) {
                jsonSerializerA0b = AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializerA0b, abstractC9842Gii, jsonSerializerA0b instanceof InterfaceC9833GiW ? 1 : 0);
            }
            return jsonSerializerA0b != this._delegate ? new XMLGregorianCalendarSerializer(jsonSerializerA0b) : this;
        }

        public XMLGregorianCalendarSerializer(JsonSerializer<?> jsonSerializer) {
            super(XMLGregorianCalendar.class);
            this._delegate = jsonSerializer;
        }
    }
}
