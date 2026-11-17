package com.fasterxml.jackson.databind.exc;

import X.AbstractC9870GjI;
import X.AbstractC9916Gl7;
import com.fasterxml.jackson.databind.JsonMappingException;

/* loaded from: classes6.dex */
public class ValueInstantiationException extends JsonMappingException {
    public final AbstractC9870GjI _type;

    public ValueInstantiationException(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9870GjI abstractC9870GjI, String str, Throwable th) {
        super(abstractC9916Gl7, str, th);
        this._type = abstractC9870GjI;
    }
}
