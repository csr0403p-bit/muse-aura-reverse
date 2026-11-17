package com.facebook.aura.common.prefs;

import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BGK;
import X.BzK;
import X.C3cG;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C7cU;
import X.F0C;
import X.FGI;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AuraPrefsStorage {
    public static final String NEW_FILE_SUFFIX = ".new";
    public static final String TEMP_FILE_SUFFIX = ".tmp";
    public static final AuraPrefsStorage INSTANCE = new AuraPrefsStorage();
    public static final F0C sharedPrefsFactory$delegate = AbstractC5321DgF.A03(AuraPrefsStorage$sharedPrefsFactory$2.INSTANCE);

    public final C4oT get(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        return ((C7cU) sharedPrefsFactory$delegate.getValue()).A00(FGI.A0U(str, ":", str2));
    }

    private final C7cU getSharedPrefsFactory() {
        return C60O.A0E();
    }

    private final List<String> storeFileNames() {
        File parentFile = C3cG.A0O(C60O.A0E().A04.AMN(), "device").getParentFile();
        String[] list = parentFile != null ? parentFile.list() : null;
        if (list == null) {
            list = new String[0];
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : list) {
            C7384Etj.A0X(str);
            if (!str.endsWith(TEMP_FILE_SUFFIX) && !str.endsWith(NEW_FILE_SUFFIX)) {
                arrayListA0h.add(str);
            }
        }
        return arrayListA0h;
    }

    public final void clearScope(String str, List<String> list) {
        HashSet hashSet;
        AnonymousClass004.A1b(str, list);
        String strA0M = FGI.A0M(str, ":");
        Map<String, C4oT> map = C60O.A0E().A01;
        synchronized (map) {
            hashSet = new HashSet(map.keySet());
        }
        LinkedHashSet linkedHashSetA01 = BGK.A01(storeFileNames(), hashSet);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = linkedHashSetA01.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (AnonymousClass005.A1a((String) next, strA0M)) {
                arrayListA0h.add(next);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            arrayListA0i.add(C7BY.A0K(strA0M, AnonymousClass005.A0j(it2)));
        }
        Iterator it3 = AbstractC0878AGe.A0g(AbstractC0878AGe.A0P(arrayListA0i, list)).iterator();
        while (it3.hasNext()) {
            BzK bzKA9q = INSTANCE.get(str, AnonymousClass005.A0j(it3)).A9q();
            bzKA9q.A08();
            bzKA9q.apply();
        }
    }

    public final File file(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        C7cU c7cUA0E = C60O.A0E();
        return C3cG.A0O(c7cUA0E.A04.AMN(), FGI.A0U(str, ":", str2));
    }

    public final C7cU getFactory() {
        return C60O.A0E();
    }
}
