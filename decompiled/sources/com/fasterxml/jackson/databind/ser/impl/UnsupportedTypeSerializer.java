package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC9870GjI;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: classes6.dex */
public class UnsupportedTypeSerializer extends StdSerializer<Object> {
    public static final long serialVersionUID = 1;
    public final String _message;
    public final AbstractC9870GjI _type;

    public UnsupportedTypeSerializer(AbstractC9870GjI abstractC9870GjI, String str) {
        super(Object.class);
        this._type = abstractC9870GjI;
        this._message = str;
    }
}
