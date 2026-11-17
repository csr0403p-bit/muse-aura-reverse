package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypeScrollSpeed implements FfiConverterRustBuffer<ScrollSpeed> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeScrollSpeed INSTANCE = new FfiConverterOptionalTypeScrollSpeed();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ScrollSpeed scrollSpeed, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (scrollSpeed == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            AbstractC7611F5y.A0q(scrollSpeed, byteBuffer);
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3358allocationSizeI7RO_PI(ScrollSpeed scrollSpeed) {
        return AbstractC7610F5x.A0W(scrollSpeed);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ScrollSpeed lift(RustBuffer.ByValue byValue) {
        return (ScrollSpeed) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ScrollSpeed liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ScrollSpeed) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ScrollSpeed scrollSpeed) {
        return lower((Object) scrollSpeed);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ScrollSpeed scrollSpeed) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, scrollSpeed);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ScrollSpeed read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypeScrollSpeed.INSTANCE.read(byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0W(obj);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ScrollSpeed, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ScrollSpeed lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
