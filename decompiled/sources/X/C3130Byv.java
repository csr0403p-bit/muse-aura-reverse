package X;

import java.io.File;

/* renamed from: X.Byv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3130Byv {
    public final File A00;
    public final File A01;

    public C3130Byv(File file) {
        this.A01 = file;
        this.A00 = BV5.A0K(file.getPath(), ".bak");
    }
}
