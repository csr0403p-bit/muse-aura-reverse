package com.facebook.msys.mci;

import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7320Ekq;
import X.Esd;
import X.InterfaceC7370Esk;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class NotificationCenterInternal {
    public final Map<Long, InterfaceC7370Esk> A00;
    public final Map A01;
    public final Set<String> A02;
    public NativeHolder mNativeHolder;

    public interface NotificationCallbackInternal {
        void onNewNotification(String str, InterfaceC7370Esk interfaceC7370Esk, Map<Object, Object> map);
    }

    public abstract void addObserverNative(String str, int i);

    public void dispatchNotificationToCallbacks(String str, Long l, Object obj) {
        InterfaceC7370Esk interfaceC7370Esk;
        int i;
        long j;
        boolean z;
        if (obj != null && !(obj instanceof Map)) {
            throw BV5.A0h("Native layer of msys reported a notification whose payload could not be serialized into a Java Map. Instead, it's of type ", C60Q.A0e(obj));
        }
        Map map = (Map) obj;
        ArrayList arrayListA0h = C3cG.A0h();
        synchronized (this) {
            interfaceC7370Esk = l != null ? this.A00.get(l) : null;
            Iterator itA0n = AnonymousClass002.A0n(this.A01);
            if (itA0n.hasNext()) {
                C3cH.A0l(itA0n).getValue();
                throw BV4.A0a("hasNotificationDispatchingCompatibleConfig");
            }
        }
        if (arrayListA0h.isEmpty()) {
            return;
        }
        AccountSession accountSession = getAccountSession();
        Esd esd = new Esd(interfaceC7370Esk, this, str, arrayListA0h, map);
        if (accountSession == null) {
            i = 0;
            j = 0;
            accountSession = null;
            z = true;
        } else {
            executionContext = str.equals("MCIDatabaseCommitNotificationV2") ? Execution.getExecutionContext() : 1;
            i = 0;
            j = 0;
            z = true;
            boolean z2 = Execution.sInitialized;
            switch (executionContext) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw BV5.A0S("Execution context ", " is not supported", executionContext);
            }
        }
        Execution.executeInternal(esd, accountSession, executionContext, i, j, z);
    }

    public abstract AccountSession getAccountSession();

    public abstract NativeHolder initNativeHolder();

    public abstract void postNotificationNative(String str);

    public abstract void removeObserverNative(String str);

    static {
        C7320Ekq.A00();
    }

    public NotificationCenterInternal(boolean z) {
        this.A00 = BV4.A0u();
        this.A01 = BV4.A0u();
        this.A02 = C60O.A13();
        if (z) {
            return;
        }
        this.mNativeHolder = initNativeHolder();
    }

    public void setNativeHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public NotificationCenterInternal() {
        this(false);
    }
}
