package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypeViewport implements FfiConverterRustBuffer<Viewport> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeViewport INSTANCE = new FfiConverterOptionalTypeViewport();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(Viewport viewport, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (viewport == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterTypeViewport.INSTANCE.write(viewport, byteBuffer);
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(Viewport viewport) {
        if (viewport != null) {
            return FfiConverterTypeViewport.INSTANCE.mo3323allocationSizeI7RO_PI(viewport) + 1;
        }
        return 1L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ Viewport lift(RustBuffer.ByValue byValue) {
        return (Viewport) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Viewport liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Viewport) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(Viewport viewport) {
        return lower((Object) viewport);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(Viewport viewport) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, viewport);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public Viewport read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypeViewport.INSTANCE.read(byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.Viewport, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ Viewport lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
