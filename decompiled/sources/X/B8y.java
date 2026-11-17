package X;

import androidx.compose.ui.text.font.AsyncFontListLoader;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes4.dex */
public final class B8y {
    public static final CoroutineExceptionHandler A02 = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
    public C3UX A00;
    public final AsyncTypefaceCache A01;

    /* JADX WARN: Incorrect types in method signature: (LX/B0J;LX/B98;LX/G0U<-LX/B0K;Lkotlin/Unit;>;LX/G0U<-LX/B0J;+Ljava/lang/Object;>;)LX/B9E; */
    public final B9E A00(B98 b98, B0J b0j, G0U g0u, G0U g0u2) {
        B9E b96;
        AbstractC1996Aw5 abstractC1996Aw5 = b0j.A02;
        if (!(abstractC1996Aw5 instanceof A48)) {
            return null;
        }
        List listA00 = B91.A00(b0j.A03, ((A48) abstractC1996Aw5).A00, b0j.A00);
        AsyncTypefaceCache asyncTypefaceCache = this.A01;
        HxE hxEA00 = B8z.A00(asyncTypefaceCache, b98, b0j, listA00, g0u2);
        List list = (List) hxEA00.first;
        B b = hxEA00.second;
        if (list == null) {
            b96 = new B0K(b, true);
        } else {
            AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(asyncTypefaceCache, b98, b0j, b, list, g0u);
            C8j3.A1I(C79.A0K, new BU0(asyncFontListLoader, null, 2), this.A00);
            b96 = new B96(asyncFontListLoader);
        }
        return b96;
    }

    public B8y(AsyncTypefaceCache asyncTypefaceCache, C78T c78t) {
        this.A01 = asyncTypefaceCache;
        this.A00 = C78T.A01(A02.plus(B9A.A00).plus(c78t), (HoC) c78t.get(HoC.A00));
    }

    public B8y() {
        this(new AsyncTypefaceCache(), C6ys.A00);
    }
}
