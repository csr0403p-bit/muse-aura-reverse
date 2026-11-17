package X;

import java.io.File;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class CEW implements C3b6<File> {
    public final File A00;

    @Override // X.C3b6
    public final Iterator<File> iterator() {
        return new CEZ(this);
    }

    public CEW(File file) {
        this.A00 = file;
    }
}
