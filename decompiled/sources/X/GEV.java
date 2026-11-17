package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class GEV implements GEX {
    @Override // X.GEX
    public final byte[] A7O(byte[] bytes, int offset, int size) {
        return Arrays.copyOfRange(bytes, offset, size + offset);
    }
}
