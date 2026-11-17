package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass006;
import X.C06H;

/* loaded from: classes3.dex */
public abstract class HatchStorageRecoveryError extends Exception {

    public final class Api extends HatchStorageRecoveryError {
        public final HatchStorageRecoveryErrorCode code;
        public final int statusCode;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Api) {
                    Api api = (Api) obj;
                    if (this.statusCode != api.statusCode || this.code != api.code) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Api copy$default(Api api, int i, HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = api.statusCode;
            }
            if ((i2 & 2) != 0) {
                hatchStorageRecoveryErrorCode = api.code;
            }
            return new Api(i, hatchStorageRecoveryErrorCode);
        }

        public final int component1() {
            return this.statusCode;
        }

        public final HatchStorageRecoveryErrorCode component2() {
            return this.code;
        }

        public final Api copy(int i, HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode) {
            return new Api(i, hatchStorageRecoveryErrorCode);
        }

        public final HatchStorageRecoveryErrorCode getCode() {
            return this.code;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            return (this.statusCode * 31) + AnonymousClass006.A0D(this.code);
        }

        public Api(int i, HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode) {
            this.statusCode = i;
            this.code = hatchStorageRecoveryErrorCode;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return super.toString();
        }
    }

    public final class InvalidResponse extends HatchStorageRecoveryError {
        public static final InvalidResponse INSTANCE = new InvalidResponse();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidResponse);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidResponse";
        }

        public int hashCode() {
            return -731880020;
        }
    }

    public final class Unavailable extends HatchStorageRecoveryError {
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return -609942364;
        }
    }

    public final boolean isSelectionExpired() {
        if (!(this instanceof Api)) {
            return false;
        }
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode = ((Api) this).code;
        return hatchStorageRecoveryErrorCode == HatchStorageRecoveryErrorCode.SELECTION_EXPIRED || hatchStorageRecoveryErrorCode == HatchStorageRecoveryErrorCode.SELECTION_STALE;
    }

    public /* synthetic */ HatchStorageRecoveryError(C06H c06h) {
    }

    public HatchStorageRecoveryError() {
    }
}
