package androidx.datastore.preferences.protobuf;

import X.GH2;
import java.io.IOException;

/* loaded from: classes6.dex */
public class InvalidProtocolBufferException extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;
    public GH2 unfinishedMessage;

    public class InvalidWireTypeException extends InvalidProtocolBufferException {
        public static final long serialVersionUID = 3283890091615336259L;
    }
}
