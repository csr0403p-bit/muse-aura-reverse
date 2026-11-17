package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.Dlq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5611Dlq {
    public C5857Dqr A00;
    public boolean A01 = false;
    public final InterfaceC5923DsA A02;
    public final DDR A03;
    public final C1U A04;
    public final BY2 A05;
    public final HeroPlayerSetting A06;
    public final boolean A07;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(android.net.Uri r11, X.C5611Dlq r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r4 = 0
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r12.A06
            boolean r5 = r0.splitLastSegmentCachekey
            boolean r6 = r0.skipThumbnailCacheKey
            boolean r7 = r0.hashCacheKey
            X.Dlv r1 = r0.gen
            boolean r8 = r1.enable_shortern_uri_cache_key
            boolean r0 = r1.enable_short_cache_key
            if (r0 != 0) goto L16
            boolean r0 = r1.enable_short_cache_key_igfbidv2
            r9 = 0
            if (r0 == 0) goto L17
        L16:
            r9 = 1
        L17:
            boolean r10 = r1.always_consider_exokey_in_cache_key
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            java.lang.String r0 = X.AbstractC3426CMt.A01(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5611Dlq.A00(android.net.Uri, X.Dlq, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public C5611Dlq(InterfaceC5923DsA interfaceC5923DsA, DDR ddr, C1U c1u, BY2 by2, HeroPlayerSetting heroPlayerSetting) {
        this.A03 = ddr;
        this.A02 = interfaceC5923DsA;
        Dlv dlv = heroPlayerSetting.gen;
        this.A07 = dlv.reinit_cached_init_segments_on_new_period;
        this.A04 = c1u;
        this.A06 = heroPlayerSetting;
        this.A05 = dlv.correct_sponsored_content_type_attribution ? by2 : BY2.GENERAL;
    }
}
