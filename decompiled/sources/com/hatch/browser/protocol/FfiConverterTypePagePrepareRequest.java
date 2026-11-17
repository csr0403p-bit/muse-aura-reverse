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
public final class FfiConverterTypePagePrepareRequest implements FfiConverterRustBuffer<PagePrepareRequest> {
    public static final int $stable = 0;
    public static final FfiConverterTypePagePrepareRequest INSTANCE = new FfiConverterTypePagePrepareRequest();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PagePrepareRequest pagePrepareRequest) {
        return AbstractC7608F5v.A0X(pagePrepareRequest).mo3323allocationSizeI7RO_PI(pagePrepareRequest.operationId) + FfiConverterTypePageOwnerScope.INSTANCE.mo3323allocationSizeI7RO_PI(pagePrepareRequest.scope) + FfiConverterTypeBudget.INSTANCE.mo3323allocationSizeI7RO_PI(pagePrepareRequest.budget) + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(pagePrepareRequest.selfFqdn);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PagePrepareRequest lift(RustBuffer.ByValue byValue) {
        return (PagePrepareRequest) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PagePrepareRequest liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PagePrepareRequest) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PagePrepareRequest pagePrepareRequest) {
        return lower((Object) pagePrepareRequest);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PagePrepareRequest pagePrepareRequest) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pagePrepareRequest);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PagePrepareRequest read(ByteBuffer byteBuffer) {
        return new PagePrepareRequest(AbstractC7610F5x.A0k(byteBuffer), FfiConverterTypePageOwnerScope.INSTANCE.read(byteBuffer), FfiConverterTypeBudget.INSTANCE.read(byteBuffer), AbstractC7607F5u.A11(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PagePrepareRequest pagePrepareRequest, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pagePrepareRequest, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(pagePrepareRequest.operationId, byteBuffer);
        FfiConverterTypePageOwnerScope.INSTANCE.write(pagePrepareRequest.scope, byteBuffer);
        FfiConverterTypeBudget.INSTANCE.write(pagePrepareRequest.budget, byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(pagePrepareRequest.selfFqdn, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PagePrepareRequest, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PagePrepareRequest lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
