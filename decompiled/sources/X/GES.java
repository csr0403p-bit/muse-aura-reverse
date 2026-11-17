package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class GES implements GEU {
    @Override // X.GEU
    public final byte[] A7O(byte[] bytes, int offset, int size) {
        return Arrays.copyOfRange(bytes, offset, size + offset);
    }
}
