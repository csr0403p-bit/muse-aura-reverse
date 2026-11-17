package com.facebook.aura.watchhandoff;

import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.CH0;
import X.F0C;
import X.HsJ;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.watchlink.WatchLinkClient;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class WatchSessionHandoffLink implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static String linkId;
    public static AbstractC3358CGz owner;
    public static String remoteNodeId;
    public static final WatchSessionHandoffLink INSTANCE = new WatchSessionHandoffLink();
    public static final F0C store$delegate = AbstractC5321DgF.A03(WatchSessionHandoffLink$store$2.INSTANCE);

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public synchronized void cleanup() {
        String strLinkedWatchNode = linkedWatchNode();
        ((WatchSessionLinkStore) store$delegate.getValue()).clear();
        remoteNodeId = null;
        owner = null;
        linkId = null;
        notifyRemote(strLinkedWatchNode);
    }

    public final synchronized String create(AbstractC3358CGz abstractC3358CGz, String str) {
        String strCurrent;
        AnonymousClass003.A0u(abstractC3358CGz, str);
        AuraSessionManager auraSessionManager = AuraSessionManager.INSTANCE;
        strCurrent = null;
        if (auraSessionManager.isCurrentSession(abstractC3358CGz)) {
            String strA0k = AnonymousClass002.A0k();
            String strLinkedWatchNode = linkedWatchNode();
            F0C f0c = store$delegate;
            if (((WatchSessionLinkStore) f0c.getValue()).write(new WatchStoredLink(((CH0) abstractC3358CGz).A01, strA0k, str))) {
                if (auraSessionManager.isCurrentSession(abstractC3358CGz)) {
                    remoteNodeId = str;
                    owner = abstractC3358CGz;
                    linkId = strA0k;
                    notifyRemote(strLinkedWatchNode);
                    strCurrent = current(abstractC3358CGz);
                } else {
                    ((WatchSessionLinkStore) f0c.getValue()).clear();
                }
            }
        }
        return strCurrent;
    }

    public final synchronized String current(AbstractC3358CGz abstractC3358CGz) {
        String str;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        AuraSessionManager auraSessionManager = AuraSessionManager.INSTANCE;
        str = null;
        if (auraSessionManager.isCurrentSession(abstractC3358CGz)) {
            AbstractC3358CGz abstractC3358CGz2 = owner;
            if (abstractC3358CGz2 == null || abstractC3358CGz2 == abstractC3358CGz) {
                WatchStoredLink watchStoredLink = ((WatchSessionLinkStore) store$delegate.getValue()).read();
                if (watchStoredLink != null) {
                    if (C7384Etj.areEqual(watchStoredLink.userId, ((CH0) abstractC3358CGz).A01)) {
                        if (auraSessionManager.isCurrentSession(abstractC3358CGz)) {
                            owner = abstractC3358CGz;
                            str = watchStoredLink.linkId;
                            linkId = str;
                            remoteNodeId = watchStoredLink.nodeId;
                        }
                    }
                }
            }
            cleanup();
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String currentRemote(X.AbstractC3358CGz r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            X.AnonymousClass003.A0u(r4, r5)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r3.current(r4)     // Catch: java.lang.Throwable -> L17
            r1 = 0
            if (r2 == 0) goto L14
            java.lang.String r0 = com.facebook.aura.watchhandoff.WatchSessionHandoffLink.remoteNodeId     // Catch: java.lang.Throwable -> L17
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            monitor-exit(r3)
            return r2
        L17:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchhandoff.WatchSessionHandoffLink.currentRemote(X.CGz, java.lang.String):java.lang.String");
    }

    public final synchronized String currentRemoteOrCreate(AbstractC3358CGz abstractC3358CGz, String str) {
        String strCurrentRemote;
        AnonymousClass003.A0u(abstractC3358CGz, str);
        strCurrentRemote = currentRemote(abstractC3358CGz, str);
        if (strCurrentRemote == null) {
            strCurrentRemote = create(abstractC3358CGz, str);
        }
        return strCurrentRemote;
    }

    public final synchronized String linkedWatchNode() {
        String str;
        str = remoteNodeId;
        if (str == null) {
            WatchStoredLink watchStoredLink = ((WatchSessionLinkStore) store$delegate.getValue()).read();
            str = watchStoredLink != null ? watchStoredLink.nodeId : null;
        }
        return str;
    }

    public final synchronized void notifyLinkedWatch(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        if (current(abstractC3358CGz) != null) {
            CFK.A05("WatchSession", "Notifying linked watch after phone session became ready");
            notifyRemote(remoteNodeId);
        }
    }

    private final WatchSessionLinkStore getStore() {
        return (WatchSessionLinkStore) store$delegate.getValue();
    }

    private final void notifyRemote(String str) {
        Object objA0s;
        if (str != null) {
            try {
                WatchLinkClient.INSTANCE.notifyChanged(C3cG.A06(), str);
                objA0s = Unit.INSTANCE;
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            Throwable thA00 = HsJ.A00(objA0s);
            if (thA00 != null) {
                CFK.A0A("WatchSession", "Failed to notify watch of session change", thA00);
            }
        }
    }
}
