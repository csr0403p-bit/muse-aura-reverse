package X;

/* renamed from: X.Edp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6989Edp implements InterfaceC7026EeX {
    public final boolean A00;

    @Override // X.InterfaceC7026EeX
    public final boolean canResize(C6988Edo c6988Edo, C1bk c1bk, C7481Exe c7481Exe) {
        C7384Etj.A0Y(c6988Edo, 0);
        if (c1bk == null) {
            c1bk = C1bk.A01;
        }
        return this.A00 && AbstractC6995Edw.A00(c7481Exe, c1bk, c6988Edo, 2048) > 1;
    }

    @Override // X.InterfaceC7026EeX
    public final boolean canTranscode(C7003Ee6 c7003Ee6) {
        C7384Etj.A0Y(c7003Ee6, 0);
        return c7003Ee6 == AbstractC6994Edv.A05 || c7003Ee6 == AbstractC6994Edv.A07;
    }

    @Override // X.InterfaceC7026EeX
    public final String getIdentifier() {
        return "SimpleImageTranscoder";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1 A[Catch: OutOfMemoryError -> 0x00fc, all -> 0x0114, TRY_ENTER, TryCatch #0 {all -> 0x0114, blocks: (B:46:0x00b1, B:52:0x00be, B:65:0x00df, B:70:0x00ee, B:73:0x00f6, B:72:0x00f4, B:71:0x00f1, B:75:0x00fd, B:47:0x00b4, B:49:0x00b8, B:51:0x00bc, B:53:0x00c8, B:55:0x00cc, B:57:0x00d0, B:59:0x00d4, B:61:0x00d8), top: B:84:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1 A[Catch: OutOfMemoryError -> 0x00fc, all -> 0x0114, TryCatch #0 {all -> 0x0114, blocks: (B:46:0x00b1, B:52:0x00be, B:65:0x00df, B:70:0x00ee, B:73:0x00f6, B:72:0x00f4, B:71:0x00f1, B:75:0x00fd, B:47:0x00b4, B:49:0x00b8, B:51:0x00bc, B:53:0x00c8, B:55:0x00cc, B:57:0x00d0, B:59:0x00d4, B:61:0x00d8), top: B:84:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // X.InterfaceC7026EeX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C6997Edy transcode(X.C6988Edo r16, java.io.OutputStream r17, X.C1bk r18, X.C7481Exe r19, X.C7003Ee6 r20, java.lang.Integer r21, android.graphics.ColorSpace r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6989Edp.transcode(X.Edo, java.io.OutputStream, X.1bk, X.Exe, X.Ee6, java.lang.Integer, android.graphics.ColorSpace):X.Edy");
    }

    public C6989Edp(boolean z) {
        this.A00 = z;
    }
}
