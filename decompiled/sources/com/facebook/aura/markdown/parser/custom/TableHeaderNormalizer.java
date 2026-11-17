package com.facebook.aura.markdown.parser.custom;

import X.AbstractC0878AGe;
import X.C06827l3;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class TableHeaderNormalizer {
    public static final TableHeaderNormalizer INSTANCE = new TableHeaderNormalizer();
    public static final C06827l3 HEADER_LINE = new C06827l3("^(?=.*\\|)\\s*\\|?[^|\\n]*(\\|[^|\\n]*)+\\|?\\s*$");
    public static final C06827l3 DELIMITER_LINE = new C06827l3("^(?=.*\\|)\\s*\\|?\\s*:?-+:?\\s*(\\|\\s*:?-+:?\\s*)*\\|?\\s*$");

    public final String normalize(String str) {
        int i;
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0k(str, '|')) {
            List listA0g = C7BY.A0g(str, new char[]{'\n'});
            if (listA0g.size() >= 3) {
                ArrayList arrayList = new ArrayList(listA0g.size() + 4);
                int size = listA0g.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str2 = (String) listA0g.get(i2);
                    if (i2 >= 1 && (i = i2 + 1) < listA0g.size()) {
                        int i3 = i2 - 1;
                        if (!C7BY.A0j((CharSequence) listA0g.get(i3))) {
                            C06827l3 c06827l3 = HEADER_LINE;
                            if (!c06827l3.A08((CharSequence) listA0g.get(i3))) {
                                C06827l3 c06827l32 = DELIMITER_LINE;
                                if (!c06827l32.A08((CharSequence) listA0g.get(i3)) && c06827l3.A08(str2) && c06827l32.A08((CharSequence) listA0g.get(i)) && (arrayList.isEmpty() || !C7BY.A0j((CharSequence) AbstractC0878AGe.A0H(arrayList)))) {
                                    arrayList.add("");
                                }
                            }
                        }
                    }
                    arrayList.add(str2);
                }
                return AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", arrayList, null);
            }
        }
        return str;
    }
}
