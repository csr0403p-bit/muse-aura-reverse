package X;

import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.Device;
import android.health.connect.datatypes.Metadata;

/* renamed from: X.FyA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9083FyA {
    public static final DataOrigin A00(C9012Fwp c9012Fwp) {
        C7384Etj.A0Y(c9012Fwp, 0);
        DataOrigin.Builder builder = new DataOrigin.Builder();
        builder.setPackageName(c9012Fwp.A00);
        DataOrigin dataOriginBuild = builder.build();
        C7384Etj.A0U(dataOriginBuild);
        return dataOriginBuild;
    }

    public static final Metadata A01(C9086FyD c9086FyD) {
        Device deviceBuild;
        Metadata.Builder builder = new Metadata.Builder();
        C10457Hje c10457Hje = c9086FyD.A03;
        if (c10457Hje != null) {
            Device.Builder builder2 = new Device.Builder();
            String str = c10457Hje.A01;
            if (str != null) {
                builder2.setManufacturer(str);
            }
            String str2 = c10457Hje.A02;
            if (str2 != null) {
                builder2.setModel(str2);
            }
            try {
                Number number = (Number) BV5.A0f(AbstractC9055Fxd.A0S, c10457Hje.A00);
                deviceBuild = builder2.setType(number != null ? number.intValue() : 0).build();
                C7384Etj.A0X(deviceBuild);
            } catch (IllegalArgumentException unused) {
                deviceBuild = builder2.setType(AbstractC7611F5y.A0D(AbstractC9055Fxd.A0S, 0)).build();
                C7384Etj.A0X(deviceBuild);
            }
            builder.setDevice(deviceBuild);
        }
        builder.setLastModifiedTime(c9086FyD.A06);
        builder.setId(c9086FyD.A05);
        builder.setDataOrigin(A00(c9086FyD.A02));
        builder.setClientRecordId(c9086FyD.A04);
        builder.setClientRecordVersion(c9086FyD.A01);
        builder.setRecordingMethod(AbstractC7611F5y.A0D(AbstractC9055Fxd.A0Z, c9086FyD.A00));
        Metadata metadataBuild = builder.build();
        C7384Etj.A0U(metadataBuild);
        return metadataBuild;
    }
}
