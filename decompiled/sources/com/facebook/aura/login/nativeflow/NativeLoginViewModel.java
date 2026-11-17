package com.facebook.aura.login.nativeflow;

import X.AEs;
import X.AEu;
import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC10623Hzj;
import X.AbstractC2159Azp;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass602;
import X.BLG;
import X.BLL;
import X.BQG;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C10533Hqc;
import X.C10550Hrx;
import X.C10571Hud;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C6ys;
import X.C7384Etj;
import X.C7438Evz;
import X.C79;
import X.C7BY;
import X.C8j2;
import X.C9286GCn;
import X.C9jH;
import X.C9tI;
import X.CFK;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.GAo;
import X.GCV;
import X.GDB;
import X.HoC;
import X.Hr7;
import X.HsJ;
import X.HtJ;
import X.Hu1;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.HzR;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext;
import com.facebook.aura.analytics.hatch.caa.HatchCaaEntryPoint;
import com.facebook.aura.analytics.hatch.caa.HatchCaaErrorType;
import com.facebook.aura.analytics.hatch.caa.HatchCaaEventFlow;
import com.facebook.aura.analytics.hatch.caa.HatchCaaFailure;
import com.facebook.aura.analytics.hatch.caa.HatchCaaFlowSource;
import com.facebook.aura.analytics.hatch.caa.HatchCaaLoginCredentialType;
import com.facebook.aura.analytics.hatch.caa.HatchCaaLoginEventStep;
import com.facebook.aura.analytics.hatch.caa.HatchCaaLoginLogger;
import com.facebook.aura.analytics.hatch.caa.HatchCaaLoginSource;
import com.facebook.aura.analytics.hatch.caa.HatchCaaNtmSwitchReason;
import com.facebook.aura.analytics.hatch.caa.HatchCaaNtpSourcePlatform;
import com.facebook.aura.analytics.hatch.caa.HatchCaaRegionalTos;
import com.facebook.aura.analytics.hatch.caa.HatchCaaRegistrationEventStep;
import com.facebook.aura.analytics.hatch.caa.HatchCaaRegistrationLogger;
import com.facebook.aura.analytics.hatch.caa.HatchCaaRegistrationSource;
import com.facebook.aura.analytics.hatch.passkey.HatchPasskeyErrorType;
import com.facebook.aura.analytics.hatch.passkey.HatchPasskeyEvent;
import com.facebook.aura.analytics.hatch.passkey.HatchPasskeyLogger;
import com.facebook.aura.attribution.HatchAttributionReporter;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.auth.AuraTokenExchanger;
import com.facebook.aura.auth.NativeAuthResult;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerConfig;
import com.facebook.aura.auth.encryption.AuraPasswordEncryptionHelper;
import com.facebook.aura.avatarassets.appearance.MC;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.commands.sms.PhoneNormalizer;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.components.phone.CountryDialCode;
import com.facebook.aura.components.phone.CountryDialCodesKt;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.login.api.LoginMethod;
import com.facebook.aura.login.credentials.AuraOneTapLoginStore;
import com.facebook.aura.login.credentials.AuraRememberedAccount;
import com.facebook.aura.login.credentials.AuraRememberedAccountsStore;
import com.facebook.aura.login.nativeflow.NativeLoginCaaStartupTracker;
import com.facebook.aura.login.nativeflow.NativeLoginIdentifier;
import com.facebook.aura.login.nativeflow.NativeLoginItemizedConsentTarget;
import com.facebook.aura.login.nativeflow.NativeLoginOneTap;
import com.facebook.aura.login.nativeflow.NativeLoginViewEffect;
import com.facebook.aura.network.hatchauth.HatchAuthError;
import com.facebook.aura.network.hatchauth.HatchAuthException;
import com.facebook.aura.network.sandbox.HatchDeveloperOverrides;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryJsonKt;
import com.facebook.aura.utils.MC;
import com.facebook.aura.vds.compose.picker.AuraDatePickerKt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class NativeLoginViewModel extends AEs {
    public static final int $stable = 8;
    public static final NativeLoginErrorDialogContent ACCOUNT_EXISTS_DIALOG;
    public static final NativeLoginErrorDialogContent AGE_BLOCKED_DIALOG;
    public static final NativeLoginErrorDialogContent CHECKPOINT_DIALOG;
    public static final NativeLoginErrorDialogContent CREATE_BLOCKED_DIALOG;
    public static final Companion Companion = new Companion();
    public static final NativeLoginErrorDialogContent GENERIC_DIALOG;

    @Deprecated
    public static final String GOOGLE_SIGN_IN_ROW_ID = "google_sign_in";

    @Deprecated
    public static final int HTTP_BAD_REQUEST = 400;

    @Deprecated
    public static final int HTTP_CONFLICT = 409;

    @Deprecated
    public static final int HTTP_SERVER_ERROR = 500;
    public static final NativeLoginErrorDialogContent LINK_FAILED_DIALOG;
    public static final NativeLoginErrorDialogContent NETWORK_DIALOG;
    public static final NativeLoginErrorDialogContent NO_LINKED_ACCOUNT_DIALOG;

    @Deprecated
    public static final String NTP_UPSELL_ACCOUNT_ROW_ID = "ntp_upsell_account";

    @Deprecated
    public static final String NTP_UPSELL_CHOICE_ROW_ID_PREFIX = "ntp_upsell_choice_";
    public static final NativeLoginErrorDialogContent PASSWORD_REQUIRED_DIALOG;

    @Deprecated
    public static final String REGISTRATION_STATE_CONFIRMED = "confirmed";

    @Deprecated
    public static final String REGISTRATION_STATE_CONFIRM_CONTACT_POINT = "confirm_contact_point";

    @Deprecated
    public static final String REGISTRATION_STATE_LINKING_DISCLOSURE_REQUIRED = "linking_disclosure_required";

    @Deprecated
    public static final String REGISTRATION_STATE_NAME_COMPLETION = "name_completion";

    @Deprecated
    public static final String REGISTRATION_STATE_PENDING_CONTACT_POINT = "pending_contact_point";

    @Deprecated
    public static final String REMEMBER_DEVICE_SAVE_EVENT = "remember_device_save";

    @Deprecated
    public static final String REMEMBER_DEVICE_SAVE_EVENT_TYPE = "error";

    @Deprecated
    public static final String REMEMBER_DEVICE_SAVE_RESULT_ERROR = "error";
    public static final NativeLoginErrorDialogContent REMOVE_ACCOUNT_FAILED_DIALOG;

    @Deprecated
    public static final String REMOVE_SAVED_ACCOUNT_RESULT_SUCCESS = "success";

    @Deprecated
    public static final String REMOVE_SAVED_ACCOUNT_RESULT_WRITE_FAILED = "write_failed";

    @Deprecated
    public static final String REMOVE_SAVED_ACCOUNT_STEP = "remove_saved_account";
    public static final NativeLoginErrorDialogContent SESSION_EXPIRED_DIALOG;
    public static final NativeLoginErrorDialogContent TOO_MANY_ATTEMPTS_DIALOG;
    public static final NativeLoginErrorDialogContent TOS_CHANGED_DIALOG;
    public static final NativeLoginErrorDialogContent TWO_FACTOR_PHONE_DIALOG;
    public static final NativeLoginErrorDialogContent UNDERAGE_ATTEMPT_DIALOG;
    public static final NativeLoginErrorDialogContent VERIFICATION_REQUIRED_DIALOG;
    public final BLG<NativeLoginInitialDestination> _initialDestination;
    public final BLG<NativeLoginUiState> _uiState;
    public final HzR<NativeLoginViewEffect> _viewEffect;
    public volatile Map<String, String> accountSelectionRefs;
    public volatile String accountSelectionState;
    public volatile String agreedLinkingDisclosureVersion;
    public final Application application;
    public volatile String authState;
    public volatile boolean birthdayBackReturnsToOffer;
    public boolean birthdayFocusedLogged;
    public boolean birthdayInteractionLogged;
    public NativeLoginCaaStartupTracker caaStartupTracker;
    public final NativeLoginCheckpointContinuation checkpointContinuation;
    public volatile boolean checkpointContinueTapped;
    public volatile int checkpointGeneration;
    public volatile HoC checkpointJob;
    public final Object checkpointLock;
    public volatile String checkpointResumeToken;
    public volatile LoginSessionOutcome checkpointSessionOutcome;
    public volatile String codeSentForMethodId;
    public volatile HoC confirmJob;
    public volatile boolean contactPointTouched;
    public volatile LoginSessionOutcome continuationSessionOutcome;
    public volatile String createdAccountContactPoint;
    public volatile boolean declinedNtpUpsell;
    public boolean firstNameInteractionLogged;
    public final AtomicBoolean googleSignInRequested;
    public final AtomicBoolean googleSignInSheetOpen;
    public volatile boolean hasLeftPicker;
    public boolean heroLogoAnimationClaimed;
    public WeakReference<Activity> hostActivity;
    public int hostActivityToken;
    public final C1BN<NativeLoginInitialDestination> initialDestination;
    public volatile C27k<? extends Map<String, HatchMuseProfile>> landingMuseProfiles;
    public int landingReadGeneration;
    public final Object landingReadLock;
    public volatile SavedAccountsRead landingSavedAccounts;
    public boolean lastNameInteractionLogged;
    public volatile NativeLoginAccountUiModel linkingDisclosureAccount;
    public volatile boolean linkingDisclosureForNtpUpsell;
    public final Map<Integer, Boolean> liveEntryScreens;
    public volatile LoginMethod loginMethod;
    public boolean logsNameStep;
    public volatile HatchNtpSourceApp ntpSourceApp;
    public volatile Integer ntpUpsellChoiceChallengeIndex;
    public volatile String ntpUpsellChoiceConsentVersion;
    public volatile List<HatchNtpUpsellChoiceRow> ntpUpsellChoiceRows;
    public volatile String offerContactPoint;
    public volatile boolean offerFromTwoFactor;
    public final Object offerLock;
    public volatile HatchCaaNtpSourcePlatform offerNtpSourcePlatform;
    public volatile boolean offerOpensRegFunnel;
    public volatile boolean offerRegFunnelStarted;
    public final NativeLoginOneTap oneTap;
    public boolean passkeyAttemptSettled;
    public boolean passkeyHeldScreen;
    public boolean passkeyHoldsLoading;
    public volatile HoC passkeyJob;
    public int passkeyOfferEpoch;
    public boolean passkeyOfferStarted;
    public volatile PendingCompletionInputs pendingCompletionInputs;
    public volatile HatchAuthCredentials pendingCredentials;
    public volatile String pendingSmsCode;
    public volatile NativeLoginSsoAccount pendingSsoNameCompletion;
    public volatile boolean pendingSsoNameCompletionIsJoin;
    public final NativeLoginPicker<NativeLoginAccountUiModel, NativeLoginSiblingDisclosure> picker;
    public volatile String provenContactPoint;
    public volatile HatchCaaLoginEventStep reactivationOriginStep;
    public volatile String registrationRecoveryContactPoint;
    public volatile HatchCaaLoginLogger.PasswordSavingAnswer rememberDeviceAnswer;
    public final NativeLoginRememberedAccounts rememberedAccounts;
    public volatile Map<String, AuraRememberedAccount> rememberedAccountsByRowId;
    public final AuraRememberedAccountsStore rememberedAccountsStore;
    public volatile Map<String, NativeLoginMuseProfileUiModel> rememberedMuseProfilesByRowId;
    public volatile HatchSavedAccount savedAccountCodeCard;
    public volatile HoC smsConsentJob;
    public volatile Map<String, NativeLoginRowSource> ssoRowSources;
    public volatile Map<String, NativeLoginSsoAccount> ssoSelections;
    public volatile String submittedContactPoint;
    public volatile SubmittedSsoName submittedSsoName;
    public volatile HatchAttestationRequest twoFactorAttestationRequest;
    public volatile HatchTwoFactorMethod twoFactorMethod;
    public volatile String twoFactorState;
    public volatile String twoFactorTosContentVersion;
    public final C1BN<NativeLoginUiState> uiState;
    public final C20Q<NativeLoginViewEffect> viewEffect;

    public final class CheckpointCompletionClaim {
        public final LoginSessionOutcome outcome;

        public final LoginSessionOutcome getOutcome() {
            return this.outcome;
        }

        public CheckpointCompletionClaim(LoginSessionOutcome loginSessionOutcome) {
            this.outcome = loginSessionOutcome;
        }
    }

    public final class Companion {
        public final boolean collectsBirthday(HatchAuthCredentials hatchAuthCredentials) {
            C7384Etj.A0Y(hatchAuthCredentials, 0);
            return hatchAuthCredentials.requiresBirthday || NativeLoginViewModel.REGISTRATION_STATE_CONFIRMED.equals(hatchAuthCredentials.registrationState);
        }

        public final String destinationLabel(NativeLoginIdentifier nativeLoginIdentifier) {
            C7384Etj.A0Y(nativeLoginIdentifier, 0);
            if (nativeLoginIdentifier instanceof NativeLoginIdentifier.Phone) {
                return ((NativeLoginIdentifier.Phone) nativeLoginIdentifier).e164;
            }
            if (nativeLoginIdentifier instanceof NativeLoginIdentifier.Email) {
                return ((NativeLoginIdentifier.Email) nativeLoginIdentifier).address;
            }
            throw C3cG.A0q();
        }

        public final int fallbackMessageRes(NativeLoginField nativeLoginField) {
            int iA0E = AnonymousClass001.A0E(nativeLoginField, 0);
            if (iA0E == 0) {
                return R.string._name_removed__res_0x7f1204ae;
            }
            if (iA0E == 1 || iA0E == 3) {
                return R.string._name_removed__res_0x7f1204b2;
            }
            if (iA0E == 2) {
                return R.string._name_removed__res_0x7f1204b3;
            }
            if (iA0E == 4) {
                return R.string._name_removed__res_0x7f1204c2;
            }
            throw C3cG.A0q();
        }

        public final boolean isAccountAlreadyExists(HatchAuthError hatchAuthError, NativeLoginStep nativeLoginStep) {
            C7384Etj.A0Y(nativeLoginStep, 1);
            return C7384Etj.areEqual(hatchAuthError, HatchAuthError.PhoneAlreadyInUse.INSTANCE) || C7384Etj.areEqual(hatchAuthError, HatchAuthError.EmailAlreadyInUse.INSTANCE) || ((hatchAuthError instanceof HatchAuthError.Failed) && isConflict((HatchAuthError.Failed) hatchAuthError) && isCompletion(nativeLoginStep));
        }

        public final boolean isBadRequest(HatchAuthError.Failed failed) {
            C7384Etj.A0Y(failed, 0);
            return failed.httpCode == 400;
        }

        public final boolean isCompletion(NativeLoginStep nativeLoginStep) {
            C7384Etj.A0Y(nativeLoginStep, 0);
            return nativeLoginStep == NativeLoginStep.REGISTER_COMPLETION || nativeLoginStep == NativeLoginStep.REGISTER_COMPLETION_LINKED;
        }

        public final boolean isConflict(HatchAuthError.Failed failed) {
            C7384Etj.A0Y(failed, 0);
            return failed.httpCode == 409;
        }

        public final boolean isContactPointTwoFactorMethod(Throwable th) {
            C7384Etj.A0Y(th, 0);
            return C7384Etj.areEqual(C3cJ.A09(th), HatchAuthError.ContactPointIsTwoFactorMethod.INSTANCE);
        }

        public final boolean isPendingConfirmation(Throwable th) {
            C7384Etj.A0Y(th, 0);
            return C7384Etj.areEqual(C3cJ.A09(th), HatchAuthError.PendingConfirmation.INSTANCE);
        }

        public final boolean isRetryableCheckpointExchangeFailure(Throwable th) {
            C7384Etj.A0Y(th, 0);
            if (!(th instanceof CheckpointTempTokenUnavailableException)) {
                HatchAuthError hatchAuthErrorA09 = C3cJ.A09(th);
                if (!C7384Etj.areEqual(hatchAuthErrorA09, HatchAuthError.Network.INSTANCE) && !C7384Etj.areEqual(hatchAuthErrorA09, HatchAuthError.RateLimited.INSTANCE)) {
                    if (!(hatchAuthErrorA09 instanceof HatchAuthError.Failed)) {
                        return false;
                    }
                    int i = ((HatchAuthError.Failed) hatchAuthErrorA09).httpCode;
                    if (i != 408 && i < 500) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final boolean isSavedAccountOtpRefusal(Throwable th) {
            HatchAuthException hatchAuthException;
            C7384Etj.A0Y(th, 0);
            return (!(th instanceof HatchAuthException) || (hatchAuthException = (HatchAuthException) th) == null || hatchAuthException.problem == null || C7384Etj.areEqual(hatchAuthException.error, HatchAuthError.Network.INSTANCE) || C7384Etj.areEqual(hatchAuthException.error, HatchAuthError.RateLimited.INSTANCE) || C7384Etj.areEqual(hatchAuthException.error, HatchAuthError.SessionExpired.INSTANCE)) ? false : true;
        }

        public final boolean isSupported(HatchTwoFactorMethodType hatchTwoFactorMethodType) {
            C7384Etj.A0Y(hatchTwoFactorMethodType, 0);
            return hatchTwoFactorMethodType != HatchTwoFactorMethodType.UNKNOWN;
        }

        public final NativeLoginAccountUiModel metaAccountUiModel(HatchNtpUpsellChoiceRow hatchNtpUpsellChoiceRow, String str, String str2) {
            String str3;
            HatchSsoLinkedAccount hatchSsoLinkedAccount;
            boolean zA1a = AnonymousClass002.A1a(hatchNtpUpsellChoiceRow, str);
            HatchTwoFactorMetaAccount hatchTwoFactorMetaAccount = hatchNtpUpsellChoiceRow.metaAccount;
            if (hatchTwoFactorMetaAccount != null) {
                String str4 = hatchTwoFactorMetaAccount.displayLabel;
                if (str4 == null) {
                    if (str2 != null && !C7BY.A0j(str2)) {
                        str4 = str2;
                    }
                }
                List<HatchSsoLinkedAccount> listA0z = hatchTwoFactorMetaAccount.linkedAccounts;
                if (listA0z.isEmpty()) {
                    String str5 = hatchNtpUpsellChoiceRow.profilePictureUrl;
                    if (str5 != null) {
                        HatchTwoFactorSourceApp hatchTwoFactorSourceApp = hatchNtpUpsellChoiceRow.sourceApp;
                        hatchSsoLinkedAccount = new HatchSsoLinkedAccount(hatchTwoFactorSourceApp != null ? hatchTwoFactorSourceApp.getWireValue() : null, str5, null);
                    } else {
                        hatchSsoLinkedAccount = null;
                    }
                    listA0z = AbstractC0885AGm.A0z(hatchSsoLinkedAccount);
                }
                Iterator<HatchSsoLinkedAccount> it = listA0z.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str3 = null;
                        break;
                    }
                    str3 = it.next().profilePicUrl;
                    if (str3 != null) {
                        break;
                    }
                }
                AHD<NativeLoginLinkedAccountUiModel> facepileUiModels = toFacepileUiModels(listA0z);
                int size = listA0z.size();
                AHD<NativeLoginProfileUiModel> profileUiModels = toProfileUiModels(hatchTwoFactorMetaAccount.linkedAccounts);
                HatchTwoFactorSourceApp hatchTwoFactorSourceApp2 = hatchNtpUpsellChoiceRow.sourceApp;
                return new NativeLoginAccountUiModel(str, str4, null, str3, facepileUiModels, size, profileUiModels, false, false, false, zA1a, hatchTwoFactorSourceApp2 != null ? hatchTwoFactorSourceApp2.getWireValue() : null, null, null, false, HatchDisclosurePresentation.INLINE, HatchAccountStatus.ACTIVE);
            }
            return null;
        }

        public final boolean needsFreshContinuation(NativeLoginStep nativeLoginStep) {
            C7384Etj.A0Y(nativeLoginStep, 0);
            return nativeLoginStep == NativeLoginStep.CONFIRM_OTP || nativeLoginStep == NativeLoginStep.CONFIRM_PASSWORD || nativeLoginStep == NativeLoginStep.SELECT_ACCOUNT || nativeLoginStep == NativeLoginStep.CANCEL_DELETION || nativeLoginStep == NativeLoginStep.SEND_OTP_RESEND;
        }

        public final boolean routesToPasswordScreen(Throwable th) {
            C7384Etj.A0Y(th, 0);
            HatchAuthError hatchAuthErrorA09 = C3cJ.A09(th);
            return C7384Etj.areEqual(hatchAuthErrorA09, HatchAuthError.ContactPointIsTwoFactorMethod.INSTANCE) || C7384Etj.areEqual(hatchAuthErrorA09, HatchAuthError.LoginCodeSendFailed.INSTANCE) || C7384Etj.areEqual(hatchAuthErrorA09, HatchAuthError.ContactPointRequiresPasswordLogin.INSTANCE);
        }

        public final NativeLoginAccountUiModel toAccountSelectionUiModel(HatchAccountSelectionAccount hatchAccountSelectionAccount, String str) {
            HatchAccountSelectionProfile next;
            boolean zA1a = AnonymousClass002.A1a(hatchAccountSelectionAccount, str);
            Iterator<HatchAccountSelectionProfile> it = hatchAccountSelectionAccount.profiles.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!C7BY.A0j(next.displayName)) {
                    break;
                }
            }
            HatchAccountSelectionProfile hatchAccountSelectionProfile = next;
            if (hatchAccountSelectionProfile == null) {
                return null;
            }
            List<HatchAccountSelectionProfile> list = hatchAccountSelectionAccount.profiles;
            ArrayList arrayListA0h = C3cG.A0h();
            for (HatchAccountSelectionProfile hatchAccountSelectionProfile2 : list) {
                String str2 = hatchAccountSelectionProfile2.profilePicUrl;
                if (str2 != null && !C7BY.A0j(str2)) {
                    arrayListA0h.add(new NativeLoginLinkedAccountUiModel(hatchAccountSelectionProfile2.platform, str2));
                }
            }
            String str3 = hatchAccountSelectionProfile.displayName;
            String str4 = hatchAccountSelectionProfile.profilePicUrl;
            if (str4 == null || C7BY.A0j(str4)) {
                str4 = null;
            }
            AHD ahdA07 = AGI.A07(AbstractC0878AGe.A0a(arrayListA0h, 7));
            int size = hatchAccountSelectionAccount.profiles.size();
            List<HatchAccountSelectionProfile> list2 = hatchAccountSelectionAccount.profiles;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
            for (HatchAccountSelectionProfile hatchAccountSelectionProfile3 : list2) {
                String str5 = hatchAccountSelectionProfile3.platform;
                String str6 = hatchAccountSelectionProfile3.displayName;
                if (C7BY.A0j(str6)) {
                    str6 = null;
                }
                String str7 = hatchAccountSelectionProfile3.profilePicUrl;
                if (str7 == null || C7BY.A0j(str7)) {
                    str7 = null;
                }
                arrayListA0i.add(new NativeLoginProfileUiModel(str5, str7, str6));
            }
            return new NativeLoginAccountUiModel(str, str3, null, str4, ahdA07, size, AGI.A07(arrayListA0i), false, zA1a, zA1a, false, null, null, null, false, HatchDisclosurePresentation.INLINE, hatchAccountSelectionAccount.status);
        }

        public final AHD<NativeLoginProfileUiModel> toProfileUiModels(List<HatchSsoLinkedAccount> list) {
            C7384Etj.A0Y(list, 0);
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            for (HatchSsoLinkedAccount hatchSsoLinkedAccount : list) {
                arrayListA0i.add(new NativeLoginProfileUiModel(hatchSsoLinkedAccount.platform, hatchSsoLinkedAccount.profilePicUrl, hatchSsoLinkedAccount.displayName));
            }
            return AGI.A07(arrayListA0i);
        }

        public final NativeLoginAccountUiModel twoFactorAccountUiModel(HatchNtpUpsellChoiceRow hatchNtpUpsellChoiceRow, String str, String str2) {
            boolean zA1a = AnonymousClass002.A1a(hatchNtpUpsellChoiceRow, str);
            if (hatchNtpUpsellChoiceRow.twoFactorChallenge == null || str2 == null || C7BY.A0j(str2)) {
                return null;
            }
            HatchTwoFactorSourceApp hatchTwoFactorSourceApp = hatchNtpUpsellChoiceRow.sourceApp;
            String wireValue = hatchTwoFactorSourceApp != null ? hatchTwoFactorSourceApp.getWireValue() : null;
            return new NativeLoginAccountUiModel(str, str2, null, null, AGI.A0E(new NativeLoginLinkedAccountUiModel(wireValue, hatchNtpUpsellChoiceRow.profilePictureUrl)), zA1a ? 1 : 0, AHI.A01, false, false, false, false, wireValue, null, null, false, HatchDisclosurePresentation.INLINE, HatchAccountStatus.ACTIVE);
        }

        public final NativeLoginErrorDialogContent withCheckpointAction(NativeLoginErrorDialogContent nativeLoginErrorDialogContent, String str) {
            C7384Etj.A0Y(nativeLoginErrorDialogContent, 0);
            if (str == null || C7BY.A0j(str)) {
                return nativeLoginErrorDialogContent;
            }
            return nativeLoginErrorDialogContent.copy(nativeLoginErrorDialogContent.titleRes, nativeLoginErrorDialogContent.messageRes, nativeLoginErrorDialogContent.serverTitle, nativeLoginErrorDialogContent.serverMessage, new NativeLoginErrorDialogAction(R.string._name_removed__res_0x7f1204a5, str), nativeLoginErrorDialogContent.dismissal);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[PHI: r5
  0x0015: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:9:0x0013, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x001f A[PHI: r5
  0x001f: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String), (r5v3 java.lang.String) binds: [B:9:0x0013, B:11:0x0017, B:13:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent withServerCopy(com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent r7, com.facebook.aura.json.HatchProblemJson r8) {
            /*
                r6 = this;
                r0 = 0
                r2 = r7
                X.C7384Etj.A0Y(r7, r0)
                r1 = 0
                if (r8 == 0) goto L12
                java.lang.String r5 = r8.title
                if (r5 == 0) goto L12
                boolean r0 = X.C7BY.A0j(r5)
                if (r0 == 0) goto L15
            L12:
                r5 = r1
                if (r8 == 0) goto L1f
            L15:
                java.lang.String r6 = r8.detail
                if (r6 == 0) goto L1f
                boolean r0 = X.C7BY.A0j(r6)
                if (r0 == 0) goto L20
            L1f:
                r6 = r1
            L20:
                int r3 = r7.titleRes
                int r4 = r7.messageRes
                com.facebook.aura.login.nativeflow.NativeLoginErrorDialogAction r7 = r7.action
                com.facebook.aura.login.nativeflow.NativeLoginErrorDismissal r8 = r2.dismissal
                com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent r0 = r2.copy(r3, r4, r5, r6, r7, r8)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.Companion.withServerCopy(com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent, com.facebook.aura.json.HatchProblemJson):com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent");
        }

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[NativeLoginStep.values().length];
                try {
                    AnonymousClass005.A0v(NativeLoginStep.SEND_OTP, iArr, 1);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass005.A0v(NativeLoginStep.CONFIRM_OTP, iArr, 2);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass005.A0v(NativeLoginStep.CONFIRM_PASSWORD, iArr, 3);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass005.A0v(NativeLoginStep.TWO_FACTOR_CONFIRM, iArr, 4);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass005.A0v(NativeLoginStep.REGISTER_COMPLETION, iArr, 5);
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[NativeLoginField.values().length];
                try {
                    AnonymousClass005.A0v(NativeLoginField.CONTACT_POINT, iArr2, 1);
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    AnonymousClass005.A0v(NativeLoginField.OTP, iArr2, 2);
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    AnonymousClass005.A0v(NativeLoginField.TWO_FACTOR_CODE, iArr2, 3);
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    AnonymousClass005.A0v(NativeLoginField.PASSWORD, iArr2, 4);
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    AnonymousClass005.A0v(NativeLoginField.SIGNUP_PASSWORD, iArr2, 5);
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public static /* synthetic */ NativeLoginAccountUiModel toAccountUiModel$default(Companion companion, HatchSsoMetaAccount hatchSsoMetaAccount, String str, HatchSsoSourceApp hatchSsoSourceApp, int i, Object obj) {
            if ((i & 2) != 0) {
                hatchSsoSourceApp = null;
            }
            return companion.toAccountUiModel(hatchSsoMetaAccount, str, hatchSsoSourceApp);
        }

        public final String accountSelectionRowId(int i) {
            return FGI.A0H("account-selection-", i);
        }

        public final NativeLoginUiState clearingErrorOn(NativeLoginUiState nativeLoginUiState, NativeLoginField nativeLoginField) {
            boolean zA1b = AnonymousClass004.A1b(nativeLoginUiState, nativeLoginField);
            NativeLoginFieldError nativeLoginFieldError = nativeLoginUiState.fieldError;
            return (nativeLoginFieldError == null || nativeLoginFieldError.field != nativeLoginField) ? nativeLoginUiState : NativeLoginUiState.copy$default(nativeLoginUiState, null, null, null, null, null, null, zA1b, null, null, null, zA1b, null, zA1b, null, zA1b, null, null, zA1b, null, null, null, null, null, null, null, null, zA1b, null, null, null, null, null, null, null, zA1b, zA1b, null, null, null, null, zA1b, null, null, zA1b, zA1b, zA1b, zA1b, zA1b, null, null, null, null, null, null, null, null, null, zA1b, -1, 66977791, null);
        }

        public final NativeLoginErrorDialogContent getACCOUNT_EXISTS_DIALOG() {
            return NativeLoginViewModel.ACCOUNT_EXISTS_DIALOG;
        }

        public final NativeLoginErrorDialogContent getAGE_BLOCKED_DIALOG() {
            return NativeLoginViewModel.AGE_BLOCKED_DIALOG;
        }

        public final NativeLoginErrorDialogContent getCHECKPOINT_DIALOG() {
            return NativeLoginViewModel.CHECKPOINT_DIALOG;
        }

        public final NativeLoginErrorDialogContent getCREATE_BLOCKED_DIALOG() {
            return NativeLoginViewModel.CREATE_BLOCKED_DIALOG;
        }

        public final NativeLoginErrorDialogContent getGENERIC_DIALOG() {
            return NativeLoginViewModel.GENERIC_DIALOG;
        }

        public final NativeLoginErrorDialogContent getLINK_FAILED_DIALOG() {
            return NativeLoginViewModel.LINK_FAILED_DIALOG;
        }

        public final NativeLoginErrorDialogContent getNETWORK_DIALOG() {
            return NativeLoginViewModel.NETWORK_DIALOG;
        }

        public final NativeLoginErrorDialogContent getNO_LINKED_ACCOUNT_DIALOG() {
            return NativeLoginViewModel.NO_LINKED_ACCOUNT_DIALOG;
        }

        public final NativeLoginErrorDialogContent getPASSWORD_REQUIRED_DIALOG() {
            return NativeLoginViewModel.PASSWORD_REQUIRED_DIALOG;
        }

        public final NativeLoginErrorDialogContent getREMOVE_ACCOUNT_FAILED_DIALOG() {
            return NativeLoginViewModel.REMOVE_ACCOUNT_FAILED_DIALOG;
        }

        public final NativeLoginErrorDialogContent getSESSION_EXPIRED_DIALOG() {
            return NativeLoginViewModel.SESSION_EXPIRED_DIALOG;
        }

        public final NativeLoginErrorDialogContent getTOO_MANY_ATTEMPTS_DIALOG() {
            return NativeLoginViewModel.TOO_MANY_ATTEMPTS_DIALOG;
        }

        public final NativeLoginErrorDialogContent getTOS_CHANGED_DIALOG() {
            return NativeLoginViewModel.TOS_CHANGED_DIALOG;
        }

        public final NativeLoginErrorDialogContent getTWO_FACTOR_PHONE_DIALOG() {
            return NativeLoginViewModel.TWO_FACTOR_PHONE_DIALOG;
        }

        public final NativeLoginErrorDialogContent getUNDERAGE_ATTEMPT_DIALOG() {
            return NativeLoginViewModel.UNDERAGE_ATTEMPT_DIALOG;
        }

        public final NativeLoginErrorDialogContent getVERIFICATION_REQUIRED_DIALOG() {
            return NativeLoginViewModel.VERIFICATION_REQUIRED_DIALOG;
        }

        public final NativeLoginStep stepFor(boolean z) {
            return z ? NativeLoginStep.SEND_OTP_RESEND : NativeLoginStep.SEND_OTP;
        }

        public final NativeLoginAccountUiModel toAccountUiModel(HatchSsoMetaAccount hatchSsoMetaAccount, String str, HatchSsoSourceApp hatchSsoSourceApp) {
            String wireValue;
            String str2;
            AnonymousClass003.A0u(hatchSsoMetaAccount, str);
            String str3 = hatchSsoMetaAccount.displayLabel;
            Iterator<HatchSsoLinkedAccount> it = hatchSsoMetaAccount.linkedAccounts.iterator();
            while (true) {
                wireValue = null;
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                str2 = it.next().profilePicUrl;
                if (str2 != null) {
                    break;
                }
            }
            AHD<NativeLoginLinkedAccountUiModel> facepileUiModels = toFacepileUiModels(hatchSsoMetaAccount.linkedAccounts);
            int size = hatchSsoMetaAccount.linkedAccounts.size();
            AHD<NativeLoginProfileUiModel> profileUiModels = toProfileUiModels(hatchSsoMetaAccount.linkedAccounts);
            HatchMuseProfile hatchMuseProfile = hatchSsoMetaAccount.museProfile;
            NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel = hatchMuseProfile != null ? new NativeLoginMuseProfileUiModel(hatchMuseProfile.name, hatchMuseProfile.profilePictureUrl) : null;
            boolean z = hatchSsoMetaAccount.oneTapLoginEligible;
            boolean z2 = hatchSsoMetaAccount.hasHatch;
            boolean z3 = hatchSsoMetaAccount.hasMetaAi;
            boolean z4 = hatchSsoMetaAccount.isF3;
            boolean z5 = hatchSsoMetaAccount.showMuseTransparency;
            if (hatchSsoSourceApp != null && (hatchSsoSourceApp == HatchSsoSourceApp.FACEBOOK || hatchSsoSourceApp == HatchSsoSourceApp.INSTAGRAM)) {
                wireValue = hatchSsoSourceApp.getWireValue();
            }
            return new NativeLoginAccountUiModel(str, str3, null, str2, facepileUiModels, size, profileUiModels, z, z2, z3, z4, wireValue, null, nativeLoginMuseProfileUiModel, z5, hatchSsoMetaAccount.disclosurePresentation, HatchAccountStatus.ACTIVE);
        }

        public final NativeLoginField inputFor400(NativeLoginStep nativeLoginStep) {
            int iA0L = AnonymousClass003.A0L(nativeLoginStep);
            if (iA0L == 1) {
                return NativeLoginField.CONTACT_POINT;
            }
            if (iA0L == 3) {
                return NativeLoginField.OTP;
            }
            if (iA0L == 5) {
                return NativeLoginField.PASSWORD;
            }
            if (iA0L == 13) {
                return NativeLoginField.TWO_FACTOR_CODE;
            }
            if (iA0L != 8) {
                return null;
            }
            return NativeLoginField.SIGNUP_PASSWORD;
        }

        public final <T> boolean staleSsoToken(Object obj) {
            return C7384Etj.areEqual(C3cJ.A09(HsJ.A00(obj)), HatchAuthError.InvalidSsoToken.INSTANCE);
        }

        public final AHD<NativeLoginLinkedAccountUiModel> toFacepileUiModels(List<HatchSsoLinkedAccount> list) {
            ArrayList arrayListA0y = C3cI.A0y(list);
            for (HatchSsoLinkedAccount hatchSsoLinkedAccount : list) {
                String str = hatchSsoLinkedAccount.profilePicUrl;
                if (str != null) {
                    arrayListA0y.add(new NativeLoginLinkedAccountUiModel(hatchSsoLinkedAccount.platform, str));
                }
            }
            return AGI.A07(AbstractC0878AGe.A0a(arrayListA0y, 7));
        }

        public final List<GroupedSsoRow> toGroupedUiModels(List<HatchSsoMetaAccount> list, Map<String, NativeLoginSsoAccount> map) {
            AnonymousClass003.A0u(list, map);
            ArrayList arrayListA0h = C3cG.A0h();
            int i = 0;
            for (HatchSsoMetaAccount hatchSsoMetaAccount : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                HatchSsoMetaAccount hatchSsoMetaAccount2 = hatchSsoMetaAccount;
                List listA0T = AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(hatchSsoMetaAccount2.memberRefs, Collections.singletonList(hatchSsoMetaAccount2.primaryRef)));
                ArrayList arrayListA0h2 = C3cG.A0h();
                Iterator it = listA0T.iterator();
                while (it.hasNext()) {
                    NativeLoginSsoAccount nativeLoginSsoAccount = map.get(it.next());
                    if (nativeLoginSsoAccount != null) {
                        arrayListA0h2.add(nativeLoginSsoAccount);
                    }
                }
                NativeLoginSsoAccount nativeLoginSsoAccount2 = (NativeLoginSsoAccount) AbstractC0878AGe.A0G(arrayListA0h2);
                if (nativeLoginSsoAccount2 != null && !C7BY.A0j(hatchSsoMetaAccount2.displayLabel)) {
                    arrayListA0h.add(new GroupedSsoRow(NativeLoginViewModel.Companion.toAccountUiModel(hatchSsoMetaAccount2, FGI.A0H("meta-account-", i), nativeLoginSsoAccount2.sourceApp), nativeLoginSsoAccount2, AbstractC0878AGe.A0g(listA0T), hatchSsoMetaAccount2.supersedesSavedAccount));
                }
                i = i2;
            }
            return AbstractC0878AGe.A0a(arrayListA0h, 5);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }

        public final NativeLoginAccountUiModel toAccountUiModel(HatchNtpUpsellAccount hatchNtpUpsellAccount, String str) {
            boolean zA1b = AnonymousClass004.A1b(hatchNtpUpsellAccount, str);
            List<HatchSsoLinkedAccount> listSingletonList = hatchNtpUpsellAccount.linkedAccounts;
            if (listSingletonList.isEmpty()) {
                listSingletonList = Collections.singletonList(new HatchSsoLinkedAccount(hatchNtpUpsellAccount.sourceApp, hatchNtpUpsellAccount.profilePicUrl, hatchNtpUpsellAccount.displayName));
            }
            return new NativeLoginAccountUiModel(str, hatchNtpUpsellAccount.displayLabel, null, hatchNtpUpsellAccount.profilePicUrl, toFacepileUiModels(listSingletonList), listSingletonList.size(), toProfileUiModels(listSingletonList), zA1b, zA1b, zA1b, zA1b, null, null, null, zA1b, HatchDisclosurePresentation.INLINE, HatchAccountStatus.ACTIVE);
        }

        public final NativeLoginAccountUiModel toAccountUiModel(HatchNtpUpsellOffer hatchNtpUpsellOffer, String str) {
            boolean zA1b = AnonymousClass004.A1b(hatchNtpUpsellOffer, str);
            return NativeLoginAccountUiModel.copy$default(toAccountUiModel(hatchNtpUpsellOffer.account, str), null, null, null, null, null, zA1b ? 1 : 0, null, zA1b, zA1b, zA1b, zA1b, null, null, null, hatchNtpUpsellOffer.showMuseTransparency, null, null, 114687, null);
        }
    }

    public final class Factory extends AuraViewModelFactory<NativeLoginViewModel> {
        public static final int $stable = 8;
        public final Application application;

        public Factory(Application application) {
            C7384Etj.A0Y(application, 0);
            this.application = application;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new NativeLoginViewModel(this.application);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public NativeLoginViewModel create() {
            return new NativeLoginViewModel(this.application);
        }
    }

    public interface LoginSessionOutcome {

        public final class Login extends C06G implements LoginSessionOutcome {
            public static final int $stable = 0;
            public final HatchCaaLoginCredentialType credentialType;
            public final HatchCaaLoginSource source;
            public final HatchCaaLoginEventStep step;

            public Login(HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType) {
                C7384Etj.A0Y(hatchCaaLoginEventStep, 0);
                this.step = hatchCaaLoginEventStep;
                this.source = hatchCaaLoginSource;
                this.credentialType = hatchCaaLoginCredentialType;
            }

            public final Login copy(HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType) {
                C7384Etj.A0Y(hatchCaaLoginEventStep, 0);
                return new Login(hatchCaaLoginEventStep, hatchCaaLoginSource, hatchCaaLoginCredentialType);
            }

            public static /* synthetic */ Login copy$default(Login login, HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, int i, Object obj) {
                if ((i & 1) != 0) {
                    hatchCaaLoginEventStep = login.step;
                }
                if ((i & 2) != 0) {
                    hatchCaaLoginSource = login.source;
                }
                if ((i & 4) != 0) {
                    hatchCaaLoginCredentialType = login.credentialType;
                }
                return login.copy(hatchCaaLoginEventStep, hatchCaaLoginSource, hatchCaaLoginCredentialType);
            }

            public final HatchCaaLoginEventStep component1() {
                return this.step;
            }

            public final HatchCaaLoginSource component2() {
                return this.source;
            }

            public final HatchCaaLoginCredentialType component3() {
                return this.credentialType;
            }

            public final HatchCaaLoginCredentialType getCredentialType() {
                return this.credentialType;
            }

            public final HatchCaaLoginSource getSource() {
                return this.source;
            }

            public final HatchCaaLoginEventStep getStep() {
                return this.step;
            }

            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            public int hashCode() {
                return super.hashCode();
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ Login(HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, int i, C06H c06h) {
                this(hatchCaaLoginEventStep, (i & 2) != 0 ? null : hatchCaaLoginSource, (i & 4) != 0 ? null : hatchCaaLoginCredentialType);
            }
        }

        public final class Signup extends C06G implements LoginSessionOutcome {
            public static final int $stable = 0;
            public final HatchCaaEventFlow flow;

            public /* synthetic */ Signup(HatchCaaEventFlow hatchCaaEventFlow, int i, C06H c06h) {
                this((i & 1) != 0 ? null : hatchCaaEventFlow);
            }

            public static /* synthetic */ Signup copy$default(Signup signup, HatchCaaEventFlow hatchCaaEventFlow, int i, Object obj) {
                if ((i & 1) != 0) {
                    hatchCaaEventFlow = signup.flow;
                }
                return new Signup(hatchCaaEventFlow);
            }

            public final HatchCaaEventFlow component1() {
                return this.flow;
            }

            public final Signup copy(HatchCaaEventFlow hatchCaaEventFlow) {
                return new Signup(hatchCaaEventFlow);
            }

            public final HatchCaaEventFlow getFlow() {
                return this.flow;
            }

            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            public int hashCode() {
                return super.hashCode();
            }

            public String toString() {
                return super.toString();
            }

            public Signup(HatchCaaEventFlow hatchCaaEventFlow) {
                this.flow = hatchCaaEventFlow;
            }

            public Signup() {
                this(null);
            }
        }

        public final class TwoFactor implements LoginSessionOutcome {
            public static final int $stable = 0;
            public static final TwoFactor INSTANCE = new TwoFactor();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof TwoFactor);
            }

            public String toString() {
                return "TwoFactor";
            }

            public int hashCode() {
                return 1312386986;
            }
        }
    }

    public final class OneTapTempTokenUnavailableException extends IOException {
        public OneTapTempTokenUnavailableException() {
            super("No temp token for a one-tap request");
        }
    }

    public final class PendingCompletionInputs {
        public final String firstName;
        public final String isoDate;
        public final String lastName;
        public final String password;

        public PendingCompletionInputs(String str, String str2, String str3, String str4) {
            C7384Etj.A0Y(str, 0);
            this.isoDate = str;
            this.firstName = str2;
            this.lastName = str3;
            this.password = str4;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getIsoDate() {
            return this.isoDate;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getPassword() {
            return this.password;
        }
    }

    public final class SavedAccountsRead {
        public volatile Long completedAtMs;
        public final String idForAymh;
        public final C27k<HsJ<List<HatchSavedAccount>>> result;

        /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$SavedAccountsRead$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
            public AnonymousClass1() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                SavedAccountsRead.this.completedAtMs = C3cI.A0O();
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }
        }

        public final String getIdForAymh() {
            return this.idForAymh;
        }

        public final C27k<HsJ<List<HatchSavedAccount>>> getResult() {
            return this.result;
        }

        public final boolean isStale() {
            Long l = this.completedAtMs;
            return l != null && C3cG.A04(l.longValue()) > 60000;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SavedAccountsRead(String str, C27k<? extends HsJ<? extends List<HatchSavedAccount>>> c27k) {
            AnonymousClass003.A0u(str, c27k);
            this.idForAymh = str;
            this.result = c27k;
            c27k.AO5(new AnonymousClass1());
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$agreeToLinkingItemizedConsent$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0V<String, HatchCaaNtpSourcePlatform, Unit> {
        public AnonymousClass1(Object obj) {
            super(2, obj, HatchCaaRegistrationLogger.class, "logAcOptedIn", "logAcOptedIn(Ljava/lang/String;Lcom/facebook/aura/analytics/hatch/caa/HatchCaaNtpSourcePlatform;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            ((HatchCaaRegistrationLogger) this.receiver).logAcOptedIn(str, hatchCaaNtpSourcePlatform);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            invoke2(str, hatchCaaNtpSourcePlatform);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$agreeToLinkingItemizedConsent$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G0V<String, HatchCaaNtpSourcePlatform, Unit> {
        public AnonymousClass2(Object obj) {
            super(2, obj, HatchCaaRegistrationLogger.class, "logAcOptedIn", "logAcOptedIn(Ljava/lang/String;Lcom/facebook/aura/analytics/hatch/caa/HatchCaaNtpSourcePlatform;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            ((HatchCaaRegistrationLogger) this.receiver).logAcOptedIn(str, hatchCaaNtpSourcePlatform);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            invoke2(str, hatchCaaNtpSourcePlatform);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$attemptOneTap$2", f = "NativeLoginViewModel.kt", l = {1717}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$attemptOneTap$2, reason: invalid class name and case insensitive filesystem */
    public final class C125912 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends List<? extends HatchSavedAccount>>>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C125912(HtJ<? super C125912> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C125912 c125912 = NativeLoginViewModel.this.new C125912(htJ);
            c125912.L$0 = obj;
            return c125912;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends List<? extends HatchSavedAccount>>> htJ) {
            return invoke2(str, (HtJ<? super HsJ<? extends List<HatchSavedAccount>>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                this.L$0 = null;
                this.label = 1;
                obj = nativeLoginViewModel.m1321savedAccountsYNEx5aM(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HsJ hsJ = (HsJ) obj;
            return C3cG.A0t(hsJ != null ? hsJ.value : C3cG.A0s(new OneTapTempTokenUnavailableException()));
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(String str, HtJ<? super HsJ<? extends List<HatchSavedAccount>>> htJ) {
            return ((C125912) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$attemptOneTap$3", f = "NativeLoginViewModel.kt", l = {1720}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$attemptOneTap$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G2j<String, String, String, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ Object L$2;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$attemptOneTap$3$1", f = "NativeLoginViewModel.kt", l = {1721}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$attemptOneTap$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
            public final /* synthetic */ String $accountCuid;
            public final /* synthetic */ String $aymhDeviceId;
            public final /* synthetic */ String $nonce;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, String str2, String str3, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$accountCuid = str;
                this.$nonce = str2;
                this.$aymhDeviceId = str3;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountCuid, this.$nonce, this.$aymhDeviceId, htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
                return invoke2(str, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object objM1254dblLoginyxL6bBk;
                String str = (String) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchAuthApi hatchAuthApi = HatchAuthApi.INSTANCE;
                    String str2 = this.$accountCuid;
                    String str3 = this.$nonce;
                    String str4 = this.$aymhDeviceId;
                    this.L$0 = null;
                    this.label = 1;
                    objM1254dblLoginyxL6bBk = hatchAuthApi.m1254dblLoginyxL6bBk(str, str2, str3, str4, this);
                    if (objM1254dblLoginyxL6bBk == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM1254dblLoginyxL6bBk = AnonymousClass001.A0q(obj);
                }
                return C3cG.A0t(objM1254dblLoginyxL6bBk);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(String str, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
                return ((AnonymousClass1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(4, htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(String str, String str2, String str3, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
            AnonymousClass3 anonymousClass3 = NativeLoginViewModel.this.new AnonymousClass3(htJ);
            anonymousClass3.L$0 = str;
            anonymousClass3.L$1 = str2;
            anonymousClass3.L$2 = str3;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            String str2 = (String) this.L$1;
            String str3 = (String) this.L$2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(str, str2, str3, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                obj = nativeLoginViewModel.m1324withTempTokenRgG5Fkc(false, anonymousClass1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HsJ hsJ = (HsJ) obj;
            return C3cG.A0t(hsJ != null ? hsJ.value : C3cG.A0s(new OneTapTempTokenUnavailableException()));
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Object invoke(String str, String str2, String str3, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
            return invoke2(str, str2, str3, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$attemptOneTap$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 extends C7438Evz implements G0U<Throwable, Unit> {
        public AnonymousClass4(Object obj) {
            super(1, obj, NativeLoginViewModel.class, "logOneTapFailure", "logOneTapFailure(Ljava/lang/Throwable;)V", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ((NativeLoginViewModel) this.receiver).logOneTapFailure(th);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$attemptSilentTokenExchange$1", f = "NativeLoginViewModel.kt", l = {735}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$attemptSilentTokenExchange$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class C125921 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $frlToken;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125921(String str, HtJ<? super C125921> htJ) {
            super(2, htJ);
            this.$frlToken = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C125921(this.$frlToken, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C125921(this.$frlToken, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraTokenExchanger auraTokenExchanger = AuraTokenExchanger.INSTANCE;
                String str = this.$frlToken;
                this.label = 1;
                obj = auraTokenExchanger.exchangeForProfileToken(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            NativeAuthResult nativeAuthResult = (NativeAuthResult) obj;
            if (nativeAuthResult instanceof NativeAuthResult.Success) {
                NativeAuthResult.Success success = (NativeAuthResult.Success) nativeAuthResult;
                AuraSessionManager.INSTANCE.restoreSessionFromFRLToken(this.$frlToken, success.userId, success.accessToken, success.refreshToken);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel", f = "NativeLoginViewModel.kt", l = {1059, 1061}, m = "attemptZari", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$attemptZari$1, reason: invalid class name and case insensitive filesystem */
    public final class C125931 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C125931(HtJ<? super C125931> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginViewModel.this.attemptZari(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$claimOtp$1", f = "NativeLoginViewModel.kt", l = {2684}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$claimOtp$1, reason: invalid class name and case insensitive filesystem */
    public final class C125941 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $afterDeclinedUpsell;
        public final /* synthetic */ String $contactPoint;
        public final /* synthetic */ HatchCaaEntryPoint $entryPoint;
        public final /* synthetic */ NativeLoginIdentifier $identifier;
        public final /* synthetic */ boolean $isResend;
        public final /* synthetic */ String $regionHint;
        public final /* synthetic */ HatchCaaEventFlow $registrationFlow;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125941(NativeLoginIdentifier nativeLoginIdentifier, String str, String str2, boolean z, boolean z2, HatchCaaEventFlow hatchCaaEventFlow, HatchCaaEntryPoint hatchCaaEntryPoint, HtJ<? super C125941> htJ) {
            super(1, htJ);
            this.$identifier = nativeLoginIdentifier;
            this.$contactPoint = str;
            this.$regionHint = str2;
            this.$isResend = z;
            this.$afterDeclinedUpsell = z2;
            this.$registrationFlow = hatchCaaEventFlow;
            this.$entryPoint = hatchCaaEntryPoint;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C125941(this.$identifier, this.$contactPoint, this.$regionHint, this.$isResend, this.$afterDeclinedUpsell, this.$registrationFlow, this.$entryPoint, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                NativeLoginIdentifier nativeLoginIdentifier = this.$identifier;
                String str = this.$contactPoint;
                String str2 = this.$regionHint;
                boolean z = this.$isResend;
                boolean z2 = this.$afterDeclinedUpsell;
                HatchCaaEventFlow hatchCaaEventFlow = this.$registrationFlow;
                HatchCaaEntryPoint hatchCaaEntryPoint = this.$entryPoint;
                this.label = 1;
                if (nativeLoginViewModel.requestOtp(nativeLoginIdentifier, str, str2, z, z2, hatchCaaEventFlow, hatchCaaEntryPoint, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C125941) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$completeRegistration$1", f = "NativeLoginViewModel.kt", l = {5125}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$completeRegistration$1, reason: invalid class name and case insensitive filesystem */
    public final class C125951 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $contactPoint;
        public final /* synthetic */ HatchAuthCredentials $credentials;
        public final /* synthetic */ String $firstName;
        public final /* synthetic */ String $handle;
        public final /* synthetic */ String $isoDate;
        public final /* synthetic */ PendingCompletionInputs $itemsInputs;
        public final /* synthetic */ String $lastName;
        public final /* synthetic */ String $password;
        public Object L$0;
        public int label;
        public final /* synthetic */ NativeLoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125951(String str, NativeLoginViewModel nativeLoginViewModel, String str2, String str3, String str4, String str5, String str6, HatchAuthCredentials hatchAuthCredentials, PendingCompletionInputs pendingCompletionInputs, HtJ<? super C125951> htJ) {
            super(2, htJ);
            this.$password = str;
            this.this$0 = nativeLoginViewModel;
            this.$handle = str2;
            this.$contactPoint = str3;
            this.$isoDate = str4;
            this.$firstName = str5;
            this.$lastName = str6;
            this.$credentials = hatchAuthCredentials;
            this.$itemsInputs = pendingCompletionInputs;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C125951(this.$password, this.this$0, this.$handle, this.$contactPoint, this.$isoDate, this.$firstName, this.$lastName, this.$credentials, this.$itemsInputs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String str = this.$password;
                if (str != null) {
                    String encryptedPassword = AuraPasswordEncryptionHelper.INSTANCE.getEncryptedPassword(str);
                    if (encryptedPassword != null) {
                        str = encryptedPassword;
                    }
                } else {
                    str = null;
                }
                NativeLoginViewModel nativeLoginViewModel = this.this$0;
                NativeLoginViewModel$completeRegistration$1$result$1 nativeLoginViewModel$completeRegistration$1$result$1 = new NativeLoginViewModel$completeRegistration$1$result$1(this.$handle, this.$contactPoint, this.$isoDate, this.$firstName, this.$lastName, str, this.$credentials, null);
                this.L$0 = null;
                this.label = 1;
                obj = C3cH.A0Y(nativeLoginViewModel, this, nativeLoginViewModel$completeRegistration$1$result$1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HsJ hsJ = (HsJ) obj;
            if (hsJ != null) {
                Object obj2 = hsJ.value;
                String str2 = this.$contactPoint;
                NativeLoginViewModel nativeLoginViewModel2 = this.this$0;
                if (!(obj2 instanceof C10571Hud)) {
                    HatchAuthCredentials hatchAuthCredentials = (HatchAuthCredentials) obj2;
                    HatchCaaRegistrationLogger.INSTANCE.logCreateSuccess(str2, C9tI.A0s(hatchAuthCredentials.frlAccountId), null, null, null);
                    nativeLoginViewModel2.completeLogin(hatchAuthCredentials, new LoginSessionOutcome.Signup(null), true);
                }
                String str3 = this.$contactPoint;
                NativeLoginViewModel nativeLoginViewModel3 = this.this$0;
                PendingCompletionInputs pendingCompletionInputs = this.$itemsInputs;
                Throwable thA00 = HsJ.A00(obj2);
                if (thA00 != null) {
                    HatchCaaRegistrationLogger.INSTANCE.logCreateFailure(str3, null, null, null, C3cG.A0C(HatchCaaStage.REGISTER_COMPLETION, thA00));
                    if (!nativeLoginViewModel3.recoverIfPasswordRequired(thA00)) {
                        nativeLoginViewModel3.presentFailure(thA00, NativeLoginStep.REGISTER_COMPLETION);
                    }
                    if (pendingCompletionInputs != null && nativeLoginViewModel3.pendingCredentials != null) {
                        nativeLoginViewModel3.returnToBirthdayFromItems(pendingCompletionInputs);
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C125951) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$continueToOtpForContactPoint$3, reason: invalid class name and case insensitive filesystem */
    public final class C125963 extends AbstractC7559F3s implements G0U<G0U<? super HtJ<? super Unit>, ? extends Object>, Unit> {

        @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$continueToOtpForContactPoint$3$1", f = "NativeLoginViewModel.kt", l = {2440}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$continueToOtpForContactPoint$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $attempt;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$attempt = g0u;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$attempt, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    G0U<HtJ<? super Unit>, Object> g0u = this.$attempt;
                    this.label = 1;
                    if (g0u.invoke(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass1(this.$attempt, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
            C7384Etj.A0Y(g0u, 0);
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(g0u, null), AEu.A00(NativeLoginViewModel.this));
        }

        public C125963() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
            invoke2(g0u);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel", f = "NativeLoginViewModel.kt", l = {3286}, m = "discoverableOffer", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$discoverableOffer$1, reason: invalid class name and case insensitive filesystem */
    public final class C125971 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C125971(HtJ<? super C125971> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginViewModel.this.discoverableOffer(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$emitEffect$1", f = "NativeLoginViewModel.kt", l = {6933}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$emitEffect$1, reason: invalid class name and case insensitive filesystem */
    public final class C125981 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ NativeLoginViewEffect $effect;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125981(NativeLoginViewEffect nativeLoginViewEffect, HtJ<? super C125981> htJ) {
            super(2, htJ);
            this.$effect = nativeLoginViewEffect;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C125981(this.$effect, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HzR<NativeLoginViewEffect> hzR = NativeLoginViewModel.this._viewEffect;
                NativeLoginViewEffect nativeLoginViewEffect = this.$effect;
                this.label = 1;
                if (hzR.AcU(nativeLoginViewEffect, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C125981) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel", f = "NativeLoginViewModel.kt", l = {5977}, m = "exchangeCheckpointAccessToken", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeCheckpointAccessToken$1, reason: invalid class name and case insensitive filesystem */
    public final class C125991 extends HzP {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C125991(HtJ<? super C125991> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginViewModel.this.exchangeCheckpointAccessToken(null, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeGoogleCredential$1", f = "NativeLoginViewModel.kt", l = {2257}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeGoogleCredential$1, reason: invalid class name and case insensitive filesystem */
    public final class C126001 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ NativeLoginGoogleCredential $credential;
        public final /* synthetic */ LoginSessionOutcome.Login $sessionOutcome;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126001(NativeLoginGoogleCredential nativeLoginGoogleCredential, LoginSessionOutcome.Login login, HtJ<? super C126001> htJ) {
            super(1, htJ);
            this.$credential = nativeLoginGoogleCredential;
            this.$sessionOutcome = login;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126001(this.$credential, this.$sessionOutcome, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA0Y = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objA0Y);
                NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                NativeLoginViewModel$exchangeGoogleCredential$1$result$1 nativeLoginViewModel$exchangeGoogleCredential$1$result$1 = new NativeLoginViewModel$exchangeGoogleCredential$1$result$1(this.$credential, null);
                this.label = 1;
                objA0Y = C3cH.A0Y(nativeLoginViewModel, this, nativeLoginViewModel$exchangeGoogleCredential$1$result$1);
                if (objA0Y == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objA0Y);
            }
            HsJ hsJ = (HsJ) objA0Y;
            if (hsJ != null) {
                Object obj2 = hsJ.value;
                NativeLoginViewModel nativeLoginViewModel2 = NativeLoginViewModel.this;
                LoginSessionOutcome.Login login = this.$sessionOutcome;
                if (!(obj2 instanceof C10571Hud)) {
                    HatchAuthCredentials hatchAuthCredentials = (HatchAuthCredentials) obj2;
                    if (nativeLoginViewModel2.resolvesToLogin(hatchAuthCredentials)) {
                        nativeLoginViewModel2.openGoogleLoginFunnel();
                    }
                    nativeLoginViewModel2.recordContinuationOutcome(hatchAuthCredentials, HatchCaaLoginEventStep.CONTACTPOINT, HatchCaaLoginSource.SIGN_IN_WITH_GOOGLE_LOGIN, HatchCaaLoginCredentialType.OPENID_CONNECT);
                    if (!NativeLoginViewModel.handleLoginContinuation$default(nativeLoginViewModel2, hatchAuthCredentials, login, null, LoginMethod.SSO, 4, null)) {
                        HatchNtpUpsellOffer hatchNtpUpsellOffer = hatchAuthCredentials.ntpUpsell;
                        if (hatchNtpUpsellOffer != null) {
                            nativeLoginViewModel2.latchGoogleRegistrationSource();
                            C3cG.A1E(HatchAuthFlowContext.INSTANCE, HatchCaaEntryPoint.NTP_UPSELL);
                            nativeLoginViewModel2.offerFromTwoFactor = false;
                            nativeLoginViewModel2.navigateToNtpUpsell(hatchAuthCredentials, hatchNtpUpsellOffer.contactPoint, true);
                        } else {
                            String str = hatchAuthCredentials.ntpUpsellPendingContactPoint;
                            if (str != null) {
                                nativeLoginViewModel2.latchGoogleRegistrationSource();
                                NativeLoginViewModel.continueToOtpForContactPoint$default(nativeLoginViewModel2, str, null, 2, null);
                            } else if (NativeLoginViewModel.REGISTRATION_STATE_PENDING_CONTACT_POINT.equals(hatchAuthCredentials.registrationState) && !C7BY.A0j(hatchAuthCredentials.confirmContactPoint)) {
                                nativeLoginViewModel2.latchGoogleRegistrationSource();
                                NativeLoginViewModel.continueToOtpForContactPoint$default(nativeLoginViewModel2, hatchAuthCredentials.confirmContactPoint, null, 2, null);
                            } else if (hatchAuthCredentials.requiresBirthday) {
                                nativeLoginViewModel2.latchGoogleRegistrationSource();
                                HatchCaaRegistrationLogger.INSTANCE.logRegistrationStart(HatchCaaRegistrationEventStep.CONTACTPOINT, nativeLoginViewModel2.submittedContactPoint, null, HatchCaaEventFlow.NEW_TO_META, null, null, null);
                                NativeLoginViewModel.navigateToBirthday$default(nativeLoginViewModel2, hatchAuthCredentials, false, false, 6, null);
                            } else {
                                NativeLoginViewModel.completeLogin$default(nativeLoginViewModel2, hatchAuthCredentials, login, false, 4, null);
                            }
                        }
                    }
                }
                NativeLoginViewModel nativeLoginViewModel3 = NativeLoginViewModel.this;
                NativeLoginGoogleCredential nativeLoginGoogleCredential = this.$credential;
                Throwable thA00 = HsJ.A00(obj2);
                if (thA00 != null) {
                    if (!nativeLoginViewModel3.ssoRefusalIsSignup(thA00)) {
                        nativeLoginViewModel3.openGoogleLoginFunnel();
                    }
                    nativeLoginViewModel3.logSsoLoginFailure(false, HatchCaaLoginEventStep.CONTACTPOINT, thA00, HatchCaaLoginSource.SIGN_IN_WITH_GOOGLE_LOGIN, HatchCaaLoginCredentialType.OPENID_CONNECT);
                    if (!NativeLoginViewModel.Companion.staleSsoToken(obj2) || !NativeLoginViewModel.continueToOtpForContactPoint$default(nativeLoginViewModel3, nativeLoginGoogleCredential.email, null, 2, null)) {
                        nativeLoginViewModel3.presentFailure(thA00, NativeLoginStep.GOOGLE_EXCHANGE);
                    }
                }
            } else {
                NativeLoginViewModel nativeLoginViewModel4 = NativeLoginViewModel.this;
                nativeLoginViewModel4.openGoogleLoginFunnel();
                HatchCaaLoginLogger.INSTANCE.logSessionLoginFailed(nativeLoginViewModel4.submittedContactPoint, HatchCaaLoginEventStep.CONTACTPOINT, C3cI.A09(HatchCaaFailure.Companion, HatchCaaStage.SSO_EXCHANGE), HatchCaaLoginSource.SIGN_IN_WITH_GOOGLE_LOGIN, HatchCaaLoginCredentialType.OPENID_CONNECT);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C126001) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeSsoSelection$1", f = "NativeLoginViewModel.kt", l = {1539, 1571}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeSsoSelection$1, reason: invalid class name and case insensitive filesystem */
    public final class C126011 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchCaaLoginCredentialType $credentialType;
        public final /* synthetic */ boolean $isJoin;
        public final /* synthetic */ String $linkingDisclosureVersion;
        public final /* synthetic */ SubmittedSsoName $name;
        public final /* synthetic */ HatchCaaNtpSourcePlatform $ntpSourcePlatform;
        public final /* synthetic */ NativeLoginSsoAccount $sso;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126011(NativeLoginSsoAccount nativeLoginSsoAccount, boolean z, SubmittedSsoName submittedSsoName, String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, HtJ<? super C126011> htJ) {
            super(1, htJ);
            this.$sso = nativeLoginSsoAccount;
            this.$isJoin = z;
            this.$name = submittedSsoName;
            this.$linkingDisclosureVersion = str;
            this.$ntpSourcePlatform = hatchCaaNtpSourcePlatform;
            this.$credentialType = hatchCaaLoginCredentialType;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126011(this.$sso, this.$isJoin, this.$name, this.$linkingDisclosureVersion, this.$ntpSourcePlatform, this.$credentialType, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 213
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.C126011.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C126011) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2", f = "NativeLoginViewModel.kt", l = {6489, 6495, 6507}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2, reason: invalid class name and case insensitive filesystem */
    public final class C126022 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $abraUserId;
        public final /* synthetic */ String $accountId;
        public final /* synthetic */ String $contactPoint;
        public final /* synthetic */ String $frlAccessToken;
        public final /* synthetic */ String $provisionBearer;
        public final /* synthetic */ Boolean $rememberDeviceValue;
        public final /* synthetic */ boolean $wasOneTap;
        public int I$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2$1", f = "NativeLoginViewModel.kt", l = {6490}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0W<String, String, HtJ<? super HsJ<? extends String>>, Object> {
            public final /* synthetic */ String $provisionBearer;
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public int label;
            public final /* synthetic */ NativeLoginViewModel this$0;

            @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2$1$1", f = "NativeLoginViewModel.kt", l = {6491}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2$1$1, reason: invalid class name and collision with other inner class name */
            public final class C02191 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends String>>, Object> {
                public final /* synthetic */ String $aymhDeviceId;
                public final /* synthetic */ String $frl;
                public /* synthetic */ Object L$0;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C02191(String str, String str2, HtJ<? super C02191> htJ) {
                    super(2, htJ);
                    this.$frl = str;
                    this.$aymhDeviceId = str2;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C02191 c02191 = new C02191(this.$frl, this.$aymhDeviceId, htJ);
                    c02191.L$0 = obj;
                    return c02191;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends String>> htJ) {
                    return invoke2(str, (HtJ<? super HsJ<String>>) htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    Object objM1261saveAccountBWLJW6A;
                    String str = (String) this.L$0;
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        HatchAuthApi hatchAuthApi = HatchAuthApi.INSTANCE;
                        String str2 = this.$frl;
                        String str3 = this.$aymhDeviceId;
                        this.L$0 = null;
                        this.label = 1;
                        objM1261saveAccountBWLJW6A = hatchAuthApi.m1261saveAccountBWLJW6A(str, str2, str3, this);
                        if (objM1261saveAccountBWLJW6A == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        objM1261saveAccountBWLJW6A = AnonymousClass001.A0q(obj);
                    }
                    return C3cG.A0t(objM1261saveAccountBWLJW6A);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(String str, HtJ<? super HsJ<String>> htJ) {
                    return ((C02191) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NativeLoginViewModel nativeLoginViewModel, String str, HtJ<? super AnonymousClass1> htJ) {
                super(3, htJ);
                this.this$0 = nativeLoginViewModel;
                this.$provisionBearer = str;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(String str, String str2, HtJ<? super HsJ<String>> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$provisionBearer, htJ);
                anonymousClass1.L$0 = str;
                anonymousClass1.L$1 = str2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object objM1323withPostLoginTempTokenBWLJW6A;
                String str = (String) this.L$0;
                String str2 = (String) this.L$1;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    NativeLoginViewModel nativeLoginViewModel = this.this$0;
                    String str3 = this.$provisionBearer;
                    C02191 c02191 = new C02191(str, str2, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    objM1323withPostLoginTempTokenBWLJW6A = nativeLoginViewModel.m1323withPostLoginTempTokenBWLJW6A(str3, str2, c02191, this);
                    if (objM1323withPostLoginTempTokenBWLJW6A == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM1323withPostLoginTempTokenBWLJW6A = AnonymousClass001.A0q(obj);
                }
                return C3cG.A0t(objM1323withPostLoginTempTokenBWLJW6A);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(String str, String str2, HtJ<? super HsJ<? extends String>> htJ) {
                return invoke2(str, str2, (HtJ<? super HsJ<String>>) htJ);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2$2", f = "NativeLoginViewModel.kt", l = {6501}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2$2, reason: invalid class name and collision with other inner class name */
        public final class C02202 extends AbstractC07127nr implements G0W<String, String, HtJ<? super HsJ<? extends HatchDblProvision>>, Object> {
            public final /* synthetic */ String $provisionBearer;
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public int label;
            public final /* synthetic */ NativeLoginViewModel this$0;

            @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2$2$1", f = "NativeLoginViewModel.kt", l = {6502}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2$2$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends HatchDblProvision>>, Object> {
                public final /* synthetic */ String $aymhDeviceId;
                public final /* synthetic */ String $frl;
                public /* synthetic */ Object L$0;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(String str, String str2, HtJ<? super AnonymousClass1> htJ) {
                    super(2, htJ);
                    this.$frl = str;
                    this.$aymhDeviceId = str2;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$frl, this.$aymhDeviceId, htJ);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends HatchDblProvision>> htJ) {
                    return invoke2(str, (HtJ<? super HsJ<HatchDblProvision>>) htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    Object objM1255dblProvisionBWLJW6A;
                    String str = (String) this.L$0;
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        HatchAuthApi hatchAuthApi = HatchAuthApi.INSTANCE;
                        String str2 = this.$frl;
                        String str3 = this.$aymhDeviceId;
                        this.L$0 = null;
                        this.label = 1;
                        objM1255dblProvisionBWLJW6A = hatchAuthApi.m1255dblProvisionBWLJW6A(str, str2, str3, this);
                        if (objM1255dblProvisionBWLJW6A == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        objM1255dblProvisionBWLJW6A = AnonymousClass001.A0q(obj);
                    }
                    return C3cG.A0t(objM1255dblProvisionBWLJW6A);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(String str, HtJ<? super HsJ<HatchDblProvision>> htJ) {
                    return ((AnonymousClass1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02202(NativeLoginViewModel nativeLoginViewModel, String str, HtJ<? super C02202> htJ) {
                super(3, htJ);
                this.this$0 = nativeLoginViewModel;
                this.$provisionBearer = str;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(String str, String str2, HtJ<? super HsJ<HatchDblProvision>> htJ) {
                C02202 c02202 = new C02202(this.this$0, this.$provisionBearer, htJ);
                c02202.L$0 = str;
                c02202.L$1 = str2;
                return c02202.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object objM1323withPostLoginTempTokenBWLJW6A;
                String str = (String) this.L$0;
                String str2 = (String) this.L$1;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    NativeLoginViewModel nativeLoginViewModel = this.this$0;
                    String str3 = this.$provisionBearer;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(str, str2, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    objM1323withPostLoginTempTokenBWLJW6A = nativeLoginViewModel.m1323withPostLoginTempTokenBWLJW6A(str3, str2, anonymousClass1, this);
                    if (objM1323withPostLoginTempTokenBWLJW6A == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM1323withPostLoginTempTokenBWLJW6A = AnonymousClass001.A0q(obj);
                }
                return C3cG.A0t(objM1323withPostLoginTempTokenBWLJW6A);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(String str, String str2, HtJ<? super HsJ<? extends HatchDblProvision>> htJ) {
                return invoke2(str, str2, (HtJ<? super HsJ<HatchDblProvision>>) htJ);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126022(String str, String str2, String str3, String str4, Boolean bool, boolean z, String str5, HtJ<? super C126022> htJ) {
            super(2, htJ);
            this.$abraUserId = str;
            this.$accountId = str2;
            this.$contactPoint = str3;
            this.$frlAccessToken = str4;
            this.$rememberDeviceValue = bool;
            this.$wasOneTap = z;
            this.$provisionBearer = str5;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126022(this.$abraUserId, this.$accountId, this.$contactPoint, this.$frlAccessToken, this.$rememberDeviceValue, this.$wasOneTap, this.$provisionBearer, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                r6 = r16
                int r0 = r6.label
                r13 = 0
                r4 = 3
                r2 = 2
                r9 = 1
                if (r0 == 0) goto L18
                if (r0 == r9) goto L63
                if (r0 == r2) goto L90
                if (r0 != r4) goto Laf
                X.Hwg.A00(r17)
            L15:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L18:
                X.Hwg.A00(r17)
                com.facebook.aura.login.nativeflow.NativeLoginViewModel r0 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.this
                com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts r7 = r0.rememberedAccounts
                java.lang.String r3 = r6.$abraUserId
                java.lang.String r1 = r6.$accountId
                java.lang.String r0 = r6.$contactPoint
                boolean r0 = r7.rememberAccountAfterLogin(r3, r1, r0)
                r3 = r0 ^ 1
                if (r0 != 0) goto L49
                com.facebook.aura.analytics.hatch.HatchAppEventLogger r10 = com.facebook.aura.analytics.hatch.HatchAppEventLogger.INSTANCE
                com.facebook.aura.analytics.hatch.HatchSurface r0 = com.facebook.aura.analytics.hatch.HatchSurface.ONBOARDING
                java.lang.String r12 = r0.getValue()
                com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.RESULT
                java.lang.String r0 = r0.getValue()
                java.lang.String r14 = "error"
                java.util.Map r16 = X.AnonymousClass006.A10(r0, r14)
                java.lang.String r11 = "remember_device_save"
                r15 = r11
                r17 = r13
                r10.logEvent(r11, r12, r13, r14, r15, r16, r17)
            L49:
                com.facebook.aura.login.nativeflow.NativeLoginViewModel r11 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.this
                com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts r10 = r11.rememberedAccounts
                java.lang.String r8 = r6.$abraUserId
                java.lang.String r7 = r6.$frlAccessToken
                java.lang.String r1 = r6.$provisionBearer
                com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2$1 r0 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2$1
                r0.<init>(r11, r1, r13)
                r6.I$0 = r3
                r6.label = r9
                java.lang.Object r0 = r10.saveAccountAfterLogin(r8, r7, r0, r6)
                if (r0 != r5) goto L68
                return r5
            L63:
                int r3 = r6.I$0
                X.Hwg.A00(r17)
            L68:
                com.facebook.aura.login.nativeflow.NativeLoginViewModel r0 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.this
                com.facebook.aura.login.nativeflow.NativeLoginViewModel.access$dropLandingSavedAccounts(r0)
                com.facebook.aura.login.nativeflow.NativeLoginViewModel r9 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.this
                com.facebook.aura.login.nativeflow.NativeLoginOneTap r10 = r9.oneTap
                java.lang.Boolean r11 = r6.$rememberDeviceValue
                boolean r12 = r6.$wasOneTap
                java.lang.String r8 = r6.$abraUserId
                java.lang.String r7 = r6.$frlAccessToken
                java.lang.String r1 = r6.$provisionBearer
                com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2$2 r0 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$finishLogin$2$2
                r0.<init>(r9, r1, r13)
                r6.I$0 = r3
                r6.label = r2
                r13 = r8
                r14 = r7
                r15 = r0
                r16 = r6
                java.lang.Object r0 = r10.afterLogin(r11, r12, r13, r14, r15, r16)
                if (r0 != r5) goto L95
                return r5
            L90:
                int r3 = r6.I$0
                X.Hwg.A00(r17)
            L95:
                com.facebook.aura.login.nativeflow.NativeLoginViewModel r0 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.this
                com.facebook.aura.login.nativeflow.NativeLoginViewModel.access$dropLandingSavedAccounts(r0)
                if (r3 != 0) goto L15
                com.facebook.aura.login.nativeflow.NativeLoginViewModel r0 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.this
                com.facebook.aura.login.nativeflow.NativeLoginRememberedAccounts r2 = r0.rememberedAccounts
                java.lang.String r1 = r6.$abraUserId
                java.lang.String r0 = r6.$frlAccessToken
                r6.I$0 = r3
                r6.label = r4
                java.lang.Object r0 = r2.refreshLinkedAccounts(r1, r0, r6)
                if (r0 != r5) goto L15
                return r5
            Laf:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.C126022.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126022) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel", f = "NativeLoginViewModel.kt", l = {2530}, m = "freshSsoAccount", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$freshSsoAccount$1, reason: invalid class name and case insensitive filesystem */
    public final class C126031 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C126031(HtJ<? super C126031> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginViewModel.this.freshSsoAccount(null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$handleLinkingDisclosure$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C126042 extends C7438Evz implements G0V<String, HatchCaaNtpSourcePlatform, Unit> {
        public C126042(Object obj) {
            super(2, obj, HatchCaaRegistrationLogger.class, "logAcOptInStart", "logAcOptInStart(Ljava/lang/String;Lcom/facebook/aura/analytics/hatch/caa/HatchCaaNtpSourcePlatform;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            ((HatchCaaRegistrationLogger) this.receiver).logAcOptInStart(str, hatchCaaNtpSourcePlatform);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            invoke2(str, hatchCaaNtpSourcePlatform);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$handleNtpUpsellLinkingDisclosure$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C126052 extends C7438Evz implements G0V<String, HatchCaaNtpSourcePlatform, Unit> {
        public C126052(Object obj) {
            super(2, obj, HatchCaaRegistrationLogger.class, "logAcOptInStart", "logAcOptInStart(Ljava/lang/String;Lcom/facebook/aura/analytics/hatch/caa/HatchCaaNtpSourcePlatform;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            ((HatchCaaRegistrationLogger) this.receiver).logAcOptInStart(str, hatchCaaNtpSourcePlatform);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            invoke2(str, hatchCaaNtpSourcePlatform);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$launchDiscoverablePasskey$1", f = "NativeLoginViewModel.kt", l = {2951}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$launchDiscoverablePasskey$1, reason: invalid class name and case insensitive filesystem */
    public final class C126061 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $epoch;
        public int I$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126061(int i, HtJ<? super C126061> htJ) {
            super(2, htJ);
            this.$epoch = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126061(this.$epoch, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                    int i2 = this.$epoch;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = nativeLoginViewModel.offerDiscoverablePasskey(i2, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                NativeLoginViewModel.this.settlePasskeyOffer(this.$epoch, AnonymousClass001.A1X(obj));
            } catch (Exception e) {
                NativeLoginViewModel.this.settlePasskeyOffer(this.$epoch, false);
                if (e instanceof CancellationException) {
                    throw e;
                }
                CFK.A06(NativeLoginViewModelKt.TAG, FGI.A0M("discoverable passkey offer failed: ", C3cI.A0Y(e)));
            }
            NativeLoginViewModel.this.concedeToGoogleIfIdle();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126061) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$listenForSmsCode$1", f = "NativeLoginViewModel.kt", l = {3401, 3404}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$listenForSmsCode$1, reason: invalid class name and case insensitive filesystem */
    public final class C126071 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C126071(HtJ<? super C126071> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126071(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SmsOtpUserConsent smsOtpUserConsent = SmsOtpUserConsent.INSTANCE;
                Application application = NativeLoginViewModel.this.application;
                this.label = 1;
                obj = smsOtpUserConsent.startListening(application, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            if (AnonymousClass001.A1X(obj)) {
                C20Q<Intent> c20qConsentIntents = SmsOtpUserConsent.INSTANCE.consentIntents(NativeLoginViewModel.this.application);
                final NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                C20Z<? super Intent> c20z = new C20Z() { // from class: com.facebook.aura.login.nativeflow.NativeLoginViewModel.listenForSmsCode.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Intent) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Intent intent, HtJ<? super Unit> htJ) {
                        nativeLoginViewModel.emitEffect(new NativeLoginViewEffect.LaunchSmsConsent(intent));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 2;
                if (c20qConsentIntents.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return NativeLoginViewModel.this.new C126071(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel", f = "NativeLoginViewModel.kt", l = {6225}, m = "mintTempToken", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$mintTempToken$1, reason: invalid class name and case insensitive filesystem */
    public final class C126081 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C126081(HtJ<? super C126081> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginViewModel.this.mintTempToken(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1", f = "NativeLoginViewModel.kt", l = {MC.hatch_activity_screen.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1, reason: invalid class name and case insensitive filesystem */
    public final class C126091 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C126091(HtJ<? super C126091> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126091(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$filter$1 nativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$filter$1 = new NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$filter$1(GDB.A01(new NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1(nativeLoginViewModel._uiState, nativeLoginViewModel)));
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.login.nativeflow.NativeLoginViewModel.observeEntryScreenIdle.1.3
                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        nativeLoginViewModel.concedeToGoogleIfIdle();
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        nativeLoginViewModel.concedeToGoogleIfIdle();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (nativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return NativeLoginViewModel.this.new C126091(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeLandingIdle$1", f = "NativeLoginViewModel.kt", l = {550}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeLandingIdle$1, reason: invalid class name and case insensitive filesystem */
    public final class C126101 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C126101(HtJ<? super C126101> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126101(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                NativeLoginViewModel$observeLandingIdle$1$invokeSuspend$$inlined$filter$1 nativeLoginViewModel$observeLandingIdle$1$invokeSuspend$$inlined$filter$1 = new NativeLoginViewModel$observeLandingIdle$1$invokeSuspend$$inlined$filter$1(GDB.A01(new NativeLoginViewModel$observeLandingIdle$1$invokeSuspend$$inlined$map$1(nativeLoginViewModel._uiState, nativeLoginViewModel)));
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.login.nativeflow.NativeLoginViewModel.observeLandingIdle.1.3
                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        nativeLoginViewModel.showLatestRememberedMuseProfiles();
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        nativeLoginViewModel.showLatestRememberedMuseProfiles();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (nativeLoginViewModel$observeLandingIdle$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return NativeLoginViewModel.this.new C126101(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeSignOut$1", f = "NativeLoginViewModel.kt", l = {MC.hatch_android_avatar_abra.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeSignOut$1, reason: invalid class name and case insensitive filesystem */
    public final class C126111 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C126111(HtJ<? super C126111> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126111(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NativeLoginViewModel$observeSignOut$1$invokeSuspend$$inlined$filter$1 nativeLoginViewModel$observeSignOut$1$invokeSuspend$$inlined$filter$1 = new NativeLoginViewModel$observeSignOut$1$invokeSuspend$$inlined$filter$1(AnonymousClass602.A00(AuraSessionManager.state));
                final NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                C20Z<? super AuraSessionManager.SessionState> c20z = new C20Z() { // from class: com.facebook.aura.login.nativeflow.NativeLoginViewModel.observeSignOut.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        nativeLoginViewModel.resetForNewLogin();
                        return Unit.INSTANCE;
                    }

                    public final Object emit(AuraSessionManager.SessionState sessionState, HtJ<? super Unit> htJ) {
                        nativeLoginViewModel.resetForNewLogin();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (nativeLoginViewModel$observeSignOut$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return NativeLoginViewModel.this.new C126111(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel", f = "NativeLoginViewModel.kt", l = {3039, 3098, 3175}, m = "offerDiscoverablePasskey", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$offerDiscoverablePasskey$1, reason: invalid class name and case insensitive filesystem */
    public final class C126121 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C126121(HtJ<? super C126121> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginViewModel.this.offerDiscoverablePasskey(0, this);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$offerDiscoverablePasskey$2, reason: invalid class name and case insensitive filesystem */
    public final class C126132 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public static final C126132 INSTANCE = new C126132();

        public C126132() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th == null || (th instanceof CancellationException)) {
                return;
            }
            CFK.A06(NativeLoginViewModelKt.TAG, FGI.A0M("temp token mint failed: ", C3cI.A0Y(th)));
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onAccountSelectionSelected$2", f = "NativeLoginViewModel.kt", l = {4281}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onAccountSelectionSelected$2, reason: invalid class name and case insensitive filesystem */
    public final class C126142 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $ref;
        public final /* synthetic */ String $state;
        public /* synthetic */ Object L$0;
        public int label;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA0Y = obj;
            Object obj2 = this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                NativeLoginViewModel$onAccountSelectionSelected$2$result$1 nativeLoginViewModel$onAccountSelectionSelected$2$result$1 = new NativeLoginViewModel$onAccountSelectionSelected$2$result$1(this.$state, this.$ref, null);
                this.L$0 = obj2;
                this.label = 1;
                objA0Y = C3cH.A0Y(nativeLoginViewModel, this, nativeLoginViewModel$onAccountSelectionSelected$2$result$1);
                if (objA0Y == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HsJ hsJ = (HsJ) objA0Y;
            if (hsJ != null) {
                Object obj3 = hsJ.value;
                NativeLoginViewModel nativeLoginViewModel2 = NativeLoginViewModel.this;
                if (!(obj3 instanceof C10571Hud)) {
                    HatchAuthCredentials hatchAuthCredentials = (HatchAuthCredentials) obj3;
                    nativeLoginViewModel2.accountSelectionState = null;
                    nativeLoginViewModel2.accountSelectionRefs = AGH.A0E();
                    nativeLoginViewModel2.logAccountSelectionOutcome(hatchAuthCredentials);
                    if (!NativeLoginViewModel.handleLoginContinuation$default(nativeLoginViewModel2, hatchAuthCredentials, null, HatchCaaLoginEventStep.ACCOUNT_SELECTOR, null, 10, null)) {
                        NativeLoginViewModel.completeLogin$default(nativeLoginViewModel2, hatchAuthCredentials, null, false, 6, null);
                    }
                }
                NativeLoginViewModel nativeLoginViewModel3 = NativeLoginViewModel.this;
                Throwable thA00 = HsJ.A00(obj3);
                if (thA00 != null) {
                    nativeLoginViewModel3.logAccountSelectionOutcomeFailure(C3cG.A0C(HatchCaaStage.SELECT_ACCOUNT, thA00));
                    nativeLoginViewModel3.presentFailure(thA00, NativeLoginStep.SELECT_ACCOUNT);
                }
            } else {
                NativeLoginViewModel.this.logAccountSelectionOutcomeFailure(C3cI.A09(HatchCaaFailure.Companion, HatchCaaStage.SELECT_ACCOUNT));
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126142(String str, String str2, HtJ<? super C126142> htJ) {
            super(2, htJ);
            this.$state = str;
            this.$ref = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C126142 c126142 = NativeLoginViewModel.this.new C126142(this.$state, this.$ref, htJ);
            c126142.L$0 = obj;
            return c126142;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126142) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onDidntGetCodeClicked$2", f = "NativeLoginViewModel.kt", l = {5783}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onDidntGetCodeClicked$2, reason: invalid class name and case insensitive filesystem */
    public final class C126152 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchSavedAccount $card;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126152(HatchSavedAccount hatchSavedAccount, HtJ<? super C126152> htJ) {
            super(2, htJ);
            this.$card = hatchSavedAccount;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126152(this.$card, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                HatchSavedAccount hatchSavedAccount = this.$card;
                this.label = 1;
                obj = nativeLoginViewModel.sendSavedAccountCode(hatchSavedAccount, true, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (!AnonymousClass001.A1X(obj)) {
                NativeLoginViewModel.this.restartFromPhoneEntry(NativeLoginViewModel.SESSION_EXPIRED_DIALOG);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126152) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onEntryScreenShown$2", f = "NativeLoginViewModel.kt", l = {2886}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onEntryScreenShown$2, reason: invalid class name and case insensitive filesystem */
    public final class C126162 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C126162(HtJ<? super C126162> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126162(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            NativeLoginUiState value;
            Object objMayHaveGoogleAccount = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objMayHaveGoogleAccount);
                NativeLoginGoogleSignIn nativeLoginGoogleSignIn = NativeLoginGoogleSignIn.INSTANCE;
                Application application = NativeLoginViewModel.this.application;
                this.label = 1;
                objMayHaveGoogleAccount = nativeLoginGoogleSignIn.mayHaveGoogleAccount(application, this);
                if (objMayHaveGoogleAccount == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objMayHaveGoogleAccount);
            }
            if (AnonymousClass001.A1X(objMayHaveGoogleAccount)) {
                BLG<NativeLoginUiState> blg = NativeLoginViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, true, -1, 33554431, null)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return NativeLoginViewModel.this.new C126162(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onGoogleSignInClicked$1", f = "NativeLoginViewModel.kt", l = {2223}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onGoogleSignInClicked$1, reason: invalid class name and case insensitive filesystem */
    public final class C126171 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Activity $activity;
        public int label;
        public final /* synthetic */ NativeLoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126171(Activity activity, NativeLoginViewModel nativeLoginViewModel, HtJ<? super C126171> htJ) {
            super(2, htJ);
            this.$activity = activity;
            this.this$0 = nativeLoginViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C126171(this.$activity, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchCaaLoginLogger.INSTANCE.logGoogleCredentialManagerLaunchAttempt();
                    NativeLoginGoogleSignIn nativeLoginGoogleSignIn = NativeLoginGoogleSignIn.INSTANCE;
                    Activity activity = this.$activity;
                    this.label = 1;
                    obj = nativeLoginGoogleSignIn.fetch(activity, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                NativeLoginGoogleCredential nativeLoginGoogleCredential = (NativeLoginGoogleCredential) obj;
                if (nativeLoginGoogleCredential != null) {
                    this.this$0.exchangeGoogleCredential(nativeLoginGoogleCredential);
                }
                return Unit.INSTANCE;
            } finally {
                this.this$0.googleSignInSheetOpen.set(false);
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126171) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onGoogleSignInRequested$1", f = "NativeLoginViewModel.kt", l = {2207}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onGoogleSignInRequested$1, reason: invalid class name and case insensitive filesystem */
    public final class C126181 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Activity $activity;
        public final /* synthetic */ NativeLoginGoogleCredential $prefetched;
        public int label;
        public final /* synthetic */ NativeLoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126181(NativeLoginGoogleCredential nativeLoginGoogleCredential, Activity activity, NativeLoginViewModel nativeLoginViewModel, HtJ<? super C126181> htJ) {
            super(2, htJ);
            this.$prefetched = nativeLoginGoogleCredential;
            this.$activity = activity;
            this.this$0 = nativeLoginViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C126181(this.$prefetched, this.$activity, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            NativeLoginGoogleCredential nativeLoginGoogleCredential;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (this.$prefetched == null) {
                    HatchCaaLoginLogger.INSTANCE.logGoogleCredentialManagerLaunchAttempt();
                }
                nativeLoginGoogleCredential = this.$prefetched;
                if (nativeLoginGoogleCredential == null) {
                    NativeLoginGoogleSignIn nativeLoginGoogleSignIn = NativeLoginGoogleSignIn.INSTANCE;
                    Activity activity = this.$activity;
                    this.label = 1;
                    obj = nativeLoginGoogleSignIn.fetch(activity, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                this.this$0.exchangeGoogleCredential(nativeLoginGoogleCredential);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            nativeLoginGoogleCredential = (NativeLoginGoogleCredential) obj;
            if (nativeLoginGoogleCredential != null) {
                this.this$0.exchangeGoogleCredential(nativeLoginGoogleCredential);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126181) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onLinkingDisclosureBackClicked$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C126191 extends C7438Evz implements G0V<String, HatchCaaNtpSourcePlatform, Unit> {
        public C126191(Object obj) {
            super(2, obj, HatchCaaRegistrationLogger.class, "logAcOptInBack", "logAcOptInBack(Ljava/lang/String;Lcom/facebook/aura/analytics/hatch/caa/HatchCaaNtpSourcePlatform;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            ((HatchCaaRegistrationLogger) this.receiver).logAcOptInBack(str, hatchCaaNtpSourcePlatform);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            invoke2(str, hatchCaaNtpSourcePlatform);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onLinkingDisclosureConfirmClicked$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C126202 extends C7438Evz implements G0V<String, HatchCaaNtpSourcePlatform, Unit> {
        public C126202(Object obj) {
            super(2, obj, HatchCaaRegistrationLogger.class, "logAcOptedIn", "logAcOptedIn(Ljava/lang/String;Lcom/facebook/aura/analytics/hatch/caa/HatchCaaNtpSourcePlatform;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            ((HatchCaaRegistrationLogger) this.receiver).logAcOptedIn(str, hatchCaaNtpSourcePlatform);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            invoke2(str, hatchCaaNtpSourcePlatform);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onLinkingDisclosureConfirmClicked$3, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C126213 extends C7438Evz implements G0V<String, HatchCaaNtpSourcePlatform, Unit> {
        public C126213(Object obj) {
            super(2, obj, HatchCaaRegistrationLogger.class, "logAcOptedIn", "logAcOptedIn(Ljava/lang/String;Lcom/facebook/aura/analytics/hatch/caa/HatchCaaNtpSourcePlatform;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            ((HatchCaaRegistrationLogger) this.receiver).logAcOptedIn(str, hatchCaaNtpSourcePlatform);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            invoke2(str, hatchCaaNtpSourcePlatform);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onLinkingDisclosureDeclineClicked$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C126221 extends C7438Evz implements G0V<String, HatchCaaNtpSourcePlatform, Unit> {
        public C126221(Object obj) {
            super(2, obj, HatchCaaRegistrationLogger.class, "logAcOptedOut", "logAcOptedOut(Ljava/lang/String;Lcom/facebook/aura/analytics/hatch/caa/HatchCaaNtpSourcePlatform;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            ((HatchCaaRegistrationLogger) this.receiver).logAcOptedOut(str, hatchCaaNtpSourcePlatform);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
            invoke2(str, hatchCaaNtpSourcePlatform);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onNameCompletionContinueClicked$1", f = "NativeLoginViewModel.kt", l = {4583, 4616}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onNameCompletionContinueClicked$1, reason: invalid class name and case insensitive filesystem */
    public final class C126231 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchCaaLoginCredentialType $credentialType;
        public final /* synthetic */ String $firstName;
        public final /* synthetic */ boolean $isJoin;
        public final /* synthetic */ String $lastName;
        public final /* synthetic */ String $linkingDisclosureVersion;
        public final /* synthetic */ HatchCaaNtpSourcePlatform $ntpSourcePlatform;
        public final /* synthetic */ NativeLoginSsoAccount $sso;
        public final /* synthetic */ String $tosContentVersion;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126231(boolean z, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, NativeLoginSsoAccount nativeLoginSsoAccount, String str, String str2, String str3, String str4, HtJ<? super C126231> htJ) {
            super(2, htJ);
            this.$isJoin = z;
            this.$ntpSourcePlatform = hatchCaaNtpSourcePlatform;
            this.$credentialType = hatchCaaLoginCredentialType;
            this.$sso = nativeLoginSsoAccount;
            this.$firstName = str;
            this.$lastName = str2;
            this.$tosContentVersion = str3;
            this.$linkingDisclosureVersion = str4;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126231(this.$isJoin, this.$ntpSourcePlatform, this.$credentialType, this.$sso, this.$firstName, this.$lastName, this.$tosContentVersion, this.$linkingDisclosureVersion, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r70) {
            /*
                Method dump skipped, instructions count: 484
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.C126231.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126231) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onOtpConfirmClicked$1", f = "NativeLoginViewModel.kt", l = {3486}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onOtpConfirmClicked$1, reason: invalid class name and case insensitive filesystem */
    public final class C126241 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $otp;
        public final /* synthetic */ String $state;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126241(String str, String str2, HtJ<? super C126241> htJ) {
            super(2, htJ);
            this.$state = str;
            this.$otp = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C126241 c126241 = NativeLoginViewModel.this.new C126241(this.$state, this.$otp, htJ);
            c126241.L$0 = obj;
            return c126241;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                NativeLoginViewModel$onOtpConfirmClicked$1$result$1 nativeLoginViewModel$onOtpConfirmClicked$1$result$1 = new NativeLoginViewModel$onOtpConfirmClicked$1$result$1(this.$state, this.$otp, null);
                this.L$0 = obj2;
                this.label = 1;
                obj = C3cH.A0Y(nativeLoginViewModel, this, nativeLoginViewModel$onOtpConfirmClicked$1$result$1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HsJ hsJ = (HsJ) obj;
            if (hsJ != null) {
                Object obj3 = hsJ.value;
                NativeLoginViewModel nativeLoginViewModel2 = NativeLoginViewModel.this;
                if (!(obj3 instanceof C10571Hud)) {
                    nativeLoginViewModel2.onOtpConfirmed((HatchAuthCredentials) obj3);
                }
                NativeLoginViewModel nativeLoginViewModel3 = NativeLoginViewModel.this;
                Throwable thA00 = HsJ.A00(obj3);
                if (thA00 != null) {
                    nativeLoginViewModel3.logOtpOutcomeFailure(C3cG.A0C(HatchCaaStage.CONFIRM_OTP, thA00));
                    nativeLoginViewModel3.presentFailure(thA00, NativeLoginStep.CONFIRM_OTP);
                }
            } else {
                NativeLoginViewModel.this.logOtpOutcomeFailure(C3cI.A09(HatchCaaFailure.Companion, HatchCaaStage.CONFIRM_OTP));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126241) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onPasswordConfirmClicked$1", f = "NativeLoginViewModel.kt", l = {5612}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onPasswordConfirmClicked$1, reason: invalid class name and case insensitive filesystem */
    public final class C126251 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $password;
        public final /* synthetic */ String $state;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ NativeLoginViewModel this$0;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA0Y = obj;
            Object obj2 = this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String encryptedPassword = AuraPasswordEncryptionHelper.INSTANCE.getEncryptedPassword(this.$password);
                if (encryptedPassword == null) {
                    encryptedPassword = this.$password;
                }
                NativeLoginViewModel nativeLoginViewModel = this.this$0;
                NativeLoginViewModel$onPasswordConfirmClicked$1$result$1 nativeLoginViewModel$onPasswordConfirmClicked$1$result$1 = new NativeLoginViewModel$onPasswordConfirmClicked$1$result$1(this.$state, encryptedPassword, null);
                this.L$0 = obj2;
                this.L$1 = null;
                this.label = 1;
                objA0Y = C3cH.A0Y(nativeLoginViewModel, this, nativeLoginViewModel$onPasswordConfirmClicked$1$result$1);
                if (objA0Y == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HsJ hsJ = (HsJ) objA0Y;
            if (hsJ != null) {
                Object obj3 = hsJ.value;
                NativeLoginViewModel nativeLoginViewModel2 = this.this$0;
                if (!(obj3 instanceof C10571Hud)) {
                    HatchAuthCredentials hatchAuthCredentials = (HatchAuthCredentials) obj3;
                    nativeLoginViewModel2.provenContactPoint = nativeLoginViewModel2.submittedContactPoint;
                    nativeLoginViewModel2.logPasswordOutcome(hatchAuthCredentials);
                    if (!NativeLoginViewModel.handleLoginContinuation$default(nativeLoginViewModel2, hatchAuthCredentials, null, HatchCaaLoginEventStep.PASSWORD, LoginMethod.PASSWORD, 2, null)) {
                        NativeLoginViewModel.completeLogin$default(nativeLoginViewModel2, hatchAuthCredentials, null, false, 6, null);
                    }
                }
                NativeLoginViewModel nativeLoginViewModel3 = this.this$0;
                Throwable thA00 = HsJ.A00(obj3);
                if (thA00 != null) {
                    nativeLoginViewModel3.logPasswordOutcomeFailure(C3cG.A0C(HatchCaaStage.CONFIRM_PASSWORD, thA00));
                    nativeLoginViewModel3.presentFailure(thA00, NativeLoginStep.CONFIRM_PASSWORD);
                }
            } else {
                this.this$0.logPasswordOutcomeFailure(C3cI.A09(HatchCaaFailure.Companion, HatchCaaStage.CONFIRM_PASSWORD));
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126251(String str, NativeLoginViewModel nativeLoginViewModel, String str2, HtJ<? super C126251> htJ) {
            super(2, htJ);
            this.$password = str;
            this.this$0 = nativeLoginViewModel;
            this.$state = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C126251 c126251 = new C126251(this.$password, this.this$0, this.$state, htJ);
            c126251.L$0 = obj;
            return c126251;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126251) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onPasswordFallback$2", f = "NativeLoginViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onPasswordFallback$2, reason: invalid class name and case insensitive filesystem */
    public final class C126262 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C126262(HtJ<? super C126262> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C126262(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            AuraPasswordEncryptionHelper.INSTANCE.prefetchKey();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C126262(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onReactivateConfirmed$1", f = "NativeLoginViewModel.kt", l = {4064}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onReactivateConfirmed$1, reason: invalid class name and case insensitive filesystem */
    public final class C126271 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchReactivationChallenge $challenge;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126271(HatchReactivationChallenge hatchReactivationChallenge, HtJ<? super C126271> htJ) {
            super(2, htJ);
            this.$challenge = hatchReactivationChallenge;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C126271 c126271 = NativeLoginViewModel.this.new C126271(this.$challenge, htJ);
            c126271.L$0 = obj;
            return c126271;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchCaaLoginEventStep hatchCaaLoginEventStep;
            NativeLoginUiState value;
            Object objA0Y = obj;
            Object obj2 = this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objA0Y);
                hatchCaaLoginEventStep = NativeLoginViewModel.this.reactivationOriginStep;
                NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                NativeLoginViewModel$onReactivateConfirmed$1$result$1 nativeLoginViewModel$onReactivateConfirmed$1$result$1 = new NativeLoginViewModel$onReactivateConfirmed$1$result$1(this.$challenge, null);
                this.L$0 = obj2;
                this.L$1 = hatchCaaLoginEventStep;
                this.label = 1;
                objA0Y = C3cH.A0Y(nativeLoginViewModel, this, nativeLoginViewModel$onReactivateConfirmed$1$result$1);
                if (objA0Y == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                hatchCaaLoginEventStep = (HatchCaaLoginEventStep) this.L$1;
                Hwg.A00(objA0Y);
            }
            HsJ hsJ = (HsJ) objA0Y;
            if (hsJ != null) {
                Object obj3 = hsJ.value;
                NativeLoginViewModel nativeLoginViewModel2 = NativeLoginViewModel.this;
                if (!(obj3 instanceof C10571Hud)) {
                    HatchAuthCredentials hatchAuthCredentials = (HatchAuthCredentials) obj3;
                    nativeLoginViewModel2.reactivationOriginStep = null;
                    LoginSessionOutcome loginSessionOutcomeReactivatedOutcome = hatchCaaLoginEventStep != null ? nativeLoginViewModel2.reactivatedOutcome(hatchCaaLoginEventStep) : null;
                    if (!NativeLoginViewModel.handleLoginContinuation$default(nativeLoginViewModel2, hatchAuthCredentials, loginSessionOutcomeReactivatedOutcome, hatchCaaLoginEventStep, null, 8, null)) {
                        NativeLoginViewModel.completeLogin$default(nativeLoginViewModel2, hatchAuthCredentials, loginSessionOutcomeReactivatedOutcome, false, 4, null);
                    }
                }
                NativeLoginViewModel nativeLoginViewModel3 = NativeLoginViewModel.this;
                Throwable thA00 = HsJ.A00(obj3);
                if (thA00 != null) {
                    BLG<NativeLoginUiState> blg = nativeLoginViewModel3._uiState;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67092479, null)));
                    nativeLoginViewModel3.logReactivationFailure(hatchCaaLoginEventStep, C3cG.A0C(HatchCaaStage.CANCEL_DELETION, thA00));
                    nativeLoginViewModel3.presentFailure(thA00, NativeLoginStep.CANCEL_DELETION);
                }
            } else {
                NativeLoginViewModel.this.logReactivationFailure(hatchCaaLoginEventStep, C3cI.A09(HatchCaaFailure.Companion, HatchCaaStage.CANCEL_DELETION));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126271) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onRememberedAccountSelected$1", f = "NativeLoginViewModel.kt", l = {1675, 1703}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onRememberedAccountSelected$1, reason: invalid class name and case insensitive filesystem */
    public final class C126281 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ AuraRememberedAccount $remembered;
        public final /* synthetic */ HatchAuthFlowContext.SsoSourceCounts $rowSourceCounts;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126281(AuraRememberedAccount auraRememberedAccount, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, HtJ<? super C126281> htJ) {
            super(1, htJ);
            this.$remembered = auraRememberedAccount;
            this.$rowSourceCounts = ssoSourceCounts;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126281(this.$remembered, this.$rowSourceCounts, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                AuraRememberedAccount auraRememberedAccount = this.$remembered;
                String str = auraRememberedAccount.abraUserId;
                String str2 = auraRememberedAccount.savedAccountId;
                NativeLoginViewModel$onRememberedAccountSelected$1$attempt$1 nativeLoginViewModel$onRememberedAccountSelected$1$attempt$1 = new NativeLoginViewModel$onRememberedAccountSelected$1$attempt$1(nativeLoginViewModel, this.$rowSourceCounts);
                this.label = 1;
                obj = nativeLoginViewModel.attemptOneTap(str, str2, nativeLoginViewModel$onRememberedAccountSelected$1$attempt$1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            NativeLoginOneTap.Attempt attempt = (NativeLoginOneTap.Attempt) obj;
            if (attempt instanceof NativeLoginOneTap.Attempt.LoggedIn) {
                NativeLoginViewModel.this.continueOneTapLogin(((NativeLoginOneTap.Attempt.LoggedIn) attempt).credentials);
            } else {
                if (!(attempt instanceof NativeLoginOneTap.Attempt.SendCode)) {
                    throw C3cG.A0q();
                }
                NativeLoginViewModel nativeLoginViewModel2 = NativeLoginViewModel.this;
                AuraRememberedAccount auraRememberedAccount2 = this.$remembered;
                HatchSavedAccount hatchSavedAccount = ((NativeLoginOneTap.Attempt.SendCode) attempt).card;
                this.L$0 = null;
                this.label = 2;
                if (nativeLoginViewModel2.sendCodeToRemembered(auraRememberedAccount2, hatchSavedAccount, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C126281) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onRemoveProfile$1", f = "NativeLoginViewModel.kt", l = {AuraDatePickerKt.AURA_DATE_PICKER_MIN_YEAR}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onRemoveProfile$1, reason: invalid class name and case insensitive filesystem */
    public final class C126291 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ AuraRememberedAccount $remembered;
        public final /* synthetic */ HatchAuthFlowContext.SsoSourceCounts $rowSourceCounts;
        public final /* synthetic */ NativeLoginSsoAccount $sibling;
        public final /* synthetic */ HatchCaaStage $stage;
        public Object L$0;
        public int label;
        public final /* synthetic */ NativeLoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126291(AuraRememberedAccount auraRememberedAccount, NativeLoginViewModel nativeLoginViewModel, NativeLoginSsoAccount nativeLoginSsoAccount, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, HatchCaaStage hatchCaaStage, NativeLoginAccountUiModel nativeLoginAccountUiModel, HtJ<? super C126291> htJ) {
            super(2, htJ);
            this.$remembered = auraRememberedAccount;
            this.this$0 = nativeLoginViewModel;
            this.$sibling = nativeLoginSsoAccount;
            this.$rowSourceCounts = ssoSourceCounts;
            this.$stage = hatchCaaStage;
            this.$account = nativeLoginAccountUiModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C126291(this.$remembered, this.this$0, this.$sibling, this.$rowSourceCounts, this.$stage, this.$account, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: all -> 0x020c, TryCatch #0 {all -> 0x020c, blocks: (B:20:0x0057, B:21:0x005a, B:10:0x0023, B:13:0x0035, B:25:0x0065, B:27:0x0075, B:28:0x0079, B:29:0x0086, B:34:0x0117, B:36:0x0122, B:37:0x0139, B:39:0x016b, B:7:0x0015, B:9:0x001d, B:15:0x0040, B:17:0x0044), top: B:53:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0117 A[Catch: all -> 0x020c, TRY_ENTER, TryCatch #0 {all -> 0x020c, blocks: (B:20:0x0057, B:21:0x005a, B:10:0x0023, B:13:0x0035, B:25:0x0065, B:27:0x0075, B:28:0x0079, B:29:0x0086, B:34:0x0117, B:36:0x0122, B:37:0x0139, B:39:0x016b, B:7:0x0015, B:9:0x001d, B:15:0x0040, B:17:0x0044), top: B:53:0x0009 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r68) {
            /*
                Method dump skipped, instructions count: 665
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.C126291.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126291) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onTwoFactorConfirmClicked$1", f = "NativeLoginViewModel.kt", l = {4780}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onTwoFactorConfirmClicked$1, reason: invalid class name and case insensitive filesystem */
    public final class C126301 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchAttestationRequest $attestationRequest;
        public final /* synthetic */ String $code;
        public final /* synthetic */ String $linkingTosContentVersion;
        public final /* synthetic */ HatchTwoFactorMethod $method;
        public final /* synthetic */ String $state;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126301(String str, HatchTwoFactorMethod hatchTwoFactorMethod, String str2, String str3, HatchAttestationRequest hatchAttestationRequest, HtJ<? super C126301> htJ) {
            super(2, htJ);
            this.$state = str;
            this.$method = hatchTwoFactorMethod;
            this.$code = str2;
            this.$linkingTosContentVersion = str3;
            this.$attestationRequest = hatchAttestationRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C126301 c126301 = NativeLoginViewModel.this.new C126301(this.$state, this.$method, this.$code, this.$linkingTosContentVersion, this.$attestationRequest, htJ);
            c126301.L$0 = obj;
            return c126301;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r70) {
            /*
                Method dump skipped, instructions count: 384
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.C126301.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126301) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onUsePasswordInsteadClicked$2", f = "NativeLoginViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$onUsePasswordInsteadClicked$2, reason: invalid class name and case insensitive filesystem */
    public final class C126312 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C126312(HtJ<? super C126312> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C126312(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            AuraPasswordEncryptionHelper.INSTANCE.prefetchKey();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C126312(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$prefetchTempToken$1", f = "NativeLoginViewModel.kt", l = {6168}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$prefetchTempToken$1, reason: invalid class name and case insensitive filesystem */
    public final class C126321 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C126321(HtJ<? super C126321> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C126321(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchTempTokenProvider hatchTempTokenProvider = HatchTempTokenProvider.INSTANCE;
                this.label = 1;
                if (hatchTempTokenProvider.m1272getIoAF18A(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C126321(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$recoverIfPasswordRequired$2", f = "NativeLoginViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$recoverIfPasswordRequired$2, reason: invalid class name and case insensitive filesystem */
    public final class C126332 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C126332(HtJ<? super C126332> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C126332(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            AuraPasswordEncryptionHelper.INSTANCE.prefetchKey();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C126332(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$removeCrossAppAccount$2", f = "NativeLoginViewModel.kt", l = {1974, 1980, 1988}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$removeCrossAppAccount$2, reason: invalid class name and case insensitive filesystem */
    public final class C126342 extends AbstractC07127nr implements G2j<HatchSsoSourceApp, String, String, HtJ<? super HsJ<? extends String>>, Object> {
        public final /* synthetic */ G0U<Throwable, Unit> $onRequestFailed;
        public final /* synthetic */ NativeLoginSsoAccount $sibling;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126342(NativeLoginSsoAccount nativeLoginSsoAccount, G0U<? super Throwable, Unit> g0u, HtJ<? super C126342> htJ) {
            super(4, htJ);
            this.$sibling = nativeLoginSsoAccount;
            this.$onRequestFailed = g0u;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HatchSsoSourceApp hatchSsoSourceApp, String str, String str2, HtJ<? super HsJ<String>> htJ) {
            C126342 c126342 = NativeLoginViewModel.this.new C126342(this.$sibling, this.$onRequestFailed, htJ);
            c126342.L$0 = hatchSsoSourceApp;
            c126342.L$1 = str;
            c126342.L$2 = str2;
            return c126342.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r8 = r9.L$0
                com.facebook.aura.login.nativeflow.HatchSsoSourceApp r8 = (com.facebook.aura.login.nativeflow.HatchSsoSourceApp) r8
                java.lang.Object r7 = r9.L$1
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r6 = r9.L$2
                java.lang.String r6 = (java.lang.String) r6
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r4 = 3
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L2f
                if (r0 == r2) goto L44
                if (r0 == r3) goto L76
                if (r0 != r4) goto L99
                java.lang.Object r2 = X.AnonymousClass001.A0q(r10)
            L1f:
                X.G0U<java.lang.Throwable, kotlin.Unit> r1 = r9.$onRequestFailed
                java.lang.Throwable r0 = X.HsJ.A00(r2)
                if (r0 == 0) goto L2a
                r1.invoke(r0)
            L2a:
                X.HsJ r0 = X.C3cG.A0t(r2)
                return r0
            L2f:
                X.Hwg.A00(r10)
                com.facebook.aura.login.nativeflow.NativeLoginViewModel r1 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.this
                r0 = 0
                r9.L$0 = r0
                r9.L$1 = r7
                r9.L$2 = r6
                r9.label = r2
                java.lang.Object r2 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.m1311access$requestCrossAppRemovalBWLJW6A(r1, r8, r7, r6, r9)
                if (r2 != r5) goto L48
                return r5
            L44:
                java.lang.Object r2 = X.AnonymousClass001.A0q(r10)
            L48:
                java.lang.Throwable r1 = X.HsJ.A00(r2)
                boolean r0 = r1 instanceof com.facebook.aura.network.hatchauth.HatchAuthException
                r10 = 0
                if (r0 == 0) goto L74
                com.facebook.aura.network.hatchauth.HatchAuthException r1 = (com.facebook.aura.network.hatchauth.HatchAuthException) r1
                if (r1 == 0) goto L74
                com.facebook.aura.network.hatchauth.HatchAuthError r1 = r1.error
            L57:
                com.facebook.aura.network.hatchauth.HatchAuthError$InvalidRequest r0 = com.facebook.aura.network.hatchauth.HatchAuthError.InvalidRequest.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L7d
                com.facebook.aura.login.nativeflow.NativeLoginViewModel r1 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.this
                com.facebook.aura.login.nativeflow.NativeLoginSsoAccount r0 = r9.$sibling
                r9.L$0 = r10
                r9.L$1 = r10
                r9.L$2 = r6
                r9.L$3 = r2
                r9.label = r3
                java.lang.Object r10 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.access$freshSsoAccount(r1, r0, r7, r9)
                if (r10 != r5) goto L7b
                return r5
            L74:
                r1 = r10
                goto L57
            L76:
                java.lang.Object r2 = r9.L$3
                X.Hwg.A00(r10)
            L7b:
                com.facebook.aura.login.nativeflow.NativeLoginSsoAccount r10 = (com.facebook.aura.login.nativeflow.NativeLoginSsoAccount) r10
            L7d:
                if (r10 == 0) goto L1f
                com.facebook.aura.login.nativeflow.NativeLoginViewModel r3 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.this
                com.facebook.aura.login.nativeflow.HatchSsoSourceApp r2 = r10.sourceApp
                java.lang.String r1 = r10.accessToken
                r0 = 0
                r9.L$0 = r0
                r9.L$1 = r0
                r9.L$2 = r0
                r9.L$3 = r0
                r9.L$4 = r0
                r9.label = r4
                java.lang.Object r2 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.m1311access$requestCrossAppRemovalBWLJW6A(r3, r2, r1, r6, r9)
                if (r2 != r5) goto L1f
                return r5
            L99:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.C126342.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Object invoke(HatchSsoSourceApp hatchSsoSourceApp, String str, String str2, HtJ<? super HsJ<? extends String>> htJ) {
            return invoke2(hatchSsoSourceApp, str, str2, (HtJ<? super HsJ<String>>) htJ);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$removeRememberedAccount$1, reason: invalid class name and case insensitive filesystem */
    public final class C126351 extends AbstractC7559F3s implements G0U<String, Unit> {

        @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$removeRememberedAccount$1$1", f = "NativeLoginViewModel.kt", l = {1954}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$removeRememberedAccount$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02221 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $savedAccountId;
            public int label;
            public final /* synthetic */ NativeLoginViewModel this$0;

            @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$removeRememberedAccount$1$1$1", f = "NativeLoginViewModel.kt", l = {1956}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$removeRememberedAccount$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C02231 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends List<? extends HatchSavedAccount>>>, Object> {
                public /* synthetic */ Object L$0;
                public int label;
                public final /* synthetic */ NativeLoginViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C02231(NativeLoginViewModel nativeLoginViewModel, HtJ<? super C02231> htJ) {
                    super(2, htJ);
                    this.this$0 = nativeLoginViewModel;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C02231 c02231 = new C02231(this.this$0, htJ);
                    c02231.L$0 = obj;
                    return c02231;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends List<? extends HatchSavedAccount>>> htJ) {
                    return invoke2(str, (HtJ<? super HsJ<? extends List<HatchSavedAccount>>>) htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    String str = (String) this.L$0;
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        NativeLoginViewModel nativeLoginViewModel = this.this$0;
                        this.L$0 = null;
                        this.label = 1;
                        obj = nativeLoginViewModel.m1321savedAccountsYNEx5aM(str, this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    HsJ hsJ = (HsJ) obj;
                    return C3cG.A0t(hsJ != null ? hsJ.value : this.this$0.m1322tempTokenUnavailabled1pmJ48());
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(String str, HtJ<? super HsJ<? extends List<HatchSavedAccount>>> htJ) {
                    return ((C02231) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$removeRememberedAccount$1$1$2", f = "NativeLoginViewModel.kt", l = {1959}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$removeRememberedAccount$1$1$2, reason: invalid class name */
            public final class AnonymousClass2 extends AbstractC07127nr implements G0W<String, String, HtJ<? super HsJ<? extends Unit>>, Object> {
                public /* synthetic */ Object L$0;
                public /* synthetic */ Object L$1;
                public int label;
                public final /* synthetic */ NativeLoginViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(NativeLoginViewModel nativeLoginViewModel, HtJ<? super AnonymousClass2> htJ) {
                    super(3, htJ);
                    this.this$0 = nativeLoginViewModel;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(String str, String str2, HtJ<? super HsJ<Unit>> htJ) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, htJ);
                    anonymousClass2.L$0 = str;
                    anonymousClass2.L$1 = str2;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    String str = (String) this.L$0;
                    String str2 = (String) this.L$1;
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        NativeLoginViewModel nativeLoginViewModel = this.this$0;
                        NativeLoginViewModel$removeRememberedAccount$1$1$2$removal$1 nativeLoginViewModel$removeRememberedAccount$1$1$2$removal$1 = new NativeLoginViewModel$removeRememberedAccount$1$1$2$removal$1(str, str2, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        obj = nativeLoginViewModel.m1324withTempTokenRgG5Fkc(false, nativeLoginViewModel$removeRememberedAccount$1$1$2$removal$1, this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    HsJ hsJ = (HsJ) obj;
                    this.this$0.dropLandingSavedAccounts();
                    return C3cG.A0t(hsJ != null ? hsJ.value : this.this$0.m1322tempTokenUnavailabled1pmJ48());
                }

                @Override // X.G0W
                public /* bridge */ /* synthetic */ Object invoke(String str, String str2, HtJ<? super HsJ<? extends Unit>> htJ) {
                    return invoke2(str, str2, (HtJ<? super HsJ<Unit>>) htJ);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02221(NativeLoginViewModel nativeLoginViewModel, String str, HtJ<? super C02221> htJ) {
                super(2, htJ);
                this.this$0 = nativeLoginViewModel;
                this.$savedAccountId = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02221(this.this$0, this.$savedAccountId, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    NativeLoginViewModel nativeLoginViewModel = this.this$0;
                    NativeLoginOneTap nativeLoginOneTap = nativeLoginViewModel.oneTap;
                    String str = this.$savedAccountId;
                    C02231 c02231 = new C02231(nativeLoginViewModel, null);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (nativeLoginOneTap.forgetSavedAccount(str, c02231, anonymousClass2, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C02221) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C02221(NativeLoginViewModel.this, str, null), AEu.A00(NativeLoginViewModel.this));
        }

        public C126351() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel", f = "NativeLoginViewModel.kt", l = {2707}, m = "requestOtp", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$requestOtp$1, reason: invalid class name and case insensitive filesystem */
    public final class C126361 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C126361(HtJ<? super C126361> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginViewModel.this.requestOtp(null, null, null, false, false, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$resolveAccounts$1", f = "NativeLoginViewModel.kt", l = {772, 787}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$resolveAccounts$1, reason: invalid class name and case insensitive filesystem */
    public final class C126371 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $landingRead;
        public final /* synthetic */ NativeLoginCaaStartupTracker $startupTracker;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$resolveAccounts$1$1", f = "NativeLoginViewModel.kt", l = {776}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$resolveAccounts$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02241 extends AbstractC07127nr implements G0U<HtJ<? super NativeLoginPickerPayload>, Object> {
            public final /* synthetic */ List<AuraRememberedAccount> $remembered;
            public final /* synthetic */ NativeLoginCaaStartupTracker $startupTracker;
            public int label;
            public final /* synthetic */ NativeLoginViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02241(List<AuraRememberedAccount> list, NativeLoginCaaStartupTracker nativeLoginCaaStartupTracker, NativeLoginViewModel nativeLoginViewModel, HtJ<? super C02241> htJ) {
                super(1, htJ);
                this.$remembered = list;
                this.$startupTracker = nativeLoginCaaStartupTracker;
                this.this$0 = nativeLoginViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C02241(this.$remembered, this.$startupTracker, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                NativeLoginCaaStartupTracker nativeLoginCaaStartupTracker;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    if (!this.$remembered.isEmpty() && (nativeLoginCaaStartupTracker = this.$startupTracker) != null) {
                        nativeLoginCaaStartupTracker.success(NativeLoginCaaStartupTracker.Landing.AYMH);
                    }
                    NativeLoginPrefetch nativeLoginPrefetch = NativeLoginPrefetch.INSTANCE;
                    Application application = this.this$0.application;
                    this.label = 1;
                    obj = nativeLoginPrefetch.pickerPayload(application, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super NativeLoginPickerPayload> htJ) {
                return ((C02241) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126371(int i, NativeLoginCaaStartupTracker nativeLoginCaaStartupTracker, HtJ<? super C126371> htJ) {
            super(2, htJ);
            this.$landingRead = i;
            this.$startupTracker = nativeLoginCaaStartupTracker;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126371(this.$landingRead, this.$startupTracker, htJ);
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:109:0x01dd A[Catch: all -> 0x0204, TryCatch #0 {all -> 0x0204, blocks: (B:30:0x009a, B:31:0x009d, B:33:0x00a3, B:35:0x00ac, B:36:0x00af, B:38:0x00b4, B:39:0x00b6, B:41:0x00c2, B:43:0x00c8, B:45:0x00ce, B:46:0x00d3, B:48:0x00de, B:50:0x00e5, B:51:0x00e8, B:62:0x010b, B:64:0x0111, B:67:0x011f, B:68:0x0128, B:70:0x012e, B:71:0x013e, B:74:0x014a, B:75:0x0153, B:77:0x0159, B:78:0x016b, B:79:0x0179, B:81:0x017f, B:87:0x0192, B:89:0x0198, B:91:0x019c, B:92:0x019e, B:94:0x01a5, B:97:0x01ab, B:99:0x01b2, B:100:0x01ba, B:102:0x01c0, B:103:0x01cc, B:105:0x01d2, B:106:0x01d4, B:107:0x01d8, B:96:0x01a9, B:109:0x01dd, B:110:0x01e2, B:112:0x01e8, B:14:0x0059, B:15:0x005c, B:20:0x006f, B:22:0x0073, B:23:0x0079, B:25:0x007d, B:27:0x0083, B:11:0x0033), top: B:124:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x01e8 A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #0 {all -> 0x0204, blocks: (B:30:0x009a, B:31:0x009d, B:33:0x00a3, B:35:0x00ac, B:36:0x00af, B:38:0x00b4, B:39:0x00b6, B:41:0x00c2, B:43:0x00c8, B:45:0x00ce, B:46:0x00d3, B:48:0x00de, B:50:0x00e5, B:51:0x00e8, B:62:0x010b, B:64:0x0111, B:67:0x011f, B:68:0x0128, B:70:0x012e, B:71:0x013e, B:74:0x014a, B:75:0x0153, B:77:0x0159, B:78:0x016b, B:79:0x0179, B:81:0x017f, B:87:0x0192, B:89:0x0198, B:91:0x019c, B:92:0x019e, B:94:0x01a5, B:97:0x01ab, B:99:0x01b2, B:100:0x01ba, B:102:0x01c0, B:103:0x01cc, B:105:0x01d2, B:106:0x01d4, B:107:0x01d8, B:96:0x01a9, B:109:0x01dd, B:110:0x01e2, B:112:0x01e8, B:14:0x0059, B:15:0x005c, B:20:0x006f, B:22:0x0073, B:23:0x0079, B:25:0x007d, B:27:0x0083, B:11:0x0033), top: B:124:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: all -> 0x0204, TryCatch #0 {all -> 0x0204, blocks: (B:30:0x009a, B:31:0x009d, B:33:0x00a3, B:35:0x00ac, B:36:0x00af, B:38:0x00b4, B:39:0x00b6, B:41:0x00c2, B:43:0x00c8, B:45:0x00ce, B:46:0x00d3, B:48:0x00de, B:50:0x00e5, B:51:0x00e8, B:62:0x010b, B:64:0x0111, B:67:0x011f, B:68:0x0128, B:70:0x012e, B:71:0x013e, B:74:0x014a, B:75:0x0153, B:77:0x0159, B:78:0x016b, B:79:0x0179, B:81:0x017f, B:87:0x0192, B:89:0x0198, B:91:0x019c, B:92:0x019e, B:94:0x01a5, B:97:0x01ab, B:99:0x01b2, B:100:0x01ba, B:102:0x01c0, B:103:0x01cc, B:105:0x01d2, B:106:0x01d4, B:107:0x01d8, B:96:0x01a9, B:109:0x01dd, B:110:0x01e2, B:112:0x01e8, B:14:0x0059, B:15:0x005c, B:20:0x006f, B:22:0x0073, B:23:0x0079, B:25:0x007d, B:27:0x0083, B:11:0x0033), top: B:124:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4 A[Catch: all -> 0x0204, TryCatch #0 {all -> 0x0204, blocks: (B:30:0x009a, B:31:0x009d, B:33:0x00a3, B:35:0x00ac, B:36:0x00af, B:38:0x00b4, B:39:0x00b6, B:41:0x00c2, B:43:0x00c8, B:45:0x00ce, B:46:0x00d3, B:48:0x00de, B:50:0x00e5, B:51:0x00e8, B:62:0x010b, B:64:0x0111, B:67:0x011f, B:68:0x0128, B:70:0x012e, B:71:0x013e, B:74:0x014a, B:75:0x0153, B:77:0x0159, B:78:0x016b, B:79:0x0179, B:81:0x017f, B:87:0x0192, B:89:0x0198, B:91:0x019c, B:92:0x019e, B:94:0x01a5, B:97:0x01ab, B:99:0x01b2, B:100:0x01ba, B:102:0x01c0, B:103:0x01cc, B:105:0x01d2, B:106:0x01d4, B:107:0x01d8, B:96:0x01a9, B:109:0x01dd, B:110:0x01e2, B:112:0x01e8, B:14:0x0059, B:15:0x005c, B:20:0x006f, B:22:0x0073, B:23:0x0079, B:25:0x007d, B:27:0x0083, B:11:0x0033), top: B:124:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0111 A[Catch: all -> 0x0204, TryCatch #0 {all -> 0x0204, blocks: (B:30:0x009a, B:31:0x009d, B:33:0x00a3, B:35:0x00ac, B:36:0x00af, B:38:0x00b4, B:39:0x00b6, B:41:0x00c2, B:43:0x00c8, B:45:0x00ce, B:46:0x00d3, B:48:0x00de, B:50:0x00e5, B:51:0x00e8, B:62:0x010b, B:64:0x0111, B:67:0x011f, B:68:0x0128, B:70:0x012e, B:71:0x013e, B:74:0x014a, B:75:0x0153, B:77:0x0159, B:78:0x016b, B:79:0x0179, B:81:0x017f, B:87:0x0192, B:89:0x0198, B:91:0x019c, B:92:0x019e, B:94:0x01a5, B:97:0x01ab, B:99:0x01b2, B:100:0x01ba, B:102:0x01c0, B:103:0x01cc, B:105:0x01d2, B:106:0x01d4, B:107:0x01d8, B:96:0x01a9, B:109:0x01dd, B:110:0x01e2, B:112:0x01e8, B:14:0x0059, B:15:0x005c, B:20:0x006f, B:22:0x0073, B:23:0x0079, B:25:0x007d, B:27:0x0083, B:11:0x0033), top: B:124:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x018e A[PHI: r7
  0x018e: PHI (r7v1 com.facebook.aura.login.nativeflow.HatchTosDisclosure) = 
  (r7v0 com.facebook.aura.login.nativeflow.HatchTosDisclosure)
  (r7v5 com.facebook.aura.login.nativeflow.HatchTosDisclosure)
 binds: [B:82:0x018b, B:88:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01a5 A[Catch: all -> 0x0204, TryCatch #0 {all -> 0x0204, blocks: (B:30:0x009a, B:31:0x009d, B:33:0x00a3, B:35:0x00ac, B:36:0x00af, B:38:0x00b4, B:39:0x00b6, B:41:0x00c2, B:43:0x00c8, B:45:0x00ce, B:46:0x00d3, B:48:0x00de, B:50:0x00e5, B:51:0x00e8, B:62:0x010b, B:64:0x0111, B:67:0x011f, B:68:0x0128, B:70:0x012e, B:71:0x013e, B:74:0x014a, B:75:0x0153, B:77:0x0159, B:78:0x016b, B:79:0x0179, B:81:0x017f, B:87:0x0192, B:89:0x0198, B:91:0x019c, B:92:0x019e, B:94:0x01a5, B:97:0x01ab, B:99:0x01b2, B:100:0x01ba, B:102:0x01c0, B:103:0x01cc, B:105:0x01d2, B:106:0x01d4, B:107:0x01d8, B:96:0x01a9, B:109:0x01dd, B:110:0x01e2, B:112:0x01e8, B:14:0x0059, B:15:0x005c, B:20:0x006f, B:22:0x0073, B:23:0x0079, B:25:0x007d, B:27:0x0083, B:11:0x0033), top: B:124:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01a9 A[Catch: all -> 0x0204, TryCatch #0 {all -> 0x0204, blocks: (B:30:0x009a, B:31:0x009d, B:33:0x00a3, B:35:0x00ac, B:36:0x00af, B:38:0x00b4, B:39:0x00b6, B:41:0x00c2, B:43:0x00c8, B:45:0x00ce, B:46:0x00d3, B:48:0x00de, B:50:0x00e5, B:51:0x00e8, B:62:0x010b, B:64:0x0111, B:67:0x011f, B:68:0x0128, B:70:0x012e, B:71:0x013e, B:74:0x014a, B:75:0x0153, B:77:0x0159, B:78:0x016b, B:79:0x0179, B:81:0x017f, B:87:0x0192, B:89:0x0198, B:91:0x019c, B:92:0x019e, B:94:0x01a5, B:97:0x01ab, B:99:0x01b2, B:100:0x01ba, B:102:0x01c0, B:103:0x01cc, B:105:0x01d2, B:106:0x01d4, B:107:0x01d8, B:96:0x01a9, B:109:0x01dd, B:110:0x01e2, B:112:0x01e8, B:14:0x0059, B:15:0x005c, B:20:0x006f, B:22:0x0073, B:23:0x0079, B:25:0x007d, B:27:0x0083, B:11:0x0033), top: B:124:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01b2 A[Catch: all -> 0x0204, TryCatch #0 {all -> 0x0204, blocks: (B:30:0x009a, B:31:0x009d, B:33:0x00a3, B:35:0x00ac, B:36:0x00af, B:38:0x00b4, B:39:0x00b6, B:41:0x00c2, B:43:0x00c8, B:45:0x00ce, B:46:0x00d3, B:48:0x00de, B:50:0x00e5, B:51:0x00e8, B:62:0x010b, B:64:0x0111, B:67:0x011f, B:68:0x0128, B:70:0x012e, B:71:0x013e, B:74:0x014a, B:75:0x0153, B:77:0x0159, B:78:0x016b, B:79:0x0179, B:81:0x017f, B:87:0x0192, B:89:0x0198, B:91:0x019c, B:92:0x019e, B:94:0x01a5, B:97:0x01ab, B:99:0x01b2, B:100:0x01ba, B:102:0x01c0, B:103:0x01cc, B:105:0x01d2, B:106:0x01d4, B:107:0x01d8, B:96:0x01a9, B:109:0x01dd, B:110:0x01e2, B:112:0x01e8, B:14:0x0059, B:15:0x005c, B:20:0x006f, B:22:0x0073, B:23:0x0079, B:25:0x007d, B:27:0x0083, B:11:0x0033), top: B:124:0x0007 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 538
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.C126371.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126371) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$routeIntroOnDeviceRead$1", f = "NativeLoginViewModel.kt", l = {605}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$routeIntroOnDeviceRead$1, reason: invalid class name and case insensitive filesystem */
    public final class C126381 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C126381(HtJ<? super C126381> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126381(htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r5.label
                r3 = 1
                if (r0 == 0) goto L28
                if (r0 != r3) goto L48
                X.Hwg.A00(r6)
            Lc:
                boolean r0 = X.AnonymousClass001.A1X(r6)
                if (r0 != 0) goto L13
                r3 = 0
            L13:
                com.facebook.aura.login.nativeflow.NativeLoginViewModel r0 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.this
                X.BLG<com.facebook.aura.login.nativeflow.NativeLoginInitialDestination> r2 = r0._initialDestination
                if (r3 == 0) goto L25
                com.facebook.aura.login.nativeflow.NativeLoginInitialDestination r1 = com.facebook.aura.login.nativeflow.NativeLoginInitialDestination.LANDING
            L1b:
                X.GCn r2 = (X.C9286GCn) r2
                X.HrH r0 = X.HwN.A01
                X.C9286GCn.A00(r0, r1, r2)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L25:
                com.facebook.aura.login.nativeflow.NativeLoginInitialDestination r1 = com.facebook.aura.login.nativeflow.NativeLoginInitialDestination.PHONE_ENTRY
                goto L1b
            L28:
                X.Hwg.A00(r6)
                com.facebook.aura.login.nativeflow.NativeLoginViewModel r0 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.this
                java.util.List r0 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.access$rememberedAccountsForPicker(r0)
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L13
                X.1BN<java.lang.Boolean> r2 = com.facebook.aura.login.nativeflow.NativeLoginPrefetch.hasLocalAccounts
                r1 = 2
                X.I0t r0 = new X.I0t
                r0.<init>(r2, r1)
                r5.label = r3
                java.lang.Object r6 = X.AbstractC9777Gfy.A02(r0, r5)
                if (r6 != r4) goto Lc
                return r4
            L48:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.C126381.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return NativeLoginViewModel.this.new C126381(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel", f = "NativeLoginViewModel.kt", l = {1769, 1792}, m = "sendCodeToRemembered", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$sendCodeToRemembered$1, reason: invalid class name and case insensitive filesystem */
    public final class C126391 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C126391(HtJ<? super C126391> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginViewModel.this.sendCodeToRemembered(null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$sendOtp$1, reason: invalid class name and case insensitive filesystem */
    public final class C126401 extends AbstractC7559F3s implements G0U<G0U<? super HtJ<? super Unit>, ? extends Object>, Unit> {

        @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$sendOtp$1$1", f = "NativeLoginViewModel.kt", l = {2629}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$sendOtp$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02251 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $attempt;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C02251(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HtJ<? super C02251> htJ) {
                super(2, htJ);
                this.$attempt = g0u;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02251(this.$attempt, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    G0U<HtJ<? super Unit>, Object> g0u = this.$attempt;
                    this.label = 1;
                    if (g0u.invoke(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new C02251(this.$attempt, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
            C7384Etj.A0Y(g0u, 0);
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C02251(g0u, null), AEu.A00(NativeLoginViewModel.this));
        }

        public C126401() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
            invoke2(g0u);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel", f = "NativeLoginViewModel.kt", l = {1805}, m = "sendSavedAccountCode", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$sendSavedAccountCode$1, reason: invalid class name and case insensitive filesystem */
    public final class C126411 extends HzP {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C126411(HtJ<? super C126411> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginViewModel.this.sendSavedAccountCode(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$sendTwoFactorCode$1", f = "NativeLoginViewModel.kt", l = {4730}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$sendTwoFactorCode$1, reason: invalid class name and case insensitive filesystem */
    public final class C126421 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchTwoFactorMethod $method;
        public final /* synthetic */ String $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126421(String str, HatchTwoFactorMethod hatchTwoFactorMethod, HtJ<? super C126421> htJ) {
            super(2, htJ);
            this.$state = str;
            this.$method = hatchTwoFactorMethod;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NativeLoginViewModel.this.new C126421(this.$state, this.$method, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            NativeLoginUiState value;
            Object objA0Y = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objA0Y);
                NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                NativeLoginViewModel$sendTwoFactorCode$1$result$1 nativeLoginViewModel$sendTwoFactorCode$1$result$1 = new NativeLoginViewModel$sendTwoFactorCode$1$result$1(this.$state, this.$method, null);
                this.label = 1;
                objA0Y = C3cH.A0Y(nativeLoginViewModel, this, nativeLoginViewModel$sendTwoFactorCode$1$result$1);
                if (objA0Y == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objA0Y);
            }
            HsJ hsJ = (HsJ) objA0Y;
            if (hsJ != null) {
                Object obj2 = hsJ.value;
                NativeLoginViewModel nativeLoginViewModel2 = NativeLoginViewModel.this;
                HatchTwoFactorMethod hatchTwoFactorMethod = this.$method;
                if (!(obj2 instanceof C10571Hud)) {
                    nativeLoginViewModel2.codeSentForMethodId = hatchTwoFactorMethod.id;
                    BLG<NativeLoginUiState> blg = nativeLoginViewModel2._uiState;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67092479, null)));
                }
                NativeLoginViewModel nativeLoginViewModel3 = NativeLoginViewModel.this;
                Throwable thA00 = HsJ.A00(obj2);
                if (thA00 != null) {
                    nativeLoginViewModel3.presentFailure(thA00, NativeLoginStep.TWO_FACTOR_SEND);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126421) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$showRememberedMuseProfilesWhenRead$1", f = "NativeLoginViewModel.kt", l = {894}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$showRememberedMuseProfilesWhenRead$1, reason: invalid class name and case insensitive filesystem */
    public final class C126431 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C27k<Map<String, HatchMuseProfile>> $museProfiles;
        public int label;
        public final /* synthetic */ NativeLoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126431(C27k<? extends Map<String, HatchMuseProfile>> c27k, NativeLoginViewModel nativeLoginViewModel, HtJ<? super C126431> htJ) {
            super(2, htJ);
            this.$museProfiles = c27k;
            this.this$0 = nativeLoginViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C126431(this.$museProfiles, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C27k<Map<String, HatchMuseProfile>> c27k = this.$museProfiles;
                this.label = 1;
                obj = C3cG.A0W(c27k, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            Map<String, HatchMuseProfile> map = (Map) obj;
            NativeLoginViewModel nativeLoginViewModel = this.this$0;
            Object obj2 = nativeLoginViewModel.landingReadLock;
            C27k<Map<String, HatchMuseProfile>> c27k2 = this.$museProfiles;
            synchronized (obj2) {
                if (!map.isEmpty() && nativeLoginViewModel.landingMuseProfiles == c27k2) {
                    nativeLoginViewModel.picker.showRememberedMuseProfiles(map);
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126431) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$signingInAs$2", f = "NativeLoginViewModel.kt", l = {2478}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$signingInAs$2, reason: invalid class name and case insensitive filesystem */
    public final class C126442 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $attempt;
        public int label;
        public final /* synthetic */ NativeLoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126442(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, NativeLoginViewModel nativeLoginViewModel, HtJ<? super C126442> htJ) {
            super(2, htJ);
            this.$attempt = g0u;
            this.this$0 = nativeLoginViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C126442(this.$attempt, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            NativeLoginUiState value;
            NativeLoginUiState value2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    G0U<HtJ<? super Unit>, Object> g0u = this.$attempt;
                    this.label = 1;
                    if (g0u.invoke(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                if (AuraSessionManager.state.getValue() instanceof AuraSessionManager.SessionState.SignedOut) {
                    BLG<NativeLoginUiState> blg = this.this$0._uiState;
                    do {
                        value2 = blg.getValue();
                    } while (!blg.A6e(value2, NativeLoginUiState.copy$default(value2, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -17, 67108863, null)));
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                if (!(AuraSessionManager.state.getValue() instanceof AuraSessionManager.SessionState.SignedOut)) {
                    throw th;
                }
                BLG<NativeLoginUiState> blg2 = this.this$0._uiState;
                do {
                    value = blg2.getValue();
                } while (!blg2.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -17, 67108863, null)));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126442) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$submitNtpUpsellAccept$1", f = "NativeLoginViewModel.kt", l = {5274}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$submitNtpUpsellAccept$1, reason: invalid class name and case insensitive filesystem */
    public final class C126451 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchAttestationRequest $attestationRequest;
        public final /* synthetic */ String $conflictContactPoint;
        public final /* synthetic */ String $contactPoint;
        public final /* synthetic */ boolean $drawsLinkingDisclosure;
        public final /* synthetic */ String $linkingDisclosureVersion;
        public final /* synthetic */ HatchNtpUpsellOffer $offer;
        public final /* synthetic */ boolean $pickedFromChoice;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126451(HatchNtpUpsellOffer hatchNtpUpsellOffer, String str, boolean z, String str2, HatchAttestationRequest hatchAttestationRequest, String str3, boolean z2, HtJ<? super C126451> htJ) {
            super(2, htJ);
            this.$offer = hatchNtpUpsellOffer;
            this.$contactPoint = str;
            this.$drawsLinkingDisclosure = z;
            this.$linkingDisclosureVersion = str2;
            this.$attestationRequest = hatchAttestationRequest;
            this.$conflictContactPoint = str3;
            this.$pickedFromChoice = z2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C126451 c126451 = NativeLoginViewModel.this.new C126451(this.$offer, this.$contactPoint, this.$drawsLinkingDisclosure, this.$linkingDisclosureVersion, this.$attestationRequest, this.$conflictContactPoint, this.$pickedFromChoice, htJ);
            c126451.L$0 = obj;
            return c126451;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NativeLoginViewModel nativeLoginViewModel = NativeLoginViewModel.this;
                NativeLoginViewModel$submitNtpUpsellAccept$1$result$1 nativeLoginViewModel$submitNtpUpsellAccept$1$result$1 = new NativeLoginViewModel$submitNtpUpsellAccept$1$result$1(this.$offer, this.$contactPoint, this.$drawsLinkingDisclosure, this.$linkingDisclosureVersion, this.$attestationRequest, null);
                this.L$0 = obj2;
                this.label = 1;
                obj = C3cH.A0Y(nativeLoginViewModel, this, nativeLoginViewModel$submitNtpUpsellAccept$1$result$1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HsJ hsJ = (HsJ) obj;
            if (hsJ != null) {
                Object obj3 = hsJ.value;
                NativeLoginViewModel nativeLoginViewModel2 = NativeLoginViewModel.this;
                HatchNtpUpsellOffer hatchNtpUpsellOffer = this.$offer;
                String str = this.$contactPoint;
                if (!(obj3 instanceof C10571Hud)) {
                    HatchAuthCredentials hatchAuthCredentials = (HatchAuthCredentials) obj3;
                    if (!nativeLoginViewModel2.handleNtpUpsellLinkingDisclosure(hatchAuthCredentials, hatchNtpUpsellOffer, str)) {
                        HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
                        Long lA0s = C9tI.A0s(hatchAuthCredentials.frlAccountId);
                        HatchCaaEventFlow hatchCaaEventFlow = HatchCaaEventFlow.NEW_TO_PLATFORM;
                        hatchCaaRegistrationLogger.logCreateSuccess(str, lA0s, hatchCaaEventFlow, null, nativeLoginViewModel2.offerNtpSourcePlatform);
                        NativeLoginViewModel.completeLogin$default(nativeLoginViewModel2, hatchAuthCredentials, new LoginSessionOutcome.Signup(hatchCaaEventFlow), false, 4, null);
                    }
                }
                NativeLoginViewModel nativeLoginViewModel3 = NativeLoginViewModel.this;
                String str2 = this.$conflictContactPoint;
                boolean z = this.$pickedFromChoice;
                String str3 = this.$contactPoint;
                Throwable thA00 = HsJ.A00(obj3);
                if (thA00 != null) {
                    nativeLoginViewModel3.logLinkedCreateFailure(str2, C3cG.A0C(HatchCaaStage.REGISTER_COMPLETION_LINKED, thA00));
                    if (!nativeLoginViewModel3.recoverFromLinkedCreateConflict(thA00, str2)) {
                        nativeLoginViewModel3.presentFailure(thA00, NativeLoginStep.REGISTER_COMPLETION_LINKED);
                        HatchAuthCredentials hatchAuthCredentials2 = nativeLoginViewModel3.pendingCredentials;
                        if (z && hatchAuthCredentials2 != null) {
                            nativeLoginViewModel3.ntpUpsellChoiceConsentVersion = null;
                            NativeLoginViewModel.navigateToNtpUpsell$default(nativeLoginViewModel3, hatchAuthCredentials2, str3, false, 4, null);
                        }
                    }
                }
            } else {
                NativeLoginViewModel.this.logLinkedCreateFailure(this.$contactPoint, C3cI.A09(HatchCaaFailure.Companion, HatchCaaStage.REGISTER_COMPLETION_LINKED));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126451) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginViewModel(Application application) {
        C7384Etj.A0Y(application, 0);
        this.application = application;
        AHI ahi = AHI.A01;
        NativeLoginCheckpointAction nativeLoginCheckpointAction = NativeLoginCheckpointAction.CONTINUE;
        HatchLandingPresentation hatchLandingPresentation = HatchLandingPresentation.STANDARD;
        C9286GCn c9286GCnA14 = C3cG.A14(new NativeLoginUiState(ahi, ahi, ahi, "", null, ahi, false, null, "", "", false, "", false, null, false, null, "", false, null, "", ahi, null, null, null, null, null, false, nativeLoginCheckpointAction, null, null, null, hatchLandingPresentation, null, ahi, false, false, null, "", null, "", true, "", "", false, true, true, false, false, null, null, null, NativeLoginResolveState.RESOLVING, CountryDialCodesKt.DEFAULT_COUNTRY_DIAL_CODE, null, hatchLandingPresentation, null, null, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        GCV gcvA00 = AbstractC10623Hzj.A00(C79.A00, -2);
        this._viewEffect = gcvA00;
        this.viewEffect = Hu1.A01(gcvA00);
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._initialDestination = c9286GCnA13;
        this.initialDestination = C3cG.A11(c9286GCnA13);
        this.offerLock = C3cG.A0T();
        this.liveEntryScreens = C3cG.A0j();
        C9jH c9jHA0E = AGH.A0E();
        this.ssoSelections = c9jHA0E;
        this.ssoRowSources = c9jHA0E;
        this.picker = new NativeLoginPicker<>(5, new NativeLoginViewModel$picker$1(this));
        this.rememberedAccountsByRowId = c9jHA0E;
        this.rememberedMuseProfilesByRowId = c9jHA0E;
        this.landingReadLock = C3cG.A0T();
        this.accountSelectionRefs = c9jHA0E;
        this.ntpUpsellChoiceRows = C0881AGi.A00;
        this.loginMethod = LoginMethod.OTHER;
        this.checkpointLock = C3cG.A0T();
        this.checkpointContinuation = new NativeLoginCheckpointContinuation(null, 1, 0 == true ? 1 : 0);
        this.googleSignInRequested = new AtomicBoolean(false);
        this.googleSignInSheetOpen = new AtomicBoolean(false);
        AuraRememberedAccountsStore auraRememberedAccountsStore = AuraRememberedAccountsStore.device;
        this.rememberedAccountsStore = auraRememberedAccountsStore;
        NativeLoginRememberedAccounts nativeLoginRememberedAccounts = new NativeLoginRememberedAccounts(auraRememberedAccountsStore, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14, 0 == true ? 1 : 0);
        this.rememberedAccounts = nativeLoginRememberedAccounts;
        this.oneTap = new NativeLoginOneTap(AuraOneTapLoginStore.device, auraRememberedAccountsStore, new NativeLoginViewModel$oneTap$1(nativeLoginRememberedAccounts), new NativeLoginOneTap.AnonymousClass1(HatchTempTokenProvider.INSTANCE));
        startLoginFlow();
        observeSignOut();
        observeEntryScreenIdle();
        observeLandingIdle();
    }

    private final void acceptNtpUpsellOffer(boolean z) {
        HatchAuthCredentials hatchAuthCredentials = this.pendingCredentials;
        HatchNtpUpsellOffer hatchNtpUpsellOffer = hatchAuthCredentials != null ? hatchAuthCredentials.ntpUpsell : null;
        HatchAuthCredentials hatchAuthCredentials2 = this.pendingCredentials;
        HatchAttestationRequest hatchAttestationRequest = hatchAuthCredentials2 != null ? hatchAuthCredentials2.attestationRequest : null;
        String str = this.offerContactPoint;
        if (hatchNtpUpsellOffer == null) {
            restartFromPhoneEntry(SESSION_EXPIRED_DIALOG);
            return;
        }
        if (claimLoading()) {
            if (this.offerOpensRegFunnel && !this.offerRegFunnelStarted) {
                this.offerRegFunnelStarted = true;
                HatchCaaRegistrationLogger.INSTANCE.logRegistrationStart(HatchCaaRegistrationEventStep.UPSELL_AT_LOGIN, str, null, HatchCaaEventFlow.NEW_TO_PLATFORM, null, this.offerNtpSourcePlatform, null);
            }
            HatchCaaRegistrationLogger.INSTANCE.logUpsellLoginToExistingAccount(str);
            submitNtpUpsellAccept(hatchNtpUpsellOffer, str, null, z, hatchAttestationRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0227 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v1, types: [com.facebook.aura.login.nativeflow.HatchAuthFlow] */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v1, types: [com.facebook.aura.login.nativeflow.HatchPasswordCopy] */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v1, types: [com.facebook.aura.login.nativeflow.HatchTwoFactorSourceApp] */
    /* JADX WARN: Type inference failed for: r31v1, types: [com.facebook.aura.login.nativeflow.HatchTwoFactorMethod] */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r33v1, types: [com.facebook.aura.login.nativeflow.HatchCheckpointChallenge] */
    /* JADX WARN: Type inference failed for: r34v1, types: [com.facebook.aura.login.nativeflow.HatchReactivationChallenge] */
    /* JADX WARN: Type inference failed for: r36v1, types: [com.facebook.aura.login.nativeflow.NativeLoginCheckpointAction] */
    /* JADX WARN: Type inference failed for: r37v1, types: [com.facebook.aura.login.nativeflow.NtpUpsellUiState] */
    /* JADX WARN: Type inference failed for: r39v1, types: [com.facebook.aura.login.nativeflow.HatchTosDisclosure] */
    /* JADX WARN: Type inference failed for: r40v1, types: [com.facebook.aura.login.nativeflow.HatchLandingPresentation] */
    /* JADX WARN: Type inference failed for: r41v1, types: [com.facebook.aura.login.nativeflow.NativeLoginLinkingDisclosureUiState] */
    /* JADX WARN: Type inference failed for: r45v1, types: [com.facebook.aura.login.nativeflow.NativeLoginItemizedConsentTarget] */
    /* JADX WARN: Type inference failed for: r46v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.facebook.aura.login.nativeflow.NativeLoginBirthdayError] */
    /* JADX WARN: Type inference failed for: r48v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r50v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r51v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r57v1, types: [com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent] */
    /* JADX WARN: Type inference failed for: r58v1, types: [com.facebook.aura.login.nativeflow.NativeLoginFieldError] */
    /* JADX WARN: Type inference failed for: r59v1, types: [com.facebook.aura.login.nativeflow.NativeLoginIdentifierError] */
    /* JADX WARN: Type inference failed for: r61v1, types: [com.facebook.aura.components.phone.CountryDialCode] */
    /* JADX WARN: Type inference failed for: r62v1, types: [com.facebook.aura.login.nativeflow.HatchTosDisclosure] */
    /* JADX WARN: Type inference failed for: r63v1, types: [com.facebook.aura.login.nativeflow.HatchLandingPresentation] */
    /* JADX WARN: Type inference failed for: r64v1, types: [com.facebook.aura.login.nativeflow.HatchTosDisclosure] */
    /* JADX WARN: Type inference failed for: r65v1, types: [com.facebook.aura.login.nativeflow.HatchTosDisclosure] */
    /* JADX WARN: Type inference failed for: r73v0, types: [com.facebook.aura.login.nativeflow.NativeLoginViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object attemptZari(com.facebook.aura.login.nativeflow.HatchSsoAccountInfoResponse r74, java.util.List<com.facebook.aura.login.nativeflow.GroupedSsoRow> r75, java.util.Map<java.lang.String, com.facebook.aura.login.nativeflow.NativeLoginSsoAccount> r76, X.HtJ<? super java.lang.Boolean> r77) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.attemptZari(com.facebook.aura.login.nativeflow.HatchSsoAccountInfoResponse, java.util.List, java.util.Map, X.HtJ):java.lang.Object");
    }

    private final void beginOtp(NativeLoginIdentifier nativeLoginIdentifier, boolean z, HatchCaaEventFlow hatchCaaEventFlow, G0U<? super G0U<? super HtJ<? super Unit>, ? extends Object>, Unit> g0u) {
        G0U<HtJ<? super Unit>, Object> g0uClaimOtp = claimOtp(nativeLoginIdentifier, z, hatchCaaEventFlow, false, HatchCaaEntryPoint.LOGIN_HOME);
        if (g0uClaimOtp != null) {
            g0u.invoke(g0uClaimOtp);
        }
    }

    private final G0U<HtJ<? super Unit>, Object> claimOtp(NativeLoginIdentifier nativeLoginIdentifier, boolean z, HatchCaaEventFlow hatchCaaEventFlow, boolean z2, HatchCaaEntryPoint hatchCaaEntryPoint) {
        String str;
        NativeLoginIdentifier.Phone phone;
        String str2 = null;
        if (!z2 && !claimLoading()) {
            return null;
        }
        boolean z3 = nativeLoginIdentifier instanceof NativeLoginIdentifier.Phone;
        if (z3) {
            listenForSmsCode();
            str = ((NativeLoginIdentifier.Phone) nativeLoginIdentifier).e164;
        } else {
            if (!(nativeLoginIdentifier instanceof NativeLoginIdentifier.Email)) {
                throw C3cG.A0q();
            }
            str = ((NativeLoginIdentifier.Email) nativeLoginIdentifier).address;
        }
        this.submittedContactPoint = str;
        if (this.registrationRecoveryContactPoint != null && !AbstractC2159Azp.A12(str, this.registrationRecoveryContactPoint, C7BY.A0q(str, "@", false))) {
            this.registrationRecoveryContactPoint = null;
            this.declinedNtpUpsell = false;
        }
        if (z3 && (phone = (NativeLoginIdentifier.Phone) nativeLoginIdentifier) != null) {
            str2 = phone.region;
        }
        return new C125941(nativeLoginIdentifier, str, str2, z, this.declinedNtpUpsell, hatchCaaEventFlow, hatchCaaEntryPoint, null);
    }

    private final HoC clearCheckpointContinuationLocked() {
        this.checkpointResumeToken = null;
        this.checkpointSessionOutcome = null;
        this.checkpointContinueTapped = false;
        return detachCheckpointJobLocked();
    }

    private final void clearLinkingDisclosureTap() {
        this.linkingDisclosureAccount = null;
        this.linkingDisclosureForNtpUpsell = false;
        this.agreedLinkingDisclosureVersion = null;
        this.submittedSsoName = null;
        this.pendingSsoNameCompletion = null;
    }

    private final void clearOtpEntry() {
        NativeLoginUiState value;
        Companion companion;
        this.pendingSmsCode = null;
        HoC hoC = this.smsConsentJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.smsConsentJob = null;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            companion = Companion;
        } while (!C3cI.A1U(NativeLoginField.OTP, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, "", false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -2049, 67108863, null), companion, value, blg));
    }

    private final void completeCheckpointContinuation(HatchAuthCredentials hatchAuthCredentials, int i) {
        boolean z;
        NativeLoginUiState value;
        LoginSessionOutcome loginSessionOutcome = null;
        synchronized (this.checkpointLock) {
            if (this.checkpointGeneration != i) {
                z = false;
            } else {
                this.checkpointGeneration++;
                this.checkpointJob = null;
                this.checkpointResumeToken = null;
                this.checkpointContinueTapped = false;
                loginSessionOutcome = this.checkpointSessionOutcome;
                z = true;
                this.checkpointSessionOutcome = null;
            }
        }
        if (z) {
            BLG<NativeLoginUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, NativeLoginCheckpointAction.CONTINUE, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -201326593, 67092479, null)));
            this.continuationSessionOutcome = loginSessionOutcome;
            if (handleLoginContinuation(hatchAuthCredentials, loginSessionOutcome, loginSessionOutcome != null ? reactivationStep(loginSessionOutcome) : null, this.loginMethod)) {
                return;
            }
            completeLogin(hatchAuthCredentials, loginSessionOutcome, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[PHI: r4 r9
  0x0053: PHI (r4v3 java.lang.String) = (r4v1 java.lang.String), (r4v6 java.lang.String) binds: [B:21:0x0050, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v6 java.lang.String) binds: [B:21:0x0050, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void completeRegistration(com.facebook.aura.login.nativeflow.HatchAuthCredentials r13, java.lang.String r14, boolean r15, com.facebook.aura.login.nativeflow.NativeLoginViewModel.PendingCompletionInputs r16) {
        /*
            r12 = this;
            r11 = r13
            java.lang.String r6 = r13.completionHandle
            r5 = r12
            java.lang.String r7 = r12.submittedContactPoint
            boolean r0 = X.C7BY.A0j(r6)
            if (r0 != 0) goto L71
            if (r7 == 0) goto L71
            com.facebook.aura.login.nativeflow.NativeLoginUiState r3 = X.C3cG.A0F(r12)
            r1 = 0
            r12 = r16
            if (r16 == 0) goto L40
            java.lang.String r4 = r12.password
            java.lang.String r2 = r12.firstName
        L1b:
            r9 = r2
            if (r16 == 0) goto L53
            java.lang.String r1 = r12.lastName
        L20:
            r10 = r1
        L21:
            if (r15 != 0) goto L5e
            boolean r0 = r5.claimLoading()
            if (r0 != 0) goto L5e
            com.facebook.aura.analytics.hatch.caa.HatchCaaRegistrationLogger r6 = com.facebook.aura.analytics.hatch.caa.HatchCaaRegistrationLogger.INSTANCE
            com.facebook.aura.analytics.hatch.caa.HatchCaaFailure$Companion r2 = com.facebook.aura.analytics.hatch.caa.HatchCaaFailure.Companion
            com.facebook.aura.login.nativeflow.HatchCaaStage r0 = com.facebook.aura.login.nativeflow.HatchCaaStage.REGISTER_COMPLETION
            java.lang.String r1 = r0.getValue()
            r8 = 0
            java.lang.String r0 = "already_loading"
            com.facebook.aura.analytics.hatch.caa.HatchCaaFailure r11 = X.C3cG.A0B(r2, r0, r1)
            r9 = r8
            r10 = r8
            r6.logCreateFailure(r7, r8, r9, r10, r11)
            return
        L40:
            java.lang.String r4 = r3.signupPassword
            boolean r0 = r3.collectsSignupPassword
            if (r0 != 0) goto L47
            r4 = r1
        L47:
            java.lang.String r0 = r3.signupFirstName
            java.lang.String r2 = X.AnonymousClass002.A0l(r0)
            boolean r0 = r3.collectsSignupName
            r9 = r1
            if (r0 == 0) goto L53
            goto L1b
        L53:
            java.lang.String r0 = r3.signupLastName
            java.lang.String r10 = X.AnonymousClass002.A0l(r0)
            boolean r0 = r3.collectsSignupName
            if (r0 != 0) goto L21
            goto L20
        L5e:
            X.BLL r1 = X.AEu.A00(r5)
            X.78T r0 = X.AnonymousClass001.A0y()
            r13 = 0
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$completeRegistration$1 r3 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$completeRegistration$1
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.C3cI.A1F(r5, r0, r3, r1)
            return
        L71:
            com.facebook.aura.analytics.hatch.caa.HatchCaaRegistrationLogger r6 = com.facebook.aura.analytics.hatch.caa.HatchCaaRegistrationLogger.INSTANCE
            com.facebook.aura.analytics.hatch.caa.HatchCaaFailure$Companion r2 = com.facebook.aura.analytics.hatch.caa.HatchCaaFailure.Companion
            com.facebook.aura.login.nativeflow.HatchCaaStage r0 = com.facebook.aura.login.nativeflow.HatchCaaStage.REGISTER_COMPLETION
            java.lang.String r1 = r0.getValue()
            r8 = 0
            java.lang.String r0 = "missing_completion_handle"
            com.facebook.aura.analytics.hatch.caa.HatchCaaFailure r11 = X.C3cG.A0B(r2, r0, r1)
            r9 = r8
            r10 = r8
            r6.logCreateFailure(r7, r8, r9, r10, r11)
            com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent r0 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.SESSION_EXPIRED_DIALOG
            r12.restartFromPhoneEntry(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.completeRegistration(com.facebook.aura.login.nativeflow.HatchAuthCredentials, java.lang.String, boolean, com.facebook.aura.login.nativeflow.NativeLoginViewModel$PendingCompletionInputs):void");
    }

    private final void leaveNtpUpsellChoice() {
        this.ntpUpsellChoiceConsentVersion = null;
        this.ntpUpsellChoiceChallengeIndex = null;
        HatchCaaRegistrationLogger.INSTANCE.logUpsellBack(this.offerContactPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void leavePicker() {
        this.hasLeftPicker = true;
        HatchAuthFlowContext.INSTANCE.releaseLandingImpression();
    }

    private final void listenForSmsCode() {
        this.pendingSmsCode = null;
        HoC hoC = this.smsConsentJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        BLL bllA00 = AEu.A00(this);
        this.smsConsentJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C126071(null), bllA00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logReactivationFailure(HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaFailure hatchCaaFailure) {
        int iOrdinal;
        if (hatchCaaLoginEventStep == null || (iOrdinal = hatchCaaLoginEventStep.ordinal()) == -1) {
            return;
        }
        if (iOrdinal != 7) {
            HatchCaaLoginLogger.INSTANCE.logSessionLoginFailed(this.submittedContactPoint, hatchCaaLoginEventStep, hatchCaaFailure, null, null);
        } else {
            HatchCaaLoginLogger.INSTANCE.logTwoFactorLoginFailed(this.submittedContactPoint, hatchCaaFailure);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recoverFromLinkedCreateConflict(Throwable th, String str) {
        HatchAuthException hatchAuthException;
        if (str != null) {
            if (Companion.isAccountAlreadyExists((!(th instanceof HatchAuthException) || (hatchAuthException = (HatchAuthException) th) == null) ? null : hatchAuthException.error, NativeLoginStep.REGISTER_COMPLETION_LINKED) && NativeLoginIdentifierKt.classifyLoginIdentifier(str, C3cG.A0F(this).selectedCountry.iso).identifier != null) {
                CFK.A06(NativeLoginViewModelKt.TAG, "account already exists at REGISTER_COMPLETION_LINKED; sending a code instead");
                this.declinedNtpUpsell = true;
                this.ntpUpsellChoiceRows = C0881AGi.A00;
                this.ntpUpsellChoiceConsentVersion = null;
                this.ntpUpsellChoiceChallengeIndex = null;
                emitEffect(NativeLoginViewEffect.PopToPhoneEntry.INSTANCE);
                return continueToOtpForContactPoint(str, null);
            }
        }
        return false;
    }

    private final void replayNtpUpsellAccept(String str) {
        HatchNtpUpsellOffer hatchNtpUpsellOffer;
        HatchAuthCredentials hatchAuthCredentials = this.pendingCredentials;
        if (hatchAuthCredentials == null || (hatchNtpUpsellOffer = hatchAuthCredentials.ntpUpsell) == null) {
            restartFromPhoneEntry(SESSION_EXPIRED_DIALOG);
            return;
        }
        String str2 = this.offerContactPoint;
        HatchAuthCredentials hatchAuthCredentials2 = this.pendingCredentials;
        submitNtpUpsellAccept(hatchNtpUpsellOffer, str2, str, false, hatchAuthCredentials2 != null ? hatchAuthCredentials2.attestationRequest : null);
    }

    private final void showAccountExists(NativeLoginErrorDialogContent nativeLoginErrorDialogContent) {
        showErrorDialog(nativeLoginErrorDialogContent, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void submitNtpUpsellAccept(com.facebook.aura.login.nativeflow.HatchNtpUpsellOffer r11, java.lang.String r12, java.lang.String r13, boolean r14, com.facebook.aura.login.nativeflow.HatchAttestationRequest r15) {
        /*
            r10 = this;
            r4 = r11
            r5 = r12
            if (r12 != 0) goto L3a
            java.lang.String r9 = r11.contactPoint
        L6:
            r3 = r10
            r10.submittedContactPoint = r9
            com.facebook.aura.login.nativeflow.HatchAuthCredentials r0 = r10.pendingCredentials
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.completionHandle
            if (r0 == 0) goto L1b
            boolean r0 = X.C7BY.A0j(r0)
            r1 = 1
            r0 = r0 ^ 1
            r6 = 1
            if (r0 == r1) goto L1c
        L1b:
            r6 = 0
        L1c:
            com.facebook.aura.analytics.hatch.caa.HatchCaaRegistrationLogger r2 = com.facebook.aura.analytics.hatch.caa.HatchCaaRegistrationLogger.INSTANCE
            com.facebook.aura.analytics.hatch.caa.HatchCaaEventFlow r1 = com.facebook.aura.analytics.hatch.caa.HatchCaaEventFlow.NEW_TO_PLATFORM
            com.facebook.aura.analytics.hatch.caa.HatchCaaNtpSourcePlatform r0 = r10.offerNtpSourcePlatform
            r11 = 0
            r2.logCreateAttempt(r12, r1, r11, r0)
            X.BLL r1 = X.AEu.A00(r10)
            X.78T r0 = X.AnonymousClass001.A0y()
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$submitNtpUpsellAccept$1 r2 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$submitNtpUpsellAccept$1
            r7 = r13
            r10 = r14
            r8 = r15
            r2.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.C3cI.A1F(r3, r0, r2, r1)
            return
        L3a:
            r9 = r12
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.submitNtpUpsellAccept(com.facebook.aura.login.nativeflow.HatchNtpUpsellOffer, java.lang.String, java.lang.String, boolean, com.facebook.aura.login.nativeflow.HatchAttestationRequest):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.login.nativeflow.NativeLoginUiState withCompletionTos(com.facebook.aura.login.nativeflow.NativeLoginUiState r63, com.facebook.aura.login.nativeflow.HatchTosDisclosure r64) {
        /*
            r62 = this;
            r3 = 0
            r1 = r64
            if (r64 == 0) goto Lf
            X.AHD<com.facebook.aura.login.nativeflow.HatchTosRun> r0 = r1.runs
            boolean r0 = r0.isEmpty()
            r59 = r1
            if (r0 == 0) goto L11
        Lf:
            r59 = r3
        L11:
            r62 = 41943039(0x27fffff, float:1.8807908E-37)
            r9 = 0
            r61 = -1
            r2 = r63
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r10 = r3
            r11 = r3
            r12 = r3
            r13 = r9
            r14 = r3
            r15 = r9
            r16 = r3
            r17 = r9
            r18 = r3
            r19 = r3
            r20 = r9
            r21 = r3
            r22 = r3
            r23 = r3
            r24 = r3
            r25 = r3
            r26 = r3
            r27 = r3
            r28 = r3
            r29 = r9
            r30 = r3
            r31 = r3
            r32 = r3
            r33 = r3
            r34 = r3
            r35 = r3
            r36 = r3
            r37 = r9
            r38 = r9
            r39 = r3
            r40 = r3
            r41 = r3
            r42 = r3
            r43 = r9
            r44 = r3
            r45 = r3
            r46 = r9
            r47 = r9
            r48 = r9
            r49 = r9
            r50 = r9
            r51 = r3
            r52 = r3
            r53 = r3
            r54 = r3
            r55 = r3
            r56 = r3
            r57 = r3
            r58 = r1
            r60 = r9
            r63 = r3
            com.facebook.aura.login.nativeflow.NativeLoginUiState r0 = com.facebook.aura.login.nativeflow.NativeLoginUiState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.withCompletionTos(com.facebook.aura.login.nativeflow.NativeLoginUiState, com.facebook.aura.login.nativeflow.HatchTosDisclosure):com.facebook.aura.login.nativeflow.NativeLoginUiState");
    }

    public final boolean isSigningInWithGoogle(NativeLoginUiState nativeLoginUiState) {
        C7384Etj.A0Y(nativeLoginUiState, 0);
        return nativeLoginUiState.isLoading && GOOGLE_SIGN_IN_ROW_ID.equals(nativeLoginUiState.selectedAccountId);
    }

    public final NativeLoginLandingStatus landingStatus(NativeLoginUiState nativeLoginUiState) {
        C7384Etj.A0Y(nativeLoginUiState, 0);
        return nativeLoginUiState.isRemovingProfile ? NativeLoginLandingStatus.REMOVING_PROFILE : (nativeLoginUiState.selectedAccountId != null || nativeLoginUiState.isLoading) ? NativeLoginLandingStatus.SIGNING_IN : NativeLoginLandingStatus.IDLE;
    }

    public final boolean offersMoreAccounts(NativeLoginUiState nativeLoginUiState) {
        C7384Etj.A0Y(nativeLoginUiState, 0);
        return !nativeLoginUiState.neutralCollapsedAccounts.isEmpty() && landingStatus(nativeLoginUiState) == NativeLoginLandingStatus.IDLE;
    }

    public final void onAccountSelected(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        C7384Etj.A0Y(nativeLoginAccountUiModel, 0);
        logLandingImpression();
        AuraRememberedAccount auraRememberedAccount = this.rememberedAccountsByRowId.get(nativeLoginAccountUiModel.id);
        if (auraRememberedAccount != null) {
            onRememberedAccountSelected(nativeLoginAccountUiModel, auraRememberedAccount);
            return;
        }
        NativeLoginSsoAccount nativeLoginSsoAccount = this.ssoSelections.get(nativeLoginAccountUiModel.id);
        if (nativeLoginSsoAccount != null) {
            if (!(!nativeLoginAccountUiModel.hasMetaAi) || enforceAccountCreationAgeGate()) {
                HatchScreen hatchScreen = HatchScreen.LOGIN_LANDING;
                HatchComponent hatchComponent = HatchComponent.SSO_ACCOUNT_ROW;
                String wireValue = nativeLoginSsoAccount.sourceApp.getWireValue();
                logClick(hatchScreen, hatchComponent, FGI.A0M("sso_", wireValue), AnonymousClass007.A0c(HatchMetadataKey.SSO_SOURCE_APP, wireValue));
                if (claimLoading()) {
                    resetRememberDeviceValue();
                    clearRegistrationSource();
                    HatchAuthFlowContext hatchAuthFlowContext = HatchAuthFlowContext.INSTANCE;
                    C3cG.A1E(hatchAuthFlowContext, HatchCaaEntryPoint.LOGIN_HOME);
                    hatchAuthFlowContext.setLoginFlow(NativeLoginCaaSourceKt.toLoginFlow(nativeLoginSsoAccount.sourceApp).getValue(), pickerSourceCounts());
                    this.linkingDisclosureAccount = nativeLoginAccountUiModel;
                    this.linkingDisclosureForNtpUpsell = false;
                    this.agreedLinkingDisclosureVersion = null;
                    this.submittedSsoName = null;
                    boolean z = !nativeLoginAccountUiModel.hasMetaAi;
                    HatchCaaLoginCredentialType credentialType = NativeLoginCaaSourceKt.toCredentialType(nativeLoginSsoAccount.sourceApp);
                    HatchCaaNtpSourcePlatform ntpSourcePlatform = NativeLoginCaaSourceKt.toNtpSourcePlatform(nativeLoginSsoAccount.sourceApp);
                    HatchAuthFlowContext.SsoSourceCounts ssoSourceCountsRowSourceCounts = rowSourceCounts(nativeLoginAccountUiModel);
                    logJoinStart(z, NativeLoginModelsKt.isAymhSurface(C3cG.A0F(this).accounts), ntpSourcePlatform);
                    if (z) {
                        HatchCaaLoginLogger.INSTANCE.logNtpLandingNext(this.submittedContactPoint, credentialType, ssoSourceCountsRowSourceCounts);
                    } else {
                        HatchCaaLoginLogger hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
                        String str = this.submittedContactPoint;
                        HatchCaaLoginEventStep hatchCaaLoginEventStep = HatchCaaLoginEventStep.LANDING;
                        hatchCaaLoginLogger.logCredentialLoginStart(str, hatchCaaLoginEventStep, null, credentialType);
                        hatchCaaLoginLogger.logAymhLoginClicked(this.submittedContactPoint, credentialType, ssoSourceCountsRowSourceCounts);
                        hatchCaaLoginLogger.logLoginAttempt(this.submittedContactPoint, hatchCaaLoginEventStep, credentialType, null);
                    }
                    exchangeSsoSelection(nativeLoginAccountUiModel, nativeLoginSsoAccount, null, null);
                }
            }
        }
    }

    public final void onAccountSelectionSelected(String str) {
        NativeLoginUiState value;
        C7384Etj.A0Y(str, 0);
        String str2 = this.accountSelectionState;
        String str3 = this.accountSelectionRefs.get(str);
        if (str2 == null || str3 == null) {
            logAccountSelectionOutcomeFailure(C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.SESSION_EXPIRED, HatchCaaStage.SELECT_ACCOUNT.getValue()));
            restartFromPhoneEntry(SESSION_EXPIRED_DIALOG);
        } else if (claimLoading()) {
            HatchCaaLoginLogger.INSTANCE.logAccountSelected(this.submittedContactPoint);
            BLG<NativeLoginUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, str, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -129, 67108863, null)));
            C3cI.A1F(this, AnonymousClass001.A0y(), new C126142(str2, str3, null), AEu.A00(this));
        }
    }

    public final void onBirthdaySelected(LocalDate localDate) {
        NativeLoginUiState value;
        C7384Etj.A0Y(localDate, 0);
        if (!this.birthdayInteractionLogged) {
            this.birthdayInteractionLogged = true;
            HatchCaaRegistrationLogger.INSTANCE.logBirthdayInteraction(this.submittedContactPoint);
        }
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, NativeLoginBirthdayKt.toBirthdayDigits(localDate), null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67108767, null)));
    }

    public final void onCheckpointWebCallback(String str) {
        NativeLoginUiState value;
        C7384Etj.A0Y(str, 0);
        synchronized (this.checkpointLock) {
            String str2 = this.checkpointResumeToken;
            if (str2 == null || this.checkpointJob != null) {
                return;
            }
            int i = this.checkpointGeneration;
            BLL bllA00 = AEu.A00(this);
            C10533Hqc c10533HqcA02 = GAo.A02(C79.A01, C6ys.A00, new NativeLoginViewModel$onCheckpointWebCallback$job$1$1(this, i, str, str2, null), bllA00);
            this.checkpointJob = c10533HqcA02;
            BLG<NativeLoginUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, true, false, null, null, null, null, null, null, null, null, null, false, -67108865, 67092479, null)));
            emitEffect(NativeLoginViewEffect.CloseCheckpointWeb.INSTANCE);
            c10533HqcA02.Afv();
        }
    }

    public final void onContactPointFocused() {
        this.contactPointTouched = true;
        HatchCaaLoginLogger.INSTANCE.logContactPointFocus();
    }

    public final void onContinueClicked() {
        this.continuationSessionOutcome = null;
        clearRegistrationSource();
        HatchAuthFlowContext hatchAuthFlowContext = HatchAuthFlowContext.INSTANCE;
        C3cG.A1E(hatchAuthFlowContext, HatchCaaEntryPoint.LOGIN_HOME);
        logClick(HatchScreen.LOGIN_CONTACT_POINT, HatchComponent.SEND_CODE_BUTTON, "send_otp", AGH.A0E());
        HatchCaaLoginLogger.INSTANCE.logContactPointContinueClicked(getTypedContactPoint());
        resetRememberDeviceValue();
        hatchAuthFlowContext.setLoginFlow(null, null);
        sendOtp(false);
    }

    public final void onCountrySelected(CountryDialCode countryDialCode) {
        NativeLoginUiState value;
        Companion companion;
        C7384Etj.A0Y(countryDialCode, 0);
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            companion = Companion;
        } while (!C3cI.A1U(NativeLoginField.CONTACT_POINT, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, countryDialCode, null, null, null, null, false, -1, 65798143, null), companion, value, blg));
    }

    public final int onEntryScreenShown(Activity activity, boolean z) {
        boolean zA1Y;
        int i;
        C7384Etj.A0Y(activity, 0);
        synchronized (this.checkpointLock) {
            zA1Y = AnonymousClass002.A1Y(this.checkpointJob);
        }
        if (zA1Y) {
            this.continuationSessionOutcome = null;
        }
        synchronized (this.offerLock) {
            this.hostActivity = new WeakReference<>(activity);
            i = this.hostActivityToken + 1;
            this.hostActivityToken = i;
            this.liveEntryScreens.put(Integer.valueOf(i), Boolean.valueOf(z));
        }
        if (z) {
            if (NativeLoginViewModelKt.canCheckGoogleAccount && googleSignInIsButton()) {
                AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126162(null), AEu.A00(this));
            }
            if (!armPasskeyOffer()) {
                concedeToGoogleIfIdle();
            }
        }
        return i;
    }

    public final void onIdentifierChange(String str) {
        NativeLoginUiState value;
        Companion companion;
        C7384Etj.A0Y(str, 0);
        this.contactPointTouched = true;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            companion = Companion;
        } while (!C3cI.A1U(NativeLoginField.CONTACT_POINT, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, str, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -257, 66846719, null), companion, value, blg));
    }

    public final void onNtpUpsellChoiceDeclineClicked() {
        declineNtpUpsell(true);
    }

    public final void onNtpUpsellChoiceRowClicked(String str) {
        NativeLoginUiState value;
        C7384Etj.A0Y(str, 0);
        if (C3cG.A0F(this).isLoading || !enforceAccountCreationAgeGate()) {
            return;
        }
        Integer numA0r = C9tI.A0r(C7BY.A0K(NTP_UPSELL_CHOICE_ROW_ID_PREFIX, str));
        HatchNtpUpsellChoiceRow hatchNtpUpsellChoiceRow = numA0r != null ? (HatchNtpUpsellChoiceRow) AbstractC0878AGe.A0A(numA0r.intValue(), this.ntpUpsellChoiceRows) : null;
        HatchAuthCredentials hatchAuthCredentials = this.pendingCredentials;
        if (hatchNtpUpsellChoiceRow == null || hatchAuthCredentials == null) {
            restartFromPhoneEntry(SESSION_EXPIRED_DIALOG);
            return;
        }
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, str, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -17, 67108863, null)));
        HatchTosDisclosure hatchTosDisclosure = C3cG.A0F(this).ntpUpsellChoiceTos;
        this.ntpUpsellChoiceConsentVersion = hatchTosDisclosure != null ? hatchTosDisclosure.contentVersion : null;
        if (this.ntpUpsellChoiceConsentVersion != null) {
            logClick(HatchScreen.LOGIN_NTP_UPSELL, HatchComponent.NTP_UPSELL_ACCEPT_BUTTON, "ntp_upsell_choice_accept", AGH.A0E());
        }
        HatchNtpUpsellOffer hatchNtpUpsellOffer = hatchNtpUpsellChoiceRow.offer;
        if (hatchNtpUpsellOffer != null) {
            this.ntpUpsellChoiceChallengeIndex = null;
            HatchAuthCredentials hatchAuthCredentialsCopy$default = HatchAuthCredentials.copy$default(hatchAuthCredentials, null, null, null, null, null, false, false, false, null, null, null, hatchNtpUpsellOffer, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, 1040185343, null);
            if (acceptNtpUpsellPickedFromChoice(hatchAuthCredentialsCopy$default)) {
                return;
            }
            navigateToNtpUpsell(hatchAuthCredentialsCopy$default, this.submittedContactPoint, false);
            return;
        }
        this.ntpUpsellChoiceChallengeIndex = numA0r;
        if (hatchNtpUpsellChoiceRow.metaAccount != null) {
            HatchTwoFactorSourceApp hatchTwoFactorSourceApp = hatchNtpUpsellChoiceRow.sourceApp;
            HatchCaaNtpSourcePlatform ntpSourcePlatform = NativeLoginCaaSourceKt.toNtpSourcePlatform(hatchTwoFactorSourceApp != null ? hatchTwoFactorSourceApp.getWireValue() : null);
            if (ntpSourcePlatform == null) {
                HatchNtpSourceApp hatchNtpSourceApp = this.ntpSourceApp;
                ntpSourcePlatform = hatchNtpSourceApp != null ? NativeLoginCaaSourceKt.toNtpSourcePlatform(hatchNtpSourceApp) : null;
            }
            this.offerNtpSourcePlatform = ntpSourcePlatform;
        }
        handleTwoFactorChallenge(HatchAuthCredentials.copy$default(hatchAuthCredentials, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, hatchNtpUpsellChoiceRow.twoFactorChallenge, null, null, false, null, null, false, null, null, null, null, null, null, null, 1040121855, null));
    }

    public final void onOtpChange(String str) {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiState;
        C7384Etj.A0Y(str, 0);
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String strA17 = BQG.A17(sb.toString(), 6);
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            nativeLoginUiState = value;
        } while (!blg.A6e(value, C7384Etj.areEqual(strA17, nativeLoginUiState.otp) ? nativeLoginUiState : Companion.clearingErrorOn(NativeLoginUiState.copy$default(nativeLoginUiState, null, null, null, null, null, null, false, null, null, null, false, strA17, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -2049, 67108863, null), NativeLoginField.OTP)));
        String str2 = nativeLoginUiState.otp;
        if (strA17.length() != 6 || str2.length() >= 6) {
            return;
        }
        onOtpConfirmClicked();
    }

    public final void onPasswordChange(String str) {
        NativeLoginUiState value;
        Companion companion;
        C7384Etj.A0Y(str, 0);
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            companion = Companion;
        } while (!C3cI.A1U(NativeLoginField.PASSWORD, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, str, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -65537, 67108863, null), companion, value, blg));
    }

    public final void onPasswordRevealToggled(HatchScreen hatchScreen, boolean z) {
        C7384Etj.A0Y(hatchScreen, 0);
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.ONBOARDING, null, hatchScreen, HatchComponent.PASSWORD_REVEAL_TOGGLE, null, null);
    }

    public final void onRememberDeviceShown(HatchCaaLoginEventStep hatchCaaLoginEventStep) {
        C7384Etj.A0Y(hatchCaaLoginEventStep, 0);
        Boolean bool = C3cG.A0F(this).rememberDeviceValue;
        if (bool != null) {
            HatchCaaLoginLogger.INSTANCE.logPasswordSavingStart(this.submittedContactPoint, hatchCaaLoginEventStep, bool.booleanValue(), isRegistrationStep(hatchCaaLoginEventStep));
        }
    }

    public final void onRememberDeviceValueChange(boolean z, HatchCaaLoginEventStep hatchCaaLoginEventStep) {
        NativeLoginUiState value;
        C7384Etj.A0Y(hatchCaaLoginEventStep, 1);
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, Boolean.valueOf(z), null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -32769, 67108863, null)));
        HatchCaaLoginLogger.INSTANCE.logPasswordSavingCheckboxToggled(this.submittedContactPoint, hatchCaaLoginEventStep, z, isRegistrationStep(hatchCaaLoginEventStep));
    }

    public final void onRemoveProfile(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        C7384Etj.A0Y(nativeLoginAccountUiModel, 0);
        AuraRememberedAccount auraRememberedAccount = this.rememberedAccountsByRowId.get(nativeLoginAccountUiModel.id);
        NativeLoginSsoAccount nativeLoginSsoAccount = (auraRememberedAccount != null || (nativeLoginAccountUiModel.hasMetaAi ^ true)) ? null : this.ssoSelections.get(nativeLoginAccountUiModel.id);
        HatchAuthFlowContext.SsoSourceCounts ssoSourceCountsRowSourceCounts = rowSourceCounts(nativeLoginAccountUiModel);
        HatchCaaLoginLogger hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
        hatchCaaLoginLogger.logRemoveProfileClicked(ssoSourceCountsRowSourceCounts);
        if ((auraRememberedAccount == null && nativeLoginSsoAccount == null) || C3cG.A0F(this).selectedAccountId != null || !claimLoadingForRemoval()) {
            onRemoveProfilesDismissed();
            return;
        }
        HatchCaaStage hatchCaaStage = auraRememberedAccount != null ? HatchCaaStage.REMOVE_SAVED_ACCOUNT : HatchCaaStage.REMOVE_CROSS_APP_ACCOUNT;
        logClick(HatchScreen.LOGIN_LANDING, HatchComponent.DELETE_CONFIRM_BUTTON, REMOVE_SAVED_ACCOUNT_STEP, AGH.A0E());
        hatchCaaLoginLogger.logRemoveProfileSubmitted(ssoSourceCountsRowSourceCounts, hatchCaaStage.getValue());
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126291(auraRememberedAccount, this, nativeLoginSsoAccount, ssoSourceCountsRowSourceCounts, hatchCaaStage, nativeLoginAccountUiModel, null), AEu.A00(this));
    }

    public final void onSignupFirstNameChange(String str) {
        NativeLoginUiState value;
        C7384Etj.A0Y(str, 0);
        if (this.logsNameStep && !this.firstNameInteractionLogged) {
            this.firstNameInteractionLogged = true;
            HatchCaaRegistrationLogger.INSTANCE.logNameInteractionFirstName(this.submittedContactPoint);
        }
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, str, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67108351, null)));
    }

    public final void onSignupLastNameChange(String str) {
        NativeLoginUiState value;
        C7384Etj.A0Y(str, 0);
        if (this.logsNameStep && !this.lastNameInteractionLogged) {
            this.lastNameInteractionLogged = true;
            HatchCaaRegistrationLogger.INSTANCE.logNameInteractionLastName(this.submittedContactPoint);
        }
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, str, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67107839, null)));
    }

    public final void onSignupPasswordChange(String str) {
        NativeLoginUiState value;
        Companion companion;
        C7384Etj.A0Y(str, 0);
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            companion = Companion;
        } while (!C3cI.A1U(NativeLoginField.SIGNUP_PASSWORD, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, str, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67108735, null), companion, value, blg));
    }

    public final void onTwoFactorCodeChange(String str) {
        NativeLoginUiState value;
        C7384Etj.A0Y(str, 0);
        HatchTwoFactorMethod hatchTwoFactorMethod = this.twoFactorMethod;
        Integer num = hatchTwoFactorMethod != null ? hatchTwoFactorMethod.codeLength : null;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (num != null) {
            string = BQG.A17(string, num.intValue());
        }
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!C3cI.A1U(NativeLoginField.TWO_FACTOR_CODE, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, string, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -524289, 67108863, null), Companion, value, blg));
    }

    public final void onTwoFactorMethodSelected(HatchTwoFactorMethod hatchTwoFactorMethod) {
        C7384Etj.A0Y(hatchTwoFactorMethod, 0);
        HatchScreen hatchScreen = HatchScreen.LOGIN_OTP;
        HatchComponent hatchComponent = HatchComponent.TWO_FACTOR_METHOD_OPTION;
        String strA0x = AnonymousClass006.A0x(hatchTwoFactorMethod.type);
        logClick(hatchScreen, hatchComponent, FGI.A0M("two_factor_", strA0x), AnonymousClass007.A0c(HatchMetadataKey.TWO_FACTOR_TYPE, strA0x));
        String str = this.twoFactorState;
        if (str == null) {
            restartFromPhoneEntry(SESSION_EXPIRED_DIALOG);
        } else {
            HatchCaaLoginLogger.INSTANCE.logTwoFactorNextClicked(this.submittedContactPoint);
            selectTwoFactorMethod(hatchTwoFactorMethod, str, true);
        }
    }

    public final boolean showsGoogleSignInButton(NativeLoginUiState nativeLoginUiState) {
        C7384Etj.A0Y(nativeLoginUiState, 0);
        return (!NativeLoginViewModelKt.canCheckGoogleAccount || nativeLoginUiState.mayHaveGoogleAccount) && googleSignInIsButton();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[HatchCaaLoginEventStep.values().length];
            try {
                AnonymousClass005.A0v(HatchCaaLoginEventStep.TWO_FAC_REDIRECT, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchCaaLoginEventStep.LANDING, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(HatchCaaLoginEventStep.CONTACTPOINT, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(HatchCaaLoginEventStep.TOS, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(HatchCaaLoginEventStep.OTP, iArr, 5);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(HatchCaaLoginEventStep.PASSKEY, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(HatchCaaLoginEventStep.PASSWORD, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(HatchCaaLoginEventStep.ACCOUNT_SELECTOR, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeLoginCheckpointAction.values().length];
            try {
                AnonymousClass005.A0v(NativeLoginCheckpointAction.CONTINUE, iArr2, 1);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(NativeLoginCheckpointAction.SIGN_IN_AGAIN, iArr2, 2);
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NativeLoginErrorDismissal.values().length];
            try {
                AnonymousClass005.A0v(NativeLoginErrorDismissal.BACK_TO_LOGIN, iArr3, 1);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass005.A0v(NativeLoginErrorDismissal.RETURN_TO_LANDING, iArr3, 2);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass005.A0v(NativeLoginErrorDismissal.CONTINUE_TO_BIRTHDAY, iArr3, 3);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass005.A0v(NativeLoginErrorDismissal.CONTINUE_TO_OTP, iArr3, 4);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass005.A0v(NativeLoginErrorDismissal.CLOSE, iArr3, 5);
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        NativeLoginErrorDismissal nativeLoginErrorDismissal = NativeLoginErrorDismissal.CLOSE;
        GENERIC_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204c3, R.string._name_removed__res_0x7f1204ac, null, null, null, nativeLoginErrorDismissal);
        SESSION_EXPIRED_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204c1, R.string._name_removed__res_0x7f1204c0, null, null, null, nativeLoginErrorDismissal);
        TOS_CHANGED_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204c7, R.string._name_removed__res_0x7f1204c6, null, null, null, nativeLoginErrorDismissal);
        NETWORK_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204bb, R.string._name_removed__res_0x7f1204ba, null, null, null, nativeLoginErrorDismissal);
        TOO_MANY_ATTEMPTS_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204c5, R.string._name_removed__res_0x7f1204c4, null, null, null, nativeLoginErrorDismissal);
        VERIFICATION_REQUIRED_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204cd, R.string._name_removed__res_0x7f1204cc, null, null, null, nativeLoginErrorDismissal);
        CHECKPOINT_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204a2, R.string._name_removed__res_0x7f1204ad, null, null, null, nativeLoginErrorDismissal);
        TWO_FACTOR_PHONE_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204c9, R.string._name_removed__res_0x7f1204c8, null, null, null, nativeLoginErrorDismissal);
        NO_LINKED_ACCOUNT_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204bd, R.string._name_removed__res_0x7f1204bc, null, null, null, nativeLoginErrorDismissal);
        NativeLoginErrorDismissal nativeLoginErrorDismissal2 = NativeLoginErrorDismissal.RETURN_TO_LANDING;
        UNDERAGE_ATTEMPT_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204cb, R.string._name_removed__res_0x7f1204ca, null, null, null, nativeLoginErrorDismissal2);
        AGE_BLOCKED_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204ab, R.string._name_removed__res_0x7f1204aa, null, null, null, nativeLoginErrorDismissal2);
        NativeLoginErrorDismissal nativeLoginErrorDismissal3 = NativeLoginErrorDismissal.CLOSE;
        CREATE_BLOCKED_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204b0, R.string._name_removed__res_0x7f1204af, null, null, null, nativeLoginErrorDismissal3);
        PASSWORD_REQUIRED_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204bf, R.string._name_removed__res_0x7f1204be, null, null, null, nativeLoginErrorDismissal3);
        LINK_FAILED_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204b8, R.string._name_removed__res_0x7f1204b7, null, null, null, nativeLoginErrorDismissal3);
        REMOVE_ACCOUNT_FAILED_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204c3, R.string._name_removed__res_0x7f120513, null, null, null, nativeLoginErrorDismissal);
        ACCOUNT_EXISTS_DIALOG = new NativeLoginErrorDialogContent(R.string._name_removed__res_0x7f1204a9, R.string._name_removed__res_0x7f1204a8, null, null, null, NativeLoginErrorDismissal.BACK_TO_LOGIN);
    }

    private final void abandonCheckpointExchange() {
        NativeLoginUiState value;
        if (C3cG.A0F(this).checkpointWebViewVisible) {
            return;
        }
        synchronized (this.checkpointLock) {
            if (this.checkpointJob == null) {
                return;
            }
            AnonymousClass002.A1K(clearCheckpointContinuationLocked());
            BLG<NativeLoginUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -16777217, 67092479, null)));
        }
    }

    private final boolean acceptNtpUpsellPickedFromChoice(HatchAuthCredentials hatchAuthCredentials) {
        HatchNtpUpsellOffer hatchNtpUpsellOffer;
        NativeLoginUiState value;
        String str = this.ntpUpsellChoiceConsentVersion;
        boolean z = false;
        if (str != null && (hatchNtpUpsellOffer = hatchAuthCredentials.ntpUpsell) != null && str.equals(hatchNtpUpsellOffer.tos.contentVersion)) {
            z = true;
            if (enforceAccountCreationAgeGate()) {
                holdNtpUpsellOffer(hatchAuthCredentials, this.submittedContactPoint, false);
                BLG<NativeLoginUiState> blg = this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67092479, null)));
                acceptNtpUpsellOffer(true);
            }
        }
        return z;
    }

    private final void agreeToCompletionItemizedConsent() {
        PendingCompletionInputs pendingCompletionInputs;
        HatchAuthCredentials hatchAuthCredentials = this.pendingCredentials;
        if (hatchAuthCredentials == null || (pendingCompletionInputs = this.pendingCompletionInputs) == null || !claimLoading()) {
            return;
        }
        HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
        String str = this.submittedContactPoint;
        HatchCaaEventFlow hatchCaaEventFlow = HatchCaaEventFlow.NEW_TO_META;
        HatchCaaRegionalTos hatchCaaRegionalTos = HatchCaaRegionalTos.KOREA;
        HatchTosDisclosure hatchTosDisclosure = hatchAuthCredentials.tos;
        hatchCaaRegistrationLogger.logTosAccepted(str, hatchCaaEventFlow, null, hatchCaaRegionalTos, hatchTosDisclosure != null ? hatchTosDisclosure.contentVersion : null);
        hatchCaaRegistrationLogger.logCreateAttempt(this.submittedContactPoint, null, null, null);
        completeRegistration(hatchAuthCredentials, pendingCompletionInputs.isoDate, true, pendingCompletionInputs);
    }

    private final void agreeToLinkingItemizedConsent(NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState) {
        if (this.linkingDisclosureForNtpUpsell) {
            if (claimLoading()) {
                HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
                hatchCaaRegistrationLogger.logTosAccepted(this.offerContactPoint, HatchCaaEventFlow.NEW_TO_PLATFORM, this.offerNtpSourcePlatform, HatchCaaRegionalTos.KOREA, nativeLoginLinkingDisclosureUiState.contentVersion);
                logLinkingDisclosure(new AnonymousClass1(hatchCaaRegistrationLogger));
                replayNtpUpsellAccept(nativeLoginLinkingDisclosureUiState.contentVersion);
                return;
            }
            return;
        }
        NativeLoginSsoAccount nativeLoginSsoAccount = this.pendingSsoNameCompletion;
        if (nativeLoginSsoAccount == null || !claimLoading()) {
            return;
        }
        HatchCaaRegistrationLogger hatchCaaRegistrationLogger2 = HatchCaaRegistrationLogger.INSTANCE;
        hatchCaaRegistrationLogger2.logTosAccepted(this.submittedContactPoint, HatchCaaEventFlow.NEW_TO_PLATFORM, NativeLoginCaaSourceKt.toNtpSourcePlatform(nativeLoginSsoAccount.sourceApp), HatchCaaRegionalTos.KOREA, nativeLoginLinkingDisclosureUiState.contentVersion);
        logLinkingDisclosure(new AnonymousClass2(hatchCaaRegistrationLogger2));
        replayAgreedLinkingDisclosure(nativeLoginLinkingDisclosureUiState, nativeLoginSsoAccount);
    }

    private final boolean armPasskeyOffer() {
        boolean z;
        synchronized (this.offerLock) {
            z = false;
            if (!this.passkeyOfferStarted) {
                if (NativeLoginViewModelKt.isPasskeyLoginEnabled()) {
                    this.passkeyOfferStarted = true;
                    this.passkeyJob = launchDiscoverablePasskey(this.passkeyOfferEpoch);
                    z = true;
                } else {
                    this.passkeyOfferStarted = true;
                    this.passkeyAttemptSettled = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object attemptOneTap(String str, String str2, G0U<? super Boolean, Unit> g0u, HtJ<? super NativeLoginOneTap.Attempt> htJ) {
        return this.oneTap.login(str, str2, new C125912(null), new AnonymousClass3(null), g0u, new AnonymousClass4(this), htJ);
    }

    private final void attemptSilentTokenExchange() {
        String metaAccessToken;
        if (AnonymousClass002.A1X(AuraSessionManager.INSTANCE.getCurrentSession()) || (metaAccessToken = AuraMetaFRLSecureTokenStore.INSTANCE.getMetaAccessToken()) == null) {
            return;
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C125921(metaAccessToken, null), AEu.A00(this));
    }

    public static /* synthetic */ void beginOtp$default(NativeLoginViewModel nativeLoginViewModel, NativeLoginIdentifier nativeLoginIdentifier, boolean z, HatchCaaEventFlow hatchCaaEventFlow, G0U g0u, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCaaEventFlow = null;
        }
        nativeLoginViewModel.beginOtp(nativeLoginIdentifier, z, hatchCaaEventFlow, g0u);
    }

    private final int cancelLandingReads() {
        int i;
        synchronized (this.landingReadLock) {
            C27k<? extends Map<String, HatchMuseProfile>> c27k = this.landingMuseProfiles;
            if (c27k != null) {
                c27k.A5w(null);
            }
            this.landingMuseProfiles = null;
            this.landingSavedAccounts = null;
            i = this.landingReadGeneration + 1;
            this.landingReadGeneration = i;
        }
        return i;
    }

    private final void cancelPendingAttempts() {
        NativeLoginUiState value;
        HoC hoC = this.confirmJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.confirmJob = null;
        synchronized (this.offerLock) {
            if (this.passkeyJob == null) {
                return;
            }
            HoC hoC2 = this.passkeyJob;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            this.passkeyJob = null;
            this.passkeyOfferEpoch++;
            this.passkeyAttemptSettled = true;
            boolean z = this.passkeyHoldsLoading;
            this.passkeyHoldsLoading = false;
            if (z) {
                BLG<NativeLoginUiState> blg = this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67092479, null)));
            }
        }
    }

    private final boolean claimLoading() {
        NativeLoginUiState value;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, true, false, null, null, null, null, null, null, null, null, null, false, -1, 67092479, null)));
        return !r3.isLoading;
    }

    private final boolean claimLoadingForRemoval() {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiState;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            nativeLoginUiState = value;
        } while (!blg.A6e(value, nativeLoginUiState.isLoading ? nativeLoginUiState : NativeLoginUiState.copy$default(nativeLoginUiState, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, true, true, null, null, null, null, null, null, null, null, null, false, -1, 67059711, null)));
        return !nativeLoginUiState.isLoading;
    }

    public static /* synthetic */ G0U claimOtp$default(NativeLoginViewModel nativeLoginViewModel, NativeLoginIdentifier nativeLoginIdentifier, boolean z, HatchCaaEventFlow hatchCaaEventFlow, boolean z2, HatchCaaEntryPoint hatchCaaEntryPoint, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCaaEventFlow = null;
        }
        boolean zA1K = C3cG.A1K(i & 8, z2);
        if ((i & 16) != 0) {
            hatchCaaEntryPoint = HatchCaaEntryPoint.LOGIN_HOME;
        }
        return nativeLoginViewModel.claimOtp(nativeLoginIdentifier, z, hatchCaaEventFlow, zA1K, hatchCaaEntryPoint);
    }

    private final void clearCheckpointContinuation() {
        HoC hoCClearCheckpointContinuationLocked;
        synchronized (this.checkpointLock) {
            hoCClearCheckpointContinuationLocked = clearCheckpointContinuationLocked();
        }
        AnonymousClass002.A1K(hoCClearCheckpointContinuationLocked);
    }

    private final void clearForRestart() {
        NativeLoginUiState value;
        cancelPendingAttempts();
        HatchAuthFlowContext.INSTANCE.adoptOrBeginFlow(HatchCaaEntryPoint.LOGIN_HOME.getValue());
        this.authState = null;
        this.savedAccountCodeCard = null;
        this.ntpSourceApp = null;
        this.createdAccountContactPoint = null;
        this.twoFactorState = null;
        this.twoFactorAttestationRequest = null;
        this.twoFactorMethod = null;
        this.twoFactorTosContentVersion = null;
        this.codeSentForMethodId = null;
        this.reactivationOriginStep = null;
        this.loginMethod = LoginMethod.OTHER;
        this.pendingCredentials = null;
        this.pendingCompletionInputs = null;
        this.pendingSsoNameCompletion = null;
        this.pendingSsoNameCompletionIsJoin = false;
        this.logsNameStep = false;
        this.linkingDisclosureAccount = null;
        this.linkingDisclosureForNtpUpsell = false;
        this.agreedLinkingDisclosureVersion = null;
        this.submittedSsoName = null;
        this.offerContactPoint = null;
        this.ntpUpsellChoiceConsentVersion = null;
        this.ntpUpsellChoiceChallengeIndex = null;
        this.ntpUpsellChoiceRows = C0881AGi.A00;
        this.declinedNtpUpsell = AnonymousClass002.A1X(this.registrationRecoveryContactPoint);
        this.offerFromTwoFactor = false;
        this.birthdayBackReturnsToOffer = false;
        this.pendingSmsCode = null;
        this.accountSelectionState = null;
        this.accountSelectionRefs = AGH.A0E();
        this.oneTap.redeemedAbraUserId = null;
        this.provenContactPoint = null;
        this.rememberDeviceAnswer = null;
        this.continuationSessionOutcome = null;
        clearCheckpointContinuation();
        resetPasskeyOffer();
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(clearedForNewAttempt(value), null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -32769, 67092479, null)));
        rearmOfferForLiveEntryScreen();
    }

    private final void clearPasskeyOfferAttribution() {
        if (this.offerOpensRegFunnel) {
            HatchAuthFlowContext hatchAuthFlowContext = HatchAuthFlowContext.INSTANCE;
            hatchAuthFlowContext.setRegistrationSource(null);
            C3cG.A1E(hatchAuthFlowContext, HatchCaaEntryPoint.LOGIN_HOME);
        }
    }

    private final void clearRegistrationSource() {
        HatchAuthFlowContext.INSTANCE.setRegistrationSource(null);
    }

    private final void clearTransientAuthState() {
        NativeLoginUiState value;
        HoC hoC = this.smsConsentJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.smsConsentJob = null;
        this.authState = null;
        this.registrationRecoveryContactPoint = null;
        this.ntpSourceApp = null;
        this.createdAccountContactPoint = null;
        this.twoFactorState = null;
        this.twoFactorAttestationRequest = null;
        this.twoFactorMethod = null;
        this.twoFactorTosContentVersion = null;
        this.codeSentForMethodId = null;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -12582913, 67108863, null)));
        this.reactivationOriginStep = null;
        this.loginMethod = LoginMethod.OTHER;
        this.pendingCredentials = null;
        this.pendingCompletionInputs = null;
        this.pendingSsoNameCompletion = null;
        this.pendingSsoNameCompletionIsJoin = false;
        this.logsNameStep = false;
        this.linkingDisclosureAccount = null;
        this.linkingDisclosureForNtpUpsell = false;
        this.agreedLinkingDisclosureVersion = null;
        this.submittedSsoName = null;
        this.offerContactPoint = null;
        this.ntpUpsellChoiceConsentVersion = null;
        this.ntpUpsellChoiceChallengeIndex = null;
        this.ntpUpsellChoiceRows = C0881AGi.A00;
        this.declinedNtpUpsell = false;
        this.offerFromTwoFactor = false;
        this.birthdayBackReturnsToOffer = false;
        this.pendingSmsCode = null;
        C9jH c9jHA0E = AGH.A0E();
        this.ssoSelections = c9jHA0E;
        cancelLandingReads();
        this.picker.clear();
        this.rememberedAccountsByRowId = c9jHA0E;
        this.rememberedMuseProfilesByRowId = c9jHA0E;
        this.hasLeftPicker = false;
        this.oneTap.redeemedAbraUserId = null;
        this.provenContactPoint = null;
        this.rememberDeviceAnswer = null;
        this.savedAccountCodeCard = null;
        this.accountSelectionState = null;
        this.accountSelectionRefs = c9jHA0E;
        this.continuationSessionOutcome = null;
        clearCheckpointContinuation();
        resetPasskeyOffer();
    }

    private final NativeLoginUiState clearedForNewAttempt(NativeLoginUiState nativeLoginUiState) {
        NativeLoginCheckpointAction nativeLoginCheckpointAction = NativeLoginCheckpointAction.CONTINUE;
        AHI ahi = AHI.A01;
        HatchLandingPresentation hatchLandingPresentation = HatchLandingPresentation.STANDARD;
        NativeLoginItemizedConsentTarget nativeLoginItemizedConsentTarget = nativeLoginUiState.itemizedConsentTarget;
        return NativeLoginUiState.copy$default(nativeLoginUiState, null, null, null, null, null, ahi, false, null, null, null, false, "", false, null, false, null, "", false, null, "", null, null, null, null, null, null, false, nativeLoginCheckpointAction, null, null, null, hatchLandingPresentation, null, null, false, false, nativeLoginItemizedConsentTarget instanceof NativeLoginItemizedConsentTarget.Linking ? nativeLoginItemizedConsentTarget : null, null, null, "", true, "", "", false, false, true, false, false, null, null, null, null, null, null, null, null, null, false, 3471119, 41767023, null);
    }

    private final void closeCheckpointWeb() {
        NativeLoginUiState value;
        clearCheckpointContinuation();
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -83886081, 67108863, null)));
        emitEffect(NativeLoginViewEffect.CloseCheckpointWeb.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeLogin(HatchAuthCredentials hatchAuthCredentials, LoginSessionOutcome loginSessionOutcome, boolean z) {
        LoginSessionOutcome loginSessionOutcome2 = this.continuationSessionOutcome;
        if (loginSessionOutcome2 != null) {
            loginSessionOutcome = loginSessionOutcome2;
        }
        this.continuationSessionOutcome = null;
        if (!C7BY.A0j(hatchAuthCredentials.abraAccessToken) && !C7BY.A0j(hatchAuthCredentials.abraUserId) && !C7BY.A0j(hatchAuthCredentials.frlAccessToken)) {
            finishLogin(hatchAuthCredentials, loginSessionOutcome, z);
        } else {
            logIncompleteCredentials(loginSessionOutcome);
            restartFromPhoneEntry(GENERIC_DIALOG);
        }
    }

    public static /* synthetic */ void completeLogin$default(NativeLoginViewModel nativeLoginViewModel, HatchAuthCredentials hatchAuthCredentials, LoginSessionOutcome loginSessionOutcome, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            loginSessionOutcome = null;
        }
        nativeLoginViewModel.completeLogin(hatchAuthCredentials, loginSessionOutcome, AnonymousClass005.A1O(i, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeMetaTwoFactorSignup(HatchAuthCredentials hatchAuthCredentials) {
        HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
        String str = this.submittedContactPoint;
        Long lA0s = C9tI.A0s(hatchAuthCredentials.frlAccountId);
        HatchCaaEventFlow hatchCaaEventFlow = HatchCaaEventFlow.NEW_TO_PLATFORM;
        hatchCaaRegistrationLogger.logCreateSuccess(str, lA0s, hatchCaaEventFlow, null, this.offerNtpSourcePlatform);
        completeLogin(hatchAuthCredentials, new LoginSessionOutcome.Signup(hatchCaaEventFlow), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void concedeToGoogleIfIdle() {
        Activity activityLiveHostActivity;
        synchronized (this.offerLock) {
            activityLiveHostActivity = (mayConcedeToGoogle() && topEntryScreenOffersCredentials() && this.passkeyAttemptSettled && !this.passkeyHeldScreen) ? liveHostActivity() : null;
        }
        if (activityLiveHostActivity == null || googleSignInIsButton()) {
            return;
        }
        onGoogleSignInRequested(activityLiveHostActivity, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void continueOneTapLogin(HatchAuthCredentials hatchAuthCredentials) {
        HatchCaaLoginEventStep hatchCaaLoginEventStep = HatchCaaLoginEventStep.LANDING;
        HatchCaaLoginCredentialType hatchCaaLoginCredentialType = HatchCaaLoginCredentialType.NONCE;
        recordContinuationOutcome(hatchAuthCredentials, hatchCaaLoginEventStep, null, hatchCaaLoginCredentialType);
        LoginSessionOutcome.Login login = new LoginSessionOutcome.Login(hatchCaaLoginEventStep, null, hatchCaaLoginCredentialType);
        if (handleLoginContinuation(hatchAuthCredentials, login, null, LoginMethod.ONE_TAP)) {
            return;
        }
        completeLogin(hatchAuthCredentials, login, false);
    }

    private final boolean continueToOtpForContactPoint(String str, HatchCaaEventFlow hatchCaaEventFlow) {
        NativeLoginUiState value;
        NativeLoginUiState value2;
        NativeLoginIdentifier nativeLoginIdentifier = NativeLoginIdentifierKt.classifyLoginIdentifier(str, C3cG.A0F(this).selectedCountry.iso).identifier;
        BLG<NativeLoginUiState> blg = this._uiState;
        if (nativeLoginIdentifier == null) {
            do {
                value2 = blg.getValue();
            } while (!blg.A6e(value2, NativeLoginUiState.copy$default(value2, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67092479, null)));
            emitEffect(NativeLoginViewEffect.NavigateToPhoneEntry.INSTANCE);
            return false;
        }
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, str, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -257, 66830335, null)));
        beginOtp(nativeLoginIdentifier, false, hatchCaaEventFlow, new C125963());
        return true;
    }

    public static /* synthetic */ boolean continueToOtpForContactPoint$default(NativeLoginViewModel nativeLoginViewModel, String str, HatchCaaEventFlow hatchCaaEventFlow, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchCaaEventFlow = null;
        }
        return nativeLoginViewModel.continueToOtpForContactPoint(str, hatchCaaEventFlow);
    }

    private final void declineNtpUpsell(boolean z) {
        NativeLoginUiState value;
        String str;
        String str2;
        HatchAuthCredentials hatchAuthCredentials;
        HatchNtpUpsellOffer hatchNtpUpsellOffer;
        logClick(HatchScreen.LOGIN_NTP_UPSELL, HatchComponent.NTP_UPSELL_DECLINE_BUTTON, "ntp_upsell_decline", AGH.A0E());
        HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
        hatchCaaRegistrationLogger.logUpsellSwitchToNtm(this.offerContactPoint);
        HatchAuthCredentials hatchAuthCredentials2 = this.pendingCredentials;
        if (hatchAuthCredentials2 != null && (str2 = hatchAuthCredentials2.completionHandle) != null && C7BY.A0j(str2) && ((hatchAuthCredentials = this.pendingCredentials) == null || (hatchNtpUpsellOffer = hatchAuthCredentials.ntpUpsell) == null || hatchNtpUpsellOffer.contactPoint == null)) {
            restartFromPhoneEntry();
            return;
        }
        HatchAuthCredentials hatchAuthCredentials3 = this.pendingCredentials;
        if (hatchAuthCredentials3 == null) {
            restartFromPhoneEntry(SESSION_EXPIRED_DIALOG);
            return;
        }
        HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep = HatchCaaRegistrationEventStep.UPSELL_AT_LOGIN;
        String str3 = this.submittedContactPoint;
        HatchCaaEventFlow hatchCaaEventFlow = HatchCaaEventFlow.NEW_TO_META;
        hatchCaaRegistrationLogger.logRegistrationStart(hatchCaaRegistrationEventStep, str3, null, hatchCaaEventFlow, null, null, HatchCaaNtmSwitchReason.UPSELL_DECLINED);
        if (!C7BY.A0j(hatchAuthCredentials3.completionHandle)) {
            navigateToBirthday(hatchAuthCredentials3, false, z);
            return;
        }
        HatchNtpUpsellOffer hatchNtpUpsellOffer2 = hatchAuthCredentials3.ntpUpsell;
        if (hatchNtpUpsellOffer2 == null || (str = hatchNtpUpsellOffer2.contactPoint) == null) {
            clearPasskeyOfferAttribution();
            BLG<NativeLoginUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67092479, null)));
            emitEffect(NativeLoginViewEffect.NavigateToPhoneEntry.INSTANCE);
            return;
        }
        this.declinedNtpUpsell = true;
        if (continueToOtpForContactPoint(str, hatchCaaEventFlow)) {
            return;
        }
        this.declinedNtpUpsell = false;
        clearPasskeyOfferAttribution();
    }

    private final boolean declinesAfterMetaTwoFactor(HatchAuthError hatchAuthError) {
        return C7384Etj.areEqual(hatchAuthError, HatchAuthError.LinkFailed.INSTANCE) || C7384Etj.areEqual(hatchAuthError, HatchAuthError.RegistrationBlocked.INSTANCE) || C7384Etj.areEqual(hatchAuthError, HatchAuthError.PhoneAlreadyInUse.INSTANCE) || C7384Etj.areEqual(hatchAuthError, HatchAuthError.EmailAlreadyInUse.INSTANCE);
    }

    private final String describePasskeyFailure(Throwable th) {
        HatchAuthException hatchAuthException;
        HatchAuthError hatchAuthError;
        String string;
        return (!(th instanceof HatchAuthException) || (hatchAuthException = (HatchAuthException) th) == null || (hatchAuthError = hatchAuthException.error) == null || (string = hatchAuthError.toString()) == null) ? C3cI.A0Y(th) : string;
    }

    private final HoC detachCheckpointJobLocked() {
        this.checkpointGeneration++;
        HoC hoC = this.checkpointJob;
        this.checkpointJob = null;
        return hoC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object discoverableOffer(java.lang.String r7, X.HtJ<? super com.facebook.aura.login.nativeflow.HatchPasskeyRequestOptions> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.login.nativeflow.NativeLoginViewModel.C125971
            if (r0 == 0) goto L86
            r3 = r8
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$discoverableOffer$1 r3 = (com.facebook.aura.login.nativeflow.NativeLoginViewModel.C125971) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L75
            if (r0 != r2) goto L8c
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L21:
            boolean r0 = r1 instanceof X.C10571Hud
            r5 = 0
            r2 = r1
            if (r0 == 0) goto L28
            r2 = r5
        L28:
            com.facebook.aura.login.nativeflow.HatchAuthLoginOptions r2 = (com.facebook.aura.login.nativeflow.HatchAuthLoginOptions) r2
            java.lang.String r3 = "NativeLoginViewModel"
            if (r2 != 0) goto L4e
            java.lang.Throwable r4 = X.HsJ.A00(r1)
            com.facebook.aura.analytics.hatch.passkey.HatchPasskeyLogger r2 = com.facebook.aura.analytics.hatch.passkey.HatchPasskeyLogger.INSTANCE
            com.facebook.aura.analytics.hatch.passkey.HatchPasskeyEvent r1 = com.facebook.aura.analytics.hatch.passkey.HatchPasskeyEvent.FETCH_CHALLENGE_ERROR
            com.facebook.aura.analytics.hatch.passkey.HatchPasskeyErrorType r0 = com.facebook.aura.analytics.hatch.passkey.HatchPasskeyErrorType.LOGIN_OPTIONS_FAILED
            java.lang.String r0 = r0.getValue()
            r2.log(r1, r0)
            if (r4 != 0) goto L49
            java.lang.String r1 = "no result"
        L43:
            java.lang.String r0 = "discoverable passkey offer skipped: login_options failed: "
            X.C3cG.A1G(r0, r1, r3)
            return r5
        L49:
            java.lang.String r1 = r6.describePasskeyFailure(r4)
            goto L43
        L4e:
            com.facebook.aura.login.nativeflow.HatchAuthLoginOptionsState r1 = r2.state
            com.facebook.aura.login.nativeflow.HatchAuthLoginOptionsState r0 = com.facebook.aura.login.nativeflow.HatchAuthLoginOptionsState.PASSKEY_DISCOVERABLE
            if (r1 == r0) goto L5e
            java.lang.String r0 = "discoverable passkey offer skipped: state="
            java.lang.String r0 = X.AnonymousClass007.A0a(r0, r1)
            X.CFK.A06(r3, r0)
            return r5
        L5e:
            com.facebook.aura.login.nativeflow.HatchPasskeyRequestOptions r4 = r2.passkeyOptions
            if (r4 != 0) goto L85
            com.facebook.aura.analytics.hatch.passkey.HatchPasskeyLogger r2 = com.facebook.aura.analytics.hatch.passkey.HatchPasskeyLogger.INSTANCE
            com.facebook.aura.analytics.hatch.passkey.HatchPasskeyEvent r1 = com.facebook.aura.analytics.hatch.passkey.HatchPasskeyEvent.FETCH_CHALLENGE_ERROR
            com.facebook.aura.analytics.hatch.passkey.HatchPasskeyErrorType r0 = com.facebook.aura.analytics.hatch.passkey.HatchPasskeyErrorType.UNUSABLE_REQUEST_OPTIONS
            java.lang.String r0 = r0.getValue()
            r2.log(r1, r0)
            java.lang.String r0 = "discoverable passkey offer skipped: unusable request options"
            X.CFK.A06(r3, r0)
            return r4
        L75:
            X.Hwg.A00(r1)
            com.facebook.aura.login.nativeflow.HatchAuthApi r1 = com.facebook.aura.login.nativeflow.HatchAuthApi.INSTANCE
            r0 = 0
            r3.L$0 = r0
            r3.label = r2
            java.lang.Object r1 = r1.m1256loginOptionsgIAlus(r7, r3)
            if (r1 != r4) goto L21
        L85:
            return r4
        L86:
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$discoverableOffer$1 r3 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$discoverableOffer$1
            r3.<init>(r8)
            goto L12
        L8c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.discoverableOffer(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final NativeLoginLinkingDisclosureUiState drawableLinkingDisclosure(HatchAuthCredentials hatchAuthCredentials) {
        NativeLoginAccountUiModel nativeLoginAccountUiModel = this.linkingDisclosureAccount;
        if (nativeLoginAccountUiModel == null || !(!nativeLoginAccountUiModel.hasMetaAi) || this.pendingSsoNameCompletion == null) {
            return null;
        }
        return NativeLoginLinkingDisclosureScreenKt.linkingDisclosureFor(nativeLoginAccountUiModel, hatchAuthCredentials.disclosurePresentation, hatchAuthCredentials.tos, hatchAuthCredentials.itemizedConsent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dropLandingSavedAccounts() {
        synchronized (this.landingReadLock) {
            this.landingSavedAccounts = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object exchangeCheckpointAccessToken(java.lang.String r7, int r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.NativeLoginViewModel.C125991
            if (r0 == 0) goto L6b
            r5 = r9
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeCheckpointAccessToken$1 r5 = (com.facebook.aura.login.nativeflow.NativeLoginViewModel.C125991) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L54
            if (r0 != r3) goto L71
            int r8 = r5.I$0
            X.Hwg.A00(r1)
        L22:
            X.HsJ r1 = (X.HsJ) r1
            if (r1 == 0) goto L4d
            int r0 = r6.checkpointGeneration
            boolean r0 = X.AnonymousClass002.A1Q(r0, r8)
            if (r0 == 0) goto L4d
            java.lang.Object r1 = r1.value
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L3c
            r0 = r1
            com.facebook.aura.login.nativeflow.HatchAuthCredentials r0 = (com.facebook.aura.login.nativeflow.HatchAuthCredentials) r0
            r6.completeCheckpointContinuation(r0, r8)
        L3c:
            java.lang.Throwable r1 = X.HsJ.A00(r1)
            if (r1 == 0) goto L4d
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$Companion r0 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.Companion
            boolean r0 = r0.isRetryableCheckpointExchangeFailure(r1)
            if (r0 == 0) goto L50
            r6.presentCheckpointLocalFailure(r8)
        L4d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L50:
            r6.presentCheckpointSsoFailure(r8, r1)
            goto L4d
        L54:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeCheckpointAccessToken$result$1 r0 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeCheckpointAccessToken$result$1
            r0.<init>(r6, r8, r7, r1)
            r5.L$0 = r1
            r5.I$0 = r8
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L22
            return r4
        L6b:
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeCheckpointAccessToken$1 r5 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeCheckpointAccessToken$1
            r5.<init>(r9)
            goto L12
        L71:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.exchangeCheckpointAccessToken(java.lang.String, int, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exchangeGoogleCredential(NativeLoginGoogleCredential nativeLoginGoogleCredential) {
        HatchCaaLoginLogger.INSTANCE.logGoogleAccountSelected(nativeLoginGoogleCredential.email);
        logClick(HatchScreen.LOGIN_CONTACT_POINT, HatchComponent.SSO_ACCOUNT_ROW, "sso_google", AnonymousClass006.A10(HatchMetadataKey.SSO_SOURCE_APP.getValue(), "google"));
        if (claimLoading()) {
            resetRememberDeviceValue();
            HatchAuthFlowContext.INSTANCE.setLoginFlow(null, null);
            this.submittedContactPoint = nativeLoginGoogleCredential.email;
            signingInAs(GOOGLE_SIGN_IN_ROW_ID, new C126001(nativeLoginGoogleCredential, new LoginSessionOutcome.Login(HatchCaaLoginEventStep.CONTACTPOINT, HatchCaaLoginSource.SIGN_IN_WITH_GOOGLE_LOGIN, HatchCaaLoginCredentialType.OPENID_CONNECT), null));
        }
    }

    private final void exchangeSsoSelection(NativeLoginAccountUiModel nativeLoginAccountUiModel, NativeLoginSsoAccount nativeLoginSsoAccount, String str, SubmittedSsoName submittedSsoName) {
        signingInAs(nativeLoginAccountUiModel.id, new C126011(nativeLoginSsoAccount, !nativeLoginAccountUiModel.hasMetaAi, submittedSsoName, str, NativeLoginCaaSourceKt.toNtpSourcePlatform(nativeLoginSsoAccount.sourceApp), NativeLoginCaaSourceKt.toCredentialType(nativeLoginSsoAccount.sourceApp), null));
    }

    public static /* synthetic */ void exchangeSsoSelection$default(NativeLoginViewModel nativeLoginViewModel, NativeLoginAccountUiModel nativeLoginAccountUiModel, NativeLoginSsoAccount nativeLoginSsoAccount, String str, SubmittedSsoName submittedSsoName, int i, Object obj) {
        if ((i & 8) != 0) {
            submittedSsoName = null;
        }
        nativeLoginViewModel.exchangeSsoSelection(nativeLoginAccountUiModel, nativeLoginSsoAccount, str, submittedSsoName);
    }

    private final NativeLoginErrorDialogContent fallbackDialogFor(HatchAuthError hatchAuthError) {
        if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.Network.INSTANCE)) {
            return NETWORK_DIALOG;
        }
        if (!C7384Etj.areEqual(hatchAuthError, HatchAuthError.SessionExpired.INSTANCE)) {
            if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.RateLimited.INSTANCE)) {
                return TOO_MANY_ATTEMPTS_DIALOG;
            }
            if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.AdditionalVerificationRequired.INSTANCE) || C7384Etj.areEqual(hatchAuthError, HatchAuthError.TwoFactorMethodUnsupported.INSTANCE)) {
                return VERIFICATION_REQUIRED_DIALOG;
            }
            if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.CheckpointRequired.INSTANCE)) {
                return CHECKPOINT_DIALOG;
            }
            if (!C7384Etj.areEqual(hatchAuthError, HatchAuthError.InvalidTwoFactorState.INSTANCE) && !C7384Etj.areEqual(hatchAuthError, HatchAuthError.InvalidSelection.INSTANCE) && !C7384Etj.areEqual(hatchAuthError, HatchAuthError.CompletionHandleInvalid.INSTANCE)) {
                if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.TosContentVersionMismatch.INSTANCE)) {
                    return TOS_CHANGED_DIALOG;
                }
                if (!C7384Etj.areEqual(hatchAuthError, HatchAuthError.UnderageRegistration.INSTANCE)) {
                    if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.PhoneAlreadyInUse.INSTANCE) || C7384Etj.areEqual(hatchAuthError, HatchAuthError.EmailAlreadyInUse.INSTANCE)) {
                        return ACCOUNT_EXISTS_DIALOG;
                    }
                    if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.AccountCreatedWithoutSession.INSTANCE) || C7384Etj.areEqual(hatchAuthError, HatchAuthError.RegistrationRecoveryRequired.INSTANCE)) {
                        NativeLoginErrorDialogContent nativeLoginErrorDialogContent = GENERIC_DIALOG;
                        return new NativeLoginErrorDialogContent(nativeLoginErrorDialogContent.titleRes, nativeLoginErrorDialogContent.messageRes, nativeLoginErrorDialogContent.serverTitle, nativeLoginErrorDialogContent.serverMessage, nativeLoginErrorDialogContent.action, NativeLoginErrorDismissal.BACK_TO_LOGIN);
                    }
                    if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.LinkFailed.INSTANCE) || C7384Etj.areEqual(hatchAuthError, HatchAuthError.RegistrationDisabled.INSTANCE)) {
                        return LINK_FAILED_DIALOG;
                    }
                    if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.ContactPointIsTwoFactorMethod.INSTANCE)) {
                        return TWO_FACTOR_PHONE_DIALOG;
                    }
                    if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.NoLinkedAccount.INSTANCE)) {
                        return NO_LINKED_ACCOUNT_DIALOG;
                    }
                    if (!C7384Etj.areEqual(hatchAuthError, HatchAuthError.Underage.INSTANCE)) {
                        return C7384Etj.areEqual(hatchAuthError, HatchAuthError.CreateBlocked.INSTANCE) ? CREATE_BLOCKED_DIALOG : GENERIC_DIALOG;
                    }
                }
                return UNDERAGE_ATTEMPT_DIALOG;
            }
        }
        return SESSION_EXPIRED_DIALOG;
    }

    private final void finishLogin(HatchAuthCredentials hatchAuthCredentials, LoginSessionOutcome loginSessionOutcome, boolean z) {
        NativeLoginUiState value;
        Boolean bool = C3cG.A0F(this).rememberDeviceValue;
        boolean zIsOneTapLogin = this.oneTap.isOneTapLogin(hatchAuthCredentials.abraUserId);
        HatchTempTokenProvider hatchTempTokenProvider = HatchTempTokenProvider.INSTANCE;
        String str = HatchTempTokenProvider.session.get();
        String str2 = this.provenContactPoint;
        String str3 = hatchAuthCredentials.frlAccountId;
        if (C7BY.A0j(str3)) {
            str3 = null;
        }
        boolean z2 = loginSessionOutcome instanceof LoginSessionOutcome.Signup;
        if (z2) {
            HatchCaaLoginLogger.INSTANCE.logSignupLoginSuccess(this.submittedContactPoint, str3, ((LoginSessionOutcome.Signup) loginSessionOutcome).flow);
        } else if (C7384Etj.areEqual(loginSessionOutcome, LoginSessionOutcome.TwoFactor.INSTANCE)) {
            HatchCaaLoginLogger.INSTANCE.logTwoFactorLoginSuccess(this.submittedContactPoint, str3);
        } else if (loginSessionOutcome instanceof LoginSessionOutcome.Login) {
            LoginSessionOutcome.Login login = (LoginSessionOutcome.Login) loginSessionOutcome;
            HatchCaaLoginLogger.INSTANCE.logSessionLoginSuccess(this.submittedContactPoint, str3, login.step, login.source, login.credentialType, false);
        } else if (loginSessionOutcome != null) {
            throw C3cG.A0q();
        }
        logRememberDeviceDecision();
        HatchAttributionReporter.INSTANCE.recordPendingAuthEvent(z2 ? HatchAttributionReporter.AuthEvent.REGISTRATION : HatchAttributionReporter.AuthEvent.LOGIN);
        if (!z && !z2) {
            AnonymousClass003.A0u(hatchAuthCredentials.abraUserId, this.loginMethod);
        }
        hatchTempTokenProvider.cleanup();
        HatchAuthFlowContext.INSTANCE.endFlow();
        clearTransientAuthState();
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, "", false, null, null, null, null, null, null, null, null, false, NativeLoginCheckpointAction.CONTINUE, null, null, null, null, null, null, false, false, null, "", null, "", false, "", "", false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -251723777, 67107167, null)));
        if (AuraSessionManager.INSTANCE.onLoginComplete(hatchAuthCredentials.frlAccessToken, hatchAuthCredentials.frlAccountId, hatchAuthCredentials.abraUserId, hatchAuthCredentials.abraAccessToken, hatchAuthCredentials.refreshToken)) {
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126022(hatchAuthCredentials.abraUserId, str3, str2, hatchAuthCredentials.frlAccessToken, bool, zIsOneTapLogin, str, null), AEu.A00(this));
        }
    }

    public static /* synthetic */ void finishLogin$default(NativeLoginViewModel nativeLoginViewModel, HatchAuthCredentials hatchAuthCredentials, LoginSessionOutcome loginSessionOutcome, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            loginSessionOutcome = null;
        }
        nativeLoginViewModel.finishLogin(hatchAuthCredentials, loginSessionOutcome, AnonymousClass005.A1O(i, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object freshSsoAccount(com.facebook.aura.login.nativeflow.NativeLoginSsoAccount r6, java.lang.String r7, X.HtJ<? super com.facebook.aura.login.nativeflow.NativeLoginSsoAccount> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.login.nativeflow.NativeLoginViewModel.C126031
            if (r0 == 0) goto L66
            r4 = r8
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$freshSsoAccount$1 r4 = (com.facebook.aura.login.nativeflow.NativeLoginViewModel.C126031) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L52
            if (r0 != r2) goto L6e
            java.lang.Object r7 = r4.L$1
            java.lang.Object r6 = r4.L$0
            com.facebook.aura.login.nativeflow.NativeLoginSsoAccount r6 = (com.facebook.aura.login.nativeflow.NativeLoginSsoAccount) r6
            X.Hwg.A00(r1)
        L26:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r4 = r1.iterator()
        L2c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.facebook.aura.login.nativeflow.NativeLoginSsoAccount r2 = (com.facebook.aura.login.nativeflow.NativeLoginSsoAccount) r2
            com.facebook.aura.login.nativeflow.HatchSsoSourceApp r1 = r2.sourceApp
            com.facebook.aura.login.nativeflow.HatchSsoSourceApp r0 = r6.sourceApp
            if (r1 != r0) goto L2c
            java.lang.String r1 = r2.userId
            java.lang.String r0 = r6.userId
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L2c
            java.lang.String r0 = r2.accessToken
            boolean r0 = X.C7384Etj.areEqual(r0, r7)
            if (r0 != 0) goto L2c
            return r3
        L52:
            X.Hwg.A00(r1)
            com.facebook.aura.login.nativeflow.NativeLoginAccountResolver r1 = com.facebook.aura.login.nativeflow.NativeLoginAccountResolver.INSTANCE
            android.app.Application r0 = r5.application
            r4.L$0 = r6
            r4.L$1 = r7
            r4.label = r2
            java.lang.Object r1 = r1.fetchSsoAccounts(r0, r4)
            if (r1 != r3) goto L26
            return r3
        L66:
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$freshSsoAccount$1 r4 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$freshSsoAccount$1
            r4.<init>(r8)
            goto L12
        L6c:
            r3 = 0
            return r3
        L6e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.freshSsoAccount(com.facebook.aura.login.nativeflow.NativeLoginSsoAccount, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final boolean googleSignInIsButton() {
        return AuraCredentialManagerConfig.INSTANCE.isGoogleIdTokenEnabled() && !NativeLoginViewModelKt.isGoogleSignInButtonKillswitched();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean handleAccountSelectionChallenge(HatchAuthCredentials hatchAuthCredentials) {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiState;
        ArrayList arrayListA0m;
        NativeLoginAccountUiModel nativeLoginAccountUiModelCopy$default;
        HatchAccountSelectionChallenge hatchAccountSelectionChallenge = hatchAuthCredentials.accountSelectionChallenge;
        int i = 0;
        if (hatchAccountSelectionChallenge == null) {
            return false;
        }
        List<HatchAccountSelectionAccount> list = hatchAccountSelectionChallenge.accounts;
        ArrayList<HxE> arrayListA0h = C3cG.A0h();
        for (HatchAccountSelectionAccount hatchAccountSelectionAccount : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            HatchAccountSelectionAccount hatchAccountSelectionAccount2 = hatchAccountSelectionAccount;
            NativeLoginAccountUiModel accountSelectionUiModel = Companion.toAccountSelectionUiModel(hatchAccountSelectionAccount2, FGI.A0H("account-selection-", i));
            if (accountSelectionUiModel != null && (nativeLoginAccountUiModelCopy$default = NativeLoginAccountUiModel.copy$default(accountSelectionUiModel, null, null, null, null, null, 0, null, false, false, false, false, null, null, null, hatchAccountSelectionChallenge.showMuseTransparency, null, null, 114687, null)) != null) {
                AnonymousClass002.A1J(nativeLoginAccountUiModelCopy$default, hatchAccountSelectionAccount2.ref, arrayListA0h);
            }
            i = i2;
        }
        if (arrayListA0h.size() != hatchAccountSelectionChallenge.accounts.size()) {
            logAccountSelectionOutcomeFailure(C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.SELECTOR_UNPRESENTABLE, HatchCaaStage.SELECT_ACCOUNT.getValue()));
            restartFromPhoneEntry(GENERIC_DIALOG);
            return true;
        }
        this.accountSelectionState = hatchAccountSelectionChallenge.state;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(arrayListA0h));
        for (HxE hxE : arrayListA0h) {
            linkedHashMap.put(((NativeLoginAccountUiModel) hxE.first).id, hxE.second);
        }
        this.accountSelectionRefs = linkedHashMap;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            nativeLoginUiState = value;
            arrayListA0m = AnonymousClass002.A0m(arrayListA0h);
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                arrayListA0m.add(((HxE) it.next()).first);
            }
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(nativeLoginUiState, null, null, null, null, null, AGI.A07(arrayListA0m), hatchAccountSelectionChallenge.museLinkTransparency, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, NativeLoginCheckpointAction.CONTINUE, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -218104033, 67092479, null)));
        emitEffect(NativeLoginViewEffect.NavigateToAccountSelection.INSTANCE);
        return true;
    }

    private final boolean handleCheckpointChallenge(HatchAuthCredentials hatchAuthCredentials, LoginSessionOutcome loginSessionOutcome) {
        HoC hoCDetachCheckpointJobLocked;
        NativeLoginUiState value;
        String str;
        String str2;
        String str3;
        String str4;
        LocalDate localDate;
        HatchCheckpointChallenge hatchCheckpointChallenge = hatchAuthCredentials.checkpointChallenge;
        if (hatchCheckpointChallenge == null) {
            return false;
        }
        String str5 = hatchCheckpointChallenge.resumeToken;
        synchronized (this.checkpointLock) {
            hoCDetachCheckpointJobLocked = detachCheckpointJobLocked();
            this.checkpointResumeToken = str5;
            LoginSessionOutcome loginSessionOutcome2 = null;
            if (AnonymousClass002.A1X(str5)) {
                loginSessionOutcome2 = loginSessionOutcome;
            }
            this.checkpointSessionOutcome = loginSessionOutcome2;
            this.checkpointContinueTapped = false;
        }
        if (hoCDetachCheckpointJobLocked != null) {
            hoCDetachCheckpointJobLocked.A5w(null);
        }
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            str = hatchCheckpointChallenge.url;
            str2 = hatchCheckpointChallenge.accountName;
            str3 = hatchCheckpointChallenge.accountEmail;
            str4 = hatchCheckpointChallenge.accountPhotoUrl;
            localDate = hatchCheckpointChallenge.suspendedOn;
            AnonymousClass005.A0x(str, str2, str3);
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, new HatchCheckpointChallenge(str, str2, str3, str4, localDate, null), null, AnonymousClass002.A1X(str5), NativeLoginCheckpointAction.CONTINUE, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -218103809, 67092479, null)));
        emitEffect(str5 != null ? NativeLoginViewEffect.NavigateToCheckpointWeb.INSTANCE : NativeLoginViewEffect.NavigateToCheckpoint.INSTANCE);
        return true;
    }

    private final boolean handleCheckpointWithoutUrl(HatchAuthCredentials hatchAuthCredentials) {
        if (!hatchAuthCredentials.checkpointWithoutUrl) {
            return false;
        }
        CFK.A06(NativeLoginViewModelKt.TAG, "checkpoint reported without a url");
        showErrorDialog(CHECKPOINT_DIALOG, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean handleConfirmContactPoint(com.facebook.aura.login.nativeflow.HatchAuthCredentials r73) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.handleConfirmContactPoint(com.facebook.aura.login.nativeflow.HatchAuthCredentials):boolean");
    }

    private final boolean handleLinkingDisclosure(HatchAuthCredentials hatchAuthCredentials) {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiState;
        HatchItemizedConsent hatchItemizedConsent;
        if (!"linking_disclosure_required".equals(hatchAuthCredentials.registrationState)) {
            return false;
        }
        NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiStateDrawableLinkingDisclosure = drawableLinkingDisclosure(hatchAuthCredentials);
        if (nativeLoginLinkingDisclosureUiStateDrawableLinkingDisclosure == null) {
            CFK.A04(NativeLoginViewModelKt.TAG, "linking_disclosure_required with nothing this build can draw");
            restartFromPhoneEntry(GENERIC_DIALOG);
            return true;
        }
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            nativeLoginUiState = value;
            hatchItemizedConsent = nativeLoginLinkingDisclosureUiStateDrawableLinkingDisclosure.itemizedConsent;
        } while (!blg.A6e(value, withItemizedConsentAccepted(NativeLoginUiState.copy$default(nativeLoginUiState, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, nativeLoginLinkingDisclosureUiStateDrawableLinkingDisclosure, null, false, false, hatchItemizedConsent != null ? new NativeLoginItemizedConsentTarget.Linking(nativeLoginLinkingDisclosureUiStateDrawableLinkingDisclosure, hatchItemizedConsent) : null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67092462, null), AHI.A01)));
        logLinkingDisclosure(new C126042(HatchCaaRegistrationLogger.INSTANCE));
        emitEffect((this.agreedLinkingDisclosureVersion == null || this.submittedSsoName == null) ? NativeLoginViewEffect.NavigateToLinkingDisclosure.INSTANCE : NativeLoginViewEffect.ReturnToLinkingDisclosure.INSTANCE);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleLoginContinuation(HatchAuthCredentials hatchAuthCredentials, LoginSessionOutcome loginSessionOutcome, HatchCaaLoginEventStep hatchCaaLoginEventStep, LoginMethod loginMethod) {
        List<HatchTwoFactorMethod> list;
        this.loginMethod = loginMethod;
        LoginSessionOutcome loginSessionOutcome2 = this.continuationSessionOutcome;
        if (loginSessionOutcome2 != null) {
            loginSessionOutcome = loginSessionOutcome2;
        } else if (loginSessionOutcome == null) {
            loginSessionOutcome = hatchCaaLoginEventStep != null ? reactivatedOutcome(hatchCaaLoginEventStep) : null;
        }
        if (handleCheckpointChallenge(hatchAuthCredentials, loginSessionOutcome)) {
            this.continuationSessionOutcome = null;
        } else {
            if (handleCheckpointWithoutUrl(hatchAuthCredentials)) {
                this.continuationSessionOutcome = null;
                return true;
            }
            if (!handleReactivationChallenge(hatchAuthCredentials, hatchCaaLoginEventStep) && !handleAccountSelectionChallenge(hatchAuthCredentials)) {
                if (handleTwoFactorChallenge(hatchAuthCredentials)) {
                    HatchTwoFactorChallenge hatchTwoFactorChallenge = hatchAuthCredentials.twoFactorChallenge;
                    if (hatchTwoFactorChallenge != null && (list = hatchTwoFactorChallenge.methods) != null) {
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<HatchTwoFactorMethod> it = list.iterator();
                            while (it.hasNext()) {
                                if (Companion.isSupported(it.next().type)) {
                                    return true;
                                }
                            }
                        }
                        this.continuationSessionOutcome = null;
                        return true;
                    }
                } else if (!handleConfirmContactPoint(hatchAuthCredentials) && !handleNameCompletion(hatchAuthCredentials) && !handleLinkingDisclosure(hatchAuthCredentials)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static /* synthetic */ boolean handleLoginContinuation$default(NativeLoginViewModel nativeLoginViewModel, HatchAuthCredentials hatchAuthCredentials, LoginSessionOutcome loginSessionOutcome, HatchCaaLoginEventStep hatchCaaLoginEventStep, LoginMethod loginMethod, int i, Object obj) {
        if ((i & 2) != 0) {
            loginSessionOutcome = null;
        }
        if ((i & 4) != 0) {
            hatchCaaLoginEventStep = null;
        }
        if ((i & 8) != 0) {
            loginMethod = nativeLoginViewModel.loginMethod;
        }
        return nativeLoginViewModel.handleLoginContinuation(hatchAuthCredentials, loginSessionOutcome, hatchCaaLoginEventStep, loginMethod);
    }

    private final boolean handleNameCompletion(HatchAuthCredentials hatchAuthCredentials) {
        NativeLoginUiState value;
        if (!REGISTRATION_STATE_NAME_COMPLETION.equals(hatchAuthCredentials.registrationState)) {
            return false;
        }
        if (this.pendingSsoNameCompletion == null) {
            CFK.A04(NativeLoginViewModelKt.TAG, "name_completion with no credential to replay");
            restartFromPhoneEntry();
            return true;
        }
        this.pendingCredentials = hatchAuthCredentials;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, withCompletionTos(NativeLoginUiState.copy$default(clearedForNewAttempt(value), null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, "", "", true, false, hatchAuthCredentials.requiresConsent, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67076607, null), hatchAuthCredentials.tos)));
        this.logsNameStep = this.pendingSsoNameCompletionIsJoin;
        if (this.pendingSsoNameCompletionIsJoin) {
            HatchAuthFlowContext.INSTANCE.setRegistrationFlow(HatchCaaEventFlow.NEW_TO_PLATFORM.getValue());
        }
        emitEffect(NativeLoginViewEffect.NavigateToName.INSTANCE);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleNtpUpsellLinkingDisclosure(HatchAuthCredentials hatchAuthCredentials, HatchNtpUpsellOffer hatchNtpUpsellOffer, String str) {
        NativeLoginUiState value;
        if (!"linking_disclosure_required".equals(hatchAuthCredentials.registrationState)) {
            return false;
        }
        NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiStateLinkingDisclosureFor = NativeLoginLinkingDisclosureScreenKt.linkingDisclosureFor(NativeLoginAccountUiModel.copy$default(Companion.toAccountUiModel(hatchNtpUpsellOffer.account, NTP_UPSELL_ACCOUNT_ROW_ID), null, null, null, null, null, 0, null, false, false, false, hatchNtpUpsellOffer.isF3, hatchNtpUpsellOffer.account.sourceApp, null, null, false, hatchAuthCredentials.disclosurePresentation, null, 95231, null), hatchAuthCredentials.disclosurePresentation, hatchAuthCredentials.tos, hatchAuthCredentials.itemizedConsent);
        logLinkedCreateFailure(str, nativeLoginLinkingDisclosureUiStateLinkingDisclosureFor != null ? HatchCaaFailureClassificationKt.NTP_UPSELL_LINKING_DISCLOSURE_REQUIRED_FAILURE : HatchCaaFailureClassificationKt.NTP_UPSELL_LINKING_DISCLOSURE_UNAVAILABLE_FAILURE);
        if (nativeLoginLinkingDisclosureUiStateLinkingDisclosureFor == null) {
            CFK.A04(NativeLoginViewModelKt.TAG, "upsell linking_disclosure_required with nothing this build can draw");
            showErrorDialog(GENERIC_DIALOG, null);
            return true;
        }
        this.linkingDisclosureForNtpUpsell = true;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, nativeLoginLinkingDisclosureUiStateLinkingDisclosureFor, AHI.A01, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67092476, null)));
        logLinkingDisclosure(new C126052(HatchCaaRegistrationLogger.INSTANCE));
        emitEffect(NativeLoginViewEffect.NavigateToLinkingDisclosure.INSTANCE);
        return true;
    }

    private final boolean handleReactivationChallenge(HatchAuthCredentials hatchAuthCredentials, HatchCaaLoginEventStep hatchCaaLoginEventStep) {
        NativeLoginUiState value;
        HatchReactivationChallenge hatchReactivationChallenge = hatchAuthCredentials.reactivationChallenge;
        if (hatchReactivationChallenge == null) {
            return false;
        }
        this.reactivationOriginStep = hatchCaaLoginEventStep;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, hatchReactivationChallenge, false, NativeLoginCheckpointAction.CONTINUE, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -251658241, 67092479, null)));
        emitEffect(NativeLoginViewEffect.NavigateToReactivation.INSTANCE);
        return true;
    }

    private final boolean handleTwoFactorChallenge(HatchAuthCredentials hatchAuthCredentials) {
        NativeLoginUiState value;
        Companion companion;
        NativeLoginUiState value2;
        NativeLoginUiState value3;
        HatchTwoFactorChallenge hatchTwoFactorChallenge = hatchAuthCredentials.twoFactorChallenge;
        if (hatchTwoFactorChallenge == null) {
            return false;
        }
        List<HatchTwoFactorMethod> list = hatchTwoFactorChallenge.methods;
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchTwoFactorMethod hatchTwoFactorMethod : list) {
            if (Companion.isSupported(hatchTwoFactorMethod.type)) {
                arrayListA0h.add(hatchTwoFactorMethod);
            }
        }
        if (arrayListA0h.isEmpty()) {
            this.twoFactorState = null;
            this.twoFactorAttestationRequest = null;
            this.twoFactorMethod = null;
            this.twoFactorTosContentVersion = null;
            this.codeSentForMethodId = null;
            BLG<NativeLoginUiState> blg = this._uiState;
            do {
                value3 = blg.getValue();
            } while (!blg.A6e(value3, NativeLoginUiState.copy$default(value3, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -12582913, 67108863, null)));
            showErrorDialog(VERIFICATION_REQUIRED_DIALOG, null);
            return true;
        }
        if (!C7384Etj.areEqual(hatchTwoFactorChallenge.state, this.twoFactorState)) {
            this.codeSentForMethodId = null;
        }
        this.twoFactorState = hatchTwoFactorChallenge.state;
        this.twoFactorAttestationRequest = hatchAuthCredentials.attestationRequest;
        this.twoFactorTosContentVersion = hatchTwoFactorChallenge.linkingTosContentVersion;
        BLG<NativeLoginUiState> blg2 = this._uiState;
        do {
            value = blg2.getValue();
            companion = Companion;
        } while (!C3cI.A1U(NativeLoginField.TWO_FACTOR_CODE, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, "", AGI.A07(arrayListA0h), hatchTwoFactorChallenge.sourceApp, null, null, null, null, false, NativeLoginCheckpointAction.CONTINUE, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -221773825, 67108863, null), companion, value, blg2));
        HatchTwoFactorMethod hatchTwoFactorMethod2 = (HatchTwoFactorMethod) AbstractC0878AGe.A0K(arrayListA0h);
        if (hatchTwoFactorMethod2 != null) {
            selectTwoFactorMethod(hatchTwoFactorMethod2, hatchTwoFactorChallenge.state, false);
            return true;
        }
        this.twoFactorMethod = null;
        BLG<NativeLoginUiState> blg3 = this._uiState;
        do {
            value2 = blg3.getValue();
        } while (!blg3.A6e(value2, NativeLoginUiState.copy$default(value2, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -12582913, 67092479, null)));
        HatchCaaLoginLogger.INSTANCE.logTwoFactorPageShown(this.submittedContactPoint);
        emitEffect(NativeLoginViewEffect.NavigateToTwoFactorMethod.INSTANCE);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void holdNtpUpsellOffer(HatchAuthCredentials hatchAuthCredentials, String str, boolean z) {
        HatchNtpSourceApp hatchNtpSourceApp;
        HatchNtpUpsellOffer hatchNtpUpsellOffer = hatchAuthCredentials.ntpUpsell;
        if (hatchNtpUpsellOffer != null) {
            this.pendingCredentials = hatchAuthCredentials;
            this.offerContactPoint = str;
            HatchCaaNtpSourcePlatform ntpSourcePlatform = NativeLoginCaaSourceKt.toNtpSourcePlatform(hatchNtpUpsellOffer.account.sourceApp);
            if (ntpSourcePlatform == null) {
                ntpSourcePlatform = null;
                if (!z && (hatchNtpSourceApp = this.ntpSourceApp) != null) {
                    ntpSourcePlatform = NativeLoginCaaSourceKt.toNtpSourcePlatform(hatchNtpSourceApp);
                }
            }
            this.offerNtpSourcePlatform = ntpSourcePlatform;
            this.offerOpensRegFunnel = z;
            this.offerRegFunnelStarted = false;
        }
    }

    private final boolean isCheckpointGenerationCurrent(int i) {
        return AnonymousClass002.A1Q(this.checkpointGeneration, i);
    }

    private final boolean isOnScreen(NativeLoginField nativeLoginField) {
        return nativeLoginField != NativeLoginField.SIGNUP_PASSWORD || C3cG.A0F(this).collectsSignupPassword;
    }

    private final boolean isRegistrationStep(HatchCaaLoginEventStep hatchCaaLoginEventStep) {
        return hatchCaaLoginEventStep == HatchCaaLoginEventStep.OTP && getOtpFunnel().isRegistration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSession(HatchAuthCredentials hatchAuthCredentials) {
        return !C7BY.A0j(hatchAuthCredentials.abraAccessToken) && !hatchAuthCredentials.requiresBirthday && hatchAuthCredentials.twoFactorChallenge == null && hatchAuthCredentials.accountSelectionChallenge == null && hatchAuthCredentials.checkpointChallenge == null && !hatchAuthCredentials.checkpointWithoutUrl;
    }

    private final HatchCaaFailure joinContinuationFailure(HatchAuthCredentials hatchAuthCredentials) {
        String str = hatchAuthCredentials.registrationState;
        if (REGISTRATION_STATE_NAME_COMPLETION.equals(str)) {
            return HatchCaaFailureClassificationKt.NAME_REQUIRED_FAILURE;
        }
        if ("linking_disclosure_required".equals(str)) {
            return drawableLinkingDisclosure(hatchAuthCredentials) != null ? HatchCaaFailureClassificationKt.LINKING_DISCLOSURE_REQUIRED_FAILURE : HatchCaaFailureClassificationKt.LINKING_DISCLOSURE_UNAVAILABLE_FAILURE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void latchGoogleRegistrationSource() {
        HatchAuthFlowContext.INSTANCE.setRegistrationSource(HatchCaaRegistrationSource.SIGN_IN_WITH_GOOGLE.getValue());
    }

    private final void leaveNtpUpsell() {
        HatchCaaRegistrationLogger.INSTANCE.logUpsellBack(this.offerContactPoint);
        clearPasskeyOfferAttribution();
    }

    private final Activity liveHostActivity() {
        Activity activity;
        synchronized (this.offerLock) {
            WeakReference<Activity> weakReference = this.hostActivity;
            activity = weakReference != null ? weakReference.get() : null;
        }
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return null;
        }
        return activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logAccountSelectionOutcome(HatchAuthCredentials hatchAuthCredentials) {
        HatchCaaFailure hatchCaaFailureA06;
        if (hatchAuthCredentials.checkpointChallenge != null || hatchAuthCredentials.checkpointWithoutUrl) {
            hatchCaaFailureA06 = C3cJ.A06(HatchCaaFailure.Companion, HatchCaaStage.SELECT_ACCOUNT);
        } else {
            if (hatchAuthCredentials.reactivationChallenge == null) {
                HatchCaaLoginLogger hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
                String str = this.submittedContactPoint;
                boolean zA1X = AnonymousClass002.A1X(hatchAuthCredentials.twoFactorChallenge);
                String str2 = hatchAuthCredentials.frlAccountId;
                if (C7BY.A0j(str2)) {
                    str2 = null;
                }
                hatchCaaLoginLogger.logAccountSelectionLoginSuccess(str, zA1X, str2);
                return;
            }
            hatchCaaFailureA06 = C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.REACTIVATION_REQUIRED, HatchCaaStage.SELECT_ACCOUNT.getValue());
        }
        logAccountSelectionOutcomeFailure(hatchCaaFailureA06);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logAccountSelectionOutcomeFailure(HatchCaaFailure hatchCaaFailure) {
        HatchCaaLoginLogger.INSTANCE.logSessionLoginFailed(this.submittedContactPoint, HatchCaaLoginEventStep.ACCOUNT_SELECTOR, hatchCaaFailure, null, null);
    }

    private final void logBirthdayStepBack() {
        logClick(HatchScreen.LOGIN_OTP, HatchComponent.BACK_BUTTON, "birthday_back", AGH.A0E());
        if (this.logsNameStep) {
            HatchCaaRegistrationLogger.INSTANCE.logNameBack(this.submittedContactPoint);
        }
        if (C3cG.A0F(this).collectsSignupBirthday) {
            HatchCaaRegistrationLogger.INSTANCE.logBirthdayBack(this.submittedContactPoint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logClick(HatchScreen hatchScreen, HatchComponent hatchComponent, String str, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, hatchScreen, hatchComponent, null, AGH.A02(AnonymousClass007.A0c(HatchMetadataKey.LOGIN_STEP, str), map), null);
    }

    private final void logIfTerminal(HatchAuthError hatchAuthError, NativeLoginStep nativeLoginStep) {
        String str;
        String strA0a;
        if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.AdditionalVerificationRequired.INSTANCE)) {
            str = "unsupported additional verification at ";
        } else if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.ContactPointIsTwoFactorMethod.INSTANCE)) {
            str = "contact point is the account's two-factor number at ";
        } else if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.ContactPointRequiresPasswordLogin.INSTANCE)) {
            str = "contact point needs password login but no continuation at ";
        } else if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.Underage.INSTANCE) || C7384Etj.areEqual(hatchAuthError, HatchAuthError.CreateBlocked.INSTANCE)) {
            str = "account creation refused at ";
        } else if ((hatchAuthError instanceof HatchAuthError.Failed) && ((HatchAuthError.Failed) hatchAuthError).httpCode == 500 && nativeLoginStep == NativeLoginStep.CONFIRM_OTP) {
            strA0a = "confirm_otp 500 - may be an unsupported 2FA or checkpoint account";
            CFK.A06(NativeLoginViewModelKt.TAG, strA0a);
        } else if (Companion.isAccountAlreadyExists(hatchAuthError, nativeLoginStep)) {
            str = "account already exists at ";
        } else if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.AccountCreatedWithoutSession.INSTANCE)) {
            str = "account created but no session issued at ";
        } else if (!C7384Etj.areEqual(hatchAuthError, HatchAuthError.RegistrationRecoveryRequired.INSTANCE)) {
            return;
        } else {
            str = "registration recovery required at ";
        }
        strA0a = AnonymousClass007.A0a(str, nativeLoginStep);
        CFK.A06(NativeLoginViewModelKt.TAG, strA0a);
    }

    private final void logIncompleteCredentials(LoginSessionOutcome loginSessionOutcome) {
        HatchCaaLoginLogger hatchCaaLoginLogger;
        String str;
        HatchCaaLoginEventStep hatchCaaLoginEventStep;
        HatchCaaFailure hatchCaaFailureA0B;
        HatchCaaLoginSource hatchCaaLoginSource;
        HatchCaaLoginCredentialType hatchCaaLoginCredentialType;
        if (loginSessionOutcome instanceof LoginSessionOutcome.Signup) {
            hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
            str = this.submittedContactPoint;
            hatchCaaLoginEventStep = HatchCaaLoginEventStep.TOS;
            hatchCaaLoginSource = null;
            hatchCaaFailureA0B = C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.INCOMPLETE_CREDENTIALS, HatchCaaStage.REGISTER_COMPLETION.getValue());
            hatchCaaLoginCredentialType = null;
        } else {
            if (C7384Etj.areEqual(loginSessionOutcome, LoginSessionOutcome.TwoFactor.INSTANCE)) {
                HatchCaaLoginLogger.INSTANCE.logTwoFactorLoginFailed(this.submittedContactPoint, C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.INCOMPLETE_CREDENTIALS, HatchCaaStage.TWO_FACTOR.getValue()));
                return;
            }
            if (!(loginSessionOutcome instanceof LoginSessionOutcome.Login)) {
                if (loginSessionOutcome != null) {
                    throw C3cG.A0q();
                }
                return;
            }
            hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
            str = this.submittedContactPoint;
            LoginSessionOutcome.Login login = (LoginSessionOutcome.Login) loginSessionOutcome;
            hatchCaaLoginEventStep = login.step;
            hatchCaaFailureA0B = C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.INCOMPLETE_CREDENTIALS, stageOf(hatchCaaLoginEventStep, login.credentialType).getValue());
            hatchCaaLoginSource = login.source;
            hatchCaaLoginCredentialType = login.credentialType;
        }
        hatchCaaLoginLogger.logSessionLoginFailed(str, hatchCaaLoginEventStep, hatchCaaFailureA0B, hatchCaaLoginSource, hatchCaaLoginCredentialType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logJoinOutcome(boolean z, HatchAuthCredentials hatchAuthCredentials, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, HatchCaaFailure hatchCaaFailure) {
        if (z) {
            if (hatchAuthCredentials != null) {
                HatchCaaRegistrationLogger.INSTANCE.logCreateSuccess(this.submittedContactPoint, C9tI.A0s(hatchAuthCredentials.frlAccountId), HatchCaaEventFlow.NEW_TO_PLATFORM, null, hatchCaaNtpSourcePlatform);
                return;
            }
            HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
            String str = this.submittedContactPoint;
            HatchCaaEventFlow hatchCaaEventFlow = HatchCaaEventFlow.NEW_TO_PLATFORM;
            if (hatchCaaFailure == null) {
                hatchCaaFailure = C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.CREDENTIALS_UNAVAILABLE, HatchCaaStage.SSO_EXCHANGE.getValue());
            }
            hatchCaaRegistrationLogger.logCreateFailure(str, hatchCaaEventFlow, null, hatchCaaNtpSourcePlatform, hatchCaaFailure);
        }
    }

    public static /* synthetic */ void logJoinOutcome$default(NativeLoginViewModel nativeLoginViewModel, boolean z, HatchAuthCredentials hatchAuthCredentials, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, HatchCaaFailure hatchCaaFailure, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchCaaFailure = null;
        }
        nativeLoginViewModel.logJoinOutcome(z, hatchAuthCredentials, hatchCaaNtpSourcePlatform, hatchCaaFailure);
    }

    private final void logJoinStart(boolean z, boolean z2, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        if (z) {
            C3cG.A1E(HatchAuthFlowContext.INSTANCE, z2 ? HatchCaaEntryPoint.AYMH : HatchCaaEntryPoint.NTP_LANDING);
            HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
            HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep = HatchCaaRegistrationEventStep.LANDING;
            String str = this.submittedContactPoint;
            HatchCaaEventFlow hatchCaaEventFlow = HatchCaaEventFlow.NEW_TO_PLATFORM;
            hatchCaaRegistrationLogger.logRegistrationStart(hatchCaaRegistrationEventStep, str, null, hatchCaaEventFlow, null, hatchCaaNtpSourcePlatform, null);
            hatchCaaRegistrationLogger.logCreateAttempt(this.submittedContactPoint, hatchCaaEventFlow, null, hatchCaaNtpSourcePlatform);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logLinkedCreateFailure(String str, HatchCaaFailure hatchCaaFailure) {
        HatchCaaRegistrationLogger.INSTANCE.logCreateFailure(str, HatchCaaEventFlow.NEW_TO_PLATFORM, null, this.offerNtpSourcePlatform, hatchCaaFailure);
    }

    private final void logLinkingDisclosure(G0V<? super String, ? super HatchCaaNtpSourcePlatform, Unit> g0v) {
        String str;
        HatchCaaNtpSourcePlatform ntpSourcePlatform;
        HatchSsoSourceApp hatchSsoSourceApp;
        if (this.linkingDisclosureForNtpUpsell) {
            str = this.offerContactPoint;
            ntpSourcePlatform = this.offerNtpSourcePlatform;
        } else {
            str = this.submittedContactPoint;
            NativeLoginSsoAccount nativeLoginSsoAccount = this.pendingSsoNameCompletion;
            ntpSourcePlatform = (nativeLoginSsoAccount == null || (hatchSsoSourceApp = nativeLoginSsoAccount.sourceApp) == null) ? null : NativeLoginCaaSourceKt.toNtpSourcePlatform(hatchSsoSourceApp);
        }
        g0v.invoke(str, ntpSourcePlatform);
    }

    private final void logNtpUpsellUseAnotherAccountClick() {
        logClick(HatchScreen.LOGIN_NTP_UPSELL, HatchComponent.USE_CONTACT_POINT_BUTTON, "ntp_use_another_account", AGH.A0E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logOneTapFailure(Throwable th) {
        HatchCaaFailure hatchCaaFailureA0C;
        HatchCaaFailure.Companion companion;
        String value;
        String str;
        HatchCaaLoginLogger hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
        String str2 = this.submittedContactPoint;
        HatchCaaLoginEventStep hatchCaaLoginEventStep = HatchCaaLoginEventStep.LANDING;
        if (th == null) {
            companion = HatchCaaFailure.Companion;
            value = HatchCaaStage.DBL_LOGIN.getValue();
            str = HatchCaaErrorType.ONE_TAP_UNAVAILABLE;
        } else if (!(th instanceof OneTapTempTokenUnavailableException)) {
            hatchCaaFailureA0C = C3cG.A0C(HatchCaaStage.DBL_LOGIN, th);
            hatchCaaLoginLogger.logSessionLoginFailed(str2, hatchCaaLoginEventStep, hatchCaaFailureA0C, null, HatchCaaLoginCredentialType.NONCE);
        } else {
            companion = HatchCaaFailure.Companion;
            value = HatchCaaStage.DBL_LOGIN.getValue();
            str = HatchCaaErrorType.TEMP_TOKEN_UNAVAILABLE;
        }
        hatchCaaFailureA0C = C3cG.A0B(companion, str, value);
        hatchCaaLoginLogger.logSessionLoginFailed(str2, hatchCaaLoginEventStep, hatchCaaFailureA0C, null, HatchCaaLoginCredentialType.NONCE);
    }

    private final void logOtpOutcome(HatchAuthCredentials hatchAuthCredentials) {
        HatchCaaFailure hatchCaaFailureA06;
        if (hatchAuthCredentials.checkpointChallenge != null || hatchAuthCredentials.checkpointWithoutUrl) {
            hatchCaaFailureA06 = C3cJ.A06(HatchCaaFailure.Companion, HatchCaaStage.CONFIRM_OTP);
        } else {
            if (hatchAuthCredentials.reactivationChallenge == null) {
                if (hatchAuthCredentials.accountSelectionChallenge == null) {
                    String str = hatchAuthCredentials.frlAccountId;
                    if (C7BY.A0j(str)) {
                        str = null;
                    }
                    OtpFunnel otpFunnel = getOtpFunnel();
                    if (!otpFunnel.isRegistration) {
                        HatchCaaLoginLogger.INSTANCE.logOtpLoginSuccess(this.submittedContactPoint, otpFunnel.source, AnonymousClass002.A1X(hatchAuthCredentials.twoFactorChallenge), str);
                        return;
                    }
                    HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
                    String str2 = this.submittedContactPoint;
                    HatchCaaFlowSource hatchCaaFlowSource = otpFunnel.source;
                    HatchNtpSourceApp hatchNtpSourceApp = this.ntpSourceApp;
                    hatchCaaRegistrationLogger.logConfirmationSuccess(str2, hatchCaaFlowSource, str, hatchNtpSourceApp != null ? NativeLoginCaaSourceKt.toNtpSourcePlatform(hatchNtpSourceApp) : null, C3cH.A0I());
                    return;
                }
                return;
            }
            hatchCaaFailureA06 = C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.REACTIVATION_REQUIRED, HatchCaaStage.CONFIRM_OTP.getValue());
        }
        logOtpOutcomeFailure(hatchCaaFailureA06);
    }

    private final void logPasskeyLoginOutcome(HatchAuthCredentials hatchAuthCredentials) {
        HatchPasskeyErrorType hatchPasskeyErrorType;
        if (hatchAuthCredentials.checkpointChallenge != null || hatchAuthCredentials.checkpointWithoutUrl) {
            hatchPasskeyErrorType = HatchPasskeyErrorType.CHECKPOINT_REQUIRED;
        } else if (hatchAuthCredentials.reactivationChallenge != null) {
            hatchPasskeyErrorType = HatchPasskeyErrorType.REACTIVATION_REQUIRED;
        } else if (hatchAuthCredentials.accountSelectionChallenge != null) {
            hatchPasskeyErrorType = HatchPasskeyErrorType.ACCOUNT_SELECTION_REQUIRED;
        } else {
            if (hatchAuthCredentials.twoFactorChallenge == null) {
                HatchPasskeyLogger.INSTANCE.log(HatchPasskeyEvent.LOGIN_SUCCESS, null);
                return;
            }
            hatchPasskeyErrorType = HatchPasskeyErrorType.TWO_FACTOR_REQUIRED;
        }
        HatchPasskeyLogger.INSTANCE.log(HatchPasskeyEvent.LOGIN_DEFERRED, hatchPasskeyErrorType.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logPasswordOutcome(HatchAuthCredentials hatchAuthCredentials) {
        HatchCaaFailure hatchCaaFailureA06;
        if (hatchAuthCredentials.checkpointChallenge != null || hatchAuthCredentials.checkpointWithoutUrl) {
            hatchCaaFailureA06 = C3cJ.A06(HatchCaaFailure.Companion, HatchCaaStage.CONFIRM_PASSWORD);
        } else {
            if (hatchAuthCredentials.reactivationChallenge == null) {
                if (hatchAuthCredentials.accountSelectionChallenge == null) {
                    HatchCaaLoginLogger hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
                    String str = this.submittedContactPoint;
                    boolean zA1X = AnonymousClass002.A1X(hatchAuthCredentials.twoFactorChallenge);
                    String str2 = hatchAuthCredentials.frlAccountId;
                    if (C7BY.A0j(str2)) {
                        str2 = null;
                    }
                    hatchCaaLoginLogger.logPasswordLoginSuccess(str, zA1X, str2);
                    return;
                }
                return;
            }
            hatchCaaFailureA06 = C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.REACTIVATION_REQUIRED, HatchCaaStage.CONFIRM_PASSWORD.getValue());
        }
        logPasswordOutcomeFailure(hatchCaaFailureA06);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logPasswordOutcomeFailure(HatchCaaFailure hatchCaaFailure) {
        HatchCaaLoginLogger.INSTANCE.logPasswordLoginFailed(this.submittedContactPoint, hatchCaaFailure);
    }

    private final void logRememberDeviceDecision() {
        HatchCaaLoginLogger.PasswordSavingAnswer passwordSavingAnswer = this.rememberDeviceAnswer;
        if (passwordSavingAnswer != null) {
            HatchCaaLoginLogger.INSTANCE.logPasswordSavingDecision(this.submittedContactPoint, passwordSavingAnswer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logSsoLoginFailure(boolean z, HatchCaaLoginEventStep hatchCaaLoginEventStep, Throwable th, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType) {
        HatchAuthException hatchAuthException;
        if (z) {
            return;
        }
        HatchAuthError hatchAuthError = null;
        if ((th instanceof HatchAuthException) && (hatchAuthException = (HatchAuthException) th) != null) {
            hatchAuthError = hatchAuthException.error;
        }
        if (C7384Etj.areEqual(hatchAuthError, HatchAuthError.NoLinkedAccount.INSTANCE)) {
            return;
        }
        HatchCaaLoginLogger.INSTANCE.logSessionLoginFailed(this.submittedContactPoint, hatchCaaLoginEventStep, C3cG.A0C(HatchCaaStage.SSO_EXCHANGE, th), hatchCaaLoginSource, hatchCaaLoginCredentialType);
    }

    public static /* synthetic */ void logSsoLoginFailure$default(NativeLoginViewModel nativeLoginViewModel, boolean z, HatchCaaLoginEventStep hatchCaaLoginEventStep, Throwable th, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchCaaLoginSource = null;
        }
        if ((i & 16) != 0) {
            hatchCaaLoginCredentialType = null;
        }
        nativeLoginViewModel.logSsoLoginFailure(z, hatchCaaLoginEventStep, th, hatchCaaLoginSource, hatchCaaLoginCredentialType);
    }

    private final void logZariCreateFailure(HatchCaaFailure hatchCaaFailure, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        HatchCaaRegistrationLogger.INSTANCE.logCreateFailure(this.submittedContactPoint, HatchCaaEventFlow.NEW_TO_PLATFORM, HatchCaaRegistrationSource.ZARI, hatchCaaNtpSourcePlatform, hatchCaaFailure);
    }

    private final void logZariCreateStart(HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
        HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep = HatchCaaRegistrationEventStep.LANDING;
        String str = this.submittedContactPoint;
        HatchCaaEventFlow hatchCaaEventFlow = HatchCaaEventFlow.NEW_TO_PLATFORM;
        HatchCaaRegistrationSource hatchCaaRegistrationSource = HatchCaaRegistrationSource.ZARI;
        hatchCaaRegistrationLogger.logRegistrationStart(hatchCaaRegistrationEventStep, str, null, hatchCaaEventFlow, hatchCaaRegistrationSource, hatchCaaNtpSourcePlatform, null);
        hatchCaaRegistrationLogger.logCreateAttempt(this.submittedContactPoint, hatchCaaEventFlow, hatchCaaRegistrationSource, hatchCaaNtpSourcePlatform);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mintTempToken(boolean r6, X.HtJ<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.login.nativeflow.NativeLoginViewModel.C126081
            if (r0 == 0) goto L46
            r4 = r7
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$mintTempToken$1 r4 = (com.facebook.aura.login.nativeflow.NativeLoginViewModel.C126081) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L4d
            boolean r6 = r4.Z$0
            java.lang.Object r2 = X.AnonymousClass001.A0q(r2)
        L23:
            java.lang.Throwable r1 = X.HsJ.A00(r2)
            if (r1 == 0) goto L30
            if (r6 == 0) goto L30
            com.facebook.aura.login.nativeflow.NativeLoginStep r0 = com.facebook.aura.login.nativeflow.NativeLoginStep.START
            r5.presentFailure(r1, r0)
        L30:
            boolean r0 = r2 instanceof X.C10571Hud
            if (r0 == 0) goto L4c
            r3 = 0
            return r3
        L36:
            X.Hwg.A00(r2)
            com.facebook.aura.login.nativeflow.HatchTempTokenProvider r0 = com.facebook.aura.login.nativeflow.HatchTempTokenProvider.INSTANCE
            r4.Z$0 = r6
            r4.label = r1
            java.lang.Object r2 = r0.m1272getIoAF18A(r4)
            if (r2 != r3) goto L23
            return r3
        L46:
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$mintTempToken$1 r4 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$mintTempToken$1
            r4.<init>(r7)
            goto L12
        L4c:
            return r2
        L4d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.mintTempToken(boolean, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object mintTempToken$default(NativeLoginViewModel nativeLoginViewModel, boolean z, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return nativeLoginViewModel.mintTempToken(z, htJ);
    }

    private final void navigateFromRememberedRowToPhoneEntry() {
        HatchAuthFlowContext hatchAuthFlowContext = HatchAuthFlowContext.INSTANCE;
        C3cG.A1E(hatchAuthFlowContext, HatchCaaEntryPoint.LOGIN_HOME);
        hatchAuthFlowContext.setLoginFlow(null, null);
        emitEffect(NativeLoginViewEffect.NavigateToPhoneEntry.INSTANCE);
    }

    private final void navigateToBirthday(HatchAuthCredentials hatchAuthCredentials, boolean z, boolean z2) {
        NativeLoginUiState value;
        boolean zCollectsBirthday;
        if (enforceAccountCreationAgeGate()) {
            HatchAuthFlowContext.INSTANCE.setRegistrationFlow(HatchCaaEventFlow.NEW_TO_META.getValue());
            this.pendingCredentials = hatchAuthCredentials;
            this.birthdayBackReturnsToOffer = z2;
            BLG<NativeLoginUiState> blg = this._uiState;
            do {
                value = blg.getValue();
                zCollectsBirthday = Companion.collectsBirthday(hatchAuthCredentials);
                String str = HatchDeveloperOverrides.ATOD_TOKEN_KEY;
            } while (!blg.A6e(value, withCompletionTos(NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, "", null, "", false, "", "", hatchAuthCredentials.requiresName, zCollectsBirthday, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 66953247, null), hatchAuthCredentials.tos)));
            this.pendingCompletionInputs = null;
            this.logsNameStep = C3cG.A0F(this).collectsSignupName;
            emitEffect(z ? NativeLoginViewEffect.ReplaceOfferWithBirthday.INSTANCE : NativeLoginViewEffect.NavigateToBirthday.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToNtpUpsell(HatchAuthCredentials hatchAuthCredentials, String str, boolean z) {
        HatchNtpUpsellOffer hatchNtpUpsellOffer;
        NativeLoginUiState value;
        if (!enforceAccountCreationAgeGate() || (hatchNtpUpsellOffer = hatchAuthCredentials.ntpUpsell) == null) {
            return;
        }
        holdNtpUpsellOffer(hatchAuthCredentials, str, z);
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, new NtpUpsellUiState(Companion.toAccountUiModel(hatchNtpUpsellOffer, NTP_UPSELL_ACCOUNT_ROW_ID), hatchNtpUpsellOffer.tos, !hatchNtpUpsellOffer.suppressesTosClause, hatchNtpUpsellOffer.landingPresentation), null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -268435457, 67092479, null)));
        HatchCaaRegistrationLogger.INSTANCE.logUpsellStart(str);
        emitEffect(NativeLoginViewEffect.NavigateToNtpUpsell.INSTANCE);
    }

    private final void navigateToNtpUpsellChoice(HatchAuthCredentials hatchAuthCredentials, List<HatchNtpUpsellChoiceRow> list) {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiState;
        ArrayList arrayListA0i;
        Companion companion;
        NativeLoginAccountUiModel nativeLoginAccountUiModelMetaAccountUiModel;
        if (enforceAccountCreationAgeGate()) {
            this.pendingCredentials = hatchAuthCredentials;
            this.offerContactPoint = this.submittedContactPoint;
            this.ntpUpsellChoiceRows = list;
            this.ntpUpsellChoiceChallengeIndex = null;
            BLG<NativeLoginUiState> blg = this._uiState;
            do {
                value = blg.getValue();
                nativeLoginUiState = value;
                arrayListA0i = AnonymousClass003.A0i(list);
                int i = 0;
                for (HatchNtpUpsellChoiceRow hatchNtpUpsellChoiceRow : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    HatchNtpUpsellChoiceRow hatchNtpUpsellChoiceRow2 = hatchNtpUpsellChoiceRow;
                    String strA0H = FGI.A0H(NTP_UPSELL_CHOICE_ROW_ID_PREFIX, i);
                    HatchTwoFactorSourceApp hatchTwoFactorSourceApp = hatchNtpUpsellChoiceRow2.sourceApp;
                    HatchNtpUpsellOffer hatchNtpUpsellOffer = hatchNtpUpsellChoiceRow2.offer;
                    if ((hatchNtpUpsellOffer == null || (nativeLoginAccountUiModelMetaAccountUiModel = Companion.toAccountUiModel(hatchNtpUpsellOffer, strA0H)) == null) && (nativeLoginAccountUiModelMetaAccountUiModel = (companion = Companion).metaAccountUiModel(hatchNtpUpsellChoiceRow2, strA0H, this.submittedContactPoint)) == null) {
                        nativeLoginAccountUiModelMetaAccountUiModel = companion.twoFactorAccountUiModel(hatchNtpUpsellChoiceRow2, strA0H, this.submittedContactPoint);
                    }
                    arrayListA0i.add(new NtpUpsellChoiceRowUiState(strA0H, hatchTwoFactorSourceApp, nativeLoginAccountUiModelMetaAccountUiModel));
                    i = i2;
                }
            } while (!blg.A6e(value, NativeLoginUiState.copy$default(nativeLoginUiState, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, AGI.A07(arrayListA0i), hatchAuthCredentials.ntpUpsellChoiceTos, hatchAuthCredentials.ntpUpsellChoiceLandingPresentation, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, 536870911, 67092479, null)));
            HatchCaaRegistrationLogger.INSTANCE.logUpsellStart(this.submittedContactPoint);
            emitEffect(NativeLoginViewEffect.NavigateToNtpUpsellChoice.INSTANCE);
        }
    }

    private final void onCheckpointContinueClicked() {
        logClick(HatchScreen.LOGIN_CHECKPOINT, HatchComponent.CHECKPOINT_CONTINUE_BUTTON, "checkpoint_continue", AGH.A0E());
        synchronized (this.checkpointLock) {
            this.checkpointContinueTapped = true;
        }
        HatchCheckpointChallenge hatchCheckpointChallenge = C3cG.A0F(this).checkpoint;
        if (hatchCheckpointChallenge != null) {
            emitEffect(new NativeLoginViewEffect.OpenCheckpointBrowser(hatchCheckpointChallenge.url));
        }
    }

    private final void onCheckpointSignInAgainClicked() {
        logClick(HatchScreen.LOGIN_CHECKPOINT, HatchComponent.CHECKPOINT_SIGN_IN_AGAIN_BUTTON, "checkpoint_sign_in_again", AGH.A0E());
        restartFromPhoneEntry();
    }

    private final void onGoogleSignInRequested(Activity activity, NativeLoginGoogleCredential nativeLoginGoogleCredential) {
        AtomicBoolean atomicBoolean = this.googleSignInRequested;
        if (nativeLoginGoogleCredential != null) {
            atomicBoolean.set(true);
        } else if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126181(nativeLoginGoogleCredential, activity, this, null), AEu.A00(this));
    }

    public static /* synthetic */ void onGoogleSignInRequested$default(NativeLoginViewModel nativeLoginViewModel, Activity activity, NativeLoginGoogleCredential nativeLoginGoogleCredential, int i, Object obj) {
        if ((i & 2) != 0) {
            nativeLoginGoogleCredential = null;
        }
        nativeLoginViewModel.onGoogleSignInRequested(activity, nativeLoginGoogleCredential);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOtpConfirmed(com.facebook.aura.login.nativeflow.HatchAuthCredentials r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.submittedContactPoint
            r3.provenContactPoint = r0
            r3.logOtpOutcome(r4)
            com.facebook.aura.analytics.hatch.caa.HatchCaaLoginEventStep r1 = com.facebook.aura.analytics.hatch.caa.HatchCaaLoginEventStep.OTP
            com.facebook.aura.login.api.LoginMethod r0 = com.facebook.aura.login.api.LoginMethod.OTP
            r2 = 0
            boolean r0 = r3.handleLoginContinuation(r4, r2, r1, r0)
            if (r0 != 0) goto L2e
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$Companion r0 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.Companion
            boolean r1 = r0.collectsBirthday(r4)
            r0 = 0
            if (r1 != 0) goto L2f
            java.lang.String r0 = r3.createdAccountContactPoint
            if (r0 == 0) goto L2a
            java.lang.String r1 = r3.createdAccountContactPoint
            java.lang.String r0 = r3.submittedContactPoint
            boolean r1 = X.C7384Etj.areEqual(r1, r0)
            r0 = 1
            if (r1 != 0) goto L2b
        L2a:
            r0 = 0
        L2b:
            r3.completeLogin(r4, r2, r0)
        L2e:
            return
        L2f:
            r3.offerFromTwoFactor = r0
            r3.routeSignupContinuation(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.onOtpConfirmed(com.facebook.aura.login.nativeflow.HatchAuthCredentials):void");
    }

    private final void onOtpSent(String str, boolean z, HatchAuthFlow hatchAuthFlow, boolean z2, HatchPasswordCopy hatchPasswordCopy, String str2, boolean z3, HatchSavedAccount hatchSavedAccount) {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiState;
        NativeLoginUiState value2;
        Companion companion;
        this.authState = str;
        this.savedAccountCodeCard = hatchSavedAccount;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            nativeLoginUiState = value;
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(clearedForNewAttempt(nativeLoginUiState), null, null, null, null, null, null, false, null, null, str2, z3, null, z, hatchAuthFlow, z2, this.rememberedAccounts.rememberDeviceValueOnScreen(nativeLoginUiState.rememberDeviceValue), null, false, hatchPasswordCopy, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -325121, 67092479, null)));
        emitEffect(NativeLoginViewEffect.NavigateToOtp.INSTANCE);
        String str3 = this.pendingSmsCode;
        if (str3 != null) {
            this.pendingSmsCode = null;
            BLG<NativeLoginUiState> blg2 = this._uiState;
            do {
                value2 = blg2.getValue();
                companion = Companion;
            } while (!C3cI.A1U(NativeLoginField.OTP, NativeLoginUiState.copy$default(value2, null, null, null, null, null, null, false, null, null, null, false, str3, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -2049, 67108863, null), companion, value2, blg2));
            onOtpConfirmClicked();
        }
    }

    public static /* synthetic */ void onOtpSent$default(NativeLoginViewModel nativeLoginViewModel, String str, boolean z, HatchAuthFlow hatchAuthFlow, boolean z2, HatchPasswordCopy hatchPasswordCopy, String str2, boolean z3, HatchSavedAccount hatchSavedAccount, int i, Object obj) {
        if ((i & 128) != 0) {
            hatchSavedAccount = null;
        }
        nativeLoginViewModel.onOtpSent(str, z, hatchAuthFlow, z2, hatchPasswordCopy, str2, z3, hatchSavedAccount);
    }

    private final void onPasswordFallback(String str, String str2, boolean z, boolean z2, HatchPasswordCopy hatchPasswordCopy) {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiState;
        HatchCaaLoginLogger.INSTANCE.logLoginStart(this.submittedContactPoint, null);
        this.authState = str;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            nativeLoginUiState = value;
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(clearedForNewAttempt(nativeLoginUiState), null, null, null, null, null, null, false, null, null, str2, z, null, true, null, false, this.rememberedAccounts.rememberDeviceValueOnScreen(nativeLoginUiState.rememberDeviceValue), null, z2, hatchPasswordCopy, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -431617, 67092479, null)));
        emitEffect(NativeLoginViewEffect.NavigateToPassword.INSTANCE);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126262(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openGoogleLoginFunnel() {
        HatchCaaLoginLogger hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
        String str = this.submittedContactPoint;
        HatchCaaLoginEventStep hatchCaaLoginEventStep = HatchCaaLoginEventStep.CONTACTPOINT;
        HatchCaaLoginSource hatchCaaLoginSource = HatchCaaLoginSource.SIGN_IN_WITH_GOOGLE_LOGIN;
        HatchCaaLoginCredentialType hatchCaaLoginCredentialType = HatchCaaLoginCredentialType.OPENID_CONNECT;
        hatchCaaLoginLogger.logCredentialLoginStart(str, hatchCaaLoginEventStep, hatchCaaLoginSource, hatchCaaLoginCredentialType);
        hatchCaaLoginLogger.logLoginAttempt(this.submittedContactPoint, hatchCaaLoginEventStep, hatchCaaLoginCredentialType, hatchCaaLoginSource);
    }

    private final boolean passkeyOfferIsCurrent(int i) {
        boolean zA1Q;
        synchronized (this.offerLock) {
            zA1Q = AnonymousClass002.A1Q(i, this.passkeyOfferEpoch);
        }
        return zA1Q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentCheckpointLocalFailure(int i) {
        NativeLoginUiState value;
        if (releaseCheckpointJob(i)) {
            clearCheckpointContinuation();
            BLG<NativeLoginUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -83886081, 67092479, null)));
            showErrorDialog(GENERIC_DIALOG, null);
        }
    }

    private final void presentCheckpointSsoFailure(int i, Throwable th) {
        NativeLoginUiState value;
        if (releaseCheckpointJob(i)) {
            BLG<NativeLoginUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -67108865, 67092479, null)));
            presentFailure(th, NativeLoginStep.SSO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r9 == com.facebook.aura.login.nativeflow.NativeLoginStep.CONFIRM_PASSKEY) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void presentFailure(java.lang.Throwable r8, com.facebook.aura.login.nativeflow.NativeLoginStep r9) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.presentFailure(java.lang.Throwable, com.facebook.aura.login.nativeflow.NativeLoginStep):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void presentMetaTwoFactorFailure(java.lang.Throwable r9) {
        /*
            r8 = this;
            boolean r1 = r9 instanceof com.facebook.aura.network.hatchauth.HatchAuthException
            r0 = 0
            if (r1 == 0) goto La6
            r3 = r9
            com.facebook.aura.network.hatchauth.HatchAuthException r3 = (com.facebook.aura.network.hatchauth.HatchAuthException) r3
            if (r3 == 0) goto La7
            com.facebook.aura.network.hatchauth.HatchAuthError r2 = r3.error
        Lc:
            com.facebook.aura.network.hatchauth.HatchAuthError$RegistrationRecoveryRequired r1 = com.facebook.aura.network.hatchauth.HatchAuthError.RegistrationRecoveryRequired.INSTANCE
            boolean r1 = X.C7384Etj.areEqual(r2, r1)
            if (r1 == 0) goto L4a
            java.lang.String r2 = r8.submittedContactPoint
            com.facebook.aura.login.nativeflow.HatchCaaStage r1 = com.facebook.aura.login.nativeflow.HatchCaaStage.TWO_FACTOR
            com.facebook.aura.analytics.hatch.caa.HatchCaaFailure r1 = X.C3cG.A0C(r1, r9)
            r8.logLinkedCreateFailure(r2, r1)
            java.lang.String r2 = r8.submittedContactPoint
            r8.clearForRestart()
            com.facebook.aura.login.nativeflow.NativeLoginViewEffect$PopToPhoneEntry r1 = com.facebook.aura.login.nativeflow.NativeLoginViewEffect.PopToPhoneEntry.INSTANCE
            r8.emitEffect(r1)
            r8.registrationRecoveryContactPoint = r2
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$Companion r4 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.Companion
            com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent r2 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.GENERIC_DIALOG
            com.facebook.aura.json.HatchProblemJson r1 = r3.problem
            com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent r1 = r4.withServerCopy(r2, r1)
            com.facebook.aura.login.nativeflow.NativeLoginErrorDismissal r7 = com.facebook.aura.login.nativeflow.NativeLoginErrorDismissal.BACK_TO_LOGIN
            int r2 = r1.titleRes
            int r3 = r1.messageRes
            java.lang.String r4 = r1.serverTitle
            java.lang.String r5 = r1.serverMessage
            com.facebook.aura.login.nativeflow.NativeLoginErrorDialogAction r6 = r1.action
            com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent r1 = new com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.showErrorDialog(r1, r0)
        L49:
            return
        L4a:
            if (r3 == 0) goto La4
            com.facebook.aura.network.hatchauth.HatchAuthError r1 = r3.error
        L4e:
            boolean r4 = r8.declinesAfterMetaTwoFactor(r1)
            if (r4 != 0) goto L60
            if (r3 == 0) goto La2
            com.facebook.aura.network.hatchauth.HatchAuthError r2 = r3.error
        L58:
            com.facebook.aura.network.hatchauth.HatchAuthError$UnderageRegistration r1 = com.facebook.aura.network.hatchauth.HatchAuthError.UnderageRegistration.INSTANCE
            boolean r1 = X.C7384Etj.areEqual(r2, r1)
            if (r1 == 0) goto L6b
        L60:
            java.lang.String r2 = r8.submittedContactPoint
            com.facebook.aura.login.nativeflow.HatchCaaStage r1 = com.facebook.aura.login.nativeflow.HatchCaaStage.TWO_FACTOR
            com.facebook.aura.analytics.hatch.caa.HatchCaaFailure r1 = X.C3cG.A0C(r1, r9)
            r8.logLinkedCreateFailure(r2, r1)
        L6b:
            java.lang.String r1 = r8.submittedContactPoint
            boolean r1 = r8.recoverFromLinkedCreateConflict(r9, r1)
            if (r1 != 0) goto L49
            if (r3 == 0) goto La0
            com.facebook.aura.network.hatchauth.HatchAuthError r2 = r3.error
        L77:
            com.facebook.aura.network.hatchauth.HatchAuthError$PhoneAlreadyInUse r1 = com.facebook.aura.network.hatchauth.HatchAuthError.PhoneAlreadyInUse.INSTANCE
            boolean r1 = X.C7384Etj.areEqual(r2, r1)
            if (r1 != 0) goto Laa
            if (r3 == 0) goto L9e
            com.facebook.aura.network.hatchauth.HatchAuthError r2 = r3.error
        L83:
            com.facebook.aura.network.hatchauth.HatchAuthError$EmailAlreadyInUse r1 = com.facebook.aura.network.hatchauth.HatchAuthError.EmailAlreadyInUse.INSTANCE
            boolean r1 = X.C7384Etj.areEqual(r2, r1)
            if (r1 != 0) goto Laa
            if (r4 == 0) goto Laa
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$Companion r2 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.Companion
            com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent r1 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.LINK_FAILED_DIALOG
            if (r3 == 0) goto L95
            com.facebook.aura.json.HatchProblemJson r0 = r3.problem
        L95:
            com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent r1 = r2.withServerCopy(r1, r0)
            r0 = 1
            r8.showLinkFailed(r1, r0)
            return
        L9e:
            r2 = r0
            goto L83
        La0:
            r2 = r0
            goto L77
        La2:
            r2 = r0
            goto L58
        La4:
            r1 = r0
            goto L4e
        La6:
            r3 = r0
        La7:
            r2 = r0
            goto Lc
        Laa:
            com.facebook.aura.login.nativeflow.NativeLoginStep r0 = com.facebook.aura.login.nativeflow.NativeLoginStep.TWO_FACTOR_CONFIRM
            r8.presentFailure(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.presentMetaTwoFactorFailure(java.lang.Throwable):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b A[PHI: r5
  0x011b: PHI (r5v9 com.facebook.aura.login.nativeflow.HatchTosDisclosure) = 
  (r5v6 com.facebook.aura.login.nativeflow.HatchTosDisclosure)
  (r5v10 com.facebook.aura.login.nativeflow.HatchTosDisclosure)
 binds: [B:43:0x0119, B:41:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f A[PHI: r5
  0x011f: PHI (r5v8 com.facebook.aura.login.nativeflow.HatchTosDisclosure) = 
  (r5v6 com.facebook.aura.login.nativeflow.HatchTosDisclosure)
  (r5v9 com.facebook.aura.login.nativeflow.HatchTosDisclosure)
 binds: [B:43:0x0119, B:45:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r73v0, types: [com.facebook.aura.login.nativeflow.NativeLoginViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void publishPicker(com.facebook.aura.login.nativeflow.NativeLoginPickerRows<com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel> r74, com.facebook.aura.login.nativeflow.NativeLoginSiblingDisclosure r75) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.publishPicker(com.facebook.aura.login.nativeflow.NativeLoginPickerRows, com.facebook.aura.login.nativeflow.NativeLoginSiblingDisclosure):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoginSessionOutcome reactivatedOutcome(HatchCaaLoginEventStep hatchCaaLoginEventStep) {
        return hatchCaaLoginEventStep == HatchCaaLoginEventStep.TWO_FAC_REDIRECT ? LoginSessionOutcome.TwoFactor.INSTANCE : new LoginSessionOutcome.Login(hatchCaaLoginEventStep, null, null);
    }

    private final HatchCaaLoginEventStep reactivationStep(LoginSessionOutcome loginSessionOutcome) {
        if (loginSessionOutcome instanceof LoginSessionOutcome.Login) {
            return ((LoginSessionOutcome.Login) loginSessionOutcome).step;
        }
        if (C7384Etj.areEqual(loginSessionOutcome, LoginSessionOutcome.TwoFactor.INSTANCE)) {
            return HatchCaaLoginEventStep.TWO_FAC_REDIRECT;
        }
        if (loginSessionOutcome instanceof LoginSessionOutcome.Signup) {
            return null;
        }
        throw C3cG.A0q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C27k<Map<String, HatchMuseProfile>> readRememberedMuseProfiles(List<AuraRememberedAccount> list, int i) {
        C10550Hrx c10550HrxA01;
        synchronized (this.landingReadLock) {
            c10550HrxA01 = null;
            if (i == this.landingReadGeneration) {
                BLL bllA00 = AEu.A00(this);
                c10550HrxA01 = GAo.A01(C79.A00, AnonymousClass001.A0y(), new NativeLoginViewModel$readRememberedMuseProfiles$1$1(list, this, i, null), bllA00);
                this.landingMuseProfiles = c10550HrxA01;
            }
        }
        return c10550HrxA01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* renamed from: recentLandingSavedAccounts-YNEx5aM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1317recentLandingSavedAccountsYNEx5aM(java.lang.String r7, X.HtJ<? super X.HsJ<? extends java.util.List<com.facebook.aura.login.nativeflow.HatchSavedAccount>>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.login.nativeflow.NativeLoginViewModel$recentLandingSavedAccounts$1
            if (r0 == 0) goto L1f
            r5 = r8
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$recentLandingSavedAccounts$1 r5 = (com.facebook.aura.login.nativeflow.NativeLoginViewModel$recentLandingSavedAccounts$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L2a
            if (r1 != r3) goto L25
            goto L4e
        L1f:
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$recentLandingSavedAccounts$1 r5 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$recentLandingSavedAccounts$1
            r5.<init>(r6, r8)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r0)
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$SavedAccountsRead r1 = r6.landingSavedAccounts
            if (r1 == 0) goto L63
            java.lang.String r0 = r1.idForAymh
            boolean r0 = X.C7384Etj.areEqual(r0, r7)
            if (r0 == 0) goto L63
            boolean r0 = r1.isStale()
            if (r0 != 0) goto L63
            X.27k<X.HsJ<java.util.List<com.facebook.aura.login.nativeflow.HatchSavedAccount>>> r0 = r1.result     // Catch: java.util.concurrent.CancellationException -> L60
            r5.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L60
            r5.L$1 = r2     // Catch: java.util.concurrent.CancellationException -> L60
            r5.label = r3     // Catch: java.util.concurrent.CancellationException -> L60
            java.lang.Object r0 = X.C3cG.A0W(r0, r5)     // Catch: java.util.concurrent.CancellationException -> L60
            if (r0 != r4) goto L51
            return r4
        L4e:
            X.Hwg.A00(r0)     // Catch: java.util.concurrent.CancellationException -> L60
        L51:
            r4 = r0
            X.HsJ r4 = (X.HsJ) r4     // Catch: java.util.concurrent.CancellationException -> L60
            if (r4 == 0) goto L5f
            java.lang.Object r0 = r4.value     // Catch: java.util.concurrent.CancellationException -> L60
            boolean r0 = r0 instanceof X.C10571Hud     // Catch: java.util.concurrent.CancellationException -> L60
            r0 = r0 ^ 1
            if (r0 == 0) goto L5f
            return r4
        L5f:
            return r2
        L60:
            X.C3cG.A1H(r5)
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.m1317recentLandingSavedAccountsYNEx5aM(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordContinuationOutcome(HatchAuthCredentials hatchAuthCredentials, HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType) {
        HatchCaaLoginLogger hatchCaaLoginLogger;
        String str;
        HatchCaaFailure hatchCaaFailureA06;
        HatchCaaFailure.Companion companion;
        String value;
        String str2;
        if (hatchAuthCredentials.checkpointChallenge != null || hatchAuthCredentials.checkpointWithoutUrl) {
            hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
            str = this.submittedContactPoint;
            hatchCaaFailureA06 = C3cJ.A06(HatchCaaFailure.Companion, stageOf(hatchCaaLoginEventStep, hatchCaaLoginCredentialType));
        } else {
            if (hatchAuthCredentials.reactivationChallenge != null) {
                hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
                str = this.submittedContactPoint;
                companion = HatchCaaFailure.Companion;
                value = stageOf(hatchCaaLoginEventStep, hatchCaaLoginCredentialType).getValue();
                str2 = HatchCaaErrorType.REACTIVATION_REQUIRED;
            } else {
                if (!"linking_disclosure_required".equals(hatchAuthCredentials.registrationState)) {
                    if (hatchAuthCredentials.accountSelectionChallenge != null || hatchAuthCredentials.twoFactorChallenge == null) {
                        return;
                    }
                    HatchCaaLoginLogger hatchCaaLoginLogger2 = HatchCaaLoginLogger.INSTANCE;
                    String str3 = this.submittedContactPoint;
                    String str4 = hatchAuthCredentials.frlAccountId;
                    if (C7BY.A0j(str4)) {
                        str4 = null;
                    }
                    hatchCaaLoginLogger2.logSessionLoginSuccess(str3, str4, hatchCaaLoginEventStep, hatchCaaLoginSource, hatchCaaLoginCredentialType, true);
                    return;
                }
                hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
                str = this.submittedContactPoint;
                companion = HatchCaaFailure.Companion;
                value = stageOf(hatchCaaLoginEventStep, hatchCaaLoginCredentialType).getValue();
                str2 = HatchCaaErrorType.MALFORMED_RESPONSE;
            }
            hatchCaaFailureA06 = C3cG.A0B(companion, str2, value);
        }
        hatchCaaLoginLogger.logSessionLoginFailed(str, hatchCaaLoginEventStep, hatchCaaFailureA06, hatchCaaLoginSource, hatchCaaLoginCredentialType);
    }

    public static /* synthetic */ void recordContinuationOutcome$default(NativeLoginViewModel nativeLoginViewModel, HatchAuthCredentials hatchAuthCredentials, HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCaaLoginSource = null;
        }
        if ((i & 8) != 0) {
            hatchCaaLoginCredentialType = null;
        }
        nativeLoginViewModel.recordContinuationOutcome(hatchAuthCredentials, hatchCaaLoginEventStep, hatchCaaLoginSource, hatchCaaLoginCredentialType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recoverIfPasswordRequired(Throwable th) {
        NativeLoginUiState value;
        HatchAuthException hatchAuthException;
        NativeLoginUiState nativeLoginUiStateA0F = C3cG.A0F(this);
        if (nativeLoginUiStateA0F.collectsSignupPassword || nativeLoginUiStateA0F.collectsSignupName) {
            return false;
        }
        if (!C7384Etj.areEqual((!(th instanceof HatchAuthException) || (hatchAuthException = (HatchAuthException) th) == null) ? null : hatchAuthException.error, HatchAuthError.InvalidRequest.INSTANCE)) {
            return false;
        }
        CFK.A06(NativeLoginViewModelKt.TAG, "register_completion requires a password; showing the field");
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, true, null, null, false, false, false, false, false, PASSWORD_REQUIRED_DIALOG, null, null, null, null, null, null, null, null, false, -1, 66895615, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126332(null), AEu.A00(this));
        return true;
    }

    private final void rejectDuringRegistrationRecovery() {
        String str = this.registrationRecoveryContactPoint;
        restartFromPhoneEntry(GENERIC_DIALOG);
        this.registrationRecoveryContactPoint = str;
        this.declinedNtpUpsell = true;
    }

    private final boolean releaseCheckpointJob(int i) {
        boolean z;
        synchronized (this.checkpointLock) {
            if (this.checkpointGeneration != i) {
                z = false;
            } else {
                this.checkpointJob = null;
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AuraRememberedAccount> rememberedAccountsForPicker() {
        try {
            return this.rememberedAccounts.accountsForPicker();
        } catch (RuntimeException e) {
            CFK.A0A(NativeLoginViewModelKt.TAG, "Remembered accounts could not be read", e);
            return C0881AGi.A00;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object removeCrossAppAccount(NativeLoginSsoAccount nativeLoginSsoAccount, G0U<? super Throwable, Unit> g0u, HtJ<? super Boolean> htJ) {
        return this.oneTap.removeCrossAppAccount(nativeLoginSsoAccount, new C126342(nativeLoginSsoAccount, g0u, null), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeRememberedAccount(AuraRememberedAccount auraRememberedAccount) {
        return this.oneTap.removeAccount(auraRememberedAccount.abraUserId, new C126351());
    }

    private final void replaceAnsweredNtpUpsellChoiceRow(HatchNtpUpsellOffer hatchNtpUpsellOffer) {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiState;
        AHD ahdA07;
        Integer num = this.ntpUpsellChoiceChallengeIndex;
        if (num != null) {
            int iIntValue = num.intValue();
            this.ntpUpsellChoiceChallengeIndex = null;
            List<HatchNtpUpsellChoiceRow> list = this.ntpUpsellChoiceRows;
            ArrayList arrayListA0m = AnonymousClass002.A0m(list);
            Iterator<HatchNtpUpsellChoiceRow> it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    this.ntpUpsellChoiceRows = arrayListA0m;
                    BLG<NativeLoginUiState> blg = this._uiState;
                    do {
                        value = blg.getValue();
                        nativeLoginUiState = value;
                        AHD<NtpUpsellChoiceRowUiState> ahd = nativeLoginUiState.ntpUpsellChoice;
                        if (ahd != null) {
                            ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd);
                            int i2 = 0;
                            for (Object obj : ahd) {
                                int i3 = i2 + 1;
                                if (i2 >= 0) {
                                    NtpUpsellChoiceRowUiState ntpUpsellChoiceRowUiStateCopy = (NtpUpsellChoiceRowUiState) obj;
                                    if (i2 == iIntValue) {
                                        ntpUpsellChoiceRowUiStateCopy = ntpUpsellChoiceRowUiStateCopy.copy(ntpUpsellChoiceRowUiStateCopy.id, ntpUpsellChoiceRowUiStateCopy.sourceApp, Companion.toAccountUiModel(hatchNtpUpsellOffer, ntpUpsellChoiceRowUiStateCopy.id));
                                    }
                                    arrayListA0m2.add(ntpUpsellChoiceRowUiStateCopy);
                                    i2 = i3;
                                }
                            }
                            ahdA07 = AGI.A07(arrayListA0m2);
                        } else {
                            ahdA07 = null;
                        }
                    } while (!blg.A6e(value, NativeLoginUiState.copy$default(nativeLoginUiState, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, ahdA07, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -536870913, 67108863, null)));
                    return;
                }
                HatchNtpUpsellChoiceRow next = it.next();
                int i4 = i + 1;
                if (i < 0) {
                    break;
                }
                HatchNtpUpsellChoiceRow hatchNtpUpsellChoiceRowCopy = next;
                if (i == iIntValue) {
                    hatchNtpUpsellChoiceRowCopy = hatchNtpUpsellChoiceRowCopy.copy(hatchNtpUpsellChoiceRowCopy.sourceApp, hatchNtpUpsellOffer, null, hatchNtpUpsellChoiceRowCopy.profilePictureUrl, hatchNtpUpsellChoiceRowCopy.metaAccount);
                }
                arrayListA0m.add(hatchNtpUpsellChoiceRowCopy);
                i = i4;
            }
            AbstractC0885AGm.A14();
            throw F60.createAndThrow();
        }
    }

    private final void replayAgreedLinkingDisclosure(NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState, NativeLoginSsoAccount nativeLoginSsoAccount) {
        this.agreedLinkingDisclosureVersion = nativeLoginLinkingDisclosureUiState.contentVersion;
        HatchCaaRegistrationLogger.INSTANCE.logCreateAttempt(this.submittedContactPoint, HatchCaaEventFlow.NEW_TO_PLATFORM, null, NativeLoginCaaSourceKt.toNtpSourcePlatform(nativeLoginSsoAccount.sourceApp));
        exchangeSsoSelection(nativeLoginLinkingDisclosureUiState.account, nativeLoginSsoAccount, nativeLoginLinkingDisclosureUiState.contentVersion, this.submittedSsoName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* renamed from: requestCrossAppRemoval-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1318requestCrossAppRemovalBWLJW6A(com.facebook.aura.login.nativeflow.HatchSsoSourceApp r6, java.lang.String r7, java.lang.String r8, X.HtJ<? super X.HsJ<java.lang.String>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.NativeLoginViewModel$requestCrossAppRemoval$1
            if (r0 == 0) goto L43
            r4 = r9
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$requestCrossAppRemoval$1 r4 = (com.facebook.aura.login.nativeflow.NativeLoginViewModel$requestCrossAppRemoval$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L4e
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            r5.dropLandingSavedAccounts()
            if (r1 == 0) goto L49
            java.lang.Object r3 = r1.value
            return r3
        L2a:
            X.Hwg.A00(r1)
            r0 = 0
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$requestCrossAppRemoval$removal$1 r1 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$requestCrossAppRemoval$removal$1
            r1.<init>(r6, r7, r8, r0)
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.label = r2
            r0 = 0
            java.lang.Object r1 = r5.m1324withTempTokenRgG5Fkc(r0, r1, r4)
            if (r1 != r3) goto L20
            return r3
        L43:
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$requestCrossAppRemoval$1 r4 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$requestCrossAppRemoval$1
            r4.<init>(r5, r9)
            goto L12
        L49:
            java.lang.Object r3 = r5.m1322tempTokenUnavailabled1pmJ48()
            return r3
        L4e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.m1318requestCrossAppRemovalBWLJW6A(com.facebook.aura.login.nativeflow.HatchSsoSourceApp, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestOtp(com.facebook.aura.login.nativeflow.NativeLoginIdentifier r12, java.lang.String r13, java.lang.String r14, boolean r15, boolean r16, com.facebook.aura.analytics.hatch.caa.HatchCaaEventFlow r17, com.facebook.aura.analytics.hatch.caa.HatchCaaEntryPoint r18, X.HtJ<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.requestOtp(com.facebook.aura.login.nativeflow.NativeLoginIdentifier, java.lang.String, java.lang.String, boolean, boolean, com.facebook.aura.analytics.hatch.caa.HatchCaaEventFlow, com.facebook.aura.analytics.hatch.caa.HatchCaaEntryPoint, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object requestOtp$default(NativeLoginViewModel nativeLoginViewModel, NativeLoginIdentifier nativeLoginIdentifier, String str, String str2, boolean z, boolean z2, HatchCaaEventFlow hatchCaaEventFlow, HatchCaaEntryPoint hatchCaaEntryPoint, HtJ htJ, int i, Object obj) {
        if ((i & 32) != 0) {
            hatchCaaEventFlow = null;
        }
        return nativeLoginViewModel.requestOtp(nativeLoginIdentifier, str, str2, z, z2, hatchCaaEventFlow, hatchCaaEntryPoint, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetForNewLogin() {
        NativeLoginCaaStartupTracker nativeLoginCaaStartupTracker = this.caaStartupTracker;
        if (nativeLoginCaaStartupTracker != null) {
            nativeLoginCaaStartupTracker.abandon();
        }
        cancelPendingAttempts();
        clearTransientAuthState();
        HatchTempTokenProvider.INSTANCE.cleanup();
        NativeLoginPrefetch.INSTANCE.cleanup();
        HatchAuthFlowContext.INSTANCE.endFlow();
        this.submittedContactPoint = null;
        this.googleSignInRequested.set(false);
        this.contactPointTouched = false;
        this.heroLogoAnimationClaimed = false;
        this._initialDestination.Af8(null);
        BLG<NativeLoginUiState> blg = this._uiState;
        boolean z = blg.getValue().mayHaveGoogleAccount;
        AHI ahi = AHI.A01;
        NativeLoginCheckpointAction nativeLoginCheckpointAction = NativeLoginCheckpointAction.CONTINUE;
        HatchLandingPresentation hatchLandingPresentation = HatchLandingPresentation.STANDARD;
        AnonymousClass001.A1E(blg, null, new NativeLoginUiState(ahi, ahi, ahi, "", null, ahi, false, null, "", "", false, "", false, null, false, null, "", false, null, "", ahi, null, null, null, null, null, false, nativeLoginCheckpointAction, null, null, null, hatchLandingPresentation, null, ahi, false, false, null, "", null, "", true, "", "", false, true, true, false, false, null, null, null, NativeLoginResolveState.RESOLVING, CountryDialCodesKt.DEFAULT_COUNTRY_DIAL_CODE, null, hatchLandingPresentation, null, null, z));
        startLoginFlow();
    }

    private final void resetPasskeyOffer() {
        synchronized (this.offerLock) {
            this.passkeyOfferEpoch++;
            this.passkeyHoldsLoading = false;
            this.passkeyOfferStarted = false;
            this.passkeyAttemptSettled = false;
            this.passkeyHeldScreen = false;
        }
    }

    private final void resetRememberDeviceValue() {
        NativeLoginUiState value;
        this.oneTap.redeemedAbraUserId = null;
        this.provenContactPoint = null;
        this.rememberDeviceAnswer = null;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -32769, 67108863, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resolvesToLogin(HatchAuthCredentials hatchAuthCredentials) {
        if (hatchAuthCredentials.checkpointChallenge != null || hatchAuthCredentials.checkpointWithoutUrl || hatchAuthCredentials.accountSelectionChallenge != null || hatchAuthCredentials.twoFactorChallenge != null) {
            return true;
        }
        String str = hatchAuthCredentials.registrationState;
        if (REGISTRATION_STATE_CONFIRM_CONTACT_POINT.equals(str) || REGISTRATION_STATE_NAME_COMPLETION.equals(str) || hatchAuthCredentials.ntpUpsell != null || hatchAuthCredentials.ntpUpsellPendingContactPoint != null) {
            return false;
        }
        return (!REGISTRATION_STATE_PENDING_CONTACT_POINT.equals(str) || C7BY.A0j(hatchAuthCredentials.confirmContactPoint)) && !hatchAuthCredentials.requiresBirthday;
    }

    private final void restoreBirthdayInputs(PendingCompletionInputs pendingCompletionInputs) {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiState;
        String str;
        String str2;
        String str3;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            nativeLoginUiState = value;
            str = pendingCompletionInputs.firstName;
            if (str == null) {
                str = nativeLoginUiState.signupFirstName;
            }
            str2 = pendingCompletionInputs.lastName;
            if (str2 == null) {
                str2 = nativeLoginUiState.signupLastName;
            }
            str3 = pendingCompletionInputs.password;
            if (str3 == null) {
                str3 = nativeLoginUiState.signupPassword;
            }
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(nativeLoginUiState, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, str3, false, str, str2, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67107199, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* renamed from: retrySsoWithFreshToken-P62Ms4M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1319retrySsoWithFreshTokenP62Ms4M(com.facebook.aura.login.nativeflow.NativeLoginSsoAccount r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, X.HtJ<? super X.HsJ<com.facebook.aura.login.nativeflow.HatchAuthCredentials>> r19) {
        /*
            r12 = this;
            r3 = r19
            r10 = r18
            r9 = r17
            r8 = r16
            r7 = r15
            boolean r0 = r3 instanceof com.facebook.aura.login.nativeflow.NativeLoginViewModel$retrySsoWithFreshToken$1
            if (r0 == 0) goto L7d
            r4 = r3
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$retrySsoWithFreshToken$1 r4 = (com.facebook.aura.login.nativeflow.NativeLoginViewModel$retrySsoWithFreshToken$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r4.label = r2
        L1b:
            java.lang.Object r6 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L46
            if (r0 != r2) goto L83
            X.Hwg.A00(r6)
        L2c:
            return r6
        L2d:
            X.Hwg.A00(r6)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r15
            r4.L$3 = r8
            r4.L$4 = r9
            r4.L$5 = r10
            r4.label = r1
            java.lang.Object r6 = r12.freshSsoAccount(r13, r14, r4)
            if (r6 != r3) goto L58
            return r3
        L46:
            java.lang.Object r10 = r4.L$5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r4.L$4
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r4.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r4.L$2
            java.lang.String r7 = X.C3cG.A0d(r0, r6)
        L58:
            com.facebook.aura.login.nativeflow.NativeLoginSsoAccount r6 = (com.facebook.aura.login.nativeflow.NativeLoginSsoAccount) r6
            if (r6 != 0) goto L5e
            r3 = 0
            return r3
        L5e:
            r12.pendingSsoNameCompletion = r6
            r11 = 0
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$retrySsoWithFreshToken$2 r5 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$retrySsoWithFreshToken$2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.L$0 = r11
            r4.L$1 = r11
            r4.L$2 = r11
            r4.L$3 = r11
            r4.L$4 = r11
            r4.L$5 = r11
            r4.L$6 = r11
            r4.label = r2
            java.lang.Object r6 = r12.m1324withTempTokenRgG5Fkc(r1, r5, r4)
            if (r6 != r3) goto L2c
            return r3
        L7d:
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$retrySsoWithFreshToken$1 r4 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$retrySsoWithFreshToken$1
            r4.<init>(r12, r3)
            goto L1b
        L83:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.m1319retrySsoWithFreshTokenP62Ms4M(com.facebook.aura.login.nativeflow.NativeLoginSsoAccount, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* renamed from: retrySsoWithFreshToken-P62Ms4M$default, reason: not valid java name */
    public static /* synthetic */ Object m1320retrySsoWithFreshTokenP62Ms4M$default(NativeLoginViewModel nativeLoginViewModel, NativeLoginSsoAccount nativeLoginSsoAccount, String str, String str2, String str3, String str4, String str5, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        return nativeLoginViewModel.m1319retrySsoWithFreshTokenP62Ms4M(nativeLoginSsoAccount, str, str2, str3, str4, str5, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void routeSignupContinuation(HatchAuthCredentials hatchAuthCredentials) {
        if (this.registrationRecoveryContactPoint != null) {
            rejectDuringRegistrationRecovery();
            return;
        }
        List<HatchNtpUpsellChoiceRow> list = hatchAuthCredentials.ntpUpsellChoice;
        if (list != null && !this.declinedNtpUpsell) {
            navigateToNtpUpsellChoice(hatchAuthCredentials, list);
            return;
        }
        HatchNtpUpsellOffer hatchNtpUpsellOffer = hatchAuthCredentials.ntpUpsell;
        if (hatchNtpUpsellOffer != null && !this.declinedNtpUpsell) {
            replaceAnsweredNtpUpsellChoiceRow(hatchNtpUpsellOffer);
            if (acceptNtpUpsellPickedFromChoice(hatchAuthCredentials)) {
                return;
            }
            navigateToNtpUpsell(hatchAuthCredentials, this.submittedContactPoint, false);
            return;
        }
        HatchAuthFlowContext.State stateSnapshot = HatchAuthFlowContext.INSTANCE.snapshot();
        if (!this.declinedNtpUpsell && C7384Etj.areEqual(stateSnapshot.registrationFlow, HatchCaaEventFlow.NEW_TO_PLATFORM.getValue()) && C7384Etj.areEqual(stateSnapshot.entryPoint, HatchCaaEntryPoint.NTP_UPSELL.getValue())) {
            HatchCaaRegistrationLogger.INSTANCE.logRegistrationStart(HatchCaaRegistrationEventStep.UPSELL_AT_LOGIN, this.submittedContactPoint, null, HatchCaaEventFlow.NEW_TO_META, null, null, HatchCaaNtmSwitchReason.NO_OFFER);
        }
        navigateToBirthday(hatchAuthCredentials, false, false);
    }

    private final NativeLoginRowSource rowSource(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        NativeLoginRowSource nativeLoginRowSource = this.ssoRowSources.get(nativeLoginAccountUiModel.id);
        return nativeLoginRowSource == null ? new NativeLoginRowSource(C0881AGi.A00, this.rememberedAccountsByRowId.containsKey(nativeLoginAccountUiModel.id)) : nativeLoginRowSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* renamed from: savedAccounts-YNEx5aM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1321savedAccountsYNEx5aM(java.lang.String r7, X.HtJ<? super X.HsJ<? extends java.util.List<com.facebook.aura.login.nativeflow.HatchSavedAccount>>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.login.nativeflow.NativeLoginViewModel$savedAccounts$1
            if (r0 == 0) goto L4c
            r5 = r8
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$savedAccounts$1 r5 = (com.facebook.aura.login.nativeflow.NativeLoginViewModel$savedAccounts$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L24
            if (r1 == r0) goto L32
            if (r1 != r2) goto L52
            X.Hwg.A00(r4)
        L23:
            return r4
        L24:
            X.Hwg.A00(r4)
            r5.L$0 = r7
            r5.label = r0
            java.lang.Object r4 = r6.m1317recentLandingSavedAccountsYNEx5aM(r7, r5)
            if (r4 != r3) goto L38
            return r3
        L32:
            java.lang.Object r0 = r5.L$0
            java.lang.String r7 = X.C3cG.A0d(r0, r4)
        L38:
            if (r4 != 0) goto L23
            r0 = 0
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$savedAccounts$2 r1 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$savedAccounts$2
            r1.<init>(r7, r0)
            r5.L$0 = r0
            r5.label = r2
            r0 = 0
            java.lang.Object r4 = r6.m1324withTempTokenRgG5Fkc(r0, r1, r5)
            if (r4 != r3) goto L23
            return r3
        L4c:
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$savedAccounts$1 r5 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$savedAccounts$1
            r5.<init>(r6, r8)
            goto L12
        L52:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.m1321savedAccountsYNEx5aM(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void seedCountryFromDeviceRegion() {
        CountryDialCode next;
        NativeLoginUiState value;
        String strDefaultRegion = PhoneNormalizer.INSTANCE.defaultRegion(this.application);
        if (strDefaultRegion != null) {
            Iterator<CountryDialCode> it = CountryDialCodesKt.COUNTRY_DIAL_CODES.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str = next.iso;
                if (str != null && str.equalsIgnoreCase(strDefaultRegion)) {
                    break;
                }
            }
            CountryDialCode countryDialCode = next;
            if (countryDialCode != null) {
                BLG<NativeLoginUiState> blg = this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, countryDialCode, null, null, null, null, false, -1, 66060287, null)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void selectTwoFactorMethod(com.facebook.aura.login.nativeflow.HatchTwoFactorMethod r66, java.lang.String r67, boolean r68) {
        /*
            r65 = this;
            r3 = r65
            r2 = r66
            r3.twoFactorMethod = r2
            com.facebook.aura.login.nativeflow.HatchTwoFactorMethodType r1 = r2.type
            com.facebook.aura.login.nativeflow.HatchTwoFactorMethodType r0 = com.facebook.aura.login.nativeflow.HatchTwoFactorMethodType.SMS
            if (r1 != r0) goto L18
            java.lang.String r1 = r3.codeSentForMethodId
            java.lang.String r0 = r2.id
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            r52 = 1
            if (r0 == 0) goto L1a
        L18:
            r52 = 0
        L1a:
            X.BLG<com.facebook.aura.login.nativeflow.NativeLoginUiState> r4 = r3._uiState
        L1c:
            java.lang.Object r1 = r4.getValue()
            r5 = r1
            com.facebook.aura.login.nativeflow.NativeLoginUiState r5 = (com.facebook.aura.login.nativeflow.NativeLoginUiState) r5
            java.lang.Integer r0 = r2.codeLength
            r65 = 67092479(0x3ffbfff, float:1.5031633E-36)
            r6 = 0
            r12 = 0
            r64 = -13107201(0xffffffffff37ffff, float:-2.4457793E38)
            java.lang.String r25 = ""
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r12
            r17 = r6
            r18 = r12
            r19 = r6
            r20 = r12
            r21 = r6
            r22 = r6
            r23 = r12
            r24 = r6
            r26 = r6
            r27 = r6
            r28 = r2
            r29 = r0
            r30 = r6
            r31 = r6
            r32 = r12
            r33 = r6
            r34 = r6
            r35 = r6
            r36 = r6
            r37 = r6
            r38 = r6
            r39 = r6
            r40 = r12
            r41 = r12
            r42 = r6
            r43 = r6
            r44 = r6
            r45 = r6
            r46 = r12
            r47 = r6
            r48 = r6
            r49 = r12
            r50 = r12
            r51 = r12
            r53 = r12
            r54 = r6
            r55 = r6
            r56 = r6
            r57 = r6
            r58 = r6
            r59 = r6
            r60 = r6
            r61 = r6
            r62 = r6
            r63 = r12
            r66 = r6
            com.facebook.aura.login.nativeflow.NativeLoginUiState r0 = com.facebook.aura.login.nativeflow.NativeLoginUiState.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            boolean r0 = r4.A6e(r1, r0)
            if (r0 == 0) goto L1c
            com.facebook.aura.analytics.hatch.caa.HatchCaaLoginLogger r1 = com.facebook.aura.analytics.hatch.caa.HatchCaaLoginLogger.INSTANCE
            java.lang.String r0 = r3.submittedContactPoint
            r1.logTwoFactorConfirmPageShown(r0)
            if (r68 == 0) goto Lb7
            com.facebook.aura.login.nativeflow.NativeLoginViewEffect$NavigateToChosenTwoFactor r0 = com.facebook.aura.login.nativeflow.NativeLoginViewEffect.NavigateToChosenTwoFactor.INSTANCE
        Laa:
            com.facebook.aura.login.nativeflow.NativeLoginViewEffect r0 = (com.facebook.aura.login.nativeflow.NativeLoginViewEffect) r0
            r3.emitEffect(r0)
            if (r52 == 0) goto Lb6
            r0 = r67
            r3.sendTwoFactorCode(r0, r2)
        Lb6:
            return
        Lb7:
            com.facebook.aura.login.nativeflow.NativeLoginViewEffect$NavigateToTwoFactor r0 = com.facebook.aura.login.nativeflow.NativeLoginViewEffect.NavigateToTwoFactor.INSTANCE
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.selectTwoFactorMethod(com.facebook.aura.login.nativeflow.HatchTwoFactorMethod, java.lang.String, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendCodeToRemembered(com.facebook.aura.login.credentials.AuraRememberedAccount r69, com.facebook.aura.login.nativeflow.HatchSavedAccount r70, X.HtJ<? super kotlin.Unit> r71) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.sendCodeToRemembered(com.facebook.aura.login.credentials.AuraRememberedAccount, com.facebook.aura.login.nativeflow.HatchSavedAccount, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendOtp(boolean z) {
        NativeLoginUiState value;
        NativeLoginIdentifierResult nativeLoginIdentifierResultClassifyLoginIdentifier = NativeLoginIdentifierKt.classifyLoginIdentifier(C3cG.A0F(this).identifier, C3cG.A0F(this).selectedCountry.iso);
        NativeLoginIdentifier nativeLoginIdentifier = nativeLoginIdentifierResultClassifyLoginIdentifier.identifier;
        if (nativeLoginIdentifier != null) {
            beginOtp(nativeLoginIdentifier, z, null, new C126401());
            return;
        }
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, nativeLoginIdentifierResultClassifyLoginIdentifier.error, null, null, null, null, null, null, false, -1, 66846719, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSavedAccountCode(com.facebook.aura.login.nativeflow.HatchSavedAccount r14, boolean r15, X.HtJ<? super java.lang.Boolean> r16) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.sendSavedAccountCode(com.facebook.aura.login.nativeflow.HatchSavedAccount, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void settleInitialDestination(NativeLoginInitialDestination nativeLoginInitialDestination) {
        this._initialDestination.Af8(nativeLoginInitialDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void settlePasskeyOffer(int i, boolean z) {
        synchronized (this.offerLock) {
            if (i == this.passkeyOfferEpoch) {
                this.passkeyHeldScreen = z;
                this.passkeyAttemptSettled = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void settleSsoExchange(HatchAuthCredentials hatchAuthCredentials, boolean z, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        LoginSessionOutcome signup;
        if (z) {
            signup = new LoginSessionOutcome.Signup(HatchCaaEventFlow.NEW_TO_PLATFORM);
        } else {
            HatchCaaLoginEventStep hatchCaaLoginEventStep = HatchCaaLoginEventStep.LANDING;
            recordContinuationOutcome(hatchAuthCredentials, hatchCaaLoginEventStep, null, hatchCaaLoginCredentialType);
            signup = new LoginSessionOutcome.Login(hatchCaaLoginEventStep, null, hatchCaaLoginCredentialType);
        }
        LoginSessionOutcome loginSessionOutcome = signup;
        HatchCaaFailure hatchCaaFailureJoinContinuationFailure = joinContinuationFailure(hatchAuthCredentials);
        if (hatchCaaFailureJoinContinuationFailure != null) {
            logJoinOutcome(z, null, hatchCaaNtpSourcePlatform, hatchCaaFailureJoinContinuationFailure);
        }
        boolean zHandleLoginContinuation = handleLoginContinuation(hatchAuthCredentials, loginSessionOutcome, null, LoginMethod.SSO);
        if (hatchCaaFailureJoinContinuationFailure == null) {
            logJoinOutcome(z, zHandleLoginContinuation ? null : hatchAuthCredentials, hatchCaaNtpSourcePlatform, null);
        }
        if (zHandleLoginContinuation) {
            return;
        }
        completeLogin(hatchAuthCredentials, loginSessionOutcome, false);
    }

    private final void showBirthdayError(NativeLoginBirthdayError nativeLoginBirthdayError) {
        NativeLoginUiState value;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, nativeLoginBirthdayError, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -145, 66895807, null)));
    }

    private final void showErrorDialog(NativeLoginErrorDialogContent nativeLoginErrorDialogContent, NativeLoginBirthdayError nativeLoginBirthdayError) {
        NativeLoginUiState value;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, nativeLoginBirthdayError, null, false, null, null, false, false, false, false, false, nativeLoginErrorDialogContent, null, null, null, null, null, null, null, null, false, -145, 66895807, null)));
    }

    public static /* synthetic */ void showErrorDialog$default(NativeLoginViewModel nativeLoginViewModel, NativeLoginErrorDialogContent nativeLoginErrorDialogContent, NativeLoginBirthdayError nativeLoginBirthdayError, int i, Object obj) {
        if ((i & 2) != 0) {
            nativeLoginBirthdayError = null;
        }
        nativeLoginViewModel.showErrorDialog(nativeLoginErrorDialogContent, nativeLoginBirthdayError);
    }

    private final void showFieldError(NativeLoginField nativeLoginField, int i, HatchProblemJson hatchProblemJson) {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiState;
        String str;
        String str2;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            nativeLoginUiState = value;
            str = null;
            if (hatchProblemJson != null && (str2 = hatchProblemJson.detail) != null && !C7BY.A0j(str2)) {
                str = str2;
            }
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(nativeLoginUiState, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, new NativeLoginFieldError(nativeLoginField, i, str), null, null, null, null, null, null, null, false, -145, 66895871, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLatestRememberedMuseProfiles() {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiStateCopy$default;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            nativeLoginUiStateCopy$default = value;
            if (landingStatus(nativeLoginUiStateCopy$default) == NativeLoginLandingStatus.IDLE) {
                Map<String, NativeLoginMuseProfileUiModel> map = this.rememberedMuseProfilesByRowId;
                AHD<NativeLoginAccountUiModel> ahd = nativeLoginUiStateCopy$default.accounts;
                ArrayList arrayList = new ArrayList(Hr7.A1D(ahd, 10));
                for (NativeLoginAccountUiModel nativeLoginAccountUiModelCopy$default : ahd) {
                    if (map.containsKey(nativeLoginAccountUiModelCopy$default.id)) {
                        nativeLoginAccountUiModelCopy$default = NativeLoginAccountUiModel.copy$default(nativeLoginAccountUiModelCopy$default, null, null, null, null, null, 0, null, false, false, false, false, null, null, map.get(nativeLoginAccountUiModelCopy$default.id), false, null, null, 122879, null);
                    }
                    arrayList.add(nativeLoginAccountUiModelCopy$default);
                }
                nativeLoginUiStateCopy$default = NativeLoginUiState.copy$default(nativeLoginUiStateCopy$default, AGI.A07(arrayList), null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -2, 67108863, null);
            }
        } while (!blg.A6e(value, nativeLoginUiStateCopy$default));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLinkFailed(NativeLoginErrorDialogContent nativeLoginErrorDialogContent, boolean z) {
        NativeLoginErrorDismissal nativeLoginErrorDismissal;
        String str;
        CFK.A06(NativeLoginViewModelKt.TAG, "ntp link unavailable; offering standalone signup");
        HatchAuthCredentials hatchAuthCredentials = this.pendingCredentials;
        if (hatchAuthCredentials != null && (str = hatchAuthCredentials.completionHandle) != null && (!C7BY.A0j(str))) {
            nativeLoginErrorDismissal = NativeLoginErrorDismissal.CONTINUE_TO_BIRTHDAY;
        } else {
            if (z) {
                restartFromPhoneEntry(nativeLoginErrorDialogContent);
                return;
            }
            nativeLoginErrorDismissal = NativeLoginErrorDismissal.CLOSE;
        }
        showErrorDialog(new NativeLoginErrorDialogContent(nativeLoginErrorDialogContent.titleRes, nativeLoginErrorDialogContent.messageRes, nativeLoginErrorDialogContent.serverTitle, nativeLoginErrorDialogContent.serverMessage, nativeLoginErrorDialogContent.action, nativeLoginErrorDismissal), null);
    }

    private final void signingInAs(String str, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        NativeLoginUiState value;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, str, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -17, 67108863, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126442(g0u, this, null), AEu.A00(this));
    }

    private final void startLoginFlow() {
        NativeLoginCaaStartupTracker nativeLoginCaaStartupTracker = this.caaStartupTracker;
        if (nativeLoginCaaStartupTracker != null) {
            nativeLoginCaaStartupTracker.abandon();
        }
        NativeLoginCaaStartupTracker nativeLoginCaaStartupTracker2 = new NativeLoginCaaStartupTracker();
        this.caaStartupTracker = nativeLoginCaaStartupTracker2;
        HatchAuthFlowContext.INSTANCE.adoptOrBeginFlow(HatchCaaEntryPoint.LOGIN_HOME.getValue());
        seedCountryFromDeviceRegion();
        attemptSilentTokenExchange();
        prefetchTempToken();
        routeIntroOnDeviceRead();
        resolveAccounts(nativeLoginCaaStartupTracker2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tempTokenUnavailable-d1pmJ48, reason: not valid java name */
    public final <T> Object m1322tempTokenUnavailabled1pmJ48() {
        return C3cG.A0s(new IOException("No temp token for a one-tap request"));
    }

    private final boolean topEntryScreenOffersCredentials() {
        Object next;
        boolean z;
        synchronized (this.offerLock) {
            Iterator itA0n = AnonymousClass002.A0n(this.liveEntryScreens);
            if (itA0n.hasNext()) {
                next = itA0n.next();
                if (itA0n.hasNext()) {
                    int iA0F = AnonymousClass001.A0F(((Map.Entry) next).getKey());
                    do {
                        Object next2 = itA0n.next();
                        int iIntValue = ((Number) ((Map.Entry) next2).getKey()).intValue();
                        if (iA0F < iIntValue) {
                            next = next2;
                            iA0F = iIntValue;
                        }
                    } while (itA0n.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry = (Map.Entry) next;
            z = false;
            if (entry != null) {
                if (AnonymousClass001.A1X(entry.getValue())) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.login.nativeflow.NativeLoginUiState withItemizedConsentAccepted(com.facebook.aura.login.nativeflow.NativeLoginUiState r64, X.AHD<java.lang.Boolean> r65) {
        /*
            r63 = this;
            r2 = r65
            boolean r0 = r2.isEmpty()
            r3 = 1
            if (r0 != 0) goto Lb0
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L9c
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9c
        L13:
            r39 = 1
        L15:
            r4 = r64
            com.facebook.aura.login.nativeflow.NativeLoginItemizedConsentTarget r0 = r4.itemizedConsentTarget
            if (r0 == 0) goto L29
            com.facebook.aura.login.nativeflow.HatchItemizedConsent r0 = r0.getConsent()
            if (r0 == 0) goto L29
            boolean r0 = r0.allowsConfirm(r2)
            r40 = 1
            if (r0 == r3) goto L2b
        L29:
            r40 = 0
        L2b:
            r64 = 67108849(0x3fffff1, float:1.5046314E-36)
            r5 = 0
            r11 = 0
            r63 = -1
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r11
            r16 = r5
            r17 = r11
            r18 = r5
            r19 = r11
            r20 = r5
            r21 = r5
            r22 = r11
            r23 = r5
            r24 = r5
            r25 = r5
            r26 = r5
            r27 = r5
            r28 = r5
            r29 = r5
            r30 = r5
            r31 = r11
            r32 = r5
            r33 = r5
            r34 = r5
            r35 = r5
            r36 = r5
            r37 = r5
            r38 = r2
            r41 = r5
            r42 = r5
            r43 = r5
            r44 = r5
            r45 = r11
            r46 = r5
            r47 = r5
            r48 = r11
            r49 = r11
            r50 = r11
            r51 = r11
            r52 = r11
            r53 = r5
            r54 = r5
            r55 = r5
            r56 = r5
            r57 = r5
            r58 = r5
            r59 = r5
            r60 = r5
            r61 = r5
            r62 = r11
            r65 = r5
            com.facebook.aura.login.nativeflow.NativeLoginUiState r0 = com.facebook.aura.login.nativeflow.NativeLoginUiState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            return r0
        L9c:
            java.util.Iterator r1 = r2.iterator()
        La0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L13
            java.lang.Object r0 = r1.next()
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 != 0) goto La0
        Lb0:
            r39 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.withItemizedConsentAccepted(com.facebook.aura.login.nativeflow.NativeLoginUiState, X.AHD):com.facebook.aura.login.nativeflow.NativeLoginUiState");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* renamed from: withPostLoginTempToken-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object m1323withPostLoginTempTokenBWLJW6A(java.lang.String r7, java.lang.String r8, X.G0V<? super java.lang.String, ? super X.HtJ<? super X.HsJ<? extends T>>, ? extends java.lang.Object> r9, X.HtJ<? super X.HsJ<? extends T>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.NativeLoginViewModel$withPostLoginTempToken$1
            if (r0 == 0) goto L91
            r2 = r10
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$withPostLoginTempToken$1 r2 = (com.facebook.aura.login.nativeflow.NativeLoginViewModel$withPostLoginTempToken$1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L91
            int r3 = r3 - r1
            r2.label = r3
        L12:
            java.lang.Object r6 = r2.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r3 = 3
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 == r1) goto L42
            if (r0 == r5) goto L6b
            if (r0 != r3) goto L98
            X.Hwg.A00(r6)
        L26:
            X.HsJ r6 = (X.HsJ) r6
            java.lang.Object r1 = r6.value
            return r1
        L2b:
            X.Hwg.A00(r6)
            if (r7 == 0) goto L57
            r0 = 0
            r2.L$0 = r0
            r2.L$1 = r8
            r2.L$2 = r9
            r2.L$3 = r0
            r2.label = r1
            java.lang.Object r6 = r9.invoke(r7, r2)
            if (r6 != r4) goto L4c
            return r4
        L42:
            java.lang.Object r9 = r2.L$2
            X.G0V r9 = (X.G0V) r9
            java.lang.Object r0 = r2.L$1
            java.lang.String r8 = X.C3cG.A0d(r0, r6)
        L4c:
            X.HsJ r6 = (X.HsJ) r6
            java.lang.Object r1 = r6.value
            boolean r0 = com.facebook.aura.network.hatchauth.HatchAuthErrorKt.sessionExpired(r1)
            if (r0 != 0) goto L57
            return r1
        L57:
            com.facebook.aura.login.nativeflow.HatchAuthApi r1 = com.facebook.aura.login.nativeflow.HatchAuthApi.INSTANCE
            r0 = 0
            r2.L$0 = r0
            r2.L$1 = r0
            r2.L$2 = r9
            r2.L$3 = r0
            r2.label = r5
            java.lang.Object r1 = r1.m1268startgIAlus(r8, r2)
            if (r1 != r4) goto L73
            return r4
        L6b:
            java.lang.Object r9 = r2.L$2
            X.G0V r9 = (X.G0V) r9
            java.lang.Object r1 = X.AnonymousClass001.A0q(r6)
        L73:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto L9d
            com.facebook.aura.login.nativeflow.HatchAuthStart r1 = (com.facebook.aura.login.nativeflow.HatchAuthStart) r1
            java.lang.String r1 = r1.accessToken
            r0 = 0
            r2.L$0 = r0
            r2.L$1 = r0
            r2.L$2 = r0
            r2.L$3 = r0
            r2.L$4 = r0
            r2.label = r3
            java.lang.Object r6 = r9.invoke(r1, r2)
            if (r6 != r4) goto L26
            return r4
        L91:
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$withPostLoginTempToken$1 r2 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$withPostLoginTempToken$1
            r2.<init>(r6, r10)
            goto L12
        L98:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L9d:
            X.Hud r1 = X.C3cG.A0s(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.m1323withPostLoginTempTokenBWLJW6A(java.lang.String, java.lang.String, X.G0V, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* renamed from: withTempToken-RgG5Fkc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object m1324withTempTokenRgG5Fkc(boolean r10, X.G0V<? super java.lang.String, ? super X.HtJ<? super X.HsJ<? extends T>>, ? extends java.lang.Object> r11, X.HtJ<? super X.HsJ<? extends T>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.facebook.aura.login.nativeflow.NativeLoginViewModel$withTempToken$1
            if (r0 == 0) goto L2b
            r8 = r12
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$withTempToken$1 r8 = (com.facebook.aura.login.nativeflow.NativeLoginViewModel$withTempToken$1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r0 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r2 = r8.label
            r6 = 0
            r5 = 4
            r4 = 3
            r3 = 2
            r1 = 1
            if (r2 == 0) goto L36
            if (r2 == r1) goto L46
            if (r2 == r3) goto L63
            if (r2 == r4) goto L90
            if (r2 != r5) goto L31
            X.Hwg.A00(r0)
            return r0
        L2b:
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$withTempToken$1 r8 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$withTempToken$1
            r8.<init>(r9, r12)
            goto L12
        L31:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L36:
            X.Hwg.A00(r0)
            r8.L$0 = r11
            r8.Z$0 = r10
            r8.label = r1
            java.lang.Object r0 = r9.mintTempToken(r10, r8)
            if (r0 != r7) goto L4f
            return r7
        L46:
            boolean r10 = r8.Z$0
            java.lang.Object r11 = r8.L$0
            X.G0V r11 = (X.G0V) r11
            X.Hwg.A00(r0)
        L4f:
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Lb3
            r8.L$0 = r11
            r8.L$1 = r2
            r8.Z$0 = r10
            r8.label = r3
            java.lang.Object r0 = r11.invoke(r2, r8)
            if (r0 != r7) goto L70
            return r7
        L63:
            boolean r10 = r8.Z$0
            java.lang.Object r2 = r8.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r11 = r8.L$0
            X.G0V r11 = (X.G0V) r11
            X.Hwg.A00(r0)
        L70:
            X.HsJ r0 = (X.HsJ) r0
            java.lang.Object r1 = r0.value
            boolean r0 = com.facebook.aura.network.hatchauth.HatchAuthErrorKt.sessionExpired(r1)
            if (r0 == 0) goto Lae
            com.facebook.aura.login.nativeflow.HatchTempTokenProvider r0 = com.facebook.aura.login.nativeflow.HatchTempTokenProvider.INSTANCE
            r0.invalidate(r2)
            r8.L$0 = r11
            r8.L$1 = r6
            r8.L$2 = r6
            r8.Z$0 = r10
            r8.label = r4
            java.lang.Object r0 = r9.mintTempToken(r10, r8)
            if (r0 != r7) goto L99
            return r7
        L90:
            boolean r10 = r8.Z$0
            java.lang.Object r11 = r8.L$0
            X.G0V r11 = (X.G0V) r11
            X.Hwg.A00(r0)
        L99:
            if (r0 == 0) goto Lb3
            r8.L$0 = r6
            r8.L$1 = r6
            r8.L$2 = r6
            r8.L$3 = r6
            r8.Z$0 = r10
            r8.label = r5
            java.lang.Object r0 = r11.invoke(r0, r8)
            if (r0 != r7) goto Lb2
            return r7
        Lae:
            X.HsJ r0 = X.C3cG.A0t(r1)
        Lb2:
            return r0
        Lb3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.m1324withTempTokenRgG5Fkc(boolean, X.G0V, X.HtJ):java.lang.Object");
    }

    /* renamed from: withTempToken-RgG5Fkc$default, reason: not valid java name */
    public static /* synthetic */ Object m1325withTempTokenRgG5Fkc$default(NativeLoginViewModel nativeLoginViewModel, boolean z, G0V g0v, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return nativeLoginViewModel.m1324withTempTokenRgG5Fkc(z, g0v, htJ);
    }

    public final boolean claimHeroLogoAnimation() {
        if (this.heroLogoAnimationClaimed) {
            return false;
        }
        this.heroLogoAnimationClaimed = true;
        return true;
    }

    public final boolean getBirthdayBackReturnsToOffer() {
        return this.birthdayBackReturnsToOffer;
    }

    public final C1BN<NativeLoginInitialDestination> getInitialDestination() {
        return this.initialDestination;
    }

    public final String getLoggedContactPoint() {
        return this.submittedContactPoint;
    }

    public final HatchNtpSourceApp getNtpSourceApp() {
        return this.ntpSourceApp;
    }

    public final C1BN<NativeLoginUiState> getUiState() {
        return this.uiState;
    }

    public final C20Q<NativeLoginViewEffect> getViewEffect() {
        return this.viewEffect;
    }

    public final void onAccountSelectionBackClicked() {
        logClick(HatchScreen.LOGIN_LANDING, HatchComponent.BACK_BUTTON, "select_account_back", AGH.A0E());
        HatchCaaLoginLogger.INSTANCE.logAccountSelectorBack(this.submittedContactPoint);
        cancelPendingAttempts();
        restartFromPhoneEntry();
    }

    public final void onAccountSelectionCreateNewAccountClicked() {
        NativeLoginUiState value;
        logClick(HatchScreen.LOGIN_ACCOUNT_SELECTION, HatchComponent.USE_CONTACT_POINT_BUTTON, "select_account_create_new", AGH.A0E());
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, "", "", false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1793, 67043327, null)));
        restartFromPhoneEntry();
    }

    public final void onBirthdayBackToOfferClicked() {
        NativeLoginUiState value;
        logBirthdayStepBack();
        cancelPendingAttempts();
        this.pendingCompletionInputs = null;
        this.declinedNtpUpsell = false;
        this.birthdayBackReturnsToOffer = false;
        HatchAuthFlowContext.INSTANCE.setRegistrationFlow(HatchCaaEventFlow.NEW_TO_PLATFORM.getValue());
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67092415, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBirthdayContinueClicked() {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.onBirthdayContinueClicked():void");
    }

    public final void onBirthdayFieldFocused() {
        if (this.birthdayFocusedLogged) {
            return;
        }
        this.birthdayFocusedLogged = true;
        HatchCaaRegistrationLogger.INSTANCE.logBirthdayFocused(this.submittedContactPoint);
    }

    public final void onBirthdayScreenLeft() {
        NativeLoginUiState value;
        Companion companion;
        if (this.pendingCompletionInputs == null) {
            this.birthdayFocusedLogged = false;
            this.birthdayInteractionLogged = false;
            this.firstNameInteractionLogged = false;
            this.lastNameInteractionLogged = false;
        }
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            companion = Companion;
        } while (!C3cI.A1U(NativeLoginField.SIGNUP_PASSWORD, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, "", false, "", "", false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67107199, null), companion, value, blg));
    }

    public final void onCheckpointLogOutClicked() {
        NativeLoginUiState value;
        clearCheckpointContinuation();
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, NativeLoginCheckpointAction.CONTINUE, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -201326593, 67092479, null)));
        logClick(HatchScreen.LOGIN_CHECKPOINT, HatchComponent.LOGOUT_BUTTON, "checkpoint_log_out", AGH.A0E());
    }

    public final void onCheckpointResumed() {
        NativeLoginUiState value;
        if (this.checkpointContinueTapped) {
            BLG<NativeLoginUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, NativeLoginCheckpointAction.SIGN_IN_AGAIN, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -134217729, 67108863, null)));
        }
    }

    public final void onCheckpointWebClosed() {
        boolean zA1Y;
        synchronized (this.checkpointLock) {
            zA1Y = AnonymousClass002.A1Y(this.checkpointJob);
        }
        if (zA1Y) {
            closeCheckpointWeb();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCheckpointWebFailure() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.checkpointLock
            monitor-enter(r2)
            java.lang.String r0 = r3.checkpointResumeToken     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto Lc
            X.HoC r1 = r3.checkpointJob     // Catch: java.lang.Throwable -> L1a
            r0 = 1
            if (r1 == 0) goto Ld
        Lc:
            r0 = 0
        Ld:
            monitor-exit(r2)
            if (r0 == 0) goto L19
            r3.closeCheckpointWeb()
            com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent r1 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.GENERIC_DIALOG
            r0 = 0
            r3.showErrorDialog(r1, r0)
        L19:
            return
        L1a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.onCheckpointWebFailure():void");
    }

    @Override // X.AEs
    public void onCleared() {
        NativeLoginCaaStartupTracker nativeLoginCaaStartupTracker = this.caaStartupTracker;
        if (nativeLoginCaaStartupTracker != null) {
            nativeLoginCaaStartupTracker.abandon();
        }
    }

    public final void onDidntGetCodeClicked() {
        NativeLoginUiState value;
        logClick(HatchScreen.LOGIN_OTP, HatchComponent.RESEND_CODE_BUTTON, "didnt_get_code", AGH.A0E());
        OtpFunnel otpFunnel = getOtpFunnel();
        if (otpFunnel.isRegistration) {
            HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
            String str = this.submittedContactPoint;
            HatchCaaFlowSource hatchCaaFlowSource = otpFunnel.source;
            HatchNtpSourceApp hatchNtpSourceApp = this.ntpSourceApp;
            hatchCaaRegistrationLogger.logConfirmationResendCodeClicked(str, hatchCaaFlowSource, hatchNtpSourceApp != null ? NativeLoginCaaSourceKt.toNtpSourcePlatform(hatchNtpSourceApp) : null);
        } else {
            HatchCaaLoginLogger.INSTANCE.logResendCodeClicked(this.submittedContactPoint, otpFunnel.source);
        }
        cancelPendingAttempts();
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, clearedForNewAttempt(value)));
        HatchSavedAccount hatchSavedAccount = this.savedAccountCodeCard;
        if (hatchSavedAccount == null) {
            sendOtp(true);
        } else if (claimLoading()) {
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126152(hatchSavedAccount, null), AEu.A00(this));
        }
    }

    public final void onEntryScreenHidden(int i) {
        synchronized (this.offerLock) {
            this.liveEntryScreens.remove(Integer.valueOf(i));
            if (this.liveEntryScreens.isEmpty()) {
                this.hostActivity = null;
            }
        }
    }

    public final void onErrorDismissed() {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiState;
        NativeLoginErrorDismissal nativeLoginErrorDismissal;
        int iOrdinal;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            nativeLoginUiState = value;
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(nativeLoginUiState, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67043327, null)));
        NativeLoginErrorDialogContent nativeLoginErrorDialogContent = nativeLoginUiState.errorDialog;
        if (nativeLoginErrorDialogContent == null || (nativeLoginErrorDismissal = nativeLoginErrorDialogContent.dismissal) == null || (iOrdinal = nativeLoginErrorDismissal.ordinal()) == -1) {
            return;
        }
        if (iOrdinal == 2) {
            String str = this.registrationRecoveryContactPoint;
            if (str != null) {
                clearForRestart();
                this.registrationRecoveryContactPoint = str;
                this.declinedNtpUpsell = true;
                emitEffect(NativeLoginViewEffect.PopToPhoneEntry.INSTANCE);
                continueToOtpForContactPoint(str, null);
                return;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                HatchAuthCredentials hatchAuthCredentials = this.pendingCredentials;
                if (hatchAuthCredentials != null) {
                    HatchCaaRegistrationLogger.INSTANCE.logRegistrationStart(HatchCaaRegistrationEventStep.UPSELL_AT_LOGIN, this.submittedContactPoint, null, HatchCaaEventFlow.NEW_TO_META, null, null, HatchCaaNtmSwitchReason.LINK_FAILED);
                    navigateToBirthday(hatchAuthCredentials, true, false);
                    return;
                }
            } else if (iOrdinal != 4) {
                if (iOrdinal != 0) {
                    throw C3cG.A0q();
                }
                return;
            } else if (this.authState != null) {
                emitEffect(NativeLoginViewEffect.NavigateToOtp.INSTANCE);
                return;
            }
            restartFromPhoneEntry(SESSION_EXPIRED_DIALOG);
            return;
        }
        emitEffect(NativeLoginViewEffect.PopToLanding.INSTANCE);
        clearForRestart();
    }

    public final void onItemizedConsentAgreeToAllToggled(boolean z) {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiState;
        ArrayList arrayList;
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.ONBOARDING, null, HatchScreen.LOGIN_ITEMIZED_CONSENT, HatchComponent.ITEMIZED_CONSENT_AGREE_ALL_TOGGLE, null, null);
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            nativeLoginUiState = value;
            int size = nativeLoginUiState.itemizedConsentAccepted.size();
            arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(Boolean.valueOf(z));
            }
        } while (!blg.A6e(value, withItemizedConsentAccepted(nativeLoginUiState, AGI.A07(arrayList))));
    }

    public final void onItemizedConsentBackClicked() {
        logClick(HatchScreen.LOGIN_ITEMIZED_CONSENT, HatchComponent.BACK_BUTTON, "itemized_consent_back", AGH.A0E());
        restoreBirthdayInputsFromItems();
    }

    public final void onItemizedConsentConfirmClicked() {
        logClick(HatchScreen.LOGIN_ITEMIZED_CONSENT, HatchComponent.ITEMIZED_CONSENT_CONFIRM_BUTTON, "itemized_consent_confirm", AGH.A0E());
        NativeLoginUiState nativeLoginUiStateA0F = C3cG.A0F(this);
        NativeLoginItemizedConsentTarget nativeLoginItemizedConsentTarget = nativeLoginUiStateA0F.itemizedConsentTarget;
        if (nativeLoginItemizedConsentTarget == null || !nativeLoginItemizedConsentTarget.getConsent().allowsConfirm(nativeLoginUiStateA0F.itemizedConsentAccepted)) {
            return;
        }
        if (nativeLoginItemizedConsentTarget instanceof NativeLoginItemizedConsentTarget.Completion) {
            agreeToCompletionItemizedConsent();
        } else {
            if (!(nativeLoginItemizedConsentTarget instanceof NativeLoginItemizedConsentTarget.Linking)) {
                throw C3cG.A0q();
            }
            agreeToLinkingItemizedConsent(((NativeLoginItemizedConsentTarget.Linking) nativeLoginItemizedConsentTarget).disclosure);
        }
    }

    public final void onItemizedConsentDeclineClicked() {
        logClick(HatchScreen.LOGIN_ITEMIZED_CONSENT, HatchComponent.ITEMIZED_CONSENT_DECLINE_BUTTON, "itemized_consent_decline", AGH.A0E());
        restoreBirthdayInputsFromItems();
    }

    public final void onItemizedConsentItemToggled(int i, boolean z) {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiStateWithItemizedConsentAccepted;
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.ONBOARDING, null, HatchScreen.LOGIN_ITEMIZED_CONSENT, HatchComponent.ITEMIZED_CONSENT_ITEM_TOGGLE, null, null);
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            nativeLoginUiStateWithItemizedConsentAccepted = value;
            if (i >= 0 && i < nativeLoginUiStateWithItemizedConsentAccepted.itemizedConsentAccepted.size()) {
                AHD<Boolean> ahd = nativeLoginUiStateWithItemizedConsentAccepted.itemizedConsentAccepted;
                ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                int i2 = 0;
                for (Object obj : ahd) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    boolean zA1X = AnonymousClass001.A1X(obj);
                    if (i2 == i) {
                        zA1X = z;
                    }
                    arrayListA0i.add(Boolean.valueOf(zA1X));
                    i2 = i3;
                }
                nativeLoginUiStateWithItemizedConsentAccepted = withItemizedConsentAccepted(nativeLoginUiStateWithItemizedConsentAccepted, AGI.A07(arrayListA0i));
            }
        } while (!blg.A6e(value, nativeLoginUiStateWithItemizedConsentAccepted));
    }

    public final void onLinkingDisclosureBackClicked() {
        logClick(HatchScreen.LOGIN_LINKING_DISCLOSURE, HatchComponent.BACK_BUTTON, "linking_disclosure_back", AGH.A0E());
        logLinkingDisclosure(new C126191(HatchCaaRegistrationLogger.INSTANCE));
        clearLinkingDisclosureTap();
    }

    public final void onLinkingDisclosureConfirmClicked() {
        NativeLoginUiState value;
        NativeLoginUiState nativeLoginUiStateCopy$default;
        ArrayList arrayList;
        logClick(HatchScreen.LOGIN_LINKING_DISCLOSURE, HatchComponent.LINKING_DISCLOSURE_CONFIRM_BUTTON, "linking_disclosure_confirm", AGH.A0E());
        NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState = C3cG.A0F(this).linkingDisclosure;
        if (nativeLoginLinkingDisclosureUiState != null) {
            HatchItemizedConsent hatchItemizedConsent = nativeLoginLinkingDisclosureUiState.itemizedConsent;
            if (hatchItemizedConsent != null) {
                BLG<NativeLoginUiState> blg = this._uiState;
                do {
                    value = blg.getValue();
                    nativeLoginUiStateCopy$default = NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, new NativeLoginItemizedConsentTarget.Linking(nativeLoginLinkingDisclosureUiState, hatchItemizedConsent), null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67108847, null);
                    int size = hatchItemizedConsent.items.size();
                    arrayList = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        arrayList.add(false);
                    }
                } while (!blg.A6e(value, withItemizedConsentAccepted(nativeLoginUiStateCopy$default, AGI.A07(arrayList))));
                emitEffect(NativeLoginViewEffect.NavigateToItemizedConsent.INSTANCE);
                return;
            }
            if (this.linkingDisclosureForNtpUpsell) {
                if (claimLoading()) {
                    HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
                    hatchCaaRegistrationLogger.logTosAccepted(this.offerContactPoint, HatchCaaEventFlow.NEW_TO_PLATFORM, this.offerNtpSourcePlatform, null, nativeLoginLinkingDisclosureUiState.contentVersion);
                    logLinkingDisclosure(new C126202(hatchCaaRegistrationLogger));
                    replayNtpUpsellAccept(nativeLoginLinkingDisclosureUiState.contentVersion);
                    return;
                }
                return;
            }
            NativeLoginSsoAccount nativeLoginSsoAccount = this.pendingSsoNameCompletion;
            if (nativeLoginSsoAccount == null || !claimLoading()) {
                return;
            }
            HatchCaaRegistrationLogger hatchCaaRegistrationLogger2 = HatchCaaRegistrationLogger.INSTANCE;
            hatchCaaRegistrationLogger2.logTosAccepted(this.submittedContactPoint, HatchCaaEventFlow.NEW_TO_PLATFORM, NativeLoginCaaSourceKt.toNtpSourcePlatform(nativeLoginSsoAccount.sourceApp), null, nativeLoginLinkingDisclosureUiState.contentVersion);
            logLinkingDisclosure(new C126213(hatchCaaRegistrationLogger2));
            replayAgreedLinkingDisclosure(nativeLoginLinkingDisclosureUiState, nativeLoginSsoAccount);
        }
    }

    public final void onLinkingDisclosureDeclineClicked() {
        logClick(HatchScreen.LOGIN_LINKING_DISCLOSURE, HatchComponent.LINKING_DISCLOSURE_DECLINE_BUTTON, "linking_disclosure_decline", AGH.A0E());
        logLinkingDisclosure(new C126221(HatchCaaRegistrationLogger.INSTANCE));
        if (this.linkingDisclosureForNtpUpsell) {
            clearLinkingDisclosureTap();
            emitEffect(NativeLoginViewEffect.ReturnToNtpUpsell.INSTANCE);
        } else {
            emitEffect(NativeLoginViewEffect.PopToLanding.INSTANCE);
            clearForRestart();
            relistPicker();
        }
    }

    public final void onMoreAccountsClicked() {
        logClick(HatchScreen.LOGIN_LANDING, HatchComponent.LOGIN_ACCOUNT_PICKER, "more_accounts", AGH.A0E());
    }

    public final void onNameCompletionBackClicked() {
        if (this.logsNameStep) {
            HatchCaaRegistrationLogger.INSTANCE.logNameBack(this.submittedContactPoint);
        }
        restartFromPhoneEntry();
    }

    public final void onNameCompletionContinueClicked() {
        HatchAuthCredentials hatchAuthCredentials;
        HatchTosDisclosure hatchTosDisclosure;
        logClick(HatchScreen.LOGIN_OTP, HatchComponent.CONFIRM_BIRTHDAY_BUTTON, C8j2.A00(66), AGH.A0E());
        NativeLoginSsoAccount nativeLoginSsoAccount = this.pendingSsoNameCompletion;
        if (nativeLoginSsoAccount != null) {
            boolean z = this.pendingSsoNameCompletionIsJoin;
            NativeLoginUiState nativeLoginUiStateA0F = C3cG.A0F(this);
            String strA0l = AnonymousClass002.A0l(nativeLoginUiStateA0F.signupFirstName);
            String strA0l2 = AnonymousClass002.A0l(nativeLoginUiStateA0F.signupLastName);
            if (strA0l.length() == 0 || strA0l2.length() == 0) {
                return;
            }
            String str = null;
            if (nativeLoginUiStateA0F.requiresSignupConsent && (hatchAuthCredentials = this.pendingCredentials) != null && (hatchTosDisclosure = hatchAuthCredentials.tos) != null) {
                str = hatchTosDisclosure.contentVersion;
            }
            String str2 = this.agreedLinkingDisclosureVersion;
            if (claimLoading()) {
                this.submittedSsoName = new SubmittedSsoName(strA0l, strA0l2, str);
                HatchCaaLoginCredentialType credentialType = NativeLoginCaaSourceKt.toCredentialType(nativeLoginSsoAccount.sourceApp);
                HatchCaaNtpSourcePlatform ntpSourcePlatform = NativeLoginCaaSourceKt.toNtpSourcePlatform(nativeLoginSsoAccount.sourceApp);
                if (z) {
                    HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
                    hatchCaaRegistrationLogger.logNameNext(this.submittedContactPoint);
                    hatchCaaRegistrationLogger.logCreateAttempt(this.submittedContactPoint, HatchCaaEventFlow.NEW_TO_PLATFORM, null, ntpSourcePlatform);
                }
                C3cI.A1F(this, AnonymousClass001.A0y(), new C126231(z, ntpSourcePlatform, credentialType, nativeLoginSsoAccount, strA0l, strA0l2, str, str2, null), AEu.A00(this));
            }
        }
    }

    public final void onNtpUpsellBackClicked() {
        logClick(HatchScreen.LOGIN_NTP_UPSELL, HatchComponent.BACK_BUTTON, "ntp_upsell_back", AGH.A0E());
        leaveNtpUpsell();
    }

    public final void onNtpUpsellChoiceBackClicked() {
        logClick(HatchScreen.LOGIN_NTP_UPSELL, HatchComponent.BACK_BUTTON, "ntp_upsell_back", AGH.A0E());
        leaveNtpUpsellChoice();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNtpUpsellDeclineClicked() {
        /*
            r2 = this;
            boolean r0 = r2.offerFromTwoFactor
            if (r0 != 0) goto Ld
            com.facebook.aura.login.nativeflow.NativeLoginUiState r0 = X.C3cG.A0F(r2)
            X.AHD<com.facebook.aura.login.nativeflow.NtpUpsellChoiceRowUiState> r1 = r0.ntpUpsellChoice
            r0 = 0
            if (r1 == 0) goto Le
        Ld:
            r0 = 1
        Le:
            r2.declineNtpUpsell(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.onNtpUpsellDeclineClicked():void");
    }

    public final void onNtpUpsellUseAnotherAccountClicked() {
        NativeLoginUiState value;
        logNtpUpsellUseAnotherAccountClick();
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, "", "", false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1793, 67043327, null)));
        restartFromPhoneEntry();
    }

    public final void onOtpBackClicked() {
        NativeLoginUiState value;
        logClick(HatchScreen.LOGIN_OTP, HatchComponent.EDIT_CONTACT_POINT_BUTTON, "edit_contact_point", AGH.A0E());
        cancelPendingAttempts();
        this.declinedNtpUpsell = false;
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(clearedForNewAttempt(value), null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -1, 67092479, null)));
    }

    public final void onOtpConfirmClicked() {
        logClick(HatchScreen.LOGIN_OTP, HatchComponent.CONFIRM_CODE_BUTTON, "confirm_otp", AGH.A0E());
        HatchCaaLoginEventStep hatchCaaLoginEventStep = HatchCaaLoginEventStep.OTP;
        this.rememberDeviceAnswer = rememberDeviceAnswerAt(hatchCaaLoginEventStep);
        OtpFunnel otpFunnel = getOtpFunnel();
        if (otpFunnel.isRegistration) {
            HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
            String str = this.submittedContactPoint;
            HatchCaaFlowSource hatchCaaFlowSource = otpFunnel.source;
            HatchNtpSourceApp hatchNtpSourceApp = this.ntpSourceApp;
            hatchCaaRegistrationLogger.logConfirmationNext(str, hatchCaaFlowSource, hatchNtpSourceApp != null ? NativeLoginCaaSourceKt.toNtpSourcePlatform(hatchNtpSourceApp) : null);
        } else {
            HatchCaaLoginLogger hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
            hatchCaaLoginLogger.logOtpLoginButtonClicked(this.submittedContactPoint, otpFunnel.source);
            hatchCaaLoginLogger.logLoginAttempt(this.submittedContactPoint, hatchCaaLoginEventStep, HatchCaaLoginCredentialType.OTP, null);
        }
        String str2 = C3cG.A0F(this).otp;
        String str3 = this.authState;
        if (str3 == null) {
            logOtpOutcomeFailure(C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.SESSION_EXPIRED, HatchCaaStage.CONFIRM_OTP.getValue()));
            restartFromPhoneEntry(SESSION_EXPIRED_DIALOG);
        } else if (claimLoading()) {
            C3cI.A1F(this, AnonymousClass001.A0y(), new C126241(str3, str2, null), AEu.A00(this));
        } else {
            logOtpOutcomeFailure(C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.ALREADY_LOADING, HatchCaaStage.CONFIRM_OTP.getValue()));
        }
    }

    public final void onOtpScreenLeft(boolean z, boolean z2) {
        if (!z2) {
            abandonCheckpointExchange();
        }
        if (!z || C3cG.A0F(this).otpFlow != HatchAuthFlow.Register) {
            clearOtpEntry();
            return;
        }
        this.pendingSmsCode = null;
        HoC hoC = this.smsConsentJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.smsConsentJob = null;
    }

    public final void onPasswordBackClicked() {
        logClick(HatchScreen.LOGIN_PASSWORD, HatchComponent.BACK_BUTTON, "password_back", AGH.A0E());
    }

    public final void onPasswordConfirmClicked() {
        logClick(HatchScreen.LOGIN_PASSWORD, HatchComponent.CONFIRM_PASSWORD_BUTTON, "confirm_password", AGH.A0E());
        HatchCaaLoginEventStep hatchCaaLoginEventStep = HatchCaaLoginEventStep.PASSWORD;
        this.rememberDeviceAnswer = rememberDeviceAnswerAt(hatchCaaLoginEventStep);
        HatchCaaLoginLogger hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
        hatchCaaLoginLogger.logPasswordLoginButtonClicked(this.submittedContactPoint);
        hatchCaaLoginLogger.logLoginAttempt(this.submittedContactPoint, hatchCaaLoginEventStep, HatchCaaLoginCredentialType.PASSWORD, null);
        String str = this.authState;
        if (str == null) {
            logPasswordOutcomeFailure(C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.SESSION_EXPIRED, HatchCaaStage.CONFIRM_PASSWORD.getValue()));
            restartFromPhoneEntry(SESSION_EXPIRED_DIALOG);
            return;
        }
        String str2 = C3cG.A0F(this).password;
        if (!claimLoading()) {
            logPasswordOutcomeFailure(C3cG.A0B(HatchCaaFailure.Companion, HatchCaaErrorType.ALREADY_LOADING, HatchCaaStage.CONFIRM_PASSWORD.getValue()));
        } else {
            C3cI.A1F(this, AnonymousClass001.A0y(), new C126251(str2, this, str, null), AEu.A00(this));
        }
    }

    public final void onPasswordScreenLeft(boolean z) {
        NativeLoginUiState value;
        Companion companion;
        if (z) {
            return;
        }
        abandonCheckpointExchange();
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            companion = Companion;
        } while (!C3cI.A1U(NativeLoginField.PASSWORD, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, "", false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -65537, 67108863, null), companion, value, blg));
    }

    public final void onPhoneEntryScreenLeft(boolean z) {
        if (z) {
            return;
        }
        abandonCheckpointExchange();
    }

    public final void onReactivateCancelled() {
        logClick(HatchScreen.LOGIN_REACTIVATION, HatchComponent.CANCEL_BUTTON, "reactivate_cancel", AGH.A0E());
        emitEffect(NativeLoginViewEffect.PopToLanding.INSTANCE);
        clearForRestart();
    }

    public final void onReactivationRestoredWithoutChallenge() {
        emitEffect(NativeLoginViewEffect.PopToLanding.INSTANCE);
    }

    public final void onRemoveProfilesDismissed() {
        logClick(HatchScreen.LOGIN_LANDING, HatchComponent.DELETE_CANCEL_BUTTON, REMOVE_SAVED_ACCOUNT_STEP, AGH.A0E());
    }

    public final void onSignupStepShown() {
        if (this.pendingCompletionInputs == null) {
            if (this.logsNameStep) {
                HatchCaaRegistrationLogger.INSTANCE.logNameStart(this.submittedContactPoint);
            }
            if (C3cG.A0F(this).collectsSignupBirthday) {
                HatchCaaRegistrationLogger.INSTANCE.logBirthdayStart(this.submittedContactPoint);
            }
        }
    }

    public final void onSmsConsentResult(String str) {
        NativeLoginUiState value;
        List<String> listExtractCodes = SmsOtpUserConsent.INSTANCE.extractCodes(str, 6);
        String str2 = (String) AbstractC0878AGe.A0G(listExtractCodes);
        if (str2 != null) {
            boolean z = listExtractCodes.size() == 1;
            if (this.authState == null) {
                if (z) {
                    this.pendingSmsCode = str2;
                    return;
                }
                return;
            }
            BLG<NativeLoginUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!C3cI.A1U(NativeLoginField.OTP, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, str2, false, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -2049, 67108863, null), Companion, value, blg));
            if (z) {
                onOtpConfirmClicked();
            }
        }
    }

    public final void onSmsNotificationsLearnMoreClicked() {
        logClick(HatchScreen.LOGIN_CONTACT_POINT, HatchComponent.SMS_NOTIFICATIONS_LEARN_MORE_LINK, "sms_notifications_learn_more", AGH.A0E());
    }

    public final void onTwoFactorConfirmClicked() {
        logClick(HatchScreen.LOGIN_OTP, HatchComponent.CONFIRM_TWO_FACTOR_BUTTON, "confirm_two_factor", AGH.A0E());
        String str = this.twoFactorState;
        HatchTwoFactorMethod hatchTwoFactorMethod = this.twoFactorMethod;
        if (str == null || hatchTwoFactorMethod == null) {
            restartFromPhoneEntry(SESSION_EXPIRED_DIALOG);
            return;
        }
        String str2 = C3cG.A0F(this).twoFactorCode;
        String str3 = this.twoFactorTosContentVersion;
        HatchAttestationRequest hatchAttestationRequest = this.twoFactorAttestationRequest;
        if (claimLoading()) {
            HatchCaaLoginLogger.INSTANCE.logTwoFactorConfirmNextClicked(this.submittedContactPoint);
            C3cI.A1F(this, AnonymousClass001.A0y(), new C126301(str, hatchTwoFactorMethod, str2, str3, hatchAttestationRequest, null), AEu.A00(this));
        }
    }

    public final void onTwoFactorResendClicked() {
        NativeLoginUiState value;
        Companion companion;
        logClick(HatchScreen.LOGIN_OTP, HatchComponent.TWO_FACTOR_RESEND_BUTTON, "two_factor_resend", AGH.A0E());
        String str = this.twoFactorState;
        HatchTwoFactorMethod hatchTwoFactorMethod = this.twoFactorMethod;
        if (str == null || hatchTwoFactorMethod == null) {
            restartFromPhoneEntry(SESSION_EXPIRED_DIALOG);
            return;
        }
        if (hatchTwoFactorMethod.type == HatchTwoFactorMethodType.SMS) {
            cancelPendingAttempts();
            if (claimLoading()) {
                BLG<NativeLoginUiState> blg = this._uiState;
                do {
                    value = blg.getValue();
                    companion = Companion;
                } while (!C3cI.A1U(NativeLoginField.TWO_FACTOR_CODE, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, "", null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -524289, 67108863, null), companion, value, blg));
                sendTwoFactorCode(str, hatchTwoFactorMethod);
            }
        }
    }

    public final void onTwoFactorScreenLeft(boolean z) {
        NativeLoginUiState value;
        Companion companion;
        if (!z) {
            abandonCheckpointExchange();
        }
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            companion = Companion;
        } while (!C3cI.A1U(NativeLoginField.TWO_FACTOR_CODE, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, null, false, null, "", null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -524289, 67108863, null), companion, value, blg));
    }

    public final void onUsePasswordInsteadClicked() {
        NativeLoginUiState value;
        logClick(HatchScreen.LOGIN_OTP, HatchComponent.USE_PASSWORD_INSTEAD_BUTTON, "use_password_instead", AGH.A0E());
        HatchCaaLoginLogger.INSTANCE.logEnterPasswordInsteadClicked(this.submittedContactPoint);
        cancelPendingAttempts();
        BLG<NativeLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, NativeLoginUiState.copy$default(value, null, null, null, null, null, null, false, null, null, null, false, null, false, null, false, null, "", false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, false, -65537, 66961407, null)));
        emitEffect(NativeLoginViewEffect.NavigateToPassword.INSTANCE);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126312(null), AEu.A00(this));
    }

    public static /* synthetic */ void completeRegistration$default(NativeLoginViewModel nativeLoginViewModel, HatchAuthCredentials hatchAuthCredentials, String str, boolean z, PendingCompletionInputs pendingCompletionInputs, int i, Object obj) {
        boolean zA1O = AnonymousClass005.A1O(i, z);
        if ((i & 8) != 0) {
            pendingCompletionInputs = null;
        }
        nativeLoginViewModel.completeRegistration(hatchAuthCredentials, str, zA1O, pendingCompletionInputs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object discoverableOfferIncludesGoogle(HtJ<? super Boolean> htJ) {
        boolean z;
        if (googleSignInIsButton()) {
            z = false;
        } else {
            if (NativeLoginViewModelKt.canCheckGoogleAccount) {
                return NativeLoginGoogleSignIn.INSTANCE.mayHaveGoogleAccount(this.application, htJ);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitEffect(NativeLoginViewEffect nativeLoginViewEffect) {
        AnonymousClass001.A1J(new C125981(nativeLoginViewEffect, null), AEu.A00(this));
    }

    private final boolean enforceAccountCreationAgeGate() {
        if (!NativeLoginBirthdayKt.isInvalidAgeBlocked()) {
            return true;
        }
        showErrorDialog(AGE_BLOCKED_DIALOG, null);
        return false;
    }

    private final boolean entryScreenIsIdle() {
        NativeLoginUiState nativeLoginUiStateA0F = C3cG.A0F(this);
        return this.authState == null && !nativeLoginUiStateA0F.isLoading && nativeLoginUiStateA0F.errorDialog == null && nativeLoginUiStateA0F.fieldError == null && nativeLoginUiStateA0F.identifierError == null && nativeLoginUiStateA0F.selectedAccountId == null;
    }

    private final String getTypedContactPoint() {
        String strA0l = AnonymousClass002.A0l(C3cG.A0F(this).identifier);
        if (C7BY.A0j(strA0l)) {
            return null;
        }
        return strA0l;
    }

    private final HoC launchDiscoverablePasskey(int i) {
        BLL bllA00 = AEu.A00(this);
        return GAo.A02(C79.A00, AnonymousClass001.A0y(), new C126061(i, null), bllA00);
    }

    private final void leaveForContactPointEntry() {
        leavePicker();
        HatchAuthFlowContext hatchAuthFlowContext = HatchAuthFlowContext.INSTANCE;
        C3cG.A1E(hatchAuthFlowContext, HatchCaaEntryPoint.LOGIN_HOME);
        hatchAuthFlowContext.setLoginFlow(null, null);
        emitEffect(NativeLoginViewEffect.NavigateToPhoneEntry.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logLandingImpression() {
        AHD<NativeLoginAccountUiModel> ahd = C3cG.A0F(this).accounts;
        if (ahd.isEmpty() || !HatchAuthFlowContext.INSTANCE.claimLandingImpression()) {
            return;
        }
        boolean zIsAymhSurface = NativeLoginModelsKt.isAymhSurface(ahd);
        String strA0k = AnonymousClass002.A0k();
        boolean z = false;
        if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
            Iterator it = ahd.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((NativeLoginAccountUiModel) it.next()).hasHatch) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it2 = ahd.iterator();
        while (it2.hasNext()) {
            arrayListA0i.add(rowSource((NativeLoginAccountUiModel) it2.next()));
        }
        HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts = NativeLoginCaaSourceKt.ssoSourceCounts(arrayListA0i);
        HatchCaaLoginLogger hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
        String str = this.submittedContactPoint;
        Integer numValueOf = Integer.valueOf(ahd.size());
        Boolean boolValueOf = Boolean.valueOf(z);
        if (zIsAymhSurface) {
            hatchCaaLoginLogger.logAymhPageShown(str, ssoSourceCounts, numValueOf, boolValueOf, strA0k);
        } else {
            hatchCaaLoginLogger.logNtpLandingStart(str, ssoSourceCounts, numValueOf, boolValueOf, strA0k);
        }
        for (NativeLoginAccountUiModel nativeLoginAccountUiModel : ahd) {
            HatchAuthFlowContext.SsoSourceCounts ssoSourceCountsRowSourceCounts = rowSourceCounts(nativeLoginAccountUiModel);
            HatchCaaLoginLogger hatchCaaLoginLogger2 = HatchCaaLoginLogger.INSTANCE;
            String str2 = this.submittedContactPoint;
            boolean z2 = nativeLoginAccountUiModel.hasHatch;
            if (zIsAymhSurface) {
                hatchCaaLoginLogger.logAymhPageShownPerAccount(str2, ssoSourceCountsRowSourceCounts, z2, strA0k);
            } else {
                hatchCaaLoginLogger.logNtpLandingShownPerAccount(str2, ssoSourceCountsRowSourceCounts, z2, strA0k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logOtpOutcomeFailure(HatchCaaFailure hatchCaaFailure) {
        OtpFunnel otpFunnel = getOtpFunnel();
        if (!otpFunnel.isRegistration) {
            HatchCaaLoginLogger.INSTANCE.logOtpLoginFailed(this.submittedContactPoint, otpFunnel.source, hatchCaaFailure);
            return;
        }
        HatchCaaRegistrationLogger hatchCaaRegistrationLogger = HatchCaaRegistrationLogger.INSTANCE;
        String str = this.submittedContactPoint;
        HatchCaaFlowSource hatchCaaFlowSource = otpFunnel.source;
        HatchNtpSourceApp hatchNtpSourceApp = this.ntpSourceApp;
        hatchCaaRegistrationLogger.logConfirmationFailure(str, hatchCaaFlowSource, hatchCaaFailure, hatchNtpSourceApp != null ? NativeLoginCaaSourceKt.toNtpSourcePlatform(hatchNtpSourceApp) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logPickerUnavailable(Map<String, NativeLoginSsoAccount> map, Throwable th) {
        Collection<NativeLoginSsoAccount> collectionValues = map.values();
        ArrayList arrayListA0i = AnonymousClass003.A0i(collectionValues);
        Iterator<NativeLoginSsoAccount> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(new NativeLoginRowSource(Collections.singletonList(it.next().sourceApp), false));
        }
        HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts = NativeLoginCaaSourceKt.ssoSourceCounts(arrayListA0i);
        if (th != null) {
            HatchCaaLoginLogger.INSTANCE.logAymhProfileLoadFailed(this.submittedContactPoint, ssoSourceCounts, map.size(), C3cG.A0C(HatchCaaStage.SSO_ACCOUNT_INFO, th));
        } else {
            HatchCaaLoginLogger.INSTANCE.logAymhScreenSkippedNoProfiles(this.submittedContactPoint, ssoSourceCounts, map.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean mayConcedeToGoogle() {
        return entryScreenIsIdle() && !this.contactPointTouched;
    }

    public static /* synthetic */ void navigateToBirthday$default(NativeLoginViewModel nativeLoginViewModel, HatchAuthCredentials hatchAuthCredentials, boolean z, boolean z2, int i, Object obj) {
        nativeLoginViewModel.navigateToBirthday(hatchAuthCredentials, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2));
    }

    public static /* synthetic */ void navigateToNtpUpsell$default(NativeLoginViewModel nativeLoginViewModel, HatchAuthCredentials hatchAuthCredentials, String str, boolean z, int i, Object obj) {
        nativeLoginViewModel.navigateToNtpUpsell(hatchAuthCredentials, str, AnonymousClass005.A1O(i, z));
    }

    private final void observeEntryScreenIdle() {
        AnonymousClass001.A1J(new C126091(null), AEu.A00(this));
    }

    private final void observeLandingIdle() {
        AnonymousClass001.A1J(new C126101(null), AEu.A00(this));
    }

    private final void observeSignOut() {
        AnonymousClass001.A1J(new C126111(null), AEu.A00(this));
    }

    private final String offeredSourceApps(List<NativeLoginAccountUiModel> list) {
        HatchSsoSourceApp hatchSsoSourceApp;
        String wireValue;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<NativeLoginAccountUiModel> it = list.iterator();
        while (it.hasNext()) {
            NativeLoginSsoAccount nativeLoginSsoAccount = this.ssoSelections.get(it.next().id);
            if (nativeLoginSsoAccount != null && (hatchSsoSourceApp = nativeLoginSsoAccount.sourceApp) != null && (wireValue = hatchSsoSourceApp.getWireValue()) != null) {
                arrayListA0h.add(wireValue);
            }
        }
        return C3cH.A0e(",", AbstractC0878AGe.A0W(C3cG.A0m(arrayListA0h)));
    }

    private final void onRememberedAccountSelected(NativeLoginAccountUiModel nativeLoginAccountUiModel, AuraRememberedAccount auraRememberedAccount) {
        String str;
        if (claimLoading()) {
            leavePicker();
            HatchAuthFlowContext.SsoSourceCounts ssoSourceCountsRowSourceCounts = rowSourceCounts(nativeLoginAccountUiModel);
            String str2 = auraRememberedAccount.contactPoint;
            NativeLoginIdentifier nativeLoginIdentifier = str2 != null ? NativeLoginIdentifierKt.classifyLoginIdentifier(str2, C3cG.A0F(this).selectedCountry.iso).identifier : null;
            if (nativeLoginIdentifier instanceof NativeLoginIdentifier.Phone) {
                str = ((NativeLoginIdentifier.Phone) nativeLoginIdentifier).e164;
            } else if (nativeLoginIdentifier instanceof NativeLoginIdentifier.Email) {
                str = ((NativeLoginIdentifier.Email) nativeLoginIdentifier).address;
            } else {
                if (nativeLoginIdentifier != null) {
                    throw C3cG.A0q();
                }
                str = null;
            }
            this.submittedContactPoint = str;
            clearRegistrationSource();
            resetRememberDeviceValue();
            HatchAuthFlowContext.INSTANCE.setLoginFlow(HatchCaaEventFlow.AYMH.getValue(), pickerSourceCounts());
            signingInAs(nativeLoginAccountUiModel.id, new C126281(auraRememberedAccount, ssoSourceCountsRowSourceCounts, null));
        }
    }

    private final HatchAuthFlowContext.SsoSourceCounts pickerSourceCounts() {
        AHD<NativeLoginAccountUiModel> ahd = C3cG.A0F(this).accounts;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(rowSource((NativeLoginAccountUiModel) it.next()));
        }
        return NativeLoginCaaSourceKt.ssoSourceCounts(arrayListA0i);
    }

    private final void prefetchTempToken() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126321(null), AEu.A00(this));
    }

    private final void rearmOfferForLiveEntryScreen() {
        if (!topEntryScreenOffersCredentials() || liveHostActivity() == null || armPasskeyOffer()) {
            return;
        }
        concedeToGoogleIfIdle();
    }

    private final void relistPicker() {
        C9jH c9jHA0E = AGH.A0E();
        this.ssoSelections = c9jHA0E;
        this.ssoRowSources = c9jHA0E;
        NativeLoginPrefetch.INSTANCE.cleanup();
        resolveAccounts(null);
    }

    private final HatchCaaLoginLogger.PasswordSavingAnswer rememberDeviceAnswerAt(HatchCaaLoginEventStep hatchCaaLoginEventStep) {
        Boolean bool = C3cG.A0F(this).rememberDeviceValue;
        if (bool != null) {
            return new HatchCaaLoginLogger.PasswordSavingAnswer(hatchCaaLoginEventStep, bool.booleanValue(), isRegistrationStep(hatchCaaLoginEventStep));
        }
        return null;
    }

    private final void resolveAccounts(NativeLoginCaaStartupTracker nativeLoginCaaStartupTracker) {
        int iCancelLandingReads = cancelLandingReads();
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126371(iCancelLandingReads, nativeLoginCaaStartupTracker, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartFromPhoneEntry(NativeLoginErrorDialogContent nativeLoginErrorDialogContent) {
        clearForRestart();
        showErrorDialog(nativeLoginErrorDialogContent, null);
        emitEffect(NativeLoginViewEffect.PopToPhoneEntry.INSTANCE);
    }

    private final void restoreBirthdayInputsFromItems() {
        PendingCompletionInputs pendingCompletionInputs;
        if (!(C3cG.A0F(this).itemizedConsentTarget instanceof NativeLoginItemizedConsentTarget.Completion) || (pendingCompletionInputs = this.pendingCompletionInputs) == null) {
            return;
        }
        restoreBirthdayInputs(pendingCompletionInputs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void returnToBirthdayFromItems(PendingCompletionInputs pendingCompletionInputs) {
        restoreBirthdayInputs(pendingCompletionInputs);
        emitEffect(NativeLoginViewEffect.ReturnToBirthday.INSTANCE);
    }

    private final void routeIntroOnDeviceRead() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126381(null), AEu.A00(this));
    }

    private final HatchAuthFlowContext.SsoSourceCounts rowSourceCounts(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        return NativeLoginCaaSourceKt.ssoSourceCounts(Collections.singletonList(rowSource(nativeLoginAccountUiModel)));
    }

    private final void sendTwoFactorCode(String str, HatchTwoFactorMethod hatchTwoFactorMethod) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126421(str, hatchTwoFactorMethod, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRememberedMuseProfilesWhenRead(C27k<? extends Map<String, HatchMuseProfile>> c27k) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126431(c27k, this, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ssoRefusalIsSignup(Throwable th) {
        HatchAuthError hatchAuthErrorA09 = C3cJ.A09(th);
        return C7384Etj.areEqual(hatchAuthErrorA09, HatchAuthError.NoLinkedAccount.INSTANCE) || C7384Etj.areEqual(hatchAuthErrorA09, HatchAuthError.CreateBlocked.INSTANCE) || C7384Etj.areEqual(hatchAuthErrorA09, HatchAuthError.Underage.INSTANCE) || C7384Etj.areEqual(hatchAuthErrorA09, HatchAuthError.UnderageRegistration.INSTANCE) || C7384Etj.areEqual(hatchAuthErrorA09, HatchAuthError.RegistrationDisabled.INSTANCE);
    }

    private final HatchCaaStage stageOf(HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginCredentialType hatchCaaLoginCredentialType) {
        switch (hatchCaaLoginEventStep.ordinal()) {
            case 0:
                break;
            case 1:
                return HatchCaaStage.CONFIRM_OTP;
            case 2:
                return HatchCaaStage.CONFIRM_PASSKEY;
            case 3:
                return HatchCaaStage.CONFIRM_PASSWORD;
            case 4:
                return HatchCaaStage.REGISTER_COMPLETION;
            case 5:
                if (hatchCaaLoginCredentialType == HatchCaaLoginCredentialType.NONCE) {
                    return HatchCaaStage.DBL_LOGIN;
                }
                break;
            case 6:
                return HatchCaaStage.SELECT_ACCOUNT;
            case 7:
                return HatchCaaStage.TWO_FACTOR;
            default:
                throw C3cG.A0q();
        }
        return HatchCaaStage.SSO_EXCHANGE;
    }

    public final boolean autoFocusesIdentifier() {
        return googleSignInIsButton();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[PHI: r2
  0x0016: PHI (r2v2 boolean) = (r2v1 boolean), (r2v4 boolean) binds: [B:3:0x0009, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.login.nativeflow.OtpFunnel getOtpFunnel() {
        /*
            r2 = this;
            com.facebook.aura.login.nativeflow.NativeLoginUiState r0 = X.C3cG.A0F(r2)
            com.facebook.aura.login.nativeflow.HatchAuthFlow r1 = r0.otpFlow
            com.facebook.aura.login.nativeflow.HatchAuthFlow r0 = com.facebook.aura.login.nativeflow.HatchAuthFlow.Login
            r2 = 0
            if (r1 == r0) goto L16
            r2 = 1
            if (r1 != 0) goto L16
            com.facebook.aura.analytics.hatch.caa.HatchCaaFlowSource r1 = com.facebook.aura.analytics.hatch.caa.HatchCaaFlowSource.FALLBACK
        L10:
            com.facebook.aura.login.nativeflow.OtpFunnel r0 = new com.facebook.aura.login.nativeflow.OtpFunnel
            r0.<init>(r2, r1)
            return r0
        L16:
            com.facebook.aura.analytics.hatch.caa.HatchCaaFlowSource r1 = com.facebook.aura.analytics.hatch.caa.HatchCaaFlowSource.SERVER
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.getOtpFunnel():com.facebook.aura.login.nativeflow.OtpFunnel");
    }

    public final void onBirthdayBackClicked() {
        logBirthdayStepBack();
        restartFromPhoneEntry();
    }

    public final void onCheckpointPrimaryClicked() {
        NativeLoginUiState nativeLoginUiStateA0F = C3cG.A0F(this);
        if (nativeLoginUiStateA0F.checkpoint == null || nativeLoginUiStateA0F.isLoading) {
            return;
        }
        int iOrdinal = nativeLoginUiStateA0F.checkpointPrimaryAction.ordinal();
        if (iOrdinal == 0) {
            onCheckpointContinueClicked();
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            onCheckpointSignInAgainClicked();
        }
    }

    public final void onCheckpointWebShown() {
        NativeLoginUiState nativeLoginUiStateA0F = C3cG.A0F(this);
        if (nativeLoginUiStateA0F.checkpoint == null || !nativeLoginUiStateA0F.checkpointWebViewVisible) {
            emitEffect(NativeLoginViewEffect.CloseCheckpointWeb.INSTANCE);
        }
    }

    public final void onCreateNewAccountClicked() {
        logLandingImpression();
        logClick(HatchScreen.LOGIN_LANDING, HatchComponent.USE_CONTACT_POINT_BUTTON, "create_new_account", AGH.A0E());
        C3cG.A1E(HatchAuthFlowContext.INSTANCE, NativeLoginModelsKt.isAymhSurface(C3cG.A0F(this).accounts) ? HatchCaaEntryPoint.AYMH : HatchCaaEntryPoint.NTP_LANDING);
        HatchCaaRegistrationLogger.INSTANCE.logRegistrationStart(HatchCaaRegistrationEventStep.LANDING, this.submittedContactPoint, null, HatchCaaEventFlow.NEW_TO_META, null, null, null);
        leaveForContactPointEntry();
    }

    public final void onGoogleSignInClicked() {
        Activity activityLiveHostActivity = liveHostActivity();
        if (activityLiveHostActivity == null || !this.googleSignInSheetOpen.compareAndSet(false, true)) {
            return;
        }
        logClick(HatchScreen.LOGIN_CONTACT_POINT, HatchComponent.GOOGLE_SIGN_IN_BUTTON, "sso_google", AGH.A0E());
        this.googleSignInRequested.set(true);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C126171(activityLiveHostActivity, this, null), AEu.A00(this));
    }

    public final void onNtpUpsellAcceptClicked() {
        if (enforceAccountCreationAgeGate()) {
            logClick(HatchScreen.LOGIN_NTP_UPSELL, HatchComponent.NTP_UPSELL_ACCEPT_BUTTON, "ntp_upsell_accept", AGH.A0E());
            acceptNtpUpsellOffer(false);
        }
    }

    public final void onNtpUpsellChoiceNeutralUseAnotherAccountClicked() {
        logNtpUpsellUseAnotherAccountClick();
        leaveNtpUpsellChoice();
    }

    public final void onNtpUpsellNeutralUseAnotherAccountClicked() {
        logNtpUpsellUseAnotherAccountClick();
        leaveNtpUpsell();
    }

    public final void onReactivateConfirmed() {
        HatchReactivationChallenge hatchReactivationChallenge = C3cG.A0F(this).reactivation;
        if (hatchReactivationChallenge != null) {
            logClick(HatchScreen.LOGIN_REACTIVATION, HatchComponent.LOGIN_REACTIVATE_BUTTON, AuraSubscriptionRepositoryJsonKt.CHANGE_ACTION_REACTIVATE, AGH.A0E());
            if (claimLoading()) {
                C3cI.A1F(this, AnonymousClass001.A0y(), new C126271(hatchReactivationChallenge, null), AEu.A00(this));
            }
        }
    }

    public final void onRemoveProfilesOpened() {
        logLandingImpression();
        logClick(HatchScreen.LOGIN_LANDING, HatchComponent.THREE_DOTS_MENU, REMOVE_SAVED_ACCOUNT_STEP, AGH.A0E());
    }

    public final void onTosDisclosureClicked(HatchScreen hatchScreen, String str) {
        AnonymousClass003.A0u(hatchScreen, str);
        logClick(hatchScreen, HatchComponent.TOS_DISCLOSURE_LINK, FGI.A0M("tos_", str), AnonymousClass007.A0c(HatchMetadataKey.TOS_KIND, str));
    }

    public final void onUseEmailOrPhoneClicked() {
        logLandingImpression();
        logClick(HatchScreen.LOGIN_LANDING, HatchComponent.USE_CONTACT_POINT_BUTTON, "use_contact_point", AGH.A0E());
        boolean zIsAymhSurface = NativeLoginModelsKt.isAymhSurface(C3cG.A0F(this).accounts);
        HatchCaaLoginLogger hatchCaaLoginLogger = HatchCaaLoginLogger.INSTANCE;
        String str = this.submittedContactPoint;
        if (zIsAymhSurface) {
            hatchCaaLoginLogger.logAymhLogIntoAnotherAccountClicked(str);
        } else {
            hatchCaaLoginLogger.logNtpLandingSwitchToLogin(str);
        }
        leaveForContactPointEntry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x042f A[Catch: all -> 0x04d3, TRY_ENTER, TryCatch #0 {, blocks: (B:108:0x0356, B:110:0x035a, B:94:0x02b4, B:96:0x02b8, B:127:0x042f, B:129:0x0433, B:52:0x0174, B:54:0x0178, B:56:0x017e), top: B:146:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021e A[Catch: all -> 0x042b, TryCatch #1 {all -> 0x042b, blocks: (B:75:0x021a, B:77:0x021e, B:78:0x0235, B:80:0x0246, B:82:0x0259, B:84:0x025d, B:88:0x02a4, B:90:0x02a8, B:91:0x02ac, B:85:0x0273, B:87:0x0279, B:72:0x01f3), top: B:147:0x01f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0235 A[Catch: all -> 0x042b, TryCatch #1 {all -> 0x042b, blocks: (B:75:0x021a, B:77:0x021e, B:78:0x0235, B:80:0x0246, B:82:0x0259, B:84:0x025d, B:88:0x02a4, B:90:0x02a8, B:91:0x02ac, B:85:0x0273, B:87:0x0279, B:72:0x01f3), top: B:147:0x01f3 }] */
    /* JADX WARN: Type inference failed for: r11v8, types: [X.HoC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object offerDiscoverablePasskey(int r73, X.HtJ<? super java.lang.Boolean> r74) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel.offerDiscoverablePasskey(int, X.HtJ):java.lang.Object");
    }

    private final void restartFromPhoneEntry() {
        clearForRestart();
        emitEffect(NativeLoginViewEffect.PopToPhoneEntry.INSTANCE);
    }
}
