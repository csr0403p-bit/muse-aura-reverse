package X;

import com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class CFZ extends AbstractC3333CFc {
    public final C4B<Object> A00;
    public final File A01;
    public final String A02;
    public final Pattern A03;
    public final DefaultFalcoAcsProvider A04;

    @Override // X.InterfaceC3363CHh
    public final boolean AfZ() {
        return false;
    }

    @Override // X.InterfaceC3363CHh
    public final String getFFDBToken() {
        return this.A02;
    }

    public CFZ(DefaultFalcoAcsProvider defaultFalcoAcsProvider, C3336CFf c3336CFf, C4B c4b, File file, String str) {
        super(c3336CFf, file);
        this.A03 = Pattern.compile(C4931DFd.FALCO_ACS_PLACEHOLDER_CLAIM);
        this.A01 = file;
        this.A00 = c4b;
        this.A04 = defaultFalcoAcsProvider;
        this.A02 = str;
    }
}
