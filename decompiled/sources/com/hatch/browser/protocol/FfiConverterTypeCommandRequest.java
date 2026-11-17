package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeCommandRequest implements FfiConverterRustBuffer<CommandRequest> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCommandRequest INSTANCE = new FfiConverterTypeCommandRequest();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(CommandRequest commandRequest) {
        return AbstractC7608F5v.A0X(commandRequest).mo3323allocationSizeI7RO_PI(commandRequest.operationId) + FfiConverterTypePageReference.INSTANCE.mo3323allocationSizeI7RO_PI(commandRequest.page) + FfiConverterTypeBrowserTaskBinding.INSTANCE.mo3323allocationSizeI7RO_PI(commandRequest.task) + FfiConverterTypeBudget.INSTANCE.mo3323allocationSizeI7RO_PI(commandRequest.budget) + FfiConverterTypeCommand.INSTANCE.mo3323allocationSizeI7RO_PI(commandRequest.command) + FfiConverterOptionalTypeObserveOptions.INSTANCE.mo3323allocationSizeI7RO_PI(commandRequest.observeAfter);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ CommandRequest lift(RustBuffer.ByValue byValue) {
        return (CommandRequest) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ CommandRequest liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (CommandRequest) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(CommandRequest commandRequest) {
        return lower((Object) commandRequest);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(CommandRequest commandRequest) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, commandRequest);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public CommandRequest read(ByteBuffer byteBuffer) {
        return new CommandRequest(AbstractC7610F5x.A0k(byteBuffer), new PageReference(AbstractC7610F5x.A0z(byteBuffer)), FfiConverterTypeBrowserTaskBinding.INSTANCE.read(byteBuffer), FfiConverterTypeBudget.INSTANCE.read(byteBuffer), FfiConverterTypeCommand.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeObserveOptions.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(CommandRequest commandRequest, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(commandRequest, byteBuffer);
        FfiConverterTypeOperationId.INSTANCE.write(commandRequest.operationId, byteBuffer);
        FfiConverterTypePageReference.INSTANCE.write(commandRequest.page, byteBuffer);
        FfiConverterTypeBrowserTaskBinding.INSTANCE.write(commandRequest.task, byteBuffer);
        FfiConverterTypeBudget.INSTANCE.write(commandRequest.budget, byteBuffer);
        FfiConverterTypeCommand.INSTANCE.write(commandRequest.command, byteBuffer);
        FfiConverterOptionalTypeObserveOptions.INSTANCE.write(commandRequest.observeAfter, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.CommandRequest, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ CommandRequest lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
