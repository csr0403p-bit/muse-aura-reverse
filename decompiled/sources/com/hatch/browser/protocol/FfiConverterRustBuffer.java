package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;

/* loaded from: classes6.dex */
public interface FfiConverterRustBuffer<KotlinType> extends FfiConverter<KotlinType, RustBuffer.ByValue> {

    /* renamed from: com.hatch.browser.protocol.FfiConverterRustBuffer$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
    }

    KotlinType lift(RustBuffer.ByValue byValue);

    @Override // com.hatch.browser.protocol.FfiConverter
    RustBuffer.ByValue lower(KotlinType kotlintype);

    public abstract class DefaultImpls {
        @Deprecated
        public static <KotlinType> KotlinType liftFromRustBuffer(FfiConverterRustBuffer<KotlinType> ffiConverterRustBuffer, RustBuffer.ByValue byValue) {
            C7384Etj.A0Y(byValue, 1);
            return (KotlinType) FfiConverter.CC.$default$liftFromRustBuffer(ffiConverterRustBuffer, byValue);
        }

        @Deprecated
        public static <KotlinType> KotlinType lift(FfiConverterRustBuffer<KotlinType> ffiConverterRustBuffer, RustBuffer.ByValue byValue) {
            return (KotlinType) AbstractC7609F5w.A0q(ffiConverterRustBuffer, byValue);
        }

        @Deprecated
        public static <KotlinType> RustBuffer.ByValue lower(FfiConverterRustBuffer<KotlinType> ffiConverterRustBuffer, KotlinType kotlintype) {
            return ffiConverterRustBuffer.lower(kotlintype);
        }

        @Deprecated
        public static <KotlinType> RustBuffer.ByValue lowerIntoRustBuffer(FfiConverterRustBuffer<KotlinType> ffiConverterRustBuffer, KotlinType kotlintype) {
            return FfiConverter.CC.$default$lowerIntoRustBuffer(ffiConverterRustBuffer, kotlintype);
        }
    }
}
