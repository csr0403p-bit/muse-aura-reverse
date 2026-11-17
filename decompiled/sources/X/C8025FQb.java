package X;

import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer;
import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.DspSpectrumRef;
import org.maplibre.android.R;

/* renamed from: X.FQb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8025FQb implements FP7 {
    public static final C8025FQb A00 = new C8025FQb();

    @Override // X.FP7
    public final FMX A4K(Integer num) {
        return AbstractC7610F5x.A0c(num);
    }

    @Override // X.FP7
    public final FP8 A5K(Integer num) {
        return AbstractC7610F5x.A0d(num);
    }

    @Override // X.FP7
    public final ColorData A6Y(FP5 fp5) {
        DspSpectrumRef dspSpectrumRef;
        int i;
        int i2;
        switch (AnonymousClass003.A0L(fp5)) {
            case 0:
            case 25:
            case 93:
            case 133:
            case 145:
            case 172:
            case 240:
            case 242:
            case 249:
            case 253:
            case MC.mwa_accounts_center_settings.__CONFIG__ /* 261 */:
            case MC.mwa_time_spent_killswitch.__CONFIG__ /* 306 */:
                dspSpectrumRef = null;
                i = -14833055;
                i2 = -14565277;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 1:
            case 52:
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
            case 155:
            case 302:
                dspSpectrumRef = null;
                i = -2490925;
                i2 = -15715031;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 8:
                dspSpectrumRef = null;
                i = -723724;
                i2 = -16119286;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 9:
            case 118:
            case 148:
            case 152:
            case 195:
                dspSpectrumRef = null;
                i = -1;
                i2 = -16119286;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 11:
                dspSpectrumRef = null;
                i = -2075;
                i2 = -13226977;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 13:
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
            case AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS /* 129 */:
                dspSpectrumRef = null;
                i = -136981;
                i2 = -13494750;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 17:
                dspSpectrumRef = null;
                i = -1573661;
                i2 = -15715031;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 22:
            case 214:
            case 219:
            case 230:
            case 231:
            case 232:
                dspSpectrumRef = null;
                i = -14973099;
                i2 = -14565277;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 24:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
            case 48:
            case 163:
            case 167:
                dspSpectrumRef = null;
                i = -16119286;
                i2 = -328966;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 26:
            case 138:
            case 140:
                dspSpectrumRef = null;
                i = -9802644;
                i2 = -6974573;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
            case 161:
                dspSpectrumRef = null;
                i = 650296760;
                i2 = 452984831;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 50:
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
            case 128:
            case 158:
            case 224:
            case 225:
            case 226:
                dspSpectrumRef = null;
                i = -1441736;
                i2 = -307103;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 53:
            case 54:
            case 156:
            case 157:
            case 303:
            case 304:
                dspSpectrumRef = null;
                i = -15376322;
                i2 = -2490925;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 58:
            case 64:
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
            case 66:
            case 209:
            case 248:
            case 260:
                dspSpectrumRef = null;
                i = -1;
                i2 = -15329513;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 63:
            case 255:
                dspSpectrumRef = null;
                i = -723724;
                i2 = -14408154;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 71:
            case 96:
            case 218:
            case 228:
                dspSpectrumRef = null;
                i = HatchAvatarStoryImageRenderer.VIDEO_SHADOW_COLOR;
                i2 = 452984831;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 94:
            case SelfieSnapshotKt.SELFIE_JPEG_QUALITY /* 95 */:
            case 162:
            case 227:
            case 229:
                dspSpectrumRef = null;
                i = -4342339;
                i2 = -12434363;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 143:
                dspSpectrumRef = null;
                i = -1;
                i2 = -14408154;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case VoiceCallForegroundService.AVATAR_TARGET_PX /* 144 */:
                dspSpectrumRef = null;
                i = -14833055;
                i2 = -9311355;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 159:
            case 160:
                return new ColorData(null, null, -1, -1);
            case 208:
                dspSpectrumRef = null;
                i = -723724;
                i2 = -15329513;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 233:
            case 234:
                dspSpectrumRef = null;
                i = -10787992;
                i2 = -6974573;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            default:
                return FQN.A00.A6Y(fp5);
        }
    }

    @Override // X.FP7
    public final int A7P(Integer num) {
        switch (AbstractC7609F5w.A0G(num)) {
            case 0:
                return 16;
            case 4:
            case 5:
            case 6:
                return 40;
            case 8:
            case 20:
                return 10;
            case 10:
                return 20;
            case 12:
                return 28;
            case 18:
                return 6;
            default:
                return FQN.A00.A7P(num);
        }
    }

    @Override // X.FP7
    public final float Afi(Integer num) {
        return AbstractC7610F5x.A05(num);
    }

    @Override // X.FP7
    public final float Aft(Hi8 hi8) {
        return AbstractC7610F5x.A04(hi8);
    }

    @Override // X.FP7
    public final FPJ Ahb(Integer num) {
        FP6 fp6;
        FQM fqmA00;
        float f;
        float f2;
        switch (AbstractC7609F5w.A0G(num)) {
            case 0:
            case 4:
            case 24:
            case 33:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.43f);
                f = 14.0f;
                f2 = 0.25f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 1:
            case 5:
            case 16:
            case 25:
            case 30:
            case 34:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.43f);
                f = 14.0f;
                f2 = 0.15f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 2:
            case 3:
            case 15:
            case 19:
            case 22:
            case 23:
            case 31:
            case 32:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.5f);
                f = 16.0f;
                f2 = 0.2f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 6:
            case 20:
            case 26:
            case 28:
            case 35:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.33f);
                f = 12.0f;
                f2 = 0.2f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 7:
            case 21:
            case 27:
            case 29:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.33f);
                f = 12.0f;
                f2 = 0.25f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 8:
            case 10:
            case 11:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.25f);
                f = 32.0f;
                f2 = 0.0f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 9:
            default:
                return FQN.A00.Ahb(num);
            case 12:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.29f);
                f = 28.0f;
                f2 = 0.0f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 13:
            case 17:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.33f);
                f = 24.0f;
                f2 = 0.0f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 14:
            case 18:
                fp6 = FP6.A09;
                fqmA00 = FQM.A00(1.27f);
                f = 22.0f;
                f2 = 0.0f;
                return new FPJ(fqmA00, fp6, f, f2);
        }
    }
}
