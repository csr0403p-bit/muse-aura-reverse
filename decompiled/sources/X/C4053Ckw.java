package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import com.facebook.analytics2.logger.interfaces.IllegalRemoteArgumentException;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import java.util.ArrayDeque;

/* renamed from: X.Ckw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4053Ckw {
    public static C4053Ckw A02;
    public final Context A00;
    public final C4052Ckv A01;

    public final int A03(Intent intent, C3958Chx c3958Chx) throws IllegalRemoteArgumentException, RemoteException {
        String str;
        try {
        } catch (IllegalRemoteArgumentException e) {
            e = e;
            str = "Misunderstood service intent: %s";
            CFK.A0A("UploadServiceLogic", str, e);
            c3958Chx.A01.stopSelf(c3958Chx.A00);
        } catch (IllegalArgumentException e2) {
            e = e2;
            str = "Failure in runJobNow";
            CFK.A0A("UploadServiceLogic", str, e);
            c3958Chx.A01.stopSelf(c3958Chx.A00);
        }
        if (intent == null) {
            throw new IllegalRemoteArgumentException("Received a null intent in runJobFromService, did you ever return START_STICKY?");
        }
        Bundle extras = intent.getExtras();
        Context context = this.A00;
        C4054Ckx c4054CkxA00 = C4054Ckx.A00(context, extras);
        PowerManager powerManager = (PowerManager) c4054CkxA00.A03.getApplicationContext().getSystemService("power");
        ComponentName component = intent.getComponent();
        if (powerManager != null && component != null) {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, FGI.A0V("UploadServiceLogic-", component.getShortClassName(), "-service-", c4054CkxA00.A02));
            c4054CkxA00.A00 = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(60000L);
        }
        Messenger messenger = c4054CkxA00.A05;
        if (messenger != null) {
            try {
                messenger.send(Message.obtain());
            } catch (RemoteException unused) {
                CFK.A06("UploadServiceLogic", "The peer died unexpectedly, possible wakelock gap detected.");
            }
        }
        C4045Cko c4045Cko = c4054CkxA00.A06;
        String str2 = c4045Cko.A0B;
        if (str2 != null) {
            C4046Ckp c4046CkpA00 = C4046Ckp.A00(context);
            C4046Ckp.A02(c4046CkpA00, str2, c4046CkpA00.A04);
        }
        A02(c4054CkxA00, c3958Chx, this, intent.getAction());
        return !c4045Cko.A0D ? 3 : 2;
    }

    public static synchronized C4053Ckw A00(Context context) {
        C4053Ckw c4053Ckw;
        c4053Ckw = A02;
        if (c4053Ckw == null) {
            c4053Ckw = new C4053Ckw(context);
            A02 = c4053Ckw;
        }
        return c4053Ckw;
    }

    public static void A01(Context context, C4045Cko c4045Cko, C4053Ckw c4053Ckw, int i) {
        A02(new C4054Ckx(context, null, null, c4045Cko, new Cl7(0L, 0L, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", i), null, c4053Ckw, "com.facebook.analytics2.logger.UPLOAD_NOW");
    }

    public static void A02(C4054Ckx c4054Ckx, C3958Chx c3958Chx, C4053Ckw c4053Ckw, String str) {
        C4052Ckv c4052Ckv;
        C4065ClC c4065ClC;
        if ("com.facebook.analytics2.logger.UPLOAD_NOW".equals(str)) {
            c4052Ckv = c4053Ckw.A01;
            C1H.A00(c4052Ckv);
            int i = c4054Ckx.A02;
            c4065ClC = new C4065ClC(c4054Ckx.A06, c4054Ckx.A08, i);
        } else {
            if (!"com.facebook.analytics2.logger.USER_LOGOUT".equals(str)) {
                throw C60Q.A0U("Unknown action=", str);
            }
            Bundle bundle = c4054Ckx.A04;
            C1H.A00(bundle);
            bundle.getString(NodeCommandFallbackWorker.KEY_USER_ID);
            c4052Ckv = c4053Ckw.A01;
            C1H.A00(c4052Ckv);
            int i2 = c4054Ckx.A02;
            C4045Cko c4045Cko = c4054Ckx.A06;
            String str2 = c4054Ckx.A08;
            C1H.A00(str2);
            c4065ClC = new C4065ClC(c4045Cko, str2, i2);
        }
        InterfaceC4069ClG c4058Cl1 = c4054Ckx.A01;
        if (c4058Cl1 == null) {
            c4058Cl1 = new C4058Cl1(AbstractC4063Cl8.A00(c4054Ckx.A03), c4054Ckx);
            c4054Ckx.A01 = c4058Cl1;
        }
        Cl6 cl6 = new Cl6(c4058Cl1, c3958Chx);
        synchronized (c4052Ckv) {
            Cl9 cl9 = c4052Ckv.A01.get(c4065ClC.A00);
            synchronized (c4052Ckv) {
                if (cl9 != null) {
                    if (cl9.A00 != null) {
                        RunnableC4062Cl5 runnableC4062Cl5 = new RunnableC4062Cl5(c4065ClC, cl6, c4052Ckv);
                        ArrayDeque<Runnable> arrayDequeA0s = cl9.A01;
                        if (arrayDequeA0s == null) {
                            arrayDequeA0s = BV4.A0s();
                            cl9.A01 = arrayDequeA0s;
                        }
                        arrayDequeA0s.offer(runnableC4062Cl5);
                    }
                }
                C4052Ckv.A00(c4065ClC, cl6, c4052Ckv);
            }
        }
    }

    public final void A04(int i) {
        HandlerC4042Ckl handlerC4042Ckl;
        C4052Ckv c4052Ckv = this.A01;
        C1H.A00(c4052Ckv);
        synchronized (c4052Ckv) {
            Cl9 cl9 = c4052Ckv.A01.get(i);
            if (cl9 != null && (handlerC4042Ckl = cl9.A00) != null) {
                handlerC4042Ckl.sendMessageAtFrontOfQueue(handlerC4042Ckl.obtainMessage(3));
            }
        }
    }

    public final void A05(C4045Cko c4045Cko, InterfaceC4070ClI interfaceC4070ClI, String str, int i) {
        boolean z;
        String str2 = c4045Cko.A0B;
        if (str2 != null) {
            C4046Ckp c4046CkpA00 = C4046Ckp.A00(this.A00);
            C4046Ckp.A02(c4046CkpA00, str2, c4046CkpA00.A04);
        }
        C4052Ckv c4052Ckv = this.A01;
        C1H.A00(c4052Ckv);
        C4065ClC c4065ClC = new C4065ClC(c4045Cko, str, i);
        C4066ClD c4066ClD = new C4066ClD(interfaceC4070ClI);
        synchronized (c4052Ckv) {
            Cl9 cl9 = c4052Ckv.A01.get(c4065ClC.A00);
            if (cl9 != null) {
                z = cl9.A00 == null;
            }
            C4052Ckv.A00(c4065ClC, c4066ClD, c4052Ckv);
        }
        if (z) {
            return;
        }
        interfaceC4070ClI.AXM(true);
    }

    public C4053Ckw(Context context) {
        this.A00 = context.getApplicationContext();
        this.A01 = new C4052Ckv(context.getApplicationContext());
    }
}
