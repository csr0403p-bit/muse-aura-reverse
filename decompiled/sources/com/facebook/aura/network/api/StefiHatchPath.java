package com.facebook.aura.network.api;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFI;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.F60;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface StefiHatchPath extends StefiPath {

    /* loaded from: classes4.dex */
    public final class AcceptChannelTos implements StefiHatchPath {
        public static final AcceptChannelTos INSTANCE = new AcceptChannelTos();
        public static final String value = "/hatch/accept-channel-tos";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AcceptChannelTos);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AcceptChannelTos";
        }

        public int hashCode() {
            return 1713482345;
        }
    }

    /* loaded from: classes4.dex */
    public final class AcceptTos implements StefiHatchPath {
        public static final AcceptTos INSTANCE = new AcceptTos();
        public static final String value = "/hatch/accept_tos";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AcceptTos);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AcceptTos";
        }

        public int hashCode() {
            return -69439804;
        }
    }

    /* loaded from: classes2.dex */
    public final class ActivationStatuses implements StefiHatchPath {
        public final List<String> supportedReTosPresentations;

        public ActivationStatuses(List<String> list) {
            C7384Etj.A0Y(list, 0);
            this.supportedReTosPresentations = list;
        }

        public final ActivationStatuses copy(List<String> list) {
            C7384Etj.A0Y(list, 0);
            return new ActivationStatuses(list);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ActivationStatuses) && C7384Etj.areEqual(this.supportedReTosPresentations, ((ActivationStatuses) obj).supportedReTosPresentations));
        }

        public static /* synthetic */ ActivationStatuses copy$default(ActivationStatuses activationStatuses, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = activationStatuses.supportedReTosPresentations;
            }
            C7384Etj.A0Y(list, 0);
            return new ActivationStatuses(list);
        }

        public final List<String> component1() {
            return this.supportedReTosPresentations;
        }

        public final List<String> getSupportedReTosPresentations() {
            return this.supportedReTosPresentations;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            List<String> list = this.supportedReTosPresentations;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            int i = 0;
            for (String str : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                arrayListA0i.add(FGI.A0U(Uri.encode(FGI.A0I("supported_retos_presentations[", i, "]")), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, Uri.encode(str)));
                i = i2;
            }
            return AbstractC0878AGe.A0L("&", "/hatch/activation_statuses?", "", arrayListA0i, null);
        }

        public int hashCode() {
            return this.supportedReTosPresentations.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("ActivationStatuses(supportedReTosPresentations=", this.supportedReTosPresentations);
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthCancelDeletion implements StefiHatchPath {
        public static final AuthCancelDeletion INSTANCE = new AuthCancelDeletion();
        public static final String value = "/hatch/auth/cancel_deletion";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthCancelDeletion);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthCancelDeletion";
        }

        public int hashCode() {
            return -1311052004;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthConfirmOtp implements StefiHatchPath {
        public static final AuthConfirmOtp INSTANCE = new AuthConfirmOtp();
        public static final String value = "/hatch/auth/confirm_otp";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthConfirmOtp);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthConfirmOtp";
        }

        public int hashCode() {
            return -405871361;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthConfirmPasskey implements StefiHatchPath {
        public static final AuthConfirmPasskey INSTANCE = new AuthConfirmPasskey();
        public static final String value = "/hatch/auth/confirm_passkey";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthConfirmPasskey);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthConfirmPasskey";
        }

        public int hashCode() {
            return 10526850;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthConfirmPassword implements StefiHatchPath {
        public static final AuthConfirmPassword INSTANCE = new AuthConfirmPassword();
        public static final String value = "/hatch/auth/confirm_password";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthConfirmPassword);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthConfirmPassword";
        }

        public int hashCode() {
            return 326699335;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthDblLogin implements StefiHatchPath {
        public static final AuthDblLogin INSTANCE = new AuthDblLogin();
        public static final String value = "/hatch/auth/dbl_login";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthDblLogin);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthDblLogin";
        }

        public int hashCode() {
            return 1524843023;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthDblProvision implements StefiHatchPath {
        public static final AuthDblProvision INSTANCE = new AuthDblProvision();
        public static final String value = "/hatch/auth/dbl_provision";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthDblProvision);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthDblProvision";
        }

        public int hashCode() {
            return 441133179;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthLoginOptions implements StefiHatchPath {
        public static final AuthLoginOptions INSTANCE = new AuthLoginOptions();
        public static final String value = "/hatch/auth/login_options";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthLoginOptions);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthLoginOptions";
        }

        public int hashCode() {
            return 1455580841;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthRegisterCompletion implements StefiHatchPath {
        public static final AuthRegisterCompletion INSTANCE = new AuthRegisterCompletion();
        public static final String value = "/hatch/auth/register_completion";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthRegisterCompletion);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthRegisterCompletion";
        }

        public int hashCode() {
            return -1307355245;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthRegisterCompletionLinked implements StefiHatchPath {
        public static final AuthRegisterCompletionLinked INSTANCE = new AuthRegisterCompletionLinked();
        public static final String value = "/hatch/auth/register_completion_linked";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthRegisterCompletionLinked);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthRegisterCompletionLinked";
        }

        public int hashCode() {
            return -1110069364;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthRemoveCrossAppAccount implements StefiHatchPath {
        public static final AuthRemoveCrossAppAccount INSTANCE = new AuthRemoveCrossAppAccount();
        public static final String value = "/hatch/auth/remove_cross_app_account";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthRemoveCrossAppAccount);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthRemoveCrossAppAccount";
        }

        public int hashCode() {
            return 96220884;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthRemoveSavedAccount implements StefiHatchPath {
        public static final AuthRemoveSavedAccount INSTANCE = new AuthRemoveSavedAccount();
        public static final String value = "/hatch/auth/remove_saved_account";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthRemoveSavedAccount);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthRemoveSavedAccount";
        }

        public int hashCode() {
            return -936551170;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthSaveAccount implements StefiHatchPath {
        public static final AuthSaveAccount INSTANCE = new AuthSaveAccount();
        public static final String value = "/hatch/auth/save_account";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthSaveAccount);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthSaveAccount";
        }

        public int hashCode() {
            return -528043076;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthSavedAccounts implements StefiHatchPath {
        public static final AuthSavedAccounts INSTANCE = new AuthSavedAccounts();
        public static final String value = "/hatch/auth/saved_accounts";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthSavedAccounts);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthSavedAccounts";
        }

        public int hashCode() {
            return 1045454425;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthSelectAccount implements StefiHatchPath {
        public static final AuthSelectAccount INSTANCE = new AuthSelectAccount();
        public static final String value = "/hatch/auth/select_account";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthSelectAccount);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthSelectAccount";
        }

        public int hashCode() {
            return -1568677795;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthSendOtp implements StefiHatchPath {
        public static final AuthSendOtp INSTANCE = new AuthSendOtp();
        public static final String value = "/hatch/auth/send_otp";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthSendOtp);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthSendOtp";
        }

        public int hashCode() {
            return -1651496369;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthSendSavedAccountOtp implements StefiHatchPath {
        public static final AuthSendSavedAccountOtp INSTANCE = new AuthSendSavedAccountOtp();
        public static final String value = "/hatch/auth/send_saved_account_otp";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthSendSavedAccountOtp);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthSendSavedAccountOtp";
        }

        public int hashCode() {
            return -1820994359;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthSsoAccountInfo implements StefiHatchPath {
        public static final AuthSsoAccountInfo INSTANCE = new AuthSsoAccountInfo();
        public static final String value = "/hatch/auth/sso_account_info";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthSsoAccountInfo);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthSsoAccountInfo";
        }

        public int hashCode() {
            return 2091184544;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthSsoExchange implements StefiHatchPath {
        public static final AuthSsoExchange INSTANCE = new AuthSsoExchange();
        public static final String value = "/hatch/auth/sso_exchange";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthSsoExchange);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthSsoExchange";
        }

        public int hashCode() {
            return 1633860382;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthStart implements StefiHatchPath {
        public static final AuthStart INSTANCE = new AuthStart();
        public static final String value = "/hatch/auth/start";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthStart);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthStart";
        }

        public int hashCode() {
            return -796813522;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthTwoFactor implements StefiHatchPath {
        public static final AuthTwoFactor INSTANCE = new AuthTwoFactor();
        public static final String value = "/hatch/auth/two_factor";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthTwoFactor);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthTwoFactor";
        }

        public int hashCode() {
            return 1593002887;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthTwoFactorSendCode implements StefiHatchPath {
        public static final AuthTwoFactorSendCode INSTANCE = new AuthTwoFactorSendCode();
        public static final String value = "/hatch/auth/two_factor/send_code";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthTwoFactorSendCode);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthTwoFactorSendCode";
        }

        public int hashCode() {
            return 1186735676;
        }
    }

    /* loaded from: classes2.dex */
    public final class AuthZariExchange implements StefiHatchPath {
        public static final AuthZariExchange INSTANCE = new AuthZariExchange();
        public static final String value = "/hatch/auth/zari_exchange";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthZariExchange);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AuthZariExchange";
        }

        public int hashCode() {
            return -602729579;
        }
    }

    /* loaded from: classes4.dex */
    public final class ColdLeaseCvm implements StefiHatchPath {
        public static final ColdLeaseCvm INSTANCE = new ColdLeaseCvm();
        public static final String value = "/hatch/cold-lease-cvm";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ColdLeaseCvm);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ColdLeaseCvm";
        }

        public int hashCode() {
            return -962304880;
        }
    }

    /* loaded from: classes4.dex */
    public final class CvmChipAllowlist implements StefiHatchPath {
        public final String envId;

        public CvmChipAllowlist(String str) {
            C7384Etj.A0Y(str, 0);
            this.envId = str;
        }

        public final CvmChipAllowlist copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new CvmChipAllowlist(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof CvmChipAllowlist) && C7384Etj.areEqual(this.envId, ((CvmChipAllowlist) obj).envId));
        }

        public static /* synthetic */ CvmChipAllowlist copy$default(CvmChipAllowlist cvmChipAllowlist, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cvmChipAllowlist.envId;
            }
            C7384Etj.A0Y(str, 0);
            return new CvmChipAllowlist(str);
        }

        public final String component1() {
            return this.envId;
        }

        public final String getEnvId() {
            return this.envId;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/hatch/cvm-chip-allowlist?env_id=", Uri.encode(this.envId));
        }

        public int hashCode() {
            return this.envId.hashCode();
        }

        public String toString() {
            return C60O.A0r("CvmChipAllowlist(envId=", this.envId);
        }
    }

    /* loaded from: classes4.dex */
    public final class CvmChipSelection implements StefiHatchPath {
        public static final CvmChipSelection INSTANCE = new CvmChipSelection();
        public static final String value = "/hatch/cvm-chip-selection";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CvmChipSelection);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CvmChipSelection";
        }

        public int hashCode() {
            return 1140890706;
        }
    }

    /* loaded from: classes2.dex */
    public final class CvmReplaceState implements StefiHatchPath {
        public final String envId;

        public CvmReplaceState(String str) {
            C7384Etj.A0Y(str, 0);
            this.envId = str;
        }

        public final CvmReplaceState copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new CvmReplaceState(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof CvmReplaceState) && C7384Etj.areEqual(this.envId, ((CvmReplaceState) obj).envId));
        }

        public static /* synthetic */ CvmReplaceState copy$default(CvmReplaceState cvmReplaceState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cvmReplaceState.envId;
            }
            C7384Etj.A0Y(str, 0);
            return new CvmReplaceState(str);
        }

        public final String component1() {
            return this.envId;
        }

        public final String getEnvId() {
            return this.envId;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/hatch/cvm-replace-state?env_id=", this.envId);
        }

        public int hashCode() {
            return this.envId.hashCode();
        }

        public String toString() {
            return FGI.A0U("CvmReplaceState(envId=", this.envId, ")");
        }
    }

    /* loaded from: classes4.dex */
    public final class DebugResetActivation implements StefiHatchPath {
        public static final DebugResetActivation INSTANCE = new DebugResetActivation();
        public static final String value = "/hatch/debug/reset_activation";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DebugResetActivation);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "DebugResetActivation";
        }

        public int hashCode() {
            return -320628514;
        }
    }

    /* loaded from: classes4.dex */
    public final class DebugResetInviteCodeRedemption implements StefiHatchPath {
        public static final DebugResetInviteCodeRedemption INSTANCE = new DebugResetInviteCodeRedemption();
        public static final String value = "/hatch/debug/reset_invite_code_redemption";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DebugResetInviteCodeRedemption);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "DebugResetInviteCodeRedemption";
        }

        public int hashCode() {
            return 1393239337;
        }
    }

    /* loaded from: classes4.dex */
    public final class DestroyAndReleaseVm implements StefiHatchPath {
        public static final DestroyAndReleaseVm INSTANCE = new DestroyAndReleaseVm();
        public static final String value = "/hatch/destroy_and_release_vm";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DestroyAndReleaseVm);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "DestroyAndReleaseVm";
        }

        public int hashCode() {
            return -1283927883;
        }
    }

    /* loaded from: classes4.dex */
    public final class DestroyEnvAndReplaceWithNewEnv implements StefiHatchPath {
        public static final DestroyEnvAndReplaceWithNewEnv INSTANCE = new DestroyEnvAndReplaceWithNewEnv();
        public static final String value = "/hatch/destroy_env_and_replace_with_new_env";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DestroyEnvAndReplaceWithNewEnv);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "DestroyEnvAndReplaceWithNewEnv";
        }

        public int hashCode() {
            return -1035775889;
        }
    }

    /* loaded from: classes4.dex */
    public final class EnableVm implements StefiHatchPath {
        public static final EnableVm INSTANCE = new EnableVm();
        public static final String value = "/hatch/enable_vm";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableVm);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "EnableVm";
        }

        public int hashCode() {
            return -92847738;
        }
    }

    /* loaded from: classes3.dex */
    public final class EntryContextResolve implements StefiHatchPath {
        public static final EntryContextResolve INSTANCE = new EntryContextResolve();
        public static final String value = "/hatch/entry-context/resolve";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EntryContextResolve);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "EntryContextResolve";
        }

        public int hashCode() {
            return -815725341;
        }
    }

    public interface Extension extends StefiHatchPath {
    }

    public final class Feedback implements StefiHatchPath {
        public static final Feedback INSTANCE = new Feedback();
        public static final String value = "/hatch/feedback";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Feedback);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Feedback";
        }

        public int hashCode() {
            return -1926540943;
        }
    }

    public final class FeedbackConfig implements StefiHatchPath {
        public static final FeedbackConfig INSTANCE = new FeedbackConfig();
        public static final String value = "/hatch/feedback/config";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FeedbackConfig);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FeedbackConfig";
        }

        public int hashCode() {
            return 1810835475;
        }
    }

    /* loaded from: classes4.dex */
    public final class FetchVms implements StefiHatchPath {
        public static final FetchVms INSTANCE = new FetchVms();
        public static final String value = "/hatch/fetch_vms?notary_token=true";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FetchVms);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FetchVms";
        }

        public int hashCode() {
            return -1497858706;
        }
    }

    /* loaded from: classes4.dex */
    public final class HelpTicket implements StefiHatchPath {
        public static final HelpTicket INSTANCE = new HelpTicket();
        public static final String value = "/hatch/help_ticket";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpTicket);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "HelpTicket";
        }

        public int hashCode() {
            return 313494681;
        }
    }

    public final class HelpTicketTopics implements StefiHatchPath {
        public static final HelpTicketTopics INSTANCE = new HelpTicketTopics();
        public static final String value = "/hatch/help_ticket/topics";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpTicketTopics);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "HelpTicketTopics";
        }

        public int hashCode() {
            return 790084381;
        }
    }

    /* loaded from: classes4.dex */
    public final class Invite implements StefiHatchPath {
        public static final Invite INSTANCE = new Invite();
        public static final String value = "/hatch/invite";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Invite);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Invite";
        }

        public int hashCode() {
            return 767565813;
        }
    }

    /* loaded from: classes4.dex */
    public final class InviteCodeGenerate implements StefiHatchPath {
        public static final InviteCodeGenerate INSTANCE = new InviteCodeGenerate();
        public static final String value = "/hatch/invite_code/generate";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InviteCodeGenerate);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "InviteCodeGenerate";
        }

        public int hashCode() {
            return -1660348649;
        }
    }

    /* loaded from: classes4.dex */
    public final class InviteCodeRedeem implements StefiHatchPath {
        public static final InviteCodeRedeem INSTANCE = new InviteCodeRedeem();
        public static final String value = "/hatch/invite_code/redeem";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InviteCodeRedeem);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "InviteCodeRedeem";
        }

        public int hashCode() {
            return 1805630398;
        }
    }

    /* loaded from: classes4.dex */
    public final class IssueAcsToken implements StefiHatchPath {
        public static final IssueAcsToken INSTANCE = new IssueAcsToken();
        public static final String value = "/hatch/v1/acs/issue_token";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof IssueAcsToken);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "IssueAcsToken";
        }

        public int hashCode() {
            return 1456969077;
        }
    }

    /* loaded from: classes4.dex */
    public final class LeaseVm implements StefiHatchPath {
        public static final LeaseVm INSTANCE = new LeaseVm();
        public static final String value = "/hatch/lease_vm";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LeaseVm);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "LeaseVm";
        }

        public int hashCode() {
            return 410474309;
        }
    }

    /* loaded from: classes4.dex */
    public final class Login implements StefiHatchPath {
        public static final Login INSTANCE = new Login();
        public static final String value = "/hatch/login";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Login);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Login";
        }

        public int hashCode() {
            return -249548547;
        }
    }

    /* loaded from: classes4.dex */
    public final class Logout implements StefiHatchPath {
        public static final Logout INSTANCE = new Logout();
        public static final String value = "/hatch/logout";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Logout);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Logout";
        }

        public int hashCode() {
            return 853935734;
        }
    }

    /* loaded from: classes3.dex */
    public final class MintCloudflareSpacesViewerToken implements StefiHatchPath {
        public static final MintCloudflareSpacesViewerToken INSTANCE = new MintCloudflareSpacesViewerToken();
        public static final String value = "/hatch/mint_cloudflare_spaces_viewer_token";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MintCloudflareSpacesViewerToken);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "MintCloudflareSpacesViewerToken";
        }

        public int hashCode() {
            return 237871539;
        }
    }

    /* loaded from: classes3.dex */
    public final class OnboardingAssetsCdnUrls implements StefiHatchPath {
        public static final OnboardingAssetsCdnUrls INSTANCE = new OnboardingAssetsCdnUrls();
        public static final String value = "/hatch/onboarding/assets/cdn-urls";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OnboardingAssetsCdnUrls);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "OnboardingAssetsCdnUrls";
        }

        public int hashCode() {
            return -389792793;
        }
    }

    /* loaded from: classes4.dex */
    public final class OneClickAgreement implements StefiHatchPath {
        public final String nonceCode;
        public final String recipientViewId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof OneClickAgreement) {
                    OneClickAgreement oneClickAgreement = (OneClickAgreement) obj;
                    if (!C7384Etj.areEqual(this.recipientViewId, oneClickAgreement.recipientViewId) || !C7384Etj.areEqual(this.nonceCode, oneClickAgreement.nonceCode)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ OneClickAgreement copy$default(OneClickAgreement oneClickAgreement, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = oneClickAgreement.recipientViewId;
            }
            if ((i & 2) != 0) {
                str2 = oneClickAgreement.nonceCode;
            }
            AnonymousClass003.A0u(str, str2);
            return new OneClickAgreement(str, str2);
        }

        public final String component1() {
            return this.recipientViewId;
        }

        public final String component2() {
            return this.nonceCode;
        }

        public final String getNonceCode() {
            return this.nonceCode;
        }

        public final String getRecipientViewId() {
            return this.recipientViewId;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0d("/agreements/", this.recipientViewId, CustomConnectorRegisterRepositoryKt.ROOT_PATH, this.nonceCode);
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.nonceCode, AnonymousClass001.A0G(this.recipientViewId));
        }

        public String toString() {
            return FGI.A0h("OneClickAgreement(recipientViewId=", this.recipientViewId, ", nonceCode=", this.nonceCode, ")");
        }

        public OneClickAgreement(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.recipientViewId = str;
            this.nonceCode = str2;
        }

        public final OneClickAgreement copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new OneClickAgreement(str, str2);
        }
    }

    /* loaded from: classes4.dex */
    public final class OneClickAgreementAccept implements StefiHatchPath {
        public final String nonceCode;
        public final String recipientViewId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof OneClickAgreementAccept) {
                    OneClickAgreementAccept oneClickAgreementAccept = (OneClickAgreementAccept) obj;
                    if (!C7384Etj.areEqual(this.recipientViewId, oneClickAgreementAccept.recipientViewId) || !C7384Etj.areEqual(this.nonceCode, oneClickAgreementAccept.nonceCode)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ OneClickAgreementAccept copy$default(OneClickAgreementAccept oneClickAgreementAccept, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = oneClickAgreementAccept.recipientViewId;
            }
            if ((i & 2) != 0) {
                str2 = oneClickAgreementAccept.nonceCode;
            }
            AnonymousClass003.A0u(str, str2);
            return new OneClickAgreementAccept(str, str2);
        }

        public final String component1() {
            return this.recipientViewId;
        }

        public final String component2() {
            return this.nonceCode;
        }

        public final String getNonceCode() {
            return this.nonceCode;
        }

        public final String getRecipientViewId() {
            return this.recipientViewId;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0h("/agreements/", this.recipientViewId, CustomConnectorRegisterRepositoryKt.ROOT_PATH, this.nonceCode, "/accept");
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.nonceCode, AnonymousClass001.A0G(this.recipientViewId));
        }

        public String toString() {
            return FGI.A0h("OneClickAgreementAccept(recipientViewId=", this.recipientViewId, ", nonceCode=", this.nonceCode, ")");
        }

        public OneClickAgreementAccept(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.recipientViewId = str;
            this.nonceCode = str2;
        }

        public final OneClickAgreementAccept copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new OneClickAgreementAccept(str, str2);
        }
    }

    /* loaded from: classes4.dex */
    public final class PttEncryptionKey implements StefiHatchPath {
        public static final PttEncryptionKey INSTANCE = new PttEncryptionKey();
        public static final String value = "/hatch/ptt/encryption-key";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PttEncryptionKey);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "PttEncryptionKey";
        }

        public int hashCode() {
            return -810958664;
        }
    }

    /* loaded from: classes4.dex */
    public final class Raw implements StefiHatchPath {
        public final String value;

        public Raw(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final Raw copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Raw(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Raw) && C7384Etj.areEqual(this.value, ((Raw) obj).value));
        }

        public static /* synthetic */ Raw copy$default(Raw raw, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = raw.value;
            }
            C7384Etj.A0Y(str, 0);
            return new Raw(str);
        }

        public final String component1() {
            return this.value;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return C60O.A0r("Raw(value=", this.value);
        }
    }

    /* loaded from: classes4.dex */
    public final class RefreshAccessToken implements StefiHatchPath {
        public static final RefreshAccessToken INSTANCE = new RefreshAccessToken();
        public static final String value = "/hatch/refresh_access_token";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RefreshAccessToken);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "RefreshAccessToken";
        }

        public int hashCode() {
            return -431353850;
        }
    }

    /* loaded from: classes2.dex */
    public final class SharingRecipients implements StefiHatchPath {
        public final boolean excludeOnboardedHatchUsers;
        public final boolean includeGroupMembers;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SharingRecipients) {
                    SharingRecipients sharingRecipients = (SharingRecipients) obj;
                    if (this.excludeOnboardedHatchUsers != sharingRecipients.excludeOnboardedHatchUsers || this.includeGroupMembers != sharingRecipients.includeGroupMembers) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SharingRecipients copy$default(SharingRecipients sharingRecipients, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = sharingRecipients.excludeOnboardedHatchUsers;
            }
            if ((i & 2) != 0) {
                z2 = sharingRecipients.includeGroupMembers;
            }
            return new SharingRecipients(z, z2);
        }

        public final boolean component1() {
            return this.excludeOnboardedHatchUsers;
        }

        public final boolean component2() {
            return this.includeGroupMembers;
        }

        public final SharingRecipients copy(boolean z, boolean z2) {
            return new SharingRecipients(z, z2);
        }

        public final boolean getExcludeOnboardedHatchUsers() {
            return this.excludeOnboardedHatchUsers;
        }

        public final boolean getIncludeGroupMembers() {
            return this.includeGroupMembers;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            List listA0F = BFI.A0F(new String[]{this.excludeOnboardedHatchUsers ? "exclude_onboarded_hatch_users=true" : null, this.includeGroupMembers ? "include_group_members=true" : null});
            return listA0F.isEmpty() ? "/hatch/sharing/recipients" : FGI.A0M("/hatch/sharing/recipients?", C3cH.A0e("&", listA0F));
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A02(this.excludeOnboardedHatchUsers), this.includeGroupMembers);
        }

        public String toString() {
            return FGI.A0p("SharingRecipients(excludeOnboardedHatchUsers=", ", includeGroupMembers=", ")", this.excludeOnboardedHatchUsers, this.includeGroupMembers);
        }

        public SharingRecipients(boolean z, boolean z2) {
            this.excludeOnboardedHatchUsers = z;
            this.includeGroupMembers = z2;
        }

        public /* synthetic */ SharingRecipients(boolean z, boolean z2, int i, C06H c06h) {
            this(z, AnonymousClass001.A1Q(i, z2));
        }
    }

    /* loaded from: classes2.dex */
    public final class TosStatus implements StefiHatchPath {
        public static final TosStatus INSTANCE = new TosStatus();
        public static final String value = "/hatch/tos_status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TosStatus);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "TosStatus";
        }

        public int hashCode() {
            return 190542590;
        }
    }

    /* loaded from: classes2.dex */
    public final class ViewerProfile implements StefiHatchPath {
        public static final ViewerProfile INSTANCE = new ViewerProfile();
        public static final String value = "/hatch/viewer/profile";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewerProfile);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ViewerProfile";
        }

        public int hashCode() {
            return -546945845;
        }
    }

    /* loaded from: classes4.dex */
    public final class ViewerSubscription implements StefiHatchPath {
        public final boolean isIacBilling;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ViewerSubscription) && this.isIacBilling == ((ViewerSubscription) obj).isIacBilling);
        }

        public static /* synthetic */ ViewerSubscription copy$default(ViewerSubscription viewerSubscription, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = viewerSubscription.isIacBilling;
            }
            return new ViewerSubscription(z);
        }

        public final boolean component1() {
            return this.isIacBilling;
        }

        public final ViewerSubscription copy(boolean z) {
            return new ViewerSubscription(z);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/hatch/subscription?include=agreement,offers&", StefiHatchPathKt.paymentType(this.isIacBilling));
        }

        public int hashCode() {
            return this.isIacBilling ? 1231 : 1237;
        }

        public final boolean isIacBilling() {
            return this.isIacBilling;
        }

        public String toString() {
            return FGI.A0q("ViewerSubscription(isIacBilling=", ")", this.isIacBilling);
        }

        public ViewerSubscription(boolean z) {
            this.isIacBilling = z;
        }
    }

    /* loaded from: classes4.dex */
    public final class WaitlistJoin implements StefiHatchPath {
        public static final WaitlistJoin INSTANCE = new WaitlistJoin();
        public static final String value = "/hatch/waitlist/join";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WaitlistJoin);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "WaitlistJoin";
        }

        public int hashCode() {
            return -1847173303;
        }
    }

    /* loaded from: classes4.dex */
    public final class WakeVm implements StefiHatchPath {
        public static final WakeVm INSTANCE = new WakeVm();
        public static final String value = "/hatch/vm/wake";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WakeVm);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "WakeVm";
        }

        public int hashCode() {
            return 1156035687;
        }
    }
}
