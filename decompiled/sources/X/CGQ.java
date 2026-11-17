package X;

import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class CGQ implements Runnable {
    public static final String __redex_internal_original_name = "E2EMobileConfigAccessListenerImpl$1";
    public final /* synthetic */ CGP A00;
    public final /* synthetic */ FileOutputStream A01;

    public CGQ(CGP cgp, FileOutputStream fileOutputStream) {
        this.A00 = cgp;
        this.A01 = fileOutputStream;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, IOException {
        while (true) {
            String strTake = this.A00.A00.take();
            FileOutputStream fileOutputStream = this.A01;
            C7384Etj.A0X(strTake);
            fileOutputStream.write(strTake.getBytes(DCl.A05));
            fileOutputStream.flush();
        }
    }
}
