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
import com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.DspSpectrumRef;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class FQY implements FP7 {
    public static final FQY A00 = new FQY();

    @Override // X.FP7
    public final FMX A4K(Integer num) {
        return AbstractC7610F5x.A0c(num);
    }

    @Override // X.FP7
    public final FP8 A5K(Integer num) {
        FP5 fp5;
        float f;
        int iA0G = AbstractC7609F5w.A0G(num);
        if (iA0G == 12) {
            fp5 = FP5.A07;
            f = 1.0f;
        } else {
            if (iA0G != 13) {
                return FQN.A00.A5K(num);
            }
            fp5 = FP5.A0J;
            f = 0.0f;
        }
        return new FP8(fp5, f);
    }

    @Override // X.FP7
    public final ColorData A6Y(FP5 fp5) {
        int i;
        int i2;
        DspSpectrumRef dspSpectrumRef;
        int i3;
        DspSpectrumRef dspSpectrumRef2;
        int i4;
        int i5;
        switch (AnonymousClass003.A0L(fp5)) {
            case 0:
                i = -14931149;
                i2 = -3419431;
                return new ColorData(null, null, i, i2);
            case 1:
                dspSpectrumRef2 = null;
                i4 = 2132552499;
                i5 = 1724633817;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 2:
                i = -16777216;
                i2 = -16777216;
                return new ColorData(null, null, i, i2);
            case 3:
            case 57:
            case 98:
            case 106:
            case 147:
            case 148:
            case 152:
            case 159:
            case 160:
            case 165:
            case 169:
            case HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE /* 216 */:
            case 221:
            case 313:
            case 314:
                i = -1;
                i2 = -1;
                return new ColorData(null, null, i, i2);
            case 4:
            case 69:
            case 121:
            case 130:
                i = 421276467;
                i2 = 436207615;
                return new ColorData(null, null, i, i2);
            case 5:
            case 115:
            case 125:
                dspSpectrumRef2 = null;
                i4 = -13350828;
                i5 = -2169879;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 6:
                i = -920329;
                i2 = -14141117;
                return new ColorData(null, null, i, i2);
            case 7:
            case 71:
                i = -2169879;
                i2 = -13350828;
                return new ColorData(null, null, i, i2);
            case 8:
                i = -920329;
                i2 = -15787746;
                return new ColorData(null, null, i, i2);
            case 9:
                dspSpectrumRef2 = null;
                i4 = -1;
                i5 = -15787746;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 10:
                i = -1307238105;
                i2 = -1307238105;
                return new ColorData(null, null, i, i2);
            case 11:
                i = -3155;
                i2 = 2142198272;
                return new ColorData(null, null, i, i2);
            case 12:
            case 16:
            case 18:
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
            case 59:
            case 60:
            case 61:
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
            case 66:
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
            case 72:
            case 73:
            case 74:
            case 75:
            case HatchIdeaShareImageRenderer.TEXT_LEFT /* 76 */:
            case HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX /* 77 */:
            case 78:
            case 79:
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
            case 91:
            case AuraWaitlistConfettiKt.StandardParticleCount /* 92 */:
            case 103:
            case 104:
            case 105:
            case 117:
            case 119:
            case 123:
            case 141:
            case 164:
            case 168:
            case 171:
            case 173:
            case 174:
            case HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS /* 175 */:
            case 176:
            case 177:
            case 178:
            case FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE /* 179 */:
            case 180:
            case 181:
            case 182:
            case 183:
            case 186:
            case 187:
            case 189:
            case AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN /* 190 */:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case HatchMessageShareDocumentRenderer.CONTENT_TOP_PX /* 197 */:
            case 198:
            case 199:
            case 200:
            case 201:
            case 202:
            case 203:
            case HatchWidgetWebViewKt.HTTP_NO_CONTENT /* 204 */:
            case 205:
            case HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT /* 206 */:
            case 207:
            case 210:
            case 211:
            case 222:
            case 236:
            case 237:
            case 238:
            case HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH /* 254 */:
            case MC.mwa_accounts_center_settings.__CONFIG__ /* 261 */:
            case 263:
            case 264:
            case 265:
            case 266:
            case VoiceSelectionRepositoryJsonKt.MAX_VOICE_ID_LENGTH /* 267 */:
            case 268:
            case 269:
            case 270:
            case 271:
            case 272:
            case 273:
            case 274:
            case 275:
            case 276:
            case 277:
            case 278:
            case 279:
            case 280:
            case 281:
            case 282:
            case 283:
            case 284:
            case 285:
            case 286:
            case 287:
            case 288:
            case 289:
            case 290:
            case 291:
            case 292:
            case 293:
            case 294:
            case 295:
            case 296:
            case 297:
            case 299:
            case 301:
            case 308:
            case HatchMessageShareDocumentRenderer.MIN_CONTENT_HEIGHT_PX /* 310 */:
            case 311:
            case OggOpusStreamEncoder.PRE_SKIP_48K /* 312 */:
            default:
                return FQN.A00.A6Y(fp5);
            case 13:
                i = -20041;
                i2 = 2141850142;
                return new ColorData(null, null, i, i2);
            case 14:
                dspSpectrumRef2 = null;
                i4 = -5253121;
                i5 = 2130725817;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 15:
                i = -1643537;
                i2 = -13943482;
                return new ColorData(null, null, i, i2);
            case 17:
                i = -4590166;
                i2 = 2130738462;
                return new ColorData(null, null, i, i2);
            case 19:
            case 93:
            case 155:
            case 163:
            case 167:
            case 214:
            case 219:
                i = -14931149;
                i2 = -1;
                return new ColorData(null, null, i, i2);
            case 20:
            case 118:
            case 156:
            case 157:
            case 185:
            case 303:
            case 304:
                dspSpectrumRef2 = null;
                i4 = -1;
                i5 = -14931149;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 21:
            case 22:
            case 172:
            case 188:
            case 240:
            case 242:
            case 249:
            case 250:
            case MC.mwa_time_spent_killswitch.__CONFIG__ /* 306 */:
                i = -16751392;
                i2 = -12081670;
                return new ColorData(null, null, i, i2);
            case 24:
            case 140:
                i = -9996150;
                i2 = -8022620;
                return new ColorData(null, null, i, i2);
            case 26:
            case 218:
                dspSpectrumRef2 = null;
                i4 = -3419431;
                i5 = -12166551;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 27:
            case 253:
                i = -3419431;
                i2 = -3419431;
                return new ColorData(null, null, i, i2);
            case 55:
                i = -1;
                i2 = -14141117;
                return new ColorData(null, null, i, i2);
            case 56:
                i = -14931149;
                i2 = -12166551;
                return new ColorData(null, null, i, i2);
            case 58:
            case 64:
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
            case 143:
            case 248:
            case 260:
                i = -1;
                i2 = -14931149;
                return new ColorData(null, null, i, i2);
            case 63:
                i = -920329;
                i2 = -14931149;
                return new ColorData(null, null, i, i2);
            case 68:
                i = 422856788;
                i2 = 1712265502;
                return new ColorData(null, null, i, i2);
            case MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS /* 70 */:
            case 139:
            case 245:
                i = -2169879;
                i2 = -12166551;
                return new ColorData(null, null, i, i2);
            case 94:
                i = -3419431;
                i2 = -13350828;
                return new ColorData(null, null, i, i2);
            case SelfieSnapshotKt.SELFIE_JPEG_QUALITY /* 95 */:
                i = 1058810675;
                i2 = 654311423;
                return new ColorData(null, null, i, i2);
            case 96:
                dspSpectrumRef2 = null;
                i4 = -2169879;
                i5 = -14141117;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 97:
                i = -16116969;
                i2 = -920329;
                return new ColorData(null, null, i, i2);
            case 99:
                i = -8088413;
                i2 = -10654597;
                return new ColorData(null, null, i, i2);
            case 100:
                dspSpectrumRef = null;
                i3 = -1711276033;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i3, i3);
            case FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE /* 101 */:
                i = 859064404;
                i2 = -1727063778;
                return new ColorData(null, null, i, i2);
            case 102:
            case 133:
                i = -2345156;
                i2 = -1024151;
                return new ColorData(null, null, i, i2);
            case 107:
                dspSpectrumRef2 = null;
                i4 = 1073741823;
                i5 = 436207615;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case MinidumpReader.MODULE_FULL_SIZE /* 108 */:
                i = 872415231;
                i2 = 352321535;
                return new ColorData(null, null, i, i2);
            case 109:
                i = 654311423;
                i2 = 268435455;
                return new ColorData(null, null, i, i2);
            case 110:
                i = 436207615;
                i2 = 184549375;
                return new ColorData(null, null, i, i2);
            case 111:
                dspSpectrumRef2 = null;
                i4 = 218103807;
                i5 = 100663295;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX /* 112 */:
                i = -14931149;
                i2 = -920329;
                return new ColorData(null, null, i, i2);
            case 113:
            case 134:
                i = 1929379839;
                i2 = 1914448691;
                return new ColorData(null, null, i, i2);
            case 114:
            case 124:
            case 126:
            case 127:
            case 151:
            case 209:
            case 217:
                i = 16777215;
                i2 = 16777215;
                return new ColorData(null, null, i, i2);
            case 116:
                i = 201326592;
                i2 = 436207615;
                return new ColorData(null, null, i, i2);
            case 120:
                i = -9996150;
                i2 = -5786689;
                return new ColorData(null, null, i, i2);
            case 122:
            case 161:
                i = 1276914483;
                i2 = 1291845631;
                return new ColorData(null, null, i, i2);
            case 128:
                i = -3667416;
                i2 = -1024151;
                return new ColorData(null, null, i, i2);
            case AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS /* 129 */:
                i = -10535;
                i2 = 1727029097;
                return new ColorData(null, null, i, i2);
            case 131:
                i = 639380275;
                i2 = 872415231;
                return new ColorData(null, null, i, i2);
            case 132:
                i = 1291845631;
                i2 = 1291845631;
                return new ColorData(null, null, i, i2);
            case 135:
            case 136:
                i = -1728053248;
                i2 = -1728053248;
                return new ColorData(null, null, i, i2);
            case 137:
                i = 204752980;
                i2 = -1727063778;
                return new ColorData(null, null, i, i2);
            case 138:
            case 244:
                dspSpectrumRef2 = null;
                i4 = -8022620;
                i5 = -9996150;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 142:
                i = 1929379839;
                i2 = 1929379839;
                return new ColorData(null, null, i, i2);
            case VoiceCallForegroundService.AVATAR_TARGET_PX /* 144 */:
                i = -16745186;
                i2 = -14101966;
                return new ColorData(null, null, i, i2);
            case 145:
                i = -16751392;
                i2 = -16751392;
                return new ColorData(null, null, i, i2);
            case 146:
                i = -1;
                i2 = -14338497;
                return new ColorData(null, null, i, i2);
            case 149:
            case 153:
            case 215:
            case 220:
                i = -16116969;
                i2 = -1;
                return new ColorData(null, null, i, i2);
            case 150:
            case 154:
            case 213:
                i = -14931149;
                i2 = -14931149;
                return new ColorData(null, null, i, i2);
            case 158:
                i = -2944720;
                i2 = -2944720;
                return new ColorData(null, null, i, i2);
            case 162:
                i = -1509949441;
                i2 = -14931149;
                return new ColorData(null, null, i, i2);
            case 166:
                i = 204752980;
                i2 = 856627486;
                return new ColorData(null, null, i, i2);
            case 170:
                i = -1;
                i2 = HatchAvatarStoryImageRenderer.VIDEO_SHADOW_COLOR;
                return new ColorData(null, null, i, i2);
            case 184:
                i = 872415231;
                i2 = 872415231;
                return new ColorData(null, null, i, i2);
            case 208:
                i = 167772160;
                i2 = 822083583;
                return new ColorData(null, null, i, i2);
            case 212:
                dspSpectrumRef2 = null;
                i4 = -1643537;
                i5 = HatchMapTheme.DEFAULT_PIN_LABEL_COLOR;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 223:
                i = 872415231;
                i2 = 857022759;
                return new ColorData(null, null, i, i2);
            case 224:
                i = -2944720;
                i2 = -295545;
                return new ColorData(null, null, i, i2);
            case 225:
            case 226:
                dspSpectrumRef2 = null;
                i4 = -2944720;
                i5 = -295545;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 227:
            case 229:
            case 255:
                i = -3419431;
                i2 = -12166551;
                return new ColorData(null, null, i, i2);
            case 228:
                i = 2144064217;
                i2 = 2135317097;
                return new ColorData(null, null, i, i2);
            case 230:
            case 231:
            case 232:
                i = -16751392;
                i2 = -11818498;
                return new ColorData(null, null, i, i2);
            case 233:
            case 234:
            case 262:
                dspSpectrumRef2 = null;
                i4 = -12166551;
                i5 = -3419431;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 235:
                i = -1291845633;
                i2 = -1291845633;
                return new ColorData(null, null, i, i2);
            case 239:
                i = 1913262871;
                i2 = 1913262871;
                return new ColorData(null, null, i, i2);
            case 241:
            case 243:
                i = -5786689;
                i2 = -8022620;
                return new ColorData(null, null, i, i2);
            case 246:
                i = -13350828;
                i2 = -3419431;
                return new ColorData(null, null, i, i2);
            case HatchDeviceBleManagerKt.REQUESTED_MTU /* 247 */:
                i = 1714702420;
                i2 = 1724633817;
                return new ColorData(null, null, i, i2);
            case 251:
                i = 1711301856;
                i2 = 1715971578;
                return new ColorData(null, null, i, i2);
            case 252:
                dspSpectrumRef2 = null;
                i4 = 1711301856;
                i5 = 1715971578;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 256:
                i = -920329;
                i2 = -10258294;
                return new ColorData(null, null, i, i2);
            case 257:
                dspSpectrumRef2 = null;
                i4 = -394244;
                i5 = -12100758;
                return new ColorData(dspSpectrumRef2, dspSpectrumRef2, i4, i5);
            case 258:
                i = -1380880;
                i2 = -12890276;
                return new ColorData(null, null, i, i2);
            case 259:
                i = -16752224;
                i2 = -8209946;
                return new ColorData(null, null, i, i2);
            case 298:
            case 307:
                i = -14141117;
                i2 = -14141117;
                return new ColorData(null, null, i, i2);
            case 300:
                i = -12081670;
                i2 = -12081670;
                return new ColorData(null, null, i, i2);
            case 302:
                i = -14931149;
                i2 = -2169879;
                return new ColorData(null, null, i, i2);
            case 305:
                i = -8022620;
                i2 = -5786689;
                return new ColorData(null, null, i, i2);
            case 309:
                i = -15787746;
                i2 = -15787746;
                return new ColorData(null, null, i, i2);
            case 315:
                dspSpectrumRef = null;
                i3 = 1728053247;
                return new ColorData(dspSpectrumRef, dspSpectrumRef, i3, i3);
            case 316:
                i = -5285376;
                i2 = -9166;
                return new ColorData(null, null, i, i2);
        }
    }

    @Override // X.FP7
    public final int A7P(Integer num) {
        switch (AbstractC7609F5w.A0G(num)) {
            case 0:
            case 7:
            case 13:
            case 14:
            case 18:
            case 20:
            case 22:
            case 26:
            case 27:
            case 28:
            case 31:
            case 34:
            case 35:
                return 12;
            case 1:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 19:
            case 21:
            case 23:
            case 24:
            case 25:
            case 32:
            default:
                return FQN.A00.A7P(num);
            case 2:
            case 3:
                return 16;
            case 10:
            case 16:
            case 29:
                return 8;
            case 11:
            case 15:
            case 17:
            case 30:
            case 33:
                return 4;
            case 12:
                return 24;
        }
    }

    @Override // X.FP7
    public final float Afi(Integer num) {
        return AbstractC7610F5x.A05(num);
    }

    @Override // X.FP7
    public final float Aft(Hi8 hi8) {
        if (AnonymousClass003.A0L(hi8) == 5) {
            return 6.0f;
        }
        return FQN.A00.Aft(hi8);
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
                fp6 = FP6.A07;
                fqmA00 = FQM.A00(1.04f);
                f = 15.0f;
                f2 = -0.02f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 1:
            case 5:
                fp6 = FP6.A05;
                fqmA00 = FQM.A00(1.04f);
                f = 15.0f;
                f2 = -0.02f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 2:
            case 22:
            case 24:
            case 30:
            case 31:
                fp6 = FP6.A06;
                fqmA00 = FQM.A00(0.96f);
                f = 16.0f;
                f2 = -0.1f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 3:
            case 25:
            case 32:
                fp6 = FP6.A05;
                fqmA00 = FQM.A00(0.96f);
                f = 16.0f;
                f2 = -0.1f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 6:
            case 28:
                fp6 = FP6.A07;
                fqmA00 = FQM.A00(1.1f);
                f = 13.0f;
                f2 = -0.04f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 7:
            case 29:
                fp6 = FP6.A05;
                fqmA00 = FQM.A00(1.06f);
                f = 13.0f;
                f2 = -0.04f;
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
                fp6 = FP6.A03;
                fqmA00 = FQM.A00(0.96f);
                f = 24.0f;
                f2 = 0.12f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 15:
            case 16:
            case 18:
            case 19:
                fp6 = FP6.A05;
                fqmA00 = FQM.A00(1.001f);
                f = 17.0f;
                f2 = 0.06f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 20:
            case 21:
            case 35:
                fp6 = FP6.A04;
                fqmA00 = FQM.A00(1.27f);
                f = 11.0f;
                f2 = -0.04f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 23:
                fp6 = FP6.A05;
                fqmA00 = FQM.A00(0.96f);
                f = 16.0f;
                f2 = -0.1f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 26:
                fp6 = FP6.A06;
                fqmA00 = FQM.A00(1.04f);
                f = 15.0f;
                f2 = -0.06f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 27:
            case 34:
                fp6 = FP6.A05;
                fqmA00 = FQM.A00(1.04f);
                f = 15.0f;
                f2 = -0.06f;
                return new FPJ(fqmA00, fp6, f, f2);
            case 33:
                fp6 = FP6.A06;
                fqmA00 = FQM.A00(1.04f);
                f = 15.0f;
                f2 = -0.06f;
                return new FPJ(fqmA00, fp6, f, f2);
        }
    }
}
