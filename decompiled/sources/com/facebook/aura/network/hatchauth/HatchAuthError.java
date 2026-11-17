package com.facebook.aura.network.hatchauth;

import X.C06G;
import com.facebook.aura.analytics.hatch.caa.HatchCaaErrorType;

/* loaded from: classes2.dex */
public interface HatchAuthError {

    public final class AccountCreatedWithoutSession implements HatchAuthError {
        public static final AccountCreatedWithoutSession INSTANCE = new AccountCreatedWithoutSession();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AccountCreatedWithoutSession);
        }

        public String toString() {
            return "AccountCreatedWithoutSession";
        }

        public int hashCode() {
            return 259081473;
        }
    }

    public final class AdditionalVerificationRequired implements HatchAuthError {
        public static final AdditionalVerificationRequired INSTANCE = new AdditionalVerificationRequired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AdditionalVerificationRequired);
        }

        public String toString() {
            return "AdditionalVerificationRequired";
        }

        public int hashCode() {
            return -1011096807;
        }
    }

    public final class CheckpointRequired implements HatchAuthError {
        public static final CheckpointRequired INSTANCE = new CheckpointRequired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckpointRequired);
        }

        public String toString() {
            return "CheckpointRequired";
        }

        public int hashCode() {
            return 2054522559;
        }
    }

    public final class CompletionHandleInvalid implements HatchAuthError {
        public static final CompletionHandleInvalid INSTANCE = new CompletionHandleInvalid();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CompletionHandleInvalid);
        }

        public String toString() {
            return "CompletionHandleInvalid";
        }

        public int hashCode() {
            return -428060229;
        }
    }

    public final class ContactPointIsTwoFactorMethod implements HatchAuthError {
        public static final ContactPointIsTwoFactorMethod INSTANCE = new ContactPointIsTwoFactorMethod();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ContactPointIsTwoFactorMethod);
        }

        public String toString() {
            return "ContactPointIsTwoFactorMethod";
        }

        public int hashCode() {
            return 245474570;
        }
    }

    public final class ContactPointRequiresPasswordLogin implements HatchAuthError {
        public static final ContactPointRequiresPasswordLogin INSTANCE = new ContactPointRequiresPasswordLogin();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ContactPointRequiresPasswordLogin);
        }

        public String toString() {
            return "ContactPointRequiresPasswordLogin";
        }

        public int hashCode() {
            return 538034328;
        }
    }

    public final class CreateBlocked implements HatchAuthError {
        public static final CreateBlocked INSTANCE = new CreateBlocked();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CreateBlocked);
        }

        public String toString() {
            return "CreateBlocked";
        }

        public int hashCode() {
            return 807293144;
        }
    }

    public final class EmailAlreadyInUse implements HatchAuthError {
        public static final EmailAlreadyInUse INSTANCE = new EmailAlreadyInUse();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EmailAlreadyInUse);
        }

        public String toString() {
            return "EmailAlreadyInUse";
        }

        public int hashCode() {
            return -140696082;
        }
    }

    public final class Failed extends C06G implements HatchAuthError {
        public final int httpCode;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failed) && this.httpCode == ((Failed) obj).httpCode);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = failed.httpCode;
            }
            return new Failed(i);
        }

        public final int component1() {
            return this.httpCode;
        }

        public final Failed copy(int i) {
            return new Failed(i);
        }

        public final int getHttpCode() {
            return this.httpCode;
        }

        public int hashCode() {
            return this.httpCode;
        }

        public Failed(int i) {
            this.httpCode = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class InvalidCode implements HatchAuthError {
        public static final InvalidCode INSTANCE = new InvalidCode();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidCode);
        }

        public String toString() {
            return "InvalidCode";
        }

        public int hashCode() {
            return -816591348;
        }
    }

    public final class InvalidPassword implements HatchAuthError {
        public static final InvalidPassword INSTANCE = new InvalidPassword();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidPassword);
        }

        public String toString() {
            return "InvalidPassword";
        }

        public int hashCode() {
            return -1043090630;
        }
    }

    public final class InvalidRequest implements HatchAuthError {
        public static final InvalidRequest INSTANCE = new InvalidRequest();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidRequest);
        }

        public String toString() {
            return "InvalidRequest";
        }

        public int hashCode() {
            return -224138736;
        }
    }

    public final class InvalidSelection implements HatchAuthError {
        public static final InvalidSelection INSTANCE = new InvalidSelection();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidSelection);
        }

        public String toString() {
            return "InvalidSelection";
        }

        public int hashCode() {
            return 1236110541;
        }
    }

    public final class InvalidSsoToken implements HatchAuthError {
        public static final InvalidSsoToken INSTANCE = new InvalidSsoToken();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidSsoToken);
        }

        public String toString() {
            return "InvalidSsoToken";
        }

        public int hashCode() {
            return -1457818167;
        }
    }

    public final class InvalidTwoFactorState implements HatchAuthError {
        public static final InvalidTwoFactorState INSTANCE = new InvalidTwoFactorState();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidTwoFactorState);
        }

        public String toString() {
            return "InvalidTwoFactorState";
        }

        public int hashCode() {
            return 1985796085;
        }
    }

    public final class LinkFailed implements HatchAuthError {
        public static final LinkFailed INSTANCE = new LinkFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkFailed);
        }

        public String toString() {
            return "LinkFailed";
        }

        public int hashCode() {
            return -1343394225;
        }
    }

    public final class LinkHandleInvalid implements HatchAuthError {
        public static final LinkHandleInvalid INSTANCE = new LinkHandleInvalid();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkHandleInvalid);
        }

        public String toString() {
            return "LinkHandleInvalid";
        }

        public int hashCode() {
            return 1009937501;
        }
    }

    public final class LoginCodeSendFailed implements HatchAuthError {
        public static final LoginCodeSendFailed INSTANCE = new LoginCodeSendFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LoginCodeSendFailed);
        }

        public String toString() {
            return "LoginCodeSendFailed";
        }

        public int hashCode() {
            return 2067129603;
        }
    }

    public final class MethodDoesNotSupportSend implements HatchAuthError {
        public static final MethodDoesNotSupportSend INSTANCE = new MethodDoesNotSupportSend();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MethodDoesNotSupportSend);
        }

        public String toString() {
            return "MethodDoesNotSupportSend";
        }

        public int hashCode() {
            return -1598153674;
        }
    }

    public final class Network implements HatchAuthError {
        public static final Network INSTANCE = new Network();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Network);
        }

        public String toString() {
            return "Network";
        }

        public int hashCode() {
            return -88020042;
        }
    }

    public final class NoLinkedAccount implements HatchAuthError {
        public static final NoLinkedAccount INSTANCE = new NoLinkedAccount();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NoLinkedAccount);
        }

        public String toString() {
            return "NoLinkedAccount";
        }

        public int hashCode() {
            return -1941509349;
        }
    }

    public final class PasskeyAuthenticationFailed implements HatchAuthError {
        public static final PasskeyAuthenticationFailed INSTANCE = new PasskeyAuthenticationFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PasskeyAuthenticationFailed);
        }

        public String toString() {
            return "PasskeyAuthenticationFailed";
        }

        public int hashCode() {
            return -1206801365;
        }
    }

    public final class PendingConfirmation implements HatchAuthError {
        public static final PendingConfirmation INSTANCE = new PendingConfirmation();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PendingConfirmation);
        }

        public String toString() {
            return "PendingConfirmation";
        }

        public int hashCode() {
            return -693680908;
        }
    }

    public final class PhoneAlreadyInUse implements HatchAuthError {
        public static final PhoneAlreadyInUse INSTANCE = new PhoneAlreadyInUse();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PhoneAlreadyInUse);
        }

        public String toString() {
            return "PhoneAlreadyInUse";
        }

        public int hashCode() {
            return -724570944;
        }
    }

    public final class RateLimited implements HatchAuthError {
        public static final RateLimited INSTANCE = new RateLimited();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RateLimited);
        }

        public String toString() {
            return "RateLimited";
        }

        public int hashCode() {
            return 2120741410;
        }
    }

    public final class RegistrationBlocked implements HatchAuthError {
        public static final RegistrationBlocked INSTANCE = new RegistrationBlocked();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RegistrationBlocked);
        }

        public String toString() {
            return "RegistrationBlocked";
        }

        public int hashCode() {
            return 236684411;
        }
    }

    public final class RegistrationDisabled implements HatchAuthError {
        public static final RegistrationDisabled INSTANCE = new RegistrationDisabled();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RegistrationDisabled);
        }

        public String toString() {
            return "RegistrationDisabled";
        }

        public int hashCode() {
            return -317199923;
        }
    }

    public final class RegistrationRecoveryRequired implements HatchAuthError {
        public static final RegistrationRecoveryRequired INSTANCE = new RegistrationRecoveryRequired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RegistrationRecoveryRequired);
        }

        public String toString() {
            return "RegistrationRecoveryRequired";
        }

        public int hashCode() {
            return -886474587;
        }
    }

    public final class SessionExpired implements HatchAuthError {
        public static final SessionExpired INSTANCE = new SessionExpired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionExpired);
        }

        public String toString() {
            return HatchCaaErrorType.SESSION_EXPIRED;
        }

        public int hashCode() {
            return -538710745;
        }
    }

    public final class TosContentVersionMismatch implements HatchAuthError {
        public static final TosContentVersionMismatch INSTANCE = new TosContentVersionMismatch();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TosContentVersionMismatch);
        }

        public String toString() {
            return "TosContentVersionMismatch";
        }

        public int hashCode() {
            return 747321357;
        }
    }

    public final class TwoFactorMethodUnsupported implements HatchAuthError {
        public static final TwoFactorMethodUnsupported INSTANCE = new TwoFactorMethodUnsupported();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TwoFactorMethodUnsupported);
        }

        public String toString() {
            return "TwoFactorMethodUnsupported";
        }

        public int hashCode() {
            return 1358852753;
        }
    }

    public final class Underage implements HatchAuthError {
        public static final Underage INSTANCE = new Underage();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Underage);
        }

        public String toString() {
            return "Underage";
        }

        public int hashCode() {
            return -195901793;
        }
    }

    public final class UnderageRegistration implements HatchAuthError {
        public static final UnderageRegistration INSTANCE = new UnderageRegistration();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UnderageRegistration);
        }

        public String toString() {
            return "UnderageRegistration";
        }

        public int hashCode() {
            return 1024068856;
        }
    }
}
