package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes6.dex */
public class CodedOutputStream$OutOfSpaceException extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    public CodedOutputStream$OutOfSpaceException() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
