package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePoint implements FfiConverterRustBuffer<Point> {
    public static final int $stable = 0;
    public static final FfiConverterTypePoint INSTANCE = new FfiConverterTypePoint();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3511allocationSizeI7RO_PI(Point point) {
        C7384Etj.A0Y(point, 0);
        return 16L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public Point read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new Point(byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ Point lift(RustBuffer.ByValue byValue) {
        return (Point) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Point liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Point) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(Point point) {
        return lower((Object) point);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(Point point) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, point);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(Point point, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(point, byteBuffer);
        byteBuffer.putDouble(point.x);
        byteBuffer.putDouble(point.y);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return 16L;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.Point, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ Point lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
