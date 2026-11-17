package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;
import java.util.Map;

/* renamed from: X.DnU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5688DnU implements InterfaceC5683DnM {
    public final Do4 A00;
    public final VpsEventCallback A01;

    public C5688DnU(VpsEventCallback vpsEventCallback, String str, String str2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        C7384Etj.A0Y(str, 0);
        this.A01 = vpsEventCallback;
        this.A00 = new Do4(vpsEventCallback, str, str2, j, z, z2, z3, z4);
    }

    @Override // X.InterfaceC5683DnM
    public final void A3I(EnumC5684DnO enumC5684DnO) {
        C7384Etj.A0Y(enumC5684DnO, 0);
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            c5689DnV.A0S.add(enumC5684DnO);
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3O(String str) {
        C7384Etj.A0Y(str, 0);
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            c5689DnV.A0V.set(str);
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3Q(String str) {
        C7384Etj.A0Y(str, 0);
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            c5689DnV.A07 = str;
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3Y(String str, int i, long j, long j2, long j3, long j4) {
        C7384Etj.A0Y(str, 5);
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            if (str.length() == 0) {
                str = "default";
            }
            c5689DnV.A0T.put(str, new C5901Drk(i, j, j2, j3, j4));
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3m(String str) {
        C7384Etj.A0Y(str, 0);
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            c5689DnV.A0B = str;
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3n(String str) {
        C7384Etj.A0Y(str, 0);
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            c5689DnV.A0C = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    @Override // X.InterfaceC5683DnM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AAZ(X.C6154Dwx r29) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5688DnU.AAZ(X.Dwx):void");
    }

    @Override // X.InterfaceC5683DnM
    public final void AdW(InbandTelemetryBweEstimate inbandTelemetryBweEstimate) {
        C7384Etj.A0Y(inbandTelemetryBweEstimate, 0);
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            c5689DnV.A06 = inbandTelemetryBweEstimate;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (JJJJLX/Dwx;[LX/Dwx;LX/Dwx;LX/Dwx;ILjava/util/List<+LX/Dls;>;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V */
    @Override // X.InterfaceC5683DnM
    public final void Afw(C6154Dwx c6154Dwx, C6154Dwx c6154Dwx2, C6154Dwx c6154Dwx3, String str, String str2, String str3, String str4, String str5, List list, C6154Dwx[] c6154DwxArr, float f, int i, long j, long j2, long j3, long j4, boolean z) {
        C7384Etj.A0Y(c6154DwxArr, 5);
        Do4 do4 = this.A00;
        do4.A02 = new C5689DnV(c6154Dwx, c6154Dwx2, c6154Dwx3, str, str2, str3, str4, str5, do4.A08, list, c6154DwxArr, f, i, j, j2, j3, j4, z);
    }

    @Override // X.InterfaceC5683DnM
    public final void A3Z(String str, int i, long j, long j2, long j3, long j4) {
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            if (str == null || str.length() == 0) {
                str = "default";
            }
            c5689DnV.A0U.put(str, new C5901Drk(i, j, j2, j3, j4));
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3v(long j, long j2, long j3) {
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            c5689DnV.A03 = j;
            c5689DnV.A04 = j2;
            c5689DnV.A02 = j3;
        }
    }

    @Override // X.InterfaceC5683DnM
    public final Do4 AC7() {
        return this.A00;
    }

    @Override // X.InterfaceC5683DnM
    public final void Ahq(C5480DjH c5480DjH) {
        this.A00.A00 = c5480DjH;
    }

    @Override // X.InterfaceC5683DnM
    public final void Ahu(boolean z) {
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            c5689DnV.A0E = z;
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void Ahv(boolean z) {
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            c5689DnV.A0F = z;
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void Ai2(long j) {
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            c5689DnV.A01 = j;
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void Ai8(AbstractC6071DvB abstractC6071DvB) {
        this.A00.A01 = abstractC6071DvB;
    }

    @Override // X.InterfaceC5683DnM
    public final void Ai9(AbstractC6071DvB abstractC6071DvB) {
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            c5689DnV.A0W.set(abstractC6071DvB);
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3J(DnW dnW, String str) {
        AnonymousClass003.A0u(dnW, str);
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            String str2 = dnW.shortName;
            StringBuilder sb = c5689DnV.A0Q;
            String strA0U = FGI.A0U(str2, InviteCodeScratcherKt.CODE_SEPARATOR, str);
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(strA0U);
        }
    }

    @Override // X.InterfaceC5683DnM
    public final void A3K(DnW dnW, String str) {
        AnonymousClass003.A0u(dnW, str);
        C5689DnV c5689DnV = this.A00.A02;
        if (c5689DnV != null) {
            StringBuilder sb = c5689DnV.A0R;
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(dnW.shortName);
            sb.append(InviteCodeScratcherKt.CODE_SEPARATOR);
            sb.append(str);
        }
    }

    @Override // X.InterfaceC5683DnM
    public final /* synthetic */ Map ADp() {
        return AGH.A0E();
    }

    @Override // X.InterfaceC5683DnM
    public final void Aht(C6154Dwx[] c6154DwxArr) {
    }
}
