package X;

import java.io.Serializable;

/* renamed from: X.Dnc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5695Dnc implements Serializable {
    public static final long serialVersionUID = 8153954923060974396L;
    public final int wifiMinLowWaterMarkMs = 0;
    public final int wifiMaxLowWaterMarkMs = 0;
    public final float wifiLowWaterMarkMultiplier = 0.0f;
    public final int wifiHighWaterMarkDeltaMs = 0;
    public final int cellMinLowWaterMarkMs = 0;
    public final int cellMaxLowWaterMarkMs = 0;
    public final float cellLowWaterMarkMultiplier = 0.0f;
    public final int cellHighWaterMarkDeltaMs = 0;
    public final float waterMarkLowMultiplier = 0.0f;
    public final float waterMarkHighMultiplier = 0.0f;
    public final boolean enableTuningOnCellExcellent = false;
    public final int cellExcellentMinLowWaterMarkMs = 4000;
    public final int cellExcellentMaxLowWaterMarkMs = 7000;
    public final float cellExcellentLowWaterMarkMultiplier = 1.5f;
    public final int cellExcellentMinHighWaterMarkMs = 5000;
    public final int cellExcellentMaxHighWaterMarkMs = 8000;
    public final float cellExcellentHighWaterMarkMultiplier = 1.5f;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("WifiMinLowWaterMarkMs=");
        sbA0x.append(this.wifiMinLowWaterMarkMs);
        sbA0x.append(",WifiMaxLowWaterMarkMs=");
        sbA0x.append(this.wifiMaxLowWaterMarkMs);
        sbA0x.append(",WifiLowWaterMarkMultiplier=");
        sbA0x.append(this.wifiLowWaterMarkMultiplier);
        sbA0x.append(",WifiHighWaterMarkDeltaMs=");
        sbA0x.append(this.wifiHighWaterMarkDeltaMs);
        sbA0x.append(",CellMinLowWaterMarkMs=");
        sbA0x.append(this.cellMinLowWaterMarkMs);
        sbA0x.append(",CellMaxLowWaterMarkMs=");
        sbA0x.append(this.cellMaxLowWaterMarkMs);
        sbA0x.append(",CellLowWaterMarkMultiplier=");
        sbA0x.append(this.cellLowWaterMarkMultiplier);
        sbA0x.append(",CellHighWaterMarkDeltaMs=");
        sbA0x.append(this.cellHighWaterMarkDeltaMs);
        sbA0x.append(",WaterMarkLowMultipler=");
        sbA0x.append(this.waterMarkLowMultiplier);
        sbA0x.append(",WaterMarkHighMultipler=");
        sbA0x.append(this.waterMarkHighMultiplier);
        return sbA0x.toString();
    }
}
