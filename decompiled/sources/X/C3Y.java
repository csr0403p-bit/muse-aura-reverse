package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public class C3Y extends AbstractC3198C2y {
    public final File A00;
    public final String A01;

    public C3Y(Context context, File file, File file2, String str) {
        super(context, file, true, false);
        this.A00 = file2;
        this.A01 = str;
    }

    @Override // X.C3H, X.C3g
    public String A04() {
        return "ExtractFromZipSoSource";
    }

    @Override // X.C3H, X.C3g
    public final String toString() throws IOException {
        String name;
        String strA04 = A04();
        File file = this.A00;
        try {
            name = file.getCanonicalPath();
        } catch (IOException unused) {
            name = file.getName();
        }
        return FGI.A0d(strA04, "[", name, "]");
    }
}
