package com.facebook.aura.watchhandoff;

import X.C9258GBl;
import X.HtJ;
import X.HzP;
import X.InterfaceC2261BLa;
import com.facebook.aura.utils.MC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class WatchesAtColdStart {
    public static volatile Loaded loaded;
    public static final WatchesAtColdStart INSTANCE = new WatchesAtColdStart();
    public static final InterfaceC2261BLa mutex = new C9258GBl();

    public final class Loaded {
        public final ConnectedWatches watches;

        public final ConnectedWatches getWatches() {
            return this.watches;
        }

        public Loaded(ConnectedWatches connectedWatches) {
            this.watches = connectedWatches;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchesAtColdStart", f = "WatchAppPromoNudge.kt", l = {MC.xe_feta_entrypoint_rl.__CONFIG__, 94}, m = "get", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchesAtColdStart$get$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchesAtColdStart.this.get(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(X.G0U<? super X.HtJ<? super com.facebook.aura.watchhandoff.ConnectedWatches>, ? extends java.lang.Object> r8, X.HtJ<? super com.facebook.aura.watchhandoff.ConnectedWatches> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.watchhandoff.WatchesAtColdStart.AnonymousClass1
            if (r0 == 0) goto L26
            r6 = r9
            com.facebook.aura.watchhandoff.WatchesAtColdStart$get$1 r6 = (com.facebook.aura.watchhandoff.WatchesAtColdStart.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r2 = r6.label
            r4 = 2
            r1 = 1
            r3 = 0
            if (r2 == 0) goto L3d
            if (r2 == r1) goto L31
            if (r2 != r4) goto L2c
            java.lang.Object r2 = r6.L$1
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            goto L67
        L26:
            com.facebook.aura.watchhandoff.WatchesAtColdStart$get$1 r6 = new com.facebook.aura.watchhandoff.WatchesAtColdStart$get$1
            r6.<init>(r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            java.lang.Object r2 = r6.L$1
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            java.lang.Object r8 = r6.L$0
            X.G0U r8 = (X.G0U) r8
            X.Hwg.A00(r0)
            goto L56
        L3d:
            X.Hwg.A00(r0)
            com.facebook.aura.watchhandoff.WatchesAtColdStart$Loaded r0 = com.facebook.aura.watchhandoff.WatchesAtColdStart.loaded
            if (r0 == 0) goto L47
            com.facebook.aura.watchhandoff.ConnectedWatches r5 = r0.watches
            return r5
        L47:
            X.BLa r2 = com.facebook.aura.watchhandoff.WatchesAtColdStart.mutex
            r6.L$0 = r8
            r6.L$1 = r2
            r6.label = r1
            java.lang.Object r0 = r2.APs(r3, r6)
            if (r0 != r5) goto L56
            return r5
        L56:
            com.facebook.aura.watchhandoff.WatchesAtColdStart$Loaded r1 = com.facebook.aura.watchhandoff.WatchesAtColdStart.loaded     // Catch: java.lang.Throwable -> L79
            if (r1 != 0) goto L73
            r6.L$0 = r3     // Catch: java.lang.Throwable -> L79
            r6.L$1 = r2     // Catch: java.lang.Throwable -> L79
            r6.label = r4     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r8.invoke(r6)     // Catch: java.lang.Throwable -> L79
            if (r0 != r5) goto L6a
            return r5
        L67:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L7b
        L6a:
            com.facebook.aura.watchhandoff.ConnectedWatches r0 = (com.facebook.aura.watchhandoff.ConnectedWatches) r0     // Catch: java.lang.Throwable -> L7b
            com.facebook.aura.watchhandoff.WatchesAtColdStart$Loaded r1 = new com.facebook.aura.watchhandoff.WatchesAtColdStart$Loaded     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7b
            com.facebook.aura.watchhandoff.WatchesAtColdStart.loaded = r1     // Catch: java.lang.Throwable -> L7b
        L73:
            com.facebook.aura.watchhandoff.ConnectedWatches r0 = r1.watches     // Catch: java.lang.Throwable -> L7b
            r2.Ahe(r3)
            return r0
        L79:
            r0 = move-exception
            goto L7c
        L7b:
            r0 = move-exception
        L7c:
            r2.Ahe(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchhandoff.WatchesAtColdStart.get(X.G0U, X.HtJ):java.lang.Object");
    }
}
