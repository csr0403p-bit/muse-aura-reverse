package X;

/* renamed from: X.Bqz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2987Bqz {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.media.MediaCrypto r8, android.media.MediaFormat r9, android.view.Surface r10, X.C6154Dwx r11, java.lang.Object r12, java.lang.String r13, X.InterfaceC6181DxP r14, int r15) {
        /*
            r7 = r12
            X.Dlz r0 = X.EnumC5618Dlz.A0y
            boolean r0 = X.AbstractC5653Dmh.A03(r0)
            r4 = r8
            r5 = r9
            r6 = r10
            r3 = r14
            r8 = r15
            if (r0 == 0) goto L78
            java.lang.String r0 = "meta.dav1d.av1.decoder"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L78
            java.lang.String r0 = "mime"
            java.lang.String r1 = r9.getString(r0)
            java.lang.String r0 = "video/av01"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L78
            X.DxO r0 = r11.A0S
            boolean r0 = X.C6180DxO.A03(r0)
            if (r0 == 0) goto L78
            boolean r0 = r12 instanceof X.Bp6
            if (r0 == 0) goto L78
            java.lang.String r1 = "max-input-size"
            boolean r0 = r9.containsKey(r1)
            if (r0 == 0) goto L78
            int r2 = r9.getInteger(r1)
            if (r2 <= 0) goto L78
            r1 = r7
            X.Bp6 r1 = (X.Bp6) r1
            exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting r1 = (exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting) r1
            int r0 = r1.initialInputBufferSizeBytes
            int r2 = java.lang.Math.max(r0, r2)
            r0 = 8388608(0x800000, float:1.17549435E-38)
            if (r2 > r0) goto L74
            exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting r7 = r1.withInitialInputBufferSizeBytes(r2)
            int r0 = r14.A8r()
            r1 = 0
            if (r0 < 0) goto L71
            java.nio.ByteBuffer r0 = r14.getInputBuffer(r0)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L6c
            int r0 = r0.capacity()     // Catch: java.lang.Throwable -> L66
            if (r0 < r2) goto L6c
            goto L6b
        L66:
            r0 = move-exception
            r14.flush()
            throw r0
        L6b:
            r1 = 1
        L6c:
            r14.flush()
            if (r1 != 0) goto L74
        L71:
            r14.release()
        L74:
            r3.A6q(r4, r5, r6, r7, r8)
            return
        L78:
            r3.A6q(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2987Bqz.A00(android.media.MediaCrypto, android.media.MediaFormat, android.view.Surface, X.Dwx, java.lang.Object, java.lang.String, X.DxP, int):void");
    }
}
