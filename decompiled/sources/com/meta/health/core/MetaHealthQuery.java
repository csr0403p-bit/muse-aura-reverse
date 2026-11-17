package com.meta.health.core;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BV5;
import X.C3cG;
import X.C60O;
import X.C8954FuV;
import X.EnumC10460Hji;
import X.HtJ;
import X.InterfaceC8975FvZ;
import com.facebook.aura.commands.health.HealthSyncManagerKt;
import com.meta.health.healthconnect.HealthConnectPlugin;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class MetaHealthQuery {
    public final Map<String, InterfaceC8975FvZ> A00;
    public final List<InterfaceC8975FvZ> A01;

    /* JADX WARN: Incorrect types in method signature: (LX/FuV;LX/G0V<-Ljava/util/Set<Ljava/lang/String;>;-LX/HtJ<-Ljava/util/Set<Ljava/lang/String;>;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A00(MetaHealthQuery metaHealthQuery, C8954FuV c8954FuV, HtJ htJ) {
        Object objA4w;
        InterfaceC8975FvZ interfaceC8975FvZ = metaHealthQuery.A00.get(c8954FuV.A01);
        return (interfaceC8975FvZ == null || (objA4w = interfaceC8975FvZ.A4w(null, htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objA4w;
    }

    public final C8954FuV A01() {
        InterfaceC8975FvZ interfaceC8975FvZ = this.A00.get(HealthSyncManagerKt.DEFAULT_PROVIDER_ID);
        if (interfaceC8975FvZ == null) {
            return null;
        }
        HealthConnectPlugin healthConnectPlugin = (HealthConnectPlugin) interfaceC8975FvZ;
        return new C8954FuV(healthConnectPlugin.A03, healthConnectPlugin.A02);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:74:0x0104
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Incorrect types in method signature: (LX/FuV;LX/Fvf;LX/G0V<-LX/FvK;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lcom/meta/health/core/MetaHealthQueryObservationSession;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a A[Catch: Exception -> 0x0157, TRY_LEAVE, TryCatch #9 {Exception -> 0x0157, blocks: (B:42:0x0104, B:44:0x010a, B:45:0x0110, B:33:0x00d6), top: B:93:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x013c -> B:42:0x0104). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0198 -> B:63:0x0165). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.C8980Fvf r14, X.C8954FuV r15, X.HtJ r16, X.G0V r17) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.core.MetaHealthQuery.A02(X.Fvf, X.FuV, X.HtJ, X.G0V):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.C8954FuV r6, X.C8955FuX r7, X.HtJ<? super java.util.List<X.C8963Fug>> r8) {
        /*
            r5 = this;
            r3 = 11
            boolean r0 = r8 instanceof X.C8912FtU
            if (r0 == 0) goto L48
            r4 = r8
            X.FtU r4 = (X.C8912FtU) r4
            int r0 = r4.$t
            if (r0 != r3) goto L48
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r1 = r4.A03
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 != r2) goto L4e
            X.Hwg.A00(r1)
        L26:
            if (r1 != 0) goto L2a
        L28:
            X.AGi r1 = X.C0881AGi.A00
        L2a:
            return r1
        L2b:
            X.Hwg.A00(r1)
            java.util.Map<java.lang.String, X.FvZ> r1 = r5.A00
            java.lang.String r0 = r6.A01
            java.lang.Object r1 = r1.get(r0)
            X.FvZ r1 = (X.InterfaceC8975FvZ) r1
            if (r1 == 0) goto L28
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A00 = r2
            java.lang.Object r1 = r1.AB5(r7, r4)
            if (r1 != r3) goto L26
            return r3
        L48:
            X.FtU r4 = new X.FtU
            r4.<init>(r5, r8, r3)
            goto L18
        L4e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.core.MetaHealthQuery.A03(X.FuV, X.FuX, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.C8954FuV r6, X.C8953FuU r7, X.HtJ<? super java.util.List<X.C8962Fuf>> r8) {
        /*
            r5 = this;
            r3 = 12
            boolean r0 = r8 instanceof X.C8912FtU
            if (r0 == 0) goto L48
            r4 = r8
            X.FtU r4 = (X.C8912FtU) r4
            int r0 = r4.$t
            if (r0 != r3) goto L48
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r1 = r4.A03
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 != r2) goto L4e
            X.Hwg.A00(r1)
        L26:
            if (r1 != 0) goto L2a
        L28:
            X.AGi r1 = X.C0881AGi.A00
        L2a:
            return r1
        L2b:
            X.Hwg.A00(r1)
            java.util.Map<java.lang.String, X.FvZ> r1 = r5.A00
            java.lang.String r0 = r6.A01
            java.lang.Object r1 = r1.get(r0)
            X.FvZ r1 = (X.InterfaceC8975FvZ) r1
            if (r1 == 0) goto L28
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A00 = r2
            java.lang.Object r1 = r1.AB7(r7, r4)
            if (r1 != r3) goto L26
            return r3
        L48:
            X.FtU r4 = new X.FtU
            r4.<init>(r5, r8, r3)
            goto L18
        L4e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.core.MetaHealthQuery.A04(X.FuV, X.FuU, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FuV;Ljava/time/Instant;Ljava/time/Instant;Ljava/lang/Long;Ljava/lang/String;LX/HtJ<-LX/Fvh;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.C8954FuV r37, java.lang.Long r38, java.lang.String r39, java.time.Instant r40, java.time.Instant r41, X.HtJ r42) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.core.MetaHealthQuery.A05(X.FuV, java.lang.Long, java.lang.String, java.time.Instant, java.time.Instant, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FuV;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/List<LX/Fuf;>;ILX/HtJ<-Ljava/util/List<+Ljava/util/List<LX/Fuh;>;>;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(X.C8954FuV r12, java.time.Instant r13, java.time.Instant r14, java.util.List r15, X.HtJ r16, int r17) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.core.MetaHealthQuery.A06(X.FuV, java.time.Instant, java.time.Instant, java.util.List, X.HtJ, int):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MetaHealthQuery(List<? extends InterfaceC8975FvZ> list) {
        this.A01 = list;
        HashSet hashSetA13 = C60O.A13();
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : list) {
            if (hashSetA13.add(((HealthConnectPlugin) ((InterfaceC8975FvZ) obj)).A03)) {
                arrayListA0h.add(obj);
            }
        }
        int size = arrayListA0h.size();
        int size2 = this.A01.size();
        List<InterfaceC8975FvZ> list2 = this.A01;
        if (size != size2) {
            ArrayList arrayListA0m = AnonymousClass002.A0m(list2);
            Iterator<InterfaceC8975FvZ> it = list2.iterator();
            while (it.hasNext()) {
                arrayListA0m.add(((HealthConnectPlugin) it.next()).A03);
            }
            throw BV5.A0O(arrayListA0m, "Duplicate providerIds: ");
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list2));
        for (InterfaceC8975FvZ interfaceC8975FvZ : list2) {
            linkedHashMapA15.put(((HealthConnectPlugin) interfaceC8975FvZ).A03, interfaceC8975FvZ);
        }
        this.A00 = linkedHashMapA15;
    }
}
