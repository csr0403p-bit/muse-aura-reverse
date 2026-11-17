package com.hatch.browser.core;

import X.AbstractC07127nr;
import X.AbstractC7607F5u;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.protocol.FfiConverterTypeNativeDownloadPublishRequest;
import com.hatch.browser.protocol.NativeDownloadPublishRequest;
import com.hatch.browser.protocol.RustBuffer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostDownloads$publish$callback$makeCall$1", f = "hatch_browser_core_uniffi.kt", l = {4261}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class uniffiCallbackInterfaceBrowserHostDownloads$publish$callback$makeCall$1 extends AbstractC07127nr implements G0U<HtJ<? super NativeDownloadPublishResult>, Object> {
    public final /* synthetic */ RustBuffer.ByValue $bytes;
    public final /* synthetic */ RustBuffer.ByValue $request;
    public final /* synthetic */ BrowserHostDownloads $uniffiObj;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceBrowserHostDownloads$publish$callback$makeCall$1(BrowserHostDownloads browserHostDownloads, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, HtJ<? super uniffiCallbackInterfaceBrowserHostDownloads$publish$callback$makeCall$1> htJ) {
        super(1, htJ);
        this.$uniffiObj = browserHostDownloads;
        this.$request = byValue;
        this.$bytes = byValue2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new uniffiCallbackInterfaceBrowserHostDownloads$publish$callback$makeCall$1(this.$uniffiObj, this.$request, this.$bytes, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            BrowserHostDownloads browserHostDownloads = this.$uniffiObj;
            NativeDownloadPublishRequest nativeDownloadPublishRequest = (NativeDownloadPublishRequest) FfiConverterTypeNativeDownloadPublishRequest.INSTANCE.lift(this.$request);
            byte[] bArrA1Y = AbstractC7607F5u.A1Y(FfiConverterByteArray.INSTANCE, this.$bytes);
            this.label = 1;
            obj = browserHostDownloads.publish(nativeDownloadPublishRequest, bArrA1Y, this);
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
    public final Object invoke(HtJ<? super NativeDownloadPublishResult> htJ) {
        return ((uniffiCallbackInterfaceBrowserHostDownloads$publish$callback$makeCall$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
