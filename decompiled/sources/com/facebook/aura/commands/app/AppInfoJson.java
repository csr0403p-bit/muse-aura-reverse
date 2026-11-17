package com.facebook.aura.commands.app;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AppInfoJson extends C06G {
    public final String app_version;
    public final List<String> available_actions;
    public final DefaultAssistantJson default_assistant;
    public final HomeScreenShortcutJson home_screen_shortcut;
    public final String install_source;
    public final String platform;
    public final boolean run_in_background_enabled;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, AppInfoJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<AppInfoJson> serializer() {
            return AppInfoJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppInfoJson) {
                AppInfoJson appInfoJson = (AppInfoJson) obj;
                if (!C7384Etj.areEqual(this.platform, appInfoJson.platform) || !C7384Etj.areEqual(this.app_version, appInfoJson.app_version) || !C7384Etj.areEqual(this.install_source, appInfoJson.install_source) || !C7384Etj.areEqual(this.default_assistant, appInfoJson.default_assistant) || !C7384Etj.areEqual(this.home_screen_shortcut, appInfoJson.home_screen_shortcut) || this.run_in_background_enabled != appInfoJson.run_in_background_enabled || !C7384Etj.areEqual(this.available_actions, appInfoJson.available_actions)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppInfoJson copy$default(AppInfoJson appInfoJson, String str, String str2, String str3, DefaultAssistantJson defaultAssistantJson, HomeScreenShortcutJson homeScreenShortcutJson, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInfoJson.platform;
        }
        if ((i & 2) != 0) {
            str2 = appInfoJson.app_version;
        }
        if ((i & 4) != 0) {
            str3 = appInfoJson.install_source;
        }
        if ((i & 8) != 0) {
            defaultAssistantJson = appInfoJson.default_assistant;
        }
        if ((i & 16) != 0) {
            homeScreenShortcutJson = appInfoJson.home_screen_shortcut;
        }
        if ((i & 32) != 0) {
            z = appInfoJson.run_in_background_enabled;
        }
        if ((i & 64) != 0) {
            list = appInfoJson.available_actions;
        }
        return appInfoJson.copy(str, str2, str3, defaultAssistantJson, homeScreenShortcutJson, z, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_app_app(AppInfoJson appInfoJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(appInfoJson.platform, c9iZ, 0);
        c9j5.AAV(appInfoJson.app_version, c9iZ, 1);
        c9j5.AAV(appInfoJson.install_source, c9iZ, 2);
        c9j5.AAQ(appInfoJson.default_assistant, DefaultAssistantJson$$serializer.INSTANCE, c9iZ, 3);
        c9j5.AAQ(appInfoJson.home_screen_shortcut, HomeScreenShortcutJson$$serializer.INSTANCE, c9iZ, 4);
        c9j5.AA7(c9iZ, 5, appInfoJson.run_in_background_enabled);
        c9j5.AAQ(appInfoJson.available_actions, C3cH.A15(f0cArr, 6), c9iZ, 6);
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.app_version;
    }

    public final String component3() {
        return this.install_source;
    }

    public final DefaultAssistantJson component4() {
        return this.default_assistant;
    }

    public final HomeScreenShortcutJson component5() {
        return this.home_screen_shortcut;
    }

    public final boolean component6() {
        return this.run_in_background_enabled;
    }

    public final List<String> component7() {
        return this.available_actions;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final List<String> getAvailable_actions() {
        return this.available_actions;
    }

    public final DefaultAssistantJson getDefault_assistant() {
        return this.default_assistant;
    }

    public final HomeScreenShortcutJson getHome_screen_shortcut() {
        return this.home_screen_shortcut;
    }

    public final String getInstall_source() {
        return this.install_source;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final boolean getRun_in_background_enabled() {
        return this.run_in_background_enabled;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.available_actions, C0KA.A01(AnonymousClass005.A0F(this.home_screen_shortcut, AnonymousClass005.A0F(this.default_assistant, AnonymousClass005.A0I(this.install_source, AnonymousClass005.A0I(this.app_version, AnonymousClass001.A0G(this.platform))))), this.run_in_background_enabled));
    }

    public AppInfoJson(String str, String str2, String str3, DefaultAssistantJson defaultAssistantJson, HomeScreenShortcutJson homeScreenShortcutJson, boolean z, List<String> list) {
        AnonymousClass005.A17(str, str2, str3, defaultAssistantJson, homeScreenShortcutJson);
        C7384Etj.A0Y(list, 6);
        this.platform = str;
        this.app_version = str2;
        this.install_source = str3;
        this.default_assistant = defaultAssistantJson;
        this.home_screen_shortcut = homeScreenShortcutJson;
        this.run_in_background_enabled = z;
        this.available_actions = list;
    }

    public final AppInfoJson copy(String str, String str2, String str3, DefaultAssistantJson defaultAssistantJson, HomeScreenShortcutJson homeScreenShortcutJson, boolean z, List<String> list) {
        AnonymousClass005.A17(str, str2, str3, defaultAssistantJson, homeScreenShortcutJson);
        C7384Etj.A0Y(list, 6);
        return new AppInfoJson(str, str2, str3, defaultAssistantJson, homeScreenShortcutJson, z, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AppInfoJson(int i, String str, String str2, String str3, DefaultAssistantJson defaultAssistantJson, HomeScreenShortcutJson homeScreenShortcutJson, boolean z, List list, C2hx c2hx) {
        if (127 != (i & 127)) {
            C9iI.A00(AppInfoJson$$serializer.descriptor, i, 127);
            throw F60.createAndThrow();
        }
        this.platform = str;
        this.app_version = str2;
        this.install_source = str3;
        this.default_assistant = defaultAssistantJson;
        this.home_screen_shortcut = homeScreenShortcutJson;
        this.run_in_background_enabled = z;
        this.available_actions = list;
    }
}
