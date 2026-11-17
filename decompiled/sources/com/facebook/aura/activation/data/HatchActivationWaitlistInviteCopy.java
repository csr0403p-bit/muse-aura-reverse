package com.facebook.aura.activation.data;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchActivationWaitlistInviteCopy extends C06G {
    public final Screen enterInviteCode;
    public final Screen nameDialog;
    public final Screen waitlistChoice;
    public final Screen waitlisted;
    public final Screen waitlistedLimited;

    /* loaded from: classes.dex */
    public final class Screen extends C06G {
        public final String disclaimer;
        public final String subtitle;
        public final String title;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Screen) {
                    Screen screen = (Screen) obj;
                    if (!C7384Etj.areEqual(this.title, screen.title) || !C7384Etj.areEqual(this.subtitle, screen.subtitle) || !C7384Etj.areEqual(this.disclaimer, screen.disclaimer)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Screen copy$default(Screen screen, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = screen.title;
            }
            if ((i & 2) != 0) {
                str2 = screen.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = screen.disclaimer;
            }
            return screen.copy(str, str2, str3);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final String component3() {
            return this.disclaimer;
        }

        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.subtitle, AnonymousClass001.A0G(this.title)) + AnonymousClass006.A0G(this.disclaimer);
        }

        public Screen(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.title = str;
            this.subtitle = str2;
            this.disclaimer = str3;
        }

        public final Screen copy(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            return new Screen(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchActivationWaitlistInviteCopy) {
                HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy = (HatchActivationWaitlistInviteCopy) obj;
                if (!C7384Etj.areEqual(this.waitlistChoice, hatchActivationWaitlistInviteCopy.waitlistChoice) || !C7384Etj.areEqual(this.enterInviteCode, hatchActivationWaitlistInviteCopy.enterInviteCode) || !C7384Etj.areEqual(this.waitlisted, hatchActivationWaitlistInviteCopy.waitlisted) || !C7384Etj.areEqual(this.waitlistedLimited, hatchActivationWaitlistInviteCopy.waitlistedLimited) || !C7384Etj.areEqual(this.nameDialog, hatchActivationWaitlistInviteCopy.nameDialog)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchActivationWaitlistInviteCopy copy$default(HatchActivationWaitlistInviteCopy hatchActivationWaitlistInviteCopy, Screen screen, Screen screen2, Screen screen3, Screen screen4, Screen screen5, int i, Object obj) {
        if ((i & 1) != 0) {
            screen = hatchActivationWaitlistInviteCopy.waitlistChoice;
        }
        if ((i & 2) != 0) {
            screen2 = hatchActivationWaitlistInviteCopy.enterInviteCode;
        }
        if ((i & 4) != 0) {
            screen3 = hatchActivationWaitlistInviteCopy.waitlisted;
        }
        if ((i & 8) != 0) {
            screen4 = hatchActivationWaitlistInviteCopy.waitlistedLimited;
        }
        if ((i & 16) != 0) {
            screen5 = hatchActivationWaitlistInviteCopy.nameDialog;
        }
        return hatchActivationWaitlistInviteCopy.copy(screen, screen2, screen3, screen4, screen5);
    }

    public final Screen component1() {
        return this.waitlistChoice;
    }

    public final Screen component2() {
        return this.enterInviteCode;
    }

    public final Screen component3() {
        return this.waitlisted;
    }

    public final Screen component4() {
        return this.waitlistedLimited;
    }

    public final Screen component5() {
        return this.nameDialog;
    }

    public final HatchActivationWaitlistInviteCopy copy(Screen screen, Screen screen2, Screen screen3, Screen screen4, Screen screen5) {
        return new HatchActivationWaitlistInviteCopy(screen, screen2, screen3, screen4, screen5);
    }

    public final Screen getEnterInviteCode() {
        return this.enterInviteCode;
    }

    public final Screen getNameDialog() {
        return this.nameDialog;
    }

    public final Screen getWaitlistChoice() {
        return this.waitlistChoice;
    }

    public final Screen getWaitlisted() {
        return this.waitlisted;
    }

    public final Screen getWaitlistedLimited() {
        return this.waitlistedLimited;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0D(this.waitlistChoice) * 31) + AnonymousClass006.A0D(this.enterInviteCode)) * 31) + AnonymousClass006.A0D(this.waitlisted)) * 31) + AnonymousClass006.A0D(this.waitlistedLimited)) * 31) + C3cH.A02(this.nameDialog);
    }

    public HatchActivationWaitlistInviteCopy(Screen screen, Screen screen2, Screen screen3, Screen screen4, Screen screen5) {
        this.waitlistChoice = screen;
        this.enterInviteCode = screen2;
        this.waitlisted = screen3;
        this.waitlistedLimited = screen4;
        this.nameDialog = screen5;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchActivationWaitlistInviteCopy(Screen screen, Screen screen2, Screen screen3, Screen screen4, Screen screen5, int i, C06H c06h) {
        this((i & 1) != 0 ? null : screen, (i & 2) != 0 ? null : screen2, (i & 4) != 0 ? null : screen3, (i & 8) != 0 ? null : screen4, (i & 16) != 0 ? null : screen5);
    }

    public HatchActivationWaitlistInviteCopy() {
        this(null, null, null, null, null);
    }
}
