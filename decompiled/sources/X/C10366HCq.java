package X;

import android.util.Base64;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.vesta.VestaClient;
import com.facebook.vesta.VestaClientException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.HCq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10366HCq {
    public final HD8 A00;

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00fc: INVOKE (r2v0 ?? I:com.facebook.vesta.VestaClientException), (r13 I:X.HCz), (r14 I:X.HCy), (r0 I:java.lang.String) STATIC call: X.HCy.A00(com.facebook.vesta.VestaClientException, X.HCz, X.HCy, java.lang.String):void A[MD:(com.facebook.vesta.VestaClientException, X.HCz, X.HCy, java.lang.String):void (m)] (LINE:252), block:B:25:0x00f0 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00fc: INVOKE (r2v0 ?? I:com.facebook.vesta.VestaClientException), (r13v0 ?? I:X.HCz), (r14 I:X.HCy), (r0 I:java.lang.String) STATIC call: X.HCy.A00(com.facebook.vesta.VestaClientException, X.HCz, X.HCy, java.lang.String):void A[MD:(com.facebook.vesta.VestaClientException, X.HCz, X.HCy, java.lang.String):void (m)] (LINE:252), block:B:25:0x00f0 */
    public static final void A00(HCz hCz, C10374HCy c10374HCy, Hl3 hl3, C10366HCq c10366HCq, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, boolean z3, boolean z4) throws JSONException, VestaClientException {
        HCz hCzA00;
        C10374HCy c10374HCyA00;
        int i2;
        String str6;
        try {
            Charset charset = StandardCharsets.UTF_8;
            C7384Etj.A0V(charset);
            byte[] bytes = str3.getBytes(charset);
            if (z && z2) {
                i2 = 2;
                str6 = "pq";
            } else {
                i2 = 1;
                str6 = "legacy";
            }
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = hCz.A01;
            int i3 = hCz.A00;
            lightweightQuickPerformanceLogger.markerAnnotate(536549438, i3, "registration_path", str6);
            VestaClient vestaClient = VestaClient.$redex_init_class;
            byte[] bArr = new byte[8192];
            int iBeginRegisterNative = VestaClient.beginRegisterNative(bytes, i2, bArr);
            if (iBeginRegisterNative != 0) {
                throw new VestaClientException(iBeginRegisterNative);
            }
            byte[][] nativeResults = VestaClient.parseNativeResults(bArr);
            HDF hdf = new HDF(nativeResults[0], nativeResults[1]);
            lightweightQuickPerformanceLogger.markerPoint(536549438, i3, z3 ? "init_and_begin_register_vesta_client_retry" : "init_and_begin_register_vesta_client");
            lightweightQuickPerformanceLogger.markerPoint(536549438, i3, z3 ? "init_and_begin_register_network_start_retry" : "init_and_begin_register_network_start");
            HD8 hd8 = c10366HCq.A00;
            String str7 = hl3.useCaseName;
            byte[] bArr2 = hdf.A01;
            C7384Etj.A0T(bArr2);
            C10368HCs c10368HCs = new C10368HCs(hdf, hCz, c10374HCy, hl3, c10366HCq, str, str2, str3, str4, str5, bytes, i2, i, z3, z, z2, z4);
            C7384Etj.A0Y(str7, 0);
            C7384Etj.A0Y(str2, 1);
            String strEncodeToString = Base64.encodeToString(bArr2, 8);
            C7384Etj.A0U(strEncodeToString);
            Integer numValueOf = Integer.valueOf(hd8.A00);
            Integer numValueOf2 = Integer.valueOf(i2);
            Hqz hqz = hd8.A01;
            HDD hdd = new HDD(c10368HCs, hd8);
            Executor executor = hd8.A02;
            C9767GfL c9767GfL = C9767GfL.A00;
            JSONObject jSONObjectA18 = BV4.A18();
            jSONObjectA18.put("base64url_encoded_opaque_r1", strEncodeToString);
            C9767GfL.A00(numValueOf, numValueOf2, str, jSONObjectA18);
            jSONObjectA18.put("is_vesta_ota_enabled", false);
            hqz.A00.post("/hatch/vesta-auth/begin-register", C3cG.A1S(C60O.A0o(jSONObjectA18)), new C10362HCh("BEGIN REGISTER", new C8838Fqo(c9767GfL, 27), new C8838Fqo(hdd, 29), new C8838Fqo(hdd, 28)), executor);
        } catch (VestaClientException e) {
            C10374HCy.A00(e, hCzA00, c10374HCyA00, FGI.A0M("Unexpected Vesta client exception on begin Register, error code: ", e.error.name()));
        }
    }

    public C10366HCq(HD8 hd8) {
        this.A00 = hd8;
    }
}
