package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class C8C {
    public final String A00;

    public final void A00(List<String> list) throws Throwable {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    String str = this.A00;
                    BV5.A1H(BV4.A0G(str));
                    File file = new File(str, "vps_network_info_store");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    bufferedWriter = new BufferedWriter(new FileWriter(file));
                } catch (IOException | NullPointerException | SecurityException unused) {
                }
            } catch (Throwable th) {
                th = th;
                if (bufferedWriter2 != null) {
                }
                throw th;
            }
            try {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write(FGI.A0M(AnonymousClass005.A0j(it), PairsDiscretionDocument.TERMINATOR));
                }
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException | NullPointerException | SecurityException unused2) {
                bufferedWriter2 = bufferedWriter;
                COW cow = COW.A08;
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                try {
                    bufferedWriter2.close();
                    throw th;
                } catch (IOException unused3) {
                    COW cow2 = COW.A08;
                    throw th;
                }
            }
        } catch (IOException unused4) {
            COW cow3 = COW.A08;
        }
    }

    public C8C(String str) {
        this.A00 = str;
    }
}
