package com.fasterxml.jackson.databind.exc;

import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9916Gl7;
import X.C10104GpS;
import com.fasterxml.jackson.databind.JsonMappingException;

/* loaded from: classes6.dex */
public class MismatchedInputException extends JsonMappingException {
    public Class<?> _targetType;

    public static MismatchedInputException A00(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9870GjI abstractC9870GjI, String str) {
        MismatchedInputException mismatchedInputException = new MismatchedInputException(abstractC9916Gl7, str);
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        mismatchedInputException._targetType = abstractC9870GjI == null ? null : abstractC9870GjI._class;
        return mismatchedInputException;
    }
}
