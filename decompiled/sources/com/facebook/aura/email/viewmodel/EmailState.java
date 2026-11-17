package com.facebook.aura.email.viewmodel;

import X.AHD;
import X.AHI;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.email.model.EmailAddressAvailability;
import com.facebook.aura.email.model.EmailMailbox;
import com.facebook.aura.email.model.EmailPermissions;
import com.facebook.aura.email.model.EmailSender;
import com.facebook.aura.email.model.EmailSetupDisplay;
import com.facebook.aura.email.model.EmailSignature;
import com.facebook.aura.email.model.EmailSummary;
import com.facebook.aura.email.viewmodel.EmailThreadUiState;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.Locale;

/* loaded from: classes.dex */
public final class EmailState extends C06G {
    public final EmailAddressAvailability addressAvailability;
    public final Boolean autoForward;
    public final boolean confirmingOwner;
    public final EmailError deleteError;
    public final String deletedThreadKey;
    public final boolean deletingMailbox;
    public final String domain;
    public final EmailError error;
    public final EmailError formError;
    public final boolean formLoading;
    public final String handle;
    public final boolean hasLoaded;
    public final boolean loading;
    public final boolean loadingMore;
    public final EmailMailbox mailbox;
    public final String mailboxDeletedKey;
    public final String nextCursor;
    public final boolean ownerAddressEdited;
    public final EmailOwnerChallenge ownerChallenge;
    public final String ownerCode;
    public final EmailOwnerCodeFailure ownerCodeFailure;
    public final boolean ownerCodeResent;
    public final String ownerConfirmedKey;
    public final EmailError ownerError;
    public final String ownerFirstName;
    public final EmailOwnerNotice ownerNotice;
    public final String ownerRecipient;
    public final String pendingResetAddress;
    public final EmailPermissions permissions;
    public final EmailError permissionsError;
    public final boolean permissionsLoaded;
    public final EmailOwnerChallenge previousOwnerChallenge;
    public final boolean pullRefreshing;
    public final String rejectedSenderName;
    public final EmailMailbox resetMailbox;
    public final boolean resetMailboxLoaded;
    public final String savedFormKey;
    public final boolean saving;
    public final String savingPermissionKey;
    public final String senderAddedKey;
    public final String senderName;
    public final String senderNameRejectionMessage;
    public final AHD<EmailSender> senders;
    public final boolean sendersBusy;
    public final String sendersCursor;
    public final EmailError sendersError;
    public final boolean sendersPullRefreshing;
    public final boolean settingsLoaded;
    public final EmailSetupDisplay setupDisplay;
    public final boolean setupFailed;
    public final boolean setupLoaded;
    public final boolean showPermissions;
    public final EmailSignature signature;
    public final boolean signatureSaving;
    public final EmailThreadUiState threadUiState;
    public final AHD<EmailSummary> threads;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailState) {
                EmailState emailState = (EmailState) obj;
                if (this.loading != emailState.loading || this.hasLoaded != emailState.hasLoaded || this.pullRefreshing != emailState.pullRefreshing || !C7384Etj.areEqual(this.mailbox, emailState.mailbox) || !C7384Etj.areEqual(this.threads, emailState.threads) || !C7384Etj.areEqual(this.nextCursor, emailState.nextCursor) || this.loadingMore != emailState.loadingMore || this.error != emailState.error || this.formLoading != emailState.formLoading || this.saving != emailState.saving || this.formError != emailState.formError || !C7384Etj.areEqual(this.handle, emailState.handle) || !C7384Etj.areEqual(this.senderName, emailState.senderName) || !C7384Etj.areEqual(this.rejectedSenderName, emailState.rejectedSenderName) || !C7384Etj.areEqual(this.senderNameRejectionMessage, emailState.senderNameRejectionMessage) || !C7384Etj.areEqual(this.domain, emailState.domain) || !C7384Etj.areEqual(this.ownerFirstName, emailState.ownerFirstName) || !C7384Etj.areEqual(this.setupDisplay, emailState.setupDisplay) || this.addressAvailability != emailState.addressAvailability || this.setupFailed != emailState.setupFailed || this.setupLoaded != emailState.setupLoaded || !C7384Etj.areEqual(this.savedFormKey, emailState.savedFormKey) || !C7384Etj.areEqual(this.threadUiState, emailState.threadUiState) || !C7384Etj.areEqual(this.deletedThreadKey, emailState.deletedThreadKey) || !C7384Etj.areEqual(this.senders, emailState.senders) || !C7384Etj.areEqual(this.sendersCursor, emailState.sendersCursor) || this.sendersBusy != emailState.sendersBusy || this.sendersPullRefreshing != emailState.sendersPullRefreshing || this.sendersError != emailState.sendersError || !C7384Etj.areEqual(this.senderAddedKey, emailState.senderAddedKey) || !C7384Etj.areEqual(this.ownerRecipient, emailState.ownerRecipient) || this.ownerAddressEdited != emailState.ownerAddressEdited || this.confirmingOwner != emailState.confirmingOwner || this.ownerError != emailState.ownerError || !C7384Etj.areEqual(this.ownerConfirmedKey, emailState.ownerConfirmedKey) || !C7384Etj.areEqual(this.ownerChallenge, emailState.ownerChallenge) || !C7384Etj.areEqual(this.previousOwnerChallenge, emailState.previousOwnerChallenge) || this.ownerNotice != emailState.ownerNotice || !C7384Etj.areEqual(this.ownerCode, emailState.ownerCode) || !C7384Etj.areEqual(this.ownerCodeFailure, emailState.ownerCodeFailure) || this.ownerCodeResent != emailState.ownerCodeResent || !C7384Etj.areEqual(this.permissions, emailState.permissions) || this.permissionsLoaded != emailState.permissionsLoaded || !C7384Etj.areEqual(this.savingPermissionKey, emailState.savingPermissionKey) || !C7384Etj.areEqual(this.signature, emailState.signature) || this.signatureSaving != emailState.signatureSaving || this.showPermissions != emailState.showPermissions || this.settingsLoaded != emailState.settingsLoaded || !C7384Etj.areEqual(this.autoForward, emailState.autoForward) || this.permissionsError != emailState.permissionsError || !C7384Etj.areEqual(this.pendingResetAddress, emailState.pendingResetAddress) || this.resetMailboxLoaded != emailState.resetMailboxLoaded || !C7384Etj.areEqual(this.resetMailbox, emailState.resetMailbox) || this.deletingMailbox != emailState.deletingMailbox || this.deleteError != emailState.deleteError || !C7384Etj.areEqual(this.mailboxDeletedKey, emailState.mailboxDeletedKey)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.loading;
    }

    public final boolean component10() {
        return this.saving;
    }

    public final EmailError component11() {
        return this.formError;
    }

    public final String component12() {
        return this.handle;
    }

    public final String component13() {
        return this.senderName;
    }

    public final String component14() {
        return this.rejectedSenderName;
    }

    public final String component15() {
        return this.senderNameRejectionMessage;
    }

    public final String component16() {
        return this.domain;
    }

    public final String component17() {
        return this.ownerFirstName;
    }

    public final EmailSetupDisplay component18() {
        return this.setupDisplay;
    }

    public final EmailAddressAvailability component19() {
        return this.addressAvailability;
    }

    public final boolean component2() {
        return this.hasLoaded;
    }

    public final boolean component20() {
        return this.setupFailed;
    }

    public final boolean component21() {
        return this.setupLoaded;
    }

    public final String component22() {
        return this.savedFormKey;
    }

    public final EmailThreadUiState component23() {
        return this.threadUiState;
    }

    public final String component24() {
        return this.deletedThreadKey;
    }

    public final AHD<EmailSender> component25() {
        return this.senders;
    }

    public final String component26() {
        return this.sendersCursor;
    }

    public final boolean component27() {
        return this.sendersBusy;
    }

    public final boolean component28() {
        return this.sendersPullRefreshing;
    }

    public final EmailError component29() {
        return this.sendersError;
    }

    public final boolean component3() {
        return this.pullRefreshing;
    }

    public final String component30() {
        return this.senderAddedKey;
    }

    public final String component31() {
        return this.ownerRecipient;
    }

    public final boolean component32() {
        return this.ownerAddressEdited;
    }

    public final boolean component33() {
        return this.confirmingOwner;
    }

    public final EmailError component34() {
        return this.ownerError;
    }

    public final String component35() {
        return this.ownerConfirmedKey;
    }

    public final EmailOwnerChallenge component36() {
        return this.ownerChallenge;
    }

    public final EmailOwnerChallenge component37() {
        return this.previousOwnerChallenge;
    }

    public final EmailOwnerNotice component38() {
        return this.ownerNotice;
    }

    public final String component39() {
        return this.ownerCode;
    }

    public final EmailMailbox component4() {
        return this.mailbox;
    }

    public final EmailOwnerCodeFailure component40() {
        return this.ownerCodeFailure;
    }

    public final boolean component41() {
        return this.ownerCodeResent;
    }

    public final EmailPermissions component42() {
        return this.permissions;
    }

    public final boolean component43() {
        return this.permissionsLoaded;
    }

    public final String component44() {
        return this.savingPermissionKey;
    }

    public final EmailSignature component45() {
        return this.signature;
    }

    public final boolean component46() {
        return this.signatureSaving;
    }

    public final boolean component47() {
        return this.showPermissions;
    }

    public final boolean component48() {
        return this.settingsLoaded;
    }

    public final Boolean component49() {
        return this.autoForward;
    }

    public final AHD<EmailSummary> component5() {
        return this.threads;
    }

    public final EmailError component50() {
        return this.permissionsError;
    }

    public final String component51() {
        return this.pendingResetAddress;
    }

    public final boolean component52() {
        return this.resetMailboxLoaded;
    }

    public final EmailMailbox component53() {
        return this.resetMailbox;
    }

    public final boolean component54() {
        return this.deletingMailbox;
    }

    public final EmailError component55() {
        return this.deleteError;
    }

    public final String component56() {
        return this.mailboxDeletedKey;
    }

    public final String component6() {
        return this.nextCursor;
    }

    public final boolean component7() {
        return this.loadingMore;
    }

    public final EmailError component8() {
        return this.error;
    }

    public final boolean component9() {
        return this.formLoading;
    }

    public final EmailAddressAvailability getAddressAvailability() {
        return this.addressAvailability;
    }

    public final Boolean getAutoForward() {
        return this.autoForward;
    }

    public final boolean getCanEditPermissions() {
        return !this.deletingMailbox && this.savingPermissionKey == null;
    }

    public final boolean getConfirmingOwner() {
        return this.confirmingOwner;
    }

    public final EmailError getDeleteError() {
        return this.deleteError;
    }

    public final String getDeletedThreadKey() {
        return this.deletedThreadKey;
    }

    public final boolean getDeletingMailbox() {
        return this.deletingMailbox;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final EmailError getError() {
        return this.error;
    }

    public final EmailError getFormError() {
        return this.formError;
    }

    public final boolean getFormLoading() {
        return this.formLoading;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final boolean getHasLoaded() {
        return this.hasLoaded;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getLoadingMore() {
        return this.loadingMore;
    }

    public final EmailMailbox getMailbox() {
        return this.mailbox;
    }

    public final String getMailboxDeletedKey() {
        return this.mailboxDeletedKey;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final String getNormalizedHandle() {
        String strA0l = AnonymousClass002.A0l(this.handle);
        Locale locale = Locale.ROOT;
        C7384Etj.A0V(locale);
        return strA0l.toLowerCase(locale);
    }

    public final boolean getOwnerAddressEdited() {
        return this.ownerAddressEdited;
    }

    public final EmailOwnerChallenge getOwnerChallenge() {
        return this.ownerChallenge;
    }

    public final String getOwnerCode() {
        return this.ownerCode;
    }

    public final EmailOwnerCodeFailure getOwnerCodeFailure() {
        return this.ownerCodeFailure;
    }

    public final boolean getOwnerCodeResent() {
        return this.ownerCodeResent;
    }

    public final String getOwnerConfirmedKey() {
        return this.ownerConfirmedKey;
    }

    public final EmailError getOwnerError() {
        return this.ownerError;
    }

    public final String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    public final EmailOwnerNotice getOwnerNotice() {
        return this.ownerNotice;
    }

    public final EmailOwnerPrimaryAction getOwnerPrimaryAction() {
        if (this.ownerChallenge == null) {
            return EmailOwnerPrimaryAction.CONFIRM_ADDRESS;
        }
        EmailOwnerCodeFailure emailOwnerCodeFailure = this.ownerCodeFailure;
        return (emailOwnerCodeFailure == null || !emailOwnerCodeFailure.getRequiresResend()) ? EmailOwnerPrimaryAction.VERIFY_CODE : EmailOwnerPrimaryAction.RESEND_CODE;
    }

    public final String getOwnerRecipient() {
        return this.ownerRecipient;
    }

    public final String getPendingResetAddress() {
        return this.pendingResetAddress;
    }

    public final EmailPermissions getPermissions() {
        return this.permissions;
    }

    public final EmailError getPermissionsError() {
        return this.permissionsError;
    }

    public final boolean getPermissionsLoaded() {
        return this.permissionsLoaded;
    }

    public final EmailOwnerChallenge getPreviousOwnerChallenge() {
        return this.previousOwnerChallenge;
    }

    public final boolean getPullRefreshing() {
        return this.pullRefreshing;
    }

    public final String getRejectedSenderName() {
        return this.rejectedSenderName;
    }

    public final EmailMailbox getResetMailbox() {
        return this.resetMailbox;
    }

    public final boolean getResetMailboxLoaded() {
        return this.resetMailboxLoaded;
    }

    public final String getSavedFormKey() {
        return this.savedFormKey;
    }

    public final boolean getSaving() {
        return this.saving;
    }

    public final String getSavingPermissionKey() {
        return this.savingPermissionKey;
    }

    public final String getSenderAddedKey() {
        return this.senderAddedKey;
    }

    public final String getSenderName() {
        return this.senderName;
    }

    public final EmailSenderNameError getSenderNameError() {
        EmailSenderNameError emailSenderNameError = EmailSenderNameKt.emailSenderNameError(this.senderName);
        if (emailSenderNameError != null) {
            return emailSenderNameError;
        }
        EmailSenderNameError emailSenderNameError2 = EmailSenderNameError.REJECTED;
        if (C7384Etj.areEqual(this.rejectedSenderName, EmailSenderNameKt.normalizedEmailSenderName(this.senderName))) {
            return emailSenderNameError2;
        }
        return null;
    }

    public final String getSenderNameRejectionMessage() {
        return this.senderNameRejectionMessage;
    }

    public final AHD<EmailSender> getSenders() {
        return this.senders;
    }

    public final boolean getSendersBusy() {
        return this.sendersBusy;
    }

    public final String getSendersCursor() {
        return this.sendersCursor;
    }

    public final EmailError getSendersError() {
        return this.sendersError;
    }

    public final boolean getSendersPullRefreshing() {
        return this.sendersPullRefreshing;
    }

    public final boolean getSettingsLoaded() {
        return this.settingsLoaded;
    }

    public final EmailSetupDisplay getSetupDisplay() {
        return this.setupDisplay;
    }

    public final boolean getSetupFailed() {
        return this.setupFailed;
    }

    public final boolean getSetupLoaded() {
        return this.setupLoaded;
    }

    public final boolean getShowPermissions() {
        return this.showPermissions;
    }

    public final EmailSignature getSignature() {
        return this.signature;
    }

    public final boolean getSignatureSaving() {
        return this.signatureSaving;
    }

    public final EmailThreadUiState getThreadUiState() {
        return this.threadUiState;
    }

    public final AHD<EmailSummary> getThreads() {
        return this.threads;
    }

    public int hashCode() {
        return ((C0KA.A01((C0KA.A01((((((C0KA.A01(C0KA.A01(C0KA.A01((((C0KA.A01((C0KA.A01((AnonymousClass005.A0I(this.ownerCode, (((((((((C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.ownerRecipient, (((C0KA.A01(C0KA.A01((AnonymousClass005.A0F(this.senders, (AnonymousClass005.A0F(this.threadUiState, (C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.addressAvailability, AnonymousClass005.A0F(this.setupDisplay, (AnonymousClass005.A0I(this.domain, (((AnonymousClass005.A0I(this.senderName, AnonymousClass005.A0I(this.handle, (C0KA.A01(C0KA.A01((C0KA.A01((AnonymousClass005.A0F(this.threads, (C0KA.A01(C0KA.A01(C0KA.A02(this.loading), this.hasLoaded), this.pullRefreshing) + AnonymousClass006.A0D(this.mailbox)) * 31) + AnonymousClass006.A0G(this.nextCursor)) * 31, this.loadingMore) + AnonymousClass006.A0D(this.error)) * 31, this.formLoading), this.saving) + AnonymousClass006.A0D(this.formError)) * 31)) + AnonymousClass006.A0G(this.rejectedSenderName)) * 31) + AnonymousClass006.A0G(this.senderNameRejectionMessage)) * 31) + AnonymousClass006.A0G(this.ownerFirstName)) * 31)), this.setupFailed), this.setupLoaded) + AnonymousClass006.A0G(this.savedFormKey)) * 31) + AnonymousClass006.A0G(this.deletedThreadKey)) * 31) + AnonymousClass006.A0G(this.sendersCursor)) * 31, this.sendersBusy), this.sendersPullRefreshing) + AnonymousClass006.A0D(this.sendersError)) * 31) + AnonymousClass006.A0G(this.senderAddedKey)) * 31), this.ownerAddressEdited), this.confirmingOwner) + AnonymousClass006.A0D(this.ownerError)) * 31) + AnonymousClass006.A0G(this.ownerConfirmedKey)) * 31) + AnonymousClass006.A0D(this.ownerChallenge)) * 31) + AnonymousClass006.A0D(this.previousOwnerChallenge)) * 31) + AnonymousClass006.A0D(this.ownerNotice)) * 31) + AnonymousClass006.A0D(this.ownerCodeFailure)) * 31, this.ownerCodeResent) + AnonymousClass006.A0D(this.permissions)) * 31, this.permissionsLoaded) + AnonymousClass006.A0G(this.savingPermissionKey)) * 31) + AnonymousClass006.A0D(this.signature)) * 31, this.signatureSaving), this.showPermissions), this.settingsLoaded) + AnonymousClass006.A0D(this.autoForward)) * 31) + AnonymousClass006.A0D(this.permissionsError)) * 31) + AnonymousClass006.A0G(this.pendingResetAddress)) * 31, this.resetMailboxLoaded) + AnonymousClass006.A0D(this.resetMailbox)) * 31, this.deletingMailbox) + AnonymousClass006.A0D(this.deleteError)) * 31) + AnonymousClass005.A0H(this.mailboxDeletedKey);
    }

    public final EmailHandleError getHandleError() {
        String normalizedHandle = getNormalizedHandle();
        int length = normalizedHandle.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            char c = '{';
            if (i2 >= length) {
                if (3 > length || length >= 33) {
                    return EmailHandleError.LENGTH;
                }
                if (C7BY.A0m(normalizedHandle, '-') || C7BY.A0l(normalizedHandle, '-') || C7BY.A0q(normalizedHandle, "--", false)) {
                    return EmailHandleError.HYPHENS;
                }
                do {
                    char cCharAt = normalizedHandle.charAt(i);
                    if ('a' <= cCharAt && cCharAt < '{') {
                        return null;
                    }
                    i++;
                } while (i < length);
                return EmailHandleError.LETTER;
            }
            char cCharAt2 = normalizedHandle.charAt(i2);
            if ('a' > cCharAt2) {
                if ('0' <= cCharAt2) {
                    c = HatchMapSceneKt.ARTIFACT_ID_SEPARATOR;
                } else {
                    if (cCharAt2 != '-') {
                        break;
                    }
                    i2++;
                }
            }
            if (cCharAt2 >= c) {
                break;
            }
            i2++;
        }
        return EmailHandleError.CHARACTERS;
    }

    public String toString() {
        return super.toString();
    }

    public EmailState(boolean z, boolean z2, boolean z3, EmailMailbox emailMailbox, AHD<EmailSummary> ahd, String str, boolean z4, EmailError emailError, boolean z5, boolean z6, EmailError emailError2, String str2, String str3, String str4, String str5, String str6, String str7, EmailSetupDisplay emailSetupDisplay, EmailAddressAvailability emailAddressAvailability, boolean z7, boolean z8, String str8, EmailThreadUiState emailThreadUiState, String str9, AHD<EmailSender> ahd2, String str10, boolean z9, boolean z10, EmailError emailError3, String str11, String str12, boolean z11, boolean z12, EmailError emailError4, String str13, EmailOwnerChallenge emailOwnerChallenge, EmailOwnerChallenge emailOwnerChallenge2, EmailOwnerNotice emailOwnerNotice, String str14, EmailOwnerCodeFailure emailOwnerCodeFailure, boolean z13, EmailPermissions emailPermissions, boolean z14, String str15, EmailSignature emailSignature, boolean z15, boolean z16, boolean z17, Boolean bool, EmailError emailError5, String str16, boolean z18, EmailMailbox emailMailbox2, boolean z19, EmailError emailError6, String str17) {
        AnonymousClass002.A1G(ahd, 4, str2);
        C7384Etj.A0Y(str3, 12);
        C7384Etj.A0Y(str6, 15);
        C7384Etj.A0Y(emailSetupDisplay, 17);
        C7384Etj.A0Y(emailAddressAvailability, 18);
        C7384Etj.A0Y(emailThreadUiState, 22);
        C7384Etj.A0Y(ahd2, 24);
        C7384Etj.A0Y(str12, 30);
        C7384Etj.A0Y(str14, 38);
        this.loading = z;
        this.hasLoaded = z2;
        this.pullRefreshing = z3;
        this.mailbox = emailMailbox;
        this.threads = ahd;
        this.nextCursor = str;
        this.loadingMore = z4;
        this.error = emailError;
        this.formLoading = z5;
        this.saving = z6;
        this.formError = emailError2;
        this.handle = str2;
        this.senderName = str3;
        this.rejectedSenderName = str4;
        this.senderNameRejectionMessage = str5;
        this.domain = str6;
        this.ownerFirstName = str7;
        this.setupDisplay = emailSetupDisplay;
        this.addressAvailability = emailAddressAvailability;
        this.setupFailed = z7;
        this.setupLoaded = z8;
        this.savedFormKey = str8;
        this.threadUiState = emailThreadUiState;
        this.deletedThreadKey = str9;
        this.senders = ahd2;
        this.sendersCursor = str10;
        this.sendersBusy = z9;
        this.sendersPullRefreshing = z10;
        this.sendersError = emailError3;
        this.senderAddedKey = str11;
        this.ownerRecipient = str12;
        this.ownerAddressEdited = z11;
        this.confirmingOwner = z12;
        this.ownerError = emailError4;
        this.ownerConfirmedKey = str13;
        this.ownerChallenge = emailOwnerChallenge;
        this.previousOwnerChallenge = emailOwnerChallenge2;
        this.ownerNotice = emailOwnerNotice;
        this.ownerCode = str14;
        this.ownerCodeFailure = emailOwnerCodeFailure;
        this.ownerCodeResent = z13;
        this.permissions = emailPermissions;
        this.permissionsLoaded = z14;
        this.savingPermissionKey = str15;
        this.signature = emailSignature;
        this.signatureSaving = z15;
        this.showPermissions = z16;
        this.settingsLoaded = z17;
        this.autoForward = bool;
        this.permissionsError = emailError5;
        this.pendingResetAddress = str16;
        this.resetMailboxLoaded = z18;
        this.resetMailbox = emailMailbox2;
        this.deletingMailbox = z19;
        this.deleteError = emailError6;
        this.mailboxDeletedKey = str17;
    }

    public final EmailState copy(boolean z, boolean z2, boolean z3, EmailMailbox emailMailbox, AHD<EmailSummary> ahd, String str, boolean z4, EmailError emailError, boolean z5, boolean z6, EmailError emailError2, String str2, String str3, String str4, String str5, String str6, String str7, EmailSetupDisplay emailSetupDisplay, EmailAddressAvailability emailAddressAvailability, boolean z7, boolean z8, String str8, EmailThreadUiState emailThreadUiState, String str9, AHD<EmailSender> ahd2, String str10, boolean z9, boolean z10, EmailError emailError3, String str11, String str12, boolean z11, boolean z12, EmailError emailError4, String str13, EmailOwnerChallenge emailOwnerChallenge, EmailOwnerChallenge emailOwnerChallenge2, EmailOwnerNotice emailOwnerNotice, String str14, EmailOwnerCodeFailure emailOwnerCodeFailure, boolean z13, EmailPermissions emailPermissions, boolean z14, String str15, EmailSignature emailSignature, boolean z15, boolean z16, boolean z17, Boolean bool, EmailError emailError5, String str16, boolean z18, EmailMailbox emailMailbox2, boolean z19, EmailError emailError6, String str17) {
        AnonymousClass002.A1G(ahd, 4, str2);
        C7384Etj.A0Y(str3, 12);
        C7384Etj.A0Y(str6, 15);
        C7384Etj.A0Y(emailSetupDisplay, 17);
        C7384Etj.A0Y(emailAddressAvailability, 18);
        C7384Etj.A0Y(emailThreadUiState, 22);
        C7384Etj.A0Y(ahd2, 24);
        C7384Etj.A0Y(str12, 30);
        C7384Etj.A0Y(str14, 38);
        return new EmailState(z, z2, z3, emailMailbox, ahd, str, z4, emailError, z5, z6, emailError2, str2, str3, str4, str5, str6, str7, emailSetupDisplay, emailAddressAvailability, z7, z8, str8, emailThreadUiState, str9, ahd2, str10, z9, z10, emailError3, str11, str12, z11, z12, emailError4, str13, emailOwnerChallenge, emailOwnerChallenge2, emailOwnerNotice, str14, emailOwnerCodeFailure, z13, emailPermissions, z14, str15, emailSignature, z15, z16, z17, bool, emailError5, str16, z18, emailMailbox2, z19, emailError6, str17);
    }

    public static /* synthetic */ EmailState copy$default(EmailState emailState, boolean z, boolean z2, boolean z3, EmailMailbox emailMailbox, AHD ahd, String str, boolean z4, EmailError emailError, boolean z5, boolean z6, EmailError emailError2, String str2, String str3, String str4, String str5, String str6, String str7, EmailSetupDisplay emailSetupDisplay, EmailAddressAvailability emailAddressAvailability, boolean z7, boolean z8, String str8, EmailThreadUiState emailThreadUiState, String str9, AHD ahd2, String str10, boolean z9, boolean z10, EmailError emailError3, String str11, String str12, boolean z11, boolean z12, EmailError emailError4, String str13, EmailOwnerChallenge emailOwnerChallenge, EmailOwnerChallenge emailOwnerChallenge2, EmailOwnerNotice emailOwnerNotice, String str14, EmailOwnerCodeFailure emailOwnerCodeFailure, boolean z13, EmailPermissions emailPermissions, boolean z14, String str15, EmailSignature emailSignature, boolean z15, boolean z16, boolean z17, Boolean bool, EmailError emailError5, String str16, boolean z18, EmailMailbox emailMailbox2, boolean z19, EmailError emailError6, String str17, int i, int i2, Object obj) {
        boolean z20 = z2;
        boolean z21 = z3;
        EmailMailbox emailMailbox3 = emailMailbox;
        AHD ahd3 = ahd;
        String str18 = str;
        boolean z22 = z4;
        boolean z23 = z;
        EmailError emailError7 = emailError;
        boolean z24 = z5;
        boolean z25 = z6;
        EmailError emailError8 = emailError2;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        boolean z26 = z9;
        boolean z27 = z10;
        boolean z28 = z11;
        boolean z29 = z12;
        EmailOwnerChallenge emailOwnerChallenge3 = emailOwnerChallenge2;
        EmailOwnerNotice emailOwnerNotice2 = emailOwnerNotice;
        String str23 = str14;
        EmailOwnerCodeFailure emailOwnerCodeFailure2 = emailOwnerCodeFailure;
        boolean z30 = z16;
        boolean z31 = z17;
        Boolean bool2 = bool;
        EmailError emailError9 = emailError5;
        String str24 = str16;
        boolean z32 = z18;
        EmailMailbox emailMailbox4 = emailMailbox2;
        boolean z33 = z19;
        EmailError emailError10 = emailError6;
        String str25 = str6;
        String str26 = str7;
        EmailSetupDisplay emailSetupDisplay2 = emailSetupDisplay;
        EmailAddressAvailability emailAddressAvailability2 = emailAddressAvailability;
        boolean z34 = z7;
        boolean z35 = z8;
        String str27 = str8;
        EmailThreadUiState emailThreadUiState2 = emailThreadUiState;
        String str28 = str9;
        AHD ahd4 = ahd2;
        String str29 = str10;
        EmailError emailError11 = emailError3;
        String str30 = str11;
        String str31 = str12;
        EmailError emailError12 = emailError4;
        String str32 = str13;
        EmailOwnerChallenge emailOwnerChallenge4 = emailOwnerChallenge;
        boolean z36 = z13;
        EmailPermissions emailPermissions2 = emailPermissions;
        boolean z37 = z14;
        String str33 = str15;
        EmailSignature emailSignature2 = emailSignature;
        boolean z38 = z15;
        String str34 = str17;
        if ((i & 1) != 0) {
            z23 = emailState.loading;
        }
        if ((i & 2) != 0) {
            z20 = emailState.hasLoaded;
        }
        if ((i & 4) != 0) {
            z21 = emailState.pullRefreshing;
        }
        if ((i & 8) != 0) {
            emailMailbox3 = emailState.mailbox;
        }
        if ((i & 16) != 0) {
            ahd3 = emailState.threads;
        }
        if ((i & 32) != 0) {
            str18 = emailState.nextCursor;
        }
        if ((i & 64) != 0) {
            z22 = emailState.loadingMore;
        }
        if ((i & 128) != 0) {
            emailError7 = emailState.error;
        }
        if ((i & 256) != 0) {
            z24 = emailState.formLoading;
        }
        if ((i & 512) != 0) {
            z25 = emailState.saving;
        }
        if ((i & 1024) != 0) {
            emailError8 = emailState.formError;
        }
        if ((i & 2048) != 0) {
            str19 = emailState.handle;
        }
        if ((i & 4096) != 0) {
            str20 = emailState.senderName;
        }
        if ((i & 8192) != 0) {
            str21 = emailState.rejectedSenderName;
        }
        if ((i & 16384) != 0) {
            str22 = emailState.senderNameRejectionMessage;
        }
        if ((i & 32768) != 0) {
            str25 = emailState.domain;
        }
        if ((i & 65536) != 0) {
            str26 = emailState.ownerFirstName;
        }
        if ((i & 131072) != 0) {
            emailSetupDisplay2 = emailState.setupDisplay;
        }
        if ((i & 262144) != 0) {
            emailAddressAvailability2 = emailState.addressAvailability;
        }
        if ((i & 524288) != 0) {
            z34 = emailState.setupFailed;
        }
        if ((i & 1048576) != 0) {
            z35 = emailState.setupLoaded;
        }
        if ((i & 2097152) != 0) {
            str27 = emailState.savedFormKey;
        }
        if ((i & 4194304) != 0) {
            emailThreadUiState2 = emailState.threadUiState;
        }
        if ((i & 8388608) != 0) {
            str28 = emailState.deletedThreadKey;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            ahd4 = emailState.senders;
        }
        if ((i & 33554432) != 0) {
            str29 = emailState.sendersCursor;
        }
        if ((i & 67108864) != 0) {
            z26 = emailState.sendersBusy;
        }
        if ((i & 134217728) != 0) {
            z27 = emailState.sendersPullRefreshing;
        }
        if ((i & 268435456) != 0) {
            emailError11 = emailState.sendersError;
        }
        if ((i & 536870912) != 0) {
            str30 = emailState.senderAddedKey;
        }
        if ((i & 1073741824) != 0) {
            str31 = emailState.ownerRecipient;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            z28 = emailState.ownerAddressEdited;
        }
        if ((i2 & 1) != 0) {
            z29 = emailState.confirmingOwner;
        }
        if ((i2 & 2) != 0) {
            emailError12 = emailState.ownerError;
        }
        if ((i2 & 4) != 0) {
            str32 = emailState.ownerConfirmedKey;
        }
        if ((i2 & 8) != 0) {
            emailOwnerChallenge4 = emailState.ownerChallenge;
        }
        if ((i2 & 16) != 0) {
            emailOwnerChallenge3 = emailState.previousOwnerChallenge;
        }
        if ((i2 & 32) != 0) {
            emailOwnerNotice2 = emailState.ownerNotice;
        }
        if ((i2 & 64) != 0) {
            str23 = emailState.ownerCode;
        }
        if ((i2 & 128) != 0) {
            emailOwnerCodeFailure2 = emailState.ownerCodeFailure;
        }
        if ((i2 & 256) != 0) {
            z36 = emailState.ownerCodeResent;
        }
        if ((i2 & 512) != 0) {
            emailPermissions2 = emailState.permissions;
        }
        if ((i2 & 1024) != 0) {
            z37 = emailState.permissionsLoaded;
        }
        if ((i2 & 2048) != 0) {
            str33 = emailState.savingPermissionKey;
        }
        if ((i2 & 4096) != 0) {
            emailSignature2 = emailState.signature;
        }
        if ((i2 & 8192) != 0) {
            z38 = emailState.signatureSaving;
        }
        if ((i2 & 16384) != 0) {
            z30 = emailState.showPermissions;
        }
        if ((i2 & 32768) != 0) {
            z31 = emailState.settingsLoaded;
        }
        if ((i2 & 65536) != 0) {
            bool2 = emailState.autoForward;
        }
        if ((i2 & 131072) != 0) {
            emailError9 = emailState.permissionsError;
        }
        if ((i2 & 262144) != 0) {
            str24 = emailState.pendingResetAddress;
        }
        if ((i2 & 524288) != 0) {
            z32 = emailState.resetMailboxLoaded;
        }
        if ((i2 & 1048576) != 0) {
            emailMailbox4 = emailState.resetMailbox;
        }
        if ((i2 & 2097152) != 0) {
            z33 = emailState.deletingMailbox;
        }
        if ((i2 & 4194304) != 0) {
            emailError10 = emailState.deleteError;
        }
        if ((i2 & 8388608) != 0) {
            str34 = emailState.mailboxDeletedKey;
        }
        return emailState.copy(z23, z20, z21, emailMailbox3, ahd3, str18, z22, emailError7, z24, z25, emailError8, str19, str20, str21, str22, str25, str26, emailSetupDisplay2, emailAddressAvailability2, z34, z35, str27, emailThreadUiState2, str28, ahd4, str29, z26, z27, emailError11, str30, str31, z28, z29, emailError12, str32, emailOwnerChallenge4, emailOwnerChallenge3, emailOwnerNotice2, str23, emailOwnerCodeFailure2, z36, emailPermissions2, z37, str33, emailSignature2, z38, z30, z31, bool2, emailError9, str24, z32, emailMailbox4, z33, emailError10, str34);
    }

    public /* synthetic */ EmailState(boolean z, boolean z2, boolean z3, EmailMailbox emailMailbox, AHD ahd, String str, boolean z4, EmailError emailError, boolean z5, boolean z6, EmailError emailError2, String str2, String str3, String str4, String str5, String str6, String str7, EmailSetupDisplay emailSetupDisplay, EmailAddressAvailability emailAddressAvailability, boolean z7, boolean z8, String str8, EmailThreadUiState emailThreadUiState, String str9, AHD ahd2, String str10, boolean z9, boolean z10, EmailError emailError3, String str11, String str12, boolean z11, boolean z12, EmailError emailError4, String str13, EmailOwnerChallenge emailOwnerChallenge, EmailOwnerChallenge emailOwnerChallenge2, EmailOwnerNotice emailOwnerNotice, String str14, EmailOwnerCodeFailure emailOwnerCodeFailure, boolean z13, EmailPermissions emailPermissions, boolean z14, String str15, EmailSignature emailSignature, boolean z15, boolean z16, boolean z17, Boolean bool, EmailError emailError5, String str16, boolean z18, EmailMailbox emailMailbox2, boolean z19, EmailError emailError6, String str17, int i, int i2, C06H c06h) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : emailMailbox, (i & 16) != 0 ? AHI.A01 : ahd, (i & 32) != 0 ? null : str, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? null : emailError, (i & 256) != 0 ? false : z5, (i & 512) != 0 ? false : z6, (i & 1024) != 0 ? null : emailError2, (i & 2048) != 0 ? "" : str2, (i & 4096) != 0 ? "" : str3, (i & 8192) != 0 ? null : str4, (i & 16384) != 0 ? null : str5, (i & 32768) != 0 ? "" : str6, (i & 65536) != 0 ? null : str7, (i & 131072) != 0 ? new EmailSetupDisplay(null, null, null, null, null, null, null, null, null, null, null) : emailSetupDisplay, (i & 262144) != 0 ? EmailAddressAvailability.UNKNOWN : emailAddressAvailability, C06G.A0o(i, 524288, z7), C06G.A0o(i, 1048576, z8), (i & 2097152) != 0 ? null : str8, (i & 4194304) != 0 ? EmailThreadUiState.Loading.INSTANCE : emailThreadUiState, (i & 8388608) != 0 ? null : str9, (i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? AHI.A01 : ahd2, (i & 33554432) != 0 ? null : str10, C06G.A0o(i, 67108864, z9), C06G.A0o(i, 134217728, z10), (i & 268435456) != 0 ? null : emailError3, (i & 536870912) != 0 ? null : str11, (i & 1073741824) != 0 ? "" : str12, C06G.A0o(i, Integer.MIN_VALUE, z11), (i2 & 1) != 0 ? false : z12, (i2 & 2) != 0 ? null : emailError4, (i2 & 4) != 0 ? null : str13, (i2 & 8) != 0 ? null : emailOwnerChallenge, (i2 & 16) != 0 ? null : emailOwnerChallenge2, (i2 & 32) != 0 ? null : emailOwnerNotice, (i2 & 64) == 0 ? str14 : "", (i2 & 128) != 0 ? null : emailOwnerCodeFailure, (i2 & 256) != 0 ? false : z13, (i2 & 512) != 0 ? null : emailPermissions, (i2 & 1024) != 0 ? false : z14, (i2 & 2048) != 0 ? null : str15, (i2 & 4096) != 0 ? null : emailSignature, (i2 & 8192) != 0 ? false : z15, (i2 & 16384) != 0 ? true : z16, C06G.A0o(i2, 32768, z17), (i2 & 65536) != 0 ? null : bool, (i2 & 131072) != 0 ? null : emailError5, (i2 & 262144) != 0 ? null : str16, C06G.A0o(i2, 524288, z18), (i2 & 1048576) != 0 ? null : emailMailbox2, C06G.A0o(i2, 2097152, z19), (i2 & 4194304) != 0 ? null : emailError6, (i2 & 8388608) != 0 ? null : str17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailState() {
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        this(z, z, z, null, objArr, objArr2, z, objArr3, z, z, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, z, z, objArr13, objArr14, objArr15, objArr16, objArr17, z, z, objArr18, objArr19, objArr20, z, z, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, objArr27, z, objArr28, z, objArr29, objArr30, z, z, z, objArr31, objArr32, objArr33, z, objArr34, z, objArr35, objArr36, -1, 16777215, 0 == true ? 1 : 0);
    }
}
