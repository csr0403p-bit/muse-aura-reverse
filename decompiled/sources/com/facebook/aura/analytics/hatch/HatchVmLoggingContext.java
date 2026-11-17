package com.facebook.aura.analytics.hatch;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C9jH;
import X.CUB;
import com.facebook.aura.analytics.hatch.HatchVmLoggingContext;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* loaded from: classes6.dex */
public final class HatchVmLoggingContext {
    public static final int $stable = 0;
    public static final HatchVmLoggingContext INSTANCE = new HatchVmLoggingContext();
    public static final AtomicReference<State> state = BV4.A16(new State(new Attribution(null, null, null, 0), false, null, C9jH.A00, false));

    /* loaded from: classes3.dex */
    public final class Attribution extends C06G {
        public static final int $stable = 0;
        public final Boolean isCvm;
        public final int sessionGeneration;
        public final String vmHostname;
        public final String vmId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Attribution) {
                    Attribution attribution = (Attribution) obj;
                    if (!C7384Etj.areEqual(this.vmId, attribution.vmId) || !C7384Etj.areEqual(this.vmHostname, attribution.vmHostname) || !C7384Etj.areEqual(this.isCvm, attribution.isCvm) || this.sessionGeneration != attribution.sessionGeneration) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ Attribution(String str, String str2, Boolean bool, int i, int i2, C06H c06h) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? 0 : i);
        }

        public static /* synthetic */ Attribution copy$default(Attribution attribution, String str, String str2, Boolean bool, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = attribution.vmId;
            }
            if ((i2 & 2) != 0) {
                str2 = attribution.vmHostname;
            }
            if ((i2 & 4) != 0) {
                bool = attribution.isCvm;
            }
            if ((i2 & 8) != 0) {
                i = attribution.sessionGeneration;
            }
            return new Attribution(str, str2, bool, i);
        }

        public final String component1() {
            return this.vmId;
        }

        public final String component2() {
            return this.vmHostname;
        }

        public final Boolean component3() {
            return this.isCvm;
        }

        public final int component4() {
            return this.sessionGeneration;
        }

        public final Attribution copy(String str, String str2, Boolean bool, int i) {
            return new Attribution(str, str2, bool, i);
        }

        public final int getSessionGeneration() {
            return this.sessionGeneration;
        }

        public final String getVmHostname() {
            return this.vmHostname;
        }

        public final String getVmId() {
            return this.vmId;
        }

        public int hashCode() {
            return (((((AnonymousClass006.A0G(this.vmId) * 31) + AnonymousClass006.A0G(this.vmHostname)) * 31) + C3cH.A02(this.isCvm)) * 31) + this.sessionGeneration;
        }

        public final Boolean isCvm() {
            return this.isCvm;
        }

        public String toString() {
            return super.toString();
        }

        public Attribution(String str, String str2, Boolean bool, int i) {
            this.vmId = str;
            this.vmHostname = str2;
            this.isCvm = bool;
            this.sessionGeneration = i;
        }

        public Attribution() {
            this(null, null, null, 0);
        }
    }

    public final class State extends C06G {
        public final Attribution attribution;
        public final Map<String, String> fetchedVmStates;
        public final boolean hasReachedCvm;
        public final boolean isSealed;
        public final TimeSpentStream timeSpentStream;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof State) {
                    State state = (State) obj;
                    if (!C7384Etj.areEqual(this.attribution, state.attribution) || this.isSealed != state.isSealed || !C7384Etj.areEqual(this.timeSpentStream, state.timeSpentStream) || !C7384Etj.areEqual(this.fetchedVmStates, state.fetchedVmStates) || this.hasReachedCvm != state.hasReachedCvm) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, Attribution attribution, boolean z, TimeSpentStream timeSpentStream, Map map, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                attribution = state.attribution;
            }
            if ((i & 2) != 0) {
                z = state.isSealed;
            }
            if ((i & 4) != 0) {
                timeSpentStream = state.timeSpentStream;
            }
            if ((i & 8) != 0) {
                map = state.fetchedVmStates;
            }
            if ((i & 16) != 0) {
                z2 = state.hasReachedCvm;
            }
            return state.copy(attribution, z, timeSpentStream, map, z2);
        }

        public final Attribution component1() {
            return this.attribution;
        }

        public final boolean component2() {
            return this.isSealed;
        }

        public final TimeSpentStream component3() {
            return this.timeSpentStream;
        }

        public final Map<String, String> component4() {
            return this.fetchedVmStates;
        }

        public final boolean component5() {
            return this.hasReachedCvm;
        }

        public final Attribution getAttribution() {
            return this.attribution;
        }

        public final Map<String, String> getFetchedVmStates() {
            return this.fetchedVmStates;
        }

        public final boolean getHasReachedCvm() {
            return this.hasReachedCvm;
        }

        public final TimeSpentStream getTimeSpentStream() {
            return this.timeSpentStream;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0F(this.fetchedVmStates, (C0KA.A01(AnonymousClass005.A0E(this.attribution), this.isSealed) + AnonymousClass006.A0D(this.timeSpentStream)) * 31), this.hasReachedCvm);
        }

        public final boolean isSealed() {
            return this.isSealed;
        }

        public State(Attribution attribution, boolean z, TimeSpentStream timeSpentStream, Map<String, String> map, boolean z2) {
            AnonymousClass003.A0w(attribution, map);
            this.attribution = attribution;
            this.isSealed = z;
            this.timeSpentStream = timeSpentStream;
            this.fetchedVmStates = map;
            this.hasReachedCvm = z2;
        }

        public final State copy(Attribution attribution, boolean z, TimeSpentStream timeSpentStream, Map<String, String> map, boolean z2) {
            AnonymousClass003.A0w(attribution, map);
            return new State(attribution, z, timeSpentStream, map, z2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ State(Attribution attribution, boolean z, TimeSpentStream timeSpentStream, Map map, boolean z2, int i, C06H c06h) {
            this(attribution, z, (i & 4) != 0 ? null : timeSpentStream, (i & 8) != 0 ? C9jH.A00 : map, C3cG.A1K(i & 16, z2));
        }
    }

    public final class TimeSpentStream {
        public final int sessionGeneration;
        public final long sessionId;
        public final String vmId;

        public TimeSpentStream(String str, int i, long j) {
            C7384Etj.A0Y(str, 0);
            this.vmId = str;
            this.sessionGeneration = i;
            this.sessionId = j;
        }

        public final int getSessionGeneration() {
            return this.sessionGeneration;
        }

        public final long getSessionId() {
            return this.sessionId;
        }

        public final String getVmId() {
            return this.vmId;
        }
    }

    public final String fetchedVmState(String str) {
        C7384Etj.A0Y(str, 0);
        return C60O.A0p(str, state.get().fetchedVmStates);
    }

    public final void publishFetchedVmStates(final Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        state.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.analytics.hatch.HatchVmLoggingContext.publishFetchedVmStates.1
            @Override // java.util.function.Function
            public final State apply(State state2) {
                boolean z = state2.isSealed;
                if (z) {
                    return state2;
                }
                return state2.copy(state2.attribution, z, state2.timeSpentStream, map, state2.hasReachedCvm);
            }
        });
    }

    public final Long timeSpentSessionId(final String str, final int i) {
        TimeSpentStream timeSpentStream;
        C7384Etj.A0Y(str, 0);
        State stateUpdateAndGet = state.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.analytics.hatch.HatchVmLoggingContext$timeSpentSessionId$next$1
            @Override // java.util.function.Function
            public final HatchVmLoggingContext.State apply(HatchVmLoggingContext.State state2) {
                HatchVmLoggingContext.TimeSpentStream timeSpentStream2 = state2.timeSpentStream;
                if (state2.isSealed || (timeSpentStream2 != null && C7384Etj.areEqual(timeSpentStream2.vmId, str) && timeSpentStream2.sessionGeneration == i)) {
                    return state2;
                }
                return state2.copy(state2.attribution, state2.isSealed, new HatchVmLoggingContext.TimeSpentStream(str, i, CUB.A01.A08(1L, LinkEncryptedPairingKt.LINK_COUNTER_MAX)), state2.fetchedVmStates, state2.hasReachedCvm);
            }
        });
        if (stateUpdateAndGet.isSealed || (timeSpentStream = stateUpdateAndGet.timeSpentStream) == null) {
            return null;
        }
        return Long.valueOf(timeSpentStream.sessionId);
    }

    public final void clearForLogout() {
        state.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.analytics.hatch.HatchVmLoggingContext.clearForLogout.1
            @Override // java.util.function.Function
            public final State apply(State state2) {
                return new State(new Attribution(null, null, null, state2.attribution.sessionGeneration), true, null, C9jH.A00, false);
            }
        });
    }

    public final void publish(final String str, final String str2, final Boolean bool) {
        State stateUpdateAndGet = state.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.analytics.hatch.HatchVmLoggingContext$publish$published$1
            /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.facebook.aura.analytics.hatch.HatchVmLoggingContext.State apply(com.facebook.aura.analytics.hatch.HatchVmLoggingContext.State r10) {
                /*
                    r9 = this;
                    r5 = r10
                    boolean r0 = r10.isSealed
                    if (r0 != 0) goto L3d
                    java.lang.String r4 = r1
                    r3 = 0
                    if (r4 == 0) goto L3e
                    boolean r0 = X.C7BY.A0j(r4)
                    if (r0 != 0) goto L3e
                L10:
                    java.lang.String r1 = r2
                    if (r1 == 0) goto L1b
                    boolean r0 = X.C7BY.A0j(r1)
                    if (r0 != 0) goto L1b
                    r3 = r1
                L1b:
                    java.lang.Boolean r2 = r3
                    com.facebook.aura.analytics.hatch.HatchVmLoggingContext$Attribution r0 = r10.attribution
                    int r0 = r0.sessionGeneration
                    com.facebook.aura.analytics.hatch.HatchVmLoggingContext$Attribution r6 = new com.facebook.aura.analytics.hatch.HatchVmLoggingContext$Attribution
                    r6.<init>(r4, r3, r2, r0)
                    boolean r1 = r10.hasReachedCvm
                    r0 = 1
                    if (r1 != 0) goto L32
                    boolean r0 = X.AnonymousClass002.A1b(r2, r0)
                    r10 = 0
                    if (r0 == 0) goto L33
                L32:
                    r10 = 1
                L33:
                    boolean r7 = r5.isSealed
                    com.facebook.aura.analytics.hatch.HatchVmLoggingContext$TimeSpentStream r8 = r5.timeSpentStream
                    java.util.Map<java.lang.String, java.lang.String> r9 = r5.fetchedVmStates
                    com.facebook.aura.analytics.hatch.HatchVmLoggingContext$State r5 = r5.copy(r6, r7, r8, r9, r10)
                L3d:
                    return r5
                L3e:
                    r4 = r3
                    goto L10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.analytics.hatch.HatchVmLoggingContext$publish$published$1.apply(com.facebook.aura.analytics.hatch.HatchVmLoggingContext$State):com.facebook.aura.analytics.hatch.HatchVmLoggingContext$State");
            }
        });
        if (stateUpdateAndGet.isSealed || !AnonymousClass002.A1b(stateUpdateAndGet.attribution.isCvm, false) || stateUpdateAndGet.hasReachedCvm) {
            return;
        }
        HatchClientCvmUuid.INSTANCE.clear();
    }

    public final void reopenForSession() {
        state.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.analytics.hatch.HatchVmLoggingContext.reopenForSession.1
            @Override // java.util.function.Function
            public final State apply(State state2) {
                return new State(new Attribution(null, null, null, state2.attribution.sessionGeneration + 1), false, null, C9jH.A00, false);
            }
        });
    }

    public final Attribution snapshot() {
        return state.get().attribution;
    }
}
