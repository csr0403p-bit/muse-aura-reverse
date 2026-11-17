package X;

import com.facebook.errorreporting.lacrima.common.mappedfile.mlocked.MLockedFile;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C2b {
    public static final Map<String, AbstractC3225C4i> A01 = BV4.A0u();
    public static final List<C57> A00 = C3cG.A0h();

    public static synchronized AbstractC3225C4i A00(File file) {
        AbstractC3225C4i c3186C2a;
        C3193C2r c3193C2r;
        Map<String, AbstractC3225C4i> map = A01;
        if (map.get(file.getName()) != null) {
            return map.get(file.getName());
        }
        AbstractC3225C4i abstractC3225C4i = C98.A00;
        File fileA0O = C3cG.A0O(file, "mapped_map.txt");
        try {
            c3193C2r = new MLockedFile(fileA0O, 8192);
        } catch (IOException e) {
            CFK.A0A(C9Y.TAG, "Failed to initialize mlocked file, using fallback", e);
            C2Q.A00().AT9("InitMLockedFile", e, null);
            fileA0O.delete();
            try {
                c3193C2r = new C3193C2r(fileA0O, 8192);
            } catch (IOException e2) {
                CFK.A0A(C9Y.TAG, "Failed to initialize mapped file", e2);
                C2Q.A00().AT9("InitSimpleMappedFile", e2, null);
                c3186C2a = new C3186C2a();
                CFK.A0H(C9Y.TAG, "Cannot create mapped file: %s", fileA0O.getName());
                C2Q.A00().AT9("CreateGlobalProperties ", null, null);
            }
        }
        c3186C2a = new C2Z(new C2Y(c3193C2r));
        map.put(file.getName(), c3186C2a);
        return c3186C2a;
    }
}
