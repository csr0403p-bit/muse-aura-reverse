package X;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import com.facebook.aura.network.AuraAcceptLanguage;

/* renamed from: X.7VN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7VN {
    public ActivityOptions A00;
    public final Intent A01 = C60P.A03("android.intent.action.VIEW");

    private void A00() {
        if (this.A00 == null) {
            this.A00 = ActivityOptions.makeBasic();
        }
        C7VP.A00(this.A00, !this.A01.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
    }

    private void A01() {
        ActivityOptions activityOptionsMakeBasic = this.A00;
        if (activityOptionsMakeBasic == null) {
            activityOptionsMakeBasic = ActivityOptions.makeBasic();
            this.A00 = activityOptionsMakeBasic;
        }
        C7VO.A00(activityOptionsMakeBasic);
    }

    public final C7LB A02() {
        Intent intent = this.A01;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey(AuraAcceptLanguage.HEADER)) {
                bundleExtra.putString(AuraAcceptLanguage.HEADER, languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i >= 34) {
            A01();
            if (i >= 36) {
                A00();
            }
        }
        ActivityOptions activityOptions = this.A00;
        return new C7LB(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }
}
