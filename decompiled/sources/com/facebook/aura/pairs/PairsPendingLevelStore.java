package com.facebook.aura.pairs;

import X.AGH;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BzK;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class PairsPendingLevelStore {
    public static final int $stable = 8;
    public final HashSet<String> inFlight;
    public final Object lock;
    public final AbstractC3358CGz userSession;

    public final class Due {
        public static final int $stable = PairsContact.$stable;
        public final PairsContact contact;
        public final String generationId;
        public final PairsLevel level;

        public final PairsContact getContact() {
            return this.contact;
        }

        public final String getGenerationId() {
            return this.generationId;
        }

        public final PairsLevel getLevel() {
            return this.level;
        }

        public Due(PairsContact pairsContact, String str, PairsLevel pairsLevel) {
            AnonymousClass005.A0x(pairsContact, str, pairsLevel);
            this.contact = pairsContact;
            this.generationId = str;
            this.level = pairsLevel;
        }
    }

    public final class TakeResult {
        public static final int $stable = 8;
        public final boolean didDrop;
        public final List<Due> due;

        public TakeResult(List<Due> list, boolean z) {
            C7384Etj.A0Y(list, 0);
            this.due = list;
            this.didDrop = z;
        }

        public final boolean getDidDrop() {
            return this.didDrop;
        }

        public final List<Due> getDue() {
            return this.due;
        }
    }

    public interface Transition {

        public final class Apply implements Transition {
            public static final int $stable = PairsContact.$stable;
            public final PairsContact contact;

            public Apply(PairsContact pairsContact) {
                C7384Etj.A0Y(pairsContact, 0);
                this.contact = pairsContact;
            }

            public final PairsContact getContact() {
                return this.contact;
            }
        }

        public final class Drop implements Transition {
            public static final int $stable = 0;
            public static final Drop INSTANCE = new Drop();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Drop);
            }

            public String toString() {
                return "Drop";
            }

            public int hashCode() {
                return 880519610;
            }
        }

        public final class Keep implements Transition {
            public static final int $stable = 0;
            public static final Keep INSTANCE = new Keep();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Keep);
            }

            public String toString() {
                return "Keep";
            }

            public int hashCode() {
                return 880715344;
            }
        }

        public final class Remove implements Transition {
            public static final int $stable = 0;
            public static final Remove INSTANCE = new Remove();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Remove);
            }

            public String toString() {
                return "Remove";
            }

            public int hashCode() {
                return 459533455;
            }
        }
    }

    public PairsPendingLevelStore(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.lock = C3cG.A0T();
        this.inFlight = C60O.A13();
    }

    public final void clear(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            write(str, null);
        }
    }

    public final void clearDropped(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            PairsPendingLevelJson pairsPendingLevelJson = read(str);
            if (PairsPendingLevelStoreKt.STATE_DROPPED.equals(pairsPendingLevelJson != null ? pairsPendingLevelJson.state : null)) {
                write(str, null);
            }
        }
    }

    public final boolean record(Due due, PairsException pairsException, long j) {
        PairsError pairsError;
        C7384Etj.A0Y(due, 0);
        synchronized (this.lock) {
            this.inFlight.remove(due.generationId);
            PairsPendingLevelJson pairsPendingLevelJson = read(due.generationId);
            boolean z = false;
            if (pairsPendingLevelJson == null || PairsPendingLevelStoreKt.STATE_DROPPED.equals(pairsPendingLevelJson.state) || PairsPendingLevelStoreKt.level(pairsPendingLevelJson) != due.level) {
                return false;
            }
            if (pairsException == null || (pairsError = pairsException.error) == PairsError.NOT_FOUND) {
                write(due.generationId, null);
            } else if (!pairsException.isRetryable && pairsError != PairsError.UNAVAILABLE && pairsError != PairsError.NOT_VERIFIED) {
                write(due.generationId, PairsPendingLevelStoreKt.dropped(pairsPendingLevelJson, j));
                z = true;
            }
            return z;
        }
    }

    public final TakeResult takeDue(List<PairsContact> list, PairsAccess pairsAccess, long j) {
        TakeResult takeResult;
        PairsContact next;
        AnonymousClass003.A0u(list, pairsAccess);
        synchronized (this.lock) {
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator itA0n = AnonymousClass002.A0n(entries());
            boolean z = false;
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                String strA0t = C60O.A0t(entryA0l);
                PairsPendingLevelJson pairsPendingLevelJson = (PairsPendingLevelJson) entryA0l.getValue();
                if (!this.inFlight.contains(strA0t)) {
                    Iterator<PairsContact> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        PairsRelationship pairsRelationship = next.relationship;
                        if (C7384Etj.areEqual(pairsRelationship != null ? pairsRelationship.generationId : null, strA0t)) {
                            break;
                        }
                    }
                    Transition transition = transition(pairsPendingLevelJson, next, pairsAccess, j);
                    if (C7384Etj.areEqual(transition, Transition.Keep.INSTANCE)) {
                        continue;
                    } else if (C7384Etj.areEqual(transition, Transition.Remove.INSTANCE)) {
                        write(strA0t, null);
                    } else if (C7384Etj.areEqual(transition, Transition.Drop.INSTANCE)) {
                        write(strA0t, PairsPendingLevelStoreKt.dropped(pairsPendingLevelJson, j));
                        z = true;
                    } else {
                        if (!(transition instanceof Transition.Apply)) {
                            throw C3cG.A0q();
                        }
                        PairsLevel pairsLevelLevel = PairsPendingLevelStoreKt.level(pairsPendingLevelJson);
                        if (pairsLevelLevel != null) {
                            this.inFlight.add(strA0t);
                            arrayListA0h.add(new Due(((Transition.Apply) transition).contact, strA0t, pairsLevelLevel));
                        }
                    }
                }
            }
            takeResult = new TakeResult(arrayListA0h, z);
        }
        return takeResult;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PairsRelationshipState.values().length];
            try {
                AnonymousClass002.A13(PairsRelationshipState.VERIFIED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PairsRelationshipState.IDENTITY_CHANGED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final C4oT getPrefs() {
        return AuraVMPrefs.INSTANCE.get(C3cH.A0a(HatchGatewayPrefsStore.Companion, this.userSession), AuraVMPrefStore.PAIRS_PENDING_LEVELS);
    }

    public final Map<String, PairsLevel> droppedLevels() {
        Map<String, PairsLevel> mapA06;
        synchronized (this.lock) {
            Map<String, PairsPendingLevelJson> mapEntries = entries();
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator itA0n = AnonymousClass002.A0n(mapEntries);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                if (PairsPendingLevelStoreKt.STATE_DROPPED.equals(((PairsPendingLevelJson) entryA0l.getValue()).state)) {
                    AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
                }
            }
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l2 = C3cH.A0l(itA0i);
                String strA0t = C60O.A0t(entryA0l2);
                PairsLevel pairsLevelLevel = PairsPendingLevelStoreKt.level((PairsPendingLevelJson) entryA0l2.getValue());
                HxE hxEA0r = pairsLevelLevel != null ? C3cG.A0r(strA0t, pairsLevelLevel) : null;
                if (hxEA0r != null) {
                    arrayListA0h.add(hxEA0r);
                }
            }
            mapA06 = AGH.A06(arrayListA0h);
        }
        return mapA06;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractMap, java.util.HashMap] */
    private final Map<String, PairsPendingLevelJson> entries() {
        Set setKeySet = getPrefs().ACL().keySet();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            C7384Etj.A0X(strA0j);
            PairsPendingLevelJson pairsPendingLevelJson = read(strA0j);
            if (pairsPendingLevelJson != null) {
                AnonymousClass002.A1J(strA0j, pairsPendingLevelJson, arrayListA0h);
            }
        }
        return AGH.A06(arrayListA0h);
    }

    private final PairsPendingLevelJson read(String str) {
        Object objA0s;
        String string = getPrefs().getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            objA0s = (PairsPendingLevelJson) HatchJsonKt.HatchJson.A00(string, PairsPendingLevelJson$$serializer.INSTANCE);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        return (PairsPendingLevelJson) (objA0s instanceof C10571Hud ? null : objA0s);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.pairs.PairsPendingLevelStore.Transition transition(com.facebook.aura.pairs.PairsPendingLevelJson r6, com.facebook.aura.pairs.PairsContact r7, com.facebook.aura.pairs.PairsAccess r8, long r9) {
        /*
            r5 = this;
            com.facebook.aura.pairs.PairsLevel r3 = com.facebook.aura.pairs.PairsPendingLevelStoreKt.level(r6)
            if (r3 == 0) goto L27
            long r0 = r6.expires_at_ms
            r5 = 3
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r2 = 0
            if (r4 > 0) goto Lf
            r2 = 1
        Lf:
            if (r7 == 0) goto L37
            java.lang.String r1 = r6.state
            java.lang.String r0 = "dropped"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c
            if (r2 != 0) goto L27
            com.facebook.aura.pairs.PairsLevel r0 = r7.level
            if (r0 == r3) goto L27
            com.facebook.aura.pairs.PairsRelationshipState r1 = r7.relationshipState
            com.facebook.aura.pairs.PairsRelationshipState r0 = com.facebook.aura.pairs.PairsRelationshipState.IDENTITY_CHANGED
            if (r1 != r0) goto L53
        L27:
            com.facebook.aura.pairs.PairsPendingLevelStore$Transition$Remove r0 = com.facebook.aura.pairs.PairsPendingLevelStore.Transition.Remove.INSTANCE
        L29:
            com.facebook.aura.pairs.PairsPendingLevelStore$Transition r0 = (com.facebook.aura.pairs.PairsPendingLevelStore.Transition) r0
            return r0
        L2c:
            com.facebook.aura.pairs.PairsRelationshipState r0 = r7.relationshipState
            int r1 = r0.ordinal()
            if (r1 == r5) goto L3a
            r0 = 4
            if (r1 == r0) goto L27
        L37:
            if (r2 == 0) goto L53
            goto L27
        L3a:
            com.facebook.aura.pairs.PairsLevel r0 = r7.level
            if (r0 == r3) goto L27
            boolean r0 = r8.canChangeLevel
            if (r0 == 0) goto L53
            java.util.List<com.facebook.aura.pairs.PairsLevel> r0 = r8.trustPresets
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L50
            com.facebook.aura.pairs.PairsPendingLevelStore$Transition$Apply r0 = new com.facebook.aura.pairs.PairsPendingLevelStore$Transition$Apply
            r0.<init>(r7)
            return r0
        L50:
            com.facebook.aura.pairs.PairsPendingLevelStore$Transition$Drop r0 = com.facebook.aura.pairs.PairsPendingLevelStore.Transition.Drop.INSTANCE
            goto L29
        L53:
            com.facebook.aura.pairs.PairsPendingLevelStore$Transition$Keep r0 = com.facebook.aura.pairs.PairsPendingLevelStore.Transition.Keep.INSTANCE
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsPendingLevelStore.transition(com.facebook.aura.pairs.PairsPendingLevelJson, com.facebook.aura.pairs.PairsContact, com.facebook.aura.pairs.PairsAccess, long):com.facebook.aura.pairs.PairsPendingLevelStore$Transition");
    }

    private final void write(String str, PairsPendingLevelJson pairsPendingLevelJson) {
        BzK bzKA9q = getPrefs().A9q();
        if (pairsPendingLevelJson == null) {
            bzKA9q.Aae(str);
        } else {
            bzKA9q.AYr(str, HatchJsonKt.HatchJson.A02(pairsPendingLevelJson, PairsPendingLevelJson$$serializer.INSTANCE));
        }
        bzKA9q.apply();
    }

    public final void set(PairsLevel pairsLevel, String str, long j) {
        AnonymousClass003.A0u(pairsLevel, str);
        synchronized (this.lock) {
            write(str, pairsLevel == PairsLevel.ASK_FIRST ? null : new PairsPendingLevelJson(pairsLevel.getWireValue(), j, PairsPendingLevelStoreKt.STATE_PENDING));
        }
    }
}
