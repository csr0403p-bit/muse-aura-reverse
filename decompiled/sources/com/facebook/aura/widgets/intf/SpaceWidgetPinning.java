package com.facebook.aura.widgets.intf;

import android.content.Context;

/* loaded from: classes.dex */
public interface SpaceWidgetPinning {
    boolean isSupported(Context context);

    boolean requestPin(Context context, String str, String str2);
}
