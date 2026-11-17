package com.hatch.browser.core;

import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import X.GAo;
import X.Hqw;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.hatch.browser.core.UniffiVTableCallbackInterfaceBrowserHostPageClose;
import com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostPageClose;
import com.hatch.browser.protocol.RustBuffer;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class uniffiCallbackInterfaceBrowserHostPageClose {
    public static final int $stable = 0;
    public static final uniffiCallbackInterfaceBrowserHostPageClose INSTANCE = new uniffiCallbackInterfaceBrowserHostPageClose();
    public static UniffiVTableCallbackInterfaceBrowserHostPageClose.UniffiByValue vtable = new UniffiVTableCallbackInterfaceBrowserHostPageClose.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, closePage.INSTANCE);

    public final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeBrowserHostPageClose.handleMap.clone(j);
        }
    }

    public final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeBrowserHostPageClose.handleMap.remove(j);
        }
    }

    public final void register$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiLib uniffiLib) {
        C7384Etj.A0Y(uniffiLib, 0);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostpageclose(vtable);
    }

    public final void setVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostPageClose.UniffiByValue uniffiByValue) {
        C7384Etj.A0Y(uniffiByValue, 0);
        vtable = uniffiByValue;
    }

    public final class closePage implements UniffiCallbackInterfaceBrowserHostPageCloseMethod0 {
        public static final int $stable = 0;
        public static final closePage INSTANCE = new closePage();

        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, NativePageCloseResult nativePageCloseResult) {
            C7384Etj.A0Y(nativePageCloseResult, 2);
            AbstractC7610F5x.A1F(FfiConverterTypeNativePageCloseResult.INSTANCE.lower((Object) nativePageCloseResult), uniffiForeignFutureCompleteRustBuffer, j);
            return Unit.INSTANCE;
        }

        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, byValue, j);
            return Unit.INSTANCE;
        }

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceBrowserHostPageCloseMethod0
        public void callback(long j, RustBuffer.ByValue byValue, final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            AnonymousClass003.A0x(byValue, uniffiForeignFutureCompleteRustBuffer);
            C7384Etj.A0Y(uniffiForeignFutureDroppedCallbackStruct, 4);
            uniffiCallbackInterfaceBrowserHostPageClose$closePage$callback$makeCall$1 unifficallbackinterfacebrowserhostpageclose_closepage_callback_makecall_1 = new uniffiCallbackInterfaceBrowserHostPageClose$closePage$callback$makeCall$1(FfiConverterTypeBrowserHostPageClose.handleMap.get(j), byValue, null);
            G0U g0u = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostPageClose$closePage$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return uniffiCallbackInterfaceBrowserHostPageClose.closePage.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (NativePageCloseResult) obj);
                }
            };
            G0U g0u2 = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostPageClose$closePage$$ExternalSyntheticLambda1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, (UniffiRustCallStatus.ByValue) obj, j2);
                    return Unit.INSTANCE;
                }
            };
            GAo.A03(uniffiForeignFutureDroppedCallbackStruct, new uniffiCallbackInterfaceBrowserHostPageClose$closePage$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(unifficallbackinterfacebrowserhostpageclose_closepage_callback_makecall_1, g0u2, g0u, null), Hqw.A00);
        }
    }

    public final UniffiVTableCallbackInterfaceBrowserHostPageClose.UniffiByValue getVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return vtable;
    }
}
