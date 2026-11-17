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
public final class FfiConverterTypePageAuthoritySnapshot implements FfiConverterRustBuffer<PageAuthoritySnapshot> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageAuthoritySnapshot INSTANCE = new FfiConverterTypePageAuthoritySnapshot();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageAuthoritySnapshot pageAuthoritySnapshot) {
        C7384Etj.A0Y(pageAuthoritySnapshot, 0);
        long jMo3323allocationSizeI7RO_PI = FfiConverterTypeBrowserTaskBinding.INSTANCE.mo3323allocationSizeI7RO_PI(pageAuthoritySnapshot.task) + FfiConverterTypeNativePageIdentity.INSTANCE.mo3323allocationSizeI7RO_PI(pageAuthoritySnapshot.nativePage);
        C7384Etj.A0Y(pageAuthoritySnapshot.groupControlRevision, 0);
        C7384Etj.A0Y(pageAuthoritySnapshot.pageAuthorityRevision, 0);
        return jMo3323allocationSizeI7RO_PI + 8 + 8 + 4 + 4;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageAuthoritySnapshot read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new PageAuthoritySnapshot(FfiConverterTypeBrowserTaskBinding.INSTANCE.read(byteBuffer), FfiConverterTypeNativePageIdentity.INSTANCE.read(byteBuffer), new TaskPageGroupControlRevision(byteBuffer.getLong()), new PageAuthorityRevision(byteBuffer.getLong()), FfiConverterTypeTaskPageGroupControlState.INSTANCE.read(byteBuffer), FfiConverterTypeAvailability.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageAuthoritySnapshot lift(RustBuffer.ByValue byValue) {
        return (PageAuthoritySnapshot) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageAuthoritySnapshot liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageAuthoritySnapshot) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageAuthoritySnapshot pageAuthoritySnapshot) {
        return lower((Object) pageAuthoritySnapshot);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageAuthoritySnapshot pageAuthoritySnapshot) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageAuthoritySnapshot);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageAuthoritySnapshot pageAuthoritySnapshot, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageAuthoritySnapshot, byteBuffer);
        FfiConverterTypeBrowserTaskBinding.INSTANCE.write(pageAuthoritySnapshot.task, byteBuffer);
        FfiConverterTypeNativePageIdentity.INSTANCE.write(pageAuthoritySnapshot.nativePage, byteBuffer);
        FfiConverterTypeTaskPageGroupControlRevision.INSTANCE.write(pageAuthoritySnapshot.groupControlRevision, byteBuffer);
        FfiConverterTypePageAuthorityRevision.INSTANCE.write(pageAuthoritySnapshot.pageAuthorityRevision, byteBuffer);
        AbstractC7611F5y.A0q(pageAuthoritySnapshot.control, byteBuffer);
        AbstractC7611F5y.A0q(pageAuthoritySnapshot.availability, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageAuthoritySnapshot, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageAuthoritySnapshot lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
