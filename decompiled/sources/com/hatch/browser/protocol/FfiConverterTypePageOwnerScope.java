package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageOwnerScope implements FfiConverterRustBuffer<PageOwnerScope> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageOwnerScope INSTANCE = new FfiConverterTypePageOwnerScope();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageOwnerScope pageOwnerScope) {
        C7384Etj.A0Y(pageOwnerScope, 0);
        return AbstractC7609F5w.A0M(FfiConverterTypeBrowserTaskBinding.INSTANCE.mo3323allocationSizeI7RO_PI(pageOwnerScope.task) + FfiConverterTypeNativePageIdentity.INSTANCE.mo3323allocationSizeI7RO_PI(pageOwnerScope.nativePage), 8L) + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(pageOwnerScope.browserContextId);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageOwnerScope read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new PageOwnerScope(FfiConverterTypeBrowserTaskBinding.INSTANCE.read(byteBuffer), FfiConverterTypeNativePageIdentity.INSTANCE.read(byteBuffer), byteBuffer.getLong(), FfiConverterTypePageStorageMode.INSTANCE.read(byteBuffer), AbstractC7607F5u.A11(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageOwnerScope lift(RustBuffer.ByValue byValue) {
        return (PageOwnerScope) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageOwnerScope liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageOwnerScope) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageOwnerScope pageOwnerScope) {
        return lower((Object) pageOwnerScope);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageOwnerScope pageOwnerScope) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageOwnerScope);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageOwnerScope pageOwnerScope, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageOwnerScope, byteBuffer);
        FfiConverterTypeBrowserTaskBinding.INSTANCE.write(pageOwnerScope.task, byteBuffer);
        FfiConverterTypeNativePageIdentity.INSTANCE.write(pageOwnerScope.nativePage, byteBuffer);
        byteBuffer.putLong(pageOwnerScope.generation);
        AbstractC7611F5y.A0q(pageOwnerScope.storageMode, byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(pageOwnerScope.browserContextId, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageOwnerScope, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageOwnerScope lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
