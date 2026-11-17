package X;

/* renamed from: X.Bo3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2891Bo3 implements Runnable {
    public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda10";
    public final /* synthetic */ long A00;
    public final /* synthetic */ Bo1 A01;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            X.Bo1 r3 = r9.A01
            long r6 = r9.A00
            java.lang.Integer r2 = r3.A04
            int r1 = r2.intValue()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = 0
            switch(r1) {
                case 0: goto L22;
                case 1: goto La7;
                case 2: goto L4a;
                case 3: goto L1e;
                case 4: goto La7;
                case 5: goto L1e;
                case 6: goto Ld9;
                case 7: goto La7;
                case 8: goto Ld9;
                default: goto L13;
            }
        L13:
            java.lang.String r1 = "Unknown state: "
            java.lang.String r0 = X.AbstractC2828BmV.A00(r2)
            java.lang.IllegalStateException r0 = X.BV5.A0U(r1, r0)
            throw r0
        L1e:
            java.lang.Integer r0 = X.C79.A0P
            goto La4
        L22:
            r3.A05 = r0
            java.lang.String r2 = r3.A0L
            java.lang.String r1 = "Start on "
            java.lang.String r0 = X.AbstractC2993BrL.A00(r6)
            X.AbstractC2875Bni.A04(r1, r0, r2)
            boolean r0 = r3.A09     // Catch: android.media.MediaCodec.CodecException -> Ld4
            if (r0 == 0) goto L36
            X.Bo1.A01(r3)     // Catch: android.media.MediaCodec.CodecException -> Ld4
        L36:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch: android.media.MediaCodec.CodecException -> Ld4
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: android.media.MediaCodec.CodecException -> Ld4
            android.util.Range r0 = android.util.Range.create(r1, r0)     // Catch: android.media.MediaCodec.CodecException -> Ld4
            r3.A01 = r0     // Catch: android.media.MediaCodec.CodecException -> Ld4
            android.media.MediaCodec r0 = r3.A0D     // Catch: android.media.MediaCodec.CodecException -> Ld4
            r0.start()     // Catch: android.media.MediaCodec.CodecException -> Ld4
            goto La2
        L4a:
            r3.A05 = r0
            java.util.Deque<android.util.Range<java.lang.Long>> r5 = r3.A0M
            java.lang.Object r4 = r5.removeLast()
            android.util.Range r4 = (android.util.Range) r4
            if (r4 == 0) goto L63
            java.lang.Comparable r0 = r4.getUpper()
            long r1 = X.C3cG.A05(r0)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L64
        L63:
            r1 = 0
        L64:
            java.lang.String r0 = "There should be a \"pause\" before \"resume\""
            X.BeS.A07(r1, r0)
            java.lang.Comparable r1 = r4.getLower()
            java.lang.Long r1 = (java.lang.Long) r1
            long r8 = r1.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            android.util.Range r0 = android.util.Range.create(r1, r0)
            r5.addLast(r0)
            java.lang.String r5 = r3.A0L
            java.lang.String r4 = "Resume on "
            java.lang.String r2 = X.AbstractC2993BrL.A00(r6)
            java.lang.String r1 = "\nPaused duration = "
            long r6 = r6 - r8
            java.lang.String r0 = X.AbstractC2993BrL.A00(r6)
            java.lang.String r0 = X.FGI.A0d(r4, r2, r1, r0)
            X.AbstractC2875Bni.A01(r5, r0)
            boolean r4 = r3.A0S
            if (r4 != 0) goto La8
            java.lang.Class<androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk> r1 = androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class
            X.Bch r0 = X.AbstractC2411BaU.A00
            X.BX1 r0 = r0.A01(r1)
            if (r0 == 0) goto Lc2
        La2:
            java.lang.Integer r0 = X.C79.A01
        La4:
            X.Bo1.A02(r3, r0)
        La7:
            return
        La8:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk> r1 = androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class
            X.Bch r0 = X.AbstractC2411BaU.A00
            X.BX1 r0 = r0.A01(r1)
            if (r0 == 0) goto Lc2
        Lb2:
            android.os.Bundle r2 = X.BV6.A0N()
            java.lang.String r1 = "request-sync"
            r0 = 0
            r2.putInt(r1, r0)
            android.media.MediaCodec r0 = r3.A0D
            r0.setParameters(r2)
            goto La2
        Lc2:
            r2 = 0
            android.os.Bundle r1 = X.BV6.A0N()
            java.lang.String r0 = "drop-input-frames"
            r1.putInt(r0, r2)
            android.media.MediaCodec r0 = r3.A0D
            r0.setParameters(r1)
            if (r4 == 0) goto La2
            goto Lb2
        Ld4:
            r0 = move-exception
            r3.A06(r0)
            return
        Ld9:
            java.lang.String r0 = "Encoder is released"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2891Bo3.run():void");
    }

    public /* synthetic */ RunnableC2891Bo3(Bo1 bo1, long j) {
        this.A01 = bo1;
        this.A00 = j;
    }
}
