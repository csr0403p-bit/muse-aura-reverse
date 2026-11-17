package com.facebook.aura.network.hatchauth;

import X.C3cJ;
import X.C7384Etj;
import X.HsJ;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.network.hatchauth.HatchAuthError;

/* loaded from: classes2.dex */
public abstract class HatchAuthErrorKt {
    public static final int HTTP_TOO_MANY_REQUESTS = 429;
    public static final int HTTP_UNAUTHORIZED = 401;
    public static final int TRANSPORT_ERROR_CODE = -1;

    public static final HatchAuthError hatchAuthErrorFrom(int i, HatchProblemJson hatchProblemJson) {
        HatchAuthError hatchAuthError;
        if (i == -1) {
            hatchAuthError = HatchAuthError.Network.INSTANCE;
        } else if (i == 401) {
            hatchAuthError = HatchAuthError.SessionExpired.INSTANCE;
        } else {
            if (i != 429) {
                return fromProblemType(hatchProblemJson != null ? hatchProblemJson.type : null, i);
            }
            hatchAuthError = HatchAuthError.RateLimited.INSTANCE;
        }
        return hatchAuthError;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final HatchAuthError fromProblemType(String str, int i) {
        HatchAuthError hatchAuthError;
        if (str != null) {
            switch (str.hashCode()) {
                case -2133104254:
                    if (str.equals("contactPointIsTwoFactorMethod")) {
                        hatchAuthError = HatchAuthError.ContactPointIsTwoFactorMethod.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -2069887664:
                    if (str.equals("createBlocked")) {
                        hatchAuthError = HatchAuthError.CreateBlocked.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -1732596319:
                    if (str.equals("additionalVerificationRequired")) {
                        hatchAuthError = HatchAuthError.AdditionalVerificationRequired.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -1637578480:
                    if (str.equals("contactPointRequiresPasswordLogin")) {
                        hatchAuthError = HatchAuthError.ContactPointRequiresPasswordLogin.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -1524011842:
                    if (str.equals("methodDoesNotSupportSend")) {
                        hatchAuthError = HatchAuthError.MethodDoesNotSupportSend.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -1275216020:
                    if (str.equals("pendingConfirmation")) {
                        hatchAuthError = HatchAuthError.PendingConfirmation.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -1249249147:
                    if (str.equals("tosContentVersionMismatch")) {
                        hatchAuthError = HatchAuthError.TosContentVersionMismatch.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -1164919211:
                    if (str.equals("registrationDisabled")) {
                        hatchAuthError = HatchAuthError.RegistrationDisabled.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -1012277945:
                    if (str.equals("checkpointRequired")) {
                        hatchAuthError = HatchAuthError.CheckpointRequired.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -953663356:
                    if (str.equals("invalidCode")) {
                        hatchAuthError = HatchAuthError.InvalidCode.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -953327213:
                    if (str.equals("noLinkedAccount")) {
                        hatchAuthError = HatchAuthError.NoLinkedAccount.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -469636031:
                    if (str.equals("invalidSsoToken")) {
                        hatchAuthError = HatchAuthError.InvalidSsoToken.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -448780505:
                    if (str.equals("underage")) {
                        hatchAuthError = HatchAuthError.Underage.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -425668557:
                    if (str.equals("completionHandleInvalid")) {
                        hatchAuthError = HatchAuthError.CompletionHandleInvalid.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -405290727:
                    if (str.equals("twoFactorMethodUnsupported")) {
                        hatchAuthError = HatchAuthError.TwoFactorMethodUnsupported.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -344850701:
                    if (str.equals("registrationBlocked")) {
                        hatchAuthError = HatchAuthError.RegistrationBlocked.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -269310664:
                    if (str.equals("phoneAlreadyInUse")) {
                        hatchAuthError = HatchAuthError.PhoneAlreadyInUse.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -60674397:
                    if (str.equals("passkeyAuthenticationFailed")) {
                        hatchAuthError = HatchAuthError.PasskeyAuthenticationFailed.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case -54908494:
                    if (str.equals("invalidPassword")) {
                        hatchAuthError = HatchAuthError.InvalidPassword.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case 176349568:
                    if (str.equals("underageRegistration")) {
                        hatchAuthError = HatchAuthError.UnderageRegistration.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case 283723053:
                    if (str.equals("registrationRecoveryRequired")) {
                        hatchAuthError = HatchAuthError.RegistrationRecoveryRequired.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case 314564198:
                    if (str.equals("emailAlreadyInUse")) {
                        hatchAuthError = HatchAuthError.EmailAlreadyInUse.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case 453299415:
                    if (str.equals("linkFailed")) {
                        hatchAuthError = HatchAuthError.LinkFailed.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case 777569432:
                    if (str.equals("invalidRequest")) {
                        hatchAuthError = HatchAuthError.InvalidRequest.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case 1429279113:
                    if (str.equals("accountCreatedWithoutSession")) {
                        hatchAuthError = HatchAuthError.AccountCreatedWithoutSession.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case 1465197781:
                    if (str.equals("linkHandleInvalid")) {
                        hatchAuthError = HatchAuthError.LinkHandleInvalid.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case 1476301933:
                    if (str.equals("invalidTwoFactorState")) {
                        hatchAuthError = HatchAuthError.InvalidTwoFactorState.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case 1485594491:
                    if (str.equals("loginCodeSendFailed")) {
                        hatchAuthError = HatchAuthError.LoginCodeSendFailed.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
                case 1804985685:
                    if (str.equals("invalidSelection")) {
                        hatchAuthError = HatchAuthError.InvalidSelection.INSTANCE;
                        return hatchAuthError;
                    }
                    break;
            }
        }
        return new HatchAuthError.Failed(i);
    }

    public static final <T> boolean sessionExpired(Object obj) {
        return C7384Etj.areEqual(C3cJ.A09(HsJ.A00(obj)), HatchAuthError.SessionExpired.INSTANCE);
    }
}
