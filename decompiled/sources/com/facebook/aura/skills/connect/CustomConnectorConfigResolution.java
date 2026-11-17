package com.facebook.aura.skills.connect;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface CustomConnectorConfigResolution {

    public final class Failure extends C06G implements CustomConnectorConfigResolution {
        public static final int $stable = 0;
        public final String detail;
        public final String errorType;

        public Failure(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.errorType = str;
            this.detail = str2;
        }

        public final Failure copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new Failure(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failure) {
                    Failure failure = (Failure) obj;
                    if (!C7384Etj.areEqual(this.errorType, failure.errorType) || !C7384Etj.areEqual(this.detail, failure.detail)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.errorType;
            }
            if ((i & 2) != 0) {
                str2 = failure.detail;
            }
            C7384Etj.A0Y(str, 0);
            return new Failure(str, str2);
        }

        public final String component1() {
            return this.errorType;
        }

        public final String component2() {
            return this.detail;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final String getErrorType() {
            return this.errorType;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.errorType) + AnonymousClass006.A0G(this.detail);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Failure(String str, String str2, int i, C06H c06h) {
            this(str, AnonymousClass006.A0s(i, str2));
        }
    }

    public final class Success extends C06G implements CustomConnectorConfigResolution {
        public static final int $stable = 8;
        public final CustomConnectorResolvedConfig config;

        public Success(CustomConnectorResolvedConfig customConnectorResolvedConfig) {
            C7384Etj.A0Y(customConnectorResolvedConfig, 0);
            this.config = customConnectorResolvedConfig;
        }

        public final Success copy(CustomConnectorResolvedConfig customConnectorResolvedConfig) {
            C7384Etj.A0Y(customConnectorResolvedConfig, 0);
            return new Success(customConnectorResolvedConfig);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.config, ((Success) obj).config));
        }

        public static /* synthetic */ Success copy$default(Success success, CustomConnectorResolvedConfig customConnectorResolvedConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                customConnectorResolvedConfig = success.config;
            }
            C7384Etj.A0Y(customConnectorResolvedConfig, 0);
            return new Success(customConnectorResolvedConfig);
        }

        public final CustomConnectorResolvedConfig component1() {
            return this.config;
        }

        public final CustomConnectorResolvedConfig getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
