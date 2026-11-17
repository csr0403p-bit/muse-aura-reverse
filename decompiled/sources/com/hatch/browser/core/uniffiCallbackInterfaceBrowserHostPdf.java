package com.hatch.browser.core;

import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import X.GAo;
import X.Hqw;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.hatch.browser.core.UniffiVTableCallbackInterfaceBrowserHostPdf;
import com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostPdf;
import com.hatch.browser.protocol.RustBuffer;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class uniffiCallbackInterfaceBrowserHostPdf {
    public static final int $stable = 0;
    public static final uniffiCallbackInterfaceBrowserHostPdf INSTANCE = new uniffiCallbackInterfaceBrowserHostPdf();
    public static UniffiVTableCallbackInterfaceBrowserHostPdf.UniffiByValue vtable = new UniffiVTableCallbackInterfaceBrowserHostPdf.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, print.INSTANCE);

    public final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeBrowserHostPdf.handleMap.clone(j);
        }
    }

    public final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeBrowserHostPdf.handleMap.remove(j);
        }
    }

    public final void register$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiLib uniffiLib) {
        C7384Etj.A0Y(uniffiLib, 0);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostpdf(vtable);
    }

    public final void setVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostPdf.UniffiByValue uniffiByValue) {
        C7384Etj.A0Y(uniffiByValue, 0);
        vtable = uniffiByValue;
    }

    public final class print implements UniffiCallbackInterfaceBrowserHostPdfMethod0 {
        public static final int $stable = 0;
        public static final print INSTANCE = new print();

        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, NativePdfPrintResult nativePdfPrintResult) {
            C7384Etj.A0Y(nativePdfPrintResult, 2);
            AbstractC7610F5x.A1F(FfiConverterTypeNativePdfPrintResult.INSTANCE.lower((Object) nativePdfPrintResult), uniffiForeignFutureCompleteRustBuffer, j);
            return Unit.INSTANCE;
        }

        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, byValue, j);
            return Unit.INSTANCE;
        }

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceBrowserHostPdfMethod0
        public void callback(long j, RustBuffer.ByValue byValue, final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            AnonymousClass003.A0x(byValue, uniffiForeignFutureCompleteRustBuffer);
            C7384Etj.A0Y(uniffiForeignFutureDroppedCallbackStruct, 4);
            uniffiCallbackInterfaceBrowserHostPdf$print$callback$makeCall$1 unifficallbackinterfacebrowserhostpdf_print_callback_makecall_1 = new uniffiCallbackInterfaceBrowserHostPdf$print$callback$makeCall$1(FfiConverterTypeBrowserHostPdf.handleMap.get(j), byValue, null);
            G0U g0u = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostPdf$print$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return uniffiCallbackInterfaceBrowserHostPdf.print.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (NativePdfPrintResult) obj);
                }
            };
            G0U g0u2 = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostPdf$print$$ExternalSyntheticLambda1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, (UniffiRustCallStatus.ByValue) obj, j2);
                    return Unit.INSTANCE;
                }
            };
            GAo.A03(uniffiForeignFutureDroppedCallbackStruct, new uniffiCallbackInterfaceBrowserHostPdf$print$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(unifficallbackinterfacebrowserhostpdf_print_callback_makecall_1, g0u2, g0u, null), Hqw.A00);
        }
    }

    public final UniffiVTableCallbackInterfaceBrowserHostPdf.UniffiByValue getVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return vtable;
    }
}
