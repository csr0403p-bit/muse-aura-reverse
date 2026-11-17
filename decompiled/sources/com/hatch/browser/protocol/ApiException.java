package com.hatch.browser.protocol;

import X.C06H;
import X.C7384Etj;
import com.hatch.browser.protocol.RustBuffer;

/* loaded from: classes6.dex */
public abstract class ApiException extends Exception {
    public static final int $stable = 8;
    public static final ErrorHandler ErrorHandler = new ErrorHandler();

    public final class Closed extends ApiException {
        public static final int $stable = 8;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }
    }

    public final class EncodingFailed extends ApiException {
        public static final int $stable = 8;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }
    }

    public final class IncompatibleVersion extends ApiException {
        public static final int $stable = 8;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }
    }

    public final class LifecycleConflict extends ApiException {
        public static final int $stable = 8;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }
    }

    /* loaded from: classes2.dex */
    public final class LimitExceeded extends ApiException {
        public static final int $stable = 8;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }
    }

    public final class Malformed extends ApiException {
        public static final int $stable = 8;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }
    }

    public final class SetupFailed extends ApiException {
        public static final int $stable = 8;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }
    }

    public final class UnknownPage extends ApiException {
        public static final int $stable = 8;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }
    }

    public final class ErrorHandler implements UniffiRustCallStatusErrorHandler<ApiException> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.hatch.browser.protocol.UniffiRustCallStatusErrorHandler
        public ApiException lift(RustBuffer.ByValue byValue) {
            C7384Etj.A0Y(byValue, 0);
            return (ApiException) FfiConverterTypeApiError.INSTANCE.lift(byValue);
        }

        public ErrorHandler() {
        }

        public /* synthetic */ ErrorHandler(C06H c06h) {
        }
    }

    public ApiException() {
    }

    public /* synthetic */ ApiException(C06H c06h) {
    }
}
