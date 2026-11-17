package com.facebook.aura.email.view;

import X.AnonymousClass006;
import X.BFM;
import X.C1BO;
import com.facebook.aura.email.model.EmailSettingsCopy;

/* loaded from: classes.dex */
public abstract class EmailProductNameKt {
    public static final String emailProductName(String str, BFM bfm, int i) {
        return (String) C1BO.A07(bfm, EmailComponentsKt.rememberEmailViewModel(str, bfm, AnonymousClass006.A0E(str, i)).productName);
    }

    public static final EmailSettingsCopy emailSettingsCopy(String str, BFM bfm, int i) {
        return (EmailSettingsCopy) C1BO.A07(bfm, EmailComponentsKt.rememberEmailViewModel(str, bfm, AnonymousClass006.A0E(str, i)).settingsCopy);
    }
}
