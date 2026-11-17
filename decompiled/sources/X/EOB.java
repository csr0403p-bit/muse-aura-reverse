package X;

import android.content.Context;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class EOB {
    public static final InterfaceExecutorServiceC3065Bwn A01;
    public static final Map<String, EP0> A02;
    public static final Set<EOW> A03;
    public static final AtomicInteger A04;
    public static final EOB A05 = new EOB();
    public static final F08 A00 = new C5242De7(65568);

    static {
        Set<EOW> setA03 = AbstractC5245DeA.A03(3);
        C7384Etj.A0U(setA03);
        A03 = setA03;
        InterfaceExecutorServiceC3065Bwn interfaceExecutorServiceC3065BwnA00 = MoreExecutors.A00(Executors.newCachedThreadPool());
        C7384Etj.A0U(interfaceExecutorServiceC3065BwnA00);
        A01 = interfaceExecutorServiceC3065BwnA00;
        A04 = BV4.A13(0);
        A02 = C3cH.A0n("barcelona", EP0.A0F, C3cG.A0r(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK, EP0.A07), C3cG.A0r(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM, EP0.A0B), C3cG.A0r("messenger", EP0.A0C));
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Ljava/util/Set<+LX/EP0;>;LX/EOH;Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture<LX/EOM;>; */
    /* JADX WARN: Type inference failed for: r0v6, types: [F, X.F5N] */
    public final RunnableC3444CNp A01(Context context, String str, Set set, EOH eoh) {
        EOW next;
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A11(set, eoh, str, 1);
        EZ4 ez4 = new EZ4(2);
        int iIncrementAndGet = A04.incrementAndGet();
        BV7.A16().A01(100335618, iIncrementAndGet, str);
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            EP0 ep0 = (EP0) it.next();
            Iterator<EOW> it2 = A03.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next.ACR() == ep0) {
                    break;
                }
            }
            EOW eow = next;
            if (eow == null) {
                arrayListA0h.add(new EOL(AnonymousClass007.A0a("No target app config registered for ", ep0), ep0, ENz.A0E));
            } else {
                ListenableFuture listenableFutureSubmit = A01.submit(new EOG(context, str, ez4, eow, ep0, eoh, iIncrementAndGet));
                C7384Etj.A0U(listenableFutureSubmit);
                arrayListA0h2.add(listenableFutureSubmit);
            }
        }
        CPa cPa = CPg.A03;
        CPr cPr = new CPr(ImmutableList.copyOf((Iterable) arrayListA0h2), true);
        ?? f5n = new F5N(arrayListA0h, 5);
        EnumC3451CNw enumC3451CNw = EnumC3451CNw.A01;
        RunnableC3444CNp runnableC3444CNp = new RunnableC3444CNp();
        runnableC3444CNp.A00 = cPr;
        runnableC3444CNp.A01 = f5n;
        cPr.addListener(runnableC3444CNp, enumC3451CNw);
        CQD.A01(new F54(iIncrementAndGet, 0), runnableC3444CNp, enumC3451CNw);
        return runnableC3444CNp;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Ljava/util/Set<+LX/EP0;>;LX/EOH;Ljava/lang/String;LX/HtJ<-LX/EOM;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(android.content.Context r8, java.lang.String r9, java.util.Set r10, X.HtJ r11, X.EOH r12) {
        /*
            r7 = this;
            r3 = 12
            boolean r0 = r11 instanceof X.C8906FtO
            if (r0 == 0) goto L5a
            r6 = r11
            X.FtO r6 = (X.C8906FtO) r6
            int r0 = r6.$t
            if (r0 != r3) goto L5a
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r6.A00 = r2
        L18:
            java.lang.Object r1 = r6.A06
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 != r4) goto L60
            X.Hwg.A00(r1)
        L26:
            return r1
        L27:
            X.Hwg.A00(r1)
            X.CNp r3 = r7.A01(r8, r9, r10, r12)
            r0 = 0
            r6.A01 = r0
            r6.A02 = r0
            r6.A03 = r0
            r6.A04 = r0
            r6.A05 = r3
            r6.A00 = r4
            X.GBL r2 = X.C7Bm.A04(r6)
            X.F55 r1 = new X.F55
            r1.<init>(r2, r4)
            X.CNw r0 = X.EnumC3451CNw.A01
            X.CQD.A01(r1, r3, r0)
            r1 = 21
            X.EQe r0 = new X.EQe
            r0.<init>(r3, r1)
            r2.AO2(r0)
            java.lang.Object r1 = r2.A0F()
            if (r1 != r5) goto L26
            return r5
        L5a:
            X.FtO r6 = new X.FtO
            r6.<init>(r7, r11, r3)
            goto L18
        L60:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOB.A02(android.content.Context, java.lang.String, java.util.Set, X.HtJ, X.EOH):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:0|(1:3)(1:10)|4|(3:6|(2:9|7)|204)|11|(1:21)(1:15)|16|(1:20)|19|201|22|(16:24|(2:25|(2:27|(1:207)(4:29|(1:31)|32|(1:205)(1:208)))(2:206|37))|34|(1:48)(2:(3:40|(3:42|(1:44)|48)(1:45)|(0)(0))|47)|119|(2:121|(1:123))(1:132)|(3:(1:126)(1:131)|127|(2:129|130))|133|(1:135)|(1:150)(1:139)|(1:(4:151|197|152|(2:156|(1:158)))(2:148|149))|(8:170|(1:179)(1:174)|175|(2:178|176)|210|180|(5:183|(1:185)(1:190)|(2:187|212)(2:189|213)|188|181)|211)(3:166|(2:169|167)|209)|191|(1:193)|194|195)|49|(1:53)(1:52)|54|203|55|(1:57)(6:62|199|63|64|(3:67|(3:215|69|70)(3:71|(2:73|(1:217)(3:75|(3:77|(2:78|(2:80|(1:221)(1:223))(2:222|83))|82)(5:84|(1:86)|89|(1:91)|(2:96|220)(2:95|219))|(1:218)(3:89|(0)|(3:93|96|220)(0))))(1:216)|88)|65)|214)|58|(1:60)|61|119|(0)(0)|(0)|133|(0)|(2:137|150)(0)|(6:141|(1:144)|151|197|152|(3:154|156|(0)))|(3:160|170|(8:172|179|175|(1:176)|210|180|(1:181)|211)(0))(0)|191|(0)|194|195|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022f, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
    
        r5 = new X.EOK(r8, new X.EOL(r8.message, r47, r8.code));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0243, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0244, code lost:
    
        r7 = X.ENz.A03;
        r5 = r8.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024a, code lost:
    
        if (r5 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x024c, code lost:
    
        r5 = "App not installed";
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x024e, code lost:
    
        r5 = new X.EOK(r8, new X.EOL(r5, r47, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0259, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x025a, code lost:
    
        r7 = X.ENz.A0F;
        r5 = r8.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0260, code lost:
    
        if (r5 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0268, code lost:
    
        r5 = "Unknown error";
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x026a, code lost:
    
        r5 = new X.EOK(r8, new X.EOL(r5, r47, r7));
     */
    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EP0;Ljava/util/Set<+LX/EP1;>;Ljava/lang/String;LX/EOW;Ljava/lang/String;ZLkotlin/jvm/functions/Function0<Ljava/lang/Boolean;>;ILjava/lang/Integer;)LX/EOe; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0381 A[LOOP:3: B:176:0x037b->B:178:0x0381, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f1 A[Catch: FXAccessException -> 0x022f, PackageNameNotFoundException -> 0x0243, Exception -> 0x0259, TryCatch #5 {PackageNameNotFoundException -> 0x0243, FXAccessException -> 0x022f, Exception -> 0x0259, blocks: (B:55:0x0137, B:57:0x014c, B:58:0x014e, B:60:0x0154, B:61:0x0164, B:62:0x016b, B:63:0x0175, B:64:0x0179, B:65:0x0182, B:67:0x0188, B:69:0x0190, B:70:0x0197, B:71:0x0198, B:73:0x01a2, B:75:0x01ac, B:77:0x01b0, B:78:0x01b4, B:80:0x01ba, B:82:0x01d2, B:89:0x01ed, B:91:0x01f1, B:93:0x01f9, B:96:0x0202, B:84:0x01d8, B:86:0x01e2, B:98:0x021c), top: B:203:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0202 A[Catch: FXAccessException -> 0x022f, PackageNameNotFoundException -> 0x0243, Exception -> 0x0259, TryCatch #5 {PackageNameNotFoundException -> 0x0243, FXAccessException -> 0x022f, Exception -> 0x0259, blocks: (B:55:0x0137, B:57:0x014c, B:58:0x014e, B:60:0x0154, B:61:0x0164, B:62:0x016b, B:63:0x0175, B:64:0x0179, B:65:0x0182, B:67:0x0188, B:69:0x0190, B:70:0x0197, B:71:0x0198, B:73:0x01a2, B:75:0x01ac, B:77:0x01b0, B:78:0x01b4, B:80:0x01ba, B:82:0x01d2, B:89:0x01ed, B:91:0x01f1, B:93:0x01f9, B:96:0x0202, B:84:0x01d8, B:86:0x01e2, B:98:0x021c), top: B:203:0x0137 }] */
    /* JADX WARN: Type inference failed for: r11v12, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r11v7, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC6668EOe A00(android.content.Context r39, java.lang.Integer r40, java.lang.String r41, java.lang.String r42, java.util.Set r43, kotlin.jvm.functions.Function0 r44, X.EOB r45, X.EOW r46, X.EP0 r47, int r48) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOB.A00(android.content.Context, java.lang.Integer, java.lang.String, java.lang.String, java.util.Set, kotlin.jvm.functions.Function0, X.EOB, X.EOW, X.EP0, int):X.EOe");
    }
}
