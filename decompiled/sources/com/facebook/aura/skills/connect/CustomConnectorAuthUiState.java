package com.facebook.aura.skills.connect;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.skills.connect.config.CustomConnectorMode;

/* loaded from: classes.dex */
public final class CustomConnectorAuthUiState extends C06G {
    public static final int $stable = 0;
    public final boolean addEnabled;
    public final String apiKey;
    public final String clientId;
    public final String clientSecret;
    public final String connectorDisplayName;
    public final String connectorHost;
    public final String connectorName;
    public final boolean isInvalidLink;
    public final boolean isSubmitting;
    public final CustomConnectorMode mode;
    public final boolean requiresClientSecret;
    public final boolean showRetryableError;

    public CustomConnectorAuthUiState() {
        this(null, "", "", "", "", "", "", false, false, false, false, false);
    }

    public final CustomConnectorAuthUiState copy(CustomConnectorMode customConnectorMode, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C7384Etj.A0Y(str, 1);
        AnonymousClass005.A16(str2, str3, str4, str5, 2);
        C7384Etj.A0Y(str6, 6);
        return new CustomConnectorAuthUiState(customConnectorMode, str, str2, str3, str4, str5, str6, z, z2, z3, z4, z5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorAuthUiState) {
                CustomConnectorAuthUiState customConnectorAuthUiState = (CustomConnectorAuthUiState) obj;
                if (this.mode != customConnectorAuthUiState.mode || !C7384Etj.areEqual(this.connectorName, customConnectorAuthUiState.connectorName) || !C7384Etj.areEqual(this.connectorDisplayName, customConnectorAuthUiState.connectorDisplayName) || !C7384Etj.areEqual(this.connectorHost, customConnectorAuthUiState.connectorHost) || !C7384Etj.areEqual(this.apiKey, customConnectorAuthUiState.apiKey) || !C7384Etj.areEqual(this.clientId, customConnectorAuthUiState.clientId) || !C7384Etj.areEqual(this.clientSecret, customConnectorAuthUiState.clientSecret) || this.requiresClientSecret != customConnectorAuthUiState.requiresClientSecret || this.isSubmitting != customConnectorAuthUiState.isSubmitting || this.isInvalidLink != customConnectorAuthUiState.isInvalidLink || this.showRetryableError != customConnectorAuthUiState.showRetryableError || this.addEnabled != customConnectorAuthUiState.addEnabled) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorAuthUiState copy$default(CustomConnectorAuthUiState customConnectorAuthUiState, CustomConnectorMode customConnectorMode, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            customConnectorMode = customConnectorAuthUiState.mode;
        }
        if ((i & 2) != 0) {
            str = customConnectorAuthUiState.connectorName;
        }
        if ((i & 4) != 0) {
            str2 = customConnectorAuthUiState.connectorDisplayName;
        }
        if ((i & 8) != 0) {
            str3 = customConnectorAuthUiState.connectorHost;
        }
        if ((i & 16) != 0) {
            str4 = customConnectorAuthUiState.apiKey;
        }
        if ((i & 32) != 0) {
            str5 = customConnectorAuthUiState.clientId;
        }
        if ((i & 64) != 0) {
            str6 = customConnectorAuthUiState.clientSecret;
        }
        if ((i & 128) != 0) {
            z = customConnectorAuthUiState.requiresClientSecret;
        }
        if ((i & 256) != 0) {
            z2 = customConnectorAuthUiState.isSubmitting;
        }
        if ((i & 512) != 0) {
            z3 = customConnectorAuthUiState.isInvalidLink;
        }
        if ((i & 1024) != 0) {
            z4 = customConnectorAuthUiState.showRetryableError;
        }
        if ((i & 2048) != 0) {
            z5 = customConnectorAuthUiState.addEnabled;
        }
        return customConnectorAuthUiState.copy(customConnectorMode, str, str2, str3, str4, str5, str6, z, z2, z3, z4, z5);
    }

    public final CustomConnectorMode component1() {
        return this.mode;
    }

    public final boolean component10() {
        return this.isInvalidLink;
    }

    public final boolean component11() {
        return this.showRetryableError;
    }

    public final boolean component12() {
        return this.addEnabled;
    }

    public final String component2() {
        return this.connectorName;
    }

    public final String component3() {
        return this.connectorDisplayName;
    }

    public final String component4() {
        return this.connectorHost;
    }

    public final String component5() {
        return this.apiKey;
    }

    public final String component6() {
        return this.clientId;
    }

    public final String component7() {
        return this.clientSecret;
    }

    public final boolean component8() {
        return this.requiresClientSecret;
    }

    public final boolean component9() {
        return this.isSubmitting;
    }

    public final boolean getAddEnabled() {
        return this.addEnabled;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getConnectorDisplayName() {
        return this.connectorDisplayName;
    }

    public final String getConnectorHost() {
        return this.connectorHost;
    }

    public final String getConnectorName() {
        return this.connectorName;
    }

    public final CustomConnectorMode getMode() {
        return this.mode;
    }

    public final boolean getRequiresClientSecret() {
        return this.requiresClientSecret;
    }

    public final boolean getShowRetryableError() {
        return this.showRetryableError;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.clientSecret, AnonymousClass005.A0I(this.clientId, AnonymousClass005.A0I(this.apiKey, AnonymousClass005.A0I(this.connectorHost, AnonymousClass005.A0I(this.connectorDisplayName, AnonymousClass005.A0I(this.connectorName, AnonymousClass006.A0D(this.mode) * 31)))))), this.requiresClientSecret), this.isSubmitting), this.isInvalidLink), this.showRetryableError), this.addEnabled);
    }

    public final boolean isInvalidLink() {
        return this.isInvalidLink;
    }

    public final boolean isSubmitting() {
        return this.isSubmitting;
    }

    public String toString() {
        return super.toString();
    }

    public CustomConnectorAuthUiState(CustomConnectorMode customConnectorMode, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C7384Etj.A0Y(str, 1);
        AnonymousClass005.A16(str2, str3, str4, str5, 2);
        C7384Etj.A0Y(str6, 6);
        this.mode = customConnectorMode;
        this.connectorName = str;
        this.connectorDisplayName = str2;
        this.connectorHost = str3;
        this.apiKey = str4;
        this.clientId = str5;
        this.clientSecret = str6;
        this.requiresClientSecret = z;
        this.isSubmitting = z2;
        this.isInvalidLink = z3;
        this.showRetryableError = z4;
        this.addEnabled = z5;
    }

    public /* synthetic */ CustomConnectorAuthUiState(CustomConnectorMode customConnectorMode, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, C06H c06h) {
        this((i & 1) != 0 ? null : customConnectorMode, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? false : z5);
    }
}
