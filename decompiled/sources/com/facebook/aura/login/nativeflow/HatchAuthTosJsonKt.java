package com.facebook.aura.login.nativeflow;

import X.AGI;
import X.AHD;
import X.AnonymousClass003;
import X.C7384Etj;
import X.C7BY;
import X.HxE;
import com.facebook.aura.login.nativeflow.HatchTosGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class HatchAuthTosJsonKt {
    public static final String KIND_DISCLOSURE = "disclosure";
    public static final String KIND_DOCUMENTS = "documents";
    public static final String KIND_URL = "url";

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        r4.add(new com.facebook.aura.login.nativeflow.HatchConsentItem(r5.title, r3, r5.mandatory));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.login.nativeflow.HatchItemizedConsent itemizedConsentFrom(java.util.List<com.facebook.aura.login.nativeflow.AuthTosConsentItemJson> r13, com.facebook.aura.login.nativeflow.AuthTosConsentScreenJson r14) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r13, r0)
            r7 = 0
            if (r14 == 0) goto L11
            boolean r0 = r13 instanceof java.util.Collection
            if (r0 == 0) goto L12
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L12
        L11:
            return r7
        L12:
            java.util.Iterator r1 = r13.iterator()
        L16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r1.next()
            com.facebook.aura.login.nativeflow.AuthTosConsentItemJson r0 = (com.facebook.aura.login.nativeflow.AuthTosConsentItemJson) r0
            boolean r0 = r0.mandatory
            if (r0 == 0) goto L16
            java.lang.String r0 = r14.title
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L11
            java.lang.String r0 = r14.agree_to_all_label
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L11
            java.lang.String r0 = r14.confirm_label
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L11
            java.util.ArrayList r4 = X.AnonymousClass003.A0i(r13)
            java.util.Iterator r6 = r13.iterator()
        L46:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r5 = r6.next()
            com.facebook.aura.login.nativeflow.AuthTosConsentItemJson r5 = (com.facebook.aura.login.nativeflow.AuthTosConsentItemJson) r5
            java.util.List<com.facebook.aura.login.nativeflow.AuthTosBodyRunJson> r0 = r5.subtitle_runs
            X.AHD r3 = toBodyRuns(r0)
            java.lang.String r0 = r5.title
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L11
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L6b
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L6b
            return r7
        L6b:
            java.util.Iterator r1 = r3.iterator()
        L6f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r1.next()
            com.facebook.aura.login.nativeflow.HatchTosBodyRun r0 = (com.facebook.aura.login.nativeflow.HatchTosBodyRun) r0
            java.lang.String r0 = r0.text
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L6f
            java.lang.String r2 = r5.title
            boolean r1 = r5.mandatory
            com.facebook.aura.login.nativeflow.HatchConsentItem r0 = new com.facebook.aura.login.nativeflow.HatchConsentItem
            r0.<init>(r2, r3, r1)
            r4.add(r0)
            goto L46
        L90:
            X.AHD r8 = X.AGI.A07(r4)
            java.lang.String r9 = r14.title
            java.lang.String r10 = r14.subtitle
            if (r10 == 0) goto La0
            boolean r0 = X.C7BY.A0j(r10)
            if (r0 == 0) goto La1
        La0:
            r10 = r7
        La1:
            java.lang.String r11 = r14.agree_to_all_label
            java.lang.String r12 = r14.footer
            if (r12 == 0) goto Lad
            boolean r0 = X.C7BY.A0j(r12)
            if (r0 == 0) goto Lae
        Lad:
            r12 = r7
        Lae:
            java.lang.String r13 = r14.confirm_label
            java.lang.String r14 = r14.decline_label
            if (r14 == 0) goto Lba
            boolean r0 = X.C7BY.A0j(r14)
            if (r0 == 0) goto Lbb
        Lba:
            r14 = r7
        Lbb:
            com.facebook.aura.login.nativeflow.HatchItemizedConsent r7 = new com.facebook.aura.login.nativeflow.HatchItemizedConsent
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthTosJsonKt.itemizedConsentFrom(java.util.List, com.facebook.aura.login.nativeflow.AuthTosConsentScreenJson):com.facebook.aura.login.nativeflow.HatchItemizedConsent");
    }

    public static final HatchTosDisclosure toDisclosure(AuthTosJson authTosJson, boolean z) {
        C7384Etj.A0Y(authTosJson, 0);
        List<AuthTosRunJson> list = authTosJson.clause;
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AuthTosRunJson> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!C7BY.A0j(it.next().text)) {
                    z2 = true;
                    break;
                }
            }
        }
        if (!C7BY.A0j(authTosJson.content_version) && (z2 || (z && authTosJson.clause.isEmpty()))) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<AuthTosGroupJson> it2 = authTosJson.groups.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    List<AuthTosRunJson> list2 = authTosJson.clause;
                    ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
                    for (AuthTosRunJson authTosRunJson : list2) {
                        String str = authTosRunJson.token;
                        if (str != null && (C7BY.A0j(authTosRunJson.text) || !linkedHashMap.containsKey(str))) {
                            return null;
                        }
                        arrayListA0i.add(new HatchTosRun(authTosRunJson.text, str));
                    }
                    return new HatchTosDisclosure(AGI.A07(arrayListA0i), AGI.A08(linkedHashMap), authTosJson.content_version);
                }
                AuthTosGroupJson next = it2.next();
                if (C7BY.A0j(next.token) || linkedHashMap.containsKey(next.token)) {
                    break;
                }
                String str2 = next.token;
                HatchTosGroup group = toGroup(next);
                if (group == null) {
                    break;
                }
                linkedHashMap.put(str2, group);
            }
        }
        return null;
    }

    public static final AHD<HatchTosBodyRun> toBodyRuns(List<AuthTosBodyRunJson> list) {
        ArrayList arrayList = new ArrayList();
        for (AuthTosBodyRunJson authTosBodyRunJson : list) {
            String str = authTosBodyRunJson.text;
            String str2 = null;
            if (str.length() > 0) {
                String str3 = authTosBodyRunJson.url;
                if (str3 != null && !C7BY.A0j(str3)) {
                    str2 = str3;
                }
                arrayList.add(new HatchTosBodyRun(str, str2));
            }
        }
        return AGI.A07(arrayList);
    }

    public static final HatchTosGroup toGroup(AuthTosGroupJson authTosGroupJson) {
        HatchTosGroup prose;
        String str = authTosGroupJson.kind;
        int iHashCode = str.hashCode();
        HatchTosGroup url = null;
        str = null;
        String str2 = null;
        url = null;
        url = null;
        url = null;
        url = null;
        url = null;
        url = null;
        if (iHashCode == 116079) {
            if (!str.equals("url")) {
                return null;
            }
            String str3 = authTosGroupJson.url;
            if (str3 != null && !C7BY.A0j(str3)) {
                url = new HatchTosGroup.Url(str3);
            }
        } else if (iHashCode != 445606381) {
            if (iHashCode != 943542968 || !str.equals("documents")) {
                return null;
            }
            List<AuthTosDocumentJson> list = authTosGroupJson.documents;
            ArrayList<HatchTosDocument> arrayListA0i = AnonymousClass003.A0i(list);
            for (AuthTosDocumentJson authTosDocumentJson : list) {
                arrayListA0i.add(new HatchTosDocument(authTosDocumentJson.label, authTosDocumentJson.url));
            }
            if (!arrayListA0i.isEmpty()) {
                if (!(arrayListA0i instanceof Collection) || !arrayListA0i.isEmpty()) {
                    for (HatchTosDocument hatchTosDocument : arrayListA0i) {
                        if (C7BY.A0j(hatchTosDocument.label) || C7BY.A0j(hatchTosDocument.url)) {
                            break;
                        }
                    }
                }
                String str4 = authTosGroupJson.title;
                if (str4 == null || C7BY.A0j(str4)) {
                    str4 = null;
                }
                String str5 = authTosGroupJson.subtitle;
                if (str5 != null && !C7BY.A0j(str5)) {
                    str2 = str5;
                }
                prose = new HatchTosGroup.Documents(str4, str2, AGI.A07(arrayListA0i));
                url = prose;
            }
        } else {
            if (!str.equals("disclosure")) {
                return null;
            }
            String str6 = authTosGroupJson.body;
            if (str6 != null && !C7BY.A0j(str6)) {
                String str7 = authTosGroupJson.title;
                if (str7 == null || C7BY.A0j(str7)) {
                    str7 = null;
                }
                String str8 = authTosGroupJson.subtitle;
                if (str8 == null || C7BY.A0j(str8)) {
                    str8 = null;
                }
                AHD<HatchTosBodyRun> bodyRuns = toBodyRuns(authTosGroupJson.body_runs);
                AHD<HatchTosProseVariant> proseVariants = toProseVariants(authTosGroupJson.variants);
                String str9 = authTosGroupJson.page_title;
                if (str9 == null || C7BY.A0j(str9)) {
                    str9 = null;
                }
                String str10 = authTosGroupJson.confirm_label;
                if (str10 == null || C7BY.A0j(str10)) {
                    str10 = null;
                }
                String str11 = authTosGroupJson.decline_label;
                if (str11 == null || C7BY.A0j(str11)) {
                    str11 = null;
                }
                prose = new HatchTosGroup.Prose(str7, str8, str6, bodyRuns, proseVariants, str9, str10, str11);
                url = prose;
            }
        }
        return url;
    }

    public static final AHD<HatchTosProseVariant> toProseVariants(List<AuthTosVariantJson> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (AuthTosVariantJson authTosVariantJson : list) {
            String str = authTosVariantJson.source_app;
            if (str == null || C7BY.A0j(str)) {
                str = null;
            }
            if (!C7BY.A0j(authTosVariantJson.body) && linkedHashSet.add(new HxE(Boolean.valueOf(authTosVariantJson.is_f3), str))) {
                boolean z = authTosVariantJson.is_f3;
                String str2 = authTosVariantJson.title;
                arrayList.add(new HatchTosProseVariant(z, str, C7BY.A0j(str2) ? null : str2, authTosVariantJson.body, toBodyRuns(authTosVariantJson.body_runs)));
            }
        }
        return AGI.A07(arrayList);
    }
}
