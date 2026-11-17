package X;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dlb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5596Dlb {
    public static final int[] A0E = {8000, 0, 500, 2000, 500, 2000, 500, 2000, 8000, 500, 30000, 30000, 1, 1, 0, 0, 500, 2000, 0, 0, 0, -1};
    public long A00;
    public EnumC5706Dno A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final long A05;
    public final InterfaceC6113Dvs A06;
    public final List<Pair<EnumC5706Dno, Integer>> A07;
    public final boolean A08;
    public final boolean A09;
    public final int[] A0A;
    public final int[] A0B;
    public final C5796Dpg[] A0C;
    public final List<Pair<EnumC5706Dno, Integer>> A0D;

    public C5596Dlb() {
        this(HeroPlayerSetting.A01, null);
    }

    public static int A00(C5596Dlb c5596Dlb, int i) {
        C5796Dpg c5796Dpg;
        int i2;
        C5796Dpg[] c5796DpgArr = c5596Dlb.A0C;
        if (c5796DpgArr[i] == null) {
            return A0E[i];
        }
        if (c5596Dlb.A02 && c5596Dlb.A06 != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - c5596Dlb.A00 > c5596Dlb.A05) {
                EnumC5706Dno enumC5706DnoA03 = c5596Dlb.A03();
                int i3 = 0;
                c5596Dlb.A03 = AnonymousClass002.A1Z(enumC5706DnoA03, EnumC5706Dno.EXCELLENT);
                loop0: while (true) {
                    C5796Dpg c5796Dpg2 = c5796DpgArr[i3];
                    if (c5796Dpg2 != null) {
                        C5817Dq1 c5817Dq1 = c5796Dpg2.A01;
                        if (!c5817Dq1.useNetworkQuality || !c5817Dq1.useNetworkType) {
                            c5796Dpg2.A00(enumC5706DnoA03);
                        } else if (!c5817Dq1.useNetworkQualityWifiOnly && enumC5706DnoA03 != EnumC5706Dno.UNKNOWN) {
                            c5796Dpg2.A00(enumC5706DnoA03);
                        }
                        if (c5817Dq1.useNetworkType) {
                            c5796Dpg2.A00 = c5817Dq1.defaultValue;
                        }
                    }
                    do {
                        i3++;
                        if (i3 >= 22) {
                            break loop0;
                        }
                    } while (i3 == 1);
                }
                c5596Dlb.A00 = jElapsedRealtime;
            }
        }
        if ((i == 4 || i == 5 || i == 2 || i == 3) && c5796DpgArr[i].A01.useMLPrediction) {
            synchronized (BYi.class) {
                synchronized (BYi.A00) {
                }
            }
            if (BYi.A01.get() != null) {
                if (i == 2 || (i != 3 && i == 4)) {
                    c5796Dpg = c5796DpgArr[i];
                    i2 = 500;
                } else {
                    c5796Dpg = c5796DpgArr[i];
                    i2 = 2000;
                }
                if (c5796Dpg.A01.useMLPrediction) {
                    c5796Dpg.A00 = i2;
                }
            }
        }
        if (c5796DpgArr[i].A01.useSmartPlayerDecision && (i == 11 || i == 10)) {
            int iA00 = BYg.A00(BY0.A02, BYg.A07, true);
            if (iA00 > 0) {
                C5796Dpg c5796Dpg3 = c5796DpgArr[i];
                if (c5796Dpg3.A01.useSmartPlayerDecision) {
                    c5796Dpg3.A00 = iA00;
                }
            }
        }
        return c5796DpgArr[i].A00;
    }

    public static C5796Dpg A01(C5817Dq1 c5817Dq1) {
        if (c5817Dq1 != null) {
            return new C5796Dpg(c5817Dq1);
        }
        return null;
    }

    public final int A02() {
        EnumC5706Dno enumC5706Dno;
        VideoBandwidthEstimate videoBandwidthEstimateA01;
        if (this.A06 != null) {
            C5796Dpg[] c5796DpgArr = this.A0C;
            if (c5796DpgArr[1] != null) {
                long j = -1;
                if (this.A09) {
                    DXG dxgA00 = DXG.A00();
                    synchronized (dxgA00) {
                        videoBandwidthEstimateA01 = dxgA00.A05.A01(null);
                    }
                    long j2 = videoBandwidthEstimateA01.A06;
                    if (j2 >= 0) {
                        j = j2;
                    }
                }
                List<Pair<EnumC5706Dno, Integer>> list = this.A07;
                if (j >= 0) {
                    Iterator<Pair<EnumC5706Dno, Integer>> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            enumC5706Dno = EnumC5706Dno.EXCELLENT;
                            break;
                        }
                        Pair pairA0O = BV6.A0O(it);
                        if (j > BV7.A07(pairA0O)) {
                            enumC5706Dno = (EnumC5706Dno) pairA0O.first;
                            break;
                        }
                    }
                } else {
                    enumC5706Dno = EnumC5706Dno.UNKNOWN;
                }
                if (enumC5706Dno != this.A01) {
                    this.A01 = enumC5706Dno;
                    C5796Dpg c5796Dpg = c5796DpgArr[1];
                    C5817Dq1 c5817Dq1 = c5796Dpg.A01;
                    if (!c5817Dq1.useNetworkQuality || !c5817Dq1.useNetworkType) {
                        c5796Dpg.A00(enumC5706Dno);
                    } else if (!c5817Dq1.useNetworkQualityWifiOnly && enumC5706Dno != EnumC5706Dno.UNKNOWN) {
                        c5796Dpg.A00(enumC5706Dno);
                    }
                    if (c5817Dq1.useNetworkType) {
                        c5796Dpg.A00 = c5817Dq1.defaultValue;
                    }
                }
            }
        }
        return this.A0C[1].A00;
    }

    public final EnumC5706Dno A03() {
        long j;
        long j2 = -1;
        if (this.A09) {
            DXG dxgA00 = DXG.A00();
            synchronized (dxgA00) {
                j = ((DXL) dxgA00).A02;
            }
            if (j >= 0) {
                j2 = j;
            }
        }
        List<Pair<EnumC5706Dno, Integer>> list = this.A0D;
        if (j2 < 0) {
            return EnumC5706Dno.UNKNOWN;
        }
        Iterator<Pair<EnumC5706Dno, Integer>> it = list.iterator();
        while (it.hasNext()) {
            Pair pairA0O = BV6.A0O(it);
            if (j2 < BV7.A07(pairA0O)) {
                return (EnumC5706Dno) pairA0O.first;
            }
        }
        return EnumC5706Dno.EXCELLENT;
    }

    public C5596Dlb(HeroPlayerSetting heroPlayerSetting, InterfaceC6113Dvs interfaceC6113Dvs) {
        this.A0C = new C5796Dpg[]{A01(heroPlayerSetting.fetchHttpReadTimeoutMsConfig), A01(heroPlayerSetting.concatenatedMsPerLoadConfig), A01(heroPlayerSetting.minBufferMsConfig), A01(heroPlayerSetting.minRebufferMsConfig), A01(heroPlayerSetting.liveMinBufferMsConfig), A01(heroPlayerSetting.liveMinRebufferMsConfig), A01(heroPlayerSetting.fbstoriesMinBufferMsConfig), A01(heroPlayerSetting.fbstoriesMinRebufferMsConfig), A01(heroPlayerSetting.fetchCacheSourceHttpConnectTimeoutMsConfig), A01(heroPlayerSetting.minMicroRebufferMsConfig), A01(heroPlayerSetting.wifiMaxWatermarkMsConfig), A01(heroPlayerSetting.cellMaxWatermarkMsConfig), A01(heroPlayerSetting.networkAwareDisableSecondPhasePrefetch), A01(heroPlayerSetting.networkAwareHttpPriorityIncrementalForStreaming), A01(heroPlayerSetting.networkAwareEnablePrefetchTagBlocklist), A01(heroPlayerSetting.networkAwareEnablePartialSegmentPrefetch), A01(heroPlayerSetting.productOverrideMinBufferMs), A01(heroPlayerSetting.productOverrideMinRebufferMs), A01(heroPlayerSetting.networkAwareEnablePartialSegmentPrefetchForFollowupPrefetch), A01(heroPlayerSetting.networkAwareUseWatchProbabilityForPrefetch), A01(heroPlayerSetting.networkAwareFetchPrefetchableInGraphQLQuery), A01(heroPlayerSetting.livePausedWatermarkMsConfig)};
        int i = 0;
        this.A02 = false;
        this.A03 = false;
        this.A01 = EnumC5706Dno.UNKNOWN;
        this.A09 = heroPlayerSetting.useAccumulatorForBw;
        Dlv dlv = heroPlayerSetting.gen;
        this.A08 = dlv.respect_codec_type_for_watermark;
        this.A04 = (int) dlv.codec_watermark_cap_ms;
        long j = dlv.codec_watermark_wifi_av1_pct;
        long j2 = dlv.codec_watermark_wifi_vp9_pct;
        long j3 = dlv.codec_watermark_wifi_hevc_pct;
        long j4 = dlv.codec_watermark_wifi_avc_pct;
        int[] iArr = new int[C79.A00(5).length];
        Arrays.fill(iArr, 100);
        iArr[0] = (int) j;
        iArr[1] = (int) j2;
        iArr[2] = (int) j3;
        iArr[3] = (int) j4;
        this.A0B = iArr;
        Dlv dlv2 = heroPlayerSetting.gen;
        long j5 = dlv2.codec_watermark_cell_av1_pct;
        long j6 = dlv2.codec_watermark_cell_vp9_pct;
        long j7 = dlv2.codec_watermark_cell_hevc_pct;
        long j8 = dlv2.codec_watermark_cell_avc_pct;
        int[] iArr2 = new int[C79.A00(5).length];
        Arrays.fill(iArr2, 100);
        iArr2[0] = (int) j5;
        iArr2[1] = (int) j6;
        iArr2[2] = (int) j7;
        iArr2[3] = (int) j8;
        this.A0A = iArr2;
        EnumC5706Dno enumC5706Dno = EnumC5706Dno.DEGRADED;
        C5817Dq1 c5817Dq1 = heroPlayerSetting.latencyBoundMsConfig;
        Pair pairA0E = BV5.A0E(enumC5706Dno, c5817Dq1.degradedValue);
        EnumC5706Dno enumC5706Dno2 = EnumC5706Dno.POOR;
        Pair pairA0E2 = BV5.A0E(enumC5706Dno2, c5817Dq1.poorValue);
        EnumC5706Dno enumC5706Dno3 = EnumC5706Dno.MODERATE;
        Pair pairA0E3 = BV5.A0E(enumC5706Dno3, c5817Dq1.moderateValue);
        EnumC5706Dno enumC5706Dno4 = EnumC5706Dno.GOOD;
        this.A07 = Collections.unmodifiableList(Arrays.asList(pairA0E, pairA0E2, pairA0E3, BV5.A0E(enumC5706Dno4, c5817Dq1.goodValue)));
        C5817Dq1 c5817Dq12 = heroPlayerSetting.qualityMapperBoundMsConfig;
        this.A0D = Collections.unmodifiableList(Arrays.asList(BV5.A0E(enumC5706Dno, c5817Dq12.degradedValue), BV5.A0E(enumC5706Dno2, c5817Dq12.poorValue), BV5.A0E(enumC5706Dno3, c5817Dq12.moderateValue), BV5.A0E(enumC5706Dno4, c5817Dq12.goodValue)));
        while (true) {
            if (this.A0C[i] != null) {
                this.A02 = true;
                break;
            } else {
                i++;
                if (i >= 22) {
                    break;
                }
            }
        }
        this.A06 = interfaceC6113Dvs;
        this.A05 = heroPlayerSetting.minDelayToRefreshTigonBitrateMs;
    }
}
