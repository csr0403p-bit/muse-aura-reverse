package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CCi {
    public C1Z A00;
    public final Context A01;
    public final File A02;
    public final Executor A03;
    public final AbstractC3297CCr[] A04;
    public static final Executor A06 = new F52(4);
    public static final CCk A05 = new CCk();

    public CCi(Context context, File file, ArrayList arrayList, Executor executor) {
        C1H.A00(context);
        this.A01 = context;
        C1H.A00(file);
        this.A02 = file;
        this.A04 = (AbstractC3297CCr[]) arrayList.toArray(new AbstractC3297CCr[arrayList.size()]);
        this.A03 = executor;
        this.A00 = null;
    }

    public static void A00(File file) throws IOException {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                A00(file2);
            }
        }
        if (!file.delete() && file.exists()) {
            throw BV8.A0j(file, "could not delete: ");
        }
    }
}
