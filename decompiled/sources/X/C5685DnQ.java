package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.exoplayer.formatevaluator.configuration.AbrStallRiskConfig;
import com.facebook.video.heroplayer.common.MosScoreCalculation;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: X.DnQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5685DnQ implements Do0 {
    public final InterfaceC4913DEg A00;
    public final AbrContextAwareConfiguration A01;
    public final C3003Brl A02;
    public final C3003Brl A03;
    public final C3003Brl A04;
    public final C3003Brl A05;
    public final C3003Brl A06;
    public final C3003Brl A07;
    public final C3003Brl A08;
    public final C3003Brl A09;
    public final InterfaceC5683DnM A0A;
    public final C6127DwT A0B;

    public static double A00(long j, double d) {
        return (BV6.A0G(d, r4) * 1.0d) / ((int) Math.pow(10.0d, j));
    }

    public static NumberFormat A01(NumberFormat numberFormat, Locale locale) {
        numberFormat.setMaximumFractionDigits((int) Math.max(Math.max(4L, 4L), 4L));
        NumberFormat numberFormat2 = NumberFormat.getInstance(locale);
        numberFormat2.setMaximumFractionDigits((int) Math.max(Math.max(2L, 2L), 2L));
        return numberFormat2;
    }

    private void A02() {
        InterfaceC5683DnM interfaceC5683DnM = this.A0A;
        DnW dnW = DnW.A0R;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(4L);
        BV7.A1H(",", sbA0w, 4L);
        sbA0w.append(2L);
        BV7.A1H(",", sbA0w, 2L);
        interfaceC5683DnM.A3K(dnW, BV4.A0m(sbA0w, 2L));
    }

    private void A03(C6154Dwx c6154Dwx, C5730DoP c5730DoP, C5691DnY c5691DnY, int i, int i2) {
        InterfaceC5683DnM interfaceC5683DnM = this.A0A;
        interfaceC5683DnM.A3K(DnW.A0W, String.valueOf(i));
        interfaceC5683DnM.A3K(DnW.A0V, String.valueOf(c5730DoP.A03));
        if (c6154Dwx != null) {
            interfaceC5683DnM.A3K(DnW.A06, String.valueOf(c6154Dwx.A05));
        }
        DnW dnW = DnW.A0U;
        AbrContextAwareConfiguration abrContextAwareConfiguration = this.A01;
        interfaceC5683DnM.A3K(dnW, abrContextAwareConfiguration.abrSetting.usePlaybackCsvqm ? "1" : HatchPriceImpressionEventDataKt.NO_DISCOUNT);
        interfaceC5683DnM.A3K(DnW.A09, abrContextAwareConfiguration.getAbrStallRiskConfig(false, c5691DnY, c5730DoP.A04).isNetworkCongested ? "1" : HatchPriceImpressionEventDataKt.NO_DISCOUNT);
        interfaceC5683DnM.A3K(DnW.A05, String.valueOf(i2));
    }

    public static void A04(C5731DoQ c5731DoQ, C5685DnQ c5685DnQ, InterfaceC5683DnM interfaceC5683DnM) {
        interfaceC5683DnM.A3K(DnW.A0O, c5731DoQ.A04.replace(';', '|').replace(InviteCodeScratcherKt.CODE_SEPARATOR, ""));
        c5685DnQ.A02();
        interfaceC5683DnM.A3K(DnW.A0P, String.valueOf(0L));
    }

    private void A05(C5730DoP c5730DoP) {
        InterfaceC5683DnM interfaceC5683DnM = this.A0A;
        interfaceC5683DnM.A3K(DnW.A0A, this.A01.isOnWifi() ? "1" : HatchPriceImpressionEventDataKt.NO_DISCOUNT);
        interfaceC5683DnM.A3K(DnW.A0G, String.valueOf(c5730DoP.A00));
    }

    @Override // X.Do0
    public final boolean AOT() {
        return false;
    }

    @Override // X.Do0
    public final boolean Afa() {
        return false;
    }

    public C5685DnQ(InterfaceC4913DEg interfaceC4913DEg, AbrContextAwareConfiguration abrContextAwareConfiguration, InterfaceC5683DnM interfaceC5683DnM) {
        this.A0A = interfaceC5683DnM;
        this.A01 = abrContextAwareConfiguration;
        this.A00 = interfaceC4913DEg;
        C6127DwT rationalGamblerConfig = abrContextAwareConfiguration.getRationalGamblerConfig();
        this.A0B = rationalGamblerConfig == null ? new C6127DwT() : rationalGamblerConfig;
        this.A08 = C3003Brl.A00("-1,2,1; 0,1.7,2; 1,1");
        this.A03 = C3003Brl.A00("0,1,1; 80,1.5,1.3; 97,2.0,1");
        this.A04 = C3003Brl.A00("0,1,1; 80,1.5,1.3; 98,2,1");
        this.A05 = C3003Brl.A00("0,1,1; 80,1.5,1.2; 100,2,1");
        this.A02 = C3003Brl.A00("0,1,1.3; 100,2,1");
        this.A07 = C3003Brl.A00("0,1,1.3; 100,2,1");
        this.A06 = C3003Brl.A00("0,1,1.3; 100,2,1");
        this.A09 = C3003Brl.A00("0,1,1.3; 100,2,1");
    }

    public static void A06(InterfaceC5683DnM interfaceC5683DnM, DnW dnW, NumberFormat numberFormat, double d) {
        interfaceC5683DnM.A3K(dnW, numberFormat.format(d));
    }

    @Override // X.Do0
    public final void A6b(C6154Dwx c6154Dwx) {
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DoP;[LX/Dwx;Ljava/util/Map<Ljava/lang/String;LX/Dil;>;LX/Dwx;IILX/DnY;)LX/Drg; */
    @Override // X.Do0
    public final C5899Drg AAt(C6154Dwx c6154Dwx, C5730DoP c5730DoP, C5691DnY c5691DnY, Map map, C6154Dwx[] c6154DwxArr, int i, int i2) throws NumberFormatException {
        C5480DjH c5480DjH;
        C5899Drg c5899DrgA00;
        float f;
        float f2;
        String strA00;
        double d;
        double dMax;
        double d2;
        C5900Drh c5900DrhA01;
        double d3;
        double dA02;
        C5713Dnw c5713Dnw;
        String str;
        C3003Brl c3003BrlA00;
        C5731DoQ c5731DoQ;
        String str2;
        long jLongValue;
        double d4;
        int systemicRiskOtherBitrate;
        C5480DjH c5480DjH2 = null;
        InterfaceC5683DnM interfaceC5683DnM = this.A0A;
        interfaceC5683DnM.A3I(EnumC5684DnO.A0G);
        AbrContextAwareConfiguration abrContextAwareConfiguration = this.A01;
        long j = c5730DoP.A03 - (c5730DoP.A02 / 1000);
        if (j <= 0) {
            j = 30000;
        }
        long j2 = c5730DoP.A01 / 1000;
        if (j2 < 0) {
            j2 = 0;
        } else if (j2 > j) {
            j2 = j;
        }
        long jMin = Math.min(j, 30000 + j2);
        long jMax = Math.max(jMin - j2, 0L);
        double dA00 = A00(3L, jMin / 1000.0d);
        double dA002 = A00(3L, jMax / 1000.0d);
        StringBuilder sbA0w = C60O.A0w();
        StringBuilder sbA0w2 = C60O.A0w();
        StringBuilder sbA0w3 = C60O.A0w();
        PriorityQueue priorityQueue = new PriorityQueue(c6154DwxArr.length, C5709Dnr.A00);
        C5690DnX c5690DnX = null;
        for (C6154Dwx c6154Dwx2 : c6154DwxArr) {
            if (c6154Dwx2.A05 <= i || i <= 0) {
                if (map != null) {
                    map.get(c6154Dwx2.A0Y);
                }
                boolean zA02 = AbstractC5655Dmj.A02(c6154Dwx2);
                AbrStallRiskConfig abrStallRiskConfig = abrContextAwareConfiguration.getAbrStallRiskConfig(zA02, c5691DnY, c5730DoP.A04);
                double d5 = abrStallRiskConfig.riskFactor;
                interfaceC5683DnM.Ahv(abrStallRiskConfig.isNetworkCongested);
                interfaceC5683DnM.Ahu(abrStallRiskConfig.isFwaOrTetheredConnection);
                if (zA02) {
                    dMax = abrContextAwareConfiguration.getSystemicRiskBitrateBoostFactor(true);
                    if (!abrContextAwareConfiguration.getSystemicRiskEnableDynamicOtherBitrate(true) || (systemicRiskOtherBitrate = c5730DoP.A00) <= 0) {
                        systemicRiskOtherBitrate = abrContextAwareConfiguration.getSystemicRiskOtherBitrate(true);
                    }
                    d2 = systemicRiskOtherBitrate;
                } else {
                    double dMin = Math.min(dA00, dA002 + (5000.0d / 1000.0d));
                    if (dA00 > 0.0d) {
                        d = dMin / dA00;
                    } else {
                        d = 1.0d;
                    }
                    dMax = Math.max(d, 0.5d);
                    d2 = 0.0d;
                }
                int i3 = c6154Dwx2.A05;
                C5838DqU c5838DqU = new C5838DqU(i3, Math.round((r5 * d5 * dMax) + d2), d5);
                double d6 = c5838DqU.A00;
                long jA0G = BV6.A0G(d6, 5000.0d);
                if (d6 <= 0.0d) {
                    c5713Dnw = new C5713Dnw(null, c5838DqU, this.A08.A01(), -1, -1L);
                } else {
                    long j3 = 80;
                    do {
                        c5900DrhA01 = AbstractC5655Dmj.A01(this.A00, abrContextAwareConfiguration, abrContextAwareConfiguration.playbackPreferences.A02, (int) j3, jA0G);
                        long j4 = c5900DrhA01.A01;
                        if (j4 > 0 && j4 >= d6) {
                            break;
                        }
                        j3--;
                    } while (j3 >= 50);
                    C5686DnS c5686DnS = abrContextAwareConfiguration.abrSetting;
                    if (c5686DnS.honorDefaultBandwidthWhenNoEstimate && c5900DrhA01.A02 == -1) {
                        long j5 = c5686DnS.defaultInitialBitrateWhenNoEstimate;
                        c5900DrhA01 = new C5900Drh();
                        c5900DrhA01.A02 = j5;
                        c5900DrhA01.A01 = j5;
                        c5900DrhA01.A00 = 80;
                        c5900DrhA01.A03 = null;
                    }
                    long j6 = c5900DrhA01.A02;
                    long j7 = c5900DrhA01.A01;
                    int i4 = c5900DrhA01.A00;
                    String strA0o = BV6.A0o(c6154Dwx2);
                    long j8 = (long) d6;
                    long j9 = i3;
                    if (strA0o == null) {
                        strA0o = "";
                    }
                    interfaceC5683DnM.A3Z(strA0o, i4, j6, j7, j8, j9);
                    if (j7 < 0) {
                        dA02 = this.A08.A01();
                    } else {
                        double d7 = j7;
                        if (d7 < d6) {
                            d3 = (-(d6 - d7)) / d6;
                        } else {
                            d3 = ((i4 - 50) * 1.0d) / 30.0d;
                        }
                        dA02 = this.A08.A02(d3);
                    }
                    c5713Dnw = new C5713Dnw(c5900DrhA01.A03, c5838DqU, A00(4L, dA02), i4, j7);
                }
                if (zA02) {
                    Object obj = c6154Dwx2.A0V;
                    double d8 = 0.0d;
                    if (obj instanceof Dl5) {
                        String str3 = ((Dl5) obj).A06;
                        if (str3 != null) {
                            try {
                                d8 = Double.parseDouble(str3);
                            } catch (NumberFormatException unused) {
                            }
                        } else {
                            d8 = 0.0d;
                        }
                    }
                    double d9 = 0.0d;
                    if (c5691DnY != null) {
                        double d10 = c5691DnY.A00;
                        if (d10 > 0.0d) {
                            d9 = d10;
                        }
                    }
                    if (d8 > 0.0d && d9 > 0.0d && abrContextAwareConfiguration.abrSetting.enableOverallAudioMOSBasedRewardSidnee) {
                        c5731DoQ = new C5731DoQ("", "0,1,1.3; 100,2,1", A00(4L, this.A06.A02((d9 * 0.82d) + (d8 * 0.079d))), -1.0d, d8, d9);
                    } else {
                        c5731DoQ = new C5731DoQ("", "0,1,1.3; 100,2,1", A00(4L, this.A02.A02(d8)), -1.0d, d8, d9);
                    }
                } else {
                    double dA003 = MosScoreCalculation.A00(c6154Dwx2, i2, abrContextAwareConfiguration.abrSetting.usePlaybackCsvqm);
                    String str4 = Dl5.A00(c6154Dwx2).A0B;
                    float fA01 = -1.0f;
                    if (str4 != null) {
                        fA01 = MosScoreCalculation.A01(MosScoreCalculation.A02(str4), i2);
                    }
                    double d11 = fA01;
                    if (d11 > 0.0d && dA003 > 0.0d && abrContextAwareConfiguration.abrSetting.enableOverallMOSBasedRewardSidnee) {
                        double dA004 = A00(4L, this.A07.A02((0.54d * d11) + (0.0046d * d11 * dA003)));
                        if (d11 <= 65.0d) {
                            str2 = "bad";
                        } else {
                            str2 = "good";
                        }
                        c5731DoQ = new C5731DoQ(str2, "0,1,1.3; 100,2,1", dA004, dA003, -1.0d, d11);
                    } else {
                        if (d11 <= 65.0d && d11 > 0.0d) {
                            str = "bad";
                        } else if (!abrContextAwareConfiguration.enableWifiBasedRewardSidnee() && d11 > 75.0d) {
                            str = "great";
                        } else {
                            str = "good";
                        }
                        String strTryToGetRewardCurveFromManifest = abrContextAwareConfiguration.tryToGetRewardCurveFromManifest(c5691DnY);
                        if (strTryToGetRewardCurveFromManifest != null) {
                            c3003BrlA00 = C3003Brl.A00(strTryToGetRewardCurveFromManifest);
                        } else if (d11 <= 65.0d && d11 > 0.0d) {
                            c3003BrlA00 = this.A03;
                            strTryToGetRewardCurveFromManifest = "0,1,1; 80,1.5,1.3; 97,2.0,1";
                        } else if (abrContextAwareConfiguration.enableWifiBasedRewardSidnee()) {
                            c3003BrlA00 = this.A09;
                            strTryToGetRewardCurveFromManifest = "0,1,1.3; 100,2,1";
                        } else if (d11 <= 75.0d) {
                            c3003BrlA00 = this.A04;
                            strTryToGetRewardCurveFromManifest = "0,1,1; 80,1.5,1.3; 98,2,1";
                        } else {
                            c3003BrlA00 = this.A05;
                            strTryToGetRewardCurveFromManifest = "0,1,1; 80,1.5,1.2; 100,2,1";
                        }
                        c5731DoQ = new C5731DoQ(str, strTryToGetRewardCurveFromManifest, A00(4L, c3003BrlA00.A02(dA003)), dA003, -1.0d, d11);
                    }
                }
                Long riskRewardRatioPrecisionDigits = abrContextAwareConfiguration.getRiskRewardRatioPrecisionDigits(zA02, c5691DnY);
                if (riskRewardRatioPrecisionDigits == null) {
                    jLongValue = 2;
                } else {
                    jLongValue = riskRewardRatioPrecisionDigits.longValue();
                }
                abrContextAwareConfiguration.isOnWifi();
                double d12 = c5731DoQ.A02 * 1.0d;
                interfaceC5683DnM.Ai2(jLongValue);
                double d13 = c5713Dnw.A00;
                double dA005 = A00(jLongValue, d13 / d12);
                Integer numA00 = C5701Dni.A00(abrContextAwareConfiguration);
                if (numA00 != C79.A01 && numA00 != C79.A00) {
                    if (numA00 == C79.A0C) {
                        d4 = 1.5d;
                    } else if (numA00 == C79.A0K) {
                        d4 = 1.7d;
                    } else {
                        d4 = 1.85d;
                    }
                } else {
                    d4 = 1.3d;
                }
                C5690DnX c5690DnX2 = new C5690DnX(c6154Dwx2, c5731DoQ, c5713Dnw, numA00, dA005, d4, d13 > d4);
                if (c5690DnX == null || c5690DnX2.A02.A05 < c5690DnX.A02.A05) {
                    c5690DnX = c5690DnX2;
                }
                double d14 = c5690DnX2.A03.A03;
                if (abrContextAwareConfiguration.abrSetting.enableCdnDebugHeadersExtended && !zA02) {
                    if (sbA0w.length() > 0) {
                        sbA0w.append(",");
                    }
                    if (sbA0w2.length() > 0) {
                        sbA0w2.append(",");
                    }
                    if (sbA0w3.length() > 0) {
                        sbA0w3.append(",");
                    }
                    sbA0w.append(A00(2L, MosScoreCalculation.A00(c6154Dwx2, i2, true)));
                    sbA0w2.append(A00(2L, MosScoreCalculation.A00(c6154Dwx2, i2, false)));
                    sbA0w3.append(A00(2L, d14));
                }
                if (!c5690DnX2.A06) {
                    priorityQueue.add(c5690DnX2);
                }
            }
        }
        if (abrContextAwareConfiguration.abrSetting.enableCdnDebugHeadersExtended) {
            if (sbA0w.length() > 0) {
                interfaceC5683DnM.A3m(sbA0w.toString());
            }
            if (sbA0w2.length() > 0) {
                interfaceC5683DnM.A3n(sbA0w2.toString());
            }
            if (abrContextAwareConfiguration.abrSetting.enableCdnDebugHeadersAudioMos && (strA00 = DnN.A00(c5691DnY, c6154DwxArr)) != null) {
                interfaceC5683DnM.A3O(strA00);
            }
        }
        if (abrContextAwareConfiguration.abrSetting.enableCdnDebugHeadersDecisionDetails && sbA0w3.length() > 0) {
            interfaceC5683DnM.A3K(DnW.A0S, sbA0w3.toString());
        }
        C5690DnX c5690DnX3 = (C5690DnX) priorityQueue.poll();
        if (c5690DnX3 == null) {
            interfaceC5683DnM.A3I(EnumC5684DnO.A0E);
            C6154Dwx c6154Dwx3 = null;
            for (C6154Dwx c6154Dwx4 : c6154DwxArr) {
                if (c6154Dwx3 == null || c6154Dwx4.A05 < c6154Dwx3.A05) {
                    c6154Dwx3 = c6154Dwx4;
                }
            }
            if (c6154Dwx3 != null) {
                if (c5690DnX != null && c5690DnX.A02 == c6154Dwx3) {
                    Locale locale = Locale.ENGLISH;
                    NumberFormat numberFormat = NumberFormat.getInstance(locale);
                    numberFormat.setMaximumFractionDigits(2);
                    NumberFormat numberFormat2 = NumberFormat.getInstance(locale);
                    NumberFormat numberFormatA01 = A01(numberFormat2, locale);
                    NumberFormat numberFormat3 = NumberFormat.getInstance(locale);
                    numberFormat3.setMaximumFractionDigits(4);
                    DnW dnW = DnW.A07;
                    C5713Dnw c5713Dnw2 = c5690DnX.A04;
                    C5838DqU c5838DqU2 = c5713Dnw2.A04;
                    double d15 = c5838DqU2.A01;
                    InterfaceC5683DnM.A00(interfaceC5683DnM, dnW, numberFormat, d15);
                    DnW dnW2 = DnW.A0K;
                    double d16 = c5690DnX.A01;
                    InterfaceC5683DnM.A00(interfaceC5683DnM, dnW2, numberFormat, d16);
                    DnW dnW3 = DnW.A0Q;
                    double d17 = c5690DnX.A00;
                    InterfaceC5683DnM.A00(interfaceC5683DnM, dnW3, numberFormat, d17);
                    DnW dnW4 = DnW.A0C;
                    double d18 = c5838DqU2.A02;
                    InterfaceC5683DnM.A00(interfaceC5683DnM, dnW4, numberFormat, d18);
                    DnW dnW5 = DnW.A0X;
                    double d19 = c5838DqU2.A00;
                    InterfaceC5683DnM.A00(interfaceC5683DnM, dnW5, numberFormat, d19);
                    DnW dnW6 = DnW.A0M;
                    double d20 = c5713Dnw2.A00;
                    InterfaceC5683DnM.A00(interfaceC5683DnM, dnW6, numberFormat, d20);
                    DnW dnW7 = DnW.A0L;
                    C5731DoQ c5731DoQ2 = c5690DnX.A03;
                    double d21 = c5731DoQ2.A02;
                    InterfaceC5683DnM.A00(interfaceC5683DnM, dnW7, numberFormat, d21);
                    DnW dnW8 = DnW.A0T;
                    String str5 = c5731DoQ2.A05;
                    interfaceC5683DnM.A3J(dnW8, str5);
                    DnW dnW9 = DnW.A0I;
                    String strA002 = AbstractC5878DrE.A00(c5690DnX.A05);
                    interfaceC5683DnM.A3J(dnW9, strA002);
                    if (abrContextAwareConfiguration.abrSetting.enableCdnDebugHeadersDecisionDetails) {
                        A06(interfaceC5683DnM, dnW, numberFormat3, d15);
                        A06(interfaceC5683DnM, dnW2, numberFormat2, d16);
                        A06(interfaceC5683DnM, dnW3, numberFormatA01, d17);
                        A06(interfaceC5683DnM, dnW4, numberFormat3, d18);
                        A06(interfaceC5683DnM, dnW5, numberFormat3, d19);
                        A06(interfaceC5683DnM, dnW6, numberFormat2, d20);
                        A06(interfaceC5683DnM, dnW7, numberFormat2, d21);
                        interfaceC5683DnM.A3K(dnW8, str5);
                        interfaceC5683DnM.A3K(dnW9, strA002);
                        A05(c5730DoP);
                        if (c5691DnY != null) {
                            if (abrContextAwareConfiguration.isOnWifi()) {
                                f2 = c5691DnY.A04;
                            } else {
                                f2 = c5691DnY.A03;
                            }
                            A06(interfaceC5683DnM, DnW.A0N, numberFormat3, f2);
                        }
                        A03(c6154Dwx, c5730DoP, c5691DnY, i2, c5713Dnw2.A01);
                        A04(c5731DoQ2, this, interfaceC5683DnM);
                    }
                    c5480DjH2 = c5713Dnw2.A03;
                }
                c5899DrgA00 = C5899Drg.A00(c6154Dwx3);
                c5480DjH = c5480DjH2;
            } else {
                throw C60O.A0i("No formats provided");
            }
        } else {
            Locale locale2 = Locale.ENGLISH;
            NumberFormat numberFormat4 = NumberFormat.getInstance(locale2);
            numberFormat4.setMaximumFractionDigits(2);
            NumberFormat numberFormat5 = NumberFormat.getInstance(locale2);
            NumberFormat numberFormatA012 = A01(numberFormat5, locale2);
            NumberFormat numberFormat6 = NumberFormat.getInstance(locale2);
            numberFormat6.setMaximumFractionDigits(4);
            DnW dnW10 = DnW.A07;
            C5713Dnw c5713Dnw3 = c5690DnX3.A04;
            C5838DqU c5838DqU3 = c5713Dnw3.A04;
            double d22 = c5838DqU3.A01;
            InterfaceC5683DnM.A00(interfaceC5683DnM, dnW10, numberFormat4, d22);
            DnW dnW11 = DnW.A0K;
            double d23 = c5690DnX3.A01;
            InterfaceC5683DnM.A00(interfaceC5683DnM, dnW11, numberFormat4, d23);
            DnW dnW12 = DnW.A0Q;
            double d24 = c5690DnX3.A00;
            InterfaceC5683DnM.A00(interfaceC5683DnM, dnW12, numberFormat4, d24);
            DnW dnW13 = DnW.A0C;
            double d25 = c5838DqU3.A02;
            InterfaceC5683DnM.A00(interfaceC5683DnM, dnW13, numberFormat4, d25);
            DnW dnW14 = DnW.A0X;
            double d26 = c5838DqU3.A00;
            InterfaceC5683DnM.A00(interfaceC5683DnM, dnW14, numberFormat4, d26);
            DnW dnW15 = DnW.A0M;
            double d27 = c5713Dnw3.A00;
            InterfaceC5683DnM.A00(interfaceC5683DnM, dnW15, numberFormat4, d27);
            DnW dnW16 = DnW.A0L;
            C5731DoQ c5731DoQ3 = c5690DnX3.A03;
            double d28 = c5731DoQ3.A02;
            InterfaceC5683DnM.A00(interfaceC5683DnM, dnW16, numberFormat4, d28);
            DnW dnW17 = DnW.A0T;
            String str6 = c5731DoQ3.A05;
            interfaceC5683DnM.A3J(dnW17, str6);
            DnW dnW18 = DnW.A0I;
            String strA003 = AbstractC5878DrE.A00(c5690DnX3.A05);
            interfaceC5683DnM.A3J(dnW18, strA003);
            if (abrContextAwareConfiguration.abrSetting.enableCdnDebugHeadersDecisionDetails) {
                A06(interfaceC5683DnM, dnW10, numberFormat6, d22);
                A06(interfaceC5683DnM, dnW11, numberFormat5, d23);
                A06(interfaceC5683DnM, dnW12, numberFormatA012, d24);
                A06(interfaceC5683DnM, dnW13, numberFormat6, d25);
                A06(interfaceC5683DnM, dnW14, numberFormat6, d26);
                A06(interfaceC5683DnM, dnW15, numberFormat5, d27);
                A06(interfaceC5683DnM, dnW16, numberFormat5, d28);
                interfaceC5683DnM.A3K(dnW17, str6);
                interfaceC5683DnM.A3K(dnW18, strA003);
                A05(c5730DoP);
                if (c5691DnY != null) {
                    if (abrContextAwareConfiguration.isOnWifi()) {
                        f = c5691DnY.A04;
                    } else {
                        f = c5691DnY.A03;
                    }
                    A06(interfaceC5683DnM, DnW.A0N, numberFormat6, f);
                }
                A03(c6154Dwx, c5730DoP, c5691DnY, i2, c5713Dnw3.A01);
                A04(c5731DoQ3, this, interfaceC5683DnM);
            }
            C6154Dwx c6154Dwx5 = c5690DnX3.A02;
            long j10 = c5713Dnw3.A02;
            c5480DjH = c5713Dnw3.A03;
            c5899DrgA00 = C5899Drg.A00(c6154Dwx5);
            c5899DrgA00.A00 = j10;
        }
        c5899DrgA00.A03 = c5480DjH;
        return c5899DrgA00;
    }
}
