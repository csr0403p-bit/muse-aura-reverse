package com.facebook.aura.email.model;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailSetupDisplay extends C06G {
    public final String addressHelp;
    public final String addressSubtitle;
    public final String addressTitle;
    public final String introFooter;
    public final AHD<EmailSetupPoint> introPoints;
    public final String introTitle;
    public final String ownerEmailHelp;
    public final String ownerEmailHelpWithLinks;
    public final String ownerSubtitle;
    public final String ownerTitle;
    public final String senderNameHelp;

    public static /* synthetic */ EmailSetupDisplay copy$default(EmailSetupDisplay emailSetupDisplay, String str, String str2, AHD ahd, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        String str11 = str;
        String str12 = str2;
        AHD ahd2 = ahd;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        if ((i & 1) != 0) {
            str11 = emailSetupDisplay.introTitle;
        }
        if ((i & 2) != 0) {
            str12 = emailSetupDisplay.introFooter;
        }
        if ((i & 4) != 0) {
            ahd2 = emailSetupDisplay.introPoints;
        }
        if ((i & 8) != 0) {
            str13 = emailSetupDisplay.addressTitle;
        }
        if ((i & 16) != 0) {
            str14 = emailSetupDisplay.addressSubtitle;
        }
        if ((i & 32) != 0) {
            str15 = emailSetupDisplay.addressHelp;
        }
        if ((i & 64) != 0) {
            str16 = emailSetupDisplay.senderNameHelp;
        }
        if ((i & 128) != 0) {
            str17 = emailSetupDisplay.ownerTitle;
        }
        if ((i & 256) != 0) {
            str18 = emailSetupDisplay.ownerSubtitle;
        }
        if ((i & 512) != 0) {
            str19 = emailSetupDisplay.ownerEmailHelp;
        }
        if ((i & 1024) != 0) {
            str20 = emailSetupDisplay.ownerEmailHelpWithLinks;
        }
        return new EmailSetupDisplay(str11, str12, ahd2, str13, str14, str15, str16, str17, str18, str19, str20);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSetupDisplay) {
                EmailSetupDisplay emailSetupDisplay = (EmailSetupDisplay) obj;
                if (!C7384Etj.areEqual(this.introTitle, emailSetupDisplay.introTitle) || !C7384Etj.areEqual(this.introFooter, emailSetupDisplay.introFooter) || !C7384Etj.areEqual(this.introPoints, emailSetupDisplay.introPoints) || !C7384Etj.areEqual(this.addressTitle, emailSetupDisplay.addressTitle) || !C7384Etj.areEqual(this.addressSubtitle, emailSetupDisplay.addressSubtitle) || !C7384Etj.areEqual(this.addressHelp, emailSetupDisplay.addressHelp) || !C7384Etj.areEqual(this.senderNameHelp, emailSetupDisplay.senderNameHelp) || !C7384Etj.areEqual(this.ownerTitle, emailSetupDisplay.ownerTitle) || !C7384Etj.areEqual(this.ownerSubtitle, emailSetupDisplay.ownerSubtitle) || !C7384Etj.areEqual(this.ownerEmailHelp, emailSetupDisplay.ownerEmailHelp) || !C7384Etj.areEqual(this.ownerEmailHelpWithLinks, emailSetupDisplay.ownerEmailHelpWithLinks)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.introTitle;
    }

    public final String component10() {
        return this.ownerEmailHelp;
    }

    public final String component11() {
        return this.ownerEmailHelpWithLinks;
    }

    public final String component2() {
        return this.introFooter;
    }

    public final AHD<EmailSetupPoint> component3() {
        return this.introPoints;
    }

    public final String component4() {
        return this.addressTitle;
    }

    public final String component5() {
        return this.addressSubtitle;
    }

    public final String component6() {
        return this.addressHelp;
    }

    public final String component7() {
        return this.senderNameHelp;
    }

    public final String component8() {
        return this.ownerTitle;
    }

    public final String component9() {
        return this.ownerSubtitle;
    }

    public final EmailSetupDisplay copy(String str, String str2, AHD<EmailSetupPoint> ahd, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new EmailSetupDisplay(str, str2, ahd, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public final String getAddressHelp() {
        return this.addressHelp;
    }

    public final String getAddressSubtitle() {
        return this.addressSubtitle;
    }

    public final String getAddressTitle() {
        return this.addressTitle;
    }

    public final String getIntroFooter() {
        return this.introFooter;
    }

    public final AHD<EmailSetupPoint> getIntroPoints() {
        return this.introPoints;
    }

    public final String getIntroTitle() {
        return this.introTitle;
    }

    public final String getOwnerEmailHelp() {
        return this.ownerEmailHelp;
    }

    public final String getOwnerEmailHelpWithLinks() {
        return this.ownerEmailHelpWithLinks;
    }

    public final String getOwnerSubtitle() {
        return this.ownerSubtitle;
    }

    public final String getOwnerTitle() {
        return this.ownerTitle;
    }

    public final String getSenderNameHelp() {
        return this.senderNameHelp;
    }

    public int hashCode() {
        return (((((((((((((((((((AnonymousClass006.A0G(this.introTitle) * 31) + AnonymousClass006.A0G(this.introFooter)) * 31) + AnonymousClass006.A0D(this.introPoints)) * 31) + AnonymousClass006.A0G(this.addressTitle)) * 31) + AnonymousClass006.A0G(this.addressSubtitle)) * 31) + AnonymousClass006.A0G(this.addressHelp)) * 31) + AnonymousClass006.A0G(this.senderNameHelp)) * 31) + AnonymousClass006.A0G(this.ownerTitle)) * 31) + AnonymousClass006.A0G(this.ownerSubtitle)) * 31) + AnonymousClass006.A0G(this.ownerEmailHelp)) * 31) + AnonymousClass005.A0H(this.ownerEmailHelpWithLinks);
    }

    public EmailSetupDisplay(String str, String str2, AHD<EmailSetupPoint> ahd, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.introTitle = str;
        this.introFooter = str2;
        this.introPoints = ahd;
        this.addressTitle = str3;
        this.addressSubtitle = str4;
        this.addressHelp = str5;
        this.senderNameHelp = str6;
        this.ownerTitle = str7;
        this.ownerSubtitle = str8;
        this.ownerEmailHelp = str9;
        this.ownerEmailHelpWithLinks = str10;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSetupDisplay(String str, String str2, AHD ahd, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : ahd, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10);
    }

    public EmailSetupDisplay() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }
}
