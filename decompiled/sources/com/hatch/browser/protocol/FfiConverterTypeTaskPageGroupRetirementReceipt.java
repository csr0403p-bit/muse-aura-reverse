package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeTaskPageGroupRetirementReceipt implements FfiConverterRustBuffer<TaskPageGroupRetirementReceipt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTaskPageGroupRetirementReceipt INSTANCE = new FfiConverterTypeTaskPageGroupRetirementReceipt();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(TaskPageGroupRetirementReceipt taskPageGroupRetirementReceipt) {
        C7384Etj.A0Y(taskPageGroupRetirementReceipt, 0);
        return FfiConverterTypeBrowserTaskBinding.INSTANCE.mo3323allocationSizeI7RO_PI(taskPageGroupRetirementReceipt.task) + 1 + 1;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public TaskPageGroupRetirementReceipt read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        BrowserTaskBinding browserTaskBinding = FfiConverterTypeBrowserTaskBinding.INSTANCE.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new TaskPageGroupRetirementReceipt(browserTaskBinding, AbstractC7610F5x.A1V(ffiConverterBoolean, byteBuffer), AbstractC7610F5x.A1V(ffiConverterBoolean, byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ TaskPageGroupRetirementReceipt lift(RustBuffer.ByValue byValue) {
        return (TaskPageGroupRetirementReceipt) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ TaskPageGroupRetirementReceipt liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (TaskPageGroupRetirementReceipt) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(TaskPageGroupRetirementReceipt taskPageGroupRetirementReceipt) {
        return lower((Object) taskPageGroupRetirementReceipt);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(TaskPageGroupRetirementReceipt taskPageGroupRetirementReceipt) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, taskPageGroupRetirementReceipt);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(TaskPageGroupRetirementReceipt taskPageGroupRetirementReceipt, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(taskPageGroupRetirementReceipt, byteBuffer);
        FfiConverterTypeBrowserTaskBinding.INSTANCE.write(taskPageGroupRetirementReceipt.task, byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(taskPageGroupRetirementReceipt.retired, byteBuffer);
        ffiConverterBoolean.write(taskPageGroupRetirementReceipt.settled, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.TaskPageGroupRetirementReceipt, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ TaskPageGroupRetirementReceipt lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
