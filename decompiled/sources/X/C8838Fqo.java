package X;

import com.facebook.aura.localbrowser.LocalBrowserNodeHandler;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.meta.vesta.registrationclient.VestaRegisterException;
import java.util.Arrays;

/* renamed from: X.Fqo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8838Fqo extends C7438Evz implements G0U {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8838Fqo(Object obj, int i) {
        Class cls;
        String str;
        int i2;
        int i3;
        String str2;
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                cls = C9120Fyl.class;
                str = "grams(D)Landroidx/health/connect/client/units/Mass;";
                i2 = 0;
                i3 = 1;
                str2 = "grams";
                break;
            case 6:
            case 7:
            case 8:
                cls = C9144FzD.class;
                str = "watts(D)Landroidx/health/connect/client/units/Power;";
                i2 = 0;
                i3 = 1;
                str2 = "watts";
                break;
            case 9:
            case 10:
            case 11:
                cls = C9146FzF.class;
                str = "celsius(D)Landroidx/health/connect/client/units/TemperatureDelta;";
                i2 = 0;
                i3 = 1;
                str2 = "celsius";
                break;
            case 12:
            case 13:
            case 14:
                cls = C9147FzG.class;
                str = "metersPerSecond(D)Landroidx/health/connect/client/units/Velocity;";
                i2 = 0;
                i3 = 1;
                str2 = "metersPerSecond";
                break;
            case 15:
                cls = C9143FzC.class;
                str = "kilocalories(D)Landroidx/health/connect/client/units/Energy;";
                i2 = 0;
                i3 = 1;
                str2 = "kilocalories";
                break;
            case 16:
            case 17:
            case 18:
                cls = C9120Fyl.class;
                str = "kilograms(D)Landroidx/health/connect/client/units/Mass;";
                i2 = 0;
                i3 = 1;
                str2 = "kilograms";
                break;
            case 19:
                cls = C8580Fge.class;
                str = "report(Lcom/bloks/foa/screen/tracker/NavigationEvent;)V";
                i2 = 0;
                i3 = 1;
                str2 = LocalBrowserNodeHandler.REPORT;
                break;
            case 20:
                cls = C10602HyI.class;
                str = "createTextViewForWidthMeasurement(Landroid/content/Context;)Landroid/widget/TextView;";
                i2 = 0;
                i3 = 1;
                str2 = "createTextViewForWidthMeasurement";
                break;
            case 21:
                cls = C9572GPg.class;
                str = "settle(Lcom/facebook/payments/dcp/xapp/billingclient/interfaces/DcpBillingResult;)V";
                i2 = 0;
                i3 = 1;
                str2 = "settle";
                break;
            case 22:
                cls = AudioModule.class;
                str = "injectPlayoutAudio(Lcom/facebook/rsys/audio/frame/gen/AudioFrame;)I";
                i2 = 0;
                i3 = 1;
                str2 = "injectPlayoutAudio";
                break;
            case 23:
                cls = C9591GQq.class;
                str = "setPlayoutAudioInjector(Lkotlin/jvm/functions/Function1;)V";
                i2 = 0;
                i3 = 1;
                str2 = "setPlayoutAudioInjector";
                break;
            case 24:
                cls = C9767GfL.class;
                str = "decodeBeginLoginResponse(Ljava/lang/String;)Lcom/meta/vesta/network/NetworkHandlerBeginLoginResponse;";
                i2 = 0;
                i3 = 1;
                str2 = "decodeBeginLoginResponse";
                break;
            case 25:
                cls = HDE.class;
                str = "onSuccess(Lcom/meta/vesta/network/NetworkHandlerBeginLoginResponse;)V";
                i2 = 0;
                i3 = 1;
                str2 = "onSuccess";
                break;
            case 26:
                cls = HDE.class;
                str = "onFailure(Ljava/lang/Throwable;)V";
                i2 = 0;
                i3 = 1;
                str2 = "onFailure";
                break;
            case 27:
                cls = C9767GfL.class;
                str = "decodeBeginRegisterResponse(Ljava/lang/String;)Lcom/meta/vesta/network/NetworkHandlerBeginRegisterResponse;";
                i2 = 0;
                i3 = 1;
                str2 = "decodeBeginRegisterResponse";
                break;
            case 28:
                cls = HDD.class;
                str = "onSuccess(Lcom/meta/vesta/network/NetworkHandlerBeginRegisterResponse;)V";
                i2 = 0;
                i3 = 1;
                str2 = "onSuccess";
                break;
            case 29:
                cls = HDD.class;
                str = "onFailure(Ljava/lang/Throwable;)V";
                i2 = 0;
                i3 = 1;
                str2 = "onFailure";
                break;
            case 30:
                cls = C9767GfL.class;
                str = "decodeFinishLoginResponse(Ljava/lang/String;)Lcom/meta/vesta/network/NetworkHandlerFinishLoginResponse;";
                i2 = 0;
                i3 = 1;
                str2 = "decodeFinishLoginResponse";
                break;
            case 31:
                cls = HDH.class;
                str = "onSuccess(Lcom/meta/vesta/network/NetworkHandlerFinishLoginResponse;)V";
                i2 = 0;
                i3 = 1;
                str2 = "onSuccess";
                break;
            case 32:
                cls = HDH.class;
                str = "onFailure(Ljava/lang/Throwable;)V";
                i2 = 0;
                i3 = 1;
                str2 = "onFailure";
                break;
            case 33:
                cls = C9767GfL.class;
                str = "decodeFinishRegisterResponse(Ljava/lang/String;)Lcom/meta/vesta/network/NetworkHandlerFinishRegisterResponse;";
                i2 = 0;
                i3 = 1;
                str2 = "decodeFinishRegisterResponse";
                break;
            case 34:
                cls = HDG.class;
                str = "onSuccess(Lcom/meta/vesta/network/NetworkHandlerFinishRegisterResponse;)V";
                i2 = 0;
                i3 = 1;
                str2 = "onSuccess";
                break;
            case 35:
                cls = HDG.class;
                str = "onFailure(Ljava/lang/Throwable;)V";
                i2 = 0;
                i3 = 1;
                str2 = "onFailure";
                break;
            default:
                cls = GBP.class;
                str = "invoke(Ljava/lang/Throwable;)V";
                i2 = 0;
                i3 = 1;
                str2 = "invoke";
                break;
        }
        super(i3, obj, cls, str2, str, i2);
    }

    public static void A01(C10374HCy c10374HCy, EnumC10363HCk enumC10363HCk, HD3 hd3, String str) {
        c10374HCy.A01(new VestaRegisterException(enumC10363HCk, hd3, new Throwable(str)));
    }

    public static byte[] A02(byte[] bArr) {
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:345:0x08e4, code lost:
    
        if (r33 != null) goto L339;
     */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r38) throws org.json.JSONException, com.facebook.vesta.VestaClientException {
        /*
            Method dump skipped, instructions count: 3450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8838Fqo.invoke(java.lang.Object):java.lang.Object");
    }
}
