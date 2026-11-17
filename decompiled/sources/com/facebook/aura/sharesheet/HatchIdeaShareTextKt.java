package com.facebook.aura.sharesheet;

import X.AnonymousClass003;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;

/* loaded from: classes.dex */
public abstract class HatchIdeaShareTextKt {
    public static final String ideaShareText(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        return context.getString(R.string._name_removed__res_0x7f1205d4, HatchAppName.value, str);
    }
}
