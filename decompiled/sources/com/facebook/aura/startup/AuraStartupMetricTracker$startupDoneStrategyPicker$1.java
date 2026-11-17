package com.facebook.aura.startup;

import X.C3cG;
import X.DAY;
import X.DAu;
import X.DB0;
import X.DB4;
import X.DB7;
import X.DB8;
import X.DBB;
import X.DBE;
import X.DK9;
import X.Eu4;
import X.F18;
import X.HxE;
import android.app.Activity;
import com.facebook.aura.startup.AuraStartupMetricTracker;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class AuraStartupMetricTracker$startupDoneStrategyPicker$1 extends DAY {
    public final DB0 backgroundStartupDoneStrategy;
    public final DB0 foregroundStartupDoneStrategy;
    public final DB4 lifecycleStartupDoneStrategy;
    public final List<DAu> strategies;

    @Override // X.DAY
    public List<DAu> getStrategies() {
        return this.strategies;
    }

    @Override // X.DAY
    public DAu getStrategyForBackgroundStart() {
        return this.backgroundStartupDoneStrategy;
    }

    public AuraStartupMetricTracker$startupDoneStrategyPicker$1(final AuraStartupMetricTracker auraStartupMetricTracker) {
        F18 f18 = new F18() { // from class: com.facebook.aura.startup.AuraStartupMetricTracker$startupDoneStrategyPicker$1$foregroundStartupDoneStrategy$1
            @Override // X.F18
            /* renamed from: get */
            public final DK9 AMN() {
                return auraStartupMetricTracker.monotonicClock$1;
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return auraStartupMetricTracker.monotonicClock$1;
            }
        };
        F18 f182 = new F18() { // from class: com.facebook.aura.startup.AuraStartupMetricTracker$startupDoneStrategyPicker$1$foregroundStartupDoneStrategy$2
            @Override // X.F18
            /* renamed from: get */
            public final DBB AMN() {
                AuraStartupMetricTracker auraStartupMetricTracker2 = auraStartupMetricTracker;
                AuraStartupMetricTracker.Companion companion = AuraStartupMetricTracker.Companion;
                return auraStartupMetricTracker2.startupDoneCallback;
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                AuraStartupMetricTracker auraStartupMetricTracker2 = auraStartupMetricTracker;
                AuraStartupMetricTracker.Companion companion = AuraStartupMetricTracker.Companion;
                return auraStartupMetricTracker2.startupDoneCallback;
            }
        };
        DB8 db8 = DB8.A00;
        Eu4 eu4 = Eu4.A03;
        HxE hxEA0r = C3cG.A0r(db8, eu4);
        AuraStartupMetricTracker.Companion companion = AuraStartupMetricTracker.Companion;
        DB0 db0 = new DB0(Arrays.asList(hxEA0r, C3cG.A0r(auraStartupMetricTracker.pointsWatchingSignalFactory, eu4), C3cG.A0r(auraStartupMetricTracker.gatewayConnectSignalFactory, eu4), C3cG.A0r(DB7.A00, Eu4.A02)), f18, f182);
        this.foregroundStartupDoneStrategy = db0;
        DB4 db4 = new DB4(new F18() { // from class: com.facebook.aura.startup.AuraStartupMetricTracker$startupDoneStrategyPicker$1$lifecycleStartupDoneStrategy$1
            @Override // X.F18
            /* renamed from: get */
            public final DK9 AMN() {
                return auraStartupMetricTracker.monotonicClock$1;
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return auraStartupMetricTracker.monotonicClock$1;
            }
        }, new F18() { // from class: com.facebook.aura.startup.AuraStartupMetricTracker$startupDoneStrategyPicker$1$lifecycleStartupDoneStrategy$2
            @Override // X.F18
            /* renamed from: get */
            public final DBB AMN() {
                AuraStartupMetricTracker auraStartupMetricTracker2 = auraStartupMetricTracker;
                AuraStartupMetricTracker.Companion companion2 = AuraStartupMetricTracker.Companion;
                return auraStartupMetricTracker2.startupDoneCallback;
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                AuraStartupMetricTracker auraStartupMetricTracker2 = auraStartupMetricTracker;
                AuraStartupMetricTracker.Companion companion2 = AuraStartupMetricTracker.Companion;
                return auraStartupMetricTracker2.startupDoneCallback;
            }
        }, new F18() { // from class: com.facebook.aura.startup.AuraStartupMetricTracker$startupDoneStrategyPicker$1$lifecycleStartupDoneStrategy$3
            @Override // X.F18
            /* renamed from: get */
            public final DBE AMN() {
                return auraStartupMetricTracker.startupActivityHelper;
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return auraStartupMetricTracker.startupActivityHelper;
            }
        });
        this.lifecycleStartupDoneStrategy = db4;
        DB0 db02 = new DB0(Collections.singletonList(C3cG.A0r(auraStartupMetricTracker.backgroundCompleteSignalFactory, eu4)), new F18() { // from class: com.facebook.aura.startup.AuraStartupMetricTracker$startupDoneStrategyPicker$1$backgroundStartupDoneStrategy$1
            @Override // X.F18
            /* renamed from: get */
            public final DK9 AMN() {
                return auraStartupMetricTracker.monotonicClock$1;
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return auraStartupMetricTracker.monotonicClock$1;
            }
        }, new F18() { // from class: com.facebook.aura.startup.AuraStartupMetricTracker$startupDoneStrategyPicker$1$backgroundStartupDoneStrategy$2
            @Override // X.F18
            /* renamed from: get */
            public final DBB AMN() {
                AuraStartupMetricTracker auraStartupMetricTracker2 = auraStartupMetricTracker;
                AuraStartupMetricTracker.Companion companion2 = AuraStartupMetricTracker.Companion;
                return auraStartupMetricTracker2.startupDoneCallback;
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                AuraStartupMetricTracker auraStartupMetricTracker2 = auraStartupMetricTracker;
                AuraStartupMetricTracker.Companion companion2 = AuraStartupMetricTracker.Companion;
                return auraStartupMetricTracker2.startupDoneCallback;
            }
        });
        this.backgroundStartupDoneStrategy = db02;
        this.strategies = Arrays.asList(db0, db4, db02);
    }

    @Override // X.DAY
    public DAu getStrategyForActivityResume(Activity activity) {
        return this.foregroundStartupDoneStrategy;
    }

    @Override // X.DAY
    public DAu getStrategyForNavigation(String str) {
        return this.foregroundStartupDoneStrategy;
    }
}
