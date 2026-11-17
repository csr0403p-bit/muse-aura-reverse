package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.RemoteException;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import libraries.access.src.main.base.contentprovider.transformers.TransformerException;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class EPC {
    public final C7381Etf A00;
    public final AtomicInteger A01;
    public final EPE A02;
    public final EQL A03;
    public final AbstractC6670EOh A04;
    public final EQM A05;

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EPL;LX/EPM;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<LX/EPY;>; */
    public final ArrayList A09(Context context, String str, String str2, EPM epm, EPL epl) throws PackageManager.NameNotFoundException {
        ArrayList arrayListA0y = C3cI.A0y(context);
        List<EQ9> list = EPT.A00;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<EQ9> it = list.iterator();
        while (it.hasNext()) {
            EPs.A00(epl, arrayListA0h, it);
        }
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            A05(context, str, str2, arrayListA0y, (EPs) it2.next(), epm, EPi.A02);
        }
        return arrayListA0y;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EPL;LX/EPM;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<LX/EPY;>; */
    public final ArrayList A0A(Context context, String str, String str2, EPM epm, EPL epl) throws PackageManager.NameNotFoundException {
        ArrayList arrayListA0y = C3cI.A0y(context);
        List<EQ9> list = EPT.A01;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<EQ9> it = list.iterator();
        while (it.hasNext()) {
            EPs.A00(epl, arrayListA0h, it);
        }
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            A05(context, str, str2, arrayListA0y, (EPs) it2.next(), epm, EPi.A03);
        }
        return arrayListA0y;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EPL;LX/EPM;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<LX/EPY;>; */
    public final ArrayList A0B(Context context, String str, String str2, EPM epm, EPL epl) throws PackageManager.NameNotFoundException {
        ArrayList arrayListA0y = C3cI.A0y(context);
        List<EQ9> list = EPT.A02;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<EQ9> it = list.iterator();
        while (it.hasNext()) {
            EPs.A00(epl, arrayListA0h, it);
        }
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            A05(context, str, str2, arrayListA0y, (EPs) it2.next(), epm, EPi.A04);
        }
        return arrayListA0y;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EPL;LX/EPM;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<LX/EPY;>; */
    public final ArrayList A0C(Context context, String str, String str2, EPM epm, EPL epl) throws PackageManager.NameNotFoundException {
        ArrayList arrayListA0y = C3cI.A0y(context);
        List<EQ9> list = EPT.A03;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<EQ9> it = list.iterator();
        while (it.hasNext()) {
            EPs.A00(epl, arrayListA0h, it);
        }
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            A05(context, str, str2, arrayListA0y, (EPs) it2.next(), epm, EPi.A05);
        }
        return arrayListA0y;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EPL;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<LX/EPY;>; */
    public final ArrayList A0D(Context context, String str, String str2, EPL epl) throws Throwable {
        C7384Etj.A0Y(context, 0);
        List listSingletonList = Collections.singletonList(epl);
        ArrayList arrayListA0h = C3cG.A0h();
        HashSet hashSetA0x = BV4.A0x(listSingletonList);
        List<EQ9> list = EPO.A02;
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (EQ9 eq9 : list) {
            if (hashSetA0x.contains(eq9.A04)) {
                arrayListA0h2.add(eq9);
            }
        }
        Iterator it = arrayListA0h2.iterator();
        while (it.hasNext()) {
            A04(context, str, str2, arrayListA0h, (EPs) it.next());
        }
        return arrayListA0h;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Ljava/util/Set<+LX/EPL;>;Ljava/lang/String;)Ljava/util/List<LX/EPY;>; */
    public final ArrayList A0E(Context context, String str, Set set) {
        AnonymousClass003.A0u(context, set);
        String strA0j = BV5.A0j();
        ArrayList arrayListA0h = C3cG.A0h();
        List<EQ9> list = EPO.A02;
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (EQ9 eq9 : list) {
            if (set.contains(eq9.A04)) {
                arrayListA0h2.add(eq9);
            }
        }
        Iterator it = arrayListA0h2.iterator();
        while (it.hasNext()) {
            A04(context, strA0j, str, arrayListA0h, (EPs) it.next());
        }
        return arrayListA0h;
    }

    public EPC(EPP epp) {
        EQM eqm = epp.A04;
        EPE epe = epp.A01;
        EQL eql = epp.A02;
        AbstractC6670EOh abstractC6670EOh = epp.A03;
        this.A05 = eqm;
        this.A02 = epe;
        this.A03 = eql;
        this.A04 = abstractC6670EOh;
        this.A01 = BV4.A13((int) (Math.random() * 2.147483647E9d));
        this.A00 = epp.A00;
    }

    public static final ContentProviderClient A00(Context context, Enum r21, Integer num, String str, String str2, String str3, String str4, EPs ePs, EPC epc) {
        boolean z = r21 instanceof EPi;
        Integer numA0r = z ? C9tI.A0r(str3) : null;
        if (numA0r != null) {
            try {
                epc.A04.logClientAcquireQplStart(numA0r.intValue());
            } catch (SecurityException e) {
                if (z) {
                    BV4.A1M(AbstractC6673EOm.A01(ePs.A04), ((EPi) r21).name(), EPf.PROVIDER_NOT_TRUSTED, epc.A04, new String[]{"resolver_name", A03(num), HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, e.getMessage(), "caller_name", str2, "provider_url", ePs.A00.toString(), "provider_version", str, "caller_package_name", context.getPackageName(), "instance_key", str3, "waterfall_id", str4});
                }
                return null;
            }
        }
        ContentProviderClient contentProviderClientA00 = epc.A00.A00(context, ePs.A00);
        if (numA0r != null) {
            epc.A04.logClientAcquireQplEnd(numA0r.intValue());
        }
        return contentProviderClientA00;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007d A[Catch: Exception -> 0x00a3, TRY_ENTER, TryCatch #5 {Exception -> 0x00a3, blocks: (B:21:0x0053, B:25:0x0062, B:27:0x006d, B:29:0x0071, B:31:0x0078, B:35:0x007d, B:37:0x0081), top: B:62:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A01(android.content.Context r17, java.lang.Enum r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21, X.EPs r22, X.EPC r23) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r6 = r18
            java.lang.String r15 = "waterfall_id"
            java.lang.String r13 = "instance_key"
            java.lang.String r9 = "resolver_name"
            r2 = 0
            r5 = 0
            r14 = r20
            r16 = r21
            r3 = r22
            r4 = r23
            android.content.pm.PackageManager r1 = r17.getPackageManager()     // Catch: java.lang.Exception -> Lac
            if (r1 == 0) goto La5
            java.lang.String r0 = r3.A02     // Catch: java.lang.Exception -> Lac
            android.content.pm.PackageInfo r2 = r1.getPackageInfo(r0, r2)     // Catch: java.lang.Exception -> Lac
            if (r2 == 0) goto L24
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo     // Catch: java.lang.Exception -> Lac
            goto L25
        L24:
            r0 = r5
        L25:
            if (r0 == 0) goto L7d
            java.lang.String r0 = r2.versionName     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L7d
            int r0 = r0.length()     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L7d
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo     // Catch: java.lang.Exception -> L7b
            X.C7384Etj.A0X(r0)     // Catch: java.lang.Exception -> L7b
            boolean r0 = r0.enabled     // Catch: java.lang.Exception -> L7b
            if (r0 != 0) goto L62
            boolean r0 = r6 instanceof X.EPi     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto Ld8
            X.EOh r8 = r4.A04     // Catch: java.lang.Exception -> L7b
            X.EPL r0 = r3.A04     // Catch: java.lang.Exception -> L7b
            java.lang.String r7 = X.AbstractC6673EOm.A01(r0)     // Catch: java.lang.Exception -> L7b
            r0 = r6
            X.EPi r0 = (X.EPi) r0     // Catch: java.lang.Exception -> L7b
            java.lang.String r2 = r0.name()     // Catch: java.lang.Exception -> L7b
            X.EPf r1 = X.EPf.APP_DISABLED     // Catch: java.lang.Exception -> L60
            java.lang.String r12 = A03(r19)     // Catch: java.lang.Exception -> Lae
            r11 = r9
            java.lang.String[] r0 = new java.lang.String[]{r11, r12, r13, r14, r15, r16}     // Catch: java.lang.Exception -> La3
            java.util.Map r0 = r8.constructDebugTestData(r0)     // Catch: java.lang.Exception -> La3
            r8.logAccountItemFetchEmpty(r7, r2, r1, r0)     // Catch: java.lang.Exception -> La3
            return r5
        L60:
            r7 = move-exception
            goto Laf
        L62:
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo     // Catch: java.lang.Exception -> La3
            X.C7384Etj.A0X(r0)     // Catch: java.lang.Exception -> La3
            int r0 = r0.flags     // Catch: java.lang.Exception -> La3
            r0 = r0 & 2
            if (r0 == 0) goto L78
            java.lang.String r1 = r2.versionName     // Catch: java.lang.Exception -> La3
            if (r1 == 0) goto L78
            java.lang.String r0 = "[debug]"
            java.lang.String r5 = X.FGI.A0M(r1, r0)     // Catch: java.lang.Exception -> La3
            return r5
        L78:
            java.lang.String r5 = r2.versionName     // Catch: java.lang.Exception -> La3
            return r5
        L7b:
            r7 = move-exception
            goto Laf
        L7d:
            boolean r0 = r6 instanceof X.EPi     // Catch: java.lang.Exception -> La3
            if (r0 == 0) goto Ld8
            X.EOh r8 = r4.A04     // Catch: java.lang.Exception -> La3
            X.EPL r0 = r3.A04     // Catch: java.lang.Exception -> La3
            java.lang.String r7 = X.AbstractC6673EOm.A01(r0)     // Catch: java.lang.Exception -> La3
            r0 = r6
            X.EPi r0 = (X.EPi) r0     // Catch: java.lang.Exception -> La3
            java.lang.String r2 = r0.name()     // Catch: java.lang.Exception -> La3
            X.EPf r1 = X.EPf.APP_INFO_NOT_FOUND     // Catch: java.lang.Exception -> La3
            java.lang.String r12 = A03(r19)     // Catch: java.lang.Exception -> La3
            r11 = r9
            java.lang.String[] r0 = new java.lang.String[]{r11, r12, r13, r14, r15, r16}     // Catch: java.lang.Exception -> Laa
            java.util.Map r0 = r8.constructDebugTestData(r0)     // Catch: java.lang.Exception -> Laa
            r8.logAccountItemFetchEmpty(r7, r2, r1, r0)     // Catch: java.lang.Exception -> Laa
            return r5
        La3:
            r7 = move-exception
            goto Laf
        La5:
            java.lang.IllegalStateException r0 = X.BV4.A0U()     // Catch: java.lang.Exception -> Laa
            throw r0     // Catch: java.lang.Exception -> Laa
        Laa:
            r7 = move-exception
            goto Laf
        Lac:
            r7 = move-exception
            goto Laf
        Lae:
            r7 = move-exception
        Laf:
            boolean r0 = r6 instanceof X.EPi
            if (r0 == 0) goto Ld8
            X.EOh r4 = r4.A04
            X.EPL r0 = r3.A04
            java.lang.String r3 = X.AbstractC6673EOm.A01(r0)
            X.EPi r6 = (X.EPi) r6
            java.lang.String r2 = r6.name()
            X.EPf r1 = X.EPf.APP_NOT_INSTALLED
            java.lang.String r10 = A03(r19)
            java.lang.String r12 = r7.getMessage()
            java.lang.String r11 = "failure_reason"
            java.lang.String[] r0 = new java.lang.String[]{r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.Map r0 = r4.constructDebugTestData(r0)
            r4.logAccountItemFetchEmpty(r3, r2, r1, r0)
        Ld8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EPC.A01(android.content.Context, java.lang.Enum, java.lang.Integer, java.lang.String, java.lang.String, X.EPs, X.EPC):java.lang.String");
    }

    public static final String A02(Context context, EPs ePs) throws PackageManager.NameNotFoundException {
        String authority = ePs.A00.getAuthority();
        if (authority == null) {
            return "uri_has_no_authority";
        }
        try {
            if (context.getPackageManager().resolveContentProvider(authority, 0) != null) {
                return FGI.A0M("acquire_client_returned_null_for: ", authority);
            }
            try {
                context.getPackageManager().getPackageInfo(ePs.A02, 0);
                return "provider_not_registered_but_app_installed";
            } catch (Exception unused) {
                return "app_uninstalled_after_availability_check";
            }
        } catch (Exception e) {
            return FGI.A0M("resolve_provider_exception: ", e.getMessage());
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EPs;Ljava/util/List<LX/EPY;>;Ljava/lang/String;Ljava/lang/String;)V */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(android.content.Context r39, java.lang.String r40, java.lang.String r41, java.util.List r42, X.EPs r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EPC.A04(android.content.Context, java.lang.String, java.lang.String, java.util.List, X.EPs):void");
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EPs;Ljava/util/List<LX/EPY;>;LX/EPM;LX/EPi;Ljava/lang/String;Ljava/lang/String;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v6, types: [X.EPM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A05(android.content.Context r47, java.lang.String r48, java.lang.String r49, java.util.List r50, X.EPs r51, X.EPM r52, X.EPi r53) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EPC.A05(android.content.Context, java.lang.String, java.lang.String, java.util.List, X.EPs, X.EPM, X.EPi):void");
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Ljava/util/List<LX/EPL;>;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<LX/EPY;>; */
    public final ArrayList A07(Context context, String str, String str2, List list) throws PackageManager.NameNotFoundException {
        boolean zA1b = AnonymousClass004.A1b(context, list);
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : list) {
            C7384Etj.A0Y(obj, zA1b ? 1 : 0);
            List<EQ9> list2 = EPO.A00;
            ArrayList<EPs> arrayList = new ArrayList();
            for (EQ9 eq9 : list2) {
                if (obj == eq9.A04) {
                    arrayList.add(eq9);
                }
            }
            for (EPs ePs : arrayList) {
                int iIncrementAndGet = AbstractC6680EPc.A00.incrementAndGet();
                String strValueOf = String.valueOf(iIncrementAndGet);
                AbstractC6670EOh abstractC6670EOh = this.A04;
                Integer numA00 = EPR.A00(EPR.A01(ePs.A04));
                abstractC6670EOh.logFetchQplStart(iIncrementAndGet, AbstractC6673EOm.A00(numA00), "ALL_ACCOUNTS", "LEGACY_PROVIDER", str2);
                EPi ePi = EPi.A03;
                Integer num = C79.A00;
                String strA01 = A01(context, ePi, num, strValueOf, str, ePs, this);
                if (strA01 != null) {
                    String strA00 = AbstractC6673EOm.A00(numA00);
                    Uri uri = ePs.A00;
                    abstractC6670EOh.logAccountItemFetchStart(strA00, "ALL_ACCOUNTS", abstractC6670EOh.constructDebugTestData("resolver_name", "LEGACY_PROVIDER", "caller_name", str2, "provider_url", uri.toString(), "provider_version", strA01, "caller_package_name", context.getPackageName(), "instance_key", strValueOf, "waterfall_id", str));
                    ContentProviderClient contentProviderClientA00 = null;
                    try {
                        try {
                            try {
                                try {
                                    contentProviderClientA00 = A00(context, ePi, num, strA01, str2, strValueOf, str, ePs, this);
                                    if (contentProviderClientA00 != null) {
                                        ArrayList arrayListA02 = this.A02.A02(contentProviderClientA00, str, strValueOf, ePs, ePi, abstractC6670EOh);
                                        A06(num, strValueOf, strA01, str2, str, arrayListA02, ePs, ePi);
                                        arrayListA0h.addAll(arrayListA02);
                                    } else {
                                        abstractC6670EOh.logAccountItemFetchFailure(strA00, "ALL_ACCOUNTS", EPf.NO_CONTENT_PROVIDER_CLIENT_ERROR, abstractC6670EOh.constructDebugTestData("resolver_name", "LEGACY_PROVIDER", "caller_name", str2, "provider_url", uri.toString(), "provider_version", strA01, "instance_key", strValueOf, "waterfall_id", str, "cp_null_reason", A02(context, ePs)));
                                    }
                                } catch (TransformerException e) {
                                    abstractC6670EOh.logAccountItemFetchFailure(strA00, "ALL_ACCOUNTS", EPf.TRANSFORMER_ERROR, abstractC6670EOh.constructDebugTestData("resolver_name", "LEGACY_PROVIDER", HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, e.getMessage(), "caller_name", str2, "provider_url", uri.toString(), "provider_version", strA01, "instance_key", strValueOf, "waterfall_id", str));
                                }
                            } catch (Exception e2) {
                                abstractC6670EOh.logAccountItemFetchFailure(strA00, "ALL_ACCOUNTS", EPf.GENERAL_EXCEPTION, abstractC6670EOh.constructDebugTestData("resolver_name", "LEGACY_PROVIDER", HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, e2.getMessage(), "caller_name", str2, "provider_url", uri.toString(), "provider_version", strA01, "instance_key", strValueOf, "waterfall_id", str));
                            }
                        } catch (RemoteException e3) {
                            abstractC6670EOh.logAccountItemFetchFailure(strA00, "ALL_ACCOUNTS", EPf.REMOTE_EXCEPTION, abstractC6670EOh.constructDebugTestData("resolver_name", "LEGACY_PROVIDER", HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, e3.getMessage(), "caller_name", str2, "provider_url", uri.toString(), "provider_version", strA01, "instance_key", strValueOf, "waterfall_id", str));
                        } catch (JSONException e4) {
                            abstractC6670EOh.logAccountItemFetchFailure(strA00, "ALL_ACCOUNTS", EPf.JSON_EXCEPTION, abstractC6670EOh.constructDebugTestData("resolver_name", "LEGACY_PROVIDER", HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, e4.getMessage(), "caller_name", str2, "provider_url", uri.toString(), "provider_version", strA01, "instance_key", strValueOf, "waterfall_id", str));
                        }
                        if (contentProviderClientA00 != null) {
                            contentProviderClientA00.release();
                        }
                    } catch (Throwable th) {
                        if (contentProviderClientA00 != null) {
                            contentProviderClientA00.release();
                        }
                        throw th;
                    }
                }
            }
        }
        return arrayListA0h;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Ljava/util/List<+LX/EPL;>;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<LX/EPY;>; */
    public final ArrayList A08(Context context, String str, String str2, List list) throws PackageManager.NameNotFoundException {
        boolean zA1b = AnonymousClass004.A1b(context, list);
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : list) {
            C7384Etj.A0Y(obj, zA1b ? 1 : 0);
            List<EQ9> list2 = EPO.A03;
            ArrayList<EPs> arrayListA0h2 = C3cG.A0h();
            Iterator<EQ9> it = list2.iterator();
            while (it.hasNext()) {
                EPs.A00(obj, arrayListA0h2, it);
            }
            for (EPs ePs : arrayListA0h2) {
                int iIncrementAndGet = AbstractC6680EPc.A00.incrementAndGet();
                String strValueOf = String.valueOf(iIncrementAndGet);
                AbstractC6670EOh abstractC6670EOh = this.A04;
                Integer numA00 = EPR.A00(EPR.A01(ePs.A04));
                abstractC6670EOh.logFetchQplStart(iIncrementAndGet, AbstractC6673EOm.A00(numA00), "SAVED_ACCOUNTS", "LEGACY_PROVIDER", str2);
                EPi ePi = EPi.A05;
                Integer num = C79.A00;
                String strA01 = A01(context, ePi, num, strValueOf, str, ePs, this);
                if (strA01 != null) {
                    String strA00 = AbstractC6673EOm.A00(numA00);
                    Uri uri = ePs.A00;
                    abstractC6670EOh.logAccountItemFetchStart(strA00, "SAVED_ACCOUNTS", abstractC6670EOh.constructDebugTestData("resolver_name", "LEGACY_PROVIDER", "caller_name", str2, "provider_url", uri.toString(), "provider_version", strA01, "caller_package_name", context.getPackageName(), "instance_key", strValueOf, "waterfall_id", str));
                    ContentProviderClient contentProviderClientA00 = null;
                    try {
                        try {
                            try {
                                contentProviderClientA00 = A00(context, ePi, num, strA01, str2, strValueOf, str, ePs, this);
                                if (contentProviderClientA00 != null) {
                                    ArrayList arrayListA02 = this.A02.A02(contentProviderClientA00, str, strValueOf, ePs, ePi, abstractC6670EOh);
                                    A06(num, strValueOf, strA01, str2, str, arrayListA02, ePs, ePi);
                                    arrayListA0h.addAll(arrayListA02);
                                } else {
                                    BV4.A1M(strA00, "SAVED_ACCOUNTS", EPf.NO_CONTENT_PROVIDER_CLIENT_ERROR, abstractC6670EOh, new String[]{"resolver_name", "LEGACY_PROVIDER", "caller_name", str2, "provider_url", uri.toString(), "provider_version", strA01, "instance_key", strValueOf, "waterfall_id", str, "cp_null_reason", A02(context, ePs)});
                                }
                            } catch (JSONException e) {
                                BV4.A1M(strA00, "SAVED_ACCOUNTS", EPf.JSON_EXCEPTION, abstractC6670EOh, new String[]{"resolver_name", "LEGACY_PROVIDER", HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, e.getMessage(), "caller_name", str2, "provider_url", uri.toString(), "provider_version", strA01, "instance_key", strValueOf, "waterfall_id", str});
                            }
                        } catch (RemoteException e2) {
                            BV4.A1M(strA00, "SAVED_ACCOUNTS", EPf.REMOTE_EXCEPTION, abstractC6670EOh, new String[]{"resolver_name", "LEGACY_PROVIDER", HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, e2.getMessage(), "caller_name", str2, "provider_url", uri.toString(), "provider_version", strA01, "instance_key", strValueOf, "waterfall_id", str});
                        } catch (Exception e3) {
                            BV4.A1M(strA00, "SAVED_ACCOUNTS", EPf.GENERAL_EXCEPTION, abstractC6670EOh, new String[]{"resolver_name", "LEGACY_PROVIDER", HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, e3.getMessage(), "caller_name", str2, "provider_url", uri.toString(), "provider_version", strA01, "instance_key", strValueOf, "waterfall_id", str});
                        }
                        if (contentProviderClientA00 != null) {
                            contentProviderClientA00.release();
                        }
                    } catch (Throwable th) {
                        if (contentProviderClientA00 != null) {
                            contentProviderClientA00.release();
                        }
                        throw th;
                    }
                }
            }
        }
        return arrayListA0h;
    }

    public static String A03(Number number) {
        return number.intValue() != 0 ? "LITE_PROVIDER" : "LEGACY_PROVIDER";
    }

    private final void A06(Integer num, String str, String str2, String str3, String str4, List list, EPs ePs, EPi ePi) {
        if (list.isEmpty()) {
            AbstractC6670EOh abstractC6670EOh = this.A04;
            abstractC6670EOh.logAccountItemFetchEmpty(AbstractC6673EOm.A01(ePs.A04), ePi.name(), EPf.NO_ACCOUNT_FOUND, abstractC6670EOh.constructDebugTestData("resolver_name", A03(num), "caller_name", str3, "provider_url", ePs.A00.toString(), "provider_version", str2, "instance_key", str, "waterfall_id", str4));
            return;
        }
        String str5 = "FALSE";
        String str6 = "FALSE";
        for (Object obj : list) {
            if (obj instanceof EPY) {
                EPY epy = (EPY) obj;
                if (epy.A03.length() == 0) {
                    str5 = "TRUE";
                }
                if (epy.A02.length() == 0) {
                    str6 = "TRUE";
                }
            }
        }
        AbstractC6670EOh abstractC6670EOh2 = this.A04;
        abstractC6670EOh2.logAccountItemFetchSuccess(AbstractC6673EOm.A01(ePs.A04), ePi.name(), abstractC6670EOh2.constructDebugTestData("resolver_name", A03(num), "caller_name", str3, "provider_url", ePs.A00.toString(), "provider_version", str2, "instance_key", str, "waterfall_id", str4, "is_uid_empty", str5, "is_token_empty", str6));
    }
}
