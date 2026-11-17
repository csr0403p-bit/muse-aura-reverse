package libraries.accessv2.src.provider;

import X.EHW;
import X.EHZ;
import X.EHc;

/* loaded from: classes5.dex */
public final class AccessLibraryContentProvider extends EHW {
    public static final String[] A02 = {"credential_source", "user_data_json", "generic_data_json", "timestamp"};
    public final EHc A00;
    public final EHc A01;

    public AccessLibraryContentProvider(int i) {
        EHZ ehz = EHZ.A00;
        this.A00 = ehz;
        this.A01 = ehz;
    }

    public AccessLibraryContentProvider() {
        this(0);
    }
}
