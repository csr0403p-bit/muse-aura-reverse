package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class I03 implements Runnable {
    public static final String __redex_internal_original_name = "AccessibilityFocusWithinTracker$dispose$1";
    public final /* synthetic */ I01 A00;
    public final /* synthetic */ Function0<I01> A01;

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<LX/I01;>;LX/I01;)V */
    public I03(I01 i01, Function0 function0) {
        this.A01 = function0;
        this.A00 = i01;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I01 i01Invoke = this.A01.invoke();
        if (i01Invoke == null || i01Invoke.A04) {
            i01Invoke = null;
        } else if (i01Invoke.A06 == this.A00.A06 && i01Invoke.A02) {
            return;
        }
        this.A00.A07.A00(false);
        if (i01Invoke == null || !i01Invoke.A03) {
            return;
        }
        i01Invoke.A03 = false;
        i01Invoke.A07.A00(true);
    }
}
