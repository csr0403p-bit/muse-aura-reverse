package com.google.crypto.tink.shaded.protobuf;

import X.FGI;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes6.dex */
public class CodedOutputStream$OutOfSpaceException extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    public CodedOutputStream$OutOfSpaceException() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public CodedOutputStream$OutOfSpaceException(Throwable position, int limit, int length, int cause) {
        super(FGI.A0M("CodedOutputStream was writing to a flat byte array and ran out of space.: ", String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(limit), Long.valueOf(length), Integer.valueOf(cause))), position);
    }
}
