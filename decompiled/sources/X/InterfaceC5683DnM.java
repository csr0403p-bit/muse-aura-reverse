package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;

/* renamed from: X.DnM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC5683DnM {
    void A3I(EnumC5684DnO enumC5684DnO);

    void A3J(DnW dnW, String str);

    void A3K(DnW dnW, String str);

    void A3O(String str);

    void A3Q(String str);

    void A3Y(String str, int i, long j, long j2, long j3, long j4);

    void A3Z(String str, int i, long j, long j2, long j3, long j4);

    void A3m(String str);

    void A3n(String str);

    void A3v(long j, long j2, long j3);

    void AAZ(C6154Dwx c6154Dwx);

    Do4 AC7();

    Map<String, String> ADp();

    void AdW(InbandTelemetryBweEstimate inbandTelemetryBweEstimate);

    /* JADX WARN: Incorrect types in method signature: (JJJJLX/Dwx;[LX/Dwx;LX/Dwx;LX/Dwx;ILjava/util/List<+LX/Dls;>;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V */
    void Afw(C6154Dwx c6154Dwx, C6154Dwx c6154Dwx2, C6154Dwx c6154Dwx3, String str, String str2, String str3, String str4, String str5, List list, C6154Dwx[] c6154DwxArr, float f, int i, long j, long j2, long j3, long j4, boolean z);

    void Ahq(C5480DjH c5480DjH);

    void Aht(C6154Dwx[] c6154DwxArr);

    void Ahu(boolean z);

    void Ahv(boolean z);

    void Ai2(long j);

    void Ai8(AbstractC6071DvB abstractC6071DvB);

    void Ai9(AbstractC6071DvB abstractC6071DvB);

    static void A00(InterfaceC5683DnM interfaceC5683DnM, DnW dnW, NumberFormat numberFormat, double d) {
        interfaceC5683DnM.A3J(dnW, numberFormat.format(d));
    }
}
