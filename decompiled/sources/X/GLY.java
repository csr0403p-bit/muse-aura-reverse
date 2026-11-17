package X;

import java.lang.Enum;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GLY<E extends Enum<E>, O> {
    public final Map<E, O> A00;
    public final Map<O, E> A01;

    public GLY(Map<E, O> fromProtoEnumMap, Map<O, E> toProtoEnumMap) {
        this.A00 = fromProtoEnumMap;
        this.A01 = toProtoEnumMap;
    }
}
