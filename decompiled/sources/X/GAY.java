package X;

import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes6.dex */
public final class GAY<U, T extends U> extends GAk<T> implements Runnable {
    public static final String __redex_internal_original_name = "TimeoutCoroutine";
    public final long A00;

    @Override // java.lang.Runnable
    public final void run() {
        C78T c78t = ((GAq) this).A00;
        C7Bq.A03(c78t);
        C1282AgS c1282AgS = (C1282AgS) c78t.get(C1282AgS.A01);
        String str = c1282AgS != null ? c1282AgS.A00 : null;
        String strA0J = FGI.A0J(C8j2.A00(58), this.A00, " ms");
        if (str != null) {
            if (strA0J.length() > 0) {
                char lowerCase = Character.toLowerCase(AbstractC7607F5u.A00(strA0J));
                String strSubstring = strA0J.substring(1);
                StringBuilder sbA0w = C60O.A0w();
                sbA0w.append(lowerCase);
                strA0J = AnonymousClass001.A0v(strSubstring, sbA0w);
            }
            strA0J = FGI.A0d("Coroutine \"", str, "\" ", strA0J);
        }
        A0Q(new TimeoutCancellationException(strA0J, this));
    }

    public GAY(long j, HtJ<? super U> htJ) {
        super(htJ, htJ.getContext());
        this.A00 = j;
    }
}
