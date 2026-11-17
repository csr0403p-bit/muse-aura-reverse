package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.DownloadPublishOutcome;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeDownloadPublishOutcome implements FfiConverterRustBuffer<DownloadPublishOutcome> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDownloadPublishOutcome INSTANCE = new FfiConverterTypeDownloadPublishOutcome();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(DownloadPublishOutcome downloadPublishOutcome) {
        FfiConverterTypeFailure ffiConverterTypeFailure;
        Failure failure;
        C7384Etj.A0Y(downloadPublishOutcome, 0);
        if (downloadPublishOutcome instanceof DownloadPublishOutcome.NotStarted) {
            ffiConverterTypeFailure = FfiConverterTypeFailure.INSTANCE;
            failure = ((DownloadPublishOutcome.NotStarted) downloadPublishOutcome).failure;
        } else {
            if (downloadPublishOutcome instanceof DownloadPublishOutcome.Published) {
                return AbstractC7607F5u.A0R(FfiConverterString.INSTANCE, ((DownloadPublishOutcome.Published) downloadPublishOutcome).sha256, 12L);
            }
            if (!(downloadPublishOutcome instanceof DownloadPublishOutcome.Unknown)) {
                throw C3cG.A0q();
            }
            ffiConverterTypeFailure = FfiConverterTypeFailure.INSTANCE;
            failure = ((DownloadPublishOutcome.Unknown) downloadPublishOutcome).failure;
        }
        return ffiConverterTypeFailure.mo3323allocationSizeI7RO_PI(failure) + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ DownloadPublishOutcome lift(RustBuffer.ByValue byValue) {
        return (DownloadPublishOutcome) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ DownloadPublishOutcome liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (DownloadPublishOutcome) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(DownloadPublishOutcome downloadPublishOutcome) {
        return lower((Object) downloadPublishOutcome);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(DownloadPublishOutcome downloadPublishOutcome) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, downloadPublishOutcome);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public DownloadPublishOutcome read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new DownloadPublishOutcome.NotStarted(FfiConverterTypeFailure.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 2) {
            return new DownloadPublishOutcome.Published(byteBuffer.getLong(), AbstractC7607F5u.A12(byteBuffer));
        }
        if (iA0H == 3) {
            return new DownloadPublishOutcome.Unknown(FfiConverterTypeFailure.INSTANCE.read(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(DownloadPublishOutcome downloadPublishOutcome, ByteBuffer byteBuffer) {
        FfiConverterTypeFailure ffiConverterTypeFailure;
        Failure failure;
        boolean zA1Y = C60P.A1Y(downloadPublishOutcome, byteBuffer);
        if (downloadPublishOutcome instanceof DownloadPublishOutcome.NotStarted) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            ffiConverterTypeFailure = FfiConverterTypeFailure.INSTANCE;
            failure = ((DownloadPublishOutcome.NotStarted) downloadPublishOutcome).failure;
        } else {
            if (downloadPublishOutcome instanceof DownloadPublishOutcome.Published) {
                byteBuffer.putInt(2);
                DownloadPublishOutcome.Published published = (DownloadPublishOutcome.Published) downloadPublishOutcome;
                byteBuffer.putLong(published.bytes);
                FfiConverterString.INSTANCE.write(published.sha256, byteBuffer);
                return;
            }
            if (!(downloadPublishOutcome instanceof DownloadPublishOutcome.Unknown)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(3);
            ffiConverterTypeFailure = FfiConverterTypeFailure.INSTANCE;
            failure = ((DownloadPublishOutcome.Unknown) downloadPublishOutcome).failure;
        }
        ffiConverterTypeFailure.write(failure, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.DownloadPublishOutcome, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ DownloadPublishOutcome lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
