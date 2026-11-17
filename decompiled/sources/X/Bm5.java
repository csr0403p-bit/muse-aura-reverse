package X;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class Bm5 implements AutoCloseable {
    public final C2836Bmf A01 = C2836Bmf.A00();
    public final AtomicBoolean A02 = BV4.A12(false);
    public final AtomicReference<InterfaceC2856Bn2> A05 = BV4.A16(null);
    public final AtomicReference A04 = BV4.A16(null);
    public final AtomicReference<BeM<Uri>> A06 = BV4.A16(new C7574F4n(2));
    public final AtomicBoolean A03 = BV4.A12(false);
    public final C2680Bhd<Boolean> A00 = new C2680Bhd<>(false);

    public final void A00(Uri uri) {
        if (this.A02.get()) {
            BeM beM = (BeM) C8j3.A10(this.A06);
            if (beM == null) {
                throw BV4.A0N(AnonymousClass001.A0v(" has already been finalized", C3cG.A0f(this, "Recording ")));
            }
            this.A01.A00.close();
            beM.accept(uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(final X.AbstractC2832Bmb r7) {
        /*
            r6 = this;
            X.Bmk r1 = r7.A00
            r4 = r6
            X.BmG r4 = (X.BmG) r4
            X.Bmk r2 = r4.A01
            boolean r0 = X.C6xC.A00(r1, r2)
            if (r0 == 0) goto L7c
            java.lang.String r1 = "Sending VideoRecordEvent "
            java.lang.String r0 = X.C3cI.A0Y(r7)
            java.lang.String r5 = X.FGI.A0M(r1, r0)
            boolean r3 = r7 instanceof X.BmO
            if (r3 == 0) goto L35
            r0 = r7
            X.BmO r0 = (X.BmO) r0
            int r0 = r0.A00
            if (r0 == 0) goto L35
            switch(r0) {
                case 1: goto L69;
                case 2: goto L66;
                case 3: goto L25;
                case 4: goto L63;
                case 5: goto L60;
                case 6: goto L5d;
                case 7: goto L5a;
                case 8: goto L57;
                default: goto L25;
            }
        L25:
            java.lang.String r0 = "ERROR_RECORDING_GARBAGE_COLLECTED"
        L27:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = " [error: %s]"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r5 = X.FGI.A0M(r5, r0)
        L35:
            java.lang.String r2 = "Recorder"
            X.AbstractC2875Bni.A01(r2, r5)
            boolean r0 = r7 instanceof X.C2852Bmx
            if (r0 != 0) goto L53
            boolean r0 = r7 instanceof X.C2851Bmw
            if (r0 != 0) goto L44
            if (r3 == 0) goto L4e
        L44:
            X.Bhd<java.lang.Boolean> r1 = r6.A00
            r0 = 0
        L47:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C2680Bhd.A01(r1, r0)
        L4e:
            java.util.concurrent.Executor r1 = r4.A03
            if (r1 == 0) goto L7b
            goto L6c
        L53:
            X.Bhd<java.lang.Boolean> r1 = r6.A00
            r0 = 1
            goto L47
        L57:
            java.lang.String r0 = "ERROR_NO_VALID_DATA"
            goto L27
        L5a:
            java.lang.String r0 = "ERROR_RECORDER_ERROR"
            goto L27
        L5d:
            java.lang.String r0 = "ERROR_ENCODING_FAILED"
            goto L27
        L60:
            java.lang.String r0 = "ERROR_INVALID_OUTPUT_OPTIONS"
            goto L27
        L63:
            java.lang.String r0 = "ERROR_SOURCE_INACTIVE"
            goto L27
        L66:
            java.lang.String r0 = "ERROR_FILE_SIZE_LIMIT_REACHED"
            goto L27
        L69:
            java.lang.String r0 = "ERROR_UNKNOWN"
            goto L27
        L6c:
            X.BmU r0 = new X.BmU     // Catch: java.util.concurrent.RejectedExecutionException -> L75
            r0.<init>()     // Catch: java.util.concurrent.RejectedExecutionException -> L75
            r1.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L75
            return
        L75:
            r1 = move-exception
            java.lang.String r0 = "The callback executor is invalid."
            X.AbstractC2875Bni.A05(r2, r0, r1)
        L7b:
            return
        L7c:
            java.lang.String r0 = "Attempted to update event listener with event from incorrect recording [Recording: "
            java.lang.StringBuilder r1 = X.C3cG.A0f(r1, r0)
            java.lang.String r0 = ", Expected: "
            r1.append(r0)
            java.lang.String r0 = X.BV8.A0u(r2, r1)
            java.lang.AssertionError r0 = X.BV4.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bm5.A01(X.Bmb):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        A00(Uri.EMPTY);
    }

    public final void finalize() {
        InterfaceC2839Bmi interfaceC2839Bmi = this.A01.A00;
        interfaceC2839Bmi.AiO();
        BeM beM = (BeM) C8j3.A10(this.A06);
        if (beM != null) {
            Uri uri = Uri.EMPTY;
            interfaceC2839Bmi.close();
            beM.accept(uri);
        }
    }
}
