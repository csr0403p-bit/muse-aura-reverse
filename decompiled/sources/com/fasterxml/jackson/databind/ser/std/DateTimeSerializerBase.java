package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.Bs8;
import X.C60Q;
import X.C9963Gma;
import X.EnumC9975Gmp;
import X.InterfaceC9833GiW;
import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements InterfaceC9833GiW {
    public final DateFormat _customFormat;
    public final AtomicReference<DateFormat> _reusedCustomFormat;
    public final Boolean _useTimestamp;

    private final DateTimeSerializerBase<T> A0H(Boolean bool, DateFormat dateFormat) {
        return this instanceof SqlDateSerializer ? new SqlDateSerializer(bool, Date.class, dateFormat) : this instanceof DateSerializer ? new DateSerializer(bool, java.util.Date.class, dateFormat) : new CalendarSerializer(bool, Calendar.class, dateFormat);
    }

    public final void A0I(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, java.util.Date date) {
        if (this._customFormat != null) {
            DateFormat andSet = this._reusedCustomFormat.getAndSet(null);
            if (andSet == null) {
                andSet = (DateFormat) this._customFormat.clone();
            }
            abstractC9919GlE.A0s(andSet.format(date));
            Bs8.A00(null, andSet, this._reusedCustomFormat);
            return;
        }
        EnumC9975Gmp enumC9975Gmp = EnumC9975Gmp.WRITE_DATES_AS_TIMESTAMPS;
        C9963Gma c9963Gma = abstractC9842Gii._config;
        if (c9963Gma.A0E(enumC9975Gmp)) {
            abstractC9919GlE.A0Y(date.getTime());
            return;
        }
        DateFormat dateFormat = abstractC9842Gii._dateFormat;
        if (dateFormat == null) {
            dateFormat = (DateFormat) c9963Gma._base._dateFormat.clone();
            abstractC9842Gii._dateFormat = dateFormat;
        }
        abstractC9919GlE.A0s(dateFormat.format(date));
    }

    public final boolean A0J(AbstractC9842Gii abstractC9842Gii) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat != null) {
            return false;
        }
        if (abstractC9842Gii == null) {
            throw C60Q.A0U("Null SerializerProvider passed for ", this._handledType.getName());
        }
        return abstractC9842Gii._config.A0E(EnumC9975Gmp.WRITE_DATES_AS_TIMESTAMPS);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    @Override // X.InterfaceC9833GiW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A7f(X.InterfaceC10017Gnp r7, X.AbstractC9842Gii r8) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase.A7f(X.Gnp, X.Gii):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<TT;>;Ljava/lang/Boolean;Ljava/text/DateFormat;)V */
    public DateTimeSerializerBase(Boolean bool, Class cls, DateFormat dateFormat) {
        super(cls);
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
        this._reusedCustomFormat = dateFormat == null ? null : new AtomicReference<>();
    }
}
