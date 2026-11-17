package com.hatch.browser.core;

import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C7384Etj;
import X.CU7;
import X.G0U;
import X.GAo;
import X.Hqw;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.hatch.browser.core.UniffiVTableCallbackInterfaceBrowserHostFiles;
import com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostFiles;
import com.hatch.browser.protocol.RustBuffer;
import com.sun.jna.Pointer;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class uniffiCallbackInterfaceBrowserHostFiles {
    public static final int $stable = 0;
    public static final uniffiCallbackInterfaceBrowserHostFiles INSTANCE = new uniffiCallbackInterfaceBrowserHostFiles();
    public static UniffiVTableCallbackInterfaceBrowserHostFiles.UniffiByValue vtable = new UniffiVTableCallbackInterfaceBrowserHostFiles.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, stage.INSTANCE, read.INSTANCE, release.INSTANCE);

    public final class release implements UniffiCallbackInterfaceBrowserHostFilesMethod2 {
        public static final int $stable = 0;
        public static final release INSTANCE = new release();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceBrowserHostFilesMethod2
        public void callback(long j, RustBuffer.ByValue byValue, Pointer pointer, UniffiRustCallStatus uniffiRustCallStatus) {
            String strA00;
            AnonymousClass002.A1B(byValue, 1, uniffiRustCallStatus);
            try {
                callback$lambda$0(FfiConverterTypeBrowserHostFiles.handleMap.get(j), byValue);
            } catch (Exception e) {
                try {
                    strA00 = CU7.A00(e);
                } catch (Throwable unused) {
                    strA00 = "";
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = FfiConverterString.INSTANCE.lower(strA00);
            }
        }

        public static final Unit callback$lambda$0(BrowserHostFiles browserHostFiles, RustBuffer.ByValue byValue) {
            browserHostFiles.release(FfiConverterString.INSTANCE.lift(byValue));
            return Unit.INSTANCE;
        }
    }

    public final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeBrowserHostFiles.handleMap.clone(j);
        }
    }

    public final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeBrowserHostFiles.handleMap.remove(j);
        }
    }

    public final void register$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiLib uniffiLib) {
        C7384Etj.A0Y(uniffiLib, 0);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostfiles(vtable);
    }

    public final void setVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostFiles.UniffiByValue uniffiByValue) {
        C7384Etj.A0Y(uniffiByValue, 0);
        vtable = uniffiByValue;
    }

    public final class read implements UniffiCallbackInterfaceBrowserHostFilesMethod1 {
        public static final int $stable = 0;
        public static final read INSTANCE = new read();

        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, NativeFileReadResult nativeFileReadResult) {
            C7384Etj.A0Y(nativeFileReadResult, 2);
            AbstractC7610F5x.A1F(FfiConverterTypeNativeFileReadResult.INSTANCE.lower((Object) nativeFileReadResult), uniffiForeignFutureCompleteRustBuffer, j);
            return Unit.INSTANCE;
        }

        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, byValue, j);
            return Unit.INSTANCE;
        }

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceBrowserHostFilesMethod1
        public void callback(long j, RustBuffer.ByValue byValue, final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            AnonymousClass003.A0x(byValue, uniffiForeignFutureCompleteRustBuffer);
            C7384Etj.A0Y(uniffiForeignFutureDroppedCallbackStruct, 4);
            uniffiCallbackInterfaceBrowserHostFiles$read$callback$makeCall$1 unifficallbackinterfacebrowserhostfiles_read_callback_makecall_1 = new uniffiCallbackInterfaceBrowserHostFiles$read$callback$makeCall$1(FfiConverterTypeBrowserHostFiles.handleMap.get(j), byValue, null);
            G0U g0u = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostFiles$read$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return uniffiCallbackInterfaceBrowserHostFiles.read.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (NativeFileReadResult) obj);
                }
            };
            G0U g0u2 = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostFiles$read$$ExternalSyntheticLambda1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, (UniffiRustCallStatus.ByValue) obj, j2);
                    return Unit.INSTANCE;
                }
            };
            GAo.A03(uniffiForeignFutureDroppedCallbackStruct, new uniffiCallbackInterfaceBrowserHostFiles$read$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(unifficallbackinterfacebrowserhostfiles_read_callback_makecall_1, g0u2, g0u, null), Hqw.A00);
        }
    }

    public final class stage implements UniffiCallbackInterfaceBrowserHostFilesMethod0 {
        public static final int $stable = 0;
        public static final stage INSTANCE = new stage();

        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, NativeFileStageResult nativeFileStageResult) {
            C7384Etj.A0Y(nativeFileStageResult, 2);
            AbstractC7610F5x.A1F(FfiConverterTypeNativeFileStageResult.INSTANCE.lower((Object) nativeFileStageResult), uniffiForeignFutureCompleteRustBuffer, j);
            return Unit.INSTANCE;
        }

        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, byValue, j);
            return Unit.INSTANCE;
        }

        @Override // com.hatch.browser.core.UniffiCallbackInterfaceBrowserHostFilesMethod0
        public void callback(long j, RustBuffer.ByValue byValue, final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            AnonymousClass003.A0x(byValue, uniffiForeignFutureCompleteRustBuffer);
            C7384Etj.A0Y(uniffiForeignFutureDroppedCallbackStruct, 4);
            uniffiCallbackInterfaceBrowserHostFiles$stage$callback$makeCall$1 unifficallbackinterfacebrowserhostfiles_stage_callback_makecall_1 = new uniffiCallbackInterfaceBrowserHostFiles$stage$callback$makeCall$1(FfiConverterTypeBrowserHostFiles.handleMap.get(j), byValue, null);
            G0U g0u = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostFiles$stage$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return uniffiCallbackInterfaceBrowserHostFiles.stage.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (NativeFileStageResult) obj);
                }
            };
            G0U g0u2 = new G0U() { // from class: com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostFiles$stage$$ExternalSyntheticLambda1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    AbstractC7611F5y.A0n(uniffiForeignFutureCompleteRustBuffer, (UniffiRustCallStatus.ByValue) obj, j2);
                    return Unit.INSTANCE;
                }
            };
            GAo.A03(uniffiForeignFutureDroppedCallbackStruct, new uniffiCallbackInterfaceBrowserHostFiles$stage$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(unifficallbackinterfacebrowserhostfiles_stage_callback_makecall_1, g0u2, g0u, null), Hqw.A00);
        }
    }

    public final UniffiVTableCallbackInterfaceBrowserHostFiles.UniffiByValue getVtable$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return vtable;
    }
}
