package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageCommandInvocation implements FfiConverterRustBuffer<PageCommandInvocation> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageCommandInvocation INSTANCE = new FfiConverterTypePageCommandInvocation();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageCommandInvocation pageCommandInvocation) {
        return AbstractC7608F5v.A0X(pageCommandInvocation).mo3323allocationSizeI7RO_PI(pageCommandInvocation.operationId) + FfiConverterTypeBudget.INSTANCE.mo3323allocationSizeI7RO_PI(pageCommandInvocation.budget) + FfiConverterTypeCommand.INSTANCE.mo3323allocationSizeI7RO_PI(pageCommandInvocation.command) + FfiConverterOptionalTypeObserveOptions.INSTANCE.mo3323allocationSizeI7RO_PI(pageCommandInvocation.observeAfter);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageCommandInvocation lift(RustBuffer.ByValue byValue) {
        return (PageCommandInvocation) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageCommandInvocation liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageCommandInvocation) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageCommandInvocation pageCommandInvocation) {
        return lower((Object) pageCommandInvocation);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageCommandInvocation pageCommandInvocation) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageCommandInvocation);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageCommandInvocation read(ByteBuffer byteBuffer) {
        return new PageCommandInvocation(AbstractC7610F5x.A0k(byteBuffer), FfiConverterTypeBudget.INSTANCE.read(byteBuffer), FfiConverterTypeCommand.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeObserveOptions.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageCommandInvocation pageCommandInvocation, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageCommandInvocation, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(pageCommandInvocation.operationId, byteBuffer);
        FfiConverterTypeBudget.INSTANCE.write(pageCommandInvocation.budget, byteBuffer);
        FfiConverterTypeCommand.INSTANCE.write(pageCommandInvocation.command, byteBuffer);
        FfiConverterOptionalTypeObserveOptions.INSTANCE.write(pageCommandInvocation.observeAfter, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageCommandInvocation, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageCommandInvocation lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
