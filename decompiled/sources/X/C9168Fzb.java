package X;

import java.util.Map;

/* renamed from: X.Fzb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9168Fzb extends GF2<C9168Fzb, C9167Fza> implements InterfaceC9132Fyx {
    public static final int AVG_FIELD_NUMBER = 18;
    public static final int CLIENT_ID_FIELD_NUMBER = 11;
    public static final int CLIENT_VERSION_FIELD_NUMBER = 12;
    public static final int DATA_ORIGIN_FIELD_NUMBER = 5;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    public static final C9168Fzb DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 13;
    public static final int END_TIME_MILLIS_FIELD_NUMBER = 10;
    public static final int END_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 20;
    public static final int INSTANT_TIME_MILLIS_FIELD_NUMBER = 8;
    public static final int MAX_FIELD_NUMBER = 17;
    public static final int MIN_FIELD_NUMBER = 16;
    public static final int ORIGIN_SAMPLE_UID_FIELD_NUMBER = 14;
    public static final int ORIGIN_SERIES_UID_FIELD_NUMBER = 4;
    public static volatile G0P<C9168Fzb> PARSER = null;
    public static final int RECORDING_METHOD_FIELD_NUMBER = 23;
    public static final int SERIES_VALUES_FIELD_NUMBER = 15;
    public static final int START_TIME_MILLIS_FIELD_NUMBER = 9;
    public static final int START_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 19;
    public static final int SUB_TYPE_DATA_LISTS_FIELD_NUMBER = 22;
    public static final int UID_FIELD_NUMBER = 3;
    public static final int UPDATE_TIME_MILLIS_FIELD_NUMBER = 7;
    public static final int VALUES_FIELD_NUMBER = 2;
    public static final int ZONE_OFFSET_SECONDS_FIELD_NUMBER = 6;
    public C9188Fzv avg_;
    public int bitField0_;
    public String clientId_;
    public long clientVersion_;
    public C9183Fzq dataOrigin_;
    public C9184Fzr dataType_;
    public C9181Fzo device_;
    public long endTimeMillis_;
    public int endZoneOffsetSeconds_;
    public long instantTimeMillis_;
    public C9188Fzv max_;
    public C9188Fzv min_;
    public String originSampleUid_;
    public String originSeriesUid_;
    public int recordingMethod_;
    public GDN<C9172Fzf> seriesValues_;
    public long startTimeMillis_;
    public int startZoneOffsetSeconds_;
    public HxZ<String, C9179Fzm> subTypeDataLists_;
    public String uid_;
    public long updateTimeMillis_;
    public HxZ<String, C9187Fzu> values_;
    public int zoneOffsetSeconds_;

    static {
        C9168Fzb c9168Fzb = new C9168Fzb();
        DEFAULT_INSTANCE = c9168Fzb;
        GF2.A02(c9168Fzb, C9168Fzb.class);
    }

    public C9168Fzb() {
        HxZ hxZ = HxZ.A00;
        this.values_ = hxZ;
        this.subTypeDataLists_ = hxZ;
        this.uid_ = "";
        this.originSeriesUid_ = "";
        this.clientId_ = "";
        this.originSampleUid_ = "";
        this.seriesValues_ = GDI.A02;
    }

    @Override // X.InterfaceC9132Fyx
    public final Map<String, C9187Fzu> AMW() {
        return GF5.A03(this);
    }
}
