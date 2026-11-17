package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes6.dex */
public final class GBJ<T> extends GBN<T> implements GAu, HtJ<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04 = AtomicReferenceFieldUpdater.newUpdater(GBJ.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final String __redex_internal_original_name = "DispatchedContinuation";
    public Object A00;
    public final Object A01;
    public final HtJ<T> A02;
    public final GBK A03;
    public volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX WARN: Incorrect types in method signature: (LX/GBK;LX/HtJ<-TT;>;)V */
    public GBJ(HtJ htJ, GBK gbk) {
        ((GBN) this).A00 = -1;
        this.A03 = gbk;
        this.A02 = htJ;
        this.A00 = GBI.A01;
        this.A01 = GCA.A01(htJ.getContext());
    }

    @Override // X.HtJ
    public final void resumeWith(Object obj) throws DispatchException {
        Object c10474Hkl = obj;
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 != null) {
            c10474Hkl = new C10474Hkl(thA00, false);
        }
        GBK gbk = this.A03;
        HtJ<T> htJ = this.A02;
        if (GBI.A02(htJ.getContext(), gbk)) {
            this.A00 = c10474Hkl;
            ((GBN) this).A00 = 0;
            GBI.A01(this, htJ.getContext(), gbk);
            return;
        }
        GB7 gb7A00 = AbstractC9246GAy.A00();
        long j = gb7A00.A00;
        if (j >= LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
            this.A00 = c10474Hkl;
            ((GBN) this).A00 = 0;
            gb7A00.A03(this);
            return;
        }
        gb7A00.A00 = j + LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES;
        try {
            C78T context = htJ.getContext();
            Object objA00 = GCA.A00(this.A01, context);
            try {
                htJ.resumeWith(obj);
                while (gb7A00.A05()) {
                }
            } finally {
                GCA.A02(objA00, context);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // X.GBN
    public final Object A0B() {
        Object obj = this.A00;
        this.A00 = GBI.A01;
        return obj;
    }

    @Override // X.GBN
    public final HtJ<T> A0E() {
        return this;
    }

    @Override // X.GAu
    public final GAu getCallerFrame() {
        HtJ<T> htJ = this.A02;
        if (htJ instanceof GAu) {
            return (GAu) htJ;
        }
        return null;
    }

    @Override // X.HtJ
    public final C78T getContext() {
        return this.A02.getContext();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DispatchedContinuation[");
        AbstractC7608F5v.A1O(sbA0x, this.A03);
        sbA0x.append(AbstractC10504Hnh.A00(this.A02));
        return BV5.A0o(sbA0x);
    }
}
