package com.facebook.aura.skills.connect.config;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CustomConnectorOAuthAuthMethod {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CustomConnectorOAuthAuthMethod[] $VALUES;
    public static final CustomConnectorOAuthAuthMethod CLIENT_SECRET_BASIC;
    public static final CustomConnectorOAuthAuthMethod CLIENT_SECRET_POST;
    public static final Companion Companion;
    public static final CustomConnectorOAuthAuthMethod NONE;
    public final String wireValue;

    static {
        CustomConnectorOAuthAuthMethod customConnectorOAuthAuthMethod = new CustomConnectorOAuthAuthMethod(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0, "none");
        NONE = customConnectorOAuthAuthMethod;
        CustomConnectorOAuthAuthMethod customConnectorOAuthAuthMethod2 = new CustomConnectorOAuthAuthMethod("CLIENT_SECRET_POST", 1, "client_secret_post");
        CLIENT_SECRET_POST = customConnectorOAuthAuthMethod2;
        CustomConnectorOAuthAuthMethod customConnectorOAuthAuthMethod3 = new CustomConnectorOAuthAuthMethod("CLIENT_SECRET_BASIC", 2, "client_secret_basic");
        CLIENT_SECRET_BASIC = customConnectorOAuthAuthMethod3;
        CustomConnectorOAuthAuthMethod[] customConnectorOAuthAuthMethodArr = {customConnectorOAuthAuthMethod, customConnectorOAuthAuthMethod2, customConnectorOAuthAuthMethod3};
        $VALUES = customConnectorOAuthAuthMethodArr;
        $ENTRIES = C3cG.A0w(customConnectorOAuthAuthMethodArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final CustomConnectorOAuthAuthMethod fromWire(String str) {
            CustomConnectorOAuthAuthMethod next;
            Iterator<CustomConnectorOAuthAuthMethod> it = CustomConnectorOAuthAuthMethod.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
                    break;
                }
            }
            CustomConnectorOAuthAuthMethod customConnectorOAuthAuthMethod = next;
            return customConnectorOAuthAuthMethod == null ? CustomConnectorOAuthAuthMethod.NONE : customConnectorOAuthAuthMethod;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<CustomConnectorOAuthAuthMethod> getEntries() {
        return $ENTRIES;
    }

    public static CustomConnectorOAuthAuthMethod valueOf(String str) {
        return (CustomConnectorOAuthAuthMethod) Enum.valueOf(CustomConnectorOAuthAuthMethod.class, str);
    }

    public static CustomConnectorOAuthAuthMethod[] values() {
        return (CustomConnectorOAuthAuthMethod[]) $VALUES.clone();
    }

    public final boolean getRequiresClientSecret() {
        return this == CLIENT_SECRET_POST || this == CLIENT_SECRET_BASIC;
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public CustomConnectorOAuthAuthMethod(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
