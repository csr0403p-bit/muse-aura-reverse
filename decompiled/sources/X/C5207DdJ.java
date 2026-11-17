package X;

import android.os.Looper;
import java.util.ArrayList;

/* renamed from: X.DdJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5207DdJ {

    /* JADX INFO: Incorrect field signature: TT; */
    public C5210DdM A00;
    public ArrayList A01;
    public boolean A02;
    public final Looper A03;

    /* JADX WARN: Incorrect inner types in field signature: LX/DdJ<TT;>.DispatchHandler; */
    public final HandlerC5206DdI A04;

    public C5207DdJ(Looper looper) {
        this.A03 = looper;
        this.A04 = looper == null ? null : new HandlerC5206DdI(looper, this);
        this.A01 = C3cG.A0h();
    }
}
