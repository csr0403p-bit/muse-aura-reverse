package com.fasterxml.jackson.databind.exc;

import X.AbstractC9855Gj3;
import X.AbstractC9904Gkk;
import X.C10009Gnh;
import X.C10104GpS;

/* loaded from: classes6.dex */
public class InvalidNullException extends MismatchedInputException {
    public static final long serialVersionUID = 1;
    public final C10009Gnh _propertyName;

    public InvalidNullException(AbstractC9904Gkk abstractC9904Gkk, C10009Gnh c10009Gnh, String str) {
        super(abstractC9904Gkk == null ? null : abstractC9904Gkk.A00, str);
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        this._targetType = null;
        this._propertyName = c10009Gnh;
    }
}
