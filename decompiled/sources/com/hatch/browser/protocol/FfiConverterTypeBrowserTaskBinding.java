package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeBrowserTaskBinding implements FfiConverterRustBuffer<BrowserTaskBinding> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBrowserTaskBinding INSTANCE = new FfiConverterTypeBrowserTaskBinding();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(BrowserTaskBinding browserTaskBinding) {
        C7384Etj.A0Y(browserTaskBinding, 0);
        return FfiConverterTypeBrowserTaskId.INSTANCE.mo3323allocationSizeI7RO_PI(browserTaskBinding.browserTaskId) + FfiConverterTypeBindingId.INSTANCE.mo3323allocationSizeI7RO_PI(browserTaskBinding.bindingId);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public BrowserTaskBinding read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new BrowserTaskBinding(new BrowserTaskId(AbstractC7610F5x.A0z(byteBuffer)), new BindingId(AbstractC7610F5x.A0z(byteBuffer)));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ BrowserTaskBinding lift(RustBuffer.ByValue byValue) {
        return (BrowserTaskBinding) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ BrowserTaskBinding liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserTaskBinding) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(BrowserTaskBinding browserTaskBinding) {
        return lower((Object) browserTaskBinding);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(BrowserTaskBinding browserTaskBinding) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserTaskBinding);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(BrowserTaskBinding browserTaskBinding, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(browserTaskBinding, byteBuffer);
        FfiConverterTypeBrowserTaskId.INSTANCE.write(browserTaskBinding.browserTaskId, byteBuffer);
        FfiConverterTypeBindingId.INSTANCE.write(browserTaskBinding.bindingId, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.BrowserTaskBinding, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ BrowserTaskBinding lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
