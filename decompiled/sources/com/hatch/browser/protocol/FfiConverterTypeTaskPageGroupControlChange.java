package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeTaskPageGroupControlChange implements FfiConverterRustBuffer<TaskPageGroupControlChange> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTaskPageGroupControlChange INSTANCE = new FfiConverterTypeTaskPageGroupControlChange();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(TaskPageGroupControlChange taskPageGroupControlChange) {
        C7384Etj.A0Y(taskPageGroupControlChange, 0);
        C7384Etj.A0Y(taskPageGroupControlChange.revision, 0);
        return 12L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ TaskPageGroupControlChange lift(RustBuffer.ByValue byValue) {
        return (TaskPageGroupControlChange) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ TaskPageGroupControlChange liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (TaskPageGroupControlChange) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(TaskPageGroupControlChange taskPageGroupControlChange) {
        return lower((Object) taskPageGroupControlChange);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(TaskPageGroupControlChange taskPageGroupControlChange) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, taskPageGroupControlChange);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public TaskPageGroupControlChange read(ByteBuffer byteBuffer) {
        return new TaskPageGroupControlChange(new TaskPageGroupControlRevision(AbstractC7609F5w.A0N(byteBuffer)), FfiConverterTypeTaskPageGroupControlState.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(TaskPageGroupControlChange taskPageGroupControlChange, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(taskPageGroupControlChange, byteBuffer);
        FfiConverterTypeTaskPageGroupControlRevision.INSTANCE.write(taskPageGroupControlChange.revision, byteBuffer);
        AbstractC7611F5y.A0q(taskPageGroupControlChange.control, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.TaskPageGroupControlChange, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ TaskPageGroupControlChange lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
