package com.hatch.browser.protocol;

import X.BV4;
import X.C7384Etj;
import com.hatch.browser.protocol.RustBuffer;
import com.sun.jna.Pointer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes6.dex */
public interface FfiConverter<KotlinType, FfiType> {

    /* renamed from: com.hatch.browser.protocol.FfiConverter$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static Object $default$liftFromRustBuffer(FfiConverter ffiConverter, RustBuffer.ByValue byValue) {
            C7384Etj.A0Y(byValue, 1);
            ByteBuffer byteBufferAsByteBuffer = byValue.asByteBuffer();
            C7384Etj.A0X(byteBufferAsByteBuffer);
            try {
                Object obj = ffiConverter.read(byteBufferAsByteBuffer);
                if (byteBufferAsByteBuffer.hasRemaining()) {
                    throw BV4.A0c("junk remaining in buffer after lifting, something is very wrong!!");
                }
                return obj;
            } finally {
                RustBuffer.Companion.free$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(byValue);
            }
        }

        public static RustBuffer.ByValue $default$lowerIntoRustBuffer(FfiConverter ffiConverter, Object obj) {
            RustBuffer.Companion companion = RustBuffer.Companion;
            RustBuffer.ByValue byValueM3724xff5f08c4 = companion.m3724xff5f08c4(ffiConverter.mo3323allocationSizeI7RO_PI(obj));
            try {
                Pointer pointer = byValueM3724xff5f08c4.data;
                C7384Etj.A0X(pointer);
                ByteBuffer byteBuffer = pointer.getByteBuffer(0L, byValueM3724xff5f08c4.capacity);
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                ffiConverter.write(obj, byteBuffer);
                byValueM3724xff5f08c4.writeField("len", Long.valueOf(byteBuffer.position()));
                return byValueM3724xff5f08c4;
            } catch (Throwable th) {
                companion.free$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(byValueM3724xff5f08c4);
                throw th;
            }
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    long mo3323allocationSizeI7RO_PI(KotlinType kotlintype);

    KotlinType lift(FfiType ffitype);

    KotlinType liftFromRustBuffer(RustBuffer.ByValue byValue);

    FfiType lower(KotlinType kotlintype);

    /* renamed from: lowerIntoRustBuffer */
    RustBuffer.ByValue lower(KotlinType kotlintype);

    KotlinType read(ByteBuffer byteBuffer);

    void write(KotlinType kotlintype, ByteBuffer byteBuffer);

    public abstract class DefaultImpls {
        @Deprecated
        public static <KotlinType, FfiType> KotlinType liftFromRustBuffer(FfiConverter<KotlinType, FfiType> ffiConverter, RustBuffer.ByValue byValue) {
            C7384Etj.A0Y(byValue, 1);
            return (KotlinType) CC.$default$liftFromRustBuffer(ffiConverter, byValue);
        }

        @Deprecated
        public static <KotlinType, FfiType> RustBuffer.ByValue lowerIntoRustBuffer(FfiConverter<KotlinType, FfiType> ffiConverter, KotlinType kotlintype) {
            return CC.$default$lowerIntoRustBuffer(ffiConverter, kotlintype);
        }
    }
}
