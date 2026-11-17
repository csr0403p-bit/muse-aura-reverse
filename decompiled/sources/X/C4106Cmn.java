package X;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zaa;

/* renamed from: X.Cmn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4106Cmn extends AbstractC4178Com implements Cc7 {
    public static final AbstractC4203Cpp A00;
    public static final C4378CuY A01;
    public static final C4240CrC A02;

    static {
        C4378CuY c4378CuY = new C4378CuY();
        A01 = c4378CuY;
        C4131CnX c4131CnX = new C4131CnX();
        A00 = c4131CnX;
        A02 = new C4240CrC(c4131CnX, c4378CuY, "ClientTelemetry.API");
    }

    public C4106Cmn(Context context, C3784CeS c3784CeS) {
        super(context, c3784CeS, A02, C4276Cs4.A02);
    }

    @Override // X.Cc7
    public final CSA<Void> APt(final TelemetryData telemetryData) {
        C4231Cqf c4231CqfA00 = C4232Cqg.A00();
        c4231CqfA00.A03 = new Feature[]{AbstractC4108Cmp.A00};
        c4231CqfA00.A02 = false;
        c4231CqfA00.A01 = new InterfaceC4375CuV() { // from class: X.Cms
            @Override // X.InterfaceC4375CuV
            public final void accept(Object obj, Object obj2) {
                CSE cse = (CSE) obj2;
                zaa zaaVar = (zaa) ((AbstractC4160CoH) obj).A03();
                TelemetryData telemetryData2 = telemetryData;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(zaaVar.A01);
                if (telemetryData2 == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    telemetryData2.writeToParcel(parcelObtain, 0);
                }
                try {
                    zaaVar.A00.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                    cse.A02(null);
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        };
        return AbstractC4178Com.A02(this, c4231CqfA00.A00(), 2);
    }
}
