package com.hatch.browser.core;

import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import X.GAo;
import X.Hqw;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.hatch.browser.core.UniffiVTableCallbackInterfaceBrowserHostAuthority;
import com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostAuthority;
import com.hatch.browser.protocol.RustBuffer;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class uniffiCallbackInterfaceBrowserHostAuthority {
    public static final int $stable = 0;
    public static final uniffiCallbackInterfaceBrowserHostAuthority INSTANCE = new uniffiCallbackInterfaceBrowserHostAuthority();
    public static UniffiVTableCallbackInterfaceBrowserHostAuthority.UniffiByValue vtable = new UniffiVTableCallbackInterfaceBrowserHostAuthority.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, authorize.INSTANCE);

    public final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeBrowserHostAuthority.handleMap.clone(j);
        }
    }

    public final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeBrowserHostAuthority.handleMap.remove(j);
        }
    }

    public final void register$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiLib uniffiLib) {
        C7384Etj.A0Y(uniffiLib, 0);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostauthority(vtable);
    }

    public final void setVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostAuthority.UniffiByValue uniffiByValue) {
        C7384Etj.A0Y(uniffiByValue, 0);
        vtable = uniffiByValue;
    }

    public final class authorize implements UniffiCallbackInterfaceBrowserHostAuthorityMethod0 {
        public static final int $stable = 0;
        public static final authorize INSTANCE = new authorize();

        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, NativePageAuthorityDecision nativePageAuthorityDecision) {
            C7384Etj.A0Y(nativePageAuthorityDecision, 2);
            AbstractC7610F5x.A1F(FfiConverterTypeNativePageAuthorityDecision.INSTANCE.lower((Object) nativePageAuthorityDecision), uniffiForeignFutureCompleteRustBuffer, j);
            return Unit.INSTANCE;
        }

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceBrowserHostAuthorityMethod0
        public void callback(long j, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            AnonymousClass005.A11(byValue, byValue2, uniffiForeignFutureCompleteRustBuffer, 1);
            C7384Etj.A0Y(uniffiForeignFutureDroppedCallbackStruct, 5);
            uniffiCallbackInterfaceBrowserHostAuthority$authorize$callback$makeCall$1 unifficallbackinterfacebrowserhostauthority_authorize_callback_makecall_1 = new uniffiCallbackInterfaceBrowserHostAuthority$authorize$callback$makeCall$1(FfiConverterTypeBrowserHostAuthority.handleMap.get(j), byValue, byValue2, null);
            G0U g0u = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostAuthority$authorize$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return uniffiCallbackInterfaceBrowserHostAuthority.authorize.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (NativePageAuthorityDecision) obj);
                }
            };
            G0U g0u2 = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostAuthority$authorize$$ExternalSyntheticLambda1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, (UniffiRustCallStatus.ByValue) obj, j2);
                    return Unit.INSTANCE;
                }
            };
            GAo.A03(uniffiForeignFutureDroppedCallbackStruct, new uniffiCallbackInterfaceBrowserHostAuthority$authorize$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(unifficallbackinterfacebrowserhostauthority_authorize_callback_makecall_1, g0u2, g0u, null), Hqw.A00);
        }

        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, byValue, j);
            return Unit.INSTANCE;
        }
    }

    public final UniffiVTableCallbackInterfaceBrowserHostAuthority.UniffiByValue getVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return vtable;
    }
}
