package androidx.glance.appwidget.protobuf;

import X.AbstractC7609F5w;
import X.AnonymousClass777;
import java.io.IOException;

/* loaded from: classes6.dex */
public class InvalidProtocolBufferException extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;
    public AnonymousClass777 unfinishedMessage;
    public boolean wasThrownFromInputStream;

    public class InvalidWireTypeException extends InvalidProtocolBufferException {
        public static final long serialVersionUID = 3283890091615336259L;
    }

    public static InvalidWireTypeException A00() {
        InvalidWireTypeException invalidWireTypeException = new InvalidWireTypeException("Protocol message tag had invalid wire type.");
        invalidWireTypeException.unfinishedMessage = null;
        return invalidWireTypeException;
    }

    public static InvalidProtocolBufferException A01() {
        return AbstractC7609F5w.A0U("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
