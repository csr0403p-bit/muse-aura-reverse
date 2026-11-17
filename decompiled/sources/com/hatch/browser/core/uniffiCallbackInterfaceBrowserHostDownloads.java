package com.hatch.browser.core;

import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import X.GAo;
import X.Hqw;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.hatch.browser.core.UniffiVTableCallbackInterfaceBrowserHostDownloads;
import com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostDownloads;
import com.hatch.browser.protocol.RustBuffer;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class uniffiCallbackInterfaceBrowserHostDownloads {
    public static final int $stable = 0;
    public static final uniffiCallbackInterfaceBrowserHostDownloads INSTANCE = new uniffiCallbackInterfaceBrowserHostDownloads();
    public static UniffiVTableCallbackInterfaceBrowserHostDownloads.UniffiByValue vtable = new UniffiVTableCallbackInterfaceBrowserHostDownloads.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, publish.INSTANCE);

    public final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeBrowserHostDownloads.handleMap.clone(j);
        }
    }

    public final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeBrowserHostDownloads.handleMap.remove(j);
        }
    }

    public final void register$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiLib uniffiLib) {
        C7384Etj.A0Y(uniffiLib, 0);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostdownloads(vtable);
    }

    public final void setVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostDownloads.UniffiByValue uniffiByValue) {
        C7384Etj.A0Y(uniffiByValue, 0);
        vtable = uniffiByValue;
    }

    public final class publish implements UniffiCallbackInterfaceBrowserHostDownloadsMethod0 {
        public static final int $stable = 0;
        public static final publish INSTANCE = new publish();

        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, NativeDownloadPublishResult nativeDownloadPublishResult) {
            C7384Etj.A0Y(nativeDownloadPublishResult, 2);
            AbstractC7610F5x.A1F(FfiConverterTypeNativeDownloadPublishResult.INSTANCE.lower((Object) nativeDownloadPublishResult), uniffiForeignFutureCompleteRustBuffer, j);
            return Unit.INSTANCE;
        }

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceBrowserHostDownloadsMethod0
        public void callback(long j, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            AnonymousClass005.A11(byValue, byValue2, uniffiForeignFutureCompleteRustBuffer, 1);
            C7384Etj.A0Y(uniffiForeignFutureDroppedCallbackStruct, 5);
            uniffiCallbackInterfaceBrowserHostDownloads$publish$callback$makeCall$1 unifficallbackinterfacebrowserhostdownloads_publish_callback_makecall_1 = new uniffiCallbackInterfaceBrowserHostDownloads$publish$callback$makeCall$1(FfiConverterTypeBrowserHostDownloads.handleMap.get(j), byValue, byValue2, null);
            G0U g0u = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostDownloads$publish$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return uniffiCallbackInterfaceBrowserHostDownloads.publish.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (NativeDownloadPublishResult) obj);
                }
            };
            G0U g0u2 = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostDownloads$publish$$ExternalSyntheticLambda1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, (UniffiRustCallStatus.ByValue) obj, j2);
                    return Unit.INSTANCE;
                }
            };
            GAo.A03(uniffiForeignFutureDroppedCallbackStruct, new uniffiCallbackInterfaceBrowserHostDownloads$publish$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(unifficallbackinterfacebrowserhostdownloads_publish_callback_makecall_1, g0u2, g0u, null), Hqw.A00);
        }

        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, byValue, j);
            return Unit.INSTANCE;
        }
    }

    public final UniffiVTableCallbackInterfaceBrowserHostDownloads.UniffiByValue getVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return vtable;
    }
}
