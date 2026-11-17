package X;

import java.io.File;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C4V implements C4U {
    public C4U A00;
    public C3280C7k A01;

    @Override // X.C4U
    public final boolean send(String str, File file, C4S c4s, Map<String, File> map, int i, C4T c4t) {
        return str.contains(FGI.A0M("bug_report", "_report.txt")) ? this.A00.send(str, file, c4s, map, i, c4t) : this.A01.send(str, file, c4s, map, i, c4t);
    }
}
