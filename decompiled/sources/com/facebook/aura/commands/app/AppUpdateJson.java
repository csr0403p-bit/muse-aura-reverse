package com.facebook.aura.commands.app;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AppUpdateJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Integer available_version_code;
    public final boolean flexible_update_allowed;
    public final String install_status;
    public final String installed_version;
    public final int installed_version_code;
    public final Integer staleness_days;
    public final String store;
    public final boolean update_available;

    public final class Companion {
        public final C9hr<AppUpdateJson> serializer() {
            return AppUpdateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_app_app(AppUpdateJson appUpdateJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(appUpdateJson.store, c9iZ, 0);
        c9j5.AAV(appUpdateJson.installed_version, c9iZ, 1);
        c9j5.AAK(c9iZ, 2, appUpdateJson.installed_version_code);
        c9j5.AA7(c9iZ, 3, appUpdateJson.update_available);
        C07729ii c07729ii = C07729ii.A00;
        c9j5.AAP(appUpdateJson.available_version_code, c07729ii, c9iZ, 4);
        c9j5.AAP(appUpdateJson.staleness_days, c07729ii, c9iZ, 5);
        c9j5.AAV(appUpdateJson.install_status, c9iZ, 6);
        c9j5.AA7(c9iZ, 7, appUpdateJson.flexible_update_allowed);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppUpdateJson) {
                AppUpdateJson appUpdateJson = (AppUpdateJson) obj;
                if (!C7384Etj.areEqual(this.store, appUpdateJson.store) || !C7384Etj.areEqual(this.installed_version, appUpdateJson.installed_version) || this.installed_version_code != appUpdateJson.installed_version_code || this.update_available != appUpdateJson.update_available || !C7384Etj.areEqual(this.available_version_code, appUpdateJson.available_version_code) || !C7384Etj.areEqual(this.staleness_days, appUpdateJson.staleness_days) || !C7384Etj.areEqual(this.install_status, appUpdateJson.install_status) || this.flexible_update_allowed != appUpdateJson.flexible_update_allowed) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AppUpdateJson copy$default(AppUpdateJson appUpdateJson, String str, String str2, int i, boolean z, Integer num, Integer num2, String str3, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appUpdateJson.store;
        }
        if ((i2 & 2) != 0) {
            str2 = appUpdateJson.installed_version;
        }
        if ((i2 & 4) != 0) {
            i = appUpdateJson.installed_version_code;
        }
        if ((i2 & 8) != 0) {
            z = appUpdateJson.update_available;
        }
        if ((i2 & 16) != 0) {
            num = appUpdateJson.available_version_code;
        }
        if ((i2 & 32) != 0) {
            num2 = appUpdateJson.staleness_days;
        }
        if ((i2 & 64) != 0) {
            str3 = appUpdateJson.install_status;
        }
        if ((i2 & 128) != 0) {
            z2 = appUpdateJson.flexible_update_allowed;
        }
        return appUpdateJson.copy(str, str2, i, z, num, num2, str3, z2);
    }

    public final String component1() {
        return this.store;
    }

    public final String component2() {
        return this.installed_version;
    }

    public final int component3() {
        return this.installed_version_code;
    }

    public final boolean component4() {
        return this.update_available;
    }

    public final Integer component5() {
        return this.available_version_code;
    }

    public final Integer component6() {
        return this.staleness_days;
    }

    public final String component7() {
        return this.install_status;
    }

    public final boolean component8() {
        return this.flexible_update_allowed;
    }

    public final Integer getAvailable_version_code() {
        return this.available_version_code;
    }

    public final boolean getFlexible_update_allowed() {
        return this.flexible_update_allowed;
    }

    public final String getInstall_status() {
        return this.install_status;
    }

    public final String getInstalled_version() {
        return this.installed_version;
    }

    public final int getInstalled_version_code() {
        return this.installed_version_code;
    }

    public final Integer getStaleness_days() {
        return this.staleness_days;
    }

    public final String getStore() {
        return this.store;
    }

    public final boolean getUpdate_available() {
        return this.update_available;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.install_status, (((C0KA.A01((AnonymousClass005.A0I(this.installed_version, AnonymousClass001.A0G(this.store)) + this.installed_version_code) * 31, this.update_available) + AnonymousClass006.A0D(this.available_version_code)) * 31) + C3cH.A02(this.staleness_days)) * 31), this.flexible_update_allowed);
    }

    public AppUpdateJson(String str, String str2, int i, boolean z, Integer num, Integer num2, String str3, boolean z2) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str3, 6);
        this.store = str;
        this.installed_version = str2;
        this.installed_version_code = i;
        this.update_available = z;
        this.available_version_code = num;
        this.staleness_days = num2;
        this.install_status = str3;
        this.flexible_update_allowed = z2;
    }

    public final AppUpdateJson copy(String str, String str2, int i, boolean z, Integer num, Integer num2, String str3, boolean z2) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str3, 6);
        return new AppUpdateJson(str, str2, i, z, num, num2, str3, z2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AppUpdateJson(int i, String str, String str2, int i2, boolean z, Integer num, Integer num2, String str3, boolean z2, C2hx c2hx) {
        if (255 != (i & 255)) {
            C9iI.A00(AppUpdateJson$$serializer.descriptor, i, 255);
            throw F60.createAndThrow();
        }
        this.store = str;
        this.installed_version = str2;
        this.installed_version_code = i2;
        this.update_available = z;
        this.available_version_code = num;
        this.staleness_days = num2;
        this.install_status = str3;
        this.flexible_update_allowed = z2;
    }
}
