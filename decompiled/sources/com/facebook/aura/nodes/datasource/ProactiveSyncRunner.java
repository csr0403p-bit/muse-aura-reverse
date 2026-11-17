package com.facebook.aura.nodes.datasource;

import X.AbstractC3358CGz;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C9258GBl;
import X.HtJ;
import X.HzP;
import X.InterfaceC2261BLa;
import com.facebook.aura.nodes.core.NodeHitlGate;
import com.facebook.aura.nodes.datasource.ProactiveConnectionGate;
import com.facebook.aura.nodes.datasource.ProactiveTrigger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ProactiveSyncRunner {
    public static final ProactiveSyncRunner INSTANCE = new ProactiveSyncRunner();
    public static final ConcurrentHashMap<String, InterfaceC2261BLa> sourceLocks = C60O.A1C();

    @DebugMetadata(c = "com.facebook.aura.nodes.datasource.ProactiveSyncRunner", f = "ProactiveSyncRunner.kt", l = {64, 170, 109, 113}, m = "run", v = 2)
    /* renamed from: com.facebook.aura.nodes.datasource.ProactiveSyncRunner$run$1, reason: invalid class name and case insensitive filesystem */
    public final class C127731 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C127731(HtJ<? super C127731> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProactiveSyncRunner.this.run(null, null, null, null, null, null, this);
        }
    }

    private final InterfaceC2261BLa lockFor(String str) {
        InterfaceC2261BLa interfaceC2261BLaComputeIfAbsent = sourceLocks.computeIfAbsent(str, new Function() { // from class: com.facebook.aura.nodes.datasource.ProactiveSyncRunner.lockFor.1
            public final InterfaceC2261BLa apply(String str2) {
                return new C9258GBl();
            }

            @Override // java.util.function.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return new C9258GBl();
            }
        });
        C7384Etj.A0U(interfaceC2261BLaComputeIfAbsent);
        return interfaceC2261BLaComputeIfAbsent;
    }

    public static /* synthetic */ Object run$default(ProactiveSyncRunner proactiveSyncRunner, DataSource dataSource, String str, AbstractC3358CGz abstractC3358CGz, DataSourcePublishSink dataSourcePublishSink, NodeHitlGate nodeHitlGate, ProactiveConnectionGate proactiveConnectionGate, HtJ htJ, int i, Object obj) {
        if ((i & 32) != 0) {
            proactiveConnectionGate = ProactiveConnectionGate.Companion.AlwaysReady;
        }
        return proactiveSyncRunner.run(dataSource, str, abstractC3358CGz, dataSourcePublishSink, nodeHitlGate, proactiveConnectionGate, htJ);
    }

    private final String triggerTypeValue(ProactiveTrigger proactiveTrigger) {
        if (proactiveTrigger instanceof ProactiveTrigger.ContentObserver) {
            return "content_observer";
        }
        if (proactiveTrigger instanceof ProactiveTrigger.BroadcastReceiver) {
            return "broadcast_receiver";
        }
        if (C7384Etj.areEqual(proactiveTrigger, ProactiveTrigger.NotificationListener.INSTANCE)) {
            return "notification_listener";
        }
        if (proactiveTrigger instanceof ProactiveTrigger.Periodic) {
            return "periodic";
        }
        if (proactiveTrigger instanceof ProactiveTrigger.CallerDriven) {
            return "caller_driven";
        }
        if (C7384Etj.areEqual(proactiveTrigger, ProactiveTrigger.None.INSTANCE)) {
            return "none";
        }
        throw C3cG.A0q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        if (r15 != null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0168 A[Catch: all -> 0x021b, CancellationException -> 0x021d, TryCatch #6 {CancellationException -> 0x021d, all -> 0x021b, blocks: (B:49:0x0162, B:51:0x0168, B:54:0x0187), top: B:93:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0187 A[Catch: all -> 0x021b, CancellationException -> 0x021d, TryCatch #6 {CancellationException -> 0x021d, all -> 0x021b, blocks: (B:49:0x0162, B:51:0x0168, B:54:0x0187), top: B:93:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c6 A[Catch: all -> 0x0217, CancellationException -> 0x0219, TryCatch #5 {CancellationException -> 0x0219, all -> 0x0217, blocks: (B:57:0x01b7, B:58:0x01ba, B:61:0x01c2, B:63:0x01c6, B:64:0x01de, B:66:0x01e2, B:67:0x01f7, B:68:0x01fb, B:70:0x0203, B:72:0x020b, B:73:0x020f, B:74:0x0210, B:59:0x01bd, B:60:0x01c0), top: B:92:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01de A[Catch: all -> 0x0217, CancellationException -> 0x0219, TryCatch #5 {CancellationException -> 0x0219, all -> 0x0217, blocks: (B:57:0x01b7, B:58:0x01ba, B:61:0x01c2, B:63:0x01c6, B:64:0x01de, B:66:0x01e2, B:67:0x01f7, B:68:0x01fb, B:70:0x0203, B:72:0x020b, B:73:0x020f, B:74:0x0210, B:59:0x01bd, B:60:0x01c0), top: B:92:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ff A[EDGE_INSN: B:95:0x00ff->B:38:0x00ff BREAK  A[LOOP:0: B:29:0x00d8->B:97:0x00d8], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.aura.perf.HatchNodeQplLogger] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.aura.perf.HatchNodeQplLogger] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.facebook.aura.nodes.core.NodeHitlGate] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object run(com.facebook.aura.nodes.datasource.DataSource r18, java.lang.String r19, X.AbstractC3358CGz r20, com.facebook.aura.nodes.datasource.DataSourcePublishSink r21, com.facebook.aura.nodes.core.NodeHitlGate r22, com.facebook.aura.nodes.datasource.ProactiveConnectionGate r23, X.HtJ<? super com.facebook.aura.nodes.datasource.DataSourceResult> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.datasource.ProactiveSyncRunner.run(com.facebook.aura.nodes.datasource.DataSource, java.lang.String, X.CGz, com.facebook.aura.nodes.datasource.DataSourcePublishSink, com.facebook.aura.nodes.core.NodeHitlGate, com.facebook.aura.nodes.datasource.ProactiveConnectionGate, X.HtJ):java.lang.Object");
    }
}
