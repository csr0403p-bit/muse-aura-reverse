package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageCloseRequest implements FfiConverterRustBuffer<PageCloseRequest> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageCloseRequest INSTANCE = new FfiConverterTypePageCloseRequest();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageCloseRequest pageCloseRequest) {
        return AbstractC7608F5v.A0X(pageCloseRequest).mo3323allocationSizeI7RO_PI(pageCloseRequest.operationId) + FfiConverterTypePageReference.INSTANCE.mo3323allocationSizeI7RO_PI(pageCloseRequest.page) + FfiConverterTypeBrowserTaskBinding.INSTANCE.mo3323allocationSizeI7RO_PI(pageCloseRequest.task) + FfiConverterTypeBudget.INSTANCE.mo3323allocationSizeI7RO_PI(pageCloseRequest.budget);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageCloseRequest lift(RustBuffer.ByValue byValue) {
        return (PageCloseRequest) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageCloseRequest liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageCloseRequest) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageCloseRequest pageCloseRequest) {
        return lower((Object) pageCloseRequest);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageCloseRequest pageCloseRequest) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageCloseRequest);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageCloseRequest read(ByteBuffer byteBuffer) {
        return new PageCloseRequest(AbstractC7610F5x.A0k(byteBuffer), new PageReference(AbstractC7610F5x.A0z(byteBuffer)), FfiConverterTypeBrowserTaskBinding.INSTANCE.read(byteBuffer), FfiConverterTypeBudget.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageCloseRequest pageCloseRequest, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageCloseRequest, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(pageCloseRequest.operationId, byteBuffer);
        FfiConverterTypePageReference.INSTANCE.write(pageCloseRequest.page, byteBuffer);
        FfiConverterTypeBrowserTaskBinding.INSTANCE.write(pageCloseRequest.task, byteBuffer);
        FfiConverterTypeBudget.INSTANCE.write(pageCloseRequest.budget, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageCloseRequest, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageCloseRequest lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
