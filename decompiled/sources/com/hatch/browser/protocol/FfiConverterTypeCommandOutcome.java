package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.CommandOutcome;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeCommandOutcome implements FfiConverterRustBuffer<CommandOutcome> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCommandOutcome INSTANCE = new FfiConverterTypeCommandOutcome();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(CommandOutcome commandOutcome) {
        FfiConverterTypeFailure ffiConverterTypeFailure;
        Failure failure;
        C7384Etj.A0Y(commandOutcome, 0);
        if (commandOutcome instanceof CommandOutcome.Finished) {
            return 4L;
        }
        if (commandOutcome instanceof CommandOutcome.Rejected) {
            ffiConverterTypeFailure = FfiConverterTypeFailure.INSTANCE;
            failure = ((CommandOutcome.Rejected) commandOutcome).failure;
        } else {
            if (!(commandOutcome instanceof CommandOutcome.Interrupted)) {
                throw C3cG.A0q();
            }
            ffiConverterTypeFailure = FfiConverterTypeFailure.INSTANCE;
            failure = ((CommandOutcome.Interrupted) commandOutcome).failure;
        }
        return ffiConverterTypeFailure.mo3323allocationSizeI7RO_PI(failure) + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ CommandOutcome lift(RustBuffer.ByValue byValue) {
        return (CommandOutcome) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ CommandOutcome liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (CommandOutcome) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(CommandOutcome commandOutcome) {
        return lower((Object) commandOutcome);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(CommandOutcome commandOutcome) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, commandOutcome);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public CommandOutcome read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return CommandOutcome.Finished.INSTANCE;
        }
        if (iA0H == 2) {
            return new CommandOutcome.Rejected(FfiConverterTypeFailure.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 3) {
            return new CommandOutcome.Interrupted(FfiConverterTypeFailure.INSTANCE.read(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(CommandOutcome commandOutcome, ByteBuffer byteBuffer) {
        FfiConverterTypeFailure ffiConverterTypeFailure;
        Failure failure;
        boolean zA1Y = C60P.A1Y(commandOutcome, byteBuffer);
        if (commandOutcome instanceof CommandOutcome.Finished) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            return;
        }
        if (commandOutcome instanceof CommandOutcome.Rejected) {
            byteBuffer.putInt(2);
            ffiConverterTypeFailure = FfiConverterTypeFailure.INSTANCE;
            failure = ((CommandOutcome.Rejected) commandOutcome).failure;
        } else {
            if (!(commandOutcome instanceof CommandOutcome.Interrupted)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(3);
            ffiConverterTypeFailure = FfiConverterTypeFailure.INSTANCE;
            failure = ((CommandOutcome.Interrupted) commandOutcome).failure;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.CommandOutcome, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ CommandOutcome lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
