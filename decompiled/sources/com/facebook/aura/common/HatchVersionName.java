package com.facebook.aura.common;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7BY;
import X.C9tI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchVersionName {
    public static final HatchVersionName INSTANCE = new HatchVersionName();

    private final List<Integer> segments(String str) {
        List listA0i = C7BY.A0i(str, new String[]{"."}, 0);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0i);
        Iterator it = listA0i.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            int length = strA0j.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!Character.isDigit(strA0j.charAt(i))) {
                    strA0j = strA0j.substring(0, i);
                    break;
                }
                i++;
            }
            Integer numA0r = C9tI.A0r(strA0j);
            arrayListA0i.add(Integer.valueOf(numA0r != null ? numA0r.intValue() : 0));
        }
        return arrayListA0i;
    }

    public final boolean isBelow(String str, String str2) {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        List<Integer> listSegments = segments(str);
        List<Integer> listSegments2 = segments(str2);
        int iMax = Math.max(listSegments.size(), listSegments2.size());
        int i = 0;
        while (true) {
            if (i >= iMax) {
                break;
            }
            int iA0F = AnonymousClass001.A0F((i < 0 || i >= listSegments.size()) ? 0 : listSegments.get(i));
            int iA0F2 = AnonymousClass001.A0F((i < 0 || i >= listSegments2.size()) ? 0 : listSegments2.get(i));
            if (iA0F == iA0F2) {
                i++;
            } else if (iA0F < iA0F2) {
                return zA1a;
            }
        }
        return false;
    }
}
