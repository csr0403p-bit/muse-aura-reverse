package androidx.glance.session;

import X.C60O;
import X.GCV;
import X.HzR;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class Session {
    public final String A00;
    public final AtomicBoolean A02 = new AtomicBoolean(true);
    public final AtomicBoolean A01 = C60O.A1E();
    public final HzR<Object> A03 = new GCV(Integer.MAX_VALUE, null);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[Catch: ClosedReceiveChannelException -> 0x0089, TryCatch #0 {ClosedReceiveChannelException -> 0x0089, blocks: (B:20:0x0053, B:21:0x0056, B:25:0x0068, B:27:0x006e, B:24:0x0065, B:19:0x004c), top: B:35:0x001e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:21:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(android.content.Context r8, X.G0U<java.lang.Object, kotlin.Unit> r9, X.HtJ<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            r6 = 2
            boolean r0 = r10 instanceof X.C8iU
            if (r0 == 0) goto L31
            r5 = r10
            X.8iU r5 = (X.C8iU) r5
            int r0 = r5.$t
            if (r0 != r6) goto L31
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L31
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r0 = r5.A04
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3c
            if (r1 != r6) goto L37
            java.lang.Object r2 = r5.A03
            X.GCW r2 = (X.GCW) r2
            java.lang.Object r9 = r5.A02
            X.G0U r9 = (X.G0U) r9
            java.lang.Object r8 = r5.A01
            android.content.Context r8 = (android.content.Context) r8
            goto L53
        L31:
            X.8iU r5 = new X.8iU
            r5.<init>(r7, r10, r6)
            goto L17
        L37:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3c:
            java.lang.Object r2 = r5.A03
            X.GCW r2 = (X.GCW) r2
            java.lang.Object r9 = r5.A02
            X.G0U r9 = (X.G0U) r9
            java.lang.Object r8 = r5.A01
            android.content.Context r8 = (android.content.Context) r8
            goto L65
        L49:
            X.Hwg.A00(r0)
            X.HzR<java.lang.Object> r0 = r7.A03     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            X.GCW r2 = r0.APO()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            goto L56
        L53:
            X.Hwg.A00(r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
        L56:
            r5.A01 = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            r5.A02 = r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            r5.A03 = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            r5.A00 = r3     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            java.lang.Object r0 = r2.A01(r5)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            if (r0 != r4) goto L68
            goto L87
        L65:
            X.Hwg.A00(r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
        L68:
            boolean r0 = X.AnonymousClass001.A1X(r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            if (r0 == 0) goto L89
            java.lang.Object r1 = r2.A00()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            r9.invoke(r1)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            r5.A01 = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            r5.A02 = r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            r5.A03 = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            r5.A00 = r6     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            r0 = r7
            androidx.glance.appwidget.AppWidgetSession r0 = (androidx.glance.appwidget.AppWidgetSession) r0     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            java.lang.Object r0 = androidx.glance.appwidget.AppWidgetSession.A01(r8, r0, r1, r5)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
            if (r0 != r4) goto L56
            goto L88
        L87:
            return r4
        L88:
            return r4
        L89:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.Session.A05(android.content.Context, X.G0U, X.HtJ):java.lang.Object");
    }

    public Session(String str) {
        this.A00 = str;
    }
}
