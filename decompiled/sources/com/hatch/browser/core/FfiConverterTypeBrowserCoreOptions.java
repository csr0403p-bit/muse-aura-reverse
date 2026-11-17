package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeBrowserCoreOptions implements FfiConverterRustBuffer<BrowserCoreOptions> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBrowserCoreOptions INSTANCE = new FfiConverterTypeBrowserCoreOptions();

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3228allocationSizeI7RO_PI(BrowserCoreOptions browserCoreOptions) {
        C7384Etj.A0Y(browserCoreOptions, 0);
        return 2 + AbstractC7610F5x.A0X(browserCoreOptions.nativeControls) + AbstractC7610F5x.A0X(browserCoreOptions.pageCloser) + AbstractC7610F5x.A0X(browserCoreOptions.pdf) + AbstractC7610F5x.A0X(browserCoreOptions.files) + AbstractC7610F5x.A0X(browserCoreOptions.downloads) + AbstractC7610F5x.A0X(browserCoreOptions.blocklist);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public BrowserCoreOptions read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new BrowserCoreOptions(AnonymousClass002.A1L(byteBuffer.get()), AnonymousClass002.A1L(byteBuffer.get()), FfiConverterOptionalTypeBrowserHostNativeControls.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeBrowserHostPageClose.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeBrowserHostPdf.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeBrowserHostFiles.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeBrowserHostDownloads.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeBrowserHostBlocklist.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ BrowserCoreOptions lift(RustBuffer.ByValue byValue) {
        return (BrowserCoreOptions) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserCoreOptions liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserCoreOptions) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(BrowserCoreOptions browserCoreOptions) {
        return lower((Object) browserCoreOptions);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(BrowserCoreOptions browserCoreOptions) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserCoreOptions);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserCoreOptions browserCoreOptions, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(browserCoreOptions, byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(browserCoreOptions.closedSelect, byteBuffer);
        ffiConverterBoolean.write(browserCoreOptions.nativeControlFill, byteBuffer);
        FfiConverterOptionalTypeBrowserHostNativeControls.INSTANCE.write(browserCoreOptions.nativeControls, byteBuffer);
        FfiConverterOptionalTypeBrowserHostPageClose.INSTANCE.write(browserCoreOptions.pageCloser, byteBuffer);
        FfiConverterOptionalTypeBrowserHostPdf.INSTANCE.write(browserCoreOptions.pdf, byteBuffer);
        FfiConverterOptionalTypeBrowserHostFiles.INSTANCE.write(browserCoreOptions.files, byteBuffer);
        FfiConverterOptionalTypeBrowserHostDownloads.INSTANCE.write(browserCoreOptions.downloads, byteBuffer);
        FfiConverterOptionalTypeBrowserHostBlocklist.INSTANCE.write(browserCoreOptions.blocklist, byteBuffer);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserCoreOptions, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ BrowserCoreOptions lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }
}
