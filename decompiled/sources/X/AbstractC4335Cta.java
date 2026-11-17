package X;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: X.Cta, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4335Cta {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature A02;
    public static final Feature A03;
    public static final Feature A04;
    public static final Feature A05;
    public static final Feature A06;
    public static final Feature A07;
    public static final Feature A08;
    public static final Feature A09;
    public static final Feature A0A;
    public static final Feature A0B;
    public static final Feature A0C;
    public static final Feature A0D;
    public static final Feature[] A0E;

    static {
        Feature featureA03 = AbstractSafeParcelable.A03("GET_CREDENTIAL", 1L);
        A00 = featureA03;
        Feature featureA032 = AbstractSafeParcelable.A03("CREDENTIAL_REGISTRY", 1L);
        A01 = featureA032;
        Feature featureA033 = AbstractSafeParcelable.A03("CLEAR_REGISTRY", 2L);
        A02 = featureA033;
        Feature featureA034 = AbstractSafeParcelable.A03("CLEAR_CREATION_OPTIONS", 1L);
        A03 = featureA034;
        Feature featureA035 = AbstractSafeParcelable.A03("CLEAR_CREDENTIAL_STATE", 1L);
        A04 = featureA035;
        Feature featureA036 = AbstractSafeParcelable.A03("CREATE_CREDENTIAL", 3L);
        A05 = featureA036;
        Feature featureA037 = AbstractSafeParcelable.A03("REGISTER_CREATION_OPTIONS", 1L);
        A06 = featureA037;
        Feature featureA038 = AbstractSafeParcelable.A03("REGISTER_EXPORT", 1L);
        A07 = featureA038;
        Feature featureA039 = AbstractSafeParcelable.A03("IMPORT_CREDENTIALS", 1L);
        A08 = featureA039;
        Feature featureA0310 = AbstractSafeParcelable.A03("SIGNAL_CREDENTIAL_STATE", 1L);
        A09 = featureA0310;
        Feature featureA0311 = AbstractSafeParcelable.A03("CLEAR_EXPORT", 1L);
        A0A = featureA0311;
        Feature featureA0312 = AbstractSafeParcelable.A03("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L);
        A0B = featureA0312;
        Feature featureA0313 = AbstractSafeParcelable.A03("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L);
        A0C = featureA0313;
        Feature featureA0314 = AbstractSafeParcelable.A03("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L);
        A0D = featureA0314;
        A0E = new Feature[]{featureA03, featureA032, featureA033, featureA034, featureA035, featureA036, featureA037, featureA038, featureA039, featureA0310, featureA0311, featureA0312, featureA0313, featureA0314};
    }
}
