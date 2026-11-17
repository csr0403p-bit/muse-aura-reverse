package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.aura.network.acs.AcsKeyConfig;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class B8t extends B8w implements Hni {
    public final Handler A00;
    public final B8t A01;
    public final String A02;
    public final boolean A03;

    private final void A00(C78T c78t, Runnable runnable) {
        HzS.A03(new CancellationException(AnonymousClass001.A0v("' was closed", C3cG.A0f(this, "The task was rejected, the handler underlying the dispatcher '"))), c78t);
        GBK gbk = AbstractC9266GBt.A00;
        HlU.A01.dispatch(c78t, runnable);
    }

    @Override // X.Hni
    public final HsS AO7(final Runnable runnable, C78T c78t, long j) {
        Handler handler = this.A00;
        if (j > AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS) {
            j = AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS;
        }
        if (handler.postDelayed(runnable, j)) {
            return new HsS() { // from class: X.B8u
                @Override // X.HsS
                public final void dispose() {
                    B8t b8t = this;
                    b8t.A00.removeCallbacks(runnable);
                }
            };
        }
        A00(c78t, runnable);
        return HsE.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/Hm1<-Lkotlin/Unit;>;)V */
    @Override // X.Hni
    public final void AcD(final Hm1 hm1, long j) {
        Runnable runnable = new Runnable() { // from class: X.B8v
            public static final String __redex_internal_original_name = "HandlerContext$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                hm1.Abi(Unit.INSTANCE, this);
            }
        };
        Handler handler = this.A00;
        if (j > AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS) {
            j = AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS;
        }
        if (handler.postDelayed(runnable, j)) {
            hm1.AO2(new BT9(26, runnable, this));
        } else {
            A00(hm1.getContext(), runnable);
        }
    }

    @Override // X.GBK
    public final void dispatch(C78T c78t, Runnable runnable) {
        if (this.A00.post(runnable)) {
            return;
        }
        A00(c78t, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B8t) {
            B8t b8t = (B8t) obj;
            if (b8t.A00 == this.A00 && b8t.A03 == this.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.A00) ^ (this.A03 ? 1231 : 1237);
    }

    @Override // X.GBK
    public final boolean isDispatchNeeded(C78T c78t) {
        return (this.A03 && C7384Etj.areEqual(Looper.myLooper(), this.A00.getLooper())) ? false : true;
    }

    @Override // X.GBK
    public final String toString() {
        String str;
        B8t b8t;
        GBK gbk = AbstractC9266GBt.A00;
        GB9 gb9 = AbstractC7429Evm.A00;
        if (this == gb9) {
            str = "Dispatchers.Main";
        } else {
            str = null;
            try {
                b8t = ((B8t) gb9).A01;
            } catch (UnsupportedOperationException unused) {
                b8t = null;
            }
            if (this == b8t) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str != null) {
            return str;
        }
        String string = this.A02;
        if (string == null) {
            string = this.A00.toString();
        }
        return this.A03 ? FGI.A0M(string, ".immediate") : string;
    }

    public B8t(Handler handler, String str, boolean z) {
        this.A00 = handler;
        this.A02 = str;
        this.A03 = z;
        this.A01 = z ? this : new B8t(handler, str, true);
    }
}
