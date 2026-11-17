package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.sun.jna.Callback;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public abstract class Cad extends Service {
    public Messenger A00;
    public ExecutorService A01;
    public int A02;
    public final Set<String> A03 = C60O.A13();

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        boolean zBooleanValue;
        String string;
        String str;
        String str2;
        try {
            super.onStartCommand(intent, i, i2);
            if (intent != null) {
                String action = intent.getAction();
                if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        CFK.A04("GcmTaskService", "Null Intent passed, terminating");
                    } else {
                        Bundle bundleA0N = BV6.A0N();
                        Parcel parcelObtain = Parcel.obtain();
                        extras.writeToParcel(parcelObtain, 0);
                        parcelObtain.setDataPosition(0);
                        try {
                            Pair pairCreate = null;
                            if (parcelObtain.readInt() > 0 && parcelObtain.readInt() == 1279544898) {
                                int i3 = parcelObtain.readInt();
                                int i4 = 0;
                                C3619CZi c3619CZi = null;
                                while (true) {
                                    if (i4 < i3) {
                                        synchronized (C3632Cag.class) {
                                            if (C3632Cag.A00 == null) {
                                                Bundle bundleA0N2 = BV6.A0N();
                                                bundleA0N2.putString("key", BrowserOperationCatalogKt.VALUE);
                                                parcelObtain = Parcel.obtain();
                                                bundleA0N2.writeToParcel(parcelObtain, 0);
                                                parcelObtain.setDataPosition(0);
                                                try {
                                                    try {
                                                    } catch (RuntimeException e) {
                                                        BzX.A00("GooglePlayCallbackExtractor", "Failed to determine if keys should be read as strings", e);
                                                        C3632Cag.A00 = Boolean.FALSE;
                                                    }
                                                    if (parcelObtain.readInt() <= 0 || parcelObtain.readInt() != 1279544898 || parcelObtain.readInt() != 1) {
                                                        IllegalStateException illegalStateExceptionA0T = BV4.A0T();
                                                        throw illegalStateExceptionA0T;
                                                    }
                                                    C3632Cag.A00 = Boolean.valueOf("key".equals(parcelObtain.readString()));
                                                } finally {
                                                }
                                            }
                                            zBooleanValue = C3632Cag.A00.booleanValue();
                                        }
                                        if (zBooleanValue) {
                                            string = parcelObtain.readString();
                                        } else {
                                            Object value = parcelObtain.readValue(null);
                                            if (value instanceof String) {
                                                string = (String) value;
                                            } else {
                                                CFK.A06("GooglePlayCallbackExtractor", "Bad callback received, terminating");
                                                i4++;
                                            }
                                        }
                                        if (string == null) {
                                            continue;
                                        } else if (c3619CZi != null || !Callback.METHOD_NAME.equals(string)) {
                                            Object value2 = parcelObtain.readValue(null);
                                            if (value2 instanceof String) {
                                                bundleA0N.putString(string, (String) value2);
                                            } else if (value2 instanceof Boolean) {
                                                bundleA0N.putBoolean(string, AnonymousClass001.A1X(value2));
                                            } else if (value2 instanceof Integer) {
                                                bundleA0N.putInt(string, BV6.A07(value2));
                                            } else if (value2 instanceof ArrayList) {
                                                bundleA0N.putParcelableArrayList(string, (ArrayList) value2);
                                            } else if (value2 instanceof Bundle) {
                                                bundleA0N.putBundle(string, (Bundle) value2);
                                            } else if (value2 instanceof Parcelable) {
                                                bundleA0N.putParcelable(string, (Parcelable) value2);
                                            }
                                        } else {
                                            if (parcelObtain.readInt() != 4) {
                                                CFK.A06("GooglePlayCallbackExtractor", "Bad callback received, terminating");
                                                break;
                                            }
                                            if (!"com.google.android.gms.gcm.PendingCallback".equals(parcelObtain.readString())) {
                                                CFK.A06("GooglePlayCallbackExtractor", "Bad callback received, terminating");
                                                break;
                                            }
                                            c3619CZi = new C3619CZi(parcelObtain.readStrongBinder());
                                        }
                                        i4++;
                                    } else if (c3619CZi == null) {
                                        CFK.A06("GooglePlayCallbackExtractor", "No callback received, terminating");
                                    } else {
                                        pairCreate = Pair.create(c3619CZi, bundleA0N);
                                    }
                                }
                            } else {
                                CFK.A06("GooglePlayCallbackExtractor", "No callback received, terminating");
                            }
                            if (pairCreate == null) {
                                str = "GcmTaskService";
                                str2 = "no callback found";
                            } else {
                                InterfaceC3633Cah interfaceC3633Cah = (InterfaceC3633Cah) pairCreate.first;
                                Bundle bundle = (Bundle) pairCreate.second;
                                String string2 = bundle.getString("tag");
                                if (string2 == null) {
                                    str = "GcmTaskService";
                                    str2 = "no tag found";
                                } else {
                                    Cae caeA00 = A00(bundle.getBundle("extras"), this, interfaceC3633Cah, string2);
                                    if (caeA00 != null) {
                                        caeA00.A01();
                                    }
                                }
                            }
                            CFK.A05(str, str2);
                        } finally {
                        }
                    }
                } else if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                    CFK.A04("GcmTaskService", "Unknown action received, terminating");
                }
            }
            return 2;
        } finally {
            A01(i2);
        }
    }

    public static Cae A00(Bundle bundle, Cad cad, InterfaceC3633Cah interfaceC3633Cah, String str) {
        Set<String> set = cad.A03;
        synchronized (set) {
            if (set.add(str)) {
                return new Cae(bundle, cad, interfaceC3633Cah, str);
            }
            CFK.A0H("GcmTaskService", "%s: Task already running, won't start another", cad.getPackageName());
            return null;
        }
    }

    private void A01(int i) {
        Set<String> set = this.A03;
        synchronized (set) {
            this.A02 = i;
            if (set.isEmpty()) {
                stopSelf(this.A02);
            }
        }
    }

    public static void A02(Cad cad, String str) {
        Set<String> set = cad.A03;
        synchronized (set) {
            set.remove(str);
            if (set.isEmpty()) {
                cad.stopSelf(cad.A02);
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Messenger messenger;
        if (intent == null || !BV5.A1Q(intent, "com.google.android.gms.gcm.ACTION_TASK_READY")) {
            return null;
        }
        synchronized (this) {
            messenger = this.A00;
            if (messenger == null) {
                messenger = new Messenger(new HandlerC3630Cac(new ComponentName(this, getClass()), Looper.getMainLooper(), this));
                this.A00 = messenger;
            }
        }
        return messenger.getBinder();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ExecutorService executorServiceNewFixedThreadPool;
        super.onDestroy();
        synchronized (this) {
            executorServiceNewFixedThreadPool = this.A01;
            if (executorServiceNewFixedThreadPool == null) {
                executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new ThreadFactoryC3017Bs4());
                this.A01 = executorServiceNewFixedThreadPool;
            }
        }
        if (executorServiceNewFixedThreadPool != null) {
            List<Runnable> listShutdownNow = executorServiceNewFixedThreadPool.shutdownNow();
            if (listShutdownNow.isEmpty()) {
                return;
            }
            CFK.A0F("GcmTaskService", "Shutting down, but not all tasks are finished executing. Remaining: %d", BV5.A1Y(listShutdownNow.size()));
        }
    }
}
