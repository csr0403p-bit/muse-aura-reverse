package X;

import com.facebook.aura.common.prefs.AuraPrefsStorage;
import java.io.File;
import java.util.List;

/* renamed from: X.Efn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7087Efn implements Eg4 {
    public final List A00 = C3cG.A0h();
    public final /* synthetic */ C7083Efj A01;

    public C7087Efn(C7083Efj c7083Efj) {
        this.A01 = c7083Efj;
    }

    @Override // X.Eg4
    public final void AiK(File file) {
        C7083Efj c7083Efj = this.A01;
        C7384Etj.A0X(file);
        String name = file.getName();
        C7384Etj.A0X(name);
        int iA09 = C7BY.A09(name, '.', name.length() - 1);
        if (iA09 > 0) {
            String strSubstring = name.substring(iA09);
            String str = ".cnt";
            if (!".cnt".equals(strSubstring)) {
                str = AuraPrefsStorage.TEMP_FILE_SUFFIX;
                if (!AuraPrefsStorage.TEMP_FILE_SUFFIX.equals(strSubstring)) {
                    return;
                }
            }
            String strSubstring2 = name.substring(0, iA09);
            if (str.equals(AuraPrefsStorage.TEMP_FILE_SUFFIX)) {
                int iA092 = C7BY.A09(strSubstring2, '.', strSubstring2.length() - 1);
                if (iA092 <= 0) {
                    return;
                } else {
                    strSubstring2 = strSubstring2.substring(0, iA092);
                }
            }
            if (BV4.A0G(C7083Efj.A00(c7083Efj, strSubstring2)).equals(file.getParentFile()) && str == ".cnt") {
                this.A00.add(new C7088Efr(file, strSubstring2));
            }
        }
    }

    @Override // X.Eg4
    public final void AYG(File file) {
    }

    @Override // X.Eg4
    public final void AYI(File file) {
    }
}
