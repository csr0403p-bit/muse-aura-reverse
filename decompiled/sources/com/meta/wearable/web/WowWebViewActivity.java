package com.meta.wearable.web;

import X.C60P;
import X.C6t6;
import X.C6tA;
import X.C7384Etj;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.Toolbar;

/* loaded from: classes3.dex */
public final class WowWebViewActivity extends Activity {
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C7384Etj.A0Y(menuItem, 0);
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("WowWebViewActivity.EXTRA_URL");
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        Toolbar toolbar = new Toolbar(this);
        toolbar.setLayoutParams(new Toolbar.LayoutParams(-1, -2));
        if (C60P.A00(this) == 32) {
            toolbar.setTitleTextColor(-1);
            toolbar.setSubtitleTextColor(-1);
        } else {
            toolbar.setTitleTextColor(-16777216);
            toolbar.setSubtitleTextColor(-16777216);
        }
        linearLayout.addView(toolbar);
        setActionBar(toolbar);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle(stringExtra);
            CharSequence title = getTitle();
            if (title != null) {
                actionBar.setTitle(title);
                actionBar.setSubtitle(stringExtra);
            }
        }
        C6t6 c6t6 = new C6t6(this);
        c6t6.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        WebSettings settings = c6t6.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        if (stringExtra != null) {
            c6t6.loadUrl(stringExtra);
        }
        c6t6.setWebViewClient(new C6tA() { // from class: X.7LH
            @Override // X.C6tA
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                ActionBar actionBar2 = this.A00.getActionBar();
                if (actionBar2 != null) {
                    actionBar2.setTitle(webView != null ? webView.getTitle() : null);
                    actionBar2.setSubtitle(str);
                }
            }
        });
        linearLayout.addView(c6t6);
        setContentView(linearLayout);
    }
}
