package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* loaded from: classes4.dex */
public final class BOg implements ATK {
    public C3UX A00;
    public HoC A01;
    public final Context A02;
    public final C00q A03 = new ParcelableSnapshotMutableFloatState(1.0f);

    @Override // X.C78T
    public final /* bridge */ <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.ATK
    public final float AJx() {
        C1BN<Float> c1bn;
        if (this.A01 == null) {
            Context context = this.A02;
            C0918AHu<Context, C1BN<Float>> c0918AHu = AbstractC1639AnF.A00;
            synchronized (c0918AHu) {
                C1BN<Float> c1bnA05 = c0918AHu.A05(context);
                if (c1bnA05 == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    GCV gcvA00 = AbstractC10623Hzj.A00(C79.A00, -1);
                    C05663ul c05663ul = new C05663ul(new BUK(contentResolver, context, uriFor, new BQk(Handler.createAsync(Looper.getMainLooper()), gcvA00), null, gcvA00));
                    c1bnA05 = AnonymousClass441.A00(Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)), Hxb.A01(), c05663ul, new C3Es(0L, LinkEncryptedPairingKt.LINK_COUNTER_MAX));
                    c0918AHu.A0E(context, c1bnA05);
                }
                c1bn = c1bnA05;
            }
            this.A03.AdS(c1bn.getValue().floatValue());
            C3UX c3ux = this.A00;
            if (c3ux == null) {
                throw new IllegalStateException("MotionDurationScale scale factor requested before recomposer loop start");
            }
            BU6 bu6 = new BU6((Object) this, (BBH) c1bn, (View) null, (HtJ<? super BU6>) 38);
            this.A01 = GAo.A02(C79.A00, C6ys.A00, bu6, c3ux);
        }
        return this.A03.AFn();
    }

    @Override // X.C78X
    public final /* synthetic */ C78I getKey() {
        return ATK.A00;
    }

    public BOg(Context context) {
        this.A02 = context;
    }

    @Override // X.C78X, X.C78T
    public final /* bridge */ <E extends C78X> E get(C78I<E> c78i) {
        return (E) C78W.A00(this, c78i);
    }

    @Override // X.C78T
    public final /* bridge */ C78T minusKey(C78I<?> c78i) {
        return C78W.A01(this, c78i);
    }

    @Override // X.C78T
    public final /* bridge */ C78T plus(C78T c78t) {
        return C78W.A02(this, c78t);
    }
}
