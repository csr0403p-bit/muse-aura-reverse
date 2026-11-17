package kotlinx.serialization;

import X.FGI;

/* loaded from: classes2.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        super(FGI.A0H("An unknown field for index ", i));
    }
}
