package com.hatch.browser.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.hatch.browser.protocol.FfiConverterTypeNativeFileReadRequest;
import com.hatch.browser.protocol.NativeFileReadRequest;
import com.hatch.browser.protocol.RustBuffer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostFiles$read$callback$makeCall$1", f = "hatch_browser_core_uniffi.kt", l = {4717}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class uniffiCallbackInterfaceBrowserHostFiles$read$callback$makeCall$1 extends AbstractC07127nr implements G0U<HtJ<? super NativeFileReadResult>, Object> {
    public final /* synthetic */ RustBuffer.ByValue $request;
    public final /* synthetic */ BrowserHostFiles $uniffiObj;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceBrowserHostFiles$read$callback$makeCall$1(BrowserHostFiles browserHostFiles, RustBuffer.ByValue byValue, HtJ<? super uniffiCallbackInterfaceBrowserHostFiles$read$callback$makeCall$1> htJ) {
        super(1, htJ);
        this.$uniffiObj = browserHostFiles;
        this.$request = byValue;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new uniffiCallbackInterfaceBrowserHostFiles$read$callback$makeCall$1(this.$uniffiObj, this.$request, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            BrowserHostFiles browserHostFiles = this.$uniffiObj;
            NativeFileReadRequest nativeFileReadRequest = (NativeFileReadRequest) FfiConverterTypeNativeFileReadRequest.INSTANCE.lift(this.$request);
            this.label = 1;
            obj = browserHostFiles.read(nativeFileReadRequest, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super NativeFileReadResult> htJ) {
        return ((uniffiCallbackInterfaceBrowserHostFiles$read$callback$makeCall$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
