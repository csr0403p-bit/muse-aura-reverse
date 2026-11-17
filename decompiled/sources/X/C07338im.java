package X;

import android.os.Parcel;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.8im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07338im extends AbstractC7559F3s implements G0U {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07338im(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                Parcel parcel = (Parcel) obj;
                C7384Etj.A0Y(parcel, 0);
                return new C77p(parcel);
            case 1:
                Parcel parcel2 = (Parcel) obj;
                C7384Etj.A0Y(parcel2, 0);
                return new C77r(parcel2);
            case 2:
                return C0881AGi.A00;
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                C7384Etj.A0Y(entry, 0);
                StringBuilder sbA0x = C60O.A0x("  ");
                sbA0x.append(((C6JZ) entry.getKey()).A00);
                sbA0x.append(" = ");
                sbA0x.append(entry.getValue());
                return sbA0x.toString();
            case 4:
                AnonymousClass006.A19((InterfaceC0857A6e) obj);
                break;
            case 5:
                C79W c79w = (C79W) obj;
                C7384Etj.A0Y(c79w, 0);
                c79w.A01.invoke(C9732Gel.A00);
                break;
            case 6:
                return Unit.INSTANCE;
            case 7:
            case 8:
            case 9:
                C7384Etj.A0Y(obj, 0);
                return obj;
            case 10:
                InterfaceC10512HoG interfaceC10512HoG = (InterfaceC10512HoG) obj;
                C7384Etj.A0Y(interfaceC10512HoG, 0);
                C0881AGi c0881AGi = C0881AGi.A00;
                return new Hkf(interfaceC10512HoG, c0881AGi, c0881AGi);
            case 11:
                InterfaceC10512HoG interfaceC10512HoG2 = (InterfaceC10512HoG) obj;
                C7384Etj.A0Y(interfaceC10512HoG2, 0);
                return new HzU(interfaceC10512HoG2, C0881AGi.A00);
            case 12:
                return C3cJ.A0K(Integer.valueOf(((Number) obj).byteValue() & 255));
            case 13:
                HxE hxE = (HxE) obj;
                C7384Etj.A0Y(hxE, 0);
                String strPattern = ((C06827l3) hxE.first).nativePattern.pattern();
                C7384Etj.A0U(strPattern);
                return FGI.A0N("(", strPattern, ')');
            default:
                return null;
        }
        return Unit.INSTANCE;
    }
}
