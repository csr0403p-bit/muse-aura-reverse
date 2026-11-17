package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeTaskPageGroupRetirement implements FfiConverter<TaskPageGroupRetirement, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTaskPageGroupRetirement INSTANCE = new FfiConverterTypeTaskPageGroupRetirement();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(TaskPageGroupRetirement taskPageGroupRetirement) {
        C7384Etj.A0Y(taskPageGroupRetirement, 0);
        return Long.valueOf(taskPageGroupRetirement.uniffiCloneHandle());
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3272allocationSizeI7RO_PI(TaskPageGroupRetirement taskPageGroupRetirement) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ TaskPageGroupRetirement lift(Long l) {
        return new TaskPageGroupRetirement(UniffiWithHandle.INSTANCE, C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ TaskPageGroupRetirement liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (TaskPageGroupRetirement) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(TaskPageGroupRetirement taskPageGroupRetirement) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, taskPageGroupRetirement);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public TaskPageGroupRetirement read(ByteBuffer byteBuffer) {
        return new TaskPageGroupRetirement(UniffiWithHandle.INSTANCE, AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(TaskPageGroupRetirement taskPageGroupRetirement, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(taskPageGroupRetirement, byteBuffer);
        byteBuffer.putLong(taskPageGroupRetirement.uniffiCloneHandle());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(TaskPageGroupRetirement taskPageGroupRetirement) {
        return 8L;
    }

    public TaskPageGroupRetirement lift(long j) {
        return new TaskPageGroupRetirement(UniffiWithHandle.INSTANCE, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.TaskPageGroupRetirement, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ TaskPageGroupRetirement liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(TaskPageGroupRetirement taskPageGroupRetirement) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, taskPageGroupRetirement);
    }
}
