package X;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.facebook.aura.health.HealthConnectPermissionUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.Df0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5285Df0 implements Handler.Callback, InterfaceC5289Df4 {
    public final Context A00;
    public final Handler A01;
    public final Map<String, ServiceConnectionC5286Df1> A02 = BV4.A0u();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ServiceConnectionC5286Df1 serviceConnectionC5286Df1;
        int i = message.what;
        switch (i) {
            case 1:
                serviceConnectionC5286Df1 = (ServiceConnectionC5286Df1) message.obj;
                Iterator itA0n = AnonymousClass002.A0n(serviceConnectionC5286Df1.A05);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    AbstractC7529Ezo.A00("ServiceConnection", C8j3.A14(entryA0l.getKey(), C60O.A0x("Re-registering listener: ")));
                    ServiceConnectionC5286Df1.A00((InterfaceC5288Df3) entryA0l.getValue(), serviceConnectionC5286Df1);
                }
                Queue<InterfaceC5288Df3> queue = serviceConnectionC5286Df1.A06;
                queue.add(serviceConnectionC5286Df1.A03.A00);
                Iterator itA0z = BV5.A0z(queue);
                while (itA0z.hasNext()) {
                    InterfaceC5288Df3 interfaceC5288Df3 = (InterfaceC5288Df3) itA0z.next();
                    if (queue.remove(interfaceC5288Df3)) {
                        ServiceConnectionC5286Df1.A00(interfaceC5288Df3, serviceConnectionC5286Df1);
                    }
                }
                break;
            case 2:
                ServiceConnectionC5286Df1 serviceConnectionC5286Df12 = (ServiceConnectionC5286Df1) message.obj;
                if (serviceConnectionC5286Df12.A05.isEmpty()) {
                    AbstractC7529Ezo.A00("ServiceConnection", FGI.A0U("No listeners registered, service ", "HealthData", " is not automatically reconnected."));
                    return true;
                }
                serviceConnectionC5286Df12.A00++;
                AbstractC7529Ezo.A00("ServiceConnection", FGI.A0U("Listeners for service ", "HealthData", " are registered, reconnecting."));
                ServiceConnectionC5286Df1.A02(serviceConnectionC5286Df12);
                return true;
            case 3:
                InterfaceC5288Df3 interfaceC5288Df32 = (InterfaceC5288Df3) message.obj;
                C5281Dew c5281DewADw = interfaceC5288Df32.ADw();
                String str = String.format("%s#%s#%s", "HealthData", HealthConnectPermissionUtils.PROVIDER_PACKAGE, "androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE");
                Map<String, ServiceConnectionC5286Df1> map = this.A02;
                serviceConnectionC5286Df1 = map.get(str);
                if (serviceConnectionC5286Df1 == null) {
                    serviceConnectionC5286Df1 = new ServiceConnectionC5286Df1(this.A00, c5281DewADw, new C5277Der(), this);
                    map.put(str, serviceConnectionC5286Df1);
                }
                IBinder iBinder = serviceConnectionC5286Df1.A01;
                if (iBinder != null && iBinder.isBinderAlive()) {
                    ServiceConnectionC5286Df1.A00(interfaceC5288Df32, serviceConnectionC5286Df1);
                    break;
                } else {
                    serviceConnectionC5286Df1.A06.add(interfaceC5288Df32);
                    ServiceConnectionC5286Df1.A02(serviceConnectionC5286Df1);
                    break;
                }
                break;
            case 4:
                throw BV4.A0a("getListenerOperation");
            case 5:
                throw BV4.A0a("getListenerOperation");
            case 6:
                serviceConnectionC5286Df1 = (ServiceConnectionC5286Df1) message.obj;
                Handler handler = this.A01;
                if (!handler.hasMessages(3) && !handler.hasMessages(4) && !handler.hasMessages(5)) {
                    if (serviceConnectionC5286Df1.A06.isEmpty() && serviceConnectionC5286Df1.A05.isEmpty()) {
                        ServiceConnectionC5286Df1.A01(serviceConnectionC5286Df1);
                    }
                }
                return true;
            default:
                Log.e("ConnectionManager", FGI.A0H("Received unknown message: ", i));
                return false;
        }
        Handler handler2 = this.A01;
        handler2.removeMessages(6, serviceConnectionC5286Df1);
        handler2.sendMessageDelayed(handler2.obtainMessage(6, serviceConnectionC5286Df1), 15000L);
        return true;
    }

    public C5285Df0(Context context, Looper looper) {
        this.A00 = context;
        this.A01 = new Handler(looper, this);
    }
}
