package com.facebook.aura.notifications.push;

import X.AnonymousClass005;
import X.C3942ChY;
import X.C7384Etj;
import X.CFK;
import X.InterfaceC7409Eus;
import com.facebook.aura.auth.signout.PreSignOutTask;
import com.facebook.pushlite.PushTokenManager;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class AuraPushTokenSignOutTask implements PreSignOutTask {
    public static final AuraPushTokenSignOutTask INSTANCE = new AuraPushTokenSignOutTask();

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.AbstractCollection, java.util.HashSet] */
    @Override // com.facebook.aura.auth.signout.PreSignOutTask
    public void execute() {
        PushTokenManager pushTokenManager = (PushTokenManager) C7384Etj.A0G(AuraPushManager.instance.A07);
        synchronized (pushTokenManager) {
            C3942ChY c3942ChY = (C3942ChY) pushTokenManager.A04.getValue();
            Iterator it = c3942ChY.A02().iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                InterfaceC7409Eus interfaceC7409Eus = pushTokenManager.A02.get(strA0j);
                if (interfaceC7409Eus != null) {
                    interfaceC7409Eus.ABo();
                }
                try {
                    c3942ChY.A03(strA0j);
                } catch (IOException e) {
                    CFK.A0C("PushTokenManager", "Failed to unregister %s token with token sender", e, strA0j);
                }
            }
        }
    }
}
