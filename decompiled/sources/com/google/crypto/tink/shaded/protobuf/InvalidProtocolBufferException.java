package com.google.crypto.tink.shaded.protobuf;

import X.InterfaceC9329GEk;
import java.io.IOException;

/* loaded from: classes6.dex */
public class InvalidProtocolBufferException extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;
    public InterfaceC9329GEk unfinishedMessage;
    public boolean wasThrownFromInputStream;

    public class InvalidWireTypeException extends InvalidProtocolBufferException {
        public static final long serialVersionUID = 3283890091615336259L;
    }

    public static InvalidWireTypeException A00() {
        InvalidWireTypeException invalidWireTypeException = new InvalidWireTypeException("Protocol message tag had invalid wire type.");
        invalidWireTypeException.unfinishedMessage = null;
        return invalidWireTypeException;
    }
}
