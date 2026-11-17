package com.hatch.browser.core;

import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import X.GAo;
import X.Hqw;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.hatch.browser.core.UniffiVTableCallbackInterfaceBrowserHostNativeControls;
import com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostNativeControls;
import com.hatch.browser.protocol.RustBuffer;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class uniffiCallbackInterfaceBrowserHostNativeControls {
    public static final int $stable = 0;
    public static final uniffiCallbackInterfaceBrowserHostNativeControls INSTANCE = new uniffiCallbackInterfaceBrowserHostNativeControls();
    public static UniffiVTableCallbackInterfaceBrowserHostNativeControls.UniffiByValue vtable = new UniffiVTableCallbackInterfaceBrowserHostNativeControls.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, allow.INSTANCE);

    public final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeBrowserHostNativeControls.handleMap.clone(j);
        }
    }

    public final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeBrowserHostNativeControls.handleMap.remove(j);
        }
    }

    public final void register$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiLib uniffiLib) {
        C7384Etj.A0Y(uniffiLib, 0);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostnativecontrols(vtable);
    }

    public final void setVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostNativeControls.UniffiByValue uniffiByValue) {
        C7384Etj.A0Y(uniffiByValue, 0);
        vtable = uniffiByValue;
    }

    public final class allow implements UniffiCallbackInterfaceBrowserHostNativeControlsMethod0 {
        public static final int $stable = 0;
        public static final allow INSTANCE = new allow();

        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, NativeControlDecision nativeControlDecision) {
            C7384Etj.A0Y(nativeControlDecision, 2);
            AbstractC7610F5x.A1F(FfiConverterTypeNativeControlDecision.INSTANCE.lower((Object) nativeControlDecision), uniffiForeignFutureCompleteRustBuffer, j);
            return Unit.INSTANCE;
        }

        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, byValue, j);
            return Unit.INSTANCE;
        }

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceBrowserHostNativeControlsMethod0
        public void callback(long j, RustBuffer.ByValue byValue, final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            AnonymousClass003.A0x(byValue, uniffiForeignFutureCompleteRustBuffer);
            C7384Etj.A0Y(uniffiForeignFutureDroppedCallbackStruct, 4);
            uniffiCallbackInterfaceBrowserHostNativeControls$allow$callback$makeCall$1 unifficallbackinterfacebrowserhostnativecontrols_allow_callback_makecall_1 = new uniffiCallbackInterfaceBrowserHostNativeControls$allow$callback$makeCall$1(FfiConverterTypeBrowserHostNativeControls.handleMap.get(j), byValue, null);
            G0U g0u = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostNativeControls$allow$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return uniffiCallbackInterfaceBrowserHostNativeControls.allow.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (NativeControlDecision) obj);
                }
            };
            G0U g0u2 = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostNativeControls$allow$$ExternalSyntheticLambda1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, (UniffiRustCallStatus.ByValue) obj, j2);
                    return Unit.INSTANCE;
                }
            };
            GAo.A03(uniffiForeignFutureDroppedCallbackStruct, new uniffiCallbackInterfaceBrowserHostNativeControls$allow$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(unifficallbackinterfacebrowserhostnativecontrols_allow_callback_makecall_1, g0u2, g0u, null), Hqw.A00);
        }
    }

    public final UniffiVTableCallbackInterfaceBrowserHostNativeControls.UniffiByValue getVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return vtable;
    }
}
