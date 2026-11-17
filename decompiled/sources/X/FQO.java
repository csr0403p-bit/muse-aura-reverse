package X;

import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.maps.scene.HatchMapTheme;
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
public final class FQO implements FP7 {
    public static final FQO A00 = new FQO();

    @Override // X.FP7
    public final int A7P(Integer num) {
        C7384Etj.A0Y(num, 0);
        switch (num.intValue()) {
            case 0:
            case 6:
            case 7:
            case 13:
            case 14:
            case 16:
            case 18:
            case 20:
            case 22:
            case 26:
            case 28:
            case 34:
            case 35:
                return 16;
            case 1:
                return 1000;
            case 2:
            case 3:
            case 31:
                return 24;
            case 4:
                return 22;
            case 5:
                return 18;
            case 8:
            case 9:
            case 21:
            case 23:
            case 24:
            case 32:
            default:
                return FQN.A00.A7P(num);
            case 10:
            case 15:
            case 19:
            case 30:
                return 8;
            case 11:
                return 4;
            case 12:
                return 32;
            case 17:
            case 27:
            case 29:
                return 12;
            case 25:
                return 0;
            case 33:
                return 20;
        }
    }

    @Override // X.FP7
    public final FMX A4K(Integer num) {
        float f = 0.6f;
        switch (AbstractC7609F5w.A0G(num)) {
            case 0:
                return new FMX(0.0f, 0.0f, 1.0f, 1.0f);
            case 1:
                return new FMX(0.6f, 0.0f, 0.7f, 0.0f);
            case 2:
                return new FMX(0.0f, 0.1f, 0.4f, 1.0f);
            case 3:
                return new FMX(0.25f, 1.4f, 0.5f, 1.0f);
            case 4:
                return new FMX(0.45f, 0.0f, 0.75f, -0.43f);
            case 5:
                return new FMX(0.17f, 0.89f, 0.32f, 1.27f);
            case 6:
                return new FMX(0.0f, 1.2f, 0.4f, 1.0f);
            case 7:
                break;
            case 8:
                f = 0.9f;
                break;
            case 9:
                return new FMX(0.8f, 0.0f, 0.64f, 1.0f);
            case 10:
                return new FMX(0.64f, 0.0f, 0.67f, 1.0f);
            case 11:
                return new FMX(0.1f, 1.0f, 0.36f, 1.0f);
            case 12:
                return new FMX(0.0f, 1.0f, 0.2f, 1.0f);
            case 13:
                return new FMX(0.04f, 0.0f, 0.0f, 1.0f);
            default:
                return FQN.A00.A4K(num);
        }
        return new FMX(f, 0.0f, 0.1f, 1.0f);
    }

    @Override // X.FP7
    public final FP8 A5K(Integer num) {
        FP5 fp5;
        FP5 fp52;
        switch (AbstractC7609F5w.A0G(num)) {
            case 1:
            case 2:
            case 4:
            case 11:
                fp52 = FP5.A0N;
                return new FP8(fp52, 0.0f);
            case 3:
                fp52 = FP5.A0D;
                return new FP8(fp52, 0.0f);
            case 5:
                fp5 = FP5.A0O;
                return new FP8(fp5, 1.0f);
            case 6:
                fp5 = FP5.A0Q;
                return new FP8(fp5, 1.0f);
            case 7:
                fp5 = FP5.A0R;
                return new FP8(fp5, 1.0f);
            case 8:
            case 9:
            case 15:
            default:
                return FQN.A00.A5K(num);
            case 10:
                fp52 = FP5.A0M;
                return new FP8(fp52, 0.0f);
            case 12:
            case 13:
                fp5 = FP5.A07;
                return new FP8(fp5, 1.0f);
            case 14:
                fp5 = FP5.A09;
                return new FP8(fp5, 1.0f);
            case 16:
                fp5 = FP5.A04;
                return new FP8(fp5, 1.0f);
        }
    }

