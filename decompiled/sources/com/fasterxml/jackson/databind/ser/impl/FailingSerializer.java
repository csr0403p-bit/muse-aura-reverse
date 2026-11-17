package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: classes6.dex */
public class FailingSerializer extends StdSerializer<Object> {
    public final String _msg;

    public FailingSerializer() {
        super(Object.class);
        this._msg = "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)";
    }
}
