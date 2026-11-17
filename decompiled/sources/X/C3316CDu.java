package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.play.core.splitinstall.SplitInstallException;

/* renamed from: X.CDu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3316CDu implements CSP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CE8 A01;
    public final /* synthetic */ C3313CDn A02;

    @Override // X.CSP
    public final void onFailure(Exception exc) {
        C7384Etj.A0Y(exc, 0);
        int i = exc instanceof SplitInstallException ? ((ApiException) exc).mStatus.A00 : -100;
        this.A01.A00.A00.A06(new C3310CDj(exc, Integer.valueOf(i), 2));
        C3313CDn c3313CDn = this.A02;
        int i2 = this.A00;
        synchronized (c3313CDn) {
            c3313CDn.A0B.remove(Integer.valueOf(i2));
        }
    }

    public C3316CDu(CE8 ce8, C3313CDn c3313CDn, int i) {
        this.A01 = ce8;
        this.A02 = c3313CDn;
        this.A00 = i;
    }
}
