package com.facebook.aura.localbrowser;

import X.AII;
import X.AIM;
import X.AbstractC07127nr;
import X.AbstractC4103Cmd;
import X.AnonymousClass001;
import X.BV3;
import X.Bs8;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C4JM;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.HzR;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.PowerManager;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.memory.AuraMemoryPressure;
import com.facebook.aura.memory.AuraMemoryPressureLevel;
import com.facebook.aura.memory.AuraTrimmable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class LocalBrowserDeviceConditions {
    public static final int $stable = 8;
    public final AtomicReference<String> advertised;
    public final Function0<Unit> onChanged;
    public final C3UX scope;
    public HoC watch;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserDeviceConditions", f = "LocalBrowserDeviceConditions.kt", l = {71, 81, 83, ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "observe", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$observe$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserDeviceConditions.this.observe(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$observe$2", f = "LocalBrowserDeviceConditions.kt", l = {83}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$observe$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HzR<Unit> $signals;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HzR<Unit> hzR, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$signals = hzR;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$signals, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HzR<Unit> hzR = this.$signals;
                this.label = 1;
                if (hzR.AZg(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass2(this.$signals, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$track$1", f = "LocalBrowserDeviceConditions.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$track$1, reason: invalid class name and case insensitive filesystem */
    public final class C124191 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C124191(HtJ<? super C124191> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserDeviceConditions.this.new C124191(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserDeviceConditions localBrowserDeviceConditions = LocalBrowserDeviceConditions.this;
                Application applicationA00 = C4JM.A00();
                this.label = 1;
                if (localBrowserDeviceConditions.observe(applicationA00, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return LocalBrowserDeviceConditions.this.new C124191(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LocalBrowserDeviceConditions(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.onChanged = function0;
        this.scope = C3cH.A0y(C78W.A02(new C8eO(null), AnonymousClass001.A0y()), new LocalBrowserDeviceConditions$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key));
        this.advertised = new AtomicReference<>(null);
    }

    public final synchronized void close() {
        Hxb.A03(null, this.scope);
        this.watch = null;
    }

    public final synchronized void track(boolean z, String str) {
        this.advertised.set(str);
        HoC hoC = this.watch;
        if (!z) {
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.watch = null;
        } else if (hoC == null) {
            this.watch = AnonymousClass001.A11(new C124191(null), this.scope);
        }
    }

    private final boolean claimChange(String str) {
        String str2 = this.advertised.get();
        return !C7384Etj.areEqual(str2, str) && Bs8.A00(str2, str, this.advertised);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0073, code lost:
    
        X.CFK.A05(com.facebook.aura.localbrowser.LocalBrowserDeviceConditionsKt.TAG, X.FGI.A0U("Device ineligibility changed to ", r12, "; re-registering"));
        r13.onChanged.invoke();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:19:0x0070, B:20:0x0073, B:22:0x0085, B:26:0x009c, B:28:0x00a8, B:32:0x00b2, B:33:0x00c3, B:37:0x00d9, B:39:0x00e1, B:42:0x00fa, B:36:0x00d6, B:25:0x0099), top: B:60:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:19:0x0070, B:20:0x0073, B:22:0x0085, B:26:0x009c, B:28:0x00a8, B:32:0x00b2, B:33:0x00c3, B:37:0x00d9, B:39:0x00e1, B:42:0x00fa, B:36:0x00d6, B:25:0x0099), top: B:60:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:19:0x0070, B:20:0x0073, B:22:0x0085, B:26:0x009c, B:28:0x00a8, B:32:0x00b2, B:33:0x00c3, B:37:0x00d9, B:39:0x00e1, B:42:0x00fa, B:36:0x00d6, B:25:0x0099), top: B:60:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:19:0x0070, B:20:0x0073, B:22:0x0085, B:26:0x009c, B:28:0x00a8, B:32:0x00b2, B:33:0x00c3, B:37:0x00d9, B:39:0x00e1, B:42:0x00fa, B:36:0x00d6, B:25:0x0099), top: B:60:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:19:0x0070, B:20:0x0073, B:22:0x0085, B:26:0x009c, B:28:0x00a8, B:32:0x00b2, B:33:0x00c3, B:37:0x00d9, B:39:0x00e1, B:42:0x00fa, B:36:0x00d6, B:25:0x0099), top: B:60:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a6 -> B:20:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ac -> B:20:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f7 -> B:20:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0108 -> B:20:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object observe(android.content.Context r14, X.HtJ<? super kotlin.Unit> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserDeviceConditions.observe(android.content.Context, X.HtJ):java.lang.Object");
    }

    public static final Unit observe$lambda$0(HzR hzR) {
        Unit unit = Unit.INSTANCE;
        hzR.AhZ(unit);
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.net.ConnectivityManager$NetworkCallback, com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$subscribe$1$4$callback$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.BroadcastReceiver, com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$subscribe$1$1$receiver$1] */
    private final List<AutoCloseable> subscribe(final Context context, final Function0<Unit> function0) {
        Object systemService;
        Object systemService2;
        AII aiiA17 = AIM.A17();
        try {
            final ?? r2 = new BroadcastReceiver() { // from class: com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$subscribe$1$1$receiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    function0.invoke();
                }
            };
            IntentFilter intentFilter = new IntentFilter(BV3.A00(7));
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            AbstractC4103Cmd.A04(r2, context, intentFilter, 4);
            aiiA17.add(new AutoCloseable() { // from class: com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$$ExternalSyntheticLambda1
                @Override // java.lang.AutoCloseable
                public final void close() {
                    context.unregisterReceiver(r2);
                }
            });
        } catch (RuntimeException e) {
            CFK.A0A(LocalBrowserDeviceConditionsKt.TAG, "Device condition signal unavailable: battery", e);
        }
        try {
            final AuraTrimmable auraTrimmable = new AuraTrimmable() { // from class: com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$$ExternalSyntheticLambda2
                @Override // com.facebook.aura.memory.AuraTrimmable
                public final void onMemoryPressure(AuraMemoryPressureLevel auraMemoryPressureLevel) {
                    function0.invoke();
                }
            };
            AuraMemoryPressure.INSTANCE.register(auraTrimmable);
            aiiA17.add(new AutoCloseable() { // from class: com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$$ExternalSyntheticLambda3
                @Override // java.lang.AutoCloseable
                public final void close() {
                    LocalBrowserDeviceConditions.subscribe$lambda$0$1$1(auraTrimmable);
                }
            });
        } catch (RuntimeException e2) {
            CFK.A0A(LocalBrowserDeviceConditionsKt.TAG, "Device condition signal unavailable: memory", e2);
        }
        try {
            systemService2 = context.getSystemService((Class<Object>) PowerManager.class);
        } catch (RuntimeException e3) {
            CFK.A0A(LocalBrowserDeviceConditionsKt.TAG, "Device condition signal unavailable: thermal", e3);
        }
        if (systemService2 == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        final PowerManager powerManager = (PowerManager) systemService2;
        final PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener = new PowerManager.OnThermalStatusChangedListener() { // from class: com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$$ExternalSyntheticLambda4
            @Override // android.os.PowerManager.OnThermalStatusChangedListener
            public final void onThermalStatusChanged(int i) {
                function0.invoke();
            }
        };
        powerManager.addThermalStatusListener(onThermalStatusChangedListener);
        aiiA17.add(new AutoCloseable() { // from class: com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$$ExternalSyntheticLambda5
            @Override // java.lang.AutoCloseable
            public final void close() {
                powerManager.removeThermalStatusListener(onThermalStatusChangedListener);
            }
        });
        try {
            systemService = context.getSystemService((Class<Object>) ConnectivityManager.class);
        } catch (RuntimeException e4) {
            CFK.A0A(LocalBrowserDeviceConditionsKt.TAG, "Device condition signal unavailable: network", e4);
        }
        if (systemService == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        final ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        final ?? r1 = new ConnectivityManager.NetworkCallback() { // from class: com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$subscribe$1$4$callback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                function0.invoke();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                function0.invoke();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                function0.invoke();
            }
        };
        connectivityManager.registerDefaultNetworkCallback(r1);
        aiiA17.add(new AutoCloseable() { // from class: com.facebook.aura.localbrowser.LocalBrowserDeviceConditions$$ExternalSyntheticLambda6
            @Override // java.lang.AutoCloseable
            public final void close() {
                connectivityManager.unregisterNetworkCallback(r1);
            }
        });
        return AIM.A18(aiiA17);
    }

    public static final void subscribe$lambda$0$1$1(AuraTrimmable auraTrimmable) {
        AuraMemoryPressure.INSTANCE.unregister(auraTrimmable);
    }

    private final void subscription(List<AutoCloseable> list, String str, Function0<? extends AutoCloseable> function0) {
        try {
            list.add(function0.invoke());
        } catch (RuntimeException e) {
            CFK.A0A(LocalBrowserDeviceConditionsKt.TAG, FGI.A0M("Device condition signal unavailable: ", str), e);
        }
    }
}
