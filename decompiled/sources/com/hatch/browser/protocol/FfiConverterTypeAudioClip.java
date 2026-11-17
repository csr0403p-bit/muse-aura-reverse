package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeAudioClip implements FfiConverterRustBuffer<AudioClip> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAudioClip INSTANCE = new FfiConverterTypeAudioClip();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(AudioClip audioClip) {
        C7384Etj.A0Y(audioClip, 0);
        return AbstractC7607F5u.A0R(FfiConverterString.INSTANCE, audioClip.base64, FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(audioClip.mimeType));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public AudioClip read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new AudioClip(AbstractC7607F5u.A11(byteBuffer), AbstractC7607F5u.A12(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ AudioClip lift(RustBuffer.ByValue byValue) {
        return (AudioClip) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ AudioClip liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (AudioClip) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(AudioClip audioClip) {
        return lower((Object) audioClip);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(AudioClip audioClip) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, audioClip);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(AudioClip audioClip, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(audioClip, byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(audioClip.mimeType, byteBuffer);
        FfiConverterString.INSTANCE.write(audioClip.base64, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.AudioClip, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ AudioClip lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
