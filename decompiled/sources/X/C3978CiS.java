package X;

import android.content.Context;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* renamed from: X.CiS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3978CiS implements InterfaceC3984CiY {
    public static final C3978CiS A00 = new C3978CiS();

    @Override // X.InterfaceC3984CiY
    public final Object AYX(C3979CiT c3979CiT) {
        int i;
        C7384Etj.A0Y(c3979CiT, 0);
        try {
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if ("FBNS".equals(c3979CiT.A0F)) {
                if (qPLInstance != null) {
                    i = 875313348;
                    qPLInstance.markerEnd(i, (short) 2);
                }
            } else if (qPLInstance != null) {
                i = 875301323;
                qPLInstance.markerEnd(i, (short) 2);
            }
        } catch (Throwable unused) {
        }
        Context context = c3979CiT.A06;
        InterfaceC3985Cia interfaceC3985Cia = c3979CiT.A0A;
        InterfaceC3985Cia interfaceC3985Cia2 = c3979CiT.A09;
        PushInfraMetaData pushInfraMetaData = c3979CiT.A08;
        String str = c3979CiT.A0F;
        Integer num = c3979CiT.A00;
        boolean z = c3979CiT.A03;
        boolean z2 = c3979CiT.A02;
        String str2 = c3979CiT.A0E;
        String str3 = c3979CiT.A0D;
        String str4 = c3979CiT.A0C;
        int i2 = c3979CiT.A05;
        int i3 = c3979CiT.A04;
        C3972CiK c3972CiK = c3979CiT.A07;
        Integer num2 = c3979CiT.A0B;
        AnonymousClass005.A12(context, pushInfraMetaData, str, 0);
        C7384Etj.A0Y(c3972CiK, 14);
        return new C3979CiT(context, c3972CiK, pushInfraMetaData, interfaceC3985Cia, interfaceC3985Cia2, num, num2, str, str2, str3, str4, i2, i3, z, z2, false);
    }

    @Override // X.InterfaceC3984CiY
    public final boolean AfW(C3979CiT c3979CiT) {
        C7384Etj.A0Y(c3979CiT, 0);
        Long l = c3979CiT.A08.A04;
        return l != null && l.longValue() == 52;
    }

    @Override // X.InterfaceC3984CiY
    public final String AIp() {
        return "pushability_healthcheck";
    }
}
