package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* loaded from: classes6.dex */
public final class FR3 {
    public GestureDetector A00;
    public final Context A01;
    public final InterfaceC2923Boo A02;

    public FR3(Context context, InterfaceC2923Boo interfaceC2923Boo) {
        ViewConfiguration.get(context).getScaledTouchSlop();
        this.A01 = context;
        this.A02 = interfaceC2923Boo;
        this.A00 = new GestureDetector(context, new FR4(this));
    }
}
