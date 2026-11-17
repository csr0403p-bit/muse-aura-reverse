package X;

import android.view.ViewConfiguration;
import java.util.List;

/* renamed from: X.AgZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1289AgZ implements InterfaceC1285AgV {
    public final ViewConfiguration A00;

    @Override // X.InterfaceC1285AgV
    public final long A5m(C1247Afe c1247Afe) {
        ViewConfiguration viewConfiguration = this.A00;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List<C1299Agk> list = c1247Afe.A05;
        AWx aWxA0B = AWx.A0B(0L);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aWxA0B = AWx.A0B(AWx.A05(aWxA0B.A00, C8j3.A0h(list, i).A0D));
        }
        long j = aWxA0B.A00;
        return AnonymousClass005.A0L(C8j4.A00(j, f2), AnonymousClass001.A01(j, 4294967295L) * f);
    }

    public C1289AgZ(ViewConfiguration viewConfiguration) {
        this.A00 = viewConfiguration;
    }
}
