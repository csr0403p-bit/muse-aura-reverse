package com.facebook.aura.analytics.hatch.authflow;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final class HatchAuthFlowContext {
    public static final HatchAuthFlowContext INSTANCE = new HatchAuthFlowContext();
    public static final AtomicReference<State> state = new AtomicReference<>(new State(null, null, null, null, null, null));
    public static final AtomicReference<String> landingImpressionWaterfallId = new AtomicReference<>();

    public final class SsoSourceCounts extends C06G {
        public final String rlSsoSource;
        public final String ssoSource;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SsoSourceCounts) {
                    SsoSourceCounts ssoSourceCounts = (SsoSourceCounts) obj;
                    if (!C7384Etj.areEqual(this.ssoSource, ssoSourceCounts.ssoSource) || !C7384Etj.areEqual(this.rlSsoSource, ssoSourceCounts.rlSsoSource)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SsoSourceCounts copy$default(SsoSourceCounts ssoSourceCounts, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ssoSourceCounts.ssoSource;
            }
            if ((i & 2) != 0) {
                str2 = ssoSourceCounts.rlSsoSource;
            }
            AnonymousClass003.A0u(str, str2);
            return new SsoSourceCounts(str, str2);
        }

        public final String component1() {
            return this.ssoSource;
        }

        public final String component2() {
            return this.rlSsoSource;
        }

        public final String getRlSsoSource() {
            return this.rlSsoSource;
        }

        public final String getSsoSource() {
            return this.ssoSource;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.rlSsoSource, AnonymousClass001.A0G(this.ssoSource));
        }

        public SsoSourceCounts(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.ssoSource = str;
            this.rlSsoSource = str2;
        }

        public final SsoSourceCounts copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new SsoSourceCounts(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class State extends C06G {
        public final String entryPoint;
        public final SsoSourceCounts landingSsoSource;
        public final String loginFlow;
        public final String registrationFlow;
        public final String registrationSource;
        public final String waterfallId;

        public State() {
            this(null, null, null, null, null, null);
        }

        public static /* synthetic */ State copy$default(State state, String str, String str2, String str3, String str4, String str5, SsoSourceCounts ssoSourceCounts, int i, Object obj) {
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            String str9 = str4;
            String str10 = str5;
            SsoSourceCounts ssoSourceCounts2 = ssoSourceCounts;
            if ((i & 1) != 0) {
                str6 = state.waterfallId;
            }
            if ((i & 2) != 0) {
                str7 = state.entryPoint;
            }
            if ((i & 4) != 0) {
                str8 = state.registrationFlow;
            }
            if ((i & 8) != 0) {
                str9 = state.registrationSource;
            }
            if ((i & 16) != 0) {
                str10 = state.loginFlow;
            }
            if ((i & 32) != 0) {
                ssoSourceCounts2 = state.landingSsoSource;
            }
            return new State(str6, str7, str8, str9, str10, ssoSourceCounts2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof State) {
                    State state = (State) obj;
                    if (!C7384Etj.areEqual(this.waterfallId, state.waterfallId) || !C7384Etj.areEqual(this.entryPoint, state.entryPoint) || !C7384Etj.areEqual(this.registrationFlow, state.registrationFlow) || !C7384Etj.areEqual(this.registrationSource, state.registrationSource) || !C7384Etj.areEqual(this.loginFlow, state.loginFlow) || !C7384Etj.areEqual(this.landingSsoSource, state.landingSsoSource)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.waterfallId;
        }

        public final String component2() {
            return this.entryPoint;
        }

        public final String component3() {
            return this.registrationFlow;
        }

        public final String component4() {
            return this.registrationSource;
        }

        public final String component5() {
            return this.loginFlow;
        }

        public final SsoSourceCounts component6() {
            return this.landingSsoSource;
        }

        public final State copy(String str, String str2, String str3, String str4, String str5, SsoSourceCounts ssoSourceCounts) {
            return new State(str, str2, str3, str4, str5, ssoSourceCounts);
        }

        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public final SsoSourceCounts getLandingSsoSource() {
            return this.landingSsoSource;
        }

        public final String getLoginFlow() {
            return this.loginFlow;
        }

        public final String getRegistrationFlow() {
            return this.registrationFlow;
        }

        public final String getRegistrationSource() {
            return this.registrationSource;
        }

        public final String getWaterfallId() {
            return this.waterfallId;
        }

        public int hashCode() {
            return (((((((((AnonymousClass006.A0G(this.waterfallId) * 31) + AnonymousClass006.A0G(this.entryPoint)) * 31) + AnonymousClass006.A0G(this.registrationFlow)) * 31) + AnonymousClass006.A0G(this.registrationSource)) * 31) + AnonymousClass006.A0G(this.loginFlow)) * 31) + C3cH.A02(this.landingSsoSource);
        }

        public String toString() {
            return super.toString();
        }

        public State(String str, String str2, String str3, String str4, String str5, SsoSourceCounts ssoSourceCounts) {
            this.waterfallId = str;
            this.entryPoint = str2;
            this.registrationFlow = str3;
            this.registrationSource = str4;
            this.loginFlow = str5;
            this.landingSsoSource = ssoSourceCounts;
        }

        public /* synthetic */ State(String str, String str2, String str3, String str4, String str5, SsoSourceCounts ssoSourceCounts, int i, C06H c06h) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : ssoSourceCounts);
        }
    }

    public static /* synthetic */ void setLoginFlow$default(HatchAuthFlowContext hatchAuthFlowContext, String str, SsoSourceCounts ssoSourceCounts, int i, Object obj) {
        if ((i & 2) != 0) {
            ssoSourceCounts = null;
        }
        hatchAuthFlowContext.setLoginFlow(str, ssoSourceCounts);
    }

    public final void adoptOrBeginFlow(final String str) {
        state.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext.adoptOrBeginFlow.1
            @Override // java.util.function.Function
            public final State apply(State state2) {
                String strA0k = state2.waterfallId;
                if (strA0k == null) {
                    strA0k = AnonymousClass002.A0k();
                }
                String str2 = str;
                if (str2 == null || C7BY.A0j(str2)) {
                    str2 = null;
                }
                return new State(strA0k, str2, null, null, null, null);
            }
        });
    }

    public final void beginPrefetchFlow() {
        state.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext.beginPrefetchFlow.1
            @Override // java.util.function.Function
            public final State apply(State state2) {
                return state2.waterfallId == null ? new State(AnonymousClass002.A0k(), null, null, null, null, null) : state2;
            }
        });
    }

    public final boolean claimLandingImpression() {
        if (state.get().waterfallId == null) {
            return false;
        }
        return !C7384Etj.areEqual(landingImpressionWaterfallId.getAndSet(r1), r1);
    }

    public final void endFlow() {
        state.set(new State(null, null, null, null, null, null));
    }

    public final void releaseLandingImpression() {
        landingImpressionWaterfallId.set(null);
    }

    public final void setEntryPoint(final String str) {
        state.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext.setEntryPoint.1
            @Override // java.util.function.Function
            public final State apply(State state2) {
                C7384Etj.A0X(state2);
                String str2 = str;
                if (str2 == null || C7BY.A0j(str2)) {
                    str2 = null;
                }
                return new State(state2.waterfallId, str2, state2.registrationFlow, state2.registrationSource, state2.loginFlow, state2.landingSsoSource);
            }
        });
    }

    public final void setLoginFlow(final String str, final SsoSourceCounts ssoSourceCounts) {
        state.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext.setLoginFlow.1
            @Override // java.util.function.Function
            public final State apply(State state2) {
                C7384Etj.A0X(state2);
                return new State(state2.waterfallId, state2.entryPoint, state2.registrationFlow, state2.registrationSource, str, ssoSourceCounts);
            }
        });
    }

    public final void setRegistrationFlow(final String str) {
        state.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext.setRegistrationFlow.1
            @Override // java.util.function.Function
            public final State apply(State state2) {
                C7384Etj.A0X(state2);
                return new State(state2.waterfallId, state2.entryPoint, str, state2.registrationSource, state2.loginFlow, state2.landingSsoSource);
            }
        });
    }

    public final void setRegistrationSource(final String str) {
        state.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext.setRegistrationSource.1
            @Override // java.util.function.Function
            public final State apply(State state2) {
                C7384Etj.A0X(state2);
                String str2 = str;
                if (str2 == null || C7BY.A0j(str2)) {
                    str2 = null;
                }
                return new State(state2.waterfallId, state2.entryPoint, state2.registrationFlow, str2, state2.loginFlow, state2.landingSsoSource);
            }
        });
    }

    public final State snapshot() {
        State state2 = state.get();
        C7384Etj.A0U(state2);
        return state2;
    }
}
