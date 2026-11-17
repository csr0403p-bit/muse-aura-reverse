package com.fasterxml.jackson.databind.ext;

import X.AbstractC9870GjI;
import X.AbstractC9880Gjo;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.C9895GkY;
import X.EnumC9834GiY;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/* loaded from: classes6.dex */
public final class CoreXMLDeserializers extends AbstractC9880Gjo {
    public static final DatatypeFactory A00;
    public static final QName A01 = QName.valueOf("");

    public class Std extends FromStringDeserializer<Object> {
        public static final long serialVersionUID = 1;
        public final int _kind;

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IOException {
            if (this._kind != 2 || !abstractC9916Gl7.A22(EnumC9834GiY.VALUE_NUMBER_INT)) {
                return super.A0i(abstractC9916Gl7, abstractC9904Gkk);
            }
            Date dateA1B = A1B(abstractC9916Gl7, abstractC9904Gkk);
            if (dateA1B == null) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(dateA1B);
            TimeZone timeZone = abstractC9904Gkk._config._base._timeZone;
            if (timeZone != null || (timeZone = C9895GkY.A00) != null) {
                gregorianCalendar.setTimeZone(timeZone);
            }
            return CoreXMLDeserializers.A00.newXMLGregorianCalendar(gregorianCalendar);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final Object A1K(AbstractC9904Gkk abstractC9904Gkk) {
            return this._kind == 3 ? CoreXMLDeserializers.A01 : super.A1K(abstractC9904Gkk);
        }

        public Std(Class<?> cls, int i) {
            super(cls);
            this._kind = i;
        }
    }

    static {
        try {
            A00 = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw BV4.A0e(e);
        }
    }

    @Override // X.InterfaceC9884Gjs
    public final JsonDeserializer ABQ(AbstractC9870GjI abstractC9870GjI) {
        int i;
        Class<?> cls = abstractC9870GjI._class;
        if (cls == QName.class) {
            i = 3;
        } else if (cls == XMLGregorianCalendar.class) {
            i = 2;
        } else {
            if (cls != Duration.class) {
                return null;
            }
            i = 1;
        }
        return new Std(cls, i);
    }
}
