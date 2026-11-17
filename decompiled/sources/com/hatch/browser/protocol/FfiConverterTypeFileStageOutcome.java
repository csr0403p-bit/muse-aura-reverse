package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.FileStageOutcome;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeFileStageOutcome implements FfiConverterRustBuffer<FileStageOutcome> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFileStageOutcome INSTANCE = new FfiConverterTypeFileStageOutcome();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(FileStageOutcome fileStageOutcome) {
        long jMo3323allocationSizeI7RO_PI;
        C7384Etj.A0Y(fileStageOutcome, 0);
        if (fileStageOutcome instanceof FileStageOutcome.Paths) {
            jMo3323allocationSizeI7RO_PI = FfiConverterSequenceString.INSTANCE.mo3323allocationSizeI7RO_PI(((FileStageOutcome.Paths) fileStageOutcome).paths);
        } else {
            if (fileStageOutcome instanceof FileStageOutcome.Bytes) {
                return 4L;
            }
            if (!(fileStageOutcome instanceof FileStageOutcome.NotStarted)) {
                throw C3cG.A0q();
            }
            jMo3323allocationSizeI7RO_PI = FfiConverterTypeFailure.INSTANCE.mo3323allocationSizeI7RO_PI(((FileStageOutcome.NotStarted) fileStageOutcome).failure);
        }
        return jMo3323allocationSizeI7RO_PI + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ FileStageOutcome lift(RustBuffer.ByValue byValue) {
        return (FileStageOutcome) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ FileStageOutcome liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (FileStageOutcome) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(FileStageOutcome fileStageOutcome) {
        return lower((Object) fileStageOutcome);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(FileStageOutcome fileStageOutcome) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, fileStageOutcome);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public FileStageOutcome read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new FileStageOutcome.Paths(FfiConverterSequenceString.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 2) {
            return FileStageOutcome.Bytes.INSTANCE;
        }
        if (iA0H == 3) {
            return new FileStageOutcome.NotStarted(FfiConverterTypeFailure.INSTANCE.read(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(FileStageOutcome fileStageOutcome, ByteBuffer byteBuffer) {
        boolean zA1Y = C60P.A1Y(fileStageOutcome, byteBuffer);
        if (fileStageOutcome instanceof FileStageOutcome.Paths) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            FfiConverterSequenceString.INSTANCE.write(((FileStageOutcome.Paths) fileStageOutcome).paths, byteBuffer);
        } else if (fileStageOutcome instanceof FileStageOutcome.Bytes) {
            byteBuffer.putInt(2);
        } else {
            if (!(fileStageOutcome instanceof FileStageOutcome.NotStarted)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(3);
            FfiConverterTypeFailure.INSTANCE.write(((FileStageOutcome.NotStarted) fileStageOutcome).failure, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.FileStageOutcome, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ FileStageOutcome lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
