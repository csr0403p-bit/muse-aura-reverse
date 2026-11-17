package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9855Gj3;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.C9895GkY;
import X.F60;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class DateDeserializers$CalendarDeserializer extends DateDeserializers$DateBasedDeserializer<Calendar> {
    public final Constructor<Calendar> _defaultCtor;

    public DateDeserializers$CalendarDeserializer() {
        super(Calendar.class);
        this._defaultCtor = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Calendar A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws Throwable {
        Date dateA1B = A1B(abstractC9916Gl7, abstractC9904Gkk);
        Calendar calendarNewInstance = null;
        if (dateA1B != null) {
            Constructor<Calendar> constructor = this._defaultCtor;
            if (constructor == null) {
                TimeZone timeZone = abstractC9904Gkk._config._base._timeZone;
                if (timeZone == null) {
                    timeZone = C9895GkY.A00;
                }
                Calendar calendar = Calendar.getInstance(timeZone);
                calendar.setTime(dateA1B);
                return calendar;
            }
            try {
                calendarNewInstance = constructor.newInstance(null);
                calendarNewInstance.setTimeInMillis(dateA1B.getTime());
                TimeZone timeZone2 = abstractC9904Gkk._config._base._timeZone;
                if (timeZone2 == null) {
                    timeZone2 = C9895GkY.A00;
                }
                if (timeZone2 != null) {
                    calendarNewInstance.setTimeZone(timeZone2);
                    return calendarNewInstance;
                }
            } catch (Exception e) {
                abstractC9904Gkk.A0m(e, A0h());
                throw F60.createAndThrow();
            }
        }
        return calendarNewInstance;
    }

    public DateDeserializers$CalendarDeserializer(DateDeserializers$CalendarDeserializer dateDeserializers$CalendarDeserializer, String str, DateFormat dateFormat) {
        super(dateDeserializers$CalendarDeserializer, str, dateFormat);
        this._defaultCtor = dateDeserializers$CalendarDeserializer._defaultCtor;
    }

    public DateDeserializers$CalendarDeserializer(Class<? extends Calendar> cls) {
        super(GregorianCalendar.class);
        this._defaultCtor = AbstractC9855Gj3.A0B(GregorianCalendar.class, false);
    }
}
