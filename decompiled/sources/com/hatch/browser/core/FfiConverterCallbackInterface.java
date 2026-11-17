package com.hatch.browser.core;

import X.F60;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public abstract class FfiConverterCallbackInterface<CallbackInterface> implements FfiConverter<CallbackInterface, Long> {
    public static final int $stable = 8;
    public final UniffiHandleMap<CallbackInterface> handleMap;

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public abstract long mo3228allocationSizeI7RO_PI(CallbackInterface callbackinterface);

    public abstract void drop$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(long j);

    public abstract UniffiHandleMap<CallbackInterface> getHandleMap$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk();

    public abstract CallbackInterface lift(long j);

    @Override // com.hatch.browser.core.FfiConverter
    public abstract /* bridge */ /* synthetic */ Object lift(Long l);

    @Override // com.hatch.browser.core.FfiConverter
    public abstract /* bridge */ CallbackInterface liftFromRustBuffer(RustBuffer.ByValue byValue);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public abstract Long lower(CallbackInterface callbackinterface);

    @Override // com.hatch.browser.core.FfiConverter
    public abstract /* bridge */ /* synthetic */ Long lower(Object obj);

    @Override // com.hatch.browser.core.FfiConverter
    public abstract /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(CallbackInterface callbackinterface);

    @Override // com.hatch.browser.core.FfiConverter
    public abstract CallbackInterface read(ByteBuffer byteBuffer);

    @Override // com.hatch.browser.core.FfiConverter
    public abstract void write(CallbackInterface callbackinterface, ByteBuffer byteBuffer);

    public FfiConverterCallbackInterface() {
        throw F60.createAndThrow();
    }
}
