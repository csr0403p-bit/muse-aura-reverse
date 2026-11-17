package X;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AGB implements AG2 {
    public final /* synthetic */ C0918AHu<String, List<Function0<Object>>> A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Function0<Object> A02;

    public AGB(C0918AHu<String, List<Function0<Object>>> c0918AHu, String str, Function0<? extends Object> function0) {
        this.A00 = c0918AHu;
        this.A01 = str;
        this.A02 = function0;
    }

    @Override // X.AG2
    public final void Ahh() {
        C0918AHu<String, List<Function0<Object>>> c0918AHu = this.A00;
        String str = this.A01;
        List<Function0<Object>> listA0B = c0918AHu.A0B(str);
        if (listA0B != null) {
            listA0B.remove(this.A02);
            if (listA0B.isEmpty()) {
                return;
            }
            c0918AHu.A0E(str, listA0B);
        }
    }
}
