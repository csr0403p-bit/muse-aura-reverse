package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.CancelAck;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeCancelAck implements FfiConverterRustBuffer<CancelAck> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCancelAck INSTANCE = new FfiConverterTypeCancelAck();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(CancelAck cancelAck) {
        FfiConverterTypeOperationId ffiConverterTypeOperationId;
        OperationId operationId;
        C7384Etj.A0Y(cancelAck, 0);
        if (cancelAck instanceof CancelAck.Fenced) {
            ffiConverterTypeOperationId = FfiConverterTypeOperationId.INSTANCE;
            operationId = ((CancelAck.Fenced) cancelAck).operationId;
        } else {
            if (!(cancelAck instanceof CancelAck.NoActiveOperation)) {
                throw C3cG.A0q();
            }
            ffiConverterTypeOperationId = FfiConverterTypeOperationId.INSTANCE;
            operationId = ((CancelAck.NoActiveOperation) cancelAck).operationId;
        }
        return ffiConverterTypeOperationId.mo3323allocationSizeI7RO_PI(operationId) + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ CancelAck lift(RustBuffer.ByValue byValue) {
        return (CancelAck) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ CancelAck liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (CancelAck) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(CancelAck cancelAck) {
        return lower((Object) cancelAck);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(CancelAck cancelAck) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, cancelAck);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public CancelAck read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new CancelAck.Fenced(new OperationId(AbstractC7610F5x.A0z(byteBuffer)));
        }
        if (iA0H == 2) {
            return new CancelAck.NoActiveOperation(new OperationId(AbstractC7610F5x.A0z(byteBuffer)));
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(CancelAck cancelAck, ByteBuffer byteBuffer) {
        FfiConverterTypeOperationId ffiConverterTypeOperationId;
        OperationId operationId;
        boolean zA1Y = C60P.A1Y(cancelAck, byteBuffer);
        if (cancelAck instanceof CancelAck.Fenced) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            ffiConverterTypeOperationId = FfiConverterTypeOperationId.INSTANCE;
            operationId = ((CancelAck.Fenced) cancelAck).operationId;
        } else {
            if (!(cancelAck instanceof CancelAck.NoActiveOperation)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(2);
            ffiConverterTypeOperationId = FfiConverterTypeOperationId.INSTANCE;
            operationId = ((CancelAck.NoActiveOperation) cancelAck).operationId;
        }
        ffiConverterTypeOperationId.write(operationId, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.CancelAck, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ CancelAck lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
