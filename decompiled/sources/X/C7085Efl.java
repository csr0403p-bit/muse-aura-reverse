package X;

import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* renamed from: X.Efl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7085Efl implements InterfaceC7089Efs {
    public final C7101EgF A00;
    public final InterfaceC7005EeA<File> A01;
    public final String A02;
    public volatile C7094Eg0 A03 = new C7094Eg0(null, null);

    private final synchronized InterfaceC7089Efs A00() {
        InterfaceC7089Efs interfaceC7089Efs;
        File file;
        C7094Eg0 c7094Eg0 = this.A03;
        if (c7094Eg0.A00 == null || (file = c7094Eg0.A01) == null || !file.exists()) {
            if (this.A03.A00 != null && this.A03.A01 != null) {
                EDB.A00(this.A03.A01);
            }
            File fileA0O = C3cG.A0O(this.A01.get(), this.A02);
            try {
                Efq.A00(fileA0O);
                fileA0O.getAbsolutePath();
                this.A03 = new C7094Eg0(new C7083Efj(this.A00, fileA0O), fileA0O);
            } catch (FileUtils$CreateDirectoryException e) {
                throw e;
            }
        }
        interfaceC7089Efs = this.A03.A00;
        interfaceC7089Efs.getClass();
        return interfaceC7089Efs;
    }

    public C7085Efl(C7101EgF c7101EgF, InterfaceC7005EeA interfaceC7005EeA, String str) {
        this.A00 = c7101EgF;
        this.A01 = interfaceC7005EeA;
        this.A02 = str;
    }

    @Override // X.InterfaceC7089Efs
    public final Collection AFF() {
        return A00().AFF();
    }

    @Override // X.InterfaceC7089Efs
    public final C7093Efz AJj(Object obj, String str) {
        return A00().AJj(obj, str);
    }

    @Override // X.InterfaceC7089Efs
    public final C7091Efx ANi(Object obj, String str) {
        return A00().ANi(obj, str);
    }

    @Override // X.InterfaceC7089Efs
    public final void AYi() {
        try {
            A00().AYi();
        } catch (IOException e) {
            CFL cfl = AbstractC3422CMk.A00;
            if (CFL.A02(cfl)) {
                cfl.e(C7085Efl.class.getSimpleName(), "purgeUnexpectedResources", e);
            }
        }
    }

    @Override // X.InterfaceC7089Efs
    public final long AaV(C7088Efr c7088Efr) {
        return A00().AaV(c7088Efr);
    }

    @Override // X.InterfaceC7089Efs
    public final long AaW(String str) {
        return A00().AaW(str);
    }

    @Override // X.InterfaceC7089Efs
    public final boolean isExternal() {
        try {
            return A00().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }
}
