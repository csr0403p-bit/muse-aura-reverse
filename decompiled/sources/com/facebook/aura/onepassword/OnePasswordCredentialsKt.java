package com.facebook.aura.onepassword;

import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class OnePasswordCredentialsKt {
    public static final String GRANT_FIELD_NAME = "grant";

    public static final boolean isOnePasswordCredential(String str, List<String> list) {
        C7384Etj.A0Y(list, 1);
        return str != null ? str.equals(OnePasswordHandoffKt.ONEPASSWORD_AUTH_PROVIDER) : list.contains(GRANT_FIELD_NAME);
    }
}
