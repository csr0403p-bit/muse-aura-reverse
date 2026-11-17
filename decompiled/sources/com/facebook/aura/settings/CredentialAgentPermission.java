package com.facebook.aura.settings;

import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CredentialAgentPermission {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CredentialAgentPermission[] $VALUES;
    public static final CredentialAgentPermission ALLOW_FOR_ORIGIN;
    public static final CredentialAgentPermission ASK;
    public static final Companion Companion;
    public final String wireValue;

    public final class Companion {
        public final CredentialAgentPermission fromWire(String str) {
            if (C7384Etj.areEqual(str, CredentialAgentPermission.ALLOW_FOR_ORIGIN.getWireValue$fbandroid_express_aura_java_com_facebook_aura_settings_settings())) {
                return CredentialAgentPermission.ALLOW_FOR_ORIGIN;
            }
            if (C7384Etj.areEqual(str, CredentialAgentPermission.ASK.getWireValue$fbandroid_express_aura_java_com_facebook_aura_settings_settings())) {
                return CredentialAgentPermission.ASK;
            }
            return null;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        CredentialAgentPermission credentialAgentPermission = new CredentialAgentPermission("ALLOW_FOR_ORIGIN", 0, "allow_for_origin");
        ALLOW_FOR_ORIGIN = credentialAgentPermission;
        CredentialAgentPermission credentialAgentPermission2 = new CredentialAgentPermission("ASK", 1, "ask");
        ASK = credentialAgentPermission2;
        CredentialAgentPermission[] credentialAgentPermissionArr = {credentialAgentPermission, credentialAgentPermission2};
        $VALUES = credentialAgentPermissionArr;
        $ENTRIES = new F3w(credentialAgentPermissionArr);
        Companion = new Companion();
    }

    public static Ey9<CredentialAgentPermission> getEntries() {
        return $ENTRIES;
    }

    public static CredentialAgentPermission valueOf(String str) {
        return (CredentialAgentPermission) Enum.valueOf(CredentialAgentPermission.class, str);
    }

    public static CredentialAgentPermission[] values() {
        return (CredentialAgentPermission[]) $VALUES.clone();
    }

    public final String getWireValue$fbandroid_express_aura_java_com_facebook_aura_settings_settings() {
        return this.wireValue;
    }

    public CredentialAgentPermission(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
