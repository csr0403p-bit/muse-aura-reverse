package X;

import android.content.Context;
import android.content.ServiceConnection;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Dfd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5297Dfd {
    public int A00;
    public IMultiInstanceInvalidationService A01;
    public final Context A02;
    public final EIR A05;
    public final C5296Dfc A06;
    public final String A07;
    public final C3UX A09;
    public final AtomicBoolean A08 = BV4.A12(true);
    public final C3Em<Set<String>> A0A = new C9290GCr(C79.A00, 0, 0);
    public final IMultiInstanceInvalidationCallback A04 = new MultiInstanceInvalidationClient$invalidationCallback$1(this);
    public final ServiceConnection A03 = new ServiceConnectionC5295Dfa(this);

    public C5297Dfd(Context context, EIR eir, String str) {
        this.A07 = str;
        this.A05 = eir;
        this.A02 = context.getApplicationContext();
        this.A09 = eir.A02.getCoroutineScope();
        this.A06 = new C5296Dfc(this, eir.A0A);
    }
}
