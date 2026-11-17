package X;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Stack;

/* renamed from: X.C2v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3196C2v implements Runnable {
    public static final String __redex_internal_original_name = "UnpackingSoSource$2";
    public final /* synthetic */ C1Y A00;
    public final /* synthetic */ AbstractC3198C2y A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ boolean A03;

    public RunnableC3196C2v(C1Y c1y, AbstractC3198C2y abstractC3198C2y, File file, boolean z) {
        this.A03 = z;
        this.A02 = file;
        this.A00 = c1y;
        this.A01 = abstractC3198C2y;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C35.A01("fb-UnpackingSoSource", "starting syncer worker");
        try {
            try {
                boolean z = this.A03;
                if (z) {
                    File file = ((C3H) this.A01).A01;
                    Stack stack = new Stack();
                    stack.push(file);
                    while (!stack.isEmpty()) {
                        File file2 = (File) stack.pop();
                        if (file2.isDirectory()) {
                            File[] fileArrListFiles = file2.listFiles();
                            if (fileArrListFiles == null) {
                                throw BV8.A0j(file2, "cannot list directory ");
                            }
                            for (File file3 : fileArrListFiles) {
                                stack.push(file3);
                            }
                        } else if (file2.getPath().endsWith("_lock")) {
                            continue;
                        } else {
                            try {
                                RandomAccessFile randomAccessFileA0L = BV4.A0L(file2);
                                try {
                                    randomAccessFileA0L.getFD().sync();
                                    randomAccessFileA0L.close();
                                } catch (Throwable th) {
                                    try {
                                        randomAccessFileA0L.close();
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException e) {
                                StringBuilder sbA0f = C3cG.A0f(file2, "Syncing failed for ");
                                sbA0f.append(": ");
                                Log.e("SysUtil", AnonymousClass001.A0v(e.getMessage(), sbA0f));
                            }
                        }
                    }
                }
                AbstractC3198C2y.A00(this.A02, (byte) 1, z);
            } finally {
                StringBuilder sbA0x = C60O.A0x("releasing dso store lock for ");
                sbA0x.append(((C3H) this.A01).A01);
                C35.A01("fb-UnpackingSoSource", AnonymousClass001.A0v(" (from syncer thread)", sbA0x));
                this.A00.close();
            }
        } catch (IOException e2) {
            throw BV4.A0e(e2);
        }
    }
}
