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
public final class FfiConverterTypeControlFact implements FfiConverterRustBuffer<ControlFact> {
    public static final int $stable = 0;
    public static final FfiConverterTypeControlFact INSTANCE = new FfiConverterTypeControlFact();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ControlFact controlFact) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(controlFact);
        return AbstractC7607F5u.A0R(ffiConverterStringA0W, controlFact.credentialFillUrl, AbstractC7607F5u.A0R(ffiConverterStringA0W, controlFact.name, AbstractC7607F5u.A0R(ffiConverterStringA0W, controlFact.role, ffiConverterStringA0W.mo3323allocationSizeI7RO_PI(controlFact.reference))));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ControlFact lift(RustBuffer.ByValue byValue) {
        return (ControlFact) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ControlFact liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ControlFact) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ControlFact controlFact) {
        return lower((Object) controlFact);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ControlFact controlFact) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, controlFact);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ControlFact read(ByteBuffer byteBuffer) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(byteBuffer);
        return new ControlFact(ffiConverterStringA0W.read(byteBuffer), ffiConverterStringA0W.read(byteBuffer), ffiConverterStringA0W.read(byteBuffer), ffiConverterStringA0W.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ControlFact controlFact, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(controlFact, byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(controlFact.reference, byteBuffer);
        ffiConverterString.write(controlFact.role, byteBuffer);
        ffiConverterString.write(controlFact.name, byteBuffer);
        ffiConverterString.write(controlFact.credentialFillUrl, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ControlFact, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ControlFact lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
