package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageCloseInvocation implements FfiConverterRustBuffer<PageCloseInvocation> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageCloseInvocation INSTANCE = new FfiConverterTypePageCloseInvocation();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageCloseInvocation pageCloseInvocation) {
        return AbstractC7608F5v.A0X(pageCloseInvocation).mo3323allocationSizeI7RO_PI(pageCloseInvocation.operationId) + FfiConverterTypeBudget.INSTANCE.mo3323allocationSizeI7RO_PI(pageCloseInvocation.budget);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageCloseInvocation lift(RustBuffer.ByValue byValue) {
        return (PageCloseInvocation) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageCloseInvocation liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageCloseInvocation) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageCloseInvocation pageCloseInvocation) {
        return lower((Object) pageCloseInvocation);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageCloseInvocation pageCloseInvocation) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageCloseInvocation);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageCloseInvocation read(ByteBuffer byteBuffer) {
        return new PageCloseInvocation(AbstractC7610F5x.A0k(byteBuffer), FfiConverterTypeBudget.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageCloseInvocation pageCloseInvocation, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageCloseInvocation, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(pageCloseInvocation.operationId, byteBuffer);
        FfiConverterTypeBudget.INSTANCE.write(pageCloseInvocation.budget, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageCloseInvocation, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageCloseInvocation lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
