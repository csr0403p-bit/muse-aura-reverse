package com.fasterxml.jackson.databind.exc;

import X.AbstractC9916Gl7;

/* loaded from: classes6.dex */
public class InvalidFormatException extends MismatchedInputException {
    public static final long serialVersionUID = 1;
    public final Object _value;

    /* JADX WARN: Incorrect types in method signature: (LX/Gl7;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class<*>;)V */
    public InvalidFormatException(AbstractC9916Gl7 abstractC9916Gl7, Class cls, Object obj, String str) {
        super(abstractC9916Gl7, str);
        this._targetType = cls;
        this._value = obj;
    }
}
