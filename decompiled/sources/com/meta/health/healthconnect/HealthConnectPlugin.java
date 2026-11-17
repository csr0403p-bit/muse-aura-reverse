package com.meta.health.healthconnect;

import X.AbstractC0885AGm;
import X.AbstractC7609F5w;
import X.AbstractC9044FxQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BFI;
import X.BV4;
import X.BV6;
import X.C3cG;
import X.C3cH;
import X.C5322DgG;
import X.C60N;
import X.C60O;
import X.C7384Etj;
import X.C7VQ;
import X.C8632Fhj;
import X.C8990FwS;
import X.C8993FwW;
import X.C8j3;
import X.C9025Fx3;
import X.C9036FxI;
import X.C9072Fxy;
import X.C9076Fy3;
import X.C9079Fy6;
import X.EnumC8984Fw7;
import X.EnumC9092FyJ;
import X.F0C;
import X.F60;
import X.FGI;
import X.FZP;
import X.Fw6;
import X.Fy1;
import X.G0U;
import X.HiP;
import X.Hj8;
import X.Hlo;
import X.Hrc;
import X.InterfaceC8975FvZ;
import X.InterfaceC9037FxJ;
import android.content.Context;
import com.facebook.aura.commands.health.HealthSyncManagerKt;
import com.meta.health.core.MetaHealthError;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HealthConnectPlugin implements InterfaceC8975FvZ {
    public static final Map<String, Integer> A06;
    public static final Set<String> A07;
    public static final F0C<Set<String>> A08;
    public static final Set<String> A09;
    public static final Set<String> A0A;
    public final Context A00;
    public final Hlo A01;
    public final String A02;
    public final String A03;
    public final F0C A04;
    public final G0U<Context, InterfaceC9037FxJ> A05;

    /* JADX WARN: Incorrect types in method signature: (LX/FwS;LX/FwW<*>;)Ljava/lang/Double; */
    public static final Double A03(C8993FwW c8993FwW, C8990FwS c8990FwS) {
        Object objA01;
        try {
            objA01 = c8990FwS.A01(c8993FwW);
        } catch (Exception unused) {
        }
        if (objA01 instanceof Double) {
            return (Double) objA01;
        }
        if (objA01 instanceof Number) {
            return Double.valueOf(BV6.A00(objA01));
        }
        if (objA01 instanceof Fy1) {
            return Double.valueOf(AbstractC7609F5w.A01((Fy1) objA01));
        }
        if (objA01 instanceof C9076Fy3) {
            return Double.valueOf(((C9076Fy3) objA01).A00());
        }
        if (objA01 instanceof C9072Fxy) {
            return Double.valueOf(((C9072Fxy) objA01).A00());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A07(X.C8993FwW r14, X.C9025Fx3 r15, com.meta.health.healthconnect.HealthConnectPlugin r16, java.lang.String r17, java.lang.String r18, java.time.Instant r19, java.time.Instant r20, X.HtJ r21) {
        /*
            r7 = r14
            r14 = r18
            r13 = r17
            r6 = r20
            r5 = r19
            r3 = 3
            r4 = r21
            boolean r0 = r4 instanceof X.C8904FtM
            r9 = r16
            if (r0 == 0) goto L93
            r11 = r4
            X.FtM r11 = (X.C8904FtM) r11
            int r0 = r11.$t
            if (r0 != r3) goto L93
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L93
            int r2 = r2 - r1
            r11.A00 = r2
        L24:
            java.lang.Object r1 = r11.A07
            X.Hji r10 = X.EnumC10460Hji.A02
            int r0 = r11.A00
            r8 = 1
            if (r0 == 0) goto L67
            if (r0 != r8) goto L9c
            java.lang.Object r14 = r11.A06
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r11.A05
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r6 = r11.A04
            java.time.Instant r6 = (java.time.Instant) r6
            java.lang.Object r5 = r11.A03
            java.time.Instant r5 = (java.time.Instant) r5
            java.lang.Object r7 = r11.A02
            X.FwW r7 = (X.C8993FwW) r7
            X.Hwg.A00(r1)
        L46:
            X.FwS r1 = (X.C8990FwS) r1
            java.lang.Double r0 = A04(r7, r1, r14)
            if (r0 == 0) goto L99
            double r20 = r0.doubleValue()
            java.lang.String r15 = r9.A03
            r12 = 0
            X.Fuh r11 = new X.Fuh
            r16 = r12
            r19 = r12
            r18 = r6
            r17 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.util.List r10 = java.util.Collections.singletonList(r11)
            return r10
        L67:
            X.Hwg.A00(r1)
            X.F0C r0 = r9.A04
            java.lang.Object r4 = r0.getValue()
            X.FxJ r4 = (X.InterfaceC9037FxJ) r4
            java.util.Set r3 = java.util.Collections.singleton(r7)
            r2 = 0
            X.A3q r1 = X.A3q.A00
            X.FxC r0 = new X.FxC
            r0.<init>(r15, r3, r1)
            r11.A01 = r2
            r11.A02 = r7
            r11.A03 = r5
            r11.A04 = r6
            r11.A05 = r13
            r11.A06 = r14
            r11.A00 = r8
            java.lang.Object r1 = r4.A48(r0, r11)
            if (r1 != r10) goto L46
            return r10
        L93:
            X.FtM r11 = new X.FtM
            r11.<init>(r9, r4, r3)
            goto L24
        L99:
            X.AGi r10 = X.C0881AGi.A00
            return r10
        L9c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.A07(X.FwW, X.Fx3, com.meta.health.healthconnect.HealthConnectPlugin, java.lang.String, java.lang.String, java.time.Instant, java.time.Instant, X.HtJ):java.lang.Object");
    }

    public static final Set<String> A0C(InterfaceC9037FxJ interfaceC9037FxJ) {
        C7384Etj.A0Y(interfaceC9037FxJ, 0);
        Map<String, Integer> map = A06;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (interfaceC9037FxJ.AFa().AFZ(AnonymousClass001.A0F(entryA0l.getValue())) == 2) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        return linkedHashMapA0j.keySet();
    }

    public static final boolean A0E(Set<String> set, Set<String> set2) {
        boolean zA1a = AnonymousClass002.A1a(set, set2);
        if (set.containsAll(set2) && (!(set instanceof Collection) || !set.isEmpty())) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                if (A08.getValue().contains(it.next())) {
                    return zA1a;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    @Override // X.InterfaceC8975FvZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A4w(X.G0V<? super java.util.Set<java.lang.String>, ? super X.HtJ<? super java.util.Set<java.lang.String>>, ? extends java.lang.Object> r9, X.HtJ<? super kotlin.Unit> r10) throws com.meta.health.core.MetaHealthError.AuthorizationFailed, com.meta.health.core.MetaHealthError.SdkUnavailable {
        /*
            r8 = this;
            r3 = 5
            boolean r0 = r10 instanceof X.C8908FtQ
            if (r0 == 0) goto Lbb
            r4 = r10
            X.FtQ r4 = (X.C8908FtQ) r4
            int r0 = r4.$t
            if (r0 != r3) goto Lbb
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbb
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r7 = r4.A05
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r3 = 3
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L43
            if (r0 == r1) goto L5d
            if (r0 == r6) goto L9e
            if (r0 != r3) goto Lc2
            java.lang.Object r2 = r4.A03
            java.util.Set r2 = (java.util.Set) r2
            X.Hwg.A00(r7)
        L2f:
            java.util.Set r7 = (java.util.Set) r7
            boolean r0 = A0E(r7, r2)
            if (r0 != 0) goto Ld3
            java.lang.String r0 = "Health Connect permissions denied: missing special or data permissions"
            java.lang.IllegalStateException r1 = X.C3cG.A0Q(r0)
            com.meta.health.core.MetaHealthError$AuthorizationFailed r0 = new com.meta.health.core.MetaHealthError$AuthorizationFailed
            r0.<init>(r1)
            throw r0
        L43:
            X.Hwg.A00(r7)
            android.content.Context r0 = r8.A00
            int r0 = X.C10586Hws.A00(r0)
            if (r0 != r3) goto Ld6
            X.Hrc r0 = A00(r8)
            r4.A01 = r9
            r4.A00 = r1
            java.lang.Object r7 = r0.AG0(r4)
            if (r7 != r5) goto L64
            return r5
        L5d:
            java.lang.Object r9 = r4.A01
            X.G0V r9 = (X.G0V) r9
            X.Hwg.A00(r7)
        L64:
            java.util.Set r7 = (java.util.Set) r7
            X.F0C r0 = r8.A04
            java.lang.Object r0 = r0.getValue()
            X.FxJ r0 = (X.InterfaceC9037FxJ) r0
            java.util.Set r2 = A0C(r0)
            boolean r0 = A0E(r7, r2)
            if (r0 != 0) goto Ld3
            if (r9 == 0) goto Lc7
            X.F0C<java.util.Set<java.lang.String>> r0 = com.meta.health.healthconnect.HealthConnectPlugin.A08
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.Set<java.lang.String> r0 = com.meta.health.healthconnect.HealthConnectPlugin.A07
            java.util.LinkedHashSet r0 = X.BGK.A01(r0, r1)
            java.util.Set r1 = X.BGK.A03(r7, r0)
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A03 = r2
            r4.A04 = r0
            r4.A00 = r6
            java.lang.Object r0 = r9.invoke(r1, r4)
            if (r0 != r5) goto La5
            return r5
        L9e:
            java.lang.Object r2 = r4.A03
            java.util.Set r2 = (java.util.Set) r2
            X.Hwg.A00(r7)
        La5:
            X.Hrc r1 = A00(r8)
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A03 = r2
            r4.A04 = r0
            r4.A00 = r3
            java.lang.Object r7 = r1.AG0(r4)
            if (r7 != r5) goto L2f
            return r5
        Lbb:
            X.FtQ r4 = new X.FtQ
            r4.<init>(r8, r10, r3)
            goto L17
        Lc2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lc7:
            java.lang.String r0 = "Health Connect permissions not granted and no launcher provided"
            java.lang.IllegalStateException r1 = X.C3cG.A0Q(r0)
            com.meta.health.core.MetaHealthError$AuthorizationFailed r0 = new com.meta.health.core.MetaHealthError$AuthorizationFailed
            r0.<init>(r1)
            throw r0
        Ld3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Ld6:
            com.meta.health.core.MetaHealthError$SdkUnavailable r0 = new com.meta.health.core.MetaHealthError$SdkUnavailable
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.A4w(X.G0V, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    @Override // X.InterfaceC8975FvZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AB3(X.C8957FuZ r14, X.HtJ<? super java.util.List<X.C8964Fuh>> r15) throws com.meta.health.core.MetaHealthError {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.AB3(X.FuZ, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // X.InterfaceC8975FvZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AB7(X.C8953FuU r11, X.HtJ<? super java.util.List<X.C8962Fuf>> r12) throws com.meta.health.core.MetaHealthError {
        /*
            r10 = this;
            r3 = 5
            boolean r0 = r12 instanceof X.FtK
            if (r0 == 0) goto Ld
            r0 = r12
            X.FtK r0 = (X.FtK) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            r7 = r10
            if (r0 == 0) goto L32
            r8 = r12
            X.FtK r8 = (X.FtK) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L32
            int r2 = r2 - r1
            r8.A00 = r2
        L1f:
            java.lang.Object r6 = r8.A08
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            r2 = 3
            r5 = 2
            r1 = 1
            r9 = 0
            if (r0 == 0) goto L46
            if (r0 == r1) goto L41
            if (r0 == r5) goto L9b
            if (r0 != r2) goto L3c
            goto L38
        L32:
            X.FtK r8 = new X.FtK
            r8.<init>(r10, r12, r3)
            goto L1f
        L38:
            X.Hwg.A00(r6)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            return r6
        L3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L41:
            java.lang.Object r11 = r8.A01
            X.FuU r11 = (X.C8953FuU) r11
            goto L58
        L46:
            X.Hwg.A00(r6)
            X.Hrc r0 = A00(r10)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            r8.A01 = r11     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            r8.A00 = r1     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            java.lang.Object r6 = r0.AG0(r8)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            if (r6 != r3) goto L5b
            return r3
        L58:
            X.Hwg.A00(r6)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
        L5b:
            java.util.Set r6 = (java.util.Set) r6     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            java.lang.Class<X.FxW> r4 = X.C9048FxW.class
            X.A6i r0 = X.C3cG.A0x(r4)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            java.lang.String r0 = X.AbstractC9051FxZ.A00(r0)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            boolean r0 = r6.contains(r0)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            if (r0 != 0) goto L70
            X.AGi r0 = X.C0881AGi.A00     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            return r0
        L70:
            java.time.Instant r1 = r11.A00     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            if (r1 != 0) goto L78
            java.time.Instant r1 = java.time.Instant.now()     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
        L78:
            java.time.Instant r0 = r11.A01     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            X.C7384Etj.A0X(r1)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            X.Fx3 r6 = A01(r0, r1)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            if (r6 != 0) goto L86
            X.AGi r0 = X.C0881AGi.A00     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            return r0
        L86:
            X.A6i r10 = X.C3cG.A0x(r4)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            r11 = 1000(0x3e8, float:1.401E-42)
            X.FtK.A01(r8)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            r8.A06 = r9     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            r8.A00 = r5     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            r12 = 0
            java.lang.Object r6 = A0A(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            if (r6 != r3) goto L9e
            return r3
        L9b:
            X.Hwg.A00(r6)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
        L9e:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            r1 = 12
            X.FtE r0 = new X.FtE     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            r0.<init>(r7, r9, r6, r1)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            X.FtK.A01(r8)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            r8.A06 = r9     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            r8.A07 = r9     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            r8.A00 = r2     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            java.lang.Object r6 = X.Hxb.A00(r0, r8)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.CancellationException -> Lbe
            if (r6 != r3) goto Lb7
            return r3
        Lb7:
            return r6
        Lb8:
            r0 = move-exception
            com.meta.health.core.MetaHealthError r0 = A02(r0)
            throw r0
        Lbe:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.AB7(X.FuU, X.HtJ):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // X.InterfaceC8975FvZ
    public final java.lang.Object ARY(X.C8959Fub r15, X.HtJ<? super X.InterfaceC8971FvL> r16) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.ARY(X.Fub, X.HtJ):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // X.InterfaceC8975FvZ
    public final java.lang.Object ARZ(X.C8960Fuc r15, X.HtJ<? super X.InterfaceC8971FvL> r16) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.ARZ(X.Fuc, X.HtJ):java.lang.Object");
    }

    public /* synthetic */ HealthConnectPlugin(Context context) {
        Hlo hlo = new Hlo();
        C7VQ c7vq = new C7VQ(InterfaceC9037FxJ.A00);
        C7384Etj.A0Y(context, 0);
        this.A00 = context;
        this.A01 = hlo;
        this.A05 = c7vq;
        this.A04 = FZP.A02(this, 24);
        this.A03 = HealthSyncManagerKt.DEFAULT_PROVIDER_ID;
        this.A02 = "Android Health Connect";
    }

    public static Hrc A00(HealthConnectPlugin healthConnectPlugin) {
        return (Hrc) ((InterfaceC9037FxJ) healthConnectPlugin.A04.getValue());
    }

    public static final MetaHealthError A02(Exception exc) {
        if (!(exc instanceof MetaHealthError)) {
            if (exc instanceof SecurityException) {
                return new MetaHealthError.AuthorizationFailed(exc);
            }
            if (!(exc instanceof UnsupportedOperationException)) {
                String message = exc.getMessage();
                if (message == null) {
                    message = C60N.A00(0);
                }
                return new MetaHealthError.QueryFailed(FGI.A0M("Health data query failed: ", message), exc);
            }
            exc = new MetaHealthError.SdkUnavailable();
        }
        return (MetaHealthError) exc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.Hji] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(X.C8993FwW r14, X.C9025Fx3 r15, com.meta.health.healthconnect.HealthConnectPlugin r16, java.lang.String r17, java.lang.String r18, java.time.Duration r19, X.HtJ r20) {
        /*
            r13 = r18
            r12 = r17
            r5 = r14
            r3 = 9
            r4 = r20
            boolean r0 = r4 instanceof X.C8906FtO
            r7 = r16
            if (r0 == 0) goto La0
            r9 = r4
            X.FtO r9 = (X.C8906FtO) r9
            int r0 = r9.$t
            if (r0 != r3) goto La0
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La0
            int r2 = r2 - r1
            r9.A00 = r2
        L21:
            java.lang.Object r1 = r9.A06
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r9.A00
            r8 = 1
            if (r0 == 0) goto L74
            if (r0 != r8) goto La7
            java.lang.Object r13 = r9.A05
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r9.A04
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r9.A02
            X.FwW r5 = (X.C8993FwW) r5
            X.Hwg.A00(r1)
        L3b:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r6 = X.C3cG.A0h()
            java.util.Iterator r3 = r1.iterator()
        L45:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r2 = r3.next()
            X.FxB r2 = (X.C9030FxB) r2
            X.FwS r0 = r2.A00
            java.lang.Double r0 = A04(r5, r0, r13)
            if (r0 == 0) goto L45
            double r19 = r0.doubleValue()
            java.time.Instant r1 = r2.A02
            java.time.Instant r0 = r2.A01
            java.lang.String r14 = r7.A03
            r11 = 0
            X.Fuh r10 = new X.Fuh
            r15 = r11
            r18 = r11
            r16 = r1
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r6.add(r10)
            goto L45
        L74:
            X.Hwg.A00(r1)
            X.F0C r0 = r7.A04
            java.lang.Object r4 = r0.getValue()
            X.FxJ r4 = (X.InterfaceC9037FxJ) r4
            java.util.Set r3 = java.util.Collections.singleton(r14)
            r2 = 0
            X.A3q r1 = X.A3q.A00
            X.FxA r0 = new X.FxA
            r10 = r19
            r0.<init>(r15, r10, r3, r1)
            r9.A01 = r2
            r9.A02 = r14
            r9.A03 = r2
            r9.A04 = r12
            r9.A05 = r13
            r9.A00 = r8
            java.lang.Object r1 = r4.A49(r0, r9)
            if (r1 != r6) goto L3b
        L9f:
            return r6
        La0:
            X.FtO r9 = new X.FtO
            r9.<init>(r7, r4, r3)
            goto L21
        La7:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.A06(X.FwW, X.Fx3, com.meta.health.healthconnect.HealthConnectPlugin, java.lang.String, java.lang.String, java.time.Duration, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:76|(1:(3:10|67|24)(2:12|13))(4:14|(1:18)|19|(3:65|21|(1:23))(5:54|56|(1:60)|61|62))|25|71|26|69|27|75|28|(3:30|(2:32|36)|37)(3:33|(2:35|36)|37)|73|38|39|(2:41|(2:43|47))(2:44|(2:46|47))|56|(2:58|60)|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fb, code lost:
    
        r12 = null;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A08(X.C9048FxW r20, com.meta.health.healthconnect.HealthConnectPlugin r21, X.HtJ r22) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.A08(X.FxW, com.meta.health.healthconnect.HealthConnectPlugin, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A09(X.C9025Fx3 r17, X.EnumC8984Fw7 r18, com.meta.health.healthconnect.HealthConnectPlugin r19, java.lang.Long r20, java.lang.String r21, java.lang.String r22, java.time.Instant r23, java.time.Instant r24, X.HtJ r25, X.C9uG r26) throws com.meta.health.core.MetaHealthError.IncompleteResult {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.A09(X.Fx3, X.Fw7, com.meta.health.healthconnect.HealthConnectPlugin, java.lang.Long, java.lang.String, java.lang.String, java.time.Instant, java.time.Instant, X.HtJ, X.9uG):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:32:0x009e, B:34:0x00a2], limit reached: 59 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f8 -> B:11:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A0A(X.C9025Fx3 r20, com.meta.health.healthconnect.HealthConnectPlugin r21, X.HtJ r22, X.G0U r23, X.C9uG r24, int r25, boolean r26) throws com.meta.health.core.MetaHealthError.IncompleteResult {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.A0A(X.Fx3, com.meta.health.healthconnect.HealthConnectPlugin, X.HtJ, X.G0U, X.9uG, int, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A0B(com.meta.health.healthconnect.HealthConnectPlugin r24, java.lang.String r25, java.lang.String r26, java.time.Instant r27, java.time.Instant r28, X.HtJ r29, X.C9uG r30, long r31) throws com.meta.health.core.MetaHealthError.IncompleteResult {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.A0B(com.meta.health.healthconnect.HealthConnectPlugin, java.lang.String, java.lang.String, java.time.Instant, java.time.Instant, X.HtJ, X.9uG, long):java.lang.Object");
    }

    public static void A0D(C9036FxI c9036FxI, Object obj, Object obj2, Object obj3, int i) {
        c9036FxI.L$8 = obj;
        c9036FxI.L$9 = obj2;
        c9036FxI.L$10 = obj3;
        c9036FxI.L$11 = null;
        c9036FxI.L$12 = null;
        c9036FxI.I$0 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb A[Catch: Exception -> 0x0149, CancellationException -> 0x014f, TryCatch #2 {CancellationException -> 0x014f, Exception -> 0x0149, blocks: (B:42:0x00a8, B:43:0x00ab, B:44:0x00b5, B:46:0x00bb, B:48:0x00cb, B:52:0x00d3, B:53:0x00d7, B:54:0x00dd, B:56:0x00e3, B:71:0x0109, B:73:0x0142, B:74:0x0147, B:27:0x0062, B:28:0x0065, B:30:0x0077, B:32:0x007a, B:34:0x007e, B:35:0x0082, B:37:0x008d, B:39:0x0090, B:24:0x0051), top: B:81:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    @Override // X.InterfaceC8975FvZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AB4(X.C8956FuY r23, X.HtJ<? super java.util.List<X.C8964Fuh>> r24) throws com.meta.health.core.MetaHealthError {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.AB4(X.FuY, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4 A[Catch: Exception -> 0x0199, CancellationException -> 0x019f, TryCatch #2 {CancellationException -> 0x019f, Exception -> 0x0199, blocks: (B:42:0x00b1, B:43:0x00b4, B:44:0x00be, B:46:0x00c4, B:47:0x00e4, B:49:0x00ea, B:59:0x0116, B:60:0x0118, B:61:0x011a, B:62:0x011c, B:63:0x011e, B:64:0x0120, B:66:0x0140, B:70:0x014b, B:74:0x0156, B:78:0x0161, B:82:0x016c, B:86:0x0177, B:87:0x017c, B:27:0x0064, B:28:0x0067, B:30:0x0079, B:32:0x007c, B:34:0x0080, B:35:0x0084, B:37:0x008f, B:39:0x0092, B:24:0x0051), top: B:94:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @Override // X.InterfaceC8975FvZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AB5(X.C8955FuX r33, X.HtJ<? super java.util.List<X.C8963Fug>> r34) throws com.meta.health.core.MetaHealthError {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.AB5(X.FuX, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:116:0x0274, B:110:0x0266], limit reached: 200 */
    /* JADX WARN: Path cross not found for [B:136:0x02c6, B:134:0x02bd], limit reached: 200 */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03e2 A[Catch: Exception -> 0x0408, CancellationException -> 0x040e, TryCatch #4 {CancellationException -> 0x040e, Exception -> 0x0408, blocks: (B:159:0x03d7, B:160:0x03da, B:161:0x03dc, B:163:0x03e2, B:45:0x0173, B:38:0x0147, B:40:0x014d, B:42:0x0161, B:44:0x016d, B:47:0x0179, B:49:0x0185, B:50:0x018b, B:52:0x0191, B:53:0x0197, B:127:0x0299, B:130:0x02ab, B:132:0x02b9, B:134:0x02bd, B:138:0x02c9, B:142:0x030c, B:144:0x0312, B:146:0x031a, B:150:0x0356, B:151:0x035a, B:155:0x0395, B:156:0x0398, B:55:0x019c, B:57:0x01a4, B:61:0x01ae, B:62:0x01b2, B:63:0x01b6, B:65:0x01be, B:66:0x01c2, B:68:0x01ca, B:70:0x01d0, B:71:0x01d4, B:73:0x01dc, B:75:0x01e2, B:76:0x01e6, B:78:0x01ee, B:79:0x01f2, B:81:0x01fa, B:82:0x01fe, B:84:0x0206, B:85:0x020a, B:87:0x0212, B:88:0x0216, B:90:0x021e, B:91:0x0221, B:93:0x0229, B:94:0x022c, B:96:0x0234, B:97:0x0237, B:99:0x023f, B:100:0x0242, B:102:0x024a, B:103:0x024d, B:105:0x0255, B:106:0x0258, B:108:0x0260, B:114:0x026e, B:115:0x0271, B:116:0x0274, B:117:0x0277, B:119:0x027f, B:120:0x0282, B:122:0x028a, B:123:0x028d, B:125:0x0295, B:166:0x03f6, B:154:0x0392, B:149:0x0353, B:141:0x0309, B:36:0x0138, B:37:0x013b, B:26:0x010d, B:28:0x0111, B:29:0x0115, B:31:0x0120, B:33:0x0123), top: B:177:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014d A[Catch: Exception -> 0x0408, CancellationException -> 0x040e, TryCatch #4 {CancellationException -> 0x040e, Exception -> 0x0408, blocks: (B:159:0x03d7, B:160:0x03da, B:161:0x03dc, B:163:0x03e2, B:45:0x0173, B:38:0x0147, B:40:0x014d, B:42:0x0161, B:44:0x016d, B:47:0x0179, B:49:0x0185, B:50:0x018b, B:52:0x0191, B:53:0x0197, B:127:0x0299, B:130:0x02ab, B:132:0x02b9, B:134:0x02bd, B:138:0x02c9, B:142:0x030c, B:144:0x0312, B:146:0x031a, B:150:0x0356, B:151:0x035a, B:155:0x0395, B:156:0x0398, B:55:0x019c, B:57:0x01a4, B:61:0x01ae, B:62:0x01b2, B:63:0x01b6, B:65:0x01be, B:66:0x01c2, B:68:0x01ca, B:70:0x01d0, B:71:0x01d4, B:73:0x01dc, B:75:0x01e2, B:76:0x01e6, B:78:0x01ee, B:79:0x01f2, B:81:0x01fa, B:82:0x01fe, B:84:0x0206, B:85:0x020a, B:87:0x0212, B:88:0x0216, B:90:0x021e, B:91:0x0221, B:93:0x0229, B:94:0x022c, B:96:0x0234, B:97:0x0237, B:99:0x023f, B:100:0x0242, B:102:0x024a, B:103:0x024d, B:105:0x0255, B:106:0x0258, B:108:0x0260, B:114:0x026e, B:115:0x0271, B:116:0x0274, B:117:0x0277, B:119:0x027f, B:120:0x0282, B:122:0x028a, B:123:0x028d, B:125:0x0295, B:166:0x03f6, B:154:0x0392, B:149:0x0353, B:141:0x0309, B:36:0x0138, B:37:0x013b, B:26:0x010d, B:28:0x0111, B:29:0x0115, B:31:0x0120, B:33:0x0123), top: B:177:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179 A[Catch: Exception -> 0x0408, CancellationException -> 0x040e, TryCatch #4 {CancellationException -> 0x040e, Exception -> 0x0408, blocks: (B:159:0x03d7, B:160:0x03da, B:161:0x03dc, B:163:0x03e2, B:45:0x0173, B:38:0x0147, B:40:0x014d, B:42:0x0161, B:44:0x016d, B:47:0x0179, B:49:0x0185, B:50:0x018b, B:52:0x0191, B:53:0x0197, B:127:0x0299, B:130:0x02ab, B:132:0x02b9, B:134:0x02bd, B:138:0x02c9, B:142:0x030c, B:144:0x0312, B:146:0x031a, B:150:0x0356, B:151:0x035a, B:155:0x0395, B:156:0x0398, B:55:0x019c, B:57:0x01a4, B:61:0x01ae, B:62:0x01b2, B:63:0x01b6, B:65:0x01be, B:66:0x01c2, B:68:0x01ca, B:70:0x01d0, B:71:0x01d4, B:73:0x01dc, B:75:0x01e2, B:76:0x01e6, B:78:0x01ee, B:79:0x01f2, B:81:0x01fa, B:82:0x01fe, B:84:0x0206, B:85:0x020a, B:87:0x0212, B:88:0x0216, B:90:0x021e, B:91:0x0221, B:93:0x0229, B:94:0x022c, B:96:0x0234, B:97:0x0237, B:99:0x023f, B:100:0x0242, B:102:0x024a, B:103:0x024d, B:105:0x0255, B:106:0x0258, B:108:0x0260, B:114:0x026e, B:115:0x0271, B:116:0x0274, B:117:0x0277, B:119:0x027f, B:120:0x0282, B:122:0x028a, B:123:0x028d, B:125:0x0295, B:166:0x03f6, B:154:0x0392, B:149:0x0353, B:141:0x0309, B:36:0x0138, B:37:0x013b, B:26:0x010d, B:28:0x0111, B:29:0x0115, B:31:0x0120, B:33:0x0123), top: B:177:0x0026 }] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.HiP] */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.HiP] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.HiP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.HiP] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.HiP] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.HtJ] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [X.Fve] */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.Fve] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.Fve, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.Fve] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x03d4 -> B:160:0x03da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x016d -> B:45:0x0173). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC8975FvZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AB6(X.C8958Fua r32, X.HtJ<? super java.util.List<X.C8970FvI>> r33) throws com.meta.health.core.MetaHealthError {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.AB6(X.Fua, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    @Override // X.InterfaceC8975FvZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AB8(java.lang.String r16, java.time.Instant r17, java.time.Instant r18, X.HtJ<? super java.util.List<X.C8964Fuh>> r19) throws com.meta.health.core.MetaHealthError {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectPlugin.AB8(java.lang.String, java.time.Instant, java.time.Instant, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC8975FvZ
    public final List<Fw6> Age() {
        Set<Map.Entry<String, HiP>> setEntrySet = AbstractC9044FxQ.A02.entrySet();
        ArrayList arrayListA0h = C3cG.A0h();
        for (Map.Entry<String, HiP> entry : setEntrySet) {
            String strA0t = C60O.A0t(entry);
            C7384Etj.A0Y(strA0t, 0);
            if (!strA0t.startsWith("dietary_")) {
                arrayListA0h.add(entry);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            arrayListA0i.add(new Fw6(C60O.A0t(entryA0l), ((HiP) entryA0l.getValue()).A03));
        }
        return arrayListA0i;
    }

    static {
        Map<String, Integer> mapA0d = AnonymousClass007.A0d("android.permission.health.READ_HEALTH_DATA_IN_BACKGROUND", BV4.A0W(), C3cG.A0r("android.permission.health.READ_HEALTH_DATA_HISTORY", BV4.A0Z()));
        A06 = mapA0d;
        A07 = mapA0d.keySet();
        A08 = C5322DgG.A01((Function0) new C8632Fhj(6));
        A0A = BFI.A0H(new String[]{"heart_rate_variability_average", "vo2_max_average", "body_fat_percentage_average", "body_water_mass_average", "bone_mass_average", "lean_body_mass_average"});
        A09 = Collections.singleton("steps");
    }

    public static final C9025Fx3 A01(Instant instant, Instant instant2) {
        if (!instant2.isAfter(instant)) {
            return null;
        }
        C7384Etj.A0Y(instant, 0);
        if (instant.isBefore(instant2)) {
            return new C9025Fx3(instant, instant2, null, null);
        }
        throw C60O.A0i("end time needs be after start time");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FwS;LX/FwW<*>;Ljava/lang/String;)Ljava/lang/Double; */
    public static final Double A04(C8993FwW c8993FwW, C8990FwS c8990FwS, String str) {
        double dA00;
        double d;
        double dA002;
        Object objA01 = c8990FwS.A01(c8993FwW);
        if (objA01 instanceof Long) {
            dA00 = C3cG.A05(objA01);
        } else {
            if (objA01 instanceof Double) {
                return (Double) objA01;
            }
            if (objA01 instanceof Number) {
                dA00 = BV6.A00(objA01);
            } else {
                if (objA01 instanceof Fy1) {
                    Fy1 fy1 = (Fy1) objA01;
                    d = fy1.A00;
                    dA002 = fy1.A01.A00();
                } else if (objA01 instanceof C9076Fy3) {
                    dA00 = ((C9076Fy3) objA01).A00();
                } else if (objA01 instanceof C9072Fxy) {
                    C9072Fxy c9072Fxy = (C9072Fxy) objA01;
                    if ("g".equals(str)) {
                        d = c9072Fxy.A00;
                        dA002 = c9072Fxy.A01.A00();
                    } else {
                        dA00 = c9072Fxy.A00();
                    }
                } else if (objA01 instanceof Hj8) {
                    dA00 = ((Hj8) objA01).A00;
                } else {
                    if (!(objA01 instanceof C9079Fy6)) {
                        return null;
                    }
                    C9079Fy6 c9079Fy6 = (C9079Fy6) objA01;
                    EnumC9092FyJ enumC9092FyJ = EnumC9092FyJ.A03;
                    EnumC9092FyJ enumC9092FyJ2 = c9079Fy6.A01;
                    dA00 = c9079Fy6.A00;
                    if (enumC9092FyJ2 != enumC9092FyJ) {
                        dA00 = (dA00 * enumC9092FyJ2.A00()) / enumC9092FyJ.A00();
                    }
                }
                dA00 = d * dA002;
            }
        }
        return Double.valueOf(dA00);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Ljava/lang/Double;>;LX/Fw7;)Ljava/lang/Double; */
    public static final Double A05(EnumC8984Fw7 enumC8984Fw7, List list) {
        double dA00;
        if (!list.isEmpty()) {
            int iOrdinal = enumC8984Fw7.ordinal();
            if (iOrdinal == 0) {
                Iterator it = list.iterator();
                dA00 = 0.0d;
                while (it.hasNext()) {
                    dA00 += BV6.A00(it.next());
                }
            } else if (iOrdinal == 1) {
                Iterator it2 = list.iterator();
                double dA002 = 0.0d;
                int i = 0;
                while (it2.hasNext()) {
                    dA002 += BV6.A00(it2.next());
                    i++;
                    if (i < 0) {
                        AbstractC0885AGm.A13();
                        throw F60.createAndThrow();
                    }
                }
                dA00 = i == 0 ? Double.NaN : dA002 / i;
            } else if (iOrdinal == 2) {
                Iterator it3 = list.iterator();
                if (!it3.hasNext()) {
                    throw C8j3.A1D();
                }
                dA00 = BV6.A00(it3.next());
                while (it3.hasNext()) {
                    dA00 = Math.min(dA00, BV6.A00(it3.next()));
                }
            } else {
                if (iOrdinal != 3) {
                    throw C3cG.A0q();
                }
                Iterator it4 = list.iterator();
                if (!it4.hasNext()) {
                    throw C8j3.A1D();
                }
                dA00 = BV6.A00(it4.next());
                while (it4.hasNext()) {
                    dA00 = Math.max(dA00, BV6.A00(it4.next()));
                }
            }
            if (!Double.isNaN(dA00) && !Double.isInfinite(dA00)) {
                return Double.valueOf(dA00);
            }
        }
        return null;
    }
}
