package com.facebook.tigon.interceptors.deviceidentifiers;

import X.AbstractC10361HCb;
import X.AbstractC7531Ezs;
import X.AbstractC7610F5x;
import X.BV4;
import X.BV5;
import X.C3cG;
import X.C4992DKo;
import X.C4JM;
import X.C5246DeB;
import X.C7384Etj;
import X.CFK;
import X.DSa;
import X.ETi;
import X.F0f;
import X.F2k;
import X.HCY;
import X.HCa;
import X.InterfaceC7359EnW;
import android.app.Application;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.jni.HybridData;
import com.facebook.tigon.interceptors.RequestInterceptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class DeviceIdentifiersInterceptor extends RequestInterceptor {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {C3cG.A0y(DeviceIdentifiersInterceptor.class, "mobileConfig", "getMobileConfig()Lcom/facebook/mobileconfig/factory/module/SessionlessMetaConfig;")};
    public static final String TAG = "DeviceIdentifiersInterceptor";
    public static boolean isLibraryLoaded;
    public final F2k mobileConfig$delegate = new F0f(65561);
    public final DeviceIdentifiersNativeProvider provider = (DeviceIdentifiersNativeProvider) C5246DeB.A00(65579);

    static {
        HCa hCaA00;
        FileInputStream fileInputStream;
        byte[] bArr;
        int i;
        int i2;
        Application applicationA00 = C4JM.A00();
        if (HCY.A01 != null) {
            hCaA00 = HCY.A01;
        } else {
            synchronized (HCY.class) {
                if (HCY.A01 != null) {
                    hCaA00 = HCY.A01;
                } else {
                    File fileStreamPath = applicationA00.getFileStreamPath("startup_experiments");
                    if (fileStreamPath == null || !fileStreamPath.exists()) {
                        hCaA00 = A00();
                        HCY.A01 = hCaA00;
                    } else {
                        long length = fileStreamPath.length();
                        long length2 = fileStreamPath.length();
                        if (length > 2147483647L) {
                            HCY.A00("File too large: %d %s", Long.valueOf(length2), "startup_experiments");
                        } else {
                            int i3 = (int) length2;
                            try {
                                fileInputStream = new FileInputStream(fileStreamPath);
                                try {
                                    bArr = new byte[i3];
                                    int iMin = Math.min(i3, i3);
                                    i = 0;
                                    while (true) {
                                        if (i >= iMin) {
                                            break;
                                        }
                                        int i4 = fileInputStream.read(bArr, i, iMin - i);
                                        if (i4 < 0) {
                                            i2 = -1;
                                            if (i4 != -1 || i != 0) {
                                                break;
                                            }
                                        } else {
                                            i += i4;
                                        }
                                    }
                                    i2 = i;
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        AbstractC7531Ezs.A00(fileInputStream, th);
                                        throw th2;
                                    }
                                }
                            } catch (Exception e) {
                                String message = e.getMessage();
                                C7384Etj.A0X(message);
                                Object[] objArrCopyOf = Arrays.copyOf(new Object[]{message, "startup_experiments"}, 2);
                                String str = String.format("Cannot read file: %s %s", Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                                CFK.A08("FbColdStartExperimentsLoader", str, e);
                                if (HCY.A00 == null) {
                                    HCY.A00 = str;
                                }
                            }
                            if (i > 0) {
                                hCaA00 = A01(ByteBuffer.wrap(bArr, 0, i));
                                fileInputStream.close();
                                HCY.A01 = hCaA00;
                            }
                            HCY.A00("Unable to slurp file: %d %s", Integer.valueOf(i2), "startup_experiments");
                            fileInputStream.close();
                        }
                        hCaA00 = A00();
                        HCY.A01 = hCaA00;
                    }
                }
            }
        }
        if (hCaA00.A1V) {
            isLibraryLoaded = true;
            ETi.loadLibrary("deviceidentifiersinterceptor");
        }
    }

    private final native HybridData initHybrid(boolean z, DeviceIdentifiersNativeProvider deviceIdentifiersNativeProvider);

    public static HCa A00() {
        HCa hCa = new HCa();
        hCa.A1k = false;
        hCa.A0I = false;
        hCa.A0m = false;
        hCa.A1P = false;
        hCa.A1R = false;
        hCa.A1O = false;
        hCa.A1Q = false;
        hCa.A06 = 0;
        hCa.A1G = false;
        hCa.A1T = false;
        hCa.A0S = false;
        hCa.A1l = true;
        hCa.A0i = false;
        hCa.A1S = false;
        hCa.A1p = false;
        hCa.A1q = false;
        hCa.A0V = false;
        hCa.A0U = false;
        hCa.A0o = false;
        hCa.A1H = false;
        hCa.A1h = false;
        hCa.A1a = false;
        hCa.A1Y = false;
        hCa.A1f = false;
        hCa.A1e = false;
        hCa.A0W = false;
        hCa.A0L = false;
        hCa.A1Z = false;
        hCa.A1c = false;
        hCa.A0J = false;
        hCa.A0T = false;
        hCa.A0F = "";
        hCa.A1U = false;
        hCa.A0a = false;
        hCa.A0d = false;
        hCa.A0b = false;
        hCa.A1n = false;
        hCa.A1m = false;
        hCa.A1b = true;
        hCa.A0D = "";
        hCa.A1N = true;
        hCa.A0Y = false;
        hCa.A0P = true;
        hCa.A1V = true;
        hCa.A0C = "";
        hCa.A1X = false;
        hCa.A0f = false;
        hCa.A0e = false;
        hCa.A0n = false;
        hCa.A19 = false;
        hCa.A1M = false;
        hCa.A0R = false;
        hCa.A0G = false;
        hCa.A1o = false;
        hCa.A0H = false;
        hCa.A00 = 0;
        hCa.A09 = "";
        hCa.A01 = 60000;
        hCa.A1J = false;
        hCa.A1I = false;
        hCa.A1C = false;
        hCa.A18 = false;
        hCa.A1A = false;
        hCa.A1B = false;
        hCa.A1D = false;
        hCa.A1E = false;
        hCa.A1r = false;
        hCa.A1W = false;
        hCa.A0M = false;
        hCa.A0v = false;
        hCa.A0w = false;
        hCa.A0x = false;
        hCa.A0z = false;
        hCa.A0q = false;
        hCa.A0r = false;
        hCa.A0u = false;
        hCa.A10 = false;
        hCa.A0s = false;
        hCa.A0y = false;
        hCa.A1K = false;
        hCa.A14 = false;
        hCa.A15 = false;
        hCa.A16 = false;
        hCa.A11 = false;
        hCa.A0E = "";
        hCa.A0A = "";
        hCa.A1L = false;
        hCa.A05 = 20;
        hCa.A07 = 4;
        hCa.A0X = false;
        hCa.A0K = false;
        hCa.A02 = 0;
        hCa.A0B = "";
        hCa.A0t = false;
        hCa.A17 = false;
        hCa.A1F = false;
        hCa.A12 = false;
        hCa.A1j = false;
        hCa.A0p = false;
        hCa.A13 = false;
        hCa.A0N = true;
        hCa.A1i = false;
        hCa.A1g = false;
        hCa.A0O = false;
        hCa.A1d = false;
        hCa.A0Q = false;
        hCa.A04 = 0;
        hCa.A03 = 0;
        hCa.A08 = 0L;
        hCa.A0j = false;
        hCa.A0h = false;
        hCa.A0k = false;
        hCa.A0g = false;
        hCa.A0c = false;
        hCa.A0Z = false;
        hCa.A0l = false;
        return hCa;
    }

    public static HCa A01(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 1 || i > 3) {
            throw new IOException(String.format("Version incorrect: %d not between 1 and 3", BV5.A1Y(i)));
        }
        if (i >= 3) {
            byteBuffer.getInt();
        }
        Charset charsetForName = Charset.forName(HatchWebPageParserKt.UTF_8);
        int iPosition = byteBuffer.position();
        byteBuffer.position(byteBuffer.limit() - 2);
        int i2 = byteBuffer.getShort();
        byteBuffer.position((byteBuffer.limit() - 2) - (i2 * 8));
        long[] jArr = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = byteBuffer.getLong();
        }
        byteBuffer.position(iPosition);
        HCa hCaA00 = A00();
        while (true) {
            short s = byteBuffer.getShort();
            if (s != -1) {
                long j = jArr[s];
                if (j == 205149882142402929L) {
                    while (true) {
                        short s2 = byteBuffer.getShort();
                        if (s2 != -1) {
                            switch (s2) {
                                case 2:
                                    hCaA00.A0V = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 9:
                                    hCaA00.A0I = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 12:
                                    hCaA00.A1N = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 13:
                                    hCaA00.A1k = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 18:
                                    hCaA00.A0m = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 36:
                                    hCaA00.A1P = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                                    hCaA00.A1R = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                                    hCaA00.A0S = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 40:
                                    hCaA00.A1O = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                                    hCaA00.A1Q = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 58:
                                    hCaA00.A1l = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 61:
                                    hCaA00.A1G = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                                    hCaA00.A1T = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 100:
                                    hCaA00.A1q = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 102:
                                    hCaA00.A1S = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 106:
                                    hCaA00.A1p = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 107:
                                    hCaA00.A0i = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 130:
                                    hCaA00.A0o = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 132:
                                    hCaA00.A1H = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 134:
                                    hCaA00.A1h = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 135:
                                    hCaA00.A1a = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 138:
                                    hCaA00.A0L = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 140:
                                    hCaA00.A0W = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 148:
                                    hCaA00.A1Z = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 149:
                                    hCaA00.A1c = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 171:
                                    hCaA00.A1U = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 183:
                                    hCaA00.A0a = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 187:
                                    hCaA00.A0d = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 202:
                                    hCaA00.A0U = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 203:
                                    hCaA00.A1b = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 215:
                                    hCaA00.A0T = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE /* 216 */:
                                    hCaA00.A0J = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 218:
                                    hCaA00.A0b = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 220:
                                    hCaA00.A1n = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 221:
                                    hCaA00.A1m = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 223:
                                    hCaA00.A0Y = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 224:
                                    hCaA00.A1Y = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 225:
                                    hCaA00.A1f = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                case 226:
                                    hCaA00.A1e = AbstractC7610F5x.A1X(byteBuffer);
                                    break;
                                default:
                                    byteBuffer.get();
                                    break;
                            }
                        }
                    }
                } else if (j == 5935209819610541132L) {
                    while (true) {
                        short s3 = byteBuffer.getShort();
                        if (s3 != -1) {
                            if (s3 != 4) {
                                byteBuffer.get();
                            } else {
                                hCaA00.A0P = AbstractC7610F5x.A1X(byteBuffer);
                            }
                        }
                    }
                } else if (j == -8609494210452357620L) {
                    while (true) {
                        short s4 = byteBuffer.getShort();
                        if (s4 != -1) {
                            if (s4 != 2) {
                                byteBuffer.get();
                            } else {
                                hCaA00.A1V = AbstractC7610F5x.A1X(byteBuffer);
                            }
                        }
                    }
                } else if (j == 4973243883858654699L) {
                    while (true) {
                        short s5 = byteBuffer.getShort();
                        if (s5 != -1) {
                            if (s5 == 8) {
                                hCaA00.A1X = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s5 == 29) {
                                hCaA00.A0f = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s5 != 30) {
                                byteBuffer.get();
                            } else {
                                hCaA00.A0e = AbstractC7610F5x.A1X(byteBuffer);
                            }
                        }
                    }
                } else if (j == -2688148380454997863L) {
                    while (true) {
                        short s6 = byteBuffer.getShort();
                        if (s6 != -1) {
                            if (s6 == 7) {
                                hCaA00.A19 = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s6 != 15) {
                                byteBuffer.get();
                            } else {
                                hCaA00.A0n = AbstractC7610F5x.A1X(byteBuffer);
                            }
                        }
                    }
                } else if (j == -6232548554280972551L) {
                    while (true) {
                        short s7 = byteBuffer.getShort();
                        if (s7 != -1) {
                            if (s7 == 0) {
                                hCaA00.A1M = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s7 == 19) {
                                hCaA00.A0R = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s7 == 26) {
                                hCaA00.A0G = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s7 == 30) {
                                hCaA00.A1o = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s7 != 34) {
                                switch (s7) {
                                    case 57:
                                        hCaA00.A1J = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    case 58:
                                        hCaA00.A1I = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    case 59:
                                        hCaA00.A1C = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    default:
                                        byteBuffer.get();
                                        break;
                                }
                            } else {
                                hCaA00.A0H = AbstractC7610F5x.A1X(byteBuffer);
                            }
                        }
                    }
                } else if (j == -6933452518549216388L) {
                    while (true) {
                        short s8 = byteBuffer.getShort();
                        if (s8 != -1) {
                            if (s8 != 1) {
                                byteBuffer.get();
                            } else {
                                hCaA00.A18 = AbstractC7610F5x.A1X(byteBuffer);
                            }
                        }
                    }
                } else if (j == 8433120198057474408L) {
                    while (true) {
                        short s9 = byteBuffer.getShort();
                        if (s9 != -1) {
                            if (s9 == 69) {
                                hCaA00.A1D = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s9 == 80) {
                                hCaA00.A1E = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s9 != 95) {
                                switch (s9) {
                                    case 83:
                                        hCaA00.A1r = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    case 84:
                                        hCaA00.A1B = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    case ImageCompressor.IMAGE_COMPRESSION_QUALITY /* 85 */:
                                        hCaA00.A1A = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    default:
                                        byteBuffer.get();
                                        break;
                                }
                            } else {
                                hCaA00.A1W = AbstractC7610F5x.A1X(byteBuffer);
                            }
                        }
                    }
                } else if (j == -4350879106606340548L) {
                    while (true) {
                        short s10 = byteBuffer.getShort();
                        if (s10 != -1) {
                            if (s10 == 0) {
                                hCaA00.A0v = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s10 == 30) {
                                hCaA00.A0s = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s10 == 38) {
                                hCaA00.A0z = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s10 == 45) {
                                hCaA00.A0u = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s10 == 57) {
                                hCaA00.A11 = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s10 == 64) {
                                hCaA00.A0y = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s10 == 6) {
                                hCaA00.A0M = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s10 == 7) {
                                hCaA00.A1K = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s10 == 42) {
                                hCaA00.A0w = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s10 != 43) {
                                switch (s10) {
                                    case 10:
                                        hCaA00.A14 = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    case 11:
                                        hCaA00.A16 = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    case 12:
                                        hCaA00.A0x = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    default:
                                        switch (s10) {
                                            case 14:
                                                hCaA00.A15 = AbstractC7610F5x.A1X(byteBuffer);
                                                break;
                                            case 15:
                                                hCaA00.A0q = AbstractC7610F5x.A1X(byteBuffer);
                                                break;
                                            case 16:
                                                hCaA00.A10 = AbstractC7610F5x.A1X(byteBuffer);
                                                break;
                                            default:
                                                byteBuffer.get();
                                                break;
                                        }
                                }
                            } else {
                                hCaA00.A0r = AbstractC7610F5x.A1X(byteBuffer);
                            }
                        }
                    }
                } else if (j == 3466665905104686251L) {
                    while (true) {
                        short s11 = byteBuffer.getShort();
                        if (s11 != -1) {
                            if (s11 == 4) {
                                hCaA00.A1L = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s11 == 12) {
                                hCaA00.A0X = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s11 == 17) {
                                hCaA00.A0K = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s11 == 31) {
                                hCaA00.A0N = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s11 == 33) {
                                hCaA00.A1i = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s11 == 41) {
                                hCaA00.A1d = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s11 == 37) {
                                hCaA00.A1g = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s11 != 38) {
                                switch (s11) {
                                    case 21:
                                        hCaA00.A0t = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    case 22:
                                        hCaA00.A17 = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    case 23:
                                        hCaA00.A1F = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    default:
                                        switch (s11) {
                                            case 25:
                                                hCaA00.A12 = AbstractC7610F5x.A1X(byteBuffer);
                                                break;
                                            case 26:
                                                hCaA00.A1j = AbstractC7610F5x.A1X(byteBuffer);
                                                break;
                                            case 27:
                                                hCaA00.A0p = AbstractC7610F5x.A1X(byteBuffer);
                                                break;
                                            case 28:
                                                hCaA00.A13 = AbstractC7610F5x.A1X(byteBuffer);
                                                break;
                                            default:
                                                byteBuffer.get();
                                                break;
                                        }
                                }
                            } else {
                                hCaA00.A0O = AbstractC7610F5x.A1X(byteBuffer);
                            }
                        }
                    }
                } else if (j == -210475169871049954L) {
                    while (true) {
                        short s12 = byteBuffer.getShort();
                        if (s12 != -1) {
                            if (s12 != 1) {
                                byteBuffer.get();
                            } else {
                                hCaA00.A0Q = AbstractC7610F5x.A1X(byteBuffer);
                            }
                        }
                    }
                } else if (j == 6841869707505414924L) {
                    while (true) {
                        short s13 = byteBuffer.getShort();
                        if (s13 != -1) {
                            if (s13 == 3) {
                                hCaA00.A0j = AbstractC7610F5x.A1X(byteBuffer);
                            } else if (s13 != 12) {
                                switch (s13) {
                                    case 6:
                                        hCaA00.A0h = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    case 7:
                                        hCaA00.A0k = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    case 8:
                                        hCaA00.A0g = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    case 9:
                                        hCaA00.A0c = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    case 10:
                                        hCaA00.A0Z = AbstractC7610F5x.A1X(byteBuffer);
                                        break;
                                    default:
                                        byteBuffer.get();
                                        break;
                                }
                            } else {
                                hCaA00.A0l = AbstractC7610F5x.A1X(byteBuffer);
                            }
                        }
                    }
                } else {
                    while (byteBuffer.getShort() != -1) {
                        byteBuffer.get();
                    }
                }
            } else {
                while (true) {
                    short s14 = byteBuffer.getShort();
                    if (s14 != -1) {
                        long j2 = jArr[s14];
                        if (j2 == 205149882142402929L) {
                            while (true) {
                                short s15 = byteBuffer.getShort();
                                if (s15 != -1) {
                                    if (s15 != 48) {
                                        byteBuffer.getInt();
                                    } else {
                                        hCaA00.A06 = byteBuffer.getInt();
                                    }
                                }
                            }
                        } else if (j2 == -6232548554280972551L) {
                            while (true) {
                                short s16 = byteBuffer.getShort();
                                if (s16 != -1) {
                                    if (s16 == 33) {
                                        hCaA00.A00 = byteBuffer.getInt();
                                    } else if (s16 != 36) {
                                        byteBuffer.getInt();
                                    } else {
                                        hCaA00.A01 = byteBuffer.getInt();
                                    }
                                }
                            }
                        } else if (j2 == 3466665905104686251L) {
                            while (true) {
                                short s17 = byteBuffer.getShort();
                                if (s17 != -1) {
                                    if (s17 == 8) {
                                        hCaA00.A05 = byteBuffer.getInt();
                                    } else if (s17 == 9) {
                                        hCaA00.A07 = byteBuffer.getInt();
                                    } else if (s17 != 18) {
                                        byteBuffer.getInt();
                                    } else {
                                        hCaA00.A02 = byteBuffer.getInt();
                                    }
                                }
                            }
                        } else if (j2 == -210475169871049954L) {
                            while (true) {
                                short s18 = byteBuffer.getShort();
                                if (s18 != -1) {
                                    if (s18 == 2) {
                                        hCaA00.A04 = byteBuffer.getInt();
                                    } else if (s18 != 3) {
                                        byteBuffer.getInt();
                                    } else {
                                        hCaA00.A03 = byteBuffer.getInt();
                                    }
                                }
                            }
                        } else {
                            while (byteBuffer.getShort() != -1) {
                                byteBuffer.getInt();
                            }
                        }
                    } else {
                        while (true) {
                            short s19 = byteBuffer.getShort();
                            if (s19 == -1) {
                                while (byteBuffer.getShort() != -1) {
                                    while (byteBuffer.getShort() != -1) {
                                        byteBuffer.getDouble();
                                    }
                                }
                                if (i >= 2) {
                                    while (true) {
                                        short s20 = byteBuffer.getShort();
                                        if (s20 != -1) {
                                            long j3 = jArr[s20];
                                            if (j3 == 205149882142402929L) {
                                                while (true) {
                                                    short s21 = byteBuffer.getShort();
                                                    if (s21 != -1) {
                                                        if (s21 == 168) {
                                                            hCaA00.A0F = A02(byteBuffer, charsetForName);
                                                        } else if (s21 != 211) {
                                                            A03(byteBuffer);
                                                        } else {
                                                            hCaA00.A0D = A02(byteBuffer, charsetForName);
                                                        }
                                                    }
                                                }
                                            } else if (j3 == 8401887318822129211L) {
                                                while (true) {
                                                    short s22 = byteBuffer.getShort();
                                                    if (s22 != -1) {
                                                        if (s22 != 1) {
                                                            A03(byteBuffer);
                                                        } else {
                                                            hCaA00.A0C = A02(byteBuffer, charsetForName);
                                                        }
                                                    }
                                                }
                                            } else if (j3 == -6232548554280972551L) {
                                                while (true) {
                                                    short s23 = byteBuffer.getShort();
                                                    if (s23 != -1) {
                                                        if (s23 != 32) {
                                                            A03(byteBuffer);
                                                        } else {
                                                            hCaA00.A09 = A02(byteBuffer, charsetForName);
                                                        }
                                                    }
                                                }
                                            } else if (j3 == -4350879106606340548L) {
                                                while (true) {
                                                    short s24 = byteBuffer.getShort();
                                                    if (s24 != -1) {
                                                        if (s24 == 60) {
                                                            hCaA00.A0E = A02(byteBuffer, charsetForName);
                                                        } else if (s24 != 63) {
                                                            A03(byteBuffer);
                                                        } else {
                                                            hCaA00.A0A = A02(byteBuffer, charsetForName);
                                                        }
                                                    }
                                                }
                                            } else if (j3 == 3466665905104686251L) {
                                                while (true) {
                                                    short s25 = byteBuffer.getShort();
                                                    if (s25 != -1) {
                                                        if (s25 != 20) {
                                                            A03(byteBuffer);
                                                        } else {
                                                            hCaA00.A0B = A02(byteBuffer, charsetForName);
                                                        }
                                                    }
                                                }
                                            } else {
                                                while (byteBuffer.getShort() != -1) {
                                                    A03(byteBuffer);
                                                }
                                            }
                                        }
                                    }
                                }
                                return hCaA00;
                            }
                            if (jArr[s19] == -210475169871049954L) {
                                while (true) {
                                    short s26 = byteBuffer.getShort();
                                    if (s26 != -1) {
                                        if (s26 != 7) {
                                            byteBuffer.getLong();
                                        } else {
                                            hCaA00.A08 = byteBuffer.getLong();
                                        }
                                    }
                                }
                            } else {
                                while (byteBuffer.getShort() != -1) {
                                    byteBuffer.getLong();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final DSa getMobileConfig() {
        return (DSa) this.mobileConfig$delegate.AMN();
    }

    private final void start() {
        if (isLibraryLoaded) {
            this.mHybridData = initHybrid(getMobileConfig().getBooleanWithOptions(AbstractC10361HCb.A00, C4992DKo.A03), this.provider);
        } else {
            this.disabled = true;
        }
    }

    public DeviceIdentifiersInterceptor() {
        start();
    }

    public static String A02(ByteBuffer byteBuffer, Charset charset) {
        int i = byteBuffer.getInt();
        if (byteBuffer.hasArray()) {
            String strA0n = BV4.A0n(charset, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i);
            byteBuffer.position(byteBuffer.position() + i);
            return strA0n;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new String(bArr, charset);
    }

    public static void A03(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.getInt());
    }
}
