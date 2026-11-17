package X;

import java.io.File;

/* loaded from: classes5.dex */
public final class C62 extends AbstractC3220C4c {
    @Override // X.AbstractC3220C4c
    public final C5l A00() {
        return C5l.A02;
    }

    @Override // X.AbstractC3220C4c
    public final Integer A01() {
        return C79.A00;
    }

    @Override // X.AbstractC3220C4c
    public final void A02(EnumC3223C4g enumC3223C4g, File file, File file2) throws NumberFormatException {
        if (file2 != null) {
            File fileA0O = C3cG.A0O(file2, "critical_anr_prop.txt");
            if (fileA0O.exists()) {
                fileA0O.renameTo(C3cG.A0O(fileA0O.getParentFile(), "critical_suppl_anr_extra_prop.txt"));
            }
            File[] fileArrListFiles = file2.listFiles(new F5E(this, 2));
            if (fileArrListFiles != null) {
                int i = -1;
                File file3 = null;
                for (File file4 : fileArrListFiles) {
                    try {
                        int i2 = Integer.parseInt(file4.getName().replace("large_", "").replace("_anr_prop.txt", ""));
                        if (i2 > i) {
                            file3 = file4;
                            i = i2;
                        }
                    } catch (NumberFormatException e) {
                        CFK.A0H(C9Y.TAG, "Invalid anr report name %s", file4.getName(), e);
                        C2Q.A00().AT9("InvalidAnrPropFileName", e, null);
                    }
                }
                if (file3 != null && file3.exists()) {
                    file3.renameTo(C3cG.A0O(file3.getParentFile(), "large_suppl_anr_extra_prop.txt"));
                }
            }
        }
        super.A02(enumC3223C4g, file, file2);
    }
}
