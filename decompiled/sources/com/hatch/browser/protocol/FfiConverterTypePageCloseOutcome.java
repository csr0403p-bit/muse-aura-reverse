package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.PageCloseOutcome;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageCloseOutcome implements FfiConverterRustBuffer<PageCloseOutcome> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageCloseOutcome INSTANCE = new FfiConverterTypePageCloseOutcome();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageCloseOutcome pageCloseOutcome) {
        FfiConverterTypeFailure ffiConverterTypeFailure;
        Failure failure;
        C7384Etj.A0Y(pageCloseOutcome, 0);
        if ((pageCloseOutcome instanceof PageCloseOutcome.Closed) || (pageCloseOutcome instanceof PageCloseOutcome.Released)) {
            return 4L;
        }
        if (pageCloseOutcome instanceof PageCloseOutcome.NotStarted) {
            ffiConverterTypeFailure = FfiConverterTypeFailure.INSTANCE;
            failure = ((PageCloseOutcome.NotStarted) pageCloseOutcome).failure;
        } else {
            if (!(pageCloseOutcome instanceof PageCloseOutcome.Unknown)) {
                throw C3cG.A0q();
            }
            ffiConverterTypeFailure = FfiConverterTypeFailure.INSTANCE;
            failure = ((PageCloseOutcome.Unknown) pageCloseOutcome).failure;
        }
        return ffiConverterTypeFailure.mo3323allocationSizeI7RO_PI(failure) + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageCloseOutcome lift(RustBuffer.ByValue byValue) {
        return (PageCloseOutcome) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageCloseOutcome liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageCloseOutcome) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageCloseOutcome pageCloseOutcome) {
        return lower((Object) pageCloseOutcome);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageCloseOutcome pageCloseOutcome) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageCloseOutcome);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageCloseOutcome read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return PageCloseOutcome.Closed.INSTANCE;
        }
        if (iA0H == 2) {
            return PageCloseOutcome.Released.INSTANCE;
        }
        if (iA0H == 3) {
            return new PageCloseOutcome.NotStarted(FfiConverterTypeFailure.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 4) {
            return new PageCloseOutcome.Unknown(FfiConverterTypeFailure.INSTANCE.read(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageCloseOutcome pageCloseOutcome, ByteBuffer byteBuffer) {
        FfiConverterTypeFailure ffiConverterTypeFailure;
        Failure failure;
        boolean z = pageCloseOutcome instanceof PageCloseOutcome.Closed;
        int iA1Y = C60P.A1Y(pageCloseOutcome, byteBuffer);
        if (!z) {
            if (!(pageCloseOutcome instanceof PageCloseOutcome.Released)) {
                if (pageCloseOutcome instanceof PageCloseOutcome.NotStarted) {
                    byteBuffer.putInt(3);
                    ffiConverterTypeFailure = FfiConverterTypeFailure.INSTANCE;
                    failure = ((PageCloseOutcome.NotStarted) pageCloseOutcome).failure;
                } else {
                    if (!(pageCloseOutcome instanceof PageCloseOutcome.Unknown)) {
                        throw C3cG.A0q();
                    }
                    byteBuffer.putInt(4);
                    ffiConverterTypeFailure = FfiConverterTypeFailure.INSTANCE;
                    failure = ((PageCloseOutcome.Unknown) pageCloseOutcome).failure;
                }
                ffiConverterTypeFailure.write(failure, byteBuffer);
                return;
            }
            iA1Y = 2;
        }
        byteBuffer.putInt(iA1Y);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageCloseOutcome, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageCloseOutcome lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
