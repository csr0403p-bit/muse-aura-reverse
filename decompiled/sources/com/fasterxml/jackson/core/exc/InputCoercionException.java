package com.fasterxml.jackson.core.exc;

import X.AbstractC9916Gl7;
import X.C9516GMj;
import X.EnumC9834GiY;

/* loaded from: classes6.dex */
public class InputCoercionException extends StreamReadException {
    public static final long serialVersionUID = 1;
    public final EnumC9834GiY _inputType;
    public final Class<?> _targetType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Gl7;Ljava/lang/String;LX/GiY;Ljava/lang/Class<*>;)V */
    public InputCoercionException(AbstractC9916Gl7 abstractC9916Gl7, EnumC9834GiY enumC9834GiY, Class cls, String str) {
        super(str, null);
        C9516GMj c9516GMjA1I = abstractC9916Gl7.A1I();
        this._location = c9516GMjA1I;
        this.A00 = abstractC9916Gl7;
        this._inputType = enumC9834GiY;
        this._targetType = cls;
    }
}
