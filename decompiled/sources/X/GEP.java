package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class GEP implements GER {
    @Override // X.GER
    public final byte[] A7O(byte[] bytes, int offset, int size) {
        return Arrays.copyOfRange(bytes, offset, size + offset);
    }
}
