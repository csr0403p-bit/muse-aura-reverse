package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.C60O;
import X.C60P;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes6.dex */
public final class FancyPinRenderBufferDecoder {
    public static final int DIRTY_FLAGS_OFFSET = 6;
    public static final int ENTRY_SIZE_BYTES = 16;
    public static final FancyPinRenderBufferDecoder INSTANCE = new FancyPinRenderBufferDecoder();
    public static final int SCREEN_X_OFFSET = 8;
    public static final int SCREEN_Y_OFFSET = 12;
    public static final int STATE_FLAGS_OFFSET = 7;
    public static final int UNSIGNED_BYTE_MASK = 255;
    public static final int UNSIGNED_SHORT_MASK = 65535;
    public static final int VARIANT_OFFSET = 4;

    public final void decode(ByteBuffer byteBuffer, int i, FancyPinRenderFrame fancyPinRenderFrame) {
        AnonymousClass003.A0v(byteBuffer, fancyPinRenderFrame);
        if (i < 0) {
            throw C60O.A0i("Render buffer entry count must be non-negative");
        }
        if (byteBuffer.position() != 0) {
            throw C60O.A0i("Render buffer position must be zero");
        }
        long j = i * 16;
        if (j > byteBuffer.limit()) {
            throw C60O.A0i(C60P.A1O(" bytes but limit is ", C60O.A0z("Render buffer requires ", j), byteBuffer.limit()));
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        fancyPinRenderFrame.clear();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 16;
            int i4 = byteBuffer.getInt(i3);
            if (i4 < 0) {
                throw C60O.A0i("Render buffer slot index exceeds Int.MAX_VALUE");
            }
            fancyPinRenderFrame.append(i4, 65535 & byteBuffer.getShort(i3 + 4), byteBuffer.get(i3 + 6) & 255, byteBuffer.get(i3 + 7) & 255, byteBuffer.getFloat(i3 + 8), byteBuffer.getFloat(i3 + 12));
        }
    }
}
