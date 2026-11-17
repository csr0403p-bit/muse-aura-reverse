package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class NtpUpsellChoiceRowUiState extends C06G {
    public static final int $stable = 0;
    public final NativeLoginAccountUiModel account;
    public final String id;
    public final HatchTwoFactorSourceApp sourceApp;

    public NtpUpsellChoiceRowUiState(String str, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.sourceApp = hatchTwoFactorSourceApp;
        this.account = nativeLoginAccountUiModel;
    }

    public final NtpUpsellChoiceRowUiState copy(String str, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        C7384Etj.A0Y(str, 0);
        return new NtpUpsellChoiceRowUiState(str, hatchTwoFactorSourceApp, nativeLoginAccountUiModel);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NtpUpsellChoiceRowUiState) {
                NtpUpsellChoiceRowUiState ntpUpsellChoiceRowUiState = (NtpUpsellChoiceRowUiState) obj;
                if (!C7384Etj.areEqual(this.id, ntpUpsellChoiceRowUiState.id) || this.sourceApp != ntpUpsellChoiceRowUiState.sourceApp || !C7384Etj.areEqual(this.account, ntpUpsellChoiceRowUiState.account)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NtpUpsellChoiceRowUiState copy$default(NtpUpsellChoiceRowUiState ntpUpsellChoiceRowUiState, String str, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, NativeLoginAccountUiModel nativeLoginAccountUiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ntpUpsellChoiceRowUiState.id;
        }
        if ((i & 2) != 0) {
            hatchTwoFactorSourceApp = ntpUpsellChoiceRowUiState.sourceApp;
        }
        if ((i & 4) != 0) {
            nativeLoginAccountUiModel = ntpUpsellChoiceRowUiState.account;
        }
        return ntpUpsellChoiceRowUiState.copy(str, hatchTwoFactorSourceApp, nativeLoginAccountUiModel);
    }

    public final String component1() {
        return this.id;
    }

    public final HatchTwoFactorSourceApp component2() {
        return this.sourceApp;
    }

    public final NativeLoginAccountUiModel component3() {
        return this.account;
    }

    public final NativeLoginAccountUiModel getAccount() {
        return this.account;
    }

    public final String getId() {
        return this.id;
    }

    public final HatchTwoFactorSourceApp getSourceApp() {
        return this.sourceApp;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.id) + AnonymousClass006.A0D(this.sourceApp)) * 31) + C06G.A04(this.account);
    }

    public String toString() {
        return super.toString();
    }
}
