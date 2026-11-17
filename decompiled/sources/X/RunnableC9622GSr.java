package X;

import kotlin.Unit;

/* renamed from: X.GSr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9622GSr implements Runnable {
    public static final String __redex_internal_original_name = "AudioRecordingStateTracker$notifyExactRecordingSilencedListeners$1$1$1$1";
    public final /* synthetic */ GSw A00;
    public final /* synthetic */ C9621GSq A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ HxE<Long, Long> A03;
    public final /* synthetic */ G0U<Boolean, Unit> A04;

    /* JADX WARN: Incorrect types in method signature: (LX/GSq;LX/G0U<-Ljava/lang/Boolean;Lkotlin/Unit;>;LX/GSw;LX/HxE<Ljava/lang/Long;Ljava/lang/Long;>;Ljava/lang/Integer;)V */
    public RunnableC9622GSr(GSw gSw, C9621GSq c9621GSq, Integer num, HxE hxE, G0U g0u) {
        this.A01 = c9621GSq;
        this.A04 = g0u;
        this.A00 = gSw;
        this.A03 = hxE;
        this.A02 = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[Catch: all -> 0x00a4, TRY_ENTER, TryCatch #0 {all -> 0x00a4, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x0023, B:9:0x002f, B:10:0x0035, B:12:0x003b, B:14:0x0048, B:16:0x004e, B:18:0x0052, B:20:0x005a, B:25:0x0065, B:30:0x006f, B:33:0x0075, B:34:0x0084, B:36:0x0090), top: B:42:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #0 {all -> 0x00a4, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x0023, B:9:0x002f, B:10:0x0035, B:12:0x003b, B:14:0x0048, B:16:0x004e, B:18:0x0052, B:20:0x005a, B:25:0x0065, B:30:0x006f, B:33:0x0075, B:34:0x0084, B:36:0x0090), top: B:42:0x000f }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            X.GSq r8 = r10.A01
            java.util.concurrent.locks.ReentrantLock r4 = r8.A0D
            X.G0U<java.lang.Boolean, kotlin.Unit> r5 = r10.A04
            X.GSw r7 = r10.A00
            X.HxE<java.lang.Long, java.lang.Long> r3 = r10.A03
            java.lang.Integer r6 = r10.A02
            r4.lock()
            java.util.Map<X.G0U<java.lang.Boolean, kotlin.Unit>, X.GSw> r0 = r8.A0B     // Catch: java.lang.Throwable -> La4
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> La4
            if (r0 != r7) goto La0
            long r0 = r7.A00     // Catch: java.lang.Throwable -> La4
            A r2 = r3.first     // Catch: java.lang.Throwable -> La4
            long r9 = X.C3cG.A05(r2)     // Catch: java.lang.Throwable -> La4
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto La0
            long r1 = r8.A01     // Catch: java.lang.Throwable -> La4
            B r0 = r3.second     // Catch: java.lang.Throwable -> La4
            long r9 = X.C3cG.A05(r0)     // Catch: java.lang.Throwable -> La4
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto La0
            java.util.List<android.media.AudioRecordingConfiguration> r0 = r8.A04     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> La4
        L35:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L62
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> La4
            r0 = r2
            android.media.AudioRecordingConfiguration r0 = (android.media.AudioRecordingConfiguration) r0     // Catch: java.lang.Throwable -> La4
            int r1 = r0.getClientAudioSessionId()     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L35
            int r0 = r6.intValue()     // Catch: java.lang.Throwable -> La4
            if (r1 != r0) goto L35
        L4e:
            android.media.AudioRecordingConfiguration r2 = (android.media.AudioRecordingConfiguration) r2     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto La0
            boolean r0 = r2.isClientSilenced()     // Catch: java.lang.Throwable -> La4
            r6 = 1
            r9 = 0
            if (r0 == 0) goto L64
            boolean r0 = X.C9621GSq.A01(r2, r8)     // Catch: java.lang.Throwable -> La4
            r1 = 1
            if (r0 != 0) goto L65
            goto L64
        L62:
            r2 = 0
            goto L4e
        L64:
            r1 = 0
        L65:
            boolean r0 = r2.isClientSilenced()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L6e
            if (r1 != 0) goto L6e
            goto L6f
        L6e:
            r6 = 0
        L6f:
            boolean r0 = r7.A02     // Catch: java.lang.Throwable -> La4
            java.lang.String r3 = "AudioRecordingStateTracker"
            if (r0 == r1) goto L84
            r7.A02 = r1     // Catch: java.lang.Throwable -> La4
            X.GXn r2 = r8.A09     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "Silence ignored, mic held by another capture: "
            java.lang.String r1 = X.FGI.A0r(r0, r1)     // Catch: java.lang.Throwable -> La4
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> La4
            r2.AiN(r3, r1, r0)     // Catch: java.lang.Throwable -> La4
        L84:
            java.lang.Boolean r0 = r7.A01     // Catch: java.lang.Throwable -> La4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> La4
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto La0
            r7.A01 = r2     // Catch: java.lang.Throwable -> La4
            X.GXn r1 = r8.A09     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "isAudioDisabledBySystem - scoped callback "
            java.lang.String r0 = X.FGI.A0r(r0, r6)     // Catch: java.lang.Throwable -> La4
            X.InterfaceC9648GXn.A00(r1, r0)     // Catch: java.lang.Throwable -> La4
            r5.invoke(r2)     // Catch: java.lang.Throwable -> La4
        La0:
            r4.unlock()
            return
        La4:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC9622GSr.run():void");
    }
}
