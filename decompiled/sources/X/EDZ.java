package X;

import android.content.Context;
import java.io.File;

/* loaded from: classes5.dex */
public final class EDZ extends EDV {
    public static EDZ A01;
    public final InterfaceC3421CMj A00;

    @Override // X.EDV
    public final File getWithoutInit(C3380CIk c3380CIk, C6537EDs c6537EDs) {
        C7384Etj.A0Y(c3380CIk, 0);
        int i = c3380CIk.A00;
        C6534EDp c6534EDpA00 = AbstractC6540EDv.A00(i);
        if (c6534EDpA00 == null || !c6534EDpA00.A00) {
            return getWithoutInit_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(i, c6537EDs);
        }
        throw C60O.A0i("Cannot use scoped paths with ContextCask");
    }

    public static final EDZ A01(Context context) {
        EDZ edz = A01;
        if (edz != null) {
            return edz;
        }
        EDZ edz2 = new EDZ(AnonymousClass001.A0I(context));
        A01 = edz2;
        return edz2;
    }

    @Override // X.EDV
    public final InterfaceC3421CMj getStorageRegistryPathFactory() {
        return this.A00;
    }

    public EDZ(Context context) {
        C3417CMf c3417CMf;
        synchronized (C3417CMf.A04) {
            c3417CMf = C3417CMf.A03;
            if (c3417CMf == null) {
                c3417CMf = new C3417CMf(context);
                C3417CMf.A03 = c3417CMf;
            }
            C7384Etj.A0X(c3417CMf);
        }
        this.A00 = c3417CMf;
    }

    @Override // X.EDV
    public final File getWithoutInit_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(int i, C6537EDs c6537EDs) {
        C6534EDp c6534EDpA00 = AbstractC6540EDv.A00(i);
        if (c6534EDpA00 == null || !c6534EDpA00.A00) {
            return super.getWithoutInit_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(i, c6537EDs);
        }
        throw C60O.A0i("Cannot use scoped paths with ContextCask");
    }
}
