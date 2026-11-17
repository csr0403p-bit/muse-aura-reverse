package com.facebook.aura.checkpoint.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0Yr;
import X.C6t6;
import X.C6tF;
import X.C7384Etj;
import X.C78g;
import X.C7OU;
import X.CFK;
import X.G0U;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class HatchCheckpointFileChooserKt$HatchCheckpointFileChooser$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C7OU<Intent, ActivityResult> $fileChooserLauncher;
    public final /* synthetic */ MutableState<ValueCallback<Uri[]>> $pendingFileCallback$delegate;
    public final /* synthetic */ C6t6 $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCheckpointFileChooserKt$HatchCheckpointFileChooser$1$1(C6t6 c6t6, C7OU<Intent, ActivityResult> c7ou, MutableState<ValueCallback<Uri[]>> mutableState) {
        super(1);
        this.$webView = c6t6;
        this.$fileChooserLauncher = c7ou;
        this.$pendingFileCallback$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C6t6 c6t6 = this.$webView;
        final C7OU<Intent, ActivityResult> c7ou = this.$fileChooserLauncher;
        final MutableState<ValueCallback<Uri[]>> mutableState = this.$pendingFileCallback$delegate;
        c6t6.setWebChromeClient(new C6tF() { // from class: com.facebook.aura.checkpoint.view.HatchCheckpointFileChooserKt$HatchCheckpointFileChooser$1$1.1
            @Override // X.C6tF
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                AnonymousClass002.A1A(valueCallback, 1, fileChooserParams);
                if (mutableState.getValue() != null) {
                    valueCallback.onReceiveValue(null);
                    return true;
                }
                try {
                    C7OU<Intent, ActivityResult> c7ou2 = c7ou;
                    Intent intentCreateIntent = fileChooserParams.createIntent();
                    C7384Etj.A0U(intentCreateIntent);
                    c7ou2.A02(intentCreateIntent);
                    mutableState.Af8(valueCallback);
                    return true;
                } catch (RuntimeException e) {
                    CFK.A0A(HatchCheckpointFileChooserKt.TAG, "file chooser launch failed", e);
                    valueCallback.onReceiveValue(null);
                    return true;
                }
            }
        });
        final MutableState<ValueCallback<Uri[]>> mutableState2 = this.$pendingFileCallback$delegate;
        return new C78g() { // from class: com.facebook.aura.checkpoint.view.HatchCheckpointFileChooserKt$HatchCheckpointFileChooser$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                ValueCallback valueCallback = (ValueCallback) mutableState2.getValue();
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
                mutableState2.Af8(null);
            }
        };
    }
}
