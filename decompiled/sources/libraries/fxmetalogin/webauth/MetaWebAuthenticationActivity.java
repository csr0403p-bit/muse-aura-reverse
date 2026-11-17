package libraries.fxmetalogin.webauth;

import X.C7384Etj;
import X.CFK;
import X.F0O;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class MetaWebAuthenticationActivity extends AppCompatActivity {
    public static final F0O<String> A01;
    public boolean A00 = true;

    static {
        F0O<String> f0o = new F0O<>(3);
        Collections.addAll(f0o, "com.android.chrome", "com.sec.android.app.sbrowser", "com.opera.browser");
        A01 = f0o;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        C7384Etj.A0Y(intent, 0);
        super.onNewIntent(intent);
        if (getPackageName().equals(getCallingPackage())) {
            Uri data = intent.getData();
            if (data != null && A00(data)) {
                Intent intentPutExtra = new Intent().putExtra("CALLBACK_URI_KEY", data.toString());
                C7384Etj.A0U(intentPutExtra);
                setResult(-1, intentPutExtra);
            }
            finish();
        }
        CFK.A04("MetaWebAuthenticationActivity", "Caller of activity is not trusted");
        setResult(0);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A00(android.net.Uri r11) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: libraries.fxmetalogin.webauth.MetaWebAuthenticationActivity.A00(android.net.Uri):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: libraries.fxmetalogin.webauth.MetaWebAuthenticationActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.A00) {
            setResult(0);
            finish();
        }
        this.A00 = false;
    }
}
