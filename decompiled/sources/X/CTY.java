package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import com.facebook.aura.spacesharing.impl.SpaceShareUiCommandsKt;
import com.google.firebase.iid.zzam;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class CTY implements ServiceConnection {
    public C3544CTd A01;
    public final /* synthetic */ CS4 A05;
    public int A00 = 0;
    public final Messenger A02 = new Messenger(new CTX(Looper.getMainLooper(), new Handler.Callback(this) { // from class: X.CTb
        public final CTY A00;

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            Bundle bundle;
            CTY cty = this.A00;
            int i = message.arg1;
            if (BV4.A1U("MessengerIpcClient")) {
                Log.d("MessengerIpcClient", C60P.A1O("Received response to request: ", BV4.A0p(41), i));
            }
            synchronized (cty) {
                SparseArray<CTa<?>> sparseArray = cty.A03;
                CTa<?> cTa = sparseArray.get(i);
                if (cTa == null) {
                    Log.w("MessengerIpcClient", C60P.A1O("Received response for unknown request: ", BV4.A0p(50), i));
                    return true;
                }
                sparseArray.remove(i);
                cty.A00();
                Bundle data = message.getData();
                if (data.getBoolean(SpaceShareUiCommandsKt.ERROR_CODE_UNSUPPORTED, false)) {
                    cTa.A00(new zzam(4, "Not supported by GmsCore"));
                    return true;
                }
                if (cTa instanceof C3546CTf) {
                    bundle = data.getBundle("data");
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                } else {
                    if (!data.getBoolean("ack", false)) {
                        cTa.A00(new zzam(4, "Invalid response to one way request"));
                        return true;
                    }
                    bundle = null;
                }
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String strValueOf = String.valueOf(cTa);
                    String strValueOf2 = String.valueOf(bundle);
                    StringBuilder sbA0r = BV5.A0r(strValueOf2, BV5.A04(strValueOf) + 16);
                    sbA0r.append("Finishing ");
                    sbA0r.append(strValueOf);
                    BV8.A1P(sbA0r, " with ", strValueOf2, "MessengerIpcClient");
                }
                cTa.A03.A02(bundle);
                return true;
            }
        }

        {
            this.A00 = this;
        }
    }));
    public final Queue<CTa<?>> A04 = BV4.A0s();
    public final SparseArray<CTa<?>> A03 = BV4.A0B();

    public final synchronized void A00() {
        if (this.A00 == 2 && this.A04.isEmpty() && this.A03.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.A00 = 3;
            CUD.A00().A02(this.A05.A02, this);
        }
    }

    public final synchronized void A01(int i, String str) {
        SparseArray<CTa<?>> sparseArray;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        int i2 = this.A00;
        if (i2 == 0) {
            throw BV4.A0T();
        }
        if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.A00 = 4;
            CUD.A00().A02(this.A05.A02, this);
            zzam zzamVar = new zzam(i, str);
            Queue<CTa<?>> queue = this.A04;
            Iterator<CTa<?>> it = queue.iterator();
            while (it.hasNext()) {
                it.next().A00(zzamVar);
            }
            queue.clear();
            int i3 = 0;
            while (true) {
                sparseArray = this.A03;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                sparseArray.valueAt(i3).A00(zzamVar);
                i3++;
            }
            sparseArray.clear();
        } else if (i2 == 3) {
            this.A00 = 4;
        }
    }

    public final synchronized boolean A02(CTa cTa) {
        int i = this.A00;
        if (i == 0) {
            this.A04.add(cTa);
            if (this.A00 != 0) {
                throw BV4.A0T();
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.A00 = 1;
            Intent intentA03 = C60P.A03("com.google.android.c2dm.intent.REGISTER");
            intentA03.setPackage(AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE);
            CUD cudA00 = CUD.A00();
            CS4 cs4 = this.A05;
            Context context = cs4.A02;
            if (CUD.A01(context, intentA03, this, cudA00, C60Q.A0e(context), 1)) {
                cs4.A03.schedule(new Runnable(this) { // from class: X.CTg
                    public static final String __redex_internal_original_name = "zzag";
                    public final CTY A00;

                    @Override // java.lang.Runnable
                    public final void run() {
                        CTY cty = this.A00;
                        synchronized (cty) {
                            if (cty.A00 == 1) {
                                cty.A01(1, "Timed out while binding");
                            }
                        }
                    }

                    {
                        this.A00 = this;
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                A01(0, "Unable to bind to service");
            }
        } else if (i == 1) {
            this.A04.add(cTa);
        } else {
            if (i != 2) {
                return false;
            }
            this.A04.add(cTa);
            this.A05.A03.execute(new CTZ(this));
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String message;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            message = "Null service connection";
        } else {
            try {
                this.A01 = new C3544CTd(iBinder);
                this.A00 = 2;
                this.A05.A03.execute(new CTZ(this));
            } catch (RemoteException e) {
                message = e.getMessage();
            }
        }
        A01(0, message);
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        A01(2, "Service disconnected");
    }

    public CTY(CS4 cs4) {
        this.A05 = cs4;
    }
}
