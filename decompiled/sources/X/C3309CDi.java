package X;

import java.util.Set;

/* renamed from: X.CDi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3309CDi {
    public final Integer A00;
    public final Set<String> A01;

    public C3309CDi(Integer num, Set set) {
        C7384Etj.A0Y(set, 0);
        this.A01 = set;
        this.A00 = num;
    }

    public final String toString() {
        String str;
        Set<String> set = this.A01;
        Integer num = this.A00;
        StringBuilder sbA0f = C3cG.A0f(set, "RequestAction{modules=");
        sbA0f.append(C8j2.A00(7));
        switch (num.intValue()) {
            case 0:
                str = "DOWNLOAD";
                break;
            case 1:
                str = "LOAD";
                break;
            case 2:
                str = "DEFERRED_DOWNLOAD";
                break;
            case 3:
                str = "UNINSTALL";
                break;
            case 4:
                str = "COMPLETE_SUCCESS";
                break;
            case 5:
            default:
                str = "LOAD_MODULE_METADATA_FAIL";
                break;
            case 6:
                str = "NETWORK_FAIL";
                break;
            case 7:
                str = "INVALID_MODULE_FAIL";
                break;
            case 8:
                str = "UNDEFINED_PACKAGING_FAIL";
                break;
            case 9:
                str = "DOWNLOAD_DISABLED_FAIL";
                break;
            case 10:
                str = "MODULES_REMOTE_FAIL";
                break;
        }
        sbA0f.append(str);
        return BV7.A11(sbA0f);
    }
}
