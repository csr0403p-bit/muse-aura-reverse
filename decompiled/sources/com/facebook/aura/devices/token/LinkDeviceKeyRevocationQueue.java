package com.facebook.aura.devices.token;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C9258GBl;
import X.C9sU;
import X.CFK;
import X.InterfaceC2261BLa;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes4.dex */
public final class LinkDeviceKeyRevocationQueue {
    public static final Companion Companion = new Companion();
    public final InterfaceC2261BLa drainMutex;
    public List<LinkDeviceKeyPendingRevokeJson> loaded;
    public final Object lock;
    public final LinkDeviceKeyRevocationStorage storage;

    public LinkDeviceKeyRevocationQueue(LinkDeviceKeyRevocationStorage linkDeviceKeyRevocationStorage) {
        C7384Etj.A0Y(linkDeviceKeyRevocationStorage, 0);
        this.storage = linkDeviceKeyRevocationStorage;
        this.drainMutex = new C9258GBl();
        this.lock = C3cG.A0T();
    }

    public final void enqueue(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson) {
        C7384Etj.A0Y(linkDeviceKeyPendingRevokeJson, 0);
        synchronized (this.lock) {
            List<LinkDeviceKeyPendingRevokeJson> listEntries = entries();
            if (!(listEntries instanceof Collection) || !listEntries.isEmpty()) {
                Iterator<LinkDeviceKeyPendingRevokeJson> it = listEntries.iterator();
                while (it.hasNext()) {
                    if (LinkDeviceKeyRevocationQueueKt.isSame(it.next(), linkDeviceKeyPendingRevokeJson)) {
                        break;
                    }
                }
            }
            store(AbstractC0878AGe.A0Q(linkDeviceKeyPendingRevokeJson, listEntries));
        }
    }

    public final List<LinkDeviceKeyPendingRevokeJson> pending(LinkDeviceKeyOwnerState linkDeviceKeyOwnerState) {
        ArrayList arrayListA0h;
        C7384Etj.A0Y(linkDeviceKeyOwnerState, 0);
        synchronized (this.lock) {
            List<LinkDeviceKeyPendingRevokeJson> listEntries = entries();
            arrayListA0h = C3cG.A0h();
            for (LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson : listEntries) {
                if (LinkDeviceKeyRevocationQueueKt.isFor(linkDeviceKeyPendingRevokeJson, linkDeviceKeyOwnerState)) {
                    arrayListA0h.add(linkDeviceKeyPendingRevokeJson);
                }
            }
        }
        return arrayListA0h;
    }

    public final void recordFailedAttempt(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson) {
        C7384Etj.A0Y(linkDeviceKeyPendingRevokeJson, 0);
        synchronized (this.lock) {
            List<LinkDeviceKeyPendingRevokeJson> listEntries = entries();
            ArrayList arrayListA0i = AnonymousClass003.A0i(listEntries);
            for (LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJsonCopy : listEntries) {
                if (LinkDeviceKeyRevocationQueueKt.isSame(linkDeviceKeyPendingRevokeJsonCopy, linkDeviceKeyPendingRevokeJson)) {
                    linkDeviceKeyPendingRevokeJsonCopy = linkDeviceKeyPendingRevokeJsonCopy.copy(linkDeviceKeyPendingRevokeJsonCopy.host_label, linkDeviceKeyPendingRevokeJsonCopy.vm_id, linkDeviceKeyPendingRevokeJsonCopy.vm_kind, linkDeviceKeyPendingRevokeJsonCopy.key_id, linkDeviceKeyPendingRevokeJsonCopy.node_id, linkDeviceKeyPendingRevokeJsonCopy.attempts + 1);
                }
                arrayListA0i.add(linkDeviceKeyPendingRevokeJsonCopy);
            }
            store(arrayListA0i);
        }
    }

    public final void settle(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson) {
        C7384Etj.A0Y(linkDeviceKeyPendingRevokeJson, 0);
        synchronized (this.lock) {
            List<LinkDeviceKeyPendingRevokeJson> listEntries = entries();
            ArrayList arrayListA0h = C3cG.A0h();
            for (LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson2 : listEntries) {
                if (!LinkDeviceKeyRevocationQueueKt.isSame(linkDeviceKeyPendingRevokeJson2, linkDeviceKeyPendingRevokeJson)) {
                    arrayListA0h.add(linkDeviceKeyPendingRevokeJson2);
                }
            }
            store(arrayListA0h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<com.facebook.aura.devices.token.LinkDeviceKeyPendingRevokeJson>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.AGi] */
    private final List<LinkDeviceKeyPendingRevokeJson> entries() {
        ?? A0h;
        LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson;
        List<LinkDeviceKeyPendingRevokeJson> list = this.loaded;
        if (list != null) {
            return list;
        }
        String strLoad = this.storage.load();
        if (strLoad != null) {
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                Iterable iterable = (Iterable) c9sU.A00(strLoad, JsonArraySerializer.A01);
                A0h = C3cG.A0h();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    try {
                        linkDeviceKeyPendingRevokeJson = (LinkDeviceKeyPendingRevokeJson) c9sU.A01(LinkDeviceKeyPendingRevokeJson$$serializer.INSTANCE, (JsonElement) it.next());
                    } catch (Exception e) {
                        CFK.A08("LinkDeviceKeyRevocations", "revoke queue entry unreadable", e);
                        linkDeviceKeyPendingRevokeJson = null;
                    }
                    if (linkDeviceKeyPendingRevokeJson != null) {
                        A0h.add(linkDeviceKeyPendingRevokeJson);
                    }
                }
            } catch (Exception e2) {
                throw new IllegalStateException("Revoke queue unreadable", e2);
            }
        } else {
            A0h = C0881AGi.A00;
        }
        this.loaded = A0h;
        return A0h;
    }

    private final void store(List<LinkDeviceKeyPendingRevokeJson> list) {
        this.loaded = list;
        if (this.storage.save(list.isEmpty() ? null : HatchJsonKt.HatchJson.A02(list, C3cG.A19(LinkDeviceKeyPendingRevokeJson$$serializer.INSTANCE)))) {
            return;
        }
        CFK.A0F("LinkDeviceKeyRevocations", "revoke queue not persisted (%d pending)", C60Q.A0W(list));
    }

    public final InterfaceC2261BLa getDrainMutex() {
        return this.drainMutex;
    }

    public final boolean hasPending() {
        boolean zIsEmpty;
        synchronized (this.lock) {
            List<LinkDeviceKeyPendingRevokeJson> list = this.loaded;
            zIsEmpty = true;
            if (list != null) {
                zIsEmpty = true ^ list.isEmpty();
            } else {
                String strLoad = this.storage.load();
                if (strLoad == null || strLoad.length() == 0) {
                    zIsEmpty = false;
                }
            }
        }
        return zIsEmpty;
    }

    public final class Companion {
        public final LinkDeviceKeyRevocationQueue forSession(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (LinkDeviceKeyRevocationQueue) abstractC3358CGz.A03(LinkDeviceKeyRevocationQueue.class, new LinkDeviceKeyRevocationQueue$Companion$forSession$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