    @Override // X.FP7
    public final ColorData A6Y(FP5 fp5) {
        DspSpectrumRef dspSpectrumRef;
        int i;
        DspSpectrumRef dspSpectrumRef2;
        int i2;
        int i3;
        switch (AnonymousClass003.A0L(fp5)) {
            case 0:
            case 93:
            case 97:
            case 155:
            case 163:
            case 167:
            case 178:
            case 193:
            case 214:
            case 219:
            case 246:
            case 302:
                dspSpectrumRef2 = null;
                i2 = -16116969;
                i3 = -920329;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 1:
                dspSpectrumRef2 = null;
                i2 = 2131366679;
                i3 = 1727132919;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 2:
                dspSpectrumRef = null;
                i = -16777216;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 3:
            case 98:
            case 147:
            case 159:
            case 160:
            case 165:
            case 169:
            case 250:
            case 251:
            case 256:
            case 257:
            case 301:
            case 313:
            case 314:
                dspSpectrumRef = null;
                i = -1;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 4:
            case 69:
            case 130:
                dspSpectrumRef2 = null;
                i2 = 420090647;
                i3 = 436207615;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 5:
            case 115:
            case 125:
                dspSpectrumRef2 = null;
                i2 = -13285291;
                i3 = -2235672;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 6:
                dspSpectrumRef2 = null;
                i2 = -920329;
                i3 = -13943482;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 7:
            case 26:
            case 71:
            case 96:
            case 139:
            case 245:
                dspSpectrumRef2 = null;
                i2 = -2235672;
                i3 = -12759204;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 8:
            case 20:
            case 57:
            case 118:
            case 156:
            case 157:
            case 266:
            case 303:
            case 304:
                dspSpectrumRef2 = null;
                i2 = -920329;
                i3 = -16116969;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 9:
            case 185:
                dspSpectrumRef2 = null;
                i2 = -1;
                i3 = -16116969;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 10:
                dspSpectrumRef = null;
                i = -1307238105;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 11:
                dspSpectrumRef2 = null;
                i2 = -201595;
                i3 = -10670588;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 12:
                dspSpectrumRef2 = null;
                i2 = -5260860;
                i3 = -12298652;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 13:
                dspSpectrumRef2 = null;
                i2 = -72474;
                i3 = -8715760;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 14:
                dspSpectrumRef2 = null;
                i2 = -2364161;
                i3 = -16502889;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 15:
                dspSpectrumRef2 = null;
                i2 = -1643537;
                i3 = -13943482;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 16:
                dspSpectrumRef2 = null;
                i2 = -5000962;
                i3 = -12253271;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 17:
                dspSpectrumRef2 = null;
                i2 = -3868487;
                i3 = -16169953;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 18:
            case 66:
            case 68:
            case 78:
            case 114:
            case 119:
            case 124:
            case 151:
            case 166:
            case 217:
            case 308:
                dspSpectrumRef = null;
                i = 16777215;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 19:
            case 149:
            case 153:
            case 215:
            case 220:
                dspSpectrumRef2 = null;
                i2 = -16116969;
                i3 = -1;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 21:
            case 188:
            case 240:
            case 242:
            case 249:
            case 253:
            case MC.mwa_time_spent_killswitch.__CONFIG__ /* 306 */:
            case HatchMessageShareDocumentRenderer.MIN_CONTENT_HEIGHT_PX /* 310 */:
                dspSpectrumRef2 = null;
                i2 = -16751392;
                i3 = -16743685;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 22:
            case 191:
            case 230:
            case 231:
            case 232:
            case 259:
                dspSpectrumRef2 = null;
                i2 = -16751392;
                i3 = -11818498;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 23:
            case 25:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
            case 40:
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
            case 42:
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
            case 44:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
            case 48:
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
            case 50:
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
            case 52:
            case 53:
            case 54:
            case 171:
            case 172:
            case 173:
            case 174:
            case HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS /* 175 */:
            case 176:
            case 177:
            case 180:
            case 181:
            case 182:
            case 183:
            case 186:
            case 187:
            case 195:
            case 196:
            case 199:
            case 200:
            case 201:
            case 202:
            case 207:
            case 210:
            case 211:
            case 222:
            case 236:
            case 237:
            case 238:
            case MC.mwa_accounts_center_settings.__CONFIG__ /* 261 */:
            case 262:
            case 317:
            default:
                return FQN.A00.A6Y(fp5);
            case 24:
            case 120:
                dspSpectrumRef2 = null;
                i2 = -10654597;
                i3 = -5984068;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 27:
                dspSpectrumRef2 = null;
                i2 = -9140587;
                i3 = -3353637;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 55:
            case 146:
                dspSpectrumRef2 = null;
                i2 = -1;
                i3 = -14338497;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 56:
                dspSpectrumRef2 = null;
                i2 = -14338497;
                i3 = -920329;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 58:
            case 64:
            case 248:
                dspSpectrumRef2 = null;
                i2 = -1;
                i3 = HatchMapTheme.DEFAULT_PIN_LABEL_COLOR;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 59:
                dspSpectrumRef2 = null;
                i2 = -3545601;
                i3 = -16694347;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 60:
                dspSpectrumRef2 = null;
                i2 = -5900656;
                i3 = -15967964;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 61:
                dspSpectrumRef2 = null;
                i2 = -2105345;
                i3 = -10811176;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                dspSpectrumRef2 = null;
                i2 = -6033178;
                i3 = -16231074;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 63:
            case 208:
            case 265:
            case 275:
                dspSpectrumRef2 = null;
                i2 = -920329;
                i3 = -14931149;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
            case 209:
            case 223:
            case 260:
                dspSpectrumRef2 = null;
                i2 = 872415231;
                i3 = 857022759;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                dspSpectrumRef2 = null;
                i2 = -14931149;
                i3 = -3353637;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS /* 70 */:
                dspSpectrumRef2 = null;
                i2 = -2235672;
                i3 = -12298652;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 72:
                dspSpectrumRef = null;
                i = -6894593;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 73:
                dspSpectrumRef = null;
                i = -10111746;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 74:
                dspSpectrumRef = null;
                i = -16743685;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 75:
            case 145:
                dspSpectrumRef = null;
                i = -16751392;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case HatchIdeaShareImageRenderer.TEXT_LEFT /* 76 */:
                dspSpectrumRef = null;
                i = -15890906;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX /* 77 */:
                dspSpectrumRef = null;
                i = -16290519;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 79:
                dspSpectrumRef = null;
                i = -154551;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 80:
                dspSpectrumRef = null;
                i = -489961;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 81:
                dspSpectrumRef = null;
                i = -1689421;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 82:
                dspSpectrumRef = null;
                i = -4185452;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 83:
                dspSpectrumRef = null;
                i = -8826113;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 84:
                dspSpectrumRef = null;
                i = -9756931;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case ImageCompressor.IMAGE_COMPRESSION_QUALITY /* 85 */:
                dspSpectrumRef = null;
                i = -38793;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 86:
                dspSpectrumRef = null;
                i = -706225;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 87:
                dspSpectrumRef = null;
                i = -14826567;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 88:
                dspSpectrumRef = null;
                i = -16405334;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 89:
                dspSpectrumRef = null;
                i = -5613057;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 90:
                dspSpectrumRef = null;
                i = -6742535;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 91:
                dspSpectrumRef = null;
                i = -274941;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case AuraWaitlistConfettiKt.StandardParticleCount /* 92 */:
                dspSpectrumRef = null;
                i = -1462520;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 94:
            case SelfieSnapshotKt.SELFIE_JPEG_QUALITY /* 95 */:
            case 241:
            case 243:
                dspSpectrumRef2 = null;
                i2 = -6904140;
                i3 = -10654597;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 99:
            case 244:
            case HatchDeviceBleManagerKt.REQUESTED_MTU /* 247 */:
            case 255:
                dspSpectrumRef2 = null;
                i2 = -8088413;
                i3 = -10654597;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 100:
                dspSpectrumRef = null;
                i = -1711276033;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE /* 101 */:
                dspSpectrumRef = null;
                i = 503976727;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 102:
            case 128:
            case 133:
            case 189:
            case 224:
            case 225:
            case 226:
                dspSpectrumRef2 = null;
                i2 = -2944720;
                i3 = -295545;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 103:
                dspSpectrumRef2 = null;
                i2 = -2235672;
                i3 = -13285291;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 104:
                dspSpectrumRef2 = null;
                i2 = -15173646;
                i3 = -1;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 105:
                dspSpectrumRef2 = null;
                i2 = -12298652;
                i3 = -2235672;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 106:
            case HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX /* 112 */:
                dspSpectrumRef2 = null;
                i2 = -13943482;
                i3 = -4208688;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 107:
                dspSpectrumRef2 = null;
                i2 = 1067757756;
                i3 = 436207615;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case MinidumpReader.MODULE_FULL_SIZE /* 108 */:
                dspSpectrumRef2 = null;
                i2 = 866431164;
                i3 = 352321535;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 109:
                dspSpectrumRef2 = null;
                i2 = 648327356;
                i3 = 268435455;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 110:
                dspSpectrumRef2 = null;
                i2 = 430223548;
                i3 = 184549375;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 111:
                dspSpectrumRef2 = null;
                i2 = 212119740;
                i3 = 100663295;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 113:
            case 134:
                dspSpectrumRef2 = null;
                i2 = 1929379839;
                i3 = 1913262871;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 116:
            case 263:
                dspSpectrumRef2 = null;
                i2 = 201326592;
                i3 = 436207615;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 117:
                dspSpectrumRef = null;
                i = 419430400;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 121:
                dspSpectrumRef2 = null;
                i2 = 420090647;
                i3 = 435287287;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 122:
                dspSpectrumRef2 = null;
                i2 = 1275728663;
                i3 = 1291845631;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 123:
                dspSpectrumRef = null;
                i = -16089857;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 126:
                dspSpectrumRef2 = null;
                i2 = -2364161;
                i3 = -13943482;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 127:
                dspSpectrumRef2 = null;
                i2 = -16751392;
                i3 = -1;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS /* 129 */:
                dspSpectrumRef2 = null;
                i2 = -10021;
                i3 = 1727757703;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 131:
                dspSpectrumRef2 = null;
                i2 = 638194455;
                i3 = 872415231;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 132:
                dspSpectrumRef = null;
                i = 1291845631;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 135:
                dspSpectrumRef = null;
                i = -1308622848;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 136:
                dspSpectrumRef = null;
                i = -1728053248;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 137:
                dspSpectrumRef = null;
                i = 671748887;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 138:
            case 140:
            case 233:
            case 234:
                dspSpectrumRef2 = null;
                i2 = -10654597;
                i3 = -6904140;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 141:
                dspSpectrumRef2 = null;
                i2 = 2131366679;
                i3 = 1291845631;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 142:
            case 235:
                dspSpectrumRef = null;
                i = -3353637;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 143:
                dspSpectrumRef2 = null;
                i2 = -1;
                i3 = -14931149;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case VoiceCallForegroundService.AVATAR_TARGET_PX /* 144 */:
                dspSpectrumRef2 = null;
                i2 = -15434967;
                i3 = -12796894;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 148:
            case 152:
            case HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE /* 216 */:
            case 221:
                dspSpectrumRef = null;
                i = -920329;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 150:
            case 154:
            case 164:
            case 168:
            case 213:
            case 309:
                dspSpectrumRef = null;
                i = -16116969;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 158:
                dspSpectrumRef = null;
                i = -2944720;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 161:
                dspSpectrumRef2 = null;
                i2 = 1275728663;
                i3 = 1290925303;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 162:
                dspSpectrumRef2 = null;
                i2 = -1510869769;
                i3 = -16116969;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 170:
                dspSpectrumRef2 = null;
                i2 = -1;
                i3 = 856298263;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE /* 179 */:
            case 192:
            case 194:
                dspSpectrumRef2 = null;
                i2 = -3353637;
                i3 = -13285291;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 184:
                dspSpectrumRef = null;
                i = 872415231;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN /* 190 */:
            case HatchWidgetWebViewKt.HTTP_NO_CONTENT /* 204 */:
                dspSpectrumRef2 = null;
                i2 = -10021;
                i3 = -8715760;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case HatchMessageShareDocumentRenderer.CONTENT_TOP_PX /* 197 */:
                dspSpectrumRef2 = null;
                i2 = -920329;
                i3 = -90714;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 198:
                dspSpectrumRef2 = null;
                i2 = -5634274;
                i3 = -14023676;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 203:
                dspSpectrumRef2 = null;
                i2 = -2944720;
                i3 = -90714;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 205:
                dspSpectrumRef2 = null;
                i2 = -16492597;
                i3 = -8864001;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT /* 206 */:
                dspSpectrumRef2 = null;
                i2 = -3545601;
                i3 = -16502889;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 212:
                dspSpectrumRef2 = null;
                i2 = -1643537;
                i3 = HatchMapTheme.DEFAULT_PIN_LABEL_COLOR;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 218:
            case 227:
            case 229:
                dspSpectrumRef2 = null;
                i2 = -3353637;
                i3 = -12298652;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 228:
                dspSpectrumRef2 = null;
                i2 = 2144130011;
                i3 = 2135184996;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 239:
                dspSpectrumRef = null;
                i = 1912602624;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 252:
                dspSpectrumRef = null;
                i = -5253121;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH /* 254 */:
                dspSpectrumRef2 = null;
                i2 = -1643537;
                i3 = -10193275;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 258:
                dspSpectrumRef = null;
                i = -1643537;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 264:
                dspSpectrumRef2 = null;
                i2 = -1247745;
                i3 = -16775100;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case VoiceSelectionRepositoryJsonKt.MAX_VOICE_ID_LENGTH /* 267 */:
                dspSpectrumRef2 = null;
                i2 = -2294570;
                i3 = -16771576;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 268:
                dspSpectrumRef2 = null;
                i2 = -3356;
                i3 = -14219519;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 269:
                dspSpectrumRef2 = null;
                i2 = -723969;
                i3 = -15203778;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 270:
                dspSpectrumRef2 = null;
                i2 = -3850;
                i3 = -13893364;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 271:
                dspSpectrumRef2 = null;
                i2 = -2622216;
                i3 = -16706532;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 272:
                dspSpectrumRef2 = null;
                i2 = -133446;
                i3 = -14546174;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 273:
            case 290:
                dspSpectrumRef2 = null;
                i2 = -16492597;
                i3 = -16743685;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 274:
                dspSpectrumRef2 = null;
                i2 = -3545601;
                i3 = -16769419;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 276:
                dspSpectrumRef2 = null;
                i2 = -2235672;
                i3 = -14931149;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 277:
                dspSpectrumRef2 = null;
                i2 = -5900656;
                i3 = -16437224;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 278:
                dspSpectrumRef2 = null;
                i2 = -9287;
                i3 = -11659768;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 279:
                dspSpectrumRef2 = null;
                i2 = -2105345;
                i3 = -13564293;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 280:
                dspSpectrumRef2 = null;
                i2 = -206363;
                i3 = -11009506;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 281:
                dspSpectrumRef2 = null;
                i2 = -6033178;
                i3 = -16372424;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 282:
                dspSpectrumRef2 = null;
                i2 = -7862;
                i3 = -12247549;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 283:
            case 291:
                dspSpectrumRef2 = null;
                i2 = -11640721;
                i3 = -9140587;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 284:
            case 292:
                dspSpectrumRef2 = null;
                i2 = -16290519;
                i3 = -16017121;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 285:
            case 293:
                dspSpectrumRef2 = null;
                i2 = -6209788;
                i3 = -2727680;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 286:
            case 294:
                dspSpectrumRef2 = null;
                i2 = -9756931;
                i3 = -8033025;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 287:
            case 295:
                dspSpectrumRef2 = null;
                i2 = -4519868;
                i3 = -642200;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 288:
            case 296:
                dspSpectrumRef2 = null;
                i2 = -15767441;
                i3 = -15953261;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 289:
            case 297:
                dspSpectrumRef2 = null;
                i2 = -7712767;
                i3 = -4950272;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 298:
            case 299:
            case 307:
                dspSpectrumRef = null;
                i = -14338497;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 300:
                dspSpectrumRef = null;
                i = -11818498;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 305:
                dspSpectrumRef2 = null;
                i2 = -8088413;
                i3 = -9140587;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 311:
                dspSpectrumRef2 = null;
                i2 = -14931149;
                i3 = -1643537;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case OggOpusStreamEncoder.PRE_SKIP_48K /* 312 */:
                dspSpectrumRef2 = null;
                i2 = -2364161;
                i3 = 1711309563;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 315:
                dspSpectrumRef = null;
                i = 1728053247;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
            case 316:
                dspSpectrumRef2 = null;
                i2 = -6922749;
                i3 = -2713596;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i2, i3);
            case 318:
                dspSpectrumRef = null;
                i = -7543191;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i, i);
        }
    }

    @Override // X.FP7
    public final float Afi(Integer num) {
        switch (AbstractC7609F5w.A0G(num)) {
            case 0:
            case 5:
            case 30:
                return 28.0f;
            case 1:
            case 27:
            case 44:
                return 2.0f;
            case 2:
            case 8:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return 44.0f;
            case 3:
            case 33:
                return 36.0f;
            case 4:
            case 32:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return 32.0f;
            case 6:
                return 70.0f;
            case 7:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return 60.0f;
            case 9:
                return 14.0f;
            case 10:
            case 36:
                return 48.0f;
            case 11:
                return 77.0f;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return FQN.A00.Afi(num);
            case 20:
                return 0.0f;
            case 21:
                return 10.0f;
            case 22:
                return 112.0f;
            case 23:
                return 12.0f;
            case 24:
                return 132.0f;
            case 25:
                return 16.0f;
            case 26:
                return 18.0f;
            case 28:
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return 20.0f;
            case 29:
            case 42:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return 24.0f;
            case 31:
                return 30.0f;
            case 34:
                return 4.0f;
            case 35:
                return 40.0f;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return 52.0f;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return 56.0f;
            case 40:
                return 72.0f;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return 8.0f;
            case 48:
                return 22.0f;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return 5.0f;
        }
    }

    @Override // X.FP7
    public final float Aft(Hi8 hi8) {
        switch (AnonymousClass003.A0L(hi8)) {
            case 0:
            case 3:
            case 7:
            case 14:
            case 19:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
            case 55:
            case 56:
            case 61:
            case 73:
            case 74:
            case 75:
            case HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX /* 77 */:
            case 79:
            case SelfieSnapshotKt.SELFIE_JPEG_QUALITY /* 95 */:
            case 107:
                return 12.0f;
            case 1:
            case 2:
            case 11:
            case 16:
            case 30:
            case 31:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
            case 40:
            case 44:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
            case 48:
            case 50:
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
            case 54:
            case 58:
            case 63:
            case HatchIdeaShareImageRenderer.TEXT_LEFT /* 76 */:
            case 80:
            case 81:
            case ImageCompressor.IMAGE_COMPRESSION_QUALITY /* 85 */:
            case 89:
            case 90:
            case 93:
            case 94:
            case 99:
            case FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE /* 101 */:
            case 103:
            case 104:
            case 105:
                return 16.0f;
            case 4:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 59:
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
            case 68:
            case 69:
            case MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS /* 70 */:
            case 71:
            default:
                return FQN.A00.Aft(hi8);
            case 5:
            case 10:
            case 12:
            case 17:
            case 32:
            case 57:
            case 64:
            case 86:
                return 8.0f;
            case 6:
            case 9:
            case 15:
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
            case 96:
            case 97:
            case MinidumpReader.MODULE_FULL_SIZE /* 108 */:
                return 6.0f;
            case 8:
            case 18:
            case 34:
            case 36:
            case 98:
                return 4.0f;
            case 13:
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
            case 72:
            case 84:
            case 88:
            case 91:
            case AuraWaitlistConfettiKt.StandardParticleCount /* 92 */:
            case 102:
                return 20.0f;
            case 33:
                return 3.0f;
            case 35:
                return 75.0f;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
            case 60:
                return 0.0f;
            case 42:
            case 52:
                return 52.0f;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return 36.0f;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return 5.0f;
            case 53:
                return 44.0f;
            case 66:
            case 87:
            case 100:
                return 14.0f;
            case 78:
                return 24.0f;
            case 82:
                return 18.0f;
            case 83:
                return 60.0f;
            case 106:
                return 9.0f;
            case 109:
            case 110:
                return 10.0f;
        }
    }

    @Override // X.FP7
    public final FPJ Ahb(Integer num) {
        FP6 fp6;
        FQM fqmA00;
        float f;
        float f2;
        switch (AbstractC7609F5w.A0G(num)) {
            case 0:
            case 1:
            case 4:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0002f);
                f = 15.6f;
                f2 = 0.09f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 2:
            case 3:
            case 22:
            case 23:
            case 24:
            case 25:
            case 30:
            case 31:
            case 32:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 15.2f;
                f2 = 0.3f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 5:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0002f);
                f = 15.6f;
                f2 = 0.09f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 6:
            case 26:
            case 27:
            case 28:
            case 33:
            case 34:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 13.5f;
                f2 = 0.0f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 7:
            case 29:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 13.0f;
                f2 = 0.0f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 8:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 48.0f;
                f2 = 0.9f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                return FQN.A00.Ahb(num);
            case 13:
            case 14:
            case 17:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 24.0f;
                f2 = 0.9f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 15:
            case 16:
            case 18:
            case 19:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 17.1f;
                f2 = 0.43f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 20:
            case 21:
            case 35:
                fp6 = FP6.A08;
                fqmA00 = FQM.A00(1.0001f);
                f = 11.1f;
                f2 = 0.44f;
                return new FPJ(fqmA00, fp6, f, f2);
        }
    }
}
