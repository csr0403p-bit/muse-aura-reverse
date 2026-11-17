package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypeSubmitContinuation implements FfiConverterRustBuffer<SubmitContinuation> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeSubmitContinuation INSTANCE = new FfiConverterOptionalTypeSubmitContinuation();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(SubmitContinuation submitContinuation, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (submitContinuation == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterTypeSubmitContinuation.INSTANCE.write(submitContinuation, byteBuffer);
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(SubmitContinuation submitContinuation) {
        if (submitContinuation != null) {
            return FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(submitContinuation.value) + 1;
        }
        return 1L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ SubmitContinuation lift(RustBuffer.ByValue byValue) {
        return (SubmitContinuation) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ SubmitContinuation liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (SubmitContinuation) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(SubmitContinuation submitContinuation) {
        return lower((Object) submitContinuation);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(SubmitContinuation submitContinuation) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, submitContinuation);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public SubmitContinuation read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return new SubmitContinuation(AbstractC7610F5x.A0z(byteBuffer));
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.SubmitContinuation, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ SubmitContinuation lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
