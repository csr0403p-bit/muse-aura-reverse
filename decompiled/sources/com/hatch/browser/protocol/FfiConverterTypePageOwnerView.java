package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageOwnerView implements FfiConverterRustBuffer<PageOwnerView> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageOwnerView INSTANCE = new FfiConverterTypePageOwnerView();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageOwnerView pageOwnerView) {
        long jA0M = AbstractC7609F5w.A0M(AbstractC7609F5w.A0M(AbstractC7608F5v.A0W(pageOwnerView).mo3323allocationSizeI7RO_PI(pageOwnerView.browserInstanceId) + 8, FfiConverterTypeBrowserTaskBinding.INSTANCE.mo3323allocationSizeI7RO_PI(pageOwnerView.task)), FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(pageOwnerView.browserContextId)) + 8;
        FfiConverterSequenceTypeNativePageIdentity ffiConverterSequenceTypeNativePageIdentity = FfiConverterSequenceTypeNativePageIdentity.INSTANCE;
        return jA0M + ffiConverterSequenceTypeNativePageIdentity.mo3323allocationSizeI7RO_PI(pageOwnerView.ownedTargets) + ffiConverterSequenceTypeNativePageIdentity.mo3323allocationSizeI7RO_PI(pageOwnerView.readyTargets) + FfiConverterOptionalTypeNativePageIdentity.INSTANCE.mo3323allocationSizeI7RO_PI(pageOwnerView.selectedTarget);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageOwnerView lift(RustBuffer.ByValue byValue) {
        return (PageOwnerView) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageOwnerView liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageOwnerView) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageOwnerView pageOwnerView) {
        return lower((Object) pageOwnerView);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageOwnerView pageOwnerView) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageOwnerView);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageOwnerView read(ByteBuffer byteBuffer) {
        String strA0z = AbstractC7610F5x.A0z(byteBuffer);
        long j = byteBuffer.getLong();
        BrowserTaskBinding browserTaskBinding = FfiConverterTypeBrowserTaskBinding.INSTANCE.read(byteBuffer);
        PageStorageMode pageStorageMode = FfiConverterTypePageStorageMode.INSTANCE.read(byteBuffer);
        String strA11 = AbstractC7607F5u.A11(byteBuffer);
        TaskPageGroupControlState taskPageGroupControlState = FfiConverterTypeTaskPageGroupControlState.INSTANCE.read(byteBuffer);
        long j2 = byteBuffer.getLong();
        FfiConverterSequenceTypeNativePageIdentity ffiConverterSequenceTypeNativePageIdentity = FfiConverterSequenceTypeNativePageIdentity.INSTANCE;
        return new PageOwnerView(strA0z, j, browserTaskBinding, pageStorageMode, strA11, taskPageGroupControlState, j2, ffiConverterSequenceTypeNativePageIdentity.read(byteBuffer), ffiConverterSequenceTypeNativePageIdentity.read(byteBuffer), FfiConverterOptionalTypeNativePageIdentity.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageOwnerView pageOwnerView, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageOwnerView, byteBuffer);
        FfiConverterString.INSTANCE.write(pageOwnerView.browserInstanceId, byteBuffer);
        byteBuffer.putLong(pageOwnerView.generation);
        FfiConverterTypeBrowserTaskBinding.INSTANCE.write(pageOwnerView.task, byteBuffer);
        AbstractC7611F5y.A0q(pageOwnerView.storageMode, byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(pageOwnerView.browserContextId, byteBuffer);
        AbstractC7611F5y.A0q(pageOwnerView.control, byteBuffer);
        byteBuffer.putLong(pageOwnerView.controlRevision);
        FfiConverterSequenceTypeNativePageIdentity ffiConverterSequenceTypeNativePageIdentity = FfiConverterSequenceTypeNativePageIdentity.INSTANCE;
        ffiConverterSequenceTypeNativePageIdentity.write(pageOwnerView.ownedTargets, byteBuffer);
        ffiConverterSequenceTypeNativePageIdentity.write(pageOwnerView.readyTargets, byteBuffer);
        FfiConverterOptionalTypeNativePageIdentity.INSTANCE.write(pageOwnerView.selectedTarget, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageOwnerView, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageOwnerView lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
