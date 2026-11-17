package X;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

/* loaded from: classes5.dex */
public final class F5F implements FileFilter {
    public final int $t;
    public final String A00;

    public F5F(String str, int i) {
        this.$t = i;
        this.A00 = str;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        boolean zEndsWith;
        switch (this.$t) {
            case 0:
                String str = this.A00;
                List list = C4E.A05;
                C1H.A00(file);
                return file.getName().startsWith(str);
            case 1:
                String str2 = this.A00;
                if (file == null) {
                    return false;
                }
                zEndsWith = file.getName().endsWith(str2);
                break;
            default:
                String str3 = this.A00;
                if (file == null || !file.isDirectory()) {
                    return false;
                }
                if (!file.getName().startsWith(FGI.A0U("session_", str3, "_"))) {
                    zEndsWith = file.getName().startsWith(FGI.A0U("sess_", str3, "_"));
                    break;
                } else {
                    return true;
                }
                break;
        }
        return zEndsWith;
    }
}
