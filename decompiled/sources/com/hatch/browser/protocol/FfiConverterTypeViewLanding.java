package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeViewLanding implements FfiConverterRustBuffer<ViewLanding> {
    public static final int $stable = 0;
    public static final FfiConverterTypeViewLanding INSTANCE = new FfiConverterTypeViewLanding();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ViewLanding viewLanding) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(viewLanding);
        return AbstractC7607F5u.A0R(ffiConverterStringA0W, viewLanding.name, AbstractC7607F5u.A0R(ffiConverterStringA0W, viewLanding.role, ffiConverterStringA0W.mo3323allocationSizeI7RO_PI(viewLanding.reference)));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ViewLanding lift(RustBuffer.ByValue byValue) {
        return (ViewLanding) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ViewLanding liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ViewLanding) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ViewLanding viewLanding) {
        return lower((Object) viewLanding);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ViewLanding viewLanding) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, viewLanding);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ViewLanding read(ByteBuffer byteBuffer) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(byteBuffer);
        return new ViewLanding(ffiConverterStringA0W.read(byteBuffer), ffiConverterStringA0W.read(byteBuffer), ffiConverterStringA0W.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ViewLanding viewLanding, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(viewLanding, byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(viewLanding.reference, byteBuffer);
        ffiConverterString.write(viewLanding.role, byteBuffer);
        ffiConverterString.write(viewLanding.name, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ViewLanding, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ViewLanding lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
