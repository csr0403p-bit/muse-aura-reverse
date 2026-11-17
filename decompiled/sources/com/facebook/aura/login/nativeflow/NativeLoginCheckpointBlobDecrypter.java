package com.facebook.aura.login.nativeflow;

import X.BFI;
import X.C3cG;
import X.C7384Etj;
import X.DCl;
import X.FGI;
import X.G0U;
import X.HxE;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes3.dex */
public final class NativeLoginCheckpointBlobDecrypter {
    /* JADX WARN: Multi-variable type inference failed */
    public static final CharSequence formBody$lambda$0(NativeLoginCheckpointBlobDecrypter nativeLoginCheckpointBlobDecrypter, HxE hxE) {
        C7384Etj.A0Y(hxE, 1);
        return FGI.A0U(nativeLoginCheckpointBlobDecrypter.formEncode((String) hxE.first), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, nativeLoginCheckpointBlobDecrypter.formEncode((String) hxE.second));
    }

    private final byte[] formBody(HxE<String, String>... hxEArr) {
        return C3cG.A1S(BFI.A0B("&", "", "", new G0U() { // from class: com.facebook.aura.login.nativeflow.NativeLoginCheckpointBlobDecrypter$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return NativeLoginCheckpointBlobDecrypter.formBody$lambda$0(this.f$0, (HxE) obj);
            }
        }, hxEArr));
    }

    private final String formEncode(String str) throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(str, DCl.A05.name());
        C7384Etj.A0U(strEncode);
        return strEncode;
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0148: IGET (r1 I:int) = (r7 I:com.facebook.aura.network.transport.HatchHttpResponse) A[Catch: all -> 0x0156, CancellationException -> 0x0161, TRY_ENTER] (LINE:328) com.facebook.aura.network.transport.HatchHttpResponse.statusCode int, block:B:46:0x0148 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0139 A[Catch: all -> 0x0147, CancellationException -> 0x0154, TryCatch #3 {CancellationException -> 0x0154, all -> 0x0147, blocks: (B:39:0x012e, B:40:0x0131, B:42:0x0139, B:32:0x00fd, B:34:0x0103, B:36:0x0111), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146 A[RETURN] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.facebook.aura.network.transport.HatchHttpResponse] */
    /* renamed from: decrypt-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1275decrypt0E7RQCE(java.lang.String r26, java.lang.String r27, X.HtJ<? super X.HsJ<java.lang.String>> r28) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCheckpointBlobDecrypter.m1275decrypt0E7RQCE(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
