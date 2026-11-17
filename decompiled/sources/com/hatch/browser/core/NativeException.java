package com.hatch.browser.core;

import X.C06H;
import X.C7384Etj;
import com.hatch.browser.core.RustBuffer;

/* loaded from: classes6.dex */
public abstract class NativeException extends Exception {
    public static final int $stable = 8;
    public static final ErrorHandler ErrorHandler = new ErrorHandler();

    public final class Timeout extends NativeException {
        public static final int $stable = 8;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }
    }

    public final class Unauthorized extends NativeException {
        public static final int $stable = 8;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }
    }

    public final class Unavailable extends NativeException {
        public static final int $stable = 8;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }
    }

    public final class Unsupported extends NativeException {
        public static final int $stable = 8;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }
    }

    public final class ErrorHandler implements UniffiRustCallStatusErrorHandler<NativeException> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.hatch.browser.core.UniffiRustCallStatusErrorHandler
        public NativeException lift(RustBuffer.ByValue byValue) {
            C7384Etj.A0Y(byValue, 0);
            return (NativeException) FfiConverterTypeNativeError.INSTANCE.lift(byValue);
        }

        public ErrorHandler() {
        }

        public /* synthetic */ ErrorHandler(C06H c06h) {
        }
    }

    public NativeException() {
    }

    public /* synthetic */ NativeException(C06H c06h) {
    }
}
