package X;

import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.DspSpectrumRef;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class FQQ implements FP7 {
    public static final FQQ A00 = new FQQ();

    @Override // X.FP7
    public final FP8 A5K(Integer num) {
        FP5 fp5;
        float f;
        C7384Etj.A0Y(num, 0);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            fp5 = FP5.A06;
            f = 1.0f;
        } else {
            if (iIntValue != 15) {
                return FQN.A00.A5K(num);
            }
            fp5 = FP5.A0T;
            f = 2.0f;
        }
        return new FP8(fp5, f);
    }

    @Override // X.FP7
    public final FMX A4K(Integer num) {
        return AbstractC7610F5x.A0c(num);
    }

    @Override // X.FP7
    public final ColorData A6Y(FP5 fp5) {
        DspSpectrumRef dspSpectrumRef;
        int i;
        int i2;
        DspSpectrumRef dspSpectrumRef2;
        int i3;
        switch (AnonymousClass003.A0L(fp5)) {
            case 0:
            case 93:
            case 97:
            case 155:
            case 163:
            case 167:
            case 178:
            case 182:
            case 186:
            case 193:
            case 200:
            case 214:
            case 219:
            case 246:
            case 302:
                dspSpectrumRef = null;
                i = -15658734;
                i2 = -789259;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 1:
                dspSpectrumRef = null;
                i = 2131824914;
                i2 = 1727263989;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 2:
            case 3:
            case 18:
            case 25:
            case 50:
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
            case 61:
            case 66:
            case 68:
            case 74:
            case 75:
            case HatchIdeaShareImageRenderer.TEXT_LEFT /* 76 */:
            case HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX /* 77 */:
            case 78:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case ImageCompressor.IMAGE_COMPRESSION_QUALITY /* 85 */:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case AuraWaitlistConfettiKt.StandardParticleCount /* 92 */:
            case 98:
            case 100:
            case 102:
            case 104:
            case 114:
            case 116:
            case 117:
            case 119:
            case 123:
            case 124:
            case 128:
            case AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS /* 129 */:
            case 132:
            case 133:
            case 135:
            case 136:
            case VoiceCallForegroundService.AVATAR_TARGET_PX /* 144 */:
            case 147:
            case 151:
            case 158:
            case 159:
            case 160:
            case 165:
            case 166:
            case 169:
            case 173:
            case 174:
            case 184:
            case 188:
            case 189:
            case AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN /* 190 */:
            case 203:
            case HatchWidgetWebViewKt.HTTP_NO_CONTENT /* 204 */:
            case 207:
            case 217:
            case 224:
            case 225:
            case 226:
            case 236:
            case 237:
            case 239:
            case 250:
            case 251:
            case 256:
            case 257:
            case 263:
            case 284:
            case 285:
            case 286:
            case 287:
            case 288:
            case 289:
            case 292:
            case 293:
            case 294:
            case 295:
            case 296:
            case 297:
            case 301:
            case 308:
            case HatchMessageShareDocumentRenderer.MIN_CONTENT_HEIGHT_PX /* 310 */:
            default:
                return FQN.A00.A6Y(fp5);
            case 4:
            case 69:
            case 130:
                dspSpectrumRef = null;
                i = 420548882;
                i2 = 436207615;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 5:
            case 115:
            case 125:
                dspSpectrumRef = null;
                i = -12368312;
                i2 = -2039068;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 6:
                dspSpectrumRef = null;
                i = -789259;
                i2 = -13092035;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 7:
            case 26:
            case 71:
            case 96:
            case 139:
            case 245:
                dspSpectrumRef = null;
                i = -2039068;
                i2 = -11842225;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 8:
            case 20:
            case 57:
            case 118:
            case 156:
            case 157:
            case 266:
            case 303:
            case 304:
                dspSpectrumRef = null;
                i = -789259;
                i2 = -15658734;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 9:
            case 185:
                dspSpectrumRef = null;
                i = -1;
                i2 = -15658734;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 10:
            case 30:
                dspSpectrumRef2 = null;
                i3 = -1306583264;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 11:
                dspSpectrumRef = null;
                i = -332892;
                i2 = -10801403;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 12:
                dspSpectrumRef = null;
                i = -4868165;
                i2 = -11381674;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 13:
                dspSpectrumRef = null;
                i = -72474;
                i2 = -9234918;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 14:
                dspSpectrumRef = null;
                i = -2364161;
                i2 = -15059585;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 15:
                dspSpectrumRef = null;
                i = -1447189;
                i2 = -13092035;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 16:
                dspSpectrumRef = null;
                i = -5000962;
                i2 = -12768638;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 17:
                dspSpectrumRef = null;
                i = -2428716;
                i2 = -15383775;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 19:
            case 34:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
            case 149:
            case 153:
            case 215:
            case 220:
                dspSpectrumRef = null;
                i = -15658734;
                i2 = -1;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 21:
            case 172:
            case 240:
            case 242:
            case 249:
            case 253:
            case 273:
            case 290:
            case MC.mwa_time_spent_killswitch.__CONFIG__ /* 306 */:
                dspSpectrumRef = null;
                i = -16760612;
                i2 = -16743685;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 22:
            case 180:
            case 191:
            case 230:
            case 231:
            case 232:
            case 259:
                dspSpectrumRef = null;
                i = -16760612;
                i2 = -10967041;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 23:
                dspSpectrumRef = null;
                i = 2130723036;
                i2 = 2136516607;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 24:
            case 120:
                dspSpectrumRef = null;
                i = -9934226;
                i2 = -5460046;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 27:
            case 142:
            case 235:
                dspSpectrumRef2 = null;
                i3 = -3025963;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 28:
                dspSpectrumRef = null;
                i = -1292634891;
                i2 = -1306583264;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 29:
                dspSpectrumRef = null;
                i = -1292634891;
                i2 = 1713315616;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 31:
                dspSpectrumRef2 = null;
                i3 = 1713315616;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 32:
                dspSpectrumRef2 = null;
                i3 = -1292634891;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 33:
                dspSpectrumRef2 = null;
                i3 = 268435455;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 35:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
            case 44:
                dspSpectrumRef2 = null;
                i3 = -1;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 36:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
            case 150:
            case 154:
            case 164:
            case 168:
            case 213:
            case 309:
                dspSpectrumRef2 = null;
                i3 = -15658734;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 40:
            case FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE /* 179 */:
            case 183:
            case 194:
            case 201:
                dspSpectrumRef = null;
                i = 638652690;
                i2 = 653522165;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
            case 196:
            case 198:
            case 202:
                dspSpectrumRef2 = null;
                i3 = 653522165;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 42:
            case 199:
                dspSpectrumRef2 = null;
                i3 = 638652690;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
            case 63:
            case 208:
            case 210:
            case 265:
            case 275:
                dspSpectrumRef = null;
                i = -789259;
                i2 = -14145237;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
            case 48:
            case 222:
                dspSpectrumRef = null;
                i = -14145237;
                i2 = -4868165;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                dspSpectrumRef = null;
                i = -3854;
                i2 = -12117220;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 52:
                dspSpectrumRef = null;
                i = -1247745;
                i2 = -15128755;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 53:
            case 54:
            case 205:
                dspSpectrumRef = null;
                i = -16760612;
                i2 = -8471297;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 55:
            case 146:
                dspSpectrumRef = null;
                i = -1;
                i2 = -13487051;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 56:
                dspSpectrumRef = null;
                i = -13487051;
                i2 = -789259;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 58:
            case 64:
            case 248:
                dspSpectrumRef = null;
                i = -1;
                i2 = -14737632;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 59:
                dspSpectrumRef = null;
                i = -3283457;
                i2 = -14793557;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 60:
                dspSpectrumRef = null;
                i = -3740483;
                i2 = -15967964;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                dspSpectrumRef = null;
                i = -4723484;
                i2 = -16231074;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
            case 209:
            case 223:
            case 260:
                dspSpectrumRef = null;
                i = 872415231;
                i2 = 857677600;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                dspSpectrumRef = null;
                i = -14145237;
                i2 = -3025963;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS /* 70 */:
                dspSpectrumRef = null;
                i = -2039068;
                i2 = -11381674;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 72:
                dspSpectrumRef2 = null;
                i3 = -6566913;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 73:
                dspSpectrumRef2 = null;
                i3 = -9522177;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 79:
                dspSpectrumRef2 = null;
                i3 = -23985;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 91:
                dspSpectrumRef2 = null;
                i3 = -602291;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 94:
            case SelfieSnapshotKt.SELFIE_JPEG_QUALITY /* 95 */:
            case 241:
            case 243:
                dspSpectrumRef = null;
                i = -6183768;
                i2 = -9934226;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 99:
            case 244:
            case HatchDeviceBleManagerKt.REQUESTED_MTU /* 247 */:
            case 255:
                dspSpectrumRef = null;
                i = -7368042;
                i2 = -9934226;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE /* 101 */:
                dspSpectrumRef2 = null;
                i3 = 504434962;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 103:
                dspSpectrumRef = null;
                i = -2039068;
                i2 = -12368312;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 105:
                dspSpectrumRef = null;
                i = -11381674;
                i2 = -2039068;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 106:
            case HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX /* 112 */:
                dspSpectrumRef = null;
                i = -13092035;
                i2 = -3881271;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 107:
                dspSpectrumRef = null;
                i = 1068281778;
                i2 = 436207615;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case MinidumpReader.MODULE_FULL_SIZE /* 108 */:
                dspSpectrumRef = null;
                i = 866955186;
                i2 = 352321535;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 109:
                dspSpectrumRef = null;
                i = 648851378;
                i2 = 268435455;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 110:
                dspSpectrumRef = null;
                i = 430747570;
                i2 = 184549375;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 111:
                dspSpectrumRef = null;
                i = 212643762;
                i2 = 100663295;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 113:
            case 134:
                dspSpectrumRef = null;
                i = 1929379839;
                i2 = 1913721106;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 121:
                dspSpectrumRef = null;
                i = 420548882;
                i2 = 435418357;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 122:
                dspSpectrumRef = null;
                i = 1276186898;
                i2 = 1291845631;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 126:
                dspSpectrumRef = null;
                i = -2364161;
                i2 = -13092035;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 127:
                dspSpectrumRef = null;
                i = -16760612;
                i2 = -1;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 131:
                dspSpectrumRef = null;
                i = 638652690;
                i2 = 872415231;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 137:
                dspSpectrumRef2 = null;
                i3 = 672207122;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 138:
            case 140:
            case 233:
            case 234:
                dspSpectrumRef = null;
                i = -9934226;
                i2 = -6183768;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 141:
                dspSpectrumRef = null;
                i = 2131824914;
                i2 = 1291845631;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 143:
                dspSpectrumRef = null;
                i = -1;
                i2 = -14145237;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 145:
                dspSpectrumRef = null;
                i = -16760612;
                i2 = -16751392;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 148:
            case 152:
            case 195:
            case HatchMessageShareDocumentRenderer.CONTENT_TOP_PX /* 197 */:
            case HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE /* 216 */:
            case 221:
                dspSpectrumRef2 = null;
                i3 = -789259;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 161:
                dspSpectrumRef = null;
                i = 1276186898;
                i2 = 1291056373;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 162:
                dspSpectrumRef = null;
                i = -1510738699;
                i2 = -15658734;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 170:
                dspSpectrumRef = null;
                i = -1;
                i2 = 856756498;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 171:
            case 177:
            case 276:
                dspSpectrumRef = null;
                i = -2039068;
                i2 = -14145237;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS /* 175 */:
                dspSpectrumRef2 = null;
                i3 = -13658881;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 176:
                dspSpectrumRef = null;
                i = -3025963;
                i2 = -12368312;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 181:
            case 192:
                dspSpectrumRef = null;
                i = 637550812;
                i2 = 643344383;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 187:
                dspSpectrumRef = null;
                i = -3025963;
                i2 = -9934226;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT /* 206 */:
                dspSpectrumRef = null;
                i = 637550812;
                i2 = 645840127;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 211:
                dspSpectrumRef = null;
                i = -1447189;
                i2 = -13487051;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 212:
                dspSpectrumRef = null;
                i = -1447189;
                i2 = -14737632;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 218:
            case 227:
            case 229:
                dspSpectrumRef = null;
                i = -3025963;
                i2 = -11381674;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 228:
                dspSpectrumRef = null;
                i = 2144457685;
                i2 = 2136101974;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 238:
                dspSpectrumRef = null;
                i = 428839574;
                i2 = 865047190;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 252:
                dspSpectrumRef2 = null;
                i3 = -5056513;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH /* 254 */:
                dspSpectrumRef = null;
                i = -1447189;
                i2 = -9341833;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 258:
                dspSpectrumRef2 = null;
                i3 = -1447189;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case MC.mwa_accounts_center_settings.__CONFIG__ /* 261 */:
            case 262:
                dspSpectrumRef = null;
                i = -16760612;
                i2 = -13658881;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 264:
                dspSpectrumRef = null;
                i = -1247745;
                i2 = -16117468;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case VoiceSelectionRepositoryJsonKt.MAX_VOICE_ID_LENGTH /* 267 */:
                dspSpectrumRef = null;
                i = -1443611;
                i2 = -16444151;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 268:
                dspSpectrumRef = null;
                i = -3356;
                i2 = -14676986;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 269:
                dspSpectrumRef = null;
                i = -789506;
                i2 = -15593947;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 270:
                dspSpectrumRef = null;
                i = -3850;
                i2 = -14677231;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 271:
                dspSpectrumRef = null;
                i = -1705996;
                i2 = -16640999;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 272:
                dspSpectrumRef = null;
                i = -264753;
                i2 = -14873083;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 274:
                dspSpectrumRef = null;
                i = -3283457;
                i2 = -15128755;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 277:
                dspSpectrumRef = null;
                i = -3740483;
                i2 = -15716583;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 278:
                dspSpectrumRef = null;
                i = -9287;
                i2 = -12182258;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 279:
                dspSpectrumRef = null;
                i = -2105345;
                i2 = -14080952;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 280:
                dspSpectrumRef = null;
                i = -206363;
                i2 = -12117469;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 281:
                dspSpectrumRef = null;
                i = -4723484;
                i2 = -16110284;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 282:
                dspSpectrumRef = null;
                i = -531841;
                i2 = -12443643;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 283:
            case 291:
                dspSpectrumRef = null;
                i = -10723743;
                i2 = -8289145;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 298:
            case 299:
            case 307:
                dspSpectrumRef2 = null;
                i3 = -13487051;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 300:
                dspSpectrumRef2 = null;
                i3 = -10967041;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i3, i3);
            case 305:
                dspSpectrumRef = null;
                i = -7368042;
                i2 = -8289145;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
            case 311:
                dspSpectrumRef = null;
                i = -14145237;
                i2 = -1447189;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i2);
        }
    }

    @Override // X.FP7
    public final int A7P(Integer num) {
        return AbstractC7610F5x.A0N(num);
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
        switch (AbstractC7609F5w.A0G(num)) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 19:
            case 24:
            case 25:
            case 33:
            case 34:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.062832f);
                f = 15.0f;
                break;
            case 2:
            case 3:
            case 15:
            case 18:
            case 22:
            case 23:
            case 30:
            case 31:
            case 32:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.0315722f);
                f = 17.0f;
                break;
            case 6:
            case 7:
            case 16:
            case 26:
            case 27:
            case 28:
            case 29:
            case 35:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.1037102f);
                f = 13.0f;
                break;
            case 8:
            case 10:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(0.91521645f);
                f = 54.0f;
                break;
            case 9:
            case 13:
            case 14:
            case 17:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(0.97426265f);
                f = 27.0f;
                break;
            case 11:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(0.92688835f);
                f = 43.0f;
                break;
            case 12:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(0.9612377f);
                f = 34.0f;
                break;
            case 20:
            case 21:
                fp6 = FP6.A02;
                fqmA00 = FQM.A00(1.159453f);
                f = 11.0f;
                break;
            default:
                return FQN.A00.Ahb(num);
        }
        return new FPJ(fqmA00, fp6, f, 0.0f);
    }
}
