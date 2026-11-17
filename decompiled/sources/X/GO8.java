package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.billingclient.h5;

/* loaded from: classes6.dex */
public final class GO8 implements ServiceConnection {
    public final /* synthetic */ C9531GNi A00;

    public GO8(C9531GNi c9531GNi) {
        this.A00 = c9531GNi;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h5 h5Var;
        GNN.A05("BillingClientTesting", "Billing Override Service connected.");
        C9531GNi c9531GNi = this.A00;
        if (iBinder == null) {
            h5Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            h5Var = iInterfaceQueryLocalInterface instanceof h5 ? (h5) iInterfaceQueryLocalInterface : new h5("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", iBinder);
        }
        c9531GNi.A03 = h5Var;
        c9531GNi.A01 = 2;
        c9531GNi.A0X(EnumC9540GNw.A0C);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        GNN.A06("BillingClientTesting", "Billing Override Service disconnected.");
        C9531GNi c9531GNi = this.A00;
        c9531GNi.A03 = null;
        c9531GNi.A01 = 0;
    }
}
