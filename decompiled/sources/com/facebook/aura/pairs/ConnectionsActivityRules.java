package com.facebook.aura.pairs;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.F0C;
import X.FGI;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ConnectionsSheetKey;
import com.facebook.aura.navigation.key.ConnectionsSheetSubject;
import com.facebook.aura.navigation.key.PairsHistoryScreenKey;
import com.facebook.aura.navigation.key.PairsStatusSheetKey;
import com.facebook.aura.navigation.key.PeerGoalScreenKey;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class ConnectionsActivityRules {
    public static final int $stable = 0;
    public static final ConnectionsActivityRules INSTANCE = new ConnectionsActivityRules();

    private final PeerGoalScreenKey sharedGoalDestination(PeerActivityJson peerActivityJson, ConnectionsSharedItem connectionsSharedItem) {
        String str;
        String str2;
        int length;
        if ((connectionsSharedItem != null ? connectionsSharedItem.kind : null) != ConnectionsSharedItemKind.GOAL || (str = peerActivityJson.host_muse) == null || !ConnectionsActivityKt.PEER_HOST.A08(str) || (str2 = peerActivityJson.goal_id) == null || (length = str2.length()) <= 0 || length > 256) {
            return null;
        }
        String str3 = connectionsSharedItem.title;
        if (str3 == null) {
            str3 = "";
        }
        return new PeerGoalScreenKey(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.facebook.aura.pairs.ConnectionsActivityRules] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    public final List<ConnectionsActivity> activity(PairsHubSnapshot pairsHubSnapshot, List<PeerActivityJson> list, long j) {
        ?? A0h;
        C7384Etj.A0Y(pairsHubSnapshot, 0);
        List<PairsContact> list2 = pairsHubSnapshot.contacts;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list2));
        for (PairsContact pairsContact : list2) {
            linkedHashMapA15.put(pairsContact.museId, pairsContact);
        }
        List<PairsInboxRequest> listInboxRequests = PairsPairingRules.INSTANCE.inboxRequests(pairsHubSnapshot, j);
        ArrayList arrayListA0m = AnonymousClass002.A0m(listInboxRequests);
        for (PairsInboxRequest pairsInboxRequest : listInboxRequests) {
            arrayListA0m.add(new ConnectionsActivity(FGI.A0M("request:", pairsInboxRequest.deliveryId), ConnectionsActivityKind.REQUEST_RECEIVED, pairsInboxRequest.museId, pairsInboxRequest.personName, pairsInboxRequest.photo, pairsInboxRequest.receivedAtMs, null, pairsInboxRequest, null, null, null, null, null, null, null));
        }
        if (list == null || list.isEmpty()) {
            List<PairsContact> list3 = pairsHubSnapshot.contacts;
            A0h = C3cG.A0h();
            Iterator<PairsContact> it = list3.iterator();
            while (it.hasNext()) {
                ConnectionsActivity connectionsActivityConnectedActivity = INSTANCE.connectedActivity(it.next(), j);
                if (connectionsActivityConnectedActivity != null) {
                    A0h.add(connectionsActivityConnectedActivity);
                }
            }
        } else {
            ArrayList arrayListA0h = C3cG.A0h();
            for (PeerActivityJson peerActivityJson : list) {
                boolean zEquals = ConnectionsActivityKt.KIND_CONFIRM_NEEDED.equals(peerActivityJson.kind);
                ConnectionsActivityRules connectionsActivityRules = INSTANCE;
                ConnectionsActivity confirmActivity = zEquals ? connectionsActivityRules.toConfirmActivity(peerActivityJson, pairsHubSnapshot) : connectionsActivityRules.toActivity(peerActivityJson, linkedHashMapA15);
                if (confirmActivity != null) {
                    arrayListA0h.add(confirmActivity);
                }
            }
            A0h = foldAcceptedIntoConnected(arrayListA0h);
        }
        return AbstractC0878AGe.A0c(AbstractC0878AGe.A0P(A0h, arrayListA0m), new Comparator() { // from class: com.facebook.aura.pairs.ConnectionsActivityRules$activity$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C60Q.A01(Long.valueOf(((ConnectionsActivity) t2).atMs), ((ConnectionsActivity) t).atMs);
            }
        });
    }

    public final boolean isKnown(PeerActivityJson peerActivityJson) {
        C7384Etj.A0Y(peerActivityJson, 0);
        return activityKind(peerActivityJson.kind) != null;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectionsActivityKind.values().length];
            try {
                AnonymousClass002.A13(ConnectionsActivityKind.ITEM_SHARED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectionsActivityKind.GOAL_UPDATED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConnectionsActivityKind.CONNECTED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConnectionsActivityKind.REQUEST_ACCEPTED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ConnectionsActivityKind.FILE_SHARED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ConnectionsActivityKind.SPACE_SHARED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ConnectionsActivityKind.REQUEST_RECEIVED, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(ConnectionsActivityKind.CONFIRM_NEEDED, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(ConnectionsActivityKind.LINK_SHARED, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final ConnectionsActivityKind activityKind(String str) {
        if (ConnectionsActivityKt.KIND_REQUEST_ACCEPTED.equals(str)) {
            return ConnectionsActivityKind.REQUEST_ACCEPTED;
        }
        if ("connected".equals(str)) {
            return ConnectionsActivityKind.CONNECTED;
        }
        if (ConnectionsActivityKt.KIND_CONFIRM_NEEDED.equals(str)) {
            return ConnectionsActivityKind.CONFIRM_NEEDED;
        }
        if (ConnectionsActivityKt.KIND_FILE_SHARED.equals(str)) {
            return ConnectionsActivityKind.FILE_SHARED;
        }
        if (ConnectionsActivityKt.KIND_SPACE_SHARED.equals(str)) {
            return ConnectionsActivityKind.SPACE_SHARED;
        }
        if (ConnectionsActivityKt.ITEM_SHARED_KINDS.contains(str)) {
            return ConnectionsActivityKind.ITEM_SHARED;
        }
        if (ConnectionsActivityKt.KIND_GOAL_UPDATED.equals(str)) {
            return ConnectionsActivityKind.GOAL_UPDATED;
        }
        if (ConnectionsActivityKt.KIND_LINK_SHARED.equals(str)) {
            return ConnectionsActivityKind.LINK_SHARED;
        }
        return null;
    }

    private final PeerSpaceScreenKey peerSpaceDestination(PeerActivityJson peerActivityJson, String str) {
        String str2 = peerActivityJson.muse_id;
        String str3 = peerActivityJson.space_id;
        if (str3 == null) {
            str3 = "";
        }
        ArtifactOpenTarget.PeerSpace peerSpacePeerSpaceTargetFromItemKey = UnifiedArtifactKt.peerSpaceTargetFromItemKey(FGI.A0U(str2, ":", str3));
        if (peerSpacePeerSpaceTargetFromItemKey == null) {
            return null;
        }
        String str4 = peerSpacePeerSpaceTargetFromItemKey.hostMuse;
        String str5 = peerSpacePeerSpaceTargetFromItemKey.spaceId;
        String str6 = peerActivityJson.person_name;
        return new PeerSpaceScreenKey(str4, str5, str, str6 != null ? PairsTextKt.peerDisplayText(str6, 256) : null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7 A[EDGE_INSN: B:140:0x00c7->B:56:0x00c7 BREAK  A[LOOP:0: B:85:0x0115->B:142:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.pairs.ConnectionsActivity toActivity(com.facebook.aura.pairs.PeerActivityJson r31, java.util.Map<java.lang.String, com.facebook.aura.pairs.PairsContact> r32) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsActivityRules.toActivity(com.facebook.aura.pairs.PeerActivityJson, java.util.Map):com.facebook.aura.pairs.ConnectionsActivity");
    }

    private final ConnectionsActivity toConfirmActivity(PeerActivityJson peerActivityJson, PairsHubSnapshot pairsHubSnapshot) {
        String str;
        PairsContact next;
        if (peerActivityJson.activity_id.length() != 0 && peerActivityJson.at_ms > 0 && (str = peerActivityJson.relationship_generation_id) != null && str.length() > 0) {
            Iterator<PairsContact> it = pairsHubSnapshot.contacts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                PairsRelationship pairsRelationship = next.relationship;
                if (str.equals(pairsRelationship != null ? pairsRelationship.generationId : null)) {
                    break;
                }
            }
            PairsContact pairsContact = next;
            if (pairsContact != null) {
                PairsPairingRules pairsPairingRules = PairsPairingRules.INSTANCE;
                if (pairsPairingRules.needsOwnerConfirmation(pairsContact, pairsHubSnapshot)) {
                    String str2 = peerActivityJson.activity_id;
                    String strA0M = FGI.A0M("feed:", str2);
                    ConnectionsActivityKind connectionsActivityKind = ConnectionsActivityKind.CONFIRM_NEEDED;
                    String str3 = pairsContact.museId;
                    String str4 = pairsContact.displayName;
                    String str5 = str4.length() > 0 ? str4 : null;
                    PairsImageRef pairsImageRef = pairsContact.photo;
                    long j = peerActivityJson.at_ms;
                    F0C<C9hr<Object>>[] f0cArr = PairsStatusSheetKey.$childSerializers;
                    return new ConnectionsActivity(strA0M, connectionsActivityKind, str3, str5, pairsImageRef, j, str2, null, null, null, null, null, new PairsStatusSheetKey(str, pairsPairingRules.role(pairsContact, pairsHubSnapshot), false), null, pairsContact);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.pairs.ConnectionsActivity connectedActivity(com.facebook.aura.pairs.PairsContact r15, long r16) {
        /*
            r14 = this;
            boolean r0 = r15.isVerified()
            r9 = 0
            if (r0 == 0) goto L55
            java.lang.Long r0 = r15.pairedAtMs
            if (r0 != 0) goto L15
            com.facebook.aura.pairs.PairsRelationship r0 = r15.relationship
            if (r0 == 0) goto L55
            long r0 = r0.startedAtMs
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L15:
            long r7 = r0.longValue()
            long r16 = r16 - r7
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 > 0) goto L55
            java.lang.String r4 = r15.museId
            java.lang.String r0 = "connected:"
            java.lang.String r2 = X.FGI.A0M(r0, r4)
            com.facebook.aura.pairs.ConnectionsActivityKind r3 = com.facebook.aura.pairs.ConnectionsActivityKind.CONNECTED
            java.lang.String r1 = r15.displayName
            int r0 = r1.length()
            r5 = r9
            if (r0 <= 0) goto L38
            r5 = r1
        L38:
            com.facebook.aura.pairs.PairsImageRef r6 = r15.photo
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.navigation.key.ConnectionsSheetKey.$childSerializers
            com.facebook.aura.navigation.key.ConnectionsSheetSubject$Person r0 = new com.facebook.aura.navigation.key.ConnectionsSheetSubject$Person
            r0.<init>(r4)
            com.facebook.aura.navigation.key.ConnectionsSheetKey r15 = new com.facebook.aura.navigation.key.ConnectionsSheetKey
            r15.<init>(r0)
            com.facebook.aura.pairs.ConnectionsActivity r1 = new com.facebook.aura.pairs.ConnectionsActivity
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r16 = r9
            r17 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L55:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsActivityRules.connectedActivity(com.facebook.aura.pairs.PairsContact, long):com.facebook.aura.pairs.ConnectionsActivity");
    }

    private final AuraNavKey destination(ConnectionsActivityKind connectionsActivityKind, PairsContact pairsContact, String str) {
        switch (connectionsActivityKind.ordinal()) {
            case 0:
            case 3:
            case 8:
                return null;
            case 1:
            case 2:
                F0C<C9hr<Object>>[] f0cArr = ConnectionsSheetKey.$childSerializers;
                return new ConnectionsSheetKey(new ConnectionsSheetSubject.Person(pairsContact.museId));
            case 4:
            case 5:
            case 6:
            case 7:
                String str2 = pairsContact.chatSessionId;
                if (str2 == null) {
                    return null;
                }
                String str3 = pairsContact.museId;
                if (str == null) {
                    str = pairsContact.connectionId;
                }
                return new PairsHistoryScreenKey(str3, str2, str);
            default:
                throw C3cG.A0q();
        }
    }

    private final List<ConnectionsActivity> foldAcceptedIntoConnected(List<ConnectionsActivity> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (ConnectionsActivity connectionsActivity : list) {
            ConnectionsActivityKind connectionsActivityKind = connectionsActivity.kind;
            if (connectionsActivityKind == ConnectionsActivityKind.REQUEST_ACCEPTED || connectionsActivityKind == ConnectionsActivityKind.CONNECTED) {
                arrayListA0h.add(connectionsActivity);
            }
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (Object obj : arrayListA0h) {
            ((List) C60R.A0Z(((ConnectionsActivity) obj).museId, linkedHashMapA0j)).add(obj);
        }
        Collection<List> collectionValues = linkedHashMapA0j.values();
        HashSet hashSetA13 = C60O.A13();
        for (List list2 : collectionValues) {
            ArrayList arrayListA0h2 = C3cG.A0h();
            for (Object obj2 : list2) {
                if (((ConnectionsActivity) obj2).kind == ConnectionsActivityKind.CONNECTED) {
                    arrayListA0h2.add(obj2);
                }
            }
            if (!arrayListA0h2.isEmpty()) {
                list2 = arrayListA0h2;
            }
            Iterator it = list2.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                long j = ((ConnectionsActivity) next).atMs;
                do {
                    Object next2 = it.next();
                    long j2 = ((ConnectionsActivity) next2).atMs;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
            hashSetA13.add(((ConnectionsActivity) next).id);
        }
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (ConnectionsActivity connectionsActivity2 : list) {
            ConnectionsActivity connectionsActivity3 = connectionsActivity2;
            ConnectionsActivityKind connectionsActivityKind2 = connectionsActivity3.kind;
            if ((connectionsActivityKind2 != ConnectionsActivityKind.REQUEST_ACCEPTED && connectionsActivityKind2 != ConnectionsActivityKind.CONNECTED) || hashSetA13.contains(connectionsActivity3.id)) {
                arrayListA0h3.add(connectionsActivity2);
            }
        }
        return arrayListA0h3;
    }
}
