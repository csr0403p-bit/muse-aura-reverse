package X;

import androidx.compose.runtime.tooling.DiagnosticComposeException;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: X.ALd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0980ALd {
    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0<LX/AHg;>;)Z */
    public static final void A00(Throwable th, Function0 function0) {
        C0904AHg c0904AHg;
        C7384Etj.A0Y(th, 0);
        List<Throwable> listA00 = AbstractC7477ExS.A00.A00(th);
        int size = listA00.size();
        for (int i = 0; i < size; i++) {
            if (listA00.get(i) instanceof DiagnosticComposeException) {
                return;
            }
        }
        try {
            c0904AHg = (C0904AHg) function0.invoke();
        } catch (Throwable th2) {
            th = th2;
        }
        if (c0904AHg != null) {
            if (!c0904AHg.A01) {
                if (c0904AHg.A00.isEmpty()) {
                    return;
                }
                th = new DiagnosticComposeException(c0904AHg);
                CU7.A01(th, th);
                return;
            }
            List<AH3> list = c0904AHg.A00;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                list.get(i2);
            }
        }
    }
}
