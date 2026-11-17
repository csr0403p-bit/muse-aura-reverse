package com.facebook.aura.email.model;

import X.AbstractC2159Azp;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailSettingsCopy extends C06G {
    public final String addEmailHelp;
    public final String addEmailPageTitle;
    public final String addEmailPlaceholder;
    public final String deleteAction;
    public final String deleteDialogMessageTemplate;
    public final String deleteDialogTitle;
    public final String deleting;
    public final String howItWorksBody;
    public final String howItWorksTitle;
    public final String museMailPageTitle;
    public final String senderNameHelp;
    public final String senderNameLabel;
    public final String senderNamePageTitle;
    public final String verifiedEmailListLabel;
    public final String verifiedEmailPageTitle;
    public final String verifiedEmailRowNote;
    public final String verifiedEmailRowTitle;

    public EmailSettingsCopy() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final String deleteDialogMessage(String str) {
        C7384Etj.A0Y(str, 0);
        String str2 = this.deleteDialogMessageTemplate;
        if (str2 != null) {
            return AbstractC2159Azp.A0z(str2, "{address}", str);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSettingsCopy) {
                EmailSettingsCopy emailSettingsCopy = (EmailSettingsCopy) obj;
                if (!C7384Etj.areEqual(this.verifiedEmailRowTitle, emailSettingsCopy.verifiedEmailRowTitle) || !C7384Etj.areEqual(this.verifiedEmailRowNote, emailSettingsCopy.verifiedEmailRowNote) || !C7384Etj.areEqual(this.verifiedEmailPageTitle, emailSettingsCopy.verifiedEmailPageTitle) || !C7384Etj.areEqual(this.howItWorksTitle, emailSettingsCopy.howItWorksTitle) || !C7384Etj.areEqual(this.howItWorksBody, emailSettingsCopy.howItWorksBody) || !C7384Etj.areEqual(this.verifiedEmailListLabel, emailSettingsCopy.verifiedEmailListLabel) || !C7384Etj.areEqual(this.addEmailPageTitle, emailSettingsCopy.addEmailPageTitle) || !C7384Etj.areEqual(this.addEmailPlaceholder, emailSettingsCopy.addEmailPlaceholder) || !C7384Etj.areEqual(this.addEmailHelp, emailSettingsCopy.addEmailHelp) || !C7384Etj.areEqual(this.senderNamePageTitle, emailSettingsCopy.senderNamePageTitle) || !C7384Etj.areEqual(this.senderNameLabel, emailSettingsCopy.senderNameLabel) || !C7384Etj.areEqual(this.senderNameHelp, emailSettingsCopy.senderNameHelp) || !C7384Etj.areEqual(this.museMailPageTitle, emailSettingsCopy.museMailPageTitle) || !C7384Etj.areEqual(this.deleteAction, emailSettingsCopy.deleteAction) || !C7384Etj.areEqual(this.deleteDialogTitle, emailSettingsCopy.deleteDialogTitle) || !C7384Etj.areEqual(this.deleteDialogMessageTemplate, emailSettingsCopy.deleteDialogMessageTemplate) || !C7384Etj.areEqual(this.deleting, emailSettingsCopy.deleting)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSettingsCopy copy$default(EmailSettingsCopy emailSettingsCopy, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, Object obj) {
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        String str26 = str13;
        String str27 = str14;
        String str28 = str15;
        String str29 = str16;
        String str30 = str17;
        if ((i & 1) != 0) {
            str = emailSettingsCopy.verifiedEmailRowTitle;
        }
        if ((i & 2) != 0) {
            str2 = emailSettingsCopy.verifiedEmailRowNote;
        }
        if ((i & 4) != 0) {
            str3 = emailSettingsCopy.verifiedEmailPageTitle;
        }
        if ((i & 8) != 0) {
            str4 = emailSettingsCopy.howItWorksTitle;
        }
        if ((i & 16) != 0) {
            str18 = emailSettingsCopy.howItWorksBody;
        }
        if ((i & 32) != 0) {
            str19 = emailSettingsCopy.verifiedEmailListLabel;
        }
        if ((i & 64) != 0) {
            str20 = emailSettingsCopy.addEmailPageTitle;
        }
        if ((i & 128) != 0) {
            str21 = emailSettingsCopy.addEmailPlaceholder;
        }
        if ((i & 256) != 0) {
            str22 = emailSettingsCopy.addEmailHelp;
        }
        if ((i & 512) != 0) {
            str23 = emailSettingsCopy.senderNamePageTitle;
        }
        if ((i & 1024) != 0) {
            str24 = emailSettingsCopy.senderNameLabel;
        }
        if ((i & 2048) != 0) {
            str25 = emailSettingsCopy.senderNameHelp;
        }
        if ((i & 4096) != 0) {
            str26 = emailSettingsCopy.museMailPageTitle;
        }
        if ((i & 8192) != 0) {
            str27 = emailSettingsCopy.deleteAction;
        }
        if ((i & 16384) != 0) {
            str28 = emailSettingsCopy.deleteDialogTitle;
        }
        if ((i & 32768) != 0) {
            str29 = emailSettingsCopy.deleteDialogMessageTemplate;
        }
        if ((i & 65536) != 0) {
            str30 = emailSettingsCopy.deleting;
        }
        return new EmailSettingsCopy(str, str2, str3, str4, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30);
    }

    public final String component1() {
        return this.verifiedEmailRowTitle;
    }

    public final String component10() {
        return this.senderNamePageTitle;
    }

    public final String component11() {
        return this.senderNameLabel;
    }

    public final String component12() {
        return this.senderNameHelp;
    }

    public final String component13() {
        return this.museMailPageTitle;
    }

    public final String component14() {
        return this.deleteAction;
    }

    public final String component15() {
        return this.deleteDialogTitle;
    }

    public final String component16() {
        return this.deleteDialogMessageTemplate;
    }

    public final String component17() {
        return this.deleting;
    }

    public final String component2() {
        return this.verifiedEmailRowNote;
    }

    public final String component3() {
        return this.verifiedEmailPageTitle;
    }

    public final String component4() {
        return this.howItWorksTitle;
    }

    public final String component5() {
        return this.howItWorksBody;
    }

    public final String component6() {
        return this.verifiedEmailListLabel;
    }

    public final String component7() {
        return this.addEmailPageTitle;
    }

    public final String component8() {
        return this.addEmailPlaceholder;
    }

    public final String component9() {
        return this.addEmailHelp;
    }

    public final EmailSettingsCopy copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        return new EmailSettingsCopy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    public final String getAddEmailHelp() {
        return this.addEmailHelp;
    }

    public final String getAddEmailPageTitle() {
        return this.addEmailPageTitle;
    }

    public final String getAddEmailPlaceholder() {
        return this.addEmailPlaceholder;
    }

    public final String getDeleteAction() {
        return this.deleteAction;
    }

    public final String getDeleteDialogMessageTemplate() {
        return this.deleteDialogMessageTemplate;
    }

    public final String getDeleteDialogTitle() {
        return this.deleteDialogTitle;
    }

    public final String getDeleting() {
        return this.deleting;
    }

    public final String getHowItWorksBody() {
        return this.howItWorksBody;
    }

    public final String getHowItWorksTitle() {
        return this.howItWorksTitle;
    }

    public final String getMuseMailPageTitle() {
        return this.museMailPageTitle;
    }

    public final String getSenderNameHelp() {
        return this.senderNameHelp;
    }

    public final String getSenderNameLabel() {
        return this.senderNameLabel;
    }

    public final String getSenderNamePageTitle() {
        return this.senderNamePageTitle;
    }

    public final String getVerifiedEmailListLabel() {
        return this.verifiedEmailListLabel;
    }

    public final String getVerifiedEmailPageTitle() {
        return this.verifiedEmailPageTitle;
    }

    public final String getVerifiedEmailRowNote() {
        return this.verifiedEmailRowNote;
    }

    public final String getVerifiedEmailRowTitle() {
        return this.verifiedEmailRowTitle;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((AnonymousClass006.A0G(this.verifiedEmailRowTitle) * 31) + AnonymousClass006.A0G(this.verifiedEmailRowNote)) * 31) + AnonymousClass006.A0G(this.verifiedEmailPageTitle)) * 31) + AnonymousClass006.A0G(this.howItWorksTitle)) * 31) + AnonymousClass006.A0G(this.howItWorksBody)) * 31) + AnonymousClass006.A0G(this.verifiedEmailListLabel)) * 31) + AnonymousClass006.A0G(this.addEmailPageTitle)) * 31) + AnonymousClass006.A0G(this.addEmailPlaceholder)) * 31) + AnonymousClass006.A0G(this.addEmailHelp)) * 31) + AnonymousClass006.A0G(this.senderNamePageTitle)) * 31) + AnonymousClass006.A0G(this.senderNameLabel)) * 31) + AnonymousClass006.A0G(this.senderNameHelp)) * 31) + AnonymousClass006.A0G(this.museMailPageTitle)) * 31) + AnonymousClass006.A0G(this.deleteAction)) * 31) + AnonymousClass006.A0G(this.deleteDialogTitle)) * 31) + AnonymousClass006.A0G(this.deleteDialogMessageTemplate)) * 31) + AnonymousClass005.A0H(this.deleting);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSettingsCopy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17);
    }

    public EmailSettingsCopy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.verifiedEmailRowTitle = str;
        this.verifiedEmailRowNote = str2;
        this.verifiedEmailPageTitle = str3;
        this.howItWorksTitle = str4;
        this.howItWorksBody = str5;
        this.verifiedEmailListLabel = str6;
        this.addEmailPageTitle = str7;
        this.addEmailPlaceholder = str8;
        this.addEmailHelp = str9;
        this.senderNamePageTitle = str10;
        this.senderNameLabel = str11;
        this.senderNameHelp = str12;
        this.museMailPageTitle = str13;
        this.deleteAction = str14;
        this.deleteDialogTitle = str15;
        this.deleteDialogMessageTemplate = str16;
        this.deleting = str17;
    }
}
