package X;

import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.BV8;
import X.C3453CNz;
import X.C3cG;
import X.C4290CsY;
import X.C4372CuS;
import X.C4373CuT;
import X.C4463Cwf;
import X.C60O;
import X.C8j3;
import X.CO1;
import X.CO2;
import X.CO3;
import X.CO5;
import X.COA;
import X.COB;
import X.COC;
import X.COM;
import X.COO;
import X.COR;
import X.COS;
import X.DA8;
import X.FGI;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Base64;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import com.facebook.aura.network.acs.AcsKeyConfig;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzhf;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.p000authapi.zba;
import com.google.android.gms.internal.p000authapi.zbam;
import com.sun.jna.Callback;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CsU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4288CsU extends AbstractC4291Csa<C4294Csh, BeginSignInRequest, SignInCredential, C4381Cug, GetCredentialException> {
    public CancellationSignal A00;
    public InterfaceC4370CuQ<C4381Cug, GetCredentialException> A01;
    public Executor A02;
    public final Context A03;
    public final CredentialProviderBeginSignInController$resultReceiver$1 A04;

    public final InterfaceC4370CuQ<C4381Cug, GetCredentialException> A03() {
        InterfaceC4370CuQ<C4381Cug, GetCredentialException> interfaceC4370CuQ = this.A01;
        if (interfaceC4370CuQ != null) {
            return interfaceC4370CuQ;
        }
        C7384Etj.A0b(Callback.METHOD_NAME);
        throw F60.createAndThrow();
    }

    public final Executor A04() {
        Executor executor = this.A02;
        if (executor != null) {
            return executor;
        }
        C7384Etj.A0b("executor");
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Csh;LX/CuQ<LX/Cug;Landroidx/credentials/exceptions/GetCredentialException;>;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V */
    public final void A05(C4294Csh c4294Csh, CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ interfaceC4370CuQ) {
        this.A00 = cancellationSignal;
        this.A01 = interfaceC4370CuQ;
        this.A02 = executor;
        if (CredentialProviderPlayServicesImpl.A00(cancellationSignal)) {
            return;
        }
        Context context = this.A03;
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(false);
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = new BeginSignInRequest.GoogleIdTokenRequestOptions(null, null, null, null, false, true, false);
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = new BeginSignInRequest.PasskeysRequestOptions(null, null, false);
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = new BeginSignInRequest.PasskeyJsonRequestOptions(false, null);
        PackageManager packageManager = context.getPackageManager();
        C7384Etj.A0U(packageManager);
        long j = packageManager.getPackageInfo(AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE, 0).versionCode;
        boolean z = false;
        for (AbstractC4308Csw abstractC4308Csw : c4294Csh.A01) {
            if ((abstractC4308Csw instanceof C4304Css) && !z) {
                boolean z2 = j < 231815000;
                C4304Css c4304Css = (C4304Css) abstractC4308Csw;
                C7384Etj.A0Y(c4304Css, 0);
                String str = c4304Css.A00;
                if (z2) {
                    JSONObject jSONObjectA19 = BV4.A19(str);
                    String strOptString = jSONObjectA19.optString("rpId", "");
                    if (C7384Etj.A06(strOptString) == 0) {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                    String strOptString2 = jSONObjectA19.optString("challenge", "");
                    if (C7384Etj.A06(strOptString2) == 0) {
                        throw new JSONException("Challenge not found in request or is unexpectedly empty");
                    }
                    byte[] bArrDecode = Base64.decode(strOptString2, 11);
                    C7384Etj.A0U(bArrDecode);
                    passkeysRequestOptions = new BeginSignInRequest.PasskeysRequestOptions(strOptString, bArrDecode, true);
                } else {
                    passkeyJsonRequestOptions = new BeginSignInRequest.PasskeyJsonRequestOptions(true, str);
                }
                z = true;
            } else if (abstractC4308Csw instanceof C4305Cst) {
                C4305Cst c4305Cst = (C4305Cst) abstractC4308Csw;
                String str2 = c4305Cst.A01;
                String str3 = c4305Cst.A00;
                CRy.A05(str3);
                googleIdTokenRequestOptions = new BeginSignInRequest.GoogleIdTokenRequestOptions(str3, null, str2, null, true, false, false);
            }
        }
        BeginSignInRequest beginSignInRequest = new BeginSignInRequest(googleIdTokenRequestOptions, passkeyJsonRequestOptions, passkeysRequestOptions, passwordRequestOptions, null, 0, false, j > 241217000 ? c4294Csh.A02 : false);
        final C4241CrD c4241CrDA00 = CRy.A00(context);
        new BeginSignInRequest.GoogleIdTokenRequestOptions(null, null, null, null, false, true, false);
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions2 = beginSignInRequest.A01;
        CRy.A03(googleIdTokenRequestOptions2);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions2 = beginSignInRequest.A04;
        CRy.A03(passwordRequestOptions2);
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions2 = beginSignInRequest.A03;
        CRy.A03(passkeysRequestOptions2);
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions2 = beginSignInRequest.A02;
        CRy.A03(passkeyJsonRequestOptions2);
        final BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(googleIdTokenRequestOptions2, passkeyJsonRequestOptions2, passkeysRequestOptions2, passwordRequestOptions2, c4241CrDA00.A00, 0, false, beginSignInRequest.A07);
        C4231Cqf c4231CqfA00 = C4232Cqg.A00();
        c4231CqfA00.A03 = new Feature[]{AbstractSafeParcelable.A03("auth_api_credentials_begin_sign_in", 8L)};
        c4231CqfA00.A01 = new InterfaceC4375CuV() { // from class: X.CrF
            @Override // X.InterfaceC4375CuV
            public final void accept(Object obj, Object obj2) {
                zbam zbamVar = new zbam((CSE) obj2);
                zba zbaVar = (zba) ((AbstractC4160CoH) obj).A03();
                BeginSignInRequest beginSignInRequest3 = beginSignInRequest2;
                CRy.A03(beginSignInRequest3);
                zbaVar.A01(zba.A00(beginSignInRequest3, zbaVar, zbamVar), 1);
            }
        };
        c4231CqfA00.A02 = false;
        CSC cscA01 = AbstractC4178Com.A01(c4241CrDA00, c4231CqfA00, 1553, 0);
        cscA01.A06(new C4954DHn(new C7592F5f(1, cancellationSignal, this), 2), AbstractC3097ByB.A00);
        cscA01.A0E(new F5H(0, cancellationSignal, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1] */
    public C4288CsU(Context context) {
        super(context);
        this.A03 = context;
        final Handler handlerA02 = C60O.A02();
        this.A04 = new ResultReceiver(handlerA02) { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:113:0x0299 A[Catch: zzho -> 0x037f, JSONException -> 0x03c5, JSONException -> 0x041e, all -> 0x0426, TRY_LEAVE, TryCatch #4 {JSONException -> 0x03c5, blocks: (B:56:0x013a, B:58:0x0142, B:59:0x014b, B:61:0x014f, B:62:0x0158, B:63:0x015e, B:65:0x0163, B:67:0x0171, B:69:0x017c, B:68:0x0177, B:70:0x017f, B:71:0x0189, B:73:0x019b, B:74:0x019e, B:75:0x01a6, B:77:0x01b7, B:78:0x01c3, B:80:0x01cd, B:81:0x01d2, B:83:0x01e1, B:85:0x01f4, B:86:0x020d, B:88:0x021f, B:89:0x0221, B:91:0x0229, B:92:0x022e, B:100:0x0254, B:101:0x0257, B:102:0x025d, B:106:0x0271, B:151:0x035c, B:153:0x036e, B:111:0x0291, B:113:0x0299, B:118:0x02ac, B:121:0x02bc, B:123:0x02d2, B:125:0x02d8, B:126:0x02ec, B:128:0x02f4, B:129:0x02f8, B:155:0x037a, B:156:0x037e, B:132:0x0304, B:137:0x0313, B:139:0x031b, B:141:0x0329, B:142:0x0339, B:144:0x0341, B:145:0x0345, B:148:0x0351, B:149:0x0356, B:154:0x0375, B:178:0x03be, B:179:0x03c4, B:159:0x0381, B:161:0x0387, B:162:0x038a, B:94:0x023f, B:96:0x0243, B:97:0x0247, B:164:0x038c, B:165:0x0393, B:166:0x0399, B:168:0x039b, B:169:0x03a2, B:170:0x03a8, B:172:0x03aa, B:174:0x03b2, B:175:0x03b5, B:177:0x03b7), top: B:260:0x013a }] */
            /* JADX WARN: Removed duplicated region for block: B:153:0x036e A[Catch: JSONException -> 0x03c5, JSONException -> 0x041e, all -> 0x0426, TRY_LEAVE, TryCatch #4 {JSONException -> 0x03c5, blocks: (B:56:0x013a, B:58:0x0142, B:59:0x014b, B:61:0x014f, B:62:0x0158, B:63:0x015e, B:65:0x0163, B:67:0x0171, B:69:0x017c, B:68:0x0177, B:70:0x017f, B:71:0x0189, B:73:0x019b, B:74:0x019e, B:75:0x01a6, B:77:0x01b7, B:78:0x01c3, B:80:0x01cd, B:81:0x01d2, B:83:0x01e1, B:85:0x01f4, B:86:0x020d, B:88:0x021f, B:89:0x0221, B:91:0x0229, B:92:0x022e, B:100:0x0254, B:101:0x0257, B:102:0x025d, B:106:0x0271, B:151:0x035c, B:153:0x036e, B:111:0x0291, B:113:0x0299, B:118:0x02ac, B:121:0x02bc, B:123:0x02d2, B:125:0x02d8, B:126:0x02ec, B:128:0x02f4, B:129:0x02f8, B:155:0x037a, B:156:0x037e, B:132:0x0304, B:137:0x0313, B:139:0x031b, B:141:0x0329, B:142:0x0339, B:144:0x0341, B:145:0x0345, B:148:0x0351, B:149:0x0356, B:154:0x0375, B:178:0x03be, B:179:0x03c4, B:159:0x0381, B:161:0x0387, B:162:0x038a, B:94:0x023f, B:96:0x0243, B:97:0x0247, B:164:0x038c, B:165:0x0393, B:166:0x0399, B:168:0x039b, B:169:0x03a2, B:170:0x03a8, B:172:0x03aa, B:174:0x03b2, B:175:0x03b5, B:177:0x03b7), top: B:260:0x013a }] */
            /* JADX WARN: Removed duplicated region for block: B:154:0x0375 A[Catch: zzho -> 0x037f, JSONException -> 0x03c5, JSONException -> 0x041e, all -> 0x0426, TRY_ENTER, TryCatch #4 {JSONException -> 0x03c5, blocks: (B:56:0x013a, B:58:0x0142, B:59:0x014b, B:61:0x014f, B:62:0x0158, B:63:0x015e, B:65:0x0163, B:67:0x0171, B:69:0x017c, B:68:0x0177, B:70:0x017f, B:71:0x0189, B:73:0x019b, B:74:0x019e, B:75:0x01a6, B:77:0x01b7, B:78:0x01c3, B:80:0x01cd, B:81:0x01d2, B:83:0x01e1, B:85:0x01f4, B:86:0x020d, B:88:0x021f, B:89:0x0221, B:91:0x0229, B:92:0x022e, B:100:0x0254, B:101:0x0257, B:102:0x025d, B:106:0x0271, B:151:0x035c, B:153:0x036e, B:111:0x0291, B:113:0x0299, B:118:0x02ac, B:121:0x02bc, B:123:0x02d2, B:125:0x02d8, B:126:0x02ec, B:128:0x02f4, B:129:0x02f8, B:155:0x037a, B:156:0x037e, B:132:0x0304, B:137:0x0313, B:139:0x031b, B:141:0x0329, B:142:0x0339, B:144:0x0341, B:145:0x0345, B:148:0x0351, B:149:0x0356, B:154:0x0375, B:178:0x03be, B:179:0x03c4, B:159:0x0381, B:161:0x0387, B:162:0x038a, B:94:0x023f, B:96:0x0243, B:97:0x0247, B:164:0x038c, B:165:0x0393, B:166:0x0399, B:168:0x039b, B:169:0x03a2, B:170:0x03a8, B:172:0x03aa, B:174:0x03b2, B:175:0x03b5, B:177:0x03b7), top: B:260:0x013a }] */
            /* JADX WARN: Removed duplicated region for block: B:197:0x0407 A[Catch: JSONException -> 0x041e, all -> 0x0426, TRY_ENTER, TryCatch #9 {JSONException -> 0x041e, blocks: (B:34:0x00c2, B:36:0x00ca, B:38:0x00d1, B:39:0x00da, B:41:0x00de, B:42:0x00e3, B:44:0x00e7, B:46:0x00eb, B:47:0x00f1, B:49:0x00f5, B:50:0x00fa, B:52:0x0102, B:54:0x012c, B:193:0x03fc, B:194:0x0401, B:197:0x0407, B:200:0x0412, B:199:0x040e, B:56:0x013a, B:58:0x0142, B:59:0x014b, B:61:0x014f, B:62:0x0158, B:63:0x015e, B:65:0x0163, B:67:0x0171, B:69:0x017c, B:68:0x0177, B:70:0x017f, B:71:0x0189, B:73:0x019b, B:74:0x019e, B:75:0x01a6, B:77:0x01b7, B:78:0x01c3, B:80:0x01cd, B:81:0x01d2, B:83:0x01e1, B:85:0x01f4, B:86:0x020d, B:88:0x021f, B:89:0x0221, B:91:0x0229, B:92:0x022e, B:100:0x0254, B:101:0x0257, B:102:0x025d, B:106:0x0271, B:151:0x035c, B:153:0x036e, B:111:0x0291, B:113:0x0299, B:118:0x02ac, B:121:0x02bc, B:123:0x02d2, B:125:0x02d8, B:126:0x02ec, B:128:0x02f4, B:129:0x02f8, B:155:0x037a, B:156:0x037e, B:132:0x0304, B:137:0x0313, B:139:0x031b, B:141:0x0329, B:142:0x0339, B:144:0x0341, B:145:0x0345, B:148:0x0351, B:149:0x0356, B:154:0x0375, B:178:0x03be, B:179:0x03c4, B:159:0x0381, B:161:0x0387, B:162:0x038a, B:94:0x023f, B:96:0x0243, B:97:0x0247, B:164:0x038c, B:165:0x0393, B:166:0x0399, B:168:0x039b, B:169:0x03a2, B:170:0x03a8, B:172:0x03aa, B:174:0x03b2, B:175:0x03b5, B:177:0x03b7, B:182:0x03cd, B:184:0x03d3, B:186:0x03e4, B:188:0x03eb, B:191:0x03f9, B:181:0x03c6, B:190:0x03f3), top: B:266:0x00c2, outer: #6 }] */
            /* JADX WARN: Removed duplicated region for block: B:198:0x040c  */
            /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
            @Override // android.os.ResultReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onReceiveResult(int r24, android.os.Bundle r25) throws androidx.credentials.exceptions.GetCredentialCancellationException, androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException, androidx.credentials.exceptions.GetCredentialUnknownException {
                /*
                    Method dump skipped, instructions count: 1320
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1.onReceiveResult(int, android.os.Bundle):void");
            }

            public static COS A00(CO5 co5, long j) {
                return (COS) co5.get(new COA(j));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set] */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.util.AbstractCollection, java.util.ArrayList] */
            public static final COS A01(C4290CsY c4290CsY, InputStream inputStream) throws zzhf, zzhj {
                COB cobA03;
                COC coc;
                COM com2;
                boolean z;
                boolean z2;
                try {
                    C4373CuT c4373CuTA05 = c4290CsY.A05();
                    if (c4373CuTA05 == null) {
                        throw new zzhj("Parser being asked to parse an empty input stream");
                    }
                    try {
                        byte b = c4373CuTA05.A01;
                        byte b2 = c4373CuTA05.A00;
                        int i = 0;
                        if (b2 == Byte.MIN_VALUE) {
                            C4290CsY.A02(c4290CsY, Byte.MIN_VALUE);
                            C4290CsY.A01(c4290CsY);
                            long jA00 = C4290CsY.A00(c4290CsY);
                            if (jA00 < 0) {
                                throw C8j3.A18(String.format("the maximum supported array length is %s", Long.valueOf(LinkEncryptedPairingKt.LINK_COUNTER_MAX)));
                            }
                            if (jA00 > 0) {
                                c4290CsY.A01.A00.push(Long.valueOf(jA00));
                            }
                            if (jA00 > 1000) {
                                throw new zzhj("Parser being asked to read a large CBOR array");
                            }
                            A02(jA00, b);
                            COS[] cosArr = new COS[(int) jA00];
                            while (i < jA00) {
                                cosArr[i] = A01(c4290CsY, inputStream);
                                i++;
                            }
                            return new C3453CNz(COO.A00(cosArr));
                        }
                        if (b2 != -96) {
                            if (b2 == -64) {
                                throw new zzhj("Tags are currently unsupported");
                            }
                            if (b2 == -32) {
                                C4290CsY.A02(c4290CsY, (byte) -32);
                                if (c4290CsY.A00.A01 > 24) {
                                    throw C3cG.A0Q("expected simple value");
                                }
                                int iA00 = (int) C4290CsY.A00(c4290CsY);
                                if (iA00 == 20) {
                                    z = false;
                                } else {
                                    if (iA00 != 21) {
                                        throw BV5.A0W("expected FALSE or TRUE", new Object[0]);
                                    }
                                    z = true;
                                }
                                return new CO1(z);
                            }
                            if (b2 != 0 && b2 != 32) {
                                if (b2 == 64) {
                                    C4290CsY.A02(c4290CsY, (byte) 64);
                                    byte[] bArrA04 = C4290CsY.A04(c4290CsY);
                                    int length = bArrA04.length;
                                    A02(length, b);
                                    return new C4463Cwf(DA8.A01(bArrA04, length));
                                }
                                if (b2 != 96) {
                                    throw new zzhj(FGI.A0H("Unidentifiable major type: ", (b2 >> 5) & 7));
                                }
                                C4290CsY.A02(c4290CsY, (byte) 96);
                                String str = new String(C4290CsY.A04(c4290CsY), StandardCharsets.UTF_8);
                                A02(str.length(), b);
                                return new CO2(str);
                            }
                            c4290CsY.A05();
                            byte b3 = c4290CsY.A00.A00;
                            if (b3 == 0) {
                                z2 = true;
                            } else {
                                if (b3 != 32) {
                                    throw BV5.A0W("expected major type 0 or 1 but found %s", new Object[]{Integer.valueOf((b3 >> 5) & 7)});
                                }
                                z2 = false;
                            }
                            long jA002 = C4290CsY.A00(c4290CsY);
                            if (jA002 < 0) {
                                throw C8j3.A18(String.format("the maximum supported unsigned/negative integer is %s", Long.valueOf(LinkEncryptedPairingKt.LINK_COUNTER_MAX)));
                            }
                            if (!z2) {
                                jA002 = (-1) ^ jA002;
                            }
                            A02(jA002 > 0 ? jA002 : (-1) ^ jA002, b);
                            return new COA(jA002);
                        }
                        C4290CsY.A02(c4290CsY, (byte) -96);
                        C4290CsY.A01(c4290CsY);
                        long jA003 = C4290CsY.A00(c4290CsY);
                        if (jA003 < 0 || jA003 > AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS) {
                            throw C8j3.A18("the maximum supported map length is 4611686018427387903L");
                        }
                        if (jA003 > 0) {
                            c4290CsY.A01.A00.push(Long.valueOf(jA003 + jA003));
                        }
                        if (jA003 > 1000) {
                            throw new zzhj("Parser being asked to read a large CBOR map");
                        }
                        A02(jA003, b);
                        int i2 = (int) jA003;
                        C4372CuS[] c4372CuSArr = new C4372CuS[i2];
                        COS cos = null;
                        int i3 = 0;
                        while (i3 < jA003) {
                            COS cosA01 = A01(c4290CsY, inputStream);
                            if (cos != null && cosA01.compareTo(cos) <= 0) {
                                throw new zzhf(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", cos.toString(), cosA01.toString()));
                            }
                            c4372CuSArr[i3] = new C4372CuS(cosA01, A01(c4290CsY, inputStream));
                            i3++;
                            cos = cosA01;
                        }
                        TreeMap treeMap = new TreeMap();
                        while (i < i2) {
                            C4372CuS c4372CuS = c4372CuSArr[i];
                            if (treeMap.containsKey(c4372CuS.A00)) {
                                throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                            }
                            treeMap.put(c4372CuS.A00, c4372CuS.A01);
                            i++;
                        }
                        final Comparator comparator = COB.A03;
                        Comparator comparator2 = treeMap.comparator();
                        int i4 = 1;
                        boolean zEquals = comparator2 == null ? true : comparator.equals(comparator2);
                        ?? EntrySet = treeMap.entrySet();
                        Map.Entry[] entryArr = CO5.A01;
                        if (!(EntrySet instanceof Collection)) {
                            Iterator it = EntrySet.iterator();
                            EntrySet = C3cG.A0h();
                            it.getClass();
                            while (it.hasNext()) {
                                BV6.A1S(EntrySet, it);
                            }
                        }
                        Map.Entry[] entryArr2 = (Map.Entry[]) EntrySet.toArray(entryArr);
                        int length2 = entryArr2.length;
                        if (length2 != 0) {
                            int i5 = 0;
                            if (length2 != 1) {
                                Object[] objArr = new Object[length2];
                                Object[] objArr2 = new Object[length2];
                                if (zEquals) {
                                    do {
                                        Map.Entry entry = entryArr2[i5];
                                        entry.getClass();
                                        Object key = entry.getKey();
                                        Object value = entry.getValue();
                                        A03(key, value);
                                        objArr[i5] = key;
                                        objArr2[i5] = value;
                                        i5++;
                                    } while (i5 < length2);
                                } else {
                                    Arrays.sort(entryArr2, 0, length2, new Comparator() { // from class: X.BrG
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            Map.Entry entry2 = (Map.Entry) obj;
                                            Map.Entry entry3 = (Map.Entry) obj2;
                                            entry2.getClass();
                                            entry3.getClass();
                                            return comparator.compare(entry2.getKey(), entry3.getKey());
                                        }
                                    });
                                    Map.Entry entry2 = entryArr2[0];
                                    entry2.getClass();
                                    Object key2 = entry2.getKey();
                                    objArr[0] = key2;
                                    Object value2 = entry2.getValue();
                                    objArr2[0] = value2;
                                    A03(objArr[0], value2);
                                    do {
                                        Map.Entry entry3 = entryArr2[i4 - 1];
                                        entry3.getClass();
                                        Map.Entry entry4 = entryArr2[i4];
                                        entry4.getClass();
                                        Object key3 = entry4.getKey();
                                        Object value3 = entry4.getValue();
                                        A03(key3, value3);
                                        objArr[i4] = key3;
                                        objArr2[i4] = value3;
                                        if (comparator.compare(key2, key3) == 0) {
                                            throw C60O.A0i(FGI.A0d("Multiple entries with same key: ", String.valueOf(entry3), " and ", String.valueOf(entry4)));
                                        }
                                        i4++;
                                        key2 = key3;
                                    } while (i4 < length2);
                                }
                                COC coc2 = COC.A03;
                                COR cor = COO.A00;
                                coc = new COC(new COM(length2, objArr), comparator);
                                com2 = new COM(length2, objArr2);
                            } else {
                                Map.Entry entry5 = entryArr2[0];
                                entry5.getClass();
                                Object key4 = entry5.getKey();
                                Object value4 = entry5.getValue();
                                COC coc3 = COC.A03;
                                COR cor2 = COO.A00;
                                Object[] objArr3 = {key4};
                                if (objArr3[0] == null) {
                                    throw BV8.A0n(0);
                                }
                                coc = new COC(new COM(1, objArr3), comparator);
                                Object[] objArr4 = {value4};
                                if (objArr4[0] == null) {
                                    throw BV8.A0n(0);
                                }
                                com2 = new COM(1, objArr4);
                            }
                            cobA03 = new COB(com2, null, coc);
                        } else {
                            cobA03 = COB.A03(comparator);
                        }
                        return new CO3(cobA03);
                    } catch (IOException | RuntimeException e) {
                        throw new zzhj("Error in decoding CborValue from bytes", e);
                    }
                } catch (IOException e2) {
                    throw new zzhj("Error in decoding CborValue from bytes", e2);
                }
            }

            public static final void A02(long j, byte b) throws zzhf {
                switch (b) {
                    case 24:
                        if (j < 24) {
                            throw new zzhf(FGI.A0J("Integer value ", j, " after add info could have been represented in 0 additional bytes, but used 1"));
                        }
                        return;
                    case 25:
                        if (j < 256) {
                            throw new zzhf(FGI.A0J("Integer value ", j, " after add info could have been represented in 0-1 additional bytes, but used 2"));
                        }
                        return;
                    case 26:
                        if (j < 65536) {
                            throw new zzhf(FGI.A0J("Integer value ", j, " after add info could have been represented in 0-2 additional bytes, but used 4"));
                        }
                        return;
                    case 27:
                        if (j < LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
                            throw new zzhf(FGI.A0J("Integer value ", j, " after add info could have been represented in 0-4 additional bytes, but used 8"));
                        }
                        return;
                    default:
                        return;
                }
            }

            public static void A03(Object obj, Object obj2) {
                if (obj == null) {
                    throw BV4.A0a("null key in entry: null=".concat(BV7.A0w(obj2)));
                }
                if (obj2 == null) {
                    throw BV4.A0a(FGI.A0U("null value in entry: ", obj.toString(), "=null"));
                }
            }
        };
    }
}
