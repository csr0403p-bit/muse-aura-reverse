package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class CUC extends CUB implements Serializable {
    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C8j2.A00(1));
    }

    private final Object writeReplace() {
        return C7421EvZ.A00;
    }
}
