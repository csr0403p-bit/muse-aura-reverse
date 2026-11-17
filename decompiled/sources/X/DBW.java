package X;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes5.dex */
public final class DBW extends ECM {
    public final PowerManager A00;
    public final /* synthetic */ LayoutInflaterFactory2C8250FaT A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBW(Context context, LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT) {
        super(layoutInflaterFactory2C8250FaT);
        this.A01 = layoutInflaterFactory2C8250FaT;
        this.A00 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
