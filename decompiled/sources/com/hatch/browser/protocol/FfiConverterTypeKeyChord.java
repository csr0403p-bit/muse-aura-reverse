package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeKeyChord implements FfiConverterRustBuffer<KeyChord> {
    public static final int $stable = 0;
    public static final FfiConverterTypeKeyChord INSTANCE = new FfiConverterTypeKeyChord();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(KeyChord keyChord) {
        C7384Etj.A0Y(keyChord, 0);
        return FfiConverterTypeKey.INSTANCE.mo3323allocationSizeI7RO_PI(keyChord.key) + FfiConverterSequenceTypeKeyModifier.INSTANCE.mo3323allocationSizeI7RO_PI(keyChord.modifiers);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public KeyChord read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new KeyChord(FfiConverterTypeKey.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeKeyModifier.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ KeyChord lift(RustBuffer.ByValue byValue) {
        return (KeyChord) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ KeyChord liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (KeyChord) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(KeyChord keyChord) {
        return lower((Object) keyChord);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(KeyChord keyChord) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, keyChord);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(KeyChord keyChord, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(keyChord, byteBuffer);
        FfiConverterTypeKey.INSTANCE.write(keyChord.key, byteBuffer);
        FfiConverterSequenceTypeKeyModifier.INSTANCE.write(keyChord.modifiers, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.KeyChord, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ KeyChord lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
