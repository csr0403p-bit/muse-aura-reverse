package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.ReceiptRelease;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeReceiptRelease implements FfiConverterRustBuffer<ReceiptRelease> {
    public static final int $stable = 0;
    public static final FfiConverterTypeReceiptRelease INSTANCE = new FfiConverterTypeReceiptRelease();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ReceiptRelease receiptRelease) {
        long jMo3323allocationSizeI7RO_PI;
        C7384Etj.A0Y(receiptRelease, 0);
        if (receiptRelease instanceof ReceiptRelease.Available) {
            jMo3323allocationSizeI7RO_PI = FfiConverterTypeTypedReceipt.INSTANCE.mo3323allocationSizeI7RO_PI(((ReceiptRelease.Available) receiptRelease).receipt);
        } else {
            if (!(receiptRelease instanceof ReceiptRelease.Withheld)) {
                if (receiptRelease instanceof ReceiptRelease.NotProduced) {
                    return 4L;
                }
                throw C3cG.A0q();
            }
            jMo3323allocationSizeI7RO_PI = 4;
        }
        return jMo3323allocationSizeI7RO_PI + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ReceiptRelease lift(RustBuffer.ByValue byValue) {
        return (ReceiptRelease) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ReceiptRelease liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ReceiptRelease) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ReceiptRelease receiptRelease) {
        return lower((Object) receiptRelease);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ReceiptRelease receiptRelease) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, receiptRelease);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ReceiptRelease read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new ReceiptRelease.Available(FfiConverterTypeTypedReceipt.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 2) {
            return new ReceiptRelease.Withheld(FfiConverterTypeReleaseReason.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 3) {
            return ReceiptRelease.NotProduced.INSTANCE;
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ReceiptRelease receiptRelease, ByteBuffer byteBuffer) {
        boolean zA1Y = C60P.A1Y(receiptRelease, byteBuffer);
        if (receiptRelease instanceof ReceiptRelease.Available) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            FfiConverterTypeTypedReceipt.INSTANCE.write(((ReceiptRelease.Available) receiptRelease).receipt, byteBuffer);
        } else if (receiptRelease instanceof ReceiptRelease.Withheld) {
            byteBuffer.putInt(2);
            AbstractC7611F5y.A0q(((ReceiptRelease.Withheld) receiptRelease).reason, byteBuffer);
        } else {
            if (!(receiptRelease instanceof ReceiptRelease.NotProduced)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(3);
        }
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ReceiptRelease, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ReceiptRelease lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
