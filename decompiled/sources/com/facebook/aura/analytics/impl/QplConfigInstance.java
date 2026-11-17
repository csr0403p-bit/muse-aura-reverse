package com.facebook.aura.analytics.impl;

import X.AbstractC4968DJc;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.C0V;
import X.C14;
import X.C3cG;
import X.C4939DFv;
import X.C4957DIa;
import X.C60Q;
import X.C7384Etj;
import X.C7oK;
import X.DGK;
import X.DGU;
import X.DGV;
import X.DGY;
import X.DGf;
import X.DGl;
import X.DGm;
import X.DGp;
import X.F18;
import X.InterfaceC4946DGk;
import android.content.Context;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.qpl.AuraQuickPerformanceLogger;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.flexiblesampling.QPLSupportedSamplingPolicyConfig;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.logginginfra.falco.AppScopedIdentity;
import com.facebook.logginginfra.falco.Identity;
import com.facebook.quicklog.QuickPerformanceLoggerGKs;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class QplConfigInstance {
    public C4957DIa backingInstance;

    /* renamed from: com.facebook.aura.analytics.impl.QplConfigInstance$init$8, reason: invalid class name */
    public final class AnonymousClass8 {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public final Identity get() {
            Object[] objArr = new Object[2];
            Object[] objArr2 = new Object[4];
            Object objA0k = BV5.A0k();
            if (objA0k == null) {
                objA0k = HyperThriftBase.A02;
            }
            objArr2[2] = objA0k;
            Object[] objArr3 = new Object[4];
            System.arraycopy(objArr2, 0, objArr3, 0, 4);
            objArr3[1] = A00(objArr3[1]);
            AppScopedIdentity appScopedIdentity = new AppScopedIdentity();
            appScopedIdentity.A00 = "com.facebook.logginginfra.falco.AppScopedIdentity";
            appScopedIdentity.A01 = objArr3;
            objArr[1] = appScopedIdentity;
            Object[] objArr4 = new Object[2];
            System.arraycopy(objArr, 0, objArr4, 0, 2);
            Identity identity = new Identity();
            identity.A00 = "com.facebook.logginginfra.falco.Identity";
            identity.A01 = objArr4;
            identity.A01();
            return identity;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractMap, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractCollection, java.util.HashSet] */
        /* JADX WARN: Type inference failed for: r4v2, types: [T] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
        public static <T> T A00(T t) {
            ?? r4;
            if (t instanceof List) {
                List list = (List) t;
                r4 = (T) C60Q.A0t(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r4.add(A00(it.next()));
                }
            } else if (t instanceof Set) {
                Set set = (Set) t;
                r4 = (T) new HashSet(set.size());
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    r4.add(A00(it2.next()));
                }
            } else {
                if (!(t instanceof Map)) {
                    return t;
                }
                Map map = (Map) t;
                r4 = (T) BV4.A0v(map.size());
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entry = (Map.Entry) itA0n.next();
                    r4.put(A00(entry.getKey()), A00(entry.getValue()));
                }
            }
            return (T) r4;
        }
    }

    public final void init(final Context context) {
        C7384Etj.A0Y(context, 0);
        if (this.backingInstance != null) {
            throw C3cG.A0Q("init called multiple times");
        }
        final DGK dgk = new DGK();
        QuickPerformanceLoggerGKs quickPerformanceLoggerGKs = (QuickPerformanceLoggerGKs) BV5.A0Z(65543);
        C0V c0v = (quickPerformanceLoggerGKs.isAppIdBasedConfigWithSamplingFallbackEnabled() && quickPerformanceLoggerGKs.isSamplingFallbackEnabled() && AnonymousClass001.A1X(C0V.A01.getValue())) ? new C0V() : null;
        C4957DIa c4957DIa = new C4957DIa(AnonymousClass8.INSTANCE, AwakeTimeSinceBootClock.INSTANCE, C4939DFv.A00(), new DGY() { // from class: com.facebook.aura.analytics.impl.QplConfigInstance.init.1
            public final ScheduledExecutorService executor = AuraExecutors.INSTANCE.newSingleThreadScheduledExecutor("AuraQPLExecutor", null);

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.executor.execute(runnable);
            }

            public final ScheduledExecutorService getExecutor() {
                return this.executor;
            }

            public boolean schedule(Runnable runnable, long j, TimeUnit timeUnit) {
                AnonymousClass003.A0v(runnable, timeUnit);
                this.executor.schedule(runnable, j, timeUnit);
                return true;
            }
        }, c0v, new DGf(), new Random(), new F18() { // from class: com.facebook.aura.analytics.impl.QplConfigInstance.init.2
            @Override // X.F18
            /* renamed from: get */
            public final C14 AMN() {
                return new C14(context);
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return new C14(context);
            }
        }, new F18() { // from class: com.facebook.aura.analytics.impl.QplConfigInstance.init.3
            @Override // X.F18
            /* renamed from: get */
            public final AbstractC4968DJc AMN() {
                return new DGp();
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return new DGp();
            }
        }, new F18() { // from class: com.facebook.aura.analytics.impl.QplConfigInstance.init.4
            @Override // X.F18
            /* renamed from: get */
            public final DGl AMN() {
                return new DGU();
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return new DGU();
            }
        }, new F18() { // from class: com.facebook.aura.analytics.impl.QplConfigInstance.init.5
            @Override // X.F18
            /* renamed from: get */
            public final DGm AMN() {
                return new DGV();
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return new DGV();
            }
        }, new F18() { // from class: com.facebook.aura.analytics.impl.QplConfigInstance.init.6
            @Override // X.F18
            /* renamed from: get */
            public final C7oK AMN() {
                return null;
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return null;
            }
        }, new F18() { // from class: com.facebook.aura.analytics.impl.QplConfigInstance.init.7

            /* renamed from: com.facebook.aura.analytics.impl.QplConfigInstance$init$7$1, reason: invalid class name */
            public final class AnonymousClass1 implements InterfaceC4946DGk {
                public final /* synthetic */ DGK $consentStateProvider;

                public AnonymousClass1(DGK dgk) {
                    this.$consentStateProvider = dgk;
                }

                @Override // X.InterfaceC4946DGk
                public long getConsentState() {
                    return DGK.A00.A00;
                }
            }

            @Override // X.F18
            /* renamed from: get */
            public final InterfaceC4946DGk AMN() {
                return new AnonymousClass1(dgk);
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return new AnonymousClass1(dgk);
            }
        });
        AuraQuickPerformanceLogger.INSTANCE.setFFLoggerQplConfig(c4957DIa);
        this.backingInstance = c4957DIa;
    }

    public final C4957DIa getInstance() {
        C4957DIa c4957DIa = this.backingInstance;
        if (c4957DIa != null) {
            return c4957DIa;
        }
        throw BV4.A0U();
    }

    public final Class<? extends QPLSupportedSamplingPolicyConfig> getServerSamplingPolicyUpdater() {
        return AuraSamplingPolicyConfig.class;
    }
}
