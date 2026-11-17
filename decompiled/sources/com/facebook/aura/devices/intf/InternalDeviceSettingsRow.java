package com.facebook.aura.devices.intf;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import android.net.Uri;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes2.dex */
public final class InternalDeviceSettingsRow extends C06G {
    public static final int $stable = 8;
    public final Uri deeplink;
    public final String id;
    public final String subtitle;
    public final AuraNavKey target;
    public final int titleRes;

    public InternalDeviceSettingsRow(String str, int i, AuraNavKey auraNavKey, String str2, Uri uri) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.titleRes = i;
        this.target = auraNavKey;
        this.subtitle = str2;
        this.deeplink = uri;
    }

    public final InternalDeviceSettingsRow copy(String str, int i, AuraNavKey auraNavKey, String str2, Uri uri) {
        C7384Etj.A0Y(str, 0);
        return new InternalDeviceSettingsRow(str, i, auraNavKey, str2, uri);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InternalDeviceSettingsRow) {
                InternalDeviceSettingsRow internalDeviceSettingsRow = (InternalDeviceSettingsRow) obj;
                if (!C7384Etj.areEqual(this.id, internalDeviceSettingsRow.id) || this.titleRes != internalDeviceSettingsRow.titleRes || !C7384Etj.areEqual(this.target, internalDeviceSettingsRow.target) || !C7384Etj.areEqual(this.subtitle, internalDeviceSettingsRow.subtitle) || !C7384Etj.areEqual(this.deeplink, internalDeviceSettingsRow.deeplink)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ InternalDeviceSettingsRow copy$default(InternalDeviceSettingsRow internalDeviceSettingsRow, String str, int i, AuraNavKey auraNavKey, String str2, Uri uri, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = internalDeviceSettingsRow.id;
        }
        if ((i2 & 2) != 0) {
            i = internalDeviceSettingsRow.titleRes;
        }
        if ((i2 & 4) != 0) {
            auraNavKey = internalDeviceSettingsRow.target;
        }
        if ((i2 & 8) != 0) {
            str2 = internalDeviceSettingsRow.subtitle;
        }
        if ((i2 & 16) != 0) {
            uri = internalDeviceSettingsRow.deeplink;
        }
        return internalDeviceSettingsRow.copy(str, i, auraNavKey, str2, uri);
    }

    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.titleRes;
    }

    public final AuraNavKey component3() {
        return this.target;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final Uri component5() {
        return this.deeplink;
    }

    public final Uri getDeeplink() {
        return this.deeplink;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final AuraNavKey getTarget() {
        return this.target;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public int hashCode() {
        return ((((((AnonymousClass001.A0G(this.id) + this.titleRes) * 31) + AnonymousClass006.A0D(this.target)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + C3cH.A02(this.deeplink);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ InternalDeviceSettingsRow(String str, int i, AuraNavKey auraNavKey, String str2, Uri uri, int i2, C06H c06h) {
        this(str, i, (i2 & 4) != 0 ? null : auraNavKey, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : uri);
    }
}
