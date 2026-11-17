package androidx.room;

import X.AIX;
import X.AIY;
import X.AbstractC2258BHp;
import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.C1282AgS;
import X.C3UX;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C7587F5a;
import X.C79;
import X.EIN;
import X.EIV;
import X.EZD;
import X.G0U;
import X.GAo;
import X.HtJ;
import X.HxE;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TriggerBasedInvalidationTracker {
    public static final String[] A0B = {"INSERT", "UPDATE", "DELETE"};
    public final EIV A01;
    public final ObservedTableVersions A02;
    public final EIN A03;
    public final Map<String, Set<String>> A04;
    public final boolean A05;
    public final Map<String, String> A06;
    public final G0U<Set<Integer>, Unit> A09;
    public final String[] A0A;
    public final AtomicBoolean A08 = BV4.A12(false);
    public Function0<Boolean> A00 = new C7587F5a(1);
    public final Map<String, Integer> A07 = C3cG.A0j();

    /* JADX WARN: Incorrect types in method signature: (LX/EIN;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;+Ljava/util/Set<Ljava/lang/String;>;>;[Ljava/lang/String;ZLX/G0U<-Ljava/util/Set<Ljava/lang/Integer;>;Lkotlin/Unit;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public TriggerBasedInvalidationTracker(EIN ein, Map map, Map map2, G0U g0u, String[] strArr, boolean z) {
        this.A03 = ein;
        this.A06 = map;
        this.A04 = map2;
        this.A05 = z;
        this.A09 = g0u;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            this.A07.put(lowerCase, Integer.valueOf(i));
            String str2 = this.A06.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
            }
            strArr2[i] = lowerCase;
        }
        this.A0A = strArr2;
        Iterator itA0n = AnonymousClass002.A0n(this.A06);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.A07.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                Map<String, Integer> map3 = this.A07;
                map3.put(lowerCase3, AbstractC2258BHp.A0L(lowerCase2, map3));
            }
        }
        this.A01 = new EIV(this.A0A.length);
        this.A02 = new ObservedTableVersions(this.A0A.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.EJD r6, androidx.room.TriggerBasedInvalidationTracker r7, X.HtJ r8) {
        /*
            r3 = 0
            boolean r0 = r8 instanceof X.C6858EbG
            if (r0 == 0) goto L5d
            r5 = r8
            X.EbG r5 = (X.C6858EbG) r5
            int r0 = r5.$t
            if (r0 != r3) goto L5d
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r4 = r5.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r5.A00
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L2b
            if (r1 == r0) goto L40
            if (r1 != r2) goto L63
            java.lang.Object r1 = r5.A01
            X.Hwg.A00(r4)
        L2a:
            return r1
        L2b:
            X.Hwg.A00(r4)
            X.F5b r1 = new X.F5b
            r1.<init>(r0)
            r5.A01 = r6
            r5.A00 = r0
            java.lang.String r0 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r6.AiF(r0, r1, r5)
            if (r4 != r3) goto L47
            return r3
        L40:
            java.lang.Object r6 = r5.A01
            X.EJD r6 = (X.EJD) r6
            X.Hwg.A00(r4)
        L47:
            r1 = r4
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L2a
            r5.A01 = r1
            r5.A00 = r2
            java.lang.String r0 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r0 = X.EJC.A00(r6, r0, r5)
            if (r0 != r3) goto L2a
            return r3
        L5d:
            X.EbG r5 = new X.EbG
            r5.<init>(r7, r8, r3)
            goto L17
        L63:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.A00(X.EJD, androidx.room.TriggerBasedInvalidationTracker, X.HtJ):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006f -> B:13:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.EJD r10, androidx.room.TriggerBasedInvalidationTracker r11, X.HtJ r12, int r13) {
        /*
            r5 = 1
            boolean r0 = r12 instanceof X.C8iW
            if (r0 == 0) goto L72
            r4 = r12
            X.8iW r4 = (X.C8iW) r4
            int r0 = r4.$t
            if (r0 != r5) goto L72
            int r2 = r4.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r4.A02 = r2
        L17:
            java.lang.Object r1 = r4.A06
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r4.A02
            if (r0 == 0) goto L3b
            if (r0 != r5) goto L78
            int r9 = r4.A01
            int r3 = r4.A00
            java.lang.Object r8 = r4.A05
            java.lang.String[] r8 = (java.lang.String[]) r8
            java.lang.Object r7 = r4.A04
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r10 = r4.A03
            X.EJD r10 = (X.EJD) r10
            X.Hwg.A00(r1)
        L34:
            int r3 = r3 + 1
            if (r3 < r9) goto L46
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L3b:
            X.Hwg.A00(r1)
            java.lang.String[] r0 = r11.A0A
            r7 = r0[r13]
            java.lang.String[] r8 = androidx.room.TriggerBasedInvalidationTracker.A0B
            r3 = 0
            r9 = 3
        L46:
            r2 = r8[r3]
            java.lang.String r0 = "room_table_modification_trigger_"
            java.lang.StringBuilder r1 = X.C3cI.A0x(r0, r7)
            r0 = 95
            r1.append(r0)
            java.lang.String r2 = X.AnonymousClass001.A0v(r2, r1)
            java.lang.String r1 = "DROP TRIGGER IF EXISTS `"
            r0 = 96
            java.lang.String r0 = X.FGI.A0N(r1, r2, r0)
            r4.A03 = r10
            r4.A04 = r7
            r4.A05 = r8
            r4.A00 = r3
            r4.A01 = r9
            r4.A02 = r5
            java.lang.Object r0 = X.EJC.A00(r10, r0, r4)
            if (r0 != r6) goto L34
            return r6
        L72:
            X.8iW r4 = new X.8iW
            r4.<init>(r11, r12, r5)
            goto L17
        L78:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.A02(X.EJD, androidx.room.TriggerBasedInvalidationTracker, X.HtJ, int):java.lang.Object");
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00c5: INVOKE (r8 I:X.EIU) VIRTUAL call: X.EIU.A00():void A[MD:():void (m)] (LINE:197), block:B:58:0x00c5 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(androidx.room.TriggerBasedInvalidationTracker r10, X.HtJ r11) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.A03(androidx.room.TriggerBasedInvalidationTracker, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.HtJ<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            r3 = 2
            boolean r0 = r8 instanceof X.C6858EbG
            if (r0 == 0) goto L27
            r6 = r8
            X.EbG r6 = (X.C6858EbG) r6
            int r0 = r6.$t
            if (r0 != r3) goto L27
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r1 = r6.A02
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L39
            if (r0 != r4) goto L31
            java.lang.Object r2 = r6.A01
            X.EIU r2 = (X.EIU) r2
            goto L2d
        L27:
            X.EbG r6 = new X.EbG
            r6.<init>(r7, r8, r3)
            goto L17
        L2d:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L6a
            goto L62
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L39:
            X.Hwg.A00(r1)
            X.EIN r3 = r7.A03
            X.EIU r2 = r3.closeBarrier
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A01     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L4a
            goto L66
        L4a:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A02     // Catch: java.lang.Throwable -> L6f
            r0.incrementAndGet()     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r2)
            r0 = 0
            X.EZB r1 = new X.EZB     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L6a
            r6.A01 = r2     // Catch: java.lang.Throwable -> L6a
            r6.A00 = r4     // Catch: java.lang.Throwable -> L6a
            r0 = 0
            java.lang.Object r0 = r3.useConnection(r0, r1, r6)     // Catch: java.lang.Throwable -> L6a
            if (r0 != r5) goto L62
            return r5
        L62:
            r2.A00()
            goto L67
        L66:
            monitor-exit(r2)
        L67:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L6a:
            r1 = move-exception
            r2.A00()
            throw r1
        L6f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.A04(X.HtJ):java.lang.Object");
    }

    public final HxE<String[], int[]> A05(String[] strArr) {
        AIY aiy = new AIY();
        for (String str : strArr) {
            Set<String> set = this.A04.get(str.toLowerCase(Locale.ROOT));
            if (set != null) {
                aiy.addAll(set);
            } else {
                aiy.add(str);
            }
        }
        String[] strArrA1b = BV5.A1b(AIX.A00(aiy), 0);
        int length = strArrA1b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrA1b[i];
            Integer num = this.A07.get(str2.toLowerCase(Locale.ROOT));
            if (num == null) {
                throw C60Q.A0U("There is no table with name ", str2);
            }
            iArr[i] = num.intValue();
        }
        return C3cG.A0r(strArrA1b, iArr);
    }

    public final void A06(Function0<Unit> function0, Function0<Unit> function02) {
        C7384Etj.A0Y(function0, 0);
        C7384Etj.A0Y(function02, 1);
        if (this.A08.compareAndSet(false, true)) {
            function0.invoke();
            C3UX coroutineScope = this.A03.getCoroutineScope();
            GAo.A02(C79.A00, new C1282AgS("Room Invalidation Tracker Refresh"), new EZD((Object) this, (TriggerBasedInvalidationTracker) function02, (Function0<Unit>) null, (HtJ<? super EZD>) 2), coroutineScope);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c8 -> B:12:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.EJD r12, androidx.room.TriggerBasedInvalidationTracker r13, X.HtJ r14, int r15) {
        /*
            boolean r0 = r14 instanceof X.EJ7
            if (r0 == 0) goto Lce
            r3 = r14
            X.EJ7 r3 = (X.EJ7) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lce
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r8 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r2 = 2
            r5 = 1
            if (r0 == 0) goto L3c
            if (r0 == r5) goto L54
            if (r0 != r2) goto Ld5
            int r7 = r3.I$2
            int r6 = r3.I$1
            int r15 = r3.I$0
            java.lang.Object r5 = r3.L$2
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.lang.Object r1 = r3.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r12 = r3.L$0
            X.EJD r12 = (X.EJD) r12
            X.Hwg.A00(r8)
        L35:
            int r6 = r6 + 1
            if (r6 < r7) goto L65
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L3c:
            X.Hwg.A00(r8)
            java.lang.String r1 = "INSERT OR IGNORE INTO room_table_modification_log VALUES("
            java.lang.String r0 = ", 0)"
            java.lang.String r0 = X.FGI.A0I(r1, r15, r0)
            r3.L$0 = r12
            r3.I$0 = r15
            r3.label = r5
            java.lang.Object r0 = X.EJC.A00(r12, r0, r3)
            if (r0 != r4) goto L5d
            return r4
        L54:
            int r15 = r3.I$0
            java.lang.Object r12 = r3.L$0
            X.EJD r12 = (X.EJD) r12
            X.Hwg.A00(r8)
        L5d:
            java.lang.String[] r0 = r13.A0A
            r1 = r0[r15]
            java.lang.String[] r5 = androidx.room.TriggerBasedInvalidationTracker.A0B
            r7 = 3
            r6 = 0
        L65:
            r10 = r5[r6]
            boolean r0 = r13.A05
            if (r0 == 0) goto Lcb
            java.lang.String r11 = "TEMP"
        L6d:
            java.lang.String r0 = "room_table_modification_trigger_"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            r8.append(r1)
            r0 = 95
            r8.append(r0)
            r8.append(r10)
            java.lang.String r9 = r8.toString()
            java.lang.String r0 = "CREATE "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            r8.append(r11)
            java.lang.String r0 = " TRIGGER IF NOT EXISTS `"
            r8.append(r0)
            r8.append(r9)
            java.lang.String r0 = "` AFTER "
            r8.append(r0)
            r8.append(r10)
            java.lang.String r0 = " ON `"
            r8.append(r0)
            r8.append(r1)
            java.lang.String r0 = "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "
            r8.append(r0)
            r8.append(r15)
            java.lang.String r0 = " AND invalidated = 0; END"
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r3.L$0 = r12
            r3.L$1 = r1
            r3.L$2 = r5
            r3.I$0 = r15
            r3.I$1 = r6
            r3.I$2 = r7
            r3.label = r2
            java.lang.Object r0 = X.EJC.A00(r12, r0, r3)
            if (r0 != r4) goto L35
            return r4
        Lcb:
            java.lang.String r11 = ""
            goto L6d
        Lce:
            X.EJ7 r3 = new X.EJ7
            r3.<init>(r13, r14)
            goto L12
        Ld5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.A01(X.EJD, androidx.room.TriggerBasedInvalidationTracker, X.HtJ, int):java.lang.Object");
    }
}
