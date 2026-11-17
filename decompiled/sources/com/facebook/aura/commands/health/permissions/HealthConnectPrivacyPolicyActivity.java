package com.facebook.aura.commands.health.permissions;

import X.C7oV;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.facebook.aura.utils.navigation.SecureUriKt;

/* loaded from: classes3.dex */
public final class HealthConnectPrivacyPolicyActivity extends ComponentActivity {
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C7oV.A01().A00(this, getIntent(), this)) {
            SecureUriKt.openInApp(SecureUriKt.asSecureUri(HealthConnectPrivacyPolicyActivityKt.PRIVACY_POLICY_URL), this);
        }
        finish();
    }
}
