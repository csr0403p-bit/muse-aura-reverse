package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeTaskPageGroupControlRevision implements FfiConverterRustBuffer<TaskPageGroupControlRevision> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTaskPageGroupControlRevision INSTANCE = new FfiConverterTypeTaskPageGroupControlRevision();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3545allocationSizeI7RO_PI(TaskPageGroupControlRevision taskPageGroupControlRevision) {
        C7384Etj.A0Y(taskPageGroupControlRevision, 0);
        return 8L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ TaskPageGroupControlRevision lift(RustBuffer.ByValue byValue) {
        return (TaskPageGroupControlRevision) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ TaskPageGroupControlRevision liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (TaskPageGroupControlRevision) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(TaskPageGroupControlRevision taskPageGroupControlRevision) {
        return lower((Object) taskPageGroupControlRevision);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(TaskPageGroupControlRevision taskPageGroupControlRevision) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, taskPageGroupControlRevision);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public TaskPageGroupControlRevision read(ByteBuffer byteBuffer) {
        return new TaskPageGroupControlRevision(AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(TaskPageGroupControlRevision taskPageGroupControlRevision, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(taskPageGroupControlRevision, byteBuffer);
        byteBuffer.putLong(taskPageGroupControlRevision.value);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return 8L;
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

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object read(ByteBuffer byteBuffer) {
        return new TaskPageGroupControlRevision(AbstractC7609F5w.A0N(byteBuffer));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.TaskPageGroupControlRevision, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ TaskPageGroupControlRevision lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
