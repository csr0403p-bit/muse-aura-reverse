package com.hatch.browser.core;

import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import X.GAo;
import X.Hqw;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.hatch.browser.core.UniffiVTableCallbackInterfaceBrowserHostBlocklist;
import com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostBlocklist;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class uniffiCallbackInterfaceBrowserHostBlocklist {
    public static final int $stable = 0;
    public static final uniffiCallbackInterfaceBrowserHostBlocklist INSTANCE = new uniffiCallbackInterfaceBrowserHostBlocklist();
    public static UniffiVTableCallbackInterfaceBrowserHostBlocklist.UniffiByValue vtable = new UniffiVTableCallbackInterfaceBrowserHostBlocklist.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, check.INSTANCE);

    public final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeBrowserHostBlocklist.handleMap.clone(j);
        }
    }

    public final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeBrowserHostBlocklist.handleMap.remove(j);
        }
    }

    public final void register$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiLib uniffiLib) {
        C7384Etj.A0Y(uniffiLib, 0);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostblocklist(vtable);
    }

    public final void setVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostBlocklist.UniffiByValue uniffiByValue) {
        C7384Etj.A0Y(uniffiByValue, 0);
        vtable = uniffiByValue;
    }

    public final class check implements UniffiCallbackInterfaceBrowserHostBlocklistMethod0 {
        public static final int $stable = 0;
        public static final check INSTANCE = new check();

        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, NativeBlocklistCheckResult nativeBlocklistCheckResult) {
            C7384Etj.A0Y(nativeBlocklistCheckResult, 2);
            AbstractC7610F5x.A1F(FfiConverterTypeNativeBlocklistCheckResult.INSTANCE.lower((Object) nativeBlocklistCheckResult), uniffiForeignFutureCompleteRustBuffer, j);
            return Unit.INSTANCE;
        }

        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, byValue, j);
            return Unit.INSTANCE;
        }

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceBrowserHostBlocklistMethod0
        public void callback(long j, RustBuffer.ByValue byValue, final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            AnonymousClass003.A0x(byValue, uniffiForeignFutureCompleteRustBuffer);
            C7384Etj.A0Y(uniffiForeignFutureDroppedCallbackStruct, 4);
            uniffiCallbackInterfaceBrowserHostBlocklist$check$callback$makeCall$1 unifficallbackinterfacebrowserhostblocklist_check_callback_makecall_1 = new uniffiCallbackInterfaceBrowserHostBlocklist$check$callback$makeCall$1(FfiConverterTypeBrowserHostBlocklist.handleMap.get(j), byValue, null);
            G0U g0u = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostBlocklist$check$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return uniffiCallbackInterfaceBrowserHostBlocklist.check.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (NativeBlocklistCheckResult) obj);
                }
            };
            G0U g0u2 = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostBlocklist$check$$ExternalSyntheticLambda1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, (UniffiRustCallStatus.ByValue) obj, j2);
                    return Unit.INSTANCE;
                }
            };
            GAo.A03(uniffiForeignFutureDroppedCallbackStruct, new uniffiCallbackInterfaceBrowserHostBlocklist$check$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(unifficallbackinterfacebrowserhostblocklist_check_callback_makecall_1, g0u2, g0u, null), Hqw.A00);
        }
    }

    public final UniffiVTableCallbackInterfaceBrowserHostBlocklist.UniffiByValue getVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return vtable;
    }
}
