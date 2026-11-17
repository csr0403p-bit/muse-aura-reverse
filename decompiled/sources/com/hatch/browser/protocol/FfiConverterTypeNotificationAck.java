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
public final class FfiConverterTypeNotificationAck implements FfiConverterRustBuffer<NotificationAck> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNotificationAck INSTANCE = new FfiConverterTypeNotificationAck();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3472allocationSizeI7RO_PI(NotificationAck notificationAck) {
        C7384Etj.A0Y(notificationAck, 0);
        return 12L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ NotificationAck lift(RustBuffer.ByValue byValue) {
        return (NotificationAck) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ NotificationAck liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NotificationAck) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NotificationAck notificationAck) {
        return lower((Object) notificationAck);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NotificationAck notificationAck) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, notificationAck);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public NotificationAck read(ByteBuffer byteBuffer) {
        return new NotificationAck(AbstractC7609F5w.A0N(byteBuffer), FfiConverterTypeNotificationStatus.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(NotificationAck notificationAck, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(notificationAck, byteBuffer);
        byteBuffer.putLong(notificationAck.appliedRevision);
        AbstractC7611F5y.A0q(notificationAck.status, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return 12L;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.NotificationAck, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NotificationAck lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
