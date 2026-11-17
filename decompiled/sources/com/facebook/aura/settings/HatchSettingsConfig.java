package com.facebook.aura.settings;

import X.C06G;
import X.C06H;
import X.C0KA;

/* loaded from: classes.dex */
public final class HatchSettingsConfig extends C06G {
    public static final int $stable = 0;
    public final boolean popOnInternalSettingsClick;
    public final boolean showAccountsCenter;
    public final boolean showAppAppearance;
    public final boolean showBiometrics;
    public final boolean showChannels;
    public final boolean showConnectedApps;
    public final boolean showConnectedDevices;
    public final boolean showDataControls;
    public final boolean showEncryption;
    public final boolean showNotifications;
    public final boolean showPermissions;
    public final boolean showRedeemInviteCode;
    public final boolean showSubscription;
    public final boolean showWallet;

    public HatchSettingsConfig() {
        this(true, true, true, true, true, true, true, true, true, true, true, true, true, true);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSettingsConfig) {
                HatchSettingsConfig hatchSettingsConfig = (HatchSettingsConfig) obj;
                if (this.popOnInternalSettingsClick != hatchSettingsConfig.popOnInternalSettingsClick || this.showChannels != hatchSettingsConfig.showChannels || this.showConnectedApps != hatchSettingsConfig.showConnectedApps || this.showWallet != hatchSettingsConfig.showWallet || this.showNotifications != hatchSettingsConfig.showNotifications || this.showAppAppearance != hatchSettingsConfig.showAppAppearance || this.showBiometrics != hatchSettingsConfig.showBiometrics || this.showAccountsCenter != hatchSettingsConfig.showAccountsCenter || this.showDataControls != hatchSettingsConfig.showDataControls || this.showEncryption != hatchSettingsConfig.showEncryption || this.showConnectedDevices != hatchSettingsConfig.showConnectedDevices || this.showSubscription != hatchSettingsConfig.showSubscription || this.showPermissions != hatchSettingsConfig.showPermissions || this.showRedeemInviteCode != hatchSettingsConfig.showRedeemInviteCode) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSettingsConfig copy$default(HatchSettingsConfig hatchSettingsConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i, Object obj) {
        boolean z15 = z2;
        boolean z16 = z3;
        boolean z17 = z4;
        boolean z18 = z5;
        boolean z19 = z6;
        boolean z20 = z7;
        boolean z21 = z8;
        boolean z22 = z9;
        boolean z23 = z10;
        boolean z24 = z11;
        boolean z25 = z12;
        boolean z26 = z13;
        boolean z27 = z14;
        if ((i & 1) != 0) {
            z = hatchSettingsConfig.popOnInternalSettingsClick;
        }
        if ((i & 2) != 0) {
            z15 = hatchSettingsConfig.showChannels;
        }
        if ((i & 4) != 0) {
            z16 = hatchSettingsConfig.showConnectedApps;
        }
        if ((i & 8) != 0) {
            z17 = hatchSettingsConfig.showWallet;
        }
        if ((i & 16) != 0) {
            z18 = hatchSettingsConfig.showNotifications;
        }
        if ((i & 32) != 0) {
            z19 = hatchSettingsConfig.showAppAppearance;
        }
        if ((i & 64) != 0) {
            z20 = hatchSettingsConfig.showBiometrics;
        }
        if ((i & 128) != 0) {
            z21 = hatchSettingsConfig.showAccountsCenter;
        }
        if ((i & 256) != 0) {
            z22 = hatchSettingsConfig.showDataControls;
        }
        if ((i & 512) != 0) {
            z23 = hatchSettingsConfig.showEncryption;
        }
        if ((i & 1024) != 0) {
            z24 = hatchSettingsConfig.showConnectedDevices;
        }
        if ((i & 2048) != 0) {
            z25 = hatchSettingsConfig.showSubscription;
        }
        if ((i & 4096) != 0) {
            z26 = hatchSettingsConfig.showPermissions;
        }
        if ((i & 8192) != 0) {
            z27 = hatchSettingsConfig.showRedeemInviteCode;
        }
        return new HatchSettingsConfig(z, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27);
    }

    public final boolean component1() {
        return this.popOnInternalSettingsClick;
    }

    public final boolean component10() {
        return this.showEncryption;
    }

    public final boolean component11() {
        return this.showConnectedDevices;
    }

    public final boolean component12() {
        return this.showSubscription;
    }

    public final boolean component13() {
        return this.showPermissions;
    }

    public final boolean component14() {
        return this.showRedeemInviteCode;
    }

    public final boolean component2() {
        return this.showChannels;
    }

    public final boolean component3() {
        return this.showConnectedApps;
    }

    public final boolean component4() {
        return this.showWallet;
    }

    public final boolean component5() {
        return this.showNotifications;
    }

    public final boolean component6() {
        return this.showAppAppearance;
    }

    public final boolean component7() {
        return this.showBiometrics;
    }

    public final boolean component8() {
        return this.showAccountsCenter;
    }

    public final boolean component9() {
        return this.showDataControls;
    }

    public final HatchSettingsConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new HatchSettingsConfig(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14);
    }

    public final boolean getPopOnInternalSettingsClick() {
        return this.popOnInternalSettingsClick;
    }

    public final boolean getShowAccountsCenter() {
        return this.showAccountsCenter;
    }

    public final boolean getShowAppAppearance() {
        return this.showAppAppearance;
    }

    public final boolean getShowBiometrics() {
        return this.showBiometrics;
    }

    public final boolean getShowChannels() {
        return this.showChannels;
    }

    public final boolean getShowConnectedApps() {
        return this.showConnectedApps;
    }

    public final boolean getShowConnectedDevices() {
        return this.showConnectedDevices;
    }

    public final boolean getShowDataControls() {
        return this.showDataControls;
    }

    public final boolean getShowEncryption() {
        return this.showEncryption;
    }

    public final boolean getShowNotifications() {
        return this.showNotifications;
    }

    public final boolean getShowPermissions() {
        return this.showPermissions;
    }

    public final boolean getShowRedeemInviteCode() {
        return this.showRedeemInviteCode;
    }

    public final boolean getShowSubscription() {
        return this.showSubscription;
    }

    public final boolean getShowWallet() {
        return this.showWallet;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A02(this.popOnInternalSettingsClick), this.showChannels), this.showConnectedApps), this.showWallet), this.showNotifications), this.showAppAppearance), this.showBiometrics), this.showAccountsCenter), this.showDataControls), this.showEncryption), this.showConnectedDevices), this.showSubscription), this.showPermissions), this.showRedeemInviteCode);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchSettingsConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i, C06H c06h) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? true : z7, (i & 128) != 0 ? true : z8, (i & 256) != 0 ? true : z9, (i & 512) != 0 ? true : z10, (i & 1024) != 0 ? true : z11, (i & 2048) != 0 ? true : z12, (i & 4096) != 0 ? true : z13, (i & 8192) != 0 ? true : z14);
    }

    public HatchSettingsConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.popOnInternalSettingsClick = z;
        this.showChannels = z2;
        this.showConnectedApps = z3;
        this.showWallet = z4;
        this.showNotifications = z5;
        this.showAppAppearance = z6;
        this.showBiometrics = z7;
        this.showAccountsCenter = z8;
        this.showDataControls = z9;
        this.showEncryption = z10;
        this.showConnectedDevices = z11;
        this.showSubscription = z12;
        this.showPermissions = z13;
        this.showRedeemInviteCode = z14;
    }
}
