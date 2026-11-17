package com.facebook.aura.skills.connect;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.HsJ;
import com.facebook.aura.skills.connect.CustomConnectorConfigResolution;
import com.facebook.aura.skills.connect.CustomConnectorResolvedConfig;
import com.facebook.aura.skills.connect.config.CustomConnectorApiKeyConfig;
import com.facebook.aura.skills.connect.config.CustomConnectorApiKeyValidationError;
import com.facebook.aura.skills.connect.config.CustomConnectorApiKeyValidator;
import com.facebook.aura.skills.connect.config.CustomConnectorConfigJsonKt;
import com.facebook.aura.skills.connect.config.CustomConnectorLink;
import com.facebook.aura.skills.connect.config.CustomConnectorLinkParser;
import com.facebook.aura.skills.connect.config.CustomConnectorMode;
import com.facebook.aura.skills.connect.config.CustomConnectorOAuthConfig;
import com.facebook.aura.skills.connect.config.CustomConnectorOAuthValidationError;
import com.facebook.aura.skills.connect.config.CustomConnectorOAuthValidator;

/* loaded from: classes4.dex */
public abstract class CustomConnectorConfigResolverKt {
    public static final CustomConnectorConfigResolution resolveCustomConnectorConfig(String str) {
        C7384Etj.A0Y(str, 0);
        CustomConnectorLink customConnectorLinkTryParse = CustomConnectorLinkParser.INSTANCE.tryParse(str);
        if (customConnectorLinkTryParse == null) {
            return new CustomConnectorConfigResolution.Failure("missing_or_invalid_custom_connector_link", null);
        }
        int iOrdinal = customConnectorLinkTryParse.mode.ordinal();
        if (iOrdinal == 0) {
            return resolveApiKeyConfig(customConnectorLinkTryParse);
        }
        if (iOrdinal == 1) {
            return resolveOAuthConfig(customConnectorLinkTryParse);
        }
        throw C3cG.A0q();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomConnectorMode.values().length];
            try {
                AnonymousClass002.A13(CustomConnectorMode.API_KEY, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(CustomConnectorMode.OAUTH, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CustomConnectorConfigResolution resolveApiKeyConfig(CustomConnectorLink customConnectorLink) {
        Object objA0s;
        CustomConnectorConfigResolution failure;
        try {
            objA0s = CustomConnectorConfigJsonKt.parseCustomConnectorApiKeyConfig(customConnectorLink.encodedConfig);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 == null) {
            CustomConnectorApiKeyConfig customConnectorApiKeyConfig = (CustomConnectorApiKeyConfig) objA0s;
            CustomConnectorApiKeyValidationError customConnectorApiKeyValidationErrorValidate = CustomConnectorApiKeyValidator.INSTANCE.validate(customConnectorApiKeyConfig, customConnectorLink.service);
            if (customConnectorApiKeyValidationErrorValidate != null) {
                return new CustomConnectorConfigResolution.Failure("api_key_config_validation_failed", AnonymousClass006.A0x(customConnectorApiKeyValidationErrorValidate));
            }
            failure = new CustomConnectorConfigResolution.Success(new CustomConnectorResolvedConfig.ApiKey(customConnectorApiKeyConfig));
        } else {
            failure = new CustomConnectorConfigResolution.Failure("api_key_config_parse_failed", C3cI.A0Y(thA00));
        }
        return failure;
    }

    public static final CustomConnectorConfigResolution resolveOAuthConfig(CustomConnectorLink customConnectorLink) {
        Object objA0s;
        String strA0Y;
        String str;
        try {
            objA0s = CustomConnectorConfigJsonKt.parseCustomConnectorOAuthConfig(customConnectorLink.encodedConfig);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 == null) {
            CustomConnectorOAuthConfig customConnectorOAuthConfig = (CustomConnectorOAuthConfig) objA0s;
            CustomConnectorOAuthValidationError customConnectorOAuthValidationErrorValidate = CustomConnectorOAuthValidator.INSTANCE.validate(customConnectorOAuthConfig);
            if (customConnectorOAuthValidationErrorValidate == null) {
                return new CustomConnectorConfigResolution.Success(new CustomConnectorResolvedConfig.OAuth(customConnectorOAuthConfig));
            }
            strA0Y = AnonymousClass006.A0x(customConnectorOAuthValidationErrorValidate);
            str = "oauth_config_validation_failed";
        } else {
            strA0Y = C3cI.A0Y(thA00);
            str = "oauth_config_parse_failed";
        }
        return new CustomConnectorConfigResolution.Failure(str, strA0Y);
    }
}
