package com.fasterxml.jackson.core.io;

import X.AbstractC9916Gl7;
import X.C9516GMj;
import X.EnumC9834GiY;
import com.fasterxml.jackson.core.JsonParseException;

/* loaded from: classes6.dex */
public class JsonEOFException extends JsonParseException {
    public static final long serialVersionUID = 1;
    public final EnumC9834GiY _token;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonEOFException(AbstractC9916Gl7 abstractC9916Gl7, EnumC9834GiY enumC9834GiY, String str) {
        super(str, null);
        C9516GMj c9516GMjA1I = abstractC9916Gl7.A1I();
        this._location = c9516GMjA1I;
        this.A00 = abstractC9916Gl7;
        this._token = enumC9834GiY;
    }
}
