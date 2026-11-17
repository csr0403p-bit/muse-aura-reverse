package com.hatch.browser.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.hatch.browser.protocol.Access;
import com.hatch.browser.protocol.FfiConverterTypeAccess;
import com.hatch.browser.protocol.FfiConverterTypePageAuthorityClaim;
import com.hatch.browser.protocol.PageAuthorityClaim;
import com.hatch.browser.protocol.RustBuffer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostAuthority$authorize$callback$makeCall$1", f = "hatch_browser_core_uniffi.kt", l = {3539}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class uniffiCallbackInterfaceBrowserHostAuthority$authorize$callback$makeCall$1 extends AbstractC07127nr implements G0U<HtJ<? super NativePageAuthorityDecision>, Object> {
    public final /* synthetic */ RustBuffer.ByValue $access;
    public final /* synthetic */ RustBuffer.ByValue $claim;
    public final /* synthetic */ BrowserHostAuthority $uniffiObj;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceBrowserHostAuthority$authorize$callback$makeCall$1(BrowserHostAuthority browserHostAuthority, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, HtJ<? super uniffiCallbackInterfaceBrowserHostAuthority$authorize$callback$makeCall$1> htJ) {
        super(1, htJ);
        this.$uniffiObj = browserHostAuthority;
        this.$claim = byValue;
        this.$access = byValue2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new uniffiCallbackInterfaceBrowserHostAuthority$authorize$callback$makeCall$1(this.$uniffiObj, this.$claim, this.$access, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            BrowserHostAuthority browserHostAuthority = this.$uniffiObj;
            PageAuthorityClaim pageAuthorityClaim = (PageAuthorityClaim) FfiConverterTypePageAuthorityClaim.INSTANCE.lift(this.$claim);
            Access access = (Access) FfiConverterTypeAccess.INSTANCE.lift(this.$access);
            this.label = 1;
            obj = browserHostAuthority.authorize(pageAuthorityClaim, access, this);
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
    public final Object invoke(HtJ<? super NativePageAuthorityDecision> htJ) {
        return ((uniffiCallbackInterfaceBrowserHostAuthority$authorize$callback$makeCall$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
