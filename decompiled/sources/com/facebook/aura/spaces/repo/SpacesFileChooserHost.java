package com.facebook.aura.spaces.repo;

import android.net.Uri;
import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public interface SpacesFileChooserHost {
    void launch(String[] strArr, boolean z, boolean z2, ValueCallback<Uri[]> valueCallback);
}
