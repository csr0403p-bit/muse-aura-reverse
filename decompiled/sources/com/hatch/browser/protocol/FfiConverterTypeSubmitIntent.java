package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeSubmitIntent implements FfiConverterRustBuffer<SubmitIntent> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSubmitIntent INSTANCE = new FfiConverterTypeSubmitIntent();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(SubmitIntent submitIntent) {
        C7384Etj.A0Y(submitIntent, 0);
        return FfiConverterSequenceTypeKeyChord.INSTANCE.mo3323allocationSizeI7RO_PI(submitIntent.keys);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public SubmitIntent read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new SubmitIntent(FfiConverterSequenceTypeKeyChord.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ SubmitIntent lift(RustBuffer.ByValue byValue) {
        return (SubmitIntent) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ SubmitIntent liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (SubmitIntent) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(SubmitIntent submitIntent) {
        return lower((Object) submitIntent);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(SubmitIntent submitIntent) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, submitIntent);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(SubmitIntent submitIntent, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(submitIntent, byteBuffer);
        FfiConverterSequenceTypeKeyChord.INSTANCE.write(submitIntent.keys, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.SubmitIntent, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ SubmitIntent lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
