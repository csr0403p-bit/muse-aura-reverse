package X;

import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: X.CoR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4166CoR implements CEF {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C4247CrJ A03;
    public final C4163CoN A04;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration A00(X.C4164CoO r5, X.AbstractC4160CoH r6, int r7) {
        /*
            com.google.android.gms.common.internal.zzk r0 = r6.A0L
            if (r0 != 0) goto L1f
            r4 = 0
        L5:
            r3 = 0
            if (r4 == 0) goto L34
            boolean r0 = r4.A02
            if (r0 == 0) goto L34
            int[] r2 = r4.A04
            if (r2 != 0) goto L22
            int[] r2 = r4.A05
            if (r2 == 0) goto L2d
            r1 = 0
        L15:
            int r0 = r2.length
            if (r1 >= r0) goto L2d
            r0 = r2[r1]
            if (r0 == r7) goto L34
            int r1 = r1 + 1
            goto L15
        L1f:
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r4 = r0.A02
            goto L5
        L22:
            r1 = 0
        L23:
            int r0 = r2.length
            if (r1 >= r0) goto L34
            r0 = r2[r1]
            if (r0 == r7) goto L2d
            int r1 = r1 + 1
            goto L23
        L2d:
            int r1 = r5.A00
            int r0 = r4.A00
            if (r1 >= r0) goto L34
            return r4
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4166CoR.A00(X.CoO, X.CoH, int):com.google.android.gms.common.internal.ConnectionTelemetryConfiguration");
    }

    @Override // X.CEF
    public final void onComplete(CSA csa) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long jCurrentTimeMillis;
        int iA04;
        C4163CoN c4163CoN = this.A04;
        if (c4163CoN.A06()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = C4353Ctv.A00().A00;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.A03) {
                C4164CoO c4164CoO = (C4164CoO) c4163CoN.A08.get(this.A03);
                if (c4164CoO != null) {
                    Object obj = c4164CoO.A04;
                    if (obj instanceof AbstractC4160CoH) {
                        AbstractC4160CoH abstractC4160CoH = (AbstractC4160CoH) obj;
                        long j = this.A01;
                        long j2 = 0;
                        boolean zA1N = AnonymousClass002.A1N((j > 0L ? 1 : (j == 0L ? 0 : -1)));
                        int i6 = abstractC4160CoH.A09;
                        if (rootTelemetryConfiguration != null) {
                            zA1N &= rootTelemetryConfiguration.A04;
                            i2 = rootTelemetryConfiguration.A01;
                            i3 = rootTelemetryConfiguration.A02;
                            i = rootTelemetryConfiguration.A00;
                            if (abstractC4160CoH.A0L != null && !abstractC4160CoH.AOH()) {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationA00 = A00(c4164CoO, abstractC4160CoH, this.A00);
                                if (connectionTelemetryConfigurationA00 == null) {
                                    return;
                                }
                                boolean z = connectionTelemetryConfigurationA00.A03 && j > 0;
                                i3 = connectionTelemetryConfigurationA00.A00;
                                zA1N = z;
                            }
                        } else {
                            i = 0;
                            i2 = 5000;
                            i3 = 100;
                        }
                        if (csa.A0C()) {
                            i4 = 0;
                            i5 = 0;
                        } else {
                            if (((CSC) csa).A05) {
                                i4 = 100;
                            } else {
                                Exception excA07 = csa.A07();
                                if (excA07 instanceof ApiException) {
                                    Status status = ((ApiException) excA07).mStatus;
                                    i4 = status.A00;
                                    ConnectionResult connectionResult = status.A02;
                                    if (connectionResult != null) {
                                        i5 = connectionResult.A01;
                                    }
                                } else {
                                    i4 = FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE;
                                }
                            }
                            i5 = -1;
                        }
                        if (zA1N) {
                            j2 = j;
                            long j3 = this.A02;
                            jCurrentTimeMillis = System.currentTimeMillis();
                            iA04 = (int) C3cG.A04(j3);
                        } else {
                            jCurrentTimeMillis = 0;
                            iA04 = -1;
                        }
                        BV4.A1D(c4163CoN.A05, new C4286CsL(new MethodInvocation(null, null, this.A00, i4, i5, i6, iA04, j2, jCurrentTimeMillis), i, i3, i2), 18);
                    }
                }
            }
        }
    }

    public C4166CoR(C4247CrJ c4247CrJ, C4163CoN c4163CoN, int i, long j, long j2) {
        this.A04 = c4163CoN;
        this.A00 = i;
        this.A03 = c4247CrJ;
        this.A01 = j;
        this.A02 = j2;
    }
}
