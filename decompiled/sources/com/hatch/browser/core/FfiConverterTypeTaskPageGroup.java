package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeTaskPageGroup implements FfiConverter<TaskPageGroup, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTaskPageGroup INSTANCE = new FfiConverterTypeTaskPageGroup();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(TaskPageGroup taskPageGroup) {
        C7384Etj.A0Y(taskPageGroup, 0);
        return Long.valueOf(taskPageGroup.uniffiCloneHandle());
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3271allocationSizeI7RO_PI(TaskPageGroup taskPageGroup) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ TaskPageGroup lift(Long l) {
        return new TaskPageGroup(UniffiWithHandle.INSTANCE, C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ TaskPageGroup liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (TaskPageGroup) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(TaskPageGroup taskPageGroup) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, taskPageGroup);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public TaskPageGroup read(ByteBuffer byteBuffer) {
        return new TaskPageGroup(UniffiWithHandle.INSTANCE, AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(TaskPageGroup taskPageGroup, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(taskPageGroup, byteBuffer);
        byteBuffer.putLong(taskPageGroup.uniffiCloneHandle());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(TaskPageGroup taskPageGroup) {
        return 8L;
    }

    public TaskPageGroup lift(long j) {
        return new TaskPageGroup(UniffiWithHandle.INSTANCE, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.TaskPageGroup, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ TaskPageGroup liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(TaskPageGroup taskPageGroup) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, taskPageGroup);
    }
}
