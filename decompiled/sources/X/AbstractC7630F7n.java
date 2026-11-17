package X;

import com.instagram.common.bloks.BloksParseResult;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.F7n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7630F7n {
    public static final C7631F7o A00(F90 f90, List<? extends F6K> list) {
        C10453Hir c10453Hir;
        Hsf hsf;
        F61 f61;
        HashMap mapA0u = BV4.A0u();
        for (C7616F6s c7616F6s : f90.A00) {
            String str = c7616F6s.A01;
            if (str != null && (c10453Hir = c7616F6s.A00) != null && (hsf = c10453Hir.A00) != null && (f61 = hsf.A00) != null) {
                mapA0u.put(str, BloksParseResult.A01(null, f61, list));
            }
        }
        return new C7631F7o(mapA0u);
    }
}
