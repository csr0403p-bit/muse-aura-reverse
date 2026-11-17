package X;

import com.facebook.perf.background.BackgroundStartupDetector;

/* loaded from: classes5.dex */
public final class C78 implements CIQ {
    public C7F A00;

    public final synchronized void A00(C7F c7f) {
        C7F c7f2 = this.A00;
        if (c7f == null) {
            if (c7f2 != null) {
                BackgroundStartupDetector.listeners.remove(this);
            }
            c7f = null;
        } else if (c7f2 == null) {
            BackgroundStartupDetector.addListener(this);
        }
        this.A00 = c7f;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:7:0x000c, B:9:0x0010, B:10:0x0017, B:12:0x001a, B:27:0x0037, B:28:0x0039, B:30:0x003f, B:32:0x0043, B:34:0x0047, B:36:0x004b, B:41:0x0055, B:42:0x0059, B:43:0x005f, B:39:0x0051, B:38:0x004f, B:23:0x002b, B:24:0x002e, B:25:0x0031, B:26:0x0034), top: B:93:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:7:0x000c, B:9:0x0010, B:10:0x0017, B:12:0x001a, B:27:0x0037, B:28:0x0039, B:30:0x003f, B:32:0x0043, B:34:0x0047, B:36:0x004b, B:41:0x0055, B:42:0x0059, B:43:0x005f, B:39:0x0051, B:38:0x004f, B:23:0x002b, B:24:0x002e, B:25:0x0031, B:26:0x0034), top: B:93:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b5 A[Catch: all -> 0x00c6, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000b, B:48:0x0065, B:80:0x00ac, B:52:0x006c, B:54:0x0070, B:55:0x0074, B:62:0x0083, B:64:0x008b, B:66:0x008f, B:67:0x0091, B:87:0x00c3, B:81:0x00b1, B:83:0x00b5, B:84:0x00bd), top: B:96:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bd A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000b, B:48:0x0065, B:80:0x00ac, B:52:0x006c, B:54:0x0070, B:55:0x0074, B:62:0x0083, B:64:0x008b, B:66:0x008f, B:67:0x0091, B:87:0x00c3, B:81:0x00b1, B:83:0x00b5, B:84:0x00bd), top: B:96:0x0001 }] */
    @Override // X.CIQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void ASH() {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78.ASH():void");
    }
}
