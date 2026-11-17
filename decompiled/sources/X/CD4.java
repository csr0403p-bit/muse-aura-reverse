package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.File;
import java.io.IOException;

@Deprecated(since = "Use SecureFile insteadhttps://www.internalfb.com/intern/wiki/Mobile-secure-framework/strict-file/")
/* loaded from: classes5.dex */
public final class CD4 extends File {
    public static final long serialVersionUID = 1;
    public final transient CDF A00;

    public CD4(CDF cdf, File file, boolean z) {
        try {
            super(file.getPath().isEmpty() ? file.getPath() : file.getCanonicalPath());
            this.A00 = cdf;
            if (z) {
                String str = cdf.A00;
                File fileA0G = BV4.A0G(str);
                if (!fileA0G.exists()) {
                    throw new SecurityException(StringFormatUtil.formatStrLocaleSafe("FileLocationScope's path \n%s\n does not exist.", str));
                }
                if (!fileA0G.isDirectory()) {
                    throw new SecurityException(StringFormatUtil.formatStrLocaleSafe("FileLocationScope should contain a directory path but its path \n%s\n is not.", str));
                }
            }
            try {
                if (getCanonicalPath().startsWith(this.A00.A00)) {
                    return;
                }
            } catch (IOException unused) {
            }
            throw new SecurityException(StringFormatUtil.formatStrLocaleSafe("You are operating the StrictFile with the absolute path: \n%s\nHowever, the path does not locate inside the defined location scope: \n%s\n", file.getAbsolutePath(), cdf.A00));
        } catch (IOException unused2) {
            throw new SecurityException(StringFormatUtil.formatStrLocaleSafe("StrictFile cannot resolve the file's canonical path. Please make sure the path is legit. The file's absolute path is: \n%s\n", file.getAbsolutePath()));
        }
    }
}
