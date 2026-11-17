package com.fasterxml.jackson.databind.exc;

import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9916Gl7;
import X.C10104GpS;

/* loaded from: classes6.dex */
public class InvalidTypeIdException extends MismatchedInputException {
    public static final long serialVersionUID = 1;
    public final AbstractC9870GjI _baseType;
    public final String _typeId;

    public InvalidTypeIdException(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9870GjI abstractC9870GjI, String str, String str2) {
        super(abstractC9916Gl7, str);
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        this._targetType = null;
        this._baseType = abstractC9870GjI;
        this._typeId = str2;
    }
}
