package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* loaded from: classes5.dex */
public final class E0X implements E0V {
    public final /* synthetic */ HeroPlayerSetting A00;

    public E0X(HeroPlayerSetting heroPlayerSetting) {
        this.A00 = heroPlayerSetting;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // X.E0V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.E09 A7j(X.C6154Dwx r5) {
        /*
            r4 = this;
            java.lang.String r3 = r5.A0b
            java.lang.String r1 = "Attempted to create decoder for unsupported format"
            if (r3 == 0) goto L9c
            int r0 = r3.hashCode()
            switch(r0) {
                case 930165504: goto L2f;
                case 1566015601: goto L32;
                case 1566016562: goto L47;
                case 1668750253: goto L59;
                default: goto Ld;
            }
        Ld:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L20
            X.E0m r0 = new X.E0m
            r0.<init>()
        L1a:
            X.E0Z r4 = new X.E0Z
            r4.<init>(r0)
            return r4
        L20:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L73
            X.E1Y r0 = new X.E1Y
            r0.<init>()
            goto L1a
        L2f:
            java.lang.String r0 = "application/x-mp4-cea-608"
            goto L34
        L32:
            java.lang.String r0 = "application/cea-608"
        L34:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Ld
            int r2 = r5.A03
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.E0N r4 = new X.E0N
            r4.<init>(r3, r2, r0)
            return r4
        L47:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Ld
            int r1 = r5.A03
            java.util.List<byte[]> r0 = r5.A0c
            X.E1v r4 = new X.E1v
            r4.<init>(r1, r0)
            return r4
        L59:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Ld
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r4.A00
            boolean r0 = r0.sortSubripSubtitles
            if (r0 == 0) goto L6d
            X.E0c r4 = new X.E0c
            r4.<init>()
            return r4
        L6d:
            X.E0b r0 = new X.E0b
            r0.<init>()
            goto L1a
        L73:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L86
            X.E1e r1 = new X.E1e
            r1.<init>()
        L80:
            X.E0Z r4 = new X.E0Z
            r4.<init>(r1)
            return r4
        L86:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L97
            java.util.List<byte[]> r0 = r5.A0c
            X.E1L r1 = new X.E1L
            r1.<init>(r0)
            goto L80
        L97:
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r1)
            throw r0
        L9c:
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0X.A7j(X.Dwx):X.E09");
    }

    @Override // X.E0V
    public final boolean Agg(C6154Dwx c6154Dwx) {
        String str = c6154Dwx.A0b;
        return "application/x-mp4-vtt".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "text/vtt".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "text/x-ssa".equals(str) || "application/cea-708".equals(str);
    }
}
