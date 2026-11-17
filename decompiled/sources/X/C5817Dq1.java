package X;

import java.io.Serializable;

/* renamed from: X.Dq1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5817Dq1 implements Serializable {
    public static final long serialVersionUID = 1663511998052L;
    public final int degradedValue;
    public final int goodValue;
    public final int moderateValue;
    public final int poorValue;
    public final boolean useNetworkQuality = false;
    public final boolean useNetworkType = false;
    public final boolean useNetworkQualityWifiOnly = false;
    public final boolean useMLPrediction = false;
    public final boolean useSmartPlayerDecision = false;
    public final int excellentValue = 0;
    public final int wifiValue = 0;
    public final int cell4GValue = 0;
    public final int cell3GValue = 0;
    public final int cell2GValue = 0;
    public final int defaultValue = 0;

    public C5817Dq1(int i, int i2, int i3, int i4) {
        this.goodValue = i2;
        this.moderateValue = i3;
        this.poorValue = i4;
        this.degradedValue = i;
    }
}
