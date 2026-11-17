package com.facebook.aura.skills.connect;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.skills.connect.config.CustomConnectorApiKeyConfig;
import com.facebook.aura.skills.connect.config.CustomConnectorApiKeyConnector;
import com.facebook.aura.skills.connect.config.CustomConnectorMode;
import com.facebook.aura.skills.connect.config.CustomConnectorName;
import com.facebook.aura.skills.connect.config.CustomConnectorOAuthConfig;
import com.facebook.aura.skills.connect.config.CustomConnectorOAuthCredential;
import java.util.List;

/* loaded from: classes4.dex */
public interface CustomConnectorResolvedConfig {

    /* renamed from: com.facebook.aura.skills.connect.CustomConnectorResolvedConfig$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$getRequiresClientSecret(CustomConnectorResolvedConfig customConnectorResolvedConfig) {
            return false;
        }

        public static /* synthetic */ boolean access$getRequiresClientSecret$jd(CustomConnectorResolvedConfig customConnectorResolvedConfig) {
            return false;
        }

        public static String $default$getConnectorDisplayName(CustomConnectorResolvedConfig customConnectorResolvedConfig) {
            return ServiceDisplayNameFormatterKt.formatServiceDisplayName(CustomConnectorName.INSTANCE.normalized(customConnectorResolvedConfig.getConnectorName()));
        }
    }

    public final class ApiKey extends C06G implements CustomConnectorResolvedConfig {
        public static final int $stable = 8;
        public final CustomConnectorApiKeyConfig config;
        public final String connectorName;
        public final List<String> hosts;
        public final CustomConnectorMode mode;

        public ApiKey(CustomConnectorApiKeyConfig customConnectorApiKeyConfig) {
            C7384Etj.A0Y(customConnectorApiKeyConfig, 0);
            this.config = customConnectorApiKeyConfig;
            this.mode = CustomConnectorMode.API_KEY;
            CustomConnectorApiKeyConnector customConnectorApiKeyConnector = customConnectorApiKeyConfig.connector;
            this.connectorName = customConnectorApiKeyConnector.name;
            this.hosts = customConnectorApiKeyConnector.hosts;
        }

        public final ApiKey copy(CustomConnectorApiKeyConfig customConnectorApiKeyConfig) {
            C7384Etj.A0Y(customConnectorApiKeyConfig, 0);
            return new ApiKey(customConnectorApiKeyConfig);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ApiKey) && C7384Etj.areEqual(this.config, ((ApiKey) obj).config));
        }

        public static /* synthetic */ ApiKey copy$default(ApiKey apiKey, CustomConnectorApiKeyConfig customConnectorApiKeyConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                customConnectorApiKeyConfig = apiKey.config;
            }
            C7384Etj.A0Y(customConnectorApiKeyConfig, 0);
            return new ApiKey(customConnectorApiKeyConfig);
        }

        public final CustomConnectorApiKeyConfig component1() {
            return this.config;
        }

        public final CustomConnectorApiKeyConfig getConfig() {
            return this.config;
        }

        @Override // com.facebook.aura.skills.connect.CustomConnectorResolvedConfig
        public String getConnectorName() {
            return this.connectorName;
        }

        @Override // com.facebook.aura.skills.connect.CustomConnectorResolvedConfig
        public List<String> getHosts() {
            return this.hosts;
        }

        @Override // com.facebook.aura.skills.connect.CustomConnectorResolvedConfig
        public CustomConnectorMode getMode() {
            return this.mode;
        }

        @Override // com.facebook.aura.skills.connect.CustomConnectorResolvedConfig
        public /* bridge */ boolean getRequiresClientSecret() {
            return false;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        @Override // com.facebook.aura.skills.connect.CustomConnectorResolvedConfig
        public /* bridge */ String getConnectorDisplayName() {
            return CC.$default$getConnectorDisplayName(this);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class OAuth extends C06G implements CustomConnectorResolvedConfig {
        public static final int $stable = 8;
        public final CustomConnectorOAuthConfig config;
        public final String connectorName;
        public final List<String> hosts;
        public final CustomConnectorMode mode;
        public final boolean requiresClientSecret;

        public OAuth(CustomConnectorOAuthConfig customConnectorOAuthConfig) {
            C7384Etj.A0Y(customConnectorOAuthConfig, 0);
            this.config = customConnectorOAuthConfig;
            this.mode = CustomConnectorMode.OAUTH;
            CustomConnectorOAuthCredential customConnectorOAuthCredential = customConnectorOAuthConfig.credential;
            this.connectorName = customConnectorOAuthCredential.name;
            this.hosts = customConnectorOAuthCredential.domains;
            this.requiresClientSecret = customConnectorOAuthCredential.oauth.getResolvedAuthMethod().getRequiresClientSecret();
        }

        public final OAuth copy(CustomConnectorOAuthConfig customConnectorOAuthConfig) {
            C7384Etj.A0Y(customConnectorOAuthConfig, 0);
            return new OAuth(customConnectorOAuthConfig);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof OAuth) && C7384Etj.areEqual(this.config, ((OAuth) obj).config));
        }

        public static /* synthetic */ OAuth copy$default(OAuth oAuth, CustomConnectorOAuthConfig customConnectorOAuthConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                customConnectorOAuthConfig = oAuth.config;
            }
            C7384Etj.A0Y(customConnectorOAuthConfig, 0);
            return new OAuth(customConnectorOAuthConfig);
        }

        public final CustomConnectorOAuthConfig component1() {
            return this.config;
        }

        public final CustomConnectorOAuthConfig getConfig() {
            return this.config;
        }

        @Override // com.facebook.aura.skills.connect.CustomConnectorResolvedConfig
        public String getConnectorName() {
            return this.connectorName;
        }

        @Override // com.facebook.aura.skills.connect.CustomConnectorResolvedConfig
        public List<String> getHosts() {
            return this.hosts;
        }

        @Override // com.facebook.aura.skills.connect.CustomConnectorResolvedConfig
        public CustomConnectorMode getMode() {
            return this.mode;
        }

        @Override // com.facebook.aura.skills.connect.CustomConnectorResolvedConfig
        public boolean getRequiresClientSecret() {
            return this.requiresClientSecret;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        @Override // com.facebook.aura.skills.connect.CustomConnectorResolvedConfig
        public /* bridge */ String getConnectorDisplayName() {
            return CC.$default$getConnectorDisplayName(this);
        }

        public String toString() {
            return super.toString();
        }
    }

    String getConnectorDisplayName();

    String getConnectorName();

    List<String> getHosts();

    CustomConnectorMode getMode();

    boolean getRequiresClientSecret();

    public abstract class DefaultImpls {
        @Deprecated
        public static boolean getRequiresClientSecret(CustomConnectorResolvedConfig customConnectorResolvedConfig) {
            return false;
        }

        @Deprecated
        public static String getConnectorDisplayName(CustomConnectorResolvedConfig customConnectorResolvedConfig) {
            return CC.$default$getConnectorDisplayName(customConnectorResolvedConfig);
        }
    }
}
