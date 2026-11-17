package com.facebook.aura.file.utils;

import X.AbstractC3422CMk;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.CEV;
import X.FGI;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class DeleteAsideKt {
    public static final String RETIRED_SUFFIX = ".retired-";
    public static final String TAG = "DeleteAside";

    public static final void deleteAside(final File file, final List<String> list) {
        AnonymousClass003.A0u(file, list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            File fileA0O = C3cG.A0O(file, strA0j);
            File fileA0O2 = C3cG.A0O(file, AnonymousClass006.A0y(UUID.randomUUID(), ".retired-", C3cG.A0g(strA0j)));
            if (fileA0O.exists() && !fileA0O.renameTo(fileA0O2)) {
                AbstractC3422CMk.A04(TAG, FGI.A0U("Could not move ", strA0j, " aside; deleting in place"));
                CEV.A03(fileA0O);
            }
        }
        C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.file.utils.DeleteAsideKt.deleteAside.2
            @Override // java.lang.Runnable
            public final void run() {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    List<String> list2 = list;
                    ArrayList arrayListA0h = C3cG.A0h();
                    for (File file2 : fileArrListFiles) {
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<String> it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String strA0j2 = AnonymousClass005.A0j(it2);
                                    String name = file2.getName();
                                    C7384Etj.A0U(name);
                                    if (name.startsWith(FGI.A0M(strA0j2, ".retired-"))) {
                                        arrayListA0h.add(file2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    Iterator it3 = arrayListA0h.iterator();
                    while (it3.hasNext()) {
                        C60R.A1Q(it3);
                    }
                }
            }
        });
    }
}
