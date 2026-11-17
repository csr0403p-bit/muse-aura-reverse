package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeFailure implements FfiConverterRustBuffer<Failure> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFailure INSTANCE = new FfiConverterTypeFailure();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(Failure failure) {
        C7384Etj.A0Y(failure, 0);
        return 4 + FfiConverterOptionalTypeFailureDetail.INSTANCE.mo3323allocationSizeI7RO_PI(failure.detail);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public Failure read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new Failure(FfiConverterTypeFailureCode.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeFailureDetail.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ Failure lift(RustBuffer.ByValue byValue) {
        return (Failure) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Failure liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Failure) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(Failure failure) {
        return lower((Object) failure);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(Failure failure) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, failure);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(Failure failure, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(failure, byteBuffer);
        AbstractC7611F5y.A0q(failure.code, byteBuffer);
        FfiConverterOptionalTypeFailureDetail.INSTANCE.write(failure.detail, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.Failure, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ Failure lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
