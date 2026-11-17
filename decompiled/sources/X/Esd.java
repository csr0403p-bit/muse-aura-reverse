package X;

import com.facebook.msys.mci.NotificationCenterInternal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Esd extends Esf {
    public static final String __redex_internal_original_name = "NotificationCenterInternal$2";
    public final /* synthetic */ InterfaceC7370Esk A00;
    public final /* synthetic */ NotificationCenterInternal A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ Map A04;

    public Esd(InterfaceC7370Esk interfaceC7370Esk, NotificationCenterInternal notificationCenterInternal, String str, ArrayList arrayList, Map map) {
        this.A03 = arrayList;
        this.A02 = str;
        this.A00 = interfaceC7370Esk;
        this.A04 = map;
        this.A01 = notificationCenterInternal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((NotificationCenterInternal.NotificationCallbackInternal) it.next()).onNewNotification(this.A02, this.A00, this.A04);
        }
    }
}
