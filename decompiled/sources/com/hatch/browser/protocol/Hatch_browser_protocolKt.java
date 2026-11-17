package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.BV7;
import X.C3cG;
import X.C7384Etj;
import X.CU7;
import X.F60;
import X.FGI;
import X.G0U;
import com.hatch.browser.protocol.RustBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public abstract class Hatch_browser_protocolKt {
    public static final byte UNIFFI_CALL_ERROR = 1;
    public static final byte UNIFFI_CALL_SUCCESS = 0;
    public static final byte UNIFFI_CALL_UNEXPECTED_ERROR = 2;
    public static final long UNIFFI_HANDLEMAP_DELTA = 2;
    public static final long UNIFFI_HANDLEMAP_INITIAL = 1;

    public static final <T extends Disposable, R> R use(T t, G0U<? super T, ? extends R> g0u) {
        C7384Etj.A0Y(g0u, 1);
        try {
            R rInvoke = g0u.invoke(t);
            if (t != null) {
                try {
                    t.destroy();
                } catch (Throwable unused) {
                }
            }
            return rInvoke;
        } catch (Throwable th) {
            if (t != null) {
                try {
                    t.destroy();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }

    public static final /* synthetic */ void access$uniffiCheckApiChecksums(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
    }

    public static final synchronized String findLibraryName(String str) {
        String property;
        property = System.getProperty(FGI.A0U("uniffi.component.", str, ".libraryOverride"));
        if (property == null) {
            property = "hatch_browser_core_uniffi";
        }
        return property;
    }

    public static final void uniffiCheckApiChecksums(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    public static final <E extends Exception> void uniffiCheckCallStatus(UniffiRustCallStatusErrorHandler<E> uniffiRustCallStatusErrorHandler, UniffiRustCallStatus uniffiRustCallStatus) throws E, InternalException {
        if (AnonymousClass002.A1M(uniffiRustCallStatus.code)) {
            return;
        }
        if (BV7.A1Q(uniffiRustCallStatus.code)) {
            throw uniffiRustCallStatusErrorHandler.lift(uniffiRustCallStatus.error_buf);
        }
        if (!AnonymousClass002.A1Q(uniffiRustCallStatus.code, 2)) {
            throw new InternalException(AnonymousClass001.A0v(".code", C3cG.A0f(uniffiRustCallStatus, "Unknown rust call status: ")));
        }
        RustBuffer.ByValue byValue = uniffiRustCallStatus.error_buf;
        if (byValue.len <= 0) {
            throw new InternalException("Rust panic");
        }
        throw new InternalException(FfiConverterString.INSTANCE.lift(byValue));
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_hatch_browser_protocol_uniffi_contract_version()) {
            throw BV4.A0c("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        int i = IntegrityCheckingUniffiLib.$stable;
        int i2 = UniffiLib.$stable;
    }

    public static final <U> U uniffiRustCall(G0U<? super UniffiRustCallStatus, ? extends U> g0u) throws E, InternalException {
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
        U uInvoke = g0u.invoke(uniffiRustCallStatus);
        uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
        return uInvoke;
    }

    public static final <U, E extends Exception> U uniffiRustCallWithError(UniffiRustCallStatusErrorHandler<E> uniffiRustCallStatusErrorHandler, G0U<? super UniffiRustCallStatus, ? extends U> g0u) throws E, InternalException {
        UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
        U uInvoke = g0u.invoke(uniffiRustCallStatus);
        uniffiCheckCallStatus(uniffiRustCallStatusErrorHandler, uniffiRustCallStatus);
        return uInvoke;
    }

    public static final <T> void uniffiTraitInterfaceCall(UniffiRustCallStatus uniffiRustCallStatus, Function0<? extends T> function0, G0U<? super T, Unit> g0u) {
        String strA00;
        AnonymousClass003.A0u(uniffiRustCallStatus, function0);
        C7384Etj.A0Y(g0u, 2);
        try {
            g0u.invoke(function0.invoke());
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

    public static final /* synthetic */ <T, E extends Throwable> void uniffiTraitInterfaceCallWithError(UniffiRustCallStatus uniffiRustCallStatus, Function0<? extends T> function0, G0U<? super T, Unit> g0u, G0U<? super E, RustBuffer.ByValue> g0u2) {
        AnonymousClass003.A0x(function0, g0u);
        try {
            g0u.invoke(function0.invoke());
        } catch (Exception unused) {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        }
    }
}
